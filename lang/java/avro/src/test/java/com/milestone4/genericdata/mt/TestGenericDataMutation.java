/**
 * Milestone 4 (ISW2) — Suite MUTATION-GUIDED (mt) per GenericData.
 * Punta a uccidere i survivor PIT: instanceOf/isX (union a branch non-primo),
 * validate (casi negativi), writeEscapedString (output esatto), equals (matrice),
 * hashCode (discriminazione), compare descending + Comparable.compareTo.
 * JUnit 4.8.2 -> @Test(expected=...).
 */
package com.milestone4.genericdata.mt;

import static org.junit.Assert.*;

import java.nio.ByteBuffer;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

import org.apache.avro.Schema;
import org.apache.avro.Schema.Type;
import org.apache.avro.generic.GenericData;
import org.apache.avro.util.Utf8;
import org.junit.Test;

public class TestGenericDataMutation {

  private final GenericData gd = GenericData.get();

  private static Schema recSchema() {
    return Schema.parse("{\"type\":\"record\",\"name\":\"R\",\"fields\":[{\"name\":\"a\",\"type\":\"int\"}]}");
  }
  private static Schema recSchemaOther() {
    return Schema.parse("{\"type\":\"record\",\"name\":\"R2\",\"fields\":[{\"name\":\"a\",\"type\":\"int\"}]}");
  }
  private static Schema recTwo() {
    return Schema.parse("{\"type\":\"record\",\"name\":\"RT\",\"fields\":["
        + "{\"name\":\"a\",\"type\":\"int\"},{\"name\":\"b\",\"type\":\"int\"}]}");
  }
  private static Schema recDesc() {
    return Schema.parse("{\"type\":\"record\",\"name\":\"RD\",\"fields\":["
        + "{\"name\":\"a\",\"type\":\"int\",\"order\":\"descending\"}]}");
  }
  private static Schema enumSchema() {
    return Schema.parse("{\"type\":\"enum\",\"name\":\"E\",\"symbols\":[\"A\",\"B\"]}");
  }
  private static Schema fixedSchema() {
    return Schema.parse("{\"type\":\"fixed\",\"name\":\"F\",\"size\":3}");
  }
  private static Schema arr() { return Schema.createArray(Schema.create(Type.INT)); }
  private static Schema map() { return Schema.createMap(Schema.create(Type.INT)); }
  private static Schema INT() { return Schema.create(Type.INT); }
  private static Schema u(Schema a, Schema b) { return Schema.createUnion(Arrays.asList(a, b)); }

  private static GenericData.Record rec(Schema s, int a) {
    GenericData.Record r = new GenericData.Record(s); r.put("a", a); return r;
  }
  private static GenericData.Record recTwo(int a, int b) {
    GenericData.Record r = new GenericData.Record(recTwo()); r.put("a", a); r.put("b", b); return r;
  }
  private static GenericData.Array<Integer> array(Schema s, int... xs) {
    GenericData.Array<Integer> a = new GenericData.Array<Integer>(xs.length, s);
    for (int x : xs) a.add(x);
    return a;
  }

  // ---------- writeEscapedString: output esatto per ogni escape ----------
  @Test public void escapeQuote()     { assertEquals("\"\\\"\"", gd.toString(new Utf8("\""))); }
  @Test public void escapeBackslash() { assertEquals("\"\\\\\"", gd.toString(new Utf8("\\"))); }
  @Test public void escapeSlash()     { assertEquals("\"\\/\"",  gd.toString(new Utf8("/"))); }
  @Test public void escapeNewline()   { assertEquals("\"\\n\"",  gd.toString(new Utf8("\n"))); }
  @Test public void escapeReturn()    { assertEquals("\"\\r\"",  gd.toString(new Utf8("\r"))); }
  @Test public void escapeTab()       { assertEquals("\"\\t\"",  gd.toString(new Utf8("\t"))); }
  @Test public void escapeBackspace() { assertEquals("\"\\b\"",  gd.toString(new Utf8("\b"))); }
  @Test public void escapeFormfeed()  { assertEquals("\"\\f\"",  gd.toString(new Utf8("\f"))); }

  // ---------- validate: casi negativi per tipo ----------
  @Test public void validateFixedWrongSize() {
    assertFalse(gd.validate(fixedSchema(), new GenericData.Fixed(fixedSchema(), new byte[2])));
  }
  @Test public void validateBytesNeg()   { assertFalse(gd.validate(Schema.create(Type.BYTES), "x")); }
  @Test public void validateLongNeg()    { assertFalse(gd.validate(Schema.create(Type.LONG), 1)); }
  @Test public void validateFloatNeg()   { assertFalse(gd.validate(Schema.create(Type.FLOAT), 1.0d)); }
  @Test public void validateDoubleNeg()  { assertFalse(gd.validate(Schema.create(Type.DOUBLE), 1.0f)); }
  @Test public void validateBooleanNeg() { assertFalse(gd.validate(Schema.create(Type.BOOLEAN), 1)); }
  @Test public void validateRecordNeg()  { assertFalse(gd.validate(recSchema(), "x")); }
  @Test public void validateMapNeg()     { assertFalse(gd.validate(map(), "x")); }
  @Test public void validateArrayNeg()   { assertFalse(gd.validate(arr(), "x")); }

  // ---------- resolveUnion "branch non-primo": forza instanceOf/isX su true e false ----------
  private void bothDirections(Schema t, Object datum) {
    // t come secondo ramo dopo INT, datum di tipo t -> indice 1 (INT deve dare false)
    assertEquals(1, gd.resolveUnion(u(INT(), t), datum));
    // t come primo ramo, datum int -> indice 1 (isT/instanceOf t deve dare false)
    assertEquals(1, gd.resolveUnion(u(t, INT()), 5));
  }
  @Test public void unionString()  { bothDirections(Schema.create(Type.STRING), new Utf8("x")); }
  @Test public void unionBoolean() { bothDirections(Schema.create(Type.BOOLEAN), Boolean.TRUE); }
  @Test public void unionLong()    { bothDirections(Schema.create(Type.LONG), 1L); }
  @Test public void unionFloat()   { bothDirections(Schema.create(Type.FLOAT), 1.0f); }
  @Test public void unionDouble()  { bothDirections(Schema.create(Type.DOUBLE), 1.0d); }
  @Test public void unionBytes()   { bothDirections(Schema.create(Type.BYTES), ByteBuffer.wrap(new byte[]{1})); }
  @Test public void unionArray()   { bothDirections(arr(), Arrays.asList(1)); }
  @Test public void unionMap()     { Map<String,Integer> m=new HashMap<String,Integer>(); m.put("a",1); bothDirections(map(), m); }
  @Test public void unionRecord()  { bothDirections(recSchema(), rec(recSchema(),1)); }
  @Test public void unionEnum()    { bothDirections(enumSchema(), new GenericData.EnumSymbol(enumSchema(), "A")); }
  @Test public void unionFixed()   { bothDirections(fixedSchema(), new GenericData.Fixed(fixedSchema(), new byte[3])); }

  // ---------- equals: matrice su classi annidate ----------
  @Test public void recordEqualsTrue()      { assertEquals(rec(recSchema(),1), rec(recSchema(),1)); }
  @Test public void recordEqualsFalseVal()  { assertFalse(rec(recSchema(),1).equals(rec(recSchema(),2))); }
  @Test public void recordEqualsFalseType() { assertFalse(rec(recSchema(),1).equals("x")); }
  @Test public void recordEqualsFalseSchema(){ assertFalse(rec(recSchema(),1).equals(rec(recSchemaOther(),1))); }
  @Test public void arrayEqualsTrue()       { assertEquals(array(arr(),1,2), array(arr(),1,2)); }
  @Test public void arrayEqualsFalse()      { assertFalse(array(arr(),1,2).equals(array(arr(),1,3))); }
  @Test public void arrayEqualsFalseType()  { assertFalse(array(arr(),1,2).equals("x")); }
  @Test public void fixedEqualsTrue()       { assertEquals(new GenericData.Fixed(fixedSchema(), new byte[]{1,2,3}), new GenericData.Fixed(fixedSchema(), new byte[]{1,2,3})); }
  @Test public void fixedEqualsFalse()      { assertFalse(new GenericData.Fixed(fixedSchema(), new byte[]{1,2,3}).equals(new GenericData.Fixed(fixedSchema(), new byte[]{1,2,4}))); }
  @Test public void fixedEqualsFalseType()  { assertFalse(new GenericData.Fixed(fixedSchema(), new byte[]{1,2,3}).equals("x")); }
  @Test public void enumEqualsFalse()       { assertFalse(new GenericData.EnumSymbol(enumSchema(),"A").equals(new GenericData.EnumSymbol(enumSchema(),"B"))); }

  // ---------- hashCode: discriminazione (uccide MATH/return in hashCodeAdd) ----------
  @Test public void hashCodeRecordDiscriminates() {
    assertFalse(gd.hashCode(recTwo(1,2), recTwo()) == gd.hashCode(recTwo(2,1), recTwo()));
  }
  @Test public void hashCodeRecordEqualConsistent() {
    assertEquals(gd.hashCode(recTwo(1,2), recTwo()), gd.hashCode(recTwo(1,2), recTwo()));
  }
  @Test public void hashCodeArrayDiscriminates() {
    assertFalse(gd.hashCode(Arrays.asList(1,2), arr()) == gd.hashCode(Arrays.asList(2,1), arr()));
  }

  // ---------- compare: descending + Comparable.compareTo ----------
  @Test public void compareDescendingReversed() {
    assertTrue(gd.compare(rec(recDesc(),1), rec(recDesc(),2), recDesc()) > 0);
  }
  @Test public void recordCompareTo() { assertTrue(rec(recSchema(),1).compareTo(rec(recSchema(),2)) < 0); }
  @Test public void arrayCompareTo()  { assertTrue(array(arr(),1,2).compareTo(array(arr(),1,3)) < 0); }
  @Test public void fixedCompareTo()  {
    assertTrue(new GenericData.Fixed(fixedSchema(), new byte[]{1,2,3})
        .compareTo(new GenericData.Fixed(fixedSchema(), new byte[]{1,2,4})) < 0);
  }

  // ---------- Array: rafforza boundary (set/remove) ----------
  @Test(expected = IndexOutOfBoundsException.class)
  public void arraySetOob()    { array(arr(),1).set(5, 9); }
  @Test(expected = IndexOutOfBoundsException.class)
  public void arrayRemoveOob() { array(arr(),1).remove(5); }
}
