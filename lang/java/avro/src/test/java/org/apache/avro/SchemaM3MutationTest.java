package org.apache.avro;

import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.Collections;

import org.junit.Test;

/** Test killer per i mutanti PIT su {@link Schema}: equals, confini e parsing dei tipi con nome. */
public class SchemaM3MutationTest {

  private static Schema.Field field(String name, Schema schema) {
    return new Schema.Field(name, schema, null, null);
  }

  private static Schema record(String name) {
    return Schema.createRecord(name, null, "org.example", false);
  }

  /** equals su primitivi considera le props (non ritorna true troppo presto). */
  @Test
  public void testPrimitiveEqualsConsidersProps() {
    Schema left = Schema.create(Schema.Type.INT);
    Schema right = Schema.create(Schema.Type.INT);
    left.addProp("source", "bb");
    assertFalse(left.equals(right));
  }

  /** createFixed accetta size 0 (confine col -1 rifiutato). */
  @Test
  public void testFixedAcceptsZeroSize() {
    assertEquals(0, Schema.createFixed("Digest", null, "org.example", 0).getFixedSize());
  }

  /** hasEnumSymbol ritorna false per un simbolo sconosciuto. */
  @Test
  public void testHasEnumSymbolFalseForUnknown() {
    Schema colors = Schema.createEnum("Color", null, "org.example", Arrays.asList("RED", "GREEN"));
    assertFalse(colors.hasEnumSymbol("BLUE"));
  }

  /** parse enum: conserva alias e proprieta' custom. */
  @Test
  public void testParseEnumKeepsAliasAndProp() {
    Schema parsed = new Schema.Parser().parse(
        "{\"type\":\"enum\",\"name\":\"Status\",\"namespace\":\"org.example\","
            + "\"symbols\":[\"OPEN\",\"CLOSED\"],\"aliases\":[\"LegacyStatus\"],\"x-origin\":\"mutation\"}");
    assertEquals("mutation", parsed.getProp("x-origin"));
    assertTrue(parsed.getAliases().contains("org.example.LegacyStatus"));
    assertEquals(Arrays.asList("OPEN", "CLOSED"), parsed.getEnumSymbols());
  }

  /** parse array: mantiene l'element type. */
  @Test
  public void testParseArrayKeepsElementType() {
    Schema parsed = new Schema.Parser().parse("{\"type\":\"array\",\"items\":\"long\"}");
    assertEquals(Schema.Type.LONG, parsed.getElementType().getType());
  }

  /** parse map: mantiene il value type. */
  @Test
  public void testParseMapKeepsValueType() {
    Schema parsed = new Schema.Parser().parse("{\"type\":\"map\",\"values\":\"string\"}");
    assertEquals(Schema.Type.STRING, parsed.getValueType().getType());
  }

  /** parse fixed: accetta size 0. */
  @Test
  public void testParseFixedAcceptsZeroSize() {
    Schema parsed = new Schema.Parser().parse("{\"type\":\"fixed\",\"name\":\"Digest\",\"size\":0}");
    assertEquals(0, parsed.getFixedSize());
  }

  /** parse: rifiuta un riferimento a un tipo con nome non definito. */
  @Test(expected = SchemaParseException.class)
  public void testParseRejectsUndefinedNamedField() {
    new Schema.Parser().parse(
        "{\"type\":\"record\",\"name\":\"Container\",\"fields\":[{\"name\":\"child\",\"type\":\"MissingType\"}]}");
  }

  /** equals record: layout di campi diversi non sono uguali. */
  @Test
  public void testRecordsWithDifferentFieldsNotEqual() {
    Schema left = record("User");
    Schema right = record("User");
    left.setFields(Collections.singletonList(field("id", Schema.create(Schema.Type.INT))));
    right.setFields(Collections.singletonList(field("name", Schema.create(Schema.Type.STRING))));
    assertFalse(left.equals(right));
  }

  /** equals record: un record non e' uguale a un oggetto non-Schema. */
  @Test
  public void testRecordNotEqualToNonSchema() {
    Schema record = record("User");
    record.setFields(Collections.singletonList(field("id", Schema.create(Schema.Type.INT))));
    assertFalse(record.equals(new Object()));
  }

  /** equals array: un array e' uguale a se stesso. */
  @Test
  public void testArrayEqualsSelf() {
    Schema array = Schema.createArray(Schema.create(Schema.Type.INT));
    assertTrue(array.equals(array));
  }

  /** equals array: un array non e' uguale a un oggetto non-Schema. */
  @Test
  public void testArrayNotEqualToNonSchema() {
    Schema array = Schema.createArray(Schema.create(Schema.Type.INT));
    assertFalse(array.equals(new Object()));
  }

  /** equals array: props diverse rendono due array non uguali. */
  @Test
  public void testArrayDifferentPropsNotEqual() {
    Schema left = Schema.createArray(Schema.create(Schema.Type.INT));
    Schema right = Schema.createArray(Schema.create(Schema.Type.INT));
    left.addProp("origin", "mutation");
    assertFalse(left.equals(right));
  }

  /** parse: un enum inline viene riusato per nome nello stesso record. */
  @Test
  public void testInlineEnumReusedByName() {
    Schema parsed = new Schema.Parser().parse(
        "{\"type\":\"record\",\"name\":\"Container\",\"namespace\":\"org.example\",\"fields\":["
            + "{\"name\":\"kindDef\",\"type\":{\"type\":\"enum\",\"name\":\"Kind\",\"symbols\":[\"ONE\"]}},"
            + "{\"name\":\"kindRef\",\"type\":\"Kind\"}]}");
    assertSame(parsed.getField("kindDef").schema(), parsed.getField("kindRef").schema());
  }

  /** parse: un fixed inline viene riusato per nome nello stesso record. */
  @Test
  public void testInlineFixedReusedByName() {
    Schema parsed = new Schema.Parser().parse(
        "{\"type\":\"record\",\"name\":\"Container\",\"namespace\":\"org.example\",\"fields\":["
            + "{\"name\":\"digestDef\",\"type\":{\"type\":\"fixed\",\"name\":\"Digest\",\"size\":4}},"
            + "{\"name\":\"digestRef\",\"type\":\"Digest\"}]}");
    assertSame(parsed.getField("digestDef").schema(), parsed.getField("digestRef").schema());
    assertEquals(4, parsed.getField("digestRef").schema().getFixedSize());
  }

  /** equals field: nomi diversi non sono uguali. */
  @Test
  public void testFieldsWithDifferentNamesNotEqual() {
    assertFalse(field("id", Schema.create(Schema.Type.INT))
        .equals(field("name", Schema.create(Schema.Type.INT))));
  }
}
