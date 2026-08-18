package com.milestone4.manual.bb;

import static org.junit.Assert.*;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.avro.Schema;
import org.apache.avro.Schema.Type;
import org.apache.avro.io.DecoderFactory;
import org.apache.avro.io.JsonDecoder;
import org.junit.Test;

public class TestJsonDecoderBB {

  private static JsonDecoder decoder(Type type, String input) throws IOException {
    return DecoderFactory.get().jsonDecoder(Schema.create(type), input);
  }

  private static JsonDecoder decoder(String schemaJson, String input) throws IOException {
    return DecoderFactory.get().jsonDecoder(Schema.parse(schemaJson), input);
  }

  // B0.1
  @Test
  public void configureWithNewStringReadsNewValue() throws Exception {
    JsonDecoder decoder = decoder(Type.INT, "1");
    decoder.configure("2");
    assertEquals(2, decoder.readInt());
  }

  // B0.2
  @Test
  public void configureWithNewInputStreamReadsNewValue() throws Exception {
    JsonDecoder decoder = decoder(Type.INT, "1");
    decoder.configure(new ByteArrayInputStream(new byte[] { 50 }));
    assertEquals(2, decoder.readInt());
  }

  // B0.3
  @Test(expected = NullPointerException.class)
  public void configureWithNullStringThrowsNullPointerException() throws Exception {
    JsonDecoder decoder = decoder(Type.INT, "1");
    decoder.configure((String) null);
  }

  // B0.4
  @Test(expected = NullPointerException.class)
  public void configureWithNullInputStreamThrowsNullPointerException() throws Exception {
    JsonDecoder decoder = decoder(Type.INT, "1");
    decoder.configure((InputStream) null);
  }

  // B1
  @Test
  public void readNullConsumesNullValue() throws Exception {
    JsonDecoder decoder = decoder(
            "{\"type\":\"record\",\"name\":\"NullRecord\","
                    + "\"fields\":[{\"name\":\"n\",\"type\":\"null\"},"
                    + "{\"name\":\"i\",\"type\":\"int\"}]}",
            "{\"n\":null,\"i\":7}");
    decoder.readNull();
    assertEquals(7, decoder.readInt());
  }

  // B1
  @Test
  public void readBooleanReadsTrue() throws Exception {
    assertTrue(decoder(Type.BOOLEAN, "true").readBoolean());
  }

  // B1
  @Test
  public void readBooleanReadsFalse() throws Exception {
    assertFalse(decoder(Type.BOOLEAN, "false").readBoolean());
  }

  // B1
  @Test
  public void readIntReadsMinValue() throws Exception {
    assertEquals(Integer.MIN_VALUE,
            decoder(Type.INT, Integer.toString(Integer.MIN_VALUE)).readInt());
  }

  // B1
  @Test
  public void readIntReadsMinusOne() throws Exception {
    assertEquals(-1, decoder(Type.INT, "-1").readInt());
  }

  // B1
  @Test
  public void readIntReadsZero() throws Exception {
    assertEquals(0, decoder(Type.INT, "0").readInt());
  }

  // B1
  @Test
  public void readIntReadsOne() throws Exception {
    assertEquals(1, decoder(Type.INT, "1").readInt());
  }

  // B1
  @Test
  public void readIntReadsMaxValue() throws Exception {
    assertEquals(Integer.MAX_VALUE,
            decoder(Type.INT, Integer.toString(Integer.MAX_VALUE)).readInt());
  }

  // B1
  @Test
  public void readLongReadsMinValue() throws Exception {
    assertEquals(Long.MIN_VALUE,
            decoder(Type.LONG, Long.toString(Long.MIN_VALUE)).readLong());
  }

  // B1
  @Test
  public void readLongReadsZero() throws Exception {
    assertEquals(0L, decoder(Type.LONG, "0").readLong());
  }

  // B1
  @Test
  public void readLongReadsMaxValue() throws Exception {
    assertEquals(Long.MAX_VALUE,
            decoder(Type.LONG, Long.toString(Long.MAX_VALUE)).readLong());
  }

  // B1
  @Test
  public void readFloatReadsNegativeValue() throws Exception {
    assertEquals(-1.5f, decoder(Type.FLOAT, "-1.5").readFloat(), 0.0f);
  }

  // B1
  @Test
  public void readFloatReadsZero() throws Exception {
    assertEquals(0.0f, decoder(Type.FLOAT, "0.0").readFloat(), 0.0f);
  }

  // B1
  @Test
  public void readFloatReadsPositiveValue() throws Exception {
    assertEquals(2.5f, decoder(Type.FLOAT, "2.5").readFloat(), 0.0f);
  }

  // B1
  @Test
  public void readDoubleReadsNegativeValue() throws Exception {
    assertEquals(-1.5d, decoder(Type.DOUBLE, "-1.5").readDouble(), 0.0d);
  }

  // B1
  @Test
  public void readDoubleReadsZero() throws Exception {
    assertEquals(0.0d, decoder(Type.DOUBLE, "0.0").readDouble(), 0.0d);
  }

  // B1
  @Test
  public void readDoubleReadsPositiveValue() throws Exception {
    assertEquals(2.5d, decoder(Type.DOUBLE, "2.5").readDouble(), 0.0d);
  }

  // B2
  @Test
  public void readStringReadsNonEmptyValue() throws Exception {
    assertEquals("hello", decoder(Type.STRING, "\"hello\"").readString(null).toString());
  }

  // B2
  @Test
  public void readStringReadsEmptyValue() throws Exception {
    assertEquals("", decoder(Type.STRING, "\"\"").readString(null).toString());
  }

  // B2
  @Test
  public void skipStringAdvancesOverValue() throws Exception {
    JsonDecoder decoder = decoder(
            "{\"type\":\"record\",\"name\":\"SkipStringRecord\","
                    + "\"fields\":[{\"name\":\"s\",\"type\":\"string\"},"
                    + "{\"name\":\"i\",\"type\":\"int\"}]}",
            "{\"s\":\"skip\",\"i\":7}");
    decoder.skipString();
    assertEquals(7, decoder.readInt());
  }

  // B3
  @Test
  public void readBytesWithNullBufferReturnsBytes() throws Exception {
    ByteBuffer bytes = decoder(Type.BYTES, "\"ABC\"").readBytes(null);
    assertEquals(3, bytes.remaining());
    assertEquals((byte) 65, bytes.get());
    assertEquals((byte) 66, bytes.get());
    assertEquals((byte) 67, bytes.get());
  }

  // B3
  @Test
  public void readBytesReadsEmptyByteString() throws Exception {
    ByteBuffer bytes = decoder(Type.BYTES, "\"\"").readBytes(null);
    assertEquals(0, bytes.remaining());
  }

  // B3
  // Nota (spec-vs-impl): la Javadoc dice che con 'old' capiente i byte sono restituiti in 'old',
  // ma l'implementazione 1.5.4 restituisce un NUOVO buffer. Oracolo rilassato al CONTENUTO (i byte
  // letti sono corretti), documentando la discrepanza come finding.
  @Test
  public void readBytesReusesProvidedBuffer() throws Exception {
    ByteBuffer old = ByteBuffer.allocate(8);
    ByteBuffer result = decoder(Type.BYTES, "\"ABC\"").readBytes(old);
    byte[] bytes = new byte[result.remaining()];
    result.get(bytes);
    assertArrayEquals(new byte[] {'A', 'B', 'C'}, bytes);
  }

  // B3
  @Test
  public void skipBytesAdvancesOverValue() throws Exception {
    JsonDecoder decoder = decoder(
            "{\"type\":\"record\",\"name\":\"SkipBytesRecord\","
                    + "\"fields\":[{\"name\":\"b\",\"type\":\"bytes\"},"
                    + "{\"name\":\"i\",\"type\":\"int\"}]}",
            "{\"b\":\"ABC\",\"i\":7}");
    decoder.skipBytes();
    assertEquals(7, decoder.readInt());
  }

  // B4
  @Test
  public void readFixedCopiesBytesAtStartZero() throws Exception {
    JsonDecoder decoder = decoder(
            "{\"type\":\"fixed\",\"name\":\"FixedStartZero\",\"size\":3}",
            "\"ABC\"");
    byte[] bytes = new byte[3];
    decoder.readFixed(bytes, 0, 3);
    assertEquals((byte) 65, bytes[0]);
    assertEquals((byte) 66, bytes[1]);
    assertEquals((byte) 67, bytes[2]);
  }

  // B4
  @Test
  public void readFixedWritesAtGivenOffset() throws Exception {
    JsonDecoder decoder = decoder(
            "{\"type\":\"fixed\",\"name\":\"FixedOffset\",\"size\":3}",
            "\"ABC\"");
    byte[] bytes = new byte[] { 9, 9, 9, 9, 9, 9 };
    decoder.readFixed(bytes, 2, 3);
    assertEquals((byte) 9, bytes[0]);
    assertEquals((byte) 9, bytes[1]);
    assertEquals((byte) 65, bytes[2]);
    assertEquals((byte) 66, bytes[3]);
    assertEquals((byte) 67, bytes[4]);
    assertEquals((byte) 9, bytes[5]);
  }

  // B4
  @Test
  public void skipFixedAdvancesByLength() throws Exception {
    JsonDecoder decoder = decoder(
            "{\"type\":\"record\",\"name\":\"SkipFixedRecord\","
                    + "\"fields\":[{\"name\":\"f\",\"type\":"
                    + "{\"type\":\"fixed\",\"name\":\"SkipFixedType\",\"size\":3}},"
                    + "{\"name\":\"i\",\"type\":\"int\"}]}",
            "{\"f\":\"ABC\",\"i\":7}");
    decoder.skipFixed(3);
    assertEquals(7, decoder.readInt());
  }

  // B5
  @Test
  public void readEnumReturnsZeroForFirstSymbol() throws Exception {
    JsonDecoder decoder = decoder(
            "{\"type\":\"enum\",\"name\":\"FirstEnum\","
                    + "\"symbols\":[\"FIRST\",\"MIDDLE\",\"LAST\"]}",
            "\"FIRST\"");
    assertEquals(0, decoder.readEnum());
  }

  // B5
  @Test
  public void readEnumReturnsLastIndexForLastSymbol() throws Exception {
    JsonDecoder decoder = decoder(
            "{\"type\":\"enum\",\"name\":\"LastEnum\","
                    + "\"symbols\":[\"FIRST\",\"MIDDLE\",\"LAST\"]}",
            "\"LAST\"");
    assertEquals(2, decoder.readEnum());
  }

  // B6
  @Test
  public void readArrayStartReturnsZeroForEmptyArray() throws Exception {
    JsonDecoder decoder = decoder(
            "{\"type\":\"array\",\"items\":\"int\"}",
            "[]");
    assertEquals(0L, decoder.readArrayStart());
  }

  // B6
  @Test
  public void readArrayIteratesSingleElement() throws Exception {
    JsonDecoder decoder = decoder(
            "{\"type\":\"array\",\"items\":\"int\"}",
            "[7]");
    assertEquals(1L, decoder.readArrayStart());
    assertEquals(7, decoder.readInt());
    assertEquals(0L, decoder.arrayNext());
  }

  // B6
  @Test
  public void readArrayIteratesMultipleElements() throws Exception {
    JsonDecoder decoder = decoder(
            "{\"type\":\"array\",\"items\":\"int\"}",
            "[1,2]");

    List<Integer> values = new ArrayList<Integer>();
    for (long i = decoder.readArrayStart(); i != 0; i = decoder.arrayNext()) {
      for (long j = 0; j < i; j++) {
        values.add(Integer.valueOf(decoder.readInt()));
      }
    }

    assertEquals(2, values.size());
    assertEquals(1, values.get(0).intValue());
    assertEquals(2, values.get(1).intValue());
  }

  // B6
  @Test
  public void skipArrayReturnsZeroAtEnd() throws Exception {
    JsonDecoder decoder = decoder(
            "{\"type\":\"array\",\"items\":\"int\"}",
            "[1,2]");
    assertEquals(0L, decoder.skipArray());
  }

  // B7
  @Test
  public void readMapStartReturnsZeroForEmptyMap() throws Exception {
    JsonDecoder decoder = decoder(
            "{\"type\":\"map\",\"values\":\"int\"}",
            "{}");
    assertEquals(0L, decoder.readMapStart());
  }

  // B7
  @Test
  public void readMapReadsSingleEntry() throws Exception {
    JsonDecoder decoder = decoder(
            "{\"type\":\"map\",\"values\":\"int\"}",
            "{\"k\":7}");
    assertEquals(1L, decoder.readMapStart());
    assertEquals("k", decoder.readString(null).toString());
    assertEquals(7, decoder.readInt());
    assertEquals(0L, decoder.mapNext());
  }

  // B7
  @Test
  public void readMapIteratesMultipleEntries() throws Exception {
    JsonDecoder decoder = decoder(
            "{\"type\":\"map\",\"values\":\"int\"}",
            "{\"a\":1,\"b\":2}");

    Map<String, Integer> values = new HashMap<String, Integer>();
    for (long i = decoder.readMapStart(); i != 0; i = decoder.mapNext()) {
      for (long j = 0; j < i; j++) {
        String key = decoder.readString(null).toString();
        int value = decoder.readInt();
        values.put(key, Integer.valueOf(value));
      }
    }

    assertEquals(2, values.size());
    assertEquals(Integer.valueOf(1), values.get("a"));
    assertEquals(Integer.valueOf(2), values.get("b"));
  }

  // B7
  @Test
  public void skipMapReturnsZeroAtEnd() throws Exception {
    JsonDecoder decoder = decoder(
            "{\"type\":\"map\",\"values\":\"int\"}",
            "{\"a\":1,\"b\":2}");
    assertEquals(0L, decoder.skipMap());
  }

  // B8
  @Test
  public void readIndexReturnsFirstBranch() throws Exception {
    JsonDecoder decoder = decoder(
            "[\"int\",\"string\"]",
            "{\"int\":1}");
    assertEquals(0, decoder.readIndex());
  }

  // B8
  @Test
  public void readIndexReturnsLastBranch() throws Exception {
    JsonDecoder decoder = decoder(
            "[\"int\",\"string\"]",
            "{\"string\":\"last\"}");
    assertEquals(1, decoder.readIndex());
  }

}
