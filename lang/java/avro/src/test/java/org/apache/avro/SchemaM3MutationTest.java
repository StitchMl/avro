package org.apache.avro;

import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.Collections;

import org.codehaus.jackson.JsonNode;
import org.junit.Test;

/**
 * Mutation-guided regression suite that targets survivors reported by PIT for
 * {@link Schema} and its directly related nested types.
 *
 * <p>The tests in this class are intentionally selected for high value: they
 * focus on altered equality logic, boundary conditions, boolean-return
 * behavior, and validation or named-type parsing branches that would otherwise
 * admit plausible mutants.</p>
 */
public class SchemaM3MutationTest {

  /**
   * Creates a minimal field instance used by mutation tests that compare record
   * and field equality outcomes.
   *
   * @param name field name to assign
   * @param schema schema associated with the field
   * @return a field without optional metadata
   */
  private static Schema.Field field(String name, Schema schema) {
    return new Schema.Field(name, schema, null, (JsonNode) null);
  }

  /**
   * Kills a survivor that would force primitive-schema equality to ignore
   * custom properties and return {@code true} too eagerly.
   */
  @Test
  public void equals_onPrimitiveSchemasWithDifferentProps_returnsFalse() {
    Schema left = Schema.create(Schema.Type.INT);
    Schema right = Schema.create(Schema.Type.INT);
    left.addProp("source", "bb");

    assertFalse(left.equals(right));
  }

  /**
   * Kills the boundary mutant on fixed-size validation by asserting that size
   * zero is legal and preserved.
   */
  @Test
  public void createFixed_withZeroSize_returnsFixedSchema() {
    Schema fixed = Schema.createFixed("Digest", null, "org.example", 0);

    assertEquals(Schema.Type.FIXED, fixed.getType());
    assertEquals(0, fixed.getFixedSize());
  }

  /**
   * Kills the boolean-return mutant on enum membership by asserting that an
   * unknown symbol is reported as absent.
   */
  @Test
  public void createEnum_hasEnumSymbolReturnsFalseForUnknownSymbol() {
    Schema colors = Schema.createEnum("Color", null, "org.example",
        Arrays.asList("RED", "GREEN"));

    assertFalse(colors.hasEnumSymbol("BLUE"));
  }

  /**
   * Kills parser mutants that skip enum metadata registration or custom
   * property propagation during object-schema parsing.
   */
  @Test
  public void parse_enumSchema_preservesTypeAliasAndCustomProp() {
    Schema parsed = new Schema.Parser().parse(
        "{\"type\":\"enum\",\"name\":\"Status\",\"namespace\":\"org.example\","
            + "\"symbols\":[\"OPEN\",\"CLOSED\"],"
            + "\"aliases\":[\"LegacyStatus\"],"
            + "\"x-origin\":\"mutation\"}");

    assertEquals(Schema.Type.ENUM, parsed.getType());
    assertEquals("mutation", parsed.getProp("x-origin"));
    assertTrue(parsed.getAliases().contains("org.example.LegacyStatus"));
    assertEquals(Arrays.asList("OPEN", "CLOSED"), parsed.getEnumSymbols());
  }

  /**
   * Kills parser mutants that would mis-handle the array branch or detach the
   * declared item type.
   */
  @Test
  public void parse_arraySchema_returnsArrayWithExpectedElementType() {
    Schema parsed = new Schema.Parser().parse("{\"type\":\"array\",\"items\":\"long\"}");

    assertEquals(Schema.Type.ARRAY, parsed.getType());
    assertEquals(Schema.Type.LONG, parsed.getElementType().getType());
  }

  /**
   * Kills parser mutants that would mis-handle the map branch or detach the
   * declared value type.
   */
  @Test
  public void parse_mapSchema_returnsMapWithExpectedValueType() {
    Schema parsed = new Schema.Parser().parse("{\"type\":\"map\",\"values\":\"string\"}");

    assertEquals(Schema.Type.MAP, parsed.getType());
    assertEquals(Schema.Type.STRING, parsed.getValueType().getType());
  }

  /**
   * Kills a boundary-sensitive mutant in the parser fixed branch by asserting
   * that zero-sized fixed declarations are accepted.
   */
  @Test
  public void parse_fixedSchema_withZeroSize_returnsFixedSchema() {
    Schema parsed = new Schema.Parser().parse(
        "{\"type\":\"fixed\",\"name\":\"Digest\",\"size\":0}");

    assertEquals(Schema.Type.FIXED, parsed.getType());
    assertEquals(0, parsed.getFixedSize());
  }

  /**
   * Kills validation mutants that would allow unresolved named references in a
   * record field declaration.
   */
  @Test(expected = SchemaParseException.class)
  public void parse_recordWithUndefinedNamedField_throwsSchemaParseException() {
    new Schema.Parser().parse(
        "{\"type\":\"record\",\"name\":\"Container\",\"fields\":[{\"name\":\"child\",\"type\":\"MissingType\"}]}");
  }

  /**
   * Kills survivors in record equality by asserting that different field
   * layouts are not considered equivalent.
   */
  @Test
  public void equals_onRecordSchemasWithDifferentFields_returnsFalse() {
    Schema left = Schema.createRecord("User", null, "org.example", false);
    Schema right = Schema.createRecord("User", null, "org.example", false);
    left.setFields(Collections.singletonList(field("id", Schema.create(Schema.Type.INT))));
    right.setFields(Collections.singletonList(field("name", Schema.create(Schema.Type.STRING))));

    assertFalse(left.equals(right));
  }

  /**
   * Kills a record-equality mutant that would treat non-schema objects as
   * equal.
   */
  @Test
  public void equals_onRecordSchemaAndNonSchemaObject_returnsFalse() {
    Schema record = Schema.createRecord("User", null, "org.example", false);
    record.setFields(Collections.singletonList(field("id", Schema.create(Schema.Type.INT))));

    assertFalse(record.equals("record"));
  }

  /**
   * Preserves the self-equality fast path of array schemas, preventing mutants
   * that would incorrectly negate the identity branch.
   */
  @Test
  public void equals_onArraySchema_isTrueForSameInstance() {
    Schema array = Schema.createArray(Schema.create(Schema.Type.INT));

    assertTrue(array.equals(array));
  }

  /**
   * Kills an array-equality mutant that would classify non-schema objects as
   * equal.
   */
  @Test
  public void equals_onArraySchemaAndNonSchemaObject_returnsFalse() {
    Schema array = Schema.createArray(Schema.create(Schema.Type.INT));

    assertFalse(array.equals("array"));
  }

  /**
   * Kills survivors that would ignore custom properties during array equality.
   */
  @Test
  public void equals_onArraySchemasWithDifferentProps_returnsFalse() {
    Schema left = Schema.createArray(Schema.create(Schema.Type.INT));
    Schema right = Schema.createArray(Schema.create(Schema.Type.INT));
    left.addProp("origin", "mutation");

    assertFalse(left.equals(right));
  }

  /**
   * Kills parser mutants that fail to register an inline enum definition for
   * later reuse by name inside the same record.
   */
  @Test
  public void parse_recordWithInlineEnumAndReference_reusesNamedEnum() {
    Schema parsed = new Schema.Parser().parse(
        "{\"type\":\"record\",\"name\":\"Container\",\"namespace\":\"org.example\","
            + "\"fields\":["
            + "{\"name\":\"kindDef\",\"type\":{\"type\":\"enum\",\"name\":\"Kind\",\"symbols\":[\"ONE\"]}},"
            + "{\"name\":\"kindRef\",\"type\":\"Kind\"}]}");

    assertSame(parsed.getField("kindDef").schema(), parsed.getField("kindRef").schema());
    assertEquals("org.example.Kind", parsed.getField("kindRef").schema().getFullName());
  }

  /**
   * Kills parser mutants that fail to register an inline fixed definition for
   * later reuse by name inside the same record.
   */
  @Test
  public void parse_recordWithInlineFixedAndReference_reusesNamedFixed() {
    Schema parsed = new Schema.Parser().parse(
        "{\"type\":\"record\",\"name\":\"Container\",\"namespace\":\"org.example\","
            + "\"fields\":["
            + "{\"name\":\"digestDef\",\"type\":{\"type\":\"fixed\",\"name\":\"Digest\",\"size\":4}},"
            + "{\"name\":\"digestRef\",\"type\":\"Digest\"}]}");

    assertSame(parsed.getField("digestDef").schema(), parsed.getField("digestRef").schema());
    assertEquals(4, parsed.getField("digestRef").schema().getFixedSize());
  }

  /**
   * Kills field-equality mutants that would ignore the field name component.
   */
  @Test
  public void equals_onFieldsWithDifferentNames_returnsFalse() {
    Schema.Field left = field("id", Schema.create(Schema.Type.INT));
    Schema.Field right = field("name", Schema.create(Schema.Type.INT));

    assertFalse(left.equals(right));
  }
}
