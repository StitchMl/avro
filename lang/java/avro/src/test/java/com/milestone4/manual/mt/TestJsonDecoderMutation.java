package com.milestone4.manual.mt;

import static org.junit.Assert.*;

import java.io.ByteArrayInputStream;
import java.nio.ByteBuffer;
import java.nio.charset.StandardCharsets;

import org.apache.avro.AvroTypeException;
import org.apache.avro.Schema;
import org.apache.avro.io.DecoderFactory;
import org.apache.avro.io.JsonDecoder;
import org.junit.Test;

public class TestJsonDecoderMutation {

    @Test
    public void booleanThenIntAdvancesGrammarForEveryField()
            throws Exception {
    // Targeted mutant: JsonDecoder.readBoolean() removal of advance(Symbol.BOOLEAN).
        Schema schema = new Schema.Parser().parse(
                "{\"type\":\"record\",\"name\":\"BooleanThenInt\",\"fields\":["
                        + "{\"name\":\"flag\",\"type\":\"boolean\"},"
                + "{\"name\":\"tail\",\"type\":\"int\"}]}");

        JsonDecoder decoder = DecoderFactory.get().jsonDecoder(
                schema, "{\"flag\":true,\"tail\":17}");

        assertTrue(decoder.readBoolean());
        assertEquals(17, decoder.readInt());

    }

    @Test
    public void longThenIntAdvancesGrammarForEveryField()
            throws Exception {
    // Targeted mutant: JsonDecoder.readLong() removal of advance(Symbol.LONG).
        Schema schema = new Schema.Parser().parse(
                "{\"type\":\"record\",\"name\":\"LongThenInt\",\"fields\":["
                        + "{\"name\":\"value\",\"type\":\"long\"},"
                + "{\"name\":\"tail\",\"type\":\"int\"}]}");

        JsonDecoder decoder = DecoderFactory.get().jsonDecoder(
                schema, "{\"value\":1234567890123,\"tail\":18}");

        assertEquals(1234567890123L, decoder.readLong());
        assertEquals(18, decoder.readInt());

    }

    @Test
    public void floatThenIntAdvancesGrammarForEveryField()
            throws Exception {
    // Targeted mutant: JsonDecoder.readFloat() removal of advance(Symbol.FLOAT).
        Schema schema = new Schema.Parser().parse(
                "{\"type\":\"record\",\"name\":\"FloatThenInt\",\"fields\":["
                        + "{\"name\":\"value\",\"type\":\"float\"},"
                + "{\"name\":\"tail\",\"type\":\"int\"}]}");

        JsonDecoder decoder = DecoderFactory.get().jsonDecoder(
                schema, "{\"value\":1.25,\"tail\":19}");

        assertEquals(1.25f, decoder.readFloat(), 0.0f);
        assertEquals(19, decoder.readInt());
    }

    @Test
    public void doubleThenIntAdvancesGrammarForEveryField()
            throws Exception {
    // Targeted mutant: JsonDecoder.readDouble() removal of advance(Symbol.DOUBLE).
        Schema schema = new Schema.Parser().parse(
                "{\"type\":\"record\",\"name\":\"DoubleThenInt\",\"fields\":["
                        + "{\"name\":\"value\",\"type\":\"double\"},"
                + "{\"name\":\"tail\",\"type\":\"int\"}]}");

        JsonDecoder decoder = DecoderFactory.get().jsonDecoder(
                schema, "{\"value\":2.5,\"tail\":20}");

        assertEquals(2.5d, decoder.readDouble(), 0.0d);
        assertEquals(20, decoder.readInt());

    }

    @Test
    public void bytesThenIntAdvancesGrammarForEveryField()
            throws Exception {
    // Targeted mutant: JsonDecoder.readBytes() removal of advance(Symbol.BYTES).
        Schema schema = new Schema.Parser().parse(
                "{\"type\":\"record\",\"name\":\"BytesThenInt\",\"fields\":["
                        + "{\"name\":\"value\",\"type\":\"bytes\"},"
                        + "{\"name\":\"tail\",\"type\":\"int\"}]}");

        JsonDecoder decoder = DecoderFactory.get().jsonDecoder(
                schema, "{\"value\":\"AZ\",\"tail\":21}");

        ByteBuffer bytes = decoder.readBytes(null);

        assertEquals(2, bytes.remaining());
        assertEquals(65, bytes.get() & 0xff);
        assertEquals(90, bytes.get() & 0xff);
        assertFalse(bytes.hasRemaining());
        assertEquals(21, decoder.readInt());

    }

    @Test
    public void arrayIterationReadsEveryElementAndThenFollowingField()
            throws Exception {
    // Targeted mutant: JsonDecoder.arrayNext() removal of advance(Symbol.ITEM_END).
        Schema schema = new Schema.Parser().parse(
                "{\"type\":\"record\",\"name\":\"ArrayIterationThenInt\","
                        + "\"fields\":["
                        + "{\"name\":\"values\",\"type\":"
                        + "{\"type\":\"array\",\"items\":\"int\"}},"
                + "{\"name\":\"tail\",\"type\":\"int\"}]}");

        JsonDecoder decoder = DecoderFactory.get().jsonDecoder(
                schema, "{\"values\":[10,20,30],\"tail\":31}");

        assertEquals(1L, decoder.readArrayStart());
        assertEquals(10, decoder.readInt());

        assertEquals(1L, decoder.arrayNext());
        assertEquals(20, decoder.readInt());

        assertEquals(1L, decoder.arrayNext());
        assertEquals(30, decoder.readInt());

        assertEquals(0L, decoder.arrayNext());
        assertEquals(31, decoder.readInt());

    }

    @Test
    public void skipArrayConsumesWholeArrayAndLeavesFollowingFieldReadable()
            throws Exception {
    // Targeted mutant: JsonDecoder.skipArray() removal of ARRAY_START/ARRAY_END advance calls.
        Schema schema = new Schema.Parser().parse(
                "{\"type\":\"record\",\"name\":\"SkipArrayThenInt\","
                        + "\"fields\":["
                        + "{\"name\":\"values\",\"type\":"
                        + "{\"type\":\"array\",\"items\":\"int\"}},"
                + "{\"name\":\"tail\",\"type\":\"int\"}]}");

        JsonDecoder decoder = DecoderFactory.get().jsonDecoder(
                schema, "{\"values\":[1,2,3],\"tail\":32}");

        assertEquals(0L, decoder.skipArray());
        assertEquals(32, decoder.readInt());

    }

    @Test
    public void mapNextAdvancesToSecondEntryAndThenFollowingField()
            throws Exception {
    // Targeted mutant: JsonDecoder.mapNext() removal of advance(Symbol.ITEM_END).
        Schema schema = new Schema.Parser().parse(
                "{\"type\":\"record\",\"name\":\"MapIterationThenInt\","
                        + "\"fields\":["
                        + "{\"name\":\"values\",\"type\":"
                        + "{\"type\":\"map\",\"values\":\"int\"}},"
                + "{\"name\":\"tail\",\"type\":\"int\"}]}");

        JsonDecoder decoder = DecoderFactory.get().jsonDecoder(
                schema,
                "{\"values\":{\"first\":11,\"second\":22},\"tail\":33}");

        assertEquals(1L, decoder.readMapStart());

        assertEquals("first", decoder.readString(null).toString());
        assertEquals(11, decoder.readInt());

        assertEquals(1L, decoder.mapNext());

        assertEquals("second", decoder.readString(null).toString());
        assertEquals(22, decoder.readInt());

        assertEquals(0L, decoder.mapNext());
        assertEquals(33, decoder.readInt());

    }

    @Test
    public void skipMapConsumesWholeMapAndLeavesFollowingFieldReadable()
            throws Exception {
    // Targeted mutant: JsonDecoder.skipMap() removal of MAP_START/MAP_END advance calls.
        Schema schema = new Schema.Parser().parse(
                "{\"type\":\"record\",\"name\":\"SkipMapThenInt\","
                        + "\"fields\":["
                        + "{\"name\":\"values\",\"type\":"
                        + "{\"type\":\"map\",\"values\":\"int\"}},"
                + "{\"name\":\"tail\",\"type\":\"int\"}]}");

        JsonDecoder decoder = DecoderFactory.get().jsonDecoder(
                schema,
                "{\"values\":{\"first\":11,\"second\":22},\"tail\":34}");

        assertEquals(0L, decoder.skipMap());
        assertEquals(34, decoder.readInt());

    }

    @Test
    public void configureStringResetsMidRecordAndReturnsUsableDecoder()
            throws Exception {
    // Targeted mutant: JsonDecoder.configure(String) removal of parser.reset() or null return.
        Schema schema = new Schema.Parser().parse(
                "{\"type\":\"record\",\"name\":\"ConfigureStringRecord\","
                        + "\"fields\":["
                        + "{\"name\":\"a\",\"type\":\"int\"},"
                + "{\"name\":\"b\",\"type\":\"int\"}]}");

        JsonDecoder decoder = DecoderFactory.get().jsonDecoder(
                schema, "{\"a\":1,\"b\":2}");

        assertEquals(1, decoder.readInt());

        JsonDecoder returned =
                decoder.configure("{\"a\":10,\"b\":20}");

        assertNotNull(returned);
        assertSame(decoder, returned);
        assertEquals(10, returned.readInt());
        assertEquals(20, returned.readInt());

    }

    @Test
    public void configureInputStreamResetsMidRecordAndReturnsUsableDecoder()
            throws Exception {
    // Targeted mutant: JsonDecoder.configure(InputStream) removal of parser.reset() or null return.
        Schema schema = new Schema.Parser().parse(
                "{\"type\":\"record\",\"name\":\"ConfigureStreamRecord\","
                        + "\"fields\":["
                        + "{\"name\":\"a\",\"type\":\"int\"},"
                + "{\"name\":\"b\",\"type\":\"int\"}]}");

        ByteArrayInputStream first = new ByteArrayInputStream(
                "{\"a\":3,\"b\":4}".getBytes(StandardCharsets.UTF_8));

        JsonDecoder decoder =
                DecoderFactory.get().jsonDecoder(schema, first);

        assertEquals(3, decoder.readInt());

        ByteArrayInputStream second = new ByteArrayInputStream(
                "{\"a\":30,\"b\":40}".getBytes(StandardCharsets.UTF_8));

        JsonDecoder returned = decoder.configure(second);

        assertNotNull(returned);
        assertSame(decoder, returned);
        assertEquals(30, returned.readInt());
        assertEquals(40, returned.readInt());

    }

    @Test
    public void fixedRequestedLengthDifferentFromSchemaSizeThrowsBeforeReading()
            throws Exception {
    // Targeted mutant: JsonDecoder.checkFixed(int) removal of schema-size validation.
        Schema fixedSchema =
                Schema.createFixed("FourBytes", null, "mt", 4);

        JsonDecoder decoder =
                DecoderFactory.get().jsonDecoder(fixedSchema, "\"abc\"");

        byte[] target = new byte[3];

        try {
            decoder.readFixed(target, 0, 3);
            fail("schema size 4 with requested length 3 must throw AvroTypeException");
        } catch (AvroTypeException e) {
            assertEquals(
                    "Incorrect length for fixed binary: expected 4 but received 3 bytes.",
                    e.getMessage());
        }

    }
}