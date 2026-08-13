package org.apache.avro;

import org.junit.Test;

public class SchemaM3Random300Test0 {

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
    public void test0001() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SchemaM3Random300Test0.test0001");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.avro.Schema schema4 = org.apache.avro.Schema.createRecord("", "hi!", "", false);
            org.junit.Assert.fail("Expected exception of type org.apache.avro.SchemaParseException; message: Empty name");
        } catch (org.apache.avro.SchemaParseException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SchemaM3Random300Test0.test0002");
        java.lang.String[] strArray4 = new java.lang.String[] { "hi!" };
        java.util.ArrayList<java.lang.String> strList5 = new java.util.ArrayList<java.lang.String>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList5, strArray4);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.avro.Schema schema7 = org.apache.avro.Schema.createEnum("hi!", "", "", (java.util.List<java.lang.String>) strList5);
            org.junit.Assert.fail("Expected exception of type org.apache.avro.SchemaParseException; message: Illegal character in: hi!");
        } catch (org.apache.avro.SchemaParseException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertArrayEquals(strArray4, new java.lang.String[] { "hi!" });
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test0003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SchemaM3Random300Test0.test0003");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.avro.Schema schema2 = org.apache.avro.Schema.parse("", true);
            org.junit.Assert.fail("Expected exception of type org.apache.avro.SchemaParseException; message: java.io.EOFException: No content to map to Object due to end of input");
        } catch (org.apache.avro.SchemaParseException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SchemaM3Random300Test0.test0004");
        org.apache.avro.Schema.Field.Order order0 = org.apache.avro.Schema.Field.Order.IGNORE;
        org.junit.Assert.assertTrue("'" + order0 + "' != '" + org.apache.avro.Schema.Field.Order.IGNORE + "'", order0.equals(org.apache.avro.Schema.Field.Order.IGNORE));
    }

    @Test
    public void test0005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SchemaM3Random300Test0.test0005");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.avro.Schema schema4 = org.apache.avro.Schema.createFixed("hi!", "hi!", "", (int) 'a');
            org.junit.Assert.fail("Expected exception of type org.apache.avro.SchemaParseException; message: Illegal character in: hi!");
        } catch (org.apache.avro.SchemaParseException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SchemaM3Random300Test0.test0006");
        org.apache.avro.Schema schema0 = null;
        org.apache.avro.Schema schema1 = null;
        org.apache.avro.Schema schema2 = org.apache.avro.Schema.applyAliases(schema0, schema1);
        org.junit.Assert.assertNull(schema2);
    }

    @Test
    public void test0007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SchemaM3Random300Test0.test0007");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.avro.Schema schema1 = org.apache.avro.Schema.parse("hi!");
            org.junit.Assert.fail("Expected exception of type org.apache.avro.SchemaParseException; message: org.codehaus.jackson.JsonParseException: Unexpected character ('h' (code 104)): expected a valid value (number, String, array, object, 'true', 'false' or 'null')? at [Source: java.io.StringReader@6def1699; line: 1, column: 2]");
        } catch (org.apache.avro.SchemaParseException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SchemaM3Random300Test0.test0008");
        java.lang.String[] strArray4 = new java.lang.String[] { "hi!" };
        java.util.ArrayList<java.lang.String> strList5 = new java.util.ArrayList<java.lang.String>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList5, strArray4);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.avro.Schema schema7 = org.apache.avro.Schema.createEnum("", "", "hi!", (java.util.List<java.lang.String>) strList5);
            org.junit.Assert.fail("Expected exception of type org.apache.avro.SchemaParseException; message: Empty name");
        } catch (org.apache.avro.SchemaParseException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertArrayEquals(strArray4, new java.lang.String[] { "hi!" });
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test0009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SchemaM3Random300Test0.test0009");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.avro.Schema schema4 = org.apache.avro.Schema.createRecord("hi!", "hi!", "", true);
            org.junit.Assert.fail("Expected exception of type org.apache.avro.SchemaParseException; message: Illegal character in: hi!");
        } catch (org.apache.avro.SchemaParseException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SchemaM3Random300Test0.test0010");
        org.apache.avro.Schema[] schemaArray0 = new org.apache.avro.Schema[] {};
        java.util.ArrayList<org.apache.avro.Schema> schemaList1 = new java.util.ArrayList<org.apache.avro.Schema>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<org.apache.avro.Schema>) schemaList1, schemaArray0);
        org.apache.avro.Schema schema3 = org.apache.avro.Schema.createUnion((java.util.List<org.apache.avro.Schema>) schemaList1);
        org.apache.avro.Schema[] schemaArray4 = new org.apache.avro.Schema[] {};
        java.util.ArrayList<org.apache.avro.Schema> schemaList5 = new java.util.ArrayList<org.apache.avro.Schema>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<org.apache.avro.Schema>) schemaList5, schemaArray4);
        org.apache.avro.Schema schema7 = org.apache.avro.Schema.createUnion((java.util.List<org.apache.avro.Schema>) schemaList5);
        org.apache.avro.Schema schema8 = org.apache.avro.Schema.applyAliases(schema3, schema7);
        org.apache.avro.Schema.Names names9 = null;
        org.codehaus.jackson.JsonGenerator jsonGenerator10 = null;
        // The following exception was thrown during execution in test generation
        try {
            schema7.toJson(names9, jsonGenerator10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(schemaArray0);
        org.junit.Assert.assertArrayEquals(schemaArray0, new org.apache.avro.Schema[] {});
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(schema3);
        org.junit.Assert.assertNotNull(schemaArray4);
        org.junit.Assert.assertArrayEquals(schemaArray4, new org.apache.avro.Schema[] {});
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(schema7);
        org.junit.Assert.assertNotNull(schema8);
    }

    @Test
    public void test0011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SchemaM3Random300Test0.test0011");
        org.apache.avro.Schema[] schemaArray0 = new org.apache.avro.Schema[] {};
        java.util.ArrayList<org.apache.avro.Schema> schemaList1 = new java.util.ArrayList<org.apache.avro.Schema>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<org.apache.avro.Schema>) schemaList1, schemaArray0);
        org.apache.avro.Schema schema3 = org.apache.avro.Schema.createUnion((java.util.List<org.apache.avro.Schema>) schemaList1);
        org.apache.avro.Schema[] schemaArray4 = new org.apache.avro.Schema[] {};
        java.util.ArrayList<org.apache.avro.Schema> schemaList5 = new java.util.ArrayList<org.apache.avro.Schema>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<org.apache.avro.Schema>) schemaList5, schemaArray4);
        org.apache.avro.Schema schema7 = org.apache.avro.Schema.createUnion((java.util.List<org.apache.avro.Schema>) schemaList5);
        org.apache.avro.Schema schema8 = org.apache.avro.Schema.applyAliases(schema3, schema7);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str9 = schema3.getNamespace();
            org.junit.Assert.fail("Expected exception of type org.apache.avro.AvroRuntimeException; message: Not a named type: []");
        } catch (org.apache.avro.AvroRuntimeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(schemaArray0);
        org.junit.Assert.assertArrayEquals(schemaArray0, new org.apache.avro.Schema[] {});
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(schema3);
        org.junit.Assert.assertNotNull(schemaArray4);
        org.junit.Assert.assertArrayEquals(schemaArray4, new org.apache.avro.Schema[] {});
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(schema7);
        org.junit.Assert.assertNotNull(schema8);
    }

    @Test
    public void test0012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SchemaM3Random300Test0.test0012");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.avro.Schema schema1 = org.apache.avro.Schema.parse("");
            org.junit.Assert.fail("Expected exception of type org.apache.avro.SchemaParseException; message: java.io.EOFException: No content to map to Object due to end of input");
        } catch (org.apache.avro.SchemaParseException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SchemaM3Random300Test0.test0013");
        java.lang.String[] strArray4 = new java.lang.String[] { "" };
        java.util.ArrayList<java.lang.String> strList5 = new java.util.ArrayList<java.lang.String>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList5, strArray4);
        org.apache.avro.Schema.LockableArrayList<java.lang.String> strList7 = new org.apache.avro.Schema.LockableArrayList<java.lang.String>((java.util.List<java.lang.String>) strList5);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.avro.Schema schema8 = org.apache.avro.Schema.createEnum("", "", "hi!", (java.util.List<java.lang.String>) strList7);
            org.junit.Assert.fail("Expected exception of type org.apache.avro.SchemaParseException; message: Empty name");
        } catch (org.apache.avro.SchemaParseException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertArrayEquals(strArray4, new java.lang.String[] { "" });
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test0014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SchemaM3Random300Test0.test0014");
        org.apache.avro.Schema.Type type0 = org.apache.avro.Schema.Type.RECORD;
        java.lang.Class<?> wildcardClass1 = type0.getClass();
        org.junit.Assert.assertTrue("'" + type0 + "' != '" + org.apache.avro.Schema.Type.RECORD + "'", type0.equals(org.apache.avro.Schema.Type.RECORD));
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test0015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SchemaM3Random300Test0.test0015");
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
    public void test0016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SchemaM3Random300Test0.test0016");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.avro.Schema schema4 = org.apache.avro.Schema.createRecord("", "", "", false);
            org.junit.Assert.fail("Expected exception of type org.apache.avro.SchemaParseException; message: Empty name");
        } catch (org.apache.avro.SchemaParseException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SchemaM3Random300Test0.test0017");
        // The following exception was thrown during execution in test generation
        try {
            org.codehaus.jackson.JsonNode jsonNode1 = org.apache.avro.Schema.parseJson("");
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: java.io.EOFException: No content to map to Object due to end of input");
        } catch (java.lang.RuntimeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SchemaM3Random300Test0.test0018");
        org.apache.avro.Schema[] schemaArray1 = new org.apache.avro.Schema[] {};
        java.util.ArrayList<org.apache.avro.Schema> schemaList2 = new java.util.ArrayList<org.apache.avro.Schema>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<org.apache.avro.Schema>) schemaList2, schemaArray1);
        org.apache.avro.Schema schema4 = org.apache.avro.Schema.createUnion((java.util.List<org.apache.avro.Schema>) schemaList2);
        org.apache.avro.Schema[] schemaArray5 = new org.apache.avro.Schema[] {};
        java.util.ArrayList<org.apache.avro.Schema> schemaList6 = new java.util.ArrayList<org.apache.avro.Schema>();
        boolean boolean7 = java.util.Collections.addAll((java.util.Collection<org.apache.avro.Schema>) schemaList6, schemaArray5);
        org.apache.avro.Schema schema8 = org.apache.avro.Schema.createUnion((java.util.List<org.apache.avro.Schema>) schemaList6);
        org.apache.avro.Schema schema9 = org.apache.avro.Schema.applyAliases(schema4, schema8);
        org.apache.avro.Schema.Type type10 = schema8.getType();
        org.codehaus.jackson.JsonNode jsonNode12 = null;
        org.apache.avro.Schema.Field.Order order13 = org.apache.avro.Schema.Field.Order.ASCENDING;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.avro.Schema.Field field14 = new org.apache.avro.Schema.Field("hi!", schema8, "hi!", jsonNode12, order13);
            org.junit.Assert.fail("Expected exception of type org.apache.avro.SchemaParseException; message: Illegal character in: hi!");
        } catch (org.apache.avro.SchemaParseException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(schemaArray1);
        org.junit.Assert.assertArrayEquals(schemaArray1, new org.apache.avro.Schema[] {});
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(schema4);
        org.junit.Assert.assertNotNull(schemaArray5);
        org.junit.Assert.assertArrayEquals(schemaArray5, new org.apache.avro.Schema[] {});
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(schema8);
        org.junit.Assert.assertNotNull(schema9);
        org.junit.Assert.assertTrue("'" + type10 + "' != '" + org.apache.avro.Schema.Type.UNION + "'", type10.equals(org.apache.avro.Schema.Type.UNION));
        org.junit.Assert.assertTrue("'" + order13 + "' != '" + org.apache.avro.Schema.Field.Order.ASCENDING + "'", order13.equals(org.apache.avro.Schema.Field.Order.ASCENDING));
    }

    @Test
    public void test0019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SchemaM3Random300Test0.test0019");
        org.codehaus.jackson.JsonNode jsonNode0 = null;
        org.apache.avro.Schema.Names names1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.avro.Schema schema2 = org.apache.avro.Schema.parse(jsonNode0, names1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SchemaM3Random300Test0.test0020");
        org.apache.avro.Schema[] schemaArray0 = new org.apache.avro.Schema[] {};
        java.util.ArrayList<org.apache.avro.Schema> schemaList1 = new java.util.ArrayList<org.apache.avro.Schema>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<org.apache.avro.Schema>) schemaList1, schemaArray0);
        org.apache.avro.Schema schema3 = org.apache.avro.Schema.createUnion((java.util.List<org.apache.avro.Schema>) schemaList1);
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<org.apache.avro.Schema.Field> fieldList4 = schema3.getFields();
            org.junit.Assert.fail("Expected exception of type org.apache.avro.AvroRuntimeException; message: Not a record: []");
        } catch (org.apache.avro.AvroRuntimeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(schemaArray0);
        org.junit.Assert.assertArrayEquals(schemaArray0, new org.apache.avro.Schema[] {});
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(schema3);
    }

    @Test
    public void test0021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SchemaM3Random300Test0.test0021");
        org.apache.avro.Schema[] schemaArray0 = new org.apache.avro.Schema[] {};
        java.util.ArrayList<org.apache.avro.Schema> schemaList1 = new java.util.ArrayList<org.apache.avro.Schema>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<org.apache.avro.Schema>) schemaList1, schemaArray0);
        org.apache.avro.Schema schema3 = org.apache.avro.Schema.createUnion((java.util.List<org.apache.avro.Schema>) schemaList1);
        org.apache.avro.Schema[] schemaArray4 = new org.apache.avro.Schema[] {};
        java.util.ArrayList<org.apache.avro.Schema> schemaList5 = new java.util.ArrayList<org.apache.avro.Schema>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<org.apache.avro.Schema>) schemaList5, schemaArray4);
        org.apache.avro.Schema schema7 = org.apache.avro.Schema.createUnion((java.util.List<org.apache.avro.Schema>) schemaList5);
        org.apache.avro.Schema schema8 = org.apache.avro.Schema.applyAliases(schema3, schema7);
        // The following exception was thrown during execution in test generation
        try {
            int int9 = schema8.getFixedSize();
            org.junit.Assert.fail("Expected exception of type org.apache.avro.AvroRuntimeException; message: Not fixed: []");
        } catch (org.apache.avro.AvroRuntimeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(schemaArray0);
        org.junit.Assert.assertArrayEquals(schemaArray0, new org.apache.avro.Schema[] {});
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(schema3);
        org.junit.Assert.assertNotNull(schemaArray4);
        org.junit.Assert.assertArrayEquals(schemaArray4, new org.apache.avro.Schema[] {});
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(schema7);
        org.junit.Assert.assertNotNull(schema8);
    }

    @Test
    public void test0022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SchemaM3Random300Test0.test0022");
        org.apache.avro.Schema[] schemaArray1 = new org.apache.avro.Schema[] {};
        java.util.ArrayList<org.apache.avro.Schema> schemaList2 = new java.util.ArrayList<org.apache.avro.Schema>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<org.apache.avro.Schema>) schemaList2, schemaArray1);
        org.apache.avro.Schema schema4 = org.apache.avro.Schema.createUnion((java.util.List<org.apache.avro.Schema>) schemaList2);
        org.apache.avro.Schema[] schemaArray5 = new org.apache.avro.Schema[] {};
        java.util.ArrayList<org.apache.avro.Schema> schemaList6 = new java.util.ArrayList<org.apache.avro.Schema>();
        boolean boolean7 = java.util.Collections.addAll((java.util.Collection<org.apache.avro.Schema>) schemaList6, schemaArray5);
        org.apache.avro.Schema schema8 = org.apache.avro.Schema.createUnion((java.util.List<org.apache.avro.Schema>) schemaList6);
        org.apache.avro.Schema schema9 = org.apache.avro.Schema.applyAliases(schema4, schema8);
        org.codehaus.jackson.JsonNode jsonNode11 = null;
        org.apache.avro.Schema.Field.Order order12 = org.apache.avro.Schema.Field.Order.ASCENDING;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.avro.Schema.Field field13 = new org.apache.avro.Schema.Field("", schema4, "hi!", jsonNode11, order12);
            org.junit.Assert.fail("Expected exception of type org.apache.avro.SchemaParseException; message: Empty name");
        } catch (org.apache.avro.SchemaParseException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(schemaArray1);
        org.junit.Assert.assertArrayEquals(schemaArray1, new org.apache.avro.Schema[] {});
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(schema4);
        org.junit.Assert.assertNotNull(schemaArray5);
        org.junit.Assert.assertArrayEquals(schemaArray5, new org.apache.avro.Schema[] {});
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(schema8);
        org.junit.Assert.assertNotNull(schema9);
        org.junit.Assert.assertTrue("'" + order12 + "' != '" + org.apache.avro.Schema.Field.Order.ASCENDING + "'", order12.equals(org.apache.avro.Schema.Field.Order.ASCENDING));
    }

    @Test
    public void test0023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SchemaM3Random300Test0.test0023");
        org.apache.avro.Schema.Field[] fieldArray0 = new org.apache.avro.Schema.Field[] {};
        java.util.ArrayList<org.apache.avro.Schema.Field> fieldList1 = new java.util.ArrayList<org.apache.avro.Schema.Field>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<org.apache.avro.Schema.Field>) fieldList1, fieldArray0);
        org.apache.avro.Schema schema3 = org.apache.avro.Schema.createRecord((java.util.List<org.apache.avro.Schema.Field>) fieldList1);
        org.apache.avro.Schema.Names names4 = new org.apache.avro.Schema.Names();
        org.codehaus.jackson.JsonGenerator jsonGenerator5 = null;
        // The following exception was thrown during execution in test generation
        try {
            schema3.fieldsToJson(names4, jsonGenerator5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(fieldArray0);
        org.junit.Assert.assertArrayEquals(fieldArray0, new org.apache.avro.Schema.Field[] {});
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(schema3);
    }

    @Test
    public void test0024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SchemaM3Random300Test0.test0024");
        // The following exception was thrown during execution in test generation
        try {
            org.codehaus.jackson.JsonNode jsonNode1 = org.apache.avro.Schema.parseJson("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: org.codehaus.jackson.JsonParseException: Unexpected character ('h' (code 104)): expected a valid value (number, String, array, object, 'true', 'false' or 'null')? at [Source: java.io.StringReader@7b3c0f51; line: 1, column: 2]");
        } catch (java.lang.RuntimeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SchemaM3Random300Test0.test0025");
        org.apache.avro.Schema.Parser parser0 = new org.apache.avro.Schema.Parser();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.avro.Schema schema2 = parser0.parse("");
            org.junit.Assert.fail("Expected exception of type org.apache.avro.SchemaParseException; message: java.io.EOFException: No content to map to Object due to end of input");
        } catch (org.apache.avro.SchemaParseException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SchemaM3Random300Test0.test0026");
        org.apache.avro.Schema[] schemaArray0 = new org.apache.avro.Schema[] {};
        java.util.ArrayList<org.apache.avro.Schema> schemaList1 = new java.util.ArrayList<org.apache.avro.Schema>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<org.apache.avro.Schema>) schemaList1, schemaArray0);
        org.apache.avro.Schema schema3 = org.apache.avro.Schema.createUnion((java.util.List<org.apache.avro.Schema>) schemaList1);
        org.apache.avro.Schema[] schemaArray4 = new org.apache.avro.Schema[] {};
        java.util.ArrayList<org.apache.avro.Schema> schemaList5 = new java.util.ArrayList<org.apache.avro.Schema>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<org.apache.avro.Schema>) schemaList5, schemaArray4);
        org.apache.avro.Schema schema7 = org.apache.avro.Schema.createUnion((java.util.List<org.apache.avro.Schema>) schemaList5);
        org.apache.avro.Schema schema8 = org.apache.avro.Schema.applyAliases(schema3, schema7);
        java.util.List<org.apache.avro.Schema> schemaList9 = schema8.getTypes();
        org.apache.avro.Schema[] schemaArray10 = new org.apache.avro.Schema[] {};
        java.util.ArrayList<org.apache.avro.Schema> schemaList11 = new java.util.ArrayList<org.apache.avro.Schema>();
        boolean boolean12 = java.util.Collections.addAll((java.util.Collection<org.apache.avro.Schema>) schemaList11, schemaArray10);
        org.apache.avro.Schema schema13 = org.apache.avro.Schema.createUnion((java.util.List<org.apache.avro.Schema>) schemaList11);
        org.apache.avro.Schema[] schemaArray14 = new org.apache.avro.Schema[] {};
        java.util.ArrayList<org.apache.avro.Schema> schemaList15 = new java.util.ArrayList<org.apache.avro.Schema>();
        boolean boolean16 = java.util.Collections.addAll((java.util.Collection<org.apache.avro.Schema>) schemaList15, schemaArray14);
        org.apache.avro.Schema schema17 = org.apache.avro.Schema.createUnion((java.util.List<org.apache.avro.Schema>) schemaList15);
        org.apache.avro.Schema schema18 = org.apache.avro.Schema.applyAliases(schema13, schema17);
        org.apache.avro.Schema schema19 = org.apache.avro.Schema.applyAliases(schema8, schema17);
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<java.lang.String> strList20 = schema8.getEnumSymbols();
            org.junit.Assert.fail("Expected exception of type org.apache.avro.AvroRuntimeException; message: Not an enum: []");
        } catch (org.apache.avro.AvroRuntimeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(schemaArray0);
        org.junit.Assert.assertArrayEquals(schemaArray0, new org.apache.avro.Schema[] {});
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(schema3);
        org.junit.Assert.assertNotNull(schemaArray4);
        org.junit.Assert.assertArrayEquals(schemaArray4, new org.apache.avro.Schema[] {});
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(schema7);
        org.junit.Assert.assertNotNull(schema8);
        org.junit.Assert.assertNotNull(schemaList9);
        org.junit.Assert.assertNotNull(schemaArray10);
        org.junit.Assert.assertArrayEquals(schemaArray10, new org.apache.avro.Schema[] {});
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(schema13);
        org.junit.Assert.assertNotNull(schemaArray14);
        org.junit.Assert.assertArrayEquals(schemaArray14, new org.apache.avro.Schema[] {});
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(schema17);
        org.junit.Assert.assertNotNull(schema18);
        org.junit.Assert.assertNotNull(schema19);
    }

    @Test
    public void test0027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SchemaM3Random300Test0.test0027");
        org.apache.avro.Schema[] schemaArray1 = new org.apache.avro.Schema[] {};
        java.util.ArrayList<org.apache.avro.Schema> schemaList2 = new java.util.ArrayList<org.apache.avro.Schema>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<org.apache.avro.Schema>) schemaList2, schemaArray1);
        org.apache.avro.Schema schema4 = org.apache.avro.Schema.createUnion((java.util.List<org.apache.avro.Schema>) schemaList2);
        org.apache.avro.Schema[] schemaArray5 = new org.apache.avro.Schema[] {};
        java.util.ArrayList<org.apache.avro.Schema> schemaList6 = new java.util.ArrayList<org.apache.avro.Schema>();
        boolean boolean7 = java.util.Collections.addAll((java.util.Collection<org.apache.avro.Schema>) schemaList6, schemaArray5);
        org.apache.avro.Schema schema8 = org.apache.avro.Schema.createUnion((java.util.List<org.apache.avro.Schema>) schemaList6);
        org.apache.avro.Schema schema9 = org.apache.avro.Schema.applyAliases(schema4, schema8);
        java.util.List<org.apache.avro.Schema> schemaList10 = schema9.getTypes();
        boolean boolean12 = schema9.equals((java.lang.Object) "hi!");
        java.lang.String str13 = schema9.getDoc();
        org.apache.avro.Schema schema14 = org.apache.avro.Schema.createArray(schema9);
        org.codehaus.jackson.JsonNode jsonNode16 = null;
        org.apache.avro.Schema.Field.Order order17 = org.apache.avro.Schema.Field.Order.ASCENDING;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.avro.Schema.Field field18 = new org.apache.avro.Schema.Field("", schema14, "[ ]", jsonNode16, order17);
            org.junit.Assert.fail("Expected exception of type org.apache.avro.SchemaParseException; message: Empty name");
        } catch (org.apache.avro.SchemaParseException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(schemaArray1);
        org.junit.Assert.assertArrayEquals(schemaArray1, new org.apache.avro.Schema[] {});
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(schema4);
        org.junit.Assert.assertNotNull(schemaArray5);
        org.junit.Assert.assertArrayEquals(schemaArray5, new org.apache.avro.Schema[] {});
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(schema8);
        org.junit.Assert.assertNotNull(schema9);
        org.junit.Assert.assertNotNull(schemaList10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNotNull(schema14);
        org.junit.Assert.assertTrue("'" + order17 + "' != '" + org.apache.avro.Schema.Field.Order.ASCENDING + "'", order17.equals(org.apache.avro.Schema.Field.Order.ASCENDING));
    }

    @Test
    public void test0028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SchemaM3Random300Test0.test0028");
        org.apache.avro.Schema.Parser parser0 = new org.apache.avro.Schema.Parser();
        java.io.File file1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.avro.Schema schema2 = parser0.parse(file1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SchemaM3Random300Test0.test0029");
        org.apache.avro.Schema[] schemaArray0 = new org.apache.avro.Schema[] {};
        java.util.ArrayList<org.apache.avro.Schema> schemaList1 = new java.util.ArrayList<org.apache.avro.Schema>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<org.apache.avro.Schema>) schemaList1, schemaArray0);
        org.apache.avro.Schema schema3 = org.apache.avro.Schema.createUnion((java.util.List<org.apache.avro.Schema>) schemaList1);
        // The following exception was thrown during execution in test generation
        try {
            java.util.Set<java.lang.String> strSet4 = schema3.getAliases();
            org.junit.Assert.fail("Expected exception of type org.apache.avro.AvroRuntimeException; message: Not a named type: []");
        } catch (org.apache.avro.AvroRuntimeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(schemaArray0);
        org.junit.Assert.assertArrayEquals(schemaArray0, new org.apache.avro.Schema[] {});
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(schema3);
    }

    @Test
    public void test0030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SchemaM3Random300Test0.test0030");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.avro.Schema schema4 = org.apache.avro.Schema.createRecord("[ ]", "hi!", "", false);
            org.junit.Assert.fail("Expected exception of type org.apache.avro.SchemaParseException; message: Illegal initial character: [ ]");
        } catch (org.apache.avro.SchemaParseException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SchemaM3Random300Test0.test0031");
        org.apache.avro.Schema[] schemaArray0 = new org.apache.avro.Schema[] {};
        java.util.ArrayList<org.apache.avro.Schema> schemaList1 = new java.util.ArrayList<org.apache.avro.Schema>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<org.apache.avro.Schema>) schemaList1, schemaArray0);
        org.apache.avro.Schema schema3 = org.apache.avro.Schema.createUnion((java.util.List<org.apache.avro.Schema>) schemaList1);
        org.apache.avro.Schema[] schemaArray4 = new org.apache.avro.Schema[] {};
        java.util.ArrayList<org.apache.avro.Schema> schemaList5 = new java.util.ArrayList<org.apache.avro.Schema>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<org.apache.avro.Schema>) schemaList5, schemaArray4);
        org.apache.avro.Schema schema7 = org.apache.avro.Schema.createUnion((java.util.List<org.apache.avro.Schema>) schemaList5);
        org.apache.avro.Schema schema8 = org.apache.avro.Schema.applyAliases(schema3, schema7);
        java.util.List<org.apache.avro.Schema> schemaList9 = schema8.getTypes();
        java.lang.String str11 = schema8.toString(true);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.avro.Schema.Field field13 = schema8.getField("[ ]");
            org.junit.Assert.fail("Expected exception of type org.apache.avro.AvroRuntimeException; message: Not a record: []");
        } catch (org.apache.avro.AvroRuntimeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(schemaArray0);
        org.junit.Assert.assertArrayEquals(schemaArray0, new org.apache.avro.Schema[] {});
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(schema3);
        org.junit.Assert.assertNotNull(schemaArray4);
        org.junit.Assert.assertArrayEquals(schemaArray4, new org.apache.avro.Schema[] {});
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(schema7);
        org.junit.Assert.assertNotNull(schema8);
        org.junit.Assert.assertNotNull(schemaList9);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "[ ]" + "'", str11, "[ ]");
    }

    @Test
    public void test0032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SchemaM3Random300Test0.test0032");
        org.apache.avro.Schema.Names names0 = new org.apache.avro.Schema.Names();
        java.lang.String str1 = names0.space();
        int int2 = names0.size();
        org.apache.avro.Schema[] schemaArray3 = new org.apache.avro.Schema[] {};
        java.util.ArrayList<org.apache.avro.Schema> schemaList4 = new java.util.ArrayList<org.apache.avro.Schema>();
        boolean boolean5 = java.util.Collections.addAll((java.util.Collection<org.apache.avro.Schema>) schemaList4, schemaArray3);
        org.apache.avro.Schema schema6 = org.apache.avro.Schema.createUnion((java.util.List<org.apache.avro.Schema>) schemaList4);
        org.apache.avro.Schema[] schemaArray7 = new org.apache.avro.Schema[] {};
        java.util.ArrayList<org.apache.avro.Schema> schemaList8 = new java.util.ArrayList<org.apache.avro.Schema>();
        boolean boolean9 = java.util.Collections.addAll((java.util.Collection<org.apache.avro.Schema>) schemaList8, schemaArray7);
        org.apache.avro.Schema schema10 = org.apache.avro.Schema.createUnion((java.util.List<org.apache.avro.Schema>) schemaList8);
        org.apache.avro.Schema schema11 = org.apache.avro.Schema.applyAliases(schema6, schema10);
        // The following exception was thrown during execution in test generation
        try {
            names0.add(schema10);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: org.apache.avro.Schema$UnionSchema cannot be cast to org.apache.avro.Schema$NamedSchema");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(schemaArray3);
        org.junit.Assert.assertArrayEquals(schemaArray3, new org.apache.avro.Schema[] {});
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(schema6);
        org.junit.Assert.assertNotNull(schemaArray7);
        org.junit.Assert.assertArrayEquals(schemaArray7, new org.apache.avro.Schema[] {});
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(schema10);
        org.junit.Assert.assertNotNull(schema11);
    }

    @Test
    public void test0033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SchemaM3Random300Test0.test0033");
        org.apache.avro.Schema[] schemaArray0 = new org.apache.avro.Schema[] {};
        java.util.ArrayList<org.apache.avro.Schema> schemaList1 = new java.util.ArrayList<org.apache.avro.Schema>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<org.apache.avro.Schema>) schemaList1, schemaArray0);
        org.apache.avro.Schema schema3 = org.apache.avro.Schema.createUnion((java.util.List<org.apache.avro.Schema>) schemaList1);
        org.apache.avro.Schema[] schemaArray4 = new org.apache.avro.Schema[] {};
        java.util.ArrayList<org.apache.avro.Schema> schemaList5 = new java.util.ArrayList<org.apache.avro.Schema>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<org.apache.avro.Schema>) schemaList5, schemaArray4);
        org.apache.avro.Schema schema7 = org.apache.avro.Schema.createUnion((java.util.List<org.apache.avro.Schema>) schemaList5);
        org.apache.avro.Schema schema8 = org.apache.avro.Schema.applyAliases(schema3, schema7);
        java.util.List<org.apache.avro.Schema> schemaList9 = schema8.getTypes();
        boolean boolean11 = schema8.equals((java.lang.Object) "hi!");
        java.lang.String str12 = schema8.getDoc();
        org.apache.avro.Schema schema13 = org.apache.avro.Schema.createArray(schema8);
        java.lang.String str14 = schema8.getFullName();
        // The following exception was thrown during execution in test generation
        try {
            int int15 = schema8.getFixedSize();
            org.junit.Assert.fail("Expected exception of type org.apache.avro.AvroRuntimeException; message: Not fixed: []");
        } catch (org.apache.avro.AvroRuntimeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(schemaArray0);
        org.junit.Assert.assertArrayEquals(schemaArray0, new org.apache.avro.Schema[] {});
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(schema3);
        org.junit.Assert.assertNotNull(schemaArray4);
        org.junit.Assert.assertArrayEquals(schemaArray4, new org.apache.avro.Schema[] {});
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(schema7);
        org.junit.Assert.assertNotNull(schema8);
        org.junit.Assert.assertNotNull(schemaList9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNotNull(schema13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "union" + "'", str14, "union");
    }

    @Test
    public void test0034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SchemaM3Random300Test0.test0034");
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
    public void test0035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SchemaM3Random300Test0.test0035");
        org.apache.avro.Schema[] schemaArray1 = new org.apache.avro.Schema[] {};
        java.util.ArrayList<org.apache.avro.Schema> schemaList2 = new java.util.ArrayList<org.apache.avro.Schema>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<org.apache.avro.Schema>) schemaList2, schemaArray1);
        org.apache.avro.Schema schema4 = org.apache.avro.Schema.createUnion((java.util.List<org.apache.avro.Schema>) schemaList2);
        org.apache.avro.Schema[] schemaArray5 = new org.apache.avro.Schema[] {};
        java.util.ArrayList<org.apache.avro.Schema> schemaList6 = new java.util.ArrayList<org.apache.avro.Schema>();
        boolean boolean7 = java.util.Collections.addAll((java.util.Collection<org.apache.avro.Schema>) schemaList6, schemaArray5);
        org.apache.avro.Schema schema8 = org.apache.avro.Schema.createUnion((java.util.List<org.apache.avro.Schema>) schemaList6);
        org.apache.avro.Schema schema9 = org.apache.avro.Schema.applyAliases(schema4, schema8);
        java.util.List<org.apache.avro.Schema> schemaList10 = schema9.getTypes();
        org.apache.avro.Schema[] schemaArray11 = new org.apache.avro.Schema[] {};
        java.util.ArrayList<org.apache.avro.Schema> schemaList12 = new java.util.ArrayList<org.apache.avro.Schema>();
        boolean boolean13 = java.util.Collections.addAll((java.util.Collection<org.apache.avro.Schema>) schemaList12, schemaArray11);
        org.apache.avro.Schema schema14 = org.apache.avro.Schema.createUnion((java.util.List<org.apache.avro.Schema>) schemaList12);
        org.apache.avro.Schema[] schemaArray15 = new org.apache.avro.Schema[] {};
        java.util.ArrayList<org.apache.avro.Schema> schemaList16 = new java.util.ArrayList<org.apache.avro.Schema>();
        boolean boolean17 = java.util.Collections.addAll((java.util.Collection<org.apache.avro.Schema>) schemaList16, schemaArray15);
        org.apache.avro.Schema schema18 = org.apache.avro.Schema.createUnion((java.util.List<org.apache.avro.Schema>) schemaList16);
        org.apache.avro.Schema schema19 = org.apache.avro.Schema.applyAliases(schema14, schema18);
        org.apache.avro.Schema schema20 = org.apache.avro.Schema.applyAliases(schema9, schema18);
        org.codehaus.jackson.JsonNode jsonNode23 = org.apache.avro.Schema.parseJson("[ ]");
        org.apache.avro.Schema.Field.Order order24 = org.apache.avro.Schema.Field.Order.DESCENDING;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.avro.Schema.Field field25 = new org.apache.avro.Schema.Field("", schema20, "hi!", jsonNode23, order24);
            org.junit.Assert.fail("Expected exception of type org.apache.avro.SchemaParseException; message: Empty name");
        } catch (org.apache.avro.SchemaParseException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(schemaArray1);
        org.junit.Assert.assertArrayEquals(schemaArray1, new org.apache.avro.Schema[] {});
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(schema4);
        org.junit.Assert.assertNotNull(schemaArray5);
        org.junit.Assert.assertArrayEquals(schemaArray5, new org.apache.avro.Schema[] {});
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(schema8);
        org.junit.Assert.assertNotNull(schema9);
        org.junit.Assert.assertNotNull(schemaList10);
        org.junit.Assert.assertNotNull(schemaArray11);
        org.junit.Assert.assertArrayEquals(schemaArray11, new org.apache.avro.Schema[] {});
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(schema14);
        org.junit.Assert.assertNotNull(schemaArray15);
        org.junit.Assert.assertArrayEquals(schemaArray15, new org.apache.avro.Schema[] {});
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(schema18);
        org.junit.Assert.assertNotNull(schema19);
        org.junit.Assert.assertNotNull(schema20);
        org.junit.Assert.assertNotNull(jsonNode23);
        org.junit.Assert.assertTrue("'" + order24 + "' != '" + org.apache.avro.Schema.Field.Order.DESCENDING + "'", order24.equals(org.apache.avro.Schema.Field.Order.DESCENDING));
    }

    @Test
    public void test0036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SchemaM3Random300Test0.test0036");
        org.apache.avro.Schema[] schemaArray0 = new org.apache.avro.Schema[] {};
        java.util.ArrayList<org.apache.avro.Schema> schemaList1 = new java.util.ArrayList<org.apache.avro.Schema>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<org.apache.avro.Schema>) schemaList1, schemaArray0);
        org.apache.avro.Schema schema3 = org.apache.avro.Schema.createUnion((java.util.List<org.apache.avro.Schema>) schemaList1);
        org.apache.avro.Schema[] schemaArray4 = new org.apache.avro.Schema[] {};
        java.util.ArrayList<org.apache.avro.Schema> schemaList5 = new java.util.ArrayList<org.apache.avro.Schema>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<org.apache.avro.Schema>) schemaList5, schemaArray4);
        org.apache.avro.Schema schema7 = org.apache.avro.Schema.createUnion((java.util.List<org.apache.avro.Schema>) schemaList5);
        org.apache.avro.Schema schema8 = org.apache.avro.Schema.applyAliases(schema3, schema7);
        java.util.List<org.apache.avro.Schema> schemaList9 = schema8.getTypes();
        org.apache.avro.Schema[] schemaArray10 = new org.apache.avro.Schema[] {};
        java.util.ArrayList<org.apache.avro.Schema> schemaList11 = new java.util.ArrayList<org.apache.avro.Schema>();
        boolean boolean12 = java.util.Collections.addAll((java.util.Collection<org.apache.avro.Schema>) schemaList11, schemaArray10);
        org.apache.avro.Schema schema13 = org.apache.avro.Schema.createUnion((java.util.List<org.apache.avro.Schema>) schemaList11);
        org.apache.avro.Schema[] schemaArray14 = new org.apache.avro.Schema[] {};
        java.util.ArrayList<org.apache.avro.Schema> schemaList15 = new java.util.ArrayList<org.apache.avro.Schema>();
        boolean boolean16 = java.util.Collections.addAll((java.util.Collection<org.apache.avro.Schema>) schemaList15, schemaArray14);
        org.apache.avro.Schema schema17 = org.apache.avro.Schema.createUnion((java.util.List<org.apache.avro.Schema>) schemaList15);
        org.apache.avro.Schema schema18 = org.apache.avro.Schema.applyAliases(schema13, schema17);
        org.apache.avro.Schema schema19 = org.apache.avro.Schema.applyAliases(schema8, schema17);
        org.apache.avro.Schema schema20 = org.apache.avro.Schema.createMap(schema8);
        org.apache.avro.Schema schema21 = org.apache.avro.Schema.createArray(schema20);
        // The following exception was thrown during execution in test generation
        try {
            schema21.addAlias("hi!");
            org.junit.Assert.fail("Expected exception of type org.apache.avro.AvroRuntimeException; message: Not a named type: {\"type\":\"array\",\"items\":{\"type\":\"map\",\"values\":[]}}");
        } catch (org.apache.avro.AvroRuntimeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(schemaArray0);
        org.junit.Assert.assertArrayEquals(schemaArray0, new org.apache.avro.Schema[] {});
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(schema3);
        org.junit.Assert.assertNotNull(schemaArray4);
        org.junit.Assert.assertArrayEquals(schemaArray4, new org.apache.avro.Schema[] {});
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(schema7);
        org.junit.Assert.assertNotNull(schema8);
        org.junit.Assert.assertNotNull(schemaList9);
        org.junit.Assert.assertNotNull(schemaArray10);
        org.junit.Assert.assertArrayEquals(schemaArray10, new org.apache.avro.Schema[] {});
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(schema13);
        org.junit.Assert.assertNotNull(schemaArray14);
        org.junit.Assert.assertArrayEquals(schemaArray14, new org.apache.avro.Schema[] {});
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(schema17);
        org.junit.Assert.assertNotNull(schema18);
        org.junit.Assert.assertNotNull(schema19);
        org.junit.Assert.assertNotNull(schema20);
        org.junit.Assert.assertNotNull(schema21);
    }

    @Test
    public void test0037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SchemaM3Random300Test0.test0037");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.avro.Schema schema4 = org.apache.avro.Schema.createRecord("", "", "[ ]", true);
            org.junit.Assert.fail("Expected exception of type org.apache.avro.SchemaParseException; message: Empty name");
        } catch (org.apache.avro.SchemaParseException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SchemaM3Random300Test0.test0038");
        org.apache.avro.Schema[] schemaArray0 = new org.apache.avro.Schema[] {};
        java.util.ArrayList<org.apache.avro.Schema> schemaList1 = new java.util.ArrayList<org.apache.avro.Schema>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<org.apache.avro.Schema>) schemaList1, schemaArray0);
        org.apache.avro.Schema schema3 = org.apache.avro.Schema.createUnion((java.util.List<org.apache.avro.Schema>) schemaList1);
        org.apache.avro.Schema[] schemaArray4 = new org.apache.avro.Schema[] {};
        java.util.ArrayList<org.apache.avro.Schema> schemaList5 = new java.util.ArrayList<org.apache.avro.Schema>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<org.apache.avro.Schema>) schemaList5, schemaArray4);
        org.apache.avro.Schema schema7 = org.apache.avro.Schema.createUnion((java.util.List<org.apache.avro.Schema>) schemaList5);
        org.apache.avro.Schema schema8 = org.apache.avro.Schema.applyAliases(schema3, schema7);
        org.apache.avro.Schema.Type type9 = schema7.getType();
        org.apache.avro.Schema schema10 = org.apache.avro.Schema.createMap(schema7);
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<java.lang.String> strList11 = schema10.getEnumSymbols();
            org.junit.Assert.fail("Expected exception of type org.apache.avro.AvroRuntimeException; message: Not an enum: {\"type\":\"map\",\"values\":[]}");
        } catch (org.apache.avro.AvroRuntimeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(schemaArray0);
        org.junit.Assert.assertArrayEquals(schemaArray0, new org.apache.avro.Schema[] {});
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(schema3);
        org.junit.Assert.assertNotNull(schemaArray4);
        org.junit.Assert.assertArrayEquals(schemaArray4, new org.apache.avro.Schema[] {});
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(schema7);
        org.junit.Assert.assertNotNull(schema8);
        org.junit.Assert.assertTrue("'" + type9 + "' != '" + org.apache.avro.Schema.Type.UNION + "'", type9.equals(org.apache.avro.Schema.Type.UNION));
        org.junit.Assert.assertNotNull(schema10);
    }

    @Test
    public void test0039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SchemaM3Random300Test0.test0039");
        org.apache.avro.Schema.Names names0 = new org.apache.avro.Schema.Names();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.avro.Schema schema2 = names0.get((java.lang.Object) "");
            org.junit.Assert.fail("Expected exception of type org.apache.avro.SchemaParseException; message: Empty name");
        } catch (org.apache.avro.SchemaParseException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SchemaM3Random300Test0.test0040");
        org.apache.avro.Schema[] schemaArray0 = new org.apache.avro.Schema[] {};
        java.util.ArrayList<org.apache.avro.Schema> schemaList1 = new java.util.ArrayList<org.apache.avro.Schema>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<org.apache.avro.Schema>) schemaList1, schemaArray0);
        org.apache.avro.Schema schema3 = org.apache.avro.Schema.createUnion((java.util.List<org.apache.avro.Schema>) schemaList1);
        org.apache.avro.Schema[] schemaArray4 = new org.apache.avro.Schema[] {};
        java.util.ArrayList<org.apache.avro.Schema> schemaList5 = new java.util.ArrayList<org.apache.avro.Schema>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<org.apache.avro.Schema>) schemaList5, schemaArray4);
        org.apache.avro.Schema schema7 = org.apache.avro.Schema.createUnion((java.util.List<org.apache.avro.Schema>) schemaList5);
        org.apache.avro.Schema schema8 = org.apache.avro.Schema.applyAliases(schema3, schema7);
        java.util.List<org.apache.avro.Schema> schemaList9 = schema8.getTypes();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.avro.Schema schema10 = schema8.getValueType();
            org.junit.Assert.fail("Expected exception of type org.apache.avro.AvroRuntimeException; message: Not a map: []");
        } catch (org.apache.avro.AvroRuntimeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(schemaArray0);
        org.junit.Assert.assertArrayEquals(schemaArray0, new org.apache.avro.Schema[] {});
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(schema3);
        org.junit.Assert.assertNotNull(schemaArray4);
        org.junit.Assert.assertArrayEquals(schemaArray4, new org.apache.avro.Schema[] {});
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(schema7);
        org.junit.Assert.assertNotNull(schema8);
        org.junit.Assert.assertNotNull(schemaList9);
    }

    @Test
    public void test0041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SchemaM3Random300Test0.test0041");
        org.apache.avro.Schema[] schemaArray0 = new org.apache.avro.Schema[] {};
        java.util.ArrayList<org.apache.avro.Schema> schemaList1 = new java.util.ArrayList<org.apache.avro.Schema>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<org.apache.avro.Schema>) schemaList1, schemaArray0);
        org.apache.avro.Schema schema3 = org.apache.avro.Schema.createUnion((java.util.List<org.apache.avro.Schema>) schemaList1);
        org.apache.avro.Schema[] schemaArray4 = new org.apache.avro.Schema[] {};
        java.util.ArrayList<org.apache.avro.Schema> schemaList5 = new java.util.ArrayList<org.apache.avro.Schema>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<org.apache.avro.Schema>) schemaList5, schemaArray4);
        org.apache.avro.Schema schema7 = org.apache.avro.Schema.createUnion((java.util.List<org.apache.avro.Schema>) schemaList5);
        org.apache.avro.Schema schema8 = org.apache.avro.Schema.applyAliases(schema3, schema7);
        java.util.List<org.apache.avro.Schema> schemaList9 = schema8.getTypes();
        org.apache.avro.Schema[] schemaArray10 = new org.apache.avro.Schema[] {};
        java.util.ArrayList<org.apache.avro.Schema> schemaList11 = new java.util.ArrayList<org.apache.avro.Schema>();
        boolean boolean12 = java.util.Collections.addAll((java.util.Collection<org.apache.avro.Schema>) schemaList11, schemaArray10);
        org.apache.avro.Schema schema13 = org.apache.avro.Schema.createUnion((java.util.List<org.apache.avro.Schema>) schemaList11);
        org.apache.avro.Schema[] schemaArray14 = new org.apache.avro.Schema[] {};
        java.util.ArrayList<org.apache.avro.Schema> schemaList15 = new java.util.ArrayList<org.apache.avro.Schema>();
        boolean boolean16 = java.util.Collections.addAll((java.util.Collection<org.apache.avro.Schema>) schemaList15, schemaArray14);
        org.apache.avro.Schema schema17 = org.apache.avro.Schema.createUnion((java.util.List<org.apache.avro.Schema>) schemaList15);
        org.apache.avro.Schema schema18 = org.apache.avro.Schema.applyAliases(schema13, schema17);
        org.apache.avro.Schema schema19 = org.apache.avro.Schema.applyAliases(schema8, schema17);
        org.apache.avro.Schema.Names names20 = new org.apache.avro.Schema.Names();
        java.lang.String str21 = names20.space();
        int int22 = names20.size();
        org.codehaus.jackson.JsonGenerator jsonGenerator23 = null;
        // The following exception was thrown during execution in test generation
        try {
            schema19.fieldsToJson(names20, jsonGenerator23);
            org.junit.Assert.fail("Expected exception of type org.apache.avro.AvroRuntimeException; message: Not a record: []");
        } catch (org.apache.avro.AvroRuntimeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(schemaArray0);
        org.junit.Assert.assertArrayEquals(schemaArray0, new org.apache.avro.Schema[] {});
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(schema3);
        org.junit.Assert.assertNotNull(schemaArray4);
        org.junit.Assert.assertArrayEquals(schemaArray4, new org.apache.avro.Schema[] {});
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(schema7);
        org.junit.Assert.assertNotNull(schema8);
        org.junit.Assert.assertNotNull(schemaList9);
        org.junit.Assert.assertNotNull(schemaArray10);
        org.junit.Assert.assertArrayEquals(schemaArray10, new org.apache.avro.Schema[] {});
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(schema13);
        org.junit.Assert.assertNotNull(schemaArray14);
        org.junit.Assert.assertArrayEquals(schemaArray14, new org.apache.avro.Schema[] {});
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(schema17);
        org.junit.Assert.assertNotNull(schema18);
        org.junit.Assert.assertNotNull(schema19);
        org.junit.Assert.assertNull(str21);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
    }

    @Test
    public void test0042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SchemaM3Random300Test0.test0042");
        org.apache.avro.Schema[] schemaArray0 = new org.apache.avro.Schema[] {};
        java.util.ArrayList<org.apache.avro.Schema> schemaList1 = new java.util.ArrayList<org.apache.avro.Schema>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<org.apache.avro.Schema>) schemaList1, schemaArray0);
        org.apache.avro.Schema schema3 = org.apache.avro.Schema.createUnion((java.util.List<org.apache.avro.Schema>) schemaList1);
        org.apache.avro.Schema[] schemaArray4 = new org.apache.avro.Schema[] {};
        java.util.ArrayList<org.apache.avro.Schema> schemaList5 = new java.util.ArrayList<org.apache.avro.Schema>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<org.apache.avro.Schema>) schemaList5, schemaArray4);
        org.apache.avro.Schema schema7 = org.apache.avro.Schema.createUnion((java.util.List<org.apache.avro.Schema>) schemaList5);
        org.apache.avro.Schema schema8 = org.apache.avro.Schema.applyAliases(schema3, schema7);
        java.util.List<org.apache.avro.Schema> schemaList9 = schema8.getTypes();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.avro.Schema.Field field11 = schema8.getField("");
            org.junit.Assert.fail("Expected exception of type org.apache.avro.AvroRuntimeException; message: Not a record: []");
        } catch (org.apache.avro.AvroRuntimeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(schemaArray0);
        org.junit.Assert.assertArrayEquals(schemaArray0, new org.apache.avro.Schema[] {});
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(schema3);
        org.junit.Assert.assertNotNull(schemaArray4);
        org.junit.Assert.assertArrayEquals(schemaArray4, new org.apache.avro.Schema[] {});
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(schema7);
        org.junit.Assert.assertNotNull(schema8);
        org.junit.Assert.assertNotNull(schemaList9);
    }

    @Test
    public void test0043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SchemaM3Random300Test0.test0043");
        org.apache.avro.Schema[] schemaArray0 = new org.apache.avro.Schema[] {};
        java.util.ArrayList<org.apache.avro.Schema> schemaList1 = new java.util.ArrayList<org.apache.avro.Schema>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<org.apache.avro.Schema>) schemaList1, schemaArray0);
        org.apache.avro.Schema schema3 = org.apache.avro.Schema.createUnion((java.util.List<org.apache.avro.Schema>) schemaList1);
        org.apache.avro.Schema[] schemaArray4 = new org.apache.avro.Schema[] {};
        java.util.ArrayList<org.apache.avro.Schema> schemaList5 = new java.util.ArrayList<org.apache.avro.Schema>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<org.apache.avro.Schema>) schemaList5, schemaArray4);
        org.apache.avro.Schema schema7 = org.apache.avro.Schema.createUnion((java.util.List<org.apache.avro.Schema>) schemaList5);
        org.apache.avro.Schema schema8 = org.apache.avro.Schema.applyAliases(schema3, schema7);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str9 = schema8.getNamespace();
            org.junit.Assert.fail("Expected exception of type org.apache.avro.AvroRuntimeException; message: Not a named type: []");
        } catch (org.apache.avro.AvroRuntimeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(schemaArray0);
        org.junit.Assert.assertArrayEquals(schemaArray0, new org.apache.avro.Schema[] {});
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(schema3);
        org.junit.Assert.assertNotNull(schemaArray4);
        org.junit.Assert.assertArrayEquals(schemaArray4, new org.apache.avro.Schema[] {});
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(schema7);
        org.junit.Assert.assertNotNull(schema8);
    }

    @Test
    public void test0044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SchemaM3Random300Test0.test0044");
        org.apache.avro.Schema.Names names0 = new org.apache.avro.Schema.Names();
        org.apache.avro.Schema[] schemaArray2 = new org.apache.avro.Schema[] {};
        java.util.ArrayList<org.apache.avro.Schema> schemaList3 = new java.util.ArrayList<org.apache.avro.Schema>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<org.apache.avro.Schema>) schemaList3, schemaArray2);
        org.apache.avro.Schema schema5 = org.apache.avro.Schema.createUnion((java.util.List<org.apache.avro.Schema>) schemaList3);
        org.apache.avro.Schema[] schemaArray6 = new org.apache.avro.Schema[] {};
        java.util.ArrayList<org.apache.avro.Schema> schemaList7 = new java.util.ArrayList<org.apache.avro.Schema>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<org.apache.avro.Schema>) schemaList7, schemaArray6);
        org.apache.avro.Schema schema9 = org.apache.avro.Schema.createUnion((java.util.List<org.apache.avro.Schema>) schemaList7);
        org.apache.avro.Schema schema10 = org.apache.avro.Schema.applyAliases(schema5, schema9);
        java.util.List<org.apache.avro.Schema> schemaList11 = schema10.getTypes();
        org.apache.avro.Schema[] schemaArray12 = new org.apache.avro.Schema[] {};
        java.util.ArrayList<org.apache.avro.Schema> schemaList13 = new java.util.ArrayList<org.apache.avro.Schema>();
        boolean boolean14 = java.util.Collections.addAll((java.util.Collection<org.apache.avro.Schema>) schemaList13, schemaArray12);
        org.apache.avro.Schema schema15 = org.apache.avro.Schema.createUnion((java.util.List<org.apache.avro.Schema>) schemaList13);
        org.apache.avro.Schema[] schemaArray16 = new org.apache.avro.Schema[] {};
        java.util.ArrayList<org.apache.avro.Schema> schemaList17 = new java.util.ArrayList<org.apache.avro.Schema>();
        boolean boolean18 = java.util.Collections.addAll((java.util.Collection<org.apache.avro.Schema>) schemaList17, schemaArray16);
        org.apache.avro.Schema schema19 = org.apache.avro.Schema.createUnion((java.util.List<org.apache.avro.Schema>) schemaList17);
        org.apache.avro.Schema schema20 = org.apache.avro.Schema.applyAliases(schema15, schema19);
        org.apache.avro.Schema schema21 = org.apache.avro.Schema.applyAliases(schema10, schema19);
        org.apache.avro.Schema schema22 = names0.getOrDefault((java.lang.Object) 100.0d, schema21);
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<org.apache.avro.Schema.Field> fieldList23 = schema21.getFields();
            org.junit.Assert.fail("Expected exception of type org.apache.avro.AvroRuntimeException; message: Not a record: []");
        } catch (org.apache.avro.AvroRuntimeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(schemaArray2);
        org.junit.Assert.assertArrayEquals(schemaArray2, new org.apache.avro.Schema[] {});
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(schema5);
        org.junit.Assert.assertNotNull(schemaArray6);
        org.junit.Assert.assertArrayEquals(schemaArray6, new org.apache.avro.Schema[] {});
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(schema9);
        org.junit.Assert.assertNotNull(schema10);
        org.junit.Assert.assertNotNull(schemaList11);
        org.junit.Assert.assertNotNull(schemaArray12);
        org.junit.Assert.assertArrayEquals(schemaArray12, new org.apache.avro.Schema[] {});
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(schema15);
        org.junit.Assert.assertNotNull(schemaArray16);
        org.junit.Assert.assertArrayEquals(schemaArray16, new org.apache.avro.Schema[] {});
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(schema19);
        org.junit.Assert.assertNotNull(schema20);
        org.junit.Assert.assertNotNull(schema21);
        org.junit.Assert.assertNotNull(schema22);
    }

    @Test
    public void test0045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SchemaM3Random300Test0.test0045");
        org.apache.avro.Schema[] schemaArray0 = new org.apache.avro.Schema[] {};
        java.util.ArrayList<org.apache.avro.Schema> schemaList1 = new java.util.ArrayList<org.apache.avro.Schema>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<org.apache.avro.Schema>) schemaList1, schemaArray0);
        org.apache.avro.Schema schema3 = org.apache.avro.Schema.createUnion((java.util.List<org.apache.avro.Schema>) schemaList1);
        org.apache.avro.Schema[] schemaArray4 = new org.apache.avro.Schema[] {};
        java.util.ArrayList<org.apache.avro.Schema> schemaList5 = new java.util.ArrayList<org.apache.avro.Schema>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<org.apache.avro.Schema>) schemaList5, schemaArray4);
        org.apache.avro.Schema schema7 = org.apache.avro.Schema.createUnion((java.util.List<org.apache.avro.Schema>) schemaList5);
        org.apache.avro.Schema schema8 = org.apache.avro.Schema.applyAliases(schema3, schema7);
        org.apache.avro.Schema.Type type9 = schema7.getType();
        org.apache.avro.Schema schema10 = org.apache.avro.Schema.createMap(schema7);
        // The following exception was thrown during execution in test generation
        try {
            schema7.addProp("", "[]");
            org.junit.Assert.fail("Expected exception of type org.apache.avro.AvroRuntimeException; message: Can't set properties on a union: []");
        } catch (org.apache.avro.AvroRuntimeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(schemaArray0);
        org.junit.Assert.assertArrayEquals(schemaArray0, new org.apache.avro.Schema[] {});
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(schema3);
        org.junit.Assert.assertNotNull(schemaArray4);
        org.junit.Assert.assertArrayEquals(schemaArray4, new org.apache.avro.Schema[] {});
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(schema7);
        org.junit.Assert.assertNotNull(schema8);
        org.junit.Assert.assertTrue("'" + type9 + "' != '" + org.apache.avro.Schema.Type.UNION + "'", type9.equals(org.apache.avro.Schema.Type.UNION));
        org.junit.Assert.assertNotNull(schema10);
    }

    @Test
    public void test0046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SchemaM3Random300Test0.test0046");
        // The following exception was thrown during execution in test generation
        try {
            org.codehaus.jackson.JsonNode jsonNode1 = org.apache.avro.Schema.parseJson("union");
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: org.codehaus.jackson.JsonParseException: Unexpected character ('u' (code 117)): expected a valid value (number, String, array, object, 'true', 'false' or 'null')? at [Source: java.io.StringReader@49026eb8; line: 1, column: 2]");
        } catch (java.lang.RuntimeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SchemaM3Random300Test0.test0047");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.avro.Schema schema4 = org.apache.avro.Schema.createFixed("", "", "[]", (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type org.apache.avro.SchemaParseException; message: Empty name");
        } catch (org.apache.avro.SchemaParseException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SchemaM3Random300Test0.test0048");
        org.apache.avro.Schema[] schemaArray0 = new org.apache.avro.Schema[] {};
        java.util.ArrayList<org.apache.avro.Schema> schemaList1 = new java.util.ArrayList<org.apache.avro.Schema>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<org.apache.avro.Schema>) schemaList1, schemaArray0);
        org.apache.avro.Schema schema3 = org.apache.avro.Schema.createUnion((java.util.List<org.apache.avro.Schema>) schemaList1);
        org.apache.avro.Schema[] schemaArray4 = new org.apache.avro.Schema[] {};
        java.util.ArrayList<org.apache.avro.Schema> schemaList5 = new java.util.ArrayList<org.apache.avro.Schema>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<org.apache.avro.Schema>) schemaList5, schemaArray4);
        org.apache.avro.Schema schema7 = org.apache.avro.Schema.createUnion((java.util.List<org.apache.avro.Schema>) schemaList5);
        org.apache.avro.Schema schema8 = org.apache.avro.Schema.applyAliases(schema3, schema7);
        java.util.List<org.apache.avro.Schema> schemaList9 = schema8.getTypes();
        org.apache.avro.Schema[] schemaArray10 = new org.apache.avro.Schema[] {};
        java.util.ArrayList<org.apache.avro.Schema> schemaList11 = new java.util.ArrayList<org.apache.avro.Schema>();
        boolean boolean12 = java.util.Collections.addAll((java.util.Collection<org.apache.avro.Schema>) schemaList11, schemaArray10);
        org.apache.avro.Schema schema13 = org.apache.avro.Schema.createUnion((java.util.List<org.apache.avro.Schema>) schemaList11);
        org.apache.avro.Schema[] schemaArray14 = new org.apache.avro.Schema[] {};
        java.util.ArrayList<org.apache.avro.Schema> schemaList15 = new java.util.ArrayList<org.apache.avro.Schema>();
        boolean boolean16 = java.util.Collections.addAll((java.util.Collection<org.apache.avro.Schema>) schemaList15, schemaArray14);
        org.apache.avro.Schema schema17 = org.apache.avro.Schema.createUnion((java.util.List<org.apache.avro.Schema>) schemaList15);
        org.apache.avro.Schema schema18 = org.apache.avro.Schema.applyAliases(schema13, schema17);
        org.apache.avro.Schema schema19 = org.apache.avro.Schema.applyAliases(schema8, schema17);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean21 = schema19.hasEnumSymbol("union");
            org.junit.Assert.fail("Expected exception of type org.apache.avro.AvroRuntimeException; message: Not an enum: []");
        } catch (org.apache.avro.AvroRuntimeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(schemaArray0);
        org.junit.Assert.assertArrayEquals(schemaArray0, new org.apache.avro.Schema[] {});
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(schema3);
        org.junit.Assert.assertNotNull(schemaArray4);
        org.junit.Assert.assertArrayEquals(schemaArray4, new org.apache.avro.Schema[] {});
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(schema7);
        org.junit.Assert.assertNotNull(schema8);
        org.junit.Assert.assertNotNull(schemaList9);
        org.junit.Assert.assertNotNull(schemaArray10);
        org.junit.Assert.assertArrayEquals(schemaArray10, new org.apache.avro.Schema[] {});
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(schema13);
        org.junit.Assert.assertNotNull(schemaArray14);
        org.junit.Assert.assertArrayEquals(schemaArray14, new org.apache.avro.Schema[] {});
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(schema17);
        org.junit.Assert.assertNotNull(schema18);
        org.junit.Assert.assertNotNull(schema19);
    }

    @Test
    public void test0049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SchemaM3Random300Test0.test0049");
        org.apache.avro.Schema.Names names0 = new org.apache.avro.Schema.Names();
        names0.space("[ ]");
        java.util.Collection<org.apache.avro.Schema> schemaCollection3 = names0.values();
        java.lang.Object obj4 = names0.clone();
        org.junit.Assert.assertNotNull(schemaCollection3);
        org.junit.Assert.assertNotNull(obj4);
        org.junit.Assert.assertEquals(obj4.toString(), "{}");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj4), "{}");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj4), "{}");
    }

    @Test
    public void test0050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SchemaM3Random300Test0.test0050");
        org.apache.avro.Schema[] schemaArray0 = new org.apache.avro.Schema[] {};
        java.util.ArrayList<org.apache.avro.Schema> schemaList1 = new java.util.ArrayList<org.apache.avro.Schema>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<org.apache.avro.Schema>) schemaList1, schemaArray0);
        org.apache.avro.Schema schema3 = org.apache.avro.Schema.createUnion((java.util.List<org.apache.avro.Schema>) schemaList1);
        org.apache.avro.Schema[] schemaArray4 = new org.apache.avro.Schema[] {};
        java.util.ArrayList<org.apache.avro.Schema> schemaList5 = new java.util.ArrayList<org.apache.avro.Schema>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<org.apache.avro.Schema>) schemaList5, schemaArray4);
        org.apache.avro.Schema schema7 = org.apache.avro.Schema.createUnion((java.util.List<org.apache.avro.Schema>) schemaList5);
        org.apache.avro.Schema schema8 = org.apache.avro.Schema.applyAliases(schema3, schema7);
        java.util.List<org.apache.avro.Schema> schemaList9 = schema8.getTypes();
        org.apache.avro.Schema[] schemaArray10 = new org.apache.avro.Schema[] {};
        java.util.ArrayList<org.apache.avro.Schema> schemaList11 = new java.util.ArrayList<org.apache.avro.Schema>();
        boolean boolean12 = java.util.Collections.addAll((java.util.Collection<org.apache.avro.Schema>) schemaList11, schemaArray10);
        org.apache.avro.Schema schema13 = org.apache.avro.Schema.createUnion((java.util.List<org.apache.avro.Schema>) schemaList11);
        org.apache.avro.Schema[] schemaArray14 = new org.apache.avro.Schema[] {};
        java.util.ArrayList<org.apache.avro.Schema> schemaList15 = new java.util.ArrayList<org.apache.avro.Schema>();
        boolean boolean16 = java.util.Collections.addAll((java.util.Collection<org.apache.avro.Schema>) schemaList15, schemaArray14);
        org.apache.avro.Schema schema17 = org.apache.avro.Schema.createUnion((java.util.List<org.apache.avro.Schema>) schemaList15);
        org.apache.avro.Schema schema18 = org.apache.avro.Schema.applyAliases(schema13, schema17);
        org.apache.avro.Schema schema19 = org.apache.avro.Schema.applyAliases(schema8, schema17);
        org.apache.avro.Schema schema20 = org.apache.avro.Schema.createMap(schema8);
        java.lang.String str21 = schema8.getName();
        // The following exception was thrown during execution in test generation
        try {
            schema8.addProp("[ ]", "");
            org.junit.Assert.fail("Expected exception of type org.apache.avro.AvroRuntimeException; message: Can't set properties on a union: []");
        } catch (org.apache.avro.AvroRuntimeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(schemaArray0);
        org.junit.Assert.assertArrayEquals(schemaArray0, new org.apache.avro.Schema[] {});
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(schema3);
        org.junit.Assert.assertNotNull(schemaArray4);
        org.junit.Assert.assertArrayEquals(schemaArray4, new org.apache.avro.Schema[] {});
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(schema7);
        org.junit.Assert.assertNotNull(schema8);
        org.junit.Assert.assertNotNull(schemaList9);
        org.junit.Assert.assertNotNull(schemaArray10);
        org.junit.Assert.assertArrayEquals(schemaArray10, new org.apache.avro.Schema[] {});
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(schema13);
        org.junit.Assert.assertNotNull(schemaArray14);
        org.junit.Assert.assertArrayEquals(schemaArray14, new org.apache.avro.Schema[] {});
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(schema17);
        org.junit.Assert.assertNotNull(schema18);
        org.junit.Assert.assertNotNull(schema19);
        org.junit.Assert.assertNotNull(schema20);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "union" + "'", str21, "union");
    }

    @Test
    public void test0051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SchemaM3Random300Test0.test0051");
        java.util.Map<java.lang.String, org.apache.avro.Schema.Type> strMap0 = org.apache.avro.Schema.PRIMITIVES;
        org.junit.Assert.assertNotNull(strMap0);
    }

    @Test
    public void test0052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SchemaM3Random300Test0.test0052");
        java.io.File file0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.avro.Schema schema1 = org.apache.avro.Schema.parse(file0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SchemaM3Random300Test0.test0053");
        org.apache.avro.Schema.Type type0 = org.apache.avro.Schema.Type.BYTES;
        java.lang.Class<?> wildcardClass1 = type0.getClass();
        org.junit.Assert.assertTrue("'" + type0 + "' != '" + org.apache.avro.Schema.Type.BYTES + "'", type0.equals(org.apache.avro.Schema.Type.BYTES));
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test0054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SchemaM3Random300Test0.test0054");
        org.apache.avro.Schema[] schemaArray0 = new org.apache.avro.Schema[] {};
        java.util.ArrayList<org.apache.avro.Schema> schemaList1 = new java.util.ArrayList<org.apache.avro.Schema>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<org.apache.avro.Schema>) schemaList1, schemaArray0);
        org.apache.avro.Schema schema3 = org.apache.avro.Schema.createUnion((java.util.List<org.apache.avro.Schema>) schemaList1);
        org.apache.avro.Schema[] schemaArray4 = new org.apache.avro.Schema[] {};
        java.util.ArrayList<org.apache.avro.Schema> schemaList5 = new java.util.ArrayList<org.apache.avro.Schema>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<org.apache.avro.Schema>) schemaList5, schemaArray4);
        org.apache.avro.Schema schema7 = org.apache.avro.Schema.createUnion((java.util.List<org.apache.avro.Schema>) schemaList5);
        org.apache.avro.Schema schema8 = org.apache.avro.Schema.applyAliases(schema3, schema7);
        java.util.List<org.apache.avro.Schema> schemaList9 = schema8.getTypes();
        boolean boolean11 = schema8.equals((java.lang.Object) "hi!");
        java.lang.String str12 = schema8.getDoc();
        org.apache.avro.Schema schema13 = org.apache.avro.Schema.createArray(schema8);
        java.lang.String str14 = schema8.getFullName();
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<org.apache.avro.Schema.Field> fieldList15 = schema8.getFields();
            org.junit.Assert.fail("Expected exception of type org.apache.avro.AvroRuntimeException; message: Not a record: []");
        } catch (org.apache.avro.AvroRuntimeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(schemaArray0);
        org.junit.Assert.assertArrayEquals(schemaArray0, new org.apache.avro.Schema[] {});
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(schema3);
        org.junit.Assert.assertNotNull(schemaArray4);
        org.junit.Assert.assertArrayEquals(schemaArray4, new org.apache.avro.Schema[] {});
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(schema7);
        org.junit.Assert.assertNotNull(schema8);
        org.junit.Assert.assertNotNull(schemaList9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNotNull(schema13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "union" + "'", str14, "union");
    }

    @Test
    public void test0055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SchemaM3Random300Test0.test0055");
        org.apache.avro.Schema.Parser parser0 = new org.apache.avro.Schema.Parser();
        org.apache.avro.Schema.Parser parser2 = parser0.setValidate(true);
        java.util.Map<java.lang.String, org.apache.avro.Schema> strMap3 = parser0.getTypes();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.avro.Schema schema5 = parser0.parse("hi!");
            org.junit.Assert.fail("Expected exception of type org.apache.avro.SchemaParseException; message: org.codehaus.jackson.JsonParseException: Unexpected character ('h' (code 104)): expected a valid value (number, String, array, object, 'true', 'false' or 'null')? at [Source: java.io.StringReader@54473794; line: 1, column: 2]");
        } catch (org.apache.avro.SchemaParseException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(parser2);
        org.junit.Assert.assertNotNull(strMap3);
    }

    @Test
    public void test0056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SchemaM3Random300Test0.test0056");
        org.apache.avro.Schema[] schemaArray0 = new org.apache.avro.Schema[] {};
        java.util.ArrayList<org.apache.avro.Schema> schemaList1 = new java.util.ArrayList<org.apache.avro.Schema>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<org.apache.avro.Schema>) schemaList1, schemaArray0);
        org.apache.avro.Schema schema3 = org.apache.avro.Schema.createUnion((java.util.List<org.apache.avro.Schema>) schemaList1);
        org.apache.avro.Schema[] schemaArray4 = new org.apache.avro.Schema[] {};
        java.util.ArrayList<org.apache.avro.Schema> schemaList5 = new java.util.ArrayList<org.apache.avro.Schema>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<org.apache.avro.Schema>) schemaList5, schemaArray4);
        org.apache.avro.Schema schema7 = org.apache.avro.Schema.createUnion((java.util.List<org.apache.avro.Schema>) schemaList5);
        org.apache.avro.Schema schema8 = org.apache.avro.Schema.applyAliases(schema3, schema7);
        java.util.List<org.apache.avro.Schema> schemaList9 = schema8.getTypes();
        boolean boolean11 = schema8.equals((java.lang.Object) "hi!");
        java.lang.String str12 = schema8.getDoc();
        org.apache.avro.Schema schema13 = org.apache.avro.Schema.createArray(schema8);
        java.lang.String str14 = schema8.getFullName();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Set<java.lang.String> strSet15 = schema8.getAliases();
            org.junit.Assert.fail("Expected exception of type org.apache.avro.AvroRuntimeException; message: Not a named type: []");
        } catch (org.apache.avro.AvroRuntimeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(schemaArray0);
        org.junit.Assert.assertArrayEquals(schemaArray0, new org.apache.avro.Schema[] {});
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(schema3);
        org.junit.Assert.assertNotNull(schemaArray4);
        org.junit.Assert.assertArrayEquals(schemaArray4, new org.apache.avro.Schema[] {});
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(schema7);
        org.junit.Assert.assertNotNull(schema8);
        org.junit.Assert.assertNotNull(schemaList9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNotNull(schema13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "union" + "'", str14, "union");
    }

    @Test
    public void test0057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SchemaM3Random300Test0.test0057");
        org.apache.avro.Schema.LockableArrayList<org.apache.avro.Schema.Field.Order> orderList1 = new org.apache.avro.Schema.LockableArrayList<org.apache.avro.Schema.Field.Order>((int) ' ');
    }

    @Test
    public void test0058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SchemaM3Random300Test0.test0058");
        org.apache.avro.Schema.Type type0 = org.apache.avro.Schema.Type.INT;
        org.apache.avro.Schema schema1 = org.apache.avro.Schema.create(type0);
        // The following exception was thrown during execution in test generation
        try {
            int int3 = schema1.getEnumOrdinal("");
            org.junit.Assert.fail("Expected exception of type org.apache.avro.AvroRuntimeException; message: Not an enum: \"int\"");
        } catch (org.apache.avro.AvroRuntimeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + type0 + "' != '" + org.apache.avro.Schema.Type.INT + "'", type0.equals(org.apache.avro.Schema.Type.INT));
        org.junit.Assert.assertNotNull(schema1);
    }

    @Test
    public void test0059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SchemaM3Random300Test0.test0059");
        org.apache.avro.Schema[] schemaArray0 = new org.apache.avro.Schema[] {};
        java.util.ArrayList<org.apache.avro.Schema> schemaList1 = new java.util.ArrayList<org.apache.avro.Schema>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<org.apache.avro.Schema>) schemaList1, schemaArray0);
        org.apache.avro.Schema schema3 = org.apache.avro.Schema.createUnion((java.util.List<org.apache.avro.Schema>) schemaList1);
        org.apache.avro.Schema[] schemaArray4 = new org.apache.avro.Schema[] {};
        java.util.ArrayList<org.apache.avro.Schema> schemaList5 = new java.util.ArrayList<org.apache.avro.Schema>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<org.apache.avro.Schema>) schemaList5, schemaArray4);
        org.apache.avro.Schema schema7 = org.apache.avro.Schema.createUnion((java.util.List<org.apache.avro.Schema>) schemaList5);
        org.apache.avro.Schema schema8 = org.apache.avro.Schema.applyAliases(schema3, schema7);
        java.util.List<org.apache.avro.Schema> schemaList9 = schema8.getTypes();
        org.apache.avro.Schema[] schemaArray10 = new org.apache.avro.Schema[] {};
        java.util.ArrayList<org.apache.avro.Schema> schemaList11 = new java.util.ArrayList<org.apache.avro.Schema>();
        boolean boolean12 = java.util.Collections.addAll((java.util.Collection<org.apache.avro.Schema>) schemaList11, schemaArray10);
        org.apache.avro.Schema schema13 = org.apache.avro.Schema.createUnion((java.util.List<org.apache.avro.Schema>) schemaList11);
        org.apache.avro.Schema[] schemaArray14 = new org.apache.avro.Schema[] {};
        java.util.ArrayList<org.apache.avro.Schema> schemaList15 = new java.util.ArrayList<org.apache.avro.Schema>();
        boolean boolean16 = java.util.Collections.addAll((java.util.Collection<org.apache.avro.Schema>) schemaList15, schemaArray14);
        org.apache.avro.Schema schema17 = org.apache.avro.Schema.createUnion((java.util.List<org.apache.avro.Schema>) schemaList15);
        org.apache.avro.Schema schema18 = org.apache.avro.Schema.applyAliases(schema13, schema17);
        org.apache.avro.Schema schema19 = org.apache.avro.Schema.applyAliases(schema8, schema17);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.avro.Schema schema20 = schema19.getElementType();
            org.junit.Assert.fail("Expected exception of type org.apache.avro.AvroRuntimeException; message: Not an array: []");
        } catch (org.apache.avro.AvroRuntimeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(schemaArray0);
        org.junit.Assert.assertArrayEquals(schemaArray0, new org.apache.avro.Schema[] {});
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(schema3);
        org.junit.Assert.assertNotNull(schemaArray4);
        org.junit.Assert.assertArrayEquals(schemaArray4, new org.apache.avro.Schema[] {});
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(schema7);
        org.junit.Assert.assertNotNull(schema8);
        org.junit.Assert.assertNotNull(schemaList9);
        org.junit.Assert.assertNotNull(schemaArray10);
        org.junit.Assert.assertArrayEquals(schemaArray10, new org.apache.avro.Schema[] {});
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(schema13);
        org.junit.Assert.assertNotNull(schemaArray14);
        org.junit.Assert.assertArrayEquals(schemaArray14, new org.apache.avro.Schema[] {});
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(schema17);
        org.junit.Assert.assertNotNull(schema18);
        org.junit.Assert.assertNotNull(schema19);
    }

    @Test
    public void test0060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SchemaM3Random300Test0.test0060");
        org.apache.avro.Schema[] schemaArray0 = new org.apache.avro.Schema[] {};
        java.util.ArrayList<org.apache.avro.Schema> schemaList1 = new java.util.ArrayList<org.apache.avro.Schema>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<org.apache.avro.Schema>) schemaList1, schemaArray0);
        org.apache.avro.Schema schema3 = org.apache.avro.Schema.createUnion((java.util.List<org.apache.avro.Schema>) schemaList1);
        org.apache.avro.Schema[] schemaArray4 = new org.apache.avro.Schema[] {};
        java.util.ArrayList<org.apache.avro.Schema> schemaList5 = new java.util.ArrayList<org.apache.avro.Schema>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<org.apache.avro.Schema>) schemaList5, schemaArray4);
        org.apache.avro.Schema schema7 = org.apache.avro.Schema.createUnion((java.util.List<org.apache.avro.Schema>) schemaList5);
        org.apache.avro.Schema schema8 = org.apache.avro.Schema.applyAliases(schema3, schema7);
        java.lang.String str9 = schema3.getFullName();
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<org.apache.avro.Schema.Field> fieldList10 = schema3.getFields();
            org.junit.Assert.fail("Expected exception of type org.apache.avro.AvroRuntimeException; message: Not a record: []");
        } catch (org.apache.avro.AvroRuntimeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(schemaArray0);
        org.junit.Assert.assertArrayEquals(schemaArray0, new org.apache.avro.Schema[] {});
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(schema3);
        org.junit.Assert.assertNotNull(schemaArray4);
        org.junit.Assert.assertArrayEquals(schemaArray4, new org.apache.avro.Schema[] {});
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(schema7);
        org.junit.Assert.assertNotNull(schema8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "union" + "'", str9, "union");
    }

    @Test
    public void test0061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SchemaM3Random300Test0.test0061");
        org.apache.avro.Schema[] schemaArray0 = new org.apache.avro.Schema[] {};
        java.util.ArrayList<org.apache.avro.Schema> schemaList1 = new java.util.ArrayList<org.apache.avro.Schema>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<org.apache.avro.Schema>) schemaList1, schemaArray0);
        org.apache.avro.Schema schema3 = org.apache.avro.Schema.createUnion((java.util.List<org.apache.avro.Schema>) schemaList1);
        org.apache.avro.Schema[] schemaArray4 = new org.apache.avro.Schema[] {};
        java.util.ArrayList<org.apache.avro.Schema> schemaList5 = new java.util.ArrayList<org.apache.avro.Schema>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<org.apache.avro.Schema>) schemaList5, schemaArray4);
        org.apache.avro.Schema schema7 = org.apache.avro.Schema.createUnion((java.util.List<org.apache.avro.Schema>) schemaList5);
        org.apache.avro.Schema schema8 = org.apache.avro.Schema.applyAliases(schema3, schema7);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.avro.Schema.Field field10 = schema8.getField("union");
            org.junit.Assert.fail("Expected exception of type org.apache.avro.AvroRuntimeException; message: Not a record: []");
        } catch (org.apache.avro.AvroRuntimeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(schemaArray0);
        org.junit.Assert.assertArrayEquals(schemaArray0, new org.apache.avro.Schema[] {});
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(schema3);
        org.junit.Assert.assertNotNull(schemaArray4);
        org.junit.Assert.assertArrayEquals(schemaArray4, new org.apache.avro.Schema[] {});
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(schema7);
        org.junit.Assert.assertNotNull(schema8);
    }

    @Test
    public void test0062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SchemaM3Random300Test0.test0062");
        org.apache.avro.Schema[] schemaArray0 = new org.apache.avro.Schema[] {};
        java.util.ArrayList<org.apache.avro.Schema> schemaList1 = new java.util.ArrayList<org.apache.avro.Schema>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<org.apache.avro.Schema>) schemaList1, schemaArray0);
        org.apache.avro.Schema schema3 = org.apache.avro.Schema.createUnion((java.util.List<org.apache.avro.Schema>) schemaList1);
        org.apache.avro.Schema[] schemaArray4 = new org.apache.avro.Schema[] {};
        java.util.ArrayList<org.apache.avro.Schema> schemaList5 = new java.util.ArrayList<org.apache.avro.Schema>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<org.apache.avro.Schema>) schemaList5, schemaArray4);
        org.apache.avro.Schema schema7 = org.apache.avro.Schema.createUnion((java.util.List<org.apache.avro.Schema>) schemaList5);
        org.apache.avro.Schema schema8 = org.apache.avro.Schema.applyAliases(schema3, schema7);
        java.util.List<org.apache.avro.Schema> schemaList9 = schema8.getTypes();
        org.apache.avro.Schema[] schemaArray10 = new org.apache.avro.Schema[] {};
        java.util.ArrayList<org.apache.avro.Schema> schemaList11 = new java.util.ArrayList<org.apache.avro.Schema>();
        boolean boolean12 = java.util.Collections.addAll((java.util.Collection<org.apache.avro.Schema>) schemaList11, schemaArray10);
        org.apache.avro.Schema schema13 = org.apache.avro.Schema.createUnion((java.util.List<org.apache.avro.Schema>) schemaList11);
        org.apache.avro.Schema[] schemaArray14 = new org.apache.avro.Schema[] {};
        java.util.ArrayList<org.apache.avro.Schema> schemaList15 = new java.util.ArrayList<org.apache.avro.Schema>();
        boolean boolean16 = java.util.Collections.addAll((java.util.Collection<org.apache.avro.Schema>) schemaList15, schemaArray14);
        org.apache.avro.Schema schema17 = org.apache.avro.Schema.createUnion((java.util.List<org.apache.avro.Schema>) schemaList15);
        org.apache.avro.Schema schema18 = org.apache.avro.Schema.applyAliases(schema13, schema17);
        org.apache.avro.Schema schema19 = org.apache.avro.Schema.applyAliases(schema8, schema17);
        org.apache.avro.Schema schema20 = org.apache.avro.Schema.createMap(schema8);
        java.lang.String str21 = schema8.getName();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.avro.Schema.Field field23 = schema8.getField("");
            org.junit.Assert.fail("Expected exception of type org.apache.avro.AvroRuntimeException; message: Not a record: []");
        } catch (org.apache.avro.AvroRuntimeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(schemaArray0);
        org.junit.Assert.assertArrayEquals(schemaArray0, new org.apache.avro.Schema[] {});
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(schema3);
        org.junit.Assert.assertNotNull(schemaArray4);
        org.junit.Assert.assertArrayEquals(schemaArray4, new org.apache.avro.Schema[] {});
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(schema7);
        org.junit.Assert.assertNotNull(schema8);
        org.junit.Assert.assertNotNull(schemaList9);
        org.junit.Assert.assertNotNull(schemaArray10);
        org.junit.Assert.assertArrayEquals(schemaArray10, new org.apache.avro.Schema[] {});
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(schema13);
        org.junit.Assert.assertNotNull(schemaArray14);
        org.junit.Assert.assertArrayEquals(schemaArray14, new org.apache.avro.Schema[] {});
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(schema17);
        org.junit.Assert.assertNotNull(schema18);
        org.junit.Assert.assertNotNull(schema19);
        org.junit.Assert.assertNotNull(schema20);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "union" + "'", str21, "union");
    }

    @Test
    public void test0063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SchemaM3Random300Test0.test0063");
        org.apache.avro.Schema[] schemaArray0 = new org.apache.avro.Schema[] {};
        java.util.ArrayList<org.apache.avro.Schema> schemaList1 = new java.util.ArrayList<org.apache.avro.Schema>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<org.apache.avro.Schema>) schemaList1, schemaArray0);
        org.apache.avro.Schema schema3 = org.apache.avro.Schema.createUnion((java.util.List<org.apache.avro.Schema>) schemaList1);
        org.apache.avro.Schema[] schemaArray4 = new org.apache.avro.Schema[] {};
        java.util.ArrayList<org.apache.avro.Schema> schemaList5 = new java.util.ArrayList<org.apache.avro.Schema>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<org.apache.avro.Schema>) schemaList5, schemaArray4);
        org.apache.avro.Schema schema7 = org.apache.avro.Schema.createUnion((java.util.List<org.apache.avro.Schema>) schemaList5);
        org.apache.avro.Schema schema8 = org.apache.avro.Schema.applyAliases(schema3, schema7);
        java.util.List<org.apache.avro.Schema> schemaList9 = schema8.getTypes();
        org.apache.avro.Schema[] schemaArray10 = new org.apache.avro.Schema[] {};
        java.util.ArrayList<org.apache.avro.Schema> schemaList11 = new java.util.ArrayList<org.apache.avro.Schema>();
        boolean boolean12 = java.util.Collections.addAll((java.util.Collection<org.apache.avro.Schema>) schemaList11, schemaArray10);
        org.apache.avro.Schema schema13 = org.apache.avro.Schema.createUnion((java.util.List<org.apache.avro.Schema>) schemaList11);
        org.apache.avro.Schema[] schemaArray14 = new org.apache.avro.Schema[] {};
        java.util.ArrayList<org.apache.avro.Schema> schemaList15 = new java.util.ArrayList<org.apache.avro.Schema>();
        boolean boolean16 = java.util.Collections.addAll((java.util.Collection<org.apache.avro.Schema>) schemaList15, schemaArray14);
        org.apache.avro.Schema schema17 = org.apache.avro.Schema.createUnion((java.util.List<org.apache.avro.Schema>) schemaList15);
        org.apache.avro.Schema schema18 = org.apache.avro.Schema.applyAliases(schema13, schema17);
        org.apache.avro.Schema schema19 = org.apache.avro.Schema.applyAliases(schema8, schema17);
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<org.apache.avro.Schema.Field> fieldList20 = schema19.getFields();
            org.junit.Assert.fail("Expected exception of type org.apache.avro.AvroRuntimeException; message: Not a record: []");
        } catch (org.apache.avro.AvroRuntimeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(schemaArray0);
        org.junit.Assert.assertArrayEquals(schemaArray0, new org.apache.avro.Schema[] {});
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(schema3);
        org.junit.Assert.assertNotNull(schemaArray4);
        org.junit.Assert.assertArrayEquals(schemaArray4, new org.apache.avro.Schema[] {});
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(schema7);
        org.junit.Assert.assertNotNull(schema8);
        org.junit.Assert.assertNotNull(schemaList9);
        org.junit.Assert.assertNotNull(schemaArray10);
        org.junit.Assert.assertArrayEquals(schemaArray10, new org.apache.avro.Schema[] {});
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(schema13);
        org.junit.Assert.assertNotNull(schemaArray14);
        org.junit.Assert.assertArrayEquals(schemaArray14, new org.apache.avro.Schema[] {});
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(schema17);
        org.junit.Assert.assertNotNull(schema18);
        org.junit.Assert.assertNotNull(schema19);
    }

    @Test
    public void test0064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SchemaM3Random300Test0.test0064");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.avro.Schema schema2 = org.apache.avro.Schema.parse("", false);
            org.junit.Assert.fail("Expected exception of type org.apache.avro.SchemaParseException; message: java.io.EOFException: No content to map to Object due to end of input");
        } catch (org.apache.avro.SchemaParseException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SchemaM3Random300Test0.test0065");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.avro.Schema schema4 = org.apache.avro.Schema.createRecord("", "[]", "hi!", false);
            org.junit.Assert.fail("Expected exception of type org.apache.avro.SchemaParseException; message: Empty name");
        } catch (org.apache.avro.SchemaParseException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SchemaM3Random300Test0.test0066");
        org.apache.avro.Schema[] schemaArray0 = new org.apache.avro.Schema[] {};
        java.util.ArrayList<org.apache.avro.Schema> schemaList1 = new java.util.ArrayList<org.apache.avro.Schema>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<org.apache.avro.Schema>) schemaList1, schemaArray0);
        org.apache.avro.Schema schema3 = org.apache.avro.Schema.createUnion((java.util.List<org.apache.avro.Schema>) schemaList1);
        org.apache.avro.Schema[] schemaArray4 = new org.apache.avro.Schema[] {};
        java.util.ArrayList<org.apache.avro.Schema> schemaList5 = new java.util.ArrayList<org.apache.avro.Schema>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<org.apache.avro.Schema>) schemaList5, schemaArray4);
        org.apache.avro.Schema schema7 = org.apache.avro.Schema.createUnion((java.util.List<org.apache.avro.Schema>) schemaList5);
        org.apache.avro.Schema schema8 = org.apache.avro.Schema.applyAliases(schema3, schema7);
        java.util.List<org.apache.avro.Schema> schemaList9 = schema8.getTypes();
        org.apache.avro.Schema[] schemaArray10 = new org.apache.avro.Schema[] {};
        java.util.ArrayList<org.apache.avro.Schema> schemaList11 = new java.util.ArrayList<org.apache.avro.Schema>();
        boolean boolean12 = java.util.Collections.addAll((java.util.Collection<org.apache.avro.Schema>) schemaList11, schemaArray10);
        org.apache.avro.Schema schema13 = org.apache.avro.Schema.createUnion((java.util.List<org.apache.avro.Schema>) schemaList11);
        org.apache.avro.Schema[] schemaArray14 = new org.apache.avro.Schema[] {};
        java.util.ArrayList<org.apache.avro.Schema> schemaList15 = new java.util.ArrayList<org.apache.avro.Schema>();
        boolean boolean16 = java.util.Collections.addAll((java.util.Collection<org.apache.avro.Schema>) schemaList15, schemaArray14);
        org.apache.avro.Schema schema17 = org.apache.avro.Schema.createUnion((java.util.List<org.apache.avro.Schema>) schemaList15);
        org.apache.avro.Schema schema18 = org.apache.avro.Schema.applyAliases(schema13, schema17);
        org.apache.avro.Schema schema19 = org.apache.avro.Schema.applyAliases(schema8, schema17);
        org.apache.avro.Schema schema20 = org.apache.avro.Schema.createMap(schema8);
        org.apache.avro.Schema schema21 = org.apache.avro.Schema.createArray(schema20);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean22 = schema21.isError();
            org.junit.Assert.fail("Expected exception of type org.apache.avro.AvroRuntimeException; message: Not a record: {\"type\":\"array\",\"items\":{\"type\":\"map\",\"values\":[]}}");
        } catch (org.apache.avro.AvroRuntimeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(schemaArray0);
        org.junit.Assert.assertArrayEquals(schemaArray0, new org.apache.avro.Schema[] {});
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(schema3);
        org.junit.Assert.assertNotNull(schemaArray4);
        org.junit.Assert.assertArrayEquals(schemaArray4, new org.apache.avro.Schema[] {});
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(schema7);
        org.junit.Assert.assertNotNull(schema8);
        org.junit.Assert.assertNotNull(schemaList9);
        org.junit.Assert.assertNotNull(schemaArray10);
        org.junit.Assert.assertArrayEquals(schemaArray10, new org.apache.avro.Schema[] {});
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(schema13);
        org.junit.Assert.assertNotNull(schemaArray14);
        org.junit.Assert.assertArrayEquals(schemaArray14, new org.apache.avro.Schema[] {});
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(schema17);
        org.junit.Assert.assertNotNull(schema18);
        org.junit.Assert.assertNotNull(schema19);
        org.junit.Assert.assertNotNull(schema20);
        org.junit.Assert.assertNotNull(schema21);
    }

    @Test
    public void test0067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SchemaM3Random300Test0.test0067");
        org.apache.avro.Schema schema4 = org.apache.avro.Schema.createFixed("union", "[ ]", "[]", 0);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.avro.Schema.Field field6 = schema4.getField("union");
            org.junit.Assert.fail("Expected exception of type org.apache.avro.AvroRuntimeException; message: Not a record: {\"type\":\"fixed\",\"name\":\"union\",\"namespace\":\"[]\",\"doc\":\"[ ]\",\"size\":0}");
        } catch (org.apache.avro.AvroRuntimeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(schema4);
    }

    @Test
    public void test0068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SchemaM3Random300Test0.test0068");
        org.apache.avro.Schema[] schemaArray0 = new org.apache.avro.Schema[] {};
        java.util.ArrayList<org.apache.avro.Schema> schemaList1 = new java.util.ArrayList<org.apache.avro.Schema>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<org.apache.avro.Schema>) schemaList1, schemaArray0);
        org.apache.avro.Schema schema3 = org.apache.avro.Schema.createUnion((java.util.List<org.apache.avro.Schema>) schemaList1);
        org.apache.avro.Schema[] schemaArray4 = new org.apache.avro.Schema[] {};
        java.util.ArrayList<org.apache.avro.Schema> schemaList5 = new java.util.ArrayList<org.apache.avro.Schema>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<org.apache.avro.Schema>) schemaList5, schemaArray4);
        org.apache.avro.Schema schema7 = org.apache.avro.Schema.createUnion((java.util.List<org.apache.avro.Schema>) schemaList5);
        org.apache.avro.Schema schema8 = org.apache.avro.Schema.applyAliases(schema3, schema7);
        java.util.List<org.apache.avro.Schema> schemaList9 = schema8.getTypes();
        boolean boolean11 = schema8.equals((java.lang.Object) "hi!");
        java.lang.String str12 = schema8.getDoc();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.avro.Schema.Field field14 = schema8.getField("[ ]");
            org.junit.Assert.fail("Expected exception of type org.apache.avro.AvroRuntimeException; message: Not a record: []");
        } catch (org.apache.avro.AvroRuntimeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(schemaArray0);
        org.junit.Assert.assertArrayEquals(schemaArray0, new org.apache.avro.Schema[] {});
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(schema3);
        org.junit.Assert.assertNotNull(schemaArray4);
        org.junit.Assert.assertArrayEquals(schemaArray4, new org.apache.avro.Schema[] {});
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(schema7);
        org.junit.Assert.assertNotNull(schema8);
        org.junit.Assert.assertNotNull(schemaList9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNull(str12);
    }

    @Test
    public void test0069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SchemaM3Random300Test0.test0069");
        org.apache.avro.Schema.Type type0 = org.apache.avro.Schema.Type.FIXED;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.avro.Schema schema1 = org.apache.avro.Schema.create(type0);
            org.junit.Assert.fail("Expected exception of type org.apache.avro.AvroRuntimeException; message: Can't create a: FIXED");
        } catch (org.apache.avro.AvroRuntimeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + type0 + "' != '" + org.apache.avro.Schema.Type.FIXED + "'", type0.equals(org.apache.avro.Schema.Type.FIXED));
    }

    @Test
    public void test0070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SchemaM3Random300Test0.test0070");
        org.apache.avro.Schema[] schemaArray0 = new org.apache.avro.Schema[] {};
        java.util.ArrayList<org.apache.avro.Schema> schemaList1 = new java.util.ArrayList<org.apache.avro.Schema>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<org.apache.avro.Schema>) schemaList1, schemaArray0);
        org.apache.avro.Schema schema3 = org.apache.avro.Schema.createUnion((java.util.List<org.apache.avro.Schema>) schemaList1);
        org.apache.avro.Schema[] schemaArray4 = new org.apache.avro.Schema[] {};
        java.util.ArrayList<org.apache.avro.Schema> schemaList5 = new java.util.ArrayList<org.apache.avro.Schema>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<org.apache.avro.Schema>) schemaList5, schemaArray4);
        org.apache.avro.Schema schema7 = org.apache.avro.Schema.createUnion((java.util.List<org.apache.avro.Schema>) schemaList5);
        org.apache.avro.Schema schema8 = org.apache.avro.Schema.applyAliases(schema3, schema7);
        java.util.List<org.apache.avro.Schema> schemaList9 = schema8.getTypes();
        org.apache.avro.Schema[] schemaArray10 = new org.apache.avro.Schema[] {};
        java.util.ArrayList<org.apache.avro.Schema> schemaList11 = new java.util.ArrayList<org.apache.avro.Schema>();
        boolean boolean12 = java.util.Collections.addAll((java.util.Collection<org.apache.avro.Schema>) schemaList11, schemaArray10);
        org.apache.avro.Schema schema13 = org.apache.avro.Schema.createUnion((java.util.List<org.apache.avro.Schema>) schemaList11);
        org.apache.avro.Schema[] schemaArray14 = new org.apache.avro.Schema[] {};
        java.util.ArrayList<org.apache.avro.Schema> schemaList15 = new java.util.ArrayList<org.apache.avro.Schema>();
        boolean boolean16 = java.util.Collections.addAll((java.util.Collection<org.apache.avro.Schema>) schemaList15, schemaArray14);
        org.apache.avro.Schema schema17 = org.apache.avro.Schema.createUnion((java.util.List<org.apache.avro.Schema>) schemaList15);
        org.apache.avro.Schema schema18 = org.apache.avro.Schema.applyAliases(schema13, schema17);
        org.apache.avro.Schema schema19 = org.apache.avro.Schema.applyAliases(schema8, schema17);
        java.lang.String str20 = schema17.toString();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Set<java.lang.String> strSet21 = schema17.getAliases();
            org.junit.Assert.fail("Expected exception of type org.apache.avro.AvroRuntimeException; message: Not a named type: []");
        } catch (org.apache.avro.AvroRuntimeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(schemaArray0);
        org.junit.Assert.assertArrayEquals(schemaArray0, new org.apache.avro.Schema[] {});
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(schema3);
        org.junit.Assert.assertNotNull(schemaArray4);
        org.junit.Assert.assertArrayEquals(schemaArray4, new org.apache.avro.Schema[] {});
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(schema7);
        org.junit.Assert.assertNotNull(schema8);
        org.junit.Assert.assertNotNull(schemaList9);
        org.junit.Assert.assertNotNull(schemaArray10);
        org.junit.Assert.assertArrayEquals(schemaArray10, new org.apache.avro.Schema[] {});
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(schema13);
        org.junit.Assert.assertNotNull(schemaArray14);
        org.junit.Assert.assertArrayEquals(schemaArray14, new org.apache.avro.Schema[] {});
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(schema17);
        org.junit.Assert.assertNotNull(schema18);
        org.junit.Assert.assertNotNull(schema19);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "[]" + "'", str20, "[]");
    }

    @Test
    public void test0071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SchemaM3Random300Test0.test0071");
        org.apache.avro.Schema[] schemaArray0 = new org.apache.avro.Schema[] {};
        java.util.ArrayList<org.apache.avro.Schema> schemaList1 = new java.util.ArrayList<org.apache.avro.Schema>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<org.apache.avro.Schema>) schemaList1, schemaArray0);
        org.apache.avro.Schema schema3 = org.apache.avro.Schema.createUnion((java.util.List<org.apache.avro.Schema>) schemaList1);
        org.apache.avro.Schema[] schemaArray4 = new org.apache.avro.Schema[] {};
        java.util.ArrayList<org.apache.avro.Schema> schemaList5 = new java.util.ArrayList<org.apache.avro.Schema>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<org.apache.avro.Schema>) schemaList5, schemaArray4);
        org.apache.avro.Schema schema7 = org.apache.avro.Schema.createUnion((java.util.List<org.apache.avro.Schema>) schemaList5);
        org.apache.avro.Schema schema8 = org.apache.avro.Schema.applyAliases(schema3, schema7);
        java.util.List<org.apache.avro.Schema> schemaList9 = schema8.getTypes();
        boolean boolean11 = schema8.equals((java.lang.Object) "hi!");
        java.lang.String str12 = schema8.getDoc();
        // The following exception was thrown during execution in test generation
        try {
            schema8.addAlias("");
            org.junit.Assert.fail("Expected exception of type org.apache.avro.AvroRuntimeException; message: Not a named type: []");
        } catch (org.apache.avro.AvroRuntimeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(schemaArray0);
        org.junit.Assert.assertArrayEquals(schemaArray0, new org.apache.avro.Schema[] {});
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(schema3);
        org.junit.Assert.assertNotNull(schemaArray4);
        org.junit.Assert.assertArrayEquals(schemaArray4, new org.apache.avro.Schema[] {});
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(schema7);
        org.junit.Assert.assertNotNull(schema8);
        org.junit.Assert.assertNotNull(schemaList9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNull(str12);
    }

    @Test
    public void test0072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SchemaM3Random300Test0.test0072");
        org.apache.avro.Schema schema0 = null;
        org.apache.avro.Schema schema1 = org.apache.avro.Schema.createArray(schema0);
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
    public void test0073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SchemaM3Random300Test0.test0073");
        org.apache.avro.Schema[] schemaArray0 = new org.apache.avro.Schema[] {};
        java.util.ArrayList<org.apache.avro.Schema> schemaList1 = new java.util.ArrayList<org.apache.avro.Schema>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<org.apache.avro.Schema>) schemaList1, schemaArray0);
        org.apache.avro.Schema schema3 = org.apache.avro.Schema.createUnion((java.util.List<org.apache.avro.Schema>) schemaList1);
        org.apache.avro.Schema[] schemaArray4 = new org.apache.avro.Schema[] {};
        java.util.ArrayList<org.apache.avro.Schema> schemaList5 = new java.util.ArrayList<org.apache.avro.Schema>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<org.apache.avro.Schema>) schemaList5, schemaArray4);
        org.apache.avro.Schema schema7 = org.apache.avro.Schema.createUnion((java.util.List<org.apache.avro.Schema>) schemaList5);
        org.apache.avro.Schema schema8 = org.apache.avro.Schema.applyAliases(schema3, schema7);
        java.util.List<org.apache.avro.Schema> schemaList9 = schema8.getTypes();
        org.apache.avro.Schema[] schemaArray10 = new org.apache.avro.Schema[] {};
        java.util.ArrayList<org.apache.avro.Schema> schemaList11 = new java.util.ArrayList<org.apache.avro.Schema>();
        boolean boolean12 = java.util.Collections.addAll((java.util.Collection<org.apache.avro.Schema>) schemaList11, schemaArray10);
        org.apache.avro.Schema schema13 = org.apache.avro.Schema.createUnion((java.util.List<org.apache.avro.Schema>) schemaList11);
        org.apache.avro.Schema[] schemaArray14 = new org.apache.avro.Schema[] {};
        java.util.ArrayList<org.apache.avro.Schema> schemaList15 = new java.util.ArrayList<org.apache.avro.Schema>();
        boolean boolean16 = java.util.Collections.addAll((java.util.Collection<org.apache.avro.Schema>) schemaList15, schemaArray14);
        org.apache.avro.Schema schema17 = org.apache.avro.Schema.createUnion((java.util.List<org.apache.avro.Schema>) schemaList15);
        org.apache.avro.Schema schema18 = org.apache.avro.Schema.applyAliases(schema13, schema17);
        org.apache.avro.Schema schema19 = org.apache.avro.Schema.applyAliases(schema8, schema17);
        org.apache.avro.Schema schema20 = org.apache.avro.Schema.createMap(schema8);
        org.apache.avro.Schema schema21 = schema20.getValueType();
        org.apache.avro.Schema.Names names22 = new org.apache.avro.Schema.Names();
        names22.space("[ ]");
        org.codehaus.jackson.JsonGenerator jsonGenerator25 = null;
        // The following exception was thrown during execution in test generation
        try {
            schema20.toJson(names22, jsonGenerator25);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(schemaArray0);
        org.junit.Assert.assertArrayEquals(schemaArray0, new org.apache.avro.Schema[] {});
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(schema3);
        org.junit.Assert.assertNotNull(schemaArray4);
        org.junit.Assert.assertArrayEquals(schemaArray4, new org.apache.avro.Schema[] {});
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(schema7);
        org.junit.Assert.assertNotNull(schema8);
        org.junit.Assert.assertNotNull(schemaList9);
        org.junit.Assert.assertNotNull(schemaArray10);
        org.junit.Assert.assertArrayEquals(schemaArray10, new org.apache.avro.Schema[] {});
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(schema13);
        org.junit.Assert.assertNotNull(schemaArray14);
        org.junit.Assert.assertArrayEquals(schemaArray14, new org.apache.avro.Schema[] {});
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(schema17);
        org.junit.Assert.assertNotNull(schema18);
        org.junit.Assert.assertNotNull(schema19);
        org.junit.Assert.assertNotNull(schema20);
        org.junit.Assert.assertNotNull(schema21);
    }

    @Test
    public void test0074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SchemaM3Random300Test0.test0074");
        org.apache.avro.Schema[] schemaArray0 = new org.apache.avro.Schema[] {};
        java.util.ArrayList<org.apache.avro.Schema> schemaList1 = new java.util.ArrayList<org.apache.avro.Schema>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<org.apache.avro.Schema>) schemaList1, schemaArray0);
        org.apache.avro.Schema schema3 = org.apache.avro.Schema.createUnion((java.util.List<org.apache.avro.Schema>) schemaList1);
        org.apache.avro.Schema[] schemaArray4 = new org.apache.avro.Schema[] {};
        java.util.ArrayList<org.apache.avro.Schema> schemaList5 = new java.util.ArrayList<org.apache.avro.Schema>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<org.apache.avro.Schema>) schemaList5, schemaArray4);
        org.apache.avro.Schema schema7 = org.apache.avro.Schema.createUnion((java.util.List<org.apache.avro.Schema>) schemaList5);
        org.apache.avro.Schema schema8 = org.apache.avro.Schema.applyAliases(schema3, schema7);
        java.util.List<org.apache.avro.Schema> schemaList9 = schema8.getTypes();
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<org.apache.avro.Schema.Field> fieldList10 = schema8.getFields();
            org.junit.Assert.fail("Expected exception of type org.apache.avro.AvroRuntimeException; message: Not a record: []");
        } catch (org.apache.avro.AvroRuntimeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(schemaArray0);
        org.junit.Assert.assertArrayEquals(schemaArray0, new org.apache.avro.Schema[] {});
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(schema3);
        org.junit.Assert.assertNotNull(schemaArray4);
        org.junit.Assert.assertArrayEquals(schemaArray4, new org.apache.avro.Schema[] {});
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(schema7);
        org.junit.Assert.assertNotNull(schema8);
        org.junit.Assert.assertNotNull(schemaList9);
    }

    @Test
    public void test0075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SchemaM3Random300Test0.test0075");
        org.apache.avro.Schema.Parser parser0 = new org.apache.avro.Schema.Parser();
        java.util.Map<java.lang.String, org.apache.avro.Schema> strMap1 = parser0.getTypes();
        java.util.Map<java.lang.String, org.apache.avro.Schema> strMap2 = parser0.getTypes();
        org.apache.avro.Schema.Parser parser3 = new org.apache.avro.Schema.Parser();
        org.apache.avro.Schema.Parser parser5 = parser3.setValidate(true);
        java.util.Map<java.lang.String, org.apache.avro.Schema> strMap6 = parser3.getTypes();
        org.apache.avro.Schema.Parser parser7 = parser0.addTypes(strMap6);
        java.io.File file8 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.avro.Schema schema9 = parser7.parse(file8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strMap1);
        org.junit.Assert.assertNotNull(strMap2);
        org.junit.Assert.assertNotNull(parser5);
        org.junit.Assert.assertNotNull(strMap6);
        org.junit.Assert.assertNotNull(parser7);
    }

    @Test
    public void test0076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SchemaM3Random300Test0.test0076");
        org.apache.avro.Schema[] schemaArray0 = new org.apache.avro.Schema[] {};
        java.util.ArrayList<org.apache.avro.Schema> schemaList1 = new java.util.ArrayList<org.apache.avro.Schema>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<org.apache.avro.Schema>) schemaList1, schemaArray0);
        org.apache.avro.Schema schema3 = org.apache.avro.Schema.createUnion((java.util.List<org.apache.avro.Schema>) schemaList1);
        org.apache.avro.Schema[] schemaArray4 = new org.apache.avro.Schema[] {};
        java.util.ArrayList<org.apache.avro.Schema> schemaList5 = new java.util.ArrayList<org.apache.avro.Schema>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<org.apache.avro.Schema>) schemaList5, schemaArray4);
        org.apache.avro.Schema schema7 = org.apache.avro.Schema.createUnion((java.util.List<org.apache.avro.Schema>) schemaList5);
        org.apache.avro.Schema schema8 = org.apache.avro.Schema.applyAliases(schema3, schema7);
        java.util.List<org.apache.avro.Schema> schemaList9 = schema8.getTypes();
        org.apache.avro.Schema[] schemaArray10 = new org.apache.avro.Schema[] {};
        java.util.ArrayList<org.apache.avro.Schema> schemaList11 = new java.util.ArrayList<org.apache.avro.Schema>();
        boolean boolean12 = java.util.Collections.addAll((java.util.Collection<org.apache.avro.Schema>) schemaList11, schemaArray10);
        org.apache.avro.Schema schema13 = org.apache.avro.Schema.createUnion((java.util.List<org.apache.avro.Schema>) schemaList11);
        org.apache.avro.Schema[] schemaArray14 = new org.apache.avro.Schema[] {};
        java.util.ArrayList<org.apache.avro.Schema> schemaList15 = new java.util.ArrayList<org.apache.avro.Schema>();
        boolean boolean16 = java.util.Collections.addAll((java.util.Collection<org.apache.avro.Schema>) schemaList15, schemaArray14);
        org.apache.avro.Schema schema17 = org.apache.avro.Schema.createUnion((java.util.List<org.apache.avro.Schema>) schemaList15);
        org.apache.avro.Schema schema18 = org.apache.avro.Schema.applyAliases(schema13, schema17);
        org.apache.avro.Schema schema19 = org.apache.avro.Schema.applyAliases(schema8, schema17);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str20 = schema17.getNamespace();
            org.junit.Assert.fail("Expected exception of type org.apache.avro.AvroRuntimeException; message: Not a named type: []");
        } catch (org.apache.avro.AvroRuntimeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(schemaArray0);
        org.junit.Assert.assertArrayEquals(schemaArray0, new org.apache.avro.Schema[] {});
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(schema3);
        org.junit.Assert.assertNotNull(schemaArray4);
        org.junit.Assert.assertArrayEquals(schemaArray4, new org.apache.avro.Schema[] {});
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(schema7);
        org.junit.Assert.assertNotNull(schema8);
        org.junit.Assert.assertNotNull(schemaList9);
        org.junit.Assert.assertNotNull(schemaArray10);
        org.junit.Assert.assertArrayEquals(schemaArray10, new org.apache.avro.Schema[] {});
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(schema13);
        org.junit.Assert.assertNotNull(schemaArray14);
        org.junit.Assert.assertArrayEquals(schemaArray14, new org.apache.avro.Schema[] {});
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(schema17);
        org.junit.Assert.assertNotNull(schema18);
        org.junit.Assert.assertNotNull(schema19);
    }

    @Test
    public void test0077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SchemaM3Random300Test0.test0077");
        org.apache.avro.Schema[] schemaArray0 = new org.apache.avro.Schema[] {};
        java.util.ArrayList<org.apache.avro.Schema> schemaList1 = new java.util.ArrayList<org.apache.avro.Schema>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<org.apache.avro.Schema>) schemaList1, schemaArray0);
        org.apache.avro.Schema schema3 = org.apache.avro.Schema.createUnion((java.util.List<org.apache.avro.Schema>) schemaList1);
        java.lang.String str4 = schema3.getFullName();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.avro.Schema schema5 = schema3.getElementType();
            org.junit.Assert.fail("Expected exception of type org.apache.avro.AvroRuntimeException; message: Not an array: []");
        } catch (org.apache.avro.AvroRuntimeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(schemaArray0);
        org.junit.Assert.assertArrayEquals(schemaArray0, new org.apache.avro.Schema[] {});
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(schema3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "union" + "'", str4, "union");
    }

    @Test
    public void test0078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SchemaM3Random300Test0.test0078");
        org.apache.avro.Schema[] schemaArray0 = new org.apache.avro.Schema[] {};
        java.util.ArrayList<org.apache.avro.Schema> schemaList1 = new java.util.ArrayList<org.apache.avro.Schema>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<org.apache.avro.Schema>) schemaList1, schemaArray0);
        org.apache.avro.Schema schema3 = org.apache.avro.Schema.createUnion((java.util.List<org.apache.avro.Schema>) schemaList1);
        org.apache.avro.Schema[] schemaArray4 = new org.apache.avro.Schema[] {};
        java.util.ArrayList<org.apache.avro.Schema> schemaList5 = new java.util.ArrayList<org.apache.avro.Schema>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<org.apache.avro.Schema>) schemaList5, schemaArray4);
        org.apache.avro.Schema schema7 = org.apache.avro.Schema.createUnion((java.util.List<org.apache.avro.Schema>) schemaList5);
        org.apache.avro.Schema schema8 = org.apache.avro.Schema.applyAliases(schema3, schema7);
        org.apache.avro.Schema.Type type9 = schema7.getType();
        org.apache.avro.Schema schema10 = org.apache.avro.Schema.createMap(schema7);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.avro.Schema schema11 = schema10.getElementType();
            org.junit.Assert.fail("Expected exception of type org.apache.avro.AvroRuntimeException; message: Not an array: {\"type\":\"map\",\"values\":[]}");
        } catch (org.apache.avro.AvroRuntimeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(schemaArray0);
        org.junit.Assert.assertArrayEquals(schemaArray0, new org.apache.avro.Schema[] {});
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(schema3);
        org.junit.Assert.assertNotNull(schemaArray4);
        org.junit.Assert.assertArrayEquals(schemaArray4, new org.apache.avro.Schema[] {});
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(schema7);
        org.junit.Assert.assertNotNull(schema8);
        org.junit.Assert.assertTrue("'" + type9 + "' != '" + org.apache.avro.Schema.Type.UNION + "'", type9.equals(org.apache.avro.Schema.Type.UNION));
        org.junit.Assert.assertNotNull(schema10);
    }

    @Test
    public void test0079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SchemaM3Random300Test0.test0079");
        org.apache.avro.Schema.Type type0 = org.apache.avro.Schema.Type.INT;
        org.apache.avro.Schema schema1 = org.apache.avro.Schema.create(type0);
        org.apache.avro.Schema schema2 = org.apache.avro.Schema.createArray(schema1);
        // The following exception was thrown during execution in test generation
        try {
            int int3 = schema2.getFixedSize();
            org.junit.Assert.fail("Expected exception of type org.apache.avro.AvroRuntimeException; message: Not fixed: {\"type\":\"array\",\"items\":\"int\"}");
        } catch (org.apache.avro.AvroRuntimeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + type0 + "' != '" + org.apache.avro.Schema.Type.INT + "'", type0.equals(org.apache.avro.Schema.Type.INT));
        org.junit.Assert.assertNotNull(schema1);
        org.junit.Assert.assertNotNull(schema2);
    }

    @Test
    public void test0080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SchemaM3Random300Test0.test0080");
        org.apache.avro.Schema[] schemaArray0 = new org.apache.avro.Schema[] {};
        java.util.ArrayList<org.apache.avro.Schema> schemaList1 = new java.util.ArrayList<org.apache.avro.Schema>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<org.apache.avro.Schema>) schemaList1, schemaArray0);
        org.apache.avro.Schema schema3 = org.apache.avro.Schema.createUnion((java.util.List<org.apache.avro.Schema>) schemaList1);
        org.apache.avro.Schema[] schemaArray4 = new org.apache.avro.Schema[] {};
        java.util.ArrayList<org.apache.avro.Schema> schemaList5 = new java.util.ArrayList<org.apache.avro.Schema>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<org.apache.avro.Schema>) schemaList5, schemaArray4);
        org.apache.avro.Schema schema7 = org.apache.avro.Schema.createUnion((java.util.List<org.apache.avro.Schema>) schemaList5);
        org.apache.avro.Schema schema8 = org.apache.avro.Schema.applyAliases(schema3, schema7);
        java.util.List<org.apache.avro.Schema> schemaList9 = schema8.getTypes();
        org.apache.avro.Schema[] schemaArray10 = new org.apache.avro.Schema[] {};
        java.util.ArrayList<org.apache.avro.Schema> schemaList11 = new java.util.ArrayList<org.apache.avro.Schema>();
        boolean boolean12 = java.util.Collections.addAll((java.util.Collection<org.apache.avro.Schema>) schemaList11, schemaArray10);
        org.apache.avro.Schema schema13 = org.apache.avro.Schema.createUnion((java.util.List<org.apache.avro.Schema>) schemaList11);
        org.apache.avro.Schema[] schemaArray14 = new org.apache.avro.Schema[] {};
        java.util.ArrayList<org.apache.avro.Schema> schemaList15 = new java.util.ArrayList<org.apache.avro.Schema>();
        boolean boolean16 = java.util.Collections.addAll((java.util.Collection<org.apache.avro.Schema>) schemaList15, schemaArray14);
        org.apache.avro.Schema schema17 = org.apache.avro.Schema.createUnion((java.util.List<org.apache.avro.Schema>) schemaList15);
        org.apache.avro.Schema schema18 = org.apache.avro.Schema.applyAliases(schema13, schema17);
        org.apache.avro.Schema schema19 = org.apache.avro.Schema.applyAliases(schema8, schema17);
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<java.lang.String> strList20 = schema19.getEnumSymbols();
            org.junit.Assert.fail("Expected exception of type org.apache.avro.AvroRuntimeException; message: Not an enum: []");
        } catch (org.apache.avro.AvroRuntimeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(schemaArray0);
        org.junit.Assert.assertArrayEquals(schemaArray0, new org.apache.avro.Schema[] {});
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(schema3);
        org.junit.Assert.assertNotNull(schemaArray4);
        org.junit.Assert.assertArrayEquals(schemaArray4, new org.apache.avro.Schema[] {});
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(schema7);
        org.junit.Assert.assertNotNull(schema8);
        org.junit.Assert.assertNotNull(schemaList9);
        org.junit.Assert.assertNotNull(schemaArray10);
        org.junit.Assert.assertArrayEquals(schemaArray10, new org.apache.avro.Schema[] {});
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(schema13);
        org.junit.Assert.assertNotNull(schemaArray14);
        org.junit.Assert.assertArrayEquals(schemaArray14, new org.apache.avro.Schema[] {});
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(schema17);
        org.junit.Assert.assertNotNull(schema18);
        org.junit.Assert.assertNotNull(schema19);
    }

    @Test
    public void test0081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SchemaM3Random300Test0.test0081");
        org.apache.avro.Schema[] schemaArray0 = new org.apache.avro.Schema[] {};
        java.util.ArrayList<org.apache.avro.Schema> schemaList1 = new java.util.ArrayList<org.apache.avro.Schema>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<org.apache.avro.Schema>) schemaList1, schemaArray0);
        org.apache.avro.Schema schema3 = org.apache.avro.Schema.createUnion((java.util.List<org.apache.avro.Schema>) schemaList1);
        org.apache.avro.Schema[] schemaArray4 = new org.apache.avro.Schema[] {};
        java.util.ArrayList<org.apache.avro.Schema> schemaList5 = new java.util.ArrayList<org.apache.avro.Schema>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<org.apache.avro.Schema>) schemaList5, schemaArray4);
        org.apache.avro.Schema schema7 = org.apache.avro.Schema.createUnion((java.util.List<org.apache.avro.Schema>) schemaList5);
        org.apache.avro.Schema schema8 = org.apache.avro.Schema.applyAliases(schema3, schema7);
        java.util.List<org.apache.avro.Schema> schemaList9 = schema8.getTypes();
        boolean boolean11 = schema8.equals((java.lang.Object) "hi!");
        java.lang.String str12 = schema8.getDoc();
        org.apache.avro.Schema schema13 = org.apache.avro.Schema.createArray(schema8);
        java.lang.String str14 = schema8.getName();
        // The following exception was thrown during execution in test generation
        try {
            int int15 = schema8.getFixedSize();
            org.junit.Assert.fail("Expected exception of type org.apache.avro.AvroRuntimeException; message: Not fixed: []");
        } catch (org.apache.avro.AvroRuntimeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(schemaArray0);
        org.junit.Assert.assertArrayEquals(schemaArray0, new org.apache.avro.Schema[] {});
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(schema3);
        org.junit.Assert.assertNotNull(schemaArray4);
        org.junit.Assert.assertArrayEquals(schemaArray4, new org.apache.avro.Schema[] {});
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(schema7);
        org.junit.Assert.assertNotNull(schema8);
        org.junit.Assert.assertNotNull(schemaList9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNotNull(schema13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "union" + "'", str14, "union");
    }

    @Test
    public void test0082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SchemaM3Random300Test0.test0082");
        org.apache.avro.Schema[] schemaArray0 = new org.apache.avro.Schema[] {};
        java.util.ArrayList<org.apache.avro.Schema> schemaList1 = new java.util.ArrayList<org.apache.avro.Schema>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<org.apache.avro.Schema>) schemaList1, schemaArray0);
        org.apache.avro.Schema schema3 = org.apache.avro.Schema.createUnion((java.util.List<org.apache.avro.Schema>) schemaList1);
        org.apache.avro.Schema[] schemaArray4 = new org.apache.avro.Schema[] {};
        java.util.ArrayList<org.apache.avro.Schema> schemaList5 = new java.util.ArrayList<org.apache.avro.Schema>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<org.apache.avro.Schema>) schemaList5, schemaArray4);
        org.apache.avro.Schema schema7 = org.apache.avro.Schema.createUnion((java.util.List<org.apache.avro.Schema>) schemaList5);
        org.apache.avro.Schema schema8 = org.apache.avro.Schema.applyAliases(schema3, schema7);
        org.apache.avro.Schema.Type type9 = schema7.getType();
        org.apache.avro.Schema schema10 = org.apache.avro.Schema.createMap(schema7);
        org.apache.avro.Schema.Names names11 = new org.apache.avro.Schema.Names();
        names11.space("[ ]");
        java.util.Collection<org.apache.avro.Schema> schemaCollection14 = names11.values();
        org.codehaus.jackson.JsonGenerator jsonGenerator15 = null;
        // The following exception was thrown during execution in test generation
        try {
            schema10.fieldsToJson(names11, jsonGenerator15);
            org.junit.Assert.fail("Expected exception of type org.apache.avro.AvroRuntimeException; message: Not a record: {\"type\":\"map\",\"values\":[]}");
        } catch (org.apache.avro.AvroRuntimeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(schemaArray0);
        org.junit.Assert.assertArrayEquals(schemaArray0, new org.apache.avro.Schema[] {});
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(schema3);
        org.junit.Assert.assertNotNull(schemaArray4);
        org.junit.Assert.assertArrayEquals(schemaArray4, new org.apache.avro.Schema[] {});
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(schema7);
        org.junit.Assert.assertNotNull(schema8);
        org.junit.Assert.assertTrue("'" + type9 + "' != '" + org.apache.avro.Schema.Type.UNION + "'", type9.equals(org.apache.avro.Schema.Type.UNION));
        org.junit.Assert.assertNotNull(schema10);
        org.junit.Assert.assertNotNull(schemaCollection14);
    }

    @Test
    public void test0083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SchemaM3Random300Test0.test0083");
        org.apache.avro.Schema[] schemaArray0 = new org.apache.avro.Schema[] {};
        java.util.ArrayList<org.apache.avro.Schema> schemaList1 = new java.util.ArrayList<org.apache.avro.Schema>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<org.apache.avro.Schema>) schemaList1, schemaArray0);
        org.apache.avro.Schema schema3 = org.apache.avro.Schema.createUnion((java.util.List<org.apache.avro.Schema>) schemaList1);
        org.apache.avro.Schema[] schemaArray4 = new org.apache.avro.Schema[] {};
        java.util.ArrayList<org.apache.avro.Schema> schemaList5 = new java.util.ArrayList<org.apache.avro.Schema>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<org.apache.avro.Schema>) schemaList5, schemaArray4);
        org.apache.avro.Schema schema7 = org.apache.avro.Schema.createUnion((java.util.List<org.apache.avro.Schema>) schemaList5);
        org.apache.avro.Schema schema8 = org.apache.avro.Schema.applyAliases(schema3, schema7);
        java.util.List<org.apache.avro.Schema> schemaList9 = schema8.getTypes();
        org.apache.avro.Schema[] schemaArray10 = new org.apache.avro.Schema[] {};
        java.util.ArrayList<org.apache.avro.Schema> schemaList11 = new java.util.ArrayList<org.apache.avro.Schema>();
        boolean boolean12 = java.util.Collections.addAll((java.util.Collection<org.apache.avro.Schema>) schemaList11, schemaArray10);
        org.apache.avro.Schema schema13 = org.apache.avro.Schema.createUnion((java.util.List<org.apache.avro.Schema>) schemaList11);
        org.apache.avro.Schema[] schemaArray14 = new org.apache.avro.Schema[] {};
        java.util.ArrayList<org.apache.avro.Schema> schemaList15 = new java.util.ArrayList<org.apache.avro.Schema>();
        boolean boolean16 = java.util.Collections.addAll((java.util.Collection<org.apache.avro.Schema>) schemaList15, schemaArray14);
        org.apache.avro.Schema schema17 = org.apache.avro.Schema.createUnion((java.util.List<org.apache.avro.Schema>) schemaList15);
        org.apache.avro.Schema schema18 = org.apache.avro.Schema.applyAliases(schema13, schema17);
        org.apache.avro.Schema schema19 = org.apache.avro.Schema.applyAliases(schema8, schema17);
        java.lang.String str21 = schema8.getProp("union");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.avro.Schema schema22 = schema8.getValueType();
            org.junit.Assert.fail("Expected exception of type org.apache.avro.AvroRuntimeException; message: Not a map: []");
        } catch (org.apache.avro.AvroRuntimeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(schemaArray0);
        org.junit.Assert.assertArrayEquals(schemaArray0, new org.apache.avro.Schema[] {});
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(schema3);
        org.junit.Assert.assertNotNull(schemaArray4);
        org.junit.Assert.assertArrayEquals(schemaArray4, new org.apache.avro.Schema[] {});
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(schema7);
        org.junit.Assert.assertNotNull(schema8);
        org.junit.Assert.assertNotNull(schemaList9);
        org.junit.Assert.assertNotNull(schemaArray10);
        org.junit.Assert.assertArrayEquals(schemaArray10, new org.apache.avro.Schema[] {});
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(schema13);
        org.junit.Assert.assertNotNull(schemaArray14);
        org.junit.Assert.assertArrayEquals(schemaArray14, new org.apache.avro.Schema[] {});
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(schema17);
        org.junit.Assert.assertNotNull(schema18);
        org.junit.Assert.assertNotNull(schema19);
        org.junit.Assert.assertNull(str21);
    }

    @Test
    public void test0084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SchemaM3Random300Test0.test0084");
        org.apache.avro.Schema[] schemaArray0 = new org.apache.avro.Schema[] {};
        java.util.ArrayList<org.apache.avro.Schema> schemaList1 = new java.util.ArrayList<org.apache.avro.Schema>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<org.apache.avro.Schema>) schemaList1, schemaArray0);
        org.apache.avro.Schema schema3 = org.apache.avro.Schema.createUnion((java.util.List<org.apache.avro.Schema>) schemaList1);
        org.apache.avro.Schema[] schemaArray4 = new org.apache.avro.Schema[] {};
        java.util.ArrayList<org.apache.avro.Schema> schemaList5 = new java.util.ArrayList<org.apache.avro.Schema>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<org.apache.avro.Schema>) schemaList5, schemaArray4);
        org.apache.avro.Schema schema7 = org.apache.avro.Schema.createUnion((java.util.List<org.apache.avro.Schema>) schemaList5);
        org.apache.avro.Schema schema8 = org.apache.avro.Schema.applyAliases(schema3, schema7);
        java.util.List<org.apache.avro.Schema> schemaList9 = schema8.getTypes();
        org.apache.avro.Schema[] schemaArray10 = new org.apache.avro.Schema[] {};
        java.util.ArrayList<org.apache.avro.Schema> schemaList11 = new java.util.ArrayList<org.apache.avro.Schema>();
        boolean boolean12 = java.util.Collections.addAll((java.util.Collection<org.apache.avro.Schema>) schemaList11, schemaArray10);
        org.apache.avro.Schema schema13 = org.apache.avro.Schema.createUnion((java.util.List<org.apache.avro.Schema>) schemaList11);
        org.apache.avro.Schema[] schemaArray14 = new org.apache.avro.Schema[] {};
        java.util.ArrayList<org.apache.avro.Schema> schemaList15 = new java.util.ArrayList<org.apache.avro.Schema>();
        boolean boolean16 = java.util.Collections.addAll((java.util.Collection<org.apache.avro.Schema>) schemaList15, schemaArray14);
        org.apache.avro.Schema schema17 = org.apache.avro.Schema.createUnion((java.util.List<org.apache.avro.Schema>) schemaList15);
        org.apache.avro.Schema schema18 = org.apache.avro.Schema.applyAliases(schema13, schema17);
        org.apache.avro.Schema schema19 = org.apache.avro.Schema.applyAliases(schema8, schema17);
        org.apache.avro.Schema schema20 = org.apache.avro.Schema.createMap(schema8);
        org.apache.avro.Schema schema21 = org.apache.avro.Schema.createArray(schema20);
        org.apache.avro.Schema schema22 = org.apache.avro.Schema.createMap(schema21);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.avro.Schema.Field field24 = schema21.getField("");
            org.junit.Assert.fail("Expected exception of type org.apache.avro.AvroRuntimeException; message: Not a record: {\"type\":\"array\",\"items\":{\"type\":\"map\",\"values\":[]}}");
        } catch (org.apache.avro.AvroRuntimeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(schemaArray0);
        org.junit.Assert.assertArrayEquals(schemaArray0, new org.apache.avro.Schema[] {});
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(schema3);
        org.junit.Assert.assertNotNull(schemaArray4);
        org.junit.Assert.assertArrayEquals(schemaArray4, new org.apache.avro.Schema[] {});
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(schema7);
        org.junit.Assert.assertNotNull(schema8);
        org.junit.Assert.assertNotNull(schemaList9);
        org.junit.Assert.assertNotNull(schemaArray10);
        org.junit.Assert.assertArrayEquals(schemaArray10, new org.apache.avro.Schema[] {});
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(schema13);
        org.junit.Assert.assertNotNull(schemaArray14);
        org.junit.Assert.assertArrayEquals(schemaArray14, new org.apache.avro.Schema[] {});
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(schema17);
        org.junit.Assert.assertNotNull(schema18);
        org.junit.Assert.assertNotNull(schema19);
        org.junit.Assert.assertNotNull(schema20);
        org.junit.Assert.assertNotNull(schema21);
        org.junit.Assert.assertNotNull(schema22);
    }

    @Test
    public void test0085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SchemaM3Random300Test0.test0085");
        org.apache.avro.Schema.Parser parser0 = new org.apache.avro.Schema.Parser();
        org.apache.avro.Schema.Parser parser2 = parser0.setValidate(true);
        java.util.Map<java.lang.String, org.apache.avro.Schema> strMap3 = parser0.getTypes();
        java.lang.Class<?> wildcardClass4 = strMap3.getClass();
        org.junit.Assert.assertNotNull(parser2);
        org.junit.Assert.assertNotNull(strMap3);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test0086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SchemaM3Random300Test0.test0086");
        org.apache.avro.Schema.Names names0 = new org.apache.avro.Schema.Names();
        java.lang.String str1 = names0.space();
        int int2 = names0.size();
        org.apache.avro.Schema[] schemaArray3 = new org.apache.avro.Schema[] {};
        java.util.ArrayList<org.apache.avro.Schema> schemaList4 = new java.util.ArrayList<org.apache.avro.Schema>();
        boolean boolean5 = java.util.Collections.addAll((java.util.Collection<org.apache.avro.Schema>) schemaList4, schemaArray3);
        org.apache.avro.Schema schema6 = org.apache.avro.Schema.createUnion((java.util.List<org.apache.avro.Schema>) schemaList4);
        org.apache.avro.Schema[] schemaArray7 = new org.apache.avro.Schema[] {};
        java.util.ArrayList<org.apache.avro.Schema> schemaList8 = new java.util.ArrayList<org.apache.avro.Schema>();
        boolean boolean9 = java.util.Collections.addAll((java.util.Collection<org.apache.avro.Schema>) schemaList8, schemaArray7);
        org.apache.avro.Schema schema10 = org.apache.avro.Schema.createUnion((java.util.List<org.apache.avro.Schema>) schemaList8);
        org.apache.avro.Schema schema11 = org.apache.avro.Schema.applyAliases(schema6, schema10);
        java.util.List<org.apache.avro.Schema> schemaList12 = schema11.getTypes();
        org.apache.avro.Schema[] schemaArray13 = new org.apache.avro.Schema[] {};
        java.util.ArrayList<org.apache.avro.Schema> schemaList14 = new java.util.ArrayList<org.apache.avro.Schema>();
        boolean boolean15 = java.util.Collections.addAll((java.util.Collection<org.apache.avro.Schema>) schemaList14, schemaArray13);
        org.apache.avro.Schema schema16 = org.apache.avro.Schema.createUnion((java.util.List<org.apache.avro.Schema>) schemaList14);
        org.apache.avro.Schema[] schemaArray17 = new org.apache.avro.Schema[] {};
        java.util.ArrayList<org.apache.avro.Schema> schemaList18 = new java.util.ArrayList<org.apache.avro.Schema>();
        boolean boolean19 = java.util.Collections.addAll((java.util.Collection<org.apache.avro.Schema>) schemaList18, schemaArray17);
        org.apache.avro.Schema schema20 = org.apache.avro.Schema.createUnion((java.util.List<org.apache.avro.Schema>) schemaList18);
        org.apache.avro.Schema schema21 = org.apache.avro.Schema.applyAliases(schema16, schema20);
        org.apache.avro.Schema schema22 = org.apache.avro.Schema.applyAliases(schema11, schema20);
        java.util.List<org.apache.avro.Schema> schemaList23 = schema11.getTypes();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean24 = names0.contains(schema11);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: org.apache.avro.Schema$UnionSchema cannot be cast to org.apache.avro.Schema$NamedSchema");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(schemaArray3);
        org.junit.Assert.assertArrayEquals(schemaArray3, new org.apache.avro.Schema[] {});
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(schema6);
        org.junit.Assert.assertNotNull(schemaArray7);
        org.junit.Assert.assertArrayEquals(schemaArray7, new org.apache.avro.Schema[] {});
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(schema10);
        org.junit.Assert.assertNotNull(schema11);
        org.junit.Assert.assertNotNull(schemaList12);
        org.junit.Assert.assertNotNull(schemaArray13);
        org.junit.Assert.assertArrayEquals(schemaArray13, new org.apache.avro.Schema[] {});
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(schema16);
        org.junit.Assert.assertNotNull(schemaArray17);
        org.junit.Assert.assertArrayEquals(schemaArray17, new org.apache.avro.Schema[] {});
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(schema20);
        org.junit.Assert.assertNotNull(schema21);
        org.junit.Assert.assertNotNull(schema22);
        org.junit.Assert.assertNotNull(schemaList23);
    }

    @Test
    public void test0087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SchemaM3Random300Test0.test0087");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.avro.Schema schema2 = org.apache.avro.Schema.parse("hi!", false);
            org.junit.Assert.fail("Expected exception of type org.apache.avro.SchemaParseException; message: org.codehaus.jackson.JsonParseException: Unexpected character ('h' (code 104)): expected a valid value (number, String, array, object, 'true', 'false' or 'null')? at [Source: java.io.StringReader@197e0c6a; line: 1, column: 2]");
        } catch (org.apache.avro.SchemaParseException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SchemaM3Random300Test0.test0088");
        org.apache.avro.Schema.Names names0 = new org.apache.avro.Schema.Names();
        names0.space("[ ]");
        java.lang.Object obj3 = names0.clone();
        boolean boolean6 = names0.remove((java.lang.Object) 1, (java.lang.Object) true);
        java.util.Collection<org.apache.avro.Schema> schemaCollection7 = names0.values();
        org.junit.Assert.assertNotNull(obj3);
        org.junit.Assert.assertEquals(obj3.toString(), "{}");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj3), "{}");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj3), "{}");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(schemaCollection7);
    }

    @Test
    public void test0089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SchemaM3Random300Test0.test0089");
        org.apache.avro.Schema.Type type0 = org.apache.avro.Schema.Type.FLOAT;
        org.apache.avro.Schema schema1 = org.apache.avro.Schema.create(type0);
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<org.apache.avro.Schema> schemaList2 = schema1.getTypes();
            org.junit.Assert.fail("Expected exception of type org.apache.avro.AvroRuntimeException; message: Not a union: \"float\"");
        } catch (org.apache.avro.AvroRuntimeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + type0 + "' != '" + org.apache.avro.Schema.Type.FLOAT + "'", type0.equals(org.apache.avro.Schema.Type.FLOAT));
        org.junit.Assert.assertNotNull(schema1);
    }

    @Test
    public void test0090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SchemaM3Random300Test0.test0090");
        org.apache.avro.Schema.Names names0 = new org.apache.avro.Schema.Names();
        java.lang.String str1 = names0.space();
        int int2 = names0.size();
        org.apache.avro.Schema[] schemaArray3 = new org.apache.avro.Schema[] {};
        java.util.ArrayList<org.apache.avro.Schema> schemaList4 = new java.util.ArrayList<org.apache.avro.Schema>();
        boolean boolean5 = java.util.Collections.addAll((java.util.Collection<org.apache.avro.Schema>) schemaList4, schemaArray3);
        org.apache.avro.Schema schema6 = org.apache.avro.Schema.createUnion((java.util.List<org.apache.avro.Schema>) schemaList4);
        org.apache.avro.Schema[] schemaArray7 = new org.apache.avro.Schema[] {};
        java.util.ArrayList<org.apache.avro.Schema> schemaList8 = new java.util.ArrayList<org.apache.avro.Schema>();
        boolean boolean9 = java.util.Collections.addAll((java.util.Collection<org.apache.avro.Schema>) schemaList8, schemaArray7);
        org.apache.avro.Schema schema10 = org.apache.avro.Schema.createUnion((java.util.List<org.apache.avro.Schema>) schemaList8);
        org.apache.avro.Schema schema11 = org.apache.avro.Schema.applyAliases(schema6, schema10);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.avro.Schema schema12 = names0.get((java.lang.Object) schema6);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: org.apache.avro.Schema$UnionSchema cannot be cast to org.apache.avro.Schema$Name");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(schemaArray3);
        org.junit.Assert.assertArrayEquals(schemaArray3, new org.apache.avro.Schema[] {});
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(schema6);
        org.junit.Assert.assertNotNull(schemaArray7);
        org.junit.Assert.assertArrayEquals(schemaArray7, new org.apache.avro.Schema[] {});
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(schema10);
        org.junit.Assert.assertNotNull(schema11);
    }

    @Test
    public void test0091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SchemaM3Random300Test0.test0091");
        org.apache.avro.Schema[] schemaArray1 = new org.apache.avro.Schema[] {};
        java.util.ArrayList<org.apache.avro.Schema> schemaList2 = new java.util.ArrayList<org.apache.avro.Schema>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<org.apache.avro.Schema>) schemaList2, schemaArray1);
        org.apache.avro.Schema schema4 = org.apache.avro.Schema.createUnion((java.util.List<org.apache.avro.Schema>) schemaList2);
        org.codehaus.jackson.JsonNode jsonNode7 = org.apache.avro.Schema.parseJson("{}");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.avro.Schema.Field field8 = new org.apache.avro.Schema.Field("", schema4, "", jsonNode7);
            org.junit.Assert.fail("Expected exception of type org.apache.avro.SchemaParseException; message: Empty name");
        } catch (org.apache.avro.SchemaParseException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(schemaArray1);
        org.junit.Assert.assertArrayEquals(schemaArray1, new org.apache.avro.Schema[] {});
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(schema4);
        org.junit.Assert.assertNotNull(jsonNode7);
    }

    @Test
    public void test0092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SchemaM3Random300Test0.test0092");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.avro.Schema schema4 = org.apache.avro.Schema.createRecord("{}", "{\"type\":\"map\",\"values\":[]}", "{}", true);
            org.junit.Assert.fail("Expected exception of type org.apache.avro.SchemaParseException; message: Illegal initial character: {}");
        } catch (org.apache.avro.SchemaParseException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SchemaM3Random300Test0.test0093");
        org.apache.avro.Schema[] schemaArray0 = new org.apache.avro.Schema[] {};
        java.util.ArrayList<org.apache.avro.Schema> schemaList1 = new java.util.ArrayList<org.apache.avro.Schema>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<org.apache.avro.Schema>) schemaList1, schemaArray0);
        org.apache.avro.Schema schema3 = org.apache.avro.Schema.createUnion((java.util.List<org.apache.avro.Schema>) schemaList1);
        org.apache.avro.Schema[] schemaArray4 = new org.apache.avro.Schema[] {};
        java.util.ArrayList<org.apache.avro.Schema> schemaList5 = new java.util.ArrayList<org.apache.avro.Schema>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<org.apache.avro.Schema>) schemaList5, schemaArray4);
        org.apache.avro.Schema schema7 = org.apache.avro.Schema.createUnion((java.util.List<org.apache.avro.Schema>) schemaList5);
        org.apache.avro.Schema schema8 = org.apache.avro.Schema.applyAliases(schema3, schema7);
        java.util.List<org.apache.avro.Schema> schemaList9 = schema8.getTypes();
        org.apache.avro.Schema[] schemaArray10 = new org.apache.avro.Schema[] {};
        java.util.ArrayList<org.apache.avro.Schema> schemaList11 = new java.util.ArrayList<org.apache.avro.Schema>();
        boolean boolean12 = java.util.Collections.addAll((java.util.Collection<org.apache.avro.Schema>) schemaList11, schemaArray10);
        org.apache.avro.Schema schema13 = org.apache.avro.Schema.createUnion((java.util.List<org.apache.avro.Schema>) schemaList11);
        org.apache.avro.Schema[] schemaArray14 = new org.apache.avro.Schema[] {};
        java.util.ArrayList<org.apache.avro.Schema> schemaList15 = new java.util.ArrayList<org.apache.avro.Schema>();
        boolean boolean16 = java.util.Collections.addAll((java.util.Collection<org.apache.avro.Schema>) schemaList15, schemaArray14);
        org.apache.avro.Schema schema17 = org.apache.avro.Schema.createUnion((java.util.List<org.apache.avro.Schema>) schemaList15);
        org.apache.avro.Schema schema18 = org.apache.avro.Schema.applyAliases(schema13, schema17);
        org.apache.avro.Schema schema19 = org.apache.avro.Schema.applyAliases(schema8, schema17);
        org.apache.avro.Schema schema20 = org.apache.avro.Schema.createMap(schema8);
        org.apache.avro.Schema schema21 = schema20.getValueType();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean23 = schema21.hasEnumSymbol("hi!");
            org.junit.Assert.fail("Expected exception of type org.apache.avro.AvroRuntimeException; message: Not an enum: []");
        } catch (org.apache.avro.AvroRuntimeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(schemaArray0);
        org.junit.Assert.assertArrayEquals(schemaArray0, new org.apache.avro.Schema[] {});
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(schema3);
        org.junit.Assert.assertNotNull(schemaArray4);
        org.junit.Assert.assertArrayEquals(schemaArray4, new org.apache.avro.Schema[] {});
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(schema7);
        org.junit.Assert.assertNotNull(schema8);
        org.junit.Assert.assertNotNull(schemaList9);
        org.junit.Assert.assertNotNull(schemaArray10);
        org.junit.Assert.assertArrayEquals(schemaArray10, new org.apache.avro.Schema[] {});
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(schema13);
        org.junit.Assert.assertNotNull(schemaArray14);
        org.junit.Assert.assertArrayEquals(schemaArray14, new org.apache.avro.Schema[] {});
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(schema17);
        org.junit.Assert.assertNotNull(schema18);
        org.junit.Assert.assertNotNull(schema19);
        org.junit.Assert.assertNotNull(schema20);
        org.junit.Assert.assertNotNull(schema21);
    }

    @Test
    public void test0094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SchemaM3Random300Test0.test0094");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.avro.Schema schema4 = org.apache.avro.Schema.createFixed("{\"type\":\"map\",\"values\":[]}", "{\r\n  \"type\" : \"array\",\r\n  \"items\" : {\r\n    \"type\" : \"map\",\r\n    \"values\" : [ ]\r\n  }\r\n}", "", (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type org.apache.avro.SchemaParseException; message: Illegal initial character: {\"type\":\"map\",\"values\":[]}");
        } catch (org.apache.avro.SchemaParseException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SchemaM3Random300Test0.test0095");
        org.apache.avro.Schema.Parser parser0 = new org.apache.avro.Schema.Parser();
        java.util.Map<java.lang.String, org.apache.avro.Schema> strMap1 = parser0.getTypes();
        java.util.Map<java.lang.String, org.apache.avro.Schema> strMap2 = parser0.getTypes();
        org.apache.avro.Schema.Parser parser3 = new org.apache.avro.Schema.Parser();
        org.apache.avro.Schema.Parser parser5 = parser3.setValidate(true);
        java.util.Map<java.lang.String, org.apache.avro.Schema> strMap6 = parser3.getTypes();
        org.apache.avro.Schema.Parser parser7 = parser0.addTypes(strMap6);
        java.io.File file8 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.avro.Schema schema9 = parser0.parse(file8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strMap1);
        org.junit.Assert.assertNotNull(strMap2);
        org.junit.Assert.assertNotNull(parser5);
        org.junit.Assert.assertNotNull(strMap6);
        org.junit.Assert.assertNotNull(parser7);
    }

    @Test
    public void test0096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SchemaM3Random300Test0.test0096");
        org.apache.avro.Schema.Parser parser0 = new org.apache.avro.Schema.Parser();
        org.apache.avro.Schema.Parser parser2 = parser0.setValidate(true);
        java.util.Map<java.lang.String, org.apache.avro.Schema> strMap3 = parser0.getTypes();
        org.apache.avro.Schema.Parser parser5 = parser0.setValidate(true);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.avro.Schema schema7 = parser5.parse("{}");
            org.junit.Assert.fail("Expected exception of type org.apache.avro.SchemaParseException; message: No type: {}");
        } catch (org.apache.avro.SchemaParseException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(parser2);
        org.junit.Assert.assertNotNull(strMap3);
        org.junit.Assert.assertNotNull(parser5);
    }

    @Test
    public void test0097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SchemaM3Random300Test0.test0097");
        org.apache.avro.Schema schema4 = org.apache.avro.Schema.createFixed("union", "[ ]", "[]", 0);
        org.apache.avro.Schema.Type type5 = org.apache.avro.Schema.Type.INT;
        org.apache.avro.Schema schema6 = org.apache.avro.Schema.create(type5);
        org.apache.avro.Schema schema7 = org.apache.avro.Schema.createArray(schema6);
        org.apache.avro.Schema schema8 = org.apache.avro.Schema.applyAliases(schema4, schema7);
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<org.apache.avro.Schema> schemaList9 = schema8.getTypes();
            org.junit.Assert.fail("Expected exception of type org.apache.avro.AvroRuntimeException; message: Not a union: {\"type\":\"fixed\",\"name\":\"union\",\"namespace\":\"[]\",\"doc\":\"[ ]\",\"size\":0}");
        } catch (org.apache.avro.AvroRuntimeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(schema4);
        org.junit.Assert.assertTrue("'" + type5 + "' != '" + org.apache.avro.Schema.Type.INT + "'", type5.equals(org.apache.avro.Schema.Type.INT));
        org.junit.Assert.assertNotNull(schema6);
        org.junit.Assert.assertNotNull(schema7);
        org.junit.Assert.assertNotNull(schema8);
    }

    @Test
    public void test0098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SchemaM3Random300Test0.test0098");
        org.apache.avro.Schema.Parser parser0 = new org.apache.avro.Schema.Parser();
        java.util.Map<java.lang.String, org.apache.avro.Schema> strMap1 = parser0.getTypes();
        org.apache.avro.Schema.Parser parser2 = new org.apache.avro.Schema.Parser();
        org.apache.avro.Schema.Parser parser4 = parser2.setValidate(true);
        java.util.Map<java.lang.String, org.apache.avro.Schema> strMap5 = parser2.getTypes();
        org.apache.avro.Schema.Parser parser6 = parser0.addTypes(strMap5);
        java.io.File file7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.avro.Schema schema8 = parser0.parse(file7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strMap1);
        org.junit.Assert.assertNotNull(parser4);
        org.junit.Assert.assertNotNull(strMap5);
        org.junit.Assert.assertNotNull(parser6);
    }

    @Test
    public void test0099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SchemaM3Random300Test0.test0099");
        org.apache.avro.Schema.Field[] fieldArray0 = new org.apache.avro.Schema.Field[] {};
        java.util.ArrayList<org.apache.avro.Schema.Field> fieldList1 = new java.util.ArrayList<org.apache.avro.Schema.Field>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<org.apache.avro.Schema.Field>) fieldList1, fieldArray0);
        org.apache.avro.Schema schema3 = org.apache.avro.Schema.createRecord((java.util.List<org.apache.avro.Schema.Field>) fieldList1);
        java.lang.Class<?> wildcardClass4 = schema3.getClass();
        org.junit.Assert.assertNotNull(fieldArray0);
        org.junit.Assert.assertArrayEquals(fieldArray0, new org.apache.avro.Schema.Field[] {});
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(schema3);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test0100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SchemaM3Random300Test0.test0100");
        org.apache.avro.Schema[] schemaArray0 = new org.apache.avro.Schema[] {};
        java.util.ArrayList<org.apache.avro.Schema> schemaList1 = new java.util.ArrayList<org.apache.avro.Schema>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<org.apache.avro.Schema>) schemaList1, schemaArray0);
        org.apache.avro.Schema schema3 = org.apache.avro.Schema.createUnion((java.util.List<org.apache.avro.Schema>) schemaList1);
        org.apache.avro.Schema[] schemaArray4 = new org.apache.avro.Schema[] {};
        java.util.ArrayList<org.apache.avro.Schema> schemaList5 = new java.util.ArrayList<org.apache.avro.Schema>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<org.apache.avro.Schema>) schemaList5, schemaArray4);
        org.apache.avro.Schema schema7 = org.apache.avro.Schema.createUnion((java.util.List<org.apache.avro.Schema>) schemaList5);
        org.apache.avro.Schema schema8 = org.apache.avro.Schema.applyAliases(schema3, schema7);
        java.util.List<org.apache.avro.Schema> schemaList9 = schema8.getTypes();
        org.apache.avro.Schema[] schemaArray10 = new org.apache.avro.Schema[] {};
        java.util.ArrayList<org.apache.avro.Schema> schemaList11 = new java.util.ArrayList<org.apache.avro.Schema>();
        boolean boolean12 = java.util.Collections.addAll((java.util.Collection<org.apache.avro.Schema>) schemaList11, schemaArray10);
        org.apache.avro.Schema schema13 = org.apache.avro.Schema.createUnion((java.util.List<org.apache.avro.Schema>) schemaList11);
        org.apache.avro.Schema[] schemaArray14 = new org.apache.avro.Schema[] {};
        java.util.ArrayList<org.apache.avro.Schema> schemaList15 = new java.util.ArrayList<org.apache.avro.Schema>();
        boolean boolean16 = java.util.Collections.addAll((java.util.Collection<org.apache.avro.Schema>) schemaList15, schemaArray14);
        org.apache.avro.Schema schema17 = org.apache.avro.Schema.createUnion((java.util.List<org.apache.avro.Schema>) schemaList15);
        org.apache.avro.Schema schema18 = org.apache.avro.Schema.applyAliases(schema13, schema17);
        org.apache.avro.Schema schema19 = org.apache.avro.Schema.applyAliases(schema8, schema17);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.avro.Schema.Field field21 = schema8.getField("[ ]");
            org.junit.Assert.fail("Expected exception of type org.apache.avro.AvroRuntimeException; message: Not a record: []");
        } catch (org.apache.avro.AvroRuntimeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(schemaArray0);
        org.junit.Assert.assertArrayEquals(schemaArray0, new org.apache.avro.Schema[] {});
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(schema3);
        org.junit.Assert.assertNotNull(schemaArray4);
        org.junit.Assert.assertArrayEquals(schemaArray4, new org.apache.avro.Schema[] {});
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(schema7);
        org.junit.Assert.assertNotNull(schema8);
        org.junit.Assert.assertNotNull(schemaList9);
        org.junit.Assert.assertNotNull(schemaArray10);
        org.junit.Assert.assertArrayEquals(schemaArray10, new org.apache.avro.Schema[] {});
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(schema13);
        org.junit.Assert.assertNotNull(schemaArray14);
        org.junit.Assert.assertArrayEquals(schemaArray14, new org.apache.avro.Schema[] {});
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(schema17);
        org.junit.Assert.assertNotNull(schema18);
        org.junit.Assert.assertNotNull(schema19);
    }

    @Test
    public void test0101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SchemaM3Random300Test0.test0101");
        org.apache.avro.Schema[] schemaArray0 = new org.apache.avro.Schema[] {};
        java.util.ArrayList<org.apache.avro.Schema> schemaList1 = new java.util.ArrayList<org.apache.avro.Schema>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<org.apache.avro.Schema>) schemaList1, schemaArray0);
        org.apache.avro.Schema schema3 = org.apache.avro.Schema.createUnion((java.util.List<org.apache.avro.Schema>) schemaList1);
        org.apache.avro.Schema[] schemaArray4 = new org.apache.avro.Schema[] {};
        java.util.ArrayList<org.apache.avro.Schema> schemaList5 = new java.util.ArrayList<org.apache.avro.Schema>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<org.apache.avro.Schema>) schemaList5, schemaArray4);
        org.apache.avro.Schema schema7 = org.apache.avro.Schema.createUnion((java.util.List<org.apache.avro.Schema>) schemaList5);
        org.apache.avro.Schema schema8 = org.apache.avro.Schema.applyAliases(schema3, schema7);
        java.util.List<org.apache.avro.Schema> schemaList9 = schema8.getTypes();
        org.apache.avro.Schema[] schemaArray10 = new org.apache.avro.Schema[] {};
        java.util.ArrayList<org.apache.avro.Schema> schemaList11 = new java.util.ArrayList<org.apache.avro.Schema>();
        boolean boolean12 = java.util.Collections.addAll((java.util.Collection<org.apache.avro.Schema>) schemaList11, schemaArray10);
        org.apache.avro.Schema schema13 = org.apache.avro.Schema.createUnion((java.util.List<org.apache.avro.Schema>) schemaList11);
        org.apache.avro.Schema[] schemaArray14 = new org.apache.avro.Schema[] {};
        java.util.ArrayList<org.apache.avro.Schema> schemaList15 = new java.util.ArrayList<org.apache.avro.Schema>();
        boolean boolean16 = java.util.Collections.addAll((java.util.Collection<org.apache.avro.Schema>) schemaList15, schemaArray14);
        org.apache.avro.Schema schema17 = org.apache.avro.Schema.createUnion((java.util.List<org.apache.avro.Schema>) schemaList15);
        org.apache.avro.Schema schema18 = org.apache.avro.Schema.applyAliases(schema13, schema17);
        org.apache.avro.Schema schema19 = org.apache.avro.Schema.applyAliases(schema8, schema17);
        // The following exception was thrown during execution in test generation
        try {
            int int21 = schema17.getEnumOrdinal("");
            org.junit.Assert.fail("Expected exception of type org.apache.avro.AvroRuntimeException; message: Not an enum: []");
        } catch (org.apache.avro.AvroRuntimeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(schemaArray0);
        org.junit.Assert.assertArrayEquals(schemaArray0, new org.apache.avro.Schema[] {});
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(schema3);
        org.junit.Assert.assertNotNull(schemaArray4);
        org.junit.Assert.assertArrayEquals(schemaArray4, new org.apache.avro.Schema[] {});
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(schema7);
        org.junit.Assert.assertNotNull(schema8);
        org.junit.Assert.assertNotNull(schemaList9);
        org.junit.Assert.assertNotNull(schemaArray10);
        org.junit.Assert.assertArrayEquals(schemaArray10, new org.apache.avro.Schema[] {});
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(schema13);
        org.junit.Assert.assertNotNull(schemaArray14);
        org.junit.Assert.assertArrayEquals(schemaArray14, new org.apache.avro.Schema[] {});
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(schema17);
        org.junit.Assert.assertNotNull(schema18);
        org.junit.Assert.assertNotNull(schema19);
    }

    @Test
    public void test0102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SchemaM3Random300Test0.test0102");
        org.apache.avro.Schema.LockableArrayList<java.lang.String> strList4 = new org.apache.avro.Schema.LockableArrayList<java.lang.String>((int) (byte) 100);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.avro.Schema schema5 = org.apache.avro.Schema.createEnum("{\r\n  \"type\" : \"array\",\r\n  \"items\" : {\r\n    \"type\" : \"map\",\r\n    \"values\" : [ ]\r\n  }\r\n}", "", "union", (java.util.List<java.lang.String>) strList4);
            org.junit.Assert.fail("Expected exception of type org.apache.avro.SchemaParseException; message: Illegal initial character: {??  \"type\" : \"array\",??  \"items\" : {??    \"type\" : \"map\",??    \"values\" : [ ]??  }??}");
        } catch (org.apache.avro.SchemaParseException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SchemaM3Random300Test0.test0103");
        org.apache.avro.Schema[] schemaArray0 = new org.apache.avro.Schema[] {};
        java.util.ArrayList<org.apache.avro.Schema> schemaList1 = new java.util.ArrayList<org.apache.avro.Schema>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<org.apache.avro.Schema>) schemaList1, schemaArray0);
        org.apache.avro.Schema schema3 = org.apache.avro.Schema.createUnion((java.util.List<org.apache.avro.Schema>) schemaList1);
        org.apache.avro.Schema[] schemaArray4 = new org.apache.avro.Schema[] {};
        java.util.ArrayList<org.apache.avro.Schema> schemaList5 = new java.util.ArrayList<org.apache.avro.Schema>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<org.apache.avro.Schema>) schemaList5, schemaArray4);
        org.apache.avro.Schema schema7 = org.apache.avro.Schema.createUnion((java.util.List<org.apache.avro.Schema>) schemaList5);
        org.apache.avro.Schema schema8 = org.apache.avro.Schema.applyAliases(schema3, schema7);
        java.util.List<org.apache.avro.Schema> schemaList9 = schema8.getTypes();
        org.apache.avro.Schema[] schemaArray10 = new org.apache.avro.Schema[] {};
        java.util.ArrayList<org.apache.avro.Schema> schemaList11 = new java.util.ArrayList<org.apache.avro.Schema>();
        boolean boolean12 = java.util.Collections.addAll((java.util.Collection<org.apache.avro.Schema>) schemaList11, schemaArray10);
        org.apache.avro.Schema schema13 = org.apache.avro.Schema.createUnion((java.util.List<org.apache.avro.Schema>) schemaList11);
        org.apache.avro.Schema[] schemaArray14 = new org.apache.avro.Schema[] {};
        java.util.ArrayList<org.apache.avro.Schema> schemaList15 = new java.util.ArrayList<org.apache.avro.Schema>();
        boolean boolean16 = java.util.Collections.addAll((java.util.Collection<org.apache.avro.Schema>) schemaList15, schemaArray14);
        org.apache.avro.Schema schema17 = org.apache.avro.Schema.createUnion((java.util.List<org.apache.avro.Schema>) schemaList15);
        org.apache.avro.Schema schema18 = org.apache.avro.Schema.applyAliases(schema13, schema17);
        org.apache.avro.Schema schema19 = org.apache.avro.Schema.applyAliases(schema8, schema17);
        org.apache.avro.Schema schema20 = org.apache.avro.Schema.createMap(schema8);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.avro.Schema schema21 = schema8.getValueType();
            org.junit.Assert.fail("Expected exception of type org.apache.avro.AvroRuntimeException; message: Not a map: []");
        } catch (org.apache.avro.AvroRuntimeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(schemaArray0);
        org.junit.Assert.assertArrayEquals(schemaArray0, new org.apache.avro.Schema[] {});
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(schema3);
        org.junit.Assert.assertNotNull(schemaArray4);
        org.junit.Assert.assertArrayEquals(schemaArray4, new org.apache.avro.Schema[] {});
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(schema7);
        org.junit.Assert.assertNotNull(schema8);
        org.junit.Assert.assertNotNull(schemaList9);
        org.junit.Assert.assertNotNull(schemaArray10);
        org.junit.Assert.assertArrayEquals(schemaArray10, new org.apache.avro.Schema[] {});
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(schema13);
        org.junit.Assert.assertNotNull(schemaArray14);
        org.junit.Assert.assertArrayEquals(schemaArray14, new org.apache.avro.Schema[] {});
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(schema17);
        org.junit.Assert.assertNotNull(schema18);
        org.junit.Assert.assertNotNull(schema19);
        org.junit.Assert.assertNotNull(schema20);
    }

    @Test
    public void test0104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SchemaM3Random300Test0.test0104");
        org.apache.avro.Schema.Parser parser0 = new org.apache.avro.Schema.Parser();
        org.apache.avro.Schema.Parser parser2 = parser0.setValidate(true);
        java.io.InputStream inputStream3 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.avro.Schema schema4 = parser2.parse(inputStream3);
            org.junit.Assert.fail("Expected exception of type java.io.EOFException; message: No content to map to Object due to end of input");
        } catch (java.io.EOFException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(parser2);
    }

    @Test
    public void test0105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SchemaM3Random300Test0.test0105");
        org.apache.avro.Schema.Type type0 = org.apache.avro.Schema.Type.ENUM;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.avro.Schema schema1 = org.apache.avro.Schema.create(type0);
            org.junit.Assert.fail("Expected exception of type org.apache.avro.AvroRuntimeException; message: Can't create a: ENUM");
        } catch (org.apache.avro.AvroRuntimeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + type0 + "' != '" + org.apache.avro.Schema.Type.ENUM + "'", type0.equals(org.apache.avro.Schema.Type.ENUM));
    }

    @Test
    public void test0106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SchemaM3Random300Test0.test0106");
        org.apache.avro.Schema.Parser parser0 = new org.apache.avro.Schema.Parser();
        org.apache.avro.Schema.Parser parser2 = parser0.setValidate(true);
        org.apache.avro.Schema.Parser parser4 = parser0.setValidate(true);
        org.apache.avro.Schema.Parser parser6 = parser0.setValidate(true);
        java.io.File file7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.avro.Schema schema8 = parser6.parse(file7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(parser2);
        org.junit.Assert.assertNotNull(parser4);
        org.junit.Assert.assertNotNull(parser6);
    }

    @Test
    public void test0107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SchemaM3Random300Test0.test0107");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.avro.Schema.LockableArrayList<java.lang.String> strList1 = new org.apache.avro.Schema.LockableArrayList<java.lang.String>((int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal Capacity: -1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SchemaM3Random300Test0.test0108");
        org.apache.avro.Schema[] schemaArray0 = new org.apache.avro.Schema[] {};
        java.util.ArrayList<org.apache.avro.Schema> schemaList1 = new java.util.ArrayList<org.apache.avro.Schema>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<org.apache.avro.Schema>) schemaList1, schemaArray0);
        org.apache.avro.Schema schema3 = org.apache.avro.Schema.createUnion((java.util.List<org.apache.avro.Schema>) schemaList1);
        org.apache.avro.Schema[] schemaArray4 = new org.apache.avro.Schema[] {};
        java.util.ArrayList<org.apache.avro.Schema> schemaList5 = new java.util.ArrayList<org.apache.avro.Schema>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<org.apache.avro.Schema>) schemaList5, schemaArray4);
        org.apache.avro.Schema schema7 = org.apache.avro.Schema.createUnion((java.util.List<org.apache.avro.Schema>) schemaList5);
        org.apache.avro.Schema schema8 = org.apache.avro.Schema.applyAliases(schema3, schema7);
        java.util.List<org.apache.avro.Schema> schemaList9 = schema8.getTypes();
        boolean boolean11 = schema8.equals((java.lang.Object) "hi!");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.avro.Schema schema12 = schema8.getElementType();
            org.junit.Assert.fail("Expected exception of type org.apache.avro.AvroRuntimeException; message: Not an array: []");
        } catch (org.apache.avro.AvroRuntimeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(schemaArray0);
        org.junit.Assert.assertArrayEquals(schemaArray0, new org.apache.avro.Schema[] {});
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(schema3);
        org.junit.Assert.assertNotNull(schemaArray4);
        org.junit.Assert.assertArrayEquals(schemaArray4, new org.apache.avro.Schema[] {});
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(schema7);
        org.junit.Assert.assertNotNull(schema8);
        org.junit.Assert.assertNotNull(schemaList9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test0109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SchemaM3Random300Test0.test0109");
        org.apache.avro.Schema.Parser parser0 = new org.apache.avro.Schema.Parser();
        org.apache.avro.Schema.Parser parser2 = parser0.setValidate(true);
        org.apache.avro.Schema.Parser parser4 = parser0.setValidate(true);
        org.apache.avro.Schema.Parser parser6 = parser0.setValidate(true);
        java.io.InputStream inputStream7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.avro.Schema schema8 = parser6.parse(inputStream7);
            org.junit.Assert.fail("Expected exception of type java.io.EOFException; message: No content to map to Object due to end of input");
        } catch (java.io.EOFException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(parser2);
        org.junit.Assert.assertNotNull(parser4);
        org.junit.Assert.assertNotNull(parser6);
    }

    @Test
    public void test0110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SchemaM3Random300Test0.test0110");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.avro.Schema schema4 = org.apache.avro.Schema.createFixed("union type:UNION pos:-1", "{\r\n  \"type\" : \"map\",\r\n  \"values\" : [ ]\r\n}", "union type:MAP pos:-1", (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type org.apache.avro.SchemaParseException; message: Illegal character in: union type:UNION pos:-1");
        } catch (org.apache.avro.SchemaParseException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SchemaM3Random300Test0.test0111");
        org.apache.avro.Schema[] schemaArray0 = new org.apache.avro.Schema[] {};
        java.util.ArrayList<org.apache.avro.Schema> schemaList1 = new java.util.ArrayList<org.apache.avro.Schema>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<org.apache.avro.Schema>) schemaList1, schemaArray0);
        org.apache.avro.Schema schema3 = org.apache.avro.Schema.createUnion((java.util.List<org.apache.avro.Schema>) schemaList1);
        org.apache.avro.Schema[] schemaArray4 = new org.apache.avro.Schema[] {};
        java.util.ArrayList<org.apache.avro.Schema> schemaList5 = new java.util.ArrayList<org.apache.avro.Schema>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<org.apache.avro.Schema>) schemaList5, schemaArray4);
        org.apache.avro.Schema schema7 = org.apache.avro.Schema.createUnion((java.util.List<org.apache.avro.Schema>) schemaList5);
        org.apache.avro.Schema schema8 = org.apache.avro.Schema.applyAliases(schema3, schema7);
        org.apache.avro.Schema.Type type9 = schema7.getType();
        org.apache.avro.Schema schema10 = org.apache.avro.Schema.createMap(schema7);
        org.apache.avro.Schema.Names names11 = new org.apache.avro.Schema.Names();
        java.lang.String str12 = names11.space();
        names11.space("");
        boolean boolean15 = schema7.equals((java.lang.Object) "");
        java.lang.String str16 = schema7.getFullName();
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<java.lang.String> strList17 = schema7.getEnumSymbols();
            org.junit.Assert.fail("Expected exception of type org.apache.avro.AvroRuntimeException; message: Not an enum: []");
        } catch (org.apache.avro.AvroRuntimeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(schemaArray0);
        org.junit.Assert.assertArrayEquals(schemaArray0, new org.apache.avro.Schema[] {});
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(schema3);
        org.junit.Assert.assertNotNull(schemaArray4);
        org.junit.Assert.assertArrayEquals(schemaArray4, new org.apache.avro.Schema[] {});
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(schema7);
        org.junit.Assert.assertNotNull(schema8);
        org.junit.Assert.assertTrue("'" + type9 + "' != '" + org.apache.avro.Schema.Type.UNION + "'", type9.equals(org.apache.avro.Schema.Type.UNION));
        org.junit.Assert.assertNotNull(schema10);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "union" + "'", str16, "union");
    }

    @Test
    public void test0112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SchemaM3Random300Test0.test0112");
        org.apache.avro.Schema[] schemaArray0 = new org.apache.avro.Schema[] {};
        java.util.ArrayList<org.apache.avro.Schema> schemaList1 = new java.util.ArrayList<org.apache.avro.Schema>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<org.apache.avro.Schema>) schemaList1, schemaArray0);
        org.apache.avro.Schema schema3 = org.apache.avro.Schema.createUnion((java.util.List<org.apache.avro.Schema>) schemaList1);
        org.apache.avro.Schema[] schemaArray4 = new org.apache.avro.Schema[] {};
        java.util.ArrayList<org.apache.avro.Schema> schemaList5 = new java.util.ArrayList<org.apache.avro.Schema>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<org.apache.avro.Schema>) schemaList5, schemaArray4);
        org.apache.avro.Schema schema7 = org.apache.avro.Schema.createUnion((java.util.List<org.apache.avro.Schema>) schemaList5);
        org.apache.avro.Schema schema8 = org.apache.avro.Schema.applyAliases(schema3, schema7);
        org.apache.avro.Schema.Type type9 = schema7.getType();
        org.apache.avro.Schema schema10 = org.apache.avro.Schema.createMap(schema7);
        org.apache.avro.Schema schema11 = org.apache.avro.Schema.createArray(schema10);
        // The following exception was thrown during execution in test generation
        try {
            schema11.addAlias("{\r\n  \"type\" : \"array\",\r\n  \"items\" : {\r\n    \"type\" : \"map\",\r\n    \"values\" : [ ]\r\n  }\r\n}");
            org.junit.Assert.fail("Expected exception of type org.apache.avro.AvroRuntimeException; message: Not a named type: {\"type\":\"array\",\"items\":{\"type\":\"map\",\"values\":[]}}");
        } catch (org.apache.avro.AvroRuntimeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(schemaArray0);
        org.junit.Assert.assertArrayEquals(schemaArray0, new org.apache.avro.Schema[] {});
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(schema3);
        org.junit.Assert.assertNotNull(schemaArray4);
        org.junit.Assert.assertArrayEquals(schemaArray4, new org.apache.avro.Schema[] {});
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(schema7);
        org.junit.Assert.assertNotNull(schema8);
        org.junit.Assert.assertTrue("'" + type9 + "' != '" + org.apache.avro.Schema.Type.UNION + "'", type9.equals(org.apache.avro.Schema.Type.UNION));
        org.junit.Assert.assertNotNull(schema10);
        org.junit.Assert.assertNotNull(schema11);
    }

    @Test
    public void test0113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SchemaM3Random300Test0.test0113");
        org.apache.avro.Schema schema0 = null;
        org.apache.avro.Schema schema1 = org.apache.avro.Schema.createArray(schema0);
        // The following exception was thrown during execution in test generation
        try {
            int int3 = schema1.getEnumOrdinal("{}");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(schema1);
    }

    @Test
    public void test0114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SchemaM3Random300Test0.test0114");
        org.apache.avro.Schema.LockableArrayList<java.lang.String> strList4 = new org.apache.avro.Schema.LockableArrayList<java.lang.String>((int) '#');
        // The following exception was thrown during execution in test generation
        try {
            org.apache.avro.Schema schema5 = org.apache.avro.Schema.createEnum("[ ]", "{}", "{\r\n  \"type\" : \"map\",\r\n  \"values\" : [ ]\r\n}", (java.util.List<java.lang.String>) strList4);
            org.junit.Assert.fail("Expected exception of type org.apache.avro.SchemaParseException; message: Illegal initial character: [ ]");
        } catch (org.apache.avro.SchemaParseException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SchemaM3Random300Test0.test0115");
        org.apache.avro.Schema[] schemaArray0 = new org.apache.avro.Schema[] {};
        java.util.ArrayList<org.apache.avro.Schema> schemaList1 = new java.util.ArrayList<org.apache.avro.Schema>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<org.apache.avro.Schema>) schemaList1, schemaArray0);
        org.apache.avro.Schema schema3 = org.apache.avro.Schema.createUnion((java.util.List<org.apache.avro.Schema>) schemaList1);
        org.apache.avro.Schema[] schemaArray4 = new org.apache.avro.Schema[] {};
        java.util.ArrayList<org.apache.avro.Schema> schemaList5 = new java.util.ArrayList<org.apache.avro.Schema>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<org.apache.avro.Schema>) schemaList5, schemaArray4);
        org.apache.avro.Schema schema7 = org.apache.avro.Schema.createUnion((java.util.List<org.apache.avro.Schema>) schemaList5);
        org.apache.avro.Schema schema8 = org.apache.avro.Schema.applyAliases(schema3, schema7);
        java.util.List<org.apache.avro.Schema> schemaList9 = schema8.getTypes();
        boolean boolean11 = schema8.equals((java.lang.Object) "hi!");
        java.lang.String str12 = schema8.getDoc();
        org.apache.avro.Schema schema13 = org.apache.avro.Schema.createArray(schema8);
        java.lang.String str14 = schema8.getName();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean16 = schema8.hasEnumSymbol("[]");
            org.junit.Assert.fail("Expected exception of type org.apache.avro.AvroRuntimeException; message: Not an enum: []");
        } catch (org.apache.avro.AvroRuntimeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(schemaArray0);
        org.junit.Assert.assertArrayEquals(schemaArray0, new org.apache.avro.Schema[] {});
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(schema3);
        org.junit.Assert.assertNotNull(schemaArray4);
        org.junit.Assert.assertArrayEquals(schemaArray4, new org.apache.avro.Schema[] {});
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(schema7);
        org.junit.Assert.assertNotNull(schema8);
        org.junit.Assert.assertNotNull(schemaList9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNotNull(schema13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "union" + "'", str14, "union");
    }

    @Test
    public void test0116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SchemaM3Random300Test0.test0116");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.avro.Schema schema4 = org.apache.avro.Schema.createRecord("[ ]", "", "[ ]", false);
            org.junit.Assert.fail("Expected exception of type org.apache.avro.SchemaParseException; message: Illegal initial character: [ ]");
        } catch (org.apache.avro.SchemaParseException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SchemaM3Random300Test0.test0117");
        org.apache.avro.Schema[] schemaArray0 = new org.apache.avro.Schema[] {};
        java.util.ArrayList<org.apache.avro.Schema> schemaList1 = new java.util.ArrayList<org.apache.avro.Schema>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<org.apache.avro.Schema>) schemaList1, schemaArray0);
        org.apache.avro.Schema schema3 = org.apache.avro.Schema.createUnion((java.util.List<org.apache.avro.Schema>) schemaList1);
        org.apache.avro.Schema[] schemaArray4 = new org.apache.avro.Schema[] {};
        java.util.ArrayList<org.apache.avro.Schema> schemaList5 = new java.util.ArrayList<org.apache.avro.Schema>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<org.apache.avro.Schema>) schemaList5, schemaArray4);
        org.apache.avro.Schema schema7 = org.apache.avro.Schema.createUnion((java.util.List<org.apache.avro.Schema>) schemaList5);
        org.apache.avro.Schema schema8 = org.apache.avro.Schema.applyAliases(schema3, schema7);
        java.util.List<org.apache.avro.Schema> schemaList9 = schema8.getTypes();
        org.apache.avro.Schema[] schemaArray10 = new org.apache.avro.Schema[] {};
        java.util.ArrayList<org.apache.avro.Schema> schemaList11 = new java.util.ArrayList<org.apache.avro.Schema>();
        boolean boolean12 = java.util.Collections.addAll((java.util.Collection<org.apache.avro.Schema>) schemaList11, schemaArray10);
        org.apache.avro.Schema schema13 = org.apache.avro.Schema.createUnion((java.util.List<org.apache.avro.Schema>) schemaList11);
        org.apache.avro.Schema[] schemaArray14 = new org.apache.avro.Schema[] {};
        java.util.ArrayList<org.apache.avro.Schema> schemaList15 = new java.util.ArrayList<org.apache.avro.Schema>();
        boolean boolean16 = java.util.Collections.addAll((java.util.Collection<org.apache.avro.Schema>) schemaList15, schemaArray14);
        org.apache.avro.Schema schema17 = org.apache.avro.Schema.createUnion((java.util.List<org.apache.avro.Schema>) schemaList15);
        org.apache.avro.Schema schema18 = org.apache.avro.Schema.applyAliases(schema13, schema17);
        org.apache.avro.Schema schema19 = org.apache.avro.Schema.applyAliases(schema8, schema17);
        org.apache.avro.Schema schema20 = org.apache.avro.Schema.createMap(schema17);
        // The following exception was thrown during execution in test generation
        try {
            int int21 = schema17.getFixedSize();
            org.junit.Assert.fail("Expected exception of type org.apache.avro.AvroRuntimeException; message: Not fixed: []");
        } catch (org.apache.avro.AvroRuntimeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(schemaArray0);
        org.junit.Assert.assertArrayEquals(schemaArray0, new org.apache.avro.Schema[] {});
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(schema3);
        org.junit.Assert.assertNotNull(schemaArray4);
        org.junit.Assert.assertArrayEquals(schemaArray4, new org.apache.avro.Schema[] {});
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(schema7);
        org.junit.Assert.assertNotNull(schema8);
        org.junit.Assert.assertNotNull(schemaList9);
        org.junit.Assert.assertNotNull(schemaArray10);
        org.junit.Assert.assertArrayEquals(schemaArray10, new org.apache.avro.Schema[] {});
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(schema13);
        org.junit.Assert.assertNotNull(schemaArray14);
        org.junit.Assert.assertArrayEquals(schemaArray14, new org.apache.avro.Schema[] {});
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(schema17);
        org.junit.Assert.assertNotNull(schema18);
        org.junit.Assert.assertNotNull(schema19);
        org.junit.Assert.assertNotNull(schema20);
    }

    @Test
    public void test0118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SchemaM3Random300Test0.test0118");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.avro.Schema schema4 = org.apache.avro.Schema.createRecord("union type:MAP pos:-1", "{\r\n  \"type\" : \"map\",\r\n  \"values\" : [ ]\r\n}", "union type:UNION pos:-1", true);
            org.junit.Assert.fail("Expected exception of type org.apache.avro.SchemaParseException; message: Illegal character in: union type:MAP pos:-1");
        } catch (org.apache.avro.SchemaParseException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SchemaM3Random300Test0.test0119");
        org.codehaus.jackson.JsonNode jsonNode1 = org.apache.avro.Schema.parseJson("{}");
        org.apache.avro.Schema.Names names2 = new org.apache.avro.Schema.Names();
        org.apache.avro.Schema[] schemaArray4 = new org.apache.avro.Schema[] {};
        java.util.ArrayList<org.apache.avro.Schema> schemaList5 = new java.util.ArrayList<org.apache.avro.Schema>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<org.apache.avro.Schema>) schemaList5, schemaArray4);
        org.apache.avro.Schema schema7 = org.apache.avro.Schema.createUnion((java.util.List<org.apache.avro.Schema>) schemaList5);
        org.apache.avro.Schema[] schemaArray8 = new org.apache.avro.Schema[] {};
        java.util.ArrayList<org.apache.avro.Schema> schemaList9 = new java.util.ArrayList<org.apache.avro.Schema>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<org.apache.avro.Schema>) schemaList9, schemaArray8);
        org.apache.avro.Schema schema11 = org.apache.avro.Schema.createUnion((java.util.List<org.apache.avro.Schema>) schemaList9);
        org.apache.avro.Schema schema12 = org.apache.avro.Schema.applyAliases(schema7, schema11);
        java.util.List<org.apache.avro.Schema> schemaList13 = schema12.getTypes();
        org.apache.avro.Schema[] schemaArray14 = new org.apache.avro.Schema[] {};
        java.util.ArrayList<org.apache.avro.Schema> schemaList15 = new java.util.ArrayList<org.apache.avro.Schema>();
        boolean boolean16 = java.util.Collections.addAll((java.util.Collection<org.apache.avro.Schema>) schemaList15, schemaArray14);
        org.apache.avro.Schema schema17 = org.apache.avro.Schema.createUnion((java.util.List<org.apache.avro.Schema>) schemaList15);
        org.apache.avro.Schema[] schemaArray18 = new org.apache.avro.Schema[] {};
        java.util.ArrayList<org.apache.avro.Schema> schemaList19 = new java.util.ArrayList<org.apache.avro.Schema>();
        boolean boolean20 = java.util.Collections.addAll((java.util.Collection<org.apache.avro.Schema>) schemaList19, schemaArray18);
        org.apache.avro.Schema schema21 = org.apache.avro.Schema.createUnion((java.util.List<org.apache.avro.Schema>) schemaList19);
        org.apache.avro.Schema schema22 = org.apache.avro.Schema.applyAliases(schema17, schema21);
        org.apache.avro.Schema schema23 = org.apache.avro.Schema.applyAliases(schema12, schema21);
        org.apache.avro.Schema schema24 = names2.getOrDefault((java.lang.Object) 100.0d, schema23);
        org.apache.avro.Schema.Parser parser25 = new org.apache.avro.Schema.Parser();
        org.apache.avro.Schema.Parser parser27 = parser25.setValidate(true);
        java.util.Map<java.lang.String, org.apache.avro.Schema> strMap28 = parser25.getTypes();
        org.apache.avro.Schema.Parser parser30 = parser25.setValidate(true);
        org.apache.avro.Schema.Parser parser32 = parser25.setValidate(true);
        org.apache.avro.Schema[] schemaArray33 = new org.apache.avro.Schema[] {};
        java.util.ArrayList<org.apache.avro.Schema> schemaList34 = new java.util.ArrayList<org.apache.avro.Schema>();
        boolean boolean35 = java.util.Collections.addAll((java.util.Collection<org.apache.avro.Schema>) schemaList34, schemaArray33);
        org.apache.avro.Schema schema36 = org.apache.avro.Schema.createUnion((java.util.List<org.apache.avro.Schema>) schemaList34);
        org.apache.avro.Schema[] schemaArray37 = new org.apache.avro.Schema[] {};
        java.util.ArrayList<org.apache.avro.Schema> schemaList38 = new java.util.ArrayList<org.apache.avro.Schema>();
        boolean boolean39 = java.util.Collections.addAll((java.util.Collection<org.apache.avro.Schema>) schemaList38, schemaArray37);
        org.apache.avro.Schema schema40 = org.apache.avro.Schema.createUnion((java.util.List<org.apache.avro.Schema>) schemaList38);
        org.apache.avro.Schema schema41 = org.apache.avro.Schema.applyAliases(schema36, schema40);
        java.util.List<org.apache.avro.Schema> schemaList42 = schema41.getTypes();
        java.lang.String str44 = schema41.toString(true);
        org.apache.avro.Schema schema45 = names2.getOrDefault((java.lang.Object) true, schema41);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.avro.Schema schema46 = org.apache.avro.Schema.parse(jsonNode1, names2);
            org.junit.Assert.fail("Expected exception of type org.apache.avro.SchemaParseException; message: No type: {}");
        } catch (org.apache.avro.SchemaParseException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(jsonNode1);
        org.junit.Assert.assertNotNull(schemaArray4);
        org.junit.Assert.assertArrayEquals(schemaArray4, new org.apache.avro.Schema[] {});
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(schema7);
        org.junit.Assert.assertNotNull(schemaArray8);
        org.junit.Assert.assertArrayEquals(schemaArray8, new org.apache.avro.Schema[] {});
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(schema11);
        org.junit.Assert.assertNotNull(schema12);
        org.junit.Assert.assertNotNull(schemaList13);
        org.junit.Assert.assertNotNull(schemaArray14);
        org.junit.Assert.assertArrayEquals(schemaArray14, new org.apache.avro.Schema[] {});
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(schema17);
        org.junit.Assert.assertNotNull(schemaArray18);
        org.junit.Assert.assertArrayEquals(schemaArray18, new org.apache.avro.Schema[] {});
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(schema21);
        org.junit.Assert.assertNotNull(schema22);
        org.junit.Assert.assertNotNull(schema23);
        org.junit.Assert.assertNotNull(schema24);
        org.junit.Assert.assertNotNull(parser27);
        org.junit.Assert.assertNotNull(strMap28);
        org.junit.Assert.assertNotNull(parser30);
        org.junit.Assert.assertNotNull(parser32);
        org.junit.Assert.assertNotNull(schemaArray33);
        org.junit.Assert.assertArrayEquals(schemaArray33, new org.apache.avro.Schema[] {});
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertNotNull(schema36);
        org.junit.Assert.assertNotNull(schemaArray37);
        org.junit.Assert.assertArrayEquals(schemaArray37, new org.apache.avro.Schema[] {});
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertNotNull(schema40);
        org.junit.Assert.assertNotNull(schema41);
        org.junit.Assert.assertNotNull(schemaList42);
        org.junit.Assert.assertEquals("'" + str44 + "' != '" + "[ ]" + "'", str44, "[ ]");
        org.junit.Assert.assertNotNull(schema45);
    }

    @Test
    public void test0120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SchemaM3Random300Test0.test0120");
        org.apache.avro.Schema.Parser parser0 = new org.apache.avro.Schema.Parser();
        org.apache.avro.Schema.Parser parser2 = parser0.setValidate(true);
        org.apache.avro.Schema.Parser parser4 = parser0.setValidate(true);
        java.io.InputStream inputStream5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.avro.Schema schema6 = parser0.parse(inputStream5);
            org.junit.Assert.fail("Expected exception of type java.io.EOFException; message: No content to map to Object due to end of input");
        } catch (java.io.EOFException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(parser2);
        org.junit.Assert.assertNotNull(parser4);
    }

    @Test
    public void test0121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SchemaM3Random300Test0.test0121");
        org.apache.avro.Schema.Names names0 = new org.apache.avro.Schema.Names();
        org.apache.avro.Schema[] schemaArray1 = new org.apache.avro.Schema[] {};
        java.util.ArrayList<org.apache.avro.Schema> schemaList2 = new java.util.ArrayList<org.apache.avro.Schema>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<org.apache.avro.Schema>) schemaList2, schemaArray1);
        org.apache.avro.Schema schema4 = org.apache.avro.Schema.createUnion((java.util.List<org.apache.avro.Schema>) schemaList2);
        org.apache.avro.Schema[] schemaArray5 = new org.apache.avro.Schema[] {};
        java.util.ArrayList<org.apache.avro.Schema> schemaList6 = new java.util.ArrayList<org.apache.avro.Schema>();
        boolean boolean7 = java.util.Collections.addAll((java.util.Collection<org.apache.avro.Schema>) schemaList6, schemaArray5);
        org.apache.avro.Schema schema8 = org.apache.avro.Schema.createUnion((java.util.List<org.apache.avro.Schema>) schemaList6);
        org.apache.avro.Schema schema9 = org.apache.avro.Schema.applyAliases(schema4, schema8);
        java.util.List<org.apache.avro.Schema> schemaList10 = schema9.getTypes();
        boolean boolean12 = schema9.equals((java.lang.Object) "hi!");
        java.lang.String str13 = schema9.getDoc();
        org.apache.avro.Schema schema14 = org.apache.avro.Schema.createArray(schema9);
        java.lang.String str15 = schema9.getName();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean16 = names0.contains(schema9);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: org.apache.avro.Schema$UnionSchema cannot be cast to org.apache.avro.Schema$NamedSchema");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(schemaArray1);
        org.junit.Assert.assertArrayEquals(schemaArray1, new org.apache.avro.Schema[] {});
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(schema4);
        org.junit.Assert.assertNotNull(schemaArray5);
        org.junit.Assert.assertArrayEquals(schemaArray5, new org.apache.avro.Schema[] {});
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(schema8);
        org.junit.Assert.assertNotNull(schema9);
        org.junit.Assert.assertNotNull(schemaList10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNotNull(schema14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "union" + "'", str15, "union");
    }

    @Test
    public void test0122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SchemaM3Random300Test0.test0122");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.avro.Schema schema1 = org.apache.avro.Schema.parse("union type:MAP pos:-1");
            org.junit.Assert.fail("Expected exception of type org.apache.avro.SchemaParseException; message: org.codehaus.jackson.JsonParseException: Unexpected character ('u' (code 117)): expected a valid value (number, String, array, object, 'true', 'false' or 'null')? at [Source: java.io.StringReader@2321b340; line: 1, column: 2]");
        } catch (org.apache.avro.SchemaParseException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SchemaM3Random300Test0.test0123");
        org.apache.avro.Schema schema4 = org.apache.avro.Schema.createFixed("union", "[ ]", "[]", 0);
        org.apache.avro.Schema.Type type5 = org.apache.avro.Schema.Type.INT;
        org.apache.avro.Schema schema6 = org.apache.avro.Schema.create(type5);
        org.apache.avro.Schema schema7 = org.apache.avro.Schema.createArray(schema6);
        org.apache.avro.Schema schema8 = org.apache.avro.Schema.applyAliases(schema4, schema7);
        org.apache.avro.Schema.Field[] fieldArray9 = new org.apache.avro.Schema.Field[] {};
        java.util.ArrayList<org.apache.avro.Schema.Field> fieldList10 = new java.util.ArrayList<org.apache.avro.Schema.Field>();
        boolean boolean11 = java.util.Collections.addAll((java.util.Collection<org.apache.avro.Schema.Field>) fieldList10, fieldArray9);
        org.apache.avro.Schema schema12 = org.apache.avro.Schema.createRecord((java.util.List<org.apache.avro.Schema.Field>) fieldList10);
        // The following exception was thrown during execution in test generation
        try {
            schema4.setFields((java.util.List<org.apache.avro.Schema.Field>) fieldList10);
            org.junit.Assert.fail("Expected exception of type org.apache.avro.AvroRuntimeException; message: Not a record: {\"type\":\"fixed\",\"name\":\"union\",\"namespace\":\"[]\",\"doc\":\"[ ]\",\"size\":0}");
        } catch (org.apache.avro.AvroRuntimeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(schema4);
        org.junit.Assert.assertTrue("'" + type5 + "' != '" + org.apache.avro.Schema.Type.INT + "'", type5.equals(org.apache.avro.Schema.Type.INT));
        org.junit.Assert.assertNotNull(schema6);
        org.junit.Assert.assertNotNull(schema7);
        org.junit.Assert.assertNotNull(schema8);
        org.junit.Assert.assertNotNull(fieldArray9);
        org.junit.Assert.assertArrayEquals(fieldArray9, new org.apache.avro.Schema.Field[] {});
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(schema12);
    }

    @Test
    public void test0124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SchemaM3Random300Test0.test0124");
        org.apache.avro.Schema.LockableArrayList<java.util.Collection<java.lang.String>> strCollectionList0 = new org.apache.avro.Schema.LockableArrayList<java.util.Collection<java.lang.String>>();
    }

    @Test
    public void test0125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SchemaM3Random300Test0.test0125");
        org.apache.avro.Schema[] schemaArray0 = new org.apache.avro.Schema[] {};
        java.util.ArrayList<org.apache.avro.Schema> schemaList1 = new java.util.ArrayList<org.apache.avro.Schema>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<org.apache.avro.Schema>) schemaList1, schemaArray0);
        org.apache.avro.Schema schema3 = org.apache.avro.Schema.createUnion((java.util.List<org.apache.avro.Schema>) schemaList1);
        org.apache.avro.Schema[] schemaArray4 = new org.apache.avro.Schema[] {};
        java.util.ArrayList<org.apache.avro.Schema> schemaList5 = new java.util.ArrayList<org.apache.avro.Schema>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<org.apache.avro.Schema>) schemaList5, schemaArray4);
        org.apache.avro.Schema schema7 = org.apache.avro.Schema.createUnion((java.util.List<org.apache.avro.Schema>) schemaList5);
        org.apache.avro.Schema schema8 = org.apache.avro.Schema.applyAliases(schema3, schema7);
        java.util.List<org.apache.avro.Schema> schemaList9 = schema8.getTypes();
        boolean boolean11 = schema8.equals((java.lang.Object) "hi!");
        java.lang.String str12 = schema8.getDoc();
        java.lang.String str14 = schema8.toString(true);
        java.lang.String str16 = schema8.toString(false);
        // The following exception was thrown during execution in test generation
        try {
            int int17 = schema8.getFixedSize();
            org.junit.Assert.fail("Expected exception of type org.apache.avro.AvroRuntimeException; message: Not fixed: []");
        } catch (org.apache.avro.AvroRuntimeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(schemaArray0);
        org.junit.Assert.assertArrayEquals(schemaArray0, new org.apache.avro.Schema[] {});
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(schema3);
        org.junit.Assert.assertNotNull(schemaArray4);
        org.junit.Assert.assertArrayEquals(schemaArray4, new org.apache.avro.Schema[] {});
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(schema7);
        org.junit.Assert.assertNotNull(schema8);
        org.junit.Assert.assertNotNull(schemaList9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "[ ]" + "'", str14, "[ ]");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "[]" + "'", str16, "[]");
    }

    @Test
    public void test0126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SchemaM3Random300Test0.test0126");
        org.apache.avro.Schema.Parser parser0 = new org.apache.avro.Schema.Parser();
        org.apache.avro.Schema.Parser parser2 = parser0.setValidate(true);
        org.apache.avro.Schema.Parser parser4 = parser0.setValidate(true);
        java.io.InputStream inputStream5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.avro.Schema schema6 = parser4.parse(inputStream5);
            org.junit.Assert.fail("Expected exception of type java.io.EOFException; message: No content to map to Object due to end of input");
        } catch (java.io.EOFException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(parser2);
        org.junit.Assert.assertNotNull(parser4);
    }

    @Test
    public void test0127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SchemaM3Random300Test0.test0127");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.avro.Schema schema4 = org.apache.avro.Schema.createRecord("", "[ ]", "", false);
            org.junit.Assert.fail("Expected exception of type org.apache.avro.SchemaParseException; message: Empty name");
        } catch (org.apache.avro.SchemaParseException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SchemaM3Random300Test0.test0128");
        org.apache.avro.Schema[] schemaArray0 = new org.apache.avro.Schema[] {};
        java.util.ArrayList<org.apache.avro.Schema> schemaList1 = new java.util.ArrayList<org.apache.avro.Schema>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<org.apache.avro.Schema>) schemaList1, schemaArray0);
        org.apache.avro.Schema schema3 = org.apache.avro.Schema.createUnion((java.util.List<org.apache.avro.Schema>) schemaList1);
        org.apache.avro.Schema[] schemaArray4 = new org.apache.avro.Schema[] {};
        java.util.ArrayList<org.apache.avro.Schema> schemaList5 = new java.util.ArrayList<org.apache.avro.Schema>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<org.apache.avro.Schema>) schemaList5, schemaArray4);
        org.apache.avro.Schema schema7 = org.apache.avro.Schema.createUnion((java.util.List<org.apache.avro.Schema>) schemaList5);
        org.apache.avro.Schema schema8 = org.apache.avro.Schema.applyAliases(schema3, schema7);
        java.util.List<org.apache.avro.Schema> schemaList9 = schema8.getTypes();
        boolean boolean11 = schema8.equals((java.lang.Object) "hi!");
        org.apache.avro.Schema.Field[] fieldArray12 = new org.apache.avro.Schema.Field[] {};
        java.util.ArrayList<org.apache.avro.Schema.Field> fieldList13 = new java.util.ArrayList<org.apache.avro.Schema.Field>();
        boolean boolean14 = java.util.Collections.addAll((java.util.Collection<org.apache.avro.Schema.Field>) fieldList13, fieldArray12);
        org.apache.avro.Schema schema15 = org.apache.avro.Schema.createRecord((java.util.List<org.apache.avro.Schema.Field>) fieldList13);
        org.apache.avro.Schema schema16 = org.apache.avro.Schema.createRecord((java.util.List<org.apache.avro.Schema.Field>) fieldList13);
        org.apache.avro.Schema schema17 = org.apache.avro.Schema.createRecord((java.util.List<org.apache.avro.Schema.Field>) fieldList13);
        org.apache.avro.Schema schema18 = org.apache.avro.Schema.createRecord((java.util.List<org.apache.avro.Schema.Field>) fieldList13);
        // The following exception was thrown during execution in test generation
        try {
            schema8.setFields((java.util.List<org.apache.avro.Schema.Field>) fieldList13);
            org.junit.Assert.fail("Expected exception of type org.apache.avro.AvroRuntimeException; message: Not a record: []");
        } catch (org.apache.avro.AvroRuntimeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(schemaArray0);
        org.junit.Assert.assertArrayEquals(schemaArray0, new org.apache.avro.Schema[] {});
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(schema3);
        org.junit.Assert.assertNotNull(schemaArray4);
        org.junit.Assert.assertArrayEquals(schemaArray4, new org.apache.avro.Schema[] {});
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(schema7);
        org.junit.Assert.assertNotNull(schema8);
        org.junit.Assert.assertNotNull(schemaList9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(fieldArray12);
        org.junit.Assert.assertArrayEquals(fieldArray12, new org.apache.avro.Schema.Field[] {});
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(schema15);
        org.junit.Assert.assertNotNull(schema16);
        org.junit.Assert.assertNotNull(schema17);
        org.junit.Assert.assertNotNull(schema18);
    }

    @Test
    public void test0129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SchemaM3Random300Test0.test0129");
        org.apache.avro.Schema[] schemaArray0 = new org.apache.avro.Schema[] {};
        java.util.ArrayList<org.apache.avro.Schema> schemaList1 = new java.util.ArrayList<org.apache.avro.Schema>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<org.apache.avro.Schema>) schemaList1, schemaArray0);
        org.apache.avro.Schema schema3 = org.apache.avro.Schema.createUnion((java.util.List<org.apache.avro.Schema>) schemaList1);
        org.apache.avro.Schema[] schemaArray4 = new org.apache.avro.Schema[] {};
        java.util.ArrayList<org.apache.avro.Schema> schemaList5 = new java.util.ArrayList<org.apache.avro.Schema>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<org.apache.avro.Schema>) schemaList5, schemaArray4);
        org.apache.avro.Schema schema7 = org.apache.avro.Schema.createUnion((java.util.List<org.apache.avro.Schema>) schemaList5);
        org.apache.avro.Schema schema8 = org.apache.avro.Schema.applyAliases(schema3, schema7);
        java.util.List<org.apache.avro.Schema> schemaList9 = schema8.getTypes();
        org.apache.avro.Schema[] schemaArray10 = new org.apache.avro.Schema[] {};
        java.util.ArrayList<org.apache.avro.Schema> schemaList11 = new java.util.ArrayList<org.apache.avro.Schema>();
        boolean boolean12 = java.util.Collections.addAll((java.util.Collection<org.apache.avro.Schema>) schemaList11, schemaArray10);
        org.apache.avro.Schema schema13 = org.apache.avro.Schema.createUnion((java.util.List<org.apache.avro.Schema>) schemaList11);
        org.apache.avro.Schema[] schemaArray14 = new org.apache.avro.Schema[] {};
        java.util.ArrayList<org.apache.avro.Schema> schemaList15 = new java.util.ArrayList<org.apache.avro.Schema>();
        boolean boolean16 = java.util.Collections.addAll((java.util.Collection<org.apache.avro.Schema>) schemaList15, schemaArray14);
        org.apache.avro.Schema schema17 = org.apache.avro.Schema.createUnion((java.util.List<org.apache.avro.Schema>) schemaList15);
        org.apache.avro.Schema schema18 = org.apache.avro.Schema.applyAliases(schema13, schema17);
        org.apache.avro.Schema schema19 = org.apache.avro.Schema.applyAliases(schema8, schema17);
        java.util.List<org.apache.avro.Schema> schemaList20 = schema8.getTypes();
        java.lang.String str22 = schema8.toString(false);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean23 = schema8.isError();
            org.junit.Assert.fail("Expected exception of type org.apache.avro.AvroRuntimeException; message: Not a record: []");
        } catch (org.apache.avro.AvroRuntimeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(schemaArray0);
        org.junit.Assert.assertArrayEquals(schemaArray0, new org.apache.avro.Schema[] {});
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(schema3);
        org.junit.Assert.assertNotNull(schemaArray4);
        org.junit.Assert.assertArrayEquals(schemaArray4, new org.apache.avro.Schema[] {});
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(schema7);
        org.junit.Assert.assertNotNull(schema8);
        org.junit.Assert.assertNotNull(schemaList9);
        org.junit.Assert.assertNotNull(schemaArray10);
        org.junit.Assert.assertArrayEquals(schemaArray10, new org.apache.avro.Schema[] {});
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(schema13);
        org.junit.Assert.assertNotNull(schemaArray14);
        org.junit.Assert.assertArrayEquals(schemaArray14, new org.apache.avro.Schema[] {});
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(schema17);
        org.junit.Assert.assertNotNull(schema18);
        org.junit.Assert.assertNotNull(schema19);
        org.junit.Assert.assertNotNull(schemaList20);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "[]" + "'", str22, "[]");
    }

    @Test
    public void test0130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SchemaM3Random300Test0.test0130");
        org.apache.avro.Schema[] schemaArray0 = new org.apache.avro.Schema[] {};
        java.util.ArrayList<org.apache.avro.Schema> schemaList1 = new java.util.ArrayList<org.apache.avro.Schema>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<org.apache.avro.Schema>) schemaList1, schemaArray0);
        org.apache.avro.Schema schema3 = org.apache.avro.Schema.createUnion((java.util.List<org.apache.avro.Schema>) schemaList1);
        org.apache.avro.Schema[] schemaArray4 = new org.apache.avro.Schema[] {};
        java.util.ArrayList<org.apache.avro.Schema> schemaList5 = new java.util.ArrayList<org.apache.avro.Schema>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<org.apache.avro.Schema>) schemaList5, schemaArray4);
        org.apache.avro.Schema schema7 = org.apache.avro.Schema.createUnion((java.util.List<org.apache.avro.Schema>) schemaList5);
        org.apache.avro.Schema schema8 = org.apache.avro.Schema.applyAliases(schema3, schema7);
        org.apache.avro.Schema.Type type9 = schema7.getType();
        org.apache.avro.Schema schema10 = org.apache.avro.Schema.createMap(schema7);
        org.apache.avro.Schema schema11 = schema10.getValueType();
        org.apache.avro.Schema.Field[] fieldArray12 = new org.apache.avro.Schema.Field[] {};
        java.util.ArrayList<org.apache.avro.Schema.Field> fieldList13 = new java.util.ArrayList<org.apache.avro.Schema.Field>();
        boolean boolean14 = java.util.Collections.addAll((java.util.Collection<org.apache.avro.Schema.Field>) fieldList13, fieldArray12);
        org.apache.avro.Schema schema15 = org.apache.avro.Schema.createRecord((java.util.List<org.apache.avro.Schema.Field>) fieldList13);
        org.apache.avro.Schema schema16 = org.apache.avro.Schema.createRecord((java.util.List<org.apache.avro.Schema.Field>) fieldList13);
        // The following exception was thrown during execution in test generation
        try {
            schema11.setFields((java.util.List<org.apache.avro.Schema.Field>) fieldList13);
            org.junit.Assert.fail("Expected exception of type org.apache.avro.AvroRuntimeException; message: Not a record: []");
        } catch (org.apache.avro.AvroRuntimeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(schemaArray0);
        org.junit.Assert.assertArrayEquals(schemaArray0, new org.apache.avro.Schema[] {});
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(schema3);
        org.junit.Assert.assertNotNull(schemaArray4);
        org.junit.Assert.assertArrayEquals(schemaArray4, new org.apache.avro.Schema[] {});
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(schema7);
        org.junit.Assert.assertNotNull(schema8);
        org.junit.Assert.assertTrue("'" + type9 + "' != '" + org.apache.avro.Schema.Type.UNION + "'", type9.equals(org.apache.avro.Schema.Type.UNION));
        org.junit.Assert.assertNotNull(schema10);
        org.junit.Assert.assertNotNull(schema11);
        org.junit.Assert.assertNotNull(fieldArray12);
        org.junit.Assert.assertArrayEquals(fieldArray12, new org.apache.avro.Schema.Field[] {});
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(schema15);
        org.junit.Assert.assertNotNull(schema16);
    }

    @Test
    public void test0131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SchemaM3Random300Test0.test0131");
        org.apache.avro.Schema[] schemaArray0 = new org.apache.avro.Schema[] {};
        java.util.ArrayList<org.apache.avro.Schema> schemaList1 = new java.util.ArrayList<org.apache.avro.Schema>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<org.apache.avro.Schema>) schemaList1, schemaArray0);
        org.apache.avro.Schema schema3 = org.apache.avro.Schema.createUnion((java.util.List<org.apache.avro.Schema>) schemaList1);
        org.apache.avro.Schema[] schemaArray4 = new org.apache.avro.Schema[] {};
        java.util.ArrayList<org.apache.avro.Schema> schemaList5 = new java.util.ArrayList<org.apache.avro.Schema>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<org.apache.avro.Schema>) schemaList5, schemaArray4);
        org.apache.avro.Schema schema7 = org.apache.avro.Schema.createUnion((java.util.List<org.apache.avro.Schema>) schemaList5);
        org.apache.avro.Schema schema8 = org.apache.avro.Schema.applyAliases(schema3, schema7);
        java.util.List<org.apache.avro.Schema> schemaList9 = schema8.getTypes();
        org.apache.avro.Schema[] schemaArray10 = new org.apache.avro.Schema[] {};
        java.util.ArrayList<org.apache.avro.Schema> schemaList11 = new java.util.ArrayList<org.apache.avro.Schema>();
        boolean boolean12 = java.util.Collections.addAll((java.util.Collection<org.apache.avro.Schema>) schemaList11, schemaArray10);
        org.apache.avro.Schema schema13 = org.apache.avro.Schema.createUnion((java.util.List<org.apache.avro.Schema>) schemaList11);
        org.apache.avro.Schema[] schemaArray14 = new org.apache.avro.Schema[] {};
        java.util.ArrayList<org.apache.avro.Schema> schemaList15 = new java.util.ArrayList<org.apache.avro.Schema>();
        boolean boolean16 = java.util.Collections.addAll((java.util.Collection<org.apache.avro.Schema>) schemaList15, schemaArray14);
        org.apache.avro.Schema schema17 = org.apache.avro.Schema.createUnion((java.util.List<org.apache.avro.Schema>) schemaList15);
        org.apache.avro.Schema schema18 = org.apache.avro.Schema.applyAliases(schema13, schema17);
        org.apache.avro.Schema schema19 = org.apache.avro.Schema.applyAliases(schema8, schema17);
        java.util.List<org.apache.avro.Schema> schemaList20 = schema8.getTypes();
        // The following exception was thrown during execution in test generation
        try {
            int int21 = schema8.getFixedSize();
            org.junit.Assert.fail("Expected exception of type org.apache.avro.AvroRuntimeException; message: Not fixed: []");
        } catch (org.apache.avro.AvroRuntimeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(schemaArray0);
        org.junit.Assert.assertArrayEquals(schemaArray0, new org.apache.avro.Schema[] {});
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(schema3);
        org.junit.Assert.assertNotNull(schemaArray4);
        org.junit.Assert.assertArrayEquals(schemaArray4, new org.apache.avro.Schema[] {});
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(schema7);
        org.junit.Assert.assertNotNull(schema8);
        org.junit.Assert.assertNotNull(schemaList9);
        org.junit.Assert.assertNotNull(schemaArray10);
        org.junit.Assert.assertArrayEquals(schemaArray10, new org.apache.avro.Schema[] {});
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(schema13);
        org.junit.Assert.assertNotNull(schemaArray14);
        org.junit.Assert.assertArrayEquals(schemaArray14, new org.apache.avro.Schema[] {});
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(schema17);
        org.junit.Assert.assertNotNull(schema18);
        org.junit.Assert.assertNotNull(schema19);
        org.junit.Assert.assertNotNull(schemaList20);
    }

    @Test
    public void test0132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SchemaM3Random300Test0.test0132");
        org.apache.avro.Schema[] schemaArray0 = new org.apache.avro.Schema[] {};
        java.util.ArrayList<org.apache.avro.Schema> schemaList1 = new java.util.ArrayList<org.apache.avro.Schema>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<org.apache.avro.Schema>) schemaList1, schemaArray0);
        org.apache.avro.Schema schema3 = org.apache.avro.Schema.createUnion((java.util.List<org.apache.avro.Schema>) schemaList1);
        org.apache.avro.Schema[] schemaArray4 = new org.apache.avro.Schema[] {};
        java.util.ArrayList<org.apache.avro.Schema> schemaList5 = new java.util.ArrayList<org.apache.avro.Schema>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<org.apache.avro.Schema>) schemaList5, schemaArray4);
        org.apache.avro.Schema schema7 = org.apache.avro.Schema.createUnion((java.util.List<org.apache.avro.Schema>) schemaList5);
        org.apache.avro.Schema schema8 = org.apache.avro.Schema.applyAliases(schema3, schema7);
        org.apache.avro.Schema.Type type9 = schema7.getType();
        org.apache.avro.Schema.Names names10 = new org.apache.avro.Schema.Names();
        names10.space("[ ]");
        java.lang.Object obj13 = names10.clone();
        org.apache.avro.Schema.Names names14 = new org.apache.avro.Schema.Names();
        names14.space("[ ]");
        org.apache.avro.Schema schema17 = names10.remove((java.lang.Object) names14);
        boolean boolean18 = names14.isEmpty();
        java.lang.String str19 = names14.space();
        java.lang.Object obj20 = null;
        boolean boolean21 = names14.containsKey(obj20);
        org.codehaus.jackson.JsonGenerator jsonGenerator22 = null;
        // The following exception was thrown during execution in test generation
        try {
            schema7.toJson(names14, jsonGenerator22);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(schemaArray0);
        org.junit.Assert.assertArrayEquals(schemaArray0, new org.apache.avro.Schema[] {});
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(schema3);
        org.junit.Assert.assertNotNull(schemaArray4);
        org.junit.Assert.assertArrayEquals(schemaArray4, new org.apache.avro.Schema[] {});
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(schema7);
        org.junit.Assert.assertNotNull(schema8);
        org.junit.Assert.assertTrue("'" + type9 + "' != '" + org.apache.avro.Schema.Type.UNION + "'", type9.equals(org.apache.avro.Schema.Type.UNION));
        org.junit.Assert.assertNotNull(obj13);
        org.junit.Assert.assertEquals(obj13.toString(), "{}");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj13), "{}");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj13), "{}");
        org.junit.Assert.assertNull(schema17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "[ ]" + "'", str19, "[ ]");
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
    }

    @Test
    public void test0133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SchemaM3Random300Test0.test0133");
        org.apache.avro.Schema.Parser parser0 = new org.apache.avro.Schema.Parser();
        java.util.Map<java.lang.String, org.apache.avro.Schema> strMap1 = parser0.getTypes();
        java.util.Map<java.lang.String, org.apache.avro.Schema> strMap2 = parser0.getTypes();
        org.apache.avro.Schema.Parser parser3 = new org.apache.avro.Schema.Parser();
        java.util.Map<java.lang.String, org.apache.avro.Schema> strMap4 = parser3.getTypes();
        org.apache.avro.Schema.Parser parser5 = parser0.addTypes(strMap4);
        org.apache.avro.Schema.Parser parser7 = parser0.setValidate(true);
        java.io.InputStream inputStream8 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.avro.Schema schema9 = parser0.parse(inputStream8);
            org.junit.Assert.fail("Expected exception of type java.io.EOFException; message: No content to map to Object due to end of input");
        } catch (java.io.EOFException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strMap1);
        org.junit.Assert.assertNotNull(strMap2);
        org.junit.Assert.assertNotNull(strMap4);
        org.junit.Assert.assertNotNull(parser5);
        org.junit.Assert.assertNotNull(parser7);
    }

    @Test
    public void test0134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SchemaM3Random300Test0.test0134");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.avro.Schema schema4 = org.apache.avro.Schema.createRecord("{\r\n  \"type\" : \"array\",\r\n  \"items\" : {\r\n    \"type\" : \"map\",\r\n    \"values\" : [ ]\r\n  }\r\n}", "map", "{\r\n  \"type\" : \"array\",\r\n  \"items\" : {\r\n    \"type\" : \"map\",\r\n    \"values\" : [ ]\r\n  }\r\n}", false);
            org.junit.Assert.fail("Expected exception of type org.apache.avro.SchemaParseException; message: Illegal initial character: {??  \"type\" : \"array\",??  \"items\" : {??    \"type\" : \"map\",??    \"values\" : [ ]??  }??}");
        } catch (org.apache.avro.SchemaParseException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SchemaM3Random300Test0.test0135");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.avro.Schema schema4 = org.apache.avro.Schema.createFixed("{\r\n  \"type\" : \"array\",\r\n  \"items\" : {\r\n    \"type\" : \"map\",\r\n    \"values\" : [ ]\r\n  }\r\n}", "union type:MAP pos:-1", "{\r\n  \"type\" : \"array\",\r\n  \"items\" : {\r\n    \"type\" : \"map\",\r\n    \"values\" : [ ]\r\n  }\r\n}", (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type org.apache.avro.SchemaParseException; message: Illegal initial character: {??  \"type\" : \"array\",??  \"items\" : {??    \"type\" : \"map\",??    \"values\" : [ ]??  }??}");
        } catch (org.apache.avro.SchemaParseException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SchemaM3Random300Test0.test0136");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.avro.Schema schema2 = org.apache.avro.Schema.parse("{}", false);
            org.junit.Assert.fail("Expected exception of type org.apache.avro.SchemaParseException; message: No type: {}");
        } catch (org.apache.avro.SchemaParseException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SchemaM3Random300Test0.test0137");
        org.apache.avro.Schema.Field[] fieldArray0 = new org.apache.avro.Schema.Field[] {};
        java.util.ArrayList<org.apache.avro.Schema.Field> fieldList1 = new java.util.ArrayList<org.apache.avro.Schema.Field>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<org.apache.avro.Schema.Field>) fieldList1, fieldArray0);
        org.apache.avro.Schema schema3 = org.apache.avro.Schema.createRecord((java.util.List<org.apache.avro.Schema.Field>) fieldList1);
        org.apache.avro.Schema.Field field5 = schema3.getField("");
        // The following exception was thrown during execution in test generation
        try {
            int int7 = schema3.getEnumOrdinal("{\r\n  \"type\" : \"array\",\r\n  \"items\" : {\r\n    \"type\" : \"map\",\r\n    \"values\" : [ ]\r\n  }\r\n}");
            org.junit.Assert.fail("Expected exception of type org.apache.avro.AvroRuntimeException; message: Not an enum: {\"type\":\"record\",\"fields\":[]}");
        } catch (org.apache.avro.AvroRuntimeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(fieldArray0);
        org.junit.Assert.assertArrayEquals(fieldArray0, new org.apache.avro.Schema.Field[] {});
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(schema3);
        org.junit.Assert.assertNull(field5);
    }

    @Test
    public void test0138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SchemaM3Random300Test0.test0138");
        java.lang.String[] strArray4 = new java.lang.String[] { "" };
        java.util.ArrayList<java.lang.String> strList5 = new java.util.ArrayList<java.lang.String>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList5, strArray4);
        org.apache.avro.Schema.LockableArrayList<java.lang.String> strList7 = new org.apache.avro.Schema.LockableArrayList<java.lang.String>((java.util.List<java.lang.String>) strList5);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.avro.Schema schema8 = org.apache.avro.Schema.createEnum("[].union", "union type:MAP pos:-1", "union type:UNION pos:-1", (java.util.List<java.lang.String>) strList7);
            org.junit.Assert.fail("Expected exception of type org.apache.avro.SchemaParseException; message: Empty name");
        } catch (org.apache.avro.SchemaParseException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertArrayEquals(strArray4, new java.lang.String[] { "" });
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test0139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SchemaM3Random300Test0.test0139");
        org.apache.avro.Schema.Parser parser0 = new org.apache.avro.Schema.Parser();
        org.apache.avro.Schema.Parser parser2 = parser0.setValidate(true);
        java.io.File file3 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.avro.Schema schema4 = parser2.parse(file3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(parser2);
    }

    @Test
    public void test0140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SchemaM3Random300Test0.test0140");
        org.apache.avro.Schema.Type type0 = org.apache.avro.Schema.Type.STRING;
        java.lang.Class<?> wildcardClass1 = type0.getClass();
        org.junit.Assert.assertTrue("'" + type0 + "' != '" + org.apache.avro.Schema.Type.STRING + "'", type0.equals(org.apache.avro.Schema.Type.STRING));
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test0141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SchemaM3Random300Test0.test0141");
        org.apache.avro.Schema.Type type0 = org.apache.avro.Schema.Type.NULL;
        org.apache.avro.Schema schema1 = org.apache.avro.Schema.create(type0);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.avro.Schema schema2 = schema1.getValueType();
            org.junit.Assert.fail("Expected exception of type org.apache.avro.AvroRuntimeException; message: Not a map: \"null\"");
        } catch (org.apache.avro.AvroRuntimeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + type0 + "' != '" + org.apache.avro.Schema.Type.NULL + "'", type0.equals(org.apache.avro.Schema.Type.NULL));
        org.junit.Assert.assertNotNull(schema1);
    }

    @Test
    public void test0142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SchemaM3Random300Test0.test0142");
        org.apache.avro.Schema.LockableArrayList<java.lang.String> strList3 = new org.apache.avro.Schema.LockableArrayList<java.lang.String>();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.avro.Schema schema4 = org.apache.avro.Schema.createEnum("union type:UNION pos:-1", "[ ]", "union type:UNION pos:-1", (java.util.List<java.lang.String>) strList3);
            org.junit.Assert.fail("Expected exception of type org.apache.avro.SchemaParseException; message: Illegal character in: union type:UNION pos:-1");
        } catch (org.apache.avro.SchemaParseException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SchemaM3Random300Test0.test0143");
        org.apache.avro.Schema.Field[] fieldArray0 = new org.apache.avro.Schema.Field[] {};
        java.util.ArrayList<org.apache.avro.Schema.Field> fieldList1 = new java.util.ArrayList<org.apache.avro.Schema.Field>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<org.apache.avro.Schema.Field>) fieldList1, fieldArray0);
        org.apache.avro.Schema schema3 = org.apache.avro.Schema.createRecord((java.util.List<org.apache.avro.Schema.Field>) fieldList1);
        org.apache.avro.Schema.Field field5 = schema3.getField("");
        org.apache.avro.Schema schema6 = org.apache.avro.Schema.createMap(schema3);
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<org.apache.avro.Schema.Field> fieldList7 = schema6.getFields();
            org.junit.Assert.fail("Expected exception of type org.apache.avro.AvroRuntimeException; message: Not a record: {\"type\":\"map\",\"values\":{\"type\":\"record\",\"fields\":[]}}");
        } catch (org.apache.avro.AvroRuntimeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(fieldArray0);
        org.junit.Assert.assertArrayEquals(fieldArray0, new org.apache.avro.Schema.Field[] {});
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(schema3);
        org.junit.Assert.assertNull(field5);
        org.junit.Assert.assertNotNull(schema6);
    }

    @Test
    public void test0144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SchemaM3Random300Test0.test0144");
        org.apache.avro.Schema.Names names1 = new org.apache.avro.Schema.Names("{}");
        int int2 = names1.size();
        org.apache.avro.Schema[] schemaArray3 = new org.apache.avro.Schema[] {};
        java.util.ArrayList<org.apache.avro.Schema> schemaList4 = new java.util.ArrayList<org.apache.avro.Schema>();
        boolean boolean5 = java.util.Collections.addAll((java.util.Collection<org.apache.avro.Schema>) schemaList4, schemaArray3);
        org.apache.avro.Schema schema6 = org.apache.avro.Schema.createUnion((java.util.List<org.apache.avro.Schema>) schemaList4);
        org.apache.avro.Schema[] schemaArray7 = new org.apache.avro.Schema[] {};
        java.util.ArrayList<org.apache.avro.Schema> schemaList8 = new java.util.ArrayList<org.apache.avro.Schema>();
        boolean boolean9 = java.util.Collections.addAll((java.util.Collection<org.apache.avro.Schema>) schemaList8, schemaArray7);
        org.apache.avro.Schema schema10 = org.apache.avro.Schema.createUnion((java.util.List<org.apache.avro.Schema>) schemaList8);
        org.apache.avro.Schema schema11 = org.apache.avro.Schema.applyAliases(schema6, schema10);
        java.util.List<org.apache.avro.Schema> schemaList12 = schema11.getTypes();
        boolean boolean14 = schema11.equals((java.lang.Object) "hi!");
        java.lang.String str15 = schema11.getDoc();
        org.apache.avro.Schema schema16 = org.apache.avro.Schema.createArray(schema11);
        java.lang.String str17 = schema11.getFullName();
        org.apache.avro.Schema schema18 = org.apache.avro.Schema.createMap(schema11);
        // The following exception was thrown during execution in test generation
        try {
            names1.add(schema18);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: org.apache.avro.Schema$MapSchema cannot be cast to org.apache.avro.Schema$NamedSchema");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(schemaArray3);
        org.junit.Assert.assertArrayEquals(schemaArray3, new org.apache.avro.Schema[] {});
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(schema6);
        org.junit.Assert.assertNotNull(schemaArray7);
        org.junit.Assert.assertArrayEquals(schemaArray7, new org.apache.avro.Schema[] {});
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(schema10);
        org.junit.Assert.assertNotNull(schema11);
        org.junit.Assert.assertNotNull(schemaList12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNotNull(schema16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "union" + "'", str17, "union");
        org.junit.Assert.assertNotNull(schema18);
    }

    @Test
    public void test0145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SchemaM3Random300Test0.test0145");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.avro.Schema schema4 = org.apache.avro.Schema.createFixed("{}", "{\r\n  \"type\" : \"array\",\r\n  \"items\" : {\r\n    \"type\" : \"map\",\r\n    \"values\" : [ ]\r\n  }\r\n}", "[ ]", (int) '4');
            org.junit.Assert.fail("Expected exception of type org.apache.avro.SchemaParseException; message: Illegal initial character: {}");
        } catch (org.apache.avro.SchemaParseException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SchemaM3Random300Test0.test0146");
        org.apache.avro.Schema schema4 = org.apache.avro.Schema.createFixed("union", "[ ]", "[]", 0);
        org.apache.avro.Schema.Type type5 = org.apache.avro.Schema.Type.INT;
        org.apache.avro.Schema schema6 = org.apache.avro.Schema.create(type5);
        org.apache.avro.Schema schema7 = org.apache.avro.Schema.createArray(schema6);
        org.apache.avro.Schema schema8 = org.apache.avro.Schema.applyAliases(schema4, schema7);
        java.util.Set<java.lang.String> strSet9 = schema8.getAliases();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.avro.Schema schema10 = schema8.getElementType();
            org.junit.Assert.fail("Expected exception of type org.apache.avro.AvroRuntimeException; message: Not an array: {\"type\":\"fixed\",\"name\":\"union\",\"namespace\":\"[]\",\"doc\":\"[ ]\",\"size\":0}");
        } catch (org.apache.avro.AvroRuntimeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(schema4);
        org.junit.Assert.assertTrue("'" + type5 + "' != '" + org.apache.avro.Schema.Type.INT + "'", type5.equals(org.apache.avro.Schema.Type.INT));
        org.junit.Assert.assertNotNull(schema6);
        org.junit.Assert.assertNotNull(schema7);
        org.junit.Assert.assertNotNull(schema8);
        org.junit.Assert.assertNotNull(strSet9);
    }

    @Test
    public void test0147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SchemaM3Random300Test0.test0147");
        org.apache.avro.Schema.LockableArrayList<java.lang.String> strList4 = new org.apache.avro.Schema.LockableArrayList<java.lang.String>(0);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.avro.Schema schema5 = org.apache.avro.Schema.createEnum("union type:MAP pos:-1", "union", "{\"type\":\"map\",\"values\":[]}", (java.util.List<java.lang.String>) strList4);
            org.junit.Assert.fail("Expected exception of type org.apache.avro.SchemaParseException; message: Illegal character in: union type:MAP pos:-1");
        } catch (org.apache.avro.SchemaParseException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SchemaM3Random300Test0.test0148");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.avro.Schema schema1 = org.apache.avro.Schema.parse("{}");
            org.junit.Assert.fail("Expected exception of type org.apache.avro.SchemaParseException; message: No type: {}");
        } catch (org.apache.avro.SchemaParseException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SchemaM3Random300Test0.test0149");
        org.apache.avro.Schema.Names names0 = new org.apache.avro.Schema.Names();
        names0.space("[ ]");
        names0.space("");
    }

    @Test
    public void test0150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SchemaM3Random300Test0.test0150");
        org.apache.avro.Schema schema4 = org.apache.avro.Schema.createRecord("[].union", "union", "union type:MAP pos:-1", false);
        org.junit.Assert.assertNotNull(schema4);
    }

    @Test
    public void test0151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SchemaM3Random300Test0.test0151");
        org.apache.avro.Schema.Type type0 = org.apache.avro.Schema.Type.INT;
        org.apache.avro.Schema schema1 = org.apache.avro.Schema.create(type0);
        org.apache.avro.Schema schema2 = org.apache.avro.Schema.create(type0);
        org.apache.avro.Schema.Field[] fieldArray3 = new org.apache.avro.Schema.Field[] {};
        java.util.ArrayList<org.apache.avro.Schema.Field> fieldList4 = new java.util.ArrayList<org.apache.avro.Schema.Field>();
        boolean boolean5 = java.util.Collections.addAll((java.util.Collection<org.apache.avro.Schema.Field>) fieldList4, fieldArray3);
        org.apache.avro.Schema schema6 = org.apache.avro.Schema.createRecord((java.util.List<org.apache.avro.Schema.Field>) fieldList4);
        org.apache.avro.Schema schema7 = org.apache.avro.Schema.createRecord((java.util.List<org.apache.avro.Schema.Field>) fieldList4);
        org.apache.avro.Schema schema8 = org.apache.avro.Schema.createRecord((java.util.List<org.apache.avro.Schema.Field>) fieldList4);
        // The following exception was thrown during execution in test generation
        try {
            schema2.setFields((java.util.List<org.apache.avro.Schema.Field>) fieldList4);
            org.junit.Assert.fail("Expected exception of type org.apache.avro.AvroRuntimeException; message: Not a record: \"int\"");
        } catch (org.apache.avro.AvroRuntimeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + type0 + "' != '" + org.apache.avro.Schema.Type.INT + "'", type0.equals(org.apache.avro.Schema.Type.INT));
        org.junit.Assert.assertNotNull(schema1);
        org.junit.Assert.assertNotNull(schema2);
        org.junit.Assert.assertNotNull(fieldArray3);
        org.junit.Assert.assertArrayEquals(fieldArray3, new org.apache.avro.Schema.Field[] {});
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(schema6);
        org.junit.Assert.assertNotNull(schema7);
        org.junit.Assert.assertNotNull(schema8);
    }

    @Test
    public void test0152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SchemaM3Random300Test0.test0152");
        org.apache.avro.Schema.Parser parser0 = new org.apache.avro.Schema.Parser();
        org.apache.avro.Schema.Parser parser2 = parser0.setValidate(true);
        java.util.Map<java.lang.String, org.apache.avro.Schema> strMap3 = parser0.getTypes();
        java.io.File file4 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.avro.Schema schema5 = parser0.parse(file4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(parser2);
        org.junit.Assert.assertNotNull(strMap3);
    }

    @Test
    public void test0153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SchemaM3Random300Test0.test0153");
        // The following exception was thrown during execution in test generation
        try {
            org.codehaus.jackson.JsonNode jsonNode1 = org.apache.avro.Schema.parseJson("map");
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: org.codehaus.jackson.JsonParseException: Unexpected character ('m' (code 109)): expected a valid value (number, String, array, object, 'true', 'false' or 'null')? at [Source: java.io.StringReader@c1bcef7; line: 1, column: 2]");
        } catch (java.lang.RuntimeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SchemaM3Random300Test0.test0154");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.avro.Schema schema4 = org.apache.avro.Schema.createRecord("[]", "", "union type:MAP pos:-1", false);
            org.junit.Assert.fail("Expected exception of type org.apache.avro.SchemaParseException; message: Illegal initial character: []");
        } catch (org.apache.avro.SchemaParseException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SchemaM3Random300Test0.test0155");
        org.apache.avro.Schema.LockableArrayList<java.lang.String> strList3 = new org.apache.avro.Schema.LockableArrayList<java.lang.String>();
        org.apache.avro.Schema.LockableArrayList<java.lang.String> strList4 = new org.apache.avro.Schema.LockableArrayList<java.lang.String>((java.util.List<java.lang.String>) strList3);
        org.apache.avro.Schema schema5 = org.apache.avro.Schema.createEnum("[].union", "{}", "[].union", (java.util.List<java.lang.String>) strList4);
        org.apache.avro.Schema schema6 = org.apache.avro.Schema.createMap(schema5);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.avro.Schema schema7 = schema6.getElementType();
            org.junit.Assert.fail("Expected exception of type org.apache.avro.AvroRuntimeException; message: Not an array: {\"type\":\"map\",\"values\":{\"type\":\"enum\",\"name\":\"union\",\"namespace\":\"[]\",\"doc\":\"{}\",\"symbols\":[]}}");
        } catch (org.apache.avro.AvroRuntimeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(schema5);
        org.junit.Assert.assertNotNull(schema6);
    }

    @Test
    public void test0156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SchemaM3Random300Test0.test0156");
        org.apache.avro.Schema.LockableArrayList<org.codehaus.jackson.ObjectCodec> objectCodecList0 = new org.apache.avro.Schema.LockableArrayList<org.codehaus.jackson.ObjectCodec>();
    }

    @Test
    public void test0157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SchemaM3Random300Test0.test0157");
        org.apache.avro.Schema[] schemaArray0 = new org.apache.avro.Schema[] {};
        java.util.ArrayList<org.apache.avro.Schema> schemaList1 = new java.util.ArrayList<org.apache.avro.Schema>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<org.apache.avro.Schema>) schemaList1, schemaArray0);
        org.apache.avro.Schema schema3 = org.apache.avro.Schema.createUnion((java.util.List<org.apache.avro.Schema>) schemaList1);
        org.apache.avro.Schema[] schemaArray4 = new org.apache.avro.Schema[] {};
        java.util.ArrayList<org.apache.avro.Schema> schemaList5 = new java.util.ArrayList<org.apache.avro.Schema>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<org.apache.avro.Schema>) schemaList5, schemaArray4);
        org.apache.avro.Schema schema7 = org.apache.avro.Schema.createUnion((java.util.List<org.apache.avro.Schema>) schemaList5);
        org.apache.avro.Schema schema8 = org.apache.avro.Schema.applyAliases(schema3, schema7);
        java.util.List<org.apache.avro.Schema> schemaList9 = schema8.getTypes();
        org.apache.avro.Schema[] schemaArray10 = new org.apache.avro.Schema[] {};
        java.util.ArrayList<org.apache.avro.Schema> schemaList11 = new java.util.ArrayList<org.apache.avro.Schema>();
        boolean boolean12 = java.util.Collections.addAll((java.util.Collection<org.apache.avro.Schema>) schemaList11, schemaArray10);
        org.apache.avro.Schema schema13 = org.apache.avro.Schema.createUnion((java.util.List<org.apache.avro.Schema>) schemaList11);
        org.apache.avro.Schema[] schemaArray14 = new org.apache.avro.Schema[] {};
        java.util.ArrayList<org.apache.avro.Schema> schemaList15 = new java.util.ArrayList<org.apache.avro.Schema>();
        boolean boolean16 = java.util.Collections.addAll((java.util.Collection<org.apache.avro.Schema>) schemaList15, schemaArray14);
        org.apache.avro.Schema schema17 = org.apache.avro.Schema.createUnion((java.util.List<org.apache.avro.Schema>) schemaList15);
        org.apache.avro.Schema schema18 = org.apache.avro.Schema.applyAliases(schema13, schema17);
        org.apache.avro.Schema schema19 = org.apache.avro.Schema.applyAliases(schema8, schema17);
        org.apache.avro.Schema schema20 = org.apache.avro.Schema.createMap(schema8);
        // The following exception was thrown during execution in test generation
        try {
            schema20.addAlias("");
            org.junit.Assert.fail("Expected exception of type org.apache.avro.AvroRuntimeException; message: Not a named type: {\"type\":\"map\",\"values\":[]}");
        } catch (org.apache.avro.AvroRuntimeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(schemaArray0);
        org.junit.Assert.assertArrayEquals(schemaArray0, new org.apache.avro.Schema[] {});
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(schema3);
        org.junit.Assert.assertNotNull(schemaArray4);
        org.junit.Assert.assertArrayEquals(schemaArray4, new org.apache.avro.Schema[] {});
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(schema7);
        org.junit.Assert.assertNotNull(schema8);
        org.junit.Assert.assertNotNull(schemaList9);
        org.junit.Assert.assertNotNull(schemaArray10);
        org.junit.Assert.assertArrayEquals(schemaArray10, new org.apache.avro.Schema[] {});
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(schema13);
        org.junit.Assert.assertNotNull(schemaArray14);
        org.junit.Assert.assertArrayEquals(schemaArray14, new org.apache.avro.Schema[] {});
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(schema17);
        org.junit.Assert.assertNotNull(schema18);
        org.junit.Assert.assertNotNull(schema19);
        org.junit.Assert.assertNotNull(schema20);
    }

    @Test
    public void test0158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SchemaM3Random300Test0.test0158");
        org.apache.avro.Schema.Field[] fieldArray0 = new org.apache.avro.Schema.Field[] {};
        java.util.ArrayList<org.apache.avro.Schema.Field> fieldList1 = new java.util.ArrayList<org.apache.avro.Schema.Field>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<org.apache.avro.Schema.Field>) fieldList1, fieldArray0);
        org.apache.avro.Schema schema3 = org.apache.avro.Schema.createRecord((java.util.List<org.apache.avro.Schema.Field>) fieldList1);
        org.apache.avro.Schema.Field field5 = schema3.getField("");
        org.apache.avro.Schema schema6 = org.apache.avro.Schema.createMap(schema3);
        org.apache.avro.Schema.Type type7 = schema3.getType();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean9 = schema3.hasEnumSymbol("union type:UNION pos:-1");
            org.junit.Assert.fail("Expected exception of type org.apache.avro.AvroRuntimeException; message: Not an enum: {\"type\":\"record\",\"fields\":[]}");
        } catch (org.apache.avro.AvroRuntimeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(fieldArray0);
        org.junit.Assert.assertArrayEquals(fieldArray0, new org.apache.avro.Schema.Field[] {});
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(schema3);
        org.junit.Assert.assertNull(field5);
        org.junit.Assert.assertNotNull(schema6);
        org.junit.Assert.assertTrue("'" + type7 + "' != '" + org.apache.avro.Schema.Type.RECORD + "'", type7.equals(org.apache.avro.Schema.Type.RECORD));
    }

    @Test
    public void test0159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SchemaM3Random300Test0.test0159");
        org.apache.avro.Schema[] schemaArray0 = new org.apache.avro.Schema[] {};
        java.util.ArrayList<org.apache.avro.Schema> schemaList1 = new java.util.ArrayList<org.apache.avro.Schema>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<org.apache.avro.Schema>) schemaList1, schemaArray0);
        org.apache.avro.Schema schema3 = org.apache.avro.Schema.createUnion((java.util.List<org.apache.avro.Schema>) schemaList1);
        org.apache.avro.Schema[] schemaArray4 = new org.apache.avro.Schema[] {};
        java.util.ArrayList<org.apache.avro.Schema> schemaList5 = new java.util.ArrayList<org.apache.avro.Schema>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<org.apache.avro.Schema>) schemaList5, schemaArray4);
        org.apache.avro.Schema schema7 = org.apache.avro.Schema.createUnion((java.util.List<org.apache.avro.Schema>) schemaList5);
        org.apache.avro.Schema schema8 = org.apache.avro.Schema.applyAliases(schema3, schema7);
        java.util.List<org.apache.avro.Schema> schemaList9 = schema8.getTypes();
        org.apache.avro.Schema schema10 = org.apache.avro.Schema.createUnion(schemaList9);
        org.apache.avro.Schema schema11 = org.apache.avro.Schema.createUnion(schemaList9);
        org.apache.avro.Schema schema12 = org.apache.avro.Schema.createUnion(schemaList9);
        org.junit.Assert.assertNotNull(schemaArray0);
        org.junit.Assert.assertArrayEquals(schemaArray0, new org.apache.avro.Schema[] {});
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(schema3);
        org.junit.Assert.assertNotNull(schemaArray4);
        org.junit.Assert.assertArrayEquals(schemaArray4, new org.apache.avro.Schema[] {});
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(schema7);
        org.junit.Assert.assertNotNull(schema8);
        org.junit.Assert.assertNotNull(schemaList9);
        org.junit.Assert.assertNotNull(schema10);
        org.junit.Assert.assertNotNull(schema11);
        org.junit.Assert.assertNotNull(schema12);
    }

    @Test
    public void test0160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SchemaM3Random300Test0.test0160");
        org.apache.avro.Schema[] schemaArray0 = new org.apache.avro.Schema[] {};
        java.util.ArrayList<org.apache.avro.Schema> schemaList1 = new java.util.ArrayList<org.apache.avro.Schema>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<org.apache.avro.Schema>) schemaList1, schemaArray0);
        org.apache.avro.Schema schema3 = org.apache.avro.Schema.createUnion((java.util.List<org.apache.avro.Schema>) schemaList1);
        org.apache.avro.Schema[] schemaArray4 = new org.apache.avro.Schema[] {};
        java.util.ArrayList<org.apache.avro.Schema> schemaList5 = new java.util.ArrayList<org.apache.avro.Schema>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<org.apache.avro.Schema>) schemaList5, schemaArray4);
        org.apache.avro.Schema schema7 = org.apache.avro.Schema.createUnion((java.util.List<org.apache.avro.Schema>) schemaList5);
        org.apache.avro.Schema schema8 = org.apache.avro.Schema.applyAliases(schema3, schema7);
        java.util.List<org.apache.avro.Schema> schemaList9 = schema8.getTypes();
        boolean boolean11 = schema8.equals((java.lang.Object) "hi!");
        java.lang.String str12 = schema8.getDoc();
        org.apache.avro.Schema schema13 = org.apache.avro.Schema.createArray(schema8);
        java.lang.String str14 = schema8.toString();
        org.apache.avro.Schema schema15 = org.apache.avro.Schema.createArray(schema8);
        org.apache.avro.Schema schema16 = org.apache.avro.Schema.createArray(schema8);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str17 = schema8.getNamespace();
            org.junit.Assert.fail("Expected exception of type org.apache.avro.AvroRuntimeException; message: Not a named type: []");
        } catch (org.apache.avro.AvroRuntimeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(schemaArray0);
        org.junit.Assert.assertArrayEquals(schemaArray0, new org.apache.avro.Schema[] {});
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(schema3);
        org.junit.Assert.assertNotNull(schemaArray4);
        org.junit.Assert.assertArrayEquals(schemaArray4, new org.apache.avro.Schema[] {});
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(schema7);
        org.junit.Assert.assertNotNull(schema8);
        org.junit.Assert.assertNotNull(schemaList9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNotNull(schema13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "[]" + "'", str14, "[]");
        org.junit.Assert.assertNotNull(schema15);
        org.junit.Assert.assertNotNull(schema16);
    }

    @Test
    public void test0161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SchemaM3Random300Test0.test0161");
        org.codehaus.jackson.JsonNode jsonNode1 = org.apache.avro.Schema.parseJson("{\r\n  \"type\" : \"map\",\r\n  \"values\" : [ ]\r\n}");
        org.junit.Assert.assertNotNull(jsonNode1);
    }

    @Test
    public void test0162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SchemaM3Random300Test0.test0162");
        org.apache.avro.Schema schema4 = org.apache.avro.Schema.createFixed("union", "hi!", "{}", (int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<org.apache.avro.Schema.Field> fieldList5 = schema4.getFields();
            org.junit.Assert.fail("Expected exception of type org.apache.avro.AvroRuntimeException; message: Not a record: {\"type\":\"fixed\",\"name\":\"union\",\"namespace\":\"{}\",\"doc\":\"hi!\",\"size\":1}");
        } catch (org.apache.avro.AvroRuntimeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(schema4);
    }

    @Test
    public void test0163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SchemaM3Random300Test0.test0163");
        org.apache.avro.Schema[] schemaArray0 = new org.apache.avro.Schema[] {};
        java.util.ArrayList<org.apache.avro.Schema> schemaList1 = new java.util.ArrayList<org.apache.avro.Schema>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<org.apache.avro.Schema>) schemaList1, schemaArray0);
        org.apache.avro.Schema schema3 = org.apache.avro.Schema.createUnion((java.util.List<org.apache.avro.Schema>) schemaList1);
        org.apache.avro.Schema[] schemaArray4 = new org.apache.avro.Schema[] {};
        java.util.ArrayList<org.apache.avro.Schema> schemaList5 = new java.util.ArrayList<org.apache.avro.Schema>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<org.apache.avro.Schema>) schemaList5, schemaArray4);
        org.apache.avro.Schema schema7 = org.apache.avro.Schema.createUnion((java.util.List<org.apache.avro.Schema>) schemaList5);
        org.apache.avro.Schema schema8 = org.apache.avro.Schema.applyAliases(schema3, schema7);
        org.apache.avro.Schema.Type type9 = schema7.getType();
        org.apache.avro.Schema schema10 = org.apache.avro.Schema.createMap(schema7);
        org.apache.avro.Schema schema11 = org.apache.avro.Schema.createArray(schema10);
        org.apache.avro.Schema schema12 = org.apache.avro.Schema.createArray(schema10);
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<org.apache.avro.Schema> schemaList13 = schema12.getTypes();
            org.junit.Assert.fail("Expected exception of type org.apache.avro.AvroRuntimeException; message: Not a union: {\"type\":\"array\",\"items\":{\"type\":\"map\",\"values\":[]}}");
        } catch (org.apache.avro.AvroRuntimeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(schemaArray0);
        org.junit.Assert.assertArrayEquals(schemaArray0, new org.apache.avro.Schema[] {});
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(schema3);
        org.junit.Assert.assertNotNull(schemaArray4);
        org.junit.Assert.assertArrayEquals(schemaArray4, new org.apache.avro.Schema[] {});
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(schema7);
        org.junit.Assert.assertNotNull(schema8);
        org.junit.Assert.assertTrue("'" + type9 + "' != '" + org.apache.avro.Schema.Type.UNION + "'", type9.equals(org.apache.avro.Schema.Type.UNION));
        org.junit.Assert.assertNotNull(schema10);
        org.junit.Assert.assertNotNull(schema11);
        org.junit.Assert.assertNotNull(schema12);
    }

    @Test
    public void test0164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SchemaM3Random300Test0.test0164");
        org.apache.avro.Schema[] schemaArray0 = new org.apache.avro.Schema[] {};
        java.util.ArrayList<org.apache.avro.Schema> schemaList1 = new java.util.ArrayList<org.apache.avro.Schema>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<org.apache.avro.Schema>) schemaList1, schemaArray0);
        org.apache.avro.Schema schema3 = org.apache.avro.Schema.createUnion((java.util.List<org.apache.avro.Schema>) schemaList1);
        org.apache.avro.Schema[] schemaArray4 = new org.apache.avro.Schema[] {};
        java.util.ArrayList<org.apache.avro.Schema> schemaList5 = new java.util.ArrayList<org.apache.avro.Schema>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<org.apache.avro.Schema>) schemaList5, schemaArray4);
        org.apache.avro.Schema schema7 = org.apache.avro.Schema.createUnion((java.util.List<org.apache.avro.Schema>) schemaList5);
        org.apache.avro.Schema schema8 = org.apache.avro.Schema.applyAliases(schema3, schema7);
        java.util.List<org.apache.avro.Schema> schemaList9 = schema8.getTypes();
        org.apache.avro.Schema[] schemaArray10 = new org.apache.avro.Schema[] {};
        java.util.ArrayList<org.apache.avro.Schema> schemaList11 = new java.util.ArrayList<org.apache.avro.Schema>();
        boolean boolean12 = java.util.Collections.addAll((java.util.Collection<org.apache.avro.Schema>) schemaList11, schemaArray10);
        org.apache.avro.Schema schema13 = org.apache.avro.Schema.createUnion((java.util.List<org.apache.avro.Schema>) schemaList11);
        org.apache.avro.Schema[] schemaArray14 = new org.apache.avro.Schema[] {};
        java.util.ArrayList<org.apache.avro.Schema> schemaList15 = new java.util.ArrayList<org.apache.avro.Schema>();
        boolean boolean16 = java.util.Collections.addAll((java.util.Collection<org.apache.avro.Schema>) schemaList15, schemaArray14);
        org.apache.avro.Schema schema17 = org.apache.avro.Schema.createUnion((java.util.List<org.apache.avro.Schema>) schemaList15);
        org.apache.avro.Schema schema18 = org.apache.avro.Schema.applyAliases(schema13, schema17);
        org.apache.avro.Schema schema19 = org.apache.avro.Schema.applyAliases(schema8, schema17);
        org.apache.avro.Schema schema20 = org.apache.avro.Schema.createMap(schema8);
        java.lang.String str21 = schema8.getName();
        java.lang.String str23 = schema8.toString(false);
        // The following exception was thrown during execution in test generation
        try {
            schema8.addProp("{\r\n  \"type\" : \"map\",\r\n  \"values\" : [ ]\r\n}", "hi!");
            org.junit.Assert.fail("Expected exception of type org.apache.avro.AvroRuntimeException; message: Can't set properties on a union: []");
        } catch (org.apache.avro.AvroRuntimeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(schemaArray0);
        org.junit.Assert.assertArrayEquals(schemaArray0, new org.apache.avro.Schema[] {});
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(schema3);
        org.junit.Assert.assertNotNull(schemaArray4);
        org.junit.Assert.assertArrayEquals(schemaArray4, new org.apache.avro.Schema[] {});
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(schema7);
        org.junit.Assert.assertNotNull(schema8);
        org.junit.Assert.assertNotNull(schemaList9);
        org.junit.Assert.assertNotNull(schemaArray10);
        org.junit.Assert.assertArrayEquals(schemaArray10, new org.apache.avro.Schema[] {});
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(schema13);
        org.junit.Assert.assertNotNull(schemaArray14);
        org.junit.Assert.assertArrayEquals(schemaArray14, new org.apache.avro.Schema[] {});
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(schema17);
        org.junit.Assert.assertNotNull(schema18);
        org.junit.Assert.assertNotNull(schema19);
        org.junit.Assert.assertNotNull(schema20);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "union" + "'", str21, "union");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "[]" + "'", str23, "[]");
    }

    @Test
    public void test0165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SchemaM3Random300Test0.test0165");
        org.apache.avro.Schema.Field[] fieldArray0 = new org.apache.avro.Schema.Field[] {};
        java.util.ArrayList<org.apache.avro.Schema.Field> fieldList1 = new java.util.ArrayList<org.apache.avro.Schema.Field>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<org.apache.avro.Schema.Field>) fieldList1, fieldArray0);
        org.apache.avro.Schema schema3 = org.apache.avro.Schema.createRecord((java.util.List<org.apache.avro.Schema.Field>) fieldList1);
        org.apache.avro.Schema.Field field5 = schema3.getField("");
        org.apache.avro.Schema schema6 = org.apache.avro.Schema.createMap(schema3);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.avro.Schema schema7 = schema3.getValueType();
            org.junit.Assert.fail("Expected exception of type org.apache.avro.AvroRuntimeException; message: Not a map: {\"type\":\"record\",\"fields\":[]}");
        } catch (org.apache.avro.AvroRuntimeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(fieldArray0);
        org.junit.Assert.assertArrayEquals(fieldArray0, new org.apache.avro.Schema.Field[] {});
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(schema3);
        org.junit.Assert.assertNull(field5);
        org.junit.Assert.assertNotNull(schema6);
    }

    @Test
    public void test0166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SchemaM3Random300Test0.test0166");
        org.apache.avro.Schema[] schemaArray0 = new org.apache.avro.Schema[] {};
        java.util.ArrayList<org.apache.avro.Schema> schemaList1 = new java.util.ArrayList<org.apache.avro.Schema>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<org.apache.avro.Schema>) schemaList1, schemaArray0);
        org.apache.avro.Schema schema3 = org.apache.avro.Schema.createUnion((java.util.List<org.apache.avro.Schema>) schemaList1);
        java.lang.String str4 = schema3.getFullName();
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<org.apache.avro.Schema.Field> fieldList5 = schema3.getFields();
            org.junit.Assert.fail("Expected exception of type org.apache.avro.AvroRuntimeException; message: Not a record: []");
        } catch (org.apache.avro.AvroRuntimeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(schemaArray0);
        org.junit.Assert.assertArrayEquals(schemaArray0, new org.apache.avro.Schema[] {});
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(schema3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "union" + "'", str4, "union");
    }

    @Test
    public void test0167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SchemaM3Random300Test0.test0167");
        org.apache.avro.Schema.Names names0 = new org.apache.avro.Schema.Names();
        names0.space("[ ]");
        java.lang.Object obj3 = names0.clone();
        org.apache.avro.Schema.Names names4 = new org.apache.avro.Schema.Names();
        names4.space("[ ]");
        org.apache.avro.Schema schema7 = names0.remove((java.lang.Object) names4);
        boolean boolean8 = names4.isEmpty();
        java.lang.String str9 = names4.space();
        java.lang.Object obj10 = names4.clone();
        org.junit.Assert.assertNotNull(obj3);
        org.junit.Assert.assertEquals(obj3.toString(), "{}");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj3), "{}");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj3), "{}");
        org.junit.Assert.assertNull(schema7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "[ ]" + "'", str9, "[ ]");
        org.junit.Assert.assertNotNull(obj10);
        org.junit.Assert.assertEquals(obj10.toString(), "{}");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj10), "{}");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj10), "{}");
    }

    @Test
    public void test0168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SchemaM3Random300Test0.test0168");
        org.apache.avro.Schema[] schemaArray0 = new org.apache.avro.Schema[] {};
        java.util.ArrayList<org.apache.avro.Schema> schemaList1 = new java.util.ArrayList<org.apache.avro.Schema>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<org.apache.avro.Schema>) schemaList1, schemaArray0);
        org.apache.avro.Schema schema3 = org.apache.avro.Schema.createUnion((java.util.List<org.apache.avro.Schema>) schemaList1);
        org.apache.avro.Schema[] schemaArray4 = new org.apache.avro.Schema[] {};
        java.util.ArrayList<org.apache.avro.Schema> schemaList5 = new java.util.ArrayList<org.apache.avro.Schema>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<org.apache.avro.Schema>) schemaList5, schemaArray4);
        org.apache.avro.Schema schema7 = org.apache.avro.Schema.createUnion((java.util.List<org.apache.avro.Schema>) schemaList5);
        org.apache.avro.Schema schema8 = org.apache.avro.Schema.applyAliases(schema3, schema7);
        java.util.List<org.apache.avro.Schema> schemaList9 = schema8.getTypes();
        org.apache.avro.Schema[] schemaArray10 = new org.apache.avro.Schema[] {};
        java.util.ArrayList<org.apache.avro.Schema> schemaList11 = new java.util.ArrayList<org.apache.avro.Schema>();
        boolean boolean12 = java.util.Collections.addAll((java.util.Collection<org.apache.avro.Schema>) schemaList11, schemaArray10);
        org.apache.avro.Schema schema13 = org.apache.avro.Schema.createUnion((java.util.List<org.apache.avro.Schema>) schemaList11);
        org.apache.avro.Schema[] schemaArray14 = new org.apache.avro.Schema[] {};
        java.util.ArrayList<org.apache.avro.Schema> schemaList15 = new java.util.ArrayList<org.apache.avro.Schema>();
        boolean boolean16 = java.util.Collections.addAll((java.util.Collection<org.apache.avro.Schema>) schemaList15, schemaArray14);
        org.apache.avro.Schema schema17 = org.apache.avro.Schema.createUnion((java.util.List<org.apache.avro.Schema>) schemaList15);
        org.apache.avro.Schema schema18 = org.apache.avro.Schema.applyAliases(schema13, schema17);
        org.apache.avro.Schema schema19 = org.apache.avro.Schema.applyAliases(schema8, schema17);
        org.apache.avro.Schema.Field[] fieldArray20 = new org.apache.avro.Schema.Field[] {};
        java.util.ArrayList<org.apache.avro.Schema.Field> fieldList21 = new java.util.ArrayList<org.apache.avro.Schema.Field>();
        boolean boolean22 = java.util.Collections.addAll((java.util.Collection<org.apache.avro.Schema.Field>) fieldList21, fieldArray20);
        org.apache.avro.Schema schema23 = org.apache.avro.Schema.createRecord((java.util.List<org.apache.avro.Schema.Field>) fieldList21);
        // The following exception was thrown during execution in test generation
        try {
            schema19.setFields((java.util.List<org.apache.avro.Schema.Field>) fieldList21);
            org.junit.Assert.fail("Expected exception of type org.apache.avro.AvroRuntimeException; message: Not a record: []");
        } catch (org.apache.avro.AvroRuntimeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(schemaArray0);
        org.junit.Assert.assertArrayEquals(schemaArray0, new org.apache.avro.Schema[] {});
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(schema3);
        org.junit.Assert.assertNotNull(schemaArray4);
        org.junit.Assert.assertArrayEquals(schemaArray4, new org.apache.avro.Schema[] {});
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(schema7);
        org.junit.Assert.assertNotNull(schema8);
        org.junit.Assert.assertNotNull(schemaList9);
        org.junit.Assert.assertNotNull(schemaArray10);
        org.junit.Assert.assertArrayEquals(schemaArray10, new org.apache.avro.Schema[] {});
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(schema13);
        org.junit.Assert.assertNotNull(schemaArray14);
        org.junit.Assert.assertArrayEquals(schemaArray14, new org.apache.avro.Schema[] {});
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(schema17);
        org.junit.Assert.assertNotNull(schema18);
        org.junit.Assert.assertNotNull(schema19);
        org.junit.Assert.assertNotNull(fieldArray20);
        org.junit.Assert.assertArrayEquals(fieldArray20, new org.apache.avro.Schema.Field[] {});
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(schema23);
    }

    @Test
    public void test0169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SchemaM3Random300Test0.test0169");
        org.apache.avro.Schema.Parser parser0 = new org.apache.avro.Schema.Parser();
        java.util.Map<java.lang.String, org.apache.avro.Schema> strMap1 = parser0.getTypes();
        java.util.Map<java.lang.String, org.apache.avro.Schema> strMap2 = parser0.getTypes();
        org.apache.avro.Schema.Parser parser3 = new org.apache.avro.Schema.Parser();
        java.util.Map<java.lang.String, org.apache.avro.Schema> strMap4 = parser3.getTypes();
        org.apache.avro.Schema.Parser parser5 = parser0.addTypes(strMap4);
        java.io.InputStream inputStream6 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.avro.Schema schema7 = parser5.parse(inputStream6);
            org.junit.Assert.fail("Expected exception of type java.io.EOFException; message: No content to map to Object due to end of input");
        } catch (java.io.EOFException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strMap1);
        org.junit.Assert.assertNotNull(strMap2);
        org.junit.Assert.assertNotNull(strMap4);
        org.junit.Assert.assertNotNull(parser5);
    }

    @Test
    public void test0170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SchemaM3Random300Test0.test0170");
        org.apache.avro.Schema.Parser parser0 = new org.apache.avro.Schema.Parser();
        java.util.Map<java.lang.String, org.apache.avro.Schema> strMap1 = parser0.getTypes();
        org.apache.avro.Schema.Parser parser2 = new org.apache.avro.Schema.Parser();
        org.apache.avro.Schema.Parser parser4 = parser2.setValidate(true);
        java.util.Map<java.lang.String, org.apache.avro.Schema> strMap5 = parser2.getTypes();
        org.apache.avro.Schema.Parser parser6 = parser0.addTypes(strMap5);
        boolean boolean7 = parser6.getValidate();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.avro.Schema schema9 = parser6.parse("{\r\n  \"type\" : \"record\",\r\n  \"fields\" : [ ]\r\n}");
            org.junit.Assert.fail("Expected exception of type org.apache.avro.SchemaParseException; message: No name in schema: {\"type\":\"record\",\"fields\":[]}");
        } catch (org.apache.avro.SchemaParseException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strMap1);
        org.junit.Assert.assertNotNull(parser4);
        org.junit.Assert.assertNotNull(strMap5);
        org.junit.Assert.assertNotNull(parser6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test0171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SchemaM3Random300Test0.test0171");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.avro.Schema schema2 = org.apache.avro.Schema.parse("union type:MAP pos:-1", false);
            org.junit.Assert.fail("Expected exception of type org.apache.avro.SchemaParseException; message: org.codehaus.jackson.JsonParseException: Unexpected character ('u' (code 117)): expected a valid value (number, String, array, object, 'true', 'false' or 'null')? at [Source: java.io.StringReader@4fbdcfcf; line: 1, column: 2]");
        } catch (org.apache.avro.SchemaParseException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SchemaM3Random300Test0.test0172");
        org.apache.avro.Schema.Parser parser0 = new org.apache.avro.Schema.Parser();
        java.util.Map<java.lang.String, org.apache.avro.Schema> strMap1 = parser0.getTypes();
        java.util.Map<java.lang.String, org.apache.avro.Schema> strMap2 = parser0.getTypes();
        org.apache.avro.Schema.Parser parser3 = new org.apache.avro.Schema.Parser();
        java.util.Map<java.lang.String, org.apache.avro.Schema> strMap4 = parser3.getTypes();
        org.apache.avro.Schema.Parser parser5 = parser0.addTypes(strMap4);
        java.io.File file6 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.avro.Schema schema7 = parser0.parse(file6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strMap1);
        org.junit.Assert.assertNotNull(strMap2);
        org.junit.Assert.assertNotNull(strMap4);
        org.junit.Assert.assertNotNull(parser5);
    }

    @Test
    public void test0173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SchemaM3Random300Test0.test0173");
        org.apache.avro.Schema.Parser parser0 = new org.apache.avro.Schema.Parser();
        org.apache.avro.Schema.Parser parser2 = parser0.setValidate(true);
        org.apache.avro.Schema.Parser parser4 = parser0.setValidate(true);
        java.util.Map<java.lang.String, org.apache.avro.Schema> strMap5 = parser4.getTypes();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.avro.Schema schema7 = parser4.parse("map");
            org.junit.Assert.fail("Expected exception of type org.apache.avro.SchemaParseException; message: org.codehaus.jackson.JsonParseException: Unexpected character ('m' (code 109)): expected a valid value (number, String, array, object, 'true', 'false' or 'null')? at [Source: java.io.StringReader@42ea278; line: 1, column: 2]");
        } catch (org.apache.avro.SchemaParseException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(parser2);
        org.junit.Assert.assertNotNull(parser4);
        org.junit.Assert.assertNotNull(strMap5);
    }

    @Test
    public void test0174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SchemaM3Random300Test0.test0174");
        org.apache.avro.Schema[] schemaArray0 = new org.apache.avro.Schema[] {};
        java.util.ArrayList<org.apache.avro.Schema> schemaList1 = new java.util.ArrayList<org.apache.avro.Schema>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<org.apache.avro.Schema>) schemaList1, schemaArray0);
        org.apache.avro.Schema schema3 = org.apache.avro.Schema.createUnion((java.util.List<org.apache.avro.Schema>) schemaList1);
        java.util.List<org.apache.avro.Schema> schemaList4 = schema3.getTypes();
        // The following exception was thrown during execution in test generation
        try {
            schema3.addProp("", "union type:UNION pos:-1");
            org.junit.Assert.fail("Expected exception of type org.apache.avro.AvroRuntimeException; message: Can't set properties on a union: []");
        } catch (org.apache.avro.AvroRuntimeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(schemaArray0);
        org.junit.Assert.assertArrayEquals(schemaArray0, new org.apache.avro.Schema[] {});
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(schema3);
        org.junit.Assert.assertNotNull(schemaList4);
    }

    @Test
    public void test0175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SchemaM3Random300Test0.test0175");
        org.apache.avro.Schema.Parser parser0 = new org.apache.avro.Schema.Parser();
        org.apache.avro.Schema.Parser parser2 = parser0.setValidate(true);
        org.apache.avro.Schema.Parser parser4 = parser0.setValidate(true);
        org.apache.avro.Schema.Parser parser6 = parser0.setValidate(true);
        org.apache.avro.Schema schema8 = parser0.parse("[].union");
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<java.lang.String> strList9 = schema8.getEnumSymbols();
            org.junit.Assert.fail("Expected exception of type org.apache.avro.AvroRuntimeException; message: Not an enum: []");
        } catch (org.apache.avro.AvroRuntimeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(parser2);
        org.junit.Assert.assertNotNull(parser4);
        org.junit.Assert.assertNotNull(parser6);
        org.junit.Assert.assertNotNull(schema8);
    }

    @Test
    public void test0176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SchemaM3Random300Test0.test0176");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.avro.Schema schema2 = org.apache.avro.Schema.parse("array", false);
            org.junit.Assert.fail("Expected exception of type org.apache.avro.SchemaParseException; message: org.codehaus.jackson.JsonParseException: Unexpected character ('a' (code 97)): expected a valid value (number, String, array, object, 'true', 'false' or 'null')? at [Source: java.io.StringReader@f6a103; line: 1, column: 2]");
        } catch (org.apache.avro.SchemaParseException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SchemaM3Random300Test0.test0177");
        org.apache.avro.Schema[] schemaArray0 = new org.apache.avro.Schema[] {};
        java.util.ArrayList<org.apache.avro.Schema> schemaList1 = new java.util.ArrayList<org.apache.avro.Schema>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<org.apache.avro.Schema>) schemaList1, schemaArray0);
        org.apache.avro.Schema schema3 = org.apache.avro.Schema.createUnion((java.util.List<org.apache.avro.Schema>) schemaList1);
        org.apache.avro.Schema[] schemaArray4 = new org.apache.avro.Schema[] {};
        java.util.ArrayList<org.apache.avro.Schema> schemaList5 = new java.util.ArrayList<org.apache.avro.Schema>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<org.apache.avro.Schema>) schemaList5, schemaArray4);
        org.apache.avro.Schema schema7 = org.apache.avro.Schema.createUnion((java.util.List<org.apache.avro.Schema>) schemaList5);
        org.apache.avro.Schema schema8 = org.apache.avro.Schema.applyAliases(schema3, schema7);
        java.util.List<org.apache.avro.Schema> schemaList9 = schema8.getTypes();
        org.apache.avro.Schema[] schemaArray10 = new org.apache.avro.Schema[] {};
        java.util.ArrayList<org.apache.avro.Schema> schemaList11 = new java.util.ArrayList<org.apache.avro.Schema>();
        boolean boolean12 = java.util.Collections.addAll((java.util.Collection<org.apache.avro.Schema>) schemaList11, schemaArray10);
        org.apache.avro.Schema schema13 = org.apache.avro.Schema.createUnion((java.util.List<org.apache.avro.Schema>) schemaList11);
        org.apache.avro.Schema[] schemaArray14 = new org.apache.avro.Schema[] {};
        java.util.ArrayList<org.apache.avro.Schema> schemaList15 = new java.util.ArrayList<org.apache.avro.Schema>();
        boolean boolean16 = java.util.Collections.addAll((java.util.Collection<org.apache.avro.Schema>) schemaList15, schemaArray14);
        org.apache.avro.Schema schema17 = org.apache.avro.Schema.createUnion((java.util.List<org.apache.avro.Schema>) schemaList15);
        org.apache.avro.Schema schema18 = org.apache.avro.Schema.applyAliases(schema13, schema17);
        org.apache.avro.Schema schema19 = org.apache.avro.Schema.applyAliases(schema8, schema17);
        org.apache.avro.Schema schema20 = org.apache.avro.Schema.createMap(schema17);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.avro.Schema schema21 = schema17.getElementType();
            org.junit.Assert.fail("Expected exception of type org.apache.avro.AvroRuntimeException; message: Not an array: []");
        } catch (org.apache.avro.AvroRuntimeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(schemaArray0);
        org.junit.Assert.assertArrayEquals(schemaArray0, new org.apache.avro.Schema[] {});
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(schema3);
        org.junit.Assert.assertNotNull(schemaArray4);
        org.junit.Assert.assertArrayEquals(schemaArray4, new org.apache.avro.Schema[] {});
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(schema7);
        org.junit.Assert.assertNotNull(schema8);
        org.junit.Assert.assertNotNull(schemaList9);
        org.junit.Assert.assertNotNull(schemaArray10);
        org.junit.Assert.assertArrayEquals(schemaArray10, new org.apache.avro.Schema[] {});
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(schema13);
        org.junit.Assert.assertNotNull(schemaArray14);
        org.junit.Assert.assertArrayEquals(schemaArray14, new org.apache.avro.Schema[] {});
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(schema17);
        org.junit.Assert.assertNotNull(schema18);
        org.junit.Assert.assertNotNull(schema19);
        org.junit.Assert.assertNotNull(schema20);
    }

    @Test
    public void test0178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SchemaM3Random300Test0.test0178");
        java.lang.String[] strArray4 = new java.lang.String[] { "{\r\n  \"type\" : \"record\",\r\n  \"fields\" : [ ]\r\n}" };
        java.util.ArrayList<java.lang.String> strList5 = new java.util.ArrayList<java.lang.String>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList5, strArray4);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.avro.Schema schema7 = org.apache.avro.Schema.createEnum("{\r\n  \"type\" : \"array\",\r\n  \"items\" : {\r\n    \"type\" : \"map\",\r\n    \"values\" : [ ]\r\n  }\r\n}", "{\r\n  \"type\" : \"record\",\r\n  \"fields\" : [ ]\r\n}", "union", (java.util.List<java.lang.String>) strList5);
            org.junit.Assert.fail("Expected exception of type org.apache.avro.SchemaParseException; message: Illegal initial character: {??  \"type\" : \"array\",??  \"items\" : {??    \"type\" : \"map\",??    \"values\" : [ ]??  }??}");
        } catch (org.apache.avro.SchemaParseException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertArrayEquals(strArray4, new java.lang.String[] { "{\r\n  \"type\" : \"record\",\r\n  \"fields\" : [ ]\r\n}" });
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test0179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SchemaM3Random300Test0.test0179");
        org.apache.avro.Schema.Parser parser0 = new org.apache.avro.Schema.Parser();
        org.apache.avro.Schema.Parser parser2 = parser0.setValidate(true);
        org.apache.avro.Schema.Parser parser4 = parser0.setValidate(true);
        java.util.Map<java.lang.String, org.apache.avro.Schema> strMap5 = parser4.getTypes();
        java.io.File file6 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.avro.Schema schema7 = parser4.parse(file6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(parser2);
        org.junit.Assert.assertNotNull(parser4);
        org.junit.Assert.assertNotNull(strMap5);
    }

    @Test
    public void test0180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SchemaM3Random300Test0.test0180");
        org.apache.avro.Schema.Parser parser0 = new org.apache.avro.Schema.Parser();
        java.util.Map<java.lang.String, org.apache.avro.Schema> strMap1 = parser0.getTypes();
        org.apache.avro.Schema.Parser parser2 = new org.apache.avro.Schema.Parser();
        org.apache.avro.Schema.Parser parser4 = parser2.setValidate(true);
        java.util.Map<java.lang.String, org.apache.avro.Schema> strMap5 = parser2.getTypes();
        org.apache.avro.Schema.Parser parser6 = parser0.addTypes(strMap5);
        boolean boolean7 = parser0.getValidate();
        java.io.InputStream inputStream8 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.avro.Schema schema9 = parser0.parse(inputStream8);
            org.junit.Assert.fail("Expected exception of type java.io.EOFException; message: No content to map to Object due to end of input");
        } catch (java.io.EOFException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strMap1);
        org.junit.Assert.assertNotNull(parser4);
        org.junit.Assert.assertNotNull(strMap5);
        org.junit.Assert.assertNotNull(parser6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test0181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SchemaM3Random300Test0.test0181");
        org.apache.avro.Schema[] schemaArray0 = new org.apache.avro.Schema[] {};
        java.util.ArrayList<org.apache.avro.Schema> schemaList1 = new java.util.ArrayList<org.apache.avro.Schema>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<org.apache.avro.Schema>) schemaList1, schemaArray0);
        org.apache.avro.Schema schema3 = org.apache.avro.Schema.createUnion((java.util.List<org.apache.avro.Schema>) schemaList1);
        org.apache.avro.Schema[] schemaArray4 = new org.apache.avro.Schema[] {};
        java.util.ArrayList<org.apache.avro.Schema> schemaList5 = new java.util.ArrayList<org.apache.avro.Schema>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<org.apache.avro.Schema>) schemaList5, schemaArray4);
        org.apache.avro.Schema schema7 = org.apache.avro.Schema.createUnion((java.util.List<org.apache.avro.Schema>) schemaList5);
        org.apache.avro.Schema schema8 = org.apache.avro.Schema.applyAliases(schema3, schema7);
        java.util.List<org.apache.avro.Schema> schemaList9 = schema8.getTypes();
        org.apache.avro.Schema[] schemaArray10 = new org.apache.avro.Schema[] {};
        java.util.ArrayList<org.apache.avro.Schema> schemaList11 = new java.util.ArrayList<org.apache.avro.Schema>();
        boolean boolean12 = java.util.Collections.addAll((java.util.Collection<org.apache.avro.Schema>) schemaList11, schemaArray10);
        org.apache.avro.Schema schema13 = org.apache.avro.Schema.createUnion((java.util.List<org.apache.avro.Schema>) schemaList11);
        org.apache.avro.Schema[] schemaArray14 = new org.apache.avro.Schema[] {};
        java.util.ArrayList<org.apache.avro.Schema> schemaList15 = new java.util.ArrayList<org.apache.avro.Schema>();
        boolean boolean16 = java.util.Collections.addAll((java.util.Collection<org.apache.avro.Schema>) schemaList15, schemaArray14);
        org.apache.avro.Schema schema17 = org.apache.avro.Schema.createUnion((java.util.List<org.apache.avro.Schema>) schemaList15);
        org.apache.avro.Schema schema18 = org.apache.avro.Schema.applyAliases(schema13, schema17);
        org.apache.avro.Schema schema19 = org.apache.avro.Schema.applyAliases(schema8, schema17);
        org.apache.avro.Schema schema20 = org.apache.avro.Schema.createMap(schema8);
        org.apache.avro.Schema schema21 = org.apache.avro.Schema.createArray(schema20);
        org.apache.avro.Schema schema22 = org.apache.avro.Schema.createMap(schema21);
        java.lang.String str24 = schema21.toString(true);
        org.apache.avro.Schema.Field[] fieldArray25 = new org.apache.avro.Schema.Field[] {};
        java.util.ArrayList<org.apache.avro.Schema.Field> fieldList26 = new java.util.ArrayList<org.apache.avro.Schema.Field>();
        boolean boolean27 = java.util.Collections.addAll((java.util.Collection<org.apache.avro.Schema.Field>) fieldList26, fieldArray25);
        org.apache.avro.Schema schema28 = org.apache.avro.Schema.createRecord((java.util.List<org.apache.avro.Schema.Field>) fieldList26);
        org.apache.avro.Schema schema29 = org.apache.avro.Schema.createRecord((java.util.List<org.apache.avro.Schema.Field>) fieldList26);
        org.apache.avro.Schema schema30 = org.apache.avro.Schema.createRecord((java.util.List<org.apache.avro.Schema.Field>) fieldList26);
        org.apache.avro.Schema schema31 = org.apache.avro.Schema.createRecord((java.util.List<org.apache.avro.Schema.Field>) fieldList26);
        // The following exception was thrown during execution in test generation
        try {
            schema21.setFields((java.util.List<org.apache.avro.Schema.Field>) fieldList26);
            org.junit.Assert.fail("Expected exception of type org.apache.avro.AvroRuntimeException; message: Not a record: {\"type\":\"array\",\"items\":{\"type\":\"map\",\"values\":[]}}");
        } catch (org.apache.avro.AvroRuntimeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(schemaArray0);
        org.junit.Assert.assertArrayEquals(schemaArray0, new org.apache.avro.Schema[] {});
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(schema3);
        org.junit.Assert.assertNotNull(schemaArray4);
        org.junit.Assert.assertArrayEquals(schemaArray4, new org.apache.avro.Schema[] {});
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(schema7);
        org.junit.Assert.assertNotNull(schema8);
        org.junit.Assert.assertNotNull(schemaList9);
        org.junit.Assert.assertNotNull(schemaArray10);
        org.junit.Assert.assertArrayEquals(schemaArray10, new org.apache.avro.Schema[] {});
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(schema13);
        org.junit.Assert.assertNotNull(schemaArray14);
        org.junit.Assert.assertArrayEquals(schemaArray14, new org.apache.avro.Schema[] {});
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(schema17);
        org.junit.Assert.assertNotNull(schema18);
        org.junit.Assert.assertNotNull(schema19);
        org.junit.Assert.assertNotNull(schema20);
        org.junit.Assert.assertNotNull(schema21);
        org.junit.Assert.assertNotNull(schema22);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "{\r\n  \"type\" : \"array\",\r\n  \"items\" : {\r\n    \"type\" : \"map\",\r\n    \"values\" : [ ]\r\n  }\r\n}" + "'", str24, "{\r\n  \"type\" : \"array\",\r\n  \"items\" : {\r\n    \"type\" : \"map\",\r\n    \"values\" : [ ]\r\n  }\r\n}");
        org.junit.Assert.assertNotNull(fieldArray25);
        org.junit.Assert.assertArrayEquals(fieldArray25, new org.apache.avro.Schema.Field[] {});
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(schema28);
        org.junit.Assert.assertNotNull(schema29);
        org.junit.Assert.assertNotNull(schema30);
        org.junit.Assert.assertNotNull(schema31);
    }

    @Test
    public void test0182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SchemaM3Random300Test0.test0182");
        org.apache.avro.Schema schema4 = org.apache.avro.Schema.createRecord("map", "", "hi!", false);
        org.junit.Assert.assertNotNull(schema4);
    }

    @Test
    public void test0183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SchemaM3Random300Test0.test0183");
        org.apache.avro.Schema.Parser parser0 = new org.apache.avro.Schema.Parser();
        java.util.Map<java.lang.String, org.apache.avro.Schema> strMap1 = parser0.getTypes();
        org.apache.avro.Schema.Parser parser2 = new org.apache.avro.Schema.Parser();
        org.apache.avro.Schema.Parser parser4 = parser2.setValidate(true);
        java.util.Map<java.lang.String, org.apache.avro.Schema> strMap5 = parser2.getTypes();
        org.apache.avro.Schema.Parser parser6 = parser0.addTypes(strMap5);
        boolean boolean7 = parser0.getValidate();
        boolean boolean8 = parser0.getValidate();
        org.apache.avro.Schema.Parser parser9 = new org.apache.avro.Schema.Parser();
        java.util.Map<java.lang.String, org.apache.avro.Schema> strMap10 = parser9.getTypes();
        java.util.Map<java.lang.String, org.apache.avro.Schema> strMap11 = parser9.getTypes();
        org.apache.avro.Schema.Parser parser12 = new org.apache.avro.Schema.Parser();
        java.util.Map<java.lang.String, org.apache.avro.Schema> strMap13 = parser12.getTypes();
        org.apache.avro.Schema.Parser parser14 = parser9.addTypes(strMap13);
        org.apache.avro.Schema.Parser parser15 = parser0.addTypes(strMap13);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.avro.Schema schema17 = parser0.parse("union type:MAP pos:-1");
            org.junit.Assert.fail("Expected exception of type org.apache.avro.SchemaParseException; message: org.codehaus.jackson.JsonParseException: Unexpected character ('u' (code 117)): expected a valid value (number, String, array, object, 'true', 'false' or 'null')? at [Source: java.io.StringReader@48c81c41; line: 1, column: 2]");
        } catch (org.apache.avro.SchemaParseException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strMap1);
        org.junit.Assert.assertNotNull(parser4);
        org.junit.Assert.assertNotNull(strMap5);
        org.junit.Assert.assertNotNull(parser6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(strMap10);
        org.junit.Assert.assertNotNull(strMap11);
        org.junit.Assert.assertNotNull(strMap13);
        org.junit.Assert.assertNotNull(parser14);
        org.junit.Assert.assertNotNull(parser15);
    }

    @Test
    public void test0184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SchemaM3Random300Test0.test0184");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.avro.Schema schema4 = org.apache.avro.Schema.createFixed("[ ]", "{\r\n  \"type\" : \"map\",\r\n  \"values\" : [ ]\r\n}", "hi!", (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type org.apache.avro.SchemaParseException; message: Illegal initial character: [ ]");
        } catch (org.apache.avro.SchemaParseException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SchemaM3Random300Test0.test0185");
        org.apache.avro.Schema.Parser parser0 = new org.apache.avro.Schema.Parser();
        java.util.Map<java.lang.String, org.apache.avro.Schema> strMap1 = parser0.getTypes();
        java.util.Map<java.lang.String, org.apache.avro.Schema> strMap2 = parser0.getTypes();
        org.apache.avro.Schema.Parser parser3 = new org.apache.avro.Schema.Parser();
        java.util.Map<java.lang.String, org.apache.avro.Schema> strMap4 = parser3.getTypes();
        org.apache.avro.Schema.Parser parser5 = parser0.addTypes(strMap4);
        boolean boolean6 = parser0.getValidate();
        java.io.File file7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.avro.Schema schema8 = parser0.parse(file7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strMap1);
        org.junit.Assert.assertNotNull(strMap2);
        org.junit.Assert.assertNotNull(strMap4);
        org.junit.Assert.assertNotNull(parser5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test0186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SchemaM3Random300Test0.test0186");
        org.apache.avro.Schema[] schemaArray0 = new org.apache.avro.Schema[] {};
        java.util.ArrayList<org.apache.avro.Schema> schemaList1 = new java.util.ArrayList<org.apache.avro.Schema>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<org.apache.avro.Schema>) schemaList1, schemaArray0);
        org.apache.avro.Schema schema3 = org.apache.avro.Schema.createUnion((java.util.List<org.apache.avro.Schema>) schemaList1);
        org.apache.avro.Schema[] schemaArray4 = new org.apache.avro.Schema[] {};
        java.util.ArrayList<org.apache.avro.Schema> schemaList5 = new java.util.ArrayList<org.apache.avro.Schema>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<org.apache.avro.Schema>) schemaList5, schemaArray4);
        org.apache.avro.Schema schema7 = org.apache.avro.Schema.createUnion((java.util.List<org.apache.avro.Schema>) schemaList5);
        org.apache.avro.Schema schema8 = org.apache.avro.Schema.applyAliases(schema3, schema7);
        java.util.List<org.apache.avro.Schema> schemaList9 = schema8.getTypes();
        org.apache.avro.Schema[] schemaArray10 = new org.apache.avro.Schema[] {};
        java.util.ArrayList<org.apache.avro.Schema> schemaList11 = new java.util.ArrayList<org.apache.avro.Schema>();
        boolean boolean12 = java.util.Collections.addAll((java.util.Collection<org.apache.avro.Schema>) schemaList11, schemaArray10);
        org.apache.avro.Schema schema13 = org.apache.avro.Schema.createUnion((java.util.List<org.apache.avro.Schema>) schemaList11);
        org.apache.avro.Schema[] schemaArray14 = new org.apache.avro.Schema[] {};
        java.util.ArrayList<org.apache.avro.Schema> schemaList15 = new java.util.ArrayList<org.apache.avro.Schema>();
        boolean boolean16 = java.util.Collections.addAll((java.util.Collection<org.apache.avro.Schema>) schemaList15, schemaArray14);
        org.apache.avro.Schema schema17 = org.apache.avro.Schema.createUnion((java.util.List<org.apache.avro.Schema>) schemaList15);
        org.apache.avro.Schema schema18 = org.apache.avro.Schema.applyAliases(schema13, schema17);
        org.apache.avro.Schema schema19 = org.apache.avro.Schema.applyAliases(schema8, schema17);
        org.apache.avro.Schema schema20 = org.apache.avro.Schema.createMap(schema8);
        java.lang.String str21 = schema8.getName();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.avro.Schema schema22 = schema8.getValueType();
            org.junit.Assert.fail("Expected exception of type org.apache.avro.AvroRuntimeException; message: Not a map: []");
        } catch (org.apache.avro.AvroRuntimeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(schemaArray0);
        org.junit.Assert.assertArrayEquals(schemaArray0, new org.apache.avro.Schema[] {});
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(schema3);
        org.junit.Assert.assertNotNull(schemaArray4);
        org.junit.Assert.assertArrayEquals(schemaArray4, new org.apache.avro.Schema[] {});
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(schema7);
        org.junit.Assert.assertNotNull(schema8);
        org.junit.Assert.assertNotNull(schemaList9);
        org.junit.Assert.assertNotNull(schemaArray10);
        org.junit.Assert.assertArrayEquals(schemaArray10, new org.apache.avro.Schema[] {});
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(schema13);
        org.junit.Assert.assertNotNull(schemaArray14);
        org.junit.Assert.assertArrayEquals(schemaArray14, new org.apache.avro.Schema[] {});
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(schema17);
        org.junit.Assert.assertNotNull(schema18);
        org.junit.Assert.assertNotNull(schema19);
        org.junit.Assert.assertNotNull(schema20);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "union" + "'", str21, "union");
    }

    @Test
    public void test0187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SchemaM3Random300Test0.test0187");
        org.apache.avro.Schema.Names names0 = new org.apache.avro.Schema.Names();
        names0.space("[ ]");
        java.lang.Object obj3 = names0.clone();
        java.lang.Class<?> wildcardClass4 = names0.getClass();
        org.junit.Assert.assertNotNull(obj3);
        org.junit.Assert.assertEquals(obj3.toString(), "{}");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj3), "{}");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj3), "{}");
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test0188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SchemaM3Random300Test0.test0188");
        org.apache.avro.Schema.Parser parser0 = new org.apache.avro.Schema.Parser();
        java.util.Map<java.lang.String, org.apache.avro.Schema> strMap1 = parser0.getTypes();
        java.util.Map<java.lang.String, org.apache.avro.Schema> strMap2 = parser0.getTypes();
        org.apache.avro.Schema.Parser parser3 = new org.apache.avro.Schema.Parser();
        org.apache.avro.Schema.Parser parser5 = parser3.setValidate(true);
        java.util.Map<java.lang.String, org.apache.avro.Schema> strMap6 = parser3.getTypes();
        org.apache.avro.Schema.Parser parser7 = parser0.addTypes(strMap6);
        org.apache.avro.Schema.Parser parser9 = parser7.setValidate(false);
        java.io.InputStream inputStream10 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.avro.Schema schema11 = parser7.parse(inputStream10);
            org.junit.Assert.fail("Expected exception of type java.io.EOFException; message: No content to map to Object due to end of input");
        } catch (java.io.EOFException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strMap1);
        org.junit.Assert.assertNotNull(strMap2);
        org.junit.Assert.assertNotNull(parser5);
        org.junit.Assert.assertNotNull(strMap6);
        org.junit.Assert.assertNotNull(parser7);
        org.junit.Assert.assertNotNull(parser9);
    }

    @Test
    public void test0189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SchemaM3Random300Test0.test0189");
        org.apache.avro.Schema[] schemaArray0 = new org.apache.avro.Schema[] {};
        java.util.ArrayList<org.apache.avro.Schema> schemaList1 = new java.util.ArrayList<org.apache.avro.Schema>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<org.apache.avro.Schema>) schemaList1, schemaArray0);
        org.apache.avro.Schema schema3 = org.apache.avro.Schema.createUnion((java.util.List<org.apache.avro.Schema>) schemaList1);
        org.apache.avro.Schema[] schemaArray4 = new org.apache.avro.Schema[] {};
        java.util.ArrayList<org.apache.avro.Schema> schemaList5 = new java.util.ArrayList<org.apache.avro.Schema>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<org.apache.avro.Schema>) schemaList5, schemaArray4);
        org.apache.avro.Schema schema7 = org.apache.avro.Schema.createUnion((java.util.List<org.apache.avro.Schema>) schemaList5);
        org.apache.avro.Schema schema8 = org.apache.avro.Schema.applyAliases(schema3, schema7);
        java.util.List<org.apache.avro.Schema> schemaList9 = schema8.getTypes();
        java.lang.String str11 = schema8.getProp("{\r\n  \"type\" : \"array\",\r\n  \"items\" : {\r\n    \"type\" : \"map\",\r\n    \"values\" : [ ]\r\n  }\r\n}");
        org.apache.avro.Schema schema12 = org.apache.avro.Schema.createArray(schema8);
        java.lang.Class<?> wildcardClass13 = schema8.getClass();
        org.junit.Assert.assertNotNull(schemaArray0);
        org.junit.Assert.assertArrayEquals(schemaArray0, new org.apache.avro.Schema[] {});
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(schema3);
        org.junit.Assert.assertNotNull(schemaArray4);
        org.junit.Assert.assertArrayEquals(schemaArray4, new org.apache.avro.Schema[] {});
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(schema7);
        org.junit.Assert.assertNotNull(schema8);
        org.junit.Assert.assertNotNull(schemaList9);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNotNull(schema12);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SchemaM3Random300Test0.test0190");
        org.apache.avro.Schema.Parser parser0 = new org.apache.avro.Schema.Parser();
        java.util.Map<java.lang.String, org.apache.avro.Schema> strMap1 = parser0.getTypes();
        org.apache.avro.Schema.Parser parser2 = new org.apache.avro.Schema.Parser();
        org.apache.avro.Schema.Parser parser4 = parser2.setValidate(true);
        java.util.Map<java.lang.String, org.apache.avro.Schema> strMap5 = parser2.getTypes();
        org.apache.avro.Schema.Parser parser6 = parser0.addTypes(strMap5);
        boolean boolean7 = parser0.getValidate();
        boolean boolean8 = parser0.getValidate();
        org.apache.avro.Schema.Parser parser9 = new org.apache.avro.Schema.Parser();
        java.util.Map<java.lang.String, org.apache.avro.Schema> strMap10 = parser9.getTypes();
        java.util.Map<java.lang.String, org.apache.avro.Schema> strMap11 = parser9.getTypes();
        org.apache.avro.Schema.Parser parser12 = new org.apache.avro.Schema.Parser();
        java.util.Map<java.lang.String, org.apache.avro.Schema> strMap13 = parser12.getTypes();
        org.apache.avro.Schema.Parser parser14 = parser9.addTypes(strMap13);
        org.apache.avro.Schema.Parser parser15 = parser0.addTypes(strMap13);
        org.apache.avro.Schema.Parser parser17 = parser0.setValidate(true);
        java.io.InputStream inputStream18 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.avro.Schema schema19 = parser17.parse(inputStream18);
            org.junit.Assert.fail("Expected exception of type java.io.EOFException; message: No content to map to Object due to end of input");
        } catch (java.io.EOFException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strMap1);
        org.junit.Assert.assertNotNull(parser4);
        org.junit.Assert.assertNotNull(strMap5);
        org.junit.Assert.assertNotNull(parser6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(strMap10);
        org.junit.Assert.assertNotNull(strMap11);
        org.junit.Assert.assertNotNull(strMap13);
        org.junit.Assert.assertNotNull(parser14);
        org.junit.Assert.assertNotNull(parser15);
        org.junit.Assert.assertNotNull(parser17);
    }

    @Test
    public void test0191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SchemaM3Random300Test0.test0191");
        org.apache.avro.Schema[] schemaArray0 = new org.apache.avro.Schema[] {};
        java.util.ArrayList<org.apache.avro.Schema> schemaList1 = new java.util.ArrayList<org.apache.avro.Schema>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<org.apache.avro.Schema>) schemaList1, schemaArray0);
        org.apache.avro.Schema schema3 = org.apache.avro.Schema.createUnion((java.util.List<org.apache.avro.Schema>) schemaList1);
        java.util.List<org.apache.avro.Schema> schemaList4 = schema3.getTypes();
        org.apache.avro.Schema.Type type5 = schema3.getType();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.avro.Schema schema6 = org.apache.avro.Schema.create(type5);
            org.junit.Assert.fail("Expected exception of type org.apache.avro.AvroRuntimeException; message: Can't create a: UNION");
        } catch (org.apache.avro.AvroRuntimeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(schemaArray0);
        org.junit.Assert.assertArrayEquals(schemaArray0, new org.apache.avro.Schema[] {});
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(schema3);
        org.junit.Assert.assertNotNull(schemaList4);
        org.junit.Assert.assertTrue("'" + type5 + "' != '" + org.apache.avro.Schema.Type.UNION + "'", type5.equals(org.apache.avro.Schema.Type.UNION));
    }

    @Test
    public void test0192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SchemaM3Random300Test0.test0192");
        org.apache.avro.Schema[] schemaArray0 = new org.apache.avro.Schema[] {};
        java.util.ArrayList<org.apache.avro.Schema> schemaList1 = new java.util.ArrayList<org.apache.avro.Schema>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<org.apache.avro.Schema>) schemaList1, schemaArray0);
        org.apache.avro.Schema schema3 = org.apache.avro.Schema.createUnion((java.util.List<org.apache.avro.Schema>) schemaList1);
        org.apache.avro.Schema[] schemaArray4 = new org.apache.avro.Schema[] {};
        java.util.ArrayList<org.apache.avro.Schema> schemaList5 = new java.util.ArrayList<org.apache.avro.Schema>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<org.apache.avro.Schema>) schemaList5, schemaArray4);
        org.apache.avro.Schema schema7 = org.apache.avro.Schema.createUnion((java.util.List<org.apache.avro.Schema>) schemaList5);
        org.apache.avro.Schema schema8 = org.apache.avro.Schema.applyAliases(schema3, schema7);
        java.util.List<org.apache.avro.Schema> schemaList9 = schema8.getTypes();
        org.apache.avro.Schema[] schemaArray10 = new org.apache.avro.Schema[] {};
        java.util.ArrayList<org.apache.avro.Schema> schemaList11 = new java.util.ArrayList<org.apache.avro.Schema>();
        boolean boolean12 = java.util.Collections.addAll((java.util.Collection<org.apache.avro.Schema>) schemaList11, schemaArray10);
        org.apache.avro.Schema schema13 = org.apache.avro.Schema.createUnion((java.util.List<org.apache.avro.Schema>) schemaList11);
        org.apache.avro.Schema[] schemaArray14 = new org.apache.avro.Schema[] {};
        java.util.ArrayList<org.apache.avro.Schema> schemaList15 = new java.util.ArrayList<org.apache.avro.Schema>();
        boolean boolean16 = java.util.Collections.addAll((java.util.Collection<org.apache.avro.Schema>) schemaList15, schemaArray14);
        org.apache.avro.Schema schema17 = org.apache.avro.Schema.createUnion((java.util.List<org.apache.avro.Schema>) schemaList15);
        org.apache.avro.Schema schema18 = org.apache.avro.Schema.applyAliases(schema13, schema17);
        org.apache.avro.Schema schema19 = org.apache.avro.Schema.applyAliases(schema8, schema17);
        java.lang.String str20 = schema17.toString();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.avro.Schema schema21 = schema17.getValueType();
            org.junit.Assert.fail("Expected exception of type org.apache.avro.AvroRuntimeException; message: Not a map: []");
        } catch (org.apache.avro.AvroRuntimeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(schemaArray0);
        org.junit.Assert.assertArrayEquals(schemaArray0, new org.apache.avro.Schema[] {});
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(schema3);
        org.junit.Assert.assertNotNull(schemaArray4);
        org.junit.Assert.assertArrayEquals(schemaArray4, new org.apache.avro.Schema[] {});
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(schema7);
        org.junit.Assert.assertNotNull(schema8);
        org.junit.Assert.assertNotNull(schemaList9);
        org.junit.Assert.assertNotNull(schemaArray10);
        org.junit.Assert.assertArrayEquals(schemaArray10, new org.apache.avro.Schema[] {});
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(schema13);
        org.junit.Assert.assertNotNull(schemaArray14);
        org.junit.Assert.assertArrayEquals(schemaArray14, new org.apache.avro.Schema[] {});
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(schema17);
        org.junit.Assert.assertNotNull(schema18);
        org.junit.Assert.assertNotNull(schema19);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "[]" + "'", str20, "[]");
    }

    @Test
    public void test0193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SchemaM3Random300Test0.test0193");
        org.apache.avro.Schema[] schemaArray0 = new org.apache.avro.Schema[] {};
        java.util.ArrayList<org.apache.avro.Schema> schemaList1 = new java.util.ArrayList<org.apache.avro.Schema>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<org.apache.avro.Schema>) schemaList1, schemaArray0);
        org.apache.avro.Schema schema3 = org.apache.avro.Schema.createUnion((java.util.List<org.apache.avro.Schema>) schemaList1);
        org.apache.avro.Schema[] schemaArray4 = new org.apache.avro.Schema[] {};
        java.util.ArrayList<org.apache.avro.Schema> schemaList5 = new java.util.ArrayList<org.apache.avro.Schema>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<org.apache.avro.Schema>) schemaList5, schemaArray4);
        org.apache.avro.Schema schema7 = org.apache.avro.Schema.createUnion((java.util.List<org.apache.avro.Schema>) schemaList5);
        org.apache.avro.Schema schema8 = org.apache.avro.Schema.applyAliases(schema3, schema7);
        org.apache.avro.Schema.Type type9 = schema7.getType();
        org.apache.avro.Schema schema10 = org.apache.avro.Schema.createMap(schema7);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.avro.Schema.Field field12 = schema7.getField("[].union");
            org.junit.Assert.fail("Expected exception of type org.apache.avro.AvroRuntimeException; message: Not a record: []");
        } catch (org.apache.avro.AvroRuntimeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(schemaArray0);
        org.junit.Assert.assertArrayEquals(schemaArray0, new org.apache.avro.Schema[] {});
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(schema3);
        org.junit.Assert.assertNotNull(schemaArray4);
        org.junit.Assert.assertArrayEquals(schemaArray4, new org.apache.avro.Schema[] {});
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(schema7);
        org.junit.Assert.assertNotNull(schema8);
        org.junit.Assert.assertTrue("'" + type9 + "' != '" + org.apache.avro.Schema.Type.UNION + "'", type9.equals(org.apache.avro.Schema.Type.UNION));
        org.junit.Assert.assertNotNull(schema10);
    }

    @Test
    public void test0194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SchemaM3Random300Test0.test0194");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.avro.Schema schema2 = org.apache.avro.Schema.parse("union type:UNION pos:-1", false);
            org.junit.Assert.fail("Expected exception of type org.apache.avro.SchemaParseException; message: org.codehaus.jackson.JsonParseException: Unexpected character ('u' (code 117)): expected a valid value (number, String, array, object, 'true', 'false' or 'null')? at [Source: java.io.StringReader@40a811c4; line: 1, column: 2]");
        } catch (org.apache.avro.SchemaParseException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SchemaM3Random300Test0.test0195");
        org.apache.avro.Schema.Parser parser0 = new org.apache.avro.Schema.Parser();
        java.util.Map<java.lang.String, org.apache.avro.Schema> strMap1 = parser0.getTypes();
        org.apache.avro.Schema.Parser parser2 = new org.apache.avro.Schema.Parser();
        org.apache.avro.Schema.Parser parser4 = parser2.setValidate(true);
        java.util.Map<java.lang.String, org.apache.avro.Schema> strMap5 = parser2.getTypes();
        org.apache.avro.Schema.Parser parser6 = parser0.addTypes(strMap5);
        boolean boolean7 = parser0.getValidate();
        boolean boolean8 = parser0.getValidate();
        org.apache.avro.Schema.Parser parser9 = new org.apache.avro.Schema.Parser();
        java.util.Map<java.lang.String, org.apache.avro.Schema> strMap10 = parser9.getTypes();
        java.util.Map<java.lang.String, org.apache.avro.Schema> strMap11 = parser9.getTypes();
        org.apache.avro.Schema.Parser parser12 = new org.apache.avro.Schema.Parser();
        java.util.Map<java.lang.String, org.apache.avro.Schema> strMap13 = parser12.getTypes();
        org.apache.avro.Schema.Parser parser14 = parser9.addTypes(strMap13);
        org.apache.avro.Schema.Parser parser15 = parser0.addTypes(strMap13);
        java.io.File file16 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.avro.Schema schema17 = parser15.parse(file16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strMap1);
        org.junit.Assert.assertNotNull(parser4);
        org.junit.Assert.assertNotNull(strMap5);
        org.junit.Assert.assertNotNull(parser6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(strMap10);
        org.junit.Assert.assertNotNull(strMap11);
        org.junit.Assert.assertNotNull(strMap13);
        org.junit.Assert.assertNotNull(parser14);
        org.junit.Assert.assertNotNull(parser15);
    }

    @Test
    public void test0196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SchemaM3Random300Test0.test0196");
        org.apache.avro.Schema[] schemaArray0 = new org.apache.avro.Schema[] {};
        java.util.ArrayList<org.apache.avro.Schema> schemaList1 = new java.util.ArrayList<org.apache.avro.Schema>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<org.apache.avro.Schema>) schemaList1, schemaArray0);
        org.apache.avro.Schema schema3 = org.apache.avro.Schema.createUnion((java.util.List<org.apache.avro.Schema>) schemaList1);
        org.apache.avro.Schema[] schemaArray4 = new org.apache.avro.Schema[] {};
        java.util.ArrayList<org.apache.avro.Schema> schemaList5 = new java.util.ArrayList<org.apache.avro.Schema>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<org.apache.avro.Schema>) schemaList5, schemaArray4);
        org.apache.avro.Schema schema7 = org.apache.avro.Schema.createUnion((java.util.List<org.apache.avro.Schema>) schemaList5);
        org.apache.avro.Schema schema8 = org.apache.avro.Schema.applyAliases(schema3, schema7);
        org.apache.avro.Schema.Type type9 = schema7.getType();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.avro.Schema schema10 = org.apache.avro.Schema.create(type9);
            org.junit.Assert.fail("Expected exception of type org.apache.avro.AvroRuntimeException; message: Can't create a: UNION");
        } catch (org.apache.avro.AvroRuntimeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(schemaArray0);
        org.junit.Assert.assertArrayEquals(schemaArray0, new org.apache.avro.Schema[] {});
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(schema3);
        org.junit.Assert.assertNotNull(schemaArray4);
        org.junit.Assert.assertArrayEquals(schemaArray4, new org.apache.avro.Schema[] {});
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(schema7);
        org.junit.Assert.assertNotNull(schema8);
        org.junit.Assert.assertTrue("'" + type9 + "' != '" + org.apache.avro.Schema.Type.UNION + "'", type9.equals(org.apache.avro.Schema.Type.UNION));
    }

    @Test
    public void test0197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SchemaM3Random300Test0.test0197");
        // The following exception was thrown during execution in test generation
        try {
            org.codehaus.jackson.JsonNode jsonNode1 = org.apache.avro.Schema.parseJson("array");
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: org.codehaus.jackson.JsonParseException: Unexpected character ('a' (code 97)): expected a valid value (number, String, array, object, 'true', 'false' or 'null')? at [Source: java.io.StringReader@4ca02c07; line: 1, column: 2]");
        } catch (java.lang.RuntimeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SchemaM3Random300Test0.test0198");
        org.apache.avro.Schema.LockableArrayList<java.lang.Class<?>> wildcardClassList1 = new org.apache.avro.Schema.LockableArrayList<java.lang.Class<?>>((int) 'a');
    }

    @Test
    public void test0199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SchemaM3Random300Test0.test0199");
        org.apache.avro.Schema.LockableArrayList<java.lang.String> strList4 = new org.apache.avro.Schema.LockableArrayList<java.lang.String>((int) (byte) 10);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.avro.Schema schema5 = org.apache.avro.Schema.createEnum("{\"type\":\"map\",\"values\":[]}", "hi!", "{\"type\":\"record\",\"fields\":[]}", (java.util.List<java.lang.String>) strList4);
            org.junit.Assert.fail("Expected exception of type org.apache.avro.SchemaParseException; message: Illegal initial character: {\"type\":\"map\",\"values\":[]}");
        } catch (org.apache.avro.SchemaParseException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SchemaM3Random300Test0.test0200");
        java.lang.String[] strArray13 = new java.lang.String[] { "union", "{\"type\":\"array\",\"items\":{\"type\":\"map\",\"values\":[]}}", "[ ]", "[]", "{\r\n  \"type\" : \"map\",\r\n  \"values\" : {\r\n    \"type\" : \"map\",\r\n    \"values\" : [ ]\r\n  }\r\n}", "[ ]", "hi!", "{\"type\":\"map\",\"values\":[]}", "{\"type\":\"map\",\"values\":[]}", "{\"type\":\"array\",\"items\":[]}" };
        java.util.ArrayList<java.lang.String> strList14 = new java.util.ArrayList<java.lang.String>();
        boolean boolean15 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList14, strArray13);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.avro.Schema schema16 = org.apache.avro.Schema.createEnum("{}", "{\"type\":\"map\",\"values\":[]}", "{\r\n  \"type\" : \"array\",\r\n  \"items\" : {\r\n    \"type\" : \"map\",\r\n    \"values\" : [ ]\r\n  }\r\n}", (java.util.List<java.lang.String>) strList14);
            org.junit.Assert.fail("Expected exception of type org.apache.avro.SchemaParseException; message: Illegal initial character: {}");
        } catch (org.apache.avro.SchemaParseException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray13);
        org.junit.Assert.assertArrayEquals(strArray13, new java.lang.String[] { "union", "{\"type\":\"array\",\"items\":{\"type\":\"map\",\"values\":[]}}", "[ ]", "[]", "{\r\n  \"type\" : \"map\",\r\n  \"values\" : {\r\n    \"type\" : \"map\",\r\n    \"values\" : [ ]\r\n  }\r\n}", "[ ]", "hi!", "{\"type\":\"map\",\"values\":[]}", "{\"type\":\"map\",\"values\":[]}", "{\"type\":\"array\",\"items\":[]}" });
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
    }

    @Test
    public void test0201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SchemaM3Random300Test0.test0201");
        org.apache.avro.Schema schema4 = org.apache.avro.Schema.createFixed("union", "[ ]", "[]", 0);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.avro.Schema schema5 = schema4.getValueType();
            org.junit.Assert.fail("Expected exception of type org.apache.avro.AvroRuntimeException; message: Not a map: {\"type\":\"fixed\",\"name\":\"union\",\"namespace\":\"[]\",\"doc\":\"[ ]\",\"size\":0}");
        } catch (org.apache.avro.AvroRuntimeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(schema4);
    }

    @Test
    public void test0202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SchemaM3Random300Test0.test0202");
        org.apache.avro.Schema.Names names0 = new org.apache.avro.Schema.Names();
        names0.space("[ ]");
        java.lang.Object obj3 = names0.clone();
        java.lang.String str4 = names0.space();
        org.junit.Assert.assertNotNull(obj3);
        org.junit.Assert.assertEquals(obj3.toString(), "{}");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj3), "{}");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj3), "{}");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "[ ]" + "'", str4, "[ ]");
    }

    @Test
    public void test0203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SchemaM3Random300Test0.test0203");
        org.apache.avro.Schema[] schemaArray0 = new org.apache.avro.Schema[] {};
        java.util.ArrayList<org.apache.avro.Schema> schemaList1 = new java.util.ArrayList<org.apache.avro.Schema>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<org.apache.avro.Schema>) schemaList1, schemaArray0);
        org.apache.avro.Schema schema3 = org.apache.avro.Schema.createUnion((java.util.List<org.apache.avro.Schema>) schemaList1);
        org.apache.avro.Schema[] schemaArray4 = new org.apache.avro.Schema[] {};
        java.util.ArrayList<org.apache.avro.Schema> schemaList5 = new java.util.ArrayList<org.apache.avro.Schema>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<org.apache.avro.Schema>) schemaList5, schemaArray4);
        org.apache.avro.Schema schema7 = org.apache.avro.Schema.createUnion((java.util.List<org.apache.avro.Schema>) schemaList5);
        org.apache.avro.Schema schema8 = org.apache.avro.Schema.applyAliases(schema3, schema7);
        java.util.List<org.apache.avro.Schema> schemaList9 = schema8.getTypes();
        boolean boolean11 = schema8.equals((java.lang.Object) "hi!");
        java.lang.String str13 = schema8.getProp("[ ]");
        org.apache.avro.Schema schema14 = org.apache.avro.Schema.createArray(schema8);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str15 = schema14.getNamespace();
            org.junit.Assert.fail("Expected exception of type org.apache.avro.AvroRuntimeException; message: Not a named type: {\"type\":\"array\",\"items\":[]}");
        } catch (org.apache.avro.AvroRuntimeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(schemaArray0);
        org.junit.Assert.assertArrayEquals(schemaArray0, new org.apache.avro.Schema[] {});
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(schema3);
        org.junit.Assert.assertNotNull(schemaArray4);
        org.junit.Assert.assertArrayEquals(schemaArray4, new org.apache.avro.Schema[] {});
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(schema7);
        org.junit.Assert.assertNotNull(schema8);
        org.junit.Assert.assertNotNull(schemaList9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNotNull(schema14);
    }

    @Test
    public void test0204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SchemaM3Random300Test0.test0204");
        org.apache.avro.Schema[] schemaArray0 = new org.apache.avro.Schema[] {};
        java.util.ArrayList<org.apache.avro.Schema> schemaList1 = new java.util.ArrayList<org.apache.avro.Schema>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<org.apache.avro.Schema>) schemaList1, schemaArray0);
        org.apache.avro.Schema schema3 = org.apache.avro.Schema.createUnion((java.util.List<org.apache.avro.Schema>) schemaList1);
        java.lang.String str4 = schema3.getFullName();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.avro.Schema schema5 = schema3.getValueType();
            org.junit.Assert.fail("Expected exception of type org.apache.avro.AvroRuntimeException; message: Not a map: []");
        } catch (org.apache.avro.AvroRuntimeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(schemaArray0);
        org.junit.Assert.assertArrayEquals(schemaArray0, new org.apache.avro.Schema[] {});
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(schema3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "union" + "'", str4, "union");
    }

    @Test
    public void test0205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SchemaM3Random300Test0.test0205");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.avro.Schema schema4 = org.apache.avro.Schema.createRecord("{\r\n  \"type\" : \"map\",\r\n  \"values\" : {\r\n    \"type\" : \"map\",\r\n    \"values\" : [ ]\r\n  }\r\n}", "map", "{}", true);
            org.junit.Assert.fail("Expected exception of type org.apache.avro.SchemaParseException; message: Illegal initial character: {??  \"type\" : \"map\",??  \"values\" : {??    \"type\" : \"map\",??    \"values\" : [ ]??  }??}");
        } catch (org.apache.avro.SchemaParseException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SchemaM3Random300Test0.test0206");
        org.apache.avro.Schema.Parser parser0 = new org.apache.avro.Schema.Parser();
        java.util.Map<java.lang.String, org.apache.avro.Schema> strMap1 = parser0.getTypes();
        java.util.Map<java.lang.String, org.apache.avro.Schema> strMap2 = parser0.getTypes();
        org.apache.avro.Schema.Parser parser3 = new org.apache.avro.Schema.Parser();
        org.apache.avro.Schema.Parser parser5 = parser3.setValidate(true);
        java.util.Map<java.lang.String, org.apache.avro.Schema> strMap6 = parser3.getTypes();
        org.apache.avro.Schema.Parser parser7 = parser0.addTypes(strMap6);
        org.apache.avro.Schema schema9 = parser7.parse("{\"type\":\"map\",\"values\":[]}");
        boolean boolean10 = parser7.getValidate();
        java.io.File file11 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.avro.Schema schema12 = parser7.parse(file11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strMap1);
        org.junit.Assert.assertNotNull(strMap2);
        org.junit.Assert.assertNotNull(parser5);
        org.junit.Assert.assertNotNull(strMap6);
        org.junit.Assert.assertNotNull(parser7);
        org.junit.Assert.assertNotNull(schema9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test0207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SchemaM3Random300Test0.test0207");
        org.apache.avro.Schema schema2 = org.apache.avro.Schema.parse("[].union", false);
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<java.lang.String> strList3 = schema2.getEnumSymbols();
            org.junit.Assert.fail("Expected exception of type org.apache.avro.AvroRuntimeException; message: Not an enum: []");
        } catch (org.apache.avro.AvroRuntimeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(schema2);
    }

    @Test
    public void test0208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SchemaM3Random300Test0.test0208");
        org.apache.avro.Schema[] schemaArray0 = new org.apache.avro.Schema[] {};
        java.util.ArrayList<org.apache.avro.Schema> schemaList1 = new java.util.ArrayList<org.apache.avro.Schema>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<org.apache.avro.Schema>) schemaList1, schemaArray0);
        org.apache.avro.Schema schema3 = org.apache.avro.Schema.createUnion((java.util.List<org.apache.avro.Schema>) schemaList1);
        org.apache.avro.Schema[] schemaArray4 = new org.apache.avro.Schema[] {};
        java.util.ArrayList<org.apache.avro.Schema> schemaList5 = new java.util.ArrayList<org.apache.avro.Schema>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<org.apache.avro.Schema>) schemaList5, schemaArray4);
        org.apache.avro.Schema schema7 = org.apache.avro.Schema.createUnion((java.util.List<org.apache.avro.Schema>) schemaList5);
        org.apache.avro.Schema schema8 = org.apache.avro.Schema.applyAliases(schema3, schema7);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.avro.Schema schema9 = schema8.getValueType();
            org.junit.Assert.fail("Expected exception of type org.apache.avro.AvroRuntimeException; message: Not a map: []");
        } catch (org.apache.avro.AvroRuntimeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(schemaArray0);
        org.junit.Assert.assertArrayEquals(schemaArray0, new org.apache.avro.Schema[] {});
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(schema3);
        org.junit.Assert.assertNotNull(schemaArray4);
        org.junit.Assert.assertArrayEquals(schemaArray4, new org.apache.avro.Schema[] {});
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(schema7);
        org.junit.Assert.assertNotNull(schema8);
    }

    @Test
    public void test0209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SchemaM3Random300Test0.test0209");
        java.util.List<org.apache.avro.Schema> schemaList0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.avro.Schema schema1 = org.apache.avro.Schema.createUnion(schemaList0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SchemaM3Random300Test0.test0210");
        org.apache.avro.Schema.Names names0 = new org.apache.avro.Schema.Names();
        names0.space("[ ]");
        java.lang.Object obj3 = names0.clone();
        org.apache.avro.Schema.Type type4 = org.apache.avro.Schema.Type.RECORD;
        boolean boolean5 = names0.containsKey((java.lang.Object) type4);
        java.util.Collection<org.apache.avro.Schema> schemaCollection6 = names0.values();
        org.junit.Assert.assertNotNull(obj3);
        org.junit.Assert.assertEquals(obj3.toString(), "{}");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj3), "{}");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj3), "{}");
        org.junit.Assert.assertTrue("'" + type4 + "' != '" + org.apache.avro.Schema.Type.RECORD + "'", type4.equals(org.apache.avro.Schema.Type.RECORD));
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(schemaCollection6);
    }

    @Test
    public void test0211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SchemaM3Random300Test0.test0211");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.avro.Schema schema4 = org.apache.avro.Schema.createFixed("{\"type\":\"array\",\"items\":[]}", "union", "hi!", (int) '4');
            org.junit.Assert.fail("Expected exception of type org.apache.avro.SchemaParseException; message: Illegal initial character: {\"type\":\"array\",\"items\":[]}");
        } catch (org.apache.avro.SchemaParseException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SchemaM3Random300Test0.test0212");
        org.apache.avro.Schema[] schemaArray0 = new org.apache.avro.Schema[] {};
        java.util.ArrayList<org.apache.avro.Schema> schemaList1 = new java.util.ArrayList<org.apache.avro.Schema>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<org.apache.avro.Schema>) schemaList1, schemaArray0);
        org.apache.avro.Schema schema3 = org.apache.avro.Schema.createUnion((java.util.List<org.apache.avro.Schema>) schemaList1);
        org.apache.avro.Schema[] schemaArray4 = new org.apache.avro.Schema[] {};
        java.util.ArrayList<org.apache.avro.Schema> schemaList5 = new java.util.ArrayList<org.apache.avro.Schema>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<org.apache.avro.Schema>) schemaList5, schemaArray4);
        org.apache.avro.Schema schema7 = org.apache.avro.Schema.createUnion((java.util.List<org.apache.avro.Schema>) schemaList5);
        org.apache.avro.Schema schema8 = org.apache.avro.Schema.applyAliases(schema3, schema7);
        java.util.List<org.apache.avro.Schema> schemaList9 = schema8.getTypes();
        org.apache.avro.Schema schema10 = org.apache.avro.Schema.createUnion(schemaList9);
        java.lang.String str11 = schema10.getDoc();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean13 = schema10.hasEnumSymbol("{\r\n  \"type\" : \"map\",\r\n  \"values\" : {\r\n    \"type\" : \"map\",\r\n    \"values\" : [ ]\r\n  }\r\n}");
            org.junit.Assert.fail("Expected exception of type org.apache.avro.AvroRuntimeException; message: Not an enum: []");
        } catch (org.apache.avro.AvroRuntimeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(schemaArray0);
        org.junit.Assert.assertArrayEquals(schemaArray0, new org.apache.avro.Schema[] {});
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(schema3);
        org.junit.Assert.assertNotNull(schemaArray4);
        org.junit.Assert.assertArrayEquals(schemaArray4, new org.apache.avro.Schema[] {});
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(schema7);
        org.junit.Assert.assertNotNull(schema8);
        org.junit.Assert.assertNotNull(schemaList9);
        org.junit.Assert.assertNotNull(schema10);
        org.junit.Assert.assertNull(str11);
    }

    @Test
    public void test0213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SchemaM3Random300Test0.test0213");
        org.apache.avro.Schema[] schemaArray0 = new org.apache.avro.Schema[] {};
        java.util.ArrayList<org.apache.avro.Schema> schemaList1 = new java.util.ArrayList<org.apache.avro.Schema>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<org.apache.avro.Schema>) schemaList1, schemaArray0);
        org.apache.avro.Schema schema3 = org.apache.avro.Schema.createUnion((java.util.List<org.apache.avro.Schema>) schemaList1);
        org.apache.avro.Schema[] schemaArray4 = new org.apache.avro.Schema[] {};
        java.util.ArrayList<org.apache.avro.Schema> schemaList5 = new java.util.ArrayList<org.apache.avro.Schema>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<org.apache.avro.Schema>) schemaList5, schemaArray4);
        org.apache.avro.Schema schema7 = org.apache.avro.Schema.createUnion((java.util.List<org.apache.avro.Schema>) schemaList5);
        org.apache.avro.Schema schema8 = org.apache.avro.Schema.applyAliases(schema3, schema7);
        java.lang.String str9 = schema8.getFullName();
        org.junit.Assert.assertNotNull(schemaArray0);
        org.junit.Assert.assertArrayEquals(schemaArray0, new org.apache.avro.Schema[] {});
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(schema3);
        org.junit.Assert.assertNotNull(schemaArray4);
        org.junit.Assert.assertArrayEquals(schemaArray4, new org.apache.avro.Schema[] {});
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(schema7);
        org.junit.Assert.assertNotNull(schema8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "union" + "'", str9, "union");
    }

    @Test
    public void test0214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SchemaM3Random300Test0.test0214");
        org.apache.avro.Schema[] schemaArray0 = new org.apache.avro.Schema[] {};
        java.util.ArrayList<org.apache.avro.Schema> schemaList1 = new java.util.ArrayList<org.apache.avro.Schema>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<org.apache.avro.Schema>) schemaList1, schemaArray0);
        org.apache.avro.Schema schema3 = org.apache.avro.Schema.createUnion((java.util.List<org.apache.avro.Schema>) schemaList1);
        org.apache.avro.Schema[] schemaArray4 = new org.apache.avro.Schema[] {};
        java.util.ArrayList<org.apache.avro.Schema> schemaList5 = new java.util.ArrayList<org.apache.avro.Schema>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<org.apache.avro.Schema>) schemaList5, schemaArray4);
        org.apache.avro.Schema schema7 = org.apache.avro.Schema.createUnion((java.util.List<org.apache.avro.Schema>) schemaList5);
        org.apache.avro.Schema schema8 = org.apache.avro.Schema.applyAliases(schema3, schema7);
        org.apache.avro.Schema.Type type9 = schema7.getType();
        org.apache.avro.Schema schema10 = org.apache.avro.Schema.createMap(schema7);
        org.apache.avro.Schema.Names names11 = new org.apache.avro.Schema.Names();
        java.lang.String str12 = names11.space();
        names11.space("");
        boolean boolean15 = schema7.equals((java.lang.Object) "");
        java.lang.String str16 = schema7.getFullName();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.avro.Schema schema17 = schema7.getValueType();
            org.junit.Assert.fail("Expected exception of type org.apache.avro.AvroRuntimeException; message: Not a map: []");
        } catch (org.apache.avro.AvroRuntimeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(schemaArray0);
        org.junit.Assert.assertArrayEquals(schemaArray0, new org.apache.avro.Schema[] {});
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(schema3);
        org.junit.Assert.assertNotNull(schemaArray4);
        org.junit.Assert.assertArrayEquals(schemaArray4, new org.apache.avro.Schema[] {});
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(schema7);
        org.junit.Assert.assertNotNull(schema8);
        org.junit.Assert.assertTrue("'" + type9 + "' != '" + org.apache.avro.Schema.Type.UNION + "'", type9.equals(org.apache.avro.Schema.Type.UNION));
        org.junit.Assert.assertNotNull(schema10);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "union" + "'", str16, "union");
    }

    @Test
    public void test0215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SchemaM3Random300Test0.test0215");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.avro.Schema schema1 = org.apache.avro.Schema.parse("{\r\n  \"type\" : \"record\",\r\n  \"fields\" : [ ]\r\n}");
            org.junit.Assert.fail("Expected exception of type org.apache.avro.SchemaParseException; message: No name in schema: {\"type\":\"record\",\"fields\":[]}");
        } catch (org.apache.avro.SchemaParseException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SchemaM3Random300Test0.test0216");
        org.apache.avro.Schema.Names names0 = new org.apache.avro.Schema.Names();
        org.apache.avro.Schema[] schemaArray2 = new org.apache.avro.Schema[] {};
        java.util.ArrayList<org.apache.avro.Schema> schemaList3 = new java.util.ArrayList<org.apache.avro.Schema>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<org.apache.avro.Schema>) schemaList3, schemaArray2);
        org.apache.avro.Schema schema5 = org.apache.avro.Schema.createUnion((java.util.List<org.apache.avro.Schema>) schemaList3);
        org.apache.avro.Schema[] schemaArray6 = new org.apache.avro.Schema[] {};
        java.util.ArrayList<org.apache.avro.Schema> schemaList7 = new java.util.ArrayList<org.apache.avro.Schema>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<org.apache.avro.Schema>) schemaList7, schemaArray6);
        org.apache.avro.Schema schema9 = org.apache.avro.Schema.createUnion((java.util.List<org.apache.avro.Schema>) schemaList7);
        org.apache.avro.Schema schema10 = org.apache.avro.Schema.applyAliases(schema5, schema9);
        java.util.List<org.apache.avro.Schema> schemaList11 = schema10.getTypes();
        org.apache.avro.Schema[] schemaArray12 = new org.apache.avro.Schema[] {};
        java.util.ArrayList<org.apache.avro.Schema> schemaList13 = new java.util.ArrayList<org.apache.avro.Schema>();
        boolean boolean14 = java.util.Collections.addAll((java.util.Collection<org.apache.avro.Schema>) schemaList13, schemaArray12);
        org.apache.avro.Schema schema15 = org.apache.avro.Schema.createUnion((java.util.List<org.apache.avro.Schema>) schemaList13);
        org.apache.avro.Schema[] schemaArray16 = new org.apache.avro.Schema[] {};
        java.util.ArrayList<org.apache.avro.Schema> schemaList17 = new java.util.ArrayList<org.apache.avro.Schema>();
        boolean boolean18 = java.util.Collections.addAll((java.util.Collection<org.apache.avro.Schema>) schemaList17, schemaArray16);
        org.apache.avro.Schema schema19 = org.apache.avro.Schema.createUnion((java.util.List<org.apache.avro.Schema>) schemaList17);
        org.apache.avro.Schema schema20 = org.apache.avro.Schema.applyAliases(schema15, schema19);
        org.apache.avro.Schema schema21 = org.apache.avro.Schema.applyAliases(schema10, schema19);
        org.apache.avro.Schema schema22 = names0.getOrDefault((java.lang.Object) 100.0d, schema21);
        // The following exception was thrown during execution in test generation
        try {
            int int24 = schema21.getEnumOrdinal("[]");
            org.junit.Assert.fail("Expected exception of type org.apache.avro.AvroRuntimeException; message: Not an enum: []");
        } catch (org.apache.avro.AvroRuntimeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(schemaArray2);
        org.junit.Assert.assertArrayEquals(schemaArray2, new org.apache.avro.Schema[] {});
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(schema5);
        org.junit.Assert.assertNotNull(schemaArray6);
        org.junit.Assert.assertArrayEquals(schemaArray6, new org.apache.avro.Schema[] {});
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(schema9);
        org.junit.Assert.assertNotNull(schema10);
        org.junit.Assert.assertNotNull(schemaList11);
        org.junit.Assert.assertNotNull(schemaArray12);
        org.junit.Assert.assertArrayEquals(schemaArray12, new org.apache.avro.Schema[] {});
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(schema15);
        org.junit.Assert.assertNotNull(schemaArray16);
        org.junit.Assert.assertArrayEquals(schemaArray16, new org.apache.avro.Schema[] {});
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(schema19);
        org.junit.Assert.assertNotNull(schema20);
        org.junit.Assert.assertNotNull(schema21);
        org.junit.Assert.assertNotNull(schema22);
    }

    @Test
    public void test0217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SchemaM3Random300Test0.test0217");
        org.apache.avro.Schema[] schemaArray0 = new org.apache.avro.Schema[] {};
        java.util.ArrayList<org.apache.avro.Schema> schemaList1 = new java.util.ArrayList<org.apache.avro.Schema>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<org.apache.avro.Schema>) schemaList1, schemaArray0);
        org.apache.avro.Schema schema3 = org.apache.avro.Schema.createUnion((java.util.List<org.apache.avro.Schema>) schemaList1);
        org.apache.avro.Schema[] schemaArray4 = new org.apache.avro.Schema[] {};
        java.util.ArrayList<org.apache.avro.Schema> schemaList5 = new java.util.ArrayList<org.apache.avro.Schema>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<org.apache.avro.Schema>) schemaList5, schemaArray4);
        org.apache.avro.Schema schema7 = org.apache.avro.Schema.createUnion((java.util.List<org.apache.avro.Schema>) schemaList5);
        org.apache.avro.Schema schema8 = org.apache.avro.Schema.applyAliases(schema3, schema7);
        java.util.List<org.apache.avro.Schema> schemaList9 = schema8.getTypes();
        org.apache.avro.Schema[] schemaArray10 = new org.apache.avro.Schema[] {};
        java.util.ArrayList<org.apache.avro.Schema> schemaList11 = new java.util.ArrayList<org.apache.avro.Schema>();
        boolean boolean12 = java.util.Collections.addAll((java.util.Collection<org.apache.avro.Schema>) schemaList11, schemaArray10);
        org.apache.avro.Schema schema13 = org.apache.avro.Schema.createUnion((java.util.List<org.apache.avro.Schema>) schemaList11);
        org.apache.avro.Schema[] schemaArray14 = new org.apache.avro.Schema[] {};
        java.util.ArrayList<org.apache.avro.Schema> schemaList15 = new java.util.ArrayList<org.apache.avro.Schema>();
        boolean boolean16 = java.util.Collections.addAll((java.util.Collection<org.apache.avro.Schema>) schemaList15, schemaArray14);
        org.apache.avro.Schema schema17 = org.apache.avro.Schema.createUnion((java.util.List<org.apache.avro.Schema>) schemaList15);
        org.apache.avro.Schema schema18 = org.apache.avro.Schema.applyAliases(schema13, schema17);
        org.apache.avro.Schema schema19 = org.apache.avro.Schema.applyAliases(schema8, schema17);
        org.apache.avro.Schema schema20 = org.apache.avro.Schema.createMap(schema8);
        java.lang.String str21 = schema8.getName();
        java.lang.String str23 = schema8.toString(false);
        org.apache.avro.Schema schema24 = org.apache.avro.Schema.createArray(schema8);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str25 = schema8.getNamespace();
            org.junit.Assert.fail("Expected exception of type org.apache.avro.AvroRuntimeException; message: Not a named type: []");
        } catch (org.apache.avro.AvroRuntimeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(schemaArray0);
        org.junit.Assert.assertArrayEquals(schemaArray0, new org.apache.avro.Schema[] {});
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(schema3);
        org.junit.Assert.assertNotNull(schemaArray4);
        org.junit.Assert.assertArrayEquals(schemaArray4, new org.apache.avro.Schema[] {});
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(schema7);
        org.junit.Assert.assertNotNull(schema8);
        org.junit.Assert.assertNotNull(schemaList9);
        org.junit.Assert.assertNotNull(schemaArray10);
        org.junit.Assert.assertArrayEquals(schemaArray10, new org.apache.avro.Schema[] {});
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(schema13);
        org.junit.Assert.assertNotNull(schemaArray14);
        org.junit.Assert.assertArrayEquals(schemaArray14, new org.apache.avro.Schema[] {});
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(schema17);
        org.junit.Assert.assertNotNull(schema18);
        org.junit.Assert.assertNotNull(schema19);
        org.junit.Assert.assertNotNull(schema20);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "union" + "'", str21, "union");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "[]" + "'", str23, "[]");
        org.junit.Assert.assertNotNull(schema24);
    }

    @Test
    public void test0218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SchemaM3Random300Test0.test0218");
        org.apache.avro.Schema.Parser parser0 = new org.apache.avro.Schema.Parser();
        java.util.Map<java.lang.String, org.apache.avro.Schema> strMap1 = parser0.getTypes();
        java.util.Map<java.lang.String, org.apache.avro.Schema> strMap2 = parser0.getTypes();
        org.apache.avro.Schema.Parser parser3 = new org.apache.avro.Schema.Parser();
        java.util.Map<java.lang.String, org.apache.avro.Schema> strMap4 = parser3.getTypes();
        org.apache.avro.Schema.Parser parser5 = parser0.addTypes(strMap4);
        java.util.Map<java.lang.String, org.apache.avro.Schema> strMap6 = parser5.getTypes();
        java.io.File file7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.avro.Schema schema8 = parser5.parse(file7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strMap1);
        org.junit.Assert.assertNotNull(strMap2);
        org.junit.Assert.assertNotNull(strMap4);
        org.junit.Assert.assertNotNull(parser5);
        org.junit.Assert.assertNotNull(strMap6);
    }

    @Test
    public void test0219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SchemaM3Random300Test0.test0219");
        org.apache.avro.Schema[] schemaArray0 = new org.apache.avro.Schema[] {};
        java.util.ArrayList<org.apache.avro.Schema> schemaList1 = new java.util.ArrayList<org.apache.avro.Schema>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<org.apache.avro.Schema>) schemaList1, schemaArray0);
        org.apache.avro.Schema schema3 = org.apache.avro.Schema.createUnion((java.util.List<org.apache.avro.Schema>) schemaList1);
        org.apache.avro.Schema[] schemaArray4 = new org.apache.avro.Schema[] {};
        java.util.ArrayList<org.apache.avro.Schema> schemaList5 = new java.util.ArrayList<org.apache.avro.Schema>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<org.apache.avro.Schema>) schemaList5, schemaArray4);
        org.apache.avro.Schema schema7 = org.apache.avro.Schema.createUnion((java.util.List<org.apache.avro.Schema>) schemaList5);
        org.apache.avro.Schema schema8 = org.apache.avro.Schema.applyAliases(schema3, schema7);
        java.util.List<org.apache.avro.Schema> schemaList9 = schema8.getTypes();
        java.lang.String str11 = schema8.toString(true);
        java.lang.Class<?> wildcardClass12 = schema8.getClass();
        org.junit.Assert.assertNotNull(schemaArray0);
        org.junit.Assert.assertArrayEquals(schemaArray0, new org.apache.avro.Schema[] {});
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(schema3);
        org.junit.Assert.assertNotNull(schemaArray4);
        org.junit.Assert.assertArrayEquals(schemaArray4, new org.apache.avro.Schema[] {});
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(schema7);
        org.junit.Assert.assertNotNull(schema8);
        org.junit.Assert.assertNotNull(schemaList9);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "[ ]" + "'", str11, "[ ]");
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SchemaM3Random300Test0.test0220");
        org.apache.avro.Schema.LockableArrayList<org.apache.avro.Schema.LockableArrayList<java.lang.String>> strListList1 = new org.apache.avro.Schema.LockableArrayList<org.apache.avro.Schema.LockableArrayList<java.lang.String>>((int) (byte) 1);
    }

    @Test
    public void test0221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SchemaM3Random300Test0.test0221");
        org.apache.avro.Schema.Names names0 = new org.apache.avro.Schema.Names();
        org.apache.avro.Schema[] schemaArray2 = new org.apache.avro.Schema[] {};
        java.util.ArrayList<org.apache.avro.Schema> schemaList3 = new java.util.ArrayList<org.apache.avro.Schema>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<org.apache.avro.Schema>) schemaList3, schemaArray2);
        org.apache.avro.Schema schema5 = org.apache.avro.Schema.createUnion((java.util.List<org.apache.avro.Schema>) schemaList3);
        org.apache.avro.Schema[] schemaArray6 = new org.apache.avro.Schema[] {};
        java.util.ArrayList<org.apache.avro.Schema> schemaList7 = new java.util.ArrayList<org.apache.avro.Schema>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<org.apache.avro.Schema>) schemaList7, schemaArray6);
        org.apache.avro.Schema schema9 = org.apache.avro.Schema.createUnion((java.util.List<org.apache.avro.Schema>) schemaList7);
        org.apache.avro.Schema schema10 = org.apache.avro.Schema.applyAliases(schema5, schema9);
        java.util.List<org.apache.avro.Schema> schemaList11 = schema10.getTypes();
        org.apache.avro.Schema[] schemaArray12 = new org.apache.avro.Schema[] {};
        java.util.ArrayList<org.apache.avro.Schema> schemaList13 = new java.util.ArrayList<org.apache.avro.Schema>();
        boolean boolean14 = java.util.Collections.addAll((java.util.Collection<org.apache.avro.Schema>) schemaList13, schemaArray12);
        org.apache.avro.Schema schema15 = org.apache.avro.Schema.createUnion((java.util.List<org.apache.avro.Schema>) schemaList13);
        org.apache.avro.Schema[] schemaArray16 = new org.apache.avro.Schema[] {};
        java.util.ArrayList<org.apache.avro.Schema> schemaList17 = new java.util.ArrayList<org.apache.avro.Schema>();
        boolean boolean18 = java.util.Collections.addAll((java.util.Collection<org.apache.avro.Schema>) schemaList17, schemaArray16);
        org.apache.avro.Schema schema19 = org.apache.avro.Schema.createUnion((java.util.List<org.apache.avro.Schema>) schemaList17);
        org.apache.avro.Schema schema20 = org.apache.avro.Schema.applyAliases(schema15, schema19);
        org.apache.avro.Schema schema21 = org.apache.avro.Schema.applyAliases(schema10, schema19);
        org.apache.avro.Schema schema22 = names0.getOrDefault((java.lang.Object) 100.0d, schema21);
        org.apache.avro.Schema.Parser parser23 = new org.apache.avro.Schema.Parser();
        org.apache.avro.Schema.Parser parser25 = parser23.setValidate(true);
        java.util.Map<java.lang.String, org.apache.avro.Schema> strMap26 = parser23.getTypes();
        org.apache.avro.Schema.Parser parser28 = parser23.setValidate(true);
        org.apache.avro.Schema.Parser parser30 = parser23.setValidate(true);
        org.apache.avro.Schema[] schemaArray31 = new org.apache.avro.Schema[] {};
        java.util.ArrayList<org.apache.avro.Schema> schemaList32 = new java.util.ArrayList<org.apache.avro.Schema>();
        boolean boolean33 = java.util.Collections.addAll((java.util.Collection<org.apache.avro.Schema>) schemaList32, schemaArray31);
        org.apache.avro.Schema schema34 = org.apache.avro.Schema.createUnion((java.util.List<org.apache.avro.Schema>) schemaList32);
        org.apache.avro.Schema[] schemaArray35 = new org.apache.avro.Schema[] {};
        java.util.ArrayList<org.apache.avro.Schema> schemaList36 = new java.util.ArrayList<org.apache.avro.Schema>();
        boolean boolean37 = java.util.Collections.addAll((java.util.Collection<org.apache.avro.Schema>) schemaList36, schemaArray35);
        org.apache.avro.Schema schema38 = org.apache.avro.Schema.createUnion((java.util.List<org.apache.avro.Schema>) schemaList36);
        org.apache.avro.Schema schema39 = org.apache.avro.Schema.applyAliases(schema34, schema38);
        java.util.List<org.apache.avro.Schema> schemaList40 = schema39.getTypes();
        java.lang.String str42 = schema39.toString(true);
        org.apache.avro.Schema schema43 = names0.getOrDefault((java.lang.Object) true, schema39);
        org.apache.avro.Schema.Names names44 = null;
        org.codehaus.jackson.JsonGenerator jsonGenerator45 = null;
        // The following exception was thrown during execution in test generation
        try {
            schema43.toJson(names44, jsonGenerator45);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(schemaArray2);
        org.junit.Assert.assertArrayEquals(schemaArray2, new org.apache.avro.Schema[] {});
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(schema5);
        org.junit.Assert.assertNotNull(schemaArray6);
        org.junit.Assert.assertArrayEquals(schemaArray6, new org.apache.avro.Schema[] {});
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(schema9);
        org.junit.Assert.assertNotNull(schema10);
        org.junit.Assert.assertNotNull(schemaList11);
        org.junit.Assert.assertNotNull(schemaArray12);
        org.junit.Assert.assertArrayEquals(schemaArray12, new org.apache.avro.Schema[] {});
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(schema15);
        org.junit.Assert.assertNotNull(schemaArray16);
        org.junit.Assert.assertArrayEquals(schemaArray16, new org.apache.avro.Schema[] {});
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(schema19);
        org.junit.Assert.assertNotNull(schema20);
        org.junit.Assert.assertNotNull(schema21);
        org.junit.Assert.assertNotNull(schema22);
        org.junit.Assert.assertNotNull(parser25);
        org.junit.Assert.assertNotNull(strMap26);
        org.junit.Assert.assertNotNull(parser28);
        org.junit.Assert.assertNotNull(parser30);
        org.junit.Assert.assertNotNull(schemaArray31);
        org.junit.Assert.assertArrayEquals(schemaArray31, new org.apache.avro.Schema[] {});
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertNotNull(schema34);
        org.junit.Assert.assertNotNull(schemaArray35);
        org.junit.Assert.assertArrayEquals(schemaArray35, new org.apache.avro.Schema[] {});
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertNotNull(schema38);
        org.junit.Assert.assertNotNull(schema39);
        org.junit.Assert.assertNotNull(schemaList40);
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "[ ]" + "'", str42, "[ ]");
        org.junit.Assert.assertNotNull(schema43);
    }

    @Test
    public void test0222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SchemaM3Random300Test0.test0222");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.avro.Schema schema4 = org.apache.avro.Schema.createFixed("[]", "{\"type\":\"array\",\"items\":[]}", "union", (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type org.apache.avro.SchemaParseException; message: Illegal initial character: []");
        } catch (org.apache.avro.SchemaParseException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SchemaM3Random300Test0.test0223");
        org.apache.avro.Schema[] schemaArray0 = new org.apache.avro.Schema[] {};
        java.util.ArrayList<org.apache.avro.Schema> schemaList1 = new java.util.ArrayList<org.apache.avro.Schema>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<org.apache.avro.Schema>) schemaList1, schemaArray0);
        org.apache.avro.Schema schema3 = org.apache.avro.Schema.createUnion((java.util.List<org.apache.avro.Schema>) schemaList1);
        org.apache.avro.Schema[] schemaArray4 = new org.apache.avro.Schema[] {};
        java.util.ArrayList<org.apache.avro.Schema> schemaList5 = new java.util.ArrayList<org.apache.avro.Schema>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<org.apache.avro.Schema>) schemaList5, schemaArray4);
        org.apache.avro.Schema schema7 = org.apache.avro.Schema.createUnion((java.util.List<org.apache.avro.Schema>) schemaList5);
        org.apache.avro.Schema schema8 = org.apache.avro.Schema.applyAliases(schema3, schema7);
        java.util.List<org.apache.avro.Schema> schemaList9 = schema8.getTypes();
        java.lang.String str11 = schema8.getProp("hi!");
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<java.lang.String> strList12 = schema8.getEnumSymbols();
            org.junit.Assert.fail("Expected exception of type org.apache.avro.AvroRuntimeException; message: Not an enum: []");
        } catch (org.apache.avro.AvroRuntimeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(schemaArray0);
        org.junit.Assert.assertArrayEquals(schemaArray0, new org.apache.avro.Schema[] {});
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(schema3);
        org.junit.Assert.assertNotNull(schemaArray4);
        org.junit.Assert.assertArrayEquals(schemaArray4, new org.apache.avro.Schema[] {});
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(schema7);
        org.junit.Assert.assertNotNull(schema8);
        org.junit.Assert.assertNotNull(schemaList9);
        org.junit.Assert.assertNull(str11);
    }

    @Test
    public void test0224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SchemaM3Random300Test0.test0224");
        org.apache.avro.Schema[] schemaArray0 = new org.apache.avro.Schema[] {};
        java.util.ArrayList<org.apache.avro.Schema> schemaList1 = new java.util.ArrayList<org.apache.avro.Schema>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<org.apache.avro.Schema>) schemaList1, schemaArray0);
        org.apache.avro.Schema schema3 = org.apache.avro.Schema.createUnion((java.util.List<org.apache.avro.Schema>) schemaList1);
        org.apache.avro.Schema[] schemaArray4 = new org.apache.avro.Schema[] {};
        java.util.ArrayList<org.apache.avro.Schema> schemaList5 = new java.util.ArrayList<org.apache.avro.Schema>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<org.apache.avro.Schema>) schemaList5, schemaArray4);
        org.apache.avro.Schema schema7 = org.apache.avro.Schema.createUnion((java.util.List<org.apache.avro.Schema>) schemaList5);
        org.apache.avro.Schema schema8 = org.apache.avro.Schema.applyAliases(schema3, schema7);
        org.apache.avro.Schema.Type type9 = schema7.getType();
        org.apache.avro.Schema schema10 = org.apache.avro.Schema.createMap(schema7);
        org.apache.avro.Schema schema11 = schema10.getValueType();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str12 = schema10.getNamespace();
            org.junit.Assert.fail("Expected exception of type org.apache.avro.AvroRuntimeException; message: Not a named type: {\"type\":\"map\",\"values\":[]}");
        } catch (org.apache.avro.AvroRuntimeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(schemaArray0);
        org.junit.Assert.assertArrayEquals(schemaArray0, new org.apache.avro.Schema[] {});
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(schema3);
        org.junit.Assert.assertNotNull(schemaArray4);
        org.junit.Assert.assertArrayEquals(schemaArray4, new org.apache.avro.Schema[] {});
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(schema7);
        org.junit.Assert.assertNotNull(schema8);
        org.junit.Assert.assertTrue("'" + type9 + "' != '" + org.apache.avro.Schema.Type.UNION + "'", type9.equals(org.apache.avro.Schema.Type.UNION));
        org.junit.Assert.assertNotNull(schema10);
        org.junit.Assert.assertNotNull(schema11);
    }

    @Test
    public void test0225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SchemaM3Random300Test0.test0225");
        org.apache.avro.Schema.Parser parser0 = new org.apache.avro.Schema.Parser();
        java.util.Map<java.lang.String, org.apache.avro.Schema> strMap1 = parser0.getTypes();
        java.util.Map<java.lang.String, org.apache.avro.Schema> strMap2 = parser0.getTypes();
        org.apache.avro.Schema.Parser parser3 = new org.apache.avro.Schema.Parser();
        java.util.Map<java.lang.String, org.apache.avro.Schema> strMap4 = parser3.getTypes();
        org.apache.avro.Schema.Parser parser5 = parser0.addTypes(strMap4);
        org.apache.avro.Schema.Parser parser7 = parser0.setValidate(true);
        org.apache.avro.Schema.Parser parser9 = parser0.setValidate(false);
        boolean boolean10 = parser0.getValidate();
        org.junit.Assert.assertNotNull(strMap1);
        org.junit.Assert.assertNotNull(strMap2);
        org.junit.Assert.assertNotNull(strMap4);
        org.junit.Assert.assertNotNull(parser5);
        org.junit.Assert.assertNotNull(parser7);
        org.junit.Assert.assertNotNull(parser9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test0226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SchemaM3Random300Test0.test0226");
        org.apache.avro.Schema[] schemaArray0 = new org.apache.avro.Schema[] {};
        java.util.ArrayList<org.apache.avro.Schema> schemaList1 = new java.util.ArrayList<org.apache.avro.Schema>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<org.apache.avro.Schema>) schemaList1, schemaArray0);
        org.apache.avro.Schema schema3 = org.apache.avro.Schema.createUnion((java.util.List<org.apache.avro.Schema>) schemaList1);
        org.apache.avro.Schema[] schemaArray4 = new org.apache.avro.Schema[] {};
        java.util.ArrayList<org.apache.avro.Schema> schemaList5 = new java.util.ArrayList<org.apache.avro.Schema>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<org.apache.avro.Schema>) schemaList5, schemaArray4);
        org.apache.avro.Schema schema7 = org.apache.avro.Schema.createUnion((java.util.List<org.apache.avro.Schema>) schemaList5);
        org.apache.avro.Schema schema8 = org.apache.avro.Schema.applyAliases(schema3, schema7);
        java.util.List<org.apache.avro.Schema> schemaList9 = schema8.getTypes();
        boolean boolean11 = schema8.equals((java.lang.Object) "hi!");
        java.lang.String str12 = schema8.getDoc();
        org.apache.avro.Schema schema13 = org.apache.avro.Schema.createArray(schema8);
        java.lang.String str14 = schema8.getName();
        java.lang.String str15 = schema8.getFullName();
        org.junit.Assert.assertNotNull(schemaArray0);
        org.junit.Assert.assertArrayEquals(schemaArray0, new org.apache.avro.Schema[] {});
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(schema3);
        org.junit.Assert.assertNotNull(schemaArray4);
        org.junit.Assert.assertArrayEquals(schemaArray4, new org.apache.avro.Schema[] {});
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(schema7);
        org.junit.Assert.assertNotNull(schema8);
        org.junit.Assert.assertNotNull(schemaList9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNotNull(schema13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "union" + "'", str14, "union");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "union" + "'", str15, "union");
    }

    @Test
    public void test0227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SchemaM3Random300Test0.test0227");
        org.apache.avro.Schema.Parser parser0 = new org.apache.avro.Schema.Parser();
        org.apache.avro.Schema.Parser parser2 = parser0.setValidate(true);
        org.apache.avro.Schema.Parser parser4 = parser0.setValidate(true);
        org.apache.avro.Schema.Parser parser6 = parser0.setValidate(true);
        java.io.InputStream inputStream7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.avro.Schema schema8 = parser0.parse(inputStream7);
            org.junit.Assert.fail("Expected exception of type java.io.EOFException; message: No content to map to Object due to end of input");
        } catch (java.io.EOFException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(parser2);
        org.junit.Assert.assertNotNull(parser4);
        org.junit.Assert.assertNotNull(parser6);
    }

    @Test
    public void test0228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SchemaM3Random300Test0.test0228");
        org.apache.avro.Schema[] schemaArray0 = new org.apache.avro.Schema[] {};
        java.util.ArrayList<org.apache.avro.Schema> schemaList1 = new java.util.ArrayList<org.apache.avro.Schema>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<org.apache.avro.Schema>) schemaList1, schemaArray0);
        org.apache.avro.Schema schema3 = org.apache.avro.Schema.createUnion((java.util.List<org.apache.avro.Schema>) schemaList1);
        org.apache.avro.Schema[] schemaArray4 = new org.apache.avro.Schema[] {};
        java.util.ArrayList<org.apache.avro.Schema> schemaList5 = new java.util.ArrayList<org.apache.avro.Schema>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<org.apache.avro.Schema>) schemaList5, schemaArray4);
        org.apache.avro.Schema schema7 = org.apache.avro.Schema.createUnion((java.util.List<org.apache.avro.Schema>) schemaList5);
        org.apache.avro.Schema schema8 = org.apache.avro.Schema.applyAliases(schema3, schema7);
        java.util.List<org.apache.avro.Schema> schemaList9 = schema8.getTypes();
        org.apache.avro.Schema[] schemaArray10 = new org.apache.avro.Schema[] {};
        java.util.ArrayList<org.apache.avro.Schema> schemaList11 = new java.util.ArrayList<org.apache.avro.Schema>();
        boolean boolean12 = java.util.Collections.addAll((java.util.Collection<org.apache.avro.Schema>) schemaList11, schemaArray10);
        org.apache.avro.Schema schema13 = org.apache.avro.Schema.createUnion((java.util.List<org.apache.avro.Schema>) schemaList11);
        org.apache.avro.Schema[] schemaArray14 = new org.apache.avro.Schema[] {};
        java.util.ArrayList<org.apache.avro.Schema> schemaList15 = new java.util.ArrayList<org.apache.avro.Schema>();
        boolean boolean16 = java.util.Collections.addAll((java.util.Collection<org.apache.avro.Schema>) schemaList15, schemaArray14);
        org.apache.avro.Schema schema17 = org.apache.avro.Schema.createUnion((java.util.List<org.apache.avro.Schema>) schemaList15);
        org.apache.avro.Schema schema18 = org.apache.avro.Schema.applyAliases(schema13, schema17);
        org.apache.avro.Schema schema19 = org.apache.avro.Schema.applyAliases(schema8, schema17);
        org.apache.avro.Schema schema20 = org.apache.avro.Schema.createMap(schema17);
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<java.lang.String> strList21 = schema20.getEnumSymbols();
            org.junit.Assert.fail("Expected exception of type org.apache.avro.AvroRuntimeException; message: Not an enum: {\"type\":\"map\",\"values\":[]}");
        } catch (org.apache.avro.AvroRuntimeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(schemaArray0);
        org.junit.Assert.assertArrayEquals(schemaArray0, new org.apache.avro.Schema[] {});
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(schema3);
        org.junit.Assert.assertNotNull(schemaArray4);
        org.junit.Assert.assertArrayEquals(schemaArray4, new org.apache.avro.Schema[] {});
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(schema7);
        org.junit.Assert.assertNotNull(schema8);
        org.junit.Assert.assertNotNull(schemaList9);
        org.junit.Assert.assertNotNull(schemaArray10);
        org.junit.Assert.assertArrayEquals(schemaArray10, new org.apache.avro.Schema[] {});
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(schema13);
        org.junit.Assert.assertNotNull(schemaArray14);
        org.junit.Assert.assertArrayEquals(schemaArray14, new org.apache.avro.Schema[] {});
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(schema17);
        org.junit.Assert.assertNotNull(schema18);
        org.junit.Assert.assertNotNull(schema19);
        org.junit.Assert.assertNotNull(schema20);
    }

    @Test
    public void test0229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SchemaM3Random300Test0.test0229");
        org.apache.avro.Schema.Parser parser0 = new org.apache.avro.Schema.Parser();
        java.util.Map<java.lang.String, org.apache.avro.Schema> strMap1 = parser0.getTypes();
        org.apache.avro.Schema.Parser parser2 = new org.apache.avro.Schema.Parser();
        org.apache.avro.Schema.Parser parser4 = parser2.setValidate(true);
        java.util.Map<java.lang.String, org.apache.avro.Schema> strMap5 = parser2.getTypes();
        org.apache.avro.Schema.Parser parser6 = parser0.addTypes(strMap5);
        boolean boolean7 = parser0.getValidate();
        boolean boolean8 = parser0.getValidate();
        org.apache.avro.Schema.Parser parser9 = new org.apache.avro.Schema.Parser();
        java.util.Map<java.lang.String, org.apache.avro.Schema> strMap10 = parser9.getTypes();
        java.util.Map<java.lang.String, org.apache.avro.Schema> strMap11 = parser9.getTypes();
        org.apache.avro.Schema.Parser parser12 = new org.apache.avro.Schema.Parser();
        java.util.Map<java.lang.String, org.apache.avro.Schema> strMap13 = parser12.getTypes();
        org.apache.avro.Schema.Parser parser14 = parser9.addTypes(strMap13);
        org.apache.avro.Schema.Parser parser15 = parser0.addTypes(strMap13);
        org.apache.avro.Schema.Parser parser17 = parser0.setValidate(true);
        java.io.File file18 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.avro.Schema schema19 = parser17.parse(file18);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strMap1);
        org.junit.Assert.assertNotNull(parser4);
        org.junit.Assert.assertNotNull(strMap5);
        org.junit.Assert.assertNotNull(parser6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(strMap10);
        org.junit.Assert.assertNotNull(strMap11);
        org.junit.Assert.assertNotNull(strMap13);
        org.junit.Assert.assertNotNull(parser14);
        org.junit.Assert.assertNotNull(parser15);
        org.junit.Assert.assertNotNull(parser17);
    }

    @Test
    public void test0230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SchemaM3Random300Test0.test0230");
        org.apache.avro.Schema[] schemaArray0 = new org.apache.avro.Schema[] {};
        java.util.ArrayList<org.apache.avro.Schema> schemaList1 = new java.util.ArrayList<org.apache.avro.Schema>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<org.apache.avro.Schema>) schemaList1, schemaArray0);
        org.apache.avro.Schema schema3 = org.apache.avro.Schema.createUnion((java.util.List<org.apache.avro.Schema>) schemaList1);
        org.apache.avro.Schema[] schemaArray4 = new org.apache.avro.Schema[] {};
        java.util.ArrayList<org.apache.avro.Schema> schemaList5 = new java.util.ArrayList<org.apache.avro.Schema>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<org.apache.avro.Schema>) schemaList5, schemaArray4);
        org.apache.avro.Schema schema7 = org.apache.avro.Schema.createUnion((java.util.List<org.apache.avro.Schema>) schemaList5);
        org.apache.avro.Schema schema8 = org.apache.avro.Schema.applyAliases(schema3, schema7);
        java.util.List<org.apache.avro.Schema> schemaList9 = schema8.getTypes();
        org.apache.avro.Schema[] schemaArray10 = new org.apache.avro.Schema[] {};
        java.util.ArrayList<org.apache.avro.Schema> schemaList11 = new java.util.ArrayList<org.apache.avro.Schema>();
        boolean boolean12 = java.util.Collections.addAll((java.util.Collection<org.apache.avro.Schema>) schemaList11, schemaArray10);
        org.apache.avro.Schema schema13 = org.apache.avro.Schema.createUnion((java.util.List<org.apache.avro.Schema>) schemaList11);
        org.apache.avro.Schema[] schemaArray14 = new org.apache.avro.Schema[] {};
        java.util.ArrayList<org.apache.avro.Schema> schemaList15 = new java.util.ArrayList<org.apache.avro.Schema>();
        boolean boolean16 = java.util.Collections.addAll((java.util.Collection<org.apache.avro.Schema>) schemaList15, schemaArray14);
        org.apache.avro.Schema schema17 = org.apache.avro.Schema.createUnion((java.util.List<org.apache.avro.Schema>) schemaList15);
        org.apache.avro.Schema schema18 = org.apache.avro.Schema.applyAliases(schema13, schema17);
        org.apache.avro.Schema schema19 = org.apache.avro.Schema.applyAliases(schema8, schema17);
        org.apache.avro.Schema schema20 = org.apache.avro.Schema.createMap(schema8);
        java.lang.String str21 = schema8.getName();
        java.lang.String str23 = schema8.toString(false);
        org.apache.avro.Schema schema24 = org.apache.avro.Schema.createArray(schema8);
        // The following exception was thrown during execution in test generation
        try {
            java.util.Set<java.lang.String> strSet25 = schema24.getAliases();
            org.junit.Assert.fail("Expected exception of type org.apache.avro.AvroRuntimeException; message: Not a named type: {\"type\":\"array\",\"items\":[]}");
        } catch (org.apache.avro.AvroRuntimeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(schemaArray0);
        org.junit.Assert.assertArrayEquals(schemaArray0, new org.apache.avro.Schema[] {});
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(schema3);
        org.junit.Assert.assertNotNull(schemaArray4);
        org.junit.Assert.assertArrayEquals(schemaArray4, new org.apache.avro.Schema[] {});
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(schema7);
        org.junit.Assert.assertNotNull(schema8);
        org.junit.Assert.assertNotNull(schemaList9);
        org.junit.Assert.assertNotNull(schemaArray10);
        org.junit.Assert.assertArrayEquals(schemaArray10, new org.apache.avro.Schema[] {});
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(schema13);
        org.junit.Assert.assertNotNull(schemaArray14);
        org.junit.Assert.assertArrayEquals(schemaArray14, new org.apache.avro.Schema[] {});
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(schema17);
        org.junit.Assert.assertNotNull(schema18);
        org.junit.Assert.assertNotNull(schema19);
        org.junit.Assert.assertNotNull(schema20);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "union" + "'", str21, "union");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "[]" + "'", str23, "[]");
        org.junit.Assert.assertNotNull(schema24);
    }

    @Test
    public void test0231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SchemaM3Random300Test0.test0231");
        org.apache.avro.Schema[] schemaArray0 = new org.apache.avro.Schema[] {};
        java.util.ArrayList<org.apache.avro.Schema> schemaList1 = new java.util.ArrayList<org.apache.avro.Schema>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<org.apache.avro.Schema>) schemaList1, schemaArray0);
        org.apache.avro.Schema schema3 = org.apache.avro.Schema.createUnion((java.util.List<org.apache.avro.Schema>) schemaList1);
        org.apache.avro.Schema[] schemaArray4 = new org.apache.avro.Schema[] {};
        java.util.ArrayList<org.apache.avro.Schema> schemaList5 = new java.util.ArrayList<org.apache.avro.Schema>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<org.apache.avro.Schema>) schemaList5, schemaArray4);
        org.apache.avro.Schema schema7 = org.apache.avro.Schema.createUnion((java.util.List<org.apache.avro.Schema>) schemaList5);
        org.apache.avro.Schema schema8 = org.apache.avro.Schema.applyAliases(schema3, schema7);
        java.util.List<org.apache.avro.Schema> schemaList9 = schema8.getTypes();
        boolean boolean11 = schema8.equals((java.lang.Object) "hi!");
        java.lang.String str12 = schema8.getDoc();
        org.apache.avro.Schema schema13 = org.apache.avro.Schema.createArray(schema8);
        java.lang.String str14 = schema8.getFullName();
        org.apache.avro.Schema.Field[] fieldArray15 = new org.apache.avro.Schema.Field[] {};
        java.util.ArrayList<org.apache.avro.Schema.Field> fieldList16 = new java.util.ArrayList<org.apache.avro.Schema.Field>();
        boolean boolean17 = java.util.Collections.addAll((java.util.Collection<org.apache.avro.Schema.Field>) fieldList16, fieldArray15);
        org.apache.avro.Schema schema18 = org.apache.avro.Schema.createRecord((java.util.List<org.apache.avro.Schema.Field>) fieldList16);
        // The following exception was thrown during execution in test generation
        try {
            schema8.setFields((java.util.List<org.apache.avro.Schema.Field>) fieldList16);
            org.junit.Assert.fail("Expected exception of type org.apache.avro.AvroRuntimeException; message: Not a record: []");
        } catch (org.apache.avro.AvroRuntimeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(schemaArray0);
        org.junit.Assert.assertArrayEquals(schemaArray0, new org.apache.avro.Schema[] {});
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(schema3);
        org.junit.Assert.assertNotNull(schemaArray4);
        org.junit.Assert.assertArrayEquals(schemaArray4, new org.apache.avro.Schema[] {});
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(schema7);
        org.junit.Assert.assertNotNull(schema8);
        org.junit.Assert.assertNotNull(schemaList9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNotNull(schema13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "union" + "'", str14, "union");
        org.junit.Assert.assertNotNull(fieldArray15);
        org.junit.Assert.assertArrayEquals(fieldArray15, new org.apache.avro.Schema.Field[] {});
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(schema18);
    }

    @Test
    public void test0232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SchemaM3Random300Test0.test0232");
        org.apache.avro.Schema.Names names0 = new org.apache.avro.Schema.Names();
        org.apache.avro.Schema[] schemaArray1 = new org.apache.avro.Schema[] {};
        java.util.ArrayList<org.apache.avro.Schema> schemaList2 = new java.util.ArrayList<org.apache.avro.Schema>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<org.apache.avro.Schema>) schemaList2, schemaArray1);
        org.apache.avro.Schema schema4 = org.apache.avro.Schema.createUnion((java.util.List<org.apache.avro.Schema>) schemaList2);
        org.apache.avro.Schema[] schemaArray5 = new org.apache.avro.Schema[] {};
        java.util.ArrayList<org.apache.avro.Schema> schemaList6 = new java.util.ArrayList<org.apache.avro.Schema>();
        boolean boolean7 = java.util.Collections.addAll((java.util.Collection<org.apache.avro.Schema>) schemaList6, schemaArray5);
        org.apache.avro.Schema schema8 = org.apache.avro.Schema.createUnion((java.util.List<org.apache.avro.Schema>) schemaList6);
        org.apache.avro.Schema schema9 = org.apache.avro.Schema.applyAliases(schema4, schema8);
        org.apache.avro.Schema.Type type10 = schema8.getType();
        org.apache.avro.Schema schema11 = org.apache.avro.Schema.createMap(schema8);
        org.apache.avro.Schema.Names names12 = new org.apache.avro.Schema.Names();
        java.lang.String str13 = names12.space();
        names12.space("");
        boolean boolean16 = schema8.equals((java.lang.Object) "");
        org.apache.avro.Schema schema17 = names0.remove((java.lang.Object) boolean16);
        org.apache.avro.Schema.Names names18 = new org.apache.avro.Schema.Names();
        names18.space("[ ]");
        java.lang.Object obj21 = names18.clone();
        org.apache.avro.Schema.Type type22 = org.apache.avro.Schema.Type.RECORD;
        boolean boolean23 = names18.containsKey((java.lang.Object) type22);
        org.apache.avro.Schema[] schemaArray24 = new org.apache.avro.Schema[] {};
        java.util.ArrayList<org.apache.avro.Schema> schemaList25 = new java.util.ArrayList<org.apache.avro.Schema>();
        boolean boolean26 = java.util.Collections.addAll((java.util.Collection<org.apache.avro.Schema>) schemaList25, schemaArray24);
        org.apache.avro.Schema schema27 = org.apache.avro.Schema.createUnion((java.util.List<org.apache.avro.Schema>) schemaList25);
        org.apache.avro.Schema[] schemaArray28 = new org.apache.avro.Schema[] {};
        java.util.ArrayList<org.apache.avro.Schema> schemaList29 = new java.util.ArrayList<org.apache.avro.Schema>();
        boolean boolean30 = java.util.Collections.addAll((java.util.Collection<org.apache.avro.Schema>) schemaList29, schemaArray28);
        org.apache.avro.Schema schema31 = org.apache.avro.Schema.createUnion((java.util.List<org.apache.avro.Schema>) schemaList29);
        org.apache.avro.Schema schema32 = org.apache.avro.Schema.applyAliases(schema27, schema31);
        org.apache.avro.Schema.Type type33 = schema31.getType();
        org.apache.avro.Schema schema34 = org.apache.avro.Schema.createMap(schema31);
        org.apache.avro.Schema.Names names35 = new org.apache.avro.Schema.Names();
        java.lang.String str36 = names35.space();
        names35.space("");
        boolean boolean39 = schema31.equals((java.lang.Object) "");
        java.lang.String str40 = schema31.getFullName();
        boolean boolean41 = names18.containsKey((java.lang.Object) schema31);
        // The following exception was thrown during execution in test generation
        try {
            names0.add(schema31);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: org.apache.avro.Schema$UnionSchema cannot be cast to org.apache.avro.Schema$NamedSchema");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(schemaArray1);
        org.junit.Assert.assertArrayEquals(schemaArray1, new org.apache.avro.Schema[] {});
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(schema4);
        org.junit.Assert.assertNotNull(schemaArray5);
        org.junit.Assert.assertArrayEquals(schemaArray5, new org.apache.avro.Schema[] {});
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(schema8);
        org.junit.Assert.assertNotNull(schema9);
        org.junit.Assert.assertTrue("'" + type10 + "' != '" + org.apache.avro.Schema.Type.UNION + "'", type10.equals(org.apache.avro.Schema.Type.UNION));
        org.junit.Assert.assertNotNull(schema11);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNull(schema17);
        org.junit.Assert.assertNotNull(obj21);
        org.junit.Assert.assertEquals(obj21.toString(), "{}");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj21), "{}");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj21), "{}");
        org.junit.Assert.assertTrue("'" + type22 + "' != '" + org.apache.avro.Schema.Type.RECORD + "'", type22.equals(org.apache.avro.Schema.Type.RECORD));
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(schemaArray24);
        org.junit.Assert.assertArrayEquals(schemaArray24, new org.apache.avro.Schema[] {});
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(schema27);
        org.junit.Assert.assertNotNull(schemaArray28);
        org.junit.Assert.assertArrayEquals(schemaArray28, new org.apache.avro.Schema[] {});
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertNotNull(schema31);
        org.junit.Assert.assertNotNull(schema32);
        org.junit.Assert.assertTrue("'" + type33 + "' != '" + org.apache.avro.Schema.Type.UNION + "'", type33.equals(org.apache.avro.Schema.Type.UNION));
        org.junit.Assert.assertNotNull(schema34);
        org.junit.Assert.assertNull(str36);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "union" + "'", str40, "union");
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
    }

    @Test
    public void test0233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SchemaM3Random300Test0.test0233");
        org.apache.avro.Schema[] schemaArray0 = new org.apache.avro.Schema[] {};
        java.util.ArrayList<org.apache.avro.Schema> schemaList1 = new java.util.ArrayList<org.apache.avro.Schema>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<org.apache.avro.Schema>) schemaList1, schemaArray0);
        org.apache.avro.Schema schema3 = org.apache.avro.Schema.createUnion((java.util.List<org.apache.avro.Schema>) schemaList1);
        org.apache.avro.Schema[] schemaArray4 = new org.apache.avro.Schema[] {};
        java.util.ArrayList<org.apache.avro.Schema> schemaList5 = new java.util.ArrayList<org.apache.avro.Schema>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<org.apache.avro.Schema>) schemaList5, schemaArray4);
        org.apache.avro.Schema schema7 = org.apache.avro.Schema.createUnion((java.util.List<org.apache.avro.Schema>) schemaList5);
        org.apache.avro.Schema schema8 = org.apache.avro.Schema.applyAliases(schema3, schema7);
        org.apache.avro.Schema.Type type9 = schema7.getType();
        org.apache.avro.Schema schema10 = org.apache.avro.Schema.createMap(schema7);
        org.apache.avro.Schema schema11 = org.apache.avro.Schema.createArray(schema10);
        org.apache.avro.Schema schema12 = org.apache.avro.Schema.createArray(schema10);
        java.lang.String str13 = schema12.getName();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean14 = schema12.isError();
            org.junit.Assert.fail("Expected exception of type org.apache.avro.AvroRuntimeException; message: Not a record: {\"type\":\"array\",\"items\":{\"type\":\"map\",\"values\":[]}}");
        } catch (org.apache.avro.AvroRuntimeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(schemaArray0);
        org.junit.Assert.assertArrayEquals(schemaArray0, new org.apache.avro.Schema[] {});
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(schema3);
        org.junit.Assert.assertNotNull(schemaArray4);
        org.junit.Assert.assertArrayEquals(schemaArray4, new org.apache.avro.Schema[] {});
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(schema7);
        org.junit.Assert.assertNotNull(schema8);
        org.junit.Assert.assertTrue("'" + type9 + "' != '" + org.apache.avro.Schema.Type.UNION + "'", type9.equals(org.apache.avro.Schema.Type.UNION));
        org.junit.Assert.assertNotNull(schema10);
        org.junit.Assert.assertNotNull(schema11);
        org.junit.Assert.assertNotNull(schema12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "array" + "'", str13, "array");
    }

    @Test
    public void test0234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SchemaM3Random300Test0.test0234");
        // The following exception was thrown during execution in test generation
        try {
            org.codehaus.jackson.JsonNode jsonNode1 = org.apache.avro.Schema.parseJson("union type:MAP pos:-1");
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: org.codehaus.jackson.JsonParseException: Unexpected character ('u' (code 117)): expected a valid value (number, String, array, object, 'true', 'false' or 'null')? at [Source: java.io.StringReader@156760ef; line: 1, column: 2]");
        } catch (java.lang.RuntimeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SchemaM3Random300Test0.test0235");
        org.apache.avro.Schema.Parser parser0 = new org.apache.avro.Schema.Parser();
        java.util.Map<java.lang.String, org.apache.avro.Schema> strMap1 = parser0.getTypes();
        java.util.Map<java.lang.String, org.apache.avro.Schema> strMap2 = parser0.getTypes();
        org.apache.avro.Schema.Parser parser3 = new org.apache.avro.Schema.Parser();
        java.util.Map<java.lang.String, org.apache.avro.Schema> strMap4 = parser3.getTypes();
        org.apache.avro.Schema.Parser parser5 = parser0.addTypes(strMap4);
        org.apache.avro.Schema.Parser parser7 = parser0.setValidate(true);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.avro.Schema schema9 = parser7.parse("");
            org.junit.Assert.fail("Expected exception of type org.apache.avro.SchemaParseException; message: java.io.EOFException: No content to map to Object due to end of input");
        } catch (org.apache.avro.SchemaParseException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strMap1);
        org.junit.Assert.assertNotNull(strMap2);
        org.junit.Assert.assertNotNull(strMap4);
        org.junit.Assert.assertNotNull(parser5);
        org.junit.Assert.assertNotNull(parser7);
    }

    @Test
    public void test0236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SchemaM3Random300Test0.test0236");
        org.apache.avro.Schema[] schemaArray0 = new org.apache.avro.Schema[] {};
        java.util.ArrayList<org.apache.avro.Schema> schemaList1 = new java.util.ArrayList<org.apache.avro.Schema>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<org.apache.avro.Schema>) schemaList1, schemaArray0);
        org.apache.avro.Schema schema3 = org.apache.avro.Schema.createUnion((java.util.List<org.apache.avro.Schema>) schemaList1);
        org.apache.avro.Schema[] schemaArray4 = new org.apache.avro.Schema[] {};
        java.util.ArrayList<org.apache.avro.Schema> schemaList5 = new java.util.ArrayList<org.apache.avro.Schema>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<org.apache.avro.Schema>) schemaList5, schemaArray4);
        org.apache.avro.Schema schema7 = org.apache.avro.Schema.createUnion((java.util.List<org.apache.avro.Schema>) schemaList5);
        org.apache.avro.Schema schema8 = org.apache.avro.Schema.applyAliases(schema3, schema7);
        java.util.List<org.apache.avro.Schema> schemaList9 = schema8.getTypes();
        org.apache.avro.Schema[] schemaArray10 = new org.apache.avro.Schema[] {};
        java.util.ArrayList<org.apache.avro.Schema> schemaList11 = new java.util.ArrayList<org.apache.avro.Schema>();
        boolean boolean12 = java.util.Collections.addAll((java.util.Collection<org.apache.avro.Schema>) schemaList11, schemaArray10);
        org.apache.avro.Schema schema13 = org.apache.avro.Schema.createUnion((java.util.List<org.apache.avro.Schema>) schemaList11);
        org.apache.avro.Schema[] schemaArray14 = new org.apache.avro.Schema[] {};
        java.util.ArrayList<org.apache.avro.Schema> schemaList15 = new java.util.ArrayList<org.apache.avro.Schema>();
        boolean boolean16 = java.util.Collections.addAll((java.util.Collection<org.apache.avro.Schema>) schemaList15, schemaArray14);
        org.apache.avro.Schema schema17 = org.apache.avro.Schema.createUnion((java.util.List<org.apache.avro.Schema>) schemaList15);
        org.apache.avro.Schema schema18 = org.apache.avro.Schema.applyAliases(schema13, schema17);
        org.apache.avro.Schema schema19 = org.apache.avro.Schema.applyAliases(schema8, schema17);
        org.apache.avro.Schema schema20 = org.apache.avro.Schema.createMap(schema17);
        java.util.List<org.apache.avro.Schema> schemaList21 = schema17.getTypes();
        org.apache.avro.Schema schema22 = org.apache.avro.Schema.createUnion(schemaList21);
        // The following exception was thrown during execution in test generation
        try {
            int int23 = schema22.getFixedSize();
            org.junit.Assert.fail("Expected exception of type org.apache.avro.AvroRuntimeException; message: Not fixed: []");
        } catch (org.apache.avro.AvroRuntimeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(schemaArray0);
        org.junit.Assert.assertArrayEquals(schemaArray0, new org.apache.avro.Schema[] {});
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(schema3);
        org.junit.Assert.assertNotNull(schemaArray4);
        org.junit.Assert.assertArrayEquals(schemaArray4, new org.apache.avro.Schema[] {});
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(schema7);
        org.junit.Assert.assertNotNull(schema8);
        org.junit.Assert.assertNotNull(schemaList9);
        org.junit.Assert.assertNotNull(schemaArray10);
        org.junit.Assert.assertArrayEquals(schemaArray10, new org.apache.avro.Schema[] {});
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(schema13);
        org.junit.Assert.assertNotNull(schemaArray14);
        org.junit.Assert.assertArrayEquals(schemaArray14, new org.apache.avro.Schema[] {});
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(schema17);
        org.junit.Assert.assertNotNull(schema18);
        org.junit.Assert.assertNotNull(schema19);
        org.junit.Assert.assertNotNull(schema20);
        org.junit.Assert.assertNotNull(schemaList21);
        org.junit.Assert.assertNotNull(schema22);
    }

    @Test
    public void test0237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SchemaM3Random300Test0.test0237");
        org.apache.avro.Schema[] schemaArray0 = new org.apache.avro.Schema[] {};
        java.util.ArrayList<org.apache.avro.Schema> schemaList1 = new java.util.ArrayList<org.apache.avro.Schema>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<org.apache.avro.Schema>) schemaList1, schemaArray0);
        org.apache.avro.Schema schema3 = org.apache.avro.Schema.createUnion((java.util.List<org.apache.avro.Schema>) schemaList1);
        org.apache.avro.Schema[] schemaArray4 = new org.apache.avro.Schema[] {};
        java.util.ArrayList<org.apache.avro.Schema> schemaList5 = new java.util.ArrayList<org.apache.avro.Schema>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<org.apache.avro.Schema>) schemaList5, schemaArray4);
        org.apache.avro.Schema schema7 = org.apache.avro.Schema.createUnion((java.util.List<org.apache.avro.Schema>) schemaList5);
        org.apache.avro.Schema schema8 = org.apache.avro.Schema.applyAliases(schema3, schema7);
        org.apache.avro.Schema.Type type9 = schema7.getType();
        org.apache.avro.Schema schema10 = org.apache.avro.Schema.createMap(schema7);
        // The following exception was thrown during execution in test generation
        try {
            java.util.Set<java.lang.String> strSet11 = schema7.getAliases();
            org.junit.Assert.fail("Expected exception of type org.apache.avro.AvroRuntimeException; message: Not a named type: []");
        } catch (org.apache.avro.AvroRuntimeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(schemaArray0);
        org.junit.Assert.assertArrayEquals(schemaArray0, new org.apache.avro.Schema[] {});
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(schema3);
        org.junit.Assert.assertNotNull(schemaArray4);
        org.junit.Assert.assertArrayEquals(schemaArray4, new org.apache.avro.Schema[] {});
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(schema7);
        org.junit.Assert.assertNotNull(schema8);
        org.junit.Assert.assertTrue("'" + type9 + "' != '" + org.apache.avro.Schema.Type.UNION + "'", type9.equals(org.apache.avro.Schema.Type.UNION));
        org.junit.Assert.assertNotNull(schema10);
    }

    @Test
    public void test0238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SchemaM3Random300Test0.test0238");
        org.apache.avro.Schema[] schemaArray0 = new org.apache.avro.Schema[] {};
        java.util.ArrayList<org.apache.avro.Schema> schemaList1 = new java.util.ArrayList<org.apache.avro.Schema>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<org.apache.avro.Schema>) schemaList1, schemaArray0);
        org.apache.avro.Schema schema3 = org.apache.avro.Schema.createUnion((java.util.List<org.apache.avro.Schema>) schemaList1);
        org.apache.avro.Schema[] schemaArray4 = new org.apache.avro.Schema[] {};
        java.util.ArrayList<org.apache.avro.Schema> schemaList5 = new java.util.ArrayList<org.apache.avro.Schema>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<org.apache.avro.Schema>) schemaList5, schemaArray4);
        org.apache.avro.Schema schema7 = org.apache.avro.Schema.createUnion((java.util.List<org.apache.avro.Schema>) schemaList5);
        org.apache.avro.Schema schema8 = org.apache.avro.Schema.applyAliases(schema3, schema7);
        java.util.List<org.apache.avro.Schema> schemaList9 = schema8.getTypes();
        org.apache.avro.Schema[] schemaArray10 = new org.apache.avro.Schema[] {};
        java.util.ArrayList<org.apache.avro.Schema> schemaList11 = new java.util.ArrayList<org.apache.avro.Schema>();
        boolean boolean12 = java.util.Collections.addAll((java.util.Collection<org.apache.avro.Schema>) schemaList11, schemaArray10);
        org.apache.avro.Schema schema13 = org.apache.avro.Schema.createUnion((java.util.List<org.apache.avro.Schema>) schemaList11);
        org.apache.avro.Schema[] schemaArray14 = new org.apache.avro.Schema[] {};
        java.util.ArrayList<org.apache.avro.Schema> schemaList15 = new java.util.ArrayList<org.apache.avro.Schema>();
        boolean boolean16 = java.util.Collections.addAll((java.util.Collection<org.apache.avro.Schema>) schemaList15, schemaArray14);
        org.apache.avro.Schema schema17 = org.apache.avro.Schema.createUnion((java.util.List<org.apache.avro.Schema>) schemaList15);
        org.apache.avro.Schema schema18 = org.apache.avro.Schema.applyAliases(schema13, schema17);
        org.apache.avro.Schema schema19 = org.apache.avro.Schema.applyAliases(schema8, schema17);
        org.apache.avro.Schema schema20 = org.apache.avro.Schema.createMap(schema8);
        org.apache.avro.Schema schema21 = org.apache.avro.Schema.createArray(schema20);
        org.apache.avro.Schema schema22 = org.apache.avro.Schema.createMap(schema21);
        java.lang.String str24 = schema21.toString(true);
        java.lang.String str25 = schema21.toString();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Set<java.lang.String> strSet26 = schema21.getAliases();
            org.junit.Assert.fail("Expected exception of type org.apache.avro.AvroRuntimeException; message: Not a named type: {\"type\":\"array\",\"items\":{\"type\":\"map\",\"values\":[]}}");
        } catch (org.apache.avro.AvroRuntimeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(schemaArray0);
        org.junit.Assert.assertArrayEquals(schemaArray0, new org.apache.avro.Schema[] {});
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(schema3);
        org.junit.Assert.assertNotNull(schemaArray4);
        org.junit.Assert.assertArrayEquals(schemaArray4, new org.apache.avro.Schema[] {});
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(schema7);
        org.junit.Assert.assertNotNull(schema8);
        org.junit.Assert.assertNotNull(schemaList9);
        org.junit.Assert.assertNotNull(schemaArray10);
        org.junit.Assert.assertArrayEquals(schemaArray10, new org.apache.avro.Schema[] {});
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(schema13);
        org.junit.Assert.assertNotNull(schemaArray14);
        org.junit.Assert.assertArrayEquals(schemaArray14, new org.apache.avro.Schema[] {});
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(schema17);
        org.junit.Assert.assertNotNull(schema18);
        org.junit.Assert.assertNotNull(schema19);
        org.junit.Assert.assertNotNull(schema20);
        org.junit.Assert.assertNotNull(schema21);
        org.junit.Assert.assertNotNull(schema22);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "{\r\n  \"type\" : \"array\",\r\n  \"items\" : {\r\n    \"type\" : \"map\",\r\n    \"values\" : [ ]\r\n  }\r\n}" + "'", str24, "{\r\n  \"type\" : \"array\",\r\n  \"items\" : {\r\n    \"type\" : \"map\",\r\n    \"values\" : [ ]\r\n  }\r\n}");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "{\"type\":\"array\",\"items\":{\"type\":\"map\",\"values\":[]}}" + "'", str25, "{\"type\":\"array\",\"items\":{\"type\":\"map\",\"values\":[]}}");
    }

    @Test
    public void test0239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SchemaM3Random300Test0.test0239");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.avro.Schema schema4 = org.apache.avro.Schema.createRecord("{\r\n  \"type\" : \"record\",\r\n  \"fields\" : [ ]\r\n}", "{\"type\":\"map\",\"values\":[]}", "{\r\n  \"type\" : \"map\",\r\n  \"values\" : {\r\n    \"type\" : \"map\",\r\n    \"values\" : [ ]\r\n  }\r\n}", true);
            org.junit.Assert.fail("Expected exception of type org.apache.avro.SchemaParseException; message: Illegal initial character: {??  \"type\" : \"record\",??  \"fields\" : [ ]??}");
        } catch (org.apache.avro.SchemaParseException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SchemaM3Random300Test0.test0240");
        org.apache.avro.Schema.LockableArrayList<java.lang.String> strList4 = new org.apache.avro.Schema.LockableArrayList<java.lang.String>((int) (short) 10);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.avro.Schema schema5 = org.apache.avro.Schema.createEnum("{\r\n  \"type\" : \"map\",\r\n  \"values\" : [ ]\r\n}", "", "{\r\n  \"type\" : \"map\",\r\n  \"values\" : [ ]\r\n}", (java.util.List<java.lang.String>) strList4);
            org.junit.Assert.fail("Expected exception of type org.apache.avro.SchemaParseException; message: Illegal initial character: {??  \"type\" : \"map\",??  \"values\" : [ ]??}");
        } catch (org.apache.avro.SchemaParseException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SchemaM3Random300Test0.test0241");
        org.apache.avro.Schema schema4 = org.apache.avro.Schema.createFixed("[].union", "{\r\n  \"type\" : \"map\",\r\n  \"values\" : [ ]\r\n}", "union type:MAP pos:-1", 10);
        java.lang.Class<?> wildcardClass5 = schema4.getClass();
        org.junit.Assert.assertNotNull(schema4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SchemaM3Random300Test0.test0242");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.avro.Schema schema4 = org.apache.avro.Schema.createFixed("union type:UNION pos:-1", "[].union", "{\"type\":\"array\",\"items\":[]}", (int) '4');
            org.junit.Assert.fail("Expected exception of type org.apache.avro.SchemaParseException; message: Illegal character in: union type:UNION pos:-1");
        } catch (org.apache.avro.SchemaParseException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SchemaM3Random300Test0.test0243");
        org.apache.avro.Schema schema4 = org.apache.avro.Schema.createFixed("union", "[ ]", "[]", 0);
        org.apache.avro.Schema.Type type5 = org.apache.avro.Schema.Type.INT;
        org.apache.avro.Schema schema6 = org.apache.avro.Schema.create(type5);
        org.apache.avro.Schema schema7 = org.apache.avro.Schema.createArray(schema6);
        org.apache.avro.Schema schema8 = org.apache.avro.Schema.applyAliases(schema4, schema7);
        org.apache.avro.Schema[] schemaArray9 = new org.apache.avro.Schema[] {};
        java.util.ArrayList<org.apache.avro.Schema> schemaList10 = new java.util.ArrayList<org.apache.avro.Schema>();
        boolean boolean11 = java.util.Collections.addAll((java.util.Collection<org.apache.avro.Schema>) schemaList10, schemaArray9);
        org.apache.avro.Schema schema12 = org.apache.avro.Schema.createUnion((java.util.List<org.apache.avro.Schema>) schemaList10);
        org.apache.avro.Schema[] schemaArray13 = new org.apache.avro.Schema[] {};
        java.util.ArrayList<org.apache.avro.Schema> schemaList14 = new java.util.ArrayList<org.apache.avro.Schema>();
        boolean boolean15 = java.util.Collections.addAll((java.util.Collection<org.apache.avro.Schema>) schemaList14, schemaArray13);
        org.apache.avro.Schema schema16 = org.apache.avro.Schema.createUnion((java.util.List<org.apache.avro.Schema>) schemaList14);
        org.apache.avro.Schema schema17 = org.apache.avro.Schema.applyAliases(schema12, schema16);
        org.apache.avro.Schema.Type type18 = schema16.getType();
        org.apache.avro.Schema.Type type19 = schema16.getType();
        org.apache.avro.Schema schema20 = org.apache.avro.Schema.applyAliases(schema8, schema16);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.avro.Schema schema21 = schema16.getElementType();
            org.junit.Assert.fail("Expected exception of type org.apache.avro.AvroRuntimeException; message: Not an array: []");
        } catch (org.apache.avro.AvroRuntimeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(schema4);
        org.junit.Assert.assertTrue("'" + type5 + "' != '" + org.apache.avro.Schema.Type.INT + "'", type5.equals(org.apache.avro.Schema.Type.INT));
        org.junit.Assert.assertNotNull(schema6);
        org.junit.Assert.assertNotNull(schema7);
        org.junit.Assert.assertNotNull(schema8);
        org.junit.Assert.assertNotNull(schemaArray9);
        org.junit.Assert.assertArrayEquals(schemaArray9, new org.apache.avro.Schema[] {});
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(schema12);
        org.junit.Assert.assertNotNull(schemaArray13);
        org.junit.Assert.assertArrayEquals(schemaArray13, new org.apache.avro.Schema[] {});
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(schema16);
        org.junit.Assert.assertNotNull(schema17);
        org.junit.Assert.assertTrue("'" + type18 + "' != '" + org.apache.avro.Schema.Type.UNION + "'", type18.equals(org.apache.avro.Schema.Type.UNION));
        org.junit.Assert.assertTrue("'" + type19 + "' != '" + org.apache.avro.Schema.Type.UNION + "'", type19.equals(org.apache.avro.Schema.Type.UNION));
        org.junit.Assert.assertNotNull(schema20);
    }

    @Test
    public void test0244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SchemaM3Random300Test0.test0244");
        org.apache.avro.Schema.Names names1 = new org.apache.avro.Schema.Names("{\r\n  \"type\" : \"record\",\r\n  \"fields\" : [ ]\r\n}");
    }

    @Test
    public void test0245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SchemaM3Random300Test0.test0245");
        org.apache.avro.Schema.Parser parser0 = new org.apache.avro.Schema.Parser();
        java.util.Map<java.lang.String, org.apache.avro.Schema> strMap1 = parser0.getTypes();
        java.util.Map<java.lang.String, org.apache.avro.Schema> strMap2 = parser0.getTypes();
        org.apache.avro.Schema.Parser parser3 = new org.apache.avro.Schema.Parser();
        org.apache.avro.Schema.Parser parser5 = parser3.setValidate(true);
        java.util.Map<java.lang.String, org.apache.avro.Schema> strMap6 = parser3.getTypes();
        org.apache.avro.Schema.Parser parser7 = parser0.addTypes(strMap6);
        org.apache.avro.Schema.Parser parser9 = parser7.setValidate(false);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.avro.Schema schema11 = parser7.parse("map");
            org.junit.Assert.fail("Expected exception of type org.apache.avro.SchemaParseException; message: org.codehaus.jackson.JsonParseException: Unexpected character ('m' (code 109)): expected a valid value (number, String, array, object, 'true', 'false' or 'null')? at [Source: java.io.StringReader@450129a7; line: 1, column: 2]");
        } catch (org.apache.avro.SchemaParseException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strMap1);
        org.junit.Assert.assertNotNull(strMap2);
        org.junit.Assert.assertNotNull(parser5);
        org.junit.Assert.assertNotNull(strMap6);
        org.junit.Assert.assertNotNull(parser7);
        org.junit.Assert.assertNotNull(parser9);
    }

    @Test
    public void test0246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SchemaM3Random300Test0.test0246");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.avro.Schema schema2 = org.apache.avro.Schema.parse("array", true);
            org.junit.Assert.fail("Expected exception of type org.apache.avro.SchemaParseException; message: org.codehaus.jackson.JsonParseException: Unexpected character ('a' (code 97)): expected a valid value (number, String, array, object, 'true', 'false' or 'null')? at [Source: java.io.StringReader@4d714d6a; line: 1, column: 2]");
        } catch (org.apache.avro.SchemaParseException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SchemaM3Random300Test0.test0247");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.avro.Schema schema4 = org.apache.avro.Schema.createFixed("{\"type\":\"array\",\"items\":{\"type\":\"map\",\"values\":[]}}", "{\"type\":\"map\",\"values\":[]}", "hi!", (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type org.apache.avro.SchemaParseException; message: Illegal initial character: {\"type\":\"array\",\"items\":{\"type\":\"map\",\"values\":[]}}");
        } catch (org.apache.avro.SchemaParseException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SchemaM3Random300Test0.test0248");
        org.apache.avro.Schema.Parser parser0 = new org.apache.avro.Schema.Parser();
        java.util.Map<java.lang.String, org.apache.avro.Schema> strMap1 = parser0.getTypes();
        java.util.Map<java.lang.String, org.apache.avro.Schema> strMap2 = parser0.getTypes();
        org.apache.avro.Schema.Parser parser3 = new org.apache.avro.Schema.Parser();
        java.util.Map<java.lang.String, org.apache.avro.Schema> strMap4 = parser3.getTypes();
        org.apache.avro.Schema.Parser parser5 = parser0.addTypes(strMap4);
        org.apache.avro.Schema.Parser parser7 = parser0.setValidate(true);
        org.apache.avro.Schema.Parser parser9 = parser0.setValidate(false);
        org.apache.avro.Schema.Parser parser10 = new org.apache.avro.Schema.Parser();
        java.util.Map<java.lang.String, org.apache.avro.Schema> strMap11 = parser10.getTypes();
        java.util.Map<java.lang.String, org.apache.avro.Schema> strMap12 = parser10.getTypes();
        org.apache.avro.Schema.Parser parser13 = new org.apache.avro.Schema.Parser();
        java.util.Map<java.lang.String, org.apache.avro.Schema> strMap14 = parser13.getTypes();
        org.apache.avro.Schema.Parser parser15 = parser10.addTypes(strMap14);
        org.apache.avro.Schema.Parser parser16 = parser9.addTypes(strMap14);
        java.io.File file17 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.avro.Schema schema18 = parser9.parse(file17);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strMap1);
        org.junit.Assert.assertNotNull(strMap2);
        org.junit.Assert.assertNotNull(strMap4);
        org.junit.Assert.assertNotNull(parser5);
        org.junit.Assert.assertNotNull(parser7);
        org.junit.Assert.assertNotNull(parser9);
        org.junit.Assert.assertNotNull(strMap11);
        org.junit.Assert.assertNotNull(strMap12);
        org.junit.Assert.assertNotNull(strMap14);
        org.junit.Assert.assertNotNull(parser15);
        org.junit.Assert.assertNotNull(parser16);
    }

    @Test
    public void test0249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SchemaM3Random300Test0.test0249");
        org.apache.avro.Schema[] schemaArray0 = new org.apache.avro.Schema[] {};
        java.util.ArrayList<org.apache.avro.Schema> schemaList1 = new java.util.ArrayList<org.apache.avro.Schema>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<org.apache.avro.Schema>) schemaList1, schemaArray0);
        org.apache.avro.Schema schema3 = org.apache.avro.Schema.createUnion((java.util.List<org.apache.avro.Schema>) schemaList1);
        org.apache.avro.Schema[] schemaArray4 = new org.apache.avro.Schema[] {};
        java.util.ArrayList<org.apache.avro.Schema> schemaList5 = new java.util.ArrayList<org.apache.avro.Schema>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<org.apache.avro.Schema>) schemaList5, schemaArray4);
        org.apache.avro.Schema schema7 = org.apache.avro.Schema.createUnion((java.util.List<org.apache.avro.Schema>) schemaList5);
        org.apache.avro.Schema schema8 = org.apache.avro.Schema.applyAliases(schema3, schema7);
        java.util.List<org.apache.avro.Schema> schemaList9 = schema8.getTypes();
        org.apache.avro.Schema[] schemaArray10 = new org.apache.avro.Schema[] {};
        java.util.ArrayList<org.apache.avro.Schema> schemaList11 = new java.util.ArrayList<org.apache.avro.Schema>();
        boolean boolean12 = java.util.Collections.addAll((java.util.Collection<org.apache.avro.Schema>) schemaList11, schemaArray10);
        org.apache.avro.Schema schema13 = org.apache.avro.Schema.createUnion((java.util.List<org.apache.avro.Schema>) schemaList11);
        org.apache.avro.Schema[] schemaArray14 = new org.apache.avro.Schema[] {};
        java.util.ArrayList<org.apache.avro.Schema> schemaList15 = new java.util.ArrayList<org.apache.avro.Schema>();
        boolean boolean16 = java.util.Collections.addAll((java.util.Collection<org.apache.avro.Schema>) schemaList15, schemaArray14);
        org.apache.avro.Schema schema17 = org.apache.avro.Schema.createUnion((java.util.List<org.apache.avro.Schema>) schemaList15);
        org.apache.avro.Schema schema18 = org.apache.avro.Schema.applyAliases(schema13, schema17);
        org.apache.avro.Schema schema19 = org.apache.avro.Schema.applyAliases(schema8, schema17);
        java.util.List<org.apache.avro.Schema> schemaList20 = schema8.getTypes();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean22 = schema8.hasEnumSymbol("");
            org.junit.Assert.fail("Expected exception of type org.apache.avro.AvroRuntimeException; message: Not an enum: []");
        } catch (org.apache.avro.AvroRuntimeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(schemaArray0);
        org.junit.Assert.assertArrayEquals(schemaArray0, new org.apache.avro.Schema[] {});
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(schema3);
        org.junit.Assert.assertNotNull(schemaArray4);
        org.junit.Assert.assertArrayEquals(schemaArray4, new org.apache.avro.Schema[] {});
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(schema7);
        org.junit.Assert.assertNotNull(schema8);
        org.junit.Assert.assertNotNull(schemaList9);
        org.junit.Assert.assertNotNull(schemaArray10);
        org.junit.Assert.assertArrayEquals(schemaArray10, new org.apache.avro.Schema[] {});
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(schema13);
        org.junit.Assert.assertNotNull(schemaArray14);
        org.junit.Assert.assertArrayEquals(schemaArray14, new org.apache.avro.Schema[] {});
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(schema17);
        org.junit.Assert.assertNotNull(schema18);
        org.junit.Assert.assertNotNull(schema19);
        org.junit.Assert.assertNotNull(schemaList20);
    }

    @Test
    public void test0250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SchemaM3Random300Test0.test0250");
        org.apache.avro.Schema[] schemaArray0 = new org.apache.avro.Schema[] {};
        java.util.ArrayList<org.apache.avro.Schema> schemaList1 = new java.util.ArrayList<org.apache.avro.Schema>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<org.apache.avro.Schema>) schemaList1, schemaArray0);
        org.apache.avro.Schema schema3 = org.apache.avro.Schema.createUnion((java.util.List<org.apache.avro.Schema>) schemaList1);
        org.apache.avro.Schema[] schemaArray4 = new org.apache.avro.Schema[] {};
        java.util.ArrayList<org.apache.avro.Schema> schemaList5 = new java.util.ArrayList<org.apache.avro.Schema>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<org.apache.avro.Schema>) schemaList5, schemaArray4);
        org.apache.avro.Schema schema7 = org.apache.avro.Schema.createUnion((java.util.List<org.apache.avro.Schema>) schemaList5);
        org.apache.avro.Schema schema8 = org.apache.avro.Schema.applyAliases(schema3, schema7);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.avro.Schema.Field field10 = schema7.getField("{\r\n  \"type\" : \"map\",\r\n  \"values\" : {\r\n    \"type\" : \"map\",\r\n    \"values\" : [ ]\r\n  }\r\n}");
            org.junit.Assert.fail("Expected exception of type org.apache.avro.AvroRuntimeException; message: Not a record: []");
        } catch (org.apache.avro.AvroRuntimeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(schemaArray0);
        org.junit.Assert.assertArrayEquals(schemaArray0, new org.apache.avro.Schema[] {});
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(schema3);
        org.junit.Assert.assertNotNull(schemaArray4);
        org.junit.Assert.assertArrayEquals(schemaArray4, new org.apache.avro.Schema[] {});
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(schema7);
        org.junit.Assert.assertNotNull(schema8);
    }

    @Test
    public void test0251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SchemaM3Random300Test0.test0251");
        org.apache.avro.Schema[] schemaArray0 = new org.apache.avro.Schema[] {};
        java.util.ArrayList<org.apache.avro.Schema> schemaList1 = new java.util.ArrayList<org.apache.avro.Schema>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<org.apache.avro.Schema>) schemaList1, schemaArray0);
        org.apache.avro.Schema schema3 = org.apache.avro.Schema.createUnion((java.util.List<org.apache.avro.Schema>) schemaList1);
        org.apache.avro.Schema[] schemaArray4 = new org.apache.avro.Schema[] {};
        java.util.ArrayList<org.apache.avro.Schema> schemaList5 = new java.util.ArrayList<org.apache.avro.Schema>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<org.apache.avro.Schema>) schemaList5, schemaArray4);
        org.apache.avro.Schema schema7 = org.apache.avro.Schema.createUnion((java.util.List<org.apache.avro.Schema>) schemaList5);
        org.apache.avro.Schema schema8 = org.apache.avro.Schema.applyAliases(schema3, schema7);
        java.util.List<org.apache.avro.Schema> schemaList9 = schema8.getTypes();
        boolean boolean11 = schema8.equals((java.lang.Object) "hi!");
        java.lang.String str12 = schema8.getDoc();
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<java.lang.String> strList13 = schema8.getEnumSymbols();
            org.junit.Assert.fail("Expected exception of type org.apache.avro.AvroRuntimeException; message: Not an enum: []");
        } catch (org.apache.avro.AvroRuntimeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(schemaArray0);
        org.junit.Assert.assertArrayEquals(schemaArray0, new org.apache.avro.Schema[] {});
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(schema3);
        org.junit.Assert.assertNotNull(schemaArray4);
        org.junit.Assert.assertArrayEquals(schemaArray4, new org.apache.avro.Schema[] {});
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(schema7);
        org.junit.Assert.assertNotNull(schema8);
        org.junit.Assert.assertNotNull(schemaList9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNull(str12);
    }

    @Test
    public void test0252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SchemaM3Random300Test0.test0252");
        org.apache.avro.Schema.Parser parser0 = new org.apache.avro.Schema.Parser();
        java.util.Map<java.lang.String, org.apache.avro.Schema> strMap1 = parser0.getTypes();
        java.util.Map<java.lang.String, org.apache.avro.Schema> strMap2 = parser0.getTypes();
        org.apache.avro.Schema.Parser parser3 = new org.apache.avro.Schema.Parser();
        org.apache.avro.Schema.Parser parser5 = parser3.setValidate(true);
        java.util.Map<java.lang.String, org.apache.avro.Schema> strMap6 = parser3.getTypes();
        org.apache.avro.Schema.Parser parser7 = parser0.addTypes(strMap6);
        org.apache.avro.Schema.Parser parser9 = parser7.setValidate(false);
        java.io.File file10 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.avro.Schema schema11 = parser9.parse(file10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strMap1);
        org.junit.Assert.assertNotNull(strMap2);
        org.junit.Assert.assertNotNull(parser5);
        org.junit.Assert.assertNotNull(strMap6);
        org.junit.Assert.assertNotNull(parser7);
        org.junit.Assert.assertNotNull(parser9);
    }

    @Test
    public void test0253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SchemaM3Random300Test0.test0253");
        org.apache.avro.Schema[] schemaArray0 = new org.apache.avro.Schema[] {};
        java.util.ArrayList<org.apache.avro.Schema> schemaList1 = new java.util.ArrayList<org.apache.avro.Schema>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<org.apache.avro.Schema>) schemaList1, schemaArray0);
        org.apache.avro.Schema schema3 = org.apache.avro.Schema.createUnion((java.util.List<org.apache.avro.Schema>) schemaList1);
        org.apache.avro.Schema[] schemaArray4 = new org.apache.avro.Schema[] {};
        java.util.ArrayList<org.apache.avro.Schema> schemaList5 = new java.util.ArrayList<org.apache.avro.Schema>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<org.apache.avro.Schema>) schemaList5, schemaArray4);
        org.apache.avro.Schema schema7 = org.apache.avro.Schema.createUnion((java.util.List<org.apache.avro.Schema>) schemaList5);
        org.apache.avro.Schema schema8 = org.apache.avro.Schema.applyAliases(schema3, schema7);
        java.util.List<org.apache.avro.Schema> schemaList9 = schema8.getTypes();
        boolean boolean11 = schema8.equals((java.lang.Object) "hi!");
        java.lang.String str12 = schema8.getDoc();
        org.apache.avro.Schema schema13 = org.apache.avro.Schema.createArray(schema8);
        java.lang.String str14 = schema8.getFullName();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.avro.Schema schema15 = schema8.getValueType();
            org.junit.Assert.fail("Expected exception of type org.apache.avro.AvroRuntimeException; message: Not a map: []");
        } catch (org.apache.avro.AvroRuntimeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(schemaArray0);
        org.junit.Assert.assertArrayEquals(schemaArray0, new org.apache.avro.Schema[] {});
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(schema3);
        org.junit.Assert.assertNotNull(schemaArray4);
        org.junit.Assert.assertArrayEquals(schemaArray4, new org.apache.avro.Schema[] {});
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(schema7);
        org.junit.Assert.assertNotNull(schema8);
        org.junit.Assert.assertNotNull(schemaList9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNotNull(schema13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "union" + "'", str14, "union");
    }

    @Test
    public void test0254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SchemaM3Random300Test0.test0254");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.avro.Schema schema1 = org.apache.avro.Schema.parse("array");
            org.junit.Assert.fail("Expected exception of type org.apache.avro.SchemaParseException; message: org.codehaus.jackson.JsonParseException: Unexpected character ('a' (code 97)): expected a valid value (number, String, array, object, 'true', 'false' or 'null')? at [Source: java.io.StringReader@5e8844b1; line: 1, column: 2]");
        } catch (org.apache.avro.SchemaParseException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SchemaM3Random300Test0.test0255");
        org.apache.avro.Schema.Names names1 = new org.apache.avro.Schema.Names("{\"type\":\"record\",\"fields\":[]}");
        names1.clear();
    }

    @Test
    public void test0256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SchemaM3Random300Test0.test0256");
        org.apache.avro.Schema schema1 = org.apache.avro.Schema.parse("{\"type\":\"map\",\"values\":[]}");
        java.lang.Class<?> wildcardClass2 = schema1.getClass();
        org.junit.Assert.assertNotNull(schema1);
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test0257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SchemaM3Random300Test0.test0257");
        org.apache.avro.Schema.Parser parser0 = new org.apache.avro.Schema.Parser();
        java.util.Map<java.lang.String, org.apache.avro.Schema> strMap1 = parser0.getTypes();
        org.apache.avro.Schema.Parser parser2 = new org.apache.avro.Schema.Parser();
        org.apache.avro.Schema.Parser parser4 = parser2.setValidate(true);
        java.util.Map<java.lang.String, org.apache.avro.Schema> strMap5 = parser2.getTypes();
        org.apache.avro.Schema.Parser parser6 = parser0.addTypes(strMap5);
        boolean boolean7 = parser0.getValidate();
        boolean boolean8 = parser0.getValidate();
        org.apache.avro.Schema.Parser parser9 = new org.apache.avro.Schema.Parser();
        java.util.Map<java.lang.String, org.apache.avro.Schema> strMap10 = parser9.getTypes();
        java.util.Map<java.lang.String, org.apache.avro.Schema> strMap11 = parser9.getTypes();
        org.apache.avro.Schema.Parser parser12 = new org.apache.avro.Schema.Parser();
        java.util.Map<java.lang.String, org.apache.avro.Schema> strMap13 = parser12.getTypes();
        org.apache.avro.Schema.Parser parser14 = parser9.addTypes(strMap13);
        org.apache.avro.Schema.Parser parser15 = parser0.addTypes(strMap13);
        java.io.InputStream inputStream16 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.avro.Schema schema17 = parser0.parse(inputStream16);
            org.junit.Assert.fail("Expected exception of type java.io.EOFException; message: No content to map to Object due to end of input");
        } catch (java.io.EOFException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strMap1);
        org.junit.Assert.assertNotNull(parser4);
        org.junit.Assert.assertNotNull(strMap5);
        org.junit.Assert.assertNotNull(parser6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(strMap10);
        org.junit.Assert.assertNotNull(strMap11);
        org.junit.Assert.assertNotNull(strMap13);
        org.junit.Assert.assertNotNull(parser14);
        org.junit.Assert.assertNotNull(parser15);
    }

    @Test
    public void test0258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SchemaM3Random300Test0.test0258");
        org.apache.avro.Schema[] schemaArray0 = new org.apache.avro.Schema[] {};
        java.util.ArrayList<org.apache.avro.Schema> schemaList1 = new java.util.ArrayList<org.apache.avro.Schema>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<org.apache.avro.Schema>) schemaList1, schemaArray0);
        org.apache.avro.Schema schema3 = org.apache.avro.Schema.createUnion((java.util.List<org.apache.avro.Schema>) schemaList1);
        org.apache.avro.Schema[] schemaArray4 = new org.apache.avro.Schema[] {};
        java.util.ArrayList<org.apache.avro.Schema> schemaList5 = new java.util.ArrayList<org.apache.avro.Schema>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<org.apache.avro.Schema>) schemaList5, schemaArray4);
        org.apache.avro.Schema schema7 = org.apache.avro.Schema.createUnion((java.util.List<org.apache.avro.Schema>) schemaList5);
        org.apache.avro.Schema schema8 = org.apache.avro.Schema.applyAliases(schema3, schema7);
        java.util.List<org.apache.avro.Schema> schemaList9 = schema8.getTypes();
        org.apache.avro.Schema[] schemaArray10 = new org.apache.avro.Schema[] {};
        java.util.ArrayList<org.apache.avro.Schema> schemaList11 = new java.util.ArrayList<org.apache.avro.Schema>();
        boolean boolean12 = java.util.Collections.addAll((java.util.Collection<org.apache.avro.Schema>) schemaList11, schemaArray10);
        org.apache.avro.Schema schema13 = org.apache.avro.Schema.createUnion((java.util.List<org.apache.avro.Schema>) schemaList11);
        org.apache.avro.Schema[] schemaArray14 = new org.apache.avro.Schema[] {};
        java.util.ArrayList<org.apache.avro.Schema> schemaList15 = new java.util.ArrayList<org.apache.avro.Schema>();
        boolean boolean16 = java.util.Collections.addAll((java.util.Collection<org.apache.avro.Schema>) schemaList15, schemaArray14);
        org.apache.avro.Schema schema17 = org.apache.avro.Schema.createUnion((java.util.List<org.apache.avro.Schema>) schemaList15);
        org.apache.avro.Schema schema18 = org.apache.avro.Schema.applyAliases(schema13, schema17);
        org.apache.avro.Schema schema19 = org.apache.avro.Schema.applyAliases(schema8, schema17);
        org.apache.avro.Schema schema20 = org.apache.avro.Schema.createMap(schema8);
        org.apache.avro.Schema schema21 = org.apache.avro.Schema.createArray(schema20);
        org.apache.avro.Schema schema22 = org.apache.avro.Schema.createMap(schema21);
        java.lang.String str24 = schema21.toString(true);
        // The following exception was thrown during execution in test generation
        try {
            int int26 = schema21.getEnumOrdinal("[]");
            org.junit.Assert.fail("Expected exception of type org.apache.avro.AvroRuntimeException; message: Not an enum: {\"type\":\"array\",\"items\":{\"type\":\"map\",\"values\":[]}}");
        } catch (org.apache.avro.AvroRuntimeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(schemaArray0);
        org.junit.Assert.assertArrayEquals(schemaArray0, new org.apache.avro.Schema[] {});
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(schema3);
        org.junit.Assert.assertNotNull(schemaArray4);
        org.junit.Assert.assertArrayEquals(schemaArray4, new org.apache.avro.Schema[] {});
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(schema7);
        org.junit.Assert.assertNotNull(schema8);
        org.junit.Assert.assertNotNull(schemaList9);
        org.junit.Assert.assertNotNull(schemaArray10);
        org.junit.Assert.assertArrayEquals(schemaArray10, new org.apache.avro.Schema[] {});
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(schema13);
        org.junit.Assert.assertNotNull(schemaArray14);
        org.junit.Assert.assertArrayEquals(schemaArray14, new org.apache.avro.Schema[] {});
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(schema17);
        org.junit.Assert.assertNotNull(schema18);
        org.junit.Assert.assertNotNull(schema19);
        org.junit.Assert.assertNotNull(schema20);
        org.junit.Assert.assertNotNull(schema21);
        org.junit.Assert.assertNotNull(schema22);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "{\r\n  \"type\" : \"array\",\r\n  \"items\" : {\r\n    \"type\" : \"map\",\r\n    \"values\" : [ ]\r\n  }\r\n}" + "'", str24, "{\r\n  \"type\" : \"array\",\r\n  \"items\" : {\r\n    \"type\" : \"map\",\r\n    \"values\" : [ ]\r\n  }\r\n}");
    }

    @Test
    public void test0259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SchemaM3Random300Test0.test0259");
        org.apache.avro.Schema[] schemaArray0 = new org.apache.avro.Schema[] {};
        java.util.ArrayList<org.apache.avro.Schema> schemaList1 = new java.util.ArrayList<org.apache.avro.Schema>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<org.apache.avro.Schema>) schemaList1, schemaArray0);
        org.apache.avro.Schema schema3 = org.apache.avro.Schema.createUnion((java.util.List<org.apache.avro.Schema>) schemaList1);
        org.apache.avro.Schema[] schemaArray4 = new org.apache.avro.Schema[] {};
        java.util.ArrayList<org.apache.avro.Schema> schemaList5 = new java.util.ArrayList<org.apache.avro.Schema>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<org.apache.avro.Schema>) schemaList5, schemaArray4);
        org.apache.avro.Schema schema7 = org.apache.avro.Schema.createUnion((java.util.List<org.apache.avro.Schema>) schemaList5);
        org.apache.avro.Schema schema8 = org.apache.avro.Schema.applyAliases(schema3, schema7);
        java.util.List<org.apache.avro.Schema> schemaList9 = schema8.getTypes();
        org.apache.avro.Schema[] schemaArray10 = new org.apache.avro.Schema[] {};
        java.util.ArrayList<org.apache.avro.Schema> schemaList11 = new java.util.ArrayList<org.apache.avro.Schema>();
        boolean boolean12 = java.util.Collections.addAll((java.util.Collection<org.apache.avro.Schema>) schemaList11, schemaArray10);
        org.apache.avro.Schema schema13 = org.apache.avro.Schema.createUnion((java.util.List<org.apache.avro.Schema>) schemaList11);
        org.apache.avro.Schema[] schemaArray14 = new org.apache.avro.Schema[] {};
        java.util.ArrayList<org.apache.avro.Schema> schemaList15 = new java.util.ArrayList<org.apache.avro.Schema>();
        boolean boolean16 = java.util.Collections.addAll((java.util.Collection<org.apache.avro.Schema>) schemaList15, schemaArray14);
        org.apache.avro.Schema schema17 = org.apache.avro.Schema.createUnion((java.util.List<org.apache.avro.Schema>) schemaList15);
        org.apache.avro.Schema schema18 = org.apache.avro.Schema.applyAliases(schema13, schema17);
        org.apache.avro.Schema schema19 = org.apache.avro.Schema.applyAliases(schema8, schema17);
        org.apache.avro.Schema schema20 = org.apache.avro.Schema.createMap(schema8);
        java.lang.String str22 = schema8.toString(true);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean24 = schema8.hasEnumSymbol("{\r\n  \"type\" : \"array\",\r\n  \"items\" : {\r\n    \"type\" : \"map\",\r\n    \"values\" : [ ]\r\n  }\r\n}");
            org.junit.Assert.fail("Expected exception of type org.apache.avro.AvroRuntimeException; message: Not an enum: []");
        } catch (org.apache.avro.AvroRuntimeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(schemaArray0);
        org.junit.Assert.assertArrayEquals(schemaArray0, new org.apache.avro.Schema[] {});
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(schema3);
        org.junit.Assert.assertNotNull(schemaArray4);
        org.junit.Assert.assertArrayEquals(schemaArray4, new org.apache.avro.Schema[] {});
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(schema7);
        org.junit.Assert.assertNotNull(schema8);
        org.junit.Assert.assertNotNull(schemaList9);
        org.junit.Assert.assertNotNull(schemaArray10);
        org.junit.Assert.assertArrayEquals(schemaArray10, new org.apache.avro.Schema[] {});
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(schema13);
        org.junit.Assert.assertNotNull(schemaArray14);
        org.junit.Assert.assertArrayEquals(schemaArray14, new org.apache.avro.Schema[] {});
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(schema17);
        org.junit.Assert.assertNotNull(schema18);
        org.junit.Assert.assertNotNull(schema19);
        org.junit.Assert.assertNotNull(schema20);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "[ ]" + "'", str22, "[ ]");
    }

    @Test
    public void test0260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SchemaM3Random300Test0.test0260");
        org.apache.avro.Schema schema4 = org.apache.avro.Schema.createFixed("union", "[ ]", "[]", 0);
        org.apache.avro.Schema.Type type5 = org.apache.avro.Schema.Type.INT;
        org.apache.avro.Schema schema6 = org.apache.avro.Schema.create(type5);
        org.apache.avro.Schema schema7 = org.apache.avro.Schema.createArray(schema6);
        org.apache.avro.Schema schema8 = org.apache.avro.Schema.applyAliases(schema4, schema7);
        org.apache.avro.Schema[] schemaArray9 = new org.apache.avro.Schema[] {};
        java.util.ArrayList<org.apache.avro.Schema> schemaList10 = new java.util.ArrayList<org.apache.avro.Schema>();
        boolean boolean11 = java.util.Collections.addAll((java.util.Collection<org.apache.avro.Schema>) schemaList10, schemaArray9);
        org.apache.avro.Schema schema12 = org.apache.avro.Schema.createUnion((java.util.List<org.apache.avro.Schema>) schemaList10);
        org.apache.avro.Schema[] schemaArray13 = new org.apache.avro.Schema[] {};
        java.util.ArrayList<org.apache.avro.Schema> schemaList14 = new java.util.ArrayList<org.apache.avro.Schema>();
        boolean boolean15 = java.util.Collections.addAll((java.util.Collection<org.apache.avro.Schema>) schemaList14, schemaArray13);
        org.apache.avro.Schema schema16 = org.apache.avro.Schema.createUnion((java.util.List<org.apache.avro.Schema>) schemaList14);
        org.apache.avro.Schema schema17 = org.apache.avro.Schema.applyAliases(schema12, schema16);
        org.apache.avro.Schema.Type type18 = schema16.getType();
        org.apache.avro.Schema.Type type19 = schema16.getType();
        org.apache.avro.Schema schema20 = org.apache.avro.Schema.applyAliases(schema8, schema16);
        // The following exception was thrown during execution in test generation
        try {
            schema20.addAlias("union type:UNION pos:-1");
            org.junit.Assert.fail("Expected exception of type org.apache.avro.SchemaParseException; message: Illegal character in: union type:UNION pos:-1");
        } catch (org.apache.avro.SchemaParseException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(schema4);
        org.junit.Assert.assertTrue("'" + type5 + "' != '" + org.apache.avro.Schema.Type.INT + "'", type5.equals(org.apache.avro.Schema.Type.INT));
        org.junit.Assert.assertNotNull(schema6);
        org.junit.Assert.assertNotNull(schema7);
        org.junit.Assert.assertNotNull(schema8);
        org.junit.Assert.assertNotNull(schemaArray9);
        org.junit.Assert.assertArrayEquals(schemaArray9, new org.apache.avro.Schema[] {});
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(schema12);
        org.junit.Assert.assertNotNull(schemaArray13);
        org.junit.Assert.assertArrayEquals(schemaArray13, new org.apache.avro.Schema[] {});
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(schema16);
        org.junit.Assert.assertNotNull(schema17);
        org.junit.Assert.assertTrue("'" + type18 + "' != '" + org.apache.avro.Schema.Type.UNION + "'", type18.equals(org.apache.avro.Schema.Type.UNION));
        org.junit.Assert.assertTrue("'" + type19 + "' != '" + org.apache.avro.Schema.Type.UNION + "'", type19.equals(org.apache.avro.Schema.Type.UNION));
        org.junit.Assert.assertNotNull(schema20);
    }

    @Test
    public void test0261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SchemaM3Random300Test0.test0261");
        org.apache.avro.Schema[] schemaArray0 = new org.apache.avro.Schema[] {};
        java.util.ArrayList<org.apache.avro.Schema> schemaList1 = new java.util.ArrayList<org.apache.avro.Schema>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<org.apache.avro.Schema>) schemaList1, schemaArray0);
        org.apache.avro.Schema schema3 = org.apache.avro.Schema.createUnion((java.util.List<org.apache.avro.Schema>) schemaList1);
        org.apache.avro.Schema[] schemaArray4 = new org.apache.avro.Schema[] {};
        java.util.ArrayList<org.apache.avro.Schema> schemaList5 = new java.util.ArrayList<org.apache.avro.Schema>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<org.apache.avro.Schema>) schemaList5, schemaArray4);
        org.apache.avro.Schema schema7 = org.apache.avro.Schema.createUnion((java.util.List<org.apache.avro.Schema>) schemaList5);
        org.apache.avro.Schema schema8 = org.apache.avro.Schema.applyAliases(schema3, schema7);
        org.apache.avro.Schema.Type type9 = schema7.getType();
        org.apache.avro.Schema schema10 = org.apache.avro.Schema.createMap(schema7);
        org.apache.avro.Schema schema11 = org.apache.avro.Schema.createArray(schema10);
        // The following exception was thrown during execution in test generation
        try {
            java.util.Set<java.lang.String> strSet12 = schema11.getAliases();
            org.junit.Assert.fail("Expected exception of type org.apache.avro.AvroRuntimeException; message: Not a named type: {\"type\":\"array\",\"items\":{\"type\":\"map\",\"values\":[]}}");
        } catch (org.apache.avro.AvroRuntimeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(schemaArray0);
        org.junit.Assert.assertArrayEquals(schemaArray0, new org.apache.avro.Schema[] {});
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(schema3);
        org.junit.Assert.assertNotNull(schemaArray4);
        org.junit.Assert.assertArrayEquals(schemaArray4, new org.apache.avro.Schema[] {});
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(schema7);
        org.junit.Assert.assertNotNull(schema8);
        org.junit.Assert.assertTrue("'" + type9 + "' != '" + org.apache.avro.Schema.Type.UNION + "'", type9.equals(org.apache.avro.Schema.Type.UNION));
        org.junit.Assert.assertNotNull(schema10);
        org.junit.Assert.assertNotNull(schema11);
    }

    @Test
    public void test0262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SchemaM3Random300Test0.test0262");
        org.apache.avro.Schema.Parser parser0 = new org.apache.avro.Schema.Parser();
        java.util.Map<java.lang.String, org.apache.avro.Schema> strMap1 = parser0.getTypes();
        java.util.Map<java.lang.String, org.apache.avro.Schema> strMap2 = parser0.getTypes();
        org.apache.avro.Schema.Parser parser3 = new org.apache.avro.Schema.Parser();
        java.util.Map<java.lang.String, org.apache.avro.Schema> strMap4 = parser3.getTypes();
        org.apache.avro.Schema.Parser parser5 = parser0.addTypes(strMap4);
        org.apache.avro.Schema.Parser parser7 = parser0.setValidate(true);
        org.apache.avro.Schema.Parser parser9 = parser0.setValidate(false);
        java.io.InputStream inputStream10 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.avro.Schema schema11 = parser0.parse(inputStream10);
            org.junit.Assert.fail("Expected exception of type java.io.EOFException; message: No content to map to Object due to end of input");
        } catch (java.io.EOFException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strMap1);
        org.junit.Assert.assertNotNull(strMap2);
        org.junit.Assert.assertNotNull(strMap4);
        org.junit.Assert.assertNotNull(parser5);
        org.junit.Assert.assertNotNull(parser7);
        org.junit.Assert.assertNotNull(parser9);
    }

    @Test
    public void test0263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SchemaM3Random300Test0.test0263");
        org.apache.avro.Schema.Parser parser0 = new org.apache.avro.Schema.Parser();
        java.util.Map<java.lang.String, org.apache.avro.Schema> strMap1 = parser0.getTypes();
        java.util.Map<java.lang.String, org.apache.avro.Schema> strMap2 = parser0.getTypes();
        org.apache.avro.Schema.Parser parser3 = new org.apache.avro.Schema.Parser();
        org.apache.avro.Schema.Parser parser5 = parser3.setValidate(true);
        java.util.Map<java.lang.String, org.apache.avro.Schema> strMap6 = parser3.getTypes();
        org.apache.avro.Schema.Parser parser7 = parser0.addTypes(strMap6);
        java.util.Map<java.lang.String, org.apache.avro.Schema> strMap8 = parser0.getTypes();
        org.apache.avro.Schema.Parser parser10 = parser0.setValidate(false);
        java.io.File file11 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.avro.Schema schema12 = parser10.parse(file11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strMap1);
        org.junit.Assert.assertNotNull(strMap2);
        org.junit.Assert.assertNotNull(parser5);
        org.junit.Assert.assertNotNull(strMap6);
        org.junit.Assert.assertNotNull(parser7);
        org.junit.Assert.assertNotNull(strMap8);
        org.junit.Assert.assertNotNull(parser10);
    }

    @Test
    public void test0264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SchemaM3Random300Test0.test0264");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.avro.Schema schema4 = org.apache.avro.Schema.createRecord("{\"type\":\"record\",\"fields\":[]}", "map", "union type:MAP pos:-1", false);
            org.junit.Assert.fail("Expected exception of type org.apache.avro.SchemaParseException; message: Illegal initial character: {\"type\":\"record\",\"fields\":[]}");
        } catch (org.apache.avro.SchemaParseException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SchemaM3Random300Test0.test0265");
        org.apache.avro.Schema.LockableArrayList<org.codehaus.jackson.Versioned> versionedList0 = new org.apache.avro.Schema.LockableArrayList<org.codehaus.jackson.Versioned>();
    }

    @Test
    public void test0266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SchemaM3Random300Test0.test0266");
        org.apache.avro.Schema schema1 = org.apache.avro.Schema.parse("{\r\n  \"type\" : \"fixed\",\r\n  \"name\" : \"union\",\r\n  \"namespace\" : \"[]\",\r\n  \"doc\" : \"[ ]\",\r\n  \"size\" : 0\r\n}");
        org.junit.Assert.assertNotNull(schema1);
    }

    @Test
    public void test0267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SchemaM3Random300Test0.test0267");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.avro.Schema schema4 = org.apache.avro.Schema.createRecord("[ ]", "union type:UNION pos:-1", "{\"type\":\"record\",\"fields\":[]}", true);
            org.junit.Assert.fail("Expected exception of type org.apache.avro.SchemaParseException; message: Illegal initial character: [ ]");
        } catch (org.apache.avro.SchemaParseException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SchemaM3Random300Test0.test0268");
        org.apache.avro.Schema.Parser parser0 = new org.apache.avro.Schema.Parser();
        java.util.Map<java.lang.String, org.apache.avro.Schema> strMap1 = parser0.getTypes();
        java.util.Map<java.lang.String, org.apache.avro.Schema> strMap2 = parser0.getTypes();
        org.apache.avro.Schema.Parser parser3 = new org.apache.avro.Schema.Parser();
        java.util.Map<java.lang.String, org.apache.avro.Schema> strMap4 = parser3.getTypes();
        org.apache.avro.Schema.Parser parser5 = parser0.addTypes(strMap4);
        org.apache.avro.Schema.Parser parser7 = parser0.setValidate(true);
        org.apache.avro.Schema.Parser parser9 = parser0.setValidate(false);
        org.apache.avro.Schema.Parser parser10 = new org.apache.avro.Schema.Parser();
        java.util.Map<java.lang.String, org.apache.avro.Schema> strMap11 = parser10.getTypes();
        java.util.Map<java.lang.String, org.apache.avro.Schema> strMap12 = parser10.getTypes();
        org.apache.avro.Schema.Parser parser13 = new org.apache.avro.Schema.Parser();
        java.util.Map<java.lang.String, org.apache.avro.Schema> strMap14 = parser13.getTypes();
        org.apache.avro.Schema.Parser parser15 = parser10.addTypes(strMap14);
        org.apache.avro.Schema.Parser parser16 = parser9.addTypes(strMap14);
        boolean boolean17 = parser9.getValidate();
        org.junit.Assert.assertNotNull(strMap1);
        org.junit.Assert.assertNotNull(strMap2);
        org.junit.Assert.assertNotNull(strMap4);
        org.junit.Assert.assertNotNull(parser5);
        org.junit.Assert.assertNotNull(parser7);
        org.junit.Assert.assertNotNull(parser9);
        org.junit.Assert.assertNotNull(strMap11);
        org.junit.Assert.assertNotNull(strMap12);
        org.junit.Assert.assertNotNull(strMap14);
        org.junit.Assert.assertNotNull(parser15);
        org.junit.Assert.assertNotNull(parser16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test0269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SchemaM3Random300Test0.test0269");
        org.apache.avro.Schema[] schemaArray0 = new org.apache.avro.Schema[] {};
        java.util.ArrayList<org.apache.avro.Schema> schemaList1 = new java.util.ArrayList<org.apache.avro.Schema>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<org.apache.avro.Schema>) schemaList1, schemaArray0);
        org.apache.avro.Schema schema3 = org.apache.avro.Schema.createUnion((java.util.List<org.apache.avro.Schema>) schemaList1);
        org.apache.avro.Schema[] schemaArray4 = new org.apache.avro.Schema[] {};
        java.util.ArrayList<org.apache.avro.Schema> schemaList5 = new java.util.ArrayList<org.apache.avro.Schema>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<org.apache.avro.Schema>) schemaList5, schemaArray4);
        org.apache.avro.Schema schema7 = org.apache.avro.Schema.createUnion((java.util.List<org.apache.avro.Schema>) schemaList5);
        org.apache.avro.Schema schema8 = org.apache.avro.Schema.applyAliases(schema3, schema7);
        // The following exception was thrown during execution in test generation
        try {
            schema8.addAlias("{\r\n  \"type\" : \"map\",\r\n  \"values\" : {\r\n    \"type\" : \"map\",\r\n    \"values\" : [ ]\r\n  }\r\n}");
            org.junit.Assert.fail("Expected exception of type org.apache.avro.AvroRuntimeException; message: Not a named type: []");
        } catch (org.apache.avro.AvroRuntimeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(schemaArray0);
        org.junit.Assert.assertArrayEquals(schemaArray0, new org.apache.avro.Schema[] {});
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(schema3);
        org.junit.Assert.assertNotNull(schemaArray4);
        org.junit.Assert.assertArrayEquals(schemaArray4, new org.apache.avro.Schema[] {});
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(schema7);
        org.junit.Assert.assertNotNull(schema8);
    }

    @Test
    public void test0270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SchemaM3Random300Test0.test0270");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.avro.Schema schema4 = org.apache.avro.Schema.createFixed("", "", "{\"type\":\"map\",\"values\":[]}", (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type org.apache.avro.SchemaParseException; message: Empty name");
        } catch (org.apache.avro.SchemaParseException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SchemaM3Random300Test0.test0271");
        org.apache.avro.Schema[] schemaArray0 = new org.apache.avro.Schema[] {};
        java.util.ArrayList<org.apache.avro.Schema> schemaList1 = new java.util.ArrayList<org.apache.avro.Schema>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<org.apache.avro.Schema>) schemaList1, schemaArray0);
        org.apache.avro.Schema schema3 = org.apache.avro.Schema.createUnion((java.util.List<org.apache.avro.Schema>) schemaList1);
        org.apache.avro.Schema[] schemaArray4 = new org.apache.avro.Schema[] {};
        java.util.ArrayList<org.apache.avro.Schema> schemaList5 = new java.util.ArrayList<org.apache.avro.Schema>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<org.apache.avro.Schema>) schemaList5, schemaArray4);
        org.apache.avro.Schema schema7 = org.apache.avro.Schema.createUnion((java.util.List<org.apache.avro.Schema>) schemaList5);
        org.apache.avro.Schema schema8 = org.apache.avro.Schema.applyAliases(schema3, schema7);
        java.util.List<org.apache.avro.Schema> schemaList9 = schema8.getTypes();
        org.apache.avro.Schema[] schemaArray10 = new org.apache.avro.Schema[] {};
        java.util.ArrayList<org.apache.avro.Schema> schemaList11 = new java.util.ArrayList<org.apache.avro.Schema>();
        boolean boolean12 = java.util.Collections.addAll((java.util.Collection<org.apache.avro.Schema>) schemaList11, schemaArray10);
        org.apache.avro.Schema schema13 = org.apache.avro.Schema.createUnion((java.util.List<org.apache.avro.Schema>) schemaList11);
        org.apache.avro.Schema[] schemaArray14 = new org.apache.avro.Schema[] {};
        java.util.ArrayList<org.apache.avro.Schema> schemaList15 = new java.util.ArrayList<org.apache.avro.Schema>();
        boolean boolean16 = java.util.Collections.addAll((java.util.Collection<org.apache.avro.Schema>) schemaList15, schemaArray14);
        org.apache.avro.Schema schema17 = org.apache.avro.Schema.createUnion((java.util.List<org.apache.avro.Schema>) schemaList15);
        org.apache.avro.Schema schema18 = org.apache.avro.Schema.applyAliases(schema13, schema17);
        org.apache.avro.Schema schema19 = org.apache.avro.Schema.applyAliases(schema8, schema17);
        org.apache.avro.Schema schema20 = org.apache.avro.Schema.createMap(schema8);
        org.apache.avro.Schema schema21 = org.apache.avro.Schema.createArray(schema20);
        org.apache.avro.Schema schema22 = org.apache.avro.Schema.createMap(schema21);
        java.lang.String str24 = schema21.toString(true);
        // The following exception was thrown during execution in test generation
        try {
            int int26 = schema21.getEnumOrdinal("array");
            org.junit.Assert.fail("Expected exception of type org.apache.avro.AvroRuntimeException; message: Not an enum: {\"type\":\"array\",\"items\":{\"type\":\"map\",\"values\":[]}}");
        } catch (org.apache.avro.AvroRuntimeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(schemaArray0);
        org.junit.Assert.assertArrayEquals(schemaArray0, new org.apache.avro.Schema[] {});
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(schema3);
        org.junit.Assert.assertNotNull(schemaArray4);
        org.junit.Assert.assertArrayEquals(schemaArray4, new org.apache.avro.Schema[] {});
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(schema7);
        org.junit.Assert.assertNotNull(schema8);
        org.junit.Assert.assertNotNull(schemaList9);
        org.junit.Assert.assertNotNull(schemaArray10);
        org.junit.Assert.assertArrayEquals(schemaArray10, new org.apache.avro.Schema[] {});
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(schema13);
        org.junit.Assert.assertNotNull(schemaArray14);
        org.junit.Assert.assertArrayEquals(schemaArray14, new org.apache.avro.Schema[] {});
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(schema17);
        org.junit.Assert.assertNotNull(schema18);
        org.junit.Assert.assertNotNull(schema19);
        org.junit.Assert.assertNotNull(schema20);
        org.junit.Assert.assertNotNull(schema21);
        org.junit.Assert.assertNotNull(schema22);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "{\r\n  \"type\" : \"array\",\r\n  \"items\" : {\r\n    \"type\" : \"map\",\r\n    \"values\" : [ ]\r\n  }\r\n}" + "'", str24, "{\r\n  \"type\" : \"array\",\r\n  \"items\" : {\r\n    \"type\" : \"map\",\r\n    \"values\" : [ ]\r\n  }\r\n}");
    }

    @Test
    public void test0272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SchemaM3Random300Test0.test0272");
        org.apache.avro.Schema.Parser parser0 = new org.apache.avro.Schema.Parser();
        java.util.Map<java.lang.String, org.apache.avro.Schema> strMap1 = parser0.getTypes();
        java.util.Map<java.lang.String, org.apache.avro.Schema> strMap2 = parser0.getTypes();
        org.apache.avro.Schema.Parser parser3 = new org.apache.avro.Schema.Parser();
        java.util.Map<java.lang.String, org.apache.avro.Schema> strMap4 = parser3.getTypes();
        org.apache.avro.Schema.Parser parser5 = parser0.addTypes(strMap4);
        org.apache.avro.Schema schema7 = parser0.parse("{\r\n  \"type\" : \"map\",\r\n  \"values\" : [ ]\r\n}");
        java.io.File file8 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.avro.Schema schema9 = parser0.parse(file8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strMap1);
        org.junit.Assert.assertNotNull(strMap2);
        org.junit.Assert.assertNotNull(strMap4);
        org.junit.Assert.assertNotNull(parser5);
        org.junit.Assert.assertNotNull(schema7);
    }

    @Test
    public void test0273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SchemaM3Random300Test0.test0273");
        org.apache.avro.Schema[] schemaArray0 = new org.apache.avro.Schema[] {};
        java.util.ArrayList<org.apache.avro.Schema> schemaList1 = new java.util.ArrayList<org.apache.avro.Schema>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<org.apache.avro.Schema>) schemaList1, schemaArray0);
        org.apache.avro.Schema schema3 = org.apache.avro.Schema.createUnion((java.util.List<org.apache.avro.Schema>) schemaList1);
        org.apache.avro.Schema[] schemaArray4 = new org.apache.avro.Schema[] {};
        java.util.ArrayList<org.apache.avro.Schema> schemaList5 = new java.util.ArrayList<org.apache.avro.Schema>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<org.apache.avro.Schema>) schemaList5, schemaArray4);
        org.apache.avro.Schema schema7 = org.apache.avro.Schema.createUnion((java.util.List<org.apache.avro.Schema>) schemaList5);
        org.apache.avro.Schema schema8 = org.apache.avro.Schema.applyAliases(schema3, schema7);
        java.util.List<org.apache.avro.Schema> schemaList9 = schema8.getTypes();
        boolean boolean11 = schema8.equals((java.lang.Object) "hi!");
        java.lang.String str12 = schema8.getDoc();
        org.apache.avro.Schema schema13 = org.apache.avro.Schema.createArray(schema8);
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<org.apache.avro.Schema.Field> fieldList14 = schema13.getFields();
            org.junit.Assert.fail("Expected exception of type org.apache.avro.AvroRuntimeException; message: Not a record: {\"type\":\"array\",\"items\":[]}");
        } catch (org.apache.avro.AvroRuntimeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(schemaArray0);
        org.junit.Assert.assertArrayEquals(schemaArray0, new org.apache.avro.Schema[] {});
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(schema3);
        org.junit.Assert.assertNotNull(schemaArray4);
        org.junit.Assert.assertArrayEquals(schemaArray4, new org.apache.avro.Schema[] {});
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(schema7);
        org.junit.Assert.assertNotNull(schema8);
        org.junit.Assert.assertNotNull(schemaList9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNotNull(schema13);
    }

    @Test
    public void test0274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SchemaM3Random300Test0.test0274");
        org.apache.avro.Schema.Type type0 = org.apache.avro.Schema.Type.DOUBLE;
        org.apache.avro.Schema schema1 = org.apache.avro.Schema.create(type0);
        org.apache.avro.Schema schema2 = org.apache.avro.Schema.createMap(schema1);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.avro.Schema.Field field4 = schema1.getField("union type:UNION pos:-1");
            org.junit.Assert.fail("Expected exception of type org.apache.avro.AvroRuntimeException; message: Not a record: \"double\"");
        } catch (org.apache.avro.AvroRuntimeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + type0 + "' != '" + org.apache.avro.Schema.Type.DOUBLE + "'", type0.equals(org.apache.avro.Schema.Type.DOUBLE));
        org.junit.Assert.assertNotNull(schema1);
        org.junit.Assert.assertNotNull(schema2);
    }

    @Test
    public void test0275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SchemaM3Random300Test0.test0275");
        java.lang.CharSequence[] charSequenceArray1 = new java.lang.CharSequence[] { "hi!" };
        java.util.ArrayList<java.lang.CharSequence> charSequenceList2 = new java.util.ArrayList<java.lang.CharSequence>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<java.lang.CharSequence>) charSequenceList2, charSequenceArray1);
        org.apache.avro.Schema.LockableArrayList<java.lang.CharSequence> charSequenceList4 = new org.apache.avro.Schema.LockableArrayList<java.lang.CharSequence>((java.util.List<java.lang.CharSequence>) charSequenceList2);
        org.apache.avro.Schema.LockableArrayList<java.lang.CharSequence> charSequenceList5 = new org.apache.avro.Schema.LockableArrayList<java.lang.CharSequence>((java.util.List<java.lang.CharSequence>) charSequenceList4);
        org.junit.Assert.assertNotNull(charSequenceArray1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
    }

    @Test
    public void test0276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SchemaM3Random300Test0.test0276");
        org.apache.avro.Schema[] schemaArray0 = new org.apache.avro.Schema[] {};
        java.util.ArrayList<org.apache.avro.Schema> schemaList1 = new java.util.ArrayList<org.apache.avro.Schema>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<org.apache.avro.Schema>) schemaList1, schemaArray0);
        org.apache.avro.Schema schema3 = org.apache.avro.Schema.createUnion((java.util.List<org.apache.avro.Schema>) schemaList1);
        org.apache.avro.Schema[] schemaArray4 = new org.apache.avro.Schema[] {};
        java.util.ArrayList<org.apache.avro.Schema> schemaList5 = new java.util.ArrayList<org.apache.avro.Schema>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<org.apache.avro.Schema>) schemaList5, schemaArray4);
        org.apache.avro.Schema schema7 = org.apache.avro.Schema.createUnion((java.util.List<org.apache.avro.Schema>) schemaList5);
        org.apache.avro.Schema schema8 = org.apache.avro.Schema.applyAliases(schema3, schema7);
        java.lang.String str9 = schema3.getFullName();
        org.apache.avro.Schema schema10 = org.apache.avro.Schema.createArray(schema3);
        org.apache.avro.Schema.Names names12 = new org.apache.avro.Schema.Names("union type:UNION pos:-1");
        names12.space("map");
        org.codehaus.jackson.JsonGenerator jsonGenerator15 = null;
        // The following exception was thrown during execution in test generation
        try {
            schema3.toJson(names12, jsonGenerator15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(schemaArray0);
        org.junit.Assert.assertArrayEquals(schemaArray0, new org.apache.avro.Schema[] {});
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(schema3);
        org.junit.Assert.assertNotNull(schemaArray4);
        org.junit.Assert.assertArrayEquals(schemaArray4, new org.apache.avro.Schema[] {});
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(schema7);
        org.junit.Assert.assertNotNull(schema8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "union" + "'", str9, "union");
        org.junit.Assert.assertNotNull(schema10);
    }

    @Test
    public void test0277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SchemaM3Random300Test0.test0277");
        org.apache.avro.Schema.Parser parser0 = new org.apache.avro.Schema.Parser();
        org.apache.avro.Schema.Parser parser2 = parser0.setValidate(true);
        java.util.Map<java.lang.String, org.apache.avro.Schema> strMap3 = parser0.getTypes();
        java.util.Map<java.lang.String, org.apache.avro.Schema> strMap4 = parser0.getTypes();
        java.io.InputStream inputStream5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.avro.Schema schema6 = parser0.parse(inputStream5);
            org.junit.Assert.fail("Expected exception of type java.io.EOFException; message: No content to map to Object due to end of input");
        } catch (java.io.EOFException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(parser2);
        org.junit.Assert.assertNotNull(strMap3);
        org.junit.Assert.assertNotNull(strMap4);
    }

    @Test
    public void test0278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SchemaM3Random300Test0.test0278");
        org.apache.avro.Schema[] schemaArray0 = new org.apache.avro.Schema[] {};
        java.util.ArrayList<org.apache.avro.Schema> schemaList1 = new java.util.ArrayList<org.apache.avro.Schema>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<org.apache.avro.Schema>) schemaList1, schemaArray0);
        org.apache.avro.Schema schema3 = org.apache.avro.Schema.createUnion((java.util.List<org.apache.avro.Schema>) schemaList1);
        org.apache.avro.Schema[] schemaArray4 = new org.apache.avro.Schema[] {};
        java.util.ArrayList<org.apache.avro.Schema> schemaList5 = new java.util.ArrayList<org.apache.avro.Schema>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<org.apache.avro.Schema>) schemaList5, schemaArray4);
        org.apache.avro.Schema schema7 = org.apache.avro.Schema.createUnion((java.util.List<org.apache.avro.Schema>) schemaList5);
        org.apache.avro.Schema schema8 = org.apache.avro.Schema.applyAliases(schema3, schema7);
        java.util.List<org.apache.avro.Schema> schemaList9 = schema8.getTypes();
        boolean boolean11 = schema8.equals((java.lang.Object) "hi!");
        java.lang.String str12 = schema8.getDoc();
        org.apache.avro.Schema schema13 = org.apache.avro.Schema.createArray(schema8);
        java.lang.String str14 = schema8.toString();
        org.apache.avro.Schema schema15 = org.apache.avro.Schema.createArray(schema8);
        schema15.addProp("map", "[]");
        schema15.addProp("union", "");
        org.junit.Assert.assertNotNull(schemaArray0);
        org.junit.Assert.assertArrayEquals(schemaArray0, new org.apache.avro.Schema[] {});
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(schema3);
        org.junit.Assert.assertNotNull(schemaArray4);
        org.junit.Assert.assertArrayEquals(schemaArray4, new org.apache.avro.Schema[] {});
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(schema7);
        org.junit.Assert.assertNotNull(schema8);
        org.junit.Assert.assertNotNull(schemaList9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNotNull(schema13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "[]" + "'", str14, "[]");
        org.junit.Assert.assertNotNull(schema15);
    }

    @Test
    public void test0279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SchemaM3Random300Test0.test0279");
        org.apache.avro.Schema[] schemaArray0 = new org.apache.avro.Schema[] {};
        java.util.ArrayList<org.apache.avro.Schema> schemaList1 = new java.util.ArrayList<org.apache.avro.Schema>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<org.apache.avro.Schema>) schemaList1, schemaArray0);
        org.apache.avro.Schema schema3 = org.apache.avro.Schema.createUnion((java.util.List<org.apache.avro.Schema>) schemaList1);
        org.apache.avro.Schema[] schemaArray4 = new org.apache.avro.Schema[] {};
        java.util.ArrayList<org.apache.avro.Schema> schemaList5 = new java.util.ArrayList<org.apache.avro.Schema>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<org.apache.avro.Schema>) schemaList5, schemaArray4);
        org.apache.avro.Schema schema7 = org.apache.avro.Schema.createUnion((java.util.List<org.apache.avro.Schema>) schemaList5);
        org.apache.avro.Schema schema8 = org.apache.avro.Schema.applyAliases(schema3, schema7);
        java.util.List<org.apache.avro.Schema> schemaList9 = schema8.getTypes();
        org.apache.avro.Schema[] schemaArray10 = new org.apache.avro.Schema[] {};
        java.util.ArrayList<org.apache.avro.Schema> schemaList11 = new java.util.ArrayList<org.apache.avro.Schema>();
        boolean boolean12 = java.util.Collections.addAll((java.util.Collection<org.apache.avro.Schema>) schemaList11, schemaArray10);
        org.apache.avro.Schema schema13 = org.apache.avro.Schema.createUnion((java.util.List<org.apache.avro.Schema>) schemaList11);
        org.apache.avro.Schema[] schemaArray14 = new org.apache.avro.Schema[] {};
        java.util.ArrayList<org.apache.avro.Schema> schemaList15 = new java.util.ArrayList<org.apache.avro.Schema>();
        boolean boolean16 = java.util.Collections.addAll((java.util.Collection<org.apache.avro.Schema>) schemaList15, schemaArray14);
        org.apache.avro.Schema schema17 = org.apache.avro.Schema.createUnion((java.util.List<org.apache.avro.Schema>) schemaList15);
        org.apache.avro.Schema schema18 = org.apache.avro.Schema.applyAliases(schema13, schema17);
        org.apache.avro.Schema schema19 = org.apache.avro.Schema.applyAliases(schema8, schema17);
        java.util.List<org.apache.avro.Schema> schemaList20 = schema8.getTypes();
        java.util.List<org.apache.avro.Schema.Field> fieldList21 = null;
        // The following exception was thrown during execution in test generation
        try {
            schema8.setFields(fieldList21);
            org.junit.Assert.fail("Expected exception of type org.apache.avro.AvroRuntimeException; message: Not a record: []");
        } catch (org.apache.avro.AvroRuntimeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(schemaArray0);
        org.junit.Assert.assertArrayEquals(schemaArray0, new org.apache.avro.Schema[] {});
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(schema3);
        org.junit.Assert.assertNotNull(schemaArray4);
        org.junit.Assert.assertArrayEquals(schemaArray4, new org.apache.avro.Schema[] {});
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(schema7);
        org.junit.Assert.assertNotNull(schema8);
        org.junit.Assert.assertNotNull(schemaList9);
        org.junit.Assert.assertNotNull(schemaArray10);
        org.junit.Assert.assertArrayEquals(schemaArray10, new org.apache.avro.Schema[] {});
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(schema13);
        org.junit.Assert.assertNotNull(schemaArray14);
        org.junit.Assert.assertArrayEquals(schemaArray14, new org.apache.avro.Schema[] {});
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(schema17);
        org.junit.Assert.assertNotNull(schema18);
        org.junit.Assert.assertNotNull(schema19);
        org.junit.Assert.assertNotNull(schemaList20);
    }

    @Test
    public void test0280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SchemaM3Random300Test0.test0280");
        org.apache.avro.Schema[] schemaArray0 = new org.apache.avro.Schema[] {};
        java.util.ArrayList<org.apache.avro.Schema> schemaList1 = new java.util.ArrayList<org.apache.avro.Schema>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<org.apache.avro.Schema>) schemaList1, schemaArray0);
        org.apache.avro.Schema schema3 = org.apache.avro.Schema.createUnion((java.util.List<org.apache.avro.Schema>) schemaList1);
        org.apache.avro.Schema[] schemaArray4 = new org.apache.avro.Schema[] {};
        java.util.ArrayList<org.apache.avro.Schema> schemaList5 = new java.util.ArrayList<org.apache.avro.Schema>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<org.apache.avro.Schema>) schemaList5, schemaArray4);
        org.apache.avro.Schema schema7 = org.apache.avro.Schema.createUnion((java.util.List<org.apache.avro.Schema>) schemaList5);
        org.apache.avro.Schema schema8 = org.apache.avro.Schema.applyAliases(schema3, schema7);
        org.apache.avro.Schema.Type type9 = schema7.getType();
        org.apache.avro.Schema schema10 = org.apache.avro.Schema.createMap(schema7);
        org.apache.avro.Schema schema11 = org.apache.avro.Schema.createArray(schema10);
        // The following exception was thrown during execution in test generation
        try {
            int int13 = schema11.getEnumOrdinal("union type:UNION pos:-1");
            org.junit.Assert.fail("Expected exception of type org.apache.avro.AvroRuntimeException; message: Not an enum: {\"type\":\"array\",\"items\":{\"type\":\"map\",\"values\":[]}}");
        } catch (org.apache.avro.AvroRuntimeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(schemaArray0);
        org.junit.Assert.assertArrayEquals(schemaArray0, new org.apache.avro.Schema[] {});
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(schema3);
        org.junit.Assert.assertNotNull(schemaArray4);
        org.junit.Assert.assertArrayEquals(schemaArray4, new org.apache.avro.Schema[] {});
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(schema7);
        org.junit.Assert.assertNotNull(schema8);
        org.junit.Assert.assertTrue("'" + type9 + "' != '" + org.apache.avro.Schema.Type.UNION + "'", type9.equals(org.apache.avro.Schema.Type.UNION));
        org.junit.Assert.assertNotNull(schema10);
        org.junit.Assert.assertNotNull(schema11);
    }

    @Test
    public void test0281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SchemaM3Random300Test0.test0281");
        org.codehaus.jackson.JsonFactory jsonFactory0 = org.apache.avro.Schema.FACTORY;
        org.codehaus.jackson.JsonFactory[] jsonFactoryArray1 = new org.codehaus.jackson.JsonFactory[] { jsonFactory0 };
        java.util.ArrayList<org.codehaus.jackson.JsonFactory> jsonFactoryList2 = new java.util.ArrayList<org.codehaus.jackson.JsonFactory>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<org.codehaus.jackson.JsonFactory>) jsonFactoryList2, jsonFactoryArray1);
        org.apache.avro.Schema.LockableArrayList<org.codehaus.jackson.JsonFactory> jsonFactoryList4 = new org.apache.avro.Schema.LockableArrayList<org.codehaus.jackson.JsonFactory>((java.util.List<org.codehaus.jackson.JsonFactory>) jsonFactoryList2);
        org.apache.avro.Schema.LockableArrayList<org.codehaus.jackson.JsonFactory> jsonFactoryList5 = new org.apache.avro.Schema.LockableArrayList<org.codehaus.jackson.JsonFactory>((java.util.List<org.codehaus.jackson.JsonFactory>) jsonFactoryList2);
        org.junit.Assert.assertNotNull(jsonFactory0);
        org.junit.Assert.assertNotNull(jsonFactoryArray1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
    }

    @Test
    public void test0282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SchemaM3Random300Test0.test0282");
        org.apache.avro.Schema.Parser parser0 = new org.apache.avro.Schema.Parser();
        java.util.Map<java.lang.String, org.apache.avro.Schema> strMap1 = parser0.getTypes();
        java.util.Map<java.lang.String, org.apache.avro.Schema> strMap2 = parser0.getTypes();
        org.apache.avro.Schema.Parser parser3 = new org.apache.avro.Schema.Parser();
        java.util.Map<java.lang.String, org.apache.avro.Schema> strMap4 = parser3.getTypes();
        org.apache.avro.Schema.Parser parser5 = parser0.addTypes(strMap4);
        org.apache.avro.Schema schema7 = parser0.parse("{\r\n  \"type\" : \"map\",\r\n  \"values\" : [ ]\r\n}");
        org.apache.avro.Schema schema8 = schema7.getValueType();
        // The following exception was thrown during execution in test generation
        try {
            schema8.addAlias("{\r\n  \"type\" : \"map\",\r\n  \"values\" : {\r\n    \"type\" : \"map\",\r\n    \"values\" : [ ]\r\n  }\r\n}");
            org.junit.Assert.fail("Expected exception of type org.apache.avro.AvroRuntimeException; message: Not a named type: []");
        } catch (org.apache.avro.AvroRuntimeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strMap1);
        org.junit.Assert.assertNotNull(strMap2);
        org.junit.Assert.assertNotNull(strMap4);
        org.junit.Assert.assertNotNull(parser5);
        org.junit.Assert.assertNotNull(schema7);
        org.junit.Assert.assertNotNull(schema8);
    }

    @Test
    public void test0283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SchemaM3Random300Test0.test0283");
        java.lang.String[] strArray4 = new java.lang.String[] { "" };
        java.util.ArrayList<java.lang.String> strList5 = new java.util.ArrayList<java.lang.String>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList5, strArray4);
        org.apache.avro.Schema.LockableArrayList<java.lang.String> strList7 = new org.apache.avro.Schema.LockableArrayList<java.lang.String>((java.util.List<java.lang.String>) strList5);
        org.apache.avro.Schema.LockableArrayList<java.lang.String> strList8 = new org.apache.avro.Schema.LockableArrayList<java.lang.String>((java.util.List<java.lang.String>) strList5);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.avro.Schema schema9 = org.apache.avro.Schema.createEnum("{\"type\":\"record\",\"fields\":[]}", "[].union", "[]", (java.util.List<java.lang.String>) strList8);
            org.junit.Assert.fail("Expected exception of type org.apache.avro.SchemaParseException; message: Illegal initial character: {\"type\":\"record\",\"fields\":[]}");
        } catch (org.apache.avro.SchemaParseException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertArrayEquals(strArray4, new java.lang.String[] { "" });
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test0284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SchemaM3Random300Test0.test0284");
        org.apache.avro.Schema[] schemaArray0 = new org.apache.avro.Schema[] {};
        java.util.ArrayList<org.apache.avro.Schema> schemaList1 = new java.util.ArrayList<org.apache.avro.Schema>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<org.apache.avro.Schema>) schemaList1, schemaArray0);
        org.apache.avro.Schema schema3 = org.apache.avro.Schema.createUnion((java.util.List<org.apache.avro.Schema>) schemaList1);
        org.apache.avro.Schema[] schemaArray4 = new org.apache.avro.Schema[] {};
        java.util.ArrayList<org.apache.avro.Schema> schemaList5 = new java.util.ArrayList<org.apache.avro.Schema>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<org.apache.avro.Schema>) schemaList5, schemaArray4);
        org.apache.avro.Schema schema7 = org.apache.avro.Schema.createUnion((java.util.List<org.apache.avro.Schema>) schemaList5);
        org.apache.avro.Schema schema8 = org.apache.avro.Schema.applyAliases(schema3, schema7);
        java.util.List<org.apache.avro.Schema> schemaList9 = schema8.getTypes();
        boolean boolean11 = schema8.equals((java.lang.Object) "hi!");
        java.lang.String str13 = schema8.getProp("[ ]");
        org.apache.avro.Schema schema14 = org.apache.avro.Schema.createArray(schema8);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.avro.Schema schema15 = schema14.getValueType();
            org.junit.Assert.fail("Expected exception of type org.apache.avro.AvroRuntimeException; message: Not a map: {\"type\":\"array\",\"items\":[]}");
        } catch (org.apache.avro.AvroRuntimeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(schemaArray0);
        org.junit.Assert.assertArrayEquals(schemaArray0, new org.apache.avro.Schema[] {});
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(schema3);
        org.junit.Assert.assertNotNull(schemaArray4);
        org.junit.Assert.assertArrayEquals(schemaArray4, new org.apache.avro.Schema[] {});
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(schema7);
        org.junit.Assert.assertNotNull(schema8);
        org.junit.Assert.assertNotNull(schemaList9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNotNull(schema14);
    }

    @Test
    public void test0285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SchemaM3Random300Test0.test0285");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.avro.Schema schema4 = org.apache.avro.Schema.createRecord("", "{\"type\":\"fixed\",\"name\":\"union\",\"namespace\":\"[]\",\"doc\":\"[ ]\",\"size\":0}", "[]", true);
            org.junit.Assert.fail("Expected exception of type org.apache.avro.SchemaParseException; message: Empty name");
        } catch (org.apache.avro.SchemaParseException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SchemaM3Random300Test0.test0286");
        org.apache.avro.Schema schema1 = org.apache.avro.Schema.parse("{\"type\":\"array\",\"items\":[]}");
        java.lang.String str2 = schema1.getName();
        java.lang.Class<?> wildcardClass3 = schema1.getClass();
        org.junit.Assert.assertNotNull(schema1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "array" + "'", str2, "array");
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test0287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SchemaM3Random300Test0.test0287");
        org.apache.avro.Schema[] schemaArray0 = new org.apache.avro.Schema[] {};
        java.util.ArrayList<org.apache.avro.Schema> schemaList1 = new java.util.ArrayList<org.apache.avro.Schema>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<org.apache.avro.Schema>) schemaList1, schemaArray0);
        org.apache.avro.Schema schema3 = org.apache.avro.Schema.createUnion((java.util.List<org.apache.avro.Schema>) schemaList1);
        org.apache.avro.Schema[] schemaArray4 = new org.apache.avro.Schema[] {};
        java.util.ArrayList<org.apache.avro.Schema> schemaList5 = new java.util.ArrayList<org.apache.avro.Schema>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<org.apache.avro.Schema>) schemaList5, schemaArray4);
        org.apache.avro.Schema schema7 = org.apache.avro.Schema.createUnion((java.util.List<org.apache.avro.Schema>) schemaList5);
        org.apache.avro.Schema schema8 = org.apache.avro.Schema.applyAliases(schema3, schema7);
        java.util.List<org.apache.avro.Schema> schemaList9 = schema8.getTypes();
        org.apache.avro.Schema[] schemaArray10 = new org.apache.avro.Schema[] {};
        java.util.ArrayList<org.apache.avro.Schema> schemaList11 = new java.util.ArrayList<org.apache.avro.Schema>();
        boolean boolean12 = java.util.Collections.addAll((java.util.Collection<org.apache.avro.Schema>) schemaList11, schemaArray10);
        org.apache.avro.Schema schema13 = org.apache.avro.Schema.createUnion((java.util.List<org.apache.avro.Schema>) schemaList11);
        org.apache.avro.Schema[] schemaArray14 = new org.apache.avro.Schema[] {};
        java.util.ArrayList<org.apache.avro.Schema> schemaList15 = new java.util.ArrayList<org.apache.avro.Schema>();
        boolean boolean16 = java.util.Collections.addAll((java.util.Collection<org.apache.avro.Schema>) schemaList15, schemaArray14);
        org.apache.avro.Schema schema17 = org.apache.avro.Schema.createUnion((java.util.List<org.apache.avro.Schema>) schemaList15);
        org.apache.avro.Schema schema18 = org.apache.avro.Schema.applyAliases(schema13, schema17);
        org.apache.avro.Schema schema19 = org.apache.avro.Schema.applyAliases(schema8, schema17);
        org.apache.avro.Schema schema20 = org.apache.avro.Schema.createMap(schema8);
        org.apache.avro.Schema schema21 = org.apache.avro.Schema.createArray(schema20);
        java.lang.String str22 = schema20.toString();
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<org.apache.avro.Schema> schemaList23 = schema20.getTypes();
            org.junit.Assert.fail("Expected exception of type org.apache.avro.AvroRuntimeException; message: Not a union: {\"type\":\"map\",\"values\":[]}");
        } catch (org.apache.avro.AvroRuntimeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(schemaArray0);
        org.junit.Assert.assertArrayEquals(schemaArray0, new org.apache.avro.Schema[] {});
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(schema3);
        org.junit.Assert.assertNotNull(schemaArray4);
        org.junit.Assert.assertArrayEquals(schemaArray4, new org.apache.avro.Schema[] {});
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(schema7);
        org.junit.Assert.assertNotNull(schema8);
        org.junit.Assert.assertNotNull(schemaList9);
        org.junit.Assert.assertNotNull(schemaArray10);
        org.junit.Assert.assertArrayEquals(schemaArray10, new org.apache.avro.Schema[] {});
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(schema13);
        org.junit.Assert.assertNotNull(schemaArray14);
        org.junit.Assert.assertArrayEquals(schemaArray14, new org.apache.avro.Schema[] {});
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(schema17);
        org.junit.Assert.assertNotNull(schema18);
        org.junit.Assert.assertNotNull(schema19);
        org.junit.Assert.assertNotNull(schema20);
        org.junit.Assert.assertNotNull(schema21);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "{\"type\":\"map\",\"values\":[]}" + "'", str22, "{\"type\":\"map\",\"values\":[]}");
    }

    @Test
    public void test0288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SchemaM3Random300Test0.test0288");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.avro.Schema schema4 = org.apache.avro.Schema.createRecord("[]", "{\r\n  \"type\" : \"record\",\r\n  \"fields\" : [ ]\r\n}", "[].union", true);
            org.junit.Assert.fail("Expected exception of type org.apache.avro.SchemaParseException; message: Illegal initial character: []");
        } catch (org.apache.avro.SchemaParseException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SchemaM3Random300Test0.test0289");
        org.apache.avro.Schema.Parser parser0 = new org.apache.avro.Schema.Parser();
        java.util.Map<java.lang.String, org.apache.avro.Schema> strMap1 = parser0.getTypes();
        java.util.Map<java.lang.String, org.apache.avro.Schema> strMap2 = parser0.getTypes();
        org.apache.avro.Schema.Parser parser3 = new org.apache.avro.Schema.Parser();
        org.apache.avro.Schema.Parser parser5 = parser3.setValidate(true);
        java.util.Map<java.lang.String, org.apache.avro.Schema> strMap6 = parser3.getTypes();
        org.apache.avro.Schema.Parser parser7 = parser0.addTypes(strMap6);
        org.apache.avro.Schema schema9 = parser7.parse("{\"type\":\"map\",\"values\":[]}");
        org.apache.avro.Schema.Parser parser11 = parser7.setValidate(false);
        java.io.InputStream inputStream12 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.avro.Schema schema13 = parser11.parse(inputStream12);
            org.junit.Assert.fail("Expected exception of type java.io.EOFException; message: No content to map to Object due to end of input");
        } catch (java.io.EOFException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strMap1);
        org.junit.Assert.assertNotNull(strMap2);
        org.junit.Assert.assertNotNull(parser5);
        org.junit.Assert.assertNotNull(strMap6);
        org.junit.Assert.assertNotNull(parser7);
        org.junit.Assert.assertNotNull(schema9);
        org.junit.Assert.assertNotNull(parser11);
    }

    @Test
    public void test0290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SchemaM3Random300Test0.test0290");
        org.apache.avro.Schema[] schemaArray0 = new org.apache.avro.Schema[] {};
        java.util.ArrayList<org.apache.avro.Schema> schemaList1 = new java.util.ArrayList<org.apache.avro.Schema>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<org.apache.avro.Schema>) schemaList1, schemaArray0);
        org.apache.avro.Schema schema3 = org.apache.avro.Schema.createUnion((java.util.List<org.apache.avro.Schema>) schemaList1);
        org.apache.avro.Schema[] schemaArray4 = new org.apache.avro.Schema[] {};
        java.util.ArrayList<org.apache.avro.Schema> schemaList5 = new java.util.ArrayList<org.apache.avro.Schema>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<org.apache.avro.Schema>) schemaList5, schemaArray4);
        org.apache.avro.Schema schema7 = org.apache.avro.Schema.createUnion((java.util.List<org.apache.avro.Schema>) schemaList5);
        org.apache.avro.Schema schema8 = org.apache.avro.Schema.applyAliases(schema3, schema7);
        java.util.List<org.apache.avro.Schema> schemaList9 = schema8.getTypes();
        org.apache.avro.Schema[] schemaArray10 = new org.apache.avro.Schema[] {};
        java.util.ArrayList<org.apache.avro.Schema> schemaList11 = new java.util.ArrayList<org.apache.avro.Schema>();
        boolean boolean12 = java.util.Collections.addAll((java.util.Collection<org.apache.avro.Schema>) schemaList11, schemaArray10);
        org.apache.avro.Schema schema13 = org.apache.avro.Schema.createUnion((java.util.List<org.apache.avro.Schema>) schemaList11);
        org.apache.avro.Schema[] schemaArray14 = new org.apache.avro.Schema[] {};
        java.util.ArrayList<org.apache.avro.Schema> schemaList15 = new java.util.ArrayList<org.apache.avro.Schema>();
        boolean boolean16 = java.util.Collections.addAll((java.util.Collection<org.apache.avro.Schema>) schemaList15, schemaArray14);
        org.apache.avro.Schema schema17 = org.apache.avro.Schema.createUnion((java.util.List<org.apache.avro.Schema>) schemaList15);
        org.apache.avro.Schema schema18 = org.apache.avro.Schema.applyAliases(schema13, schema17);
        org.apache.avro.Schema schema19 = org.apache.avro.Schema.applyAliases(schema8, schema17);
        org.apache.avro.Schema[] schemaArray20 = new org.apache.avro.Schema[] {};
        java.util.ArrayList<org.apache.avro.Schema> schemaList21 = new java.util.ArrayList<org.apache.avro.Schema>();
        boolean boolean22 = java.util.Collections.addAll((java.util.Collection<org.apache.avro.Schema>) schemaList21, schemaArray20);
        org.apache.avro.Schema schema23 = org.apache.avro.Schema.createUnion((java.util.List<org.apache.avro.Schema>) schemaList21);
        org.apache.avro.Schema[] schemaArray24 = new org.apache.avro.Schema[] {};
        java.util.ArrayList<org.apache.avro.Schema> schemaList25 = new java.util.ArrayList<org.apache.avro.Schema>();
        boolean boolean26 = java.util.Collections.addAll((java.util.Collection<org.apache.avro.Schema>) schemaList25, schemaArray24);
        org.apache.avro.Schema schema27 = org.apache.avro.Schema.createUnion((java.util.List<org.apache.avro.Schema>) schemaList25);
        org.apache.avro.Schema schema28 = org.apache.avro.Schema.applyAliases(schema23, schema27);
        java.util.List<org.apache.avro.Schema> schemaList29 = schema28.getTypes();
        org.apache.avro.Schema[] schemaArray30 = new org.apache.avro.Schema[] {};
        java.util.ArrayList<org.apache.avro.Schema> schemaList31 = new java.util.ArrayList<org.apache.avro.Schema>();
        boolean boolean32 = java.util.Collections.addAll((java.util.Collection<org.apache.avro.Schema>) schemaList31, schemaArray30);
        org.apache.avro.Schema schema33 = org.apache.avro.Schema.createUnion((java.util.List<org.apache.avro.Schema>) schemaList31);
        org.apache.avro.Schema[] schemaArray34 = new org.apache.avro.Schema[] {};
        java.util.ArrayList<org.apache.avro.Schema> schemaList35 = new java.util.ArrayList<org.apache.avro.Schema>();
        boolean boolean36 = java.util.Collections.addAll((java.util.Collection<org.apache.avro.Schema>) schemaList35, schemaArray34);
        org.apache.avro.Schema schema37 = org.apache.avro.Schema.createUnion((java.util.List<org.apache.avro.Schema>) schemaList35);
        org.apache.avro.Schema schema38 = org.apache.avro.Schema.applyAliases(schema33, schema37);
        org.apache.avro.Schema schema39 = org.apache.avro.Schema.applyAliases(schema28, schema37);
        org.apache.avro.Schema schema40 = org.apache.avro.Schema.applyAliases(schema8, schema28);
        // The following exception was thrown during execution in test generation
        try {
            schema28.addProp("{\"type\":\"map\",\"values\":[]}", "{\"type\":\"map\",\"values\":[]}");
            org.junit.Assert.fail("Expected exception of type org.apache.avro.AvroRuntimeException; message: Can't set properties on a union: []");
        } catch (org.apache.avro.AvroRuntimeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(schemaArray0);
        org.junit.Assert.assertArrayEquals(schemaArray0, new org.apache.avro.Schema[] {});
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(schema3);
        org.junit.Assert.assertNotNull(schemaArray4);
        org.junit.Assert.assertArrayEquals(schemaArray4, new org.apache.avro.Schema[] {});
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(schema7);
        org.junit.Assert.assertNotNull(schema8);
        org.junit.Assert.assertNotNull(schemaList9);
        org.junit.Assert.assertNotNull(schemaArray10);
        org.junit.Assert.assertArrayEquals(schemaArray10, new org.apache.avro.Schema[] {});
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(schema13);
        org.junit.Assert.assertNotNull(schemaArray14);
        org.junit.Assert.assertArrayEquals(schemaArray14, new org.apache.avro.Schema[] {});
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(schema17);
        org.junit.Assert.assertNotNull(schema18);
        org.junit.Assert.assertNotNull(schema19);
        org.junit.Assert.assertNotNull(schemaArray20);
        org.junit.Assert.assertArrayEquals(schemaArray20, new org.apache.avro.Schema[] {});
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(schema23);
        org.junit.Assert.assertNotNull(schemaArray24);
        org.junit.Assert.assertArrayEquals(schemaArray24, new org.apache.avro.Schema[] {});
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(schema27);
        org.junit.Assert.assertNotNull(schema28);
        org.junit.Assert.assertNotNull(schemaList29);
        org.junit.Assert.assertNotNull(schemaArray30);
        org.junit.Assert.assertArrayEquals(schemaArray30, new org.apache.avro.Schema[] {});
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertNotNull(schema33);
        org.junit.Assert.assertNotNull(schemaArray34);
        org.junit.Assert.assertArrayEquals(schemaArray34, new org.apache.avro.Schema[] {});
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertNotNull(schema37);
        org.junit.Assert.assertNotNull(schema38);
        org.junit.Assert.assertNotNull(schema39);
        org.junit.Assert.assertNotNull(schema40);
    }

    @Test
    public void test0291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SchemaM3Random300Test0.test0291");
        org.apache.avro.Schema.Field[] fieldArray0 = new org.apache.avro.Schema.Field[] {};
        java.util.ArrayList<org.apache.avro.Schema.Field> fieldList1 = new java.util.ArrayList<org.apache.avro.Schema.Field>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<org.apache.avro.Schema.Field>) fieldList1, fieldArray0);
        org.apache.avro.Schema schema3 = org.apache.avro.Schema.createRecord((java.util.List<org.apache.avro.Schema.Field>) fieldList1);
        org.apache.avro.Schema.Field field5 = schema3.getField("");
        org.apache.avro.Schema schema6 = org.apache.avro.Schema.createMap(schema3);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.avro.Schema schema7 = schema6.getElementType();
            org.junit.Assert.fail("Expected exception of type org.apache.avro.AvroRuntimeException; message: Not an array: {\"type\":\"map\",\"values\":{\"type\":\"record\",\"fields\":[]}}");
        } catch (org.apache.avro.AvroRuntimeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(fieldArray0);
        org.junit.Assert.assertArrayEquals(fieldArray0, new org.apache.avro.Schema.Field[] {});
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(schema3);
        org.junit.Assert.assertNull(field5);
        org.junit.Assert.assertNotNull(schema6);
    }

    @Test
    public void test0292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SchemaM3Random300Test0.test0292");
        org.apache.avro.Schema[] schemaArray0 = new org.apache.avro.Schema[] {};
        java.util.ArrayList<org.apache.avro.Schema> schemaList1 = new java.util.ArrayList<org.apache.avro.Schema>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<org.apache.avro.Schema>) schemaList1, schemaArray0);
        org.apache.avro.Schema schema3 = org.apache.avro.Schema.createUnion((java.util.List<org.apache.avro.Schema>) schemaList1);
        org.apache.avro.Schema[] schemaArray4 = new org.apache.avro.Schema[] {};
        java.util.ArrayList<org.apache.avro.Schema> schemaList5 = new java.util.ArrayList<org.apache.avro.Schema>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<org.apache.avro.Schema>) schemaList5, schemaArray4);
        org.apache.avro.Schema schema7 = org.apache.avro.Schema.createUnion((java.util.List<org.apache.avro.Schema>) schemaList5);
        org.apache.avro.Schema schema8 = org.apache.avro.Schema.applyAliases(schema3, schema7);
        java.util.List<org.apache.avro.Schema> schemaList9 = schema8.getTypes();
        org.apache.avro.Schema[] schemaArray10 = new org.apache.avro.Schema[] {};
        java.util.ArrayList<org.apache.avro.Schema> schemaList11 = new java.util.ArrayList<org.apache.avro.Schema>();
        boolean boolean12 = java.util.Collections.addAll((java.util.Collection<org.apache.avro.Schema>) schemaList11, schemaArray10);
        org.apache.avro.Schema schema13 = org.apache.avro.Schema.createUnion((java.util.List<org.apache.avro.Schema>) schemaList11);
        org.apache.avro.Schema[] schemaArray14 = new org.apache.avro.Schema[] {};
        java.util.ArrayList<org.apache.avro.Schema> schemaList15 = new java.util.ArrayList<org.apache.avro.Schema>();
        boolean boolean16 = java.util.Collections.addAll((java.util.Collection<org.apache.avro.Schema>) schemaList15, schemaArray14);
        org.apache.avro.Schema schema17 = org.apache.avro.Schema.createUnion((java.util.List<org.apache.avro.Schema>) schemaList15);
        org.apache.avro.Schema schema18 = org.apache.avro.Schema.applyAliases(schema13, schema17);
        org.apache.avro.Schema schema19 = org.apache.avro.Schema.applyAliases(schema8, schema17);
        org.apache.avro.Schema schema20 = org.apache.avro.Schema.createMap(schema8);
        org.apache.avro.Schema schema21 = org.apache.avro.Schema.createArray(schema20);
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<org.apache.avro.Schema> schemaList22 = schema21.getTypes();
            org.junit.Assert.fail("Expected exception of type org.apache.avro.AvroRuntimeException; message: Not a union: {\"type\":\"array\",\"items\":{\"type\":\"map\",\"values\":[]}}");
        } catch (org.apache.avro.AvroRuntimeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(schemaArray0);
        org.junit.Assert.assertArrayEquals(schemaArray0, new org.apache.avro.Schema[] {});
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(schema3);
        org.junit.Assert.assertNotNull(schemaArray4);
        org.junit.Assert.assertArrayEquals(schemaArray4, new org.apache.avro.Schema[] {});
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(schema7);
        org.junit.Assert.assertNotNull(schema8);
        org.junit.Assert.assertNotNull(schemaList9);
        org.junit.Assert.assertNotNull(schemaArray10);
        org.junit.Assert.assertArrayEquals(schemaArray10, new org.apache.avro.Schema[] {});
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(schema13);
        org.junit.Assert.assertNotNull(schemaArray14);
        org.junit.Assert.assertArrayEquals(schemaArray14, new org.apache.avro.Schema[] {});
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(schema17);
        org.junit.Assert.assertNotNull(schema18);
        org.junit.Assert.assertNotNull(schema19);
        org.junit.Assert.assertNotNull(schema20);
        org.junit.Assert.assertNotNull(schema21);
    }

    @Test
    public void test0293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SchemaM3Random300Test0.test0293");
        org.apache.avro.Schema[] schemaArray0 = new org.apache.avro.Schema[] {};
        java.util.ArrayList<org.apache.avro.Schema> schemaList1 = new java.util.ArrayList<org.apache.avro.Schema>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<org.apache.avro.Schema>) schemaList1, schemaArray0);
        org.apache.avro.Schema schema3 = org.apache.avro.Schema.createUnion((java.util.List<org.apache.avro.Schema>) schemaList1);
        org.apache.avro.Schema[] schemaArray4 = new org.apache.avro.Schema[] {};
        java.util.ArrayList<org.apache.avro.Schema> schemaList5 = new java.util.ArrayList<org.apache.avro.Schema>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<org.apache.avro.Schema>) schemaList5, schemaArray4);
        org.apache.avro.Schema schema7 = org.apache.avro.Schema.createUnion((java.util.List<org.apache.avro.Schema>) schemaList5);
        org.apache.avro.Schema schema8 = org.apache.avro.Schema.applyAliases(schema3, schema7);
        java.util.List<org.apache.avro.Schema> schemaList9 = schema8.getTypes();
        boolean boolean11 = schema8.equals((java.lang.Object) "hi!");
        java.lang.String str12 = schema8.getDoc();
        org.apache.avro.Schema schema13 = org.apache.avro.Schema.createArray(schema8);
        // The following exception was thrown during execution in test generation
        try {
            java.util.Set<java.lang.String> strSet14 = schema13.getAliases();
            org.junit.Assert.fail("Expected exception of type org.apache.avro.AvroRuntimeException; message: Not a named type: {\"type\":\"array\",\"items\":[]}");
        } catch (org.apache.avro.AvroRuntimeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(schemaArray0);
        org.junit.Assert.assertArrayEquals(schemaArray0, new org.apache.avro.Schema[] {});
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(schema3);
        org.junit.Assert.assertNotNull(schemaArray4);
        org.junit.Assert.assertArrayEquals(schemaArray4, new org.apache.avro.Schema[] {});
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(schema7);
        org.junit.Assert.assertNotNull(schema8);
        org.junit.Assert.assertNotNull(schemaList9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNotNull(schema13);
    }

    @Test
    public void test0294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SchemaM3Random300Test0.test0294");
        org.apache.avro.Schema.Parser parser0 = new org.apache.avro.Schema.Parser();
        java.util.Map<java.lang.String, org.apache.avro.Schema> strMap1 = parser0.getTypes();
        java.util.Map<java.lang.String, org.apache.avro.Schema> strMap2 = parser0.getTypes();
        org.apache.avro.Schema.Parser parser3 = new org.apache.avro.Schema.Parser();
        org.apache.avro.Schema.Parser parser5 = parser3.setValidate(true);
        java.util.Map<java.lang.String, org.apache.avro.Schema> strMap6 = parser3.getTypes();
        org.apache.avro.Schema.Parser parser7 = parser0.addTypes(strMap6);
        org.apache.avro.Schema schema9 = parser7.parse("{\"type\":\"map\",\"values\":[]}");
        org.apache.avro.Schema.Parser parser11 = parser7.setValidate(false);
        org.apache.avro.Schema schema13 = parser7.parse("[].union");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.avro.Schema.Field field15 = schema13.getField("map");
            org.junit.Assert.fail("Expected exception of type org.apache.avro.AvroRuntimeException; message: Not a record: []");
        } catch (org.apache.avro.AvroRuntimeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strMap1);
        org.junit.Assert.assertNotNull(strMap2);
        org.junit.Assert.assertNotNull(parser5);
        org.junit.Assert.assertNotNull(strMap6);
        org.junit.Assert.assertNotNull(parser7);
        org.junit.Assert.assertNotNull(schema9);
        org.junit.Assert.assertNotNull(parser11);
        org.junit.Assert.assertNotNull(schema13);
    }

    @Test
    public void test0295() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SchemaM3Random300Test0.test0295");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.avro.Schema schema2 = org.apache.avro.Schema.parse("map", true);
            org.junit.Assert.fail("Expected exception of type org.apache.avro.SchemaParseException; message: org.codehaus.jackson.JsonParseException: Unexpected character ('m' (code 109)): expected a valid value (number, String, array, object, 'true', 'false' or 'null')? at [Source: java.io.StringReader@5244869c; line: 1, column: 2]");
        } catch (org.apache.avro.SchemaParseException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0296() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SchemaM3Random300Test0.test0296");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.avro.Schema schema1 = org.apache.avro.Schema.parse("union type:UNION pos:-1");
            org.junit.Assert.fail("Expected exception of type org.apache.avro.SchemaParseException; message: org.codehaus.jackson.JsonParseException: Unexpected character ('u' (code 117)): expected a valid value (number, String, array, object, 'true', 'false' or 'null')? at [Source: java.io.StringReader@3444794a; line: 1, column: 2]");
        } catch (org.apache.avro.SchemaParseException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0297() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SchemaM3Random300Test0.test0297");
        org.apache.avro.Schema[] schemaArray0 = new org.apache.avro.Schema[] {};
        java.util.ArrayList<org.apache.avro.Schema> schemaList1 = new java.util.ArrayList<org.apache.avro.Schema>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<org.apache.avro.Schema>) schemaList1, schemaArray0);
        org.apache.avro.Schema schema3 = org.apache.avro.Schema.createUnion((java.util.List<org.apache.avro.Schema>) schemaList1);
        org.apache.avro.Schema[] schemaArray4 = new org.apache.avro.Schema[] {};
        java.util.ArrayList<org.apache.avro.Schema> schemaList5 = new java.util.ArrayList<org.apache.avro.Schema>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<org.apache.avro.Schema>) schemaList5, schemaArray4);
        org.apache.avro.Schema schema7 = org.apache.avro.Schema.createUnion((java.util.List<org.apache.avro.Schema>) schemaList5);
        org.apache.avro.Schema schema8 = org.apache.avro.Schema.applyAliases(schema3, schema7);
        java.util.List<org.apache.avro.Schema> schemaList9 = schema8.getTypes();
        org.apache.avro.Schema[] schemaArray10 = new org.apache.avro.Schema[] {};
        java.util.ArrayList<org.apache.avro.Schema> schemaList11 = new java.util.ArrayList<org.apache.avro.Schema>();
        boolean boolean12 = java.util.Collections.addAll((java.util.Collection<org.apache.avro.Schema>) schemaList11, schemaArray10);
        org.apache.avro.Schema schema13 = org.apache.avro.Schema.createUnion((java.util.List<org.apache.avro.Schema>) schemaList11);
        org.apache.avro.Schema[] schemaArray14 = new org.apache.avro.Schema[] {};
        java.util.ArrayList<org.apache.avro.Schema> schemaList15 = new java.util.ArrayList<org.apache.avro.Schema>();
        boolean boolean16 = java.util.Collections.addAll((java.util.Collection<org.apache.avro.Schema>) schemaList15, schemaArray14);
        org.apache.avro.Schema schema17 = org.apache.avro.Schema.createUnion((java.util.List<org.apache.avro.Schema>) schemaList15);
        org.apache.avro.Schema schema18 = org.apache.avro.Schema.applyAliases(schema13, schema17);
        org.apache.avro.Schema schema19 = org.apache.avro.Schema.applyAliases(schema8, schema17);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean21 = schema17.hasEnumSymbol("union type:MAP pos:-1");
            org.junit.Assert.fail("Expected exception of type org.apache.avro.AvroRuntimeException; message: Not an enum: []");
        } catch (org.apache.avro.AvroRuntimeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(schemaArray0);
        org.junit.Assert.assertArrayEquals(schemaArray0, new org.apache.avro.Schema[] {});
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(schema3);
        org.junit.Assert.assertNotNull(schemaArray4);
        org.junit.Assert.assertArrayEquals(schemaArray4, new org.apache.avro.Schema[] {});
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(schema7);
        org.junit.Assert.assertNotNull(schema8);
        org.junit.Assert.assertNotNull(schemaList9);
        org.junit.Assert.assertNotNull(schemaArray10);
        org.junit.Assert.assertArrayEquals(schemaArray10, new org.apache.avro.Schema[] {});
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(schema13);
        org.junit.Assert.assertNotNull(schemaArray14);
        org.junit.Assert.assertArrayEquals(schemaArray14, new org.apache.avro.Schema[] {});
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(schema17);
        org.junit.Assert.assertNotNull(schema18);
        org.junit.Assert.assertNotNull(schema19);
    }

    @Test
    public void test0298() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SchemaM3Random300Test0.test0298");
        org.apache.avro.Schema[] schemaArray0 = new org.apache.avro.Schema[] {};
        java.util.ArrayList<org.apache.avro.Schema> schemaList1 = new java.util.ArrayList<org.apache.avro.Schema>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<org.apache.avro.Schema>) schemaList1, schemaArray0);
        org.apache.avro.Schema schema3 = org.apache.avro.Schema.createUnion((java.util.List<org.apache.avro.Schema>) schemaList1);
        org.apache.avro.Schema[] schemaArray4 = new org.apache.avro.Schema[] {};
        java.util.ArrayList<org.apache.avro.Schema> schemaList5 = new java.util.ArrayList<org.apache.avro.Schema>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<org.apache.avro.Schema>) schemaList5, schemaArray4);
        org.apache.avro.Schema schema7 = org.apache.avro.Schema.createUnion((java.util.List<org.apache.avro.Schema>) schemaList5);
        org.apache.avro.Schema schema8 = org.apache.avro.Schema.applyAliases(schema3, schema7);
        org.apache.avro.Schema.Type type9 = schema7.getType();
        org.apache.avro.Schema schema10 = org.apache.avro.Schema.createMap(schema7);
        org.apache.avro.Schema schema11 = org.apache.avro.Schema.createArray(schema10);
        org.apache.avro.Schema.Field[] fieldArray12 = new org.apache.avro.Schema.Field[] {};
        java.util.ArrayList<org.apache.avro.Schema.Field> fieldList13 = new java.util.ArrayList<org.apache.avro.Schema.Field>();
        boolean boolean14 = java.util.Collections.addAll((java.util.Collection<org.apache.avro.Schema.Field>) fieldList13, fieldArray12);
        org.apache.avro.Schema schema15 = org.apache.avro.Schema.createRecord((java.util.List<org.apache.avro.Schema.Field>) fieldList13);
        org.apache.avro.Schema schema16 = org.apache.avro.Schema.createRecord((java.util.List<org.apache.avro.Schema.Field>) fieldList13);
        org.apache.avro.Schema schema17 = org.apache.avro.Schema.createRecord((java.util.List<org.apache.avro.Schema.Field>) fieldList13);
        org.apache.avro.Schema schema18 = org.apache.avro.Schema.createRecord((java.util.List<org.apache.avro.Schema.Field>) fieldList13);
        // The following exception was thrown during execution in test generation
        try {
            schema11.setFields((java.util.List<org.apache.avro.Schema.Field>) fieldList13);
            org.junit.Assert.fail("Expected exception of type org.apache.avro.AvroRuntimeException; message: Not a record: {\"type\":\"array\",\"items\":{\"type\":\"map\",\"values\":[]}}");
        } catch (org.apache.avro.AvroRuntimeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(schemaArray0);
        org.junit.Assert.assertArrayEquals(schemaArray0, new org.apache.avro.Schema[] {});
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(schema3);
        org.junit.Assert.assertNotNull(schemaArray4);
        org.junit.Assert.assertArrayEquals(schemaArray4, new org.apache.avro.Schema[] {});
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(schema7);
        org.junit.Assert.assertNotNull(schema8);
        org.junit.Assert.assertTrue("'" + type9 + "' != '" + org.apache.avro.Schema.Type.UNION + "'", type9.equals(org.apache.avro.Schema.Type.UNION));
        org.junit.Assert.assertNotNull(schema10);
        org.junit.Assert.assertNotNull(schema11);
        org.junit.Assert.assertNotNull(fieldArray12);
        org.junit.Assert.assertArrayEquals(fieldArray12, new org.apache.avro.Schema.Field[] {});
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(schema15);
        org.junit.Assert.assertNotNull(schema16);
        org.junit.Assert.assertNotNull(schema17);
        org.junit.Assert.assertNotNull(schema18);
    }

    @Test
    public void test0299() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SchemaM3Random300Test0.test0299");
        org.apache.avro.Schema.LockableArrayList<java.lang.String> strList4 = new org.apache.avro.Schema.LockableArrayList<java.lang.String>((int) (short) 0);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.avro.Schema schema5 = org.apache.avro.Schema.createEnum("", "{\"type\":\"record\",\"fields\":[]}", "{\r\n  \"type\" : \"record\",\r\n  \"fields\" : [ ]\r\n}", (java.util.List<java.lang.String>) strList4);
            org.junit.Assert.fail("Expected exception of type org.apache.avro.SchemaParseException; message: Empty name");
        } catch (org.apache.avro.SchemaParseException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0300() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SchemaM3Random300Test0.test0300");
        org.apache.avro.Schema schema1 = org.apache.avro.Schema.parse("{\"type\":\"map\",\"values\":[]}");
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<java.lang.String> strList2 = schema1.getEnumSymbols();
            org.junit.Assert.fail("Expected exception of type org.apache.avro.AvroRuntimeException; message: Not an enum: {\"type\":\"map\",\"values\":[]}");
        } catch (org.apache.avro.AvroRuntimeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(schema1);
    }

    @Test
    public void test0301() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SchemaM3Random300Test0.test0301");
        org.apache.avro.Schema.Parser parser0 = new org.apache.avro.Schema.Parser();
        org.apache.avro.Schema.Parser parser2 = parser0.setValidate(true);
        java.util.Map<java.lang.String, org.apache.avro.Schema> strMap3 = parser0.getTypes();
        org.apache.avro.Schema.Parser parser5 = parser0.setValidate(true);
        org.apache.avro.Schema.Parser parser7 = parser5.setValidate(true);
        java.io.File file8 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.avro.Schema schema9 = parser5.parse(file8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(parser2);
        org.junit.Assert.assertNotNull(strMap3);
        org.junit.Assert.assertNotNull(parser5);
        org.junit.Assert.assertNotNull(parser7);
    }

    @Test
    public void test0302() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SchemaM3Random300Test0.test0302");
        org.apache.avro.Schema[] schemaArray0 = new org.apache.avro.Schema[] {};
        java.util.ArrayList<org.apache.avro.Schema> schemaList1 = new java.util.ArrayList<org.apache.avro.Schema>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<org.apache.avro.Schema>) schemaList1, schemaArray0);
        org.apache.avro.Schema schema3 = org.apache.avro.Schema.createUnion((java.util.List<org.apache.avro.Schema>) schemaList1);
        org.apache.avro.Schema[] schemaArray4 = new org.apache.avro.Schema[] {};
        java.util.ArrayList<org.apache.avro.Schema> schemaList5 = new java.util.ArrayList<org.apache.avro.Schema>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<org.apache.avro.Schema>) schemaList5, schemaArray4);
        org.apache.avro.Schema schema7 = org.apache.avro.Schema.createUnion((java.util.List<org.apache.avro.Schema>) schemaList5);
        org.apache.avro.Schema schema8 = org.apache.avro.Schema.applyAliases(schema3, schema7);
        java.util.List<org.apache.avro.Schema> schemaList9 = schema8.getTypes();
        org.apache.avro.Schema[] schemaArray10 = new org.apache.avro.Schema[] {};
        java.util.ArrayList<org.apache.avro.Schema> schemaList11 = new java.util.ArrayList<org.apache.avro.Schema>();
        boolean boolean12 = java.util.Collections.addAll((java.util.Collection<org.apache.avro.Schema>) schemaList11, schemaArray10);
        org.apache.avro.Schema schema13 = org.apache.avro.Schema.createUnion((java.util.List<org.apache.avro.Schema>) schemaList11);
        org.apache.avro.Schema[] schemaArray14 = new org.apache.avro.Schema[] {};
        java.util.ArrayList<org.apache.avro.Schema> schemaList15 = new java.util.ArrayList<org.apache.avro.Schema>();
        boolean boolean16 = java.util.Collections.addAll((java.util.Collection<org.apache.avro.Schema>) schemaList15, schemaArray14);
        org.apache.avro.Schema schema17 = org.apache.avro.Schema.createUnion((java.util.List<org.apache.avro.Schema>) schemaList15);
        org.apache.avro.Schema schema18 = org.apache.avro.Schema.applyAliases(schema13, schema17);
        org.apache.avro.Schema schema19 = org.apache.avro.Schema.applyAliases(schema8, schema17);
        org.apache.avro.Schema schema20 = org.apache.avro.Schema.createMap(schema8);
        org.apache.avro.Schema schema21 = org.apache.avro.Schema.createArray(schema20);
        org.apache.avro.Schema schema22 = org.apache.avro.Schema.createMap(schema21);
        java.lang.String str24 = schema21.toString(true);
        java.lang.String str25 = schema21.toString();
        java.lang.String str26 = schema21.toString();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str27 = schema21.getNamespace();
            org.junit.Assert.fail("Expected exception of type org.apache.avro.AvroRuntimeException; message: Not a named type: {\"type\":\"array\",\"items\":{\"type\":\"map\",\"values\":[]}}");
        } catch (org.apache.avro.AvroRuntimeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(schemaArray0);
        org.junit.Assert.assertArrayEquals(schemaArray0, new org.apache.avro.Schema[] {});
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(schema3);
        org.junit.Assert.assertNotNull(schemaArray4);
        org.junit.Assert.assertArrayEquals(schemaArray4, new org.apache.avro.Schema[] {});
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(schema7);
        org.junit.Assert.assertNotNull(schema8);
        org.junit.Assert.assertNotNull(schemaList9);
        org.junit.Assert.assertNotNull(schemaArray10);
        org.junit.Assert.assertArrayEquals(schemaArray10, new org.apache.avro.Schema[] {});
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(schema13);
        org.junit.Assert.assertNotNull(schemaArray14);
        org.junit.Assert.assertArrayEquals(schemaArray14, new org.apache.avro.Schema[] {});
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(schema17);
        org.junit.Assert.assertNotNull(schema18);
        org.junit.Assert.assertNotNull(schema19);
        org.junit.Assert.assertNotNull(schema20);
        org.junit.Assert.assertNotNull(schema21);
        org.junit.Assert.assertNotNull(schema22);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "{\r\n  \"type\" : \"array\",\r\n  \"items\" : {\r\n    \"type\" : \"map\",\r\n    \"values\" : [ ]\r\n  }\r\n}" + "'", str24, "{\r\n  \"type\" : \"array\",\r\n  \"items\" : {\r\n    \"type\" : \"map\",\r\n    \"values\" : [ ]\r\n  }\r\n}");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "{\"type\":\"array\",\"items\":{\"type\":\"map\",\"values\":[]}}" + "'", str25, "{\"type\":\"array\",\"items\":{\"type\":\"map\",\"values\":[]}}");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "{\"type\":\"array\",\"items\":{\"type\":\"map\",\"values\":[]}}" + "'", str26, "{\"type\":\"array\",\"items\":{\"type\":\"map\",\"values\":[]}}");
    }

    @Test
    public void test0303() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SchemaM3Random300Test0.test0303");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.avro.Schema schema4 = org.apache.avro.Schema.createFixed("{\"type\":\"record\",\"fields\":[]}", "{\r\n  \"type\" : \"record\",\r\n  \"fields\" : [ ]\r\n}", "{\"type\":\"record\",\"fields\":[]}", 1);
            org.junit.Assert.fail("Expected exception of type org.apache.avro.SchemaParseException; message: Illegal initial character: {\"type\":\"record\",\"fields\":[]}");
        } catch (org.apache.avro.SchemaParseException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0304() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SchemaM3Random300Test0.test0304");
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
    public void test0305() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SchemaM3Random300Test0.test0305");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.avro.Schema schema2 = org.apache.avro.Schema.parse("float", false);
            org.junit.Assert.fail("Expected exception of type org.apache.avro.SchemaParseException; message: org.codehaus.jackson.JsonParseException: Unrecognized token 'float': was expecting 'null', 'true' or 'false'? at [Source: java.io.StringReader@5e0fef5b; line: 1, column: 11]");
        } catch (org.apache.avro.SchemaParseException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0306() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SchemaM3Random300Test0.test0306");
        org.apache.avro.Schema.Parser parser0 = new org.apache.avro.Schema.Parser();
        java.util.Map<java.lang.String, org.apache.avro.Schema> strMap1 = parser0.getTypes();
        java.util.Map<java.lang.String, org.apache.avro.Schema> strMap2 = parser0.getTypes();
        org.apache.avro.Schema.Parser parser3 = new org.apache.avro.Schema.Parser();
        org.apache.avro.Schema.Parser parser5 = parser3.setValidate(true);
        java.util.Map<java.lang.String, org.apache.avro.Schema> strMap6 = parser3.getTypes();
        org.apache.avro.Schema.Parser parser7 = parser0.addTypes(strMap6);
        org.apache.avro.Schema schema9 = parser7.parse("{\"type\":\"map\",\"values\":[]}");
        boolean boolean10 = parser7.getValidate();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.avro.Schema schema12 = parser7.parse("union type:UNION pos:-1");
            org.junit.Assert.fail("Expected exception of type org.apache.avro.SchemaParseException; message: org.codehaus.jackson.JsonParseException: Unexpected character ('u' (code 117)): expected a valid value (number, String, array, object, 'true', 'false' or 'null')? at [Source: java.io.StringReader@7710527a; line: 1, column: 2]");
        } catch (org.apache.avro.SchemaParseException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strMap1);
        org.junit.Assert.assertNotNull(strMap2);
        org.junit.Assert.assertNotNull(parser5);
        org.junit.Assert.assertNotNull(strMap6);
        org.junit.Assert.assertNotNull(parser7);
        org.junit.Assert.assertNotNull(schema9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test0307() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SchemaM3Random300Test0.test0307");
        org.apache.avro.Schema[] schemaArray0 = new org.apache.avro.Schema[] {};
        java.util.ArrayList<org.apache.avro.Schema> schemaList1 = new java.util.ArrayList<org.apache.avro.Schema>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<org.apache.avro.Schema>) schemaList1, schemaArray0);
        org.apache.avro.Schema schema3 = org.apache.avro.Schema.createUnion((java.util.List<org.apache.avro.Schema>) schemaList1);
        org.apache.avro.Schema[] schemaArray4 = new org.apache.avro.Schema[] {};
        java.util.ArrayList<org.apache.avro.Schema> schemaList5 = new java.util.ArrayList<org.apache.avro.Schema>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<org.apache.avro.Schema>) schemaList5, schemaArray4);
        org.apache.avro.Schema schema7 = org.apache.avro.Schema.createUnion((java.util.List<org.apache.avro.Schema>) schemaList5);
        org.apache.avro.Schema schema8 = org.apache.avro.Schema.applyAliases(schema3, schema7);
        java.util.List<org.apache.avro.Schema> schemaList9 = schema8.getTypes();
        boolean boolean11 = schema8.equals((java.lang.Object) "hi!");
        java.lang.String str12 = schema8.getDoc();
        org.apache.avro.Schema schema13 = org.apache.avro.Schema.createArray(schema8);
        java.lang.String str14 = schema8.getFullName();
        org.apache.avro.Schema schema15 = org.apache.avro.Schema.createMap(schema8);
        java.lang.Class<?> wildcardClass16 = schema15.getClass();
        org.junit.Assert.assertNotNull(schemaArray0);
        org.junit.Assert.assertArrayEquals(schemaArray0, new org.apache.avro.Schema[] {});
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(schema3);
        org.junit.Assert.assertNotNull(schemaArray4);
        org.junit.Assert.assertArrayEquals(schemaArray4, new org.apache.avro.Schema[] {});
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(schema7);
        org.junit.Assert.assertNotNull(schema8);
        org.junit.Assert.assertNotNull(schemaList9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNotNull(schema13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "union" + "'", str14, "union");
        org.junit.Assert.assertNotNull(schema15);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test0308() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SchemaM3Random300Test0.test0308");
        java.lang.String[] strArray4 = new java.lang.String[] { "" };
        java.util.ArrayList<java.lang.String> strList5 = new java.util.ArrayList<java.lang.String>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList5, strArray4);
        org.apache.avro.Schema.LockableArrayList<java.lang.String> strList7 = new org.apache.avro.Schema.LockableArrayList<java.lang.String>((java.util.List<java.lang.String>) strList5);
        org.apache.avro.Schema.LockableArrayList<java.lang.String> strList8 = new org.apache.avro.Schema.LockableArrayList<java.lang.String>((java.util.List<java.lang.String>) strList5);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.avro.Schema schema9 = org.apache.avro.Schema.createEnum("union", "union type:MAP pos:-1", "", (java.util.List<java.lang.String>) strList5);
            org.junit.Assert.fail("Expected exception of type org.apache.avro.SchemaParseException; message: Empty name");
        } catch (org.apache.avro.SchemaParseException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertArrayEquals(strArray4, new java.lang.String[] { "" });
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test0309() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SchemaM3Random300Test0.test0309");
        org.apache.avro.Schema[] schemaArray0 = new org.apache.avro.Schema[] {};
        java.util.ArrayList<org.apache.avro.Schema> schemaList1 = new java.util.ArrayList<org.apache.avro.Schema>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<org.apache.avro.Schema>) schemaList1, schemaArray0);
        org.apache.avro.Schema schema3 = org.apache.avro.Schema.createUnion((java.util.List<org.apache.avro.Schema>) schemaList1);
        java.util.List<org.apache.avro.Schema> schemaList4 = schema3.getTypes();
        org.apache.avro.Schema schema5 = org.apache.avro.Schema.createMap(schema3);
        org.apache.avro.Schema schema8 = org.apache.avro.Schema.parse("{\r\n  \"type\" : \"array\",\r\n  \"items\" : {\r\n    \"type\" : \"map\",\r\n    \"values\" : [ ]\r\n  }\r\n}", true);
        boolean boolean9 = schema3.equals((java.lang.Object) true);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str10 = schema3.getNamespace();
            org.junit.Assert.fail("Expected exception of type org.apache.avro.AvroRuntimeException; message: Not a named type: []");
        } catch (org.apache.avro.AvroRuntimeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(schemaArray0);
        org.junit.Assert.assertArrayEquals(schemaArray0, new org.apache.avro.Schema[] {});
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(schema3);
        org.junit.Assert.assertNotNull(schemaList4);
        org.junit.Assert.assertNotNull(schema5);
        org.junit.Assert.assertNotNull(schema8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test0310() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SchemaM3Random300Test0.test0310");
        org.apache.avro.Schema.LockableArrayList<java.lang.reflect.Type> typeList1 = new org.apache.avro.Schema.LockableArrayList<java.lang.reflect.Type>((int) (short) 1);
    }

    @Test
    public void test0311() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SchemaM3Random300Test0.test0311");
        org.apache.avro.Schema.LockableArrayList<java.lang.String> strList3 = new org.apache.avro.Schema.LockableArrayList<java.lang.String>();
        org.apache.avro.Schema.LockableArrayList<java.lang.String> strList4 = new org.apache.avro.Schema.LockableArrayList<java.lang.String>((java.util.List<java.lang.String>) strList3);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.avro.Schema schema5 = org.apache.avro.Schema.createEnum("[ ]", "[].union", "union type:MAP pos:-1", (java.util.List<java.lang.String>) strList4);
            org.junit.Assert.fail("Expected exception of type org.apache.avro.SchemaParseException; message: Illegal initial character: [ ]");
        } catch (org.apache.avro.SchemaParseException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0312() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SchemaM3Random300Test0.test0312");
        org.apache.avro.Schema.Parser parser0 = new org.apache.avro.Schema.Parser();
        java.util.Map<java.lang.String, org.apache.avro.Schema> strMap1 = parser0.getTypes();
        java.util.Map<java.lang.String, org.apache.avro.Schema> strMap2 = parser0.getTypes();
        org.apache.avro.Schema.Parser parser3 = new org.apache.avro.Schema.Parser();
        java.util.Map<java.lang.String, org.apache.avro.Schema> strMap4 = parser3.getTypes();
        org.apache.avro.Schema.Parser parser5 = parser0.addTypes(strMap4);
        java.util.Map<java.lang.String, org.apache.avro.Schema> strMap6 = parser5.getTypes();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.avro.Schema schema8 = parser5.parse("float");
            org.junit.Assert.fail("Expected exception of type org.apache.avro.SchemaParseException; message: org.codehaus.jackson.JsonParseException: Unrecognized token 'float': was expecting 'null', 'true' or 'false'? at [Source: java.io.StringReader@60439af5; line: 1, column: 11]");
        } catch (org.apache.avro.SchemaParseException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strMap1);
        org.junit.Assert.assertNotNull(strMap2);
        org.junit.Assert.assertNotNull(strMap4);
        org.junit.Assert.assertNotNull(parser5);
        org.junit.Assert.assertNotNull(strMap6);
    }

    @Test
    public void test0313() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SchemaM3Random300Test0.test0313");
        org.apache.avro.Schema.Parser parser0 = new org.apache.avro.Schema.Parser();
        java.util.Map<java.lang.String, org.apache.avro.Schema> strMap1 = parser0.getTypes();
        org.apache.avro.Schema.Parser parser2 = new org.apache.avro.Schema.Parser();
        org.apache.avro.Schema.Parser parser4 = parser2.setValidate(true);
        java.util.Map<java.lang.String, org.apache.avro.Schema> strMap5 = parser2.getTypes();
        org.apache.avro.Schema.Parser parser6 = parser0.addTypes(strMap5);
        boolean boolean7 = parser6.getValidate();
        org.apache.avro.Schema.Parser parser9 = parser6.setValidate(true);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.avro.Schema schema11 = parser6.parse("union type:MAP pos:-1");
            org.junit.Assert.fail("Expected exception of type org.apache.avro.SchemaParseException; message: org.codehaus.jackson.JsonParseException: Unexpected character ('u' (code 117)): expected a valid value (number, String, array, object, 'true', 'false' or 'null')? at [Source: java.io.StringReader@6a5757a6; line: 1, column: 2]");
        } catch (org.apache.avro.SchemaParseException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strMap1);
        org.junit.Assert.assertNotNull(parser4);
        org.junit.Assert.assertNotNull(strMap5);
        org.junit.Assert.assertNotNull(parser6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(parser9);
    }

    @Test
    public void test0314() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SchemaM3Random300Test0.test0314");
        org.apache.avro.Schema.Parser parser0 = new org.apache.avro.Schema.Parser();
        java.util.Map<java.lang.String, org.apache.avro.Schema> strMap1 = parser0.getTypes();
        org.apache.avro.Schema.Parser parser2 = new org.apache.avro.Schema.Parser();
        org.apache.avro.Schema.Parser parser4 = parser2.setValidate(true);
        java.util.Map<java.lang.String, org.apache.avro.Schema> strMap5 = parser2.getTypes();
        org.apache.avro.Schema.Parser parser6 = parser0.addTypes(strMap5);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.avro.Schema schema8 = parser6.parse("");
            org.junit.Assert.fail("Expected exception of type org.apache.avro.SchemaParseException; message: java.io.EOFException: No content to map to Object due to end of input");
        } catch (org.apache.avro.SchemaParseException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strMap1);
        org.junit.Assert.assertNotNull(parser4);
        org.junit.Assert.assertNotNull(strMap5);
        org.junit.Assert.assertNotNull(parser6);
    }

    @Test
    public void test0315() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SchemaM3Random300Test0.test0315");
        org.apache.avro.Schema.Names names0 = new org.apache.avro.Schema.Names();
        names0.space("[ ]");
        java.lang.Object obj3 = names0.clone();
        boolean boolean6 = names0.remove((java.lang.Object) 1, (java.lang.Object) true);
        names0.space("union type:MAP pos:-1");
        java.lang.String str9 = names0.space();
        org.junit.Assert.assertNotNull(obj3);
        org.junit.Assert.assertEquals(obj3.toString(), "{}");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj3), "{}");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj3), "{}");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "union type:MAP pos:-1" + "'", str9, "union type:MAP pos:-1");
    }

    @Test
    public void test0316() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SchemaM3Random300Test0.test0316");
        org.apache.avro.Schema schema4 = org.apache.avro.Schema.createFixed("map", "array", "", (int) 'a');
        // The following exception was thrown during execution in test generation
        try {
            org.apache.avro.Schema schema5 = schema4.getElementType();
            org.junit.Assert.fail("Expected exception of type org.apache.avro.AvroRuntimeException; message: Not an array: {\"type\":\"fixed\",\"name\":\"map\",\"namespace\":\"\",\"doc\":\"array\",\"size\":97}");
        } catch (org.apache.avro.AvroRuntimeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(schema4);
    }

    @Test
    public void test0317() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SchemaM3Random300Test0.test0317");
        org.apache.avro.Schema[] schemaArray0 = new org.apache.avro.Schema[] {};
        java.util.ArrayList<org.apache.avro.Schema> schemaList1 = new java.util.ArrayList<org.apache.avro.Schema>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<org.apache.avro.Schema>) schemaList1, schemaArray0);
        org.apache.avro.Schema schema3 = org.apache.avro.Schema.createUnion((java.util.List<org.apache.avro.Schema>) schemaList1);
        org.apache.avro.Schema[] schemaArray4 = new org.apache.avro.Schema[] {};
        java.util.ArrayList<org.apache.avro.Schema> schemaList5 = new java.util.ArrayList<org.apache.avro.Schema>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<org.apache.avro.Schema>) schemaList5, schemaArray4);
        org.apache.avro.Schema schema7 = org.apache.avro.Schema.createUnion((java.util.List<org.apache.avro.Schema>) schemaList5);
        org.apache.avro.Schema schema8 = org.apache.avro.Schema.applyAliases(schema3, schema7);
        java.util.List<org.apache.avro.Schema> schemaList9 = schema8.getTypes();
        org.apache.avro.Schema[] schemaArray10 = new org.apache.avro.Schema[] {};
        java.util.ArrayList<org.apache.avro.Schema> schemaList11 = new java.util.ArrayList<org.apache.avro.Schema>();
        boolean boolean12 = java.util.Collections.addAll((java.util.Collection<org.apache.avro.Schema>) schemaList11, schemaArray10);
        org.apache.avro.Schema schema13 = org.apache.avro.Schema.createUnion((java.util.List<org.apache.avro.Schema>) schemaList11);
        org.apache.avro.Schema[] schemaArray14 = new org.apache.avro.Schema[] {};
        java.util.ArrayList<org.apache.avro.Schema> schemaList15 = new java.util.ArrayList<org.apache.avro.Schema>();
        boolean boolean16 = java.util.Collections.addAll((java.util.Collection<org.apache.avro.Schema>) schemaList15, schemaArray14);
        org.apache.avro.Schema schema17 = org.apache.avro.Schema.createUnion((java.util.List<org.apache.avro.Schema>) schemaList15);
        org.apache.avro.Schema schema18 = org.apache.avro.Schema.applyAliases(schema13, schema17);
        org.apache.avro.Schema schema19 = org.apache.avro.Schema.applyAliases(schema8, schema17);
        java.util.List<org.apache.avro.Schema> schemaList20 = schema8.getTypes();
        java.lang.String str22 = schema8.toString(false);
        org.apache.avro.Schema.Type type23 = schema8.getType();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.avro.Schema schema24 = org.apache.avro.Schema.create(type23);
            org.junit.Assert.fail("Expected exception of type org.apache.avro.AvroRuntimeException; message: Can't create a: UNION");
        } catch (org.apache.avro.AvroRuntimeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(schemaArray0);
        org.junit.Assert.assertArrayEquals(schemaArray0, new org.apache.avro.Schema[] {});
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(schema3);
        org.junit.Assert.assertNotNull(schemaArray4);
        org.junit.Assert.assertArrayEquals(schemaArray4, new org.apache.avro.Schema[] {});
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(schema7);
        org.junit.Assert.assertNotNull(schema8);
        org.junit.Assert.assertNotNull(schemaList9);
        org.junit.Assert.assertNotNull(schemaArray10);
        org.junit.Assert.assertArrayEquals(schemaArray10, new org.apache.avro.Schema[] {});
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(schema13);
        org.junit.Assert.assertNotNull(schemaArray14);
        org.junit.Assert.assertArrayEquals(schemaArray14, new org.apache.avro.Schema[] {});
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(schema17);
        org.junit.Assert.assertNotNull(schema18);
        org.junit.Assert.assertNotNull(schema19);
        org.junit.Assert.assertNotNull(schemaList20);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "[]" + "'", str22, "[]");
        org.junit.Assert.assertTrue("'" + type23 + "' != '" + org.apache.avro.Schema.Type.UNION + "'", type23.equals(org.apache.avro.Schema.Type.UNION));
    }

    @Test
    public void test0318() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SchemaM3Random300Test0.test0318");
        org.apache.avro.Schema[] schemaArray0 = new org.apache.avro.Schema[] {};
        java.util.ArrayList<org.apache.avro.Schema> schemaList1 = new java.util.ArrayList<org.apache.avro.Schema>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<org.apache.avro.Schema>) schemaList1, schemaArray0);
        org.apache.avro.Schema schema3 = org.apache.avro.Schema.createUnion((java.util.List<org.apache.avro.Schema>) schemaList1);
        org.apache.avro.Schema[] schemaArray4 = new org.apache.avro.Schema[] {};
        java.util.ArrayList<org.apache.avro.Schema> schemaList5 = new java.util.ArrayList<org.apache.avro.Schema>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<org.apache.avro.Schema>) schemaList5, schemaArray4);
        org.apache.avro.Schema schema7 = org.apache.avro.Schema.createUnion((java.util.List<org.apache.avro.Schema>) schemaList5);
        org.apache.avro.Schema schema8 = org.apache.avro.Schema.applyAliases(schema3, schema7);
        java.util.List<org.apache.avro.Schema> schemaList9 = schema8.getTypes();
        boolean boolean11 = schema8.equals((java.lang.Object) "hi!");
        java.lang.String str12 = schema8.getDoc();
        org.apache.avro.Schema schema13 = org.apache.avro.Schema.createArray(schema8);
        java.lang.String str14 = schema8.toString();
        org.apache.avro.Schema schema15 = org.apache.avro.Schema.createArray(schema8);
        java.lang.String str17 = schema15.toString(false);
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<java.lang.String> strList18 = schema15.getEnumSymbols();
            org.junit.Assert.fail("Expected exception of type org.apache.avro.AvroRuntimeException; message: Not an enum: {\"type\":\"array\",\"items\":[]}");
        } catch (org.apache.avro.AvroRuntimeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(schemaArray0);
        org.junit.Assert.assertArrayEquals(schemaArray0, new org.apache.avro.Schema[] {});
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(schema3);
        org.junit.Assert.assertNotNull(schemaArray4);
        org.junit.Assert.assertArrayEquals(schemaArray4, new org.apache.avro.Schema[] {});
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(schema7);
        org.junit.Assert.assertNotNull(schema8);
        org.junit.Assert.assertNotNull(schemaList9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNotNull(schema13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "[]" + "'", str14, "[]");
        org.junit.Assert.assertNotNull(schema15);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "{\"type\":\"array\",\"items\":[]}" + "'", str17, "{\"type\":\"array\",\"items\":[]}");
    }

    @Test
    public void test0319() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SchemaM3Random300Test0.test0319");
        org.apache.avro.Schema.Parser parser0 = new org.apache.avro.Schema.Parser();
        org.apache.avro.Schema.Parser parser2 = parser0.setValidate(true);
        org.apache.avro.Schema.Parser parser4 = parser0.setValidate(true);
        org.apache.avro.Schema.Parser parser6 = parser0.setValidate(true);
        org.apache.avro.Schema.Parser parser7 = new org.apache.avro.Schema.Parser();
        org.apache.avro.Schema.Parser parser9 = parser7.setValidate(true);
        java.util.Map<java.lang.String, org.apache.avro.Schema> strMap10 = parser7.getTypes();
        org.apache.avro.Schema.Parser parser12 = parser7.setValidate(true);
        org.apache.avro.Schema.Parser parser14 = parser7.setValidate(true);
        java.util.Map<java.lang.String, org.apache.avro.Schema> strMap15 = parser7.getTypes();
        org.apache.avro.Schema.Parser parser16 = parser6.addTypes(strMap15);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.avro.Schema schema18 = parser6.parse("{}");
            org.junit.Assert.fail("Expected exception of type org.apache.avro.SchemaParseException; message: No type: {}");
        } catch (org.apache.avro.SchemaParseException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(parser2);
        org.junit.Assert.assertNotNull(parser4);
        org.junit.Assert.assertNotNull(parser6);
        org.junit.Assert.assertNotNull(parser9);
        org.junit.Assert.assertNotNull(strMap10);
        org.junit.Assert.assertNotNull(parser12);
        org.junit.Assert.assertNotNull(parser14);
        org.junit.Assert.assertNotNull(strMap15);
        org.junit.Assert.assertNotNull(parser16);
    }

    @Test
    public void test0320() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SchemaM3Random300Test0.test0320");
        org.apache.avro.Schema schema2 = org.apache.avro.Schema.parse("[]", true);
        org.apache.avro.Schema.Type type3 = org.apache.avro.Schema.Type.INT;
        org.apache.avro.Schema schema4 = org.apache.avro.Schema.create(type3);
        org.apache.avro.Schema schema5 = org.apache.avro.Schema.create(type3);
        org.apache.avro.Schema.Names names6 = new org.apache.avro.Schema.Names();
        java.lang.String str7 = names6.space();
        names6.space("");
        boolean boolean10 = schema5.equals((java.lang.Object) names6);
        org.apache.avro.Schema[] schemaArray11 = new org.apache.avro.Schema[] {};
        java.util.ArrayList<org.apache.avro.Schema> schemaList12 = new java.util.ArrayList<org.apache.avro.Schema>();
        boolean boolean13 = java.util.Collections.addAll((java.util.Collection<org.apache.avro.Schema>) schemaList12, schemaArray11);
        org.apache.avro.Schema schema14 = org.apache.avro.Schema.createUnion((java.util.List<org.apache.avro.Schema>) schemaList12);
        org.apache.avro.Schema[] schemaArray15 = new org.apache.avro.Schema[] {};
        java.util.ArrayList<org.apache.avro.Schema> schemaList16 = new java.util.ArrayList<org.apache.avro.Schema>();
        boolean boolean17 = java.util.Collections.addAll((java.util.Collection<org.apache.avro.Schema>) schemaList16, schemaArray15);
        org.apache.avro.Schema schema18 = org.apache.avro.Schema.createUnion((java.util.List<org.apache.avro.Schema>) schemaList16);
        org.apache.avro.Schema schema19 = org.apache.avro.Schema.applyAliases(schema14, schema18);
        java.util.List<org.apache.avro.Schema> schemaList20 = schema19.getTypes();
        java.lang.String str22 = schema19.getProp("{\r\n  \"type\" : \"array\",\r\n  \"items\" : {\r\n    \"type\" : \"map\",\r\n    \"values\" : [ ]\r\n  }\r\n}");
        boolean boolean23 = names6.equals((java.lang.Object) "{\r\n  \"type\" : \"array\",\r\n  \"items\" : {\r\n    \"type\" : \"map\",\r\n    \"values\" : [ ]\r\n  }\r\n}");
        org.codehaus.jackson.JsonGenerator jsonGenerator24 = null;
        // The following exception was thrown during execution in test generation
        try {
            schema2.toJson(names6, jsonGenerator24);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(schema2);
        org.junit.Assert.assertTrue("'" + type3 + "' != '" + org.apache.avro.Schema.Type.INT + "'", type3.equals(org.apache.avro.Schema.Type.INT));
        org.junit.Assert.assertNotNull(schema4);
        org.junit.Assert.assertNotNull(schema5);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(schemaArray11);
        org.junit.Assert.assertArrayEquals(schemaArray11, new org.apache.avro.Schema[] {});
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(schema14);
        org.junit.Assert.assertNotNull(schemaArray15);
        org.junit.Assert.assertArrayEquals(schemaArray15, new org.apache.avro.Schema[] {});
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(schema18);
        org.junit.Assert.assertNotNull(schema19);
        org.junit.Assert.assertNotNull(schemaList20);
        org.junit.Assert.assertNull(str22);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
    }

    @Test
    public void test0321() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SchemaM3Random300Test0.test0321");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.avro.Schema schema2 = org.apache.avro.Schema.parse("double", false);
            org.junit.Assert.fail("Expected exception of type org.apache.avro.SchemaParseException; message: org.codehaus.jackson.JsonParseException: Unexpected character ('d' (code 100)): expected a valid value (number, String, array, object, 'true', 'false' or 'null')? at [Source: java.io.StringReader@66e63de2; line: 1, column: 2]");
        } catch (org.apache.avro.SchemaParseException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0322() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SchemaM3Random300Test0.test0322");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.avro.Schema schema2 = org.apache.avro.Schema.parse("map", false);
            org.junit.Assert.fail("Expected exception of type org.apache.avro.SchemaParseException; message: org.codehaus.jackson.JsonParseException: Unexpected character ('m' (code 109)): expected a valid value (number, String, array, object, 'true', 'false' or 'null')? at [Source: java.io.StringReader@103249b4; line: 1, column: 2]");
        } catch (org.apache.avro.SchemaParseException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0323() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SchemaM3Random300Test0.test0323");
        org.apache.avro.Schema.Type type0 = org.apache.avro.Schema.Type.UNION;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.avro.Schema schema1 = org.apache.avro.Schema.create(type0);
            org.junit.Assert.fail("Expected exception of type org.apache.avro.AvroRuntimeException; message: Can't create a: UNION");
        } catch (org.apache.avro.AvroRuntimeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + type0 + "' != '" + org.apache.avro.Schema.Type.UNION + "'", type0.equals(org.apache.avro.Schema.Type.UNION));
    }

    @Test
    public void test0324() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SchemaM3Random300Test0.test0324");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.avro.Schema schema4 = org.apache.avro.Schema.createFixed("union type:UNION pos:-1", "[].union", "{\"type\":\"array\",\"items\":[]}", (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type org.apache.avro.SchemaParseException; message: Illegal character in: union type:UNION pos:-1");
        } catch (org.apache.avro.SchemaParseException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0325() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SchemaM3Random300Test0.test0325");
        org.apache.avro.Schema[] schemaArray0 = new org.apache.avro.Schema[] {};
        java.util.ArrayList<org.apache.avro.Schema> schemaList1 = new java.util.ArrayList<org.apache.avro.Schema>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<org.apache.avro.Schema>) schemaList1, schemaArray0);
        org.apache.avro.Schema schema3 = org.apache.avro.Schema.createUnion((java.util.List<org.apache.avro.Schema>) schemaList1);
        org.apache.avro.Schema[] schemaArray4 = new org.apache.avro.Schema[] {};
        java.util.ArrayList<org.apache.avro.Schema> schemaList5 = new java.util.ArrayList<org.apache.avro.Schema>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<org.apache.avro.Schema>) schemaList5, schemaArray4);
        org.apache.avro.Schema schema7 = org.apache.avro.Schema.createUnion((java.util.List<org.apache.avro.Schema>) schemaList5);
        org.apache.avro.Schema schema8 = org.apache.avro.Schema.applyAliases(schema3, schema7);
        org.apache.avro.Schema.Type type9 = schema7.getType();
        org.apache.avro.Schema.Type type10 = schema7.getType();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Set<java.lang.String> strSet11 = schema7.getAliases();
            org.junit.Assert.fail("Expected exception of type org.apache.avro.AvroRuntimeException; message: Not a named type: []");
        } catch (org.apache.avro.AvroRuntimeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(schemaArray0);
        org.junit.Assert.assertArrayEquals(schemaArray0, new org.apache.avro.Schema[] {});
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(schema3);
        org.junit.Assert.assertNotNull(schemaArray4);
        org.junit.Assert.assertArrayEquals(schemaArray4, new org.apache.avro.Schema[] {});
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(schema7);
        org.junit.Assert.assertNotNull(schema8);
        org.junit.Assert.assertTrue("'" + type9 + "' != '" + org.apache.avro.Schema.Type.UNION + "'", type9.equals(org.apache.avro.Schema.Type.UNION));
        org.junit.Assert.assertTrue("'" + type10 + "' != '" + org.apache.avro.Schema.Type.UNION + "'", type10.equals(org.apache.avro.Schema.Type.UNION));
    }

    @Test
    public void test0326() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SchemaM3Random300Test0.test0326");
        org.apache.avro.Schema.Parser parser0 = new org.apache.avro.Schema.Parser();
        org.apache.avro.Schema.Parser parser2 = parser0.setValidate(true);
        java.util.Map<java.lang.String, org.apache.avro.Schema> strMap3 = parser0.getTypes();
        org.apache.avro.Schema.Parser parser5 = parser0.setValidate(true);
        org.apache.avro.Schema.Parser parser7 = parser0.setValidate(true);
        java.util.Map<java.lang.String, org.apache.avro.Schema> strMap8 = parser0.getTypes();
        org.apache.avro.Schema.Parser parser10 = parser0.setValidate(false);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.avro.Schema schema12 = parser0.parse("");
            org.junit.Assert.fail("Expected exception of type org.apache.avro.SchemaParseException; message: java.io.EOFException: No content to map to Object due to end of input");
        } catch (org.apache.avro.SchemaParseException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(parser2);
        org.junit.Assert.assertNotNull(strMap3);
        org.junit.Assert.assertNotNull(parser5);
        org.junit.Assert.assertNotNull(parser7);
        org.junit.Assert.assertNotNull(strMap8);
        org.junit.Assert.assertNotNull(parser10);
    }

    @Test
    public void test0327() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SchemaM3Random300Test0.test0327");
        org.apache.avro.Schema[] schemaArray0 = new org.apache.avro.Schema[] {};
        java.util.ArrayList<org.apache.avro.Schema> schemaList1 = new java.util.ArrayList<org.apache.avro.Schema>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<org.apache.avro.Schema>) schemaList1, schemaArray0);
        org.apache.avro.Schema schema3 = org.apache.avro.Schema.createUnion((java.util.List<org.apache.avro.Schema>) schemaList1);
        org.apache.avro.Schema[] schemaArray4 = new org.apache.avro.Schema[] {};
        java.util.ArrayList<org.apache.avro.Schema> schemaList5 = new java.util.ArrayList<org.apache.avro.Schema>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<org.apache.avro.Schema>) schemaList5, schemaArray4);
        org.apache.avro.Schema schema7 = org.apache.avro.Schema.createUnion((java.util.List<org.apache.avro.Schema>) schemaList5);
        org.apache.avro.Schema schema8 = org.apache.avro.Schema.applyAliases(schema3, schema7);
        java.util.List<org.apache.avro.Schema> schemaList9 = schema8.getTypes();
        boolean boolean11 = schema8.equals((java.lang.Object) "hi!");
        java.lang.String str12 = schema8.getDoc();
        java.lang.String str14 = schema8.toString(true);
        org.apache.avro.Schema[] schemaArray15 = new org.apache.avro.Schema[] {};
        java.util.ArrayList<org.apache.avro.Schema> schemaList16 = new java.util.ArrayList<org.apache.avro.Schema>();
        boolean boolean17 = java.util.Collections.addAll((java.util.Collection<org.apache.avro.Schema>) schemaList16, schemaArray15);
        org.apache.avro.Schema schema18 = org.apache.avro.Schema.createUnion((java.util.List<org.apache.avro.Schema>) schemaList16);
        org.apache.avro.Schema[] schemaArray19 = new org.apache.avro.Schema[] {};
        java.util.ArrayList<org.apache.avro.Schema> schemaList20 = new java.util.ArrayList<org.apache.avro.Schema>();
        boolean boolean21 = java.util.Collections.addAll((java.util.Collection<org.apache.avro.Schema>) schemaList20, schemaArray19);
        org.apache.avro.Schema schema22 = org.apache.avro.Schema.createUnion((java.util.List<org.apache.avro.Schema>) schemaList20);
        org.apache.avro.Schema schema23 = org.apache.avro.Schema.applyAliases(schema18, schema22);
        java.util.List<org.apache.avro.Schema> schemaList24 = schema23.getTypes();
        org.apache.avro.Schema schema25 = org.apache.avro.Schema.createUnion(schemaList24);
        java.lang.String str26 = schema25.getDoc();
        org.apache.avro.Schema schema27 = org.apache.avro.Schema.applyAliases(schema8, schema25);
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<java.lang.String> strList28 = schema25.getEnumSymbols();
            org.junit.Assert.fail("Expected exception of type org.apache.avro.AvroRuntimeException; message: Not an enum: []");
        } catch (org.apache.avro.AvroRuntimeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(schemaArray0);
        org.junit.Assert.assertArrayEquals(schemaArray0, new org.apache.avro.Schema[] {});
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(schema3);
        org.junit.Assert.assertNotNull(schemaArray4);
        org.junit.Assert.assertArrayEquals(schemaArray4, new org.apache.avro.Schema[] {});
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(schema7);
        org.junit.Assert.assertNotNull(schema8);
        org.junit.Assert.assertNotNull(schemaList9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "[ ]" + "'", str14, "[ ]");
        org.junit.Assert.assertNotNull(schemaArray15);
        org.junit.Assert.assertArrayEquals(schemaArray15, new org.apache.avro.Schema[] {});
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(schema18);
        org.junit.Assert.assertNotNull(schemaArray19);
        org.junit.Assert.assertArrayEquals(schemaArray19, new org.apache.avro.Schema[] {});
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(schema22);
        org.junit.Assert.assertNotNull(schema23);
        org.junit.Assert.assertNotNull(schemaList24);
        org.junit.Assert.assertNotNull(schema25);
        org.junit.Assert.assertNull(str26);
        org.junit.Assert.assertNotNull(schema27);
    }

    @Test
    public void test0328() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SchemaM3Random300Test0.test0328");
        org.apache.avro.Schema.Names names0 = new org.apache.avro.Schema.Names();
        org.apache.avro.Schema[] schemaArray2 = new org.apache.avro.Schema[] {};
        java.util.ArrayList<org.apache.avro.Schema> schemaList3 = new java.util.ArrayList<org.apache.avro.Schema>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<org.apache.avro.Schema>) schemaList3, schemaArray2);
        org.apache.avro.Schema schema5 = org.apache.avro.Schema.createUnion((java.util.List<org.apache.avro.Schema>) schemaList3);
        org.apache.avro.Schema[] schemaArray6 = new org.apache.avro.Schema[] {};
        java.util.ArrayList<org.apache.avro.Schema> schemaList7 = new java.util.ArrayList<org.apache.avro.Schema>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<org.apache.avro.Schema>) schemaList7, schemaArray6);
        org.apache.avro.Schema schema9 = org.apache.avro.Schema.createUnion((java.util.List<org.apache.avro.Schema>) schemaList7);
        org.apache.avro.Schema schema10 = org.apache.avro.Schema.applyAliases(schema5, schema9);
        java.util.List<org.apache.avro.Schema> schemaList11 = schema10.getTypes();
        org.apache.avro.Schema[] schemaArray12 = new org.apache.avro.Schema[] {};
        java.util.ArrayList<org.apache.avro.Schema> schemaList13 = new java.util.ArrayList<org.apache.avro.Schema>();
        boolean boolean14 = java.util.Collections.addAll((java.util.Collection<org.apache.avro.Schema>) schemaList13, schemaArray12);
        org.apache.avro.Schema schema15 = org.apache.avro.Schema.createUnion((java.util.List<org.apache.avro.Schema>) schemaList13);
        org.apache.avro.Schema[] schemaArray16 = new org.apache.avro.Schema[] {};
        java.util.ArrayList<org.apache.avro.Schema> schemaList17 = new java.util.ArrayList<org.apache.avro.Schema>();
        boolean boolean18 = java.util.Collections.addAll((java.util.Collection<org.apache.avro.Schema>) schemaList17, schemaArray16);
        org.apache.avro.Schema schema19 = org.apache.avro.Schema.createUnion((java.util.List<org.apache.avro.Schema>) schemaList17);
        org.apache.avro.Schema schema20 = org.apache.avro.Schema.applyAliases(schema15, schema19);
        org.apache.avro.Schema schema21 = org.apache.avro.Schema.applyAliases(schema10, schema19);
        org.apache.avro.Schema schema22 = names0.getOrDefault((java.lang.Object) 100.0d, schema21);
        org.apache.avro.Schema.Parser parser23 = new org.apache.avro.Schema.Parser();
        org.apache.avro.Schema.Parser parser25 = parser23.setValidate(true);
        java.util.Map<java.lang.String, org.apache.avro.Schema> strMap26 = parser23.getTypes();
        org.apache.avro.Schema.Parser parser28 = parser23.setValidate(true);
        org.apache.avro.Schema.Parser parser30 = parser23.setValidate(true);
        org.apache.avro.Schema[] schemaArray31 = new org.apache.avro.Schema[] {};
        java.util.ArrayList<org.apache.avro.Schema> schemaList32 = new java.util.ArrayList<org.apache.avro.Schema>();
        boolean boolean33 = java.util.Collections.addAll((java.util.Collection<org.apache.avro.Schema>) schemaList32, schemaArray31);
        org.apache.avro.Schema schema34 = org.apache.avro.Schema.createUnion((java.util.List<org.apache.avro.Schema>) schemaList32);
        org.apache.avro.Schema[] schemaArray35 = new org.apache.avro.Schema[] {};
        java.util.ArrayList<org.apache.avro.Schema> schemaList36 = new java.util.ArrayList<org.apache.avro.Schema>();
        boolean boolean37 = java.util.Collections.addAll((java.util.Collection<org.apache.avro.Schema>) schemaList36, schemaArray35);
        org.apache.avro.Schema schema38 = org.apache.avro.Schema.createUnion((java.util.List<org.apache.avro.Schema>) schemaList36);
        org.apache.avro.Schema schema39 = org.apache.avro.Schema.applyAliases(schema34, schema38);
        java.util.List<org.apache.avro.Schema> schemaList40 = schema39.getTypes();
        java.lang.String str42 = schema39.toString(true);
        org.apache.avro.Schema schema43 = names0.getOrDefault((java.lang.Object) true, schema39);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str44 = schema39.getNamespace();
            org.junit.Assert.fail("Expected exception of type org.apache.avro.AvroRuntimeException; message: Not a named type: []");
        } catch (org.apache.avro.AvroRuntimeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(schemaArray2);
        org.junit.Assert.assertArrayEquals(schemaArray2, new org.apache.avro.Schema[] {});
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(schema5);
        org.junit.Assert.assertNotNull(schemaArray6);
        org.junit.Assert.assertArrayEquals(schemaArray6, new org.apache.avro.Schema[] {});
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(schema9);
        org.junit.Assert.assertNotNull(schema10);
        org.junit.Assert.assertNotNull(schemaList11);
        org.junit.Assert.assertNotNull(schemaArray12);
        org.junit.Assert.assertArrayEquals(schemaArray12, new org.apache.avro.Schema[] {});
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(schema15);
        org.junit.Assert.assertNotNull(schemaArray16);
        org.junit.Assert.assertArrayEquals(schemaArray16, new org.apache.avro.Schema[] {});
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(schema19);
        org.junit.Assert.assertNotNull(schema20);
        org.junit.Assert.assertNotNull(schema21);
        org.junit.Assert.assertNotNull(schema22);
        org.junit.Assert.assertNotNull(parser25);
        org.junit.Assert.assertNotNull(strMap26);
        org.junit.Assert.assertNotNull(parser28);
        org.junit.Assert.assertNotNull(parser30);
        org.junit.Assert.assertNotNull(schemaArray31);
        org.junit.Assert.assertArrayEquals(schemaArray31, new org.apache.avro.Schema[] {});
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertNotNull(schema34);
        org.junit.Assert.assertNotNull(schemaArray35);
        org.junit.Assert.assertArrayEquals(schemaArray35, new org.apache.avro.Schema[] {});
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertNotNull(schema38);
        org.junit.Assert.assertNotNull(schema39);
        org.junit.Assert.assertNotNull(schemaList40);
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "[ ]" + "'", str42, "[ ]");
        org.junit.Assert.assertNotNull(schema43);
    }

    @Test
    public void test0329() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SchemaM3Random300Test0.test0329");
        org.apache.avro.Schema[] schemaArray0 = new org.apache.avro.Schema[] {};
        java.util.ArrayList<org.apache.avro.Schema> schemaList1 = new java.util.ArrayList<org.apache.avro.Schema>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<org.apache.avro.Schema>) schemaList1, schemaArray0);
        org.apache.avro.Schema schema3 = org.apache.avro.Schema.createUnion((java.util.List<org.apache.avro.Schema>) schemaList1);
        org.apache.avro.Schema[] schemaArray4 = new org.apache.avro.Schema[] {};
        java.util.ArrayList<org.apache.avro.Schema> schemaList5 = new java.util.ArrayList<org.apache.avro.Schema>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<org.apache.avro.Schema>) schemaList5, schemaArray4);
        org.apache.avro.Schema schema7 = org.apache.avro.Schema.createUnion((java.util.List<org.apache.avro.Schema>) schemaList5);
        org.apache.avro.Schema schema8 = org.apache.avro.Schema.applyAliases(schema3, schema7);
        java.util.List<org.apache.avro.Schema> schemaList9 = schema8.getTypes();
        boolean boolean11 = schema8.equals((java.lang.Object) "hi!");
        java.lang.String str12 = schema8.getDoc();
        org.apache.avro.Schema schema13 = org.apache.avro.Schema.createArray(schema8);
        java.lang.String str14 = schema8.toString();
        org.apache.avro.Schema schema15 = org.apache.avro.Schema.createArray(schema8);
        java.util.List<org.apache.avro.Schema> schemaList16 = schema8.getTypes();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.avro.Schema.Field field18 = schema8.getField("{\"type\":\"array\",\"items\":{\"type\":\"map\",\"values\":[]}}");
            org.junit.Assert.fail("Expected exception of type org.apache.avro.AvroRuntimeException; message: Not a record: []");
        } catch (org.apache.avro.AvroRuntimeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(schemaArray0);
        org.junit.Assert.assertArrayEquals(schemaArray0, new org.apache.avro.Schema[] {});
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(schema3);
        org.junit.Assert.assertNotNull(schemaArray4);
        org.junit.Assert.assertArrayEquals(schemaArray4, new org.apache.avro.Schema[] {});
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(schema7);
        org.junit.Assert.assertNotNull(schema8);
        org.junit.Assert.assertNotNull(schemaList9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNotNull(schema13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "[]" + "'", str14, "[]");
        org.junit.Assert.assertNotNull(schema15);
        org.junit.Assert.assertNotNull(schemaList16);
    }

    @Test
    public void test0330() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SchemaM3Random300Test0.test0330");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.avro.Schema schema2 = org.apache.avro.Schema.parse("{\"type\":\"record\",\"fields\":[]}", false);
            org.junit.Assert.fail("Expected exception of type org.apache.avro.SchemaParseException; message: No name in schema: {\"type\":\"record\",\"fields\":[]}");
        } catch (org.apache.avro.SchemaParseException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0331() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SchemaM3Random300Test0.test0331");
        org.apache.avro.Schema schema4 = org.apache.avro.Schema.createFixed("union", "[ ]", "[]", 0);
        java.lang.String str6 = schema4.getProp("map");
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<org.apache.avro.Schema> schemaList7 = schema4.getTypes();
            org.junit.Assert.fail("Expected exception of type org.apache.avro.AvroRuntimeException; message: Not a union: {\"type\":\"fixed\",\"name\":\"union\",\"namespace\":\"[]\",\"doc\":\"[ ]\",\"size\":0}");
        } catch (org.apache.avro.AvroRuntimeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(schema4);
        org.junit.Assert.assertNull(str6);
    }

    @Test
    public void test0332() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SchemaM3Random300Test0.test0332");
        org.apache.avro.Schema[] schemaArray0 = new org.apache.avro.Schema[] {};
        java.util.ArrayList<org.apache.avro.Schema> schemaList1 = new java.util.ArrayList<org.apache.avro.Schema>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<org.apache.avro.Schema>) schemaList1, schemaArray0);
        org.apache.avro.Schema schema3 = org.apache.avro.Schema.createUnion((java.util.List<org.apache.avro.Schema>) schemaList1);
        org.apache.avro.Schema[] schemaArray4 = new org.apache.avro.Schema[] {};
        java.util.ArrayList<org.apache.avro.Schema> schemaList5 = new java.util.ArrayList<org.apache.avro.Schema>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<org.apache.avro.Schema>) schemaList5, schemaArray4);
        org.apache.avro.Schema schema7 = org.apache.avro.Schema.createUnion((java.util.List<org.apache.avro.Schema>) schemaList5);
        org.apache.avro.Schema schema8 = org.apache.avro.Schema.applyAliases(schema3, schema7);
        java.util.List<org.apache.avro.Schema> schemaList9 = schema8.getTypes();
        boolean boolean11 = schema8.equals((java.lang.Object) "hi!");
        java.lang.String str12 = schema8.getDoc();
        org.apache.avro.Schema schema13 = org.apache.avro.Schema.createArray(schema8);
        java.lang.String str14 = schema8.toString();
        org.apache.avro.Schema schema15 = org.apache.avro.Schema.createArray(schema8);
        org.apache.avro.Schema schema16 = org.apache.avro.Schema.createArray(schema8);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean17 = schema16.isError();
            org.junit.Assert.fail("Expected exception of type org.apache.avro.AvroRuntimeException; message: Not a record: {\"type\":\"array\",\"items\":[]}");
        } catch (org.apache.avro.AvroRuntimeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(schemaArray0);
        org.junit.Assert.assertArrayEquals(schemaArray0, new org.apache.avro.Schema[] {});
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(schema3);
        org.junit.Assert.assertNotNull(schemaArray4);
        org.junit.Assert.assertArrayEquals(schemaArray4, new org.apache.avro.Schema[] {});
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(schema7);
        org.junit.Assert.assertNotNull(schema8);
        org.junit.Assert.assertNotNull(schemaList9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNotNull(schema13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "[]" + "'", str14, "[]");
        org.junit.Assert.assertNotNull(schema15);
        org.junit.Assert.assertNotNull(schema16);
    }

    @Test
    public void test0333() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SchemaM3Random300Test0.test0333");
        org.apache.avro.Schema.Parser parser0 = new org.apache.avro.Schema.Parser();
        java.util.Map<java.lang.String, org.apache.avro.Schema> strMap1 = parser0.getTypes();
        java.util.Map<java.lang.String, org.apache.avro.Schema> strMap2 = parser0.getTypes();
        org.apache.avro.Schema.Parser parser3 = new org.apache.avro.Schema.Parser();
        org.apache.avro.Schema.Parser parser5 = parser3.setValidate(true);
        java.util.Map<java.lang.String, org.apache.avro.Schema> strMap6 = parser3.getTypes();
        org.apache.avro.Schema.Parser parser7 = parser0.addTypes(strMap6);
        org.apache.avro.Schema.Parser parser9 = parser7.setValidate(false);
        java.io.File file10 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.avro.Schema schema11 = parser7.parse(file10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strMap1);
        org.junit.Assert.assertNotNull(strMap2);
        org.junit.Assert.assertNotNull(parser5);
        org.junit.Assert.assertNotNull(strMap6);
        org.junit.Assert.assertNotNull(parser7);
        org.junit.Assert.assertNotNull(parser9);
    }

    @Test
    public void test0334() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SchemaM3Random300Test0.test0334");
        org.apache.avro.Schema.Parser parser0 = new org.apache.avro.Schema.Parser();
        org.apache.avro.Schema.Parser parser2 = parser0.setValidate(true);
        org.apache.avro.Schema.Parser parser4 = parser0.setValidate(true);
        org.apache.avro.Schema.Parser parser6 = parser0.setValidate(true);
        org.apache.avro.Schema schema8 = parser0.parse("[].union");
        java.io.InputStream inputStream9 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.avro.Schema schema10 = parser0.parse(inputStream9);
            org.junit.Assert.fail("Expected exception of type java.io.EOFException; message: No content to map to Object due to end of input");
        } catch (java.io.EOFException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(parser2);
        org.junit.Assert.assertNotNull(parser4);
        org.junit.Assert.assertNotNull(parser6);
        org.junit.Assert.assertNotNull(schema8);
    }

    @Test
    public void test0335() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SchemaM3Random300Test0.test0335");
        org.apache.avro.Schema[] schemaArray0 = new org.apache.avro.Schema[] {};
        java.util.ArrayList<org.apache.avro.Schema> schemaList1 = new java.util.ArrayList<org.apache.avro.Schema>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<org.apache.avro.Schema>) schemaList1, schemaArray0);
        org.apache.avro.Schema schema3 = org.apache.avro.Schema.createUnion((java.util.List<org.apache.avro.Schema>) schemaList1);
        org.apache.avro.Schema[] schemaArray4 = new org.apache.avro.Schema[] {};
        java.util.ArrayList<org.apache.avro.Schema> schemaList5 = new java.util.ArrayList<org.apache.avro.Schema>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<org.apache.avro.Schema>) schemaList5, schemaArray4);
        org.apache.avro.Schema schema7 = org.apache.avro.Schema.createUnion((java.util.List<org.apache.avro.Schema>) schemaList5);
        org.apache.avro.Schema schema8 = org.apache.avro.Schema.applyAliases(schema3, schema7);
        java.util.List<org.apache.avro.Schema> schemaList9 = schema8.getTypes();
        boolean boolean11 = schema8.equals((java.lang.Object) "hi!");
        java.lang.String str12 = schema8.getDoc();
        java.lang.String str14 = schema8.toString(true);
        org.apache.avro.Schema[] schemaArray15 = new org.apache.avro.Schema[] {};
        java.util.ArrayList<org.apache.avro.Schema> schemaList16 = new java.util.ArrayList<org.apache.avro.Schema>();
        boolean boolean17 = java.util.Collections.addAll((java.util.Collection<org.apache.avro.Schema>) schemaList16, schemaArray15);
        org.apache.avro.Schema schema18 = org.apache.avro.Schema.createUnion((java.util.List<org.apache.avro.Schema>) schemaList16);
        org.apache.avro.Schema[] schemaArray19 = new org.apache.avro.Schema[] {};
        java.util.ArrayList<org.apache.avro.Schema> schemaList20 = new java.util.ArrayList<org.apache.avro.Schema>();
        boolean boolean21 = java.util.Collections.addAll((java.util.Collection<org.apache.avro.Schema>) schemaList20, schemaArray19);
        org.apache.avro.Schema schema22 = org.apache.avro.Schema.createUnion((java.util.List<org.apache.avro.Schema>) schemaList20);
        org.apache.avro.Schema schema23 = org.apache.avro.Schema.applyAliases(schema18, schema22);
        java.util.List<org.apache.avro.Schema> schemaList24 = schema23.getTypes();
        org.apache.avro.Schema schema25 = org.apache.avro.Schema.createUnion(schemaList24);
        java.lang.String str26 = schema25.getDoc();
        org.apache.avro.Schema schema27 = org.apache.avro.Schema.applyAliases(schema8, schema25);
        java.lang.String str28 = schema27.toString();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean29 = schema27.isError();
            org.junit.Assert.fail("Expected exception of type org.apache.avro.AvroRuntimeException; message: Not a record: []");
        } catch (org.apache.avro.AvroRuntimeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(schemaArray0);
        org.junit.Assert.assertArrayEquals(schemaArray0, new org.apache.avro.Schema[] {});
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(schema3);
        org.junit.Assert.assertNotNull(schemaArray4);
        org.junit.Assert.assertArrayEquals(schemaArray4, new org.apache.avro.Schema[] {});
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(schema7);
        org.junit.Assert.assertNotNull(schema8);
        org.junit.Assert.assertNotNull(schemaList9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "[ ]" + "'", str14, "[ ]");
        org.junit.Assert.assertNotNull(schemaArray15);
        org.junit.Assert.assertArrayEquals(schemaArray15, new org.apache.avro.Schema[] {});
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(schema18);
        org.junit.Assert.assertNotNull(schemaArray19);
        org.junit.Assert.assertArrayEquals(schemaArray19, new org.apache.avro.Schema[] {});
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(schema22);
        org.junit.Assert.assertNotNull(schema23);
        org.junit.Assert.assertNotNull(schemaList24);
        org.junit.Assert.assertNotNull(schema25);
        org.junit.Assert.assertNull(str26);
        org.junit.Assert.assertNotNull(schema27);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "[]" + "'", str28, "[]");
    }

    @Test
    public void test0336() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SchemaM3Random300Test0.test0336");
        org.apache.avro.Schema.Parser parser0 = new org.apache.avro.Schema.Parser();
        org.apache.avro.Schema.Parser parser2 = parser0.setValidate(true);
        org.apache.avro.Schema.Parser parser4 = parser0.setValidate(true);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.avro.Schema schema6 = parser4.parse("hi!");
            org.junit.Assert.fail("Expected exception of type org.apache.avro.SchemaParseException; message: org.codehaus.jackson.JsonParseException: Unexpected character ('h' (code 104)): expected a valid value (number, String, array, object, 'true', 'false' or 'null')? at [Source: java.io.StringReader@6e1b17e9; line: 1, column: 2]");
        } catch (org.apache.avro.SchemaParseException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(parser2);
        org.junit.Assert.assertNotNull(parser4);
    }

    @Test
    public void test0337() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SchemaM3Random300Test0.test0337");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.avro.Schema schema4 = org.apache.avro.Schema.createRecord("union type:MAP pos:-1", "[].union", "{\r\n  \"type\" : \"record\",\r\n  \"fields\" : [ ]\r\n}", true);
            org.junit.Assert.fail("Expected exception of type org.apache.avro.SchemaParseException; message: Illegal character in: union type:MAP pos:-1");
        } catch (org.apache.avro.SchemaParseException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0338() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SchemaM3Random300Test0.test0338");
        org.apache.avro.Schema.Names names1 = new org.apache.avro.Schema.Names("{\"type\":\"array\",\"items\":[]}");
    }

    @Test
    public void test0339() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SchemaM3Random300Test0.test0339");
        org.apache.avro.Schema schema0 = null;
        org.apache.avro.Schema schema1 = org.apache.avro.Schema.createMap(schema0);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = schema1.toString();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(schema1);
    }

    @Test
    public void test0340() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SchemaM3Random300Test0.test0340");
        java.lang.String[] strArray24 = new java.lang.String[] { "{\r\n  \"type\" : \"array\",\r\n  \"items\" : {\r\n    \"type\" : \"map\",\r\n    \"values\" : [ ]\r\n  }\r\n}", "", "{\"type\":\"array\",\"items\":[]}", "{\r\n  \"type\" : \"map\",\r\n  \"values\" : [ ]\r\n}", "union type:UNION pos:-1", "{\"type\":\"array\",\"items\":[]}", "{\"type\":\"fixed\",\"name\":\"union\",\"namespace\":\"[]\",\"doc\":\"[ ]\",\"size\":0}", "{}", "{\r\n  \"type\" : \"record\",\r\n  \"fields\" : [ ]\r\n}", "[].union", "{\"type\":\"fixed\",\"name\":\"union\",\"namespace\":\"[]\",\"doc\":\"[ ]\",\"size\":0}", "double", "", "{\"type\":\"array\",\"items\":{\"type\":\"map\",\"values\":[]}}", "", "{\r\n  \"type\" : \"map\",\r\n  \"values\" : {\r\n    \"type\" : \"map\",\r\n    \"values\" : [ ]\r\n  }\r\n}", "{}", "{\r\n  \"type\" : \"array\",\r\n  \"items\" : {\r\n    \"type\" : \"map\",\r\n    \"values\" : [ ]\r\n  }\r\n}", "double", "[].union", "float" };
        java.util.ArrayList<java.lang.String> strList25 = new java.util.ArrayList<java.lang.String>();
        boolean boolean26 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList25, strArray24);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.avro.Schema schema27 = org.apache.avro.Schema.createEnum("map", "{\"type\":\"record\",\"fields\":[]}", "{\"type\":\"map\",\"values\":[]}", (java.util.List<java.lang.String>) strList25);
            org.junit.Assert.fail("Expected exception of type org.apache.avro.SchemaParseException; message: Illegal initial character: {??  \"type\" : \"array\",??  \"items\" : {??    \"type\" : \"map\",??    \"values\" : [ ]??  }??}");
        } catch (org.apache.avro.SchemaParseException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray24);
        org.junit.Assert.assertArrayEquals(strArray24, new java.lang.String[] { "{\r\n  \"type\" : \"array\",\r\n  \"items\" : {\r\n    \"type\" : \"map\",\r\n    \"values\" : [ ]\r\n  }\r\n}", "", "{\"type\":\"array\",\"items\":[]}", "{\r\n  \"type\" : \"map\",\r\n  \"values\" : [ ]\r\n}", "union type:UNION pos:-1", "{\"type\":\"array\",\"items\":[]}", "{\"type\":\"fixed\",\"name\":\"union\",\"namespace\":\"[]\",\"doc\":\"[ ]\",\"size\":0}", "{}", "{\r\n  \"type\" : \"record\",\r\n  \"fields\" : [ ]\r\n}", "[].union", "{\"type\":\"fixed\",\"name\":\"union\",\"namespace\":\"[]\",\"doc\":\"[ ]\",\"size\":0}", "double", "", "{\"type\":\"array\",\"items\":{\"type\":\"map\",\"values\":[]}}", "", "{\r\n  \"type\" : \"map\",\r\n  \"values\" : {\r\n    \"type\" : \"map\",\r\n    \"values\" : [ ]\r\n  }\r\n}", "{}", "{\r\n  \"type\" : \"array\",\r\n  \"items\" : {\r\n    \"type\" : \"map\",\r\n    \"values\" : [ ]\r\n  }\r\n}", "double", "[].union", "float" });
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
    }

    @Test
    public void test0341() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SchemaM3Random300Test0.test0341");
        org.apache.avro.Schema[] schemaArray0 = new org.apache.avro.Schema[] {};
        java.util.ArrayList<org.apache.avro.Schema> schemaList1 = new java.util.ArrayList<org.apache.avro.Schema>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<org.apache.avro.Schema>) schemaList1, schemaArray0);
        org.apache.avro.Schema schema3 = org.apache.avro.Schema.createUnion((java.util.List<org.apache.avro.Schema>) schemaList1);
        org.apache.avro.Schema[] schemaArray4 = new org.apache.avro.Schema[] {};
        java.util.ArrayList<org.apache.avro.Schema> schemaList5 = new java.util.ArrayList<org.apache.avro.Schema>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<org.apache.avro.Schema>) schemaList5, schemaArray4);
        org.apache.avro.Schema schema7 = org.apache.avro.Schema.createUnion((java.util.List<org.apache.avro.Schema>) schemaList5);
        org.apache.avro.Schema schema8 = org.apache.avro.Schema.applyAliases(schema3, schema7);
        java.util.List<org.apache.avro.Schema> schemaList9 = schema8.getTypes();
        boolean boolean11 = schema8.equals((java.lang.Object) "hi!");
        java.lang.String str12 = schema8.getDoc();
        org.apache.avro.Schema schema13 = org.apache.avro.Schema.createArray(schema8);
        java.lang.String str14 = schema8.getFullName();
        org.apache.avro.Schema schema15 = org.apache.avro.Schema.createMap(schema8);
        java.lang.String str16 = schema15.getName();
        java.lang.String str17 = schema15.getName();
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<org.apache.avro.Schema.Field> fieldList18 = schema15.getFields();
            org.junit.Assert.fail("Expected exception of type org.apache.avro.AvroRuntimeException; message: Not a record: {\"type\":\"map\",\"values\":[]}");
        } catch (org.apache.avro.AvroRuntimeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(schemaArray0);
        org.junit.Assert.assertArrayEquals(schemaArray0, new org.apache.avro.Schema[] {});
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(schema3);
        org.junit.Assert.assertNotNull(schemaArray4);
        org.junit.Assert.assertArrayEquals(schemaArray4, new org.apache.avro.Schema[] {});
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(schema7);
        org.junit.Assert.assertNotNull(schema8);
        org.junit.Assert.assertNotNull(schemaList9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNotNull(schema13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "union" + "'", str14, "union");
        org.junit.Assert.assertNotNull(schema15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "map" + "'", str16, "map");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "map" + "'", str17, "map");
    }

    @Test
    public void test0342() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SchemaM3Random300Test0.test0342");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.avro.Schema schema2 = org.apache.avro.Schema.parse("{null={\"type\":\"fixed\",\"name\":\"union\",\"namespace\":\"[]\",\"doc\":\"[ ]\",\"size\":0}}", false);
            org.junit.Assert.fail("Expected exception of type org.apache.avro.SchemaParseException; message: org.codehaus.jackson.JsonParseException: Unexpected character ('n' (code 110)): was expecting double-quote to start field name? at [Source: java.io.StringReader@3c0b1ca2; line: 1, column: 3]");
        } catch (org.apache.avro.SchemaParseException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0343() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SchemaM3Random300Test0.test0343");
        org.apache.avro.Schema[] schemaArray0 = new org.apache.avro.Schema[] {};
        java.util.ArrayList<org.apache.avro.Schema> schemaList1 = new java.util.ArrayList<org.apache.avro.Schema>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<org.apache.avro.Schema>) schemaList1, schemaArray0);
        org.apache.avro.Schema schema3 = org.apache.avro.Schema.createUnion((java.util.List<org.apache.avro.Schema>) schemaList1);
        org.apache.avro.Schema[] schemaArray4 = new org.apache.avro.Schema[] {};
        java.util.ArrayList<org.apache.avro.Schema> schemaList5 = new java.util.ArrayList<org.apache.avro.Schema>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<org.apache.avro.Schema>) schemaList5, schemaArray4);
        org.apache.avro.Schema schema7 = org.apache.avro.Schema.createUnion((java.util.List<org.apache.avro.Schema>) schemaList5);
        org.apache.avro.Schema schema8 = org.apache.avro.Schema.applyAliases(schema3, schema7);
        java.util.List<org.apache.avro.Schema> schemaList9 = schema8.getTypes();
        org.apache.avro.Schema[] schemaArray10 = new org.apache.avro.Schema[] {};
        java.util.ArrayList<org.apache.avro.Schema> schemaList11 = new java.util.ArrayList<org.apache.avro.Schema>();
        boolean boolean12 = java.util.Collections.addAll((java.util.Collection<org.apache.avro.Schema>) schemaList11, schemaArray10);
        org.apache.avro.Schema schema13 = org.apache.avro.Schema.createUnion((java.util.List<org.apache.avro.Schema>) schemaList11);
        org.apache.avro.Schema[] schemaArray14 = new org.apache.avro.Schema[] {};
        java.util.ArrayList<org.apache.avro.Schema> schemaList15 = new java.util.ArrayList<org.apache.avro.Schema>();
        boolean boolean16 = java.util.Collections.addAll((java.util.Collection<org.apache.avro.Schema>) schemaList15, schemaArray14);
        org.apache.avro.Schema schema17 = org.apache.avro.Schema.createUnion((java.util.List<org.apache.avro.Schema>) schemaList15);
        org.apache.avro.Schema schema18 = org.apache.avro.Schema.applyAliases(schema13, schema17);
        org.apache.avro.Schema schema19 = org.apache.avro.Schema.applyAliases(schema8, schema17);
        org.apache.avro.Schema schema20 = org.apache.avro.Schema.createMap(schema8);
        org.apache.avro.Schema schema21 = org.apache.avro.Schema.createArray(schema20);
        java.lang.String str22 = schema20.toString();
        java.lang.String str24 = schema20.getProp("{\"type\":\"map\",\"values\":[]}");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.avro.Schema.Field field26 = schema20.getField("hi!");
            org.junit.Assert.fail("Expected exception of type org.apache.avro.AvroRuntimeException; message: Not a record: {\"type\":\"map\",\"values\":[]}");
        } catch (org.apache.avro.AvroRuntimeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(schemaArray0);
        org.junit.Assert.assertArrayEquals(schemaArray0, new org.apache.avro.Schema[] {});
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(schema3);
        org.junit.Assert.assertNotNull(schemaArray4);
        org.junit.Assert.assertArrayEquals(schemaArray4, new org.apache.avro.Schema[] {});
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(schema7);
        org.junit.Assert.assertNotNull(schema8);
        org.junit.Assert.assertNotNull(schemaList9);
        org.junit.Assert.assertNotNull(schemaArray10);
        org.junit.Assert.assertArrayEquals(schemaArray10, new org.apache.avro.Schema[] {});
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(schema13);
        org.junit.Assert.assertNotNull(schemaArray14);
        org.junit.Assert.assertArrayEquals(schemaArray14, new org.apache.avro.Schema[] {});
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(schema17);
        org.junit.Assert.assertNotNull(schema18);
        org.junit.Assert.assertNotNull(schema19);
        org.junit.Assert.assertNotNull(schema20);
        org.junit.Assert.assertNotNull(schema21);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "{\"type\":\"map\",\"values\":[]}" + "'", str22, "{\"type\":\"map\",\"values\":[]}");
        org.junit.Assert.assertNull(str24);
    }

    @Test
    public void test0344() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SchemaM3Random300Test0.test0344");
        org.apache.avro.Schema.LockableArrayList<java.lang.String> strList4 = new org.apache.avro.Schema.LockableArrayList<java.lang.String>((int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.avro.Schema schema5 = org.apache.avro.Schema.createEnum("{\"type\":\"record\",\"fields\":[]}", "{\"type\":\"map\",\"values\":[]}", "double", (java.util.List<java.lang.String>) strList4);
            org.junit.Assert.fail("Expected exception of type org.apache.avro.SchemaParseException; message: Illegal initial character: {\"type\":\"record\",\"fields\":[]}");
        } catch (org.apache.avro.SchemaParseException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0345() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SchemaM3Random300Test0.test0345");
        org.apache.avro.Schema.Parser parser0 = new org.apache.avro.Schema.Parser();
        java.util.Map<java.lang.String, org.apache.avro.Schema> strMap1 = parser0.getTypes();
        java.util.Map<java.lang.String, org.apache.avro.Schema> strMap2 = parser0.getTypes();
        org.apache.avro.Schema.Parser parser3 = new org.apache.avro.Schema.Parser();
        java.util.Map<java.lang.String, org.apache.avro.Schema> strMap4 = parser3.getTypes();
        org.apache.avro.Schema.Parser parser5 = parser0.addTypes(strMap4);
        org.apache.avro.Schema.Parser parser7 = parser0.setValidate(true);
        org.apache.avro.Schema.Parser parser9 = parser0.setValidate(false);
        java.util.Map<java.lang.String, org.apache.avro.Schema> strMap10 = parser0.getTypes();
        org.apache.avro.Schema schema12 = parser0.parse("{\"type\":\"array\",\"items\":[]}");
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<org.apache.avro.Schema> schemaList13 = schema12.getTypes();
            org.junit.Assert.fail("Expected exception of type org.apache.avro.AvroRuntimeException; message: Not a union: {\"type\":\"array\",\"items\":[]}");
        } catch (org.apache.avro.AvroRuntimeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strMap1);
        org.junit.Assert.assertNotNull(strMap2);
        org.junit.Assert.assertNotNull(strMap4);
        org.junit.Assert.assertNotNull(parser5);
        org.junit.Assert.assertNotNull(parser7);
        org.junit.Assert.assertNotNull(parser9);
        org.junit.Assert.assertNotNull(strMap10);
        org.junit.Assert.assertNotNull(schema12);
    }

    @Test
    public void test0346() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SchemaM3Random300Test0.test0346");
        org.apache.avro.Schema.Parser parser0 = new org.apache.avro.Schema.Parser();
        java.util.Map<java.lang.String, org.apache.avro.Schema> strMap1 = parser0.getTypes();
        java.util.Map<java.lang.String, org.apache.avro.Schema> strMap2 = parser0.getTypes();
        org.apache.avro.Schema.Parser parser3 = new org.apache.avro.Schema.Parser();
        org.apache.avro.Schema.Parser parser5 = parser3.setValidate(true);
        java.util.Map<java.lang.String, org.apache.avro.Schema> strMap6 = parser3.getTypes();
        org.apache.avro.Schema.Parser parser7 = parser0.addTypes(strMap6);
        java.util.Map<java.lang.String, org.apache.avro.Schema> strMap8 = parser0.getTypes();
        java.io.File file9 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.avro.Schema schema10 = parser0.parse(file9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strMap1);
        org.junit.Assert.assertNotNull(strMap2);
        org.junit.Assert.assertNotNull(parser5);
        org.junit.Assert.assertNotNull(strMap6);
        org.junit.Assert.assertNotNull(parser7);
        org.junit.Assert.assertNotNull(strMap8);
    }

    @Test
    public void test0347() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SchemaM3Random300Test0.test0347");
        org.apache.avro.Schema.Parser parser0 = new org.apache.avro.Schema.Parser();
        org.apache.avro.Schema.Parser parser2 = parser0.setValidate(true);
        org.apache.avro.Schema.Parser parser4 = parser0.setValidate(true);
        java.io.File file5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.avro.Schema schema6 = parser4.parse(file5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(parser2);
        org.junit.Assert.assertNotNull(parser4);
    }

    @Test
    public void test0348() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SchemaM3Random300Test0.test0348");
        org.apache.avro.Schema.Parser parser0 = new org.apache.avro.Schema.Parser();
        java.util.Map<java.lang.String, org.apache.avro.Schema> strMap1 = parser0.getTypes();
        java.util.Map<java.lang.String, org.apache.avro.Schema> strMap2 = parser0.getTypes();
        org.apache.avro.Schema.Parser parser3 = new org.apache.avro.Schema.Parser();
        java.util.Map<java.lang.String, org.apache.avro.Schema> strMap4 = parser3.getTypes();
        org.apache.avro.Schema.Parser parser5 = parser0.addTypes(strMap4);
        org.apache.avro.Schema.Parser parser7 = parser0.setValidate(true);
        org.apache.avro.Schema.Parser parser9 = parser0.setValidate(false);
        org.apache.avro.Schema.Parser parser10 = new org.apache.avro.Schema.Parser();
        java.util.Map<java.lang.String, org.apache.avro.Schema> strMap11 = parser10.getTypes();
        java.util.Map<java.lang.String, org.apache.avro.Schema> strMap12 = parser10.getTypes();
        org.apache.avro.Schema.Parser parser13 = new org.apache.avro.Schema.Parser();
        java.util.Map<java.lang.String, org.apache.avro.Schema> strMap14 = parser13.getTypes();
        org.apache.avro.Schema.Parser parser15 = parser10.addTypes(strMap14);
        org.apache.avro.Schema.Parser parser16 = parser9.addTypes(strMap14);
        java.io.File file17 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.avro.Schema schema18 = parser16.parse(file17);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strMap1);
        org.junit.Assert.assertNotNull(strMap2);
        org.junit.Assert.assertNotNull(strMap4);
        org.junit.Assert.assertNotNull(parser5);
        org.junit.Assert.assertNotNull(parser7);
        org.junit.Assert.assertNotNull(parser9);
        org.junit.Assert.assertNotNull(strMap11);
        org.junit.Assert.assertNotNull(strMap12);
        org.junit.Assert.assertNotNull(strMap14);
        org.junit.Assert.assertNotNull(parser15);
        org.junit.Assert.assertNotNull(parser16);
    }

    @Test
    public void test0349() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SchemaM3Random300Test0.test0349");
        org.apache.avro.Schema schema4 = org.apache.avro.Schema.createFixed("map", "array", "", (int) 'a');
        // The following exception was thrown during execution in test generation
        try {
            int int6 = schema4.getEnumOrdinal("");
            org.junit.Assert.fail("Expected exception of type org.apache.avro.AvroRuntimeException; message: Not an enum: {\"type\":\"fixed\",\"name\":\"map\",\"namespace\":\"\",\"doc\":\"array\",\"size\":97}");
        } catch (org.apache.avro.AvroRuntimeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(schema4);
    }

    @Test
    public void test0350() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SchemaM3Random300Test0.test0350");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.avro.Schema schema4 = org.apache.avro.Schema.createFixed("{\"type\":\"fixed\",\"name\":\"union\",\"namespace\":\"[]\",\"doc\":\"[ ]\",\"size\":0}", "", "union type:UNION pos:-1", 0);
            org.junit.Assert.fail("Expected exception of type org.apache.avro.SchemaParseException; message: Illegal initial character: {\"type\":\"fixed\",\"name\":\"union\",\"namespace\":\"[]\",\"doc\":\"[ ]\",\"size\":0}");
        } catch (org.apache.avro.SchemaParseException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0351() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SchemaM3Random300Test0.test0351");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.avro.Schema schema4 = org.apache.avro.Schema.createFixed("{\"type\":\"fixed\",\"name\":\"union\",\"namespace\":\"[]\",\"doc\":\"[ ]\",\"size\":0}", "{\"type\":\"record\",\"fields\":[]}", "{null={\"type\":\"fixed\",\"name\":\"union\",\"namespace\":\"[]\",\"doc\":\"[ ]\",\"size\":0}}", (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type org.apache.avro.SchemaParseException; message: Illegal initial character: {\"type\":\"fixed\",\"name\":\"union\",\"namespace\":\"[]\",\"doc\":\"[ ]\",\"size\":0}");
        } catch (org.apache.avro.SchemaParseException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0352() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SchemaM3Random300Test0.test0352");
        org.apache.avro.Schema.Parser parser0 = new org.apache.avro.Schema.Parser();
        java.util.Map<java.lang.String, org.apache.avro.Schema> strMap1 = parser0.getTypes();
        java.util.Map<java.lang.String, org.apache.avro.Schema> strMap2 = parser0.getTypes();
        org.apache.avro.Schema.Parser parser3 = new org.apache.avro.Schema.Parser();
        java.util.Map<java.lang.String, org.apache.avro.Schema> strMap4 = parser3.getTypes();
        org.apache.avro.Schema.Parser parser5 = parser0.addTypes(strMap4);
        org.apache.avro.Schema.Parser parser7 = parser0.setValidate(true);
        org.apache.avro.Schema.Parser parser9 = parser0.setValidate(false);
        org.apache.avro.Schema.Parser parser10 = new org.apache.avro.Schema.Parser();
        java.util.Map<java.lang.String, org.apache.avro.Schema> strMap11 = parser10.getTypes();
        java.util.Map<java.lang.String, org.apache.avro.Schema> strMap12 = parser10.getTypes();
        org.apache.avro.Schema.Parser parser13 = new org.apache.avro.Schema.Parser();
        java.util.Map<java.lang.String, org.apache.avro.Schema> strMap14 = parser13.getTypes();
        org.apache.avro.Schema.Parser parser15 = parser10.addTypes(strMap14);
        org.apache.avro.Schema.Parser parser16 = parser9.addTypes(strMap14);
        java.io.InputStream inputStream17 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.avro.Schema schema18 = parser16.parse(inputStream17);
            org.junit.Assert.fail("Expected exception of type java.io.EOFException; message: No content to map to Object due to end of input");
        } catch (java.io.EOFException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strMap1);
        org.junit.Assert.assertNotNull(strMap2);
        org.junit.Assert.assertNotNull(strMap4);
        org.junit.Assert.assertNotNull(parser5);
        org.junit.Assert.assertNotNull(parser7);
        org.junit.Assert.assertNotNull(parser9);
        org.junit.Assert.assertNotNull(strMap11);
        org.junit.Assert.assertNotNull(strMap12);
        org.junit.Assert.assertNotNull(strMap14);
        org.junit.Assert.assertNotNull(parser15);
        org.junit.Assert.assertNotNull(parser16);
    }

    @Test
    public void test0353() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SchemaM3Random300Test0.test0353");
        org.apache.avro.Schema.LockableArrayList<java.lang.String> strList4 = new org.apache.avro.Schema.LockableArrayList<java.lang.String>((int) '#');
        // The following exception was thrown during execution in test generation
        try {
            org.apache.avro.Schema schema5 = org.apache.avro.Schema.createEnum("", "union type:UNION pos:-1", "[].union", (java.util.List<java.lang.String>) strList4);
            org.junit.Assert.fail("Expected exception of type org.apache.avro.SchemaParseException; message: Empty name");
        } catch (org.apache.avro.SchemaParseException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0354() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SchemaM3Random300Test0.test0354");
        org.apache.avro.Schema.Field[] fieldArray0 = new org.apache.avro.Schema.Field[] {};
        java.util.ArrayList<org.apache.avro.Schema.Field> fieldList1 = new java.util.ArrayList<org.apache.avro.Schema.Field>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<org.apache.avro.Schema.Field>) fieldList1, fieldArray0);
        org.apache.avro.Schema schema3 = org.apache.avro.Schema.createRecord((java.util.List<org.apache.avro.Schema.Field>) fieldList1);
        org.apache.avro.Schema schema4 = org.apache.avro.Schema.createRecord((java.util.List<org.apache.avro.Schema.Field>) fieldList1);
        org.apache.avro.Schema schema5 = org.apache.avro.Schema.createArray(schema4);
        java.lang.String str7 = schema5.getProp("hi!");
        org.junit.Assert.assertNotNull(fieldArray0);
        org.junit.Assert.assertArrayEquals(fieldArray0, new org.apache.avro.Schema.Field[] {});
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(schema3);
        org.junit.Assert.assertNotNull(schema4);
        org.junit.Assert.assertNotNull(schema5);
        org.junit.Assert.assertNull(str7);
    }

    @Test
    public void test0355() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SchemaM3Random300Test0.test0355");
        org.apache.avro.Schema[] schemaArray0 = new org.apache.avro.Schema[] {};
        java.util.ArrayList<org.apache.avro.Schema> schemaList1 = new java.util.ArrayList<org.apache.avro.Schema>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<org.apache.avro.Schema>) schemaList1, schemaArray0);
        org.apache.avro.Schema schema3 = org.apache.avro.Schema.createUnion((java.util.List<org.apache.avro.Schema>) schemaList1);
        org.apache.avro.Schema[] schemaArray4 = new org.apache.avro.Schema[] {};
        java.util.ArrayList<org.apache.avro.Schema> schemaList5 = new java.util.ArrayList<org.apache.avro.Schema>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<org.apache.avro.Schema>) schemaList5, schemaArray4);
        org.apache.avro.Schema schema7 = org.apache.avro.Schema.createUnion((java.util.List<org.apache.avro.Schema>) schemaList5);
        org.apache.avro.Schema schema8 = org.apache.avro.Schema.applyAliases(schema3, schema7);
        java.util.List<org.apache.avro.Schema> schemaList9 = schema8.getTypes();
        org.apache.avro.Schema[] schemaArray10 = new org.apache.avro.Schema[] {};
        java.util.ArrayList<org.apache.avro.Schema> schemaList11 = new java.util.ArrayList<org.apache.avro.Schema>();
        boolean boolean12 = java.util.Collections.addAll((java.util.Collection<org.apache.avro.Schema>) schemaList11, schemaArray10);
        org.apache.avro.Schema schema13 = org.apache.avro.Schema.createUnion((java.util.List<org.apache.avro.Schema>) schemaList11);
        org.apache.avro.Schema[] schemaArray14 = new org.apache.avro.Schema[] {};
        java.util.ArrayList<org.apache.avro.Schema> schemaList15 = new java.util.ArrayList<org.apache.avro.Schema>();
        boolean boolean16 = java.util.Collections.addAll((java.util.Collection<org.apache.avro.Schema>) schemaList15, schemaArray14);
        org.apache.avro.Schema schema17 = org.apache.avro.Schema.createUnion((java.util.List<org.apache.avro.Schema>) schemaList15);
        org.apache.avro.Schema schema18 = org.apache.avro.Schema.applyAliases(schema13, schema17);
        org.apache.avro.Schema schema19 = org.apache.avro.Schema.applyAliases(schema8, schema17);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean21 = schema19.hasEnumSymbol("{\r\n  \"type\" : \"map\",\r\n  \"values\" : {\r\n    \"type\" : \"map\",\r\n    \"values\" : [ ]\r\n  }\r\n}");
            org.junit.Assert.fail("Expected exception of type org.apache.avro.AvroRuntimeException; message: Not an enum: []");
        } catch (org.apache.avro.AvroRuntimeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(schemaArray0);
        org.junit.Assert.assertArrayEquals(schemaArray0, new org.apache.avro.Schema[] {});
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(schema3);
        org.junit.Assert.assertNotNull(schemaArray4);
        org.junit.Assert.assertArrayEquals(schemaArray4, new org.apache.avro.Schema[] {});
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(schema7);
        org.junit.Assert.assertNotNull(schema8);
        org.junit.Assert.assertNotNull(schemaList9);
        org.junit.Assert.assertNotNull(schemaArray10);
        org.junit.Assert.assertArrayEquals(schemaArray10, new org.apache.avro.Schema[] {});
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(schema13);
        org.junit.Assert.assertNotNull(schemaArray14);
        org.junit.Assert.assertArrayEquals(schemaArray14, new org.apache.avro.Schema[] {});
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(schema17);
        org.junit.Assert.assertNotNull(schema18);
        org.junit.Assert.assertNotNull(schema19);
    }

    @Test
    public void test0356() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SchemaM3Random300Test0.test0356");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.avro.Schema schema4 = org.apache.avro.Schema.createFixed("", "{\"type\":\"fixed\",\"name\":\"union\",\"namespace\":\"[]\",\"doc\":\"[ ]\",\"size\":0}", "", (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type org.apache.avro.SchemaParseException; message: Empty name");
        } catch (org.apache.avro.SchemaParseException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0357() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SchemaM3Random300Test0.test0357");
        org.apache.avro.Schema.Type type0 = org.apache.avro.Schema.Type.DOUBLE;
        org.apache.avro.Schema schema1 = org.apache.avro.Schema.create(type0);
        java.lang.String str2 = schema1.getName();
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<org.apache.avro.Schema> schemaList3 = schema1.getTypes();
            org.junit.Assert.fail("Expected exception of type org.apache.avro.AvroRuntimeException; message: Not a union: \"double\"");
        } catch (org.apache.avro.AvroRuntimeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + type0 + "' != '" + org.apache.avro.Schema.Type.DOUBLE + "'", type0.equals(org.apache.avro.Schema.Type.DOUBLE));
        org.junit.Assert.assertNotNull(schema1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "double" + "'", str2, "double");
    }

    @Test
    public void test0358() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SchemaM3Random300Test0.test0358");
        org.apache.avro.Schema.Parser parser0 = new org.apache.avro.Schema.Parser();
        java.util.Map<java.lang.String, org.apache.avro.Schema> strMap1 = parser0.getTypes();
        java.util.Map<java.lang.String, org.apache.avro.Schema> strMap2 = parser0.getTypes();
        org.apache.avro.Schema.Parser parser3 = new org.apache.avro.Schema.Parser();
        java.util.Map<java.lang.String, org.apache.avro.Schema> strMap4 = parser3.getTypes();
        org.apache.avro.Schema.Parser parser5 = parser0.addTypes(strMap4);
        org.apache.avro.Schema schema7 = parser0.parse("{\r\n  \"type\" : \"map\",\r\n  \"values\" : [ ]\r\n}");
        org.apache.avro.Schema schema8 = schema7.getValueType();
        java.lang.Class<?> wildcardClass9 = schema7.getClass();
        org.junit.Assert.assertNotNull(strMap1);
        org.junit.Assert.assertNotNull(strMap2);
        org.junit.Assert.assertNotNull(strMap4);
        org.junit.Assert.assertNotNull(parser5);
        org.junit.Assert.assertNotNull(schema7);
        org.junit.Assert.assertNotNull(schema8);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0359() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SchemaM3Random300Test0.test0359");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.avro.Schema schema4 = org.apache.avro.Schema.createRecord("{null={\"type\":\"fixed\",\"name\":\"union\",\"namespace\":\"[]\",\"doc\":\"[ ]\",\"size\":0}}", "union type:MAP pos:-1", "array", true);
            org.junit.Assert.fail("Expected exception of type org.apache.avro.SchemaParseException; message: Illegal initial character: {null={\"type\":\"fixed\",\"name\":\"union\",\"namespace\":\"[]\",\"doc\":\"[ ]\",\"size\":0}}");
        } catch (org.apache.avro.SchemaParseException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0360() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SchemaM3Random300Test0.test0360");
        org.apache.avro.Schema[] schemaArray0 = new org.apache.avro.Schema[] {};
        java.util.ArrayList<org.apache.avro.Schema> schemaList1 = new java.util.ArrayList<org.apache.avro.Schema>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<org.apache.avro.Schema>) schemaList1, schemaArray0);
        org.apache.avro.Schema schema3 = org.apache.avro.Schema.createUnion((java.util.List<org.apache.avro.Schema>) schemaList1);
        org.apache.avro.Schema[] schemaArray4 = new org.apache.avro.Schema[] {};
        java.util.ArrayList<org.apache.avro.Schema> schemaList5 = new java.util.ArrayList<org.apache.avro.Schema>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<org.apache.avro.Schema>) schemaList5, schemaArray4);
        org.apache.avro.Schema schema7 = org.apache.avro.Schema.createUnion((java.util.List<org.apache.avro.Schema>) schemaList5);
        org.apache.avro.Schema schema8 = org.apache.avro.Schema.applyAliases(schema3, schema7);
        java.util.List<org.apache.avro.Schema> schemaList9 = schema8.getTypes();
        org.apache.avro.Schema[] schemaArray10 = new org.apache.avro.Schema[] {};
        java.util.ArrayList<org.apache.avro.Schema> schemaList11 = new java.util.ArrayList<org.apache.avro.Schema>();
        boolean boolean12 = java.util.Collections.addAll((java.util.Collection<org.apache.avro.Schema>) schemaList11, schemaArray10);
        org.apache.avro.Schema schema13 = org.apache.avro.Schema.createUnion((java.util.List<org.apache.avro.Schema>) schemaList11);
        org.apache.avro.Schema[] schemaArray14 = new org.apache.avro.Schema[] {};
        java.util.ArrayList<org.apache.avro.Schema> schemaList15 = new java.util.ArrayList<org.apache.avro.Schema>();
        boolean boolean16 = java.util.Collections.addAll((java.util.Collection<org.apache.avro.Schema>) schemaList15, schemaArray14);
        org.apache.avro.Schema schema17 = org.apache.avro.Schema.createUnion((java.util.List<org.apache.avro.Schema>) schemaList15);
        org.apache.avro.Schema schema18 = org.apache.avro.Schema.applyAliases(schema13, schema17);
        org.apache.avro.Schema schema19 = org.apache.avro.Schema.applyAliases(schema8, schema17);
        java.util.List<org.apache.avro.Schema> schemaList20 = schema8.getTypes();
        java.lang.String str22 = schema8.toString(false);
        org.apache.avro.Schema schema23 = org.apache.avro.Schema.createArray(schema8);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.avro.Schema schema24 = schema8.getValueType();
            org.junit.Assert.fail("Expected exception of type org.apache.avro.AvroRuntimeException; message: Not a map: []");
        } catch (org.apache.avro.AvroRuntimeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(schemaArray0);
        org.junit.Assert.assertArrayEquals(schemaArray0, new org.apache.avro.Schema[] {});
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(schema3);
        org.junit.Assert.assertNotNull(schemaArray4);
        org.junit.Assert.assertArrayEquals(schemaArray4, new org.apache.avro.Schema[] {});
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(schema7);
        org.junit.Assert.assertNotNull(schema8);
        org.junit.Assert.assertNotNull(schemaList9);
        org.junit.Assert.assertNotNull(schemaArray10);
        org.junit.Assert.assertArrayEquals(schemaArray10, new org.apache.avro.Schema[] {});
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(schema13);
        org.junit.Assert.assertNotNull(schemaArray14);
        org.junit.Assert.assertArrayEquals(schemaArray14, new org.apache.avro.Schema[] {});
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(schema17);
        org.junit.Assert.assertNotNull(schema18);
        org.junit.Assert.assertNotNull(schema19);
        org.junit.Assert.assertNotNull(schemaList20);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "[]" + "'", str22, "[]");
        org.junit.Assert.assertNotNull(schema23);
    }

    @Test
    public void test0361() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SchemaM3Random300Test0.test0361");
        org.apache.avro.Schema.Parser parser0 = new org.apache.avro.Schema.Parser();
        java.util.Map<java.lang.String, org.apache.avro.Schema> strMap1 = parser0.getTypes();
        java.util.Map<java.lang.String, org.apache.avro.Schema> strMap2 = parser0.getTypes();
        boolean boolean3 = parser0.getValidate();
        org.apache.avro.Schema.Parser parser5 = parser0.setValidate(true);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.avro.Schema schema7 = parser0.parse("");
            org.junit.Assert.fail("Expected exception of type org.apache.avro.SchemaParseException; message: java.io.EOFException: No content to map to Object due to end of input");
        } catch (org.apache.avro.SchemaParseException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strMap1);
        org.junit.Assert.assertNotNull(strMap2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(parser5);
    }

    @Test
    public void test0362() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SchemaM3Random300Test0.test0362");
        org.apache.avro.Schema schema4 = org.apache.avro.Schema.createRecord("[].union", "union", "hi!", true);
        org.junit.Assert.assertNotNull(schema4);
    }

    @Test
    public void test0363() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SchemaM3Random300Test0.test0363");
        org.apache.avro.Schema[] schemaArray0 = new org.apache.avro.Schema[] {};
        java.util.ArrayList<org.apache.avro.Schema> schemaList1 = new java.util.ArrayList<org.apache.avro.Schema>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<org.apache.avro.Schema>) schemaList1, schemaArray0);
        org.apache.avro.Schema schema3 = org.apache.avro.Schema.createUnion((java.util.List<org.apache.avro.Schema>) schemaList1);
        org.apache.avro.Schema[] schemaArray4 = new org.apache.avro.Schema[] {};
        java.util.ArrayList<org.apache.avro.Schema> schemaList5 = new java.util.ArrayList<org.apache.avro.Schema>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<org.apache.avro.Schema>) schemaList5, schemaArray4);
        org.apache.avro.Schema schema7 = org.apache.avro.Schema.createUnion((java.util.List<org.apache.avro.Schema>) schemaList5);
        org.apache.avro.Schema schema8 = org.apache.avro.Schema.applyAliases(schema3, schema7);
        org.apache.avro.Schema.Type type9 = schema7.getType();
        org.apache.avro.Schema schema10 = org.apache.avro.Schema.createMap(schema7);
        org.apache.avro.Schema schema11 = org.apache.avro.Schema.createArray(schema10);
        org.apache.avro.Schema schema12 = org.apache.avro.Schema.createMap(schema11);
        java.lang.String str13 = schema11.getName();
        org.apache.avro.Schema schema14 = org.apache.avro.Schema.createMap(schema11);
        java.lang.String str16 = schema14.getProp("");
        org.junit.Assert.assertNotNull(schemaArray0);
        org.junit.Assert.assertArrayEquals(schemaArray0, new org.apache.avro.Schema[] {});
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(schema3);
        org.junit.Assert.assertNotNull(schemaArray4);
        org.junit.Assert.assertArrayEquals(schemaArray4, new org.apache.avro.Schema[] {});
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(schema7);
        org.junit.Assert.assertNotNull(schema8);
        org.junit.Assert.assertTrue("'" + type9 + "' != '" + org.apache.avro.Schema.Type.UNION + "'", type9.equals(org.apache.avro.Schema.Type.UNION));
        org.junit.Assert.assertNotNull(schema10);
        org.junit.Assert.assertNotNull(schema11);
        org.junit.Assert.assertNotNull(schema12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "array" + "'", str13, "array");
        org.junit.Assert.assertNotNull(schema14);
        org.junit.Assert.assertNull(str16);
    }

    @Test
    public void test0364() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SchemaM3Random300Test0.test0364");
        org.codehaus.jackson.JsonNode jsonNode1 = org.apache.avro.Schema.parseJson("{\r\n  \"type\" : \"fixed\",\r\n  \"name\" : \"union\",\r\n  \"namespace\" : \"[]\",\r\n  \"doc\" : \"[ ]\",\r\n  \"size\" : 0\r\n}");
        org.junit.Assert.assertNotNull(jsonNode1);
    }

    @Test
    public void test0365() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SchemaM3Random300Test0.test0365");
        java.lang.String[] strArray11 = new java.lang.String[] { "union", "union", "[]", "{null={\"type\":\"fixed\",\"name\":\"union\",\"namespace\":\"[]\",\"doc\":\"[ ]\",\"size\":0}}", "float", "double", "{}", "[ ]" };
        java.util.ArrayList<java.lang.String> strList12 = new java.util.ArrayList<java.lang.String>();
        boolean boolean13 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList12, strArray11);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.avro.Schema schema14 = org.apache.avro.Schema.createEnum("union type:MAP pos:-1", "hi!", "{null={\"type\":\"fixed\",\"name\":\"union\",\"namespace\":\"[]\",\"doc\":\"[ ]\",\"size\":0}}", (java.util.List<java.lang.String>) strList12);
            org.junit.Assert.fail("Expected exception of type org.apache.avro.SchemaParseException; message: Illegal character in: union type:MAP pos:-1");
        } catch (org.apache.avro.SchemaParseException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray11);
        org.junit.Assert.assertArrayEquals(strArray11, new java.lang.String[] { "union", "union", "[]", "{null={\"type\":\"fixed\",\"name\":\"union\",\"namespace\":\"[]\",\"doc\":\"[ ]\",\"size\":0}}", "float", "double", "{}", "[ ]" });
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
    }

    @Test
    public void test0366() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SchemaM3Random300Test0.test0366");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.avro.Schema schema1 = org.apache.avro.Schema.parse("double");
            org.junit.Assert.fail("Expected exception of type org.apache.avro.SchemaParseException; message: org.codehaus.jackson.JsonParseException: Unexpected character ('d' (code 100)): expected a valid value (number, String, array, object, 'true', 'false' or 'null')? at [Source: java.io.StringReader@7776e482; line: 1, column: 2]");
        } catch (org.apache.avro.SchemaParseException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0367() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SchemaM3Random300Test0.test0367");
        org.apache.avro.Schema.Parser parser0 = new org.apache.avro.Schema.Parser();
        java.util.Map<java.lang.String, org.apache.avro.Schema> strMap1 = parser0.getTypes();
        org.apache.avro.Schema.Parser parser2 = new org.apache.avro.Schema.Parser();
        org.apache.avro.Schema.Parser parser4 = parser2.setValidate(true);
        java.util.Map<java.lang.String, org.apache.avro.Schema> strMap5 = parser2.getTypes();
        org.apache.avro.Schema.Parser parser6 = parser0.addTypes(strMap5);
        boolean boolean7 = parser0.getValidate();
        java.io.File file8 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.avro.Schema schema9 = parser0.parse(file8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strMap1);
        org.junit.Assert.assertNotNull(parser4);
        org.junit.Assert.assertNotNull(strMap5);
        org.junit.Assert.assertNotNull(parser6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test0368() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SchemaM3Random300Test0.test0368");
        org.codehaus.jackson.map.ObjectMapper objectMapper0 = org.apache.avro.Schema.MAPPER;
        org.codehaus.jackson.map.ObjectMapper[] objectMapperArray1 = new org.codehaus.jackson.map.ObjectMapper[] { objectMapper0 };
        java.util.ArrayList<org.codehaus.jackson.map.ObjectMapper> objectMapperList2 = new java.util.ArrayList<org.codehaus.jackson.map.ObjectMapper>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<org.codehaus.jackson.map.ObjectMapper>) objectMapperList2, objectMapperArray1);
        org.apache.avro.Schema.LockableArrayList<org.codehaus.jackson.map.ObjectMapper> objectMapperList4 = new org.apache.avro.Schema.LockableArrayList<org.codehaus.jackson.map.ObjectMapper>((java.util.List<org.codehaus.jackson.map.ObjectMapper>) objectMapperList2);
        org.junit.Assert.assertNotNull(objectMapper0);
        org.junit.Assert.assertNotNull(objectMapperArray1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
    }

    @Test
    public void test0369() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SchemaM3Random300Test0.test0369");
        org.apache.avro.Schema.Type type0 = org.apache.avro.Schema.Type.FLOAT;
        org.apache.avro.Schema schema1 = org.apache.avro.Schema.create(type0);
        org.apache.avro.Schema schema2 = org.apache.avro.Schema.create(type0);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.avro.Schema schema3 = schema2.getValueType();
            org.junit.Assert.fail("Expected exception of type org.apache.avro.AvroRuntimeException; message: Not a map: \"float\"");
        } catch (org.apache.avro.AvroRuntimeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + type0 + "' != '" + org.apache.avro.Schema.Type.FLOAT + "'", type0.equals(org.apache.avro.Schema.Type.FLOAT));
        org.junit.Assert.assertNotNull(schema1);
        org.junit.Assert.assertNotNull(schema2);
    }

    @Test
    public void test0370() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SchemaM3Random300Test0.test0370");
        org.apache.avro.Schema.Parser parser0 = new org.apache.avro.Schema.Parser();
        java.util.Map<java.lang.String, org.apache.avro.Schema> strMap1 = parser0.getTypes();
        java.util.Map<java.lang.String, org.apache.avro.Schema> strMap2 = parser0.getTypes();
        org.apache.avro.Schema.Parser parser3 = new org.apache.avro.Schema.Parser();
        org.apache.avro.Schema.Parser parser5 = parser3.setValidate(true);
        java.util.Map<java.lang.String, org.apache.avro.Schema> strMap6 = parser3.getTypes();
        org.apache.avro.Schema.Parser parser7 = parser0.addTypes(strMap6);
        org.apache.avro.Schema.Parser parser9 = parser7.setValidate(false);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.avro.Schema schema11 = parser7.parse("");
            org.junit.Assert.fail("Expected exception of type org.apache.avro.SchemaParseException; message: java.io.EOFException: No content to map to Object due to end of input");
        } catch (org.apache.avro.SchemaParseException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strMap1);
        org.junit.Assert.assertNotNull(strMap2);
        org.junit.Assert.assertNotNull(parser5);
        org.junit.Assert.assertNotNull(strMap6);
        org.junit.Assert.assertNotNull(parser7);
        org.junit.Assert.assertNotNull(parser9);
    }

    @Test
    public void test0371() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SchemaM3Random300Test0.test0371");
        org.apache.avro.Schema.Names names0 = new org.apache.avro.Schema.Names();
        names0.space("[ ]");
        java.lang.Object obj3 = names0.clone();
        org.apache.avro.Schema.Type type4 = org.apache.avro.Schema.Type.RECORD;
        boolean boolean5 = names0.containsKey((java.lang.Object) type4);
        org.apache.avro.Schema[] schemaArray6 = new org.apache.avro.Schema[] {};
        java.util.ArrayList<org.apache.avro.Schema> schemaList7 = new java.util.ArrayList<org.apache.avro.Schema>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<org.apache.avro.Schema>) schemaList7, schemaArray6);
        org.apache.avro.Schema schema9 = org.apache.avro.Schema.createUnion((java.util.List<org.apache.avro.Schema>) schemaList7);
        org.apache.avro.Schema[] schemaArray10 = new org.apache.avro.Schema[] {};
        java.util.ArrayList<org.apache.avro.Schema> schemaList11 = new java.util.ArrayList<org.apache.avro.Schema>();
        boolean boolean12 = java.util.Collections.addAll((java.util.Collection<org.apache.avro.Schema>) schemaList11, schemaArray10);
        org.apache.avro.Schema schema13 = org.apache.avro.Schema.createUnion((java.util.List<org.apache.avro.Schema>) schemaList11);
        org.apache.avro.Schema schema14 = org.apache.avro.Schema.applyAliases(schema9, schema13);
        org.apache.avro.Schema.Type type15 = schema13.getType();
        org.apache.avro.Schema schema16 = org.apache.avro.Schema.createMap(schema13);
        org.apache.avro.Schema.Names names17 = new org.apache.avro.Schema.Names();
        java.lang.String str18 = names17.space();
        names17.space("");
        boolean boolean21 = schema13.equals((java.lang.Object) "");
        java.lang.String str22 = schema13.getFullName();
        boolean boolean23 = names0.containsKey((java.lang.Object) schema13);
        // The following exception was thrown during execution in test generation
        try {
            schema13.addAlias("[ ]");
            org.junit.Assert.fail("Expected exception of type org.apache.avro.AvroRuntimeException; message: Not a named type: []");
        } catch (org.apache.avro.AvroRuntimeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(obj3);
        org.junit.Assert.assertEquals(obj3.toString(), "{}");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj3), "{}");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj3), "{}");
        org.junit.Assert.assertTrue("'" + type4 + "' != '" + org.apache.avro.Schema.Type.RECORD + "'", type4.equals(org.apache.avro.Schema.Type.RECORD));
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(schemaArray6);
        org.junit.Assert.assertArrayEquals(schemaArray6, new org.apache.avro.Schema[] {});
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(schema9);
        org.junit.Assert.assertNotNull(schemaArray10);
        org.junit.Assert.assertArrayEquals(schemaArray10, new org.apache.avro.Schema[] {});
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(schema13);
        org.junit.Assert.assertNotNull(schema14);
        org.junit.Assert.assertTrue("'" + type15 + "' != '" + org.apache.avro.Schema.Type.UNION + "'", type15.equals(org.apache.avro.Schema.Type.UNION));
        org.junit.Assert.assertNotNull(schema16);
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "union" + "'", str22, "union");
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
    }

    @Test
    public void test0372() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SchemaM3Random300Test0.test0372");
        org.apache.avro.Schema.Parser parser0 = new org.apache.avro.Schema.Parser();
        java.util.Map<java.lang.String, org.apache.avro.Schema> strMap1 = parser0.getTypes();
        org.apache.avro.Schema.Parser parser2 = new org.apache.avro.Schema.Parser();
        org.apache.avro.Schema.Parser parser4 = parser2.setValidate(true);
        java.util.Map<java.lang.String, org.apache.avro.Schema> strMap5 = parser2.getTypes();
        org.apache.avro.Schema.Parser parser6 = parser0.addTypes(strMap5);
        boolean boolean7 = parser0.getValidate();
        boolean boolean8 = parser0.getValidate();
        org.apache.avro.Schema.Parser parser9 = new org.apache.avro.Schema.Parser();
        java.util.Map<java.lang.String, org.apache.avro.Schema> strMap10 = parser9.getTypes();
        java.util.Map<java.lang.String, org.apache.avro.Schema> strMap11 = parser9.getTypes();
        org.apache.avro.Schema.Parser parser12 = new org.apache.avro.Schema.Parser();
        java.util.Map<java.lang.String, org.apache.avro.Schema> strMap13 = parser12.getTypes();
        org.apache.avro.Schema.Parser parser14 = parser9.addTypes(strMap13);
        org.apache.avro.Schema.Parser parser15 = parser0.addTypes(strMap13);
        org.apache.avro.Schema.Parser parser17 = parser0.setValidate(true);
        java.io.File file18 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.avro.Schema schema19 = parser0.parse(file18);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strMap1);
        org.junit.Assert.assertNotNull(parser4);
        org.junit.Assert.assertNotNull(strMap5);
        org.junit.Assert.assertNotNull(parser6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(strMap10);
        org.junit.Assert.assertNotNull(strMap11);
        org.junit.Assert.assertNotNull(strMap13);
        org.junit.Assert.assertNotNull(parser14);
        org.junit.Assert.assertNotNull(parser15);
        org.junit.Assert.assertNotNull(parser17);
    }

    @Test
    public void test0373() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SchemaM3Random300Test0.test0373");
        org.apache.avro.Schema.LockableArrayList<java.lang.String> strList4 = new org.apache.avro.Schema.LockableArrayList<java.lang.String>((int) (byte) 10);
        org.apache.avro.Schema schema5 = org.apache.avro.Schema.createEnum("[].union", "union type:UNION pos:-1", "union type:UNION pos:-1", (java.util.List<java.lang.String>) strList4);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.avro.Schema.Field field7 = schema5.getField("array");
            org.junit.Assert.fail("Expected exception of type org.apache.avro.AvroRuntimeException; message: Not a record: {\"type\":\"enum\",\"name\":\"union\",\"namespace\":\"[]\",\"doc\":\"union type:UNION pos:-1\",\"symbols\":[]}");
        } catch (org.apache.avro.AvroRuntimeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(schema5);
    }

    @Test
    public void test0374() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SchemaM3Random300Test0.test0374");
        org.apache.avro.Schema[] schemaArray0 = new org.apache.avro.Schema[] {};
        java.util.ArrayList<org.apache.avro.Schema> schemaList1 = new java.util.ArrayList<org.apache.avro.Schema>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<org.apache.avro.Schema>) schemaList1, schemaArray0);
        org.apache.avro.Schema schema3 = org.apache.avro.Schema.createUnion((java.util.List<org.apache.avro.Schema>) schemaList1);
        org.apache.avro.Schema[] schemaArray4 = new org.apache.avro.Schema[] {};
        java.util.ArrayList<org.apache.avro.Schema> schemaList5 = new java.util.ArrayList<org.apache.avro.Schema>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<org.apache.avro.Schema>) schemaList5, schemaArray4);
        org.apache.avro.Schema schema7 = org.apache.avro.Schema.createUnion((java.util.List<org.apache.avro.Schema>) schemaList5);
        org.apache.avro.Schema schema8 = org.apache.avro.Schema.applyAliases(schema3, schema7);
        org.apache.avro.Schema.Type type9 = schema7.getType();
        org.apache.avro.Schema.Type type10 = schema7.getType();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.avro.Schema schema11 = org.apache.avro.Schema.create(type10);
            org.junit.Assert.fail("Expected exception of type org.apache.avro.AvroRuntimeException; message: Can't create a: UNION");
        } catch (org.apache.avro.AvroRuntimeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(schemaArray0);
        org.junit.Assert.assertArrayEquals(schemaArray0, new org.apache.avro.Schema[] {});
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(schema3);
        org.junit.Assert.assertNotNull(schemaArray4);
        org.junit.Assert.assertArrayEquals(schemaArray4, new org.apache.avro.Schema[] {});
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(schema7);
        org.junit.Assert.assertNotNull(schema8);
        org.junit.Assert.assertTrue("'" + type9 + "' != '" + org.apache.avro.Schema.Type.UNION + "'", type9.equals(org.apache.avro.Schema.Type.UNION));
        org.junit.Assert.assertTrue("'" + type10 + "' != '" + org.apache.avro.Schema.Type.UNION + "'", type10.equals(org.apache.avro.Schema.Type.UNION));
    }

    @Test
    public void test0375() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SchemaM3Random300Test0.test0375");
        org.apache.avro.Schema.Parser parser0 = new org.apache.avro.Schema.Parser();
        java.util.Map<java.lang.String, org.apache.avro.Schema> strMap1 = parser0.getTypes();
        java.util.Map<java.lang.String, org.apache.avro.Schema> strMap2 = parser0.getTypes();
        org.apache.avro.Schema.Parser parser3 = new org.apache.avro.Schema.Parser();
        java.util.Map<java.lang.String, org.apache.avro.Schema> strMap4 = parser3.getTypes();
        org.apache.avro.Schema.Parser parser5 = parser0.addTypes(strMap4);
        org.apache.avro.Schema.Parser parser7 = parser0.setValidate(true);
        org.apache.avro.Schema.Parser parser9 = parser0.setValidate(false);
        org.apache.avro.Schema.Parser parser10 = new org.apache.avro.Schema.Parser();
        java.util.Map<java.lang.String, org.apache.avro.Schema> strMap11 = parser10.getTypes();
        java.util.Map<java.lang.String, org.apache.avro.Schema> strMap12 = parser10.getTypes();
        org.apache.avro.Schema.Parser parser13 = new org.apache.avro.Schema.Parser();
        java.util.Map<java.lang.String, org.apache.avro.Schema> strMap14 = parser13.getTypes();
        org.apache.avro.Schema.Parser parser15 = parser10.addTypes(strMap14);
        org.apache.avro.Schema.Parser parser16 = parser9.addTypes(strMap14);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.avro.Schema schema18 = parser16.parse("union type:MAP pos:-1");
            org.junit.Assert.fail("Expected exception of type org.apache.avro.SchemaParseException; message: org.codehaus.jackson.JsonParseException: Unexpected character ('u' (code 117)): expected a valid value (number, String, array, object, 'true', 'false' or 'null')? at [Source: java.io.StringReader@437829b6; line: 1, column: 2]");
        } catch (org.apache.avro.SchemaParseException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strMap1);
        org.junit.Assert.assertNotNull(strMap2);
        org.junit.Assert.assertNotNull(strMap4);
        org.junit.Assert.assertNotNull(parser5);
        org.junit.Assert.assertNotNull(parser7);
        org.junit.Assert.assertNotNull(parser9);
        org.junit.Assert.assertNotNull(strMap11);
        org.junit.Assert.assertNotNull(strMap12);
        org.junit.Assert.assertNotNull(strMap14);
        org.junit.Assert.assertNotNull(parser15);
        org.junit.Assert.assertNotNull(parser16);
    }

    @Test
    public void test0376() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SchemaM3Random300Test0.test0376");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.avro.Schema schema4 = org.apache.avro.Schema.createFixed("{\"type\":\"array\",\"items\":[]}", "double", "hi!", (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type org.apache.avro.SchemaParseException; message: Illegal initial character: {\"type\":\"array\",\"items\":[]}");
        } catch (org.apache.avro.SchemaParseException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0377() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SchemaM3Random300Test0.test0377");
        java.lang.String[] strArray21 = new java.lang.String[] { "{\"type\":\"array\",\"items\":{\"type\":\"map\",\"values\":[]}}", "double", "{\"type\":\"record\",\"fields\":[]}", "{\"type\":\"record\",\"fields\":[]}", "", "array", "{\r\n  \"type\" : \"map\",\r\n  \"values\" : [ ]\r\n}", "[]", "hi!", "{\r\n  \"type\" : \"map\",\r\n  \"values\" : {\r\n    \"type\" : \"map\",\r\n    \"values\" : [ ]\r\n  }\r\n}", "{\"type\":\"array\",\"items\":[]}", "{\r\n  \"type\" : \"array\",\r\n  \"items\" : {\r\n    \"type\" : \"map\",\r\n    \"values\" : [ ]\r\n  }\r\n}", "{\"type\":\"array\",\"items\":[]}", "{\r\n  \"type\" : \"record\",\r\n  \"fields\" : [ ]\r\n}", "{\r\n  \"type\" : \"array\",\r\n  \"items\" : {\r\n    \"type\" : \"map\",\r\n    \"values\" : [ ]\r\n  }\r\n}", "{\r\n  \"type\" : \"fixed\",\r\n  \"name\" : \"union\",\r\n  \"namespace\" : \"[]\",\r\n  \"doc\" : \"[ ]\",\r\n  \"size\" : 0\r\n}", "{null={\"type\":\"fixed\",\"name\":\"union\",\"namespace\":\"[]\",\"doc\":\"[ ]\",\"size\":0}}", "[].union" };
        java.util.ArrayList<java.lang.String> strList22 = new java.util.ArrayList<java.lang.String>();
        boolean boolean23 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList22, strArray21);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.avro.Schema schema24 = org.apache.avro.Schema.createEnum("{\"type\":\"map\",\"values\":[]}", "{\r\n  \"type\" : \"record\",\r\n  \"fields\" : [ ]\r\n}", "{\"type\":\"map\",\"values\":[]}", (java.util.List<java.lang.String>) strList22);
            org.junit.Assert.fail("Expected exception of type org.apache.avro.SchemaParseException; message: Illegal initial character: {\"type\":\"map\",\"values\":[]}");
        } catch (org.apache.avro.SchemaParseException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray21);
        org.junit.Assert.assertArrayEquals(strArray21, new java.lang.String[] { "{\"type\":\"array\",\"items\":{\"type\":\"map\",\"values\":[]}}", "double", "{\"type\":\"record\",\"fields\":[]}", "{\"type\":\"record\",\"fields\":[]}", "", "array", "{\r\n  \"type\" : \"map\",\r\n  \"values\" : [ ]\r\n}", "[]", "hi!", "{\r\n  \"type\" : \"map\",\r\n  \"values\" : {\r\n    \"type\" : \"map\",\r\n    \"values\" : [ ]\r\n  }\r\n}", "{\"type\":\"array\",\"items\":[]}", "{\r\n  \"type\" : \"array\",\r\n  \"items\" : {\r\n    \"type\" : \"map\",\r\n    \"values\" : [ ]\r\n  }\r\n}", "{\"type\":\"array\",\"items\":[]}", "{\r\n  \"type\" : \"record\",\r\n  \"fields\" : [ ]\r\n}", "{\r\n  \"type\" : \"array\",\r\n  \"items\" : {\r\n    \"type\" : \"map\",\r\n    \"values\" : [ ]\r\n  }\r\n}", "{\r\n  \"type\" : \"fixed\",\r\n  \"name\" : \"union\",\r\n  \"namespace\" : \"[]\",\r\n  \"doc\" : \"[ ]\",\r\n  \"size\" : 0\r\n}", "{null={\"type\":\"fixed\",\"name\":\"union\",\"namespace\":\"[]\",\"doc\":\"[ ]\",\"size\":0}}", "[].union" });
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
    }

    @Test
    public void test0378() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SchemaM3Random300Test0.test0378");
        org.apache.avro.Schema schema4 = org.apache.avro.Schema.createRecord("double", "{\r\n  \"type\" : \"map\",\r\n  \"values\" : {\r\n    \"type\" : \"map\",\r\n    \"values\" : [ ]\r\n  }\r\n}", "", true);
        org.junit.Assert.assertNotNull(schema4);
    }

    @Test
    public void test0379() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SchemaM3Random300Test0.test0379");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.avro.Schema schema4 = org.apache.avro.Schema.createFixed("{\r\n  \"type\" : \"fixed\",\r\n  \"name\" : \"union\",\r\n  \"namespace\" : \"[]\",\r\n  \"doc\" : \"[ ]\",\r\n  \"size\" : 0\r\n}", "map", "float", 100);
            org.junit.Assert.fail("Expected exception of type org.apache.avro.SchemaParseException; message: Illegal initial character: {??  \"type\" : \"fixed\",??  \"name\" : \"union\",??  \"namespace\" : \"[]\",??  \"doc\" : \"[ ]\",??  \"size\" : 0??}");
        } catch (org.apache.avro.SchemaParseException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0380() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SchemaM3Random300Test0.test0380");
        org.apache.avro.Schema[] schemaArray0 = new org.apache.avro.Schema[] {};
        java.util.ArrayList<org.apache.avro.Schema> schemaList1 = new java.util.ArrayList<org.apache.avro.Schema>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<org.apache.avro.Schema>) schemaList1, schemaArray0);
        org.apache.avro.Schema schema3 = org.apache.avro.Schema.createUnion((java.util.List<org.apache.avro.Schema>) schemaList1);
        org.apache.avro.Schema[] schemaArray4 = new org.apache.avro.Schema[] {};
        java.util.ArrayList<org.apache.avro.Schema> schemaList5 = new java.util.ArrayList<org.apache.avro.Schema>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<org.apache.avro.Schema>) schemaList5, schemaArray4);
        org.apache.avro.Schema schema7 = org.apache.avro.Schema.createUnion((java.util.List<org.apache.avro.Schema>) schemaList5);
        org.apache.avro.Schema schema8 = org.apache.avro.Schema.applyAliases(schema3, schema7);
        java.util.List<org.apache.avro.Schema> schemaList9 = schema8.getTypes();
        org.apache.avro.Schema[] schemaArray10 = new org.apache.avro.Schema[] {};
        java.util.ArrayList<org.apache.avro.Schema> schemaList11 = new java.util.ArrayList<org.apache.avro.Schema>();
        boolean boolean12 = java.util.Collections.addAll((java.util.Collection<org.apache.avro.Schema>) schemaList11, schemaArray10);
        org.apache.avro.Schema schema13 = org.apache.avro.Schema.createUnion((java.util.List<org.apache.avro.Schema>) schemaList11);
        org.apache.avro.Schema[] schemaArray14 = new org.apache.avro.Schema[] {};
        java.util.ArrayList<org.apache.avro.Schema> schemaList15 = new java.util.ArrayList<org.apache.avro.Schema>();
        boolean boolean16 = java.util.Collections.addAll((java.util.Collection<org.apache.avro.Schema>) schemaList15, schemaArray14);
        org.apache.avro.Schema schema17 = org.apache.avro.Schema.createUnion((java.util.List<org.apache.avro.Schema>) schemaList15);
        org.apache.avro.Schema schema18 = org.apache.avro.Schema.applyAliases(schema13, schema17);
        org.apache.avro.Schema schema19 = org.apache.avro.Schema.applyAliases(schema8, schema17);
        org.apache.avro.Schema schema20 = org.apache.avro.Schema.createMap(schema8);
        org.apache.avro.Schema schema21 = org.apache.avro.Schema.createArray(schema20);
        java.lang.String str22 = schema20.toString();
        java.lang.String str24 = schema20.getProp("{\"type\":\"map\",\"values\":[]}");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Set<java.lang.String> strSet25 = schema20.getAliases();
            org.junit.Assert.fail("Expected exception of type org.apache.avro.AvroRuntimeException; message: Not a named type: {\"type\":\"map\",\"values\":[]}");
        } catch (org.apache.avro.AvroRuntimeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(schemaArray0);
        org.junit.Assert.assertArrayEquals(schemaArray0, new org.apache.avro.Schema[] {});
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(schema3);
        org.junit.Assert.assertNotNull(schemaArray4);
        org.junit.Assert.assertArrayEquals(schemaArray4, new org.apache.avro.Schema[] {});
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(schema7);
        org.junit.Assert.assertNotNull(schema8);
        org.junit.Assert.assertNotNull(schemaList9);
        org.junit.Assert.assertNotNull(schemaArray10);
        org.junit.Assert.assertArrayEquals(schemaArray10, new org.apache.avro.Schema[] {});
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(schema13);
        org.junit.Assert.assertNotNull(schemaArray14);
        org.junit.Assert.assertArrayEquals(schemaArray14, new org.apache.avro.Schema[] {});
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(schema17);
        org.junit.Assert.assertNotNull(schema18);
        org.junit.Assert.assertNotNull(schema19);
        org.junit.Assert.assertNotNull(schema20);
        org.junit.Assert.assertNotNull(schema21);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "{\"type\":\"map\",\"values\":[]}" + "'", str22, "{\"type\":\"map\",\"values\":[]}");
        org.junit.Assert.assertNull(str24);
    }

    @Test
    public void test0381() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SchemaM3Random300Test0.test0381");
        org.apache.avro.Schema.Type type0 = org.apache.avro.Schema.Type.DOUBLE;
        org.apache.avro.Schema schema1 = org.apache.avro.Schema.create(type0);
        org.apache.avro.Schema schema2 = org.apache.avro.Schema.createMap(schema1);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.avro.Schema.Field field4 = schema2.getField("{\r\n  \"type\" : \"array\",\r\n  \"items\" : {\r\n    \"type\" : \"map\",\r\n    \"values\" : [ ]\r\n  }\r\n}");
            org.junit.Assert.fail("Expected exception of type org.apache.avro.AvroRuntimeException; message: Not a record: {\"type\":\"map\",\"values\":\"double\"}");
        } catch (org.apache.avro.AvroRuntimeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + type0 + "' != '" + org.apache.avro.Schema.Type.DOUBLE + "'", type0.equals(org.apache.avro.Schema.Type.DOUBLE));
        org.junit.Assert.assertNotNull(schema1);
        org.junit.Assert.assertNotNull(schema2);
    }

    @Test
    public void test0382() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SchemaM3Random300Test0.test0382");
        org.apache.avro.Schema[] schemaArray0 = new org.apache.avro.Schema[] {};
        java.util.ArrayList<org.apache.avro.Schema> schemaList1 = new java.util.ArrayList<org.apache.avro.Schema>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<org.apache.avro.Schema>) schemaList1, schemaArray0);
        org.apache.avro.Schema schema3 = org.apache.avro.Schema.createUnion((java.util.List<org.apache.avro.Schema>) schemaList1);
        org.apache.avro.Schema[] schemaArray4 = new org.apache.avro.Schema[] {};
        java.util.ArrayList<org.apache.avro.Schema> schemaList5 = new java.util.ArrayList<org.apache.avro.Schema>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<org.apache.avro.Schema>) schemaList5, schemaArray4);
        org.apache.avro.Schema schema7 = org.apache.avro.Schema.createUnion((java.util.List<org.apache.avro.Schema>) schemaList5);
        org.apache.avro.Schema schema8 = org.apache.avro.Schema.applyAliases(schema3, schema7);
        java.util.List<org.apache.avro.Schema> schemaList9 = schema8.getTypes();
        org.apache.avro.Schema[] schemaArray10 = new org.apache.avro.Schema[] {};
        java.util.ArrayList<org.apache.avro.Schema> schemaList11 = new java.util.ArrayList<org.apache.avro.Schema>();
        boolean boolean12 = java.util.Collections.addAll((java.util.Collection<org.apache.avro.Schema>) schemaList11, schemaArray10);
        org.apache.avro.Schema schema13 = org.apache.avro.Schema.createUnion((java.util.List<org.apache.avro.Schema>) schemaList11);
        org.apache.avro.Schema[] schemaArray14 = new org.apache.avro.Schema[] {};
        java.util.ArrayList<org.apache.avro.Schema> schemaList15 = new java.util.ArrayList<org.apache.avro.Schema>();
        boolean boolean16 = java.util.Collections.addAll((java.util.Collection<org.apache.avro.Schema>) schemaList15, schemaArray14);
        org.apache.avro.Schema schema17 = org.apache.avro.Schema.createUnion((java.util.List<org.apache.avro.Schema>) schemaList15);
        org.apache.avro.Schema schema18 = org.apache.avro.Schema.applyAliases(schema13, schema17);
        org.apache.avro.Schema schema19 = org.apache.avro.Schema.applyAliases(schema8, schema17);
        // The following exception was thrown during execution in test generation
        try {
            schema19.addProp("{}", "");
            org.junit.Assert.fail("Expected exception of type org.apache.avro.AvroRuntimeException; message: Can't set properties on a union: []");
        } catch (org.apache.avro.AvroRuntimeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(schemaArray0);
        org.junit.Assert.assertArrayEquals(schemaArray0, new org.apache.avro.Schema[] {});
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(schema3);
        org.junit.Assert.assertNotNull(schemaArray4);
        org.junit.Assert.assertArrayEquals(schemaArray4, new org.apache.avro.Schema[] {});
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(schema7);
        org.junit.Assert.assertNotNull(schema8);
        org.junit.Assert.assertNotNull(schemaList9);
        org.junit.Assert.assertNotNull(schemaArray10);
        org.junit.Assert.assertArrayEquals(schemaArray10, new org.apache.avro.Schema[] {});
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(schema13);
        org.junit.Assert.assertNotNull(schemaArray14);
        org.junit.Assert.assertArrayEquals(schemaArray14, new org.apache.avro.Schema[] {});
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(schema17);
        org.junit.Assert.assertNotNull(schema18);
        org.junit.Assert.assertNotNull(schema19);
    }

    @Test
    public void test0383() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SchemaM3Random300Test0.test0383");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.avro.Schema schema2 = org.apache.avro.Schema.parse("{\r\n  \"type\" : \"record\",\r\n  \"fields\" : [ ]\r\n}", true);
            org.junit.Assert.fail("Expected exception of type org.apache.avro.SchemaParseException; message: No name in schema: {\"type\":\"record\",\"fields\":[]}");
        } catch (org.apache.avro.SchemaParseException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0384() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SchemaM3Random300Test0.test0384");
        org.apache.avro.Schema.LockableArrayList<java.lang.String> strList4 = new org.apache.avro.Schema.LockableArrayList<java.lang.String>((int) (short) 0);
        org.apache.avro.Schema.LockableArrayList<java.lang.String> strList5 = new org.apache.avro.Schema.LockableArrayList<java.lang.String>((java.util.List<java.lang.String>) strList4);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.avro.Schema schema6 = org.apache.avro.Schema.createEnum("{\r\n  \"type\" : \"array\",\r\n  \"items\" : {\r\n    \"type\" : \"map\",\r\n    \"values\" : [ ]\r\n  }\r\n}", "[ ]", "{\r\n  \"type\" : \"map\",\r\n  \"values\" : {\r\n    \"type\" : \"map\",\r\n    \"values\" : [ ]\r\n  }\r\n}", (java.util.List<java.lang.String>) strList5);
            org.junit.Assert.fail("Expected exception of type org.apache.avro.SchemaParseException; message: Illegal initial character: {??  \"type\" : \"array\",??  \"items\" : {??    \"type\" : \"map\",??    \"values\" : [ ]??  }??}");
        } catch (org.apache.avro.SchemaParseException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0385() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SchemaM3Random300Test0.test0385");
        org.apache.avro.Schema.Parser parser0 = new org.apache.avro.Schema.Parser();
        java.io.InputStream inputStream1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.avro.Schema schema2 = parser0.parse(inputStream1);
            org.junit.Assert.fail("Expected exception of type java.io.EOFException; message: No content to map to Object due to end of input");
        } catch (java.io.EOFException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0386() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SchemaM3Random300Test0.test0386");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.avro.Schema schema4 = org.apache.avro.Schema.createFixed("{\"type\":\"map\",\"values\":{\"type\":\"array\",\"items\":{\"type\":\"map\",\"values\":[]}}}", "{\"type\":\"array\",\"items\":{\"type\":\"map\",\"values\":[]}}", "array", 0);
            org.junit.Assert.fail("Expected exception of type org.apache.avro.SchemaParseException; message: Illegal initial character: {\"type\":\"map\",\"values\":{\"type\":\"array\",\"items\":{\"type\":\"map\",\"values\":[]}}}");
        } catch (org.apache.avro.SchemaParseException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0387() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SchemaM3Random300Test0.test0387");
        org.apache.avro.Schema.Type type0 = org.apache.avro.Schema.Type.NULL;
        org.apache.avro.Schema schema1 = org.apache.avro.Schema.create(type0);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.avro.Schema.Field field3 = schema1.getField("union type:UNION pos:-1");
            org.junit.Assert.fail("Expected exception of type org.apache.avro.AvroRuntimeException; message: Not a record: \"null\"");
        } catch (org.apache.avro.AvroRuntimeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + type0 + "' != '" + org.apache.avro.Schema.Type.NULL + "'", type0.equals(org.apache.avro.Schema.Type.NULL));
        org.junit.Assert.assertNotNull(schema1);
    }

    @Test
    public void test0388() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SchemaM3Random300Test0.test0388");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.avro.Schema schema4 = org.apache.avro.Schema.createRecord("union type:MAP pos:-1", "{}", "", false);
            org.junit.Assert.fail("Expected exception of type org.apache.avro.SchemaParseException; message: Illegal character in: union type:MAP pos:-1");
        } catch (org.apache.avro.SchemaParseException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0389() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SchemaM3Random300Test0.test0389");
        org.apache.avro.Schema.LockableArrayList<java.lang.String> strList3 = new org.apache.avro.Schema.LockableArrayList<java.lang.String>();
        org.apache.avro.Schema.LockableArrayList<java.lang.String> strList4 = new org.apache.avro.Schema.LockableArrayList<java.lang.String>((java.util.List<java.lang.String>) strList3);
        org.apache.avro.Schema schema5 = org.apache.avro.Schema.createEnum("[].union", "{}", "[].union", (java.util.List<java.lang.String>) strList4);
        org.apache.avro.Schema schema6 = org.apache.avro.Schema.createMap(schema5);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.avro.Schema schema7 = schema5.getValueType();
            org.junit.Assert.fail("Expected exception of type org.apache.avro.AvroRuntimeException; message: Not a map: {\"type\":\"enum\",\"name\":\"union\",\"namespace\":\"[]\",\"doc\":\"{}\",\"symbols\":[]}");
        } catch (org.apache.avro.AvroRuntimeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(schema5);
        org.junit.Assert.assertNotNull(schema6);
    }

    @Test
    public void test0390() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SchemaM3Random300Test0.test0390");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.avro.Schema schema4 = org.apache.avro.Schema.createFixed("{\"type\":\"fixed\",\"name\":\"union\",\"namespace\":\"[]\",\"doc\":\"[ ]\",\"size\":0}", "{\"type\":\"fixed\",\"name\":\"union\",\"namespace\":\"[]\",\"doc\":\"[ ]\",\"size\":0}", "array", (int) 'a');
            org.junit.Assert.fail("Expected exception of type org.apache.avro.SchemaParseException; message: Illegal initial character: {\"type\":\"fixed\",\"name\":\"union\",\"namespace\":\"[]\",\"doc\":\"[ ]\",\"size\":0}");
        } catch (org.apache.avro.SchemaParseException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0391() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SchemaM3Random300Test0.test0391");
        org.apache.avro.Schema schema1 = null;
        org.codehaus.jackson.JsonNode jsonNode4 = org.apache.avro.Schema.parseJson("[]");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.avro.Schema.Field field5 = new org.apache.avro.Schema.Field("[].union", schema1, "", jsonNode4);
            org.junit.Assert.fail("Expected exception of type org.apache.avro.SchemaParseException; message: Illegal initial character: [].union");
        } catch (org.apache.avro.SchemaParseException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(jsonNode4);
    }

    @Test
    public void test0392() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SchemaM3Random300Test0.test0392");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.avro.Schema schema4 = org.apache.avro.Schema.createRecord("{\"type\":\"map\",\"values\":{\"type\":\"array\",\"items\":{\"type\":\"map\",\"values\":[]}}}", "", "[]", false);
            org.junit.Assert.fail("Expected exception of type org.apache.avro.SchemaParseException; message: Illegal initial character: {\"type\":\"map\",\"values\":{\"type\":\"array\",\"items\":{\"type\":\"map\",\"values\":[]}}}");
        } catch (org.apache.avro.SchemaParseException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0393() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SchemaM3Random300Test0.test0393");
        java.lang.String[] strArray4 = new java.lang.String[] { "" };
        java.util.ArrayList<java.lang.String> strList5 = new java.util.ArrayList<java.lang.String>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList5, strArray4);
        org.apache.avro.Schema.LockableArrayList<java.lang.String> strList7 = new org.apache.avro.Schema.LockableArrayList<java.lang.String>((java.util.List<java.lang.String>) strList5);
        org.apache.avro.Schema.LockableArrayList<java.lang.String> strList8 = new org.apache.avro.Schema.LockableArrayList<java.lang.String>((java.util.List<java.lang.String>) strList5);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.avro.Schema schema9 = org.apache.avro.Schema.createEnum("[].union", "union type:MAP pos:-1", "float", (java.util.List<java.lang.String>) strList8);
            org.junit.Assert.fail("Expected exception of type org.apache.avro.SchemaParseException; message: Empty name");
        } catch (org.apache.avro.SchemaParseException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertArrayEquals(strArray4, new java.lang.String[] { "" });
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test0394() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SchemaM3Random300Test0.test0394");
        org.apache.avro.Schema.Names names1 = new org.apache.avro.Schema.Names("{}");
        java.lang.Object obj2 = names1.clone();
        java.lang.String str3 = names1.toString();
        org.junit.Assert.assertNotNull(obj2);
        org.junit.Assert.assertEquals(obj2.toString(), "{}");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj2), "{}");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj2), "{}");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "{}" + "'", str3, "{}");
    }

    @Test
    public void test0395() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SchemaM3Random300Test0.test0395");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.avro.Schema schema4 = org.apache.avro.Schema.createFixed("{\"type\":\"record\",\"fields\":[]}", "", "double", (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type org.apache.avro.SchemaParseException; message: Illegal initial character: {\"type\":\"record\",\"fields\":[]}");
        } catch (org.apache.avro.SchemaParseException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0396() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SchemaM3Random300Test0.test0396");
        org.apache.avro.Schema[] schemaArray0 = new org.apache.avro.Schema[] {};
        java.util.ArrayList<org.apache.avro.Schema> schemaList1 = new java.util.ArrayList<org.apache.avro.Schema>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<org.apache.avro.Schema>) schemaList1, schemaArray0);
        org.apache.avro.Schema schema3 = org.apache.avro.Schema.createUnion((java.util.List<org.apache.avro.Schema>) schemaList1);
        org.apache.avro.Schema[] schemaArray4 = new org.apache.avro.Schema[] {};
        java.util.ArrayList<org.apache.avro.Schema> schemaList5 = new java.util.ArrayList<org.apache.avro.Schema>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<org.apache.avro.Schema>) schemaList5, schemaArray4);
        org.apache.avro.Schema schema7 = org.apache.avro.Schema.createUnion((java.util.List<org.apache.avro.Schema>) schemaList5);
        org.apache.avro.Schema schema8 = org.apache.avro.Schema.applyAliases(schema3, schema7);
        org.apache.avro.Schema.Type type9 = schema7.getType();
        org.apache.avro.Schema schema10 = org.apache.avro.Schema.createMap(schema7);
        org.apache.avro.Schema schema11 = org.apache.avro.Schema.createArray(schema10);
        org.apache.avro.Schema schema12 = org.apache.avro.Schema.createMap(schema11);
        java.lang.String str13 = schema11.getName();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Set<java.lang.String> strSet14 = schema11.getAliases();
            org.junit.Assert.fail("Expected exception of type org.apache.avro.AvroRuntimeException; message: Not a named type: {\"type\":\"array\",\"items\":{\"type\":\"map\",\"values\":[]}}");
        } catch (org.apache.avro.AvroRuntimeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(schemaArray0);
        org.junit.Assert.assertArrayEquals(schemaArray0, new org.apache.avro.Schema[] {});
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(schema3);
        org.junit.Assert.assertNotNull(schemaArray4);
        org.junit.Assert.assertArrayEquals(schemaArray4, new org.apache.avro.Schema[] {});
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(schema7);
        org.junit.Assert.assertNotNull(schema8);
        org.junit.Assert.assertTrue("'" + type9 + "' != '" + org.apache.avro.Schema.Type.UNION + "'", type9.equals(org.apache.avro.Schema.Type.UNION));
        org.junit.Assert.assertNotNull(schema10);
        org.junit.Assert.assertNotNull(schema11);
        org.junit.Assert.assertNotNull(schema12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "array" + "'", str13, "array");
    }

    @Test
    public void test0397() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SchemaM3Random300Test0.test0397");
        org.apache.avro.Schema[] schemaArray0 = new org.apache.avro.Schema[] {};
        java.util.ArrayList<org.apache.avro.Schema> schemaList1 = new java.util.ArrayList<org.apache.avro.Schema>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<org.apache.avro.Schema>) schemaList1, schemaArray0);
        org.apache.avro.Schema schema3 = org.apache.avro.Schema.createUnion((java.util.List<org.apache.avro.Schema>) schemaList1);
        org.apache.avro.Schema[] schemaArray4 = new org.apache.avro.Schema[] {};
        java.util.ArrayList<org.apache.avro.Schema> schemaList5 = new java.util.ArrayList<org.apache.avro.Schema>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<org.apache.avro.Schema>) schemaList5, schemaArray4);
        org.apache.avro.Schema schema7 = org.apache.avro.Schema.createUnion((java.util.List<org.apache.avro.Schema>) schemaList5);
        org.apache.avro.Schema schema8 = org.apache.avro.Schema.applyAliases(schema3, schema7);
        java.util.List<org.apache.avro.Schema> schemaList9 = schema8.getTypes();
        boolean boolean11 = schema8.equals((java.lang.Object) "hi!");
        java.lang.String str12 = schema8.getDoc();
        java.lang.String str14 = schema8.toString(true);
        org.apache.avro.Schema[] schemaArray15 = new org.apache.avro.Schema[] {};
        java.util.ArrayList<org.apache.avro.Schema> schemaList16 = new java.util.ArrayList<org.apache.avro.Schema>();
        boolean boolean17 = java.util.Collections.addAll((java.util.Collection<org.apache.avro.Schema>) schemaList16, schemaArray15);
        org.apache.avro.Schema schema18 = org.apache.avro.Schema.createUnion((java.util.List<org.apache.avro.Schema>) schemaList16);
        org.apache.avro.Schema[] schemaArray19 = new org.apache.avro.Schema[] {};
        java.util.ArrayList<org.apache.avro.Schema> schemaList20 = new java.util.ArrayList<org.apache.avro.Schema>();
        boolean boolean21 = java.util.Collections.addAll((java.util.Collection<org.apache.avro.Schema>) schemaList20, schemaArray19);
        org.apache.avro.Schema schema22 = org.apache.avro.Schema.createUnion((java.util.List<org.apache.avro.Schema>) schemaList20);
        org.apache.avro.Schema schema23 = org.apache.avro.Schema.applyAliases(schema18, schema22);
        java.util.List<org.apache.avro.Schema> schemaList24 = schema23.getTypes();
        org.apache.avro.Schema schema25 = org.apache.avro.Schema.createUnion(schemaList24);
        java.lang.String str26 = schema25.getDoc();
        org.apache.avro.Schema schema27 = org.apache.avro.Schema.applyAliases(schema8, schema25);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean28 = schema25.isError();
            org.junit.Assert.fail("Expected exception of type org.apache.avro.AvroRuntimeException; message: Not a record: []");
        } catch (org.apache.avro.AvroRuntimeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(schemaArray0);
        org.junit.Assert.assertArrayEquals(schemaArray0, new org.apache.avro.Schema[] {});
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(schema3);
        org.junit.Assert.assertNotNull(schemaArray4);
        org.junit.Assert.assertArrayEquals(schemaArray4, new org.apache.avro.Schema[] {});
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(schema7);
        org.junit.Assert.assertNotNull(schema8);
        org.junit.Assert.assertNotNull(schemaList9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "[ ]" + "'", str14, "[ ]");
        org.junit.Assert.assertNotNull(schemaArray15);
        org.junit.Assert.assertArrayEquals(schemaArray15, new org.apache.avro.Schema[] {});
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(schema18);
        org.junit.Assert.assertNotNull(schemaArray19);
        org.junit.Assert.assertArrayEquals(schemaArray19, new org.apache.avro.Schema[] {});
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(schema22);
        org.junit.Assert.assertNotNull(schema23);
        org.junit.Assert.assertNotNull(schemaList24);
        org.junit.Assert.assertNotNull(schema25);
        org.junit.Assert.assertNull(str26);
        org.junit.Assert.assertNotNull(schema27);
    }

    @Test
    public void test0398() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SchemaM3Random300Test0.test0398");
        org.apache.avro.Schema.LockableArrayList<java.lang.String> strList4 = new org.apache.avro.Schema.LockableArrayList<java.lang.String>((int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.avro.Schema schema5 = org.apache.avro.Schema.createEnum("", "{\"type\":\"fixed\",\"name\":\"union\",\"namespace\":\"[]\",\"doc\":\"[ ]\",\"size\":0}", "{\"type\":\"array\",\"items\":{\"type\":\"map\",\"values\":[]}}", (java.util.List<java.lang.String>) strList4);
            org.junit.Assert.fail("Expected exception of type org.apache.avro.SchemaParseException; message: Empty name");
        } catch (org.apache.avro.SchemaParseException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0399() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SchemaM3Random300Test0.test0399");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.avro.Schema.LockableArrayList<java.lang.String> strList1 = new org.apache.avro.Schema.LockableArrayList<java.lang.String>((int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal Capacity: -1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0400() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SchemaM3Random300Test0.test0400");
        org.codehaus.jackson.JsonNode jsonNode1 = org.apache.avro.Schema.parseJson("{\r\n  \"type\" : \"map\",\r\n  \"values\" : {\r\n    \"type\" : \"map\",\r\n    \"values\" : [ ]\r\n  }\r\n}");
        org.junit.Assert.assertNotNull(jsonNode1);
    }

    @Test
    public void test0401() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SchemaM3Random300Test0.test0401");
        org.apache.avro.Schema.Parser parser0 = new org.apache.avro.Schema.Parser();
        java.util.Map<java.lang.String, org.apache.avro.Schema> strMap1 = parser0.getTypes();
        java.util.Map<java.lang.String, org.apache.avro.Schema> strMap2 = parser0.getTypes();
        org.apache.avro.Schema.Parser parser3 = new org.apache.avro.Schema.Parser();
        org.apache.avro.Schema.Parser parser5 = parser3.setValidate(true);
        java.util.Map<java.lang.String, org.apache.avro.Schema> strMap6 = parser3.getTypes();
        org.apache.avro.Schema.Parser parser7 = parser0.addTypes(strMap6);
        org.apache.avro.Schema schema9 = parser7.parse("{\"type\":\"map\",\"values\":[]}");
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<org.apache.avro.Schema.Field> fieldList10 = schema9.getFields();
            org.junit.Assert.fail("Expected exception of type org.apache.avro.AvroRuntimeException; message: Not a record: {\"type\":\"map\",\"values\":[]}");
        } catch (org.apache.avro.AvroRuntimeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strMap1);
        org.junit.Assert.assertNotNull(strMap2);
        org.junit.Assert.assertNotNull(parser5);
        org.junit.Assert.assertNotNull(strMap6);
        org.junit.Assert.assertNotNull(parser7);
        org.junit.Assert.assertNotNull(schema9);
    }

    @Test
    public void test0402() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SchemaM3Random300Test0.test0402");
        java.lang.String[] strArray19 = new java.lang.String[] { "{\"type\":\"array\",\"items\":{\"type\":\"map\",\"values\":[]}}", "union type:MAP pos:-1", "{\"type\":\"array\",\"items\":{\"type\":\"map\",\"values\":[]}}", "{}", "{\r\n  \"type\" : \"map\",\r\n  \"values\" : {\r\n    \"type\" : \"map\",\r\n    \"values\" : [ ]\r\n  }\r\n}", "double", "{\r\n  \"type\" : \"map\",\r\n  \"values\" : [ ]\r\n}", "{\"type\":\"map\",\"values\":[]}", "{\"type\":\"array\",\"items\":[]}", "{\"type\":\"map\",\"values\":[]}", "{}", "union", "{\r\n  \"type\" : \"record\",\r\n  \"fields\" : [ ]\r\n}", "[].union", "{\r\n  \"type\" : \"map\",\r\n  \"values\" : [ ]\r\n}", "{\"type\":\"fixed\",\"name\":\"union\",\"namespace\":\"[]\",\"doc\":\"[ ]\",\"size\":0}" };
        java.util.ArrayList<java.lang.String> strList20 = new java.util.ArrayList<java.lang.String>();
        boolean boolean21 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList20, strArray19);
        org.apache.avro.Schema.LockableArrayList<java.lang.String> strList22 = new org.apache.avro.Schema.LockableArrayList<java.lang.String>((java.util.List<java.lang.String>) strList20);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.avro.Schema schema23 = org.apache.avro.Schema.createEnum("{\"type\":\"array\",\"items\":[]}", "{\"type\":\"map\",\"values\":{\"type\":\"array\",\"items\":{\"type\":\"map\",\"values\":[]}}}", "", (java.util.List<java.lang.String>) strList22);
            org.junit.Assert.fail("Expected exception of type org.apache.avro.SchemaParseException; message: Illegal initial character: {\"type\":\"array\",\"items\":[]}");
        } catch (org.apache.avro.SchemaParseException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray19);
        org.junit.Assert.assertArrayEquals(strArray19, new java.lang.String[] { "{\"type\":\"array\",\"items\":{\"type\":\"map\",\"values\":[]}}", "union type:MAP pos:-1", "{\"type\":\"array\",\"items\":{\"type\":\"map\",\"values\":[]}}", "{}", "{\r\n  \"type\" : \"map\",\r\n  \"values\" : {\r\n    \"type\" : \"map\",\r\n    \"values\" : [ ]\r\n  }\r\n}", "double", "{\r\n  \"type\" : \"map\",\r\n  \"values\" : [ ]\r\n}", "{\"type\":\"map\",\"values\":[]}", "{\"type\":\"array\",\"items\":[]}", "{\"type\":\"map\",\"values\":[]}", "{}", "union", "{\r\n  \"type\" : \"record\",\r\n  \"fields\" : [ ]\r\n}", "[].union", "{\r\n  \"type\" : \"map\",\r\n  \"values\" : [ ]\r\n}", "{\"type\":\"fixed\",\"name\":\"union\",\"namespace\":\"[]\",\"doc\":\"[ ]\",\"size\":0}" });
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
    }

    @Test
    public void test0403() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SchemaM3Random300Test0.test0403");
        org.apache.avro.Schema.Names names1 = new org.apache.avro.Schema.Names("union type:MAP pos:-1");
    }

    @Test
    public void test0404() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SchemaM3Random300Test0.test0404");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.avro.Schema schema4 = org.apache.avro.Schema.createRecord("{\"type\":\"fixed\",\"name\":\"union\",\"namespace\":\"[]\",\"doc\":\"[ ]\",\"size\":0}", "{\"type\":\"fixed\",\"name\":\"union\",\"namespace\":\"[]\",\"doc\":\"[ ]\",\"size\":0}", "", false);
            org.junit.Assert.fail("Expected exception of type org.apache.avro.SchemaParseException; message: Illegal initial character: {\"type\":\"fixed\",\"name\":\"union\",\"namespace\":\"[]\",\"doc\":\"[ ]\",\"size\":0}");
        } catch (org.apache.avro.SchemaParseException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0405() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SchemaM3Random300Test0.test0405");
        org.apache.avro.Schema schema4 = org.apache.avro.Schema.createRecord("map", "{\r\n  \"type\" : \"fixed\",\r\n  \"name\" : \"union\",\r\n  \"namespace\" : \"[]\",\r\n  \"doc\" : \"[ ]\",\r\n  \"size\" : 0\r\n}", "map", true);
        org.junit.Assert.assertNotNull(schema4);
    }

    @Test
    public void test0406() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SchemaM3Random300Test0.test0406");
        org.apache.avro.Schema.Type type0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.avro.Schema schema1 = org.apache.avro.Schema.create(type0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0407() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SchemaM3Random300Test0.test0407");
        org.apache.avro.Schema.LockableArrayList<java.lang.String> strList4 = new org.apache.avro.Schema.LockableArrayList<java.lang.String>((int) (byte) 100);
        org.apache.avro.Schema schema5 = org.apache.avro.Schema.createEnum("float", "map", "{\"type\":\"fixed\",\"name\":\"union\",\"namespace\":\"[]\",\"doc\":\"[ ]\",\"size\":0}", (java.util.List<java.lang.String>) strList4);
        org.junit.Assert.assertNotNull(schema5);
    }

    @Test
    public void test0408() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SchemaM3Random300Test0.test0408");
        org.codehaus.jackson.JsonNode jsonNode1 = org.apache.avro.Schema.parseJson("{\"type\":\"array\",\"items\":{\"type\":\"map\",\"values\":[]}}");
        org.junit.Assert.assertNotNull(jsonNode1);
    }

    @Test
    public void test0409() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SchemaM3Random300Test0.test0409");
        org.apache.avro.Schema.LockableArrayList<java.util.List<java.lang.String>> strListList1 = new org.apache.avro.Schema.LockableArrayList<java.util.List<java.lang.String>>((int) (short) 1);
    }

    @Test
    public void test0410() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SchemaM3Random300Test0.test0410");
        org.apache.avro.Schema[] schemaArray0 = new org.apache.avro.Schema[] {};
        java.util.ArrayList<org.apache.avro.Schema> schemaList1 = new java.util.ArrayList<org.apache.avro.Schema>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<org.apache.avro.Schema>) schemaList1, schemaArray0);
        org.apache.avro.Schema schema3 = org.apache.avro.Schema.createUnion((java.util.List<org.apache.avro.Schema>) schemaList1);
        org.apache.avro.Schema[] schemaArray4 = new org.apache.avro.Schema[] {};
        java.util.ArrayList<org.apache.avro.Schema> schemaList5 = new java.util.ArrayList<org.apache.avro.Schema>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<org.apache.avro.Schema>) schemaList5, schemaArray4);
        org.apache.avro.Schema schema7 = org.apache.avro.Schema.createUnion((java.util.List<org.apache.avro.Schema>) schemaList5);
        org.apache.avro.Schema schema8 = org.apache.avro.Schema.applyAliases(schema3, schema7);
        java.util.List<org.apache.avro.Schema> schemaList9 = schema8.getTypes();
        boolean boolean11 = schema8.equals((java.lang.Object) "hi!");
        java.lang.String str12 = schema8.getDoc();
        org.apache.avro.Schema schema13 = org.apache.avro.Schema.createArray(schema8);
        java.lang.String str14 = schema8.getFullName();
        org.apache.avro.Schema schema15 = org.apache.avro.Schema.createMap(schema8);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.avro.Schema.Field field17 = schema15.getField("union type:MAP pos:-1");
            org.junit.Assert.fail("Expected exception of type org.apache.avro.AvroRuntimeException; message: Not a record: {\"type\":\"map\",\"values\":[]}");
        } catch (org.apache.avro.AvroRuntimeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(schemaArray0);
        org.junit.Assert.assertArrayEquals(schemaArray0, new org.apache.avro.Schema[] {});
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(schema3);
        org.junit.Assert.assertNotNull(schemaArray4);
        org.junit.Assert.assertArrayEquals(schemaArray4, new org.apache.avro.Schema[] {});
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(schema7);
        org.junit.Assert.assertNotNull(schema8);
        org.junit.Assert.assertNotNull(schemaList9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNotNull(schema13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "union" + "'", str14, "union");
        org.junit.Assert.assertNotNull(schema15);
    }

    @Test
    public void test0411() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SchemaM3Random300Test0.test0411");
        org.apache.avro.Schema schema2 = org.apache.avro.Schema.parse("[]", true);
        java.lang.String str4 = schema2.toString(false);
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<java.lang.String> strList5 = schema2.getEnumSymbols();
            org.junit.Assert.fail("Expected exception of type org.apache.avro.AvroRuntimeException; message: Not an enum: []");
        } catch (org.apache.avro.AvroRuntimeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(schema2);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "[]" + "'", str4, "[]");
    }

    @Test
    public void test0412() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SchemaM3Random300Test0.test0412");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.avro.Schema schema1 = org.apache.avro.Schema.parse("float");
            org.junit.Assert.fail("Expected exception of type org.apache.avro.SchemaParseException; message: org.codehaus.jackson.JsonParseException: Unrecognized token 'float': was expecting 'null', 'true' or 'false'? at [Source: java.io.StringReader@639f5c93; line: 1, column: 11]");
        } catch (org.apache.avro.SchemaParseException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0413() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SchemaM3Random300Test0.test0413");
        org.apache.avro.Schema schema4 = org.apache.avro.Schema.createFixed("union", "[ ]", "[]", 0);
        org.apache.avro.Schema.Type type5 = org.apache.avro.Schema.Type.INT;
        org.apache.avro.Schema schema6 = org.apache.avro.Schema.create(type5);
        org.apache.avro.Schema schema7 = org.apache.avro.Schema.createArray(schema6);
        org.apache.avro.Schema schema8 = org.apache.avro.Schema.applyAliases(schema4, schema7);
        java.util.Set<java.lang.String> strSet9 = schema8.getAliases();
        int int10 = schema8.getFixedSize();
        org.junit.Assert.assertNotNull(schema4);
        org.junit.Assert.assertTrue("'" + type5 + "' != '" + org.apache.avro.Schema.Type.INT + "'", type5.equals(org.apache.avro.Schema.Type.INT));
        org.junit.Assert.assertNotNull(schema6);
        org.junit.Assert.assertNotNull(schema7);
        org.junit.Assert.assertNotNull(schema8);
        org.junit.Assert.assertNotNull(strSet9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test0414() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SchemaM3Random300Test0.test0414");
        org.apache.avro.Schema[] schemaArray0 = new org.apache.avro.Schema[] {};
        java.util.ArrayList<org.apache.avro.Schema> schemaList1 = new java.util.ArrayList<org.apache.avro.Schema>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<org.apache.avro.Schema>) schemaList1, schemaArray0);
        org.apache.avro.Schema schema3 = org.apache.avro.Schema.createUnion((java.util.List<org.apache.avro.Schema>) schemaList1);
        org.apache.avro.Schema[] schemaArray4 = new org.apache.avro.Schema[] {};
        java.util.ArrayList<org.apache.avro.Schema> schemaList5 = new java.util.ArrayList<org.apache.avro.Schema>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<org.apache.avro.Schema>) schemaList5, schemaArray4);
        org.apache.avro.Schema schema7 = org.apache.avro.Schema.createUnion((java.util.List<org.apache.avro.Schema>) schemaList5);
        org.apache.avro.Schema schema8 = org.apache.avro.Schema.applyAliases(schema3, schema7);
        java.util.List<org.apache.avro.Schema> schemaList9 = schema8.getTypes();
        boolean boolean11 = schema8.equals((java.lang.Object) "hi!");
        java.lang.String str12 = schema8.getDoc();
        org.apache.avro.Schema schema13 = org.apache.avro.Schema.createArray(schema8);
        // The following exception was thrown during execution in test generation
        try {
            schema8.addAlias("{}");
            org.junit.Assert.fail("Expected exception of type org.apache.avro.AvroRuntimeException; message: Not a named type: []");
        } catch (org.apache.avro.AvroRuntimeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(schemaArray0);
        org.junit.Assert.assertArrayEquals(schemaArray0, new org.apache.avro.Schema[] {});
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(schema3);
        org.junit.Assert.assertNotNull(schemaArray4);
        org.junit.Assert.assertArrayEquals(schemaArray4, new org.apache.avro.Schema[] {});
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(schema7);
        org.junit.Assert.assertNotNull(schema8);
        org.junit.Assert.assertNotNull(schemaList9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNotNull(schema13);
    }

    @Test
    public void test0415() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SchemaM3Random300Test0.test0415");
        org.apache.avro.Schema schema4 = org.apache.avro.Schema.createRecord("float", "{\"type\":\"map\",\"values\":[]}", "double", false);
        org.junit.Assert.assertNotNull(schema4);
    }

    @Test
    public void test0416() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SchemaM3Random300Test0.test0416");
        org.apache.avro.Schema[] schemaArray0 = new org.apache.avro.Schema[] {};
        java.util.ArrayList<org.apache.avro.Schema> schemaList1 = new java.util.ArrayList<org.apache.avro.Schema>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<org.apache.avro.Schema>) schemaList1, schemaArray0);
        org.apache.avro.Schema schema3 = org.apache.avro.Schema.createUnion((java.util.List<org.apache.avro.Schema>) schemaList1);
        org.apache.avro.Schema[] schemaArray4 = new org.apache.avro.Schema[] {};
        java.util.ArrayList<org.apache.avro.Schema> schemaList5 = new java.util.ArrayList<org.apache.avro.Schema>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<org.apache.avro.Schema>) schemaList5, schemaArray4);
        org.apache.avro.Schema schema7 = org.apache.avro.Schema.createUnion((java.util.List<org.apache.avro.Schema>) schemaList5);
        org.apache.avro.Schema schema8 = org.apache.avro.Schema.applyAliases(schema3, schema7);
        org.apache.avro.Schema.Type type9 = schema7.getType();
        org.apache.avro.Schema schema10 = org.apache.avro.Schema.createMap(schema7);
        org.apache.avro.Schema schema11 = org.apache.avro.Schema.createArray(schema10);
        org.apache.avro.Schema schema12 = org.apache.avro.Schema.createMap(schema11);
        java.lang.String str13 = schema11.getName();
        org.apache.avro.Schema schema14 = org.apache.avro.Schema.createMap(schema11);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str15 = schema14.getNamespace();
            org.junit.Assert.fail("Expected exception of type org.apache.avro.AvroRuntimeException; message: Not a named type: {\"type\":\"map\",\"values\":{\"type\":\"array\",\"items\":{\"type\":\"map\",\"values\":[]}}}");
        } catch (org.apache.avro.AvroRuntimeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(schemaArray0);
        org.junit.Assert.assertArrayEquals(schemaArray0, new org.apache.avro.Schema[] {});
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(schema3);
        org.junit.Assert.assertNotNull(schemaArray4);
        org.junit.Assert.assertArrayEquals(schemaArray4, new org.apache.avro.Schema[] {});
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(schema7);
        org.junit.Assert.assertNotNull(schema8);
        org.junit.Assert.assertTrue("'" + type9 + "' != '" + org.apache.avro.Schema.Type.UNION + "'", type9.equals(org.apache.avro.Schema.Type.UNION));
        org.junit.Assert.assertNotNull(schema10);
        org.junit.Assert.assertNotNull(schema11);
        org.junit.Assert.assertNotNull(schema12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "array" + "'", str13, "array");
        org.junit.Assert.assertNotNull(schema14);
    }

    @Test
    public void test0417() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SchemaM3Random300Test0.test0417");
        org.apache.avro.Schema.LockableArrayList<org.codehaus.jackson.map.ObjectMapper> objectMapperList0 = new org.apache.avro.Schema.LockableArrayList<org.codehaus.jackson.map.ObjectMapper>();
    }

    @Test
    public void test0418() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SchemaM3Random300Test0.test0418");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.avro.Schema schema4 = org.apache.avro.Schema.createRecord("{\"type\":\"map\",\"values\":{\"type\":\"array\",\"items\":{\"type\":\"map\",\"values\":[]}}}", "{\"type\":\"map\",\"values\":{\"type\":\"array\",\"items\":{\"type\":\"map\",\"values\":[]},\"\":\"{\\r\\n  \\\"type\\\" : \\\"record\\\",\\r\\n  \\\"fields\\\" : [ ]\\r\\n}\"}}", "{\r\n  \"type\" : \"map\",\r\n  \"values\" : {\r\n    \"type\" : \"map\",\r\n    \"values\" : [ ]\r\n  }\r\n}", false);
            org.junit.Assert.fail("Expected exception of type org.apache.avro.SchemaParseException; message: Illegal initial character: {\"type\":\"map\",\"values\":{\"type\":\"array\",\"items\":{\"type\":\"map\",\"values\":[]}}}");
        } catch (org.apache.avro.SchemaParseException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0419() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SchemaM3Random300Test0.test0419");
        org.apache.avro.Schema[] schemaArray0 = new org.apache.avro.Schema[] {};
        java.util.ArrayList<org.apache.avro.Schema> schemaList1 = new java.util.ArrayList<org.apache.avro.Schema>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<org.apache.avro.Schema>) schemaList1, schemaArray0);
        org.apache.avro.Schema schema3 = org.apache.avro.Schema.createUnion((java.util.List<org.apache.avro.Schema>) schemaList1);
        org.apache.avro.Schema[] schemaArray4 = new org.apache.avro.Schema[] {};
        java.util.ArrayList<org.apache.avro.Schema> schemaList5 = new java.util.ArrayList<org.apache.avro.Schema>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<org.apache.avro.Schema>) schemaList5, schemaArray4);
        org.apache.avro.Schema schema7 = org.apache.avro.Schema.createUnion((java.util.List<org.apache.avro.Schema>) schemaList5);
        org.apache.avro.Schema schema8 = org.apache.avro.Schema.applyAliases(schema3, schema7);
        java.util.List<org.apache.avro.Schema> schemaList9 = schema8.getTypes();
        org.apache.avro.Schema schema10 = org.apache.avro.Schema.createUnion(schemaList9);
        java.lang.String str11 = schema10.getDoc();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean13 = schema10.hasEnumSymbol("{\"type\":\"fixed\",\"name\":\"union\",\"namespace\":\"[]\",\"doc\":\"[ ]\",\"size\":0}");
            org.junit.Assert.fail("Expected exception of type org.apache.avro.AvroRuntimeException; message: Not an enum: []");
        } catch (org.apache.avro.AvroRuntimeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(schemaArray0);
        org.junit.Assert.assertArrayEquals(schemaArray0, new org.apache.avro.Schema[] {});
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(schema3);
        org.junit.Assert.assertNotNull(schemaArray4);
        org.junit.Assert.assertArrayEquals(schemaArray4, new org.apache.avro.Schema[] {});
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(schema7);
        org.junit.Assert.assertNotNull(schema8);
        org.junit.Assert.assertNotNull(schemaList9);
        org.junit.Assert.assertNotNull(schema10);
        org.junit.Assert.assertNull(str11);
    }

    @Test
    public void test0420() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SchemaM3Random300Test0.test0420");
        org.apache.avro.Schema.Parser parser0 = new org.apache.avro.Schema.Parser();
        org.apache.avro.Schema.Parser parser2 = parser0.setValidate(true);
        java.util.Map<java.lang.String, org.apache.avro.Schema> strMap3 = parser0.getTypes();
        org.apache.avro.Schema.Parser parser5 = parser0.setValidate(true);
        org.apache.avro.Schema.Parser parser7 = parser5.setValidate(true);
        java.io.File file8 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.avro.Schema schema9 = parser7.parse(file8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(parser2);
        org.junit.Assert.assertNotNull(strMap3);
        org.junit.Assert.assertNotNull(parser5);
        org.junit.Assert.assertNotNull(parser7);
    }

    @Test
    public void test0421() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SchemaM3Random300Test0.test0421");
        org.apache.avro.Schema schema4 = org.apache.avro.Schema.createRecord("map", "[].union", "{\r\n  \"type\" : \"map\",\r\n  \"values\" : {\r\n    \"type\" : \"map\",\r\n    \"values\" : [ ]\r\n  }\r\n}", false);
        org.junit.Assert.assertNotNull(schema4);
    }

    @Test
    public void test0422() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SchemaM3Random300Test0.test0422");
        org.apache.avro.Schema schema1 = org.apache.avro.Schema.parse("{\r\n  \"type\" : \"map\",\r\n  \"values\" : [ ]\r\n}");
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<java.lang.String> strList2 = schema1.getEnumSymbols();
            org.junit.Assert.fail("Expected exception of type org.apache.avro.AvroRuntimeException; message: Not an enum: {\"type\":\"map\",\"values\":[]}");
        } catch (org.apache.avro.AvroRuntimeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(schema1);
    }

    @Test
    public void test0423() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SchemaM3Random300Test0.test0423");
        org.apache.avro.Schema[] schemaArray0 = new org.apache.avro.Schema[] {};
        java.util.ArrayList<org.apache.avro.Schema> schemaList1 = new java.util.ArrayList<org.apache.avro.Schema>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<org.apache.avro.Schema>) schemaList1, schemaArray0);
        org.apache.avro.Schema schema3 = org.apache.avro.Schema.createUnion((java.util.List<org.apache.avro.Schema>) schemaList1);
        org.apache.avro.Schema[] schemaArray4 = new org.apache.avro.Schema[] {};
        java.util.ArrayList<org.apache.avro.Schema> schemaList5 = new java.util.ArrayList<org.apache.avro.Schema>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<org.apache.avro.Schema>) schemaList5, schemaArray4);
        org.apache.avro.Schema schema7 = org.apache.avro.Schema.createUnion((java.util.List<org.apache.avro.Schema>) schemaList5);
        org.apache.avro.Schema schema8 = org.apache.avro.Schema.applyAliases(schema3, schema7);
        org.apache.avro.Schema.Type type9 = schema7.getType();
        org.apache.avro.Schema schema10 = org.apache.avro.Schema.createMap(schema7);
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<org.apache.avro.Schema.Field> fieldList11 = schema10.getFields();
            org.junit.Assert.fail("Expected exception of type org.apache.avro.AvroRuntimeException; message: Not a record: {\"type\":\"map\",\"values\":[]}");
        } catch (org.apache.avro.AvroRuntimeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(schemaArray0);
        org.junit.Assert.assertArrayEquals(schemaArray0, new org.apache.avro.Schema[] {});
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(schema3);
        org.junit.Assert.assertNotNull(schemaArray4);
        org.junit.Assert.assertArrayEquals(schemaArray4, new org.apache.avro.Schema[] {});
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(schema7);
        org.junit.Assert.assertNotNull(schema8);
        org.junit.Assert.assertTrue("'" + type9 + "' != '" + org.apache.avro.Schema.Type.UNION + "'", type9.equals(org.apache.avro.Schema.Type.UNION));
        org.junit.Assert.assertNotNull(schema10);
    }

    @Test
    public void test0424() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SchemaM3Random300Test0.test0424");
        org.apache.avro.Schema.Parser parser0 = new org.apache.avro.Schema.Parser();
        org.apache.avro.Schema.Parser parser2 = parser0.setValidate(true);
        org.apache.avro.Schema.Parser parser4 = parser0.setValidate(true);
        org.apache.avro.Schema.Parser parser6 = parser0.setValidate(true);
        org.apache.avro.Schema schema8 = parser0.parse("[].union");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean10 = schema8.hasEnumSymbol("{\r\n  \"type\" : \"map\",\r\n  \"values\" : {\r\n    \"type\" : \"map\",\r\n    \"values\" : [ ]\r\n  }\r\n}");
            org.junit.Assert.fail("Expected exception of type org.apache.avro.AvroRuntimeException; message: Not an enum: []");
        } catch (org.apache.avro.AvroRuntimeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(parser2);
        org.junit.Assert.assertNotNull(parser4);
        org.junit.Assert.assertNotNull(parser6);
        org.junit.Assert.assertNotNull(schema8);
    }

    @Test
    public void test0425() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SchemaM3Random300Test0.test0425");
        org.apache.avro.Schema.Field[] fieldArray0 = new org.apache.avro.Schema.Field[] {};
        java.util.ArrayList<org.apache.avro.Schema.Field> fieldList1 = new java.util.ArrayList<org.apache.avro.Schema.Field>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<org.apache.avro.Schema.Field>) fieldList1, fieldArray0);
        org.apache.avro.Schema schema3 = org.apache.avro.Schema.createRecord((java.util.List<org.apache.avro.Schema.Field>) fieldList1);
        org.apache.avro.Schema schema4 = org.apache.avro.Schema.createRecord((java.util.List<org.apache.avro.Schema.Field>) fieldList1);
        org.apache.avro.Schema schema5 = org.apache.avro.Schema.createArray(schema4);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.avro.Schema schema6 = schema4.getValueType();
            org.junit.Assert.fail("Expected exception of type org.apache.avro.AvroRuntimeException; message: Not a map: {\"type\":\"record\",\"fields\":[]}");
        } catch (org.apache.avro.AvroRuntimeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(fieldArray0);
        org.junit.Assert.assertArrayEquals(fieldArray0, new org.apache.avro.Schema.Field[] {});
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(schema3);
        org.junit.Assert.assertNotNull(schema4);
        org.junit.Assert.assertNotNull(schema5);
    }

    @Test
    public void test0426() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SchemaM3Random300Test0.test0426");
        org.apache.avro.Schema schema1 = org.apache.avro.Schema.parse("{\r\n  \"type\" : \"map\",\r\n  \"values\" : [ ]\r\n}");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = schema1.getNamespace();
            org.junit.Assert.fail("Expected exception of type org.apache.avro.AvroRuntimeException; message: Not a named type: {\"type\":\"map\",\"values\":[]}");
        } catch (org.apache.avro.AvroRuntimeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(schema1);
    }

    @Test
    public void test0427() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SchemaM3Random300Test0.test0427");
        org.apache.avro.Schema.Parser parser0 = new org.apache.avro.Schema.Parser();
        org.apache.avro.Schema.Parser parser2 = parser0.setValidate(true);
        java.util.Map<java.lang.String, org.apache.avro.Schema> strMap3 = parser0.getTypes();
        org.apache.avro.Schema schema5 = parser0.parse("{\"type\":\"array\",\"items\":{\"type\":\"map\",\"values\":[]}}");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.avro.Schema schema6 = schema5.getValueType();
            org.junit.Assert.fail("Expected exception of type org.apache.avro.AvroRuntimeException; message: Not a map: {\"type\":\"array\",\"items\":{\"type\":\"map\",\"values\":[]}}");
        } catch (org.apache.avro.AvroRuntimeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(parser2);
        org.junit.Assert.assertNotNull(strMap3);
        org.junit.Assert.assertNotNull(schema5);
    }

    @Test
    public void test0428() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SchemaM3Random300Test0.test0428");
        org.apache.avro.Schema.Parser parser0 = new org.apache.avro.Schema.Parser();
        java.util.Map<java.lang.String, org.apache.avro.Schema> strMap1 = parser0.getTypes();
        java.util.Map<java.lang.String, org.apache.avro.Schema> strMap2 = parser0.getTypes();
        org.apache.avro.Schema.Parser parser3 = new org.apache.avro.Schema.Parser();
        org.apache.avro.Schema.Parser parser5 = parser3.setValidate(true);
        java.util.Map<java.lang.String, org.apache.avro.Schema> strMap6 = parser3.getTypes();
        org.apache.avro.Schema.Parser parser7 = parser0.addTypes(strMap6);
        org.apache.avro.Schema.Parser parser9 = parser7.setValidate(true);
        boolean boolean10 = parser7.getValidate();
        java.io.InputStream inputStream11 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.avro.Schema schema12 = parser7.parse(inputStream11);
            org.junit.Assert.fail("Expected exception of type java.io.EOFException; message: No content to map to Object due to end of input");
        } catch (java.io.EOFException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strMap1);
        org.junit.Assert.assertNotNull(strMap2);
        org.junit.Assert.assertNotNull(parser5);
        org.junit.Assert.assertNotNull(strMap6);
        org.junit.Assert.assertNotNull(parser7);
        org.junit.Assert.assertNotNull(parser9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test0429() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SchemaM3Random300Test0.test0429");
        org.apache.avro.Schema.Names names1 = new org.apache.avro.Schema.Names("double");
    }

    @Test
    public void test0430() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SchemaM3Random300Test0.test0430");
        org.apache.avro.Schema[] schemaArray0 = new org.apache.avro.Schema[] {};
        java.util.ArrayList<org.apache.avro.Schema> schemaList1 = new java.util.ArrayList<org.apache.avro.Schema>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<org.apache.avro.Schema>) schemaList1, schemaArray0);
        org.apache.avro.Schema schema3 = org.apache.avro.Schema.createUnion((java.util.List<org.apache.avro.Schema>) schemaList1);
        org.apache.avro.Schema[] schemaArray4 = new org.apache.avro.Schema[] {};
        java.util.ArrayList<org.apache.avro.Schema> schemaList5 = new java.util.ArrayList<org.apache.avro.Schema>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<org.apache.avro.Schema>) schemaList5, schemaArray4);
        org.apache.avro.Schema schema7 = org.apache.avro.Schema.createUnion((java.util.List<org.apache.avro.Schema>) schemaList5);
        org.apache.avro.Schema schema8 = org.apache.avro.Schema.applyAliases(schema3, schema7);
        java.util.List<org.apache.avro.Schema> schemaList9 = schema8.getTypes();
        boolean boolean11 = schema8.equals((java.lang.Object) "hi!");
        java.lang.String str12 = schema8.getDoc();
        org.apache.avro.Schema schema13 = org.apache.avro.Schema.createArray(schema8);
        java.lang.String str14 = schema8.getFullName();
        org.apache.avro.Schema schema15 = org.apache.avro.Schema.createMap(schema8);
        java.lang.String str16 = schema15.getName();
        java.lang.String str17 = schema15.getName();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str18 = schema15.getNamespace();
            org.junit.Assert.fail("Expected exception of type org.apache.avro.AvroRuntimeException; message: Not a named type: {\"type\":\"map\",\"values\":[]}");
        } catch (org.apache.avro.AvroRuntimeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(schemaArray0);
        org.junit.Assert.assertArrayEquals(schemaArray0, new org.apache.avro.Schema[] {});
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(schema3);
        org.junit.Assert.assertNotNull(schemaArray4);
        org.junit.Assert.assertArrayEquals(schemaArray4, new org.apache.avro.Schema[] {});
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(schema7);
        org.junit.Assert.assertNotNull(schema8);
        org.junit.Assert.assertNotNull(schemaList9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNotNull(schema13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "union" + "'", str14, "union");
        org.junit.Assert.assertNotNull(schema15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "map" + "'", str16, "map");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "map" + "'", str17, "map");
    }

    @Test
    public void test0431() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SchemaM3Random300Test0.test0431");
        org.apache.avro.Schema schema4 = org.apache.avro.Schema.createFixed("map", "", "{\"type\":\"array\",\"items\":[]}", 0);
        org.apache.avro.Schema.Type type5 = schema4.getType();
        org.junit.Assert.assertNotNull(schema4);
        org.junit.Assert.assertTrue("'" + type5 + "' != '" + org.apache.avro.Schema.Type.FIXED + "'", type5.equals(org.apache.avro.Schema.Type.FIXED));
    }

    @Test
    public void test0432() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SchemaM3Random300Test0.test0432");
        org.apache.avro.Schema.Parser parser0 = new org.apache.avro.Schema.Parser();
        org.apache.avro.Schema.Parser parser2 = parser0.setValidate(true);
        java.util.Map<java.lang.String, org.apache.avro.Schema> strMap3 = parser0.getTypes();
        java.util.Map<java.lang.String, org.apache.avro.Schema> strMap4 = parser0.getTypes();
        org.apache.avro.Schema schema6 = parser0.parse("{\"type\":\"map\",\"values\":[]}");
        boolean boolean7 = parser0.getValidate();
        java.io.InputStream inputStream8 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.avro.Schema schema9 = parser0.parse(inputStream8);
            org.junit.Assert.fail("Expected exception of type java.io.EOFException; message: No content to map to Object due to end of input");
        } catch (java.io.EOFException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(parser2);
        org.junit.Assert.assertNotNull(strMap3);
        org.junit.Assert.assertNotNull(strMap4);
        org.junit.Assert.assertNotNull(schema6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test0433() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SchemaM3Random300Test0.test0433");
        org.apache.avro.Schema[] schemaArray0 = new org.apache.avro.Schema[] {};
        java.util.ArrayList<org.apache.avro.Schema> schemaList1 = new java.util.ArrayList<org.apache.avro.Schema>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<org.apache.avro.Schema>) schemaList1, schemaArray0);
        org.apache.avro.Schema schema3 = org.apache.avro.Schema.createUnion((java.util.List<org.apache.avro.Schema>) schemaList1);
        org.apache.avro.Schema[] schemaArray4 = new org.apache.avro.Schema[] {};
        java.util.ArrayList<org.apache.avro.Schema> schemaList5 = new java.util.ArrayList<org.apache.avro.Schema>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<org.apache.avro.Schema>) schemaList5, schemaArray4);
        org.apache.avro.Schema schema7 = org.apache.avro.Schema.createUnion((java.util.List<org.apache.avro.Schema>) schemaList5);
        org.apache.avro.Schema schema8 = org.apache.avro.Schema.applyAliases(schema3, schema7);
        org.apache.avro.Schema.Type type9 = schema7.getType();
        org.apache.avro.Schema.Type type10 = schema7.getType();
        // The following exception was thrown during execution in test generation
        try {
            schema7.addAlias("{\r\n  \"type\" : \"fixed\",\r\n  \"name\" : \"union\",\r\n  \"namespace\" : \"[]\",\r\n  \"doc\" : \"[ ]\",\r\n  \"size\" : 0\r\n}");
            org.junit.Assert.fail("Expected exception of type org.apache.avro.AvroRuntimeException; message: Not a named type: []");
        } catch (org.apache.avro.AvroRuntimeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(schemaArray0);
        org.junit.Assert.assertArrayEquals(schemaArray0, new org.apache.avro.Schema[] {});
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(schema3);
        org.junit.Assert.assertNotNull(schemaArray4);
        org.junit.Assert.assertArrayEquals(schemaArray4, new org.apache.avro.Schema[] {});
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(schema7);
        org.junit.Assert.assertNotNull(schema8);
        org.junit.Assert.assertTrue("'" + type9 + "' != '" + org.apache.avro.Schema.Type.UNION + "'", type9.equals(org.apache.avro.Schema.Type.UNION));
        org.junit.Assert.assertTrue("'" + type10 + "' != '" + org.apache.avro.Schema.Type.UNION + "'", type10.equals(org.apache.avro.Schema.Type.UNION));
    }

    @Test
    public void test0434() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SchemaM3Random300Test0.test0434");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.avro.Schema schema4 = org.apache.avro.Schema.createFixed("hi!", "double", "array", 0);
            org.junit.Assert.fail("Expected exception of type org.apache.avro.SchemaParseException; message: Illegal character in: hi!");
        } catch (org.apache.avro.SchemaParseException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0435() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SchemaM3Random300Test0.test0435");
        org.apache.avro.Schema.LockableArrayList<java.lang.String> strList4 = new org.apache.avro.Schema.LockableArrayList<java.lang.String>((int) (short) 0);
        org.apache.avro.Schema.LockableArrayList<java.lang.String> strList5 = new org.apache.avro.Schema.LockableArrayList<java.lang.String>((java.util.List<java.lang.String>) strList4);
        org.apache.avro.Schema.LockableArrayList<java.lang.String> strList6 = new org.apache.avro.Schema.LockableArrayList<java.lang.String>((java.util.List<java.lang.String>) strList5);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.avro.Schema schema7 = org.apache.avro.Schema.createEnum("{\"type\":\"map\",\"values\":{\"type\":\"array\",\"items\":{\"type\":\"map\",\"values\":[]}}}", "float", "[].union", (java.util.List<java.lang.String>) strList6);
            org.junit.Assert.fail("Expected exception of type org.apache.avro.SchemaParseException; message: Illegal initial character: {\"type\":\"map\",\"values\":{\"type\":\"array\",\"items\":{\"type\":\"map\",\"values\":[]}}}");
        } catch (org.apache.avro.SchemaParseException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0436() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SchemaM3Random300Test0.test0436");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.avro.Schema schema4 = org.apache.avro.Schema.createRecord("[ ]", "", "{\r\n  \"type\" : \"map\",\r\n  \"values\" : [ ]\r\n}", true);
            org.junit.Assert.fail("Expected exception of type org.apache.avro.SchemaParseException; message: Illegal initial character: [ ]");
        } catch (org.apache.avro.SchemaParseException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0437() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SchemaM3Random300Test0.test0437");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.avro.Schema schema4 = org.apache.avro.Schema.createRecord("{\r\n  \"type\" : \"map\",\r\n  \"values\" : [ ]\r\n}", "[]", "union type:MAP pos:-1", true);
            org.junit.Assert.fail("Expected exception of type org.apache.avro.SchemaParseException; message: Illegal initial character: {??  \"type\" : \"map\",??  \"values\" : [ ]??}");
        } catch (org.apache.avro.SchemaParseException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0438() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SchemaM3Random300Test0.test0438");
        org.apache.avro.Schema schema4 = org.apache.avro.Schema.createRecord("float", "", "{\r\n  \"type\" : \"map\",\r\n  \"values\" : {\r\n    \"type\" : \"map\",\r\n    \"values\" : [ ]\r\n  }\r\n}", true);
        org.junit.Assert.assertNotNull(schema4);
    }

    @Test
    public void test0439() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SchemaM3Random300Test0.test0439");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.avro.Schema schema4 = org.apache.avro.Schema.createFixed("", "[].union", "{\r\n  \"type\" : \"record\",\r\n  \"fields\" : [ ]\r\n}", 0);
            org.junit.Assert.fail("Expected exception of type org.apache.avro.SchemaParseException; message: Empty name");
        } catch (org.apache.avro.SchemaParseException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0440() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SchemaM3Random300Test0.test0440");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.avro.Schema schema2 = org.apache.avro.Schema.parse("hi!", true);
            org.junit.Assert.fail("Expected exception of type org.apache.avro.SchemaParseException; message: org.codehaus.jackson.JsonParseException: Unexpected character ('h' (code 104)): expected a valid value (number, String, array, object, 'true', 'false' or 'null')? at [Source: java.io.StringReader@670ac565; line: 1, column: 2]");
        } catch (org.apache.avro.SchemaParseException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0441() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SchemaM3Random300Test0.test0441");
        org.apache.avro.Schema.Parser parser0 = new org.apache.avro.Schema.Parser();
        org.apache.avro.Schema.Parser parser2 = parser0.setValidate(true);
        org.apache.avro.Schema.Parser parser4 = parser0.setValidate(true);
        org.apache.avro.Schema.Parser parser6 = parser0.setValidate(true);
        org.apache.avro.Schema.Parser parser7 = new org.apache.avro.Schema.Parser();
        org.apache.avro.Schema.Parser parser9 = parser7.setValidate(true);
        java.util.Map<java.lang.String, org.apache.avro.Schema> strMap10 = parser7.getTypes();
        org.apache.avro.Schema.Parser parser12 = parser7.setValidate(true);
        org.apache.avro.Schema.Parser parser14 = parser7.setValidate(true);
        java.util.Map<java.lang.String, org.apache.avro.Schema> strMap15 = parser7.getTypes();
        org.apache.avro.Schema.Parser parser16 = parser6.addTypes(strMap15);
        org.apache.avro.Schema.Parser parser18 = parser6.setValidate(true);
        java.io.File file19 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.avro.Schema schema20 = parser6.parse(file19);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(parser2);
        org.junit.Assert.assertNotNull(parser4);
        org.junit.Assert.assertNotNull(parser6);
        org.junit.Assert.assertNotNull(parser9);
        org.junit.Assert.assertNotNull(strMap10);
        org.junit.Assert.assertNotNull(parser12);
        org.junit.Assert.assertNotNull(parser14);
        org.junit.Assert.assertNotNull(strMap15);
        org.junit.Assert.assertNotNull(parser16);
        org.junit.Assert.assertNotNull(parser18);
    }

    @Test
    public void test0442() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SchemaM3Random300Test0.test0442");
        org.apache.avro.Schema[] schemaArray0 = new org.apache.avro.Schema[] {};
        java.util.ArrayList<org.apache.avro.Schema> schemaList1 = new java.util.ArrayList<org.apache.avro.Schema>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<org.apache.avro.Schema>) schemaList1, schemaArray0);
        org.apache.avro.Schema schema3 = org.apache.avro.Schema.createUnion((java.util.List<org.apache.avro.Schema>) schemaList1);
        org.apache.avro.Schema[] schemaArray4 = new org.apache.avro.Schema[] {};
        java.util.ArrayList<org.apache.avro.Schema> schemaList5 = new java.util.ArrayList<org.apache.avro.Schema>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<org.apache.avro.Schema>) schemaList5, schemaArray4);
        org.apache.avro.Schema schema7 = org.apache.avro.Schema.createUnion((java.util.List<org.apache.avro.Schema>) schemaList5);
        org.apache.avro.Schema schema8 = org.apache.avro.Schema.applyAliases(schema3, schema7);
        java.util.List<org.apache.avro.Schema> schemaList9 = schema8.getTypes();
        org.apache.avro.Schema[] schemaArray10 = new org.apache.avro.Schema[] {};
        java.util.ArrayList<org.apache.avro.Schema> schemaList11 = new java.util.ArrayList<org.apache.avro.Schema>();
        boolean boolean12 = java.util.Collections.addAll((java.util.Collection<org.apache.avro.Schema>) schemaList11, schemaArray10);
        org.apache.avro.Schema schema13 = org.apache.avro.Schema.createUnion((java.util.List<org.apache.avro.Schema>) schemaList11);
        org.apache.avro.Schema[] schemaArray14 = new org.apache.avro.Schema[] {};
        java.util.ArrayList<org.apache.avro.Schema> schemaList15 = new java.util.ArrayList<org.apache.avro.Schema>();
        boolean boolean16 = java.util.Collections.addAll((java.util.Collection<org.apache.avro.Schema>) schemaList15, schemaArray14);
        org.apache.avro.Schema schema17 = org.apache.avro.Schema.createUnion((java.util.List<org.apache.avro.Schema>) schemaList15);
        org.apache.avro.Schema schema18 = org.apache.avro.Schema.applyAliases(schema13, schema17);
        org.apache.avro.Schema schema19 = org.apache.avro.Schema.applyAliases(schema8, schema17);
        org.apache.avro.Schema schema20 = org.apache.avro.Schema.createMap(schema8);
        java.lang.String str22 = schema8.toString(true);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean23 = schema8.isError();
            org.junit.Assert.fail("Expected exception of type org.apache.avro.AvroRuntimeException; message: Not a record: []");
        } catch (org.apache.avro.AvroRuntimeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(schemaArray0);
        org.junit.Assert.assertArrayEquals(schemaArray0, new org.apache.avro.Schema[] {});
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(schema3);
        org.junit.Assert.assertNotNull(schemaArray4);
        org.junit.Assert.assertArrayEquals(schemaArray4, new org.apache.avro.Schema[] {});
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(schema7);
        org.junit.Assert.assertNotNull(schema8);
        org.junit.Assert.assertNotNull(schemaList9);
        org.junit.Assert.assertNotNull(schemaArray10);
        org.junit.Assert.assertArrayEquals(schemaArray10, new org.apache.avro.Schema[] {});
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(schema13);
        org.junit.Assert.assertNotNull(schemaArray14);
        org.junit.Assert.assertArrayEquals(schemaArray14, new org.apache.avro.Schema[] {});
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(schema17);
        org.junit.Assert.assertNotNull(schema18);
        org.junit.Assert.assertNotNull(schema19);
        org.junit.Assert.assertNotNull(schema20);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "[ ]" + "'", str22, "[ ]");
    }

    @Test
    public void test0443() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SchemaM3Random300Test0.test0443");
        org.codehaus.jackson.JsonNode jsonNode1 = org.apache.avro.Schema.parseJson("{\"type\":\"map\",\"values\":{\"type\":\"array\",\"items\":{\"type\":\"map\",\"values\":[]}}}");
        org.junit.Assert.assertNotNull(jsonNode1);
    }

    @Test
    public void test0444() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SchemaM3Random300Test0.test0444");
        org.apache.avro.Schema[] schemaArray0 = new org.apache.avro.Schema[] {};
        java.util.ArrayList<org.apache.avro.Schema> schemaList1 = new java.util.ArrayList<org.apache.avro.Schema>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<org.apache.avro.Schema>) schemaList1, schemaArray0);
        org.apache.avro.Schema schema3 = org.apache.avro.Schema.createUnion((java.util.List<org.apache.avro.Schema>) schemaList1);
        org.apache.avro.Schema[] schemaArray4 = new org.apache.avro.Schema[] {};
        java.util.ArrayList<org.apache.avro.Schema> schemaList5 = new java.util.ArrayList<org.apache.avro.Schema>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<org.apache.avro.Schema>) schemaList5, schemaArray4);
        org.apache.avro.Schema schema7 = org.apache.avro.Schema.createUnion((java.util.List<org.apache.avro.Schema>) schemaList5);
        org.apache.avro.Schema schema8 = org.apache.avro.Schema.applyAliases(schema3, schema7);
        java.util.List<org.apache.avro.Schema> schemaList9 = schema8.getTypes();
        org.apache.avro.Schema[] schemaArray10 = new org.apache.avro.Schema[] {};
        java.util.ArrayList<org.apache.avro.Schema> schemaList11 = new java.util.ArrayList<org.apache.avro.Schema>();
        boolean boolean12 = java.util.Collections.addAll((java.util.Collection<org.apache.avro.Schema>) schemaList11, schemaArray10);
        org.apache.avro.Schema schema13 = org.apache.avro.Schema.createUnion((java.util.List<org.apache.avro.Schema>) schemaList11);
        org.apache.avro.Schema[] schemaArray14 = new org.apache.avro.Schema[] {};
        java.util.ArrayList<org.apache.avro.Schema> schemaList15 = new java.util.ArrayList<org.apache.avro.Schema>();
        boolean boolean16 = java.util.Collections.addAll((java.util.Collection<org.apache.avro.Schema>) schemaList15, schemaArray14);
        org.apache.avro.Schema schema17 = org.apache.avro.Schema.createUnion((java.util.List<org.apache.avro.Schema>) schemaList15);
        org.apache.avro.Schema schema18 = org.apache.avro.Schema.applyAliases(schema13, schema17);
        org.apache.avro.Schema schema19 = org.apache.avro.Schema.applyAliases(schema8, schema17);
        org.apache.avro.Schema schema20 = org.apache.avro.Schema.createMap(schema8);
        org.apache.avro.Schema schema21 = org.apache.avro.Schema.createArray(schema20);
        // The following exception was thrown during execution in test generation
        try {
            schema21.addAlias("{\"type\":\"array\",\"items\":{\"type\":\"map\",\"values\":[]}}");
            org.junit.Assert.fail("Expected exception of type org.apache.avro.AvroRuntimeException; message: Not a named type: {\"type\":\"array\",\"items\":{\"type\":\"map\",\"values\":[]}}");
        } catch (org.apache.avro.AvroRuntimeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(schemaArray0);
        org.junit.Assert.assertArrayEquals(schemaArray0, new org.apache.avro.Schema[] {});
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(schema3);
        org.junit.Assert.assertNotNull(schemaArray4);
        org.junit.Assert.assertArrayEquals(schemaArray4, new org.apache.avro.Schema[] {});
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(schema7);
        org.junit.Assert.assertNotNull(schema8);
        org.junit.Assert.assertNotNull(schemaList9);
        org.junit.Assert.assertNotNull(schemaArray10);
        org.junit.Assert.assertArrayEquals(schemaArray10, new org.apache.avro.Schema[] {});
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(schema13);
        org.junit.Assert.assertNotNull(schemaArray14);
        org.junit.Assert.assertArrayEquals(schemaArray14, new org.apache.avro.Schema[] {});
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(schema17);
        org.junit.Assert.assertNotNull(schema18);
        org.junit.Assert.assertNotNull(schema19);
        org.junit.Assert.assertNotNull(schema20);
        org.junit.Assert.assertNotNull(schema21);
    }

    @Test
    public void test0445() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SchemaM3Random300Test0.test0445");
        org.apache.avro.Schema.Names names1 = new org.apache.avro.Schema.Names("union");
        org.apache.avro.Schema[] schemaArray2 = new org.apache.avro.Schema[] {};
        java.util.ArrayList<org.apache.avro.Schema> schemaList3 = new java.util.ArrayList<org.apache.avro.Schema>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<org.apache.avro.Schema>) schemaList3, schemaArray2);
        org.apache.avro.Schema schema5 = org.apache.avro.Schema.createUnion((java.util.List<org.apache.avro.Schema>) schemaList3);
        java.lang.String str6 = schema5.getFullName();
        boolean boolean7 = names1.equals((java.lang.Object) schema5);
        names1.clear();
        org.junit.Assert.assertNotNull(schemaArray2);
        org.junit.Assert.assertArrayEquals(schemaArray2, new org.apache.avro.Schema[] {});
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(schema5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "union" + "'", str6, "union");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test0446() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SchemaM3Random300Test0.test0446");
        org.apache.avro.Schema[] schemaArray0 = new org.apache.avro.Schema[] {};
        java.util.ArrayList<org.apache.avro.Schema> schemaList1 = new java.util.ArrayList<org.apache.avro.Schema>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<org.apache.avro.Schema>) schemaList1, schemaArray0);
        org.apache.avro.Schema schema3 = org.apache.avro.Schema.createUnion((java.util.List<org.apache.avro.Schema>) schemaList1);
        org.apache.avro.Schema[] schemaArray4 = new org.apache.avro.Schema[] {};
        java.util.ArrayList<org.apache.avro.Schema> schemaList5 = new java.util.ArrayList<org.apache.avro.Schema>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<org.apache.avro.Schema>) schemaList5, schemaArray4);
        org.apache.avro.Schema schema7 = org.apache.avro.Schema.createUnion((java.util.List<org.apache.avro.Schema>) schemaList5);
        org.apache.avro.Schema schema8 = org.apache.avro.Schema.applyAliases(schema3, schema7);
        java.util.List<org.apache.avro.Schema> schemaList9 = schema8.getTypes();
        boolean boolean11 = schema8.equals((java.lang.Object) "hi!");
        java.lang.String str12 = schema8.getDoc();
        org.apache.avro.Schema schema13 = org.apache.avro.Schema.createArray(schema8);
        java.lang.String str14 = schema8.toString();
        org.apache.avro.Schema schema15 = org.apache.avro.Schema.createArray(schema8);
        org.apache.avro.Schema.Type type16 = schema15.getType();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.avro.Schema schema17 = org.apache.avro.Schema.create(type16);
            org.junit.Assert.fail("Expected exception of type org.apache.avro.AvroRuntimeException; message: Can't create a: ARRAY");
        } catch (org.apache.avro.AvroRuntimeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(schemaArray0);
        org.junit.Assert.assertArrayEquals(schemaArray0, new org.apache.avro.Schema[] {});
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(schema3);
        org.junit.Assert.assertNotNull(schemaArray4);
        org.junit.Assert.assertArrayEquals(schemaArray4, new org.apache.avro.Schema[] {});
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(schema7);
        org.junit.Assert.assertNotNull(schema8);
        org.junit.Assert.assertNotNull(schemaList9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNotNull(schema13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "[]" + "'", str14, "[]");
        org.junit.Assert.assertNotNull(schema15);
        org.junit.Assert.assertTrue("'" + type16 + "' != '" + org.apache.avro.Schema.Type.ARRAY + "'", type16.equals(org.apache.avro.Schema.Type.ARRAY));
    }

    @Test
    public void test0447() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SchemaM3Random300Test0.test0447");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.avro.Schema schema4 = org.apache.avro.Schema.createFixed("", "{\r\n  \"type\" : \"map\",\r\n  \"values\" : [ ]\r\n}", "{\"type\":\"fixed\",\"name\":\"union\",\"namespace\":\"[]\",\"doc\":\"[ ]\",\"size\":0}", (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type org.apache.avro.SchemaParseException; message: Empty name");
        } catch (org.apache.avro.SchemaParseException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0448() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SchemaM3Random300Test0.test0448");
        org.apache.avro.Schema.Names names1 = new org.apache.avro.Schema.Names("{\"type\":\"map\",\"values\":{\"type\":\"array\",\"items\":{\"type\":\"map\",\"values\":[]},\"\":\"{\\r\\n  \\\"type\\\" : \\\"record\\\",\\r\\n  \\\"fields\\\" : [ ]\\r\\n}\"}}");
    }

    @Test
    public void test0449() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SchemaM3Random300Test0.test0449");
        org.apache.avro.Schema[] schemaArray0 = new org.apache.avro.Schema[] {};
        java.util.ArrayList<org.apache.avro.Schema> schemaList1 = new java.util.ArrayList<org.apache.avro.Schema>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<org.apache.avro.Schema>) schemaList1, schemaArray0);
        org.apache.avro.Schema schema3 = org.apache.avro.Schema.createUnion((java.util.List<org.apache.avro.Schema>) schemaList1);
        java.util.List<org.apache.avro.Schema> schemaList4 = schema3.getTypes();
        org.apache.avro.Schema.Type type5 = schema3.getType();
        java.lang.Object obj6 = null;
        boolean boolean7 = schema3.equals(obj6);
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<java.lang.String> strList8 = schema3.getEnumSymbols();
            org.junit.Assert.fail("Expected exception of type org.apache.avro.AvroRuntimeException; message: Not an enum: []");
        } catch (org.apache.avro.AvroRuntimeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(schemaArray0);
        org.junit.Assert.assertArrayEquals(schemaArray0, new org.apache.avro.Schema[] {});
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(schema3);
        org.junit.Assert.assertNotNull(schemaList4);
        org.junit.Assert.assertTrue("'" + type5 + "' != '" + org.apache.avro.Schema.Type.UNION + "'", type5.equals(org.apache.avro.Schema.Type.UNION));
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test0450() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SchemaM3Random300Test0.test0450");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.avro.Schema schema4 = org.apache.avro.Schema.createFixed("", "map", "{\"type\":\"map\",\"values\":{\"type\":\"array\",\"items\":{\"type\":\"map\",\"values\":[]}}}", 0);
            org.junit.Assert.fail("Expected exception of type org.apache.avro.SchemaParseException; message: Empty name");
        } catch (org.apache.avro.SchemaParseException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0451() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SchemaM3Random300Test0.test0451");
        org.apache.avro.Schema[] schemaArray0 = new org.apache.avro.Schema[] {};
        java.util.ArrayList<org.apache.avro.Schema> schemaList1 = new java.util.ArrayList<org.apache.avro.Schema>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<org.apache.avro.Schema>) schemaList1, schemaArray0);
        org.apache.avro.Schema schema3 = org.apache.avro.Schema.createUnion((java.util.List<org.apache.avro.Schema>) schemaList1);
        org.apache.avro.Schema[] schemaArray4 = new org.apache.avro.Schema[] {};
        java.util.ArrayList<org.apache.avro.Schema> schemaList5 = new java.util.ArrayList<org.apache.avro.Schema>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<org.apache.avro.Schema>) schemaList5, schemaArray4);
        org.apache.avro.Schema schema7 = org.apache.avro.Schema.createUnion((java.util.List<org.apache.avro.Schema>) schemaList5);
        org.apache.avro.Schema schema8 = org.apache.avro.Schema.applyAliases(schema3, schema7);
        java.util.List<org.apache.avro.Schema> schemaList9 = schema8.getTypes();
        org.apache.avro.Schema[] schemaArray10 = new org.apache.avro.Schema[] {};
        java.util.ArrayList<org.apache.avro.Schema> schemaList11 = new java.util.ArrayList<org.apache.avro.Schema>();
        boolean boolean12 = java.util.Collections.addAll((java.util.Collection<org.apache.avro.Schema>) schemaList11, schemaArray10);
        org.apache.avro.Schema schema13 = org.apache.avro.Schema.createUnion((java.util.List<org.apache.avro.Schema>) schemaList11);
        org.apache.avro.Schema[] schemaArray14 = new org.apache.avro.Schema[] {};
        java.util.ArrayList<org.apache.avro.Schema> schemaList15 = new java.util.ArrayList<org.apache.avro.Schema>();
        boolean boolean16 = java.util.Collections.addAll((java.util.Collection<org.apache.avro.Schema>) schemaList15, schemaArray14);
        org.apache.avro.Schema schema17 = org.apache.avro.Schema.createUnion((java.util.List<org.apache.avro.Schema>) schemaList15);
        org.apache.avro.Schema schema18 = org.apache.avro.Schema.applyAliases(schema13, schema17);
        org.apache.avro.Schema schema19 = org.apache.avro.Schema.applyAliases(schema8, schema17);
        org.apache.avro.Schema[] schemaArray20 = new org.apache.avro.Schema[] {};
        java.util.ArrayList<org.apache.avro.Schema> schemaList21 = new java.util.ArrayList<org.apache.avro.Schema>();
        boolean boolean22 = java.util.Collections.addAll((java.util.Collection<org.apache.avro.Schema>) schemaList21, schemaArray20);
        org.apache.avro.Schema schema23 = org.apache.avro.Schema.createUnion((java.util.List<org.apache.avro.Schema>) schemaList21);
        org.apache.avro.Schema[] schemaArray24 = new org.apache.avro.Schema[] {};
        java.util.ArrayList<org.apache.avro.Schema> schemaList25 = new java.util.ArrayList<org.apache.avro.Schema>();
        boolean boolean26 = java.util.Collections.addAll((java.util.Collection<org.apache.avro.Schema>) schemaList25, schemaArray24);
        org.apache.avro.Schema schema27 = org.apache.avro.Schema.createUnion((java.util.List<org.apache.avro.Schema>) schemaList25);
        org.apache.avro.Schema schema28 = org.apache.avro.Schema.applyAliases(schema23, schema27);
        java.util.List<org.apache.avro.Schema> schemaList29 = schema28.getTypes();
        org.apache.avro.Schema[] schemaArray30 = new org.apache.avro.Schema[] {};
        java.util.ArrayList<org.apache.avro.Schema> schemaList31 = new java.util.ArrayList<org.apache.avro.Schema>();
        boolean boolean32 = java.util.Collections.addAll((java.util.Collection<org.apache.avro.Schema>) schemaList31, schemaArray30);
        org.apache.avro.Schema schema33 = org.apache.avro.Schema.createUnion((java.util.List<org.apache.avro.Schema>) schemaList31);
        org.apache.avro.Schema[] schemaArray34 = new org.apache.avro.Schema[] {};
        java.util.ArrayList<org.apache.avro.Schema> schemaList35 = new java.util.ArrayList<org.apache.avro.Schema>();
        boolean boolean36 = java.util.Collections.addAll((java.util.Collection<org.apache.avro.Schema>) schemaList35, schemaArray34);
        org.apache.avro.Schema schema37 = org.apache.avro.Schema.createUnion((java.util.List<org.apache.avro.Schema>) schemaList35);
        org.apache.avro.Schema schema38 = org.apache.avro.Schema.applyAliases(schema33, schema37);
        org.apache.avro.Schema schema39 = org.apache.avro.Schema.applyAliases(schema28, schema37);
        org.apache.avro.Schema schema40 = org.apache.avro.Schema.applyAliases(schema8, schema28);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.avro.Schema schema41 = schema40.getValueType();
            org.junit.Assert.fail("Expected exception of type org.apache.avro.AvroRuntimeException; message: Not a map: []");
        } catch (org.apache.avro.AvroRuntimeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(schemaArray0);
        org.junit.Assert.assertArrayEquals(schemaArray0, new org.apache.avro.Schema[] {});
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(schema3);
        org.junit.Assert.assertNotNull(schemaArray4);
        org.junit.Assert.assertArrayEquals(schemaArray4, new org.apache.avro.Schema[] {});
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(schema7);
        org.junit.Assert.assertNotNull(schema8);
        org.junit.Assert.assertNotNull(schemaList9);
        org.junit.Assert.assertNotNull(schemaArray10);
        org.junit.Assert.assertArrayEquals(schemaArray10, new org.apache.avro.Schema[] {});
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(schema13);
        org.junit.Assert.assertNotNull(schemaArray14);
        org.junit.Assert.assertArrayEquals(schemaArray14, new org.apache.avro.Schema[] {});
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(schema17);
        org.junit.Assert.assertNotNull(schema18);
        org.junit.Assert.assertNotNull(schema19);
        org.junit.Assert.assertNotNull(schemaArray20);
        org.junit.Assert.assertArrayEquals(schemaArray20, new org.apache.avro.Schema[] {});
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(schema23);
        org.junit.Assert.assertNotNull(schemaArray24);
        org.junit.Assert.assertArrayEquals(schemaArray24, new org.apache.avro.Schema[] {});
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(schema27);
        org.junit.Assert.assertNotNull(schema28);
        org.junit.Assert.assertNotNull(schemaList29);
        org.junit.Assert.assertNotNull(schemaArray30);
        org.junit.Assert.assertArrayEquals(schemaArray30, new org.apache.avro.Schema[] {});
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertNotNull(schema33);
        org.junit.Assert.assertNotNull(schemaArray34);
        org.junit.Assert.assertArrayEquals(schemaArray34, new org.apache.avro.Schema[] {});
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertNotNull(schema37);
        org.junit.Assert.assertNotNull(schema38);
        org.junit.Assert.assertNotNull(schema39);
        org.junit.Assert.assertNotNull(schema40);
    }

    @Test
    public void test0452() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SchemaM3Random300Test0.test0452");
        org.apache.avro.Schema[] schemaArray0 = new org.apache.avro.Schema[] {};
        java.util.ArrayList<org.apache.avro.Schema> schemaList1 = new java.util.ArrayList<org.apache.avro.Schema>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<org.apache.avro.Schema>) schemaList1, schemaArray0);
        org.apache.avro.Schema schema3 = org.apache.avro.Schema.createUnion((java.util.List<org.apache.avro.Schema>) schemaList1);
        org.apache.avro.Schema[] schemaArray4 = new org.apache.avro.Schema[] {};
        java.util.ArrayList<org.apache.avro.Schema> schemaList5 = new java.util.ArrayList<org.apache.avro.Schema>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<org.apache.avro.Schema>) schemaList5, schemaArray4);
        org.apache.avro.Schema schema7 = org.apache.avro.Schema.createUnion((java.util.List<org.apache.avro.Schema>) schemaList5);
        org.apache.avro.Schema schema8 = org.apache.avro.Schema.applyAliases(schema3, schema7);
        java.util.List<org.apache.avro.Schema> schemaList9 = schema8.getTypes();
        java.lang.String str11 = schema8.getProp("");
        org.apache.avro.Schema[] schemaArray12 = new org.apache.avro.Schema[] {};
        java.util.ArrayList<org.apache.avro.Schema> schemaList13 = new java.util.ArrayList<org.apache.avro.Schema>();
        boolean boolean14 = java.util.Collections.addAll((java.util.Collection<org.apache.avro.Schema>) schemaList13, schemaArray12);
        org.apache.avro.Schema schema15 = org.apache.avro.Schema.createUnion((java.util.List<org.apache.avro.Schema>) schemaList13);
        org.apache.avro.Schema[] schemaArray16 = new org.apache.avro.Schema[] {};
        java.util.ArrayList<org.apache.avro.Schema> schemaList17 = new java.util.ArrayList<org.apache.avro.Schema>();
        boolean boolean18 = java.util.Collections.addAll((java.util.Collection<org.apache.avro.Schema>) schemaList17, schemaArray16);
        org.apache.avro.Schema schema19 = org.apache.avro.Schema.createUnion((java.util.List<org.apache.avro.Schema>) schemaList17);
        org.apache.avro.Schema schema20 = org.apache.avro.Schema.applyAliases(schema15, schema19);
        java.util.List<org.apache.avro.Schema> schemaList21 = schema20.getTypes();
        org.apache.avro.Schema[] schemaArray22 = new org.apache.avro.Schema[] {};
        java.util.ArrayList<org.apache.avro.Schema> schemaList23 = new java.util.ArrayList<org.apache.avro.Schema>();
        boolean boolean24 = java.util.Collections.addAll((java.util.Collection<org.apache.avro.Schema>) schemaList23, schemaArray22);
        org.apache.avro.Schema schema25 = org.apache.avro.Schema.createUnion((java.util.List<org.apache.avro.Schema>) schemaList23);
        org.apache.avro.Schema[] schemaArray26 = new org.apache.avro.Schema[] {};
        java.util.ArrayList<org.apache.avro.Schema> schemaList27 = new java.util.ArrayList<org.apache.avro.Schema>();
        boolean boolean28 = java.util.Collections.addAll((java.util.Collection<org.apache.avro.Schema>) schemaList27, schemaArray26);
        org.apache.avro.Schema schema29 = org.apache.avro.Schema.createUnion((java.util.List<org.apache.avro.Schema>) schemaList27);
        org.apache.avro.Schema schema30 = org.apache.avro.Schema.applyAliases(schema25, schema29);
        org.apache.avro.Schema schema31 = org.apache.avro.Schema.applyAliases(schema20, schema29);
        org.apache.avro.Schema schema32 = org.apache.avro.Schema.createMap(schema29);
        java.util.List<org.apache.avro.Schema> schemaList33 = schema29.getTypes();
        org.apache.avro.Schema schema34 = org.apache.avro.Schema.applyAliases(schema8, schema29);
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<java.lang.String> strList35 = schema8.getEnumSymbols();
            org.junit.Assert.fail("Expected exception of type org.apache.avro.AvroRuntimeException; message: Not an enum: []");
        } catch (org.apache.avro.AvroRuntimeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(schemaArray0);
        org.junit.Assert.assertArrayEquals(schemaArray0, new org.apache.avro.Schema[] {});
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(schema3);
        org.junit.Assert.assertNotNull(schemaArray4);
        org.junit.Assert.assertArrayEquals(schemaArray4, new org.apache.avro.Schema[] {});
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(schema7);
        org.junit.Assert.assertNotNull(schema8);
        org.junit.Assert.assertNotNull(schemaList9);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNotNull(schemaArray12);
        org.junit.Assert.assertArrayEquals(schemaArray12, new org.apache.avro.Schema[] {});
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(schema15);
        org.junit.Assert.assertNotNull(schemaArray16);
        org.junit.Assert.assertArrayEquals(schemaArray16, new org.apache.avro.Schema[] {});
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(schema19);
        org.junit.Assert.assertNotNull(schema20);
        org.junit.Assert.assertNotNull(schemaList21);
        org.junit.Assert.assertNotNull(schemaArray22);
        org.junit.Assert.assertArrayEquals(schemaArray22, new org.apache.avro.Schema[] {});
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(schema25);
        org.junit.Assert.assertNotNull(schemaArray26);
        org.junit.Assert.assertArrayEquals(schemaArray26, new org.apache.avro.Schema[] {});
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNotNull(schema29);
        org.junit.Assert.assertNotNull(schema30);
        org.junit.Assert.assertNotNull(schema31);
        org.junit.Assert.assertNotNull(schema32);
        org.junit.Assert.assertNotNull(schemaList33);
        org.junit.Assert.assertNotNull(schema34);
    }

    @Test
    public void test0453() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SchemaM3Random300Test0.test0453");
        org.apache.avro.Schema.Field[] fieldArray0 = new org.apache.avro.Schema.Field[] {};
        java.util.ArrayList<org.apache.avro.Schema.Field> fieldList1 = new java.util.ArrayList<org.apache.avro.Schema.Field>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<org.apache.avro.Schema.Field>) fieldList1, fieldArray0);
        org.apache.avro.Schema schema3 = org.apache.avro.Schema.createRecord((java.util.List<org.apache.avro.Schema.Field>) fieldList1);
        org.apache.avro.Schema schema4 = org.apache.avro.Schema.createRecord((java.util.List<org.apache.avro.Schema.Field>) fieldList1);
        org.apache.avro.Schema schema5 = org.apache.avro.Schema.createArray(schema4);
        schema4.addAlias("float");
        org.junit.Assert.assertNotNull(fieldArray0);
        org.junit.Assert.assertArrayEquals(fieldArray0, new org.apache.avro.Schema.Field[] {});
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(schema3);
        org.junit.Assert.assertNotNull(schema4);
        org.junit.Assert.assertNotNull(schema5);
    }

    @Test
    public void test0454() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SchemaM3Random300Test0.test0454");
        org.apache.avro.Schema.Names names0 = new org.apache.avro.Schema.Names();
        java.lang.String str1 = names0.space();
        int int2 = names0.size();
        java.lang.String str3 = names0.toString();
        org.apache.avro.Schema[] schemaArray4 = new org.apache.avro.Schema[] {};
        java.util.ArrayList<org.apache.avro.Schema> schemaList5 = new java.util.ArrayList<org.apache.avro.Schema>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<org.apache.avro.Schema>) schemaList5, schemaArray4);
        org.apache.avro.Schema schema7 = org.apache.avro.Schema.createUnion((java.util.List<org.apache.avro.Schema>) schemaList5);
        org.apache.avro.Schema[] schemaArray8 = new org.apache.avro.Schema[] {};
        java.util.ArrayList<org.apache.avro.Schema> schemaList9 = new java.util.ArrayList<org.apache.avro.Schema>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<org.apache.avro.Schema>) schemaList9, schemaArray8);
        org.apache.avro.Schema schema11 = org.apache.avro.Schema.createUnion((java.util.List<org.apache.avro.Schema>) schemaList9);
        org.apache.avro.Schema schema12 = org.apache.avro.Schema.applyAliases(schema7, schema11);
        java.util.List<org.apache.avro.Schema> schemaList13 = schema12.getTypes();
        org.apache.avro.Schema[] schemaArray14 = new org.apache.avro.Schema[] {};
        java.util.ArrayList<org.apache.avro.Schema> schemaList15 = new java.util.ArrayList<org.apache.avro.Schema>();
        boolean boolean16 = java.util.Collections.addAll((java.util.Collection<org.apache.avro.Schema>) schemaList15, schemaArray14);
        org.apache.avro.Schema schema17 = org.apache.avro.Schema.createUnion((java.util.List<org.apache.avro.Schema>) schemaList15);
        org.apache.avro.Schema[] schemaArray18 = new org.apache.avro.Schema[] {};
        java.util.ArrayList<org.apache.avro.Schema> schemaList19 = new java.util.ArrayList<org.apache.avro.Schema>();
        boolean boolean20 = java.util.Collections.addAll((java.util.Collection<org.apache.avro.Schema>) schemaList19, schemaArray18);
        org.apache.avro.Schema schema21 = org.apache.avro.Schema.createUnion((java.util.List<org.apache.avro.Schema>) schemaList19);
        org.apache.avro.Schema schema22 = org.apache.avro.Schema.applyAliases(schema17, schema21);
        org.apache.avro.Schema schema23 = org.apache.avro.Schema.applyAliases(schema12, schema21);
        java.util.List<org.apache.avro.Schema> schemaList24 = schema12.getTypes();
        java.lang.String str26 = schema12.toString(false);
        org.apache.avro.Schema.Type type27 = schema12.getType();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean28 = names0.contains(schema12);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: org.apache.avro.Schema$UnionSchema cannot be cast to org.apache.avro.Schema$NamedSchema");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "{}" + "'", str3, "{}");
        org.junit.Assert.assertNotNull(schemaArray4);
        org.junit.Assert.assertArrayEquals(schemaArray4, new org.apache.avro.Schema[] {});
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(schema7);
        org.junit.Assert.assertNotNull(schemaArray8);
        org.junit.Assert.assertArrayEquals(schemaArray8, new org.apache.avro.Schema[] {});
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(schema11);
        org.junit.Assert.assertNotNull(schema12);
        org.junit.Assert.assertNotNull(schemaList13);
        org.junit.Assert.assertNotNull(schemaArray14);
        org.junit.Assert.assertArrayEquals(schemaArray14, new org.apache.avro.Schema[] {});
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(schema17);
        org.junit.Assert.assertNotNull(schemaArray18);
        org.junit.Assert.assertArrayEquals(schemaArray18, new org.apache.avro.Schema[] {});
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(schema21);
        org.junit.Assert.assertNotNull(schema22);
        org.junit.Assert.assertNotNull(schema23);
        org.junit.Assert.assertNotNull(schemaList24);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "[]" + "'", str26, "[]");
        org.junit.Assert.assertTrue("'" + type27 + "' != '" + org.apache.avro.Schema.Type.UNION + "'", type27.equals(org.apache.avro.Schema.Type.UNION));
    }

    @Test
    public void test0455() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SchemaM3Random300Test0.test0455");
        org.apache.avro.Schema.LockableArrayList<java.lang.String> strList4 = new org.apache.avro.Schema.LockableArrayList<java.lang.String>((int) (byte) 10);
        org.apache.avro.Schema.LockableArrayList<java.lang.String> strList5 = new org.apache.avro.Schema.LockableArrayList<java.lang.String>((java.util.List<java.lang.String>) strList4);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.avro.Schema schema6 = org.apache.avro.Schema.createEnum("{\"type\":\"map\",\"values\":{\"type\":\"array\",\"items\":{\"type\":\"map\",\"values\":[]},\"\":\"{\\r\\n  \\\"type\\\" : \\\"record\\\",\\r\\n  \\\"fields\\\" : [ ]\\r\\n}\"}}", "[ ]", "{\r\n  \"type\" : \"array\",\r\n  \"items\" : {\r\n    \"type\" : \"map\",\r\n    \"values\" : [ ]\r\n  }\r\n}", (java.util.List<java.lang.String>) strList4);
            org.junit.Assert.fail("Expected exception of type org.apache.avro.SchemaParseException; message: Illegal initial character: {\"type\":\"map\",\"values\":{\"type\":\"array\",\"items\":{\"type\":\"map\",\"values\":[]},\"\":\"{\\r\\n  \\\"type\\\" : \\\"record\\\",\\r\\n  \\\"fields\\\" : [ ]\\r\\n}\"}}");
        } catch (org.apache.avro.SchemaParseException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0456() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SchemaM3Random300Test0.test0456");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.avro.Schema schema4 = org.apache.avro.Schema.createRecord("{\r\n  \"type\" : \"map\",\r\n  \"values\" : [ ]\r\n}", "{\"type\":\"fixed\",\"name\":\"union\",\"namespace\":\"[]\",\"doc\":\"[ ]\",\"size\":0}", "{\"type\":\"array\",\"items\":\"int\"}", false);
            org.junit.Assert.fail("Expected exception of type org.apache.avro.SchemaParseException; message: Illegal initial character: {??  \"type\" : \"map\",??  \"values\" : [ ]??}");
        } catch (org.apache.avro.SchemaParseException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0457() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SchemaM3Random300Test0.test0457");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.avro.Schema schema4 = org.apache.avro.Schema.createFixed("{}", "{\"type\":\"map\",\"values\":{\"type\":\"array\",\"items\":{\"type\":\"map\",\"values\":[]}}}", "union type:UNION pos:-1", (int) '#');
            org.junit.Assert.fail("Expected exception of type org.apache.avro.SchemaParseException; message: Illegal initial character: {}");
        } catch (org.apache.avro.SchemaParseException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0458() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SchemaM3Random300Test0.test0458");
        org.apache.avro.Schema[] schemaArray0 = new org.apache.avro.Schema[] {};
        java.util.ArrayList<org.apache.avro.Schema> schemaList1 = new java.util.ArrayList<org.apache.avro.Schema>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<org.apache.avro.Schema>) schemaList1, schemaArray0);
        org.apache.avro.Schema schema3 = org.apache.avro.Schema.createUnion((java.util.List<org.apache.avro.Schema>) schemaList1);
        org.apache.avro.Schema[] schemaArray4 = new org.apache.avro.Schema[] {};
        java.util.ArrayList<org.apache.avro.Schema> schemaList5 = new java.util.ArrayList<org.apache.avro.Schema>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<org.apache.avro.Schema>) schemaList5, schemaArray4);
        org.apache.avro.Schema schema7 = org.apache.avro.Schema.createUnion((java.util.List<org.apache.avro.Schema>) schemaList5);
        org.apache.avro.Schema schema8 = org.apache.avro.Schema.applyAliases(schema3, schema7);
        java.util.List<org.apache.avro.Schema> schemaList9 = schema8.getTypes();
        org.apache.avro.Schema[] schemaArray10 = new org.apache.avro.Schema[] {};
        java.util.ArrayList<org.apache.avro.Schema> schemaList11 = new java.util.ArrayList<org.apache.avro.Schema>();
        boolean boolean12 = java.util.Collections.addAll((java.util.Collection<org.apache.avro.Schema>) schemaList11, schemaArray10);
        org.apache.avro.Schema schema13 = org.apache.avro.Schema.createUnion((java.util.List<org.apache.avro.Schema>) schemaList11);
        org.apache.avro.Schema[] schemaArray14 = new org.apache.avro.Schema[] {};
        java.util.ArrayList<org.apache.avro.Schema> schemaList15 = new java.util.ArrayList<org.apache.avro.Schema>();
        boolean boolean16 = java.util.Collections.addAll((java.util.Collection<org.apache.avro.Schema>) schemaList15, schemaArray14);
        org.apache.avro.Schema schema17 = org.apache.avro.Schema.createUnion((java.util.List<org.apache.avro.Schema>) schemaList15);
        org.apache.avro.Schema schema18 = org.apache.avro.Schema.applyAliases(schema13, schema17);
        org.apache.avro.Schema schema19 = org.apache.avro.Schema.applyAliases(schema8, schema17);
        org.apache.avro.Schema schema20 = org.apache.avro.Schema.createMap(schema8);
        org.apache.avro.Schema schema21 = schema20.getValueType();
        java.lang.String str22 = schema20.getDoc();
        java.lang.String str23 = schema20.getName();
        java.lang.String str24 = schema20.getName();
        org.junit.Assert.assertNotNull(schemaArray0);
        org.junit.Assert.assertArrayEquals(schemaArray0, new org.apache.avro.Schema[] {});
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(schema3);
        org.junit.Assert.assertNotNull(schemaArray4);
        org.junit.Assert.assertArrayEquals(schemaArray4, new org.apache.avro.Schema[] {});
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(schema7);
        org.junit.Assert.assertNotNull(schema8);
        org.junit.Assert.assertNotNull(schemaList9);
        org.junit.Assert.assertNotNull(schemaArray10);
        org.junit.Assert.assertArrayEquals(schemaArray10, new org.apache.avro.Schema[] {});
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(schema13);
        org.junit.Assert.assertNotNull(schemaArray14);
        org.junit.Assert.assertArrayEquals(schemaArray14, new org.apache.avro.Schema[] {});
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(schema17);
        org.junit.Assert.assertNotNull(schema18);
        org.junit.Assert.assertNotNull(schema19);
        org.junit.Assert.assertNotNull(schema20);
        org.junit.Assert.assertNotNull(schema21);
        org.junit.Assert.assertNull(str22);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "map" + "'", str23, "map");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "map" + "'", str24, "map");
    }

    @Test
    public void test0459() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SchemaM3Random300Test0.test0459");
        org.apache.avro.Schema[] schemaArray0 = new org.apache.avro.Schema[] {};
        java.util.ArrayList<org.apache.avro.Schema> schemaList1 = new java.util.ArrayList<org.apache.avro.Schema>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<org.apache.avro.Schema>) schemaList1, schemaArray0);
        org.apache.avro.Schema schema3 = org.apache.avro.Schema.createUnion((java.util.List<org.apache.avro.Schema>) schemaList1);
        org.apache.avro.Schema[] schemaArray4 = new org.apache.avro.Schema[] {};
        java.util.ArrayList<org.apache.avro.Schema> schemaList5 = new java.util.ArrayList<org.apache.avro.Schema>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<org.apache.avro.Schema>) schemaList5, schemaArray4);
        org.apache.avro.Schema schema7 = org.apache.avro.Schema.createUnion((java.util.List<org.apache.avro.Schema>) schemaList5);
        org.apache.avro.Schema schema8 = org.apache.avro.Schema.applyAliases(schema3, schema7);
        java.util.List<org.apache.avro.Schema> schemaList9 = schema8.getTypes();
        org.apache.avro.Schema[] schemaArray10 = new org.apache.avro.Schema[] {};
        java.util.ArrayList<org.apache.avro.Schema> schemaList11 = new java.util.ArrayList<org.apache.avro.Schema>();
        boolean boolean12 = java.util.Collections.addAll((java.util.Collection<org.apache.avro.Schema>) schemaList11, schemaArray10);
        org.apache.avro.Schema schema13 = org.apache.avro.Schema.createUnion((java.util.List<org.apache.avro.Schema>) schemaList11);
        org.apache.avro.Schema[] schemaArray14 = new org.apache.avro.Schema[] {};
        java.util.ArrayList<org.apache.avro.Schema> schemaList15 = new java.util.ArrayList<org.apache.avro.Schema>();
        boolean boolean16 = java.util.Collections.addAll((java.util.Collection<org.apache.avro.Schema>) schemaList15, schemaArray14);
        org.apache.avro.Schema schema17 = org.apache.avro.Schema.createUnion((java.util.List<org.apache.avro.Schema>) schemaList15);
        org.apache.avro.Schema schema18 = org.apache.avro.Schema.applyAliases(schema13, schema17);
        org.apache.avro.Schema schema19 = org.apache.avro.Schema.applyAliases(schema8, schema17);
        org.apache.avro.Schema schema20 = org.apache.avro.Schema.createMap(schema8);
        java.lang.String str22 = schema8.toString(true);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean24 = schema8.hasEnumSymbol("{\"type\":\"array\",\"items\":\"int\"}");
            org.junit.Assert.fail("Expected exception of type org.apache.avro.AvroRuntimeException; message: Not an enum: []");
        } catch (org.apache.avro.AvroRuntimeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(schemaArray0);
        org.junit.Assert.assertArrayEquals(schemaArray0, new org.apache.avro.Schema[] {});
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(schema3);
        org.junit.Assert.assertNotNull(schemaArray4);
        org.junit.Assert.assertArrayEquals(schemaArray4, new org.apache.avro.Schema[] {});
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(schema7);
        org.junit.Assert.assertNotNull(schema8);
        org.junit.Assert.assertNotNull(schemaList9);
        org.junit.Assert.assertNotNull(schemaArray10);
        org.junit.Assert.assertArrayEquals(schemaArray10, new org.apache.avro.Schema[] {});
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(schema13);
        org.junit.Assert.assertNotNull(schemaArray14);
        org.junit.Assert.assertArrayEquals(schemaArray14, new org.apache.avro.Schema[] {});
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(schema17);
        org.junit.Assert.assertNotNull(schema18);
        org.junit.Assert.assertNotNull(schema19);
        org.junit.Assert.assertNotNull(schema20);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "[ ]" + "'", str22, "[ ]");
    }

    @Test
    public void test0460() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SchemaM3Random300Test0.test0460");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.avro.Schema schema4 = org.apache.avro.Schema.createRecord("{\r\n  \"type\" : \"map\",\r\n  \"values\" : {\r\n    \"type\" : \"map\",\r\n    \"values\" : [ ]\r\n  }\r\n}", "{\"type\":\"map\",\"values\":{\"type\":\"array\",\"items\":{\"type\":\"map\",\"values\":[]}}}", "{\"type\":\"fixed\",\"name\":\"union\",\"namespace\":\"[]\",\"doc\":\"[ ]\",\"size\":0}", false);
            org.junit.Assert.fail("Expected exception of type org.apache.avro.SchemaParseException; message: Illegal initial character: {??  \"type\" : \"map\",??  \"values\" : {??    \"type\" : \"map\",??    \"values\" : [ ]??  }??}");
        } catch (org.apache.avro.SchemaParseException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0461() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SchemaM3Random300Test0.test0461");
        org.apache.avro.Schema schema1 = null;
        org.apache.avro.Schema schema2 = org.apache.avro.Schema.createMap(schema1);
        org.codehaus.jackson.JsonNode jsonNode5 = org.apache.avro.Schema.parseJson("{\"type\":\"array\",\"items\":\"int\"}");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.avro.Schema.Field field6 = new org.apache.avro.Schema.Field("hi!", schema1, "union type:UNION pos:-1", jsonNode5);
            org.junit.Assert.fail("Expected exception of type org.apache.avro.SchemaParseException; message: Illegal character in: hi!");
        } catch (org.apache.avro.SchemaParseException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(schema2);
        org.junit.Assert.assertNotNull(jsonNode5);
    }

    @Test
    public void test0462() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SchemaM3Random300Test0.test0462");
        org.apache.avro.Schema.LockableArrayList<java.lang.String> strList4 = new org.apache.avro.Schema.LockableArrayList<java.lang.String>((int) (short) 10);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.avro.Schema schema5 = org.apache.avro.Schema.createEnum("", "{\"type\":\"fixed\",\"name\":\"union\",\"namespace\":\"[]\",\"doc\":\"[ ]\",\"size\":0}", "{\"type\":\"array\",\"items\":{\"type\":\"map\",\"values\":[]}}", (java.util.List<java.lang.String>) strList4);
            org.junit.Assert.fail("Expected exception of type org.apache.avro.SchemaParseException; message: Empty name");
        } catch (org.apache.avro.SchemaParseException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0463() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SchemaM3Random300Test0.test0463");
        org.apache.avro.Schema[] schemaArray0 = new org.apache.avro.Schema[] {};
        java.util.ArrayList<org.apache.avro.Schema> schemaList1 = new java.util.ArrayList<org.apache.avro.Schema>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<org.apache.avro.Schema>) schemaList1, schemaArray0);
        org.apache.avro.Schema schema3 = org.apache.avro.Schema.createUnion((java.util.List<org.apache.avro.Schema>) schemaList1);
        org.apache.avro.Schema[] schemaArray4 = new org.apache.avro.Schema[] {};
        java.util.ArrayList<org.apache.avro.Schema> schemaList5 = new java.util.ArrayList<org.apache.avro.Schema>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<org.apache.avro.Schema>) schemaList5, schemaArray4);
        org.apache.avro.Schema schema7 = org.apache.avro.Schema.createUnion((java.util.List<org.apache.avro.Schema>) schemaList5);
        org.apache.avro.Schema schema8 = org.apache.avro.Schema.applyAliases(schema3, schema7);
        java.util.List<org.apache.avro.Schema> schemaList9 = schema8.getTypes();
        org.apache.avro.Schema[] schemaArray10 = new org.apache.avro.Schema[] {};
        java.util.ArrayList<org.apache.avro.Schema> schemaList11 = new java.util.ArrayList<org.apache.avro.Schema>();
        boolean boolean12 = java.util.Collections.addAll((java.util.Collection<org.apache.avro.Schema>) schemaList11, schemaArray10);
        org.apache.avro.Schema schema13 = org.apache.avro.Schema.createUnion((java.util.List<org.apache.avro.Schema>) schemaList11);
        org.apache.avro.Schema[] schemaArray14 = new org.apache.avro.Schema[] {};
        java.util.ArrayList<org.apache.avro.Schema> schemaList15 = new java.util.ArrayList<org.apache.avro.Schema>();
        boolean boolean16 = java.util.Collections.addAll((java.util.Collection<org.apache.avro.Schema>) schemaList15, schemaArray14);
        org.apache.avro.Schema schema17 = org.apache.avro.Schema.createUnion((java.util.List<org.apache.avro.Schema>) schemaList15);
        org.apache.avro.Schema schema18 = org.apache.avro.Schema.applyAliases(schema13, schema17);
        org.apache.avro.Schema schema19 = org.apache.avro.Schema.applyAliases(schema8, schema17);
        java.util.List<org.apache.avro.Schema> schemaList20 = schema8.getTypes();
        // The following exception was thrown during execution in test generation
        try {
            schema8.addAlias("{null={\"type\":\"fixed\",\"name\":\"union\",\"namespace\":\"[]\",\"doc\":\"[ ]\",\"size\":0}}");
            org.junit.Assert.fail("Expected exception of type org.apache.avro.AvroRuntimeException; message: Not a named type: []");
        } catch (org.apache.avro.AvroRuntimeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(schemaArray0);
        org.junit.Assert.assertArrayEquals(schemaArray0, new org.apache.avro.Schema[] {});
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(schema3);
        org.junit.Assert.assertNotNull(schemaArray4);
        org.junit.Assert.assertArrayEquals(schemaArray4, new org.apache.avro.Schema[] {});
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(schema7);
        org.junit.Assert.assertNotNull(schema8);
        org.junit.Assert.assertNotNull(schemaList9);
        org.junit.Assert.assertNotNull(schemaArray10);
        org.junit.Assert.assertArrayEquals(schemaArray10, new org.apache.avro.Schema[] {});
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(schema13);
        org.junit.Assert.assertNotNull(schemaArray14);
        org.junit.Assert.assertArrayEquals(schemaArray14, new org.apache.avro.Schema[] {});
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(schema17);
        org.junit.Assert.assertNotNull(schema18);
        org.junit.Assert.assertNotNull(schema19);
        org.junit.Assert.assertNotNull(schemaList20);
    }

    @Test
    public void test0464() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SchemaM3Random300Test0.test0464");
        org.apache.avro.Schema schema1 = null;
        org.codehaus.jackson.JsonNode jsonNode4 = org.apache.avro.Schema.parseJson("{\"type\":\"map\",\"values\":[]}");
        org.apache.avro.Schema.Field.Order order5 = org.apache.avro.Schema.Field.Order.DESCENDING;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.avro.Schema.Field field6 = new org.apache.avro.Schema.Field("{\"type\":\"fixed\",\"name\":\"union\",\"namespace\":\"[]\",\"doc\":\"[ ]\",\"size\":0}", schema1, "{\"type\":\"record\",\"fields\":[]}", jsonNode4, order5);
            org.junit.Assert.fail("Expected exception of type org.apache.avro.SchemaParseException; message: Illegal initial character: {\"type\":\"fixed\",\"name\":\"union\",\"namespace\":\"[]\",\"doc\":\"[ ]\",\"size\":0}");
        } catch (org.apache.avro.SchemaParseException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(jsonNode4);
        org.junit.Assert.assertTrue("'" + order5 + "' != '" + org.apache.avro.Schema.Field.Order.DESCENDING + "'", order5.equals(org.apache.avro.Schema.Field.Order.DESCENDING));
    }

    @Test
    public void test0465() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SchemaM3Random300Test0.test0465");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.avro.Schema schema4 = org.apache.avro.Schema.createFixed("{\"type\":\"map\",\"values\":{\"type\":\"array\",\"items\":{\"type\":\"map\",\"values\":[]},\"\":\"{\\r\\n  \\\"type\\\" : \\\"record\\\",\\r\\n  \\\"fields\\\" : [ ]\\r\\n}\"}}", "{\"type\":\"array\",\"items\":[]}", "[]", (-1));
            org.junit.Assert.fail("Expected exception of type org.apache.avro.SchemaParseException; message: Illegal initial character: {\"type\":\"map\",\"values\":{\"type\":\"array\",\"items\":{\"type\":\"map\",\"values\":[]},\"\":\"{\\r\\n  \\\"type\\\" : \\\"record\\\",\\r\\n  \\\"fields\\\" : [ ]\\r\\n}\"}}");
        } catch (org.apache.avro.SchemaParseException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0466() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SchemaM3Random300Test0.test0466");
        org.apache.avro.Schema schema4 = org.apache.avro.Schema.createRecord("float", "{\"type\":\"array\",\"items\":[]}", "float", true);
        org.apache.avro.Schema.Names names6 = new org.apache.avro.Schema.Names("union type:UNION pos:-1");
        org.codehaus.jackson.JsonFactory jsonFactory7 = org.apache.avro.Schema.FACTORY;
        boolean boolean8 = names6.containsValue((java.lang.Object) jsonFactory7);
        org.codehaus.jackson.JsonGenerator jsonGenerator9 = null;
        // The following exception was thrown during execution in test generation
        try {
            schema4.fieldsToJson(names6, jsonGenerator9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(schema4);
        org.junit.Assert.assertNotNull(jsonFactory7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test0467() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SchemaM3Random300Test0.test0467");
        org.apache.avro.Schema.Type type0 = org.apache.avro.Schema.Type.FLOAT;
        org.apache.avro.Schema schema1 = org.apache.avro.Schema.create(type0);
        org.apache.avro.Schema schema2 = org.apache.avro.Schema.create(type0);
        // The following exception was thrown during execution in test generation
        try {
            int int3 = schema2.getFixedSize();
            org.junit.Assert.fail("Expected exception of type org.apache.avro.AvroRuntimeException; message: Not fixed: \"float\"");
        } catch (org.apache.avro.AvroRuntimeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + type0 + "' != '" + org.apache.avro.Schema.Type.FLOAT + "'", type0.equals(org.apache.avro.Schema.Type.FLOAT));
        org.junit.Assert.assertNotNull(schema1);
        org.junit.Assert.assertNotNull(schema2);
    }

    @Test
    public void test0468() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SchemaM3Random300Test0.test0468");
        org.apache.avro.Schema[] schemaArray0 = new org.apache.avro.Schema[] {};
        java.util.ArrayList<org.apache.avro.Schema> schemaList1 = new java.util.ArrayList<org.apache.avro.Schema>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<org.apache.avro.Schema>) schemaList1, schemaArray0);
        org.apache.avro.Schema schema3 = org.apache.avro.Schema.createUnion((java.util.List<org.apache.avro.Schema>) schemaList1);
        org.apache.avro.Schema[] schemaArray4 = new org.apache.avro.Schema[] {};
        java.util.ArrayList<org.apache.avro.Schema> schemaList5 = new java.util.ArrayList<org.apache.avro.Schema>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<org.apache.avro.Schema>) schemaList5, schemaArray4);
        org.apache.avro.Schema schema7 = org.apache.avro.Schema.createUnion((java.util.List<org.apache.avro.Schema>) schemaList5);
        org.apache.avro.Schema schema8 = org.apache.avro.Schema.applyAliases(schema3, schema7);
        java.util.List<org.apache.avro.Schema> schemaList9 = schema8.getTypes();
        org.apache.avro.Schema[] schemaArray10 = new org.apache.avro.Schema[] {};
        java.util.ArrayList<org.apache.avro.Schema> schemaList11 = new java.util.ArrayList<org.apache.avro.Schema>();
        boolean boolean12 = java.util.Collections.addAll((java.util.Collection<org.apache.avro.Schema>) schemaList11, schemaArray10);
        org.apache.avro.Schema schema13 = org.apache.avro.Schema.createUnion((java.util.List<org.apache.avro.Schema>) schemaList11);
        org.apache.avro.Schema[] schemaArray14 = new org.apache.avro.Schema[] {};
        java.util.ArrayList<org.apache.avro.Schema> schemaList15 = new java.util.ArrayList<org.apache.avro.Schema>();
        boolean boolean16 = java.util.Collections.addAll((java.util.Collection<org.apache.avro.Schema>) schemaList15, schemaArray14);
        org.apache.avro.Schema schema17 = org.apache.avro.Schema.createUnion((java.util.List<org.apache.avro.Schema>) schemaList15);
        org.apache.avro.Schema schema18 = org.apache.avro.Schema.applyAliases(schema13, schema17);
        org.apache.avro.Schema schema19 = org.apache.avro.Schema.applyAliases(schema8, schema17);
        org.apache.avro.Schema schema20 = org.apache.avro.Schema.createMap(schema8);
        java.lang.String str22 = schema8.toString(true);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean24 = schema8.hasEnumSymbol("{\r\n  \"type\" : \"fixed\",\r\n  \"name\" : \"union\",\r\n  \"namespace\" : \"[]\",\r\n  \"doc\" : \"[ ]\",\r\n  \"size\" : 0\r\n}");
            org.junit.Assert.fail("Expected exception of type org.apache.avro.AvroRuntimeException; message: Not an enum: []");
        } catch (org.apache.avro.AvroRuntimeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(schemaArray0);
        org.junit.Assert.assertArrayEquals(schemaArray0, new org.apache.avro.Schema[] {});
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(schema3);
        org.junit.Assert.assertNotNull(schemaArray4);
        org.junit.Assert.assertArrayEquals(schemaArray4, new org.apache.avro.Schema[] {});
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(schema7);
        org.junit.Assert.assertNotNull(schema8);
        org.junit.Assert.assertNotNull(schemaList9);
        org.junit.Assert.assertNotNull(schemaArray10);
        org.junit.Assert.assertArrayEquals(schemaArray10, new org.apache.avro.Schema[] {});
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(schema13);
        org.junit.Assert.assertNotNull(schemaArray14);
        org.junit.Assert.assertArrayEquals(schemaArray14, new org.apache.avro.Schema[] {});
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(schema17);
        org.junit.Assert.assertNotNull(schema18);
        org.junit.Assert.assertNotNull(schema19);
        org.junit.Assert.assertNotNull(schema20);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "[ ]" + "'", str22, "[ ]");
    }

    @Test
    public void test0469() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SchemaM3Random300Test0.test0469");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.avro.Schema schema4 = org.apache.avro.Schema.createFixed("{\"type\":\"map\",\"values\":[]}", "", "{\"type\":\"fixed\",\"name\":\"union\",\"namespace\":\"[]\",\"doc\":\"[ ]\",\"size\":0}", 0);
            org.junit.Assert.fail("Expected exception of type org.apache.avro.SchemaParseException; message: Illegal initial character: {\"type\":\"map\",\"values\":[]}");
        } catch (org.apache.avro.SchemaParseException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0470() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SchemaM3Random300Test0.test0470");
        org.apache.avro.Schema.LockableArrayList<java.lang.String> strList3 = new org.apache.avro.Schema.LockableArrayList<java.lang.String>();
        org.apache.avro.Schema.LockableArrayList<java.lang.String> strList4 = new org.apache.avro.Schema.LockableArrayList<java.lang.String>((java.util.List<java.lang.String>) strList3);
        org.apache.avro.Schema schema5 = org.apache.avro.Schema.createEnum("[].union", "{}", "[].union", (java.util.List<java.lang.String>) strList4);
        // The following exception was thrown during execution in test generation
        try {
            schema5.addAlias("{\"type\":\"array\",\"items\":\"int\"}");
            org.junit.Assert.fail("Expected exception of type org.apache.avro.SchemaParseException; message: Illegal initial character: {\"type\":\"array\",\"items\":\"int\"}");
        } catch (org.apache.avro.SchemaParseException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(schema5);
    }

    @Test
    public void test0471() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SchemaM3Random300Test0.test0471");
        org.apache.avro.Schema[] schemaArray0 = new org.apache.avro.Schema[] {};
        java.util.ArrayList<org.apache.avro.Schema> schemaList1 = new java.util.ArrayList<org.apache.avro.Schema>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<org.apache.avro.Schema>) schemaList1, schemaArray0);
        org.apache.avro.Schema schema3 = org.apache.avro.Schema.createUnion((java.util.List<org.apache.avro.Schema>) schemaList1);
        org.apache.avro.Schema[] schemaArray4 = new org.apache.avro.Schema[] {};
        java.util.ArrayList<org.apache.avro.Schema> schemaList5 = new java.util.ArrayList<org.apache.avro.Schema>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<org.apache.avro.Schema>) schemaList5, schemaArray4);
        org.apache.avro.Schema schema7 = org.apache.avro.Schema.createUnion((java.util.List<org.apache.avro.Schema>) schemaList5);
        org.apache.avro.Schema schema8 = org.apache.avro.Schema.applyAliases(schema3, schema7);
        java.util.List<org.apache.avro.Schema> schemaList9 = schema8.getTypes();
        boolean boolean11 = schema8.equals((java.lang.Object) "hi!");
        java.lang.String str12 = schema8.getDoc();
        org.apache.avro.Schema schema13 = org.apache.avro.Schema.createArray(schema8);
        java.lang.String str14 = schema8.getFullName();
        org.apache.avro.Schema schema15 = org.apache.avro.Schema.createMap(schema8);
        java.lang.String str16 = schema15.getName();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.avro.Schema schema17 = schema15.getElementType();
            org.junit.Assert.fail("Expected exception of type org.apache.avro.AvroRuntimeException; message: Not an array: {\"type\":\"map\",\"values\":[]}");
        } catch (org.apache.avro.AvroRuntimeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(schemaArray0);
        org.junit.Assert.assertArrayEquals(schemaArray0, new org.apache.avro.Schema[] {});
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(schema3);
        org.junit.Assert.assertNotNull(schemaArray4);
        org.junit.Assert.assertArrayEquals(schemaArray4, new org.apache.avro.Schema[] {});
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(schema7);
        org.junit.Assert.assertNotNull(schema8);
        org.junit.Assert.assertNotNull(schemaList9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNotNull(schema13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "union" + "'", str14, "union");
        org.junit.Assert.assertNotNull(schema15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "map" + "'", str16, "map");
    }

    @Test
    public void test0472() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SchemaM3Random300Test0.test0472");
        org.apache.avro.Schema.Parser parser0 = new org.apache.avro.Schema.Parser();
        org.apache.avro.Schema.Parser parser2 = parser0.setValidate(true);
        org.apache.avro.Schema.Parser parser4 = parser0.setValidate(true);
        org.apache.avro.Schema.Parser parser6 = parser0.setValidate(true);
        org.apache.avro.Schema schema8 = parser0.parse("[].union");
        java.io.File file9 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.avro.Schema schema10 = parser0.parse(file9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(parser2);
        org.junit.Assert.assertNotNull(parser4);
        org.junit.Assert.assertNotNull(parser6);
        org.junit.Assert.assertNotNull(schema8);
    }

    @Test
    public void test0473() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SchemaM3Random300Test0.test0473");
        org.apache.avro.Schema.Names names0 = new org.apache.avro.Schema.Names();
        java.lang.String str1 = names0.space();
        java.lang.Object obj2 = null;
        boolean boolean3 = names0.containsValue(obj2);
        int int4 = names0.size();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void test0474() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SchemaM3Random300Test0.test0474");
        org.apache.avro.Schema.Parser parser0 = new org.apache.avro.Schema.Parser();
        java.util.Map<java.lang.String, org.apache.avro.Schema> strMap1 = parser0.getTypes();
        boolean boolean2 = parser0.getValidate();
        java.io.InputStream inputStream3 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.avro.Schema schema4 = parser0.parse(inputStream3);
            org.junit.Assert.fail("Expected exception of type java.io.EOFException; message: No content to map to Object due to end of input");
        } catch (java.io.EOFException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strMap1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test0475() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SchemaM3Random300Test0.test0475");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.avro.Schema schema4 = org.apache.avro.Schema.createFixed("", "union type:MAP pos:-1", "union", (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type org.apache.avro.SchemaParseException; message: Empty name");
        } catch (org.apache.avro.SchemaParseException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0476() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SchemaM3Random300Test0.test0476");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.avro.Schema schema4 = org.apache.avro.Schema.createFixed("{\"type\":\"array\",\"items\":{\"type\":\"map\",\"values\":[]}}", "{\r\n  \"type\" : \"array\",\r\n  \"items\" : {\r\n    \"type\" : \"map\",\r\n    \"values\" : [ ]\r\n  }\r\n}", "union type:MAP pos:-1", 0);
            org.junit.Assert.fail("Expected exception of type org.apache.avro.SchemaParseException; message: Illegal initial character: {\"type\":\"array\",\"items\":{\"type\":\"map\",\"values\":[]}}");
        } catch (org.apache.avro.SchemaParseException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0477() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SchemaM3Random300Test0.test0477");
        org.apache.avro.Schema[] schemaArray0 = new org.apache.avro.Schema[] {};
        java.util.ArrayList<org.apache.avro.Schema> schemaList1 = new java.util.ArrayList<org.apache.avro.Schema>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<org.apache.avro.Schema>) schemaList1, schemaArray0);
        org.apache.avro.Schema schema3 = org.apache.avro.Schema.createUnion((java.util.List<org.apache.avro.Schema>) schemaList1);
        org.apache.avro.Schema[] schemaArray4 = new org.apache.avro.Schema[] {};
        java.util.ArrayList<org.apache.avro.Schema> schemaList5 = new java.util.ArrayList<org.apache.avro.Schema>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<org.apache.avro.Schema>) schemaList5, schemaArray4);
        org.apache.avro.Schema schema7 = org.apache.avro.Schema.createUnion((java.util.List<org.apache.avro.Schema>) schemaList5);
        org.apache.avro.Schema schema8 = org.apache.avro.Schema.applyAliases(schema3, schema7);
        java.util.List<org.apache.avro.Schema> schemaList9 = schema8.getTypes();
        boolean boolean11 = schema8.equals((java.lang.Object) "hi!");
        java.lang.String str12 = schema8.getDoc();
        org.apache.avro.Schema schema13 = org.apache.avro.Schema.createArray(schema8);
        java.lang.String str14 = schema8.toString();
        org.apache.avro.Schema schema15 = org.apache.avro.Schema.createArray(schema8);
        java.util.List<org.apache.avro.Schema> schemaList16 = schema8.getTypes();
        java.lang.String str17 = schema8.getDoc();
        org.junit.Assert.assertNotNull(schemaArray0);
        org.junit.Assert.assertArrayEquals(schemaArray0, new org.apache.avro.Schema[] {});
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(schema3);
        org.junit.Assert.assertNotNull(schemaArray4);
        org.junit.Assert.assertArrayEquals(schemaArray4, new org.apache.avro.Schema[] {});
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(schema7);
        org.junit.Assert.assertNotNull(schema8);
        org.junit.Assert.assertNotNull(schemaList9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNotNull(schema13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "[]" + "'", str14, "[]");
        org.junit.Assert.assertNotNull(schema15);
        org.junit.Assert.assertNotNull(schemaList16);
        org.junit.Assert.assertNull(str17);
    }

    @Test
    public void test0478() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SchemaM3Random300Test0.test0478");
        org.apache.avro.Schema.Type type0 = org.apache.avro.Schema.Type.INT;
        org.apache.avro.Schema schema1 = org.apache.avro.Schema.create(type0);
        org.apache.avro.Schema schema2 = org.apache.avro.Schema.createArray(schema1);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.avro.Schema schema3 = schema1.getElementType();
            org.junit.Assert.fail("Expected exception of type org.apache.avro.AvroRuntimeException; message: Not an array: \"int\"");
        } catch (org.apache.avro.AvroRuntimeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + type0 + "' != '" + org.apache.avro.Schema.Type.INT + "'", type0.equals(org.apache.avro.Schema.Type.INT));
        org.junit.Assert.assertNotNull(schema1);
        org.junit.Assert.assertNotNull(schema2);
    }

    @Test
    public void test0479() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SchemaM3Random300Test0.test0479");
        org.apache.avro.Schema[] schemaArray0 = new org.apache.avro.Schema[] {};
        java.util.ArrayList<org.apache.avro.Schema> schemaList1 = new java.util.ArrayList<org.apache.avro.Schema>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<org.apache.avro.Schema>) schemaList1, schemaArray0);
        org.apache.avro.Schema schema3 = org.apache.avro.Schema.createUnion((java.util.List<org.apache.avro.Schema>) schemaList1);
        org.apache.avro.Schema[] schemaArray4 = new org.apache.avro.Schema[] {};
        java.util.ArrayList<org.apache.avro.Schema> schemaList5 = new java.util.ArrayList<org.apache.avro.Schema>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<org.apache.avro.Schema>) schemaList5, schemaArray4);
        org.apache.avro.Schema schema7 = org.apache.avro.Schema.createUnion((java.util.List<org.apache.avro.Schema>) schemaList5);
        org.apache.avro.Schema schema8 = org.apache.avro.Schema.applyAliases(schema3, schema7);
        java.util.List<org.apache.avro.Schema> schemaList9 = schema8.getTypes();
        boolean boolean11 = schema8.equals((java.lang.Object) "hi!");
        java.lang.String str12 = schema8.getDoc();
        java.lang.String str14 = schema8.toString(true);
        // The following exception was thrown during execution in test generation
        try {
            java.util.Set<java.lang.String> strSet15 = schema8.getAliases();
            org.junit.Assert.fail("Expected exception of type org.apache.avro.AvroRuntimeException; message: Not a named type: []");
        } catch (org.apache.avro.AvroRuntimeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(schemaArray0);
        org.junit.Assert.assertArrayEquals(schemaArray0, new org.apache.avro.Schema[] {});
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(schema3);
        org.junit.Assert.assertNotNull(schemaArray4);
        org.junit.Assert.assertArrayEquals(schemaArray4, new org.apache.avro.Schema[] {});
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(schema7);
        org.junit.Assert.assertNotNull(schema8);
        org.junit.Assert.assertNotNull(schemaList9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "[ ]" + "'", str14, "[ ]");
    }

    @Test
    public void test0480() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SchemaM3Random300Test0.test0480");
        org.apache.avro.Schema schema1 = org.apache.avro.Schema.parse("[ ]");
        org.junit.Assert.assertNotNull(schema1);
    }

    @Test
    public void test0481() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SchemaM3Random300Test0.test0481");
        org.apache.avro.Schema[] schemaArray0 = new org.apache.avro.Schema[] {};
        java.util.ArrayList<org.apache.avro.Schema> schemaList1 = new java.util.ArrayList<org.apache.avro.Schema>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<org.apache.avro.Schema>) schemaList1, schemaArray0);
        org.apache.avro.Schema schema3 = org.apache.avro.Schema.createUnion((java.util.List<org.apache.avro.Schema>) schemaList1);
        org.apache.avro.Schema[] schemaArray4 = new org.apache.avro.Schema[] {};
        java.util.ArrayList<org.apache.avro.Schema> schemaList5 = new java.util.ArrayList<org.apache.avro.Schema>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<org.apache.avro.Schema>) schemaList5, schemaArray4);
        org.apache.avro.Schema schema7 = org.apache.avro.Schema.createUnion((java.util.List<org.apache.avro.Schema>) schemaList5);
        org.apache.avro.Schema schema8 = org.apache.avro.Schema.applyAliases(schema3, schema7);
        java.util.List<org.apache.avro.Schema> schemaList9 = schema8.getTypes();
        org.apache.avro.Schema[] schemaArray10 = new org.apache.avro.Schema[] {};
        java.util.ArrayList<org.apache.avro.Schema> schemaList11 = new java.util.ArrayList<org.apache.avro.Schema>();
        boolean boolean12 = java.util.Collections.addAll((java.util.Collection<org.apache.avro.Schema>) schemaList11, schemaArray10);
        org.apache.avro.Schema schema13 = org.apache.avro.Schema.createUnion((java.util.List<org.apache.avro.Schema>) schemaList11);
        org.apache.avro.Schema[] schemaArray14 = new org.apache.avro.Schema[] {};
        java.util.ArrayList<org.apache.avro.Schema> schemaList15 = new java.util.ArrayList<org.apache.avro.Schema>();
        boolean boolean16 = java.util.Collections.addAll((java.util.Collection<org.apache.avro.Schema>) schemaList15, schemaArray14);
        org.apache.avro.Schema schema17 = org.apache.avro.Schema.createUnion((java.util.List<org.apache.avro.Schema>) schemaList15);
        org.apache.avro.Schema schema18 = org.apache.avro.Schema.applyAliases(schema13, schema17);
        org.apache.avro.Schema schema19 = org.apache.avro.Schema.applyAliases(schema8, schema17);
        java.util.List<org.apache.avro.Schema> schemaList20 = schema8.getTypes();
        java.lang.String str22 = schema8.toString(false);
        org.apache.avro.Schema schema23 = org.apache.avro.Schema.createArray(schema8);
        org.apache.avro.Schema schema24 = org.apache.avro.Schema.createArray(schema23);
        java.lang.String str25 = schema23.getName();
        java.lang.String str26 = schema23.toString();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Set<java.lang.String> strSet27 = schema23.getAliases();
            org.junit.Assert.fail("Expected exception of type org.apache.avro.AvroRuntimeException; message: Not a named type: {\"type\":\"array\",\"items\":[]}");
        } catch (org.apache.avro.AvroRuntimeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(schemaArray0);
        org.junit.Assert.assertArrayEquals(schemaArray0, new org.apache.avro.Schema[] {});
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(schema3);
        org.junit.Assert.assertNotNull(schemaArray4);
        org.junit.Assert.assertArrayEquals(schemaArray4, new org.apache.avro.Schema[] {});
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(schema7);
        org.junit.Assert.assertNotNull(schema8);
        org.junit.Assert.assertNotNull(schemaList9);
        org.junit.Assert.assertNotNull(schemaArray10);
        org.junit.Assert.assertArrayEquals(schemaArray10, new org.apache.avro.Schema[] {});
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(schema13);
        org.junit.Assert.assertNotNull(schemaArray14);
        org.junit.Assert.assertArrayEquals(schemaArray14, new org.apache.avro.Schema[] {});
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(schema17);
        org.junit.Assert.assertNotNull(schema18);
        org.junit.Assert.assertNotNull(schema19);
        org.junit.Assert.assertNotNull(schemaList20);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "[]" + "'", str22, "[]");
        org.junit.Assert.assertNotNull(schema23);
        org.junit.Assert.assertNotNull(schema24);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "array" + "'", str25, "array");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "{\"type\":\"array\",\"items\":[]}" + "'", str26, "{\"type\":\"array\",\"items\":[]}");
    }

    @Test
    public void test0482() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SchemaM3Random300Test0.test0482");
        org.apache.avro.Schema schema4 = org.apache.avro.Schema.createFixed("union", "[ ]", "[]", 0);
        java.lang.String str6 = schema4.getProp("map");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean8 = schema4.hasEnumSymbol("[]");
            org.junit.Assert.fail("Expected exception of type org.apache.avro.AvroRuntimeException; message: Not an enum: {\"type\":\"fixed\",\"name\":\"union\",\"namespace\":\"[]\",\"doc\":\"[ ]\",\"size\":0}");
        } catch (org.apache.avro.AvroRuntimeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(schema4);
        org.junit.Assert.assertNull(str6);
    }

    @Test
    public void test0483() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SchemaM3Random300Test0.test0483");
        org.apache.avro.Schema.Type type0 = org.apache.avro.Schema.Type.INT;
        org.apache.avro.Schema schema1 = org.apache.avro.Schema.create(type0);
        org.apache.avro.Schema schema2 = org.apache.avro.Schema.createArray(schema1);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = schema2.isError();
            org.junit.Assert.fail("Expected exception of type org.apache.avro.AvroRuntimeException; message: Not a record: {\"type\":\"array\",\"items\":\"int\"}");
        } catch (org.apache.avro.AvroRuntimeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + type0 + "' != '" + org.apache.avro.Schema.Type.INT + "'", type0.equals(org.apache.avro.Schema.Type.INT));
        org.junit.Assert.assertNotNull(schema1);
        org.junit.Assert.assertNotNull(schema2);
    }

    @Test
    public void test0484() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SchemaM3Random300Test0.test0484");
        org.apache.avro.Schema.LockableArrayList<java.lang.String> strList0 = new org.apache.avro.Schema.LockableArrayList<java.lang.String>();
        java.lang.Class<?> wildcardClass1 = strList0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test0485() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SchemaM3Random300Test0.test0485");
        org.apache.avro.Schema.Parser parser0 = new org.apache.avro.Schema.Parser();
        org.apache.avro.Schema.Parser parser2 = parser0.setValidate(true);
        java.util.Map<java.lang.String, org.apache.avro.Schema> strMap3 = parser0.getTypes();
        org.apache.avro.Schema schema5 = parser0.parse("{\"type\":\"array\",\"items\":{\"type\":\"map\",\"values\":[]}}");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.avro.Schema schema7 = parser0.parse("{null={\"type\":\"fixed\",\"name\":\"union\",\"namespace\":\"[]\",\"doc\":\"[ ]\",\"size\":0}}");
            org.junit.Assert.fail("Expected exception of type org.apache.avro.SchemaParseException; message: org.codehaus.jackson.JsonParseException: Unexpected character ('n' (code 110)): was expecting double-quote to start field name? at [Source: java.io.StringReader@66d57759; line: 1, column: 3]");
        } catch (org.apache.avro.SchemaParseException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(parser2);
        org.junit.Assert.assertNotNull(strMap3);
        org.junit.Assert.assertNotNull(schema5);
    }

    @Test
    public void test0486() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SchemaM3Random300Test0.test0486");
        org.apache.avro.Schema.Parser parser0 = new org.apache.avro.Schema.Parser();
        java.util.Map<java.lang.String, org.apache.avro.Schema> strMap1 = parser0.getTypes();
        java.util.Map<java.lang.String, org.apache.avro.Schema> strMap2 = parser0.getTypes();
        org.apache.avro.Schema.Parser parser3 = new org.apache.avro.Schema.Parser();
        org.apache.avro.Schema.Parser parser5 = parser3.setValidate(true);
        java.util.Map<java.lang.String, org.apache.avro.Schema> strMap6 = parser3.getTypes();
        org.apache.avro.Schema.Parser parser7 = parser0.addTypes(strMap6);
        org.apache.avro.Schema.Parser parser9 = parser7.setValidate(true);
        boolean boolean10 = parser7.getValidate();
        org.apache.avro.Schema.Parser parser11 = new org.apache.avro.Schema.Parser();
        org.apache.avro.Schema.Parser parser13 = parser11.setValidate(true);
        java.util.Map<java.lang.String, org.apache.avro.Schema> strMap14 = parser11.getTypes();
        org.apache.avro.Schema.Parser parser15 = parser7.addTypes(strMap14);
        java.io.InputStream inputStream16 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.avro.Schema schema17 = parser15.parse(inputStream16);
            org.junit.Assert.fail("Expected exception of type java.io.EOFException; message: No content to map to Object due to end of input");
        } catch (java.io.EOFException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strMap1);
        org.junit.Assert.assertNotNull(strMap2);
        org.junit.Assert.assertNotNull(parser5);
        org.junit.Assert.assertNotNull(strMap6);
        org.junit.Assert.assertNotNull(parser7);
        org.junit.Assert.assertNotNull(parser9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(parser13);
        org.junit.Assert.assertNotNull(strMap14);
        org.junit.Assert.assertNotNull(parser15);
    }

    @Test
    public void test0487() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SchemaM3Random300Test0.test0487");
        org.apache.avro.Schema.Parser parser0 = new org.apache.avro.Schema.Parser();
        java.util.Map<java.lang.String, org.apache.avro.Schema> strMap1 = parser0.getTypes();
        org.apache.avro.Schema.Parser parser3 = parser0.setValidate(false);
        boolean boolean4 = parser3.getValidate();
        java.io.File file5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.avro.Schema schema6 = parser3.parse(file5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strMap1);
        org.junit.Assert.assertNotNull(parser3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test0488() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SchemaM3Random300Test0.test0488");
        org.apache.avro.Schema.LockableArrayList<java.lang.reflect.Type> typeList0 = new org.apache.avro.Schema.LockableArrayList<java.lang.reflect.Type>();
    }

    @Test
    public void test0489() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SchemaM3Random300Test0.test0489");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.avro.Schema schema4 = org.apache.avro.Schema.createFixed("{}", "{\r\n  \"type\" : \"map\",\r\n  \"values\" : [ ]\r\n}", "[ ]", (int) ' ');
            org.junit.Assert.fail("Expected exception of type org.apache.avro.SchemaParseException; message: Illegal initial character: {}");
        } catch (org.apache.avro.SchemaParseException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0490() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SchemaM3Random300Test0.test0490");
        org.codehaus.jackson.map.ObjectMapper objectMapper0 = org.apache.avro.Schema.MAPPER;
        java.lang.Class<?> wildcardClass1 = objectMapper0.getClass();
        org.junit.Assert.assertNotNull(objectMapper0);
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test0491() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SchemaM3Random300Test0.test0491");
        org.apache.avro.Schema.Parser parser0 = new org.apache.avro.Schema.Parser();
        java.util.Map<java.lang.String, org.apache.avro.Schema> strMap1 = parser0.getTypes();
        java.util.Map<java.lang.String, org.apache.avro.Schema> strMap2 = parser0.getTypes();
        org.apache.avro.Schema.Parser parser3 = new org.apache.avro.Schema.Parser();
        org.apache.avro.Schema.Parser parser5 = parser3.setValidate(true);
        java.util.Map<java.lang.String, org.apache.avro.Schema> strMap6 = parser3.getTypes();
        org.apache.avro.Schema.Parser parser7 = parser0.addTypes(strMap6);
        org.apache.avro.Schema schema9 = parser7.parse("{\"type\":\"map\",\"values\":[]}");
        boolean boolean10 = parser7.getValidate();
        org.apache.avro.Schema.Parser parser12 = parser7.setValidate(true);
        java.io.InputStream inputStream13 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.avro.Schema schema14 = parser12.parse(inputStream13);
            org.junit.Assert.fail("Expected exception of type java.io.EOFException; message: No content to map to Object due to end of input");
        } catch (java.io.EOFException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strMap1);
        org.junit.Assert.assertNotNull(strMap2);
        org.junit.Assert.assertNotNull(parser5);
        org.junit.Assert.assertNotNull(strMap6);
        org.junit.Assert.assertNotNull(parser7);
        org.junit.Assert.assertNotNull(schema9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(parser12);
    }

    @Test
    public void test0492() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SchemaM3Random300Test0.test0492");
        org.apache.avro.Schema[] schemaArray0 = new org.apache.avro.Schema[] {};
        java.util.ArrayList<org.apache.avro.Schema> schemaList1 = new java.util.ArrayList<org.apache.avro.Schema>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<org.apache.avro.Schema>) schemaList1, schemaArray0);
        org.apache.avro.Schema schema3 = org.apache.avro.Schema.createUnion((java.util.List<org.apache.avro.Schema>) schemaList1);
        org.apache.avro.Schema[] schemaArray4 = new org.apache.avro.Schema[] {};
        java.util.ArrayList<org.apache.avro.Schema> schemaList5 = new java.util.ArrayList<org.apache.avro.Schema>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<org.apache.avro.Schema>) schemaList5, schemaArray4);
        org.apache.avro.Schema schema7 = org.apache.avro.Schema.createUnion((java.util.List<org.apache.avro.Schema>) schemaList5);
        org.apache.avro.Schema schema8 = org.apache.avro.Schema.applyAliases(schema3, schema7);
        java.util.List<org.apache.avro.Schema> schemaList9 = schema8.getTypes();
        org.apache.avro.Schema[] schemaArray10 = new org.apache.avro.Schema[] {};
        java.util.ArrayList<org.apache.avro.Schema> schemaList11 = new java.util.ArrayList<org.apache.avro.Schema>();
        boolean boolean12 = java.util.Collections.addAll((java.util.Collection<org.apache.avro.Schema>) schemaList11, schemaArray10);
        org.apache.avro.Schema schema13 = org.apache.avro.Schema.createUnion((java.util.List<org.apache.avro.Schema>) schemaList11);
        org.apache.avro.Schema[] schemaArray14 = new org.apache.avro.Schema[] {};
        java.util.ArrayList<org.apache.avro.Schema> schemaList15 = new java.util.ArrayList<org.apache.avro.Schema>();
        boolean boolean16 = java.util.Collections.addAll((java.util.Collection<org.apache.avro.Schema>) schemaList15, schemaArray14);
        org.apache.avro.Schema schema17 = org.apache.avro.Schema.createUnion((java.util.List<org.apache.avro.Schema>) schemaList15);
        org.apache.avro.Schema schema18 = org.apache.avro.Schema.applyAliases(schema13, schema17);
        org.apache.avro.Schema schema19 = org.apache.avro.Schema.applyAliases(schema8, schema17);
        java.util.List<org.apache.avro.Schema> schemaList20 = schema8.getTypes();
        java.lang.String str22 = schema8.toString(false);
        org.apache.avro.Schema schema23 = org.apache.avro.Schema.createArray(schema8);
        org.apache.avro.Schema schema24 = org.apache.avro.Schema.createArray(schema23);
        java.lang.String str25 = schema23.getName();
        java.lang.String str26 = schema23.toString();
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<java.lang.String> strList27 = schema23.getEnumSymbols();
            org.junit.Assert.fail("Expected exception of type org.apache.avro.AvroRuntimeException; message: Not an enum: {\"type\":\"array\",\"items\":[]}");
        } catch (org.apache.avro.AvroRuntimeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(schemaArray0);
        org.junit.Assert.assertArrayEquals(schemaArray0, new org.apache.avro.Schema[] {});
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(schema3);
        org.junit.Assert.assertNotNull(schemaArray4);
        org.junit.Assert.assertArrayEquals(schemaArray4, new org.apache.avro.Schema[] {});
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(schema7);
        org.junit.Assert.assertNotNull(schema8);
        org.junit.Assert.assertNotNull(schemaList9);
        org.junit.Assert.assertNotNull(schemaArray10);
        org.junit.Assert.assertArrayEquals(schemaArray10, new org.apache.avro.Schema[] {});
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(schema13);
        org.junit.Assert.assertNotNull(schemaArray14);
        org.junit.Assert.assertArrayEquals(schemaArray14, new org.apache.avro.Schema[] {});
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(schema17);
        org.junit.Assert.assertNotNull(schema18);
        org.junit.Assert.assertNotNull(schema19);
        org.junit.Assert.assertNotNull(schemaList20);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "[]" + "'", str22, "[]");
        org.junit.Assert.assertNotNull(schema23);
        org.junit.Assert.assertNotNull(schema24);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "array" + "'", str25, "array");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "{\"type\":\"array\",\"items\":[]}" + "'", str26, "{\"type\":\"array\",\"items\":[]}");
    }

    @Test
    public void test0493() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SchemaM3Random300Test0.test0493");
        org.apache.avro.Schema.Names names1 = new org.apache.avro.Schema.Names("union type:UNION pos:-1");
        names1.space("map");
        java.lang.Object obj4 = names1.clone();
        org.junit.Assert.assertNotNull(obj4);
        org.junit.Assert.assertEquals(obj4.toString(), "{}");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj4), "{}");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj4), "{}");
    }

    @Test
    public void test0494() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SchemaM3Random300Test0.test0494");
        org.apache.avro.Schema.Parser parser0 = new org.apache.avro.Schema.Parser();
        java.util.Map<java.lang.String, org.apache.avro.Schema> strMap1 = parser0.getTypes();
        java.util.Map<java.lang.String, org.apache.avro.Schema> strMap2 = parser0.getTypes();
        org.apache.avro.Schema.Parser parser3 = new org.apache.avro.Schema.Parser();
        java.util.Map<java.lang.String, org.apache.avro.Schema> strMap4 = parser3.getTypes();
        org.apache.avro.Schema.Parser parser5 = parser0.addTypes(strMap4);
        org.apache.avro.Schema.Parser parser7 = parser0.setValidate(true);
        boolean boolean8 = parser0.getValidate();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.avro.Schema schema10 = parser0.parse("map");
            org.junit.Assert.fail("Expected exception of type org.apache.avro.SchemaParseException; message: org.codehaus.jackson.JsonParseException: Unexpected character ('m' (code 109)): expected a valid value (number, String, array, object, 'true', 'false' or 'null')? at [Source: java.io.StringReader@558832c2; line: 1, column: 2]");
        } catch (org.apache.avro.SchemaParseException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strMap1);
        org.junit.Assert.assertNotNull(strMap2);
        org.junit.Assert.assertNotNull(strMap4);
        org.junit.Assert.assertNotNull(parser5);
        org.junit.Assert.assertNotNull(parser7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test0495() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SchemaM3Random300Test0.test0495");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.avro.Schema schema4 = org.apache.avro.Schema.createFixed("{\r\n  \"type\" : \"map\",\r\n  \"values\" : {\r\n    \"type\" : \"map\",\r\n    \"values\" : [ ]\r\n  }\r\n}", "double", "union", 100);
            org.junit.Assert.fail("Expected exception of type org.apache.avro.SchemaParseException; message: Illegal initial character: {??  \"type\" : \"map\",??  \"values\" : {??    \"type\" : \"map\",??    \"values\" : [ ]??  }??}");
        } catch (org.apache.avro.SchemaParseException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0496() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SchemaM3Random300Test0.test0496");
        org.apache.avro.Schema.Parser parser0 = new org.apache.avro.Schema.Parser();
        java.util.Map<java.lang.String, org.apache.avro.Schema> strMap1 = parser0.getTypes();
        org.apache.avro.Schema.Parser parser3 = parser0.setValidate(false);
        java.io.InputStream inputStream4 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.avro.Schema schema5 = parser0.parse(inputStream4);
            org.junit.Assert.fail("Expected exception of type java.io.EOFException; message: No content to map to Object due to end of input");
        } catch (java.io.EOFException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strMap1);
        org.junit.Assert.assertNotNull(parser3);
    }

    @Test
    public void test0497() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SchemaM3Random300Test0.test0497");
        org.apache.avro.Schema[] schemaArray0 = new org.apache.avro.Schema[] {};
        java.util.ArrayList<org.apache.avro.Schema> schemaList1 = new java.util.ArrayList<org.apache.avro.Schema>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<org.apache.avro.Schema>) schemaList1, schemaArray0);
        org.apache.avro.Schema schema3 = org.apache.avro.Schema.createUnion((java.util.List<org.apache.avro.Schema>) schemaList1);
        org.apache.avro.Schema[] schemaArray4 = new org.apache.avro.Schema[] {};
        java.util.ArrayList<org.apache.avro.Schema> schemaList5 = new java.util.ArrayList<org.apache.avro.Schema>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<org.apache.avro.Schema>) schemaList5, schemaArray4);
        org.apache.avro.Schema schema7 = org.apache.avro.Schema.createUnion((java.util.List<org.apache.avro.Schema>) schemaList5);
        org.apache.avro.Schema schema8 = org.apache.avro.Schema.applyAliases(schema3, schema7);
        org.apache.avro.Schema.Type type9 = schema7.getType();
        org.apache.avro.Schema schema10 = org.apache.avro.Schema.createMap(schema7);
        org.apache.avro.Schema schema11 = org.apache.avro.Schema.createArray(schema10);
        java.lang.String str13 = schema11.getProp("{\"type\":\"array\",\"items\":\"int\"}");
        // The following exception was thrown during execution in test generation
        try {
            schema11.addAlias("");
            org.junit.Assert.fail("Expected exception of type org.apache.avro.AvroRuntimeException; message: Not a named type: {\"type\":\"array\",\"items\":{\"type\":\"map\",\"values\":[]}}");
        } catch (org.apache.avro.AvroRuntimeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(schemaArray0);
        org.junit.Assert.assertArrayEquals(schemaArray0, new org.apache.avro.Schema[] {});
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(schema3);
        org.junit.Assert.assertNotNull(schemaArray4);
        org.junit.Assert.assertArrayEquals(schemaArray4, new org.apache.avro.Schema[] {});
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(schema7);
        org.junit.Assert.assertNotNull(schema8);
        org.junit.Assert.assertTrue("'" + type9 + "' != '" + org.apache.avro.Schema.Type.UNION + "'", type9.equals(org.apache.avro.Schema.Type.UNION));
        org.junit.Assert.assertNotNull(schema10);
        org.junit.Assert.assertNotNull(schema11);
        org.junit.Assert.assertNull(str13);
    }

    @Test
    public void test0498() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SchemaM3Random300Test0.test0498");
        org.apache.avro.Schema.LockableArrayList<java.lang.String> strList4 = new org.apache.avro.Schema.LockableArrayList<java.lang.String>((int) '#');
        org.apache.avro.Schema.LockableArrayList<java.lang.String> strList5 = new org.apache.avro.Schema.LockableArrayList<java.lang.String>((java.util.List<java.lang.String>) strList4);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.avro.Schema schema6 = org.apache.avro.Schema.createEnum("{null={\"type\":\"fixed\",\"name\":\"union\",\"namespace\":\"[]\",\"doc\":\"[ ]\",\"size\":0}}", "{}", "{\"type\":\"record\",\"fields\":[]}", (java.util.List<java.lang.String>) strList5);
            org.junit.Assert.fail("Expected exception of type org.apache.avro.SchemaParseException; message: Illegal initial character: {null={\"type\":\"fixed\",\"name\":\"union\",\"namespace\":\"[]\",\"doc\":\"[ ]\",\"size\":0}}");
        } catch (org.apache.avro.SchemaParseException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0499() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SchemaM3Random300Test0.test0499");
        org.apache.avro.Schema[] schemaArray0 = new org.apache.avro.Schema[] {};
        java.util.ArrayList<org.apache.avro.Schema> schemaList1 = new java.util.ArrayList<org.apache.avro.Schema>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<org.apache.avro.Schema>) schemaList1, schemaArray0);
        org.apache.avro.Schema schema3 = org.apache.avro.Schema.createUnion((java.util.List<org.apache.avro.Schema>) schemaList1);
        org.apache.avro.Schema[] schemaArray4 = new org.apache.avro.Schema[] {};
        java.util.ArrayList<org.apache.avro.Schema> schemaList5 = new java.util.ArrayList<org.apache.avro.Schema>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<org.apache.avro.Schema>) schemaList5, schemaArray4);
        org.apache.avro.Schema schema7 = org.apache.avro.Schema.createUnion((java.util.List<org.apache.avro.Schema>) schemaList5);
        org.apache.avro.Schema schema8 = org.apache.avro.Schema.applyAliases(schema3, schema7);
        org.apache.avro.Schema.Type type9 = schema7.getType();
        org.apache.avro.Schema schema10 = org.apache.avro.Schema.createMap(schema7);
        org.apache.avro.Schema.Names names11 = new org.apache.avro.Schema.Names();
        java.lang.String str12 = names11.space();
        names11.space("");
        boolean boolean15 = schema7.equals((java.lang.Object) "");
        java.lang.String str16 = schema7.getFullName();
        java.lang.String str17 = schema7.getFullName();
        org.apache.avro.Schema.Parser parser18 = new org.apache.avro.Schema.Parser();
        java.util.Map<java.lang.String, org.apache.avro.Schema> strMap19 = parser18.getTypes();
        java.util.Map<java.lang.String, org.apache.avro.Schema> strMap20 = parser18.getTypes();
        org.apache.avro.Schema.Parser parser21 = new org.apache.avro.Schema.Parser();
        org.apache.avro.Schema.Parser parser23 = parser21.setValidate(true);
        java.util.Map<java.lang.String, org.apache.avro.Schema> strMap24 = parser21.getTypes();
        org.apache.avro.Schema.Parser parser25 = parser18.addTypes(strMap24);
        org.apache.avro.Schema schema27 = parser25.parse("{\"type\":\"map\",\"values\":[]}");
        org.apache.avro.Schema.Parser parser29 = parser25.setValidate(false);
        org.apache.avro.Schema schema31 = parser25.parse("[].union");
        boolean boolean32 = schema7.equals((java.lang.Object) schema31);
        // The following exception was thrown during execution in test generation
        try {
            int int33 = schema31.getFixedSize();
            org.junit.Assert.fail("Expected exception of type org.apache.avro.AvroRuntimeException; message: Not fixed: []");
        } catch (org.apache.avro.AvroRuntimeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(schemaArray0);
        org.junit.Assert.assertArrayEquals(schemaArray0, new org.apache.avro.Schema[] {});
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(schema3);
        org.junit.Assert.assertNotNull(schemaArray4);
        org.junit.Assert.assertArrayEquals(schemaArray4, new org.apache.avro.Schema[] {});
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(schema7);
        org.junit.Assert.assertNotNull(schema8);
        org.junit.Assert.assertTrue("'" + type9 + "' != '" + org.apache.avro.Schema.Type.UNION + "'", type9.equals(org.apache.avro.Schema.Type.UNION));
        org.junit.Assert.assertNotNull(schema10);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "union" + "'", str16, "union");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "union" + "'", str17, "union");
        org.junit.Assert.assertNotNull(strMap19);
        org.junit.Assert.assertNotNull(strMap20);
        org.junit.Assert.assertNotNull(parser23);
        org.junit.Assert.assertNotNull(strMap24);
        org.junit.Assert.assertNotNull(parser25);
        org.junit.Assert.assertNotNull(schema27);
        org.junit.Assert.assertNotNull(parser29);
        org.junit.Assert.assertNotNull(schema31);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
    }

    @Test
    public void test0500() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SchemaM3Random300Test0.test0500");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.avro.Schema schema4 = org.apache.avro.Schema.createRecord("{\"type\":\"fixed\",\"name\":\"union\",\"namespace\":\"[]\",\"doc\":\"[ ]\",\"size\":0}", "{\"type\":\"array\",\"items\":[]}", "{\"type\":\"map\",\"values\":{\"type\":\"array\",\"items\":{\"type\":\"map\",\"values\":[]}}}", true);
            org.junit.Assert.fail("Expected exception of type org.apache.avro.SchemaParseException; message: Illegal initial character: {\"type\":\"fixed\",\"name\":\"union\",\"namespace\":\"[]\",\"doc\":\"[ ]\",\"size\":0}");
        } catch (org.apache.avro.SchemaParseException e) {
            // Expected exception.
        }
    }
}

