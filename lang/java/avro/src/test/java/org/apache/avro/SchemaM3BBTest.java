package org.apache.avro;

import static org.junit.Assert.*;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Arrays;
import java.util.Collections;

import org.junit.Test;

/** Test di tipo Black-Box basati su category partition per verificare il comportamento della classe Schema. */
public class SchemaM3BBTest {

  private static Schema.Field field(String name, Schema schema) {
    return new Schema.Field(name, schema, null, null);
  }

  private static Schema record(String name) {
    return Schema.createRecord(name, null, "org.example", false);
  }

  /** Controllo base per verificare che la factory create() restituisca il nome corretto sui tipi primitivi. */
  @Test
  public void testPrimitiveTypeSchema() {
    Schema schema = Schema.create(Schema.Type.INT);
    assertEquals(Schema.Type.INT, schema.getType());
    assertEquals("int", schema.getName());
  }

  /** Verifica che create() blocchi i tipi complessi che richiedono invece metodi dedicati. */
  @Test(expected = AvroRuntimeException.class)
  public void testCreateRejectsComplexType() {
    Schema.create(Schema.Type.RECORD);
  }

  /** Test sull'inserimento dei campi in un record e successivo recupero per nome/posizione. */
  @Test
  public void testRecordFieldsSetAndLookup() {
    Schema user = record("User");
    user.setFields(Arrays.asList(
        field("id", Schema.create(Schema.Type.INT)),
        field("name", Schema.create(Schema.Type.STRING))));

    assertEquals("org.example.User", user.getFullName());
    assertEquals(0, user.getField("id").pos());
    assertEquals(1, user.getField("name").pos());
    assertEquals(Schema.Type.STRING, user.getField("name").schema().getType());
  }

  /** Controllo sulla creazione di un record anonimo (senza nome e namespace). */
  @Test
  public void testAnonymousRecord() {
    Schema record = Schema.createRecord(Collections.singletonList(
        field("id", Schema.create(Schema.Type.INT))));

    assertNull(record.getName());
    assertNull(record.getNamespace());
    assertEquals(0, record.getField("id").pos());
  }

  /** Verifica che setFields lanci eccezione se invocato una seconda volta sullo stesso record. */
  @Test(expected = AvroRuntimeException.class)
  public void testSetFieldsSingleAssignment() {
    Schema record = record("Twice");
    record.setFields(Collections.singletonList(field("id", Schema.create(Schema.Type.INT))));
    record.setFields(Collections.singletonList(field("name", Schema.create(Schema.Type.STRING))));
  }

  /** Chiamare getField su un tipo primitivo deve fallire. */
  @Test(expected = AvroRuntimeException.class)
  public void testGetFieldFailsOnPrimitive() {
    Schema.create(Schema.Type.INT).getField("id");
  }

  /** Test per controllare che array e map espongano correttamente i rispettivi tipi interni. */
  @Test
  public void testArrayAndMapNestedType() {
    Schema array = Schema.createArray(Schema.create(Schema.Type.STRING));
    Schema map = Schema.createMap(Schema.create(Schema.Type.LONG));

    assertEquals(Schema.Type.STRING, array.getElementType().getType());
    assertEquals(Schema.Type.LONG, map.getValueType().getType());
  }

  /** Una dimensione negativa per createFixed deve lanciare IllegalArgumentException. */
  @Test(expected = IllegalArgumentException.class)
  public void testNegativeFixedSizeRejected() {
    Schema.createFixed("BadFixed", null, "org.example", -1);
  }

  /** Controllo sul recupero di simboli e ordinali per un enum standard. */
  @Test
  public void testEnumDistinctSymbols() {
    Schema colors = Schema.createEnum("Color", null, "org.example",
        Arrays.asList("RED", "GREEN", "BLUE"));

    assertEquals(Arrays.asList("RED", "GREEN", "BLUE"), colors.getEnumSymbols());
    assertTrue(colors.hasEnumSymbol("GREEN"));
    assertEquals(1, colors.getEnumOrdinal("GREEN"));
  }

  /** Verifica che i simboli duplicati in un enum vengano intercettati e rifiutati. */
  @Test(expected = SchemaParseException.class)
  public void testDuplicateEnumSymbolsRejected() {
    Schema.createEnum("Color", null, "org.example", Arrays.asList("RED", "RED"));
  }

  /** Test sulla validità di una union composta da tipi differenti. */
  @Test
  public void testUnionOfDistinctTypes() {
    Schema union = Schema.createUnion(Arrays.asList(
        Schema.create(Schema.Type.NULL),
        Schema.create(Schema.Type.STRING)));

    assertEquals(Schema.Type.UNION, union.getType());
    assertEquals(2, union.getTypes().size());
    assertEquals(Schema.Type.STRING, union.getTypes().get(1).getType());
  }

  /** Controllo sul divieto di inserire una union dentro un'altra union. */
  @Test(expected = AvroRuntimeException.class)
  public void testNestedUnionRejected() {
    Schema nested = Schema.createUnion(Arrays.asList(
        Schema.create(Schema.Type.NULL),
        Schema.create(Schema.Type.STRING)));
    Schema.createUnion(Arrays.asList(nested, Schema.create(Schema.Type.INT)));
  }

  /** Le union con tipi primitivi duplicati devono fallire per evitare ambiguità. */
  @Test(expected = AvroRuntimeException.class)
  public void testDuplicatePrimitiveInUnion() {
    Schema.createUnion(Arrays.asList(
        Schema.create(Schema.Type.STRING),
        Schema.create(Schema.Type.STRING)));
  }

  /** Verifica che l'aggiunta di un alias applichi correttamente il namespace dello schema padre. */
  @Test
  public void testAliasQualified() {
    Schema user = record("User");
    user.addAlias("Person");
    assertTrue(user.getAliases().contains("org.example.Person"));
  }

  /** Un alias con caratteri non validi non deve essere accettato. */
  @Test(expected = SchemaParseException.class)
  public void testInvalidAliasRejected() {
    record("User").addAlias("not-valid!");
  }

  /** Test sul parsing di un file JSON reale per la creazione di uno schema record. */
  @Test
  @SuppressWarnings("deprecation")
  public void testParseRecordFromFile() throws IOException {
    File temp = File.createTempFile("schema-m3-", ".avsc");
    temp.deleteOnExit();
    FileWriter writer = new FileWriter(temp);
    try {
      writer.write("{\"type\":\"record\",\"name\":\"User\",\"fields\":[{\"name\":\"id\",\"type\":\"int\"}]}");
    } finally {
      writer.close();
    }

    Schema parsed = Schema.parse(temp);
    assertEquals("User", parsed.getName());
    assertNotNull(parsed.getField("id"));
  }

  /** Il parsing di testo non JSON deve sollevare una SchemaParseException. */
  @Test(expected = SchemaParseException.class)
  @SuppressWarnings("deprecation")
  public void testParseInvalidText() {
    Schema.parse("not-json", true);
  }

  /** Controllo di uguaglianza, hashcode e output JSON su due array identici. */
  @Test
  public void testEqualArraysShareHashAndJson() {
    Schema left = Schema.createArray(Schema.create(Schema.Type.INT));
    Schema right = Schema.createArray(Schema.create(Schema.Type.INT));

    assertEquals(left, right);
    assertEquals(left.hashCode(), right.hashCode());
    assertTrue(left.toString().contains("\"items\":\"int\""));
  }
}
