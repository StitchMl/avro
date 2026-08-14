/**
 * Milestone 4 (ISW2) — Black-box test suite per le classi annidate di GenericData:
 * Record, Array, Fixed, EnumSymbol. Category Partition + Boundary Value Analysis.
 * JUnit 4.8.2 -> @Test(expected=...).
 */
package com.milestone4.genericdata.bb;

import static org.junit.Assert.*;

import org.apache.avro.AvroRuntimeException;
import org.apache.avro.Schema;
import org.apache.avro.Schema.Type;
import org.apache.avro.generic.GenericData;
import org.junit.Test;

public class TestGenericDataStructures {

  private static Schema recSchema() {
    return Schema.parse("{\"type\":\"record\",\"name\":\"R\",\"fields\":["
        + "{\"name\":\"a\",\"type\":\"int\"},{\"name\":\"b\",\"type\":\"int\"}]}");
  }

  // ---------- Record ----------
  @Test public void recordPutGetByName() {
    GenericData.Record r = new GenericData.Record(recSchema());
    r.put("a", 1); r.put("b", 2);
    assertEquals(1, r.get("a"));
    assertEquals(2, r.get("b"));
  }
  @Test public void recordPutGetByIndex() {
    GenericData.Record r = new GenericData.Record(recSchema());
    r.put(0, 10); r.put(1, 20);
    assertEquals(10, r.get(0));
    assertEquals(20, r.get(1));
  }
  @Test public void recordGetUnknownFieldIsNull() {
    GenericData.Record r = new GenericData.Record(recSchema());
    assertNull(r.get("missing"));
  }
  @Test public void recordEqualsAndHashCode() {
    GenericData.Record r1 = new GenericData.Record(recSchema());
    GenericData.Record r2 = new GenericData.Record(recSchema());
    r1.put("a", 1); r1.put("b", 2);
    r2.put("a", 1); r2.put("b", 2);
    assertEquals(r1, r2);
    assertEquals(r1.hashCode(), r2.hashCode());
  }
  // Partizione d'errore: schema non-record.
  @Test(expected = AvroRuntimeException.class)
  public void recordWrongSchema() {
    new GenericData.Record(Schema.create(Type.INT));
  }

  // ---------- Array ----------
  private static Schema arrSchema() { return Schema.createArray(Schema.create(Type.INT)); }

  @Test public void arrayAddSizeGet() {
    GenericData.Array<Integer> a = new GenericData.Array<Integer>(0, arrSchema());
    a.add(1); a.add(2);
    assertEquals(2, a.size());
    assertEquals(Integer.valueOf(1), a.get(0));
  }
  @Test public void arrayGrowsBeyondCapacity() { // BVA: capacità iniziale 1, oltre confine
    GenericData.Array<Integer> a = new GenericData.Array<Integer>(1, arrSchema());
    for (int i = 0; i < 5; i++) a.add(i);
    assertEquals(5, a.size());
    assertEquals(Integer.valueOf(4), a.get(4));
  }
  @Test public void arraySetReturnsOld() {
    GenericData.Array<Integer> a = new GenericData.Array<Integer>(0, arrSchema());
    a.add(1);
    assertEquals(Integer.valueOf(1), a.set(0, 9));
    assertEquals(Integer.valueOf(9), a.get(0));
  }
  @Test public void arrayRemoveShiftsLeft() {
    GenericData.Array<Integer> a = new GenericData.Array<Integer>(0, arrSchema());
    a.add(1); a.add(2); a.add(3);
    assertEquals(Integer.valueOf(2), a.remove(1));
    assertEquals(2, a.size());
    assertEquals(Integer.valueOf(3), a.get(1));
  }
  @Test public void arrayClear() {
    GenericData.Array<Integer> a = new GenericData.Array<Integer>(0, arrSchema());
    a.add(1); a.clear();
    assertEquals(0, a.size());
  }
  // BVA: accesso oltre size.
  @Test(expected = IndexOutOfBoundsException.class)
  public void arrayGetOutOfBounds() {
    GenericData.Array<Integer> a = new GenericData.Array<Integer>(0, arrSchema());
    a.add(1);
    a.get(1);
  }
  @Test(expected = AvroRuntimeException.class)
  public void arrayWrongSchema() {
    new GenericData.Array<Integer>(0, Schema.create(Type.INT));
  }

  // ---------- Fixed ----------
  private static Schema fixedSchema() {
    return Schema.parse("{\"type\":\"fixed\",\"name\":\"F\",\"size\":3}");
  }
  @Test public void fixedBytesRoundtrip() {
    GenericData.Fixed f = new GenericData.Fixed(fixedSchema());
    byte[] b = {1, 2, 3};
    f.bytes(b);
    assertArrayEquals(b, f.bytes());
  }
  @Test public void fixedEqualsByContent() {
    GenericData.Fixed f1 = new GenericData.Fixed(fixedSchema(), new byte[]{1,2,3});
    GenericData.Fixed f2 = new GenericData.Fixed(fixedSchema(), new byte[]{1,2,3});
    assertEquals(f1, f2);
    assertEquals(f1.hashCode(), f2.hashCode());
  }
  @Test public void fixedDefaultSizeFromSchema() { // BVA: buffer allocato = size schema
    GenericData.Fixed f = new GenericData.Fixed(fixedSchema());
    assertEquals(3, f.bytes().length);
  }

  // ---------- EnumSymbol ----------
  private static Schema enumSchema() {
    return Schema.parse("{\"type\":\"enum\",\"name\":\"E\",\"symbols\":[\"A\",\"B\"]}");
  }
  @Test public void enumToStringAndEquals() {
    GenericData.EnumSymbol e1 = new GenericData.EnumSymbol(enumSchema(), "A");
    GenericData.EnumSymbol e2 = new GenericData.EnumSymbol(enumSchema(), "A");
    assertEquals("A", e1.toString());
    assertEquals(e1, e2);
    assertEquals(e1.hashCode(), e2.hashCode());
  }
  @Test public void enumNotEqualsDifferentSymbol() {
    GenericData.EnumSymbol e1 = new GenericData.EnumSymbol(enumSchema(), "A");
    GenericData.EnumSymbol e2 = new GenericData.EnumSymbol(enumSchema(), "B");
    assertFalse(e1.equals(e2));
  }
}
