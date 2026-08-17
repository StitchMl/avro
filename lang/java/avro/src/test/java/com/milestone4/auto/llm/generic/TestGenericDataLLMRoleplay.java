package com.milestone4.auto.llm.generic;
import static org.junit.Assert.*;
import java.nio.ByteBuffer;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;
import org.apache.avro.AvroRuntimeException;
import org.apache.avro.AvroTypeException;
import org.apache.avro.Schema;
import org.apache.avro.Schema.Type;
import org.apache.avro.UnresolvedUnionException;
import org.apache.avro.generic.GenericData;
import org.apache.avro.util.Utf8;
import org.junit.Test;
public class TestGenericDataLLMRoleplay {
  private final GenericData gd = GenericData.get();
  @Test
  public void singletonIsStable() {
    assertSame(GenericData.get(), gd);
  }
  @Test(expected = NullPointerException.class)
  public void recordPutByUnknownFieldNameThrows() {
    Schema schema = Schema.parse("{\"type\":\"record\",\"name\":\"R\",\"fields\":[{\"name\":\"a\",\"type\":\"int\"}]}");
    GenericData.Record record = new GenericData.Record(schema);
    record.put("missing", 1);
  }
  @Test
  public void recordToStringUsesJsonFieldOrder() {
    Schema schema = Schema.parse("{\"type\":\"record\",\"name\":\"R\",\"fields\":[{\"name\":\"a\",\"type\":\"int\"},{\"name\":\"b\",\"type\":\"string\"}]}");
    GenericData.Record record = new GenericData.Record(schema);
    record.put(0, 7);
    record.put(1, new Utf8("x"));
    assertEquals("{\"a\": 7, \"b\": \"x\"}", record.toString());
  }
  @Test
  public void arrayClearAndPeekBoundary() {
    Schema arraySchema = Schema.createArray(Schema.create(Type.INT));
    GenericData.Array<Integer> array = new GenericData.Array<Integer>(0, arraySchema);
    array.add(10);
    array.add(20);
    array.clear();
    assertEquals(0, array.size());
    assertNull(array.peek());
  }
  @Test(expected = UnsupportedOperationException.class)
  public void arrayIteratorRemoveUnsupported() {
    Schema arraySchema = Schema.createArray(Schema.create(Type.INT));
    GenericData.Array<Integer> array = new GenericData.Array<Integer>(0, arraySchema);
    array.add(1);
    array.iterator().remove();
  }
  @Test
  public void arrayReverseWithExactCapacityReversesLogicalOrder() {
    Schema arraySchema = Schema.createArray(Schema.create(Type.INT));
    GenericData.Array<Integer> array = new GenericData.Array<Integer>(0, arraySchema);
    array.add(1);
    array.add(2);
    array.add(3);
    array.reverse();
    assertEquals(Arrays.asList(3, 2, 1), array);
  }
  @Test
  public void fixedBytesSetterAffectsEqualityAndHashCode() {
    Schema fixedSchema = Schema.parse("{\"type\":\"fixed\",\"name\":\"F\",\"size\":2}");
    GenericData.Fixed left = new GenericData.Fixed(fixedSchema);
    GenericData.Fixed right = new GenericData.Fixed(fixedSchema, new byte[] {0, 0});
    assertTrue(left.equals(right));
    assertEquals(left.hashCode(), right.hashCode());
    left.bytes(new byte[] {5, 6});
    assertFalse(left.equals(right));
    assertArrayEquals(new byte[] {5, 6}, left.bytes());
  }
  @Test
  public void enumSymbolEqualityDependsOnSymbolTextOnly() {
    Schema e1 = Schema.parse("{\"type\":\"enum\",\"name\":\"E1\",\"symbols\":[\"A\",\"B\"]}");
    Schema e2 = Schema.parse("{\"type\":\"enum\",\"name\":\"E2\",\"symbols\":[\"A\",\"B\"]}");
    GenericData.EnumSymbol s1 = new GenericData.EnumSymbol(e1, "A");
    GenericData.EnumSymbol s2 = new GenericData.EnumSymbol(e2, "A");
    GenericData.EnumSymbol s3 = new GenericData.EnumSymbol(e2, "B");
    assertTrue(s1.equals(s2));
    assertFalse(s1.equals(s3));
    assertEquals("A", s1.toString());
  }
  @Test
  public void validateFixedAndNonFixedDatum() {
    Schema fixedSchema = Schema.parse("{\"type\":\"fixed\",\"name\":\"Fv\",\"size\":3}");
    assertTrue(gd.validate(fixedSchema, new GenericData.Fixed(fixedSchema, new byte[] {1, 2, 3})));
    assertFalse(gd.validate(fixedSchema, new GenericData.Fixed(fixedSchema, new byte[] {1, 2})));
    assertFalse(gd.validate(fixedSchema, ByteBuffer.wrap(new byte[] {1, 2, 3})));
  }
  @Test
  public void toStringEscapesSpecialCharacters() {
    String rendered = gd.toString(new Utf8("a\"b\\c/d\n"));
    assertEquals("\"a\\\"b\\\\c\\/d\\n\"", rendered);
  }
  @Test
  public void toStringMapPreservesInsertionOrderForLinkedMap() {
    Map<String, Object> map = new LinkedHashMap<String, Object>();
    map.put("k1", 1);
    map.put("k2", "v");
    assertEquals("{\"k1\": 1, \"k2\": \"v\"}", gd.toString(map));
  }
  @Test
  public void induceRecordReturnsItsSchema() {
    Schema schema = Schema.parse("{\"type\":\"record\",\"name\":\"IR\",\"fields\":[{\"name\":\"x\",\"type\":\"long\"}]}");
    GenericData.Record record = new GenericData.Record(schema);
    record.put("x", 5L);
    assertEquals(schema, gd.induce(record));
  }
  @Test(expected = AvroTypeException.class)
  public void induceMixedMapValueTypesThrows() {
    Map<String, Object> map = new LinkedHashMap<String, Object>();
    map.put("a", 1);
    map.put("b", 2L);
    gd.induce(map);
  }
  @Test
  public void compareArrayPrefixIsLessThanLongerArray() {
    Schema arraySchema = Schema.createArray(Schema.create(Type.INT));
    assertEquals(-1, gd.compare(Arrays.asList(1, 2), Arrays.asList(1, 2, 3), arraySchema));
    assertEquals(1, gd.compare(Arrays.asList(1, 2, 3), Arrays.asList(1, 2), arraySchema));
  }
  @Test
  public void compareUnionDifferentBranchesUsesBranchIndex() {
    Schema union = Schema.createUnion(Arrays.asList(Schema.create(Type.INT), Schema.create(Type.STRING)));
    assertTrue(gd.compare(1, "x", union) < 0);
    assertTrue(gd.compare("x", 1, union) > 0);
  }
  @Test(expected = UnresolvedUnionException.class)
  public void resolveUnionFailsForNullWhenNullBranchMissing() {
    Schema union = Schema.createUnion(Arrays.asList(Schema.create(Type.INT), Schema.create(Type.STRING)));
    gd.resolveUnion(union, null);
  }
  @Test
  public void hashCodeUnionMatchesSelectedBranchHash() {
    Schema union = Schema.createUnion(Arrays.asList(Schema.create(Type.NULL), Schema.create(Type.STRING)));
    int expected = gd.hashCode("abc", Schema.create(Type.STRING));
    assertEquals(expected, gd.hashCode("abc", union));
  }
  @Test(expected = AvroRuntimeException.class)
  public void compareMapThrowsInOrderingMode() {
    Schema mapSchema = Schema.createMap(Schema.create(Type.INT));
    gd.compare(Collections.singletonMap("a", 1), Collections.singletonMap("a", 1), mapSchema);
  }
}
