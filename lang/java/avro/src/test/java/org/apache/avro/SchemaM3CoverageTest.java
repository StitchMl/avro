package org.apache.avro;

import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.Collections;

import org.junit.Test;

/**
 * Coverage-guided regression suite targeting branches that remained uncovered
 * after the black-box, random and LLM-assisted phases.
 *
 * <p>The tests in this class are intentionally focused on parser validation,
 * alias rewriting and schema-type-specific exceptional behavior so that each
 * addition closes a concrete coverage gap.</p>
 */
public class SchemaM3CoverageTest {

  /**
   * Creates a minimal field fixture used by record-oriented coverage tests.
   *
   * @param schema schema assigned to the field
   * @return a field instance with no optional metadata
   */
  private static Schema.Field field(Schema schema) {
    return new Schema.Field("id", schema, null, null);
  }

  /**
   * Verifies that a named record exposes all public metadata channels relevant
   * to callers: name, documentation, namespace and error flag.
   */
  @Test
  public void createRecord_withNamedSchema_exposesDocNamespaceAndErrorFlag() {
    Schema record = Schema.createRecord("AuditEvent", "doc", "org.example", true);
    record.setFields(Collections.singletonList(field(Schema.create(Schema.Type.INT))));

    assertEquals("AuditEvent", record.getName());
    assertEquals("doc", record.getDoc());
    assertEquals("org.example", record.getNamespace());
    assertTrue(record.isError());
  }

  /**
   * Verifies the exceptional path of {@link Schema#getElementType()} on a
   * schema that is not an array.
   */
  @Test(expected = AvroRuntimeException.class)
  public void getElementType_onPrimitiveSchema_throwsAvroRuntimeException() {
    Schema.create(Schema.Type.INT).getElementType();
  }

  /**
   * Verifies the exceptional path of {@link Schema#getValueType()} on a schema
   * that is not a map.
   */
  @Test(expected = AvroRuntimeException.class)
  public void getValueType_onArraySchema_throwsAvroRuntimeException() {
    Schema.createArray(Schema.create(Schema.Type.STRING)).getValueType();
  }

  /**
   * Verifies duplicate-name detection for named branches inside a union.
   */
  @Test(expected = AvroRuntimeException.class)
  public void createUnion_withDuplicateNamedTypes_throwsAvroRuntimeException() {
    Schema left = Schema.createEnum("Status", null, "org.example",
        Arrays.asList("OPEN", "CLOSED"));
    Schema right = Schema.createEnum("Status", null, "org.example",
        Arrays.asList("OPEN", "CLOSED"));

    Schema.createUnion(Arrays.asList(left, right));
  }

  /**
   * Verifies parser validation for arrays missing their mandatory
   * {@code items} declaration.
   */
  @Test(expected = SchemaParseException.class)
  public void parse_arraySchemaWithoutItems_throwsSchemaParseException() {
    new Schema.Parser().parse("{\"type\":\"array\"}");
  }

  /**
   * Verifies parser validation for maps missing their mandatory
   * {@code values} declaration.
   */
  @Test(expected = SchemaParseException.class)
  public void parse_mapSchemaWithoutValues_throwsSchemaParseException() {
    new Schema.Parser().parse("{\"type\":\"map\"}");
  }

  /**
   * Verifies parser validation for fixed schemas missing a valid integer size.
   */
  @Test(expected = SchemaParseException.class)
  public void parse_fixedSchemaWithoutSize_throwsSchemaParseException() {
    new Schema.Parser().parse("{\"type\":\"fixed\",\"name\":\"Digest\"}");
  }

  /**
   * Verifies alias-driven rewriting for enum names while preserving the symbol
   * domain of the writer schema.
   */
  @Test
  public void applyAliases_withEnumAlias_rewritesEnumName() {
    Schema writer = Schema.createEnum("LegacyStatus", null, "org.example",
        Arrays.asList("OPEN", "CLOSED"));
    Schema reader = Schema.createEnum("Status", null, "org.example",
        Arrays.asList("OPEN", "CLOSED"));
    reader.addAlias("LegacyStatus");

    Schema aliased = Schema.applyAliases(writer, reader);

    assertEquals("org.example.Status", aliased.getFullName());
    assertEquals(Arrays.asList("OPEN", "CLOSED"), aliased.getEnumSymbols());
  }

  /**
   * Verifies alias-driven rewriting for fixed names while preserving the fixed
   * size constraint.
   */
  @Test
  public void applyAliases_withFixedAlias_rewritesFixedName() {
    Schema writer = Schema.createFixed("LegacyDigest", null, "org.example", 8);
    Schema reader = Schema.createFixed("Digest", null, "org.example", 8);
    reader.addAlias("LegacyDigest");

    Schema aliased = Schema.applyAliases(writer, reader);

    assertEquals("org.example.Digest", aliased.getFullName());
    assertEquals(8, aliased.getFixedSize());
  }

  /**
   * Verifies that parser state exposes named schemas accumulated during the
   * current parsing session.
   */
  @Test
  public void parser_getTypes_containsNamedSchemasParsedSoFar() {
    Schema.Parser parser = new Schema.Parser();
    Schema parsed = parser.parse(
        "{\"type\":\"record\",\"name\":\"User\",\"namespace\":\"org.example\",\"fields\":[{\"name\":\"id\",\"type\":\"int\"}]}");

    assertSame(parsed, parser.getTypes().get("org.example.User"));
  }

  /**
   * Verifies the deprecated parse overload that disables validation and accepts
   * names that would otherwise be rejected.
   */
  @Test
  @SuppressWarnings("deprecation")
  public void parse_withValidationDisabledDeprecatedOverload_acceptsInvalidName() {
    Schema parsed = Schema.parse("{\"type\":\"record\",\"name\":\"1Invalid\",\"fields\":[]}", false);

    assertEquals(Schema.Type.RECORD, parsed.getType());
    assertEquals("1Invalid", parsed.getName());
  }
}
