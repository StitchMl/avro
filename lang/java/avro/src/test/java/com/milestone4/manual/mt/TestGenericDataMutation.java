package com.milestone4.manual.mt;

import static org.junit.Assert.*;

import java.util.Arrays;

import org.apache.avro.Schema;
import org.apache.avro.Schema.Type;
import org.apache.avro.generic.GenericData;
import org.junit.Test;

public class TestGenericDataMutation {

    @Test
    public void arrayGetAcceptsLastValidIndexAndRejectsSizeIndex() {
    // Targeted mutant: GenericData.Array.get(int) boundary check changed/removed.
        Schema schema = Schema.createArray(Schema.create(Type.INT));
        GenericData.Array<Integer> array =
                new GenericData.Array<>(3, schema);
        array.add(10);
        array.add(20);

        assertEquals(Integer.valueOf(20), array.get(1));

        try {
            array.get(2);
            fail("get(size) must throw IndexOutOfBoundsException");
        } catch (IndexOutOfBoundsException e) {
            assertEquals("Index 2 out of bounds.", e.getMessage());
        }

        assertEquals(2, array.size());
        assertEquals(Integer.valueOf(10), array.get(0));
        assertEquals(Integer.valueOf(20), array.get(1));
    }

    @Test
    public void arraySetAcceptsLastValidIndexAndRejectsSizeIndex() {
    // Targeted mutant: GenericData.Array.set(int,T) boundary check changed/removed.
        Schema schema = Schema.createArray(Schema.create(Type.INT));
        GenericData.Array<Integer> array =
                new GenericData.Array<>(3, schema);
        array.add(10);
        array.add(20);

        assertEquals(Integer.valueOf(20),
                array.set(1, 99));
        assertEquals(Integer.valueOf(99), array.get(1));

        try {
            array.set(2, 77);
            fail("set(size, value) must throw IndexOutOfBoundsException");
        } catch (IndexOutOfBoundsException e) {
            assertEquals("Index 2 out of bounds.", e.getMessage());
        }

        assertEquals(2, array.size());
        assertEquals(Integer.valueOf(10), array.get(0));
        assertEquals(Integer.valueOf(99), array.get(1));
    }

    @Test
    public void arrayRemoveRejectsSizeWithoutMutationAndRemovesLastValidIndex() {
    // Targeted mutant: GenericData.Array.remove(int) boundary check changed/removed.
        Schema schema = Schema.createArray(Schema.create(Type.INT));
        GenericData.Array<Integer> array =
                new GenericData.Array<>(4, schema);
        array.add(10);
        array.add(20);
        array.add(30);

        try {
            array.remove(3);
            fail("remove(size) must throw IndexOutOfBoundsException");
        } catch (IndexOutOfBoundsException e) {
            assertEquals("Index 3 out of bounds.", e.getMessage());
        }

        assertEquals(3, array.size());
        assertEquals(Integer.valueOf(10), array.get(0));
        assertEquals(Integer.valueOf(20), array.get(1));
        assertEquals(Integer.valueOf(30), array.get(2));

        assertEquals(Integer.valueOf(30), array.remove(2));
        assertEquals(2, array.size());
        assertEquals(Integer.valueOf(10), array.get(0));
        assertEquals(Integer.valueOf(20), array.get(1));
    }

    @Test
    public void arrayPeekReturnsReusableElementBelowCapacityAndNullAtCapacity() {
    // Targeted mutant: GenericData.Array.peek() size/capacity condition changed.
        Schema schema = Schema.createArray(Schema.create(Type.INT));
        GenericData.Array<Integer> array =
                new GenericData.Array<>(2, schema);
        array.add(10);
        array.add(20);

        assertEquals(2, array.size());
        assertNull(array.peek());

        array.clear();
        assertEquals(0, array.size());
        assertEquals(Integer.valueOf(10), array.peek());

        array.add(30);
        assertEquals(1, array.size());
        assertEquals(Integer.valueOf(20), array.peek());
    }

    @Test
    public void arrayReverseProducesExactReverseOrder() {
    // Targeted mutant: GenericData.Array.reverse() index/update logic changed.
        Schema schema = Schema.createArray(Schema.create(Type.INT));
        GenericData.Array<Integer> array =
                new GenericData.Array<>(4, schema);
        array.add(1);
        array.add(2);
        array.add(3);
        array.add(4);

        array.reverse();

        assertEquals(4, array.size());
        assertEquals(Integer.valueOf(4), array.get(0));
        assertEquals(Integer.valueOf(3), array.get(1));
        assertEquals(Integer.valueOf(2), array.get(2));
        assertEquals(Integer.valueOf(1), array.get(3));
        assertEquals("[4, 3, 2, 1]", array.toString());
    }

    @Test
    public void toStringEscapesNamedCharactersExactly() {
    // Targeted mutant: GenericData.writeEscapedString named escape branches changed/removed.
        String input = "\b\f\n\r\t\"/";
        // Oracolo derivato dal codice: \b \f \n \r \t, quote -> \" e slash -> \/ (Avro 1.5.4).
        assertEquals(
                "\"\\b\\f\\n\\r\\t\\\"\\/\"",
                GenericData.get().toString(input));
    }

    @Test
    public void toStringUsesExactBoundaryBehaviorForEscapedUnicodeRanges() {
    // Targeted mutant: GenericData.writeEscapedString Unicode range boundary predicates (L397).
    // Il ramo di escaping Unicode è buggato (padding/append errati), quindi non asseriamo il
    // formato esatto: verifichiamo il CONFINE dei tre range [0000-001F], [007F-009F], [2000-20FF]:
    // in-range -> l'output contiene "\\u" (ramo di escaping preso); out-of-range -> carattere verbatim.
        GenericData data = GenericData.get();

        // range [0000-001F]
        assertTrue(data.toString(String.valueOf((char) 0x0000)).contains("\\u"));
        assertTrue(data.toString(String.valueOf((char) 0x001F)).contains("\\u"));
        assertEquals("\"" + (char) 0x0020 + "\"", data.toString(String.valueOf((char) 0x0020)));
        // range [007F-009F]
        assertEquals("\"" + (char) 0x007E + "\"", data.toString(String.valueOf((char) 0x007E)));
        assertTrue(data.toString(String.valueOf((char) 0x007F)).contains("\\u"));
        assertTrue(data.toString(String.valueOf((char) 0x009F)).contains("\\u"));
        assertEquals("\"" + (char) 0x00A0 + "\"", data.toString(String.valueOf((char) 0x00A0)));
        // range [2000-20FF]
        assertEquals("\"" + (char) 0x1FFF + "\"", data.toString(String.valueOf((char) 0x1FFF)));
        assertTrue(data.toString(String.valueOf((char) 0x2000)).contains("\\u"));
        assertTrue(data.toString(String.valueOf((char) 0x20FF)).contains("\\u"));
        assertEquals("\"" + (char) 0x2100 + "\"", data.toString(String.valueOf((char) 0x2100)));
    }

    @Test
    public void resolveUnionSkipsNonMatchingNamedBranchesForRecordEnumAndFixed() {
    // Targeted mutant: GenericData.instanceOf(...) accepts a non-matching union branch.
        Schema recordA = new Schema.Parser().parse(
                "{\"type\":\"record\",\"name\":\"RecordA\","
                        + "\"namespace\":\"mt\",\"fields\":[]}");
        Schema recordB = new Schema.Parser().parse(
                "{\"type\":\"record\",\"name\":\"RecordB\","
                        + "\"namespace\":\"mt\",\"fields\":[]}");

        Schema enumA = Schema.createEnum(
                "EnumA", null, "mt", Arrays.asList("A", "B"));
        Schema enumB = Schema.createEnum(
                "EnumB", null, "mt", Arrays.asList("A", "B"));

        Schema fixedA = Schema.createFixed("FixedA", null, "mt", 2);
        Schema fixedB = Schema.createFixed("FixedB", null, "mt", 2);

        Schema union = Schema.createUnion(Arrays.asList(
                recordA,
                recordB,
                enumA,
                enumB,
                fixedA,
                fixedB,
                Schema.create(Type.INT)));

        GenericData.Record recordADatum =
                new GenericData.Record(recordA);
        GenericData.Record recordBDatum =
                new GenericData.Record(recordB);
        GenericData.EnumSymbol enumBDatum =
                new GenericData.EnumSymbol(enumB, "B");
        GenericData.Fixed fixedBDatum =
                new GenericData.Fixed(fixedB, new byte[] { 1, 2 });

        assertEquals(0,
                GenericData.get().resolveUnion(union, recordADatum));
        assertEquals(1,
                GenericData.get().resolveUnion(union, recordBDatum));
        assertEquals(3,
                GenericData.get().resolveUnion(union, enumBDatum));
        assertEquals(5,
                GenericData.get().resolveUnion(union, fixedBDatum));
        assertEquals(6,
                GenericData.get().resolveUnion(union, 7));

        assertEquals(-1,
                GenericData.get().compare(recordADatum, recordBDatum, union));
        assertEquals(1,
                GenericData.get().compare(recordBDatum, recordADatum, union));

    }

    @Test
    public void compareReturnsExactlyMinusOneAndOneForRecordsAndArrays() {
    // Targeted mutant: GenericData.compare(...) exact return value/sign changed.
        Schema recordSchema = new Schema.Parser().parse(
                "{\"type\":\"record\",\"name\":\"CompareRecord\","
                        + "\"fields\":[{\"name\":\"v\",\"type\":\"int\"}]}");

        GenericData.Record lowRecord =
                new GenericData.Record(recordSchema);
        GenericData.Record highRecord =
                new GenericData.Record(recordSchema);

        lowRecord.put(0, 1);
        highRecord.put(0, 2);

        assertEquals(-1,
                GenericData.get().compare(lowRecord, highRecord, recordSchema));
        assertEquals(1,
                GenericData.get().compare(highRecord, lowRecord, recordSchema));
        assertEquals(-1, lowRecord.compareTo(highRecord));
        assertEquals(1, highRecord.compareTo(lowRecord));

        Schema arraySchema =
                Schema.createArray(Schema.create(Type.INT));

        GenericData.Array<Integer> shortArray =
                new GenericData.Array<>(2, arraySchema);
        GenericData.Array<Integer> longArray =
                new GenericData.Array<>(2, arraySchema);

        shortArray.add(1);
        longArray.add(1);
        longArray.add(2);

        assertEquals(-1,
                GenericData.get().compare(shortArray, longArray, arraySchema));
        assertEquals(1,
                GenericData.get().compare(longArray, shortArray, arraySchema));
        assertEquals(-1, shortArray.compareTo(longArray));
        assertEquals(1, longArray.compareTo(shortArray));
    }

    @Test
    public void hashCodeIsExactForRecordsAndArrays() {
    // Targeted mutant: GenericData.hashCode/hashCodeAdd arithmetic changed.
        Schema recordSchema = new Schema.Parser().parse(
                "{\"type\":\"record\",\"name\":\"HashRecord\",\"fields\":["
                        + "{\"name\":\"a\",\"type\":\"int\"},"
                + "{\"name\":\"b\",\"type\":\"int\"}]}");

        GenericData.Record record =
                new GenericData.Record(recordSchema);
        record.put(0, 2);
        record.put(1, 3);

        assertEquals(1026,
                GenericData.get().hashCode(record, recordSchema));
        assertEquals(1026, record.hashCode());

        Schema arraySchema =
                Schema.createArray(Schema.create(Type.INT));

        GenericData.Array<Integer> array =
                new GenericData.Array<>(2, arraySchema);
        array.add(2);
        array.add(3);

        assertEquals(1026,
                GenericData.get().hashCode(array, arraySchema));
        assertEquals(1026, array.hashCode());

    }
}