package com.milestone4.manual.mock;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;
import static org.mockito.Mockito.atLeastOnce;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import java.util.Arrays;

import org.apache.avro.Schema;
import org.apache.avro.Schema.Field;
import org.apache.avro.Schema.Type;
import org.apache.avro.generic.GenericData;
import org.apache.avro.generic.GenericRecord;
import org.junit.Test;

/*
 * GenericData is primarily data-centric and normally collaborates with
 * value objects, so additional mocking would add little isolation value.
 * Those ordinary value-based behaviors are covered by the black-box suite.
 * This class uses only a minimal GenericRecord interface mock to verify the
 * interaction by which GenericData obtains a record schema and indexed values.
 */
public class TestGenericDataMock {

    @Test
    public void toStringReadsSchemaAndIndexedValuesFromMockedGenericRecord() {
        // INTERACTION: verify GenericData obtains schema metadata and indexed field values.
        Schema recordSchema =
                Schema.createRecord("Person", null, "com.milestone4.mock", false);
        recordSchema.setFields(Arrays.asList(
                new Field("name", Schema.create(Type.STRING), null, null),
                new Field("age", Schema.create(Type.INT), null, null)));

        GenericRecord record = mock(GenericRecord.class);

        when(record.getSchema()).thenReturn(recordSchema);
        when(record.get(0)).thenReturn("Ada");
        when(record.get(1)).thenReturn(37);

        String output = GenericData.get().toString(record);

        assertNotNull(output);
        assertTrue(output.contains("\"name\""));
        assertTrue(output.contains("\"age\""));
        assertTrue(output.contains("\"Ada\""));
        assertTrue(output.contains("37"));
        assertEquals("{\"name\": \"Ada\", \"age\": 37}", output);

        verify(record, atLeastOnce()).getSchema();
        verify(record, atLeastOnce()).get(0);
        verify(record, atLeastOnce()).get(1);

    }
}