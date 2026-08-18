package com.milestone4.manual.bb;

import static org.junit.Assert.*;

import java.util.Arrays;

import org.apache.avro.Schema;
import org.apache.avro.Schema.Type;
import org.apache.avro.generic.GenericData;
import org.apache.avro.generic.IndexedRecord;
import org.junit.Test;

public class TestGenericDataBB {

  // A0.1
  @Test
  public void getReturnsSameSingletonInstance() {
    assertSame(GenericData.get(), GenericData.get());
  }

  // A1.1
  @Test
  public void validateReturnsTrueForConformingPrimitive() {
    Schema schema = Schema.create(Type.INT);
    assertTrue(GenericData.get().validate(schema, Integer.valueOf(1)));
  }

  // A1.2
  @Test
  public void validateReturnsFalseForNonConformingPrimitive() {
    Schema schema = Schema.create(Type.INT);
    assertFalse(GenericData.get().validate(schema, Long.valueOf(1L)));
  }

  // A1.3
  @Test
  public void validateReturnsTrueForConformingArray() {
    Schema schema = Schema.parse("{\"type\":\"array\",\"items\":\"int\"}");
    assertTrue(GenericData.get().validate(
            schema,
            Arrays.asList(Integer.valueOf(1), Integer.valueOf(2))));
  }

  // A1.4
  @Test
  public void validateReturnsFalseForNonConformingArray() {
    Schema schema = Schema.parse("{\"type\":\"array\",\"items\":\"int\"}");
    assertFalse(GenericData.get().validate(
            schema,
            Arrays.asList(Integer.valueOf(1), "not-an-int")));
  }

  // A2.1
  @Test
  public void induceReturnsNonNullSchemaForExampleDatum() {
    Schema schema = GenericData.get().induce(Integer.valueOf(7));
    assertNotNull(schema);
  }

  // A2.2
  @Test
  public void inducedSchemaValidatesItsExampleDatum() {
    Integer datum = Integer.valueOf(7);
    Schema schema = GenericData.get().induce(datum);
    assertTrue(GenericData.get().validate(schema, datum));
  }

  // A3.1
  @Test
  public void resolveUnionReturnsZeroForFirstBranch() {
    Schema union = Schema.parse("[\"int\",\"string\"]");
    assertEquals(0, GenericData.get().resolveUnion(union, Integer.valueOf(1)));
  }

  // A3.2
  @Test
  public void resolveUnionReturnsLastIndexForLastBranch() {
    Schema union = Schema.parse("[\"null\",\"string\",\"long\"]");
    assertEquals(2, GenericData.get().resolveUnion(union, Long.valueOf(1L)));
  }

  // A4.1
  @Test
  public void compareReturnsZeroForEqualObjects() {
    Schema schema = Schema.create(Type.INT);
    assertEquals(0, GenericData.get().compare(
            Integer.valueOf(5), Integer.valueOf(5), schema));
  }

  // A4.2
  @Test
  public void compareReturnsPositiveWhenFirstIsGreater() {
    Schema schema = Schema.create(Type.INT);
    assertEquals(1, GenericData.get().compare(
            Integer.valueOf(2), Integer.valueOf(1), schema));
  }

  // A4.3
  @Test
  public void compareReturnsNegativeWhenFirstIsLess() {
    Schema schema = Schema.create(Type.INT);
    assertEquals(-1, GenericData.get().compare(
            Integer.valueOf(1), Integer.valueOf(2), schema));
  }

  // A4.4
  @Test
  public void equalObjectsHaveSameHashCode() {
    Schema schema = Schema.create(Type.STRING);
    String first = new String("same");
    String second = new String("same");

    assertEquals(0, GenericData.get().compare(first, second, schema));
    assertEquals(
            GenericData.get().hashCode(first, schema),
            GenericData.get().hashCode(second, schema));
  }

  // A5.1
  @Test
  public void toStringReturnsNonNullJsonForExampleDatum() {
    assertNotNull(GenericData.get().toString("example"));
  }

  // A6.1
  @Test
  public void setFieldThenGetFieldReturnsSameValue() {
    final Schema schema = Schema.parse(
            "{\"type\":\"record\",\"name\":\"R\",\"fields\":"
                    + "[{\"name\":\"f\",\"type\":\"string\"}]}");
    final Object[] values = new Object[1];

    IndexedRecord record = new IndexedRecord() {
      public void put(int i, Object value) {
        values[i] = value;
      }

      public Object get(int i) {
        return values[i];
      }

      public Schema getSchema() {
        return schema;
      }
    };

    String value = "value";
    GenericData.get().setField(record, "f", 0, value);

    assertEquals(value, GenericData.get().getField(record, "f", 0));
  }

}
