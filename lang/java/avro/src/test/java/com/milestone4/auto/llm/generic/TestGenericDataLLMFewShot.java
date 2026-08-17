package com.milestone4.auto.llm.generic;
import static org.junit.Assert.*;
import java.nio.ByteBuffer;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import org.apache.avro.AvroRuntimeException;
import org.apache.avro.AvroTypeException;
import org.apache.avro.Schema;
import org.apache.avro.Schema.Type;
import org.apache.avro.UnresolvedUnionException;
import org.apache.avro.generic.GenericData;
import org.junit.Test;
public class TestGenericDataLLMFewShot {
  private final GenericData gd = GenericData.get();
  @Test
  public void recordEqualsHashCodeAndCompareToWithSameSchema() {
    Schema s = Schema.parse("{\"type\":\"record\",\"name\":\"R\",\"fields\":[{\"name\":\"a\",\"type\":\"int\"}]}");
    GenericData.Record r1 = new GenericData.Record(s);
    GenericData.Record r2 = new GenericData.Record(s);
    r1.put("a", 7);
    r2.put("a", 7);
    assertTrue(r1.equals(r2));
    assertEquals(r1.hashCode(), r2.hashCode());
    assertEquals(0, r1.compareTo(r2));
  }
  @Test
  public void recordNotEqualWhenSchemaFullNameDiffers() {
    Schema s1 = Schema.parse("{\"type\":\"record\",\"name\":\"R1\",\"fields\":[{\"name\":\"a\",\"type\":\"int\"}]}");
    Schema s2 = Schema.parse("{\"type\":\"record\",\"name\":\"R2\",\"fields\":[{\"name\":\"a\",\"type\":\"int\"}]}");
    GenericData.Record r1 = new GenericData.Record(s1);
    GenericData.Record r2 = new GenericData.Record(s2);
    r1.put("a", 1);
    r2.put("a", 1);
    assertFalse(r1.equals(r2));
  }
  @Test
  public void compareRecordRespectsDescendingOrder() {
    Schema s = Schema.parse("{\"type\":\"record\",\"name\":\"Ord\",\"fields\":[{\"name\":\"a\",\"type\":\"int\",\"order\":\"descending\"}]}");
    GenericData.Record r1 = new GenericData.Record(s);
    GenericData.Record r2 = new GenericData.Record(s);
    r1.put("a", 1);
    r2.put("a", 2);
    assertTrue(gd.compare(r1, r2, s) > 0);
  }
  @Test
  public void compareAndHashCodeIgnoreIgnoredField() {
    Schema s = Schema.parse("{\"type\":\"record\",\"name\":\"Ig\",\"fields\":[{\"name\":\"x\",\"type\":\"int\",\"order\":\"ignore\"},{\"name\":\"y\",\"type\":\"int\"}]}");
    GenericData.Record r1 = new GenericData.Record(s);
    GenericData.Record r2 = new GenericData.Record(s);
    r1.put("x", 1);
    r1.put("y", 10);
    r2.put("x", 99);
    r2.put("y", 10);
    assertEquals(0, gd.compare(r1, r2, s));
    assertEquals(gd.hashCode(r1, s), gd.hashCode(r2, s));
  }
  @Test
  public void setFieldAndGetFieldRoundTrip() {
    Schema s = Schema.parse("{\"type\":\"record\",\"name\":\"SetGet\",\"fields\":[{\"name\":\"f\",\"type\":\"string\"}]}");
    GenericData.Record r = new GenericData.Record(s);
    gd.setField(r, "f", 0, "v");
    assertEquals("v", gd.getField(r, "f", 0));
  }
  @Test
  public void validateRecordAndBytes() {
    Schema rec = Schema.parse("{\"type\":\"record\",\"name\":\"VR\",\"fields\":[{\"name\":\"i\",\"type\":\"int\"}]}");
    GenericData.Record ok = new GenericData.Record(rec);
    ok.put("i", 4);
    GenericData.Record bad = new GenericData.Record(rec);
    bad.put("i", "x");
    assertTrue(gd.validate(rec, ok));
    assertFalse(gd.validate(rec, bad));
    assertTrue(gd.validate(Schema.create(Type.BYTES), ByteBuffer.wrap(new byte[] {1, 2})));
    assertFalse(gd.validate(Schema.create(Type.BYTES), new byte[] {1, 2}));
  }
  @Test(expected = NullPointerException.class)
  public void validateEnumWithNullDatumThrows() {
    Schema e = Schema.parse("{\"type\":\"enum\",\"name\":\"E\",\"symbols\":[\"A\"]}");
    gd.validate(e, null);
  }
  @Test
  public void induceGenericFixedAndByteBuffer() {
    Schema fs = Schema.parse("{\"type\":\"fixed\",\"name\":\"F\",\"size\":3}");
    GenericData.Fixed fixed = new GenericData.Fixed(fs, new byte[] {1, 2, 3});
    Schema inducedFixed = gd.induce(fixed);
    assertEquals(Type.FIXED, inducedFixed.getType());
    assertEquals(3, inducedFixed.getFixedSize());
    assertEquals(Type.BYTES, gd.induce(ByteBuffer.wrap(new byte[] {9})).getType());
  }
  @Test(expected = AvroTypeException.class)
  public void induceEmptyMapThrows() {
    gd.induce(Collections.emptyMap());
  }
  @Test(expected = AvroTypeException.class)
  public void induceMixedMapValuesThrows() {
    Map<String, Object> m = new HashMap<String, Object>();
    m.put("a", 1);
    m.put("b", "x");
    gd.induce(m);
  }
  @Test
  public void resolveUnionWithRecordBranch() {
    Schema union = Schema.parse("[{\"type\":\"record\",\"name\":\"A\",\"fields\":[{\"name\":\"v\",\"type\":\"int\"}]},{\"type\":\"record\",\"name\":\"B\",\"fields\":[{\"name\":\"v\",\"type\":\"int\"}]}]");
    Schema bSchema = union.getTypes().get(1);
    GenericData.Record b = new GenericData.Record(bSchema);
    b.put("v", 3);
    assertEquals(1, gd.resolveUnion(union, b));
  }
  @Test(expected = UnresolvedUnionException.class)
  public void resolveUnionNullNotAllowedThrows() {
    Schema union = Schema.parse("[\"int\",\"string\"]");
    gd.resolveUnion(union, null);
  }
  @Test(expected = AvroRuntimeException.class)
  public void arrayConstructorRejectsNonArraySchema() {
    new GenericData.Array<Integer>(2, Schema.create(Type.INT));
  }
  @Test
  public void arrayPeekAndReverse() {
    Schema arraySchema = Schema.createArray(Schema.create(Type.INT));
    GenericData.Array<Integer> a = new GenericData.Array<Integer>(3, arraySchema);
    a.add(1);
    a.add(2);
    assertNull(a.peek());
    a.reverse();
    assertEquals(Arrays.asList(2, 1), a);
  }
  @Test
  public void fixedAndEnumSymbolValueSemantics() {
    Schema fixedSchema = Schema.parse("{\"type\":\"fixed\",\"name\":\"Fx\",\"size\":2}");
    GenericData.Fixed f1 = new GenericData.Fixed(fixedSchema, new byte[] {1, 2});
    GenericData.Fixed f2 = new GenericData.Fixed(fixedSchema, new byte[] {1, 3});
    assertTrue(f1.compareTo(f2) < 0);
    Schema e1 = Schema.parse("{\"type\":\"enum\",\"name\":\"E1\",\"symbols\":[\"A\",\"B\"]}");
    Schema e2 = Schema.parse("{\"type\":\"enum\",\"name\":\"E2\",\"symbols\":[\"A\",\"B\"]}");
    GenericData.EnumSymbol s1 = new GenericData.EnumSymbol(e1, "A");
    GenericData.EnumSymbol s2 = new GenericData.EnumSymbol(e2, "A");
    assertTrue(s1.equals(s2));
    assertEquals("\"A\"", gd.toString(s1));
  }
}
