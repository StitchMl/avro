/**
 * Milestone 4 (ISW2) — Black-box test suite per org.apache.avro.io.JsonDecoder (primitivi).
 * Category Partition: token JSON conforme allo schema atteso vs token non conforme (errore).
 * Costruzione via DecoderFactory (i costruttori di JsonDecoder sono package-private).
 * JUnit 4.8.2 -> @Test(expected=...).
 */
package com.milestone4.jsondecoder.bb;

import static org.junit.Assert.*;

import java.io.IOException;

import org.apache.avro.AvroTypeException;
import org.apache.avro.Schema;
import org.apache.avro.Schema.Type;
import org.apache.avro.io.DecoderFactory;
import org.apache.avro.io.JsonDecoder;
import org.junit.Test;

public class TestJsonDecoderBB {

  private static JsonDecoder dec(Schema s, String json) throws IOException {
    return DecoderFactory.get().jsonDecoder(s, json);
  }
  private static JsonDecoder dec(Type t, String json) throws IOException {
    return dec(Schema.create(t), json);
  }

  // ---------- letture primitive conformi ----------
  @Test public void readIntOk()     throws IOException { assertEquals(5, dec(Type.INT, "5").readInt()); }
  @Test public void readLongOk()    throws IOException { assertEquals(9L, dec(Type.LONG, "9").readLong()); }
  @Test public void readFloatOk()   throws IOException { assertEquals(1.5f, dec(Type.FLOAT, "1.5").readFloat(), 1e-6f); }
  @Test public void readDoubleOk()  throws IOException { assertEquals(2.5d, dec(Type.DOUBLE, "2.5").readDouble(), 1e-9d); }
  @Test public void readBooleanTrue()  throws IOException { assertTrue(dec(Type.BOOLEAN, "true").readBoolean()); }
  @Test public void readBooleanFalse() throws IOException { assertFalse(dec(Type.BOOLEAN, "false").readBoolean()); }
  @Test public void readStringOk()  throws IOException { assertEquals("hi", dec(Type.STRING, "\"hi\"").readString(null).toString()); }
  @Test public void readNullOk()    throws IOException { dec(Type.NULL, "null").readNull(); /* nessuna eccezione */ }

  // BVA: interi ai confini.
  @Test public void readIntMax() throws IOException {
    assertEquals(Integer.MAX_VALUE, dec(Type.INT, String.valueOf(Integer.MAX_VALUE)).readInt());
  }
  @Test public void readIntMin() throws IOException {
    assertEquals(Integer.MIN_VALUE, dec(Type.INT, String.valueOf(Integer.MIN_VALUE)).readInt());
  }

  // ---------- token non conforme -> AvroTypeException ----------
  @Test(expected = AvroTypeException.class)
  public void readIntWrongToken()    throws IOException { dec(Type.INT, "\"x\"").readInt(); }
  @Test(expected = AvroTypeException.class)
  public void readBooleanWrongToken()throws IOException { dec(Type.BOOLEAN, "5").readBoolean(); }
  @Test(expected = AvroTypeException.class)
  public void readStringWrongToken() throws IOException { dec(Type.STRING, "5").readString(null); }
  @Test(expected = AvroTypeException.class)
  public void readNullWrongToken()   throws IOException { dec(Type.NULL, "5").readNull(); }

  // ---------- costruzione: precondizioni ----------
  @Test(expected = NullPointerException.class)
  public void nullSchemaThrows()  throws IOException { DecoderFactory.get().jsonDecoder((Schema) null, "5"); }
  @Test(expected = NullPointerException.class)
  public void nullStringThrows()  throws IOException { DecoderFactory.get().jsonDecoder(Schema.create(Type.INT), (String) null); }
}
