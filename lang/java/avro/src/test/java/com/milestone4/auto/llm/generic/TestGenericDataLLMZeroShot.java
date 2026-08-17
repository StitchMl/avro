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
import org.apache.avro.UnresolvedUnionException;
import org.apache.avro.Schema.Type;
import org.apache.avro.generic.GenericData;
import org.apache.avro.util.Utf8;
import org.junit.Test;
public class TestGenericDataLLMZeroShot {
  private final GenericData data = GenericData.get();
  @Test
  public void testSingletonInstance() {
    assertSame(GenericData.get(), GenericData.get());
  }
  @Test(expected = AvroRuntimeException.class)
  public void testRecordRejectsNonRecordSchema() {
    new GenericData.Record(Schema.create(Type.INT));
  }
  @Test
  public void testRecordPutGetAndMissingField() {
    Schema schema = Schema.parse("{\"type\":\"record\",\"name\":\"R\",\"fields\":[{\"name\":\"id\",\"type\":\"int\"}]}");
    GenericData.Record record = new GenericData.Record(schema);
    record.put("id", 7);
    assertEquals(7, record.get("id"));
    assertEquals(7, record.get(0));
    assertNull(record.get("missing"));
  }
  @Test
  public void testArrayOperationsAndResize() {
    Schema arraySchema = Schema.createArray(Schema.create(Type.INT));
    GenericData.Array<Integer> array = new GenericData.Array<Integer>(1, arraySchema);
    array.add(1);
    array.add(2);
    assertEquals(2, array.size());
    assertEquals(Integer.valueOf(1), array.get(0));
    assertEquals(Integer.valueOf(2), array.get(1));
    assertEquals(Integer.valueOf(1), array.set(0, 3));
    assertEquals(Integer.valueOf(3), array.get(0));
    assertEquals(Integer.valueOf(3), array.remove(0));
    assertEquals(1, array.size());
    assertEquals(Integer.valueOf(2), array.get(0));
  }
  @Test(expected = IndexOutOfBoundsException.class)
  public void testArrayGetOutOfBounds() {
    Schema arraySchema = Schema.createArray(Schema.create(Type.INT));
    GenericData.Array<Integer> array = new GenericData.Array<Integer>(0, arraySchema);
    array.get(0);
  }
  @Test
  public void testValidatePrimitiveComplexAndUnion() {
    assertTrue(data.validate(Schema.create(Type.INT), 1));
    assertFalse(data.validate(Schema.create(Type.INT), 1L));
    Schema arraySchema = Schema.createArray(Schema.create(Type.INT));
    assertTrue(data.validate(arraySchema, Arrays.asList(1, 2, 3)));
    assertFalse(data.validate(arraySchema, Arrays.<Object>asList(1, "x")));
    Schema mapSchema = Schema.createMap(Schema.create(Type.INT));
    Map<String, Object> ok = new HashMap<String, Object>();
    ok.put("a", 1);
    assertTrue(data.validate(mapSchema, ok));
    ok.put("b", "x");
    assertFalse(data.validate(mapSchema, ok));
    Schema union = Schema.parse("[\"null\",\"string\"]");
    assertTrue(data.validate(union, null));
    assertTrue(data.validate(union, "v"));
    assertFalse(data.validate(union, 5));
  }
  @Test
  public void testValidateFixedLength() {
    Schema fixedSchema = Schema.parse("{\"type\":\"fixed\",\"name\":\"F\",\"size\":2}");
    GenericData.Fixed good = new GenericData.Fixed(fixedSchema, new byte[] {1, 2});
    GenericData.Fixed bad = new GenericData.Fixed(fixedSchema, new byte[] {1});
    assertTrue(data.validate(fixedSchema, good));
    assertFalse(data.validate(fixedSchema, bad));
  }
  @Test
  public void testInducePrimitiveAndCollection() {
    assertEquals(Type.STRING, data.induce("abc").getType());
    assertEquals(Type.INT, data.induce(10).getType());
    assertEquals(Type.ARRAY, data.induce(Arrays.asList(1, 2)).getType());
    assertEquals(Type.MAP, data.induce(Collections.singletonMap("k", 1)).getType());
  }
  @Test(expected = AvroTypeException.class)
  public void testInduceRejectsEmptyArray() {
    data.induce(Collections.emptyList());
  }
  @Test(expected = AvroTypeException.class)
  public void testInduceRejectsMixedArray() {
    data.induce(Arrays.<Object>asList(1, "x"));
  }
  @Test(expected = AvroTypeException.class)
  public void testInduceRejectsUnsupportedType() {
    data.induce(new Object());
  }
  @Test
  public void testResolveUnionAndCompare() {
    Schema union = Schema.parse("[\"int\",\"string\"]");
    assertEquals(0, data.resolveUnion(union, 1));
    assertEquals(1, data.resolveUnion(union, "x"));
    Schema intArray = Schema.createArray(Schema.create(Type.INT));
    assertTrue(data.compare(Arrays.asList(1, 2), Arrays.asList(1, 3), intArray) < 0);
    assertEquals(0, data.compare(Arrays.asList(1, 2), Arrays.asList(1, 2), intArray));
  }
  @Test(expected = UnresolvedUnionException.class)
  public void testResolveUnionThrowsWhenNoBranchMatches() {
    Schema union = Schema.parse("[\"int\",\"string\"]");
    data.resolveUnion(union, true);
  }
  @Test(expected = AvroRuntimeException.class)
  public void testCompareMapThrows() {
    Schema mapSchema = Schema.createMap(Schema.create(Type.INT));
    Map<String, Integer> a = Collections.singletonMap("k", 1);
    Map<String, Integer> b = Collections.singletonMap("k", 1);
    data.compare(a, b, mapSchema);
  }
  @Test
  public void testHashCodeForStringAndUtf8IsConsistent() {
    Schema stringSchema = Schema.create(Type.STRING);
    assertEquals(data.hashCode("abc", stringSchema), data.hashCode(new Utf8("abc"), stringSchema));
  }
  @Test
  public void testToStringForRecordAndByteBuffer() {
    Schema schema = Schema.parse("{\"type\":\"record\",\"name\":\"R2\",\"fields\":[{\"name\":\"id\",\"type\":\"int\"}]}");
    GenericData.Record record = new GenericData.Record(schema);
    record.put("id", 9);
    assertEquals("{\"id\": 9}", data.toString(record));
    ByteBuffer buffer = ByteBuffer.wrap(new byte[] {65, 66, 67});
    buffer.position(1);
    buffer.limit(3);
    assertEquals("{\"bytes\": \"BC\"}", data.toString(buffer));
  }
}
