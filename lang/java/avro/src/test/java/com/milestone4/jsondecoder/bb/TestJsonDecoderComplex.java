/**
 * Milestone 4 (ISW2) — Black-box test suite per org.apache.avro.io.JsonDecoder (tipi complessi):
 * bytes, enum, array, map, union. Category Partition sui costrutti strutturati.
 * JUnit 4.8.2 -> @Test(expected=...).
 */
package com.milestone4.jsondecoder.bb;

import static org.junit.Assert.*;

import java.io.IOException;
import java.nio.ByteBuffer;

import org.apache.avro.AvroTypeException;
import org.apache.avro.Schema;
import org.apache.avro.Schema.Type;
import org.apache.avro.io.DecoderFactory;
import org.apache.avro.io.JsonDecoder;
import org.junit.Test;

public class TestJsonDecoderComplex {

  private static JsonDecoder dec(Schema s, String json) throws IOException {
    return DecoderFactory.get().jsonDecoder(s, json);
  }

  // ---------- bytes ----------
  @Test public void readBytesOk() throws IOException {
    ByteBuffer bb = dec(Schema.create(Type.BYTES), "\"abc\"").readBytes(null);
    assertEquals(3, bb.remaining());
  }
  @Test(expected = AvroTypeException.class)
  public void readBytesWrongToken() throws IOException {
    dec(Schema.create(Type.BYTES), "5").readBytes(null);
  }

  // ---------- enum ----------
  private static Schema enumSchema() {
    return Schema.parse("{\"type\":\"enum\",\"name\":\"E\",\"symbols\":[\"A\",\"B\"]}");
  }
  @Test public void readEnumOk() throws IOException {
    assertEquals(1, dec(enumSchema(), "\"B\"").readEnum());
  }
  @Test(expected = AvroTypeException.class)
  public void readEnumUnknown() throws IOException {
    dec(enumSchema(), "\"Z\"").readEnum();
  }

  // ---------- array ----------
  @Test public void readArrayCountsElements() throws IOException {
    Schema s = Schema.createArray(Schema.create(Type.INT));
    JsonDecoder d = dec(s, "[10,20,30]");
    long count = 0;
    for (long i = d.readArrayStart(); i != 0; i = d.arrayNext()) {
      for (long j = 0; j < i; j++) { d.readInt(); count++; }
    }
    assertEquals(3, count);
  }
  @Test public void readArrayEmpty() throws IOException {
    Schema s = Schema.createArray(Schema.create(Type.INT));
    JsonDecoder d = dec(s, "[]");
    assertEquals(0, d.readArrayStart());
  }

  // ---------- map ----------
  @Test public void readMapCountsEntries() throws IOException {
    Schema s = Schema.createMap(Schema.create(Type.INT));
    JsonDecoder d = dec(s, "{\"a\":1,\"b\":2}");
    long count = 0;
    for (long i = d.readMapStart(); i != 0; i = d.mapNext()) {
      for (long j = 0; j < i; j++) { d.readString(null); d.readInt(); count++; }
    }
    assertEquals(2, count);
  }

  // ---------- union ----------
  private static Schema unionNullInt() {
    return Schema.parse("[\"null\",\"int\"]");
  }
  @Test public void readUnionNullBranch() throws IOException {
    JsonDecoder d = dec(unionNullInt(), "null");
    assertEquals(0, d.readIndex());
    d.readNull();
  }
  @Test public void readUnionIntBranch() throws IOException {
    JsonDecoder d = dec(unionNullInt(), "{\"int\":7}");
    assertEquals(1, d.readIndex());
    assertEquals(7, d.readInt());
  }
  @Test(expected = AvroTypeException.class)
  public void readUnionUnknownBranch() throws IOException {
    JsonDecoder d = dec(unionNullInt(), "{\"string\":\"x\"}");
    d.readIndex();
  }
}
