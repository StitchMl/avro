package org.apache.avro;

import org.junit.Test;

public class SchemaM3RandomTest {

 public static boolean debug = false;

 public void assertBooleanArrayEquals(boolean[] expectedArray, boolean[] actualArray) {
 if (expectedArray.length != actualArray.length) {
 throw new AssertionError("Array lengths differ: " + expectedArray.length + " != " + actualArray.length);
 }
 for (int i = 0; i < expectedArray.length; i++) {
 if (expectedArray[i] != actualArray[i]) {
 throw new AssertionError("Arrays differ at index " + i + ": " + expectedArray[i] + " != " + actualArray[i]);
 }
 }
 }

 @Test
 public void test001() throws Throwable {
 if (debug)
 System.out.format("%n%s%n", "SchemaRandoopGen0.test001");
 org.apache.avro.Schema.Field.Order order0 = org.apache.avro.Schema.Field.Order.ASCENDING;
 org.junit.Assert.assertTrue("'" + order0 + "' != '" + org.apache.avro.Schema.Field.Order.ASCENDING + "'", order0.equals(org.apache.avro.Schema.Field.Order.ASCENDING));
 }

 @Test
 public void test002() throws Throwable {
 if (debug)
 System.out.format("%n%s%n", "SchemaRandoopGen0.test002");
 // The following exception was thrown during execution in test generation
 try {
 org.apache.avro.Schema.LockableArrayList<java.util.AbstractList<java.lang.Comparable<java.lang.String>>> strComparableListList1 = new org.apache.avro.Schema.LockableArrayList<java.util.AbstractList<java.lang.Comparable<java.lang.String>>>((int) (short) -1);
 org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal Capacity: -1");
 } catch (java.lang.IllegalArgumentException e) {
 // Expected exception.
 }
 }

 @Test
 public void test003() throws Throwable {
 if (debug)
 System.out.format("%n%s%n", "SchemaRandoopGen0.test003");
 // The following exception was thrown during execution in test generation
 try {
 org.apache.avro.Schema schema4 = org.apache.avro.Schema.createRecord("", "", "hi!", true);
 org.junit.Assert.fail("Expected exception of type org.apache.avro.SchemaParseException; message: Empty name");
 } catch (org.apache.avro.SchemaParseException e) {
 // Expected exception.
 }
 }

 @Test
 public void test004() throws Throwable {
 if (debug)
 System.out.format("%n%s%n", "SchemaRandoopGen0.test004");
 org.apache.avro.Schema.LockableArrayList<java.lang.Comparable<java.lang.String>> strComparableList0 = new org.apache.avro.Schema.LockableArrayList<java.lang.Comparable<java.lang.String>>();
 org.apache.avro.Schema.LockableArrayList<java.lang.Comparable<java.lang.String>> strComparableList2 = new org.apache.avro.Schema.LockableArrayList<java.lang.Comparable<java.lang.String>>();
 boolean boolean3 = strComparableList2.add((java.lang.Comparable<java.lang.String>) "");
 boolean boolean5 = strComparableList2.add((java.lang.Comparable<java.lang.String>) "hi!");
 boolean boolean6 = strComparableList0.retainAll((java.util.Collection<java.lang.Comparable<java.lang.String>>) strComparableList2);
 // The following exception was thrown during execution in test generation
 try {
 java.util.ListIterator<java.lang.Comparable<java.lang.String>> strComparableItor8 = strComparableList2.listIterator((int) (short) -1);
 org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: -1");
 } catch (java.lang.IndexOutOfBoundsException e) {
 // Expected exception.
 }
 org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
 org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
 org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
 }

 @Test
 public void test005() throws Throwable {
 if (debug)
 System.out.format("%n%s%n", "SchemaRandoopGen0.test005");
 org.apache.avro.Schema.Type type0 = org.apache.avro.Schema.Type.ARRAY;
 // The following exception was thrown during execution in test generation
 try {
 org.apache.avro.Schema schema1 = org.apache.avro.Schema.create(type0);
 org.junit.Assert.fail("Expected exception of type org.apache.avro.AvroRuntimeException; message: Can't create a: ARRAY");
 } catch (org.apache.avro.AvroRuntimeException e) {
 // Expected exception.
 }
 org.junit.Assert.assertTrue("'" + type0 + "' != '" + org.apache.avro.Schema.Type.ARRAY + "'", type0.equals(org.apache.avro.Schema.Type.ARRAY));
 }

 @Test
 public void test006() throws Throwable {
 if (debug)
 System.out.format("%n%s%n", "SchemaRandoopGen0.test006");
 org.apache.avro.Schema.Type type0 = org.apache.avro.Schema.Type.FIXED;
 org.junit.Assert.assertTrue("'" + type0 + "' != '" + org.apache.avro.Schema.Type.FIXED + "'", type0.equals(org.apache.avro.Schema.Type.FIXED));
 }

 @Test
 public void test007() throws Throwable {
 if (debug)
 System.out.format("%n%s%n", "SchemaRandoopGen0.test007");
 java.io.InputStream inputStream0 = null;
 // The following exception was thrown during execution in test generation
 try {
 org.apache.avro.Schema schema1 = org.apache.avro.Schema.parse(inputStream0);
 org.junit.Assert.fail("Expected exception of type java.io.EOFException; message: No content to map to Object due to end of input");
 } catch (java.io.EOFException e) {
 // Expected exception.
 }
 }

 @Test
 public void test008() throws Throwable {
 if (debug)
 System.out.format("%n%s%n", "SchemaRandoopGen0.test008");
 org.apache.avro.Schema.Type type0 = org.apache.avro.Schema.Type.MAP;
 org.junit.Assert.assertTrue("'" + type0 + "' != '" + org.apache.avro.Schema.Type.MAP + "'", type0.equals(org.apache.avro.Schema.Type.MAP));
 }

 @Test
 public void test009() throws Throwable {
 if (debug)
 System.out.format("%n%s%n", "SchemaRandoopGen0.test009");
 org.apache.avro.Schema.LockableArrayList<java.lang.Comparable<java.lang.String>> strComparableList1 = new org.apache.avro.Schema.LockableArrayList<java.lang.Comparable<java.lang.String>>();
 boolean boolean2 = strComparableList1.add((java.lang.Comparable<java.lang.String>) "");
 boolean boolean4 = strComparableList1.add((java.lang.Comparable<java.lang.String>) "hi!");
 // The following exception was thrown during execution in test generation
 try {
 java.lang.Comparable<java.lang.String> strComparable7 = strComparableList1.set(100, (java.lang.Comparable<java.lang.String>) "");
 org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 100, Size: 2");
 } catch (java.lang.IndexOutOfBoundsException e) {
 // Expected exception.
 }
 org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
 org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
 }

 @Test
 public void test010() throws Throwable {
 if (debug)
 System.out.format("%n%s%n", "SchemaRandoopGen0.test010");
 org.apache.avro.Schema.Field.Order order0 = org.apache.avro.Schema.Field.Order.IGNORE;
 org.junit.Assert.assertTrue("'" + order0 + "' != '" + org.apache.avro.Schema.Field.Order.IGNORE + "'", order0.equals(org.apache.avro.Schema.Field.Order.IGNORE));
 }

 @Test
 public void test011() throws Throwable {
 if (debug)
 System.out.format("%n%s%n", "SchemaRandoopGen0.test011");
 // The following exception was thrown during execution in test generation
 try {
 org.apache.avro.Schema schema4 = org.apache.avro.Schema.createFixed("hi!", "", "hi!", 10);
 org.junit.Assert.fail("Expected exception of type org.apache.avro.SchemaParseException; message: Illegal character in: hi!");
 } catch (org.apache.avro.SchemaParseException e) {
 // Expected exception.
 }
 }

 @Test
 public void test012() throws Throwable {
 if (debug)
 System.out.format("%n%s%n", "SchemaRandoopGen0.test012");
 java.util.ArrayList<java.lang.Comparable<java.lang.String>> strComparableList1 = new java.util.ArrayList<java.lang.Comparable<java.lang.String>>();
 boolean boolean2 = strComparableList1.add((java.lang.Comparable<java.lang.String>) "hi!");
 // The following exception was thrown during execution in test generation
 try {
 java.lang.Comparable<java.lang.String> strComparable5 = strComparableList1.set((int) (short) 100, (java.lang.Comparable<java.lang.String>) "hi!");
 org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 100, Size: 1");
 } catch (java.lang.IndexOutOfBoundsException e) {
 // Expected exception.
 }
 org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
 }

 @Test
 public void test013() throws Throwable {
 if (debug)
 System.out.format("%n%s%n", "SchemaRandoopGen0.test013");
 // The following exception was thrown during execution in test generation
 try {
 org.codehaus.jackson.JsonNode jsonNode1 = org.apache.avro.Schema.parseJson("hi!");
 org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: org.codehaus.jackson.JsonParseException: Unexpected character ('h' (code 104)): expected a valid value (number, String, array, object, 'true', 'false' or 'null')? at [Source: java.io.StringReader@103236a2; line: 1, column: 2]");
 } catch (java.lang.RuntimeException e) {
 // Expected exception.
 }
 }

 @Test
 public void test014() throws Throwable {
 if (debug)
 System.out.format("%n%s%n", "SchemaRandoopGen0.test014");
 org.apache.avro.Schema.Type type0 = org.apache.avro.Schema.Type.LONG;
 org.junit.Assert.assertTrue("'" + type0 + "' != '" + org.apache.avro.Schema.Type.LONG + "'", type0.equals(org.apache.avro.Schema.Type.LONG));
 }

 @Test
 public void test015() throws Throwable {
 if (debug)
 System.out.format("%n%s%n", "SchemaRandoopGen0.test015");
 org.apache.avro.Schema.Type type0 = org.apache.avro.Schema.Type.INT;
 java.lang.Class<?> wildcardClass1 = type0.getClass();
 org.junit.Assert.assertTrue("'" + type0 + "' != '" + org.apache.avro.Schema.Type.INT + "'", type0.equals(org.apache.avro.Schema.Type.INT));
 org.junit.Assert.assertNotNull(wildcardClass1);
 }

 @Test
 public void test016() throws Throwable {
 if (debug)
 System.out.format("%n%s%n", "SchemaRandoopGen0.test016");
 org.apache.avro.Schema.Type type0 = org.apache.avro.Schema.Type.BYTES;
 org.junit.Assert.assertTrue("'" + type0 + "' != '" + org.apache.avro.Schema.Type.BYTES + "'", type0.equals(org.apache.avro.Schema.Type.BYTES));
 }

 @Test
 public void test017() throws Throwable {
 if (debug)
 System.out.format("%n%s%n", "SchemaRandoopGen0.test017");
 // The following exception was thrown during execution in test generation
 try {
 org.apache.avro.Schema schema4 = org.apache.avro.Schema.createFixed("hi!", "hi!", "hi!", (int) (short) 0);
 org.junit.Assert.fail("Expected exception of type org.apache.avro.SchemaParseException; message: Illegal character in: hi!");
 } catch (org.apache.avro.SchemaParseException e) {
 // Expected exception.
 }
 }

 @Test
 public void test018() throws Throwable {
 if (debug)
 System.out.format("%n%s%n", "SchemaRandoopGen0.test018");
 org.apache.avro.Schema schema0 = null;
 org.apache.avro.Schema schema1 = org.apache.avro.Schema.createMap(schema0);
 // The following exception was thrown during execution in test generation
 try {
 java.lang.String str2 = schema1.getNamespace();
 org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
 } catch (java.lang.NullPointerException e) {
 // Expected exception.
 }
 org.junit.Assert.assertNotNull(schema1);
 }

 @Test
 public void test019() throws Throwable {
 if (debug)
 System.out.format("%n%s%n", "SchemaRandoopGen0.test019");
 org.apache.avro.Schema.LockableArrayList<java.lang.Comparable<java.lang.String>> strComparableList0 = new org.apache.avro.Schema.LockableArrayList<java.lang.Comparable<java.lang.String>>();
 org.apache.avro.Schema.LockableArrayList<java.lang.Comparable<java.lang.String>> strComparableList2 = new org.apache.avro.Schema.LockableArrayList<java.lang.Comparable<java.lang.String>>();
 boolean boolean3 = strComparableList2.add((java.lang.Comparable<java.lang.String>) "");
 boolean boolean5 = strComparableList2.add((java.lang.Comparable<java.lang.String>) "hi!");
 boolean boolean6 = strComparableList0.retainAll((java.util.Collection<java.lang.Comparable<java.lang.String>>) strComparableList2);
 boolean boolean7 = strComparableList2.isEmpty();
 strComparableList2.add(2, (java.lang.Comparable<java.lang.String>) "hi!");
 org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
 org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
 org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
 org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
 }

 @Test
 public void test020() throws Throwable {
 if (debug)
 System.out.format("%n%s%n", "SchemaRandoopGen0.test020");
 org.apache.avro.Schema schema0 = null;
 org.apache.avro.Schema schema1 = org.apache.avro.Schema.createMap(schema0);
 // The following exception was thrown during execution in test generation
 try {
 java.util.List<org.apache.avro.Schema.Field> fieldList2 = schema1.getFields();
 org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
 } catch (java.lang.NullPointerException e) {
 // Expected exception.
 }
 org.junit.Assert.assertNotNull(schema1);
 }

 @Test
 public void test021() throws Throwable {
 if (debug)
 System.out.format("%n%s%n", "SchemaRandoopGen0.test021");
 org.apache.avro.Schema.LockableArrayList<java.lang.Comparable<java.lang.String>> strComparableList0 = new org.apache.avro.Schema.LockableArrayList<java.lang.Comparable<java.lang.String>>();
 java.util.stream.Stream<java.lang.Comparable<java.lang.String>> strComparableStream1 = strComparableList0.stream();
 // The following exception was thrown during execution in test generation
 try {
 java.lang.Comparable<java.lang.String> strComparable3 = strComparableList0.remove((int) ' ');
 org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 32, Size: 0");
 } catch (java.lang.IndexOutOfBoundsException e) {
 // Expected exception.
 }
 org.junit.Assert.assertNotNull(strComparableStream1);
 }

 @Test
 public void test022() throws Throwable {
 if (debug)
 System.out.format("%n%s%n", "SchemaRandoopGen0.test022");
 org.apache.avro.Schema.LockableArrayList<java.lang.Comparable<java.lang.String>> strComparableList0 = new org.apache.avro.Schema.LockableArrayList<java.lang.Comparable<java.lang.String>>();
 org.apache.avro.Schema.LockableArrayList<java.lang.Comparable<java.lang.String>> strComparableList2 = new org.apache.avro.Schema.LockableArrayList<java.lang.Comparable<java.lang.String>>();
 boolean boolean3 = strComparableList2.add((java.lang.Comparable<java.lang.String>) "");
 boolean boolean5 = strComparableList2.add((java.lang.Comparable<java.lang.String>) "hi!");
 boolean boolean6 = strComparableList0.retainAll((java.util.Collection<java.lang.Comparable<java.lang.String>>) strComparableList2);
 java.lang.Object obj7 = null;
 int int8 = strComparableList0.lastIndexOf(obj7);
 // The following exception was thrown during execution in test generation
 try {
 java.util.List<java.lang.Comparable<java.lang.String>> strComparableList11 = strComparableList0.subList((int) (byte) -1, (int) 'a');
 org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: fromIndex = -1");
 } catch (java.lang.IndexOutOfBoundsException e) {
 // Expected exception.
 }
 org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
 org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
 org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
 org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
 }

 @Test
 public void test023() throws Throwable {
 if (debug)
 System.out.format("%n%s%n", "SchemaRandoopGen0.test023");
 org.apache.avro.Schema schema0 = null;
 org.apache.avro.Schema schema1 = org.apache.avro.Schema.createMap(schema0);
 org.apache.avro.Schema.Field[] fieldArray2 = new org.apache.avro.Schema.Field[] {};
 java.util.ArrayList<org.apache.avro.Schema.Field> fieldList3 = new java.util.ArrayList<org.apache.avro.Schema.Field>();
 boolean boolean4 = java.util.Collections.addAll((java.util.Collection<org.apache.avro.Schema.Field>) fieldList3, fieldArray2);
 // The following exception was thrown during execution in test generation
 try {
 schema1.setFields((java.util.List<org.apache.avro.Schema.Field>) fieldList3);
 org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
 } catch (java.lang.NullPointerException e) {
 // Expected exception.
 }
 org.junit.Assert.assertNotNull(schema1);
 org.junit.Assert.assertNotNull(fieldArray2);
 org.junit.Assert.assertArrayEquals(fieldArray2, new org.apache.avro.Schema.Field[] {});
 org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
 }

 @Test
 public void test024() throws Throwable {
 if (debug)
 System.out.format("%n%s%n", "SchemaRandoopGen0.test024");
 // The following exception was thrown during execution in test generation
 try {
 org.apache.avro.Schema schema2 = org.apache.avro.Schema.parse("", true);
 org.junit.Assert.fail("Expected exception of type org.apache.avro.SchemaParseException; message: java.io.EOFException: No content to map to Object due to end of input");
 } catch (org.apache.avro.SchemaParseException e) {
 // Expected exception.
 }
 }

 @Test
 public void test025() throws Throwable {
 if (debug)
 System.out.format("%n%s%n", "SchemaRandoopGen0.test025");
 org.apache.avro.Schema schema0 = null;
 org.apache.avro.Schema schema1 = org.apache.avro.Schema.createMap(schema0);
 // The following exception was thrown during execution in test generation
 try {
 org.apache.avro.Schema schema2 = schema1.getElementType();
 org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
 } catch (java.lang.NullPointerException e) {
 // Expected exception.
 }
 org.junit.Assert.assertNotNull(schema1);
 }

 @Test
 public void test026() throws Throwable {
 if (debug)
 System.out.format("%n%s%n", "SchemaRandoopGen0.test026");
 org.apache.avro.Schema.LockableArrayList<java.lang.Comparable<java.lang.String>> strComparableList0 = new org.apache.avro.Schema.LockableArrayList<java.lang.Comparable<java.lang.String>>();
 org.apache.avro.Schema.LockableArrayList<java.lang.Comparable<java.lang.String>> strComparableList2 = new org.apache.avro.Schema.LockableArrayList<java.lang.Comparable<java.lang.String>>();
 boolean boolean3 = strComparableList2.add((java.lang.Comparable<java.lang.String>) "");
 boolean boolean5 = strComparableList2.add((java.lang.Comparable<java.lang.String>) "hi!");
 boolean boolean6 = strComparableList0.retainAll((java.util.Collection<java.lang.Comparable<java.lang.String>>) strComparableList2);
 java.util.stream.Stream<java.lang.Comparable<java.lang.String>> strComparableStream7 = strComparableList2.parallelStream();
 org.apache.avro.Schema.LockableArrayList<java.lang.Comparable<java.lang.String>> strComparableList10 = new org.apache.avro.Schema.LockableArrayList<java.lang.Comparable<java.lang.String>>();
 boolean boolean11 = strComparableList10.add((java.lang.Comparable<java.lang.String>) "");
 boolean boolean13 = strComparableList10.add((java.lang.Comparable<java.lang.String>) "hi!");
 java.util.stream.Stream<java.lang.Comparable<java.lang.String>> strComparableStream14 = strComparableList10.parallelStream();
 // The following exception was thrown during execution in test generation
 try {
 boolean boolean15 = strComparableList2.addAll(100, (java.util.Collection<java.lang.Comparable<java.lang.String>>) strComparableList10);
 org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 100, Size: 2");
 } catch (java.lang.IndexOutOfBoundsException e) {
 // Expected exception.
 }
 org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
 org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
 org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
 org.junit.Assert.assertNotNull(strComparableStream7);
 org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
 org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
 org.junit.Assert.assertNotNull(strComparableStream14);
 }

 @Test
 public void test027() throws Throwable {
 if (debug)
 System.out.format("%n%s%n", "SchemaRandoopGen0.test027");
 org.codehaus.jackson.map.ObjectMapper objectMapper0 = org.apache.avro.Schema.MAPPER;
 org.junit.Assert.assertNotNull(objectMapper0);
 }

 @Test
 public void test028() throws Throwable {
 if (debug)
 System.out.format("%n%s%n", "SchemaRandoopGen0.test028");
 org.apache.avro.Schema schema0 = null;
 org.apache.avro.Schema schema1 = org.apache.avro.Schema.createMap(schema0);
 // The following exception was thrown during execution in test generation
 try {
 java.util.Set<java.lang.String> strSet2 = schema1.getAliases();
 org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
 } catch (java.lang.NullPointerException e) {
 // Expected exception.
 }
 org.junit.Assert.assertNotNull(schema1);
 }

 @Test
 public void test029() throws Throwable {
 if (debug)
 System.out.format("%n%s%n", "SchemaRandoopGen0.test029");
 org.apache.avro.Schema.LockableArrayList<java.lang.Comparable<java.lang.String>> strComparableList0 = new org.apache.avro.Schema.LockableArrayList<java.lang.Comparable<java.lang.String>>();
 java.util.stream.Stream<java.lang.Comparable<java.lang.String>> strComparableStream1 = strComparableList0.stream();
 // The following exception was thrown during execution in test generation
 try {
 java.util.List<java.lang.Comparable<java.lang.String>> strComparableList4 = strComparableList0.subList((int) ' ', (int) ' ');
 org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: toIndex = 32");
 } catch (java.lang.IndexOutOfBoundsException e) {
 // Expected exception.
 }
 org.junit.Assert.assertNotNull(strComparableStream1);
 }

 @Test
 public void test030() throws Throwable {
 if (debug)
 System.out.format("%n%s%n", "SchemaRandoopGen0.test030");
 org.apache.avro.Schema schema0 = null;
 org.apache.avro.Schema schema1 = org.apache.avro.Schema.createMap(schema0);
 org.apache.avro.Schema[] schemaArray2 = new org.apache.avro.Schema[] { schema0 };
 java.util.ArrayList<org.apache.avro.Schema> schemaList3 = new java.util.ArrayList<org.apache.avro.Schema>();
 boolean boolean4 = java.util.Collections.addAll((java.util.Collection<org.apache.avro.Schema>) schemaList3, schemaArray2);
 // The following exception was thrown during execution in test generation
 try {
 org.apache.avro.Schema schema5 = org.apache.avro.Schema.createUnion((java.util.List<org.apache.avro.Schema>) schemaList3);
 org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
 } catch (java.lang.NullPointerException e) {
 // Expected exception.
 }
 org.junit.Assert.assertNotNull(schema1);
 org.junit.Assert.assertNotNull(schemaArray2);
 org.junit.Assert.assertArrayEquals(schemaArray2, new org.apache.avro.Schema[] { null });
 org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
 }

 @Test
 public void test031() throws Throwable {
 if (debug)
 System.out.format("%n%s%n", "SchemaRandoopGen0.test031");
 org.apache.avro.Schema.LockableArrayList<java.lang.Comparable<java.lang.String>> strComparableList0 = new org.apache.avro.Schema.LockableArrayList<java.lang.Comparable<java.lang.String>>();
 org.apache.avro.Schema.LockableArrayList<java.lang.Comparable<java.lang.String>> strComparableList2 = new org.apache.avro.Schema.LockableArrayList<java.lang.Comparable<java.lang.String>>();
 boolean boolean3 = strComparableList2.add((java.lang.Comparable<java.lang.String>) "");
 boolean boolean5 = strComparableList2.add((java.lang.Comparable<java.lang.String>) "hi!");
 boolean boolean6 = strComparableList0.retainAll((java.util.Collection<java.lang.Comparable<java.lang.String>>) strComparableList2);
 boolean boolean8 = strComparableList0.add((java.lang.Comparable<java.lang.String>) "");
 boolean boolean10 = strComparableList0.equals((java.lang.Object) 0L);
 strComparableList0.trimToSize();
 org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
 org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
 org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
 org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
 org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
 }

 @Test
 public void test032() throws Throwable {
 if (debug)
 System.out.format("%n%s%n", "SchemaRandoopGen0.test032");
 org.apache.avro.Schema.LockableArrayList<java.lang.Comparable<java.lang.String>> strComparableList0 = new org.apache.avro.Schema.LockableArrayList<java.lang.Comparable<java.lang.String>>();
 org.apache.avro.Schema.LockableArrayList<java.lang.Comparable<java.lang.String>> strComparableList2 = new org.apache.avro.Schema.LockableArrayList<java.lang.Comparable<java.lang.String>>();
 boolean boolean3 = strComparableList2.add((java.lang.Comparable<java.lang.String>) "");
 boolean boolean5 = strComparableList2.add((java.lang.Comparable<java.lang.String>) "hi!");
 boolean boolean6 = strComparableList0.retainAll((java.util.Collection<java.lang.Comparable<java.lang.String>>) strComparableList2);
 java.lang.Object obj7 = null;
 int int8 = strComparableList0.lastIndexOf(obj7);
 // The following exception was thrown during execution in test generation
 try {
 java.util.List<java.lang.Comparable<java.lang.String>> strComparableList11 = strComparableList0.subList(2, (int) (byte) 1);
 org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: toIndex = 1");
 } catch (java.lang.IndexOutOfBoundsException e) {
 // Expected exception.
 }
 org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
 org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
 org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
 org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
 }

 @Test
 public void test033() throws Throwable {
 if (debug)
 System.out.format("%n%s%n", "SchemaRandoopGen0.test033");
 org.apache.avro.Schema.LockableArrayList<java.lang.Comparable<java.lang.String>> strComparableList0 = new org.apache.avro.Schema.LockableArrayList<java.lang.Comparable<java.lang.String>>();
 org.apache.avro.Schema.LockableArrayList<java.lang.Comparable<java.lang.String>> strComparableList2 = new org.apache.avro.Schema.LockableArrayList<java.lang.Comparable<java.lang.String>>();
 boolean boolean3 = strComparableList2.add((java.lang.Comparable<java.lang.String>) "");
 boolean boolean5 = strComparableList2.add((java.lang.Comparable<java.lang.String>) "hi!");
 boolean boolean6 = strComparableList0.retainAll((java.util.Collection<java.lang.Comparable<java.lang.String>>) strComparableList2);
 java.lang.Object obj7 = null;
 int int8 = strComparableList0.lastIndexOf(obj7);
 // The following exception was thrown during execution in test generation
 try {
 java.lang.Comparable<java.lang.String> strComparable10 = strComparableList0.remove((int) 'a');
 org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 97, Size: 0");
 } catch (java.lang.IndexOutOfBoundsException e) {
 // Expected exception.
 }
 org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
 org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
 org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
 org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
 }

 @Test
 public void test034() throws Throwable {
 if (debug)
 System.out.format("%n%s%n", "SchemaRandoopGen0.test034");
 org.apache.avro.Schema.Type type0 = org.apache.avro.Schema.Type.NULL;
 org.junit.Assert.assertTrue("'" + type0 + "' != '" + org.apache.avro.Schema.Type.NULL + "'", type0.equals(org.apache.avro.Schema.Type.NULL));
 }

 @Test
 public void test035() throws Throwable {
 if (debug)
 System.out.format("%n%s%n", "SchemaRandoopGen0.test035");
 org.apache.avro.Schema.Type type0 = org.apache.avro.Schema.Type.BOOLEAN;
 org.junit.Assert.assertTrue("'" + type0 + "' != '" + org.apache.avro.Schema.Type.BOOLEAN + "'", type0.equals(org.apache.avro.Schema.Type.BOOLEAN));
 }

 @Test
 public void test036() throws Throwable {
 if (debug)
 System.out.format("%n%s%n", "SchemaRandoopGen0.test036");
 org.apache.avro.Schema schema0 = null;
 org.apache.avro.Schema schema1 = org.apache.avro.Schema.createMap(schema0);
 // The following exception was thrown during execution in test generation
 try {
 java.util.List<org.apache.avro.Schema> schemaList2 = schema1.getTypes();
 org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
 } catch (java.lang.NullPointerException e) {
 // Expected exception.
 }
 org.junit.Assert.assertNotNull(schema1);
 }

 @Test
 public void test037() throws Throwable {
 if (debug)
 System.out.format("%n%s%n", "SchemaRandoopGen0.test037");
 // The following exception was thrown during execution in test generation
 try {
 org.codehaus.jackson.JsonNode jsonNode1 = org.apache.avro.Schema.parseJson("");
 org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: java.io.EOFException: No content to map to Object due to end of input");
 } catch (java.lang.RuntimeException e) {
 // Expected exception.
 }
 }

 @Test
 public void test038() throws Throwable {
 if (debug)
 System.out.format("%n%s%n", "SchemaRandoopGen0.test038");
 org.apache.avro.Schema schema0 = null;
 org.apache.avro.Schema schema1 = org.apache.avro.Schema.createMap(schema0);
 // The following exception was thrown during execution in test generation
 try {
 schema1.addAlias("hi!");
 org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
 } catch (java.lang.NullPointerException e) {
 // Expected exception.
 }
 org.junit.Assert.assertNotNull(schema1);
 }

 @Test
 public void test039() throws Throwable {
 if (debug)
 System.out.format("%n%s%n", "SchemaRandoopGen0.test039");
 org.apache.avro.Schema.Type type0 = org.apache.avro.Schema.Type.INT;
 org.apache.avro.Schema schema1 = org.apache.avro.Schema.create(type0);
 // The following exception was thrown during execution in test generation
 try {
 org.apache.avro.Schema schema2 = schema1.getElementType();
 org.junit.Assert.fail("Expected exception of type org.apache.avro.AvroRuntimeException; message: Not an array: \"int\"");
 } catch (org.apache.avro.AvroRuntimeException e) {
 // Expected exception.
 }
 org.junit.Assert.assertTrue("'" + type0 + "' != '" + org.apache.avro.Schema.Type.INT + "'", type0.equals(org.apache.avro.Schema.Type.INT));
 org.junit.Assert.assertNotNull(schema1);
 }

 @Test
 public void test040() throws Throwable {
 if (debug)
 System.out.format("%n%s%n", "SchemaRandoopGen0.test040");
 org.apache.avro.Schema.Type type0 = org.apache.avro.Schema.Type.INT;
 org.apache.avro.Schema schema1 = org.apache.avro.Schema.create(type0);
 // The following exception was thrown during execution in test generation
 try {
 java.util.List<java.lang.String> strList2 = schema1.getEnumSymbols();
 org.junit.Assert.fail("Expected exception of type org.apache.avro.AvroRuntimeException; message: Not an enum: \"int\"");
 } catch (org.apache.avro.AvroRuntimeException e) {
 // Expected exception.
 }
 org.junit.Assert.assertTrue("'" + type0 + "' != '" + org.apache.avro.Schema.Type.INT + "'", type0.equals(org.apache.avro.Schema.Type.INT));
 org.junit.Assert.assertNotNull(schema1);
 }

 @Test
 public void test041() throws Throwable {
 if (debug)
 System.out.format("%n%s%n", "SchemaRandoopGen0.test041");
 org.apache.avro.Schema.Type type0 = org.apache.avro.Schema.Type.UNION;
 org.junit.Assert.assertTrue("'" + type0 + "' != '" + org.apache.avro.Schema.Type.UNION + "'", type0.equals(org.apache.avro.Schema.Type.UNION));
 }

 @Test
 public void test042() throws Throwable {
 if (debug)
 System.out.format("%n%s%n", "SchemaRandoopGen0.test042");
 org.apache.avro.Schema.LockableArrayList<java.lang.Comparable<java.lang.String>> strComparableList0 = new org.apache.avro.Schema.LockableArrayList<java.lang.Comparable<java.lang.String>>();
 org.apache.avro.Schema.LockableArrayList<java.lang.Comparable<java.lang.String>> strComparableList2 = new org.apache.avro.Schema.LockableArrayList<java.lang.Comparable<java.lang.String>>();
 boolean boolean3 = strComparableList2.add((java.lang.Comparable<java.lang.String>) "");
 boolean boolean5 = strComparableList2.add((java.lang.Comparable<java.lang.String>) "hi!");
 boolean boolean6 = strComparableList0.retainAll((java.util.Collection<java.lang.Comparable<java.lang.String>>) strComparableList2);
 boolean boolean8 = strComparableList0.contains((java.lang.Object) "");
 int int10 = strComparableList0.indexOf((java.lang.Object) 1L);
 org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
 org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
 org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
 org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
 org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
 }

 @Test
 public void test043() throws Throwable {
 if (debug)
 System.out.format("%n%s%n", "SchemaRandoopGen0.test043");
 org.apache.avro.Schema.LockableArrayList<java.lang.Comparable<java.lang.String>> strComparableList0 = new org.apache.avro.Schema.LockableArrayList<java.lang.Comparable<java.lang.String>>();
 org.apache.avro.Schema.LockableArrayList<java.lang.Comparable<java.lang.String>> strComparableList2 = new org.apache.avro.Schema.LockableArrayList<java.lang.Comparable<java.lang.String>>();
 boolean boolean3 = strComparableList2.add((java.lang.Comparable<java.lang.String>) "");
 boolean boolean5 = strComparableList2.add((java.lang.Comparable<java.lang.String>) "hi!");
 boolean boolean6 = strComparableList0.retainAll((java.util.Collection<java.lang.Comparable<java.lang.String>>) strComparableList2);
 java.lang.Object obj7 = strComparableList2.clone();
 org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
 org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
 org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
 org.junit.Assert.assertNotNull(obj7);
 org.junit.Assert.assertEquals(obj7.toString(), "[, hi!]");
 org.junit.Assert.assertEquals(java.lang.String.valueOf(obj7), "[, hi!]");
 org.junit.Assert.assertEquals(java.util.Objects.toString(obj7), "[, hi!]");
 }

 @Test
 public void test044() throws Throwable {
 if (debug)
 System.out.format("%n%s%n", "SchemaRandoopGen0.test044");
 org.apache.avro.Schema.LockableArrayList<java.lang.Comparable<java.lang.String>> strComparableList1 = new org.apache.avro.Schema.LockableArrayList<java.lang.Comparable<java.lang.String>>();
 boolean boolean2 = strComparableList1.add((java.lang.Comparable<java.lang.String>) "");
 boolean boolean4 = strComparableList1.add((java.lang.Comparable<java.lang.String>) "hi!");
 java.util.stream.Stream<java.lang.Comparable<java.lang.String>> strComparableStream5 = strComparableList1.parallelStream();
 int int6 = strComparableList1.size();
 org.apache.avro.Schema.LockableArrayList<java.lang.Comparable<java.lang.String>> strComparableList7 = new org.apache.avro.Schema.LockableArrayList<java.lang.Comparable<java.lang.String>>();
 java.lang.Object obj8 = strComparableList7.clone();
 org.apache.avro.Schema.LockableArrayList<java.lang.Comparable<java.lang.String>> strComparableList10 = new org.apache.avro.Schema.LockableArrayList<java.lang.Comparable<java.lang.String>>();
 boolean boolean11 = strComparableList10.add((java.lang.Comparable<java.lang.String>) "");
 boolean boolean13 = strComparableList10.add((java.lang.Comparable<java.lang.String>) "hi!");
 java.util.stream.Stream<java.lang.Comparable<java.lang.String>> strComparableStream14 = strComparableList10.parallelStream();
 int int15 = strComparableList7.indexOf((java.lang.Object) strComparableStream14);
 int int16 = strComparableList1.indexOf((java.lang.Object) strComparableStream14);
 org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
 org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
 org.junit.Assert.assertNotNull(strComparableStream5);
 org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
 org.junit.Assert.assertNotNull(obj8);
 org.junit.Assert.assertEquals(obj8.toString(), "[]");
 org.junit.Assert.assertEquals(java.lang.String.valueOf(obj8), "[]");
 org.junit.Assert.assertEquals(java.util.Objects.toString(obj8), "[]");
 org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
 org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
 org.junit.Assert.assertNotNull(strComparableStream14);
 org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
 org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
 }

 @Test
 public void test045() throws Throwable {
 if (debug)
 System.out.format("%n%s%n", "SchemaRandoopGen0.test045");
 org.apache.avro.Schema.LockableArrayList<java.lang.Comparable<java.lang.String>> strComparableList0 = new org.apache.avro.Schema.LockableArrayList<java.lang.Comparable<java.lang.String>>();
 org.apache.avro.Schema.LockableArrayList<java.lang.Comparable<java.lang.String>> strComparableList1 = new org.apache.avro.Schema.LockableArrayList<java.lang.Comparable<java.lang.String>>();
 org.apache.avro.Schema.LockableArrayList<java.lang.Comparable<java.lang.String>> strComparableList3 = new org.apache.avro.Schema.LockableArrayList<java.lang.Comparable<java.lang.String>>();
 boolean boolean4 = strComparableList3.add((java.lang.Comparable<java.lang.String>) "");
 boolean boolean6 = strComparableList3.add((java.lang.Comparable<java.lang.String>) "hi!");
 boolean boolean7 = strComparableList1.retainAll((java.util.Collection<java.lang.Comparable<java.lang.String>>) strComparableList3);
 boolean boolean9 = strComparableList1.contains((java.lang.Object) "");
 boolean boolean10 = strComparableList0.containsAll((java.util.Collection<java.lang.Comparable<java.lang.String>>) strComparableList1);
 java.lang.Class<?> wildcardClass11 = strComparableList1.getClass();
 org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
 org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
 org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
 org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
 org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
 org.junit.Assert.assertNotNull(wildcardClass11);
 }

 @Test
 public void test046() throws Throwable {
 if (debug)
 System.out.format("%n%s%n", "SchemaRandoopGen0.test046");
 org.apache.avro.Schema.Type type0 = org.apache.avro.Schema.Type.ENUM;
 org.junit.Assert.assertTrue("'" + type0 + "' != '" + org.apache.avro.Schema.Type.ENUM + "'", type0.equals(org.apache.avro.Schema.Type.ENUM));
 }

 @Test
 public void test047() throws Throwable {
 if (debug)
 System.out.format("%n%s%n", "SchemaRandoopGen0.test047");
 org.apache.avro.Schema.LockableArrayList<java.lang.Comparable<java.lang.String>> strComparableList0 = new org.apache.avro.Schema.LockableArrayList<java.lang.Comparable<java.lang.String>>();
 org.apache.avro.Schema.LockableArrayList<java.lang.Comparable<java.lang.String>> strComparableList2 = new org.apache.avro.Schema.LockableArrayList<java.lang.Comparable<java.lang.String>>();
 boolean boolean3 = strComparableList2.add((java.lang.Comparable<java.lang.String>) "");
 boolean boolean5 = strComparableList2.add((java.lang.Comparable<java.lang.String>) "hi!");
 boolean boolean6 = strComparableList0.retainAll((java.util.Collection<java.lang.Comparable<java.lang.String>>) strComparableList2);
 java.util.function.UnaryOperator<java.lang.Comparable<java.lang.String>> strComparableUnaryOperator7 = null;
 // The following exception was thrown during execution in test generation
 try {
 strComparableList2.replaceAll(strComparableUnaryOperator7);
 org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
 } catch (java.lang.NullPointerException e) {
 // Expected exception.
 }
 org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
 org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
 org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
 }

 @Test
 public void test048() throws Throwable {
 if (debug)
 System.out.format("%n%s%n", "SchemaRandoopGen0.test048");
 org.apache.avro.Schema.LockableArrayList<java.lang.Comparable<java.lang.String>> strComparableList0 = new org.apache.avro.Schema.LockableArrayList<java.lang.Comparable<java.lang.String>>();
 org.apache.avro.Schema.LockableArrayList<java.lang.Comparable<java.lang.String>> strComparableList2 = new org.apache.avro.Schema.LockableArrayList<java.lang.Comparable<java.lang.String>>();
 boolean boolean3 = strComparableList2.add((java.lang.Comparable<java.lang.String>) "");
 boolean boolean5 = strComparableList2.add((java.lang.Comparable<java.lang.String>) "hi!");
 boolean boolean6 = strComparableList0.retainAll((java.util.Collection<java.lang.Comparable<java.lang.String>>) strComparableList2);
 boolean boolean8 = strComparableList0.add((java.lang.Comparable<java.lang.String>) "");
 boolean boolean10 = strComparableList0.equals((java.lang.Object) 0L);
 int int12 = strComparableList0.lastIndexOf((java.lang.Object) 2);
 // The following exception was thrown during execution in test generation
 try {
 java.util.List<java.lang.Comparable<java.lang.String>> strComparableList15 = strComparableList0.subList((int) ' ', (int) (short) -1);
 org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: fromIndex(32) > toIndex(-1)");
 } catch (java.lang.IllegalArgumentException e) {
 // Expected exception.
 }
 org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
 org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
 org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
 org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
 org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
 org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
 }

 @Test
 public void test049() throws Throwable {
 if (debug)
 System.out.format("%n%s%n", "SchemaRandoopGen0.test049");
 org.apache.avro.Schema.LockableArrayList<java.lang.Comparable<java.lang.String>> strComparableList0 = new org.apache.avro.Schema.LockableArrayList<java.lang.Comparable<java.lang.String>>();
 org.apache.avro.Schema.LockableArrayList<java.lang.Comparable<java.lang.String>> strComparableList2 = new org.apache.avro.Schema.LockableArrayList<java.lang.Comparable<java.lang.String>>();
 boolean boolean3 = strComparableList2.add((java.lang.Comparable<java.lang.String>) "");
 boolean boolean5 = strComparableList2.add((java.lang.Comparable<java.lang.String>) "hi!");
 boolean boolean6 = strComparableList0.retainAll((java.util.Collection<java.lang.Comparable<java.lang.String>>) strComparableList2);
 boolean boolean8 = strComparableList0.add((java.lang.Comparable<java.lang.String>) "");
 strComparableList0.ensureCapacity((int) (short) -1);
 org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
 org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
 org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
 org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
 }

 @Test
 public void test050() throws Throwable {
 if (debug)
 System.out.format("%n%s%n", "SchemaRandoopGen0.test050");
 org.apache.avro.Schema.Type type0 = org.apache.avro.Schema.Type.ARRAY;
 java.lang.Class<?> wildcardClass1 = type0.getClass();
 org.junit.Assert.assertTrue("'" + type0 + "' != '" + org.apache.avro.Schema.Type.ARRAY + "'", type0.equals(org.apache.avro.Schema.Type.ARRAY));
 org.junit.Assert.assertNotNull(wildcardClass1);
 }

 @Test
 public void test051() throws Throwable {
 if (debug)
 System.out.format("%n%s%n", "SchemaRandoopGen0.test051");
 java.lang.String[] strArray4 = new java.lang.String[] { "" };
 java.util.ArrayList<java.lang.String> strList5 = new java.util.ArrayList<java.lang.String>();
 boolean boolean6 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList5, strArray4);
 // The following exception was thrown during execution in test generation
 try {
 org.apache.avro.Schema schema7 = org.apache.avro.Schema.createEnum("hi!", "", "hi!", (java.util.List<java.lang.String>) strList5);
 org.junit.Assert.fail("Expected exception of type org.apache.avro.SchemaParseException; message: Illegal character in: hi!");
 } catch (org.apache.avro.SchemaParseException e) {
 // Expected exception.
 }
 org.junit.Assert.assertNotNull(strArray4);
 org.junit.Assert.assertArrayEquals(strArray4, new java.lang.String[] { "" });
 org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
 }

 @Test
 public void test052() throws Throwable {
 if (debug)
 System.out.format("%n%s%n", "SchemaRandoopGen0.test052");
 org.apache.avro.Schema.LockableArrayList<java.lang.Enum<org.apache.avro.Schema.Type>> typeEnumList1 = new org.apache.avro.Schema.LockableArrayList<java.lang.Enum<org.apache.avro.Schema.Type>>((int) (short) 1);
 }

 @Test
 public void test053() throws Throwable {
 if (debug)
 System.out.format("%n%s%n", "SchemaRandoopGen0.test053");
 org.apache.avro.Schema.Type type0 = org.apache.avro.Schema.Type.INT;
 org.apache.avro.Schema schema1 = org.apache.avro.Schema.create(type0);
 schema1.addProp("", "");
 org.apache.avro.Schema schema5 = org.apache.avro.Schema.createArray(schema1);
 org.junit.Assert.assertTrue("'" + type0 + "' != '" + org.apache.avro.Schema.Type.INT + "'", type0.equals(org.apache.avro.Schema.Type.INT));
 org.junit.Assert.assertNotNull(schema1);
 org.junit.Assert.assertNotNull(schema5);
 }

 @Test
 public void test054() throws Throwable {
 if (debug)
 System.out.format("%n%s%n", "SchemaRandoopGen0.test054");
 org.apache.avro.Schema.Type type0 = org.apache.avro.Schema.Type.RECORD;
 // The following exception was thrown during execution in test generation
 try {
 org.apache.avro.Schema schema1 = org.apache.avro.Schema.create(type0);
 org.junit.Assert.fail("Expected exception of type org.apache.avro.AvroRuntimeException; message: Can't create a: RECORD");
 } catch (org.apache.avro.AvroRuntimeException e) {
 // Expected exception.
 }
 org.junit.Assert.assertTrue("'" + type0 + "' != '" + org.apache.avro.Schema.Type.RECORD + "'", type0.equals(org.apache.avro.Schema.Type.RECORD));
 }

 @Test
 public void test055() throws Throwable {
 if (debug)
 System.out.format("%n%s%n", "SchemaRandoopGen0.test055");
 org.apache.avro.Schema.Type type0 = org.apache.avro.Schema.Type.INT;
 org.apache.avro.Schema schema1 = org.apache.avro.Schema.create(type0);
 org.apache.avro.Schema schema2 = org.apache.avro.Schema.createArray(schema1);
 java.lang.String str3 = schema2.getFullName();
 org.junit.Assert.assertTrue("'" + type0 + "' != '" + org.apache.avro.Schema.Type.INT + "'", type0.equals(org.apache.avro.Schema.Type.INT));
 org.junit.Assert.assertNotNull(schema1);
 org.junit.Assert.assertNotNull(schema2);
 org.junit.Assert.assertEquals("'" + str3 + "' != '" + "array" + "'", str3, "array");
 }

 @Test
 public void test056() throws Throwable {
 if (debug)
 System.out.format("%n%s%n", "SchemaRandoopGen0.test056");
 java.util.ArrayList<java.lang.Comparable<java.lang.String>> strComparableList1 = new java.util.ArrayList<java.lang.Comparable<java.lang.String>>();
 boolean boolean2 = strComparableList1.add((java.lang.Comparable<java.lang.String>) "");
 int int3 = strComparableList1.size();
 java.util.stream.Stream<java.lang.Comparable<java.lang.String>> strComparableStream4 = strComparableList1.stream();
 org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
 org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
 org.junit.Assert.assertNotNull(strComparableStream4);
 }

 @Test
 public void test057() throws Throwable {
 if (debug)
 System.out.format("%n%s%n", "SchemaRandoopGen0.test057");
 org.apache.avro.Schema.Type type0 = org.apache.avro.Schema.Type.INT;
 org.apache.avro.Schema schema1 = org.apache.avro.Schema.create(type0);
 org.apache.avro.Schema schema2 = org.apache.avro.Schema.createArray(schema1);
 org.apache.avro.Schema.Type type3 = org.apache.avro.Schema.Type.INT;
 org.apache.avro.Schema schema4 = org.apache.avro.Schema.create(type3);
 schema4.addProp("", "hi!");
 java.lang.String str9 = schema4.getProp("hi!");
 org.apache.avro.Schema schema10 = org.apache.avro.Schema.applyAliases(schema1, schema4);
 // The following exception was thrown during execution in test generation
 try {
 java.util.List<org.apache.avro.Schema.Field> fieldList11 = schema4.getFields();
 org.junit.Assert.fail("Expected exception of type org.apache.avro.AvroRuntimeException; message: Not a record: {\"type\":\"int\",\"\":\"hi!\"}");
 } catch (org.apache.avro.AvroRuntimeException e) {
 // Expected exception.
 }
 org.junit.Assert.assertTrue("'" + type0 + "' != '" + org.apache.avro.Schema.Type.INT + "'", type0.equals(org.apache.avro.Schema.Type.INT));
 org.junit.Assert.assertNotNull(schema1);
 org.junit.Assert.assertNotNull(schema2);
 org.junit.Assert.assertTrue("'" + type3 + "' != '" + org.apache.avro.Schema.Type.INT + "'", type3.equals(org.apache.avro.Schema.Type.INT));
 org.junit.Assert.assertNotNull(schema4);
 org.junit.Assert.assertNull(str9);
 org.junit.Assert.assertNotNull(schema10);
 }

 @Test
 public void test058() throws Throwable {
 if (debug)
 System.out.format("%n%s%n", "SchemaRandoopGen0.test058");
 org.apache.avro.Schema.LockableArrayList<java.lang.Comparable<java.lang.String>> strComparableList0 = new org.apache.avro.Schema.LockableArrayList<java.lang.Comparable<java.lang.String>>();
 org.apache.avro.Schema.LockableArrayList<java.lang.Comparable<java.lang.String>> strComparableList2 = new org.apache.avro.Schema.LockableArrayList<java.lang.Comparable<java.lang.String>>();
 boolean boolean3 = strComparableList2.add((java.lang.Comparable<java.lang.String>) "");
 boolean boolean5 = strComparableList2.add((java.lang.Comparable<java.lang.String>) "hi!");
 boolean boolean6 = strComparableList0.retainAll((java.util.Collection<java.lang.Comparable<java.lang.String>>) strComparableList2);
 java.lang.Object obj7 = null;
 int int8 = strComparableList0.lastIndexOf(obj7);
 strComparableList0.clear();
 org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
 org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
 org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
 org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
 }

 @Test
 public void test059() throws Throwable {
 if (debug)
 System.out.format("%n%s%n", "SchemaRandoopGen0.test059");
 org.apache.avro.Schema.Type type0 = org.apache.avro.Schema.Type.INT;
 org.apache.avro.Schema schema1 = org.apache.avro.Schema.create(type0);
 org.apache.avro.Schema schema2 = org.apache.avro.Schema.createArray(schema1);
 org.apache.avro.Schema.Type type3 = org.apache.avro.Schema.Type.INT;
 org.apache.avro.Schema schema4 = org.apache.avro.Schema.create(type3);
 schema4.addProp("", "hi!");
 java.lang.String str9 = schema4.getProp("hi!");
 org.apache.avro.Schema schema10 = org.apache.avro.Schema.applyAliases(schema1, schema4);
 org.apache.avro.Schema schema11 = org.apache.avro.Schema.createMap(schema10);
 java.lang.Class<?> wildcardClass12 = schema11.getClass();
 org.junit.Assert.assertTrue("'" + type0 + "' != '" + org.apache.avro.Schema.Type.INT + "'", type0.equals(org.apache.avro.Schema.Type.INT));
 org.junit.Assert.assertNotNull(schema1);
 org.junit.Assert.assertNotNull(schema2);
 org.junit.Assert.assertTrue("'" + type3 + "' != '" + org.apache.avro.Schema.Type.INT + "'", type3.equals(org.apache.avro.Schema.Type.INT));
 org.junit.Assert.assertNotNull(schema4);
 org.junit.Assert.assertNull(str9);
 org.junit.Assert.assertNotNull(schema10);
 org.junit.Assert.assertNotNull(schema11);
 org.junit.Assert.assertNotNull(wildcardClass12);
 }

 @Test
 public void test060() throws Throwable {
 if (debug)
 System.out.format("%n%s%n", "SchemaRandoopGen0.test060");
 java.util.ArrayList<java.lang.Comparable<java.lang.String>> strComparableList2 = new java.util.ArrayList<java.lang.Comparable<java.lang.String>>();
 boolean boolean3 = strComparableList2.add((java.lang.Comparable<java.lang.String>) "array");
 boolean boolean4 = strComparableList2.add((java.lang.Comparable<java.lang.String>) "array");
 // The following exception was thrown during execution in test generation
 try {
 java.lang.Comparable<java.lang.String> strComparable7 = strComparableList2.set(100, (java.lang.Comparable<java.lang.String>) "array");
 org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 100, Size: 2");
 } catch (java.lang.IndexOutOfBoundsException e) {
 // Expected exception.
 }
 org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
 org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
 }

 @Test
 public void test061() throws Throwable {
 if (debug)
 System.out.format("%n%s%n", "SchemaRandoopGen0.test061");
 org.apache.avro.Schema.LockableArrayList<java.lang.Comparable<java.lang.String>> strComparableList0 = new org.apache.avro.Schema.LockableArrayList<java.lang.Comparable<java.lang.String>>();
 org.apache.avro.Schema.LockableArrayList<java.lang.Comparable<java.lang.String>> strComparableList2 = new org.apache.avro.Schema.LockableArrayList<java.lang.Comparable<java.lang.String>>();
 boolean boolean3 = strComparableList2.add((java.lang.Comparable<java.lang.String>) "");
 boolean boolean5 = strComparableList2.add((java.lang.Comparable<java.lang.String>) "hi!");
 boolean boolean6 = strComparableList0.retainAll((java.util.Collection<java.lang.Comparable<java.lang.String>>) strComparableList2);
 java.util.stream.Stream<java.lang.Comparable<java.lang.String>> strComparableStream7 = strComparableList2.parallelStream();
 // The following exception was thrown during execution in test generation
 try {
 java.util.ListIterator<java.lang.Comparable<java.lang.String>> strComparableItor9 = strComparableList2.listIterator((int) (short) -1);
 org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: -1");
 } catch (java.lang.IndexOutOfBoundsException e) {
 // Expected exception.
 }
 org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
 org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
 org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
 org.junit.Assert.assertNotNull(strComparableStream7);
 }

 @Test
 public void test062() throws Throwable {
 if (debug)
 System.out.format("%n%s%n", "SchemaRandoopGen0.test062");
 java.util.ArrayList<java.lang.Comparable<java.lang.String>> strComparableList1 = new java.util.ArrayList<java.lang.Comparable<java.lang.String>>();
 boolean boolean2 = strComparableList1.add((java.lang.Comparable<java.lang.String>) "");
 strComparableList1.add((int) (short) 1, (java.lang.Comparable<java.lang.String>) "");
 java.util.function.UnaryOperator<java.lang.Comparable<java.lang.String>> strComparableUnaryOperator6 = null;
 // The following exception was thrown during execution in test generation
 try {
 strComparableList1.replaceAll(strComparableUnaryOperator6);
 org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
 } catch (java.lang.NullPointerException e) {
 // Expected exception.
 }
 org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
 }

 @Test
 public void test063() throws Throwable {
 if (debug)
 System.out.format("%n%s%n", "SchemaRandoopGen0.test063");
 org.apache.avro.Schema schema0 = null;
 org.apache.avro.Schema schema1 = org.apache.avro.Schema.createMap(schema0);
 // The following exception was thrown during execution in test generation
 try {
 schema1.addAlias("");
 org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
 } catch (java.lang.NullPointerException e) {
 // Expected exception.
 }
 org.junit.Assert.assertNotNull(schema1);
 }

 @Test
 public void test064() throws Throwable {
 if (debug)
 System.out.format("%n%s%n", "SchemaRandoopGen0.test064");
 org.apache.avro.Schema.LockableArrayList<java.lang.Comparable<java.lang.String>> strComparableList0 = new org.apache.avro.Schema.LockableArrayList<java.lang.Comparable<java.lang.String>>();
 org.apache.avro.Schema.LockableArrayList<java.lang.Comparable<java.lang.String>> strComparableList2 = new org.apache.avro.Schema.LockableArrayList<java.lang.Comparable<java.lang.String>>();
 boolean boolean3 = strComparableList2.add((java.lang.Comparable<java.lang.String>) "");
 boolean boolean5 = strComparableList2.add((java.lang.Comparable<java.lang.String>) "hi!");
 boolean boolean6 = strComparableList0.retainAll((java.util.Collection<java.lang.Comparable<java.lang.String>>) strComparableList2);
 java.lang.Object obj7 = null;
 int int8 = strComparableList0.lastIndexOf(obj7);
 java.util.ListIterator<java.lang.Comparable<java.lang.String>> strComparableItor9 = strComparableList0.listIterator();
 // The following exception was thrown during execution in test generation
 try {
 java.lang.Comparable<java.lang.String> strComparable11 = strComparableList0.remove((int) (short) 1);
 org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 1, Size: 0");
 } catch (java.lang.IndexOutOfBoundsException e) {
 // Expected exception.
 }
 org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
 org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
 org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
 org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
 org.junit.Assert.assertNotNull(strComparableItor9);
 }

 @Test
 public void test065() throws Throwable {
 if (debug)
 System.out.format("%n%s%n", "SchemaRandoopGen0.test065");
 org.apache.avro.Schema.Type type0 = org.apache.avro.Schema.Type.INT;
 org.apache.avro.Schema schema1 = org.apache.avro.Schema.create(type0);
 org.apache.avro.Schema schema2 = org.apache.avro.Schema.createArray(schema1);
 org.apache.avro.Schema.Type type3 = org.apache.avro.Schema.Type.INT;
 org.apache.avro.Schema schema4 = org.apache.avro.Schema.create(type3);
 schema4.addProp("", "hi!");
 java.lang.String str9 = schema4.getProp("hi!");
 org.apache.avro.Schema schema10 = org.apache.avro.Schema.applyAliases(schema1, schema4);
 org.apache.avro.Schema schema11 = org.apache.avro.Schema.createArray(schema10);
 // The following exception was thrown during execution in test generation
 try {
 schema10.addAlias("");
 org.junit.Assert.fail("Expected exception of type org.apache.avro.AvroRuntimeException; message: Not a named type: \"int\"");
 } catch (org.apache.avro.AvroRuntimeException e) {
 // Expected exception.
 }
 org.junit.Assert.assertTrue("'" + type0 + "' != '" + org.apache.avro.Schema.Type.INT + "'", type0.equals(org.apache.avro.Schema.Type.INT));
 org.junit.Assert.assertNotNull(schema1);
 org.junit.Assert.assertNotNull(schema2);
 org.junit.Assert.assertTrue("'" + type3 + "' != '" + org.apache.avro.Schema.Type.INT + "'", type3.equals(org.apache.avro.Schema.Type.INT));
 org.junit.Assert.assertNotNull(schema4);
 org.junit.Assert.assertNull(str9);
 org.junit.Assert.assertNotNull(schema10);
 org.junit.Assert.assertNotNull(schema11);
 }

 @Test
 public void test066() throws Throwable {
 if (debug)
 System.out.format("%n%s%n", "SchemaRandoopGen0.test066");
 org.apache.avro.Schema.Type type0 = org.apache.avro.Schema.Type.INT;
 org.apache.avro.Schema schema1 = org.apache.avro.Schema.create(type0);
 org.apache.avro.Schema schema2 = org.apache.avro.Schema.createArray(schema1);
 org.apache.avro.Schema.Type type3 = org.apache.avro.Schema.Type.INT;
 org.apache.avro.Schema schema4 = org.apache.avro.Schema.create(type3);
 schema4.addProp("", "hi!");
 java.lang.String str9 = schema4.getProp("hi!");
 org.apache.avro.Schema schema10 = org.apache.avro.Schema.applyAliases(schema1, schema4);
 // The following exception was thrown during execution in test generation
 try {
 java.util.Set<java.lang.String> strSet11 = schema1.getAliases();
 org.junit.Assert.fail("Expected exception of type org.apache.avro.AvroRuntimeException; message: Not a named type: \"int\"");
 } catch (org.apache.avro.AvroRuntimeException e) {
 // Expected exception.
 }
 org.junit.Assert.assertTrue("'" + type0 + "' != '" + org.apache.avro.Schema.Type.INT + "'", type0.equals(org.apache.avro.Schema.Type.INT));
 org.junit.Assert.assertNotNull(schema1);
 org.junit.Assert.assertNotNull(schema2);
 org.junit.Assert.assertTrue("'" + type3 + "' != '" + org.apache.avro.Schema.Type.INT + "'", type3.equals(org.apache.avro.Schema.Type.INT));
 org.junit.Assert.assertNotNull(schema4);
 org.junit.Assert.assertNull(str9);
 org.junit.Assert.assertNotNull(schema10);
 }

 @Test
 public void test067() throws Throwable {
 if (debug)
 System.out.format("%n%s%n", "SchemaRandoopGen0.test067");
 java.util.ArrayList<java.lang.Comparable<java.lang.String>> strComparableList1 = new java.util.ArrayList<java.lang.Comparable<java.lang.String>>();
 boolean boolean2 = strComparableList1.add((java.lang.Comparable<java.lang.String>) "");
 java.util.ListIterator<java.lang.Comparable<java.lang.String>> strComparableItor3 = strComparableList1.listIterator();
 org.apache.avro.Schema.LockableArrayList<java.lang.Comparable<java.lang.String>> strComparableList4 = new org.apache.avro.Schema.LockableArrayList<java.lang.Comparable<java.lang.String>>((java.util.List<java.lang.Comparable<java.lang.String>>) strComparableList1);
 // The following exception was thrown during execution in test generation
 try {
 java.lang.Comparable<java.lang.String> strComparable7 = strComparableList1.set(100, (java.lang.Comparable<java.lang.String>) "");
 org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 100, Size: 1");
 } catch (java.lang.IndexOutOfBoundsException e) {
 // Expected exception.
 }
 org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
 org.junit.Assert.assertNotNull(strComparableItor3);
 }

 @Test
 public void test068() throws Throwable {
 if (debug)
 System.out.format("%n%s%n", "SchemaRandoopGen0.test068");
 org.apache.avro.Schema.LockableArrayList<java.lang.Comparable<java.lang.String>> strComparableList1 = new org.apache.avro.Schema.LockableArrayList<java.lang.Comparable<java.lang.String>>();
 boolean boolean2 = strComparableList1.add((java.lang.Comparable<java.lang.String>) "");
 boolean boolean4 = strComparableList1.add((java.lang.Comparable<java.lang.String>) "hi!");
 java.util.stream.Stream<java.lang.Comparable<java.lang.String>> strComparableStream5 = strComparableList1.parallelStream();
 java.util.stream.Stream<java.lang.Comparable<java.lang.String>> strComparableStream6 = strComparableList1.stream();
 java.util.List<java.lang.Comparable<java.lang.String>> strComparableList7 = strComparableList1.lock();
 org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
 org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
 org.junit.Assert.assertNotNull(strComparableStream5);
 org.junit.Assert.assertNotNull(strComparableStream6);
 org.junit.Assert.assertNotNull(strComparableList7);
 }

 @Test
 public void test069() throws Throwable {
 if (debug)
 System.out.format("%n%s%n", "SchemaRandoopGen0.test069");
 org.apache.avro.Schema.Type type0 = org.apache.avro.Schema.Type.INT;
 org.apache.avro.Schema schema1 = org.apache.avro.Schema.create(type0);
 org.apache.avro.Schema schema2 = org.apache.avro.Schema.createArray(schema1);
 org.apache.avro.Schema.Names names3 = null;
 org.codehaus.jackson.JsonGenerator jsonGenerator4 = null;
 // The following exception was thrown during execution in test generation
 try {
 schema1.fieldsToJson(names3, jsonGenerator4);
 org.junit.Assert.fail("Expected exception of type org.apache.avro.AvroRuntimeException; message: Not a record: \"int\"");
 } catch (org.apache.avro.AvroRuntimeException e) {
 // Expected exception.
 }
 org.junit.Assert.assertTrue("'" + type0 + "' != '" + org.apache.avro.Schema.Type.INT + "'", type0.equals(org.apache.avro.Schema.Type.INT));
 org.junit.Assert.assertNotNull(schema1);
 org.junit.Assert.assertNotNull(schema2);
 }

 @Test
 public void test070() throws Throwable {
 if (debug)
 System.out.format("%n%s%n", "SchemaRandoopGen0.test070");
 org.apache.avro.Schema.Field[] fieldArray0 = new org.apache.avro.Schema.Field[] {};
 java.util.ArrayList<org.apache.avro.Schema.Field> fieldList1 = new java.util.ArrayList<org.apache.avro.Schema.Field>();
 boolean boolean2 = java.util.Collections.addAll((java.util.Collection<org.apache.avro.Schema.Field>) fieldList1, fieldArray0);
 org.apache.avro.Schema schema3 = org.apache.avro.Schema.createRecord((java.util.List<org.apache.avro.Schema.Field>) fieldList1);
 org.apache.avro.Schema schema4 = org.apache.avro.Schema.createRecord((java.util.List<org.apache.avro.Schema.Field>) fieldList1);
 org.junit.Assert.assertNotNull(fieldArray0);
 org.junit.Assert.assertArrayEquals(fieldArray0, new org.apache.avro.Schema.Field[] {});
 org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
 org.junit.Assert.assertNotNull(schema3);
 org.junit.Assert.assertNotNull(schema4);
 }

 @Test
 public void test071() throws Throwable {
 if (debug)
 System.out.format("%n%s%n", "SchemaRandoopGen0.test071");
 org.apache.avro.Schema.LockableArrayList<java.lang.Comparable<java.lang.String>> strComparableList1 = new org.apache.avro.Schema.LockableArrayList<java.lang.Comparable<java.lang.String>>();
 boolean boolean2 = strComparableList1.add((java.lang.Comparable<java.lang.String>) "");
 boolean boolean4 = strComparableList1.add((java.lang.Comparable<java.lang.String>) "hi!");
 java.util.stream.Stream<java.lang.Comparable<java.lang.String>> strComparableStream5 = strComparableList1.parallelStream();
 // The following exception was thrown during execution in test generation
 try {
 java.lang.Comparable<java.lang.String> strComparable8 = strComparableList1.set(100, (java.lang.Comparable<java.lang.String>) "array");
 org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 100, Size: 2");
 } catch (java.lang.IndexOutOfBoundsException e) {
 // Expected exception.
 }
 org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
 org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
 org.junit.Assert.assertNotNull(strComparableStream5);
 }

 @Test
 public void test072() throws Throwable {
 if (debug)
 System.out.format("%n%s%n", "SchemaRandoopGen0.test072");
 org.apache.avro.Schema.LockableArrayList<java.lang.Comparable<java.lang.String>> strComparableList0 = new org.apache.avro.Schema.LockableArrayList<java.lang.Comparable<java.lang.String>>();
 org.apache.avro.Schema.LockableArrayList<java.lang.Comparable<java.lang.String>> strComparableList2 = new org.apache.avro.Schema.LockableArrayList<java.lang.Comparable<java.lang.String>>();
 boolean boolean3 = strComparableList2.add((java.lang.Comparable<java.lang.String>) "");
 boolean boolean5 = strComparableList2.add((java.lang.Comparable<java.lang.String>) "hi!");
 boolean boolean6 = strComparableList0.retainAll((java.util.Collection<java.lang.Comparable<java.lang.String>>) strComparableList2);
 boolean boolean8 = strComparableList0.add((java.lang.Comparable<java.lang.String>) "");
 boolean boolean10 = strComparableList0.equals((java.lang.Object) 0L);
 int int12 = strComparableList0.lastIndexOf((java.lang.Object) 2);
 java.util.ArrayList<java.lang.Comparable<java.lang.String>> strComparableList14 = new java.util.ArrayList<java.lang.Comparable<java.lang.String>>();
 boolean boolean15 = strComparableList14.add((java.lang.Comparable<java.lang.String>) "");
 strComparableList14.add((int) (short) 1, (java.lang.Comparable<java.lang.String>) "");
 boolean boolean19 = strComparableList0.containsAll((java.util.Collection<java.lang.Comparable<java.lang.String>>) strComparableList14);
 // The following exception was thrown during execution in test generation
 try {
 strComparableList0.add((int) (short) -1, (java.lang.Comparable<java.lang.String>) "array");
 org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: -1, Size: 1");
 } catch (java.lang.IndexOutOfBoundsException e) {
 // Expected exception.
 }
 org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
 org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
 org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
 org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
 org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
 org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
 org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
 org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
 }

 @Test
 public void test073() throws Throwable {
 if (debug)
 System.out.format("%n%s%n", "SchemaRandoopGen0.test073");
 org.apache.avro.Schema.LockableArrayList<java.lang.Comparable<java.lang.String>> strComparableList1 = new org.apache.avro.Schema.LockableArrayList<java.lang.Comparable<java.lang.String>>();
 boolean boolean2 = strComparableList1.add((java.lang.Comparable<java.lang.String>) "");
 boolean boolean4 = strComparableList1.add((java.lang.Comparable<java.lang.String>) "hi!");
 java.util.stream.Stream<java.lang.Comparable<java.lang.String>> strComparableStream5 = strComparableList1.parallelStream();
 org.apache.avro.Schema.LockableArrayList<java.lang.Comparable<java.lang.String>> strComparableList6 = new org.apache.avro.Schema.LockableArrayList<java.lang.Comparable<java.lang.String>>();
 java.lang.Object obj7 = strComparableList6.clone();
 boolean boolean8 = strComparableList1.containsAll((java.util.Collection<java.lang.Comparable<java.lang.String>>) strComparableList6);
 org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
 org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
 org.junit.Assert.assertNotNull(strComparableStream5);
 org.junit.Assert.assertNotNull(obj7);
 org.junit.Assert.assertEquals(obj7.toString(), "[]");
 org.junit.Assert.assertEquals(java.lang.String.valueOf(obj7), "[]");
 org.junit.Assert.assertEquals(java.util.Objects.toString(obj7), "[]");
 org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
 }

 @Test
 public void test074() throws Throwable {
 if (debug)
 System.out.format("%n%s%n", "SchemaRandoopGen0.test074");
 org.apache.avro.Schema.LockableArrayList<java.lang.Comparable<java.lang.String>> strComparableList2 = new org.apache.avro.Schema.LockableArrayList<java.lang.Comparable<java.lang.String>>();
 boolean boolean3 = strComparableList2.add((java.lang.Comparable<java.lang.String>) "hi!");
 boolean boolean4 = strComparableList2.add((java.lang.Comparable<java.lang.String>) "array");
 org.apache.avro.Schema.LockableArrayList<java.lang.Comparable<java.lang.String>> strComparableList5 = new org.apache.avro.Schema.LockableArrayList<java.lang.Comparable<java.lang.String>>();
 org.apache.avro.Schema.LockableArrayList<java.lang.Comparable<java.lang.String>> strComparableList7 = new org.apache.avro.Schema.LockableArrayList<java.lang.Comparable<java.lang.String>>();
 boolean boolean8 = strComparableList7.add((java.lang.Comparable<java.lang.String>) "");
 boolean boolean10 = strComparableList7.add((java.lang.Comparable<java.lang.String>) "hi!");
 boolean boolean11 = strComparableList5.retainAll((java.util.Collection<java.lang.Comparable<java.lang.String>>) strComparableList7);
 boolean boolean12 = strComparableList5.isEmpty();
 boolean boolean13 = strComparableList2.remove((java.lang.Object) boolean12);
 org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
 org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
 org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
 org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
 org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
 org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
 org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
 }

 @Test
 public void test075() throws Throwable {
 if (debug)
 System.out.format("%n%s%n", "SchemaRandoopGen0.test075");
 org.apache.avro.Schema.LockableArrayList<java.lang.Comparable<java.lang.String>> strComparableList0 = new org.apache.avro.Schema.LockableArrayList<java.lang.Comparable<java.lang.String>>();
 org.apache.avro.Schema.LockableArrayList<java.lang.Comparable<java.lang.String>> strComparableList2 = new org.apache.avro.Schema.LockableArrayList<java.lang.Comparable<java.lang.String>>();
 boolean boolean3 = strComparableList2.add((java.lang.Comparable<java.lang.String>) "");
 boolean boolean5 = strComparableList2.add((java.lang.Comparable<java.lang.String>) "hi!");
 boolean boolean6 = strComparableList0.retainAll((java.util.Collection<java.lang.Comparable<java.lang.String>>) strComparableList2);
 org.apache.avro.Schema.LockableArrayList<java.lang.Comparable<java.lang.String>> strComparableList7 = new org.apache.avro.Schema.LockableArrayList<java.lang.Comparable<java.lang.String>>();
 org.apache.avro.Schema.LockableArrayList<java.lang.Comparable<java.lang.String>> strComparableList8 = new org.apache.avro.Schema.LockableArrayList<java.lang.Comparable<java.lang.String>>();
 org.apache.avro.Schema.LockableArrayList<java.lang.Comparable<java.lang.String>> strComparableList10 = new org.apache.avro.Schema.LockableArrayList<java.lang.Comparable<java.lang.String>>();
 boolean boolean11 = strComparableList10.add((java.lang.Comparable<java.lang.String>) "");
 boolean boolean13 = strComparableList10.add((java.lang.Comparable<java.lang.String>) "hi!");
 boolean boolean14 = strComparableList8.retainAll((java.util.Collection<java.lang.Comparable<java.lang.String>>) strComparableList10);
 boolean boolean16 = strComparableList8.contains((java.lang.Object) "");
 boolean boolean17 = strComparableList7.containsAll((java.util.Collection<java.lang.Comparable<java.lang.String>>) strComparableList8);
 boolean boolean18 = strComparableList0.remove((java.lang.Object) boolean17);
 org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
 org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
 org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
 org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
 org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
 org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
 org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
 org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
 org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
 }

 @Test
 public void test076() throws Throwable {
 if (debug)
 System.out.format("%n%s%n", "SchemaRandoopGen0.test076");
 org.apache.avro.Schema.Type type1 = org.apache.avro.Schema.Type.DOUBLE;
 org.apache.avro.Schema schema2 = org.apache.avro.Schema.create(type1);
 org.codehaus.jackson.JsonNode jsonNode4 = null;
 org.apache.avro.Schema.Field.Order order5 = org.apache.avro.Schema.Field.Order.DESCENDING;
 // The following exception was thrown during execution in test generation
 try {
 org.apache.avro.Schema.Field field6 = new org.apache.avro.Schema.Field("", schema2, "[]", jsonNode4, order5);
 org.junit.Assert.fail("Expected exception of type org.apache.avro.SchemaParseException; message: Empty name");
 } catch (org.apache.avro.SchemaParseException e) {
 // Expected exception.
 }
 org.junit.Assert.assertTrue("'" + type1 + "' != '" + org.apache.avro.Schema.Type.DOUBLE + "'", type1.equals(org.apache.avro.Schema.Type.DOUBLE));
 org.junit.Assert.assertNotNull(schema2);
 org.junit.Assert.assertTrue("'" + order5 + "' != '" + org.apache.avro.Schema.Field.Order.DESCENDING + "'", order5.equals(org.apache.avro.Schema.Field.Order.DESCENDING));
 }

 @Test
 public void test077() throws Throwable {
 if (debug)
 System.out.format("%n%s%n", "SchemaRandoopGen0.test077");
 java.util.ArrayList<java.lang.Comparable<java.lang.String>> strComparableList1 = new java.util.ArrayList<java.lang.Comparable<java.lang.String>>();
 boolean boolean2 = strComparableList1.add((java.lang.Comparable<java.lang.String>) "");
 int int3 = strComparableList1.size();
 strComparableList1.trimToSize();
 java.util.stream.Stream<java.lang.Comparable<java.lang.String>> strComparableStream5 = strComparableList1.parallelStream();
 org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
 org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
 org.junit.Assert.assertNotNull(strComparableStream5);
 }

 @Test
 public void test078() throws Throwable {
 if (debug)
 System.out.format("%n%s%n", "SchemaRandoopGen0.test078");
 org.apache.avro.Schema.Type type0 = org.apache.avro.Schema.Type.INT;
 org.apache.avro.Schema schema1 = org.apache.avro.Schema.create(type0);
 schema1.addProp("", "hi!");
 java.lang.String str6 = schema1.getProp("hi!");
 // The following exception was thrown during execution in test generation
 try {
 boolean boolean7 = schema1.isError();
 org.junit.Assert.fail("Expected exception of type org.apache.avro.AvroRuntimeException; message: Not a record: {\"type\":\"int\",\"\":\"hi!\"}");
 } catch (org.apache.avro.AvroRuntimeException e) {
 // Expected exception.
 }
 org.junit.Assert.assertTrue("'" + type0 + "' != '" + org.apache.avro.Schema.Type.INT + "'", type0.equals(org.apache.avro.Schema.Type.INT));
 org.junit.Assert.assertNotNull(schema1);
 org.junit.Assert.assertNull(str6);
 }

 @Test
 public void test079() throws Throwable {
 if (debug)
 System.out.format("%n%s%n", "SchemaRandoopGen0.test079");
 org.apache.avro.Schema.LockableArrayList<java.lang.Comparable<java.lang.String>> strComparableList0 = new org.apache.avro.Schema.LockableArrayList<java.lang.Comparable<java.lang.String>>();
 org.apache.avro.Schema.LockableArrayList<java.lang.Comparable<java.lang.String>> strComparableList1 = new org.apache.avro.Schema.LockableArrayList<java.lang.Comparable<java.lang.String>>();
 org.apache.avro.Schema.LockableArrayList<java.lang.Comparable<java.lang.String>> strComparableList3 = new org.apache.avro.Schema.LockableArrayList<java.lang.Comparable<java.lang.String>>();
 boolean boolean4 = strComparableList3.add((java.lang.Comparable<java.lang.String>) "");
 boolean boolean6 = strComparableList3.add((java.lang.Comparable<java.lang.String>) "hi!");
 boolean boolean7 = strComparableList1.retainAll((java.util.Collection<java.lang.Comparable<java.lang.String>>) strComparableList3);
 boolean boolean9 = strComparableList1.contains((java.lang.Object) "");
 boolean boolean10 = strComparableList0.containsAll((java.util.Collection<java.lang.Comparable<java.lang.String>>) strComparableList1);
 java.util.stream.Stream<java.lang.Comparable<java.lang.String>> strComparableStream11 = strComparableList0.parallelStream();
 org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
 org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
 org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
 org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
 org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
 org.junit.Assert.assertNotNull(strComparableStream11);
 }

 @Test
 public void test080() throws Throwable {
 if (debug)
 System.out.format("%n%s%n", "SchemaRandoopGen0.test080");
 org.apache.avro.Schema.LockableArrayList<java.lang.Comparable<java.lang.String>> strComparableList0 = new org.apache.avro.Schema.LockableArrayList<java.lang.Comparable<java.lang.String>>();
 org.apache.avro.Schema.LockableArrayList<java.lang.Comparable<java.lang.String>> strComparableList2 = new org.apache.avro.Schema.LockableArrayList<java.lang.Comparable<java.lang.String>>();
 boolean boolean3 = strComparableList2.add((java.lang.Comparable<java.lang.String>) "");
 boolean boolean5 = strComparableList2.add((java.lang.Comparable<java.lang.String>) "hi!");
 boolean boolean6 = strComparableList0.retainAll((java.util.Collection<java.lang.Comparable<java.lang.String>>) strComparableList2);
 boolean boolean8 = strComparableList0.add((java.lang.Comparable<java.lang.String>) "");
 java.util.ArrayList<java.lang.Comparable<java.lang.String>> strComparableList10 = new java.util.ArrayList<java.lang.Comparable<java.lang.String>>();
 boolean boolean11 = strComparableList10.add((java.lang.Comparable<java.lang.String>) "");
 java.util.ListIterator<java.lang.Comparable<java.lang.String>> strComparableItor12 = strComparableList10.listIterator();
 org.apache.avro.Schema.LockableArrayList<java.lang.Comparable<java.lang.String>> strComparableList13 = new org.apache.avro.Schema.LockableArrayList<java.lang.Comparable<java.lang.String>>((java.util.List<java.lang.Comparable<java.lang.String>>) strComparableList10);
 strComparableList10.ensureCapacity((int) (short) 1);
 java.lang.String str16 = strComparableList10.toString();
 boolean boolean17 = strComparableList0.contains((java.lang.Object) str16);
 org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
 org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
 org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
 org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
 org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
 org.junit.Assert.assertNotNull(strComparableItor12);
 org.junit.Assert.assertEquals("'" + str16 + "' != '" + "[]" + "'", str16, "[]");
 org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
 }

 @Test
 public void test081() throws Throwable {
 if (debug)
 System.out.format("%n%s%n", "SchemaRandoopGen0.test081");
 org.apache.avro.Schema.LockableArrayList<java.lang.Comparable<java.lang.String>> strComparableList0 = new org.apache.avro.Schema.LockableArrayList<java.lang.Comparable<java.lang.String>>();
 org.apache.avro.Schema.LockableArrayList<java.lang.Comparable<java.lang.String>> strComparableList2 = new org.apache.avro.Schema.LockableArrayList<java.lang.Comparable<java.lang.String>>();
 boolean boolean3 = strComparableList2.add((java.lang.Comparable<java.lang.String>) "");
 boolean boolean5 = strComparableList2.add((java.lang.Comparable<java.lang.String>) "hi!");
 java.util.stream.Stream<java.lang.Comparable<java.lang.String>> strComparableStream6 = strComparableList2.parallelStream();
 boolean boolean7 = strComparableList0.removeAll((java.util.Collection<java.lang.Comparable<java.lang.String>>) strComparableList2);
 org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
 org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
 org.junit.Assert.assertNotNull(strComparableStream6);
 org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
 }

 @Test
 public void test082() throws Throwable {
 if (debug)
 System.out.format("%n%s%n", "SchemaRandoopGen0.test082");
 java.util.ArrayList<java.lang.Comparable<java.lang.String>> strComparableList1 = new java.util.ArrayList<java.lang.Comparable<java.lang.String>>();
 boolean boolean2 = strComparableList1.add((java.lang.Comparable<java.lang.String>) "");
 java.util.ListIterator<java.lang.Comparable<java.lang.String>> strComparableItor3 = strComparableList1.listIterator();
 org.apache.avro.Schema.LockableArrayList<java.lang.Comparable<java.lang.String>> strComparableList4 = new org.apache.avro.Schema.LockableArrayList<java.lang.Comparable<java.lang.String>>((java.util.List<java.lang.Comparable<java.lang.String>>) strComparableList1);
 java.lang.Object[] objArray5 = strComparableList1.toArray();
 boolean boolean6 = strComparableList1.isEmpty();
 org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
 org.junit.Assert.assertNotNull(strComparableItor3);
 org.junit.Assert.assertNotNull(objArray5);
 org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray5), "[]");
 org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray5), "[]");
 org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
 }

 @Test
 public void test083() throws Throwable {
 if (debug)
 System.out.format("%n%s%n", "SchemaRandoopGen0.test083");
 org.codehaus.jackson.JsonFactory jsonFactory0 = org.apache.avro.Schema.FACTORY;
 org.junit.Assert.assertNotNull(jsonFactory0);
 }

 @Test
 public void test084() throws Throwable {
 if (debug)
 System.out.format("%n%s%n", "SchemaRandoopGen0.test084");
 org.apache.avro.Schema.Type type0 = org.apache.avro.Schema.Type.INT;
 org.apache.avro.Schema schema1 = org.apache.avro.Schema.create(type0);
 org.apache.avro.Schema schema2 = org.apache.avro.Schema.createArray(schema1);
 org.apache.avro.Schema.Type type3 = org.apache.avro.Schema.Type.INT;
 org.apache.avro.Schema schema4 = org.apache.avro.Schema.create(type3);
 schema4.addProp("", "hi!");
 java.lang.String str9 = schema4.getProp("hi!");
 org.apache.avro.Schema schema10 = org.apache.avro.Schema.applyAliases(schema1, schema4);
 // The following exception was thrown during execution in test generation
 try {
 boolean boolean12 = schema1.hasEnumSymbol("hi!");
 org.junit.Assert.fail("Expected exception of type org.apache.avro.AvroRuntimeException; message: Not an enum: \"int\"");
 } catch (org.apache.avro.AvroRuntimeException e) {
 // Expected exception.
 }
 org.junit.Assert.assertTrue("'" + type0 + "' != '" + org.apache.avro.Schema.Type.INT + "'", type0.equals(org.apache.avro.Schema.Type.INT));
 org.junit.Assert.assertNotNull(schema1);
 org.junit.Assert.assertNotNull(schema2);
 org.junit.Assert.assertTrue("'" + type3 + "' != '" + org.apache.avro.Schema.Type.INT + "'", type3.equals(org.apache.avro.Schema.Type.INT));
 org.junit.Assert.assertNotNull(schema4);
 org.junit.Assert.assertNull(str9);
 org.junit.Assert.assertNotNull(schema10);
 }

 @Test
 public void test085() throws Throwable {
 if (debug)
 System.out.format("%n%s%n", "SchemaRandoopGen0.test085");
 org.apache.avro.Schema.LockableArrayList<java.lang.Comparable<java.lang.String>> strComparableList1 = new org.apache.avro.Schema.LockableArrayList<java.lang.Comparable<java.lang.String>>();
 boolean boolean2 = strComparableList1.add((java.lang.Comparable<java.lang.String>) "");
 boolean boolean4 = strComparableList1.add((java.lang.Comparable<java.lang.String>) "hi!");
 java.util.stream.Stream<java.lang.Comparable<java.lang.String>> strComparableStream5 = strComparableList1.parallelStream();
 org.apache.avro.Schema.Type type6 = org.apache.avro.Schema.Type.INT;
 org.apache.avro.Schema schema7 = org.apache.avro.Schema.create(type6);
 schema7.addProp("", "");
 boolean boolean11 = strComparableList1.contains((java.lang.Object) schema7);
 org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
 org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
 org.junit.Assert.assertNotNull(strComparableStream5);
 org.junit.Assert.assertTrue("'" + type6 + "' != '" + org.apache.avro.Schema.Type.INT + "'", type6.equals(org.apache.avro.Schema.Type.INT));
 org.junit.Assert.assertNotNull(schema7);
 org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
 }

 @Test
 public void test086() throws Throwable {
 if (debug)
 System.out.format("%n%s%n", "SchemaRandoopGen0.test086");
 java.util.ArrayList<java.lang.Comparable<java.lang.String>> strComparableList1 = new java.util.ArrayList<java.lang.Comparable<java.lang.String>>();
 boolean boolean2 = strComparableList1.add((java.lang.Comparable<java.lang.String>) "");
 java.util.ListIterator<java.lang.Comparable<java.lang.String>> strComparableItor3 = strComparableList1.listIterator();
 org.apache.avro.Schema.LockableArrayList<java.lang.Comparable<java.lang.String>> strComparableList4 = new org.apache.avro.Schema.LockableArrayList<java.lang.Comparable<java.lang.String>>((java.util.List<java.lang.Comparable<java.lang.String>>) strComparableList1);
 java.util.ListIterator<java.lang.Comparable<java.lang.String>> strComparableItor5 = strComparableList4.listIterator();
 org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
 org.junit.Assert.assertNotNull(strComparableItor3);
 org.junit.Assert.assertNotNull(strComparableItor5);
 }

 @Test
 public void test087() throws Throwable {
 if (debug)
 System.out.format("%n%s%n", "SchemaRandoopGen0.test087");
 org.apache.avro.Schema.LockableArrayList<java.lang.Comparable<java.lang.String>> strComparableList0 = new org.apache.avro.Schema.LockableArrayList<java.lang.Comparable<java.lang.String>>();
 org.apache.avro.Schema.LockableArrayList<java.lang.Comparable<java.lang.String>> strComparableList2 = new org.apache.avro.Schema.LockableArrayList<java.lang.Comparable<java.lang.String>>();
 boolean boolean3 = strComparableList2.add((java.lang.Comparable<java.lang.String>) "");
 boolean boolean5 = strComparableList2.add((java.lang.Comparable<java.lang.String>) "hi!");
 boolean boolean6 = strComparableList0.retainAll((java.util.Collection<java.lang.Comparable<java.lang.String>>) strComparableList2);
 java.lang.Object obj7 = null;
 int int8 = strComparableList0.lastIndexOf(obj7);
 java.util.ListIterator<java.lang.Comparable<java.lang.String>> strComparableItor9 = strComparableList0.listIterator();
 org.apache.avro.Schema.Type type10 = org.apache.avro.Schema.Type.ARRAY;
 int int11 = strComparableList0.indexOf((java.lang.Object) type10);
 org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
 org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
 org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
 org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
 org.junit.Assert.assertNotNull(strComparableItor9);
 org.junit.Assert.assertTrue("'" + type10 + "' != '" + org.apache.avro.Schema.Type.ARRAY + "'", type10.equals(org.apache.avro.Schema.Type.ARRAY));
 org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
 }

 @Test
 public void test088() throws Throwable {
 if (debug)
 System.out.format("%n%s%n", "SchemaRandoopGen0.test088");
 org.apache.avro.Schema.LockableArrayList<org.codehaus.jackson.map.ObjectMapper> objectMapperList0 = new org.apache.avro.Schema.LockableArrayList<org.codehaus.jackson.map.ObjectMapper>();
 }

 @Test
 public void test089() throws Throwable {
 if (debug)
 System.out.format("%n%s%n", "SchemaRandoopGen0.test089");
 org.apache.avro.Schema.LockableArrayList<java.lang.Comparable<java.lang.String>> strComparableList0 = new org.apache.avro.Schema.LockableArrayList<java.lang.Comparable<java.lang.String>>();
 org.apache.avro.Schema.LockableArrayList<java.lang.Comparable<java.lang.String>> strComparableList2 = new org.apache.avro.Schema.LockableArrayList<java.lang.Comparable<java.lang.String>>();
 boolean boolean3 = strComparableList2.add((java.lang.Comparable<java.lang.String>) "");
 boolean boolean5 = strComparableList2.add((java.lang.Comparable<java.lang.String>) "hi!");
 boolean boolean6 = strComparableList0.retainAll((java.util.Collection<java.lang.Comparable<java.lang.String>>) strComparableList2);
 boolean boolean8 = strComparableList0.contains((java.lang.Object) "");
 org.apache.avro.Schema.LockableArrayList<java.lang.Comparable<java.lang.String>> strComparableList9 = new org.apache.avro.Schema.LockableArrayList<java.lang.Comparable<java.lang.String>>();
 org.apache.avro.Schema.LockableArrayList<java.lang.Comparable<java.lang.String>> strComparableList11 = new org.apache.avro.Schema.LockableArrayList<java.lang.Comparable<java.lang.String>>();
 boolean boolean12 = strComparableList11.add((java.lang.Comparable<java.lang.String>) "");
 boolean boolean14 = strComparableList11.add((java.lang.Comparable<java.lang.String>) "hi!");
 boolean boolean15 = strComparableList9.retainAll((java.util.Collection<java.lang.Comparable<java.lang.String>>) strComparableList11);
 java.util.stream.Stream<java.lang.Comparable<java.lang.String>> strComparableStream16 = strComparableList11.parallelStream();
 java.util.stream.Stream<java.lang.Comparable<java.lang.String>> strComparableStream17 = strComparableList11.parallelStream();
 boolean boolean18 = strComparableList0.addAll((java.util.Collection<java.lang.Comparable<java.lang.String>>) strComparableList11);
 int int19 = strComparableList11.size();
 org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
 org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
 org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
 org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
 org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
 org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
 org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
 org.junit.Assert.assertNotNull(strComparableStream16);
 org.junit.Assert.assertNotNull(strComparableStream17);
 org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
 org.junit.Assert.assertTrue("'" + int19 + "' != '" + 2 + "'", int19 == 2);
 }

 @Test
 public void test090() throws Throwable {
 if (debug)
 System.out.format("%n%s%n", "SchemaRandoopGen0.test090");
 org.apache.avro.Schema.Type type0 = org.apache.avro.Schema.Type.INT;
 org.apache.avro.Schema schema1 = org.apache.avro.Schema.create(type0);
 schema1.addProp("", "hi!");
 java.lang.String str6 = schema1.getProp("hi!");
 // The following exception was thrown during execution in test generation
 try {
 java.util.Set<java.lang.String> strSet7 = schema1.getAliases();
 org.junit.Assert.fail("Expected exception of type org.apache.avro.AvroRuntimeException; message: Not a named type: {\"type\":\"int\",\"\":\"hi!\"}");
 } catch (org.apache.avro.AvroRuntimeException e) {
 // Expected exception.
 }
 org.junit.Assert.assertTrue("'" + type0 + "' != '" + org.apache.avro.Schema.Type.INT + "'", type0.equals(org.apache.avro.Schema.Type.INT));
 org.junit.Assert.assertNotNull(schema1);
 org.junit.Assert.assertNull(str6);
 }

 @Test
 public void test091() throws Throwable {
 if (debug)
 System.out.format("%n%s%n", "SchemaRandoopGen0.test091");
 // The following exception was thrown during execution in test generation
 try {
 org.apache.avro.Schema schema4 = org.apache.avro.Schema.createFixed("", "hi!", "array", (int) ' ');
 org.junit.Assert.fail("Expected exception of type org.apache.avro.SchemaParseException; message: Empty name");
 } catch (org.apache.avro.SchemaParseException e) {
 // Expected exception.
 }
 }

 @Test
 public void test092() throws Throwable {
 if (debug)
 System.out.format("%n%s%n", "SchemaRandoopGen0.test092");
 java.util.ArrayList<java.lang.Comparable<java.lang.String>> strComparableList1 = new java.util.ArrayList<java.lang.Comparable<java.lang.String>>();
 boolean boolean2 = strComparableList1.add((java.lang.Comparable<java.lang.String>) "");
 java.util.ListIterator<java.lang.Comparable<java.lang.String>> strComparableItor3 = strComparableList1.listIterator();
 org.apache.avro.Schema.LockableArrayList<java.lang.Comparable<java.lang.String>> strComparableList4 = new org.apache.avro.Schema.LockableArrayList<java.lang.Comparable<java.lang.String>>((java.util.List<java.lang.Comparable<java.lang.String>>) strComparableList1);
 strComparableList1.ensureCapacity((int) (short) 1);
 java.util.ArrayList<java.lang.Comparable<java.lang.String>> strComparableList8 = new java.util.ArrayList<java.lang.Comparable<java.lang.String>>();
 boolean boolean9 = strComparableList8.add((java.lang.Comparable<java.lang.String>) "");
 java.util.ListIterator<java.lang.Comparable<java.lang.String>> strComparableItor10 = strComparableList8.listIterator();
 int int11 = strComparableList1.lastIndexOf((java.lang.Object) strComparableItor10);
 org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
 org.junit.Assert.assertNotNull(strComparableItor3);
 org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
 org.junit.Assert.assertNotNull(strComparableItor10);
 org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
 }

 @Test
 public void test093() throws Throwable {
 if (debug)
 System.out.format("%n%s%n", "SchemaRandoopGen0.test093");
 org.apache.avro.Schema.Type type1 = org.apache.avro.Schema.Type.INT;
 org.apache.avro.Schema schema2 = org.apache.avro.Schema.create(type1);
 org.apache.avro.Schema schema3 = org.apache.avro.Schema.createArray(schema2);
 org.codehaus.jackson.JsonNode jsonNode5 = null;
 // The following exception was thrown during execution in test generation
 try {
 org.apache.avro.Schema.Field field6 = new org.apache.avro.Schema.Field("", schema3, "array", jsonNode5);
 org.junit.Assert.fail("Expected exception of type org.apache.avro.SchemaParseException; message: Empty name");
 } catch (org.apache.avro.SchemaParseException e) {
 // Expected exception.
 }
 org.junit.Assert.assertTrue("'" + type1 + "' != '" + org.apache.avro.Schema.Type.INT + "'", type1.equals(org.apache.avro.Schema.Type.INT));
 org.junit.Assert.assertNotNull(schema2);
 org.junit.Assert.assertNotNull(schema3);
 }

 @Test
 public void test094() throws Throwable {
 if (debug)
 System.out.format("%n%s%n", "SchemaRandoopGen0.test094");
 // The following exception was thrown during execution in test generation
 try {
 org.apache.avro.Schema schema2 = org.apache.avro.Schema.parse("array", false);
 org.junit.Assert.fail("Expected exception of type org.apache.avro.SchemaParseException; message: org.codehaus.jackson.JsonParseException: Unexpected character ('a' (code 97)): expected a valid value (number, String, array, object, 'true', 'false' or 'null')? at [Source: java.io.StringReader@2c26f450; line: 1, column: 2]");
 } catch (org.apache.avro.SchemaParseException e) {
 // Expected exception.
 }
 }

 @Test
 public void test095() throws Throwable {
 if (debug)
 System.out.format("%n%s%n", "SchemaRandoopGen0.test095");
 org.apache.avro.Schema.Type type0 = org.apache.avro.Schema.Type.FLOAT;
 org.junit.Assert.assertTrue("'" + type0 + "' != '" + org.apache.avro.Schema.Type.FLOAT + "'", type0.equals(org.apache.avro.Schema.Type.FLOAT));
 }

 @Test
 public void test096() throws Throwable {
 if (debug)
 System.out.format("%n%s%n", "SchemaRandoopGen0.test096");
 org.apache.avro.Schema.Type type0 = org.apache.avro.Schema.Type.INT;
 org.apache.avro.Schema schema1 = org.apache.avro.Schema.create(type0);
 org.apache.avro.Schema schema2 = org.apache.avro.Schema.createArray(schema1);
 org.apache.avro.Schema.Names names4 = new org.apache.avro.Schema.Names("array");
 boolean boolean5 = names4.isEmpty();
 org.codehaus.jackson.JsonGenerator jsonGenerator6 = null;
 // The following exception was thrown during execution in test generation
 try {
 schema2.fieldsToJson(names4, jsonGenerator6);
 org.junit.Assert.fail("Expected exception of type org.apache.avro.AvroRuntimeException; message: Not a record: {\"type\":\"array\",\"items\":\"int\"}");
 } catch (org.apache.avro.AvroRuntimeException e) {
 // Expected exception.
 }
 org.junit.Assert.assertTrue("'" + type0 + "' != '" + org.apache.avro.Schema.Type.INT + "'", type0.equals(org.apache.avro.Schema.Type.INT));
 org.junit.Assert.assertNotNull(schema1);
 org.junit.Assert.assertNotNull(schema2);
 org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
 }

 @Test
 public void test097() throws Throwable {
 if (debug)
 System.out.format("%n%s%n", "SchemaRandoopGen0.test097");
 org.apache.avro.Schema.LockableArrayList<java.lang.Comparable<java.lang.String>> strComparableList1 = new org.apache.avro.Schema.LockableArrayList<java.lang.Comparable<java.lang.String>>();
 boolean boolean2 = strComparableList1.add((java.lang.Comparable<java.lang.String>) "");
 boolean boolean4 = strComparableList1.add((java.lang.Comparable<java.lang.String>) "hi!");
 java.util.stream.Stream<java.lang.Comparable<java.lang.String>> strComparableStream5 = strComparableList1.parallelStream();
 java.util.stream.Stream<java.lang.Comparable<java.lang.String>> strComparableStream6 = strComparableList1.stream();
 strComparableList1.clear();
 org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
 org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
 org.junit.Assert.assertNotNull(strComparableStream5);
 org.junit.Assert.assertNotNull(strComparableStream6);
 }

 @Test
 public void test098() throws Throwable {
 if (debug)
 System.out.format("%n%s%n", "SchemaRandoopGen0.test098");
 org.apache.avro.Schema.Names names1 = new org.apache.avro.Schema.Names("array");
 boolean boolean2 = names1.isEmpty();
 names1.clear();
 java.util.Collection<org.apache.avro.Schema> schemaCollection4 = names1.values();
 org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
 org.junit.Assert.assertNotNull(schemaCollection4);
 }

 @Test
 public void test099() throws Throwable {
 if (debug)
 System.out.format("%n%s%n", "SchemaRandoopGen0.test099");
 org.apache.avro.Schema.LockableArrayList<java.lang.Comparable<java.lang.String>> strComparableList0 = new org.apache.avro.Schema.LockableArrayList<java.lang.Comparable<java.lang.String>>();
 org.apache.avro.Schema.LockableArrayList<java.lang.Comparable<java.lang.String>> strComparableList2 = new org.apache.avro.Schema.LockableArrayList<java.lang.Comparable<java.lang.String>>();
 boolean boolean3 = strComparableList2.add((java.lang.Comparable<java.lang.String>) "");
 boolean boolean5 = strComparableList2.add((java.lang.Comparable<java.lang.String>) "hi!");
 boolean boolean6 = strComparableList0.retainAll((java.util.Collection<java.lang.Comparable<java.lang.String>>) strComparableList2);
 boolean boolean7 = strComparableList2.isEmpty();
 strComparableList2.trimToSize();
 org.apache.avro.Schema.Type type9 = org.apache.avro.Schema.Type.INT;
 org.apache.avro.Schema schema10 = org.apache.avro.Schema.create(type9);
 org.apache.avro.Schema schema11 = org.apache.avro.Schema.createArray(schema10);
 org.apache.avro.Schema.Type type12 = org.apache.avro.Schema.Type.INT;
 org.apache.avro.Schema schema13 = org.apache.avro.Schema.create(type12);
 schema13.addProp("", "hi!");
 java.lang.String str18 = schema13.getProp("hi!");
 org.apache.avro.Schema schema19 = org.apache.avro.Schema.applyAliases(schema10, schema13);
 org.apache.avro.Schema schema20 = org.apache.avro.Schema.createArray(schema19);
 boolean boolean21 = strComparableList2.equals((java.lang.Object) schema20);
 org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
 org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
 org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
 org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
 org.junit.Assert.assertTrue("'" + type9 + "' != '" + org.apache.avro.Schema.Type.INT + "'", type9.equals(org.apache.avro.Schema.Type.INT));
 org.junit.Assert.assertNotNull(schema10);
 org.junit.Assert.assertNotNull(schema11);
 org.junit.Assert.assertTrue("'" + type12 + "' != '" + org.apache.avro.Schema.Type.INT + "'", type12.equals(org.apache.avro.Schema.Type.INT));
 org.junit.Assert.assertNotNull(schema13);
 org.junit.Assert.assertNull(str18);
 org.junit.Assert.assertNotNull(schema19);
 org.junit.Assert.assertNotNull(schema20);
 org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
 }

 @Test
 public void test100() throws Throwable {
 if (debug)
 System.out.format("%n%s%n", "SchemaRandoopGen0.test100");
 org.apache.avro.Schema.Type type0 = org.apache.avro.Schema.Type.INT;
 org.apache.avro.Schema schema1 = org.apache.avro.Schema.create(type0);
 org.apache.avro.Schema schema2 = org.apache.avro.Schema.createArray(schema1);
 org.apache.avro.Schema.Type type3 = org.apache.avro.Schema.Type.INT;
 org.apache.avro.Schema schema4 = org.apache.avro.Schema.create(type3);
 schema4.addProp("", "hi!");
 java.lang.String str9 = schema4.getProp("hi!");
 org.apache.avro.Schema schema10 = org.apache.avro.Schema.applyAliases(schema1, schema4);
 org.apache.avro.Schema schema11 = org.apache.avro.Schema.createArray(schema10);
 // The following exception was thrown during execution in test generation
 try {
 java.lang.String str12 = schema11.getNamespace();
 org.junit.Assert.fail("Expected exception of type org.apache.avro.AvroRuntimeException; message: Not a named type: {\"type\":\"array\",\"items\":\"int\"}");
 } catch (org.apache.avro.AvroRuntimeException e) {
 // Expected exception.
 }
 org.junit.Assert.assertTrue("'" + type0 + "' != '" + org.apache.avro.Schema.Type.INT + "'", type0.equals(org.apache.avro.Schema.Type.INT));
 org.junit.Assert.assertNotNull(schema1);
 org.junit.Assert.assertNotNull(schema2);
 org.junit.Assert.assertTrue("'" + type3 + "' != '" + org.apache.avro.Schema.Type.INT + "'", type3.equals(org.apache.avro.Schema.Type.INT));
 org.junit.Assert.assertNotNull(schema4);
 org.junit.Assert.assertNull(str9);
 org.junit.Assert.assertNotNull(schema10);
 org.junit.Assert.assertNotNull(schema11);
 }
}

