package org.apache.avro;

import static org.junit.Assert.*;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Arrays;
import java.util.Collections;

import org.junit.Test;

/**
 * Black-box regression suite for the public factory, validation, parsing and
 * representation APIs exposed by {@link Schema}.
 *
 * <p>The class intentionally exercises the externally observable contract of
 * the type system without relying on implementation details. Each test covers a
 * small requirement that is meaningful in terms of API behavior and potential
 * regressions for schema construction and validation.</p>
 */
public class SchemaM3BBTest {

  /**
   * Creates a record field with no documentation and no default value so that
   * tests can focus on schema topology rather than field metadata.
   *
   * @param name logical field name to assign
   * @param schema schema associated with the field
   * @return a field instance ready to be attached to a record schema
   */
  private static Schema.Field field(String name, Schema schema) {
    return new Schema.Field(name, schema, null, null);
  }

  /**
   * Verifies the nominal path of {@link Schema#create(Schema.Type)} for a
   * primitive input by asserting that the returned schema preserves both the
   * primitive kind and its canonical Avro name.
   */
  @Test
  public void create_withPrimitiveType_returnsPrimitiveSchema() {
    Schema schema = Schema.create(Schema.Type.INT);

    assertEquals(Schema.Type.INT, schema.getType());
    assertEquals("int", schema.getName());
  }

  /**
   * Verifies that {@link Schema#create(Schema.Type)} rejects complex types,
   * whose construction must be delegated to specialized factory methods.
   */
  @Test(expected = AvroRuntimeException.class)
  public void create_withComplexType_throwsAvroRuntimeException() {
    Schema.create(Schema.Type.RECORD);
  }

  /**
   * Verifies that a named record created through the public factory can accept
   * fields exactly once and exposes them through positional and name-based
   * lookup.
   */
  @Test
  public void createRecord_withFields_setsFieldsAndGetFieldWorks() {
    Schema record = Schema.createRecord("User", null, "org.example", false);
    record.setFields(Arrays.asList(
        field("id", Schema.create(Schema.Type.INT)),
        field("name", Schema.create(Schema.Type.STRING))));

    assertEquals(Schema.Type.RECORD, record.getType());
    assertEquals("org.example.User", record.getFullName());
    assertEquals(0, record.getField("id").pos());
    assertEquals(1, record.getField("name").pos());
    assertEquals(Schema.Type.STRING, record.getField("name").schema().getType());
  }

  /**
   * Verifies the convenience factory for anonymous records, ensuring that the
   * resulting schema has no explicit name or namespace while still assigning
   * deterministic field positions.
   */
  @Test
  public void createRecord_withFieldListFactory_returnsAnonymousRecord() {
    Schema record = Schema.createRecord(Collections.singletonList(
        field("id", Schema.create(Schema.Type.INT))));

    assertNull(record.getName());
    assertNull(record.getNamespace());
    assertEquals(0, record.getField("id").pos());
  }

  /**
   * Verifies the record invariant that {@link Schema#setFields(java.util.List)}
   * is a single-assignment operation and must reject any second invocation.
   */
  @Test(expected = AvroRuntimeException.class)
  public void setFields_calledTwice_throwsAvroRuntimeException() {
    Schema record = Schema.createRecord("Twice", null, "org.example", false);
    record.setFields(Collections.singletonList(field("id", Schema.create(Schema.Type.INT))));
    record.setFields(Collections.singletonList(field("name", Schema.create(Schema.Type.STRING))));
  }

  /**
   * Verifies that record-specific lookup is not available on primitive schemas
   * and that the API fails fast with a domain-specific runtime exception.
   */
  @Test(expected = AvroRuntimeException.class)
  public void getField_onPrimitiveSchema_throwsAvroRuntimeException() {
    Schema.create(Schema.Type.INT).getField("id");
  }

  /**
   * Verifies that collection factories retain the nested schema assigned to
   * their element or value slot.
   */
  @Test
  public void createArray_andCreateMap_exposeNestedTypes() {
    Schema arraySchema = Schema.createArray(Schema.create(Schema.Type.STRING));
    Schema mapSchema = Schema.createMap(Schema.create(Schema.Type.LONG));

    assertEquals(Schema.Type.STRING, arraySchema.getElementType().getType());
    assertEquals(Schema.Type.LONG, mapSchema.getValueType().getType());
  }

  /**
   * Verifies the lower-bound validation on fixed-size schemas by asserting that
   * negative sizes are rejected.
   */
  @Test(expected = IllegalArgumentException.class)
  public void createFixed_withNegativeSize_throwsIllegalArgumentException() {
    Schema.createFixed("BadFixed", null, "org.example", -1);
  }

  /**
   * Verifies the nominal construction path for enum schemas, including symbol
   * preservation, membership queries and ordinal lookup.
   */
  @Test
  public void createEnum_withDistinctSymbols_exposesSymbolsAndOrdinals() {
    Schema colors = Schema.createEnum("Color", null, "org.example",
        Arrays.asList("RED", "GREEN", "BLUE"));

    assertEquals(Arrays.asList("RED", "GREEN", "BLUE"), colors.getEnumSymbols());
    assertTrue(colors.hasEnumSymbol("GREEN"));
    assertEquals(1, colors.getEnumOrdinal("GREEN"));
  }

  /**
   * Verifies that enum construction rejects duplicate symbols, preventing
   * ambiguous symbolic encodings.
   */
  @Test(expected = SchemaParseException.class)
  public void createEnum_withDuplicateSymbols_throwsSchemaParseException() {
    Schema.createEnum("Color", null, "org.example", Arrays.asList("RED", "RED"));
  }

  /**
   * Verifies the nominal union construction path for two distinct branches.
   */
  @Test
  public void createUnion_withDistinctTypes_returnsUnionSchema() {
    Schema union = Schema.createUnion(Arrays.asList(
        Schema.create(Schema.Type.NULL),
        Schema.create(Schema.Type.STRING)));

    assertEquals(Schema.Type.UNION, union.getType());
    assertEquals(2, union.getTypes().size());
    assertEquals(Schema.Type.STRING, union.getTypes().get(1).getType());
  }

  /**
   * Verifies that unions cannot contain other unions as branches, which would
   * violate the Avro union well-formedness rules.
   */
  @Test(expected = AvroRuntimeException.class)
  public void createUnion_withNestedUnion_throwsAvroRuntimeException() {
    Schema nested = Schema.createUnion(Arrays.asList(
        Schema.create(Schema.Type.NULL),
        Schema.create(Schema.Type.STRING)));

    Schema.createUnion(Arrays.asList(nested, Schema.create(Schema.Type.INT)));
  }

  /**
   * Verifies that unions reject duplicate primitive branches because they would
   * make branch resolution ambiguous at runtime.
   */
  @Test(expected = AvroRuntimeException.class)
  public void createUnion_withAmbiguousPrimitiveTypes_throwsAvroRuntimeException() {
    Schema.createUnion(Arrays.asList(
        Schema.create(Schema.Type.STRING),
        Schema.create(Schema.Type.STRING)));
  }

  /**
   * Verifies that aliases added to a named schema are normalized to their fully
   * qualified representation using the schema namespace.
   */
  @Test
  public void addAlias_onNamedType_storesQualifiedAlias() {
    Schema record = Schema.createRecord("User", null, "org.example", false);
    record.addAlias("Person");

    assertTrue(record.getAliases().contains("org.example.Person"));
  }

  /**
   * Verifies that alias validation rejects identifiers that are not valid Avro
   * names.
   */
  @Test(expected = SchemaParseException.class)
  public void addAlias_withInvalidName_throwsSchemaParseException() {
    Schema record = Schema.createRecord("User", null, "org.example", false);
    record.addAlias("not-valid!");
  }

  /**
   * Verifies the deprecated file-based parsing entry point on a syntactically
   * valid record schema.
   *
   * @throws IOException if the temporary schema file cannot be written
   */
  @Test
  @SuppressWarnings("deprecation")
  public void parse_validSchemaFile_returnsRecordSchema() throws IOException {
    File temp = File.createTempFile("schema-m3-", ".avsc");
    temp.deleteOnExit();

    FileWriter writer = new FileWriter(temp);
    writer.write("{\"type\":\"record\",\"name\":\"User\",\"fields\":[{\"name\":\"id\",\"type\":\"int\"}]}");
    writer.close();

    Schema parsed = Schema.parse(temp);

    assertEquals(Schema.Type.RECORD, parsed.getType());
    assertEquals("User", parsed.getName());
    assertNotNull(parsed.getField("id"));
  }

  /**
   * Verifies that malformed schema text is translated into a
   * {@link SchemaParseException} by the deprecated text-based parse overload.
   */
  @Test(expected = SchemaParseException.class)
  @SuppressWarnings("deprecation")
  public void parse_invalidSchemaText_throwsSchemaParseException() {
    Schema.parse("not-json", true);
  }

  /**
   * Verifies two core representation properties: structural equality for
   * equivalent schemas and JSON serialization containing the expected public
   * shape.
   */
  @Test
  public void equals_andToString_behaveAsExpected() {
    Schema left = Schema.createArray(Schema.create(Schema.Type.INT));
    Schema right = Schema.createArray(Schema.create(Schema.Type.INT));

    assertEquals(left, right);
    assertEquals(left.hashCode(), right.hashCode());

    String json = left.toString();
    assertTrue(json.contains("\"type\":\"array\""));
    assertTrue(json.contains("\"items\":\"int\""));
  }
}
