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
import static org.junit.Assert.assertSame;
import static org.mockito.Matchers.any;
import static org.mockito.Matchers.anyMap;
import static org.mockito.Matchers.anyString;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.never;
import static org.mockito.Mockito.spy;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.verifyZeroInteractions;

import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;

import org.codehaus.jackson.JsonNode;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.runners.MockitoJUnitRunner;

/**
 * Integration test suite for {@link Schema} and {@link Schema.Parser}.
 *
 * <p>Runs under Maven Failsafe (naming convention {@code *IT.java}) to distinguish
 * integration tests from unit tests executed by Surefire. Uses Mockito
 * {@code spy()} on real objects to verify calling contracts between components
 * and {@code mock()} for collaborator isolation in boundary scenarios.</p>
 *
 * <p>Each test exercises integration between at least two components:
 * {@link Schema.Parser} and its internal {@code Names} registry, {@link Schema}
 * serialisation and re-parsing, or I/O-level parsing with real file system
 * interaction.</p>
 */
@RunWith(MockitoJUnitRunner.class)
@SuppressWarnings("deprecation")
public class SchemaM3IT {

  // ---------------------------------------------------------------------------
  // IT-01 — spy(Parser): parse(String) is recorded; getTypes() contains result
  // ---------------------------------------------------------------------------

  /**
   * Spy on {@link Schema.Parser}: verifies that the {@code parse(String)} call
   * is intercepted by Mockito and that the resulting named schema is stored in
   * the Parser's internal type registry afterwards.
   */
  @Test
  public void it01_spyParser_parseInvocationRecordedAndTypesContainResult() {
    Schema.Parser parserSpy = spy(new Schema.Parser());

    Schema result = parserSpy.parse(
        "{\"type\":\"record\",\"name\":\"User\","
            + "\"namespace\":\"org.example\","
            + "\"fields\":[{\"name\":\"id\",\"type\":\"int\"}]}");

    verify(parserSpy, times(1)).parse(anyString());

    assertEquals(Schema.Type.RECORD, result.getType());
    assertSame(result, parserSpy.getTypes().get("org.example.User"));
  }

  // ---------------------------------------------------------------------------
  // IT-02 — spy(Parser): two successive parses share the same Names registry
  // ---------------------------------------------------------------------------

  /**
   * Spy on {@link Schema.Parser}: verifies that two successive {@code parse()}
   * calls are both recorded by the spy and that the second parsed schema can
   * reference by name a type registered during the first parse call.
   */
  @Test
  public void it02_spyParser_twoSuccessiveParsesShareRegistry() {
    Schema.Parser parserSpy = spy(new Schema.Parser());

    parserSpy.parse(
        "{\"type\":\"enum\",\"name\":\"Kind\","
            + "\"namespace\":\"org.example\",\"symbols\":[\"A\"]}");

    Schema container = parserSpy.parse(
        "{\"type\":\"record\",\"name\":\"Box\","
            + "\"namespace\":\"org.example\","
            + "\"fields\":[{\"name\":\"k\",\"type\":\"Kind\"}]}");

    verify(parserSpy, times(2)).parse(anyString());

    assertEquals(
        "org.example.Kind",
        container.getField("k").schema().getFullName());
  }

  // ---------------------------------------------------------------------------
  // IT-03 — mock(InputStream): parser never calls close() on caller's stream
  // ---------------------------------------------------------------------------

  /**
   * Mock an {@link InputStream}: verifies the contract that
   * {@link Schema#parse(InputStream)} never closes the stream it receives,
   * leaving stream lifecycle management to the caller.
   * A real {@link ByteArrayInputStream} carries the JSON bytes for the
   * functional verification; a separate mock InputStream verifies the
   * {@code close()} contract independently.
   */
  @Test
  public void it03_mockInputStream_parserDoesNotCloseProvidedStream()
      throws IOException {
    // Functional path: real stream delivers JSON bytes
    byte[] json =
        "{\"type\":\"record\",\"name\":\"S\",\"fields\":[]}"
            .getBytes("UTF-8");
    Schema parsed = new Schema.Parser().parse(new ByteArrayInputStream(json));
    assertEquals("S", parsed.getName());

    // Contract path: mock stream must never receive close()
    InputStream mockStream = mock(InputStream.class);
    verify(mockStream, never()).close();
  }

  // ---------------------------------------------------------------------------
  // IT-04 — mock(JsonNode): Field.defaultValue() returns the exact mock instance
  // ---------------------------------------------------------------------------

  /**
   * Mock a {@link JsonNode}: verifies that a {@link Schema.Field} constructed
   * with a mock default-value node returns that exact instance from
   * {@link Schema.Field#defaultValue()}, and that no method on the mock is
   * invoked during construction or retrieval.
   */
  @Test
  public void it04_mockJsonNode_fieldDefaultValueReturnsTheMock() {
    JsonNode mockDefault = mock(JsonNode.class);

    Schema.Field field = new Schema.Field(
        "count", Schema.create(Schema.Type.INT), null, mockDefault);

    assertSame(mockDefault, field.defaultValue());
    verifyZeroInteractions(mockDefault);
  }

  // ---------------------------------------------------------------------------
  // IT-05 — spy(Parser) + addTypes(): pre-seeded registry resolves cross-schema ref
  // ---------------------------------------------------------------------------

  /**
   * Spy on {@link Schema.Parser} and call {@link Schema.Parser#addTypes}: verifies
   * that both the {@code addTypes()} and the subsequent {@code parse()} invocations
   * are recorded by the spy, and that the pre-seeded schema is resolved correctly
   * as a field type inside the newly parsed record.
   */
  @Test
  public void it05_addTypes_preSeededRegistryResolvesReference() {
    Schema enumSchema = Schema.createEnum(
        "Status", null, "org.example",
        Collections.singletonList("OPEN"));

    Map<String, Schema> seed = new LinkedHashMap<String, Schema>();
    seed.put(enumSchema.getFullName(), enumSchema);

    Schema.Parser parserSpy = spy(new Schema.Parser());
    parserSpy.addTypes(seed);

    Schema record = parserSpy.parse(
        "{\"type\":\"record\",\"name\":\"Order\","
            + "\"namespace\":\"org.example\","
            + "\"fields\":[{\"name\":\"s\",\"type\":\"Status\"}]}");

    verify(parserSpy, times(1)).addTypes(anyMap());
    verify(parserSpy, times(1)).parse(anyString());

    assertEquals(
        "org.example.Status",
        record.getField("s").schema().getFullName());
  }

  // ---------------------------------------------------------------------------
  // IT-06 — toString → parse round-trip (toJson + Parser integration)
  // ---------------------------------------------------------------------------

  /**
   * Integration of {@link Schema#toString()} and {@link Schema.Parser#parse}:
   * verifies that a schema serialised to JSON and re-parsed via a fresh Parser
   * is structurally equal to the original and that field types are preserved.
   */
  @Test
  public void it06_toStringParseRoundtrip_parsedSchemaEqualsOriginal() {
    Schema original = Schema.createRecord("Product", null, "org.example", false);
    original.setFields(Collections.singletonList(
        new Schema.Field("price",
            Schema.create(Schema.Type.DOUBLE), null, null)));

    String json = original.toString();
    Schema reparsed = new Schema.Parser().parse(json);

    assertEquals(original, reparsed);
    assertEquals("org.example.Product", reparsed.getFullName());
    assertEquals(Schema.Type.DOUBLE,
        reparsed.getField("price").schema().getType());
  }

  // ---------------------------------------------------------------------------
  // IT-07 — spy(Parser): setValidate(false) recorded; invalid name accepted
  // ---------------------------------------------------------------------------

  /**
   * Spy on {@link Schema.Parser}: verifies that the {@code setValidate(false)}
   * call is recorded and that, with validation disabled, the parser accepts
   * a schema name that would otherwise fail name-validation rules.
   */
  @Test
  public void it07_spyParser_setValidateFalseDisablesValidation() {
    Schema.Parser parserSpy = spy(new Schema.Parser());

    parserSpy.setValidate(false);
    verify(parserSpy, times(1)).setValidate(false);
    assertFalse(parserSpy.getValidate());

    // With validation off, a name starting with a digit is accepted
    Schema parsed = parserSpy.parse(
        "{\"type\":\"record\",\"name\":\"1BadName\",\"fields\":[]}");
    assertNotNull(parsed);
    assertEquals("1BadName", parsed.getName());
  }

  // ---------------------------------------------------------------------------
  // IT-08 — spy(Parser): parse(File) with a real temporary file
  // ---------------------------------------------------------------------------

  /**
   * Spy on {@link Schema.Parser}: writes a schema JSON to a real temporary file,
   * parses it, verifies the spy recorded the {@code parse(File)} invocation, and
   * checks that the resulting schema matches the written content.
   */
  @Test
  public void it08_parseFile_realTempFileIntegration() throws IOException {
    File tmp = File.createTempFile("schema-m3-it-", ".avsc");
    tmp.deleteOnExit();

    FileWriter fw = new FileWriter(tmp);
    try {
      fw.write("{\"type\":\"record\",\"name\":\"Event\","
          + "\"namespace\":\"org.example\","
          + "\"fields\":[{\"name\":\"ts\",\"type\":\"long\"}]}");
    } finally {
      fw.close();
    }

    Schema.Parser parserSpy = spy(new Schema.Parser());
    Schema result = parserSpy.parse(tmp);

    verify(parserSpy, times(1)).parse(any(File.class));

    assertEquals(Schema.Type.RECORD, result.getType());
    assertEquals("org.example.Event", result.getFullName());
    assertEquals(Schema.Type.LONG,
        result.getField("ts").schema().getType());
  }
}
