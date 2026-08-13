package org.apache.avro;

import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.Collections;

import org.junit.Test;

/** Test integrativi scritti per coprire i rami scoperti del parser, dei metadati e degli alias. */
public class SchemaM3CoverageTest {

  private static Schema.Field field(Schema schema) {
    return new Schema.Field("id", schema, null, null);
  }

  /** Estrazione e controllo di doc, namespace e flag errore su un record configurato. */
  @Test
  public void testNamedRecordMetadata() {
    Schema record = Schema.createRecord("AuditEvent", "doc", "org.example", true);
    record.setFields(Collections.singletonList(field(Schema.create(Schema.Type.INT))));

    assertEquals("doc", record.getDoc());
    assertEquals("org.example", record.getNamespace());
    assertTrue(record.isError());
  }

  /** getElementType deve fallire se invocato su tipi diversi da Array. */
  @Test(expected = AvroRuntimeException.class)
  public void testGetElementTypeFailsOnPrimitive() {
    Schema.create(Schema.Type.INT).getElementType();
  }

  /** getValueType deve sollevare eccezione se chiamato su uno schema Array anziché Map. */
  @Test(expected = AvroRuntimeException.class)
  public void testGetValueTypeFailsOnArray() {
    Schema.createArray(Schema.create(Schema.Type.STRING)).getValueType();
  }

  /** Verifica che le union respingano la presenza di due enum con lo stesso nome. */
  @Test(expected = AvroRuntimeException.class)
  public void testUnionRejectsDuplicateNamedTypes() {
    Schema left = Schema.createEnum("Status", null, "org.example", Arrays.asList("OPEN", "CLOSED"));
    Schema right = Schema.createEnum("Status", null, "org.example", Arrays.asList("OPEN", "CLOSED"));
    Schema.createUnion(Arrays.asList(left, right));
  }

  // Parser: i tipi complessi devono dichiarare items / values / size.

  /** Controllo errore: la stringa JSON di un array deve contenere la chiave 'items'. */
  @Test(expected = SchemaParseException.class)
  public void testParseArrayWithoutItems() {
    new Schema.Parser().parse("{\"type\":\"array\"}");
  }

  /** Controllo errore: la stringa JSON di una map richiede la chiave 'values'. */
  @Test(expected = SchemaParseException.class)
  public void testParseMapWithoutValues() {
    new Schema.Parser().parse("{\"type\":\"map\"}");
  }

  /** Un tipo fixed non può essere parsato se manca l'attributo 'size'. */
  @Test(expected = SchemaParseException.class)
  public void testParseFixedWithoutSize() {
    new Schema.Parser().parse("{\"type\":\"fixed\",\"name\":\"Digest\"}");
  }

  // applyAliases riscrive il nome del writer mantenendone il dominio.

  /** Verifica che applyAliases converta correttamente il nome di un enum mantenendo intatti i simboli. */
  @Test
  public void testAliasRewritesEnumName() {
    Schema writer = Schema.createEnum("LegacyStatus", null, "org.example", Arrays.asList("OPEN", "CLOSED"));
    Schema reader = Schema.createEnum("Status", null, "org.example", Arrays.asList("OPEN", "CLOSED"));
    reader.addAlias("LegacyStatus");

    Schema aliased = Schema.applyAliases(writer, reader);
    assertEquals("org.example.Status", aliased.getFullName());
    assertEquals(Arrays.asList("OPEN", "CLOSED"), aliased.getEnumSymbols());
  }

  /** Controllo sulla riscrittura del nome di un fixed tramite alias senza alterarne la dimensione. */
  @Test
  public void testAliasRewritesFixedName() {
    Schema writer = Schema.createFixed("LegacyDigest", null, "org.example", 8);
    Schema reader = Schema.createFixed("Digest", null, "org.example", 8);
    reader.addAlias("LegacyDigest");

    Schema aliased = Schema.applyAliases(writer, reader);
    assertEquals("org.example.Digest", aliased.getFullName());
    assertEquals(8, aliased.getFixedSize());
  }

  /** Verifica che il parser salvi nel proprio registro interno gli schemi con nome già incontrati. */
  @Test
  public void testParserTracksNamedSchemas() {
    Schema.Parser parser = new Schema.Parser();
    Schema parsed = parser.parse(
        "{\"type\":\"record\",\"name\":\"User\",\"namespace\":\"org.example\",\"fields\":[{\"name\":\"id\",\"type\":\"int\"}]}");
    assertSame(parsed, parser.getTypes().get("org.example.User"));
  }

  /** Disattivando la validazione, il parser deve accettare anche nomi formalmente errati. */
  @Test
  @SuppressWarnings("deprecation")
  public void testParseWithoutValidation() {
    Schema parsed = Schema.parse("{\"type\":\"record\",\"name\":\"1Invalid\",\"fields\":[]}", false);
    assertEquals("1Invalid", parsed.getName());
  }
}
