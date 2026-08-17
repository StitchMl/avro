package com.milestone4.auto.llm.io;
import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import java.io.ByteArrayInputStream;
import java.io.EOFException;
import java.io.IOException;
import java.nio.ByteBuffer;
import org.apache.avro.AvroTypeException;
import org.apache.avro.Schema;
import org.apache.avro.Schema.Type;
import org.apache.avro.io.DecoderFactory;
import org.apache.avro.io.JsonDecoder;
import org.junit.Test;
public class TestJsonDecoderLLMFewShot {
  private static JsonDecoder dec(Schema s, String json) throws IOException {
    return DecoderFactory.get().jsonDecoder(s, json);
  }
  private static JsonDecoder dec(Type t, String json) throws IOException {
    return dec(Schema.create(t), json);
  }
  @Test
  public void readBytesOk() throws IOException {
    ByteBuffer bb = dec(Type.BYTES, "\"ABC\"").readBytes(null);
    byte[] out = new byte[bb.remaining()];
    bb.get(out);
    assertArrayEquals(new byte[] { 'A', 'B', 'C' }, out);
  }
  @Test
  public void readBytesEmpty() throws IOException {
    ByteBuffer bb = dec(Type.BYTES, "\"\"").readBytes(null);
    assertEquals(0, bb.remaining());
  }
  @Test(expected = AvroTypeException.class)
  public void readBytesWrongToken() throws IOException {
    dec(Type.BYTES, "12").readBytes(null);
  }
  @Test
  public void readFixedOkWithOffset() throws IOException {
    Schema fixed = Schema.parse("{\"type\":\"fixed\",\"name\":\"F4\",\"size\":4}");
    byte[] target = new byte[] { 9, 0, 0, 0, 0, 8 };
    dec(fixed, "\"WXYZ\"").readFixed(target, 1, 4);
    assertArrayEquals(new byte[] { 9, 'W', 'X', 'Y', 'Z', 8 }, target);
  }
  @Test(expected = AvroTypeException.class)
  public void readFixedPayloadLengthMismatch() throws IOException {
    Schema fixed = Schema.parse("{\"type\":\"fixed\",\"name\":\"F3\",\"size\":3}");
    dec(fixed, "\"AB\"").readFixed(new byte[3], 0, 3);
  }
  @Test(expected = AvroTypeException.class)
  public void skipFixedWrongExpectedLength() throws IOException {
    Schema fixed = Schema.parse("{\"type\":\"fixed\",\"name\":\"F2\",\"size\":2}");
    dec(fixed, "\"AB\"").skipFixed(1);
  }
  @Test
  public void readEnumLastSymbol() throws IOException {
    Schema en = Schema.parse("{\"type\":\"enum\",\"name\":\"E\",\"symbols\":[\"A\",\"B\",\"C\"]}");
    assertEquals(2, dec(en, "\"C\"").readEnum());
  }
  @Test(expected = AvroTypeException.class)
  public void readEnumUnknownSymbol() throws IOException {
    Schema en = Schema.parse("{\"type\":\"enum\",\"name\":\"E\",\"symbols\":[\"A\",\"B\"]}");
    dec(en, "\"Z\"").readEnum();
  }
  @Test
  public void readArrayEmpty() throws IOException {
    Schema a = Schema.createArray(Schema.create(Type.INT));
    assertEquals(0L, dec(a, "[]").readArrayStart());
  }
  @Test
  public void readArraySingleElement() throws IOException {
    Schema a = Schema.createArray(Schema.create(Type.INT));
    JsonDecoder d = dec(a, "[7]");
    assertEquals(1L, d.readArrayStart());
    assertEquals(7, d.readInt());
    assertEquals(0L, d.arrayNext());
  }
  @Test
  public void skipArrayOk() throws IOException {
    Schema a = Schema.createArray(Schema.create(Type.INT));
    assertEquals(0L, dec(a, "[1,2,3]").skipArray());
  }
  @Test(expected = AvroTypeException.class)
  public void skipArrayWrongToken() throws IOException {
    Schema a = Schema.createArray(Schema.create(Type.INT));
    dec(a, "{\"x\":1}").skipArray();
  }
  @Test
  public void readMapEmpty() throws IOException {
    Schema m = Schema.createMap(Schema.create(Type.INT));
    assertEquals(0L, dec(m, "{}").readMapStart());
  }
  @Test
  public void readMapSingleEntry() throws IOException {
    Schema m = Schema.createMap(Schema.create(Type.INT));
    JsonDecoder d = dec(m, "{\"k\":3}");
    assertEquals(1L, d.readMapStart());
    assertEquals("k", d.readString(null).toString());
    assertEquals(3, d.readInt());
    assertEquals(0L, d.mapNext());
  }
  @Test(expected = AvroTypeException.class)
  public void skipMapWrongToken() throws IOException {
    Schema m = Schema.createMap(Schema.create(Type.INT));
    dec(m, "[1]").skipMap();
  }
  @Test
  public void readUnionNullBranch() throws IOException {
    Schema u = Schema.parse("[\"null\",\"int\"]");
    JsonDecoder d = dec(u, "null");
    assertEquals(0, d.readIndex());
    d.readNull();
  }
  @Test
  public void readUnionIntBranch() throws IOException {
    Schema u = Schema.parse("[\"null\",\"int\"]");
    JsonDecoder d = dec(u, "{\"int\":4}");
    assertEquals(1, d.readIndex());
    assertEquals(4, d.readInt());
  }
  @Test(expected = AvroTypeException.class)
  public void readUnionUnknownBranch() throws IOException {
    Schema u = Schema.parse("[\"null\",\"int\"]");
    dec(u, "{\"string\":\"x\"}").readIndex();
  }
  @Test
  public void configureStringReusesDecoder() throws IOException {
    JsonDecoder d = dec(Type.BOOLEAN, "true");
    d.configure("false");
    assertFalse(d.readBoolean());
  }
  @Test(expected = NullPointerException.class)
  public void configureNullInputStreamThrows() throws IOException {
    JsonDecoder d = dec(Type.INT, "1");
    d.configure((ByteArrayInputStream) null);
  }
  @Test(expected = EOFException.class)
  public void eofOnEmptyInput() throws IOException {
    dec(Type.INT, "").readInt();
  }
}
