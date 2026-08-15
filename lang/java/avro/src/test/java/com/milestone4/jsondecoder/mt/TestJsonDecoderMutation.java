/**
 * Milestone 4 (ISW2) — Suite MUTATION-GUIDED (mt) per JsonDecoder.
 * Uccide i survivor PIT: configure (return value + reset), letture consecutive
 * (rimozione di in.nextToken()), skipFixed wrong-length, skipString map-key,
 * doAction record-end.
 * JUnit 4.8.2 -> @Test(expected=...).
 */
package com.milestone4.jsondecoder.mt;

import static org.junit.Assert.*;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.apache.avro.AvroTypeException;
import org.apache.avro.Schema;
import org.apache.avro.Schema.Type;
import org.apache.avro.io.DecoderFactory;
import org.apache.avro.io.JsonDecoder;
import org.junit.Test;

public class TestJsonDecoderMutation {

  private static JsonDecoder dec(Schema s, String json) throws IOException {
    return DecoderFactory.get().jsonDecoder(s, json);
  }
  private static Schema arrOf(Type t) { return Schema.createArray(Schema.create(t)); }
  private static Schema fixedSchema() {
    return Schema.parse("{\"type\":\"fixed\",\"name\":\"F\",\"size\":3}");
  }
  private static Schema enumArr() {
    return Schema.createArray(Schema.parse("{\"type\":\"enum\",\"name\":\"E\",\"symbols\":[\"A\",\"B\"]}"));
  }
  private static Schema recInArr() {
    return Schema.createArray(Schema.parse(
        "{\"type\":\"record\",\"name\":\"R\",\"fields\":[{\"name\":\"a\",\"type\":\"int\"}]}"));
  }

  // ---------- configure: valore di ritorno + reset stato ----------
  @Test public void configureStringReturnsSelfAndResets() throws IOException {
    JsonDecoder d = dec(Schema.create(Type.INT), "5");
    assertEquals(5, d.readInt());
    JsonDecoder same = d.configure("7");
    assertSame(d, same);
    assertEquals(7, d.readInt());
  }
  @Test public void configureStreamReturnsSelfAndResets() throws IOException {
    JsonDecoder d = dec(Schema.create(Type.INT), "5");
    d.readInt();
    JsonDecoder same = d.configure(new ByteArrayInputStream("9".getBytes("ISO-8859-1")));
    assertSame(d, same);
    assertEquals(9, d.readInt());
  }

  // ---------- letture consecutive: se in.nextToken() viene rimosso, il 2° valore sbaglia ----------
  @Test public void twoBooleans() throws IOException {
    JsonDecoder d = dec(arrOf(Type.BOOLEAN), "[true,false]");
    List<Boolean> out = new ArrayList<Boolean>();
    for (long i = d.readArrayStart(); i != 0; i = d.arrayNext())
      for (long j = 0; j < i; j++) out.add(d.readBoolean());
    assertEquals(Arrays.asList(Boolean.TRUE, Boolean.FALSE), out);
  }
  @Test public void twoLongs() throws IOException {
    JsonDecoder d = dec(arrOf(Type.LONG), "[1,2]");
    List<Long> out = new ArrayList<Long>();
    for (long i = d.readArrayStart(); i != 0; i = d.arrayNext())
      for (long j = 0; j < i; j++) out.add(d.readLong());
    assertEquals(Arrays.asList(1L, 2L), out);
  }
  @Test public void twoFloats() throws IOException {
    JsonDecoder d = dec(arrOf(Type.FLOAT), "[1.5,2.5]");
    List<Float> out = new ArrayList<Float>();
    for (long i = d.readArrayStart(); i != 0; i = d.arrayNext())
      for (long j = 0; j < i; j++) out.add(d.readFloat());
    assertEquals(Arrays.asList(1.5f, 2.5f), out);
  }
  @Test public void twoDoubles() throws IOException {
    JsonDecoder d = dec(arrOf(Type.DOUBLE), "[1.5,2.5]");
    List<Double> out = new ArrayList<Double>();
    for (long i = d.readArrayStart(); i != 0; i = d.arrayNext())
      for (long j = 0; j < i; j++) out.add(d.readDouble());
    assertEquals(Arrays.asList(1.5d, 2.5d), out);
  }
  @Test public void twoEnums() throws IOException {
    JsonDecoder d = dec(enumArr(), "[\"A\",\"B\"]");
    List<Integer> out = new ArrayList<Integer>();
    for (long i = d.readArrayStart(); i != 0; i = d.arrayNext())
      for (long j = 0; j < i; j++) out.add(d.readEnum());
    assertEquals(Arrays.asList(0, 1), out);
  }
  @Test public void twoNulls() throws IOException {
    JsonDecoder d = dec(arrOf(Type.NULL), "[null,null]");
    int count = 0;
    for (long i = d.readArrayStart(); i != 0; i = d.arrayNext())
      for (long j = 0; j < i; j++) { d.readNull(); count++; }
    assertEquals(2, count);
  }
  @Test public void twoBytes() throws IOException {
    JsonDecoder d = dec(arrOf(Type.BYTES), "[\"a\",\"bc\"]");
    List<Integer> lens = new ArrayList<Integer>();
    for (long i = d.readArrayStart(); i != 0; i = d.arrayNext())
      for (long j = 0; j < i; j++) lens.add(d.readBytes(null).remaining());
    assertEquals(Arrays.asList(1, 2), lens);
  }

  // ---------- skipFixed: lunghezza errata ----------
  @Test(expected = AvroTypeException.class)
  public void skipFixedWrongLength() throws IOException {
    dec(fixedSchema(), "\"abcd\"").skipFixed(3);   // contenuto 4 byte != 3
  }

  // ---------- skipString: ramo map-key ----------
  @Test public void skipStringMapKey() throws IOException {
    JsonDecoder d = dec(Schema.createMap(Schema.create(Type.INT)), "{\"a\":1}");
    long i = d.readMapStart();
    assertEquals(1, i);
    d.skipString();               // salta la chiave (MAP_KEY_MARKER)
    assertEquals(1, d.readInt());
  }

  // ---------- doAction: record-end (record dentro array) ----------
  @Test public void recordEndInArray() throws IOException {
    JsonDecoder d = dec(recInArr(), "[{\"a\":5}]");
    long i = d.readArrayStart();
    assertEquals(1, i);
    assertEquals(5, d.readInt());     // RECORD_START + FieldAdjustAction
    assertEquals(0, d.arrayNext());   // RECORD_END + ARRAY_END
  }
}
