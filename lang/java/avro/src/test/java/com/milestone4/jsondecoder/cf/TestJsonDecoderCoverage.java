/**
 * Milestone 4 (ISW2) — Suite COVERAGE-GUIDED (cf) per JsonDecoder.
 * Copre i metodi non toccati dalla BB: skipString/skipBytes/readFixed/skipFixed/
 * skipArray/skipMap, lettura di record (doAction: RECORD_START + FieldAdjustAction),
 * e il ramo EOF di advance().
 * JUnit 4.8.2 -> @Test(expected=...).
 */
package com.milestone4.jsondecoder.cf;

import static org.junit.Assert.*;

import java.io.EOFException;
import java.io.IOException;

import org.apache.avro.Schema;
import org.apache.avro.Schema.Type;
import org.apache.avro.io.DecoderFactory;
import org.apache.avro.io.JsonDecoder;
import org.junit.Test;

public class TestJsonDecoderCoverage {

  private static JsonDecoder dec(Schema s, String json) throws IOException {
    return DecoderFactory.get().jsonDecoder(s, json);
  }
  private static Schema fixedSchema() {
    return Schema.parse("{\"type\":\"fixed\",\"name\":\"F\",\"size\":3}");
  }
  private static Schema recSchema() {
    return Schema.parse("{\"type\":\"record\",\"name\":\"R\",\"fields\":["
        + "{\"name\":\"a\",\"type\":\"int\"}]}");
  }

  // ---------- skip primitivi ----------
  @Test public void skipString() throws IOException { dec(Schema.create(Type.STRING), "\"x\"").skipString(); }
  @Test public void skipBytes()  throws IOException { dec(Schema.create(Type.BYTES),  "\"x\"").skipBytes(); }

  // ---------- fixed ----------
  @Test public void readFixedOk() throws IOException {
    byte[] buf = new byte[3];
    dec(fixedSchema(), "\"abc\"").readFixed(buf, 0, 3);
    assertEquals('a', (char) buf[0]);
    assertEquals('c', (char) buf[2]);
  }
  @Test public void skipFixedOk() throws IOException {
    dec(fixedSchema(), "\"abc\"").skipFixed(3);
  }

  // ---------- skip strutturati ----------
  @Test public void skipArrayOk() throws IOException {
    assertEquals(0, dec(Schema.createArray(Schema.create(Type.INT)), "[1,2,3]").skipArray());
  }
  @Test public void skipMapOk() throws IOException {
    assertEquals(0, dec(Schema.createMap(Schema.create(Type.INT)), "{\"a\":1}").skipMap());
  }

  // ---------- record: esercita doAction (RECORD_START + FieldAdjustAction) ----------
  @Test public void readRecordField() throws IOException {
    JsonDecoder d = dec(recSchema(), "{\"a\":5}");
    assertEquals(5, d.readInt());
  }

  // ---------- ramo EOF di advance() ----------
  @Test(expected = EOFException.class)
  public void readPastEndThrowsEof() throws IOException {
    JsonDecoder d = dec(Schema.create(Type.INT), "5");
    d.readInt();   // consuma l'unico valore
    d.readInt();   // oltre la fine -> EOFException
  }
}
