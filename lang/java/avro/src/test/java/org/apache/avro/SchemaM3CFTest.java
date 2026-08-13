package org.apache.avro;

import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.Collections;

import org.junit.Test;

/** Analisi del flusso di controllo (Control-Flow) sui metodi principali di creazione e confronto degli schemi. */
public class SchemaM3CFTest {

  private static Schema.Field field(String name, Schema schema) {
    return new Schema.Field(name, schema, null, null);
  }

  private static Schema record(String name) {
    return Schema.createRecord(name, null, "org.example", false);
  }

  private static Schema enumStatus() {
    return Schema.createEnum("Status", null, "org.example", Arrays.asList("OPEN", "CLOSED"));
  }

  private static Schema recursiveNode() {
    Schema record = record("Node");
    record.setFields(Collections.singletonList(field("next", record)));
    return record;
  }

  /** Percorso standard di successo per una union con rami validi. */
  @Test
  public void testUnionWithUniqueBranches() {
    Schema union = Schema.createUnion(Arrays.asList(enumStatus(), Schema.create(Schema.Type.NULL)));
    assertEquals(Schema.Type.UNION, union.getType());
    assertEquals(2, union.getTypes().size());
  }

  /** Ramo di errore: una union non può contenere un record privo di fullname. */
  @Test(expected = AvroRuntimeException.class)
  public void testUnionRejectsNamelessNamedBranch() {
    Schema anonymous = Schema.createRecord(Collections.singletonList(
        field("id", Schema.create(Schema.Type.INT))));
    Schema.createUnion(Arrays.asList(anonymous, Schema.create(Schema.Type.NULL)));
  }

  /** Verifica del blocco nel flusso quando si inseriscono tipi con nome duplicati nella union. */
  @Test(expected = AvroRuntimeException.class)
  public void testUnionRejectsDuplicateNamedTypes() {
    Schema.createUnion(Arrays.asList(enumStatus(), enumStatus()));
  }

  /** Flusso di errore per il caso di una union annidata. */
  @Test(expected = AvroRuntimeException.class)
  public void testUnionRejectsNestedUnion() {
    Schema nested = Schema.createUnion(Arrays.asList(
        Schema.create(Schema.Type.NULL), Schema.create(Schema.Type.STRING)));
    Schema.createUnion(Arrays.asList(nested, Schema.create(Schema.Type.INT)));
  }

  /** Controllo del ramo che intercetta i tipi primitivi ripetuti in una union. */
  @Test(expected = AvroRuntimeException.class)
  public void testUnionRejectsDuplicatePrimitive() {
    Schema.createUnion(Arrays.asList(
        Schema.create(Schema.Type.STRING), Schema.create(Schema.Type.STRING)));
  }

  /** Ramo nominale di createRecord dopo aver validato la correttezza del nome inserito. */
  @Test
  public void testRecordWithValidName() {
    Schema error = Schema.createRecord("User", "doc", "org.example", true);
    assertEquals("org.example.User", error.getFullName());
    assertTrue(error.isError());
  }

  /** Fallimento immediato se il nome del record inizia con un carattere non ammesso. */
  @Test(expected = SchemaParseException.class)
  public void testRecordWithIllegalInitialChar() {
    Schema.createRecord("1User", null, "org.example", false);
  }

  /** Flusso di successo in createEnum con mappatura interna delle posizioni dei simboli. */
  @Test
  public void testEnumBuildsOrdinalMap() {
    Schema colors = Schema.createEnum("Color", null, "org.example", Arrays.asList("RED", "GREEN"));
    assertEquals(Arrays.asList("RED", "GREEN"), colors.getEnumSymbols());
    assertEquals(1, colors.getEnumOrdinal("GREEN"));
  }

  /** Ramo di eccezione in caso di simbolo duplicato all'interno dell'enum. */
  @Test(expected = SchemaParseException.class)
  public void testEnumRejectsDuplicateSymbol() {
    Schema.createEnum("Color", null, "org.example", Arrays.asList("RED", "RED"));
  }

  /** Rifiuto del flusso se l'enum contiene un simbolo con sintassi errata. */
  @Test(expected = SchemaParseException.class)
  public void testEnumRejectsInvalidSymbol() {
    Schema.createEnum("Color", null, "org.example", Arrays.asList("RED", "1BAD"));
  }

  /** Assegnazione standard dei campi con calcolo incrementale delle posizioni. */
  @Test
  public void testSetFieldsAssignsPositionsInOrder() {
    Schema user = record("User");
    user.setFields(Arrays.asList(
        field("id", Schema.create(Schema.Type.INT)),
        field("name", Schema.create(Schema.Type.STRING))));
    assertEquals(0, user.getField("id").pos());
    assertEquals(1, user.getField("name").pos());
  }

  /** Controllo del blocco di sicurezza se si prova a rieseguire setFields. */
  @Test(expected = AvroRuntimeException.class)
  public void testSetFieldsRejectsSecondCall() {
    Schema user = record("User");
    user.setFields(Collections.singletonList(field("id", Schema.create(Schema.Type.INT))));
    user.setFields(Collections.singletonList(field("name", Schema.create(Schema.Type.STRING))));
  }

  /** Ramo che vieta il riutilizzo di un'istanza Field già legata a un altro record. */
  @Test(expected = AvroRuntimeException.class)
  public void testSetFieldsRejectsReusedField() {
    Schema.Field shared = field("id", Schema.create(Schema.Type.INT));
    record("First").setFields(Collections.singletonList(shared));
    record("Second").setFields(Collections.singletonList(shared));
  }

  /** Casi base di equals: confronto con se stessi, oggetti null/diversi o tipi incompatibili. */
  @Test
  public void testEqualsCoversSelfNonSchemaAndTypeMismatch() {
    Schema intSchema = Schema.create(Schema.Type.INT);
    assertTrue(intSchema.equals(intSchema));
    assertFalse(intSchema.equals(new Object()));
    assertFalse(intSchema.equals(Schema.create(Schema.Type.LONG)));
  }

  /** Verifica che due record con nomi diversi escano subito dall'equals. */
  @Test
  public void testRecordsWithDifferentNamesNotEqual() {
    Schema left = record("Left");
    Schema right = record("Right");
    left.setFields(Collections.singletonList(field("id", Schema.create(Schema.Type.INT))));
    right.setFields(Collections.singletonList(field("id", Schema.create(Schema.Type.INT))));
    assertFalse(left.equals(right));
  }

  /** Controllo del fallimento di equals se le proprietà addizionali differiscono. */
  @Test
  public void testRecordsWithDifferentPropsNotEqual() {
    Schema left = record("User");
    Schema right = record("User");
    left.setFields(Collections.singletonList(field("id", Schema.create(Schema.Type.INT))));
    right.setFields(Collections.singletonList(field("id", Schema.create(Schema.Type.INT))));
    left.addProp("custom", "left");
    assertFalse(left.equals(right));
  }

  /** Ramo critico: equals su strutture ricorsive deve terminare senza loop infiniti grazie al seen-set. */
  @Test
  public void testRecursiveRecordsTerminateAndAreEqual() {
    assertTrue(recursiveNode().equals(recursiveNode()));
  }
}
