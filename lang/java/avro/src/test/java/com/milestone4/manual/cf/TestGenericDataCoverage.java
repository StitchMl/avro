package com.milestone4.manual.cf;

import static org.junit.Assert.*;

import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

import org.apache.avro.AvroRuntimeException;
import org.apache.avro.AvroTypeException;
import org.apache.avro.Schema;
import org.apache.avro.Schema.Type;
import org.apache.avro.UnresolvedUnionException;
import org.apache.avro.generic.GenericData;
import org.apache.avro.generic.GenericData.Array;
import org.apache.avro.generic.GenericData.EnumSymbol;
import org.junit.Test;

public class TestGenericDataCoverage {

    // Helper: builds a two-field record schema used by Record coverage cases.
    private static Schema recordSchema(String name) {
        return new Schema.Parser().parse("{\"type\":\"record\",\"name\":\"" + name
                + "\",\"fields\":[{\"name\":\"id\",\"type\":\"int\"},"
                + "{\"name\":\"name\",\"type\":\"string\"}]}");
    }

    // Helper: builds a populated GenericData.Record for value-semantics coverage.
    private static GenericData.Record record(Schema schema, int id, String name) {
        GenericData.Record record = new GenericData.Record(schema);
        record.put("id", id);
        record.put(1, name);
        return record;
    }

    private static final class ExposedFixed extends GenericData.Fixed {
        // Helper: exposes the protected Fixed() constructor for setSchema coverage.
        ExposedFixed() {
            super();
        }

        // Helper: exposes protected GenericData.Fixed.setSchema(Schema).
        void assignSchema(Schema schema) {
            setSchema(schema);
        }

    }

    // Covers GenericData.Record constructor, schema access, named/indexed put/get, equals, hashCode, compareTo, and toString.
    @Test
    public void recordSupportsIndexedAndNamedAccessAndValueSemantics() {
        Schema schema = recordSchema("RecordA");
        GenericData.Record left = record(schema, 7, "A");
        GenericData.Record equal = record(schema, 7, "A");
        GenericData.Record differentValue = record(schema, 8, "A");
        GenericData.Record differentSchema = record(recordSchema("RecordB"), 7, "A");

        assertSame(schema, left.getSchema());
        assertEquals(7, left.get("id"));
        assertEquals("A", left.get(1));
        assertNull(left.get("missing"));

        Object notARecord = "not a record";
        assertEquals(equal, left);
        assertFalse(left.equals(notARecord));
        assertNotEquals(differentSchema, left);
        assertNotEquals(differentValue, left);
        assertEquals(1243, left.hashCode());
        assertEquals(0, left.compareTo(equal));
        assertEquals(-1, left.compareTo(differentValue));
        assertEquals("{\"id\": 7, \"name\": \"A\"}", left.toString());

    }

    // Covers GenericData.Record constructor rejection of a non-record schema.
    @Test(expected = AvroRuntimeException.class)
    public void recordConstructorRejectsNonRecordSchema() {
        new GenericData.Record(Schema.create(Type.INT));
    }

    // Covers GenericData.Array constructor and add() backing-array resize branch.
    @Test
    public void arrayAddsPastInitialCapacityAndProvidesIndexedAccess() {
        Schema schema = Schema.createArray(Schema.create(Type.INT));
        Array<Integer> array = new Array<>(1, schema);

        assertSame(schema, array.getSchema());
        assertTrue(array.add(10));
        assertTrue(array.add(20));
        assertTrue(array.add(30));
        assertEquals(3, array.size());
        assertEquals(Integer.valueOf(10), array.get(0));
        assertEquals(Integer.valueOf(30), array.get(2));
        assertNull(array.peek());

    }

    // Covers GenericData.Array constructor rejection of a non-array schema.
    @Test(expected = AvroRuntimeException.class)
    public void arrayConstructorRejectsNonArraySchema() {
        new Array<Integer>(1, Schema.create(Type.INT));
    }

    // Covers GenericData.Array get() out-of-bounds branch.
    @Test(expected = IndexOutOfBoundsException.class)
    public void arrayGetRejectsIndexAtSize() {
        Array<Integer> array = new Array<>(1,
                Schema.createArray(Schema.create(Type.INT)));
        array.add(1);
        array.get(1);
    }

    // Covers GenericData.Array set(), remove(), size(), peek(), and toString().
    @Test
    public void arraySetAndRemoveReturnPreviousValuesAndShiftElements() {
        Array<Integer> array = new Array<>(3,
                Schema.createArray(Schema.create(Type.INT)));
        array.add(1);
        array.add(2);
        array.add(3);

        assertEquals(Integer.valueOf(2), array.set(1, 9));
        assertEquals("[1, 9, 3]", array.toString());
        assertEquals(Integer.valueOf(9), array.remove(1));
        assertEquals(2, array.size());
        assertEquals(Integer.valueOf(3), array.get(1));
        assertNull(array.peek());

    }

    // Covers GenericData.Array clear() and retained-backing-storage behavior observed through peek().
    @Test
    public void arrayClearResetsSizeWhilePeekSeesRetainedFirstElement() {
        Array<String> array = new Array<>(2,
                Schema.createArray(Schema.create(Type.STRING)));
        array.add("old");
        array.add("value");

        array.clear();

        assertEquals(0, array.size());
        assertEquals("old", array.peek());

    }

    // Covers GenericData.Array iterator() hasNext()/next() true and false paths.
    @Test
    public void arrayIteratorVisitsAllLogicalElements() {
        Array<Integer> array = new Array<>(2,
                Schema.createArray(Schema.create(Type.INT)));
        array.add(4);
        array.add(5);

        Iterator<Integer> iterator = array.iterator();
        assertTrue(iterator.hasNext());
        assertEquals(Integer.valueOf(4), iterator.next());
        assertTrue(iterator.hasNext());
        assertEquals(Integer.valueOf(5), iterator.next());
        assertFalse(iterator.hasNext());

    }

    // Covers GenericData.Array reverse() when logical size equals backing capacity.
    @Test
    public void arrayReverseReversesElementsWhenBackingArrayIsFull() {
        Array<Integer> array = new Array<>(3,
                Schema.createArray(Schema.create(Type.INT)));
        array.add(1);
        array.add(2);
        array.add(3);

        array.reverse();

        assertEquals(Integer.valueOf(3), array.get(0));
        assertEquals(Integer.valueOf(2), array.get(1));
        assertEquals(Integer.valueOf(1), array.get(2));
        assertEquals("[3, 2, 1]", array.toString());

    }

    // Covers GenericData.Array equals(), compareTo(), and schema/value mismatch branches.
    @Test
    public void arrayEqualityAndComparisonUseSchemaAndLexicographicValues() {
        Schema intArray = Schema.createArray(Schema.create(Type.INT));
        Schema longArray = Schema.createArray(Schema.create(Type.LONG));
        Array<Integer> left = new Array<>(2, intArray);
        Array<Integer> equal = new Array<>(2, intArray);
        Array<Integer> greater = new Array<>(2, intArray);
        Array<Long> differentSchema = new Array<>(2, longArray);

        left.add(1);
        left.add(2);
        equal.add(1);
        equal.add(2);
        greater.add(1);
        greater.add(3);
        differentSchema.add(1L);
        differentSchema.add(2L);

        Object plainList = Arrays.asList(1, 2);
        assertEquals(equal, left);
        assertFalse(left.equals(plainList));
        assertFalse(left.equals(differentSchema));
        assertNotEquals(greater, left);
        assertEquals(0, left.compareTo(equal));
        assertEquals(-1, left.compareTo(greater));

    }

    // Covers GenericData.Fixed constructors, setSchema(), bytes get/set, equals, hashCode, compareTo, and toString.
    @Test
    public void fixedSupportsSchemaAssignmentBytesAndValueSemantics() {
        Schema schema = Schema.createFixed("F3", null, null, 3);
        GenericData.Fixed zeroed = new GenericData.Fixed(schema);
        assertSame(schema, zeroed.getSchema());
        assertArrayEquals(new byte[] {0, 0, 0}, zeroed.bytes());

        ExposedFixed exposed = new ExposedFixed();
        exposed.assignSchema(schema);
        assertSame(schema, exposed.getSchema());
        assertArrayEquals(new byte[] {0, 0, 0}, exposed.bytes());

        byte[] firstBytes = new byte[] {1, 2, 3};
        GenericData.Fixed first = new GenericData.Fixed(schema, firstBytes);
        assertSame(firstBytes, first.bytes());

        byte[] replacement = new byte[] {1, 2, 3};
        first.bytes(replacement);
        assertSame(replacement, first.bytes());

        GenericData.Fixed equal = new GenericData.Fixed(
                Schema.createFixed("OtherF3", null, null, 3), new byte[] {1, 2, 3});
        GenericData.Fixed greater = new GenericData.Fixed(schema, new byte[] {1, 2, 4});

        Object notFixed = "not fixed";
        assertEquals(equal, first);
        assertFalse(first.equals(notFixed));
        assertEquals(30817, first.hashCode());
        assertEquals(-1, first.compareTo(greater));
        assertEquals("[1, 2, 3]", first.toString());

    }

    // Covers GenericData.EnumSymbol constructor, getSchema(), equals(), hashCode(), and toString().
    @Test
    public void enumSymbolUsesSymbolTextForValueSemantics() {
        Schema schema = Schema.createEnum("Choice", null, null,
                Arrays.asList("A", "B"));
        EnumSymbol first = new EnumSymbol(schema, "A");
        EnumSymbol sameTextDifferentSchema = new EnumSymbol(
                Schema.createEnum("OtherChoice", null, null, Arrays.asList("A", "C")), "A");

        assertSame(schema, first.getSchema());
        Object notEnum = "A";
        assertEquals(sameTextDifferentSchema, first);
        assertFalse(first.equals(notEnum));
        assertEquals(65, first.hashCode());
        assertEquals("A", first.toString());

    }

    // Covers GenericData.validate() array valid, non-collection, and invalid-element branches.
    @Test
    public void validateArrayAcceptsMatchingCollectionAndRejectsInvalidData() {
        Schema schema = Schema.createArray(Schema.create(Type.INT));
        assertTrue(GenericData.get().validate(schema,
                Arrays.asList(1, 2)));
        assertFalse(GenericData.get().validate(schema, "not a collection"));
        assertFalse(GenericData.get().validate(schema,
                Arrays.<Object>asList(1, "bad")));
    }

    // Covers GenericData.validate() map valid, non-map, and invalid-value branches.
    @Test
    public void validateMapAcceptsMatchingValuesAndRejectsInvalidData() {
        Schema schema = Schema.createMap(Schema.create(Type.LONG));
        Map<String, Object> valid = new LinkedHashMap<>();
        valid.put("x", 1L);
        Map<String, Object> invalid = new LinkedHashMap<>();
        invalid.put("x", 1);

        assertTrue(GenericData.get().validate(schema, valid));
        assertFalse(GenericData.get().validate(schema, Collections.singletonList(1L)));
        assertFalse(GenericData.get().validate(schema, invalid));

    }

    // Covers GenericData.validate() record valid, non-record, and invalid-field branches.
    @Test
    public void validateRecordChecksIndexedRecordFieldValues() {
        Schema schema = new Schema.Parser().parse("{\"type\":\"record\",\"name\":\"ValidateRecord\","
                + "\"fields\":[{\"name\":\"n\",\"type\":\"int\"}]}");
        GenericData.Record valid = new GenericData.Record(schema);
        valid.put(0, 4);
        GenericData.Record invalid = new GenericData.Record(schema);
        invalid.put(0, "bad");

        assertTrue(GenericData.get().validate(schema, valid));
        assertFalse(GenericData.get().validate(schema, "not a record"));
        assertFalse(GenericData.get().validate(schema, invalid));

    }

    // Covers GenericData.validate() union matching and no-matching-branch paths.
    @Test
    public void validateUnionAcceptsAnyMatchingBranchAndRejectsUnmatchedDatum() {
        Schema schema = new Schema.Parser().parse("[\"null\",\"int\",\"string\"]");
        assertTrue(GenericData.get().validate(schema, null));
        assertTrue(GenericData.get().validate(schema, 3));
        assertTrue(GenericData.get().validate(schema, "x"));
        assertFalse(GenericData.get().validate(schema, Boolean.TRUE));
    }

    // Covers GenericData.validate() enum valid and unknown-symbol branches.
    @Test
    public void validateEnumUsesSchemaSymbolMembership() {
        Schema schema = Schema.createEnum("ValidateEnum", null, null,
                Arrays.asList("A", "B"));
        assertTrue(GenericData.get().validate(schema, new EnumSymbol(schema, "A")));
        assertFalse(GenericData.get().validate(schema, new EnumSymbol(schema, "Z")));
    }

    // Covers GenericData.validate() fixed valid and wrong-byte-length branches.
    @Test
    public void validateFixedUsesFixedByteLength() {
        Schema schema = Schema.createFixed("ValidateFixed", null, null, 4);
        assertTrue(GenericData.get().validate(schema,
                new GenericData.Fixed(schema, new byte[] {1, 2, 3, 4})));
        assertFalse(GenericData.get().validate(schema,
                new GenericData.Fixed(schema, new byte[] {1, 2})));
        assertFalse(GenericData.get().validate(schema,
                ByteBuffer.wrap(new byte[] {1, 2, 3, 4})));
    }

    // Covers GenericData.induce() for String, numeric wrappers, Boolean, ByteBuffer, List, Map, Record, Fixed, and null.
    @Test
    public void induceRecognizesAllSupportedAvro154DatumKinds() {
        GenericData data = GenericData.get();

        assertEquals(Type.STRING, data.induce("x").getType());
        assertEquals(Type.INT, data.induce(1).getType());
        assertEquals(Type.LONG, data.induce(2L).getType());
        assertEquals(Type.FLOAT, data.induce(3.0f).getType());
        assertEquals(Type.DOUBLE, data.induce(4.0d).getType());
        assertEquals(Type.BOOLEAN, data.induce(Boolean.TRUE).getType());
        assertEquals(Type.BYTES, data.induce(ByteBuffer.wrap(new byte[] {1})).getType());

        Schema listSchema = data.induce(
                Arrays.asList(1, 2));
        assertEquals(Type.ARRAY, listSchema.getType());
        assertEquals(Type.INT, listSchema.getElementType().getType());

        Map<String, Long> map = new LinkedHashMap<>();
        map.put("a", 1L);
        map.put("b", 2L);
        Schema mapSchema = data.induce(map);
        assertEquals(Type.MAP, mapSchema.getType());
        assertEquals(Type.LONG, mapSchema.getValueType().getType());

        Schema recordSchema = recordSchema("InducedRecord");
        GenericData.Record record = record(recordSchema, 1, "x");
        assertSame(recordSchema, data.induce(record));

        GenericData.Fixed fixed = new GenericData.Fixed(
                Schema.createFixed("InducedFixedSource", null, null, 2),
                new byte[] {1, 2});
        Schema fixedSchema = data.induce(fixed);
        assertEquals(Type.FIXED, fixedSchema.getType());
        assertEquals(2, fixedSchema.getFixedSize());
        assertNull(fixedSchema.getFullName());

        assertEquals(Type.NULL, data.induce(null).getType());

    }

    // Covers GenericData.induce() unsupported EnumSymbol fall-through in Avro 1.5.4.
    @Test(expected = AvroTypeException.class)
    public void induceRejectsEnumSymbolInAvro154() {
        Schema schema = Schema.createEnum("InduceEnum", null, null,
                Arrays.asList("A", "B"));
        GenericData.get().induce(new EnumSymbol(schema, "A"));
    }

    // Covers GenericData.induce() empty-collection error branch.
    @Test(expected = AvroTypeException.class)
    public void induceRejectsEmptyCollection() {
        GenericData.get().induce(Collections.emptyList());
    }

    // Covers GenericData.induce() mixed-element-type collection error branch.
    @Test(expected = AvroTypeException.class)
    public void induceRejectsMixedTypeCollection() {
        List<Object> mixed = new ArrayList<>();
        mixed.add(1);
        mixed.add("two");
        GenericData.get().induce(mixed);
    }

    // Covers GenericData.compare()/hashCode() record ASCENDING, DESCENDING, and IGNORE order branches.
    @Test
    public void compareAndHashRecordRespectAscendingDescendingAndIgnoreOrders() {
        Schema schema = new Schema.Parser().parse(
                "{\"type\":\"record\",\"name\":\"OrderedRecord\","
                        + "\"fields\":["
                        + "{\"name\":\"asc\",\"type\":\"int\",\"order\":\"ascending\"},"
                + "{\"name\":\"desc\",\"type\":\"int\",\"order\":\"descending\"},"
                + "{\"name\":\"ignored\",\"type\":\"int\",\"order\":\"ignore\"}]}");
        GenericData data = GenericData.get();

        GenericData.Record base = new GenericData.Record(schema);
        base.put(0, 1);
        base.put(1, 2);
        base.put(2, 100);

        GenericData.Record ascGreater = new GenericData.Record(schema);
        ascGreater.put(0, 2);
        ascGreater.put(1, 2);
        ascGreater.put(2, 100);

        GenericData.Record descGreaterNaturally = new GenericData.Record(schema);
        descGreaterNaturally.put(0, 1);
        descGreaterNaturally.put(1, 3);
        descGreaterNaturally.put(2, 100);

        GenericData.Record ignoredDifferent = new GenericData.Record(schema);
        ignoredDifferent.put(0, 1);
        ignoredDifferent.put(1, 2);
        ignoredDifferent.put(2, 999);

        assertEquals(-1, data.compare(base, ascGreater, schema));
        assertEquals(1, data.compare(base, descGreaterNaturally, schema));
        assertEquals(0, data.compare(base, ignoredDifferent, schema));
        assertEquals(994, data.hashCode(base, schema));
        assertEquals(994, data.hashCode(ignoredDifferent, schema));

    }

    // Covers GenericData.compare()/hashCode() array element and length branches.
    @Test
    public void compareAndHashArraysAreLexicographic() {
        Schema schema = Schema.createArray(Schema.create(Type.INT));
        GenericData data = GenericData.get();
        List<Integer> left = Arrays.asList(1, 2);
        List<Integer> greaterElement =
                Arrays.asList(1, 3);
        List<Integer> longer =
                Arrays.asList(1, 2, 0);

        assertEquals(-1, data.compare(left, greaterElement, schema));
        assertEquals(-1, data.compare(left, longer, schema));
        assertEquals(0, data.compare(left,
                Arrays.asList(1, 2), schema));
        assertEquals(994, data.hashCode(left, schema));

    }

    // Covers GenericData.compare()/hashCode() union branch-index and same-branch paths.
    @Test
    public void compareAndHashUnionsUseResolvedBranchThenBranchValue() {
        Schema schema = new Schema.Parser().parse("[\"null\",\"int\",\"string\"]");
        GenericData data = GenericData.get();

        assertEquals(0, data.compare(null, null, schema));
        assertEquals(-1, data.compare(null, 1, schema));
        assertEquals(-1, data.compare(1, "a", schema));
        assertEquals(-1, data.compare(1, 2, schema));
        assertEquals(0, data.hashCode(null, schema));
        assertEquals(7, data.hashCode(7, schema));
        assertEquals(97, data.hashCode("a", schema));

    }

    // Covers GenericData.resolveUnion() failure reached from union hashCode().
    @Test(expected = UnresolvedUnionException.class)
    public void unionHashCodeRejectsDatumMatchingNoBranch() {
        Schema schema = new Schema.Parser().parse("[\"int\",\"string\"]");
        GenericData.get().hashCode(Boolean.TRUE, schema);
    }

    // Covers GenericData.toString() escaping for quote, backslash, named controls, and slash.
    @Test
    public void toStringEscapesQuotesBackslashesControlCharactersAndSlash() {
        String input = "\"" + "\\" + "\b" + "\f" + "\n" + "\r" + "\t" + "/";
        String out = GenericData.get().toString(input);

        // JSON quotato con i caratteri speciali escapati (formato Avro 1.5.4).
        assertTrue(out.startsWith("\"") && out.endsWith("\""));
        assertTrue(out.contains("\\\""));  // virgoletta escapata
        assertTrue(out.contains("\\\\"));  // backslash escapato
        assertTrue(out.contains("\\b"));
        assertTrue(out.contains("\\f"));
        assertTrue(out.contains("\\n"));
        assertTrue(out.contains("\\r"));
        assertTrue(out.contains("\\t"));
        assertTrue(out.contains("/"));     // lo slash NON viene escapato in 1.5.4
    }

// Covers GenericData.toString() Avro-1.5.4 fallback branch for other control characters.
@Test
public void toStringExercisesAvro154FallbackForOtherControlCharacters() {
    // Il carattere di controllo U+0001 attraversa il ramo di escaping "altri caratteri".
    // Il formato esatto è implementation-specific: verifichiamo solo che la chiamata
    // vada a buon fine (test orientato alla copertura del ramo).
    String out = GenericData.get().toString(Character.toString((char) 1));
    assertNotNull(out);
    assertTrue(out.startsWith("\"") && out.endsWith("\""));
}

// Covers GenericData.toString() nested records, arrays, maps, and ByteBuffer rendering.
@Test
public void toStringRendersNestedRecordsArraysMapsAndBytes() {
Schema schema = new Schema.Parser().parse(
    "{\"type\":\"record\",\"name\":\"Outer\",\"fields\":["
    + "{\"name\":\"text\",\"type\":\"string\"},"
    + "{\"name\":\"inner\",\"type\":{\"type\":\"record\",\"name\":\"Inner\","
    + "\"fields\":[{\"name\":\"v\",\"type\":\"string\"}]}},"
    + "{\"name\":\"items\",\"type\":{\"type\":\"array\",\"items\":\"int\"}},"
    + "{\"name\":\"map\",\"type\":{\"type\":\"map\",\"values\":\"string\"}},"
    + "{\"name\":\"bytes\",\"type\":\"bytes\"}]}");
    Schema innerSchema = schema.getField("inner").schema();
    GenericData.Record inner = new GenericData.Record(innerSchema);
    inner.put("v", "x");

    Map<String, String> map = new LinkedHashMap<>();
    map.put("k", "v");

    ByteBuffer bytes = ByteBuffer.wrap(new byte[] {'X', 'A', 'B'});
    bytes.position(1);

    GenericData.Record outer = new GenericData.Record(schema);
    outer.put("text", "hello");
    outer.put("inner", inner);
    outer.put("items", Arrays.asList(1, 2));
    outer.put("map", map);
    outer.put("bytes", bytes);

    assertEquals(
        "{\"text\": \"hello\", \"inner\": {\"v\": \"x\"}, "
        + "\"items\": [1, 2], \"map\": {\"k\": \"v\"}, "
        + "\"bytes\": {\"bytes\": \"AB\"}}",
        GenericData.get().toString(outer));
    assertEquals(1, bytes.position());

}
}