package com.milestone4.auto.llm.io;
import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import java.io.ByteArrayInputStream;
import java.io.EOFException;
import java.nio.ByteBuffer;
import java.util.Arrays;
import org.apache.avro.AvroTypeException;
import org.apache.avro.Schema;
import org.apache.avro.Schema.Type;
import org.apache.avro.io.DecoderFactory;
import org.apache.avro.io.JsonDecoder;
import org.apache.avro.util.Utf8;
import org.junit.Test;
public class TestJsonDecoderLLMZeroShot {
  private JsonDecoder decoder(Schema schema, String json) throws Exception {
    return DecoderFactory.get().jsonDecoder(schema, json);
  }
  @Test
  public void testReadBooleanValues() throws Exception {
    Schema schema = Schema.create(Type.BOOLEAN);
    assertTrue(decoder(schema, "true").readBoolean());
    assertFalse(decoder(schema, "false").readBoolean());
  }
  @Test
  public void testReadIntBoundaries() throws Exception {
    Schema schema = Schema.create(Type.INT);
    assertEquals(Integer.MIN_VALUE, decoder(schema, String.valueOf(Integer.MIN_VALUE)).readInt());
    assertEquals(Integer.MAX_VALUE, decoder(schema, String.valueOf(Integer.MAX_VALUE)).readInt());
  }
  @Test
  public void testReadLongBoundaries() throws Exception {
    Schema schema = Schema.create(Type.LONG);
    assertEquals(Long.MIN_VALUE, decoder(schema, String.valueOf(Long.MIN_VALUE)).readLong());
    assertEquals(Long.MAX_VALUE, decoder(schema, String.valueOf(Long.MAX_VALUE)).readLong());
  }
  @Test
  public void testReadFloatAndDouble() throws Exception {
    assertEquals(1.25f, decoder(Schema.create(Type.FLOAT), "1.25").readFloat(), 0.0f);
    assertEquals(-2.5d, decoder(Schema.create(Type.DOUBLE), "-2.5").readDouble(), 0.0d);
  }
  @Test
  public void testReadStringAndEmptyString() throws Exception {
    JsonDecoder d1 = decoder(Schema.create(Type.STRING), "\"hello\"");
    assertEquals(new Utf8("hello"), d1.readString(null));
    JsonDecoder d2 = decoder(Schema.create(Type.STRING), "\"\"");
    assertEquals(new Utf8(""), d2.readString(null));
  }
  @Test
  public void testReadBytesUsesIso88591() throws Exception {
    JsonDecoder d = decoder(Schema.create(Type.BYTES), "\"\\u00FF\"");
    ByteBuffer buffer = d.readBytes(null);
    byte[] actual = new byte[buffer.remaining()];
    buffer.get(actual);
    assertArrayEquals(new byte[] { (byte) 0xFF }, actual);
  }
  @Test
  public void testReadFixedExactLength() throws Exception {
    Schema fixed = Schema.parse("{\"type\":\"fixed\",\"name\":\"F3\",\"size\":3}");
    JsonDecoder d = decoder(fixed, "\"abc\"");
    byte[] out = new byte[3];
    d.readFixed(out, 0, 3);
    assertArrayEquals(new byte[] { 'a', 'b', 'c' }, out);
  }
  @Test(expected = AvroTypeException.class)
  public void testReadFixedWrongLengthThrows() throws Exception {
    Schema fixed = Schema.parse("{\"type\":\"fixed\",\"name\":\"F3\",\"size\":3}");
    JsonDecoder d = decoder(fixed, "\"ab\"");
    d.readFixed(new byte[3], 0, 3);
  }
  @Test
  public void testReadEnumValidSymbol() throws Exception {
    Schema en = Schema.parse("{\"type\":\"enum\",\"name\":\"E\",\"symbols\":[\"A\",\"B\",\"C\"]}");
    JsonDecoder d = decoder(en, "\"B\"");
    assertEquals(1, d.readEnum());
  }
  @Test(expected = AvroTypeException.class)
  public void testReadEnumUnknownSymbolThrows() throws Exception {
    Schema en = Schema.parse("{\"type\":\"enum\",\"name\":\"E\",\"symbols\":[\"A\",\"B\"]}");
    decoder(en, "\"Z\"").readEnum();
  }
  @Test
  public void testReadArrayStartAndNext() throws Exception {
    Schema arraySchema = Schema.createArray(Schema.create(Type.INT));
    JsonDecoder d = decoder(arraySchema, "[1,2]");
    assertEquals(1L, d.readArrayStart());
    assertEquals(1, d.readInt());
    assertEquals(1L, d.arrayNext());
    assertEquals(2, d.readInt());
    assertEquals(0L, d.arrayNext());
  }
  @Test
  public void testReadMapStartAndNext() throws Exception {
    Schema mapSchema = Schema.createMap(Schema.create(Type.INT));
    JsonDecoder d = decoder(mapSchema, "{\"a\":1,\"b\":2}");
    assertEquals(1L, d.readMapStart());
    assertEquals(new Utf8("a"), d.readString(null));
    assertEquals(1, d.readInt());
    assertEquals(1L, d.mapNext());
    assertEquals(new Utf8("b"), d.readString(null));
    assertEquals(2, d.readInt());
    assertEquals(0L, d.mapNext());
  }
  @Test
  public void testReadUnionIndexNullAndString() throws Exception {
    Schema union = Schema.createUnion(Arrays.asList(Schema.create(Type.NULL), Schema.create(Type.STRING)));
    JsonDecoder nullDecoder = decoder(union, "null");
    assertEquals(0, nullDecoder.readIndex());
    nullDecoder.readNull();
    JsonDecoder strDecoder = decoder(union, "{\"string\":\"x\"}");
    assertEquals(1, strDecoder.readIndex());
    assertEquals(new Utf8("x"), strDecoder.readString(null));
  }
  @Test(expected = AvroTypeException.class)
  public void testReadUnionUnknownBranchThrows() throws Exception {
    Schema union = Schema.createUnion(Arrays.asList(Schema.create(Type.NULL), Schema.create(Type.STRING)));
    decoder(union, "{\"int\":1}").readIndex();
  }
  @Test(expected = NullPointerException.class)
  public void testConfigureNullStringThrows() throws Exception {
    JsonDecoder d = decoder(Schema.create(Type.BOOLEAN), "true");
    d.configure((String) null);
  }
  @Test(expected = NullPointerException.class)
  public void testConfigureNullInputStreamThrows() throws Exception {
    JsonDecoder d = decoder(Schema.create(Type.BOOLEAN), "true");
    d.configure((ByteArrayInputStream) null);
  }
  @Test
  public void testConfigureInputStreamReusesDecoder() throws Exception {
    JsonDecoder d = decoder(Schema.create(Type.BOOLEAN), "true");
    d.configure(new ByteArrayInputStream("false".getBytes("UTF-8")));
    assertFalse(d.readBoolean());
  }
  @Test(expected = AvroTypeException.class)
  public void testTypeMismatchThrowsAvroTypeException() throws Exception {
    decoder(Schema.create(Type.INT), "\"1\"").readInt();
  }
  @Test(expected = EOFException.class)
  public void testEmptyInputThrowsEOFException() throws Exception {
    decoder(Schema.create(Type.INT), "").readInt();
  }
}
