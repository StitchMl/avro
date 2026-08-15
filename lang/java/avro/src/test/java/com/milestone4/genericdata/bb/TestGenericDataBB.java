/**
 * Milestone 4 (ISW2) — Black-box test suite for org.apache.avro.generic.GenericData.
 * Progettazione: Category Partition + Boundary Value Analysis sui metodi pubblici.
 * Oracolo di regressione per il refactoring LLM (varianti C1..C4).
 * JUnit 4.8.2 -> nessun assertThrows: si usa @Test(expected=...).
 */
package com.milestone4.genericdata.bb;

import static org.junit.Assert.*;

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
import org.apache.avro.util.Utf8;
import org.junit.Test;

public class TestGenericDataBB {

  private final GenericData gd = GenericData.get();

  private static Schema record(String json) { return Schema.parse(json); }

  // ---------- validate(Schema, Object) ----------
  // Categoria: tipo primitivo, datum conforme / non conforme / null.

  @Test public void validateIntMatch()      { assertTrue(gd.validate(Schema.create(Type.INT), 5)); }
  @Test public void validateIntMismatch()   { assertFalse(gd.validate(Schema.create(Type.INT), "x")); }
  @Test public void validateStringMatch()   { assertTrue(gd.validate(Schema.create(Type.STRING), new Utf8("s"))); }
  @Test public void validateBooleanMatch()  { assertTrue(gd.validate(Schema.create(Type.BOOLEAN), Boolean.TRUE)); }
  @Test public void validateNullMatch()     { assertTrue(gd.validate(Schema.create(Type.NULL), null)); }
  @Test public void validateNullMismatch()  { assertFalse(gd.validate(Schema.create(Type.NULL), 1)); }

  // Categoria: ARRAY -> collezione valida / elemento errato / non collezione.
  @Test public void validateArrayOk() {
    Schema s = Schema.createArray(Schema.create(Type.INT));
    assertTrue(gd.validate(s, Arrays.asList(1, 2, 3)));
  }
  @Test public void validateArrayWrongElement() {
    Schema s = Schema.createArray(Schema.create(Type.INT));
    assertFalse(gd.validate(s, Arrays.asList(1, "x")));
  }
  @Test public void validateArrayNotCollection() {
    Schema s = Schema.createArray(Schema.create(Type.INT));
    assertFalse(gd.validate(s, 7));
  }

  // Categoria: MAP.
  @Test public void validateMapOk() {
    Schema s = Schema.createMap(Schema.create(Type.INT));
    Map<String,Integer> m = new HashMap<String,Integer>(); m.put("a", 1);
    assertTrue(gd.validate(s, m));
  }

  // Categoria: UNION -> membro presente / assente.
  @Test public void validateUnionMember() {
    Schema s = Schema.createUnion(Arrays.asList(Schema.create(Type.NULL), Schema.create(Type.INT)));
    assertTrue(gd.validate(s, 5));
  }
  @Test public void validateUnionNonMember() {
    Schema s = Schema.createUnion(Arrays.asList(Schema.create(Type.NULL), Schema.create(Type.INT)));
    assertFalse(gd.validate(s, 1.5d));
  }

  // Categoria: ENUM -> simbolo valido / non valido.
  @Test public void validateEnumOk() {
    Schema s = record("{\"type\":\"enum\",\"name\":\"E\",\"symbols\":[\"A\",\"B\"]}");
    assertTrue(gd.validate(s, "B"));
  }
  @Test public void validateEnumUnknown() {
    Schema s = record("{\"type\":\"enum\",\"name\":\"E\",\"symbols\":[\"A\",\"B\"]}");
    assertFalse(gd.validate(s, "Z"));
  }

  // ---------- induce(Object) ----------
  @Test public void induceInteger() { assertEquals(Type.INT,    gd.induce(1).getType()); }
  @Test public void induceLong()    { assertEquals(Type.LONG,   gd.induce(1L).getType()); }
  @Test public void induceString()  { assertEquals(Type.STRING, gd.induce(new Utf8("s")).getType()); }
  @Test public void induceBoolean() { assertEquals(Type.BOOLEAN,gd.induce(true).getType()); }
  @Test public void induceNull()    { assertEquals(Type.NULL,   gd.induce(null).getType()); }

  // BVA: array vuoto -> non deducibile.
  @Test(expected = AvroTypeException.class)
  public void induceEmptyArray()  { gd.induce(Collections.emptyList()); }

  // Partizione d'errore: tipi misti nell'array.
  @Test(expected = AvroTypeException.class)
  public void induceMixedArray()  { gd.induce(Arrays.asList(1, "x")); }

  // Partizione d'errore: tipo non mappabile.
  @Test(expected = AvroTypeException.class)
  public void induceUnknownType() { gd.induce(new Object()); }

  // ---------- toString(Object) ----------
  @Test public void toStringInt()    { assertEquals("5", gd.toString(5)); }
  @Test public void toStringString() { assertEquals("\"hi\"", gd.toString(new Utf8("hi"))); }
  @Test public void toStringEscape() { assertTrue(gd.toString(new Utf8("a\nb")).contains("\\n")); }
  @Test public void toStringNull()   { assertEquals("null", gd.toString(null)); }

  // ---------- compare(Object, Object, Schema) ----------
  @Test public void compareIntLess()  { assertTrue(gd.compare(1, 2, Schema.create(Type.INT)) < 0); }
  @Test public void compareIntEqual() { assertEquals(0, gd.compare(2, 2, Schema.create(Type.INT))); }
  @Test public void compareString()   { assertTrue(gd.compare(new Utf8("a"), new Utf8("b"), Schema.create(Type.STRING)) < 0); }
  @Test public void compareNullType() { assertEquals(0, gd.compare(null, null, Schema.create(Type.NULL))); }

  // MAP non è ordinabile: la compare (order) deve lanciare.
  @Test(expected = AvroRuntimeException.class)
  public void compareMapThrows() {
    Schema s = Schema.createMap(Schema.create(Type.INT));
    Map<String,Integer> m1 = new HashMap<String,Integer>(); m1.put("a", 1);
    Map<String,Integer> m2 = new HashMap<String,Integer>(); m2.put("a", 2);
    gd.compare(m1, m2, s);
  }

  // ---------- hashCode(Object, Schema) ----------
  @Test public void hashCodeNullDatum() { assertEquals(0, gd.hashCode(null, Schema.create(Type.INT))); }
  @Test public void hashCodeString()    {
    assertEquals(new Utf8("k").hashCode(), gd.hashCode(new Utf8("k"), Schema.create(Type.STRING)));
  }

  // ---------- resolveUnion(Schema, Object) ----------
  @Test public void resolveUnionFound() {
    Schema u = Schema.createUnion(Arrays.asList(Schema.create(Type.NULL), Schema.create(Type.INT)));
    assertEquals(1, gd.resolveUnion(u, 5));
  }
  @Test(expected = UnresolvedUnionException.class)
  public void resolveUnionNotFound() {
    Schema u = Schema.createUnion(Arrays.asList(Schema.create(Type.NULL), Schema.create(Type.INT)));
    gd.resolveUnion(u, 1.5d);
  }
}
