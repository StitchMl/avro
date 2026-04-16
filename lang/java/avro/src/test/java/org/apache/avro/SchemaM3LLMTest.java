package org.apache.avro;

import static org.junit.Assert.*;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;

import org.junit.Test;

/**
 * Hand-curated tests derived from LLM-assisted generation and accepted only
 * after manual review for determinism, readability and behavioral relevance.
 *
 * <p>Each test captures a specific public-facing contract of {@link Schema} or
 * {@link Schema.Parser} discovered during prompt-driven exploration.</p>
 */
public class SchemaM3LLMTest {

  /**
   * Builds a field with minimal metadata so that parser and record tests can
   * focus on structural behavior rather than field decoration.
   *
   * @param schema schema used as the field type
   * @return a field instance suitable for record assembly
   */
  private static Schema.Field field(Schema schema) {
    return new Schema.Field("id", schema, null, null);
  }

  /**
   * Verifies the pre-initialization state of records created through the named
   * factory: before {@code setFields} is called, the field collection is still
   * absent.
   */
  @Test
  public void getFields_beforeSetFields_returnsNull() {
    assertNull(Schema.createRecord("User", null, "org.example", false).getFields());
  }

  /**
   * Verifies that a field instance cannot be reused across record definitions,
   * protecting record integrity and position assignment semantics.
   */
  @Test(expected = AvroRuntimeException.class)
  public void setFields_reusingFieldInstanceAcrossRecords_throwsAvroRuntimeException() {
    Schema.Field sharedField = field(Schema.create(Schema.Type.INT));

    Schema first = Schema.createRecord("First", null, "org.example", false);
    first.setFields(Collections.singletonList(sharedField));

    Schema second = Schema.createRecord("Second", null, "org.example", false);
    second.setFields(Collections.singletonList(sharedField));
  }

  /**
   * Verifies that disabling parser validation admits otherwise invalid record
   * identifiers, which is the documented effect of relaxed validation mode.
   */
  @Test
  public void parser_withValidationDisabled_acceptsInvalidRecordName() {
    Schema parsed = new Schema.Parser()
        .setValidate(false)
        .parse("{\"type\":\"record\",\"name\":\"1Invalid\",\"fields\":[]}");

    assertEquals(Schema.Type.RECORD, parsed.getType());
    assertEquals("1Invalid", parsed.getName());
  }

  /**
   * Verifies that relaxed validation also applies to field identifiers when the
   * parser is explicitly configured with validation disabled.
   */
  @Test
  public void parser_withValidationDisabled_acceptsInvalidFieldName() {
    Schema parsed = new Schema.Parser()
        .setValidate(false)
        .parse("{\"type\":\"record\",\"name\":\"User\",\"fields\":[{\"name\":\"1invalid\",\"type\":\"int\"}]}");

    assertNotNull(parsed.getField("1invalid"));
    assertEquals(Schema.Type.INT, parsed.getField("1invalid").schema().getType());
  }

  /**
   * Verifies the {@link java.io.InputStream}-based parse path on a valid record
   * document.
   *
   * @throws IOException if the UTF-8 encoded fixture cannot be materialized
   */
  @Test
  public void parser_parseInputStream_returnsRecordSchema() throws IOException {
    ByteArrayInputStream input = new ByteArrayInputStream(
        "{\"type\":\"record\",\"name\":\"StreamUser\",\"fields\":[{\"name\":\"id\",\"type\":\"int\"}]}"
            .getBytes("UTF-8"));

    Schema parsed = new Schema.Parser().parse(input);

    assertEquals("StreamUser", parsed.getName());
    assertNotNull(parsed.getField("id"));
  }

  /**
   * Verifies that seeding the parser symbol table with pre-known named types
   * enables later textual references to those types.
   */
  @Test
  public void parser_addTypes_allowsParsingReferenceToNamedType() {
    Schema enumSchema = Schema.createEnum("Kind", null, "org.example",
        Collections.singletonList("ONE"));
    Map<String, Schema> knownTypes = new LinkedHashMap<String, Schema>();
    knownTypes.put(enumSchema.getFullName(), enumSchema);

    Schema parsed = new Schema.Parser()
        .addTypes(knownTypes)
        .parse("{\"type\":\"record\",\"name\":\"Container\",\"namespace\":\"org.example\",\"fields\":[{\"name\":\"kind\",\"type\":\"Kind\"}]}");

    assertEquals("org.example.Kind", parsed.getField("kind").schema().getFullName());
  }

  /**
   * Verifies validation of the {@code aliases} attribute when it is encoded as
   * a scalar rather than the required array.
   */
  @Test(expected = SchemaParseException.class)
  public void parser_parseWithAliasesNotArray_throwsSchemaParseException() {
    new Schema.Parser().parse(
        "{\"type\":\"record\",\"name\":\"User\",\"aliases\":\"LegacyUser\",\"fields\":[]}");
  }

  /**
   * Verifies validation of the {@code aliases} attribute when the array
   * contains non-string values.
   */
  @Test(expected = SchemaParseException.class)
  public void parser_parseWithNonStringAlias_throwsSchemaParseException() {
    new Schema.Parser().parse(
        "{\"type\":\"record\",\"name\":\"User\",\"aliases\":[1],\"fields\":[]}");
  }
}
