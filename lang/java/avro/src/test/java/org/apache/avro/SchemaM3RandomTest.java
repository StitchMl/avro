/**
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements.  See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership.  The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.apache.avro;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertSame;
import static org.junit.Assert.assertTrue;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.util.Arrays;
import java.util.Collections;

import org.junit.Test;

/**
 * Randoop-style regression suite for {@link Schema}.
 *
 * <p>Tests follow the Randoop numbering convention ({@code test01}…{@code test12}) and
 * record concrete return-value observations discovered during random exploration of
 * the public API. Each test captures a short calling sequence whose assertions
 * stabilise the behaviour against future regressions. No mocking is used; the
 * focus is on sequences of factory and accessor calls that a random test generator
 * would produce and that complement the existing category-partition and
 * coverage-guided suites.</p>
 */
public class SchemaM3RandomTest {

  // ---------------------------------------------------------------------------
  // test01 — Schema.create(INT): type and name are stable
  // ---------------------------------------------------------------------------

  /**
   * Randoop sequence: create an INT schema and check its type and getName().
   * Regression: getName() must return the lowercase Avro type name "int".
   */
  @Test
  public void test01() {
    Schema s = Schema.create(Schema.Type.INT);
    assertEquals(Schema.Type.INT, s.getType());
    assertEquals("int", s.getName());
  }

  // ---------------------------------------------------------------------------
  // test02 — Schema.create(NULL): type and name
  // ---------------------------------------------------------------------------

  /**
   * Randoop sequence: create a NULL schema and verify type and name.
   * Regression: getName() must return "null" for the NULL type.
   */
  @Test
  public void test02() {
    Schema s = Schema.create(Schema.Type.NULL);
    assertEquals(Schema.Type.NULL, s.getType());
    assertEquals("null", s.getName());
  }

  // ---------------------------------------------------------------------------
  // test03 — Schema.create(BOOLEAN): hashCode is stable across calls
  // ---------------------------------------------------------------------------

  /**
   * Randoop sequence: call hashCode() twice on the same schema instance.
   * Regression: hashCode must be deterministic within a single run.
   */
  @Test
  public void test03() {
    Schema s = Schema.create(Schema.Type.BOOLEAN);
    int h1 = s.hashCode();
    int h2 = s.hashCode();
    assertEquals(h1, h2);
  }

  // ---------------------------------------------------------------------------
  // test04 — Schema.createFixed(size=0): FIXED type, fixedSize == 0
  // ---------------------------------------------------------------------------

  /**
   * Randoop sequence: create a FIXED schema with size zero.
   * Regression: getFixedSize() must return 0 and getType() must be FIXED.
   */
  @Test
  public void test04() {
    Schema s = Schema.createFixed("F", null, "org.randoop", 0);
    assertEquals(Schema.Type.FIXED, s.getType());
    assertEquals(0, s.getFixedSize());
  }

  // ---------------------------------------------------------------------------
  // test05 — Schema.createArray: element type survives getElementType chain
  // ---------------------------------------------------------------------------

  /**
   * Randoop sequence: wrap a STRING schema in an array and recover the element.
   * Regression: getElementType() must return the exact same instance.
   */
  @Test
  public void test05() {
    Schema inner = Schema.create(Schema.Type.STRING);
    Schema arr = Schema.createArray(inner);
    assertEquals(Schema.Type.ARRAY, arr.getType());
    assertSame(inner, arr.getElementType());
  }

  // ---------------------------------------------------------------------------
  // test06 — Schema.createMap: value type survives getValueType chain
  // ---------------------------------------------------------------------------

  /**
   * Randoop sequence: wrap a LONG schema in a map and recover the value type.
   * Regression: getValueType() must return the exact same instance.
   */
  @Test
  public void test06() {
    Schema inner = Schema.create(Schema.Type.LONG);
    Schema map = Schema.createMap(inner);
    assertEquals(Schema.Type.MAP, map.getType());
    assertSame(inner, map.getValueType());
  }

  // ---------------------------------------------------------------------------
  // test07 — Schema.createUnion(null, string): UNION with two members
  // ---------------------------------------------------------------------------

  /**
   * Randoop sequence: create a nullable-string union and check type and size.
   * Regression: getTypes().size() must equal 2.
   */
  @Test
  public void test07() {
    Schema u = Schema.createUnion(Arrays.asList(
        Schema.create(Schema.Type.NULL),
        Schema.create(Schema.Type.STRING)));
    assertEquals(Schema.Type.UNION, u.getType());
    assertEquals(2, u.getTypes().size());
  }

  // ---------------------------------------------------------------------------
  // test08 — Parser().parse(String): returns non-null RECORD schema
  // ---------------------------------------------------------------------------

  /**
   * Randoop sequence: create a fresh Parser and parse a minimal record JSON.
   * Regression: result must not be null and must have type RECORD.
   */
  @Test
  public void test08() {
    Schema s = new Schema.Parser().parse(
        "{\"type\":\"record\",\"name\":\"R\",\"fields\":[]}");
    assertNotNull(s);
    assertEquals(Schema.Type.RECORD, s.getType());
  }

  // ---------------------------------------------------------------------------
  // test09 — Parser.getValidate() default is true
  // ---------------------------------------------------------------------------

  /**
   * Randoop sequence: construct a Parser and read the validate flag.
   * Regression: default must be true.
   */
  @Test
  public void test09() {
    Schema.Parser p = new Schema.Parser();
    assertTrue(p.getValidate());
  }

  // ---------------------------------------------------------------------------
  // test10 — Parser.setValidate(false): reflected by getValidate(); fluent return
  // ---------------------------------------------------------------------------

  /**
   * Randoop sequence: call setValidate(false) and verify the result and return value.
   * Regression: getValidate() must return false; setValidate() must return the same
   * Parser instance (fluent builder pattern).
   */
  @Test
  public void test10() {
    Schema.Parser p = new Schema.Parser();
    Schema.Parser returned = p.setValidate(false);
    assertFalse(p.getValidate());
    assertSame(p, returned);
  }

  // ---------------------------------------------------------------------------
  // test11 — Parser.parse(InputStream): minimal record schema via stream
  // ---------------------------------------------------------------------------

  /**
   * Randoop sequence: parse a schema from a ByteArrayInputStream.
   * Regression: result name and type must match the JSON content.
   */
  @Test
  public void test11() throws IOException {
    byte[] bytes =
        "{\"type\":\"record\",\"name\":\"IS\",\"fields\":[]}"
            .getBytes("UTF-8");
    Schema s = new Schema.Parser().parse(new ByteArrayInputStream(bytes));
    assertEquals("IS", s.getName());
    assertEquals(Schema.Type.RECORD, s.getType());
  }

  // ---------------------------------------------------------------------------
  // test12 — createRecord(null namespace): getNamespace() null, getFullName() bare name
  // ---------------------------------------------------------------------------

  /**
   * Randoop sequence: create a record with a null namespace and inspect the name.
   * Regression: getNamespace() must return null; getFullName() must equal the
   * bare name without a dot-separator.
   */
  @Test
  public void test12() {
    Schema s = Schema.createRecord("NoNs", null, null, false);
    s.setFields(Collections.<Schema.Field>emptyList());
    assertNull(s.getNamespace());
    assertEquals("NoNs", s.getFullName());
  }
}
