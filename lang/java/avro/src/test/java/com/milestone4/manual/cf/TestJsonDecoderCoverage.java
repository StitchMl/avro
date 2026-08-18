package com.milestone4.manual.cf;

import static org.junit.Assert.*;

import java.io.ByteArrayInputStream;
import java.io.EOFException;
import java.nio.charset.StandardCharsets;

import org.apache.avro.AvroTypeException;
import org.apache.avro.Schema;
import org.apache.avro.Schema.Type;
import org.apache.avro.io.DecoderFactory;
import org.apache.avro.io.JsonDecoder;
import org.apache.avro.util.Utf8;
import org.junit.Test;

public class TestJsonDecoderCoverage {

    // Helper: constructs a String-backed JsonDecoder for branch-specific cases.
    private static JsonDecoder decoder(Schema schema, String json) throws Exception {
        return DecoderFactory.get().jsonDecoder(schema, json);
    }

    // Covers JsonDecoder.readNull() non-conforming-token branch.
    @Test(expected = AvroTypeException.class)
    public void readNullRejectsIntegerToken() throws Exception {
        decoder(Schema.create(Type.NULL), "0").readNull();
    }

    // Covers JsonDecoder.readBoolean() non-conforming-token branch.
    @Test(expected = AvroTypeException.class)
    public void readBooleanRejectsIntegerToken() throws Exception {
        decoder(Schema.create(Type.BOOLEAN), "0").readBoolean();
    }

    // Covers JsonDecoder.readInt() non-conforming-token branch.
    @Test(expected = AvroTypeException.class)
    public void readIntRejectsFloatingToken() throws Exception {
        decoder(Schema.create(Type.INT), "1.5").readInt();
    }

    // Covers JsonDecoder.readLong() non-conforming-token branch.
    @Test(expected = AvroTypeException.class)
    public void readLongRejectsFloatingToken() throws Exception {
        decoder(Schema.create(Type.LONG), "1.5").readLong();
    }

    // Covers JsonDecoder.readFloat() non-conforming integer-token branch in Avro 1.5.4.
    @Test(expected = AvroTypeException.class)
    public void readFloatRejectsIntegerToken() throws Exception {
        decoder(Schema.create(Type.FLOAT), "1").readFloat();
    }

    // Covers JsonDecoder.readDouble() non-conforming integer-token branch in Avro 1.5.4.
    @Test(expected = AvroTypeException.class)
    public void readDoubleRejectsIntegerToken() throws Exception {
        decoder(Schema.create(Type.DOUBLE), "1").readDouble();
    }

    // Covers JsonDecoder.readBytes() non-conforming-token branch.
    @Test(expected = AvroTypeException.class)
    public void readBytesRejectsIntegerToken() throws Exception {
        decoder(Schema.create(Type.BYTES), "1").readBytes(null);
    }

    // Covers JsonDecoder.readArrayStart() non-conforming-token branch.
    @Test(expected = AvroTypeException.class)
    public void readArrayStartRejectsObjectToken() throws Exception {
        decoder(Schema.createArray(Schema.create(Type.INT)), "{}").readArrayStart();
    }

    // Covers JsonDecoder.readMapStart() non-conforming-token branch.
    @Test(expected = AvroTypeException.class)
    public void readMapStartRejectsArrayToken() throws Exception {
        decoder(Schema.createMap(Schema.create(Type.INT)), "[]").readMapStart();
    }

    // Covers JsonDecoder.readString() normal value context and old-Utf8 replacement behavior.
    @Test
    public void readStringReadsValueContext() throws Exception {
        JsonDecoder decoder = decoder(Schema.create(Type.STRING), "\"hello\"");
        Utf8 old = new Utf8("old");
        Utf8 value = decoder.readString(old);

        assertEquals("hello", value.toString());
        assertNotSame(old, value);
    }

    // Covers JsonDecoder.skipString() normal value context and configure(String) reuse path.
    @Test
    public void skipStringSkipsValueContext() throws Exception {
        JsonDecoder decoder = decoder(Schema.create(Type.STRING), "\"skip-me\"");
        decoder.skipString();

        decoder.configure("\"kept\"");
        assertEquals("kept", decoder.readString(null).toString());
    }

    // Covers JsonDecoder.readString() map-key context through MAP_KEY_MARKER.
    @Test
    public void readStringReadsMapKeyContext() throws Exception {
        JsonDecoder decoder = decoder(
                Schema.createMap(Schema.create(Type.INT)), "{\"key\":7}");

        assertEquals(1L, decoder.readMapStart());
        assertEquals("key", decoder.readString(null).toString());
        assertEquals(7, decoder.readInt());
        assertEquals(0L, decoder.mapNext());
    }

    // Covers JsonDecoder.skipString() map-key context through MAP_KEY_MARKER.
    @Test
    public void skipStringSkipsMapKeyContext() throws Exception {
        JsonDecoder decoder = decoder(
                Schema.createMap(Schema.create(Type.INT)), "{\"ignored\":9}");

        assertEquals(1L, decoder.readMapStart());
        decoder.skipString();
        assertEquals(9, decoder.readInt());
        assertEquals(0L, decoder.mapNext());

    }

    // Covers JsonDecoder.readString() non-conforming-token branch.
    @Test(expected = AvroTypeException.class)
    public void readStringRejectsIntegerToken() throws Exception {
        decoder(Schema.create(Type.STRING), "1").readString(null);
    }

    // Covers JsonDecoder.skipString() non-conforming-token branch.
    @Test(expected = AvroTypeException.class)
    public void skipStringRejectsIntegerToken() throws Exception {
        decoder(Schema.create(Type.STRING), "1").skipString();
    }

    // Covers JsonDecoder.readFixed() correct schema length and encoded byte length.
    @Test
    public void readFixedCopiesCorrectLengthAtRequestedOffset() throws Exception {
        Schema schema = Schema.createFixed("ReadFixed3", null, null, 3);
        JsonDecoder decoder = decoder(schema, "\"abc\"");
        byte[] destination = new byte[] {9, 9, 9, 9, 9};

        decoder.readFixed(destination, 1, 3);

        assertArrayEquals(new byte[] {9, 'a', 'b', 'c', 9}, destination);

    }

    // Covers JsonDecoder.readFixed() checkFixed() wrong requested-length branch.
    @Test(expected = AvroTypeException.class)
    public void readFixedRejectsRequestedLengthDifferentFromSchema() throws Exception {
        Schema schema = Schema.createFixed("ReadFixedRequest3", null, null, 3);
        decoder(schema, "\"abc\"").readFixed(new byte[2], 0, 2);
    }

    // Covers JsonDecoder.readFixed() wrong encoded-string byte-length branch.
    @Test(expected = AvroTypeException.class)
    public void readFixedRejectsEncodedValueWithWrongLength() throws Exception {
        Schema schema = Schema.createFixed("ReadFixedValue3", null, null, 3);
        decoder(schema, "\"ab\"").readFixed(new byte[3], 0, 3);
    }

    // Covers JsonDecoder.skipFixed(int) correct length and continuation to the following record field.
    @Test
    public void skipFixedSkipsCorrectLengthAndContinuesRecord() throws Exception {
        Schema schema = new Schema.Parser().parse(
                "{\"type\":\"record\",\"name\":\"SkipFixedRecord\","
                        + "\"fields\":[{\"name\":\"f\",\"type\":{\"type\":\"fixed\","
                        + "\"name\":\"SkipF3\",\"size\":3}},{\"name\":\"n\",\"type\":\"int\"}]}");
        JsonDecoder decoder = decoder(schema, "{\"f\":\"abc\",\"n\":7}");

        decoder.skipFixed(3);
        assertEquals(7, decoder.readInt());

    }

    // Covers JsonDecoder.skipFixed(int) checkFixed() wrong requested-length branch.
    @Test(expected = AvroTypeException.class)
    public void skipFixedRejectsRequestedLengthDifferentFromSchema() throws Exception {
        Schema schema = Schema.createFixed("SkipFixedRequest3", null, null, 3);
        decoder(schema, "\"abc\"").skipFixed(2);
    }

    // Covers JsonDecoder.skipFixed(int) wrong encoded-string byte-length branch.
    @Test(expected = AvroTypeException.class)
    public void skipFixedRejectsEncodedValueWithWrongLength() throws Exception {
        Schema schema = Schema.createFixed("SkipFixedValue3", null, null, 3);
        decoder(schema, "\"ab\"").skipFixed(3);
    }

    // Covers JsonDecoder.readEnum() valid-symbol branch.
    @Test
    public void readEnumReturnsOrdinalForKnownSymbol() throws Exception {
        Schema schema = Schema.createEnum(
                "ReadEnum", null, null, java.util.Arrays.asList("A", "B", "C"));

        assertEquals(1, decoder(schema, "\"B\"").readEnum());

    }

    // Covers JsonDecoder.readEnum() unknown-symbol branch.
    @Test(expected = AvroTypeException.class)
    public void readEnumRejectsUnknownSymbol() throws Exception {
        Schema schema = Schema.createEnum(
                "UnknownEnum", null, null, java.util.Arrays.asList("A", "B"));
        decoder(schema, "\"Z\"").readEnum();
    }

    // Covers JsonDecoder.readEnum() wrong-token branch.
    @Test(expected = AvroTypeException.class)
    public void readEnumRejectsNonStringToken() throws Exception {
        Schema schema = Schema.createEnum(
                "WrongTokenEnum", null, null, java.util.Arrays.asList("A", "B"));
        decoder(schema, "1").readEnum();
    }

    // Covers JsonDecoder.readIndex() null-union branch.
    @Test
    public void readIndexSelectsNullUnionBranch() throws Exception {
        Schema schema = new Schema.Parser().parse("[\"null\",\"string\"]");
        JsonDecoder decoder = decoder(schema, "null");

        assertEquals(0, decoder.readIndex());
        decoder.readNull();

    }

    // Covers JsonDecoder.readIndex() named-branch wrapper and trailing record/union actions.
    @Test
    public void readIndexSelectsNamedRecordUnionBranch() throws Exception {
        Schema schema = new Schema.Parser().parse(
                "[\"null\",{\"type\":\"record\",\"name\":\"NamedBranch\","
                + "\"fields\":[{\"name\":\"x\",\"type\":\"int\"}]}]");
        JsonDecoder decoder = decoder(schema, "{\"NamedBranch\":{\"x\":5}}");

        assertEquals(1, decoder.readIndex());
        assertEquals(5, decoder.readInt());
        try {
            decoder.readNull();
            fail("Expected EOF after named union branch");
        } catch (EOFException expected) {
            assertNull(expected.getMessage());
        }

    }

    // Covers JsonDecoder.readIndex() invalid start-union token branch.
    @Test(expected = AvroTypeException.class)
    public void readIndexRejectsInvalidUnionStartToken() throws Exception {
        Schema schema = new Schema.Parser().parse("[\"null\",\"string\"]");
        decoder(schema, "42").readIndex();
    }

    // Covers JsonDecoder.readIndex() unknown branch-label branch.
    @Test(expected = AvroTypeException.class)
    public void readIndexRejectsUnknownUnionBranchLabel() throws Exception {
        Schema schema = new Schema.Parser().parse("[\"null\",\"string\"]");
        decoder(schema, "{\"bogus\":\"x\"}").readIndex();
    }

    // Covers JsonDecoder.doAction() RECORD_START, FieldAdjustAction, RECORD_END, UNION_END, enum, and union decoding.
    @Test
    public void actionHandlerDecodesRecordFieldsEnumAndUnion() throws Exception {
        Schema schema = new Schema.Parser().parse(
                "{\"type\":\"record\",\"name\":\"ActionRecord\",\"fields\":["
                        + "{\"name\":\"i\",\"type\":\"int\"},"
                + "{\"name\":\"s\",\"type\":\"string\"},"
                + "{\"name\":\"e\",\"type\":{\"type\":\"enum\",\"name\":\"ActionEnum\","
                + "\"symbols\":[\"A\",\"B\"]}},"
                + "{\"name\":\"u\",\"type\":[\"null\",\"string\"]}]}");
        JsonDecoder decoder = decoder(
                schema,
                "{\"i\":4,\"s\":\"text\",\"e\":\"B\","
                        + "\"u\":{\"string\":\"branch\"}}");

        assertEquals(4, decoder.readInt());
        assertEquals("text", decoder.readString(null).toString());
        assertEquals(1, decoder.readEnum());
        assertEquals(1, decoder.readIndex());
        assertEquals("branch", decoder.readString(null).toString());

        try {
            decoder.readNull();
            fail("Expected EOF after complete record");
        } catch (EOFException expected) {
            assertNull(expected.getMessage());
        }
    }

    // Covers JsonDecoder.doAction() FieldAdjustAction wrong-field-name branch.
    @Test(expected = AvroTypeException.class)
    public void actionHandlerRejectsUnexpectedRecordFieldName() throws Exception {
        Schema schema = new Schema.Parser().parse(
                "{\"type\":\"record\",\"name\":\"WrongFieldRecord\","
                        + "\"fields\":[{\"name\":\"i\",\"type\":\"int\"},"
                + "{\"name\":\"s\",\"type\":\"string\"}]}");
        decoder(schema, "{\"s\":\"wrong first\",\"i\":1}").readInt();
    }

    // Covers JsonDecoder.doAction() RECORD_START wrong-token branch.
    @Test(expected = AvroTypeException.class)
    public void actionHandlerRejectsNonObjectRecordStart() throws Exception {
        Schema schema = new Schema.Parser().parse(
                "{\"type\":\"record\",\"name\":\"WrongStartRecord\","
                        + "\"fields\":[{\"name\":\"i\",\"type\":\"int\"}]}");
        decoder(schema, "[]").readInt();
    }

    // Covers JsonDecoder.doAction() RECORD_END wrong-token branch caused by an extra field.
    @Test(expected = AvroTypeException.class)
    public void actionHandlerRejectsExtraRecordFieldAtRecordEnd() throws Exception {
        Schema schema = new Schema.Parser().parse(
                "{\"type\":\"record\",\"name\":\"ExtraFieldRecord\","
                        + "\"fields\":[{\"name\":\"i\",\"type\":\"int\"}]}");
        JsonDecoder decoder = decoder(schema, "{\"i\":1,\"extra\":2}");

        assertEquals(1, decoder.readInt());
        decoder.readNull();

    }

    // Covers DecoderFactory.jsonDecoder(Schema, InputStream) and JsonDecoder.configure(InputStream).
    @Test
    public void inputStreamDecoderCanBeBuiltAndReconfigured() throws Exception {
        Schema schema = Schema.create(Type.INT);
        JsonDecoder decoder = DecoderFactory.get().jsonDecoder(
                schema, new ByteArrayInputStream("11".getBytes(StandardCharsets.UTF_8)));
        assertEquals(11, decoder.readInt());

        decoder.configure(new ByteArrayInputStream("12".getBytes(StandardCharsets.UTF_8)));
        assertEquals(12, decoder.readInt());

    }
}