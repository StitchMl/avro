package org.apache.avro;

import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.Collections;

import org.codehaus.jackson.JsonNode;
import org.junit.Test;

/**
 * Control-flow-guided test suite for a focused subset of branch-heavy methods
 * in {@link Schema}.
 *
 * <p>The suite does not attempt exhaustive path enumeration over the whole
 * class. Instead, it selects methods with decision points that materially
 * affect validation, construction or equality semantics and documents the
 * simplified CFG used to derive the tests.</p>
 */
public class SchemaM3CFTest {

  /**
   * Creates a field fixture with minimal metadata so that tests can reason
   * about control-flow decisions without incidental variability.
   *
   * @param name field name to assign
   * @param schema schema associated with the field
   * @return a field instance with no optional metadata set
   */
  private static Schema.Field field(String name, Schema schema) {
    return new Schema.Field(name, schema, null, (JsonNode) null);
  }

  /**
   * Builds a recursive single-link record used to exercise the cycle-handling
   * branch in record equality.
   *
   * @param name record name to assign
   * @return a self-referential record schema
   */
  private static Schema recursiveRecord(String name) {
    Schema record = Schema.createRecord(name, null, "org.example", false);
    record.setFields(Collections.singletonList(field("next", record)));
    return record;
  }

  /*
   * CFG createUnion(List<Schema>):
   * entry -> iterate branches
   *   -> UNION => throw nested union
   *   -> RECORD/FIXED/ENUM with fullname == null => throw nameless named type
   *   -> RECORD/FIXED/ENUM with duplicate fullname => throw duplicate name
   *   -> primitive/other with duplicate type bit => throw ambiguous union
   *   -> otherwise continue -> return union
   */

  /**
   * Covers the success branch of union construction when all branches are legal
   * and pairwise distinguishable.
   */
  @Test
  public void createUnion_withUniqueNamedAndPrimitiveBranches_returnsUnion() {
    Schema status = Schema.createEnum("Status", null, "org.example",
        Arrays.asList("OPEN", "CLOSED"));

    Schema union = Schema.createUnion(Arrays.asList(status, Schema.create(Schema.Type.NULL)));

    assertEquals(Schema.Type.UNION, union.getType());
    assertEquals(2, union.getTypes().size());
  }

  /**
   * Covers the validation branch that rejects named union members lacking a
   * fully qualified name, here exercised with an anonymous record.
   */
  @Test(expected = AvroRuntimeException.class)
  public void createUnion_withAnonymousRecord_throwsForNamelessNamedBranch() {
    Schema anonymousRecord = Schema.createRecord(Collections.singletonList(
        field("id", Schema.create(Schema.Type.INT))));

    Schema.createUnion(Arrays.asList(anonymousRecord, Schema.create(Schema.Type.NULL)));
  }

  /**
   * Covers the duplicate-name branch inside union validation for named member
   * types.
   */
  @Test(expected = AvroRuntimeException.class)
  public void createUnion_withDuplicateNamedTypes_throwsForDuplicateNameBranch() {
    Schema left = Schema.createEnum("Status", null, "org.example",
        Arrays.asList("OPEN", "CLOSED"));
    Schema right = Schema.createEnum("Status", null, "org.example",
        Arrays.asList("OPEN", "CLOSED"));

    Schema.createUnion(Arrays.asList(left, right));
  }

  /**
   * Covers the branch that explicitly forbids nested unions.
   */
  @Test(expected = AvroRuntimeException.class)
  public void createUnion_withNestedUnion_throwsForNestedUnionBranch() {
    Schema nested = Schema.createUnion(Arrays.asList(
        Schema.create(Schema.Type.NULL),
        Schema.create(Schema.Type.STRING)));

    Schema.createUnion(Arrays.asList(nested, Schema.create(Schema.Type.INT)));
  }

  /**
   * Covers the ambiguity branch triggered by repeated primitive kinds inside a
   * union declaration.
   */
  @Test(expected = AvroRuntimeException.class)
  public void createUnion_withDuplicatePrimitiveType_throwsForAmbiguousBranch() {
    Schema.createUnion(Arrays.asList(
        Schema.create(Schema.Type.STRING),
        Schema.create(Schema.Type.STRING)));
  }

  /*
   * CFG createRecord(String, ...):
   * entry -> new Name(name, namespace)
   *   -> validateName passes => new RecordSchema -> return
   *   -> validateName fails => SchemaParseException
   */

  /**
   * Covers the success path of named record creation after identifier
   * validation.
   */
  @Test
  public void createRecord_withValidName_returnsNamedRecord() {
    Schema record = Schema.createRecord("User", "doc", "org.example", true);

    assertEquals("org.example.User", record.getFullName());
    assertTrue(record.isError());
  }

  /**
   * Covers the failure path of record creation when the supplied name violates
   * Avro identifier rules.
   */
  @Test(expected = SchemaParseException.class)
  public void createRecord_withIllegalInitialCharacter_throwsSchemaParseException() {
    Schema.createRecord("1User", null, "org.example", false);
  }

  /*
   * CFG createEnum(String, ...):
   * entry -> iterate symbols
   *   -> validateName fails => SchemaParseException
   *   -> new validated symbol => store ordinal and continue
   *   -> duplicate validated symbol => SchemaParseException
   * return enum
   */

  /**
   * Covers the success path of enum construction, including population of the
   * internal ordinal map.
   */
  @Test
  public void createEnum_withDistinctSymbols_buildsOrdinalMap() {
    Schema schema = Schema.createEnum("Color", null, "org.example",
        Arrays.asList("RED", "GREEN"));

    assertEquals(Arrays.asList("RED", "GREEN"), schema.getEnumSymbols());
    assertEquals(1, schema.getEnumOrdinal("GREEN"));
  }

  /**
   * Covers the duplicate-symbol branch of enum validation.
   */
  @Test(expected = SchemaParseException.class)
  public void createEnum_withDuplicateSymbol_throwsSchemaParseException() {
    Schema.createEnum("Color", null, "org.example", Arrays.asList("RED", "RED"));
  }

  /**
   * Covers the invalid-symbol branch of enum validation.
   */
  @Test(expected = SchemaParseException.class)
  public void createEnum_withInvalidSymbol_throwsSchemaParseException() {
    Schema.createEnum("Color", null, "org.example", Arrays.asList("RED", "1BAD"));
  }

  /*
   * CFG setFields(List<Field>):
   * entry -> fields already set? => throw
   *   -> iterate incoming fields
   *      -> field position already assigned => throw reused field
   *      -> fresh field => assign position and store
   * lock list -> save fields -> return
   */

  /**
   * Covers the nominal branch of field assignment, including deterministic
   * position numbering.
   */
  @Test
  public void setFields_withFreshFields_assignsPositionsInOrder() {
    Schema record = Schema.createRecord("User", null, "org.example", false);

    record.setFields(Arrays.asList(
        field("id", Schema.create(Schema.Type.INT)),
        field("name", Schema.create(Schema.Type.STRING))));

    assertEquals(0, record.getField("id").pos());
    assertEquals(1, record.getField("name").pos());
  }

  /**
   * Covers the guard branch that rejects a second invocation of
   * {@code setFields}.
   */
  @Test(expected = AvroRuntimeException.class)
  public void setFields_calledTwice_throwsForAlreadySetBranch() {
    Schema record = Schema.createRecord("User", null, "org.example", false);
    record.setFields(Collections.singletonList(field("id", Schema.create(Schema.Type.INT))));

    record.setFields(Collections.singletonList(field("name", Schema.create(Schema.Type.STRING))));
  }

  /**
   * Covers the branch that rejects field instances already bound to a previous
   * record.
   */
  @Test(expected = AvroRuntimeException.class)
  public void setFields_withReusedField_throwsForPreviouslyAssignedFieldBranch() {
    Schema.Field shared = field("id", Schema.create(Schema.Type.INT));
    Schema first = Schema.createRecord("First", null, "org.example", false);
    first.setFields(Collections.singletonList(shared));

    Schema second = Schema.createRecord("Second", null, "org.example", false);
    second.setFields(Collections.singletonList(shared));
  }

  /*
   * CFG equals(Object):
   * base Schema.equals -> self? / other is Schema? / same type? / props equal?
   * RecordSchema.equals -> self? / other is RecordSchema? / same name? /
   * props equal? / already seen recursive pair? / compare fields
   */

  /**
   * Covers the base {@link Schema#equals(Object)} branches for self-comparison,
   * non-schema inputs and type mismatch.
   */
  @Test
  public void equals_onPrimitiveSchema_coversSelfNonSchemaAndTypeMismatchBranches() {
    Schema intSchema = Schema.create(Schema.Type.INT);

    assertEquals(intSchema, intSchema);
    assertFalse(intSchema.equals("int"));
    assertFalse(intSchema.equals(Schema.create(Schema.Type.LONG)));
  }

  /**
   * Covers the record-equality branch that fails before field comparison when
   * record names differ.
   */
  @Test
  public void equals_onRecordsWithDifferentNames_returnsFalseBeforeFieldComparison() {
    Schema left = Schema.createRecord("Left", null, "org.example", false);
    Schema right = Schema.createRecord("Right", null, "org.example", false);
    left.setFields(Collections.singletonList(field("id", Schema.create(Schema.Type.INT))));
    right.setFields(Collections.singletonList(field("id", Schema.create(Schema.Type.INT))));

    assertFalse(left.equals(right));
  }

  /**
   * Covers the record-equality branch that fails before recursive field
   * traversal when custom properties differ.
   */
  @Test
  public void equals_onRecordsWithDifferentProps_returnsFalseBeforeRecursiveFieldWalk() {
    Schema left = Schema.createRecord("User", null, "org.example", false);
    Schema right = Schema.createRecord("User", null, "org.example", false);
    left.setFields(Collections.singletonList(field("id", Schema.create(Schema.Type.INT))));
    right.setFields(Collections.singletonList(field("id", Schema.create(Schema.Type.INT))));
    left.addProp("custom", "left");

    assertFalse(left.equals(right));
  }

  /**
   * Covers the cycle-protection branch in recursive record equality, verifying
   * termination via the seen-pair set.
   */
  @Test
  public void equals_onRecursiveRecords_usesSeenSetToTerminateAndReturnTrue() {
    Schema left = recursiveRecord("Node");
    Schema right = recursiveRecord("Node");

    assertTrue(left.equals(right));
  }
}
