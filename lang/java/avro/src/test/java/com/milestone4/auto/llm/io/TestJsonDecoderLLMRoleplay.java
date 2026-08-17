package com.milestone4.auto.llm.io;
import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.fail;
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
public class TestJsonDecoderLLMRoleplay {
  private static JsonDecoder dec(Schema schema, String json) throws IOException {
    return DecoderFactory.get().jsonDecoder(schema, json);
  }
  private static JsonDecoder dec(Type type, String json) throws IOException {
    return dec(Schema.create(type), json);
  }
  private static byte[] bytes(ByteBuffer bb) {
    byte[] out = new byte[bb.remaining()];
    bb.get(out);
    return out;
  }
  @Test
  public void configureStringResetsStateAfterPartialRead() throws IOException {
    Schema arrayInts = Schema.createArray(Schema.create(Type.INT));
    JsonDecoder d = dec(arrayInts, "[10,20]");
    assertEquals(1L, d.readArrayStart());
    assertEquals(10, d.readInt());
    d.configure("[7]");
    assertEquals(1L, d.readArrayStart());
    assertEquals(7, d.readInt());
    assertEquals(0L, d.arrayNext());
  }
  @Test
  public void configureInputStreamReadsNewPayload() throws IOException {
    JsonDecoder d = dec(Type.STRING, "\"old\"");
    d.configure(new ByteArrayInputStream("\"new\"".getBytes("UTF-8")));
    assertEquals("new", d.readString(null).toString());
  }
  @Test(expected = NullPointerException.class)
  public void configureNullStringThrows() throws IOException {
    dec(Type.INT, "1").configure((String) null);
  }
  @Test(expected = NullPointerException.class)
  public void configureNullInputStreamThrows() throws IOException {
    dec(Type.INT, "1").configure((ByteArrayInputStream) null);
  }
  @Test
  public void readBytesPreservesIso88591Octet() throws IOException {
    ByteBuffer bb = dec(Type.BYTES, "\"\\u00E9\"").readBytes(null);
    assertArrayEquals(new byte[] { (byte) 0xE9 }, bytes(bb));
  }
  @Test
  public void skipBytesConsumesSingleValue() throws IOException {
    JsonDecoder d = dec(Type.BYTES, "\"abc\"");
    d.skipBytes();
  }
  @Test
  public void readFixedCopiesIntoOffset() throws IOException {
    Schema fixed = Schema.parse("{\"type\":\"fixed\",\"name\":\"F4R\",\"size\":4}");
    byte[] target = new byte[] { 1, 2, 3, 4, 5, 6 };
    dec(fixed, "\"WXYZ\"").readFixed(target, 1, 4);
    assertArrayEquals(new byte[] { 1, 'W', 'X', 'Y', 'Z', 6 }, target);
  }
  @Test
  public void readFixedWrongLengthArgumentMessage() throws IOException {
    Schema fixed = Schema.parse("{\"type\":\"fixed\",\"name\":\"F4Arg\",\"size\":4}");
    try {
      dec(fixed, "\"ABCD\"").readFixed(new byte[4], 0, 3);
      fail();
    } catch (AvroTypeException e) {
      assertEquals("Incorrect length for fixed binary: expected 4 but received 3 bytes.", e.getMessage());
    }
  }
  @Test
  public void skipFixedPayloadLengthMismatchMessage() throws IOException {
    Schema fixed = Schema.parse("{\"type\":\"fixed\",\"name\":\"F3Skip\",\"size\":3}");
    try {
      dec(fixed, "\"AB\"").skipFixed(3);
      fail();
    } catch (AvroTypeException e) {
      assertEquals("Expected fixed length 3, but got2", e.getMessage());
    }
  }
  @Test
  public void readEnumWrongTokenReportsExpectedFixed() throws IOException {
    Schema en = Schema.parse("{\"type\":\"enum\",\"name\":\"E1\",\"symbols\":[\"A\",\"B\"]}");
    try {
      dec(en, "7").readEnum();
      fail();
    } catch (AvroTypeException e) {
      assertEquals("Expected fixed. Got VALUE_NUMBER_INT", e.getMessage());
    }
  }
  @Test
  public void readEnumUnknownSymbolMessage() throws IOException {
    Schema en = Schema.parse("{\"type\":\"enum\",\"name\":\"E2\",\"symbols\":[\"A\",\"B\"]}");
    try {
      dec(en, "\"Z\"").readEnum();
      fail();
    } catch (AvroTypeException e) {
      assertEquals("Unknown symbol in enum Z", e.getMessage());
    }
  }
  @Test
  public void readMapKeyAndValueFlow() throws IOException {
    Schema map = Schema.createMap(Schema.create(Type.BOOLEAN));
    JsonDecoder d = dec(map, "{\"k\":false}");
    assertEquals(1L, d.readMapStart());
    assertEquals("k", d.readString(null).toString());
    assertFalse(d.readBoolean());
    assertEquals(0L, d.mapNext());
  }
  @Test
  public void skipMapSkipsNestedContent() throws IOException {
    Schema map = Schema.createMap(Schema.createMap(Schema.create(Type.INT)));
    JsonDecoder d = dec(map, "{\"outer\":{\"a\":1,\"b\":2}}");
    assertEquals(0L, d.skipMap());
  }
  @Test
  public void skipArraySkipsNestedArrays() throws IOException {
    Schema nested = Schema.createArray(Schema.createArray(Schema.create(Type.INT)));
    JsonDecoder d = dec(nested, "[[1],[2,3],[]]");
    assertEquals(0L, d.skipArray());
  }
  @Test
  public void readUnionNullBranchIndexAndValue() throws IOException {
    Schema union = Schema.parse("[\"null\",\"string\"]");
    JsonDecoder d = dec(union, "null");
    assertEquals(0, d.readIndex());
    d.readNull();
  }
  @Test
  public void readUnionNamedBranchValue() throws IOException {
    Schema union = Schema.parse("[\"null\",\"string\"]");
    JsonDecoder d = dec(union, "{\"string\":\"v\"}");
    assertEquals(1, d.readIndex());
    assertEquals("v", d.readString(null).toString());
  }
  @Test
  public void readUnionInvalidStartTokenMessage() throws IOException {
    Schema union = Schema.parse("[\"null\",\"int\"]");
    try {
      dec(union, "5").readIndex();
      fail();
    } catch (AvroTypeException e) {
      assertEquals("Expected start-union. Got VALUE_NUMBER_INT", e.getMessage());
    }
  }
  @Test
  public void readUnionUnknownBranchMessage() throws IOException {
    Schema union = Schema.parse("[\"null\",\"int\"]");
    try {
      dec(union, "{\"long\":3}").readIndex();
      fail();
    } catch (AvroTypeException e) {
      assertEquals("Unknown union branch long", e.getMessage());
    }
  }
  @Test(expected = EOFException.class)
  public void emptyInputThrowsEofForPrimitiveRead() throws IOException {
    dec(Type.LONG, "").readLong();
  }
}
