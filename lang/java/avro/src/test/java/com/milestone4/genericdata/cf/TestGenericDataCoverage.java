/**
 * Milestone 4 (ISW2) — Suite COVERAGE-GUIDED (cf) per GenericData.
 * Raffina la BB per raggiungere i metodi/rami non coperti (JaCoCo C0):
 * toString/induce/instanceOf(resolveUnion)/compare/hashCode sui tipi complessi,
 * validate su FIXED/BYTES/LONG/FLOAT/DOUBLE, iterator/reverse/peek, set/getField.
 * JUnit 4.8.2 -> @Test(expected=...).
 */
package com.milestone4.genericdata.cf;

import static org.junit.Assert.*;

import java.nio.ByteBuffer;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import org.apache.avro.Schema;
import org.apache.avro.Schema.Type;
import org.apache.avro.generic.GenericData;
import org.apache.avro.util.Utf8;
import org.junit.Test;

public class TestGenericDataCoverage {

  private final GenericData gd = GenericData.get();

  private static Schema recSchema() {
    return Schema.parse("{\"type\":\"record\",\"name\":\"R\",\"fields\":["
        + "{\"name\":\"a\",\"type\":\"int\"}]}");
  }
  private static Schema enumSchema() {
    return Schema.parse("{\"type\":\"enum\",\"name\":\"E\",\"symbols\":[\"A\",\"B\"]}");
  }
  private static Schema fixedSchema() {
    return Schema.parse("{\"type\":\"fixed\",\"name\":\"F\",\"size\":3}");
  }
  private static Schema arr() { return Schema.createArray(Schema.create(Type.INT)); }
  private static Schema map() { return Schema.createMap(Schema.create(Type.INT)); }

  private static GenericData.Record rec(int a) {
    GenericData.Record r = new GenericData.Record(recSchema());
    r.put("a", a);
    return r;
  }

  // ---------- toString: rami strutturati ----------
  @Test public void toStringRecord()     { assertEquals("{\"a\": 1}", gd.toString(rec(1))); }
  @Test public void toStringCollection() { assertEquals("[1, 2]", gd.toString(Arrays.asList(1, 2))); }
  @Test public void toStringMap() {
    Map<String,Integer> m = new HashMap<String,Integer>(); m.put("a", 1);
    assertEquals("{\"a\": 1}", gd.toString(m));
  }
  @Test public void toStringByteBuffer() {
    assertEquals("{\"bytes\": \"a\"}", gd.toString(ByteBuffer.wrap(new byte[]{97})));
  }
  @Test public void toStringEnumSymbol() {
    assertEquals("\"A\"", gd.toString(new GenericData.EnumSymbol(enumSchema(), "A")));
  }

  // ---------- induce: rami strutturati e numerici ----------
  @Test public void induceRecord()  { assertEquals(Type.RECORD, gd.induce(rec(1)).getType()); }
  @Test public void induceArray()   {
    Schema s = gd.induce(Arrays.asList(1, 2));
    assertEquals(Type.ARRAY, s.getType());
    assertEquals(Type.INT, s.getElementType().getType());
  }
  @Test public void induceMap() {
    Map<String,Integer> m = new HashMap<String,Integer>(); m.put("a", 1);
    assertEquals(Type.MAP, gd.induce(m).getType());
  }
  @Test public void induceFixed() {
    GenericData.Fixed f = new GenericData.Fixed(fixedSchema(), new byte[]{1,2,3});
    assertEquals(Type.FIXED, gd.induce(f).getType());
  }
  @Test public void induceBytes()  { assertEquals(Type.BYTES,  gd.induce(ByteBuffer.wrap(new byte[]{1})).getType()); }
  @Test public void induceDouble() { assertEquals(Type.DOUBLE, gd.induce(1.0d).getType()); }
  @Test public void induceFloat()  { assertEquals(Type.FLOAT,  gd.induce(1.0f).getType()); }

  // ---------- validate: tipi primitivi residui ----------
  @Test public void validateFixedOk() {
    GenericData.Fixed f = new GenericData.Fixed(fixedSchema(), new byte[3]);
    assertTrue(gd.validate(fixedSchema(), f));
  }
  @Test public void validateBytesOk()  { assertTrue(gd.validate(Schema.create(Type.BYTES), ByteBuffer.wrap(new byte[]{1}))); }
  @Test public void validateLongOk()   { assertTrue(gd.validate(Schema.create(Type.LONG), 1L)); }
  @Test public void validateFloatOk()  { assertTrue(gd.validate(Schema.create(Type.FLOAT), 1.0f)); }
  @Test public void validateDoubleOk() { assertTrue(gd.validate(Schema.create(Type.DOUBLE), 1.0d)); }

  // ---------- resolveUnion: percorre instanceOf su tutti i tipi ----------
  private Schema unionWithNull(Schema s) {
    return Schema.createUnion(Arrays.asList(s, Schema.create(Type.NULL)));
  }
  @Test public void resolveArray()   { assertEquals(0, gd.resolveUnion(unionWithNull(arr()), Arrays.asList(1))); }
  @Test public void resolveMap()     {
    Map<String,Integer> m = new HashMap<String,Integer>(); m.put("a", 1);
    assertEquals(0, gd.resolveUnion(unionWithNull(map()), m));
  }
  @Test public void resolveString()  { assertEquals(0, gd.resolveUnion(unionWithNull(Schema.create(Type.STRING)), new Utf8("x"))); }
  @Test public void resolveBytes()   { assertEquals(0, gd.resolveUnion(unionWithNull(Schema.create(Type.BYTES)), ByteBuffer.wrap(new byte[]{1}))); }
  @Test public void resolveLong()    { assertEquals(0, gd.resolveUnion(unionWithNull(Schema.create(Type.LONG)), 1L)); }
  @Test public void resolveFloat()   { assertEquals(0, gd.resolveUnion(unionWithNull(Schema.create(Type.FLOAT)), 1.0f)); }
  @Test public void resolveDouble()  { assertEquals(0, gd.resolveUnion(unionWithNull(Schema.create(Type.DOUBLE)), 1.0d)); }
  @Test public void resolveBoolean() { assertEquals(0, gd.resolveUnion(unionWithNull(Schema.create(Type.BOOLEAN)), Boolean.TRUE)); }
  @Test public void resolveRecord()  { assertEquals(0, gd.resolveUnion(unionWithNull(recSchema()), rec(1))); }
  @Test public void resolveEnum()    { assertEquals(0, gd.resolveUnion(unionWithNull(enumSchema()), new GenericData.EnumSymbol(enumSchema(), "A"))); }
  @Test public void resolveFixed()   { assertEquals(0, gd.resolveUnion(unionWithNull(fixedSchema()), new GenericData.Fixed(fixedSchema(), new byte[3]))); }

  // ---------- compare: rami complessi ----------
  @Test public void compareRecords() { assertTrue(gd.compare(rec(1), rec(2), recSchema()) < 0); }
  @Test public void compareArrays()  { assertTrue(gd.compare(Arrays.asList(1,2), Arrays.asList(1,3), arr()) < 0); }
  @Test public void compareEnums()   { assertTrue(gd.compare("A", "B", enumSchema()) < 0); }
  @Test public void compareUnion()   { assertTrue(gd.compare(1, 2, unionWithNull(Schema.create(Type.INT))) < 0); }

  // ---------- hashCode: rami complessi ----------
  @Test public void hashCodeRecordConsistent() { assertEquals(gd.hashCode(rec(1), recSchema()), gd.hashCode(rec(1), recSchema())); }
  @Test public void hashCodeArrayConsistent()  { assertEquals(gd.hashCode(Arrays.asList(1,2), arr()), gd.hashCode(Arrays.asList(1,2), arr())); }
  @Test public void hashCodeUnionDelegates()   {
    assertEquals(gd.hashCode(5, Schema.create(Type.INT)), gd.hashCode(5, unionWithNull(Schema.create(Type.INT))));
  }
  @Test public void hashCodeEnumOrdinal()      { assertEquals(0, gd.hashCode("A", enumSchema())); }

  // ---------- Array: iterator / reverse / peek ----------
  @Test public void arrayIterator() {
    GenericData.Array<Integer> a = new GenericData.Array<Integer>(3, arr());
    a.add(1); a.add(2); a.add(3);
    int sum = 0;
    for (Iterator<Integer> it = a.iterator(); it.hasNext(); ) sum += it.next();
    assertEquals(6, sum);
  }
  @Test public void arrayReverseFull() {
    GenericData.Array<Integer> a = new GenericData.Array<Integer>(3, arr());
    a.add(1); a.add(2); a.add(3);   // elements.length == size -> reverse pulito
    a.reverse();
    assertEquals(Integer.valueOf(3), a.get(0));
    assertEquals(Integer.valueOf(1), a.get(2));
  }
  @Test public void arrayPeekNullWhenFull() {
    GenericData.Array<Integer> a = new GenericData.Array<Integer>(1, arr());
    a.add(1); // size == length
    assertNull(a.peek());
  }

  // ---------- setField / getField ----------
  @Test public void setAndGetField() {
    GenericData.Record r = new GenericData.Record(recSchema());
    gd.setField(r, "a", 0, 42);
    assertEquals(42, gd.getField(r, "a", 0));
  }
}
