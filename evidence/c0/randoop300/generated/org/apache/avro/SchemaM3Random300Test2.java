package org.apache.avro;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class SchemaM3Random300Test2 {

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
    public void test1001() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SchemaM3Random300Test2.test1001");
        java.lang.String[] strArray4 = new java.lang.String[] { "" };
        java.util.ArrayList<java.lang.String> strList5 = new java.util.ArrayList<java.lang.String>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList5, strArray4);
        org.apache.avro.Schema.LockableArrayList<java.lang.String> strList7 = new org.apache.avro.Schema.LockableArrayList<java.lang.String>((java.util.List<java.lang.String>) strList5);
        org.apache.avro.Schema.LockableArrayList<java.lang.String> strList8 = new org.apache.avro.Schema.LockableArrayList<java.lang.String>((java.util.List<java.lang.String>) strList5);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.avro.Schema schema9 = org.apache.avro.Schema.createEnum("double", "{\r\n  \"type\" : \"map\",\r\n  \"values\" : [ ]\r\n}", "{\"type\":\"fixed\",\"name\":\"union\",\"namespace\":\"[]\",\"doc\":\"[ ]\",\"size\":0,\"aliases\":[\"union\"]}", (java.util.List<java.lang.String>) strList5);
            org.junit.Assert.fail("Expected exception of type org.apache.avro.SchemaParseException; message: Empty name");
        } catch (org.apache.avro.SchemaParseException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertArrayEquals(strArray4, new java.lang.String[] { "" });
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test1002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SchemaM3Random300Test2.test1002");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.avro.Schema schema4 = org.apache.avro.Schema.createFixed("{\"type\":\"array\",\"items\":\"null\"}", "{\"type\":\"map\",\"values\":[],\"\\\"double\\\"\":\"{\\\"type\\\":\\\"array\\\",\\\"items\\\":\\\"int\\\"}\"}", "{\r\n  \"type\" : \"map\",\r\n  \"values\" : {\r\n    \"type\" : \"map\",\r\n    \"values\" : [ ]\r\n  }\r\n}", 10);
            org.junit.Assert.fail("Expected exception of type org.apache.avro.SchemaParseException; message: Illegal initial character: {\"type\":\"array\",\"items\":\"null\"}");
        } catch (org.apache.avro.SchemaParseException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SchemaM3Random300Test2.test1003");
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
        boolean boolean14 = parser7.getValidate();
        boolean boolean15 = parser7.getValidate();
        org.junit.Assert.assertNotNull(strMap1);
        org.junit.Assert.assertNotNull(strMap2);
        org.junit.Assert.assertNotNull(parser5);
        org.junit.Assert.assertNotNull(strMap6);
        org.junit.Assert.assertNotNull(parser7);
        org.junit.Assert.assertNotNull(schema9);
        org.junit.Assert.assertNotNull(parser11);
        org.junit.Assert.assertNotNull(schema13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test1004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SchemaM3Random300Test2.test1004");
        org.apache.avro.Schema.LockableArrayList<java.lang.String> strList4 = new org.apache.avro.Schema.LockableArrayList<java.lang.String>((int) '#');
        org.apache.avro.Schema.LockableArrayList<java.lang.String> strList5 = new org.apache.avro.Schema.LockableArrayList<java.lang.String>((java.util.List<java.lang.String>) strList4);
        org.apache.avro.Schema.LockableArrayList<java.lang.String> strList6 = new org.apache.avro.Schema.LockableArrayList<java.lang.String>((java.util.List<java.lang.String>) strList4);
        org.apache.avro.Schema schema7 = org.apache.avro.Schema.createEnum("[].union", "", "{\r\n  \"type\" : \"array\",\r\n  \"items\" : [ ],\r\n  \"{}\" : \"hi!\"\r\n}", (java.util.List<java.lang.String>) strList6);
        org.junit.Assert.assertNotNull(schema7);
    }

    @Test
    public void test1005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SchemaM3Random300Test2.test1005");
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
            int int16 = schema8.getEnumOrdinal("{}");
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
    public void test1006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SchemaM3Random300Test2.test1006");
        org.apache.avro.Schema.LockableArrayList<java.lang.String> strList4 = new org.apache.avro.Schema.LockableArrayList<java.lang.String>((int) (short) 0);
        org.apache.avro.Schema.LockableArrayList<java.lang.String> strList5 = new org.apache.avro.Schema.LockableArrayList<java.lang.String>((java.util.List<java.lang.String>) strList4);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.avro.Schema schema6 = org.apache.avro.Schema.createEnum("{}", "", "[].union", (java.util.List<java.lang.String>) strList5);
            org.junit.Assert.fail("Expected exception of type org.apache.avro.SchemaParseException; message: Illegal initial character: {}");
        } catch (org.apache.avro.SchemaParseException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SchemaM3Random300Test2.test1007");
        org.apache.avro.Schema.Parser parser0 = new org.apache.avro.Schema.Parser();
        org.apache.avro.Schema.Parser parser2 = parser0.setValidate(true);
        java.util.Map<java.lang.String, org.apache.avro.Schema> strMap3 = parser0.getTypes();
        boolean boolean4 = parser0.getValidate();
        org.apache.avro.Schema schema6 = parser0.parse("[ ]");
        java.lang.String str7 = schema6.getName();
        org.junit.Assert.assertNotNull(parser2);
        org.junit.Assert.assertNotNull(strMap3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(schema6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "union" + "'", str7, "union");
    }

    @Test
    public void test1008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SchemaM3Random300Test2.test1008");
        org.apache.avro.Schema.Parser parser0 = new org.apache.avro.Schema.Parser();
        java.util.Map<java.lang.String, org.apache.avro.Schema> strMap1 = parser0.getTypes();
        org.apache.avro.Schema.Parser parser3 = parser0.setValidate(false);
        boolean boolean4 = parser3.getValidate();
        org.apache.avro.Schema.Parser parser5 = new org.apache.avro.Schema.Parser();
        java.util.Map<java.lang.String, org.apache.avro.Schema> strMap6 = parser5.getTypes();
        java.util.Map<java.lang.String, org.apache.avro.Schema> strMap7 = parser5.getTypes();
        org.apache.avro.Schema.Parser parser8 = parser3.addTypes(strMap7);
        java.io.InputStream inputStream9 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.avro.Schema schema10 = parser8.parse(inputStream9);
            org.junit.Assert.fail("Expected exception of type java.io.EOFException; message: No content to map to Object due to end of input");
        } catch (java.io.EOFException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strMap1);
        org.junit.Assert.assertNotNull(parser3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(strMap6);
        org.junit.Assert.assertNotNull(strMap7);
        org.junit.Assert.assertNotNull(parser8);
    }

    @Test
    public void test1009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SchemaM3Random300Test2.test1009");
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
            org.apache.avro.Schema schema18 = schema15.getValueType();
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
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNotNull(schema13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "[]" + "'", str14, "[]");
        org.junit.Assert.assertNotNull(schema15);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "{\"type\":\"array\",\"items\":[]}" + "'", str17, "{\"type\":\"array\",\"items\":[]}");
    }

    @Test
    public void test1010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SchemaM3Random300Test2.test1010");
        org.apache.avro.Schema.Field[] fieldArray0 = new org.apache.avro.Schema.Field[] {};
        java.util.ArrayList<org.apache.avro.Schema.Field> fieldList1 = new java.util.ArrayList<org.apache.avro.Schema.Field>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<org.apache.avro.Schema.Field>) fieldList1, fieldArray0);
        org.apache.avro.Schema schema3 = org.apache.avro.Schema.createRecord((java.util.List<org.apache.avro.Schema.Field>) fieldList1);
        org.apache.avro.Schema.Field field5 = schema3.getField("");
        org.apache.avro.Schema schema6 = org.apache.avro.Schema.createMap(schema3);
        org.apache.avro.Schema.Type type7 = schema3.getType();
        java.lang.String str9 = schema3.toString(false);
        schema3.addProp("double", "union type:MAP pos:-1");
        org.junit.Assert.assertNotNull(fieldArray0);
        org.junit.Assert.assertArrayEquals(fieldArray0, new org.apache.avro.Schema.Field[] {});
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(schema3);
        org.junit.Assert.assertNull(field5);
        org.junit.Assert.assertNotNull(schema6);
        org.junit.Assert.assertTrue("'" + type7 + "' != '" + org.apache.avro.Schema.Type.RECORD + "'", type7.equals(org.apache.avro.Schema.Type.RECORD));
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "{\"type\":\"record\",\"fields\":[]}" + "'", str9, "{\"type\":\"record\",\"fields\":[]}");
    }

    @Test
    public void test1011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SchemaM3Random300Test2.test1011");
        org.apache.avro.Schema schema4 = org.apache.avro.Schema.createFixed("union", "", "union type:UNION pos:-1", 10);
        int int5 = schema4.getFixedSize();
        org.apache.avro.Schema schema6 = org.apache.avro.Schema.createArray(schema4);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.avro.Schema schema7 = schema6.getValueType();
            org.junit.Assert.fail("Expected exception of type org.apache.avro.AvroRuntimeException; message: Not a map: {\"type\":\"array\",\"items\":{\"type\":\"fixed\",\"name\":\"union\",\"namespace\":\"union type:UNION pos:-1\",\"doc\":\"\",\"size\":10}}");
        } catch (org.apache.avro.AvroRuntimeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(schema4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 10 + "'", int5 == 10);
        org.junit.Assert.assertNotNull(schema6);
    }

    @Test
    public void test1012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SchemaM3Random300Test2.test1012");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.avro.Schema schema4 = org.apache.avro.Schema.createFixed("{\"type\":\"array\",\"items\":\"int\"}", "{\"type\":\"double\",\"float\":\"{\\\"type\\\":\\\"array\\\",\\\"items\\\":[]}\"}", "{\"type\":\"array\",\"items\":\"null\"}", (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type org.apache.avro.SchemaParseException; message: Illegal initial character: {\"type\":\"array\",\"items\":\"int\"}");
        } catch (org.apache.avro.SchemaParseException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SchemaM3Random300Test2.test1013");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.avro.Schema schema4 = org.apache.avro.Schema.createRecord("{\"type\":\"fixed\",\"name\":\"union\",\"namespace\":\"[]\",\"doc\":\"[ ]\",\"size\":0,\"aliases\":[\"union\"]}", "{\r\n  \"type\" : \"array\",\r\n  \"items\" : [ ],\r\n  \"{}\" : \"hi!\"\r\n}", "hi!", true);
            org.junit.Assert.fail("Expected exception of type org.apache.avro.SchemaParseException; message: Illegal initial character: {\"type\":\"fixed\",\"name\":\"union\",\"namespace\":\"[]\",\"doc\":\"[ ]\",\"size\":0,\"aliases\":[\"union\"]}");
        } catch (org.apache.avro.SchemaParseException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SchemaM3Random300Test2.test1014");
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
            org.apache.avro.Schema schema17 = schema8.getElementType();
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
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNotNull(schema13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "[]" + "'", str14, "[]");
        org.junit.Assert.assertNotNull(schema15);
        org.junit.Assert.assertNotNull(schema16);
    }

    @Test
    public void test1015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SchemaM3Random300Test2.test1015");
        org.apache.avro.Schema schema2 = org.apache.avro.Schema.parse("{\r\n  \"type\" : \"array\",\r\n  \"items\" : [ ],\r\n  \"{}\" : \"hi!\"\r\n}", true);
        org.junit.Assert.assertNotNull(schema2);
    }

    @Test
    public void test1016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SchemaM3Random300Test2.test1016");
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
        org.apache.avro.Schema.LockableArrayList<org.apache.avro.Schema> schemaList23 = new org.apache.avro.Schema.LockableArrayList<org.apache.avro.Schema>(schemaList21);
        org.apache.avro.Schema schema24 = org.apache.avro.Schema.createUnion(schemaList21);
        java.lang.String str25 = schema24.toString();
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
        org.junit.Assert.assertNotNull(schema24);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "[]" + "'", str25, "[]");
    }

    @Test
    public void test1017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SchemaM3Random300Test2.test1017");
        org.apache.avro.Schema.Parser parser0 = new org.apache.avro.Schema.Parser();
        org.apache.avro.Schema.Parser parser2 = parser0.setValidate(true);
        java.util.Map<java.lang.String, org.apache.avro.Schema> strMap3 = parser0.getTypes();
        java.util.Map<java.lang.String, org.apache.avro.Schema> strMap4 = parser0.getTypes();
        org.apache.avro.Schema schema6 = parser0.parse("{\"type\":\"map\",\"values\":[]}");
        org.apache.avro.Schema.Parser parser7 = new org.apache.avro.Schema.Parser();
        java.util.Map<java.lang.String, org.apache.avro.Schema> strMap8 = parser7.getTypes();
        java.util.Map<java.lang.String, org.apache.avro.Schema> strMap9 = parser7.getTypes();
        org.apache.avro.Schema.Parser parser10 = new org.apache.avro.Schema.Parser();
        org.apache.avro.Schema.Parser parser12 = parser10.setValidate(true);
        java.util.Map<java.lang.String, org.apache.avro.Schema> strMap13 = parser10.getTypes();
        org.apache.avro.Schema.Parser parser14 = parser7.addTypes(strMap13);
        org.apache.avro.Schema.Parser parser15 = new org.apache.avro.Schema.Parser();
        org.apache.avro.Schema.Parser parser17 = parser15.setValidate(true);
        org.apache.avro.Schema.Parser parser19 = parser15.setValidate(false);
        org.apache.avro.Schema.Parser parser20 = new org.apache.avro.Schema.Parser();
        org.apache.avro.Schema.Parser parser22 = parser20.setValidate(true);
        org.apache.avro.Schema.Parser parser24 = parser20.setValidate(true);
        org.apache.avro.Schema.Parser parser26 = parser20.setValidate(true);
        org.apache.avro.Schema.Parser parser27 = new org.apache.avro.Schema.Parser();
        org.apache.avro.Schema.Parser parser29 = parser27.setValidate(true);
        java.util.Map<java.lang.String, org.apache.avro.Schema> strMap30 = parser27.getTypes();
        org.apache.avro.Schema.Parser parser32 = parser27.setValidate(true);
        org.apache.avro.Schema.Parser parser34 = parser27.setValidate(true);
        java.util.Map<java.lang.String, org.apache.avro.Schema> strMap35 = parser27.getTypes();
        org.apache.avro.Schema.Parser parser36 = parser26.addTypes(strMap35);
        org.apache.avro.Schema.Parser parser37 = parser15.addTypes(strMap35);
        org.apache.avro.Schema.Parser parser38 = parser7.addTypes(strMap35);
        org.apache.avro.Schema.Parser parser39 = parser0.addTypes(strMap35);
        org.junit.Assert.assertNotNull(parser2);
        org.junit.Assert.assertNotNull(strMap3);
        org.junit.Assert.assertNotNull(strMap4);
        org.junit.Assert.assertNotNull(schema6);
        org.junit.Assert.assertNotNull(strMap8);
        org.junit.Assert.assertNotNull(strMap9);
        org.junit.Assert.assertNotNull(parser12);
        org.junit.Assert.assertNotNull(strMap13);
        org.junit.Assert.assertNotNull(parser14);
        org.junit.Assert.assertNotNull(parser17);
        org.junit.Assert.assertNotNull(parser19);
        org.junit.Assert.assertNotNull(parser22);
        org.junit.Assert.assertNotNull(parser24);
        org.junit.Assert.assertNotNull(parser26);
        org.junit.Assert.assertNotNull(parser29);
        org.junit.Assert.assertNotNull(strMap30);
        org.junit.Assert.assertNotNull(parser32);
        org.junit.Assert.assertNotNull(parser34);
        org.junit.Assert.assertNotNull(strMap35);
        org.junit.Assert.assertNotNull(parser36);
        org.junit.Assert.assertNotNull(parser37);
        org.junit.Assert.assertNotNull(parser38);
        org.junit.Assert.assertNotNull(parser39);
    }

    @Test
    public void test1018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SchemaM3Random300Test2.test1018");
        org.apache.avro.Schema.Parser parser0 = new org.apache.avro.Schema.Parser();
        java.util.Map<java.lang.String, org.apache.avro.Schema> strMap1 = parser0.getTypes();
        java.util.Map<java.lang.String, org.apache.avro.Schema> strMap2 = parser0.getTypes();
        org.apache.avro.Schema.Parser parser3 = new org.apache.avro.Schema.Parser();
        org.apache.avro.Schema.Parser parser5 = parser3.setValidate(true);
        java.util.Map<java.lang.String, org.apache.avro.Schema> strMap6 = parser3.getTypes();
        org.apache.avro.Schema.Parser parser7 = parser0.addTypes(strMap6);
        org.apache.avro.Schema.Parser parser9 = parser7.setValidate(true);
        java.util.Map<java.lang.String, org.apache.avro.Schema> strMap10 = parser7.getTypes();
        org.apache.avro.Schema schema12 = parser7.parse("\"double\"");
        org.junit.Assert.assertNotNull(strMap1);
        org.junit.Assert.assertNotNull(strMap2);
        org.junit.Assert.assertNotNull(parser5);
        org.junit.Assert.assertNotNull(strMap6);
        org.junit.Assert.assertNotNull(parser7);
        org.junit.Assert.assertNotNull(parser9);
        org.junit.Assert.assertNotNull(strMap10);
        org.junit.Assert.assertNotNull(schema12);
    }

    @Test
    public void test1019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SchemaM3Random300Test2.test1019");
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
        org.apache.avro.Schema schema15 = parser7.parse("{\"type\":\"array\",\"items\":{\"type\":\"map\",\"values\":[]}}");
        org.apache.avro.Schema.Type type16 = org.apache.avro.Schema.Type.INT;
        org.apache.avro.Schema schema17 = org.apache.avro.Schema.create(type16);
        org.apache.avro.Schema schema18 = org.apache.avro.Schema.createArray(schema17);
        org.apache.avro.Schema schema19 = org.apache.avro.Schema.createArray(schema17);
        org.apache.avro.Schema schema20 = org.apache.avro.Schema.applyAliases(schema15, schema19);
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<org.apache.avro.Schema> schemaList21 = schema20.getTypes();
            org.junit.Assert.fail("Expected exception of type org.apache.avro.AvroRuntimeException; message: Not a union: {\"type\":\"array\",\"items\":{\"type\":\"map\",\"values\":[]}}");
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
        org.junit.Assert.assertNotNull(schema15);
        org.junit.Assert.assertTrue("'" + type16 + "' != '" + org.apache.avro.Schema.Type.INT + "'", type16.equals(org.apache.avro.Schema.Type.INT));
        org.junit.Assert.assertNotNull(schema17);
        org.junit.Assert.assertNotNull(schema18);
        org.junit.Assert.assertNotNull(schema19);
        org.junit.Assert.assertNotNull(schema20);
    }

    @Test
    public void test1020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SchemaM3Random300Test2.test1020");
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
            boolean boolean21 = schema16.isError();
            org.junit.Assert.fail("Expected exception of type org.apache.avro.AvroRuntimeException; message: Not a record: []");
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
    public void test1021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SchemaM3Random300Test2.test1021");
        org.apache.avro.Schema.Parser parser0 = new org.apache.avro.Schema.Parser();
        java.util.Map<java.lang.String, org.apache.avro.Schema> strMap1 = parser0.getTypes();
        java.util.Map<java.lang.String, org.apache.avro.Schema> strMap2 = parser0.getTypes();
        org.apache.avro.Schema.Parser parser3 = new org.apache.avro.Schema.Parser();
        org.apache.avro.Schema.Parser parser5 = parser3.setValidate(true);
        java.util.Map<java.lang.String, org.apache.avro.Schema> strMap6 = parser3.getTypes();
        org.apache.avro.Schema.Parser parser7 = parser0.addTypes(strMap6);
        java.util.Map<java.lang.String, org.apache.avro.Schema> strMap8 = parser7.getTypes();
        org.apache.avro.Schema schema10 = parser7.parse("{\"type\":\"map\",\"values\":[]}");
        org.apache.avro.Schema schema11 = schema10.getValueType();
        org.junit.Assert.assertNotNull(strMap1);
        org.junit.Assert.assertNotNull(strMap2);
        org.junit.Assert.assertNotNull(parser5);
        org.junit.Assert.assertNotNull(strMap6);
        org.junit.Assert.assertNotNull(parser7);
        org.junit.Assert.assertNotNull(strMap8);
        org.junit.Assert.assertNotNull(schema10);
        org.junit.Assert.assertNotNull(schema11);
    }

    @Test
    public void test1022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SchemaM3Random300Test2.test1022");
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
        org.apache.avro.Schema schema41 = org.apache.avro.Schema.createArray(schema8);
        // The following exception was thrown during execution in test generation
        try {
            int int43 = schema8.getEnumOrdinal("");
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
        org.junit.Assert.assertNotNull(schema41);
    }

    @Test
    public void test1023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SchemaM3Random300Test2.test1023");
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
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean14 = schema12.hasEnumSymbol("\"null\"");
            org.junit.Assert.fail("Expected exception of type org.apache.avro.AvroRuntimeException; message: Not an enum: {\"type\":\"map\",\"values\":{\"type\":\"array\",\"items\":{\"type\":\"map\",\"values\":[]}}}");
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
    public void test1024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SchemaM3Random300Test2.test1024");
        org.apache.avro.Schema[] schemaArray0 = new org.apache.avro.Schema[] {};
        java.util.ArrayList<org.apache.avro.Schema> schemaList1 = new java.util.ArrayList<org.apache.avro.Schema>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<org.apache.avro.Schema>) schemaList1, schemaArray0);
        org.apache.avro.Schema schema3 = org.apache.avro.Schema.createUnion((java.util.List<org.apache.avro.Schema>) schemaList1);
        org.apache.avro.Schema[] schemaArray4 = new org.apache.avro.Schema[] {};
        java.util.ArrayList<org.apache.avro.Schema> schemaList5 = new java.util.ArrayList<org.apache.avro.Schema>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<org.apache.avro.Schema>) schemaList5, schemaArray4);
        org.apache.avro.Schema schema7 = org.apache.avro.Schema.createUnion((java.util.List<org.apache.avro.Schema>) schemaList5);
        org.apache.avro.Schema schema8 = org.apache.avro.Schema.applyAliases(schema3, schema7);
        org.apache.avro.Schema schema9 = org.apache.avro.Schema.createArray(schema8);
        schema9.addProp("{\r\n  \"type\" : \"map\",\r\n  \"values\" : {\r\n    \"type\" : \"enum\",\r\n    \"name\" : \"union\",\r\n    \"namespace\" : \"[]\",\r\n    \"doc\" : \"{}\",\r\n    \"symbols\" : [ ]\r\n  }\r\n}", "float");
        org.junit.Assert.assertNotNull(schemaArray0);
        org.junit.Assert.assertArrayEquals(schemaArray0, new org.apache.avro.Schema[] {});
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(schema3);
        org.junit.Assert.assertNotNull(schemaArray4);
        org.junit.Assert.assertArrayEquals(schemaArray4, new org.apache.avro.Schema[] {});
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(schema7);
        org.junit.Assert.assertNotNull(schema8);
        org.junit.Assert.assertNotNull(schema9);
    }

    @Test
    public void test1025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SchemaM3Random300Test2.test1025");
        org.apache.avro.Schema schema1 = org.apache.avro.Schema.parse("[]");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.avro.Schema schema2 = schema1.getValueType();
            org.junit.Assert.fail("Expected exception of type org.apache.avro.AvroRuntimeException; message: Not a map: []");
        } catch (org.apache.avro.AvroRuntimeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(schema1);
    }

    @Test
    public void test1026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SchemaM3Random300Test2.test1026");
        org.apache.avro.Schema.Parser parser0 = new org.apache.avro.Schema.Parser();
        java.util.Map<java.lang.String, org.apache.avro.Schema> strMap1 = parser0.getTypes();
        java.util.Map<java.lang.String, org.apache.avro.Schema> strMap2 = parser0.getTypes();
        org.apache.avro.Schema.Parser parser3 = new org.apache.avro.Schema.Parser();
        org.apache.avro.Schema.Parser parser5 = parser3.setValidate(true);
        java.util.Map<java.lang.String, org.apache.avro.Schema> strMap6 = parser3.getTypes();
        org.apache.avro.Schema.Parser parser7 = parser0.addTypes(strMap6);
        java.util.Map<java.lang.String, org.apache.avro.Schema> strMap8 = parser0.getTypes();
        org.apache.avro.Schema.Parser parser10 = parser0.setValidate(false);
        org.apache.avro.Schema.Parser parser12 = parser0.setValidate(false);
        boolean boolean13 = parser12.getValidate();
        org.apache.avro.Schema.Parser parser14 = new org.apache.avro.Schema.Parser();
        org.apache.avro.Schema.Parser parser16 = parser14.setValidate(true);
        java.util.Map<java.lang.String, org.apache.avro.Schema> strMap17 = parser14.getTypes();
        org.apache.avro.Schema.Parser parser18 = parser12.addTypes(strMap17);
        java.util.Map<java.lang.String, org.apache.avro.Schema> strMap19 = parser18.getTypes();
        org.junit.Assert.assertNotNull(strMap1);
        org.junit.Assert.assertNotNull(strMap2);
        org.junit.Assert.assertNotNull(parser5);
        org.junit.Assert.assertNotNull(strMap6);
        org.junit.Assert.assertNotNull(parser7);
        org.junit.Assert.assertNotNull(strMap8);
        org.junit.Assert.assertNotNull(parser10);
        org.junit.Assert.assertNotNull(parser12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(parser16);
        org.junit.Assert.assertNotNull(strMap17);
        org.junit.Assert.assertNotNull(parser18);
        org.junit.Assert.assertNotNull(strMap19);
    }

    @Test
    public void test1027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SchemaM3Random300Test2.test1027");
        org.codehaus.jackson.JsonNode jsonNode1 = org.apache.avro.Schema.parseJson("{\"type\":\"fixed\",\"name\":\"union\",\"namespace\":\"[]\",\"doc\":\"union type:UNION pos:-1\",\"size\":100}");
        java.lang.Class<?> wildcardClass2 = jsonNode1.getClass();
        org.junit.Assert.assertNotNull(jsonNode1);
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test1028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SchemaM3Random300Test2.test1028");
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
        // The following exception was thrown during execution in test generation
        try {
            org.apache.avro.Schema.Field field17 = schema8.getField("{\"type\":\"record\",\"fields\":[]}");
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
    }

    @Test
    public void test1029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SchemaM3Random300Test2.test1029");
        org.apache.avro.Schema.LockableArrayList<java.util.Collection<java.lang.String>> strCollectionList1 = new org.apache.avro.Schema.LockableArrayList<java.util.Collection<java.lang.String>>(100);
    }

    @Test
    public void test1030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SchemaM3Random300Test2.test1030");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.avro.Schema schema4 = org.apache.avro.Schema.createRecord("{\"type\":\"array\",\"items\":{\"type\":\"array\",\"items\":{\"type\":\"map\",\"values\":[]}}}", "{\"type\":\"array\",\"items\":\"int\"}", "", false);
            org.junit.Assert.fail("Expected exception of type org.apache.avro.SchemaParseException; message: Illegal initial character: {\"type\":\"array\",\"items\":{\"type\":\"array\",\"items\":{\"type\":\"map\",\"values\":[]}}}");
        } catch (org.apache.avro.SchemaParseException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SchemaM3Random300Test2.test1031");
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
        java.lang.String str16 = schema15.getFullName();
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
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "array" + "'", str16, "array");
    }

    @Test
    public void test1032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SchemaM3Random300Test2.test1032");
        org.apache.avro.Schema.Names names1 = new org.apache.avro.Schema.Names("{\r\n  \"type\" : \"fixed\",\r\n  \"name\" : \"union\",\r\n  \"namespace\" : \"[]\",\r\n  \"doc\" : \"[ ]\",\r\n  \"size\" : 0\r\n}");
        java.util.Collection<org.apache.avro.Schema> schemaCollection2 = names1.values();
        java.lang.Class<?> wildcardClass3 = schemaCollection2.getClass();
        org.junit.Assert.assertNotNull(schemaCollection2);
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test1033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SchemaM3Random300Test2.test1033");
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
        java.lang.String str44 = schema43.toString();
        org.apache.avro.Schema.Names names45 = new org.apache.avro.Schema.Names();
        java.lang.String str46 = names45.space();
        int int47 = names45.size();
        org.codehaus.jackson.JsonGenerator jsonGenerator48 = null;
        // The following exception was thrown during execution in test generation
        try {
            schema43.toJson(names45, jsonGenerator48);
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
        org.junit.Assert.assertEquals("'" + str44 + "' != '" + "[]" + "'", str44, "[]");
        org.junit.Assert.assertNull(str46);
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + 0 + "'", int47 == 0);
    }

    @Test
    public void test1034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SchemaM3Random300Test2.test1034");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.avro.Schema schema4 = org.apache.avro.Schema.createRecord("{\"type\":\"record\",\"fields\":[]}", "{\"type\":\"fixed\",\"name\":\"union\",\"namespace\":\"[]\",\"doc\":\"[ ]\",\"size\":0,\"aliases\":[\"union\"]}", "{\"type\":\"record\",\"fields\":[],\"{\\r\\n  \\\"type\\\" : \\\"fixed\\\",\\r\\n  \\\"name\\\" : \\\"union\\\",\\r\\n  \\\"namespace\\\" : \\\"[]\\\",\\r\\n  \\\"doc\\\" : \\\"[ ]\\\",\\r\\n  \\\"size\\\" : 0\\r\\n}\":\"[ ]\"}", false);
            org.junit.Assert.fail("Expected exception of type org.apache.avro.SchemaParseException; message: Illegal initial character: {\"type\":\"record\",\"fields\":[]}");
        } catch (org.apache.avro.SchemaParseException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SchemaM3Random300Test2.test1035");
        org.apache.avro.Schema.Names names1 = new org.apache.avro.Schema.Names("{\"type\":\"map\",\"values\":[]}");
        java.lang.String str2 = names1.toString();
        java.lang.String str3 = names1.toString();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "{}" + "'", str2, "{}");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "{}" + "'", str3, "{}");
    }

    @Test
    public void test1036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SchemaM3Random300Test2.test1036");
        org.apache.avro.Schema schema1 = org.apache.avro.Schema.parse("{\"type\":\"array\",\"items\":{\"type\":\"map\",\"values\":[]}}");
        java.lang.String str2 = schema1.toString();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = schema1.isError();
            org.junit.Assert.fail("Expected exception of type org.apache.avro.AvroRuntimeException; message: Not a record: {\"type\":\"array\",\"items\":{\"type\":\"map\",\"values\":[]}}");
        } catch (org.apache.avro.AvroRuntimeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(schema1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "{\"type\":\"array\",\"items\":{\"type\":\"map\",\"values\":[]}}" + "'", str2, "{\"type\":\"array\",\"items\":{\"type\":\"map\",\"values\":[]}}");
    }

    @Test
    public void test1037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SchemaM3Random300Test2.test1037");
        org.apache.avro.Schema.LockableArrayList<java.lang.String> strList7 = new org.apache.avro.Schema.LockableArrayList<java.lang.String>((int) (byte) 10);
        org.apache.avro.Schema schema8 = org.apache.avro.Schema.createEnum("[].union", "union type:UNION pos:-1", "union type:UNION pos:-1", (java.util.List<java.lang.String>) strList7);
        java.util.List<java.lang.String> strList9 = schema8.getEnumSymbols();
        org.apache.avro.Schema schema10 = org.apache.avro.Schema.createEnum("map", "\"null\"", "{}", strList9);
        // The following exception was thrown during execution in test generation
        try {
            int int11 = schema10.getFixedSize();
            org.junit.Assert.fail("Expected exception of type org.apache.avro.AvroRuntimeException; message: Not fixed: {\"type\":\"enum\",\"name\":\"map\",\"namespace\":\"{}\",\"doc\":\"\\\"null\\\"\",\"symbols\":[]}");
        } catch (org.apache.avro.AvroRuntimeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(schema8);
        org.junit.Assert.assertNotNull(strList9);
        org.junit.Assert.assertNotNull(schema10);
    }

    @Test
    public void test1038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SchemaM3Random300Test2.test1038");
        org.apache.avro.Schema[] schemaArray0 = new org.apache.avro.Schema[] {};
        java.util.ArrayList<org.apache.avro.Schema> schemaList1 = new java.util.ArrayList<org.apache.avro.Schema>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<org.apache.avro.Schema>) schemaList1, schemaArray0);
        org.apache.avro.Schema schema3 = org.apache.avro.Schema.createUnion((java.util.List<org.apache.avro.Schema>) schemaList1);
        java.util.List<org.apache.avro.Schema> schemaList4 = schema3.getTypes();
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
        org.junit.Assert.assertNotNull(schemaList4);
    }

    @Test
    public void test1039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SchemaM3Random300Test2.test1039");
        org.apache.avro.Schema schema2 = org.apache.avro.Schema.parse("{\"type\":\"array\",\"items\":[],\"union type:UNION pos:-1\":\"\"}", false);
        org.junit.Assert.assertNotNull(schema2);
    }

    @Test
    public void test1040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SchemaM3Random300Test2.test1040");
        org.apache.avro.Schema.Parser parser0 = new org.apache.avro.Schema.Parser();
        java.util.Map<java.lang.String, org.apache.avro.Schema> strMap1 = parser0.getTypes();
        java.util.Map<java.lang.String, org.apache.avro.Schema> strMap2 = parser0.getTypes();
        org.apache.avro.Schema.Parser parser3 = new org.apache.avro.Schema.Parser();
        java.util.Map<java.lang.String, org.apache.avro.Schema> strMap4 = parser3.getTypes();
        org.apache.avro.Schema.Parser parser5 = parser0.addTypes(strMap4);
        org.apache.avro.Schema schema7 = parser0.parse("{\r\n  \"type\" : \"map\",\r\n  \"values\" : [ ]\r\n}");
        org.apache.avro.Schema.Parser parser9 = parser0.setValidate(true);
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
        org.junit.Assert.assertNotNull(schema7);
        org.junit.Assert.assertNotNull(parser9);
    }

    @Test
    public void test1041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SchemaM3Random300Test2.test1041");
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
        java.io.File file14 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.avro.Schema schema15 = parser7.parse(file14);
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
        org.junit.Assert.assertNotNull(parser11);
        org.junit.Assert.assertNotNull(schema13);
    }

    @Test
    public void test1042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SchemaM3Random300Test2.test1042");
        org.apache.avro.Schema.Type type0 = org.apache.avro.Schema.Type.INT;
        org.apache.avro.Schema schema1 = org.apache.avro.Schema.create(type0);
        schema1.addProp("{\r\n  \"type\" : \"map\",\r\n  \"values\" : {\r\n    \"type\" : \"map\",\r\n    \"values\" : [ ]\r\n  }\r\n}", "{}");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.avro.Schema schema5 = schema1.getValueType();
            org.junit.Assert.fail("Expected exception of type org.apache.avro.AvroRuntimeException; message: Not a map: {\"type\":\"int\",\"{\\r\\n  \\\"type\\\" : \\\"map\\\",\\r\\n  \\\"values\\\" : {\\r\\n    \\\"type\\\" : \\\"map\\\",\\r\\n    \\\"values\\\" : [ ]\\r\\n  }\\r\\n}\":\"{}\"}");
        } catch (org.apache.avro.AvroRuntimeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + type0 + "' != '" + org.apache.avro.Schema.Type.INT + "'", type0.equals(org.apache.avro.Schema.Type.INT));
        org.junit.Assert.assertNotNull(schema1);
    }

    @Test
    public void test1043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SchemaM3Random300Test2.test1043");
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
        java.lang.String str13 = schema11.toString();
        org.apache.avro.Schema schema14 = org.apache.avro.Schema.createArray(schema11);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean16 = schema11.hasEnumSymbol("");
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
        org.junit.Assert.assertNotNull(schema12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "{\"type\":\"array\",\"items\":{\"type\":\"map\",\"values\":[]}}" + "'", str13, "{\"type\":\"array\",\"items\":{\"type\":\"map\",\"values\":[]}}");
        org.junit.Assert.assertNotNull(schema14);
    }

    @Test
    public void test1044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SchemaM3Random300Test2.test1044");
        org.apache.avro.Schema.Field[] fieldArray0 = new org.apache.avro.Schema.Field[] {};
        java.util.ArrayList<org.apache.avro.Schema.Field> fieldList1 = new java.util.ArrayList<org.apache.avro.Schema.Field>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<org.apache.avro.Schema.Field>) fieldList1, fieldArray0);
        org.apache.avro.Schema schema3 = org.apache.avro.Schema.createRecord((java.util.List<org.apache.avro.Schema.Field>) fieldList1);
        org.apache.avro.Schema.Field field5 = schema3.getField("");
        org.apache.avro.Schema schema6 = org.apache.avro.Schema.createMap(schema3);
        org.apache.avro.Schema.Type type7 = schema3.getType();
        org.apache.avro.Schema schema8 = org.apache.avro.Schema.createMap(schema3);
        boolean boolean9 = schema3.isError();
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<java.lang.String> strList10 = schema3.getEnumSymbols();
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
        org.junit.Assert.assertNotNull(schema8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test1045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SchemaM3Random300Test2.test1045");
        java.util.List<java.lang.Object> objList0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.avro.Schema.LockableArrayList<java.lang.Object> objList1 = new org.apache.avro.Schema.LockableArrayList<java.lang.Object>(objList0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SchemaM3Random300Test2.test1046");
        org.apache.avro.Schema.LockableArrayList<java.lang.String> strList4 = new org.apache.avro.Schema.LockableArrayList<java.lang.String>((int) 'a');
        org.apache.avro.Schema.LockableArrayList<java.lang.String> strList5 = new org.apache.avro.Schema.LockableArrayList<java.lang.String>((java.util.List<java.lang.String>) strList4);
        org.apache.avro.Schema schema6 = org.apache.avro.Schema.createEnum("array", "{\"type\":\"array\",\"items\":{\"type\":\"map\",\"values\":[]}}", "[].union", (java.util.List<java.lang.String>) strList4);
        org.junit.Assert.assertNotNull(schema6);
    }

    @Test
    public void test1047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SchemaM3Random300Test2.test1047");
        org.codehaus.jackson.JsonNode jsonNode1 = org.apache.avro.Schema.parseJson("{\r\n  \"type\" : \"map\",\r\n  \"values\" : {\r\n    \"type\" : \"fixed\",\r\n    \"name\" : \"union\",\r\n    \"namespace\" : \"[]\",\r\n    \"doc\" : \"[ ]\",\r\n    \"size\" : 0\r\n  }\r\n}");
        org.junit.Assert.assertNotNull(jsonNode1);
    }

    @Test
    public void test1048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SchemaM3Random300Test2.test1048");
        org.apache.avro.Schema.Type type0 = org.apache.avro.Schema.Type.INT;
        org.apache.avro.Schema schema1 = org.apache.avro.Schema.create(type0);
        org.apache.avro.Schema schema2 = org.apache.avro.Schema.createArray(schema1);
        org.apache.avro.Schema schema3 = org.apache.avro.Schema.createMap(schema2);
        org.apache.avro.Schema schema4 = schema2.getElementType();
        org.apache.avro.Schema schema5 = org.apache.avro.Schema.createArray(schema4);
        java.lang.String str7 = schema4.getProp("");
        org.junit.Assert.assertTrue("'" + type0 + "' != '" + org.apache.avro.Schema.Type.INT + "'", type0.equals(org.apache.avro.Schema.Type.INT));
        org.junit.Assert.assertNotNull(schema1);
        org.junit.Assert.assertNotNull(schema2);
        org.junit.Assert.assertNotNull(schema3);
        org.junit.Assert.assertNotNull(schema4);
        org.junit.Assert.assertNotNull(schema5);
        org.junit.Assert.assertNull(str7);
    }

    @Test
    public void test1049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SchemaM3Random300Test2.test1049");
        org.apache.avro.Schema.Names names0 = new org.apache.avro.Schema.Names();
        java.lang.String str1 = names0.toString();
        int int2 = names0.size();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "{}" + "'", str1, "{}");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test1050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SchemaM3Random300Test2.test1050");
        org.apache.avro.Schema.Type type0 = org.apache.avro.Schema.Type.DOUBLE;
        org.apache.avro.Schema schema1 = org.apache.avro.Schema.create(type0);
        org.apache.avro.Schema schema2 = org.apache.avro.Schema.createMap(schema1);
        schema1.addProp("float", "{\"type\":\"array\",\"items\":[]}");
        java.lang.String str7 = schema1.toString(false);
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<org.apache.avro.Schema> schemaList8 = schema1.getTypes();
            org.junit.Assert.fail("Expected exception of type org.apache.avro.AvroRuntimeException; message: Not a union: {\"type\":\"double\",\"float\":\"{\\\"type\\\":\\\"array\\\",\\\"items\\\":[]}\"}");
        } catch (org.apache.avro.AvroRuntimeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + type0 + "' != '" + org.apache.avro.Schema.Type.DOUBLE + "'", type0.equals(org.apache.avro.Schema.Type.DOUBLE));
        org.junit.Assert.assertNotNull(schema1);
        org.junit.Assert.assertNotNull(schema2);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "{\"type\":\"double\",\"float\":\"{\\\"type\\\":\\\"array\\\",\\\"items\\\":[]}\"}" + "'", str7, "{\"type\":\"double\",\"float\":\"{\\\"type\\\":\\\"array\\\",\\\"items\\\":[]}\"}");
    }

    @Test
    public void test1051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SchemaM3Random300Test2.test1051");
        org.apache.avro.Schema schema4 = org.apache.avro.Schema.createFixed("float", "{\r\n  \"type\" : \"map\",\r\n  \"values\" : [ ]\r\n}", "int", (int) '4');
        // The following exception was thrown during execution in test generation
        try {
            org.apache.avro.Schema schema5 = schema4.getElementType();
            org.junit.Assert.fail("Expected exception of type org.apache.avro.AvroRuntimeException; message: Not an array: {\"type\":\"fixed\",\"name\":\"float\",\"namespace\":\"int\",\"doc\":\"{\\r\\n  \\\"type\\\" : \\\"map\\\",\\r\\n  \\\"values\\\" : [ ]\\r\\n}\",\"size\":52}");
        } catch (org.apache.avro.AvroRuntimeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(schema4);
    }

    @Test
    public void test1052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SchemaM3Random300Test2.test1052");
        org.apache.avro.Schema.Parser parser0 = new org.apache.avro.Schema.Parser();
        java.util.Map<java.lang.String, org.apache.avro.Schema> strMap1 = parser0.getTypes();
        org.apache.avro.Schema.Parser parser2 = new org.apache.avro.Schema.Parser();
        org.apache.avro.Schema.Parser parser4 = parser2.setValidate(true);
        java.util.Map<java.lang.String, org.apache.avro.Schema> strMap5 = parser2.getTypes();
        org.apache.avro.Schema.Parser parser6 = parser0.addTypes(strMap5);
        boolean boolean7 = parser6.getValidate();
        org.apache.avro.Schema.Parser parser8 = new org.apache.avro.Schema.Parser();
        org.apache.avro.Schema.Parser parser10 = parser8.setValidate(true);
        org.apache.avro.Schema.Parser parser12 = parser8.setValidate(true);
        org.apache.avro.Schema.Parser parser14 = parser8.setValidate(true);
        org.apache.avro.Schema.Parser parser15 = new org.apache.avro.Schema.Parser();
        org.apache.avro.Schema.Parser parser17 = parser15.setValidate(true);
        java.util.Map<java.lang.String, org.apache.avro.Schema> strMap18 = parser15.getTypes();
        org.apache.avro.Schema.Parser parser20 = parser15.setValidate(true);
        org.apache.avro.Schema.Parser parser22 = parser15.setValidate(true);
        java.util.Map<java.lang.String, org.apache.avro.Schema> strMap23 = parser15.getTypes();
        org.apache.avro.Schema.Parser parser24 = parser14.addTypes(strMap23);
        org.apache.avro.Schema.Parser parser25 = parser6.addTypes(strMap23);
        boolean boolean26 = parser25.getValidate();
        boolean boolean27 = parser25.getValidate();
        java.io.File file28 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.avro.Schema schema29 = parser25.parse(file28);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strMap1);
        org.junit.Assert.assertNotNull(parser4);
        org.junit.Assert.assertNotNull(strMap5);
        org.junit.Assert.assertNotNull(parser6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(parser10);
        org.junit.Assert.assertNotNull(parser12);
        org.junit.Assert.assertNotNull(parser14);
        org.junit.Assert.assertNotNull(parser17);
        org.junit.Assert.assertNotNull(strMap18);
        org.junit.Assert.assertNotNull(parser20);
        org.junit.Assert.assertNotNull(parser22);
        org.junit.Assert.assertNotNull(strMap23);
        org.junit.Assert.assertNotNull(parser24);
        org.junit.Assert.assertNotNull(parser25);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
    }

    @Test
    public void test1053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SchemaM3Random300Test2.test1053");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.avro.Schema schema4 = org.apache.avro.Schema.createFixed("", "{\"type\":\"fixed\",\"name\":\"union\",\"namespace\":\"[]\",\"doc\":\"[ ]\",\"size\":0,\"aliases\":[\"union\"]}", "{\"type\":\"fixed\",\"name\":\"union\",\"namespace\":\"[]\",\"doc\":\"union type:UNION pos:-1\",\"size\":100}", (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type org.apache.avro.SchemaParseException; message: Empty name");
        } catch (org.apache.avro.SchemaParseException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SchemaM3Random300Test2.test1054");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.avro.Schema schema4 = org.apache.avro.Schema.createFixed("\"null\"", "{\r\n  \"type\" : \"record\",\r\n  \"fields\" : [ ]\r\n}", "{\r\n  \"type\" : \"array\",\r\n  \"items\" : {\r\n    \"type\" : \"map\",\r\n    \"values\" : [ ]\r\n  }\r\n}", 10);
            org.junit.Assert.fail("Expected exception of type org.apache.avro.SchemaParseException; message: Illegal initial character: \"null\"");
        } catch (org.apache.avro.SchemaParseException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SchemaM3Random300Test2.test1055");
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
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean18 = schema7.isError();
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
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "union" + "'", str16, "union");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "union" + "'", str17, "union");
    }

    @Test
    public void test1056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SchemaM3Random300Test2.test1056");
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
        org.apache.avro.Schema schema11 = org.apache.avro.Schema.createArray(schema7);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.avro.Schema schema12 = schema7.getValueType();
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
        org.junit.Assert.assertTrue("'" + type10 + "' != '" + org.apache.avro.Schema.Type.UNION + "'", type10.equals(org.apache.avro.Schema.Type.UNION));
        org.junit.Assert.assertNotNull(schema11);
    }

    @Test
    public void test1057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SchemaM3Random300Test2.test1057");
        org.apache.avro.Schema.Names names1 = new org.apache.avro.Schema.Names("hi!");
    }

    @Test
    public void test1058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SchemaM3Random300Test2.test1058");
        org.apache.avro.Schema schema1 = org.apache.avro.Schema.parse("[].union");
        org.junit.Assert.assertNotNull(schema1);
    }

    @Test
    public void test1059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SchemaM3Random300Test2.test1059");
        org.apache.avro.Schema.LockableArrayList<java.lang.Comparable<java.lang.String>> strComparableList0 = new org.apache.avro.Schema.LockableArrayList<java.lang.Comparable<java.lang.String>>();
    }

    @Test
    public void test1060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SchemaM3Random300Test2.test1060");
        org.apache.avro.Schema.Type type0 = org.apache.avro.Schema.Type.INT;
        org.apache.avro.Schema schema1 = org.apache.avro.Schema.create(type0);
        org.apache.avro.Schema schema2 = org.apache.avro.Schema.createArray(schema1);
        schema1.addProp("union type:UNION pos:-1", "[ ]");
        org.apache.avro.Schema.Type type6 = schema1.getType();
        java.lang.String str8 = schema1.getProp("{\"type\":\"fixed\",\"name\":\"union\",\"namespace\":\"[]\",\"doc\":\"[ ]\",\"size\":0}");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Set<java.lang.String> strSet9 = schema1.getAliases();
            org.junit.Assert.fail("Expected exception of type org.apache.avro.AvroRuntimeException; message: Not a named type: {\"type\":\"int\",\"union type:UNION pos:-1\":\"[ ]\"}");
        } catch (org.apache.avro.AvroRuntimeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + type0 + "' != '" + org.apache.avro.Schema.Type.INT + "'", type0.equals(org.apache.avro.Schema.Type.INT));
        org.junit.Assert.assertNotNull(schema1);
        org.junit.Assert.assertNotNull(schema2);
        org.junit.Assert.assertTrue("'" + type6 + "' != '" + org.apache.avro.Schema.Type.INT + "'", type6.equals(org.apache.avro.Schema.Type.INT));
        org.junit.Assert.assertNull(str8);
    }

    @Test
    public void test1061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SchemaM3Random300Test2.test1061");
        org.apache.avro.Schema.LockableArrayList<java.lang.reflect.GenericDeclaration> genericDeclarationList0 = new org.apache.avro.Schema.LockableArrayList<java.lang.reflect.GenericDeclaration>();
    }

    @Test
    public void test1062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SchemaM3Random300Test2.test1062");
        org.apache.avro.Schema.LockableArrayList<java.lang.Class<?>> wildcardClassList1 = new org.apache.avro.Schema.LockableArrayList<java.lang.Class<?>>(100);
    }

    @Test
    public void test1063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SchemaM3Random300Test2.test1063");
        org.apache.avro.Schema.Parser parser0 = new org.apache.avro.Schema.Parser();
        java.util.Map<java.lang.String, org.apache.avro.Schema> strMap1 = parser0.getTypes();
        org.apache.avro.Schema.Parser parser2 = new org.apache.avro.Schema.Parser();
        org.apache.avro.Schema.Parser parser4 = parser2.setValidate(true);
        java.util.Map<java.lang.String, org.apache.avro.Schema> strMap5 = parser2.getTypes();
        org.apache.avro.Schema.Parser parser6 = parser0.addTypes(strMap5);
        boolean boolean7 = parser0.getValidate();
        boolean boolean8 = parser0.getValidate();
        boolean boolean9 = parser0.getValidate();
        boolean boolean10 = parser0.getValidate();
        org.junit.Assert.assertNotNull(strMap1);
        org.junit.Assert.assertNotNull(parser4);
        org.junit.Assert.assertNotNull(strMap5);
        org.junit.Assert.assertNotNull(parser6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test1064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SchemaM3Random300Test2.test1064");
        org.codehaus.jackson.JsonNode jsonNode1 = org.apache.avro.Schema.parseJson("{\"type\":\"array\",\"items\":[],\"union type:UNION pos:-1\":\"\"}");
        org.junit.Assert.assertNotNull(jsonNode1);
    }

    @Test
    public void test1065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SchemaM3Random300Test2.test1065");
        org.apache.avro.Schema.LockableArrayList<java.lang.String> strList3 = new org.apache.avro.Schema.LockableArrayList<java.lang.String>();
        org.apache.avro.Schema schema4 = org.apache.avro.Schema.createEnum("double", "{\"type\":\"fixed\",\"name\":\"union\",\"namespace\":\"[]\",\"doc\":\"[ ]\",\"size\":0,\"aliases\":[\"union\"]}", "{\"type\":\"fixed\",\"name\":\"union\",\"namespace\":\"[]\",\"doc\":\"[ ]\",\"size\":0,\"aliases\":[\"union\"]}", (java.util.List<java.lang.String>) strList3);
        org.junit.Assert.assertNotNull(schema4);
    }

    @Test
    public void test1066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SchemaM3Random300Test2.test1066");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.avro.Schema schema4 = org.apache.avro.Schema.createRecord("[ ]", "{\"type\":\"record\",\"fields\":[],\"{\\r\\n  \\\"type\\\" : \\\"fixed\\\",\\r\\n  \\\"name\\\" : \\\"union\\\",\\r\\n  \\\"namespace\\\" : \\\"[]\\\",\\r\\n  \\\"doc\\\" : \\\"[ ]\\\",\\r\\n  \\\"size\\\" : 0\\r\\n}\":\"[ ]\"}", "{\"type\":\"array\",\"items\":{\"type\":\"record\",\"fields\":[]}}", false);
            org.junit.Assert.fail("Expected exception of type org.apache.avro.SchemaParseException; message: Illegal initial character: [ ]");
        } catch (org.apache.avro.SchemaParseException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SchemaM3Random300Test2.test1067");
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
        java.lang.String str25 = schema20.getFullName();
        // The following exception was thrown during execution in test generation
        try {
            int int26 = schema20.getFixedSize();
            org.junit.Assert.fail("Expected exception of type org.apache.avro.AvroRuntimeException; message: Not fixed: {\"type\":\"map\",\"values\":[]}");
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
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "map" + "'", str25, "map");
    }

    @Test
    public void test1068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SchemaM3Random300Test2.test1068");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.avro.Schema schema4 = org.apache.avro.Schema.createRecord("{\"type\":\"fixed\",\"name\":\"union\",\"namespace\":\"[]\",\"doc\":\"[ ]\",\"size\":0,\"aliases\":[\"union\"]}", "\"double\"", "{\"type\":\"array\",\"items\":{\"type\":\"record\",\"fields\":[]}}", true);
            org.junit.Assert.fail("Expected exception of type org.apache.avro.SchemaParseException; message: Illegal initial character: {\"type\":\"fixed\",\"name\":\"union\",\"namespace\":\"[]\",\"doc\":\"[ ]\",\"size\":0,\"aliases\":[\"union\"]}");
        } catch (org.apache.avro.SchemaParseException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SchemaM3Random300Test2.test1069");
        org.apache.avro.Schema schema1 = org.apache.avro.Schema.parse("{\"type\":\"fixed\",\"name\":\"union\",\"namespace\":\"[]\",\"doc\":\"[ ]\",\"size\":0}");
        java.lang.String str2 = schema1.getDoc();
        java.util.Set<java.lang.String> strSet3 = schema1.getAliases();
        org.junit.Assert.assertNotNull(schema1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "[ ]" + "'", str2, "[ ]");
        org.junit.Assert.assertNotNull(strSet3);
    }

    @Test
    public void test1070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SchemaM3Random300Test2.test1070");
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
        java.lang.String str12 = schema7.toString(false);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean13 = schema7.isError();
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
        org.junit.Assert.assertTrue("'" + type10 + "' != '" + org.apache.avro.Schema.Type.UNION + "'", type10.equals(org.apache.avro.Schema.Type.UNION));
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "[]" + "'", str12, "[]");
    }

    @Test
    public void test1071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SchemaM3Random300Test2.test1071");
        org.apache.avro.Schema.Parser parser0 = new org.apache.avro.Schema.Parser();
        org.apache.avro.Schema.Parser parser2 = parser0.setValidate(true);
        java.util.Map<java.lang.String, org.apache.avro.Schema> strMap3 = parser0.getTypes();
        org.apache.avro.Schema schema5 = parser0.parse("{\"type\":\"array\",\"items\":{\"type\":\"map\",\"values\":[]}}");
        // The following exception was thrown during execution in test generation
        try {
            int int6 = schema5.getFixedSize();
            org.junit.Assert.fail("Expected exception of type org.apache.avro.AvroRuntimeException; message: Not fixed: {\"type\":\"array\",\"items\":{\"type\":\"map\",\"values\":[]}}");
        } catch (org.apache.avro.AvroRuntimeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(parser2);
        org.junit.Assert.assertNotNull(strMap3);
        org.junit.Assert.assertNotNull(schema5);
    }

    @Test
    public void test1072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SchemaM3Random300Test2.test1072");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.avro.Schema schema2 = org.apache.avro.Schema.parse("{null={\"type\":\"map\",\"values\":{\"type\":\"array\",\"items\":{\"type\":\"map\",\"values\":[]}}}}", false);
            org.junit.Assert.fail("Expected exception of type org.apache.avro.SchemaParseException; message: org.codehaus.jackson.JsonParseException: Unexpected character ('n' (code 110)): was expecting double-quote to start field name? at [Source: java.io.StringReader@946f2b8; line: 1, column: 3]");
        } catch (org.apache.avro.SchemaParseException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SchemaM3Random300Test2.test1073");
        org.apache.avro.Schema schema1 = org.apache.avro.Schema.parse("{\r\n  \"type\" : \"array\",\r\n  \"items\" : \"int\"\r\n}");
        org.junit.Assert.assertNotNull(schema1);
    }

    @Test
    public void test1074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SchemaM3Random300Test2.test1074");
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
        java.lang.String str13 = schema11.toString();
        org.apache.avro.Schema schema14 = org.apache.avro.Schema.createArray(schema11);
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<org.apache.avro.Schema.Field> fieldList15 = schema14.getFields();
            org.junit.Assert.fail("Expected exception of type org.apache.avro.AvroRuntimeException; message: Not a record: {\"type\":\"array\",\"items\":{\"type\":\"array\",\"items\":{\"type\":\"map\",\"values\":[]}}}");
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
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "{\"type\":\"array\",\"items\":{\"type\":\"map\",\"values\":[]}}" + "'", str13, "{\"type\":\"array\",\"items\":{\"type\":\"map\",\"values\":[]}}");
        org.junit.Assert.assertNotNull(schema14);
    }

    @Test
    public void test1075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SchemaM3Random300Test2.test1075");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.avro.Schema schema4 = org.apache.avro.Schema.createFixed("\"null\"", "{\r\n  \"type\" : \"array\",\r\n  \"items\" : \"int\"\r\n}", "{}", (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type org.apache.avro.SchemaParseException; message: Illegal initial character: \"null\"");
        } catch (org.apache.avro.SchemaParseException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SchemaM3Random300Test2.test1076");
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
        java.util.Map<java.lang.String, org.apache.avro.Schema> strMap19 = parser18.getTypes();
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
        org.junit.Assert.assertNotNull(strMap19);
    }

    @Test
    public void test1077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SchemaM3Random300Test2.test1077");
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
        org.apache.avro.Schema schema17 = org.apache.avro.Schema.createUnion(schemaList16);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.avro.Schema.Field field19 = schema17.getField("[]");
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
        org.junit.Assert.assertNotNull(schema17);
    }

    @Test
    public void test1078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SchemaM3Random300Test2.test1078");
        org.apache.avro.Schema.Type type0 = org.apache.avro.Schema.Type.INT;
        org.apache.avro.Schema schema1 = org.apache.avro.Schema.create(type0);
        org.apache.avro.Schema schema2 = org.apache.avro.Schema.create(type0);
        org.apache.avro.Schema.Names names3 = new org.apache.avro.Schema.Names();
        java.lang.String str4 = names3.space();
        names3.space("");
        boolean boolean7 = schema2.equals((java.lang.Object) names3);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str8 = schema2.getNamespace();
            org.junit.Assert.fail("Expected exception of type org.apache.avro.AvroRuntimeException; message: Not a named type: \"int\"");
        } catch (org.apache.avro.AvroRuntimeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + type0 + "' != '" + org.apache.avro.Schema.Type.INT + "'", type0.equals(org.apache.avro.Schema.Type.INT));
        org.junit.Assert.assertNotNull(schema1);
        org.junit.Assert.assertNotNull(schema2);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test1079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SchemaM3Random300Test2.test1079");
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
        java.lang.String str35 = schema8.getDoc();
        java.lang.String str37 = schema8.toString(true);
        // The following exception was thrown during execution in test generation
        try {
            int int39 = schema8.getEnumOrdinal("union type:UNION pos:-1");
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
        org.junit.Assert.assertNull(str35);
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "[ ]" + "'", str37, "[ ]");
    }

    @Test
    public void test1080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SchemaM3Random300Test2.test1080");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.avro.Schema schema4 = org.apache.avro.Schema.createRecord("{\r\n  \"type\" : \"map\",\r\n  \"values\" : {\r\n    \"type\" : \"enum\",\r\n    \"name\" : \"union\",\r\n    \"namespace\" : \"[]\",\r\n    \"doc\" : \"{}\",\r\n    \"symbols\" : [ ]\r\n  }\r\n}", "{\r\n  \"type\" : \"record\",\r\n  \"fields\" : [ ],\r\n  \"{\\r\\n  \\\"type\\\" : \\\"fixed\\\",\\r\\n  \\\"name\\\" : \\\"union\\\",\\r\\n  \\\"namespace\\\" : \\\"[]\\\",\\r\\n  \\\"doc\\\" : \\\"[ ]\\\",\\r\\n  \\\"size\\\" : 0\\r\\n}\" : \"[ ]\"\r\n}", "{\r\n  \"type\" : \"array\",\r\n  \"items\" : [ ],\r\n  \"{}\" : \"hi!\"\r\n}", true);
            org.junit.Assert.fail("Expected exception of type org.apache.avro.SchemaParseException; message: Illegal initial character: {??  \"type\" : \"map\",??  \"values\" : {??    \"type\" : \"enum\",??    \"name\" : \"union\",??    \"namespace\" : \"[]\",??    \"doc\" : \"{}\",??    \"symbols\" : [ ]??  }??}");
        } catch (org.apache.avro.SchemaParseException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SchemaM3Random300Test2.test1081");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.avro.Schema schema4 = org.apache.avro.Schema.createRecord("{\"type\":\"fixed\",\"name\":\"union\",\"namespace\":\"[]\",\"doc\":\"[ ]\",\"size\":0,\"aliases\":[\"union\"]}", "{\"type\":\"array\",\"items\":\"null\"}", "", true);
            org.junit.Assert.fail("Expected exception of type org.apache.avro.SchemaParseException; message: Illegal initial character: {\"type\":\"fixed\",\"name\":\"union\",\"namespace\":\"[]\",\"doc\":\"[ ]\",\"size\":0,\"aliases\":[\"union\"]}");
        } catch (org.apache.avro.SchemaParseException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SchemaM3Random300Test2.test1082");
        org.apache.avro.Schema schema4 = org.apache.avro.Schema.createFixed("union", "[ ]", "[]", 0);
        org.apache.avro.Schema.Type type5 = org.apache.avro.Schema.Type.INT;
        org.apache.avro.Schema schema6 = org.apache.avro.Schema.create(type5);
        org.apache.avro.Schema schema7 = org.apache.avro.Schema.createArray(schema6);
        org.apache.avro.Schema schema8 = org.apache.avro.Schema.applyAliases(schema4, schema7);
        java.util.Set<java.lang.String> strSet9 = schema8.getAliases();
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<org.apache.avro.Schema> schemaList10 = schema8.getTypes();
            org.junit.Assert.fail("Expected exception of type org.apache.avro.AvroRuntimeException; message: Not a union: {\"type\":\"fixed\",\"name\":\"union\",\"namespace\":\"[]\",\"doc\":\"[ ]\",\"size\":0}");
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
    public void test1083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SchemaM3Random300Test2.test1083");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.avro.Schema schema4 = org.apache.avro.Schema.createFixed("{\"type\":\"fixed\",\"name\":\"union\",\"namespace\":\"[]\",\"doc\":\"{\\r\\n  \\\"type\\\" : \\\"map\\\",\\r\\n  \\\"values\\\" : [ ]\\r\\n}\",\"size\":10}", "{\"type\":\"fixed\",\"name\":\"union\",\"namespace\":\"[]\",\"doc\":\"[ ]\",\"size\":0,\"aliases\":[\"union\"]}", "{\"type\":\"map\",\"values\":{\"type\":\"array\",\"items\":{\"type\":\"map\",\"values\":[]},\"\":\"{\\r\\n  \\\"type\\\" : \\\"record\\\",\\r\\n  \\\"fields\\\" : [ ]\\r\\n}\"}}", (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type org.apache.avro.SchemaParseException; message: Illegal initial character: {\"type\":\"fixed\",\"name\":\"union\",\"namespace\":\"[]\",\"doc\":\"{\\r\\n  \\\"type\\\" : \\\"map\\\",\\r\\n  \\\"values\\\" : [ ]\\r\\n}\",\"size\":10}");
        } catch (org.apache.avro.SchemaParseException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SchemaM3Random300Test2.test1084");
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
        java.lang.String str16 = schema7.getDoc();
        java.util.List<org.apache.avro.Schema> schemaList17 = schema7.getTypes();
        // The following exception was thrown during execution in test generation
        try {
            schema7.addProp("[]", "hi!");
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
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertNotNull(schemaList17);
    }

    @Test
    public void test1085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SchemaM3Random300Test2.test1085");
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
            int int19 = schema15.getEnumOrdinal("array");
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
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNotNull(schema13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "union" + "'", str14, "union");
        org.junit.Assert.assertNotNull(schema15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "map" + "'", str16, "map");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "map" + "'", str17, "map");
    }

    @Test
    public void test1086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SchemaM3Random300Test2.test1086");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.avro.Schema schema4 = org.apache.avro.Schema.createRecord("{\"type\":\"fixed\",\"name\":\"union\",\"namespace\":\"[]\",\"doc\":\"union type:UNION pos:-1\",\"size\":100}", "{\r\n  \"type\" : \"array\",\r\n  \"items\" : [ ],\r\n  \"{}\" : \"hi!\"\r\n}", "map", false);
            org.junit.Assert.fail("Expected exception of type org.apache.avro.SchemaParseException; message: Illegal initial character: {\"type\":\"fixed\",\"name\":\"union\",\"namespace\":\"[]\",\"doc\":\"union type:UNION pos:-1\",\"size\":100}");
        } catch (org.apache.avro.SchemaParseException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SchemaM3Random300Test2.test1087");
        org.apache.avro.Schema.Parser parser0 = new org.apache.avro.Schema.Parser();
        java.util.Map<java.lang.String, org.apache.avro.Schema> strMap1 = parser0.getTypes();
        java.util.Map<java.lang.String, org.apache.avro.Schema> strMap2 = parser0.getTypes();
        org.apache.avro.Schema.Parser parser3 = new org.apache.avro.Schema.Parser();
        org.apache.avro.Schema.Parser parser5 = parser3.setValidate(true);
        java.util.Map<java.lang.String, org.apache.avro.Schema> strMap6 = parser3.getTypes();
        org.apache.avro.Schema.Parser parser7 = parser0.addTypes(strMap6);
        org.apache.avro.Schema.Parser parser9 = parser7.setValidate(true);
        org.apache.avro.Schema.Parser parser10 = new org.apache.avro.Schema.Parser();
        java.util.Map<java.lang.String, org.apache.avro.Schema> strMap11 = parser10.getTypes();
        java.util.Map<java.lang.String, org.apache.avro.Schema> strMap12 = parser10.getTypes();
        org.apache.avro.Schema.Parser parser13 = new org.apache.avro.Schema.Parser();
        java.util.Map<java.lang.String, org.apache.avro.Schema> strMap14 = parser13.getTypes();
        org.apache.avro.Schema.Parser parser15 = parser10.addTypes(strMap14);
        java.util.Map<java.lang.String, org.apache.avro.Schema> strMap16 = parser15.getTypes();
        org.apache.avro.Schema.Parser parser17 = parser9.addTypes(strMap16);
        org.apache.avro.Schema.Parser parser19 = parser17.setValidate(false);
        java.util.Map<java.lang.String, org.apache.avro.Schema> strMap20 = parser19.getTypes();
        java.lang.Class<?> wildcardClass21 = parser19.getClass();
        org.junit.Assert.assertNotNull(strMap1);
        org.junit.Assert.assertNotNull(strMap2);
        org.junit.Assert.assertNotNull(parser5);
        org.junit.Assert.assertNotNull(strMap6);
        org.junit.Assert.assertNotNull(parser7);
        org.junit.Assert.assertNotNull(parser9);
        org.junit.Assert.assertNotNull(strMap11);
        org.junit.Assert.assertNotNull(strMap12);
        org.junit.Assert.assertNotNull(strMap14);
        org.junit.Assert.assertNotNull(parser15);
        org.junit.Assert.assertNotNull(strMap16);
        org.junit.Assert.assertNotNull(parser17);
        org.junit.Assert.assertNotNull(parser19);
        org.junit.Assert.assertNotNull(strMap20);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test1088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SchemaM3Random300Test2.test1088");
        org.apache.avro.Schema.Parser parser0 = new org.apache.avro.Schema.Parser();
        java.util.Map<java.lang.String, org.apache.avro.Schema> strMap1 = parser0.getTypes();
        java.util.Map<java.lang.String, org.apache.avro.Schema> strMap2 = parser0.getTypes();
        boolean boolean3 = parser0.getValidate();
        org.apache.avro.Schema.Parser parser5 = parser0.setValidate(true);
        org.apache.avro.Schema schema7 = parser0.parse("{\"type\":\"map\",\"values\":[]}");
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
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(parser5);
        org.junit.Assert.assertNotNull(schema7);
    }

    @Test
    public void test1089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SchemaM3Random300Test2.test1089");
        org.apache.avro.Schema schema4 = org.apache.avro.Schema.createFixed("[].union", "{\r\n  \"type\" : \"map\",\r\n  \"values\" : [ ]\r\n}", "union type:MAP pos:-1", 10);
        org.apache.avro.Schema.Type type5 = schema4.getType();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.avro.Schema schema6 = org.apache.avro.Schema.create(type5);
            org.junit.Assert.fail("Expected exception of type org.apache.avro.AvroRuntimeException; message: Can't create a: FIXED");
        } catch (org.apache.avro.AvroRuntimeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(schema4);
        org.junit.Assert.assertTrue("'" + type5 + "' != '" + org.apache.avro.Schema.Type.FIXED + "'", type5.equals(org.apache.avro.Schema.Type.FIXED));
    }

    @Test
    public void test1090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SchemaM3Random300Test2.test1090");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.avro.Schema schema1 = org.apache.avro.Schema.parse("{null={\"type\":\"record\",\"fields\":[]}}");
            org.junit.Assert.fail("Expected exception of type org.apache.avro.SchemaParseException; message: org.codehaus.jackson.JsonParseException: Unexpected character ('n' (code 110)): was expecting double-quote to start field name? at [Source: java.io.StringReader@21107137; line: 1, column: 3]");
        } catch (org.apache.avro.SchemaParseException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SchemaM3Random300Test2.test1091");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.avro.Schema schema4 = org.apache.avro.Schema.createRecord("{null={\"type\":\"map\",\"values\":{\"type\":\"array\",\"items\":{\"type\":\"map\",\"values\":[]}}}}", "\"null\"", "{\r\n  \"type\" : \"fixed\",\r\n  \"name\" : \"union\",\r\n  \"namespace\" : \"{}\",\r\n  \"doc\" : \"hi!\",\r\n  \"size\" : 1\r\n}", false);
            org.junit.Assert.fail("Expected exception of type org.apache.avro.SchemaParseException; message: Illegal initial character: {null={\"type\":\"map\",\"values\":{\"type\":\"array\",\"items\":{\"type\":\"map\",\"values\":[]}}}}");
        } catch (org.apache.avro.SchemaParseException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SchemaM3Random300Test2.test1092");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.avro.Schema schema4 = org.apache.avro.Schema.createRecord("{\r\n  \"type\" : \"map\",\r\n  \"values\" : {\r\n    \"type\" : \"fixed\",\r\n    \"name\" : \"union\",\r\n    \"namespace\" : \"[]\",\r\n    \"doc\" : \"[ ]\",\r\n    \"size\" : 0\r\n  }\r\n}", "{\r\n  \"type\" : \"array\",\r\n  \"items\" : \"int\"\r\n}", "{\"type\":\"array\",\"items\":[],\"union type:UNION pos:-1\":\"\"}", true);
            org.junit.Assert.fail("Expected exception of type org.apache.avro.SchemaParseException; message: Illegal initial character: {??  \"type\" : \"map\",??  \"values\" : {??    \"type\" : \"fixed\",??    \"name\" : \"union\",??    \"namespace\" : \"[]\",??    \"doc\" : \"[ ]\",??    \"size\" : 0??  }??}");
        } catch (org.apache.avro.SchemaParseException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SchemaM3Random300Test2.test1093");
        org.apache.avro.Schema.Names names1 = new org.apache.avro.Schema.Names("{\r\n  \"type\" : \"fixed\",\r\n  \"name\" : \"union\",\r\n  \"namespace\" : \"{}\",\r\n  \"doc\" : \"hi!\",\r\n  \"size\" : 1\r\n}");
    }

    @Test
    public void test1094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SchemaM3Random300Test2.test1094");
        org.apache.avro.Schema[] schemaArray1 = new org.apache.avro.Schema[] {};
        java.util.ArrayList<org.apache.avro.Schema> schemaList2 = new java.util.ArrayList<org.apache.avro.Schema>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<org.apache.avro.Schema>) schemaList2, schemaArray1);
        org.apache.avro.Schema schema4 = org.apache.avro.Schema.createUnion((java.util.List<org.apache.avro.Schema>) schemaList2);
        org.apache.avro.Schema[] schemaArray5 = new org.apache.avro.Schema[] {};
        java.util.ArrayList<org.apache.avro.Schema> schemaList6 = new java.util.ArrayList<org.apache.avro.Schema>();
        boolean boolean7 = java.util.Collections.addAll((java.util.Collection<org.apache.avro.Schema>) schemaList6, schemaArray5);
        org.apache.avro.Schema schema8 = org.apache.avro.Schema.createUnion((java.util.List<org.apache.avro.Schema>) schemaList6);
        org.apache.avro.Schema schema9 = org.apache.avro.Schema.applyAliases(schema4, schema8);
        org.codehaus.jackson.JsonNode jsonNode12 = org.apache.avro.Schema.parseJson("\"double\"");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.avro.Schema.Field field13 = new org.apache.avro.Schema.Field("{\r\n  \"type\" : \"map\",\r\n  \"values\" : {\r\n    \"type\" : \"map\",\r\n    \"values\" : [ ]\r\n  }\r\n}", schema8, "", jsonNode12);
            org.junit.Assert.fail("Expected exception of type org.apache.avro.SchemaParseException; message: Illegal initial character: {??  \"type\" : \"map\",??  \"values\" : {??    \"type\" : \"map\",??    \"values\" : [ ]??  }??}");
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
        org.junit.Assert.assertNotNull(jsonNode12);
    }

    @Test
    public void test1095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SchemaM3Random300Test2.test1095");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.avro.Schema schema1 = org.apache.avro.Schema.parse("int");
            org.junit.Assert.fail("Expected exception of type org.apache.avro.SchemaParseException; message: org.codehaus.jackson.JsonParseException: Unexpected character ('i' (code 105)): expected a valid value (number, String, array, object, 'true', 'false' or 'null')? at [Source: java.io.StringReader@3c5ec467; line: 1, column: 2]");
        } catch (org.apache.avro.SchemaParseException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SchemaM3Random300Test2.test1096");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.avro.Schema schema1 = org.apache.avro.Schema.parse("{\r\n  \"type\" : \"map\",\r\n  \"values\" : {\r\n    \"type\" : \"record\",\r\n    \"fields\" : [ ]\r\n  }\r\n}");
            org.junit.Assert.fail("Expected exception of type org.apache.avro.SchemaParseException; message: No name in schema: {\"type\":\"record\",\"fields\":[]}");
        } catch (org.apache.avro.SchemaParseException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SchemaM3Random300Test2.test1097");
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
        java.util.List<org.apache.avro.Schema> schemaList17 = schema7.getTypes();
        org.apache.avro.Schema schema18 = org.apache.avro.Schema.createUnion(schemaList17);
        org.apache.avro.Schema schema19 = org.apache.avro.Schema.createUnion(schemaList17);
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
        org.junit.Assert.assertNotNull(schemaList17);
        org.junit.Assert.assertNotNull(schema18);
        org.junit.Assert.assertNotNull(schema19);
    }

    @Test
    public void test1098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SchemaM3Random300Test2.test1098");
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
        java.lang.String str27 = schema21.getName();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Set<java.lang.String> strSet28 = schema21.getAliases();
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
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "array" + "'", str27, "array");
    }

    @Test
    public void test1099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SchemaM3Random300Test2.test1099");
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
            org.apache.avro.Schema.Field field29 = schema27.getField("array");
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
    public void test1100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SchemaM3Random300Test2.test1100");
        org.apache.avro.Schema.Field[] fieldArray0 = new org.apache.avro.Schema.Field[] {};
        java.util.ArrayList<org.apache.avro.Schema.Field> fieldList1 = new java.util.ArrayList<org.apache.avro.Schema.Field>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<org.apache.avro.Schema.Field>) fieldList1, fieldArray0);
        org.apache.avro.Schema schema3 = org.apache.avro.Schema.createRecord((java.util.List<org.apache.avro.Schema.Field>) fieldList1);
        java.util.List<org.apache.avro.Schema.Field> fieldList4 = schema3.getFields();
        org.apache.avro.Schema schema5 = org.apache.avro.Schema.createRecord(fieldList4);
        org.apache.avro.Schema schema6 = org.apache.avro.Schema.createRecord(fieldList4);
        org.apache.avro.Schema schema7 = org.apache.avro.Schema.createRecord(fieldList4);
        org.apache.avro.Schema schema8 = org.apache.avro.Schema.createRecord(fieldList4);
        org.apache.avro.Schema schema9 = org.apache.avro.Schema.createRecord(fieldList4);
        java.util.Set<java.lang.String> strSet10 = schema9.getAliases();
        org.junit.Assert.assertNotNull(fieldArray0);
        org.junit.Assert.assertArrayEquals(fieldArray0, new org.apache.avro.Schema.Field[] {});
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(schema3);
        org.junit.Assert.assertNotNull(fieldList4);
        org.junit.Assert.assertNotNull(schema5);
        org.junit.Assert.assertNotNull(schema6);
        org.junit.Assert.assertNotNull(schema7);
        org.junit.Assert.assertNotNull(schema8);
        org.junit.Assert.assertNotNull(schema9);
        org.junit.Assert.assertNotNull(strSet10);
    }

    @Test
    public void test1101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SchemaM3Random300Test2.test1101");
        org.apache.avro.Schema schema4 = org.apache.avro.Schema.createFixed("[].union", "union", "{\"type\":\"array\",\"items\":[]}", 0);
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<org.apache.avro.Schema> schemaList5 = schema4.getTypes();
            org.junit.Assert.fail("Expected exception of type org.apache.avro.AvroRuntimeException; message: Not a union: {\"type\":\"fixed\",\"name\":\"union\",\"namespace\":\"[]\",\"doc\":\"union\",\"size\":0}");
        } catch (org.apache.avro.AvroRuntimeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(schema4);
    }

    @Test
    public void test1102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SchemaM3Random300Test2.test1102");
        org.apache.avro.Schema.Names names1 = new org.apache.avro.Schema.Names("{null={\"type\":\"map\",\"values\":{\"type\":\"array\",\"items\":{\"type\":\"map\",\"values\":[]}}}}");
    }

    @Test
    public void test1103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SchemaM3Random300Test2.test1103");
        org.apache.avro.Schema schema1 = org.apache.avro.Schema.parse("{\"type\":\"double\",\"float\":\"{\\\"type\\\":\\\"array\\\",\\\"items\\\":[]}\"}");
        org.junit.Assert.assertNotNull(schema1);
    }

    @Test
    public void test1104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SchemaM3Random300Test2.test1104");
        org.apache.avro.Schema schema4 = org.apache.avro.Schema.createFixed("[].union", "union type:UNION pos:-1", "[]", (int) (short) 100);
        java.lang.String str5 = schema4.toString();
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<org.apache.avro.Schema.Field> fieldList6 = schema4.getFields();
            org.junit.Assert.fail("Expected exception of type org.apache.avro.AvroRuntimeException; message: Not a record: {\"type\":\"fixed\",\"name\":\"union\",\"namespace\":\"[]\",\"doc\":\"union type:UNION pos:-1\",\"size\":100}");
        } catch (org.apache.avro.AvroRuntimeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(schema4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "{\"type\":\"fixed\",\"name\":\"union\",\"namespace\":\"[]\",\"doc\":\"union type:UNION pos:-1\",\"size\":100}" + "'", str5, "{\"type\":\"fixed\",\"name\":\"union\",\"namespace\":\"[]\",\"doc\":\"union type:UNION pos:-1\",\"size\":100}");
    }

    @Test
    public void test1105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SchemaM3Random300Test2.test1105");
        org.apache.avro.Schema.Type type0 = org.apache.avro.Schema.Type.INT;
        org.apache.avro.Schema schema1 = org.apache.avro.Schema.create(type0);
        org.apache.avro.Schema schema2 = org.apache.avro.Schema.createArray(schema1);
        schema1.addProp("union type:UNION pos:-1", "[ ]");
        org.apache.avro.Schema.Type type6 = schema1.getType();
        java.lang.String str8 = schema1.getProp("{\"type\":\"fixed\",\"name\":\"union\",\"namespace\":\"[]\",\"doc\":\"[ ]\",\"size\":0}");
        org.apache.avro.Schema schema9 = org.apache.avro.Schema.createArray(schema1);
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<org.apache.avro.Schema> schemaList10 = schema1.getTypes();
            org.junit.Assert.fail("Expected exception of type org.apache.avro.AvroRuntimeException; message: Not a union: {\"type\":\"int\",\"union type:UNION pos:-1\":\"[ ]\"}");
        } catch (org.apache.avro.AvroRuntimeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + type0 + "' != '" + org.apache.avro.Schema.Type.INT + "'", type0.equals(org.apache.avro.Schema.Type.INT));
        org.junit.Assert.assertNotNull(schema1);
        org.junit.Assert.assertNotNull(schema2);
        org.junit.Assert.assertTrue("'" + type6 + "' != '" + org.apache.avro.Schema.Type.INT + "'", type6.equals(org.apache.avro.Schema.Type.INT));
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNotNull(schema9);
    }

    @Test
    public void test1106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SchemaM3Random300Test2.test1106");
        org.apache.avro.Schema.Parser parser0 = new org.apache.avro.Schema.Parser();
        java.util.Map<java.lang.String, org.apache.avro.Schema> strMap1 = parser0.getTypes();
        java.util.Map<java.lang.String, org.apache.avro.Schema> strMap2 = parser0.getTypes();
        org.apache.avro.Schema.Parser parser3 = new org.apache.avro.Schema.Parser();
        org.apache.avro.Schema.Parser parser5 = parser3.setValidate(true);
        java.util.Map<java.lang.String, org.apache.avro.Schema> strMap6 = parser3.getTypes();
        org.apache.avro.Schema.Parser parser7 = parser0.addTypes(strMap6);
        java.util.Map<java.lang.String, org.apache.avro.Schema> strMap8 = parser0.getTypes();
        org.apache.avro.Schema.Parser parser10 = parser0.setValidate(false);
        org.apache.avro.Schema.Parser parser12 = parser0.setValidate(false);
        org.apache.avro.Schema schema14 = parser12.parse("[].union");
        org.apache.avro.Schema schema16 = parser12.parse("{\"type\":\"array\",\"items\":{\"type\":\"map\",\"values\":[]}}");
        java.io.InputStream inputStream17 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.avro.Schema schema18 = parser12.parse(inputStream17);
            org.junit.Assert.fail("Expected exception of type java.io.EOFException; message: No content to map to Object due to end of input");
        } catch (java.io.EOFException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strMap1);
        org.junit.Assert.assertNotNull(strMap2);
        org.junit.Assert.assertNotNull(parser5);
        org.junit.Assert.assertNotNull(strMap6);
        org.junit.Assert.assertNotNull(parser7);
        org.junit.Assert.assertNotNull(strMap8);
        org.junit.Assert.assertNotNull(parser10);
        org.junit.Assert.assertNotNull(parser12);
        org.junit.Assert.assertNotNull(schema14);
        org.junit.Assert.assertNotNull(schema16);
    }

    @Test
    public void test1107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SchemaM3Random300Test2.test1107");
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
        java.lang.String str13 = schema8.getDoc();
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
        org.junit.Assert.assertNull(str13);
    }

    @Test
    public void test1108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SchemaM3Random300Test2.test1108");
        org.apache.avro.Schema schema4 = org.apache.avro.Schema.createRecord("union", "{\"type\":\"array\",\"items\":[],\"union type:UNION pos:-1\":\"\"}", "\"double\"", true);
        org.junit.Assert.assertNotNull(schema4);
    }

    @Test
    public void test1109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SchemaM3Random300Test2.test1109");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.avro.Schema schema1 = org.apache.avro.Schema.parse("{\"type\":\"array\",\"items\":{\"type\":\"record\",\"fields\":[]}}");
            org.junit.Assert.fail("Expected exception of type org.apache.avro.SchemaParseException; message: No name in schema: {\"type\":\"record\",\"fields\":[]}");
        } catch (org.apache.avro.SchemaParseException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SchemaM3Random300Test2.test1110");
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
            boolean boolean25 = schema8.hasEnumSymbol("{\r\n  \"type\" : \"map\",\r\n  \"values\" : {\r\n    \"type\" : \"fixed\",\r\n    \"name\" : \"union\",\r\n    \"namespace\" : \"[]\",\r\n    \"doc\" : \"[ ]\",\r\n    \"size\" : 0\r\n  }\r\n}");
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
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "union" + "'", str21, "union");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "[]" + "'", str23, "[]");
    }

    @Test
    public void test1111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SchemaM3Random300Test2.test1111");
        org.apache.avro.Schema.Type type0 = org.apache.avro.Schema.Type.STRING;
        org.apache.avro.Schema schema1 = org.apache.avro.Schema.create(type0);
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<org.apache.avro.Schema.Field> fieldList2 = schema1.getFields();
            org.junit.Assert.fail("Expected exception of type org.apache.avro.AvroRuntimeException; message: Not a record: \"string\"");
        } catch (org.apache.avro.AvroRuntimeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + type0 + "' != '" + org.apache.avro.Schema.Type.STRING + "'", type0.equals(org.apache.avro.Schema.Type.STRING));
        org.junit.Assert.assertNotNull(schema1);
    }

    @Test
    public void test1112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SchemaM3Random300Test2.test1112");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.avro.Schema schema4 = org.apache.avro.Schema.createRecord("{\"type\":\"int\",\"union type:UNION pos:-1\":\"[ ]\"}", "{\"type\":\"record\",\"fields\":[],\"{\\r\\n  \\\"type\\\" : \\\"fixed\\\",\\r\\n  \\\"name\\\" : \\\"union\\\",\\r\\n  \\\"namespace\\\" : \\\"[]\\\",\\r\\n  \\\"doc\\\" : \\\"[ ]\\\",\\r\\n  \\\"size\\\" : 0\\r\\n}\":\"[ ]\"}", "[ ]", false);
            org.junit.Assert.fail("Expected exception of type org.apache.avro.SchemaParseException; message: Illegal initial character: {\"type\":\"int\",\"union type:UNION pos:-1\":\"[ ]\"}");
        } catch (org.apache.avro.SchemaParseException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SchemaM3Random300Test2.test1113");
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
            org.apache.avro.Schema schema12 = schema11.getValueType();
            org.junit.Assert.fail("Expected exception of type org.apache.avro.AvroRuntimeException; message: Not a map: {\"type\":\"array\",\"items\":{\"type\":\"map\",\"values\":[]}}");
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
    public void test1114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SchemaM3Random300Test2.test1114");
        org.apache.avro.Schema.Names names1 = new org.apache.avro.Schema.Names("{\"type\":\"array\",\"items\":{\"type\":\"map\",\"values\":[]},\"union type:MAP pos:-1\":\"{\\\"type\\\":\\\"array\\\",\\\"items\\\":{\\\"type\\\":\\\"map\\\",\\\"values\\\":[]}}\"}");
    }

    @Test
    public void test1115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SchemaM3Random300Test2.test1115");
        org.apache.avro.Schema.Parser parser0 = new org.apache.avro.Schema.Parser();
        org.apache.avro.Schema.Parser parser2 = parser0.setValidate(true);
        java.util.Map<java.lang.String, org.apache.avro.Schema> strMap3 = parser0.getTypes();
        org.apache.avro.Schema.Parser parser5 = parser0.setValidate(true);
        org.apache.avro.Schema.Parser parser7 = parser5.setValidate(true);
        org.apache.avro.Schema.Parser parser9 = parser7.setValidate(true);
        java.io.InputStream inputStream10 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.avro.Schema schema11 = parser9.parse(inputStream10);
            org.junit.Assert.fail("Expected exception of type java.io.EOFException; message: No content to map to Object due to end of input");
        } catch (java.io.EOFException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(parser2);
        org.junit.Assert.assertNotNull(strMap3);
        org.junit.Assert.assertNotNull(parser5);
        org.junit.Assert.assertNotNull(parser7);
        org.junit.Assert.assertNotNull(parser9);
    }

    @Test
    public void test1116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SchemaM3Random300Test2.test1116");
        org.apache.avro.Schema.Names names0 = new org.apache.avro.Schema.Names();
        names0.space("[ ]");
        java.lang.Object obj3 = names0.clone();
        org.apache.avro.Schema.Names names4 = new org.apache.avro.Schema.Names();
        names4.space("[ ]");
        org.apache.avro.Schema schema7 = names0.remove((java.lang.Object) names4);
        boolean boolean8 = names4.isEmpty();
        java.lang.String str9 = names4.space();
        org.apache.avro.Schema.LockableArrayList<org.apache.avro.Schema> schemaList11 = new org.apache.avro.Schema.LockableArrayList<org.apache.avro.Schema>(1);
        org.apache.avro.Schema schema12 = org.apache.avro.Schema.createUnion((java.util.List<org.apache.avro.Schema>) schemaList11);
        org.apache.avro.Schema schema13 = org.apache.avro.Schema.createUnion((java.util.List<org.apache.avro.Schema>) schemaList11);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.avro.Schema schema14 = names4.get((java.lang.Object) schemaList11);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: null");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(obj3);
        org.junit.Assert.assertEquals(obj3.toString(), "{}");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj3), "{}");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj3), "{}");
        org.junit.Assert.assertNull(schema7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "[ ]" + "'", str9, "[ ]");
        org.junit.Assert.assertNotNull(schema12);
        org.junit.Assert.assertNotNull(schema13);
    }

    @Test
    public void test1117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SchemaM3Random300Test2.test1117");
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
        // The following exception was thrown during execution in test generation
        try {
            org.apache.avro.Schema.Field field14 = schema12.getField("\"double\"");
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
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNotNull(schema12);
    }

    @Test
    public void test1118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SchemaM3Random300Test2.test1118");
        org.apache.avro.Schema schema4 = org.apache.avro.Schema.createRecord("map", "{\"type\":\"map\",\"values\":[],\"\\\"double\\\"\":\"{\\\"type\\\":\\\"array\\\",\\\"items\\\":\\\"int\\\"}\"}", "{\"type\":\"array\",\"items\":\"null\"}", false);
        org.junit.Assert.assertNotNull(schema4);
    }

    @Test
    public void test1119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SchemaM3Random300Test2.test1119");
        org.apache.avro.Schema schema0 = null;
        org.apache.avro.Schema[] schemaArray1 = new org.apache.avro.Schema[] {};
        java.util.ArrayList<org.apache.avro.Schema> schemaList2 = new java.util.ArrayList<org.apache.avro.Schema>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<org.apache.avro.Schema>) schemaList2, schemaArray1);
        org.apache.avro.Schema schema4 = org.apache.avro.Schema.createUnion((java.util.List<org.apache.avro.Schema>) schemaList2);
        org.apache.avro.Schema[] schemaArray5 = new org.apache.avro.Schema[] {};
        java.util.ArrayList<org.apache.avro.Schema> schemaList6 = new java.util.ArrayList<org.apache.avro.Schema>();
        boolean boolean7 = java.util.Collections.addAll((java.util.Collection<org.apache.avro.Schema>) schemaList6, schemaArray5);
        org.apache.avro.Schema schema8 = org.apache.avro.Schema.createUnion((java.util.List<org.apache.avro.Schema>) schemaList6);
        org.apache.avro.Schema schema9 = org.apache.avro.Schema.applyAliases(schema4, schema8);
        java.lang.String str10 = schema4.getFullName();
        org.apache.avro.Schema schema11 = org.apache.avro.Schema.applyAliases(schema0, schema4);
        java.lang.String str13 = schema4.getProp("hi!");
        // The following exception was thrown during execution in test generation
        try {
            schema4.addProp("\"double\"", "{\r\n  \"type\" : \"map\",\r\n  \"values\" : {\r\n    \"type\" : \"enum\",\r\n    \"name\" : \"union\",\r\n    \"namespace\" : \"[]\",\r\n    \"doc\" : \"{}\",\r\n    \"symbols\" : [ ]\r\n  }\r\n}");
            org.junit.Assert.fail("Expected exception of type org.apache.avro.AvroRuntimeException; message: Can't set properties on a union: []");
        } catch (org.apache.avro.AvroRuntimeException e) {
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
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "union" + "'", str10, "union");
        org.junit.Assert.assertNull(schema11);
        org.junit.Assert.assertNull(str13);
    }

    @Test
    public void test1120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SchemaM3Random300Test2.test1120");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.avro.Schema schema4 = org.apache.avro.Schema.createFixed("{\r\n  \"type\" : \"map\",\r\n  \"values\" : {\r\n    \"type\" : \"map\",\r\n    \"values\" : [ ]\r\n  }\r\n}", "", "{\r\n  \"type\" : \"map\",\r\n  \"values\" : {\r\n    \"type\" : \"fixed\",\r\n    \"name\" : \"union\",\r\n    \"namespace\" : \"[]\",\r\n    \"doc\" : \"[ ]\",\r\n    \"size\" : 0\r\n  }\r\n}", 1);
            org.junit.Assert.fail("Expected exception of type org.apache.avro.SchemaParseException; message: Illegal initial character: {??  \"type\" : \"map\",??  \"values\" : {??    \"type\" : \"map\",??    \"values\" : [ ]??  }??}");
        } catch (org.apache.avro.SchemaParseException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SchemaM3Random300Test2.test1121");
        org.apache.avro.Schema schema2 = org.apache.avro.Schema.parse("{\r\n  \"type\" : \"array\",\r\n  \"items\" : \"int\"\r\n}", false);
        org.junit.Assert.assertNotNull(schema2);
    }

    @Test
    public void test1122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SchemaM3Random300Test2.test1122");
        org.apache.avro.Schema.Parser parser0 = new org.apache.avro.Schema.Parser();
        java.util.Map<java.lang.String, org.apache.avro.Schema> strMap1 = parser0.getTypes();
        java.util.Map<java.lang.String, org.apache.avro.Schema> strMap2 = parser0.getTypes();
        org.apache.avro.Schema.Parser parser3 = new org.apache.avro.Schema.Parser();
        java.util.Map<java.lang.String, org.apache.avro.Schema> strMap4 = parser3.getTypes();
        org.apache.avro.Schema.Parser parser5 = parser0.addTypes(strMap4);
        boolean boolean6 = parser5.getValidate();
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
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test1123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SchemaM3Random300Test2.test1123");
        org.apache.avro.Schema.Parser parser0 = new org.apache.avro.Schema.Parser();
        java.util.Map<java.lang.String, org.apache.avro.Schema> strMap1 = parser0.getTypes();
        java.util.Map<java.lang.String, org.apache.avro.Schema> strMap2 = parser0.getTypes();
        org.apache.avro.Schema.Parser parser3 = new org.apache.avro.Schema.Parser();
        java.util.Map<java.lang.String, org.apache.avro.Schema> strMap4 = parser3.getTypes();
        org.apache.avro.Schema.Parser parser5 = parser0.addTypes(strMap4);
        org.apache.avro.Schema schema7 = parser0.parse("{\r\n  \"type\" : \"map\",\r\n  \"values\" : [ ]\r\n}");
        java.lang.String str9 = schema7.getProp("{\"type\":\"array\",\"items\":[]}");
        schema7.addProp("\"double\"", "{\"type\":\"array\",\"items\":\"int\"}");
        java.lang.String str13 = schema7.toString();
        java.lang.Class<?> wildcardClass14 = schema7.getClass();
        org.junit.Assert.assertNotNull(strMap1);
        org.junit.Assert.assertNotNull(strMap2);
        org.junit.Assert.assertNotNull(strMap4);
        org.junit.Assert.assertNotNull(parser5);
        org.junit.Assert.assertNotNull(schema7);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "{\"type\":\"map\",\"values\":[],\"\\\"double\\\"\":\"{\\\"type\\\":\\\"array\\\",\\\"items\\\":\\\"int\\\"}\"}" + "'", str13, "{\"type\":\"map\",\"values\":[],\"\\\"double\\\"\":\"{\\\"type\\\":\\\"array\\\",\\\"items\\\":\\\"int\\\"}\"}");
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test1124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SchemaM3Random300Test2.test1124");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.avro.Schema schema2 = org.apache.avro.Schema.parse("{\r\n  \"type\" : \"record\",\r\n  \"fields\" : [ ],\r\n  \"{\\r\\n  \\\"type\\\" : \\\"fixed\\\",\\r\\n  \\\"name\\\" : \\\"union\\\",\\r\\n  \\\"namespace\\\" : \\\"[]\\\",\\r\\n  \\\"doc\\\" : \\\"[ ]\\\",\\r\\n  \\\"size\\\" : 0\\r\\n}\" : \"[ ]\"\r\n}", true);
            org.junit.Assert.fail("Expected exception of type org.apache.avro.SchemaParseException; message: No name in schema: {\"type\":\"record\",\"fields\":[],\"{\\r\\n  \\\"type\\\" : \\\"fixed\\\",\\r\\n  \\\"name\\\" : \\\"union\\\",\\r\\n  \\\"namespace\\\" : \\\"[]\\\",\\r\\n  \\\"doc\\\" : \\\"[ ]\\\",\\r\\n  \\\"size\\\" : 0\\r\\n}\":\"[ ]\"}");
        } catch (org.apache.avro.SchemaParseException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SchemaM3Random300Test2.test1125");
        java.lang.String[] strArray10 = new java.lang.String[] { "map", "[]", "array", "\"double\"", "{\"type\":\"array\",\"items\":[]}", "{\"type\":\"fixed\",\"name\":\"union\",\"namespace\":\"[]\",\"doc\":\"union type:UNION pos:-1\",\"size\":100}", "{null={\"type\":\"record\",\"fields\":[]}}" };
        java.util.ArrayList<java.lang.String> strList11 = new java.util.ArrayList<java.lang.String>();
        boolean boolean12 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList11, strArray10);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.avro.Schema schema13 = org.apache.avro.Schema.createEnum("{\r\n  \"type\" : \"array\",\r\n  \"items\" : [ ],\r\n  \"{}\" : \"hi!\"\r\n}", "{\"type\":\"fixed\",\"name\":\"union\",\"namespace\":\"{}\",\"doc\":\"hi!\",\"size\":1}", "hi!", (java.util.List<java.lang.String>) strList11);
            org.junit.Assert.fail("Expected exception of type org.apache.avro.SchemaParseException; message: Illegal initial character: {??  \"type\" : \"array\",??  \"items\" : [ ],??  \"{}\" : \"hi!\"??}");
        } catch (org.apache.avro.SchemaParseException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray10);
        org.junit.Assert.assertArrayEquals(strArray10, new java.lang.String[] { "map", "[]", "array", "\"double\"", "{\"type\":\"array\",\"items\":[]}", "{\"type\":\"fixed\",\"name\":\"union\",\"namespace\":\"[]\",\"doc\":\"union type:UNION pos:-1\",\"size\":100}", "{null={\"type\":\"record\",\"fields\":[]}}" });
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test1126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SchemaM3Random300Test2.test1126");
        org.apache.avro.Schema.Parser parser0 = new org.apache.avro.Schema.Parser();
        org.apache.avro.Schema.Parser parser2 = parser0.setValidate(true);
        java.util.Map<java.lang.String, org.apache.avro.Schema> strMap3 = parser0.getTypes();
        org.apache.avro.Schema schema5 = parser0.parse("{\"type\":\"array\",\"items\":{\"type\":\"map\",\"values\":[]}}");
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<org.apache.avro.Schema> schemaList6 = schema5.getTypes();
            org.junit.Assert.fail("Expected exception of type org.apache.avro.AvroRuntimeException; message: Not a union: {\"type\":\"array\",\"items\":{\"type\":\"map\",\"values\":[]}}");
        } catch (org.apache.avro.AvroRuntimeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(parser2);
        org.junit.Assert.assertNotNull(strMap3);
        org.junit.Assert.assertNotNull(schema5);
    }

    @Test
    public void test1127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SchemaM3Random300Test2.test1127");
        org.apache.avro.Schema.LockableArrayList<org.codehaus.jackson.JsonNode> jsonNodeList0 = new org.apache.avro.Schema.LockableArrayList<org.codehaus.jackson.JsonNode>();
        org.apache.avro.Schema.LockableArrayList<org.codehaus.jackson.JsonNode> jsonNodeList1 = new org.apache.avro.Schema.LockableArrayList<org.codehaus.jackson.JsonNode>((java.util.List<org.codehaus.jackson.JsonNode>) jsonNodeList0);
    }

    @Test
    public void test1128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SchemaM3Random300Test2.test1128");
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
            int int24 = schema21.getEnumOrdinal("{\r\n  \"type\" : \"map\",\r\n  \"values\" : {\r\n    \"type\" : \"map\",\r\n    \"values\" : [ ]\r\n  }\r\n}");
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
    }

    @Test
    public void test1129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SchemaM3Random300Test2.test1129");
        org.codehaus.jackson.JsonNode jsonNode1 = org.apache.avro.Schema.parseJson("{\r\n  \"type\" : \"record\",\r\n  \"fields\" : [ ],\r\n  \"{\\r\\n  \\\"type\\\" : \\\"fixed\\\",\\r\\n  \\\"name\\\" : \\\"union\\\",\\r\\n  \\\"namespace\\\" : \\\"[]\\\",\\r\\n  \\\"doc\\\" : \\\"[ ]\\\",\\r\\n  \\\"size\\\" : 0\\r\\n}\" : \"[ ]\"\r\n}");
        org.junit.Assert.assertNotNull(jsonNode1);
    }

    @Test
    public void test1130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SchemaM3Random300Test2.test1130");
        org.apache.avro.Schema.Names names1 = new org.apache.avro.Schema.Names("{\"type\":\"array\",\"items\":[],\"union type:UNION pos:-1\":\"\"}");
        boolean boolean2 = names1.isEmpty();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test1131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SchemaM3Random300Test2.test1131");
        org.apache.avro.Schema.Parser parser0 = new org.apache.avro.Schema.Parser();
        java.util.Map<java.lang.String, org.apache.avro.Schema> strMap1 = parser0.getTypes();
        java.util.Map<java.lang.String, org.apache.avro.Schema> strMap2 = parser0.getTypes();
        org.apache.avro.Schema.Parser parser3 = new org.apache.avro.Schema.Parser();
        java.util.Map<java.lang.String, org.apache.avro.Schema> strMap4 = parser3.getTypes();
        org.apache.avro.Schema.Parser parser5 = parser0.addTypes(strMap4);
        org.apache.avro.Schema schema7 = parser0.parse("{\r\n  \"type\" : \"map\",\r\n  \"values\" : [ ]\r\n}");
        org.apache.avro.Schema.Parser parser9 = parser0.setValidate(true);
        org.apache.avro.Schema.Parser parser10 = new org.apache.avro.Schema.Parser();
        java.util.Map<java.lang.String, org.apache.avro.Schema> strMap11 = parser10.getTypes();
        java.util.Map<java.lang.String, org.apache.avro.Schema> strMap12 = parser10.getTypes();
        org.apache.avro.Schema.Parser parser13 = parser9.addTypes(strMap12);
        java.io.File file14 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.avro.Schema schema15 = parser9.parse(file14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strMap1);
        org.junit.Assert.assertNotNull(strMap2);
        org.junit.Assert.assertNotNull(strMap4);
        org.junit.Assert.assertNotNull(parser5);
        org.junit.Assert.assertNotNull(schema7);
        org.junit.Assert.assertNotNull(parser9);
        org.junit.Assert.assertNotNull(strMap11);
        org.junit.Assert.assertNotNull(strMap12);
        org.junit.Assert.assertNotNull(parser13);
    }

    @Test
    public void test1132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SchemaM3Random300Test2.test1132");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.avro.Schema schema4 = org.apache.avro.Schema.createFixed("union type:MAP pos:-1", "{null={\"type\":\"fixed\",\"name\":\"union\",\"namespace\":\"[]\",\"doc\":\"[ ]\",\"size\":0}}", "hi!", (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type org.apache.avro.SchemaParseException; message: Illegal character in: union type:MAP pos:-1");
        } catch (org.apache.avro.SchemaParseException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SchemaM3Random300Test2.test1133");
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
        schema20.addProp("union", "{\"type\":\"map\",\"values\":{\"type\":\"array\",\"items\":{\"type\":\"map\",\"values\":[]},\"\":\"{\\r\\n  \\\"type\\\" : \\\"record\\\",\\r\\n  \\\"fields\\\" : [ ]\\r\\n}\"}}");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean26 = schema20.hasEnumSymbol("[]");
            org.junit.Assert.fail("Expected exception of type org.apache.avro.AvroRuntimeException; message: Not an enum: {\"type\":\"map\",\"values\":[],\"union\":\"{\\\"type\\\":\\\"map\\\",\\\"values\\\":{\\\"type\\\":\\\"array\\\",\\\"items\\\":{\\\"type\\\":\\\"map\\\",\\\"values\\\":[]},\\\"\\\":\\\"{\\\\r\\\\n  \\\\\\\"type\\\\\\\" : \\\\\\\"record\\\\\\\",\\\\r\\\\n  \\\\\\\"fields\\\\\\\" : [ ]\\\\r\\\\n}\\\"}}\"}");
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
    public void test1134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SchemaM3Random300Test2.test1134");
        org.apache.avro.Schema.LockableArrayList<java.lang.String> strList4 = new org.apache.avro.Schema.LockableArrayList<java.lang.String>(100);
        org.apache.avro.Schema.LockableArrayList<java.lang.String> strList5 = new org.apache.avro.Schema.LockableArrayList<java.lang.String>((java.util.List<java.lang.String>) strList4);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.avro.Schema schema6 = org.apache.avro.Schema.createEnum("{\"type\":\"array\",\"items\":[],\"union type:UNION pos:-1\":\"\"}", "{\"type\":\"map\",\"values\":{\"type\":\"array\",\"items\":{\"type\":\"map\",\"values\":[]}}}", "{\r\n  \"type\" : \"record\",\r\n  \"fields\" : [ ],\r\n  \"{\\r\\n  \\\"type\\\" : \\\"fixed\\\",\\r\\n  \\\"name\\\" : \\\"union\\\",\\r\\n  \\\"namespace\\\" : \\\"[]\\\",\\r\\n  \\\"doc\\\" : \\\"[ ]\\\",\\r\\n  \\\"size\\\" : 0\\r\\n}\" : \"[ ]\"\r\n}", (java.util.List<java.lang.String>) strList5);
            org.junit.Assert.fail("Expected exception of type org.apache.avro.SchemaParseException; message: Illegal initial character: {\"type\":\"array\",\"items\":[],\"union type:UNION pos:-1\":\"\"}");
        } catch (org.apache.avro.SchemaParseException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SchemaM3Random300Test2.test1135");
        org.apache.avro.Schema.Field[] fieldArray0 = new org.apache.avro.Schema.Field[] {};
        java.util.ArrayList<org.apache.avro.Schema.Field> fieldList1 = new java.util.ArrayList<org.apache.avro.Schema.Field>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<org.apache.avro.Schema.Field>) fieldList1, fieldArray0);
        org.apache.avro.Schema schema3 = org.apache.avro.Schema.createRecord((java.util.List<org.apache.avro.Schema.Field>) fieldList1);
        java.util.List<org.apache.avro.Schema.Field> fieldList4 = schema3.getFields();
        org.apache.avro.Schema schema5 = org.apache.avro.Schema.createRecord(fieldList4);
        org.apache.avro.Schema schema6 = org.apache.avro.Schema.createRecord(fieldList4);
        org.apache.avro.Schema schema7 = org.apache.avro.Schema.createRecord(fieldList4);
        org.apache.avro.Schema schema8 = org.apache.avro.Schema.createRecord(fieldList4);
        org.apache.avro.Schema schema9 = org.apache.avro.Schema.createRecord(fieldList4);
        org.apache.avro.Schema schema10 = org.apache.avro.Schema.createRecord(fieldList4);
        org.junit.Assert.assertNotNull(fieldArray0);
        org.junit.Assert.assertArrayEquals(fieldArray0, new org.apache.avro.Schema.Field[] {});
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(schema3);
        org.junit.Assert.assertNotNull(fieldList4);
        org.junit.Assert.assertNotNull(schema5);
        org.junit.Assert.assertNotNull(schema6);
        org.junit.Assert.assertNotNull(schema7);
        org.junit.Assert.assertNotNull(schema8);
        org.junit.Assert.assertNotNull(schema9);
        org.junit.Assert.assertNotNull(schema10);
    }

    @Test
    public void test1136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SchemaM3Random300Test2.test1136");
        org.apache.avro.Schema.LockableArrayList<java.lang.String> strList4 = new org.apache.avro.Schema.LockableArrayList<java.lang.String>((int) '#');
        org.apache.avro.Schema.LockableArrayList<java.lang.String> strList5 = new org.apache.avro.Schema.LockableArrayList<java.lang.String>((java.util.List<java.lang.String>) strList4);
        org.apache.avro.Schema.LockableArrayList<java.lang.String> strList6 = new org.apache.avro.Schema.LockableArrayList<java.lang.String>((java.util.List<java.lang.String>) strList4);
        org.apache.avro.Schema.LockableArrayList<java.lang.String> strList7 = new org.apache.avro.Schema.LockableArrayList<java.lang.String>((java.util.List<java.lang.String>) strList6);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.avro.Schema schema8 = org.apache.avro.Schema.createEnum("{}", "{\r\n  \"type\" : \"fixed\",\r\n  \"name\" : \"union\",\r\n  \"namespace\" : \"[]\",\r\n  \"doc\" : \"[ ]\",\r\n  \"size\" : 0\r\n}", "{\r\n  \"type\" : \"fixed\",\r\n  \"name\" : \"union\",\r\n  \"namespace\" : \"{}\",\r\n  \"doc\" : \"hi!\",\r\n  \"size\" : 1\r\n}", (java.util.List<java.lang.String>) strList7);
            org.junit.Assert.fail("Expected exception of type org.apache.avro.SchemaParseException; message: Illegal initial character: {}");
        } catch (org.apache.avro.SchemaParseException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SchemaM3Random300Test2.test1137");
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
        java.lang.String str13 = schema8.getDoc();
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
        org.junit.Assert.assertNull(str13);
    }

    @Test
    public void test1138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SchemaM3Random300Test2.test1138");
        org.apache.avro.Schema schema1 = org.apache.avro.Schema.parse("{\"type\":\"map\",\"values\":{\"type\":\"array\",\"items\":{\"type\":\"map\",\"values\":[]}}}");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = schema1.getEnumOrdinal("{\"type\":\"array\",\"items\":{\"type\":\"map\",\"values\":[]}}");
            org.junit.Assert.fail("Expected exception of type org.apache.avro.AvroRuntimeException; message: Not an enum: {\"type\":\"map\",\"values\":{\"type\":\"array\",\"items\":{\"type\":\"map\",\"values\":[]}}}");
        } catch (org.apache.avro.AvroRuntimeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(schema1);
    }

    @Test
    public void test1139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SchemaM3Random300Test2.test1139");
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
        java.lang.String str16 = schema7.getDoc();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean18 = schema7.hasEnumSymbol("array");
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
        org.junit.Assert.assertNull(str16);
    }

    @Test
    public void test1140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SchemaM3Random300Test2.test1140");
        org.apache.avro.Schema.Field[] fieldArray0 = new org.apache.avro.Schema.Field[] {};
        java.util.ArrayList<org.apache.avro.Schema.Field> fieldList1 = new java.util.ArrayList<org.apache.avro.Schema.Field>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<org.apache.avro.Schema.Field>) fieldList1, fieldArray0);
        org.apache.avro.Schema schema3 = org.apache.avro.Schema.createRecord((java.util.List<org.apache.avro.Schema.Field>) fieldList1);
        java.util.List<org.apache.avro.Schema.Field> fieldList4 = schema3.getFields();
        org.apache.avro.Schema schema5 = org.apache.avro.Schema.createRecord(fieldList4);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.avro.Schema schema6 = schema5.getElementType();
            org.junit.Assert.fail("Expected exception of type org.apache.avro.AvroRuntimeException; message: Not an array: {\"type\":\"record\",\"fields\":[]}");
        } catch (org.apache.avro.AvroRuntimeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(fieldArray0);
        org.junit.Assert.assertArrayEquals(fieldArray0, new org.apache.avro.Schema.Field[] {});
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(schema3);
        org.junit.Assert.assertNotNull(fieldList4);
        org.junit.Assert.assertNotNull(schema5);
    }

    @Test
    public void test1141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SchemaM3Random300Test2.test1141");
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
        org.apache.avro.Schema schema11 = org.apache.avro.Schema.createArray(schema7);
        java.lang.String str12 = schema7.getName();
        java.lang.String str13 = schema7.toString();
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
        org.junit.Assert.assertNotNull(schema11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "union" + "'", str12, "union");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "[]" + "'", str13, "[]");
    }

    @Test
    public void test1142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SchemaM3Random300Test2.test1142");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.avro.Schema schema4 = org.apache.avro.Schema.createRecord("{null={\"type\":\"record\",\"fields\":[]}}", "float", "{\r\n  \"type\" : \"map\",\r\n  \"values\" : {\r\n    \"type\" : \"fixed\",\r\n    \"name\" : \"union\",\r\n    \"namespace\" : \"[]\",\r\n    \"doc\" : \"[ ]\",\r\n    \"size\" : 0\r\n  }\r\n}", true);
            org.junit.Assert.fail("Expected exception of type org.apache.avro.SchemaParseException; message: Illegal initial character: {null={\"type\":\"record\",\"fields\":[]}}");
        } catch (org.apache.avro.SchemaParseException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SchemaM3Random300Test2.test1143");
        org.apache.avro.Schema schema4 = org.apache.avro.Schema.createRecord("union", "{\r\n  \"type\" : \"array\",\r\n  \"items\" : [ ]\r\n}", "{\r\n  \"type\" : \"array\",\r\n  \"items\" : [ ]\r\n}", true);
        org.junit.Assert.assertNotNull(schema4);
    }

    @Test
    public void test1144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SchemaM3Random300Test2.test1144");
        org.apache.avro.Schema.Parser parser0 = new org.apache.avro.Schema.Parser();
        org.apache.avro.Schema.Parser parser2 = parser0.setValidate(true);
        java.util.Map<java.lang.String, org.apache.avro.Schema> strMap3 = parser0.getTypes();
        boolean boolean4 = parser0.getValidate();
        org.apache.avro.Schema schema6 = parser0.parse("[ ]");
        java.lang.String str8 = schema6.toString(false);
        org.apache.avro.Schema.Field[] fieldArray9 = new org.apache.avro.Schema.Field[] {};
        java.util.ArrayList<org.apache.avro.Schema.Field> fieldList10 = new java.util.ArrayList<org.apache.avro.Schema.Field>();
        boolean boolean11 = java.util.Collections.addAll((java.util.Collection<org.apache.avro.Schema.Field>) fieldList10, fieldArray9);
        org.apache.avro.Schema schema12 = org.apache.avro.Schema.createRecord((java.util.List<org.apache.avro.Schema.Field>) fieldList10);
        org.apache.avro.Schema schema13 = org.apache.avro.Schema.createRecord((java.util.List<org.apache.avro.Schema.Field>) fieldList10);
        org.apache.avro.Schema schema14 = org.apache.avro.Schema.createRecord((java.util.List<org.apache.avro.Schema.Field>) fieldList10);
        org.apache.avro.Schema schema15 = org.apache.avro.Schema.createRecord((java.util.List<org.apache.avro.Schema.Field>) fieldList10);
        org.apache.avro.Schema schema16 = org.apache.avro.Schema.createRecord((java.util.List<org.apache.avro.Schema.Field>) fieldList10);
        org.apache.avro.Schema schema17 = org.apache.avro.Schema.createRecord((java.util.List<org.apache.avro.Schema.Field>) fieldList10);
        org.apache.avro.Schema schema18 = org.apache.avro.Schema.createRecord((java.util.List<org.apache.avro.Schema.Field>) fieldList10);
        org.apache.avro.Schema schema19 = org.apache.avro.Schema.createRecord((java.util.List<org.apache.avro.Schema.Field>) fieldList10);
        // The following exception was thrown during execution in test generation
        try {
            schema6.setFields((java.util.List<org.apache.avro.Schema.Field>) fieldList10);
            org.junit.Assert.fail("Expected exception of type org.apache.avro.AvroRuntimeException; message: Not a record: []");
        } catch (org.apache.avro.AvroRuntimeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(parser2);
        org.junit.Assert.assertNotNull(strMap3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(schema6);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "[]" + "'", str8, "[]");
        org.junit.Assert.assertNotNull(fieldArray9);
        org.junit.Assert.assertArrayEquals(fieldArray9, new org.apache.avro.Schema.Field[] {});
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(schema12);
        org.junit.Assert.assertNotNull(schema13);
        org.junit.Assert.assertNotNull(schema14);
        org.junit.Assert.assertNotNull(schema15);
        org.junit.Assert.assertNotNull(schema16);
        org.junit.Assert.assertNotNull(schema17);
        org.junit.Assert.assertNotNull(schema18);
        org.junit.Assert.assertNotNull(schema19);
    }

    @Test
    public void test1145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SchemaM3Random300Test2.test1145");
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
        java.lang.String str24 = schema13.getName();
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
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "union" + "'", str24, "union");
    }

    @Test
    public void test1146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SchemaM3Random300Test2.test1146");
        org.apache.avro.Schema[] schemaArray0 = new org.apache.avro.Schema[] {};
        java.util.ArrayList<org.apache.avro.Schema> schemaList1 = new java.util.ArrayList<org.apache.avro.Schema>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<org.apache.avro.Schema>) schemaList1, schemaArray0);
        org.apache.avro.Schema schema3 = org.apache.avro.Schema.createUnion((java.util.List<org.apache.avro.Schema>) schemaList1);
        java.util.List<org.apache.avro.Schema> schemaList4 = schema3.getTypes();
        org.apache.avro.Schema schema5 = org.apache.avro.Schema.createMap(schema3);
        org.apache.avro.Schema schema8 = org.apache.avro.Schema.parse("{\r\n  \"type\" : \"array\",\r\n  \"items\" : {\r\n    \"type\" : \"map\",\r\n    \"values\" : [ ]\r\n  }\r\n}", true);
        boolean boolean9 = schema3.equals((java.lang.Object) true);
        java.lang.String str10 = schema3.getFullName();
        org.apache.avro.Schema schema11 = org.apache.avro.Schema.createArray(schema3);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.avro.Schema schema12 = schema3.getValueType();
            org.junit.Assert.fail("Expected exception of type org.apache.avro.AvroRuntimeException; message: Not a map: []");
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
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "union" + "'", str10, "union");
        org.junit.Assert.assertNotNull(schema11);
    }

    @Test
    public void test1147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SchemaM3Random300Test2.test1147");
        org.apache.avro.Schema.Names names1 = new org.apache.avro.Schema.Names("[ ]");
        org.apache.avro.Schema.Type type2 = org.apache.avro.Schema.Type.INT;
        org.apache.avro.Schema schema3 = org.apache.avro.Schema.create(type2);
        org.apache.avro.Schema schema4 = org.apache.avro.Schema.createArray(schema3);
        org.apache.avro.Schema schema5 = org.apache.avro.Schema.createMap(schema4);
        // The following exception was thrown during execution in test generation
        try {
            names1.add(schema4);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: org.apache.avro.Schema$ArraySchema cannot be cast to org.apache.avro.Schema$NamedSchema");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + type2 + "' != '" + org.apache.avro.Schema.Type.INT + "'", type2.equals(org.apache.avro.Schema.Type.INT));
        org.junit.Assert.assertNotNull(schema3);
        org.junit.Assert.assertNotNull(schema4);
        org.junit.Assert.assertNotNull(schema5);
    }

    @Test
    public void test1148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SchemaM3Random300Test2.test1148");
        org.apache.avro.Schema.Parser parser0 = new org.apache.avro.Schema.Parser();
        java.util.Map<java.lang.String, org.apache.avro.Schema> strMap1 = parser0.getTypes();
        java.util.Map<java.lang.String, org.apache.avro.Schema> strMap2 = parser0.getTypes();
        org.apache.avro.Schema.Parser parser3 = new org.apache.avro.Schema.Parser();
        java.util.Map<java.lang.String, org.apache.avro.Schema> strMap4 = parser3.getTypes();
        org.apache.avro.Schema.Parser parser5 = parser0.addTypes(strMap4);
        org.apache.avro.Schema schema7 = parser0.parse("{\r\n  \"type\" : \"map\",\r\n  \"values\" : [ ]\r\n}");
        org.apache.avro.Schema.Parser parser9 = parser0.setValidate(true);
        java.util.Map<java.lang.String, org.apache.avro.Schema> strMap10 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.avro.Schema.Parser parser11 = parser9.addTypes(strMap10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strMap1);
        org.junit.Assert.assertNotNull(strMap2);
        org.junit.Assert.assertNotNull(strMap4);
        org.junit.Assert.assertNotNull(parser5);
        org.junit.Assert.assertNotNull(schema7);
        org.junit.Assert.assertNotNull(parser9);
    }

    @Test
    public void test1149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SchemaM3Random300Test2.test1149");
        org.apache.avro.Schema.LockableArrayList<java.lang.String> strList3 = new org.apache.avro.Schema.LockableArrayList<java.lang.String>();
        org.apache.avro.Schema.LockableArrayList<java.lang.String> strList4 = new org.apache.avro.Schema.LockableArrayList<java.lang.String>((java.util.List<java.lang.String>) strList3);
        org.apache.avro.Schema.LockableArrayList<java.lang.String> strList5 = new org.apache.avro.Schema.LockableArrayList<java.lang.String>((java.util.List<java.lang.String>) strList4);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.avro.Schema schema6 = org.apache.avro.Schema.createEnum("{\"type\":\"map\",\"values\":\"double\"}", "{\"type\":\"array\",\"items\":\"null\"}", "{\"type\":\"int\",\"union type:UNION pos:-1\":\"[ ]\"}", (java.util.List<java.lang.String>) strList5);
            org.junit.Assert.fail("Expected exception of type org.apache.avro.SchemaParseException; message: Illegal initial character: {\"type\":\"map\",\"values\":\"double\"}");
        } catch (org.apache.avro.SchemaParseException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SchemaM3Random300Test2.test1150");
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
    public void test1151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SchemaM3Random300Test2.test1151");
        org.apache.avro.Schema.LockableArrayList<org.codehaus.jackson.Versioned> versionedList1 = new org.apache.avro.Schema.LockableArrayList<org.codehaus.jackson.Versioned>((int) 'a');
    }

    @Test
    public void test1152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SchemaM3Random300Test2.test1152");
        org.apache.avro.Schema schema1 = org.apache.avro.Schema.parse("{\r\n  \"type\" : \"array\",\r\n  \"items\" : [ ]\r\n}");
        org.junit.Assert.assertNotNull(schema1);
    }

    @Test
    public void test1153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SchemaM3Random300Test2.test1153");
        org.apache.avro.Schema.Names names1 = new org.apache.avro.Schema.Names("union");
        java.lang.String str2 = names1.space();
        boolean boolean3 = names1.isEmpty();
        names1.clear();
        java.lang.Object obj5 = null;
        org.apache.avro.Schema schema6 = names1.get(obj5);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "union" + "'", str2, "union");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNull(schema6);
    }

    @Test
    public void test1154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SchemaM3Random300Test2.test1154");
        org.apache.avro.Schema.Names names1 = new org.apache.avro.Schema.Names("{\r\n  \"type\" : \"map\",\r\n  \"values\" : {\r\n    \"type\" : \"map\",\r\n    \"values\" : [ ]\r\n  }\r\n}");
        java.util.Collection<org.apache.avro.Schema> schemaCollection2 = names1.values();
        java.lang.String str3 = names1.space();
        org.junit.Assert.assertNotNull(schemaCollection2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "{\r\n  \"type\" : \"map\",\r\n  \"values\" : {\r\n    \"type\" : \"map\",\r\n    \"values\" : [ ]\r\n  }\r\n}" + "'", str3, "{\r\n  \"type\" : \"map\",\r\n  \"values\" : {\r\n    \"type\" : \"map\",\r\n    \"values\" : [ ]\r\n  }\r\n}");
    }

    @Test
    public void test1155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SchemaM3Random300Test2.test1155");
        org.apache.avro.Schema.Type type0 = org.apache.avro.Schema.Type.INT;
        org.apache.avro.Schema schema1 = org.apache.avro.Schema.create(type0);
        org.apache.avro.Schema schema2 = org.apache.avro.Schema.createArray(schema1);
        org.apache.avro.Schema schema3 = org.apache.avro.Schema.createMap(schema2);
        org.apache.avro.Schema schema4 = schema2.getElementType();
        org.apache.avro.Schema schema5 = org.apache.avro.Schema.createArray(schema4);
        // The following exception was thrown during execution in test generation
        try {
            schema4.addAlias("union type:MAP pos:-1");
            org.junit.Assert.fail("Expected exception of type org.apache.avro.AvroRuntimeException; message: Not a named type: \"int\"");
        } catch (org.apache.avro.AvroRuntimeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + type0 + "' != '" + org.apache.avro.Schema.Type.INT + "'", type0.equals(org.apache.avro.Schema.Type.INT));
        org.junit.Assert.assertNotNull(schema1);
        org.junit.Assert.assertNotNull(schema2);
        org.junit.Assert.assertNotNull(schema3);
        org.junit.Assert.assertNotNull(schema4);
        org.junit.Assert.assertNotNull(schema5);
    }

    @Test
    public void test1156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SchemaM3Random300Test2.test1156");
        org.apache.avro.Schema schema2 = org.apache.avro.Schema.parse("[].union", false);
        // The following exception was thrown during execution in test generation
        try {
            int int3 = schema2.getFixedSize();
            org.junit.Assert.fail("Expected exception of type org.apache.avro.AvroRuntimeException; message: Not fixed: []");
        } catch (org.apache.avro.AvroRuntimeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(schema2);
    }

    @Test
    public void test1157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SchemaM3Random300Test2.test1157");
        org.apache.avro.Schema.Parser parser0 = new org.apache.avro.Schema.Parser();
        org.apache.avro.Schema.Parser parser2 = parser0.setValidate(true);
        org.apache.avro.Schema.Parser parser4 = parser0.setValidate(true);
        java.util.Map<java.lang.String, org.apache.avro.Schema> strMap5 = parser4.getTypes();
        org.apache.avro.Schema.Parser parser7 = parser4.setValidate(false);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.avro.Schema schema9 = parser4.parse("int");
            org.junit.Assert.fail("Expected exception of type org.apache.avro.SchemaParseException; message: org.codehaus.jackson.JsonParseException: Unexpected character ('i' (code 105)): expected a valid value (number, String, array, object, 'true', 'false' or 'null')? at [Source: java.io.StringReader@3dd9f0a1; line: 1, column: 2]");
        } catch (org.apache.avro.SchemaParseException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(parser2);
        org.junit.Assert.assertNotNull(parser4);
        org.junit.Assert.assertNotNull(strMap5);
        org.junit.Assert.assertNotNull(parser7);
    }

    @Test
    public void test1158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SchemaM3Random300Test2.test1158");
        org.apache.avro.Schema.Parser parser0 = new org.apache.avro.Schema.Parser();
        org.apache.avro.Schema.Parser parser2 = parser0.setValidate(true);
        org.apache.avro.Schema.Parser parser4 = parser0.setValidate(true);
        org.apache.avro.Schema.Parser parser6 = parser0.setValidate(true);
        org.apache.avro.Schema schema8 = parser0.parse("[].union");
        org.apache.avro.Schema schema10 = parser0.parse("{\"type\":\"fixed\",\"name\":\"union\",\"namespace\":\"[]\",\"doc\":\"[ ]\",\"size\":0}");
        java.lang.String str12 = schema10.getProp("{}");
        java.util.Set<java.lang.String> strSet13 = schema10.getAliases();
        org.junit.Assert.assertNotNull(parser2);
        org.junit.Assert.assertNotNull(parser4);
        org.junit.Assert.assertNotNull(parser6);
        org.junit.Assert.assertNotNull(schema8);
        org.junit.Assert.assertNotNull(schema10);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNotNull(strSet13);
    }

    @Test
    public void test1159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SchemaM3Random300Test2.test1159");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.avro.Schema schema4 = org.apache.avro.Schema.createFixed("{}", "{\r\n  \"type\" : \"map\",\r\n  \"values\" : {\r\n    \"type\" : \"enum\",\r\n    \"name\" : \"union\",\r\n    \"namespace\" : \"[]\",\r\n    \"doc\" : \"{}\",\r\n    \"symbols\" : [ ]\r\n  }\r\n}", "{\"type\":\"array\",\"items\":{\"type\":\"record\",\"fields\":[]}}", (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type org.apache.avro.SchemaParseException; message: Illegal initial character: {}");
        } catch (org.apache.avro.SchemaParseException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SchemaM3Random300Test2.test1160");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.avro.Schema schema2 = org.apache.avro.Schema.parse("int", false);
            org.junit.Assert.fail("Expected exception of type org.apache.avro.SchemaParseException; message: org.codehaus.jackson.JsonParseException: Unexpected character ('i' (code 105)): expected a valid value (number, String, array, object, 'true', 'false' or 'null')? at [Source: java.io.StringReader@1f17539; line: 1, column: 2]");
        } catch (org.apache.avro.SchemaParseException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SchemaM3Random300Test2.test1161");
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
    public void test1162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SchemaM3Random300Test2.test1162");
        org.apache.avro.Schema.LockableArrayList<java.lang.reflect.GenericDeclaration> genericDeclarationList1 = new org.apache.avro.Schema.LockableArrayList<java.lang.reflect.GenericDeclaration>((int) (byte) 100);
        org.apache.avro.Schema.LockableArrayList<java.lang.reflect.GenericDeclaration> genericDeclarationList2 = new org.apache.avro.Schema.LockableArrayList<java.lang.reflect.GenericDeclaration>((java.util.List<java.lang.reflect.GenericDeclaration>) genericDeclarationList1);
        org.apache.avro.Schema.LockableArrayList<java.lang.reflect.GenericDeclaration> genericDeclarationList3 = new org.apache.avro.Schema.LockableArrayList<java.lang.reflect.GenericDeclaration>((java.util.List<java.lang.reflect.GenericDeclaration>) genericDeclarationList1);
    }

    @Test
    public void test1163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SchemaM3Random300Test2.test1163");
        org.apache.avro.Schema schema1 = org.apache.avro.Schema.parse("{\r\n  \"type\" : \"fixed\",\r\n  \"name\" : \"union\",\r\n  \"namespace\" : \"[]\",\r\n  \"doc\" : \"[ ]\",\r\n  \"size\" : 0,\r\n  \"{\\r\\n  \\\"type\\\" : \\\"fixed\\\",\\r\\n  \\\"name\\\" : \\\"union\\\",\\r\\n  \\\"namespace\\\" : \\\"[]\\\",\\r\\n  \\\"doc\\\" : \\\"[ ]\\\",\\r\\n  \\\"size\\\" : 0\\r\\n}\" : \"{\\r\\n  \\\"type\\\" : \\\"map\\\",\\r\\n  \\\"values\\\" : {\\r\\n    \\\"type\\\" : \\\"map\\\",\\r\\n    \\\"values\\\" : [ ]\\r\\n  }\\r\\n}\"\r\n}");
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<org.apache.avro.Schema> schemaList2 = schema1.getTypes();
            org.junit.Assert.fail("Expected exception of type org.apache.avro.AvroRuntimeException; message: Not a union: {\"type\":\"fixed\",\"name\":\"union\",\"namespace\":\"[]\",\"doc\":\"[ ]\",\"size\":0,\"{\\r\\n  \\\"type\\\" : \\\"fixed\\\",\\r\\n  \\\"name\\\" : \\\"union\\\",\\r\\n  \\\"namespace\\\" : \\\"[]\\\",\\r\\n  \\\"doc\\\" : \\\"[ ]\\\",\\r\\n  \\\"size\\\" : 0\\r\\n}\":\"{\\r\\n  \\\"type\\\" : \\\"map\\\",\\r\\n  \\\"values\\\" : {\\r\\n    \\\"type\\\" : \\\"map\\\",\\r\\n    \\\"values\\\" : [ ]\\r\\n  }\\r\\n}\"}");
        } catch (org.apache.avro.AvroRuntimeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(schema1);
    }

    @Test
    public void test1164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SchemaM3Random300Test2.test1164");
        org.apache.avro.Schema.LockableArrayList<java.lang.Object> objList0 = new org.apache.avro.Schema.LockableArrayList<java.lang.Object>();
    }

    @Test
    public void test1165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SchemaM3Random300Test2.test1165");
        org.apache.avro.Schema[] schemaArray0 = new org.apache.avro.Schema[] {};
        java.util.ArrayList<org.apache.avro.Schema> schemaList1 = new java.util.ArrayList<org.apache.avro.Schema>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<org.apache.avro.Schema>) schemaList1, schemaArray0);
        org.apache.avro.Schema schema3 = org.apache.avro.Schema.createUnion((java.util.List<org.apache.avro.Schema>) schemaList1);
        java.util.List<org.apache.avro.Schema> schemaList4 = schema3.getTypes();
        java.lang.String str5 = schema3.getDoc();
        java.lang.String str6 = schema3.getFullName();
        java.lang.String str7 = schema3.toString();
        org.junit.Assert.assertNotNull(schemaArray0);
        org.junit.Assert.assertArrayEquals(schemaArray0, new org.apache.avro.Schema[] {});
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(schema3);
        org.junit.Assert.assertNotNull(schemaList4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "union" + "'", str6, "union");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "[]" + "'", str7, "[]");
    }

    @Test
    public void test1166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SchemaM3Random300Test2.test1166");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.avro.Schema schema4 = org.apache.avro.Schema.createFixed("", "\"double\"", "{\r\n  \"type\" : \"map\",\r\n  \"values\" : {\r\n    \"type\" : \"enum\",\r\n    \"name\" : \"union\",\r\n    \"namespace\" : \"[]\",\r\n    \"doc\" : \"{}\",\r\n    \"symbols\" : [ ]\r\n  }\r\n}", (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type org.apache.avro.SchemaParseException; message: Empty name");
        } catch (org.apache.avro.SchemaParseException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SchemaM3Random300Test2.test1167");
        org.apache.avro.Schema.LockableArrayList<org.apache.avro.Schema.LockableArrayList<java.lang.String>> strListList1 = new org.apache.avro.Schema.LockableArrayList<org.apache.avro.Schema.LockableArrayList<java.lang.String>>((int) ' ');
    }

    @Test
    public void test1168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SchemaM3Random300Test2.test1168");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.avro.Schema schema4 = org.apache.avro.Schema.createFixed("{\r\n  \"type\" : \"record\",\r\n  \"fields\" : [ ],\r\n  \"{\\r\\n  \\\"type\\\" : \\\"fixed\\\",\\r\\n  \\\"name\\\" : \\\"union\\\",\\r\\n  \\\"namespace\\\" : \\\"[]\\\",\\r\\n  \\\"doc\\\" : \\\"[ ]\\\",\\r\\n  \\\"size\\\" : 0\\r\\n}\" : \"[ ]\"\r\n}", "{\"type\":\"fixed\",\"name\":\"union\",\"namespace\":\"{}\",\"doc\":\"hi!\",\"size\":1}", "map", (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type org.apache.avro.SchemaParseException; message: Illegal initial character: {??  \"type\" : \"record\",??  \"fields\" : [ ],??  \"{\\r\\n  \\\"type\\\" : \\\"fixed\\\",\\r\\n  \\\"name\\\" : \\\"union\\\",\\r\\n  \\\"namespace\\\" : \\\"[]\\\",\\r\\n  \\\"doc\\\" : \\\"[ ]\\\",\\r\\n  \\\"size\\\" : 0\\r\\n}\" : \"[ ]\"??}");
        } catch (org.apache.avro.SchemaParseException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SchemaM3Random300Test2.test1169");
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
        java.util.Map<java.lang.String, org.apache.avro.Schema> strMap17 = parser6.getTypes();
        java.lang.Class<?> wildcardClass18 = parser6.getClass();
        org.junit.Assert.assertNotNull(parser2);
        org.junit.Assert.assertNotNull(parser4);
        org.junit.Assert.assertNotNull(parser6);
        org.junit.Assert.assertNotNull(parser9);
        org.junit.Assert.assertNotNull(strMap10);
        org.junit.Assert.assertNotNull(parser12);
        org.junit.Assert.assertNotNull(parser14);
        org.junit.Assert.assertNotNull(strMap15);
        org.junit.Assert.assertNotNull(parser16);
        org.junit.Assert.assertNotNull(strMap17);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test1170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SchemaM3Random300Test2.test1170");
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
        org.apache.avro.Schema schema15 = parser7.parse("{\"type\":\"array\",\"items\":{\"type\":\"map\",\"values\":[]}}");
        org.apache.avro.Schema.Parser parser17 = parser7.setValidate(true);
        java.io.File file18 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.avro.Schema schema19 = parser17.parse(file18);
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
        org.junit.Assert.assertNotNull(parser11);
        org.junit.Assert.assertNotNull(schema13);
        org.junit.Assert.assertNotNull(schema15);
        org.junit.Assert.assertNotNull(parser17);
    }

    @Test
    public void test1171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SchemaM3Random300Test2.test1171");
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
        org.codehaus.jackson.JsonNode jsonNode17 = org.apache.avro.Schema.parseJson("{\r\n  \"type\" : \"record\",\r\n  \"fields\" : [ ]\r\n}");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.avro.Schema.Field field18 = new org.apache.avro.Schema.Field("{\"type\":\"fixed\",\"name\":\"union\",\"namespace\":\"[]\",\"doc\":\"union type:UNION pos:-1\",\"size\":100}", schema9, "{\"type\":\"fixed\",\"name\":\"union\",\"namespace\":\"[]\",\"doc\":\"[ ]\",\"size\":0}", jsonNode17);
            org.junit.Assert.fail("Expected exception of type org.apache.avro.SchemaParseException; message: Illegal initial character: {\"type\":\"fixed\",\"name\":\"union\",\"namespace\":\"[]\",\"doc\":\"union type:UNION pos:-1\",\"size\":100}");
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
        org.junit.Assert.assertNotNull(jsonNode17);
    }

    @Test
    public void test1172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SchemaM3Random300Test2.test1172");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.avro.Schema schema4 = org.apache.avro.Schema.createFixed("\"double\"", "{\r\n  \"type\" : \"record\",\r\n  \"fields\" : [ ]\r\n}", "{null={\"type\":\"fixed\",\"name\":\"union\",\"namespace\":\"[]\",\"doc\":\"[ ]\",\"size\":0}}", (int) '4');
            org.junit.Assert.fail("Expected exception of type org.apache.avro.SchemaParseException; message: Illegal initial character: \"double\"");
        } catch (org.apache.avro.SchemaParseException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SchemaM3Random300Test2.test1173");
        org.apache.avro.Schema.Field[] fieldArray0 = new org.apache.avro.Schema.Field[] {};
        java.util.ArrayList<org.apache.avro.Schema.Field> fieldList1 = new java.util.ArrayList<org.apache.avro.Schema.Field>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<org.apache.avro.Schema.Field>) fieldList1, fieldArray0);
        org.apache.avro.Schema schema3 = org.apache.avro.Schema.createRecord((java.util.List<org.apache.avro.Schema.Field>) fieldList1);
        org.apache.avro.Schema.Field field5 = schema3.getField("");
        org.apache.avro.Schema schema6 = org.apache.avro.Schema.createMap(schema3);
        org.apache.avro.Schema.Type type7 = schema3.getType();
        org.apache.avro.Schema schema8 = org.apache.avro.Schema.createMap(schema3);
        org.apache.avro.Schema schema9 = org.apache.avro.Schema.createArray(schema3);
        org.junit.Assert.assertNotNull(fieldArray0);
        org.junit.Assert.assertArrayEquals(fieldArray0, new org.apache.avro.Schema.Field[] {});
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(schema3);
        org.junit.Assert.assertNull(field5);
        org.junit.Assert.assertNotNull(schema6);
        org.junit.Assert.assertTrue("'" + type7 + "' != '" + org.apache.avro.Schema.Type.RECORD + "'", type7.equals(org.apache.avro.Schema.Type.RECORD));
        org.junit.Assert.assertNotNull(schema8);
        org.junit.Assert.assertNotNull(schema9);
    }

    @Test
    public void test1174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SchemaM3Random300Test2.test1174");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.avro.Schema schema4 = org.apache.avro.Schema.createFixed("{\r\n  \"type\" : \"map\",\r\n  \"values\" : {\r\n    \"type\" : \"record\",\r\n    \"fields\" : [ ]\r\n  }\r\n}", "", "", 10);
            org.junit.Assert.fail("Expected exception of type org.apache.avro.SchemaParseException; message: Illegal initial character: {??  \"type\" : \"map\",??  \"values\" : {??    \"type\" : \"record\",??    \"fields\" : [ ]??  }??}");
        } catch (org.apache.avro.SchemaParseException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SchemaM3Random300Test2.test1175");
        org.apache.avro.Schema schema4 = org.apache.avro.Schema.createFixed("union", "", "union type:UNION pos:-1", 10);
        java.lang.String str5 = schema4.getNamespace();
        org.apache.avro.Schema schema6 = org.apache.avro.Schema.createArray(schema4);
        org.junit.Assert.assertNotNull(schema4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "union type:UNION pos:-1" + "'", str5, "union type:UNION pos:-1");
        org.junit.Assert.assertNotNull(schema6);
    }

    @Test
    public void test1176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SchemaM3Random300Test2.test1176");
        org.apache.avro.Schema.LockableArrayList<org.codehaus.jackson.map.ObjectMapper> objectMapperList1 = new org.apache.avro.Schema.LockableArrayList<org.codehaus.jackson.map.ObjectMapper>((int) (short) 100);
    }

    @Test
    public void test1177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SchemaM3Random300Test2.test1177");
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
            schema3.addAlias("{\"type\":\"fixed\",\"name\":\"union\",\"namespace\":\"{}\",\"doc\":\"hi!\",\"size\":1}");
            org.junit.Assert.fail("Expected exception of type org.apache.avro.AvroRuntimeException; message: Not a named type: []");
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
    public void test1178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SchemaM3Random300Test2.test1178");
        org.apache.avro.Schema.Names names1 = new org.apache.avro.Schema.Names("union");
        java.lang.String str2 = names1.space();
        boolean boolean3 = names1.isEmpty();
        org.apache.avro.Schema.Field[] fieldArray4 = new org.apache.avro.Schema.Field[] {};
        java.util.ArrayList<org.apache.avro.Schema.Field> fieldList5 = new java.util.ArrayList<org.apache.avro.Schema.Field>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<org.apache.avro.Schema.Field>) fieldList5, fieldArray4);
        org.apache.avro.Schema schema7 = org.apache.avro.Schema.createRecord((java.util.List<org.apache.avro.Schema.Field>) fieldList5);
        org.apache.avro.Schema schema8 = org.apache.avro.Schema.createRecord((java.util.List<org.apache.avro.Schema.Field>) fieldList5);
        org.apache.avro.Schema schema9 = org.apache.avro.Schema.createRecord((java.util.List<org.apache.avro.Schema.Field>) fieldList5);
        org.apache.avro.Schema schema10 = org.apache.avro.Schema.createRecord((java.util.List<org.apache.avro.Schema.Field>) fieldList5);
        org.apache.avro.Schema.Field field12 = schema10.getField("map");
        boolean boolean13 = names1.containsKey((java.lang.Object) "map");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "union" + "'", str2, "union");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(fieldArray4);
        org.junit.Assert.assertArrayEquals(fieldArray4, new org.apache.avro.Schema.Field[] {});
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(schema7);
        org.junit.Assert.assertNotNull(schema8);
        org.junit.Assert.assertNotNull(schema9);
        org.junit.Assert.assertNotNull(schema10);
        org.junit.Assert.assertNull(field12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test1179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SchemaM3Random300Test2.test1179");
        org.apache.avro.Schema schema2 = org.apache.avro.Schema.parse("{\r\n  \"type\" : \"map\",\r\n  \"values\" : {\r\n    \"type\" : \"enum\",\r\n    \"name\" : \"union\",\r\n    \"namespace\" : \"[]\",\r\n    \"doc\" : \"{}\",\r\n    \"symbols\" : [ ]\r\n  }\r\n}", false);
        org.junit.Assert.assertNotNull(schema2);
    }

    @Test
    public void test1180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SchemaM3Random300Test2.test1180");
        org.apache.avro.Schema.Names names1 = new org.apache.avro.Schema.Names("{null={\"type\":\"fixed\",\"name\":\"union\",\"namespace\":\"[]\",\"doc\":\"[ ]\",\"size\":0}}");
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
        boolean boolean13 = schema10.equals((java.lang.Object) "hi!");
        java.lang.String str14 = schema10.getDoc();
        org.apache.avro.Schema schema15 = org.apache.avro.Schema.createArray(schema10);
        java.lang.String str16 = schema10.toString();
        org.apache.avro.Schema schema17 = org.apache.avro.Schema.createArray(schema10);
        java.util.List<org.apache.avro.Schema> schemaList18 = schema10.getTypes();
        org.apache.avro.Schema schema19 = org.apache.avro.Schema.createUnion(schemaList18);
        boolean boolean20 = names1.containsKey((java.lang.Object) schemaList18);
        org.apache.avro.Schema schema21 = org.apache.avro.Schema.createUnion(schemaList18);
        // The following exception was thrown during execution in test generation
        try {
            int int23 = schema21.getEnumOrdinal("union");
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
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNotNull(schema15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "[]" + "'", str16, "[]");
        org.junit.Assert.assertNotNull(schema17);
        org.junit.Assert.assertNotNull(schemaList18);
        org.junit.Assert.assertNotNull(schema19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(schema21);
    }

    @Test
    public void test1181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SchemaM3Random300Test2.test1181");
        org.apache.avro.Schema.Field[] fieldArray0 = new org.apache.avro.Schema.Field[] {};
        java.util.ArrayList<org.apache.avro.Schema.Field> fieldList1 = new java.util.ArrayList<org.apache.avro.Schema.Field>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<org.apache.avro.Schema.Field>) fieldList1, fieldArray0);
        org.apache.avro.Schema schema3 = org.apache.avro.Schema.createRecord((java.util.List<org.apache.avro.Schema.Field>) fieldList1);
        boolean boolean4 = schema3.isError();
        org.apache.avro.Schema schema5 = org.apache.avro.Schema.createArray(schema3);
        java.lang.String str6 = schema5.toString();
        org.junit.Assert.assertNotNull(fieldArray0);
        org.junit.Assert.assertArrayEquals(fieldArray0, new org.apache.avro.Schema.Field[] {});
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(schema3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(schema5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "{\"type\":\"array\",\"items\":{\"type\":\"record\",\"fields\":[]}}" + "'", str6, "{\"type\":\"array\",\"items\":{\"type\":\"record\",\"fields\":[]}}");
    }

    @Test
    public void test1182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SchemaM3Random300Test2.test1182");
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
        org.apache.avro.Schema schema10 = org.apache.avro.Schema.createArray(schema8);
        java.lang.String str11 = schema10.getFullName();
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
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "array" + "'", str11, "array");
    }

    @Test
    public void test1183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SchemaM3Random300Test2.test1183");
        org.apache.avro.Schema.LockableArrayList<java.lang.String> strList4 = new org.apache.avro.Schema.LockableArrayList<java.lang.String>((int) ' ');
        org.apache.avro.Schema schema5 = org.apache.avro.Schema.createEnum("int", "map", "\"double\"", (java.util.List<java.lang.String>) strList4);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.avro.Schema schema6 = schema5.getElementType();
            org.junit.Assert.fail("Expected exception of type org.apache.avro.AvroRuntimeException; message: Not an array: {\"type\":\"enum\",\"name\":\"int\",\"namespace\":\"\\\"double\\\"\",\"doc\":\"map\",\"symbols\":[]}");
        } catch (org.apache.avro.AvroRuntimeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(schema5);
    }

    @Test
    public void test1184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SchemaM3Random300Test2.test1184");
        org.apache.avro.Schema.Parser parser0 = new org.apache.avro.Schema.Parser();
        org.apache.avro.Schema.Parser parser2 = parser0.setValidate(true);
        boolean boolean3 = parser0.getValidate();
        org.apache.avro.Schema.Parser parser4 = new org.apache.avro.Schema.Parser();
        java.util.Map<java.lang.String, org.apache.avro.Schema> strMap5 = parser4.getTypes();
        java.util.Map<java.lang.String, org.apache.avro.Schema> strMap6 = parser4.getTypes();
        org.apache.avro.Schema.Parser parser7 = new org.apache.avro.Schema.Parser();
        org.apache.avro.Schema.Parser parser9 = parser7.setValidate(true);
        java.util.Map<java.lang.String, org.apache.avro.Schema> strMap10 = parser7.getTypes();
        org.apache.avro.Schema.Parser parser11 = parser4.addTypes(strMap10);
        java.util.Map<java.lang.String, org.apache.avro.Schema> strMap12 = parser4.getTypes();
        org.apache.avro.Schema.Parser parser14 = parser4.setValidate(false);
        org.apache.avro.Schema.Parser parser16 = parser4.setValidate(false);
        boolean boolean17 = parser16.getValidate();
        org.apache.avro.Schema.Parser parser18 = new org.apache.avro.Schema.Parser();
        java.util.Map<java.lang.String, org.apache.avro.Schema> strMap19 = parser18.getTypes();
        java.util.Map<java.lang.String, org.apache.avro.Schema> strMap20 = parser18.getTypes();
        org.apache.avro.Schema.Parser parser21 = new org.apache.avro.Schema.Parser();
        org.apache.avro.Schema.Parser parser23 = parser21.setValidate(true);
        java.util.Map<java.lang.String, org.apache.avro.Schema> strMap24 = parser21.getTypes();
        org.apache.avro.Schema.Parser parser25 = parser18.addTypes(strMap24);
        java.util.Map<java.lang.String, org.apache.avro.Schema> strMap26 = parser25.getTypes();
        org.apache.avro.Schema.Parser parser27 = parser16.addTypes(strMap26);
        org.apache.avro.Schema.Parser parser28 = parser0.addTypes(strMap26);
        org.apache.avro.Schema schema30 = parser0.parse("{\r\n  \"type\" : \"fixed\",\r\n  \"name\" : \"union\",\r\n  \"namespace\" : \"[]\",\r\n  \"doc\" : \"[ ]\",\r\n  \"size\" : 0,\r\n  \"{\\r\\n  \\\"type\\\" : \\\"fixed\\\",\\r\\n  \\\"name\\\" : \\\"union\\\",\\r\\n  \\\"namespace\\\" : \\\"[]\\\",\\r\\n  \\\"doc\\\" : \\\"[ ]\\\",\\r\\n  \\\"size\\\" : 0\\r\\n}\" : \"{\\r\\n  \\\"type\\\" : \\\"map\\\",\\r\\n  \\\"values\\\" : {\\r\\n    \\\"type\\\" : \\\"map\\\",\\r\\n    \\\"values\\\" : [ ]\\r\\n  }\\r\\n}\"\r\n}");
        org.junit.Assert.assertNotNull(parser2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(strMap5);
        org.junit.Assert.assertNotNull(strMap6);
        org.junit.Assert.assertNotNull(parser9);
        org.junit.Assert.assertNotNull(strMap10);
        org.junit.Assert.assertNotNull(parser11);
        org.junit.Assert.assertNotNull(strMap12);
        org.junit.Assert.assertNotNull(parser14);
        org.junit.Assert.assertNotNull(parser16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(strMap19);
        org.junit.Assert.assertNotNull(strMap20);
        org.junit.Assert.assertNotNull(parser23);
        org.junit.Assert.assertNotNull(strMap24);
        org.junit.Assert.assertNotNull(parser25);
        org.junit.Assert.assertNotNull(strMap26);
        org.junit.Assert.assertNotNull(parser27);
        org.junit.Assert.assertNotNull(parser28);
        org.junit.Assert.assertNotNull(schema30);
    }

    @Test
    public void test1185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SchemaM3Random300Test2.test1185");
        org.apache.avro.Schema.Names names1 = new org.apache.avro.Schema.Names("{}");
        int int2 = names1.size();
        int int3 = names1.size();
        java.lang.Object obj4 = names1.clone();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(obj4);
        org.junit.Assert.assertEquals(obj4.toString(), "{}");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj4), "{}");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj4), "{}");
    }

    @Test
    public void test1186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SchemaM3Random300Test2.test1186");
        org.apache.avro.Schema.Parser parser0 = new org.apache.avro.Schema.Parser();
        org.apache.avro.Schema.Parser parser2 = parser0.setValidate(true);
        boolean boolean3 = parser0.getValidate();
        org.apache.avro.Schema.Parser parser4 = new org.apache.avro.Schema.Parser();
        java.util.Map<java.lang.String, org.apache.avro.Schema> strMap5 = parser4.getTypes();
        java.util.Map<java.lang.String, org.apache.avro.Schema> strMap6 = parser4.getTypes();
        org.apache.avro.Schema.Parser parser7 = new org.apache.avro.Schema.Parser();
        org.apache.avro.Schema.Parser parser9 = parser7.setValidate(true);
        java.util.Map<java.lang.String, org.apache.avro.Schema> strMap10 = parser7.getTypes();
        org.apache.avro.Schema.Parser parser11 = parser4.addTypes(strMap10);
        java.util.Map<java.lang.String, org.apache.avro.Schema> strMap12 = parser4.getTypes();
        org.apache.avro.Schema.Parser parser14 = parser4.setValidate(false);
        org.apache.avro.Schema.Parser parser16 = parser4.setValidate(false);
        boolean boolean17 = parser16.getValidate();
        org.apache.avro.Schema.Parser parser18 = new org.apache.avro.Schema.Parser();
        java.util.Map<java.lang.String, org.apache.avro.Schema> strMap19 = parser18.getTypes();
        java.util.Map<java.lang.String, org.apache.avro.Schema> strMap20 = parser18.getTypes();
        org.apache.avro.Schema.Parser parser21 = new org.apache.avro.Schema.Parser();
        org.apache.avro.Schema.Parser parser23 = parser21.setValidate(true);
        java.util.Map<java.lang.String, org.apache.avro.Schema> strMap24 = parser21.getTypes();
        org.apache.avro.Schema.Parser parser25 = parser18.addTypes(strMap24);
        java.util.Map<java.lang.String, org.apache.avro.Schema> strMap26 = parser25.getTypes();
        org.apache.avro.Schema.Parser parser27 = parser16.addTypes(strMap26);
        org.apache.avro.Schema.Parser parser28 = parser0.addTypes(strMap26);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.avro.Schema schema30 = parser0.parse("{null=null}");
            org.junit.Assert.fail("Expected exception of type org.apache.avro.SchemaParseException; message: org.codehaus.jackson.JsonParseException: Unexpected character ('n' (code 110)): was expecting double-quote to start field name? at [Source: java.io.StringReader@9b17b86; line: 1, column: 3]");
        } catch (org.apache.avro.SchemaParseException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(parser2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(strMap5);
        org.junit.Assert.assertNotNull(strMap6);
        org.junit.Assert.assertNotNull(parser9);
        org.junit.Assert.assertNotNull(strMap10);
        org.junit.Assert.assertNotNull(parser11);
        org.junit.Assert.assertNotNull(strMap12);
        org.junit.Assert.assertNotNull(parser14);
        org.junit.Assert.assertNotNull(parser16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(strMap19);
        org.junit.Assert.assertNotNull(strMap20);
        org.junit.Assert.assertNotNull(parser23);
        org.junit.Assert.assertNotNull(strMap24);
        org.junit.Assert.assertNotNull(parser25);
        org.junit.Assert.assertNotNull(strMap26);
        org.junit.Assert.assertNotNull(parser27);
        org.junit.Assert.assertNotNull(parser28);
    }

    @Test
    public void test1187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SchemaM3Random300Test2.test1187");
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
        java.util.List<org.apache.avro.Schema> schemaList41 = schema28.getTypes();
        org.apache.avro.Schema schema42 = org.apache.avro.Schema.createUnion(schemaList41);
        // The following exception was thrown during execution in test generation
        try {
            java.util.Set<java.lang.String> strSet43 = schema42.getAliases();
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
        org.junit.Assert.assertNotNull(schemaList41);
        org.junit.Assert.assertNotNull(schema42);
    }

    @Test
    public void test1188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SchemaM3Random300Test2.test1188");
        org.apache.avro.Schema.Type type0 = org.apache.avro.Schema.Type.INT;
        org.apache.avro.Schema schema1 = org.apache.avro.Schema.create(type0);
        org.apache.avro.Schema schema2 = org.apache.avro.Schema.createArray(schema1);
        schema2.addProp("[ ]", "");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean6 = schema2.isError();
            org.junit.Assert.fail("Expected exception of type org.apache.avro.AvroRuntimeException; message: Not a record: {\"type\":\"array\",\"items\":\"int\",\"[ ]\":\"\"}");
        } catch (org.apache.avro.AvroRuntimeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + type0 + "' != '" + org.apache.avro.Schema.Type.INT + "'", type0.equals(org.apache.avro.Schema.Type.INT));
        org.junit.Assert.assertNotNull(schema1);
        org.junit.Assert.assertNotNull(schema2);
    }

    @Test
    public void test1189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SchemaM3Random300Test2.test1189");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.avro.Schema schema4 = org.apache.avro.Schema.createFixed("{\r\n  \"type\" : \"fixed\",\r\n  \"name\" : \"union\",\r\n  \"namespace\" : \"[]\",\r\n  \"doc\" : \"[ ]\",\r\n  \"size\" : 0,\r\n  \"{\\r\\n  \\\"type\\\" : \\\"fixed\\\",\\r\\n  \\\"name\\\" : \\\"union\\\",\\r\\n  \\\"namespace\\\" : \\\"[]\\\",\\r\\n  \\\"doc\\\" : \\\"[ ]\\\",\\r\\n  \\\"size\\\" : 0\\r\\n}\" : \"{\\r\\n  \\\"type\\\" : \\\"map\\\",\\r\\n  \\\"values\\\" : {\\r\\n    \\\"type\\\" : \\\"map\\\",\\r\\n    \\\"values\\\" : [ ]\\r\\n  }\\r\\n}\"\r\n}", "{\"type\":\"map\",\"values\":\"double\"}", "{\"type\":\"map\",\"values\":{\"type\":\"array\",\"items\":{\"type\":\"map\",\"values\":[]},\"\":\"{\\r\\n  \\\"type\\\" : \\\"record\\\",\\r\\n  \\\"fields\\\" : [ ]\\r\\n}\"}}", 100);
            org.junit.Assert.fail("Expected exception of type org.apache.avro.SchemaParseException; message: Illegal initial character: {??  \"type\" : \"fixed\",??  \"name\" : \"union\",??  \"namespace\" : \"[]\",??  \"doc\" : \"[ ]\",??  \"size\" : 0,??  \"{\\r\\n  \\\"type\\\" : \\\"fixed\\\",\\r\\n  \\\"name\\\" : \\\"union\\\",\\r\\n  \\\"namespace\\\" : \\\"[]\\\",\\r\\n  \\\"doc\\\" : \\\"[ ]\\\",\\r\\n  \\\"size\\\" : 0\\r\\n}\" : \"{\\r\\n  \\\"type\\\" : \\\"map\\\",\\r\\n  \\\"values\\\" : {\\r\\n    \\\"type\\\" : \\\"map\\\",\\r\\n    \\\"values\\\" : [ ]\\r\\n  }\\r\\n}\"??}");
        } catch (org.apache.avro.SchemaParseException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SchemaM3Random300Test2.test1190");
        org.apache.avro.Schema schema1 = org.apache.avro.Schema.parse("{\"type\":\"array\",\"items\":\"int\"}");
        // The following exception was thrown during execution in test generation
        try {
            schema1.addAlias("{\"type\":\"fixed\",\"name\":\"union\",\"namespace\":\"[]\",\"doc\":\"union type:UNION pos:-1\",\"size\":100}");
            org.junit.Assert.fail("Expected exception of type org.apache.avro.AvroRuntimeException; message: Not a named type: {\"type\":\"array\",\"items\":\"int\"}");
        } catch (org.apache.avro.AvroRuntimeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(schema1);
    }

    @Test
    public void test1191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SchemaM3Random300Test2.test1191");
        org.apache.avro.Schema schema2 = org.apache.avro.Schema.parse("{\"type\":\"map\",\"values\":[]}", true);
        java.lang.String str3 = schema2.getName();
        // The following exception was thrown during execution in test generation
        try {
            schema2.addAlias("{\r\n  \"type\" : \"array\",\r\n  \"items\" : [ ],\r\n  \"{}\" : \"hi!\"\r\n}");
            org.junit.Assert.fail("Expected exception of type org.apache.avro.AvroRuntimeException; message: Not a named type: {\"type\":\"map\",\"values\":[]}");
        } catch (org.apache.avro.AvroRuntimeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(schema2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "map" + "'", str3, "map");
    }

    @Test
    public void test1192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SchemaM3Random300Test2.test1192");
        org.apache.avro.Schema schema1 = org.apache.avro.Schema.parse("{\r\n  \"type\" : \"map\",\r\n  \"values\" : {\r\n    \"type\" : \"fixed\",\r\n    \"name\" : \"union\",\r\n    \"namespace\" : \"[]\",\r\n    \"doc\" : \"[ ]\",\r\n    \"size\" : 0\r\n  }\r\n}");
        org.apache.avro.Schema schema3 = org.apache.avro.Schema.parse("{\"type\":\"array\",\"items\":{\"type\":\"array\",\"items\":{\"type\":\"map\",\"values\":[]}}}");
        org.apache.avro.Schema schema4 = org.apache.avro.Schema.applyAliases(schema1, schema3);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean5 = schema3.isError();
            org.junit.Assert.fail("Expected exception of type org.apache.avro.AvroRuntimeException; message: Not a record: {\"type\":\"array\",\"items\":{\"type\":\"array\",\"items\":{\"type\":\"map\",\"values\":[]}}}");
        } catch (org.apache.avro.AvroRuntimeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(schema1);
        org.junit.Assert.assertNotNull(schema3);
        org.junit.Assert.assertNotNull(schema4);
    }

    @Test
    public void test1193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SchemaM3Random300Test2.test1193");
        org.apache.avro.Schema.Field[] fieldArray0 = new org.apache.avro.Schema.Field[] {};
        java.util.ArrayList<org.apache.avro.Schema.Field> fieldList1 = new java.util.ArrayList<org.apache.avro.Schema.Field>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<org.apache.avro.Schema.Field>) fieldList1, fieldArray0);
        org.apache.avro.Schema schema3 = org.apache.avro.Schema.createRecord((java.util.List<org.apache.avro.Schema.Field>) fieldList1);
        org.apache.avro.Schema schema4 = org.apache.avro.Schema.createRecord((java.util.List<org.apache.avro.Schema.Field>) fieldList1);
        org.apache.avro.Schema schema5 = org.apache.avro.Schema.createRecord((java.util.List<org.apache.avro.Schema.Field>) fieldList1);
        org.apache.avro.Schema schema6 = org.apache.avro.Schema.createRecord((java.util.List<org.apache.avro.Schema.Field>) fieldList1);
        org.apache.avro.Schema schema7 = org.apache.avro.Schema.createRecord((java.util.List<org.apache.avro.Schema.Field>) fieldList1);
        java.lang.String str8 = schema7.getName();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.avro.Schema schema9 = schema7.getElementType();
            org.junit.Assert.fail("Expected exception of type org.apache.avro.AvroRuntimeException; message: Not an array: {\"type\":\"record\",\"fields\":[]}");
        } catch (org.apache.avro.AvroRuntimeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(fieldArray0);
        org.junit.Assert.assertArrayEquals(fieldArray0, new org.apache.avro.Schema.Field[] {});
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(schema3);
        org.junit.Assert.assertNotNull(schema4);
        org.junit.Assert.assertNotNull(schema5);
        org.junit.Assert.assertNotNull(schema6);
        org.junit.Assert.assertNotNull(schema7);
        org.junit.Assert.assertNull(str8);
    }

    @Test
    public void test1194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SchemaM3Random300Test2.test1194");
        org.apache.avro.Schema schema2 = org.apache.avro.Schema.parse("[].union", false);
        // The following exception was thrown during execution in test generation
        try {
            schema2.addProp("{\"type\":\"array\",\"items\":\"null\"}", "{\"type\":\"map\",\"values\":\"double\"}");
            org.junit.Assert.fail("Expected exception of type org.apache.avro.AvroRuntimeException; message: Can't set properties on a union: []");
        } catch (org.apache.avro.AvroRuntimeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(schema2);
    }

    @Test
    public void test1195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SchemaM3Random300Test2.test1195");
        org.apache.avro.Schema.Type type0 = org.apache.avro.Schema.Type.INT;
        org.apache.avro.Schema schema1 = org.apache.avro.Schema.create(type0);
        org.apache.avro.Schema schema2 = org.apache.avro.Schema.createArray(schema1);
        org.apache.avro.Schema schema3 = org.apache.avro.Schema.createMap(schema2);
        schema3.addProp("", "union type:UNION pos:-1");
        org.junit.Assert.assertTrue("'" + type0 + "' != '" + org.apache.avro.Schema.Type.INT + "'", type0.equals(org.apache.avro.Schema.Type.INT));
        org.junit.Assert.assertNotNull(schema1);
        org.junit.Assert.assertNotNull(schema2);
        org.junit.Assert.assertNotNull(schema3);
    }

    @Test
    public void test1196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SchemaM3Random300Test2.test1196");
        org.apache.avro.Schema.Names names1 = new org.apache.avro.Schema.Names("{\r\n  \"type\" : \"array\",\r\n  \"items\" : {\r\n    \"type\" : \"map\",\r\n    \"values\" : [ ]\r\n  }\r\n}");
        names1.clear();
    }

    @Test
    public void test1197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SchemaM3Random300Test2.test1197");
        org.apache.avro.Schema.LockableArrayList<java.lang.String> strList4 = new org.apache.avro.Schema.LockableArrayList<java.lang.String>((int) '#');
        org.apache.avro.Schema.LockableArrayList<java.lang.String> strList5 = new org.apache.avro.Schema.LockableArrayList<java.lang.String>((java.util.List<java.lang.String>) strList4);
        org.apache.avro.Schema.LockableArrayList<java.lang.String> strList6 = new org.apache.avro.Schema.LockableArrayList<java.lang.String>((java.util.List<java.lang.String>) strList4);
        org.apache.avro.Schema.LockableArrayList<java.lang.String> strList7 = new org.apache.avro.Schema.LockableArrayList<java.lang.String>((java.util.List<java.lang.String>) strList6);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.avro.Schema schema8 = org.apache.avro.Schema.createEnum("union type:UNION pos:-1", "[ ]", "double", (java.util.List<java.lang.String>) strList7);
            org.junit.Assert.fail("Expected exception of type org.apache.avro.SchemaParseException; message: Illegal character in: union type:UNION pos:-1");
        } catch (org.apache.avro.SchemaParseException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SchemaM3Random300Test2.test1198");
        org.apache.avro.Schema.Names names1 = new org.apache.avro.Schema.Names("union type:UNION pos:-1");
        names1.space("map");
        org.apache.avro.Schema schema6 = org.apache.avro.Schema.parse("[].union", false);
        boolean boolean7 = names1.containsKey((java.lang.Object) schema6);
        java.lang.String str8 = schema6.getFullName();
        org.junit.Assert.assertNotNull(schema6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "union" + "'", str8, "union");
    }

    @Test
    public void test1199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SchemaM3Random300Test2.test1199");
        org.apache.avro.Schema.LockableArrayList<java.lang.String> strList3 = new org.apache.avro.Schema.LockableArrayList<java.lang.String>();
        org.apache.avro.Schema.LockableArrayList<java.lang.String> strList4 = new org.apache.avro.Schema.LockableArrayList<java.lang.String>((java.util.List<java.lang.String>) strList3);
        org.apache.avro.Schema schema5 = org.apache.avro.Schema.createEnum("[].union", "{}", "[].union", (java.util.List<java.lang.String>) strList4);
        org.apache.avro.Schema schema6 = org.apache.avro.Schema.createMap(schema5);
        // The following exception was thrown during execution in test generation
        try {
            int int7 = schema5.getFixedSize();
            org.junit.Assert.fail("Expected exception of type org.apache.avro.AvroRuntimeException; message: Not fixed: {\"type\":\"enum\",\"name\":\"union\",\"namespace\":\"[]\",\"doc\":\"{}\",\"symbols\":[]}");
        } catch (org.apache.avro.AvroRuntimeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(schema5);
        org.junit.Assert.assertNotNull(schema6);
    }

    @Test
    public void test1200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SchemaM3Random300Test2.test1200");
        org.apache.avro.Schema schema2 = org.apache.avro.Schema.parse("{\r\n  \"type\" : \"fixed\",\r\n  \"name\" : \"union\",\r\n  \"namespace\" : \"[]\",\r\n  \"doc\" : \"[ ]\",\r\n  \"size\" : 0\r\n}", true);
        org.apache.avro.Schema schema3 = org.apache.avro.Schema.createArray(schema2);
        org.junit.Assert.assertNotNull(schema2);
        org.junit.Assert.assertNotNull(schema3);
    }

    @Test
    public void test1201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SchemaM3Random300Test2.test1201");
        org.codehaus.jackson.JsonNode jsonNode1 = org.apache.avro.Schema.parseJson("{\r\n  \"type\" : \"map\",\r\n  \"values\" : {\r\n    \"type\" : \"record\",\r\n    \"fields\" : [ ]\r\n  }\r\n}");
        org.junit.Assert.assertNotNull(jsonNode1);
    }

    @Test
    public void test1202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SchemaM3Random300Test2.test1202");
        org.apache.avro.Schema.Parser parser0 = new org.apache.avro.Schema.Parser();
        java.util.Map<java.lang.String, org.apache.avro.Schema> strMap1 = parser0.getTypes();
        java.util.Map<java.lang.String, org.apache.avro.Schema> strMap2 = parser0.getTypes();
        org.apache.avro.Schema.Parser parser3 = new org.apache.avro.Schema.Parser();
        org.apache.avro.Schema.Parser parser5 = parser3.setValidate(true);
        java.util.Map<java.lang.String, org.apache.avro.Schema> strMap6 = parser3.getTypes();
        org.apache.avro.Schema.Parser parser7 = parser0.addTypes(strMap6);
        org.apache.avro.Schema.Parser parser9 = parser7.setValidate(true);
        org.apache.avro.Schema.Parser parser11 = parser7.setValidate(true);
        org.apache.avro.Schema.Parser parser13 = parser7.setValidate(true);
        org.apache.avro.Schema.Parser parser15 = parser7.setValidate(true);
        org.apache.avro.Schema.Parser parser17 = parser15.setValidate(false);
        org.apache.avro.Schema.Parser parser19 = parser17.setValidate(false);
        java.io.File file20 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.avro.Schema schema21 = parser19.parse(file20);
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
        org.junit.Assert.assertNotNull(parser11);
        org.junit.Assert.assertNotNull(parser13);
        org.junit.Assert.assertNotNull(parser15);
        org.junit.Assert.assertNotNull(parser17);
        org.junit.Assert.assertNotNull(parser19);
    }

    @Test
    public void test1203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SchemaM3Random300Test2.test1203");
        org.apache.avro.Schema.Field[] fieldArray0 = new org.apache.avro.Schema.Field[] {};
        java.util.ArrayList<org.apache.avro.Schema.Field> fieldList1 = new java.util.ArrayList<org.apache.avro.Schema.Field>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<org.apache.avro.Schema.Field>) fieldList1, fieldArray0);
        org.apache.avro.Schema schema3 = org.apache.avro.Schema.createRecord((java.util.List<org.apache.avro.Schema.Field>) fieldList1);
        org.apache.avro.Schema schema4 = org.apache.avro.Schema.createRecord((java.util.List<org.apache.avro.Schema.Field>) fieldList1);
        org.apache.avro.Schema schema5 = org.apache.avro.Schema.createArray(schema4);
        java.lang.String str6 = schema5.getDoc();
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<org.apache.avro.Schema> schemaList7 = schema5.getTypes();
            org.junit.Assert.fail("Expected exception of type org.apache.avro.AvroRuntimeException; message: Not a union: {\"type\":\"array\",\"items\":{\"type\":\"record\",\"fields\":[]}}");
        } catch (org.apache.avro.AvroRuntimeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(fieldArray0);
        org.junit.Assert.assertArrayEquals(fieldArray0, new org.apache.avro.Schema.Field[] {});
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(schema3);
        org.junit.Assert.assertNotNull(schema4);
        org.junit.Assert.assertNotNull(schema5);
        org.junit.Assert.assertNull(str6);
    }

    @Test
    public void test1204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SchemaM3Random300Test2.test1204");
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
        org.apache.avro.Schema schema12 = org.apache.avro.Schema.createMap(schema8);
        org.apache.avro.Schema schema15 = org.apache.avro.Schema.parse("[].union", false);
        boolean boolean16 = schema12.equals((java.lang.Object) false);
        java.lang.String str18 = schema12.getProp("array");
        org.apache.avro.Schema.Type type19 = schema12.getType();
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
        org.junit.Assert.assertNotNull(schema15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertTrue("'" + type19 + "' != '" + org.apache.avro.Schema.Type.MAP + "'", type19.equals(org.apache.avro.Schema.Type.MAP));
    }

    @Test
    public void test1205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SchemaM3Random300Test2.test1205");
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
        org.apache.avro.Schema schema22 = org.apache.avro.Schema.createArray(schema8);
        java.lang.String str23 = schema8.getName();
        // The following exception was thrown during execution in test generation
        try {
            schema8.addAlias("union type:UNION pos:-1");
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
        org.junit.Assert.assertNotNull(schema22);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "union" + "'", str23, "union");
    }

    @Test
    public void test1206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SchemaM3Random300Test2.test1206");
        org.apache.avro.Schema.LockableArrayList<org.apache.avro.Schema.Field> fieldList1 = new org.apache.avro.Schema.LockableArrayList<org.apache.avro.Schema.Field>(0);
        org.apache.avro.Schema schema2 = org.apache.avro.Schema.createRecord((java.util.List<org.apache.avro.Schema.Field>) fieldList1);
        java.lang.String str3 = schema2.toString();
        org.junit.Assert.assertNotNull(schema2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "{\"type\":\"record\",\"fields\":[]}" + "'", str3, "{\"type\":\"record\",\"fields\":[]}");
    }

    @Test
    public void test1207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SchemaM3Random300Test2.test1207");
        org.codehaus.jackson.JsonNode jsonNode1 = org.apache.avro.Schema.parseJson("{\"type\":\"double\",\"float\":\"{\\\"type\\\":\\\"array\\\",\\\"items\\\":[]}\"}");
        org.junit.Assert.assertNotNull(jsonNode1);
    }

    @Test
    public void test1208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SchemaM3Random300Test2.test1208");
        org.apache.avro.Schema schema2 = org.apache.avro.Schema.parse("{\"type\":\"map\",\"values\":[],\"\\\"double\\\"\":\"{\\\"type\\\":\\\"array\\\",\\\"items\\\":\\\"int\\\"}\"}", false);
        // The following exception was thrown during execution in test generation
        try {
            java.util.Set<java.lang.String> strSet3 = schema2.getAliases();
            org.junit.Assert.fail("Expected exception of type org.apache.avro.AvroRuntimeException; message: Not a named type: {\"type\":\"map\",\"values\":[],\"\\\"double\\\"\":\"{\\\"type\\\":\\\"array\\\",\\\"items\\\":\\\"int\\\"}\"}");
        } catch (org.apache.avro.AvroRuntimeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(schema2);
    }

    @Test
    public void test1209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SchemaM3Random300Test2.test1209");
        org.apache.avro.Schema schema1 = org.apache.avro.Schema.parse("{\"type\":\"array\",\"items\":{\"type\":\"map\",\"values\":[]}}");
        java.lang.String str2 = schema1.getFullName();
        java.lang.String str4 = schema1.toString(false);
        org.junit.Assert.assertNotNull(schema1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "array" + "'", str2, "array");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "{\"type\":\"array\",\"items\":{\"type\":\"map\",\"values\":[]}}" + "'", str4, "{\"type\":\"array\",\"items\":{\"type\":\"map\",\"values\":[]}}");
    }

    @Test
    public void test1210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SchemaM3Random300Test2.test1210");
        org.apache.avro.Schema.Parser parser0 = new org.apache.avro.Schema.Parser();
        java.util.Map<java.lang.String, org.apache.avro.Schema> strMap1 = parser0.getTypes();
        java.util.Map<java.lang.String, org.apache.avro.Schema> strMap2 = parser0.getTypes();
        org.apache.avro.Schema.Parser parser3 = new org.apache.avro.Schema.Parser();
        java.util.Map<java.lang.String, org.apache.avro.Schema> strMap4 = parser3.getTypes();
        org.apache.avro.Schema.Parser parser5 = parser0.addTypes(strMap4);
        org.apache.avro.Schema schema7 = parser0.parse("{\r\n  \"type\" : \"map\",\r\n  \"values\" : [ ]\r\n}");
        org.apache.avro.Schema.Parser parser9 = parser0.setValidate(true);
        boolean boolean10 = parser0.getValidate();
        java.util.Map<java.lang.String, org.apache.avro.Schema> strMap11 = parser0.getTypes();
        org.junit.Assert.assertNotNull(strMap1);
        org.junit.Assert.assertNotNull(strMap2);
        org.junit.Assert.assertNotNull(strMap4);
        org.junit.Assert.assertNotNull(parser5);
        org.junit.Assert.assertNotNull(schema7);
        org.junit.Assert.assertNotNull(parser9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(strMap11);
    }

    @Test
    public void test1211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SchemaM3Random300Test2.test1211");
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
        java.lang.String str15 = schema14.getDoc();
        org.apache.avro.Schema schema16 = org.apache.avro.Schema.createArray(schema14);
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
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNotNull(schema16);
    }

    @Test
    public void test1212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SchemaM3Random300Test2.test1212");
        org.apache.avro.Schema schema2 = org.apache.avro.Schema.parse("{\"type\":\"array\",\"items\":\"null\"}", false);
        org.junit.Assert.assertNotNull(schema2);
    }

    @Test
    public void test1213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SchemaM3Random300Test2.test1213");
        org.apache.avro.Schema.Parser parser0 = new org.apache.avro.Schema.Parser();
        java.util.Map<java.lang.String, org.apache.avro.Schema> strMap1 = parser0.getTypes();
        org.apache.avro.Schema.Parser parser2 = new org.apache.avro.Schema.Parser();
        org.apache.avro.Schema.Parser parser4 = parser2.setValidate(true);
        java.util.Map<java.lang.String, org.apache.avro.Schema> strMap5 = parser2.getTypes();
        org.apache.avro.Schema.Parser parser6 = parser0.addTypes(strMap5);
        boolean boolean7 = parser0.getValidate();
        org.apache.avro.Schema schema9 = parser0.parse("{\"type\":\"array\",\"items\":[]}");
        java.lang.String str10 = schema9.getFullName();
        org.junit.Assert.assertNotNull(strMap1);
        org.junit.Assert.assertNotNull(parser4);
        org.junit.Assert.assertNotNull(strMap5);
        org.junit.Assert.assertNotNull(parser6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(schema9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "array" + "'", str10, "array");
    }

    @Test
    public void test1214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SchemaM3Random300Test2.test1214");
        org.apache.avro.Schema.Type type0 = org.apache.avro.Schema.Type.NULL;
        org.apache.avro.Schema schema1 = org.apache.avro.Schema.create(type0);
        org.apache.avro.Schema schema2 = org.apache.avro.Schema.create(type0);
        java.lang.String str4 = schema2.toString(true);
        org.apache.avro.Schema schema5 = org.apache.avro.Schema.createArray(schema2);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.avro.Schema.Field field7 = schema2.getField("{null={\"type\":\"map\",\"values\":[]}}");
            org.junit.Assert.fail("Expected exception of type org.apache.avro.AvroRuntimeException; message: Not a record: \"null\"");
        } catch (org.apache.avro.AvroRuntimeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + type0 + "' != '" + org.apache.avro.Schema.Type.NULL + "'", type0.equals(org.apache.avro.Schema.Type.NULL));
        org.junit.Assert.assertNotNull(schema1);
        org.junit.Assert.assertNotNull(schema2);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "\"null\"" + "'", str4, "\"null\"");
        org.junit.Assert.assertNotNull(schema5);
    }

    @Test
    public void test1215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SchemaM3Random300Test2.test1215");
        org.apache.avro.Schema schema4 = org.apache.avro.Schema.createFixed("union", "[ ]", "[]", 0);
        org.apache.avro.Schema.Type type5 = org.apache.avro.Schema.Type.INT;
        org.apache.avro.Schema schema6 = org.apache.avro.Schema.create(type5);
        org.apache.avro.Schema schema7 = org.apache.avro.Schema.createArray(schema6);
        org.apache.avro.Schema schema8 = org.apache.avro.Schema.applyAliases(schema4, schema7);
        java.util.Set<java.lang.String> strSet9 = schema4.getAliases();
        org.junit.Assert.assertNotNull(schema4);
        org.junit.Assert.assertTrue("'" + type5 + "' != '" + org.apache.avro.Schema.Type.INT + "'", type5.equals(org.apache.avro.Schema.Type.INT));
        org.junit.Assert.assertNotNull(schema6);
        org.junit.Assert.assertNotNull(schema7);
        org.junit.Assert.assertNotNull(schema8);
        org.junit.Assert.assertNotNull(strSet9);
    }

    @Test
    public void test1216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SchemaM3Random300Test2.test1216");
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
        org.apache.avro.Schema schema22 = org.apache.avro.Schema.createArray(schema8);
        java.lang.String str23 = schema8.getName();
        // The following exception was thrown during execution in test generation
        try {
            int int24 = schema8.getFixedSize();
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
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "union" + "'", str21, "union");
        org.junit.Assert.assertNotNull(schema22);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "union" + "'", str23, "union");
    }

    @Test
    public void test1217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SchemaM3Random300Test2.test1217");
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
        java.util.List<org.apache.avro.Schema> schemaList41 = schema28.getTypes();
        java.lang.String str42 = schema28.getDoc();
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
        org.junit.Assert.assertNotNull(schemaList41);
        org.junit.Assert.assertNull(str42);
    }

    @Test
    public void test1218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SchemaM3Random300Test2.test1218");
        org.apache.avro.Schema.LockableArrayList<org.codehaus.jackson.JsonFactory> jsonFactoryList1 = new org.apache.avro.Schema.LockableArrayList<org.codehaus.jackson.JsonFactory>((int) (byte) 0);
    }

    @Test
    public void test1219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SchemaM3Random300Test2.test1219");
        org.apache.avro.Schema.LockableArrayList<java.lang.String> strList4 = new org.apache.avro.Schema.LockableArrayList<java.lang.String>((int) '#');
        org.apache.avro.Schema.LockableArrayList<java.lang.String> strList5 = new org.apache.avro.Schema.LockableArrayList<java.lang.String>((java.util.List<java.lang.String>) strList4);
        org.apache.avro.Schema.LockableArrayList<java.lang.String> strList6 = new org.apache.avro.Schema.LockableArrayList<java.lang.String>((java.util.List<java.lang.String>) strList4);
        org.apache.avro.Schema.LockableArrayList<java.lang.String> strList7 = new org.apache.avro.Schema.LockableArrayList<java.lang.String>((java.util.List<java.lang.String>) strList6);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.avro.Schema schema8 = org.apache.avro.Schema.createEnum("{\"type\":\"map\",\"values\":{\"type\":\"array\",\"items\":{\"type\":\"map\",\"values\":[]}}}", "{\"type\":\"map\",\"values\":\"double\"}", "{null={\"type\":\"record\",\"fields\":[]}}", (java.util.List<java.lang.String>) strList6);
            org.junit.Assert.fail("Expected exception of type org.apache.avro.SchemaParseException; message: Illegal initial character: {\"type\":\"map\",\"values\":{\"type\":\"array\",\"items\":{\"type\":\"map\",\"values\":[]}}}");
        } catch (org.apache.avro.SchemaParseException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SchemaM3Random300Test2.test1220");
        org.apache.avro.Schema.Names names1 = new org.apache.avro.Schema.Names("{null={\"type\":\"fixed\",\"name\":\"union\",\"namespace\":\"[]\",\"doc\":\"[ ]\",\"size\":0}}");
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
        boolean boolean13 = schema10.equals((java.lang.Object) "hi!");
        java.lang.String str14 = schema10.getDoc();
        org.apache.avro.Schema schema15 = org.apache.avro.Schema.createArray(schema10);
        java.lang.String str16 = schema10.toString();
        org.apache.avro.Schema schema17 = org.apache.avro.Schema.createArray(schema10);
        java.util.List<org.apache.avro.Schema> schemaList18 = schema10.getTypes();
        org.apache.avro.Schema schema19 = org.apache.avro.Schema.createUnion(schemaList18);
        boolean boolean20 = names1.containsKey((java.lang.Object) schemaList18);
        org.apache.avro.Schema schema21 = org.apache.avro.Schema.createUnion(schemaList18);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str22 = schema21.getNamespace();
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
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNotNull(schema15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "[]" + "'", str16, "[]");
        org.junit.Assert.assertNotNull(schema17);
        org.junit.Assert.assertNotNull(schemaList18);
        org.junit.Assert.assertNotNull(schema19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(schema21);
    }

    @Test
    public void test1221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SchemaM3Random300Test2.test1221");
        org.apache.avro.Schema.LockableArrayList<java.lang.String> strList10 = new org.apache.avro.Schema.LockableArrayList<java.lang.String>((int) (byte) 10);
        org.apache.avro.Schema schema11 = org.apache.avro.Schema.createEnum("[].union", "union type:UNION pos:-1", "union type:UNION pos:-1", (java.util.List<java.lang.String>) strList10);
        java.util.List<java.lang.String> strList12 = schema11.getEnumSymbols();
        org.apache.avro.Schema schema13 = org.apache.avro.Schema.createEnum("map", "\"null\"", "{}", strList12);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.avro.Schema schema14 = org.apache.avro.Schema.createEnum("{null={\"type\":\"record\",\"fields\":[]}}", "[ ]", "{\"type\":\"array\",\"items\":{\"type\":\"array\",\"items\":{\"type\":\"map\",\"values\":[]}}}", strList12);
            org.junit.Assert.fail("Expected exception of type org.apache.avro.SchemaParseException; message: Illegal initial character: {null={\"type\":\"record\",\"fields\":[]}}");
        } catch (org.apache.avro.SchemaParseException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(schema11);
        org.junit.Assert.assertNotNull(strList12);
        org.junit.Assert.assertNotNull(schema13);
    }

    @Test
    public void test1222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SchemaM3Random300Test2.test1222");
        org.apache.avro.Schema.Names names1 = new org.apache.avro.Schema.Names("{\r\n  \"type\" : \"map\",\r\n  \"values\" : {\r\n    \"type\" : \"enum\",\r\n    \"name\" : \"union\",\r\n    \"namespace\" : \"[]\",\r\n    \"doc\" : \"{}\",\r\n    \"symbols\" : [ ]\r\n  }\r\n}");
        org.apache.avro.Schema schema6 = org.apache.avro.Schema.createFixed("union", "[ ]", "[]", 0);
        java.util.Set<java.lang.String> strSet7 = schema6.getAliases();
        boolean boolean8 = names1.contains(schema6);
        org.junit.Assert.assertNotNull(schema6);
        org.junit.Assert.assertNotNull(strSet7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test1223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SchemaM3Random300Test2.test1223");
        org.apache.avro.Schema schema1 = org.apache.avro.Schema.parse("{\r\n  \"type\" : \"map\",\r\n  \"values\" : {\r\n    \"type\" : \"enum\",\r\n    \"name\" : \"union\",\r\n    \"namespace\" : \"[]\",\r\n    \"doc\" : \"{}\",\r\n    \"symbols\" : [ ]\r\n  }\r\n}");
        org.junit.Assert.assertNotNull(schema1);
    }

    @Test
    public void test1224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SchemaM3Random300Test2.test1224");
        org.apache.avro.Schema.Field[] fieldArray0 = new org.apache.avro.Schema.Field[] {};
        java.util.ArrayList<org.apache.avro.Schema.Field> fieldList1 = new java.util.ArrayList<org.apache.avro.Schema.Field>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<org.apache.avro.Schema.Field>) fieldList1, fieldArray0);
        org.apache.avro.Schema schema3 = org.apache.avro.Schema.createRecord((java.util.List<org.apache.avro.Schema.Field>) fieldList1);
        boolean boolean4 = schema3.isError();
        org.apache.avro.Schema schema5 = org.apache.avro.Schema.createArray(schema3);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.avro.Schema schema6 = schema3.getElementType();
            org.junit.Assert.fail("Expected exception of type org.apache.avro.AvroRuntimeException; message: Not an array: {\"type\":\"record\",\"fields\":[]}");
        } catch (org.apache.avro.AvroRuntimeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(fieldArray0);
        org.junit.Assert.assertArrayEquals(fieldArray0, new org.apache.avro.Schema.Field[] {});
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(schema3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(schema5);
    }

    @Test
    public void test1225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SchemaM3Random300Test2.test1225");
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
        org.apache.avro.Schema schema22 = org.apache.avro.Schema.createArray(schema8);
        java.lang.String str23 = schema8.getName();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.avro.Schema schema24 = schema8.getElementType();
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
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "union" + "'", str21, "union");
        org.junit.Assert.assertNotNull(schema22);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "union" + "'", str23, "union");
    }

    @Test
    public void test1226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SchemaM3Random300Test2.test1226");
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
        // The following exception was thrown during execution in test generation
        try {
            org.apache.avro.Schema.Field field24 = schema20.getField("{\r\n  \"type\" : \"array\",\r\n  \"items\" : {\r\n    \"type\" : \"map\",\r\n    \"values\" : [ ]\r\n  }\r\n}");
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
        org.junit.Assert.assertNull(str22);
    }

    @Test
    public void test1227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SchemaM3Random300Test2.test1227");
        org.apache.avro.Schema schema0 = null;
        org.apache.avro.Schema.Names names1 = new org.apache.avro.Schema.Names();
        names1.space("[ ]");
        java.lang.Object obj4 = names1.clone();
        org.apache.avro.Schema.Type type5 = org.apache.avro.Schema.Type.RECORD;
        boolean boolean6 = names1.containsKey((java.lang.Object) type5);
        org.apache.avro.Schema[] schemaArray7 = new org.apache.avro.Schema[] {};
        java.util.ArrayList<org.apache.avro.Schema> schemaList8 = new java.util.ArrayList<org.apache.avro.Schema>();
        boolean boolean9 = java.util.Collections.addAll((java.util.Collection<org.apache.avro.Schema>) schemaList8, schemaArray7);
        org.apache.avro.Schema schema10 = org.apache.avro.Schema.createUnion((java.util.List<org.apache.avro.Schema>) schemaList8);
        org.apache.avro.Schema[] schemaArray11 = new org.apache.avro.Schema[] {};
        java.util.ArrayList<org.apache.avro.Schema> schemaList12 = new java.util.ArrayList<org.apache.avro.Schema>();
        boolean boolean13 = java.util.Collections.addAll((java.util.Collection<org.apache.avro.Schema>) schemaList12, schemaArray11);
        org.apache.avro.Schema schema14 = org.apache.avro.Schema.createUnion((java.util.List<org.apache.avro.Schema>) schemaList12);
        org.apache.avro.Schema schema15 = org.apache.avro.Schema.applyAliases(schema10, schema14);
        org.apache.avro.Schema.Type type16 = schema14.getType();
        org.apache.avro.Schema schema17 = org.apache.avro.Schema.createMap(schema14);
        org.apache.avro.Schema.Names names18 = new org.apache.avro.Schema.Names();
        java.lang.String str19 = names18.space();
        names18.space("");
        boolean boolean22 = schema14.equals((java.lang.Object) "");
        java.lang.String str23 = schema14.getFullName();
        boolean boolean24 = names1.containsKey((java.lang.Object) schema14);
        org.apache.avro.Schema schema25 = org.apache.avro.Schema.applyAliases(schema0, schema14);
        org.junit.Assert.assertNotNull(obj4);
        org.junit.Assert.assertEquals(obj4.toString(), "{}");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj4), "{}");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj4), "{}");
        org.junit.Assert.assertTrue("'" + type5 + "' != '" + org.apache.avro.Schema.Type.RECORD + "'", type5.equals(org.apache.avro.Schema.Type.RECORD));
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(schemaArray7);
        org.junit.Assert.assertArrayEquals(schemaArray7, new org.apache.avro.Schema[] {});
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(schema10);
        org.junit.Assert.assertNotNull(schemaArray11);
        org.junit.Assert.assertArrayEquals(schemaArray11, new org.apache.avro.Schema[] {});
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(schema14);
        org.junit.Assert.assertNotNull(schema15);
        org.junit.Assert.assertTrue("'" + type16 + "' != '" + org.apache.avro.Schema.Type.UNION + "'", type16.equals(org.apache.avro.Schema.Type.UNION));
        org.junit.Assert.assertNotNull(schema17);
        org.junit.Assert.assertNull(str19);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "union" + "'", str23, "union");
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNull(schema25);
    }

    @Test
    public void test1228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SchemaM3Random300Test2.test1228");
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
        org.apache.avro.Schema.Type type15 = schema8.getType();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.avro.Schema schema16 = schema8.getValueType();
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
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "[ ]" + "'", str14, "[ ]");
        org.junit.Assert.assertTrue("'" + type15 + "' != '" + org.apache.avro.Schema.Type.UNION + "'", type15.equals(org.apache.avro.Schema.Type.UNION));
    }

    @Test
    public void test1229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SchemaM3Random300Test2.test1229");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.avro.Schema schema4 = org.apache.avro.Schema.createFixed("{\"type\":\"int\",\"union type:UNION pos:-1\":\"[ ]\"}", "{\r\n  \"type\" : \"map\",\r\n  \"values\" : {\r\n    \"type\" : \"map\",\r\n    \"values\" : [ ]\r\n  }\r\n}", "{\"type\":\"array\",\"items\":\"int\"}", (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type org.apache.avro.SchemaParseException; message: Illegal initial character: {\"type\":\"int\",\"union type:UNION pos:-1\":\"[ ]\"}");
        } catch (org.apache.avro.SchemaParseException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SchemaM3Random300Test2.test1230");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.avro.Schema schema4 = org.apache.avro.Schema.createFixed("{\r\n  \"type\" : \"record\",\r\n  \"fields\" : [ ],\r\n  \"{\\r\\n  \\\"type\\\" : \\\"fixed\\\",\\r\\n  \\\"name\\\" : \\\"union\\\",\\r\\n  \\\"namespace\\\" : \\\"[]\\\",\\r\\n  \\\"doc\\\" : \\\"[ ]\\\",\\r\\n  \\\"size\\\" : 0\\r\\n}\" : \"[ ]\"\r\n}", "{null={\"type\":\"map\",\"values\":{\"type\":\"array\",\"items\":{\"type\":\"map\",\"values\":[]}}}}", "{\"type\":\"fixed\",\"name\":\"union\",\"namespace\":\"[]\",\"doc\":\"[ ]\",\"size\":0,\"aliases\":[\"union\"]}", (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type org.apache.avro.SchemaParseException; message: Illegal initial character: {??  \"type\" : \"record\",??  \"fields\" : [ ],??  \"{\\r\\n  \\\"type\\\" : \\\"fixed\\\",\\r\\n  \\\"name\\\" : \\\"union\\\",\\r\\n  \\\"namespace\\\" : \\\"[]\\\",\\r\\n  \\\"doc\\\" : \\\"[ ]\\\",\\r\\n  \\\"size\\\" : 0\\r\\n}\" : \"[ ]\"??}");
        } catch (org.apache.avro.SchemaParseException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SchemaM3Random300Test2.test1231");
        org.apache.avro.Schema[] schemaArray0 = new org.apache.avro.Schema[] {};
        java.util.ArrayList<org.apache.avro.Schema> schemaList1 = new java.util.ArrayList<org.apache.avro.Schema>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<org.apache.avro.Schema>) schemaList1, schemaArray0);
        org.apache.avro.Schema schema3 = org.apache.avro.Schema.createUnion((java.util.List<org.apache.avro.Schema>) schemaList1);
        java.util.List<org.apache.avro.Schema> schemaList4 = schema3.getTypes();
        org.apache.avro.Schema schema5 = org.apache.avro.Schema.createMap(schema3);
        org.apache.avro.Schema schema8 = org.apache.avro.Schema.parse("{\r\n  \"type\" : \"array\",\r\n  \"items\" : {\r\n    \"type\" : \"map\",\r\n    \"values\" : [ ]\r\n  }\r\n}", true);
        boolean boolean9 = schema3.equals((java.lang.Object) true);
        java.lang.String str10 = schema3.getFullName();
        org.apache.avro.Schema schema11 = org.apache.avro.Schema.createArray(schema3);
        schema11.addProp("{\"type\":\"array\",\"items\":{\"type\":\"map\",\"values\":[]}}", "array");
        org.apache.avro.Schema schema15 = schema11.getElementType();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str16 = schema11.getNamespace();
            org.junit.Assert.fail("Expected exception of type org.apache.avro.AvroRuntimeException; message: Not a named type: {\"type\":\"array\",\"items\":[],\"{\\\"type\\\":\\\"array\\\",\\\"items\\\":{\\\"type\\\":\\\"map\\\",\\\"values\\\":[]}}\":\"array\"}");
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
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "union" + "'", str10, "union");
        org.junit.Assert.assertNotNull(schema11);
        org.junit.Assert.assertNotNull(schema15);
    }

    @Test
    public void test1232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SchemaM3Random300Test2.test1232");
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
        org.apache.avro.Schema schema21 = org.apache.avro.Schema.createMap(schema16);
        java.lang.String str22 = schema21.getDoc();
        java.lang.String str24 = schema21.toString(true);
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
        org.junit.Assert.assertNotNull(schema21);
        org.junit.Assert.assertNull(str22);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "{\r\n  \"type\" : \"map\",\r\n  \"values\" : [ ]\r\n}" + "'", str24, "{\r\n  \"type\" : \"map\",\r\n  \"values\" : [ ]\r\n}");
    }

    @Test
    public void test1233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SchemaM3Random300Test2.test1233");
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
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "[]" + "'", str14, "[]");
    }

    @Test
    public void test1234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SchemaM3Random300Test2.test1234");
        org.apache.avro.Schema.Type type0 = org.apache.avro.Schema.Type.INT;
        org.apache.avro.Schema schema1 = org.apache.avro.Schema.create(type0);
        org.apache.avro.Schema schema2 = org.apache.avro.Schema.createArray(schema1);
        org.apache.avro.Schema schema3 = org.apache.avro.Schema.createArray(schema1);
        // The following exception was thrown during execution in test generation
        try {
            schema1.addAlias("");
            org.junit.Assert.fail("Expected exception of type org.apache.avro.AvroRuntimeException; message: Not a named type: \"int\"");
        } catch (org.apache.avro.AvroRuntimeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + type0 + "' != '" + org.apache.avro.Schema.Type.INT + "'", type0.equals(org.apache.avro.Schema.Type.INT));
        org.junit.Assert.assertNotNull(schema1);
        org.junit.Assert.assertNotNull(schema2);
        org.junit.Assert.assertNotNull(schema3);
    }

    @Test
    public void test1235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SchemaM3Random300Test2.test1235");
        org.apache.avro.Schema.LockableArrayList<java.lang.Enum<org.apache.avro.Schema.Field.Order>> orderEnumList1 = new org.apache.avro.Schema.LockableArrayList<java.lang.Enum<org.apache.avro.Schema.Field.Order>>((int) (byte) 1);
    }

    @Test
    public void test1236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SchemaM3Random300Test2.test1236");
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
        java.lang.String str35 = schema8.getDoc();
        java.lang.String str37 = schema8.toString(true);
        // The following exception was thrown during execution in test generation
        try {
            java.util.Set<java.lang.String> strSet38 = schema8.getAliases();
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
        org.junit.Assert.assertNull(str35);
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "[ ]" + "'", str37, "[ ]");
    }

    @Test
    public void test1237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SchemaM3Random300Test2.test1237");
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
        java.lang.String str15 = schema14.getDoc();
        schema14.addProp("{\"type\":\"record\",\"fields\":[],\"{\\r\\n  \\\"type\\\" : \\\"fixed\\\",\\r\\n  \\\"name\\\" : \\\"union\\\",\\r\\n  \\\"namespace\\\" : \\\"[]\\\",\\r\\n  \\\"doc\\\" : \\\"[ ]\\\",\\r\\n  \\\"size\\\" : 0\\r\\n}\":\"[ ]\"}", "{\"type\":\"double\",\"float\":\"{\\\"type\\\":\\\"array\\\",\\\"items\\\":[]}\"}");
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
        org.junit.Assert.assertNull(str15);
    }

    @Test
    public void test1238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SchemaM3Random300Test2.test1238");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.avro.Schema schema4 = org.apache.avro.Schema.createRecord("{\"type\":\"array\",\"items\":{\"type\":\"map\",\"values\":[]}}", "{\r\n  \"type\" : \"record\",\r\n  \"fields\" : [ ]\r\n}", "{\"type\":\"fixed\",\"name\":\"union\",\"namespace\":\"[]\",\"doc\":\"union type:UNION pos:-1\",\"size\":100}", false);
            org.junit.Assert.fail("Expected exception of type org.apache.avro.SchemaParseException; message: Illegal initial character: {\"type\":\"array\",\"items\":{\"type\":\"map\",\"values\":[]}}");
        } catch (org.apache.avro.SchemaParseException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SchemaM3Random300Test2.test1239");
        org.apache.avro.Schema.Parser parser0 = new org.apache.avro.Schema.Parser();
        org.apache.avro.Schema.Parser parser2 = parser0.setValidate(true);
        org.apache.avro.Schema.Parser parser4 = parser0.setValidate(true);
        org.apache.avro.Schema.Parser parser6 = parser0.setValidate(true);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.avro.Schema schema8 = parser0.parse("{null=null}");
            org.junit.Assert.fail("Expected exception of type org.apache.avro.SchemaParseException; message: org.codehaus.jackson.JsonParseException: Unexpected character ('n' (code 110)): was expecting double-quote to start field name? at [Source: java.io.StringReader@5514ac7d; line: 1, column: 3]");
        } catch (org.apache.avro.SchemaParseException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(parser2);
        org.junit.Assert.assertNotNull(parser4);
        org.junit.Assert.assertNotNull(parser6);
    }

    @Test
    public void test1240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SchemaM3Random300Test2.test1240");
        org.apache.avro.Schema schema1 = org.apache.avro.Schema.parse("{\"type\":\"array\",\"items\":{\"type\":\"array\",\"items\":{\"type\":\"map\",\"values\":[]}}}");
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<java.lang.String> strList2 = schema1.getEnumSymbols();
            org.junit.Assert.fail("Expected exception of type org.apache.avro.AvroRuntimeException; message: Not an enum: {\"type\":\"array\",\"items\":{\"type\":\"array\",\"items\":{\"type\":\"map\",\"values\":[]}}}");
        } catch (org.apache.avro.AvroRuntimeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(schema1);
    }

    @Test
    public void test1241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SchemaM3Random300Test2.test1241");
        org.apache.avro.Schema.Field[] fieldArray0 = new org.apache.avro.Schema.Field[] {};
        java.util.ArrayList<org.apache.avro.Schema.Field> fieldList1 = new java.util.ArrayList<org.apache.avro.Schema.Field>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<org.apache.avro.Schema.Field>) fieldList1, fieldArray0);
        org.apache.avro.Schema schema3 = org.apache.avro.Schema.createRecord((java.util.List<org.apache.avro.Schema.Field>) fieldList1);
        org.apache.avro.Schema.Field field5 = schema3.getField("");
        org.apache.avro.Schema schema6 = org.apache.avro.Schema.createMap(schema3);
        java.lang.String str7 = schema3.getNamespace();
        schema3.addProp("{\"type\":\"array\",\"items\":[],\"union type:UNION pos:-1\":\"\"}", "{null={\"type\":\"map\",\"values\":[]}}");
        java.lang.String str12 = schema3.toString(true);
        org.junit.Assert.assertNotNull(fieldArray0);
        org.junit.Assert.assertArrayEquals(fieldArray0, new org.apache.avro.Schema.Field[] {});
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(schema3);
        org.junit.Assert.assertNull(field5);
        org.junit.Assert.assertNotNull(schema6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "{\r\n  \"type\" : \"record\",\r\n  \"fields\" : [ ],\r\n  \"{\\\"type\\\":\\\"array\\\",\\\"items\\\":[],\\\"union type:UNION pos:-1\\\":\\\"\\\"}\" : \"{null={\\\"type\\\":\\\"map\\\",\\\"values\\\":[]}}\"\r\n}" + "'", str12, "{\r\n  \"type\" : \"record\",\r\n  \"fields\" : [ ],\r\n  \"{\\\"type\\\":\\\"array\\\",\\\"items\\\":[],\\\"union type:UNION pos:-1\\\":\\\"\\\"}\" : \"{null={\\\"type\\\":\\\"map\\\",\\\"values\\\":[]}}\"\r\n}");
    }

    @Test
    public void test1242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SchemaM3Random300Test2.test1242");
        org.apache.avro.Schema.Parser parser0 = new org.apache.avro.Schema.Parser();
        java.util.Map<java.lang.String, org.apache.avro.Schema> strMap1 = parser0.getTypes();
        org.apache.avro.Schema.Parser parser2 = new org.apache.avro.Schema.Parser();
        org.apache.avro.Schema.Parser parser4 = parser2.setValidate(true);
        java.util.Map<java.lang.String, org.apache.avro.Schema> strMap5 = parser2.getTypes();
        org.apache.avro.Schema.Parser parser6 = parser0.addTypes(strMap5);
        boolean boolean7 = parser6.getValidate();
        org.apache.avro.Schema.Parser parser9 = parser6.setValidate(true);
        org.apache.avro.Schema.Parser parser11 = parser6.setValidate(false);
        org.junit.Assert.assertNotNull(strMap1);
        org.junit.Assert.assertNotNull(parser4);
        org.junit.Assert.assertNotNull(strMap5);
        org.junit.Assert.assertNotNull(parser6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(parser9);
        org.junit.Assert.assertNotNull(parser11);
    }

    @Test
    public void test1243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SchemaM3Random300Test2.test1243");
        org.apache.avro.Schema schema2 = org.apache.avro.Schema.parse("{\r\n  \"type\" : \"array\",\r\n  \"items\" : {\r\n    \"type\" : \"map\",\r\n    \"values\" : [ ]\r\n  }\r\n}", false);
        org.junit.Assert.assertNotNull(schema2);
    }

    @Test
    public void test1244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SchemaM3Random300Test2.test1244");
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
        boolean boolean26 = schema23.equals((java.lang.Object) "hi!");
        java.lang.String str27 = schema23.getDoc();
        org.apache.avro.Schema schema28 = org.apache.avro.Schema.createArray(schema23);
        java.lang.String str29 = schema23.toString();
        org.apache.avro.Schema schema30 = org.apache.avro.Schema.createArray(schema23);
        org.apache.avro.Schema schema31 = schema30.getElementType();
        org.apache.avro.Schema schema32 = org.apache.avro.Schema.applyAliases(schema14, schema31);
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
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNull(str27);
        org.junit.Assert.assertNotNull(schema28);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "[]" + "'", str29, "[]");
        org.junit.Assert.assertNotNull(schema30);
        org.junit.Assert.assertNotNull(schema31);
        org.junit.Assert.assertNotNull(schema32);
    }

    @Test
    public void test1245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SchemaM3Random300Test2.test1245");
        org.apache.avro.Schema.Parser parser0 = new org.apache.avro.Schema.Parser();
        java.util.Map<java.lang.String, org.apache.avro.Schema> strMap1 = parser0.getTypes();
        org.apache.avro.Schema.Parser parser2 = new org.apache.avro.Schema.Parser();
        org.apache.avro.Schema.Parser parser4 = parser2.setValidate(true);
        java.util.Map<java.lang.String, org.apache.avro.Schema> strMap5 = parser2.getTypes();
        org.apache.avro.Schema.Parser parser6 = parser0.addTypes(strMap5);
        boolean boolean7 = parser0.getValidate();
        org.apache.avro.Schema.Parser parser8 = new org.apache.avro.Schema.Parser();
        java.util.Map<java.lang.String, org.apache.avro.Schema> strMap9 = parser8.getTypes();
        java.util.Map<java.lang.String, org.apache.avro.Schema> strMap10 = parser8.getTypes();
        org.apache.avro.Schema.Parser parser11 = new org.apache.avro.Schema.Parser();
        org.apache.avro.Schema.Parser parser13 = parser11.setValidate(true);
        java.util.Map<java.lang.String, org.apache.avro.Schema> strMap14 = parser11.getTypes();
        org.apache.avro.Schema.Parser parser15 = parser8.addTypes(strMap14);
        org.apache.avro.Schema.Parser parser16 = parser0.addTypes(strMap14);
        java.io.File file17 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.avro.Schema schema18 = parser0.parse(file17);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strMap1);
        org.junit.Assert.assertNotNull(parser4);
        org.junit.Assert.assertNotNull(strMap5);
        org.junit.Assert.assertNotNull(parser6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(strMap9);
        org.junit.Assert.assertNotNull(strMap10);
        org.junit.Assert.assertNotNull(parser13);
        org.junit.Assert.assertNotNull(strMap14);
        org.junit.Assert.assertNotNull(parser15);
        org.junit.Assert.assertNotNull(parser16);
    }

    @Test
    public void test1246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SchemaM3Random300Test2.test1246");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.avro.Schema schema4 = org.apache.avro.Schema.createFixed("{\"type\":\"array\",\"items\":{\"type\":\"record\",\"fields\":[]}}", "[]", "", (int) 'a');
            org.junit.Assert.fail("Expected exception of type org.apache.avro.SchemaParseException; message: Illegal initial character: {\"type\":\"array\",\"items\":{\"type\":\"record\",\"fields\":[]}}");
        } catch (org.apache.avro.SchemaParseException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SchemaM3Random300Test2.test1247");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.avro.Schema schema4 = org.apache.avro.Schema.createRecord("union type:MAP pos:-1", "{\"type\":\"fixed\",\"name\":\"union\",\"namespace\":\"{}\",\"doc\":\"hi!\",\"size\":1}", "{\"type\":\"map\",\"values\":\"double\"}", true);
            org.junit.Assert.fail("Expected exception of type org.apache.avro.SchemaParseException; message: Illegal character in: union type:MAP pos:-1");
        } catch (org.apache.avro.SchemaParseException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SchemaM3Random300Test2.test1248");
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
        org.apache.avro.Schema.Type type20 = schema8.getType();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.avro.Schema schema21 = org.apache.avro.Schema.create(type20);
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
        org.junit.Assert.assertTrue("'" + type20 + "' != '" + org.apache.avro.Schema.Type.UNION + "'", type20.equals(org.apache.avro.Schema.Type.UNION));
    }

    @Test
    public void test1249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SchemaM3Random300Test2.test1249");
        org.apache.avro.Schema schema4 = org.apache.avro.Schema.createFixed("union", "", "union type:UNION pos:-1", 10);
        java.lang.String str5 = schema4.getNamespace();
        java.lang.String str6 = schema4.toString();
        org.junit.Assert.assertNotNull(schema4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "union type:UNION pos:-1" + "'", str5, "union type:UNION pos:-1");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "{\"type\":\"fixed\",\"name\":\"union\",\"namespace\":\"union type:UNION pos:-1\",\"doc\":\"\",\"size\":10}" + "'", str6, "{\"type\":\"fixed\",\"name\":\"union\",\"namespace\":\"union type:UNION pos:-1\",\"doc\":\"\",\"size\":10}");
    }

    @Test
    public void test1250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SchemaM3Random300Test2.test1250");
        org.apache.avro.Schema schema1 = org.apache.avro.Schema.parse("{\"type\":\"array\",\"items\":[]}");
        java.lang.String str2 = schema1.getName();
        java.lang.String str4 = schema1.toString(true);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean5 = schema1.isError();
            org.junit.Assert.fail("Expected exception of type org.apache.avro.AvroRuntimeException; message: Not a record: {\"type\":\"array\",\"items\":[]}");
        } catch (org.apache.avro.AvroRuntimeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(schema1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "array" + "'", str2, "array");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "{\r\n  \"type\" : \"array\",\r\n  \"items\" : [ ]\r\n}" + "'", str4, "{\r\n  \"type\" : \"array\",\r\n  \"items\" : [ ]\r\n}");
    }

    @Test
    public void test1251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SchemaM3Random300Test2.test1251");
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
        org.apache.avro.Schema schema17 = parser0.parse("{\r\n  \"type\" : \"array\",\r\n  \"items\" : {\r\n    \"type\" : \"map\",\r\n    \"values\" : [ ]\r\n  }\r\n}");
        java.lang.String str19 = schema17.toString(false);
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
        org.junit.Assert.assertNotNull(schema17);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "{\"type\":\"array\",\"items\":{\"type\":\"map\",\"values\":[]}}" + "'", str19, "{\"type\":\"array\",\"items\":{\"type\":\"map\",\"values\":[]}}");
    }

    @Test
    public void test1252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SchemaM3Random300Test2.test1252");
        org.apache.avro.Schema.Names names1 = new org.apache.avro.Schema.Names("{\r\n  \"type\" : \"array\",\r\n  \"items\" : [ ]\r\n}");
        names1.space("map");
    }

    @Test
    public void test1253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SchemaM3Random300Test2.test1253");
        org.apache.avro.Schema.Parser parser0 = new org.apache.avro.Schema.Parser();
        java.util.Map<java.lang.String, org.apache.avro.Schema> strMap1 = parser0.getTypes();
        java.util.Map<java.lang.String, org.apache.avro.Schema> strMap2 = parser0.getTypes();
        org.apache.avro.Schema.Parser parser3 = new org.apache.avro.Schema.Parser();
        org.apache.avro.Schema.Parser parser5 = parser3.setValidate(true);
        java.util.Map<java.lang.String, org.apache.avro.Schema> strMap6 = parser3.getTypes();
        org.apache.avro.Schema.Parser parser7 = parser0.addTypes(strMap6);
        org.apache.avro.Schema schema9 = parser7.parse("{\"type\":\"map\",\"values\":[]}");
        org.apache.avro.Schema.Parser parser11 = parser7.setValidate(false);
        org.apache.avro.Schema.Parser parser13 = parser7.setValidate(true);
        boolean boolean14 = parser7.getValidate();
        org.junit.Assert.assertNotNull(strMap1);
        org.junit.Assert.assertNotNull(strMap2);
        org.junit.Assert.assertNotNull(parser5);
        org.junit.Assert.assertNotNull(strMap6);
        org.junit.Assert.assertNotNull(parser7);
        org.junit.Assert.assertNotNull(schema9);
        org.junit.Assert.assertNotNull(parser11);
        org.junit.Assert.assertNotNull(parser13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    }

    @Test
    public void test1254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SchemaM3Random300Test2.test1254");
        org.apache.avro.Schema.Field[] fieldArray0 = new org.apache.avro.Schema.Field[] {};
        java.util.ArrayList<org.apache.avro.Schema.Field> fieldList1 = new java.util.ArrayList<org.apache.avro.Schema.Field>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<org.apache.avro.Schema.Field>) fieldList1, fieldArray0);
        org.apache.avro.Schema schema3 = org.apache.avro.Schema.createRecord((java.util.List<org.apache.avro.Schema.Field>) fieldList1);
        org.apache.avro.Schema schema4 = org.apache.avro.Schema.createRecord((java.util.List<org.apache.avro.Schema.Field>) fieldList1);
        org.apache.avro.Schema schema5 = org.apache.avro.Schema.createArray(schema4);
        java.lang.String str6 = schema5.getDoc();
        java.lang.String str8 = schema5.getProp("{\"type\":\"record\",\"fields\":[]}");
        java.lang.String str9 = schema5.getDoc();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str10 = schema5.getNamespace();
            org.junit.Assert.fail("Expected exception of type org.apache.avro.AvroRuntimeException; message: Not a named type: {\"type\":\"array\",\"items\":{\"type\":\"record\",\"fields\":[]}}");
        } catch (org.apache.avro.AvroRuntimeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(fieldArray0);
        org.junit.Assert.assertArrayEquals(fieldArray0, new org.apache.avro.Schema.Field[] {});
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(schema3);
        org.junit.Assert.assertNotNull(schema4);
        org.junit.Assert.assertNotNull(schema5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str9);
    }

    @Test
    public void test1255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SchemaM3Random300Test2.test1255");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.avro.Schema schema4 = org.apache.avro.Schema.createFixed("{\"type\":\"array\",\"items\":{\"type\":\"map\",\"values\":[]},\"union type:MAP pos:-1\":\"{\\\"type\\\":\\\"array\\\",\\\"items\\\":{\\\"type\\\":\\\"map\\\",\\\"values\\\":[]}}\"}", "{\r\n  \"type\" : \"map\",\r\n  \"values\" : {\r\n    \"type\" : \"map\",\r\n    \"values\" : [ ]\r\n  }\r\n}", "int", (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type org.apache.avro.SchemaParseException; message: Illegal initial character: {\"type\":\"array\",\"items\":{\"type\":\"map\",\"values\":[]},\"union type:MAP pos:-1\":\"{\\\"type\\\":\\\"array\\\",\\\"items\\\":{\\\"type\\\":\\\"map\\\",\\\"values\\\":[]}}\"}");
        } catch (org.apache.avro.SchemaParseException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SchemaM3Random300Test2.test1256");
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
        java.lang.String str16 = schema8.toString(false);
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
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "[]" + "'", str16, "[]");
    }

    @Test
    public void test1257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SchemaM3Random300Test2.test1257");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.avro.Schema schema4 = org.apache.avro.Schema.createRecord("{\"type\":\"record\",\"fields\":[],\"{\\r\\n  \\\"type\\\" : \\\"fixed\\\",\\r\\n  \\\"name\\\" : \\\"union\\\",\\r\\n  \\\"namespace\\\" : \\\"[]\\\",\\r\\n  \\\"doc\\\" : \\\"[ ]\\\",\\r\\n  \\\"size\\\" : 0\\r\\n}\":\"[ ]\"}", "", "array", true);
            org.junit.Assert.fail("Expected exception of type org.apache.avro.SchemaParseException; message: Illegal initial character: {\"type\":\"record\",\"fields\":[],\"{\\r\\n  \\\"type\\\" : \\\"fixed\\\",\\r\\n  \\\"name\\\" : \\\"union\\\",\\r\\n  \\\"namespace\\\" : \\\"[]\\\",\\r\\n  \\\"doc\\\" : \\\"[ ]\\\",\\r\\n  \\\"size\\\" : 0\\r\\n}\":\"[ ]\"}");
        } catch (org.apache.avro.SchemaParseException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SchemaM3Random300Test2.test1258");
        org.apache.avro.Schema.LockableArrayList<org.apache.avro.Schema.Parser> parserList1 = new org.apache.avro.Schema.LockableArrayList<org.apache.avro.Schema.Parser>(10);
    }

    @Test
    public void test1259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SchemaM3Random300Test2.test1259");
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
        org.apache.avro.Schema.Parser parser18 = parser6.setValidate(false);
        org.apache.avro.Schema.Parser parser19 = new org.apache.avro.Schema.Parser();
        java.util.Map<java.lang.String, org.apache.avro.Schema> strMap20 = parser19.getTypes();
        org.apache.avro.Schema.Parser parser21 = new org.apache.avro.Schema.Parser();
        org.apache.avro.Schema.Parser parser23 = parser21.setValidate(true);
        java.util.Map<java.lang.String, org.apache.avro.Schema> strMap24 = parser21.getTypes();
        org.apache.avro.Schema.Parser parser25 = parser19.addTypes(strMap24);
        org.apache.avro.Schema.Parser parser26 = parser6.addTypes(strMap24);
        boolean boolean27 = parser26.getValidate();
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
        org.junit.Assert.assertNotNull(strMap20);
        org.junit.Assert.assertNotNull(parser23);
        org.junit.Assert.assertNotNull(strMap24);
        org.junit.Assert.assertNotNull(parser25);
        org.junit.Assert.assertNotNull(parser26);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
    }

    @Test
    public void test1260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SchemaM3Random300Test2.test1260");
        org.apache.avro.Schema.Parser parser0 = new org.apache.avro.Schema.Parser();
        java.util.Map<java.lang.String, org.apache.avro.Schema> strMap1 = parser0.getTypes();
        java.util.Map<java.lang.String, org.apache.avro.Schema> strMap2 = parser0.getTypes();
        org.apache.avro.Schema.Parser parser3 = new org.apache.avro.Schema.Parser();
        org.apache.avro.Schema.Parser parser5 = parser3.setValidate(true);
        java.util.Map<java.lang.String, org.apache.avro.Schema> strMap6 = parser3.getTypes();
        org.apache.avro.Schema.Parser parser7 = parser0.addTypes(strMap6);
        java.util.Map<java.lang.String, org.apache.avro.Schema> strMap8 = parser0.getTypes();
        org.apache.avro.Schema.Parser parser10 = parser0.setValidate(false);
        org.apache.avro.Schema.Parser parser12 = parser0.setValidate(false);
        org.apache.avro.Schema schema14 = parser12.parse("[].union");
        boolean boolean15 = parser12.getValidate();
        org.junit.Assert.assertNotNull(strMap1);
        org.junit.Assert.assertNotNull(strMap2);
        org.junit.Assert.assertNotNull(parser5);
        org.junit.Assert.assertNotNull(strMap6);
        org.junit.Assert.assertNotNull(parser7);
        org.junit.Assert.assertNotNull(strMap8);
        org.junit.Assert.assertNotNull(parser10);
        org.junit.Assert.assertNotNull(parser12);
        org.junit.Assert.assertNotNull(schema14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test1261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SchemaM3Random300Test2.test1261");
        org.codehaus.jackson.JsonNode jsonNode1 = org.apache.avro.Schema.parseJson("{\"type\":\"array\",\"items\":{\"type\":\"record\",\"fields\":[]}}");
        org.junit.Assert.assertNotNull(jsonNode1);
    }

    @Test
    public void test1262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SchemaM3Random300Test2.test1262");
        org.apache.avro.Schema.LockableArrayList<java.lang.String> strList4 = new org.apache.avro.Schema.LockableArrayList<java.lang.String>((int) '4');
        org.apache.avro.Schema.LockableArrayList<java.lang.String> strList5 = new org.apache.avro.Schema.LockableArrayList<java.lang.String>((java.util.List<java.lang.String>) strList4);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.avro.Schema schema6 = org.apache.avro.Schema.createEnum("{\"type\":\"map\",\"values\":{\"type\":\"enum\",\"name\":\"union\",\"namespace\":\"[]\",\"doc\":\"{}\",\"symbols\":[]}}", "{\"type\":\"map\",\"values\":[]}", "{\"type\":\"fixed\",\"name\":\"union\",\"namespace\":\"union type:UNION pos:-1\",\"doc\":\"\",\"size\":10}", (java.util.List<java.lang.String>) strList4);
            org.junit.Assert.fail("Expected exception of type org.apache.avro.SchemaParseException; message: Illegal initial character: {\"type\":\"map\",\"values\":{\"type\":\"enum\",\"name\":\"union\",\"namespace\":\"[]\",\"doc\":\"{}\",\"symbols\":[]}}");
        } catch (org.apache.avro.SchemaParseException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SchemaM3Random300Test2.test1263");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.avro.Schema schema4 = org.apache.avro.Schema.createFixed("{\"type\":\"fixed\",\"name\":\"union\",\"namespace\":\"[]\",\"doc\":\"[ ]\",\"size\":0}", "union type:MAP pos:-1", "union type:UNION pos:-1", (int) '#');
            org.junit.Assert.fail("Expected exception of type org.apache.avro.SchemaParseException; message: Illegal initial character: {\"type\":\"fixed\",\"name\":\"union\",\"namespace\":\"[]\",\"doc\":\"[ ]\",\"size\":0}");
        } catch (org.apache.avro.SchemaParseException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SchemaM3Random300Test2.test1264");
        org.apache.avro.Schema.Names names1 = new org.apache.avro.Schema.Names("{\"type\":\"array\",\"items\":{\"type\":\"record\",\"fields\":[]}}");
    }

    @Test
    public void test1265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SchemaM3Random300Test2.test1265");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.avro.Schema schema4 = org.apache.avro.Schema.createRecord("{\r\n  \"type\" : \"array\",\r\n  \"items\" : {\r\n    \"type\" : \"map\",\r\n    \"values\" : [ ]\r\n  }\r\n}", "{}", "{\r\n  \"type\" : \"map\",\r\n  \"values\" : {\r\n    \"type\" : \"record\",\r\n    \"fields\" : [ ]\r\n  }\r\n}", false);
            org.junit.Assert.fail("Expected exception of type org.apache.avro.SchemaParseException; message: Illegal initial character: {??  \"type\" : \"array\",??  \"items\" : {??    \"type\" : \"map\",??    \"values\" : [ ]??  }??}");
        } catch (org.apache.avro.SchemaParseException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SchemaM3Random300Test2.test1266");
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
            java.lang.String str22 = schema8.getNamespace();
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
    }

    @Test
    public void test1267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SchemaM3Random300Test2.test1267");
        org.apache.avro.Schema.Parser parser0 = new org.apache.avro.Schema.Parser();
        java.util.Map<java.lang.String, org.apache.avro.Schema> strMap1 = parser0.getTypes();
        java.util.Map<java.lang.String, org.apache.avro.Schema> strMap2 = parser0.getTypes();
        org.apache.avro.Schema.Parser parser3 = new org.apache.avro.Schema.Parser();
        java.util.Map<java.lang.String, org.apache.avro.Schema> strMap4 = parser3.getTypes();
        org.apache.avro.Schema.Parser parser5 = parser0.addTypes(strMap4);
        org.apache.avro.Schema.Parser parser7 = parser5.setValidate(true);
        java.io.File file8 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.avro.Schema schema9 = parser5.parse(file8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strMap1);
        org.junit.Assert.assertNotNull(strMap2);
        org.junit.Assert.assertNotNull(strMap4);
        org.junit.Assert.assertNotNull(parser5);
        org.junit.Assert.assertNotNull(parser7);
    }

    @Test
    public void test1268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SchemaM3Random300Test2.test1268");
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
        java.util.Map<java.lang.String, org.apache.avro.Schema> strMap13 = parser12.getTypes();
        org.apache.avro.Schema.Parser parser14 = new org.apache.avro.Schema.Parser();
        java.util.Map<java.lang.String, org.apache.avro.Schema> strMap15 = parser14.getTypes();
        org.apache.avro.Schema.Parser parser16 = new org.apache.avro.Schema.Parser();
        org.apache.avro.Schema.Parser parser18 = parser16.setValidate(true);
        java.util.Map<java.lang.String, org.apache.avro.Schema> strMap19 = parser16.getTypes();
        org.apache.avro.Schema.Parser parser20 = parser14.addTypes(strMap19);
        boolean boolean21 = parser20.getValidate();
        org.apache.avro.Schema.Parser parser22 = new org.apache.avro.Schema.Parser();
        org.apache.avro.Schema.Parser parser24 = parser22.setValidate(true);
        org.apache.avro.Schema.Parser parser26 = parser22.setValidate(true);
        org.apache.avro.Schema.Parser parser28 = parser22.setValidate(true);
        org.apache.avro.Schema.Parser parser29 = new org.apache.avro.Schema.Parser();
        org.apache.avro.Schema.Parser parser31 = parser29.setValidate(true);
        java.util.Map<java.lang.String, org.apache.avro.Schema> strMap32 = parser29.getTypes();
        org.apache.avro.Schema.Parser parser34 = parser29.setValidate(true);
        org.apache.avro.Schema.Parser parser36 = parser29.setValidate(true);
        java.util.Map<java.lang.String, org.apache.avro.Schema> strMap37 = parser29.getTypes();
        org.apache.avro.Schema.Parser parser38 = parser28.addTypes(strMap37);
        org.apache.avro.Schema.Parser parser39 = parser20.addTypes(strMap37);
        org.apache.avro.Schema.Parser parser40 = parser12.addTypes(strMap37);
        java.io.InputStream inputStream41 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.avro.Schema schema42 = parser40.parse(inputStream41);
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
        org.junit.Assert.assertNotNull(strMap13);
        org.junit.Assert.assertNotNull(strMap15);
        org.junit.Assert.assertNotNull(parser18);
        org.junit.Assert.assertNotNull(strMap19);
        org.junit.Assert.assertNotNull(parser20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertNotNull(parser24);
        org.junit.Assert.assertNotNull(parser26);
        org.junit.Assert.assertNotNull(parser28);
        org.junit.Assert.assertNotNull(parser31);
        org.junit.Assert.assertNotNull(strMap32);
        org.junit.Assert.assertNotNull(parser34);
        org.junit.Assert.assertNotNull(parser36);
        org.junit.Assert.assertNotNull(strMap37);
        org.junit.Assert.assertNotNull(parser38);
        org.junit.Assert.assertNotNull(parser39);
        org.junit.Assert.assertNotNull(parser40);
    }

    @Test
    public void test1269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SchemaM3Random300Test2.test1269");
        java.util.List<org.codehaus.jackson.JsonFactory> jsonFactoryList0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.avro.Schema.LockableArrayList<org.codehaus.jackson.JsonFactory> jsonFactoryList1 = new org.apache.avro.Schema.LockableArrayList<org.codehaus.jackson.JsonFactory>(jsonFactoryList0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SchemaM3Random300Test2.test1270");
        org.apache.avro.Schema schema2 = org.apache.avro.Schema.parse("{\"type\":\"map\",\"values\":[]}", true);
        org.apache.avro.Schema schema3 = schema2.getValueType();
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<java.lang.String> strList4 = schema3.getEnumSymbols();
            org.junit.Assert.fail("Expected exception of type org.apache.avro.AvroRuntimeException; message: Not an enum: []");
        } catch (org.apache.avro.AvroRuntimeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(schema2);
        org.junit.Assert.assertNotNull(schema3);
    }

    @Test
    public void test1271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SchemaM3Random300Test2.test1271");
        org.apache.avro.Schema.Parser parser0 = new org.apache.avro.Schema.Parser();
        org.apache.avro.Schema.Parser parser2 = parser0.setValidate(true);
        java.util.Map<java.lang.String, org.apache.avro.Schema> strMap3 = parser0.getTypes();
        org.apache.avro.Schema.Parser parser5 = parser0.setValidate(true);
        org.apache.avro.Schema.Parser parser7 = parser0.setValidate(true);
        java.util.Map<java.lang.String, org.apache.avro.Schema> strMap8 = parser0.getTypes();
        org.apache.avro.Schema.Parser parser10 = parser0.setValidate(false);
        org.apache.avro.Schema.Parser parser11 = new org.apache.avro.Schema.Parser();
        java.util.Map<java.lang.String, org.apache.avro.Schema> strMap12 = parser11.getTypes();
        java.util.Map<java.lang.String, org.apache.avro.Schema> strMap13 = parser11.getTypes();
        org.apache.avro.Schema.Parser parser14 = new org.apache.avro.Schema.Parser();
        org.apache.avro.Schema.Parser parser16 = parser14.setValidate(true);
        java.util.Map<java.lang.String, org.apache.avro.Schema> strMap17 = parser14.getTypes();
        org.apache.avro.Schema.Parser parser18 = parser11.addTypes(strMap17);
        java.util.Map<java.lang.String, org.apache.avro.Schema> strMap19 = parser18.getTypes();
        org.apache.avro.Schema.Parser parser20 = parser10.addTypes(strMap19);
        org.junit.Assert.assertNotNull(parser2);
        org.junit.Assert.assertNotNull(strMap3);
        org.junit.Assert.assertNotNull(parser5);
        org.junit.Assert.assertNotNull(parser7);
        org.junit.Assert.assertNotNull(strMap8);
        org.junit.Assert.assertNotNull(parser10);
        org.junit.Assert.assertNotNull(strMap12);
        org.junit.Assert.assertNotNull(strMap13);
        org.junit.Assert.assertNotNull(parser16);
        org.junit.Assert.assertNotNull(strMap17);
        org.junit.Assert.assertNotNull(parser18);
        org.junit.Assert.assertNotNull(strMap19);
        org.junit.Assert.assertNotNull(parser20);
    }

    @Test
    public void test1272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SchemaM3Random300Test2.test1272");
        org.apache.avro.Schema schema1 = org.apache.avro.Schema.parse("{\"type\":\"map\",\"values\":[],\"\\\"double\\\"\":\"{\\\"type\\\":\\\"array\\\",\\\"items\\\":\\\"int\\\"}\"}");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.avro.Schema schema2 = schema1.getElementType();
            org.junit.Assert.fail("Expected exception of type org.apache.avro.AvroRuntimeException; message: Not an array: {\"type\":\"map\",\"values\":[],\"\\\"double\\\"\":\"{\\\"type\\\":\\\"array\\\",\\\"items\\\":\\\"int\\\"}\"}");
        } catch (org.apache.avro.AvroRuntimeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(schema1);
    }

    @Test
    public void test1273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SchemaM3Random300Test2.test1273");
        org.apache.avro.Schema.Names names0 = new org.apache.avro.Schema.Names();
        names0.space("[ ]");
        java.lang.Object obj3 = names0.clone();
        org.apache.avro.Schema.Names names4 = new org.apache.avro.Schema.Names();
        names4.space("[ ]");
        org.apache.avro.Schema schema7 = names0.remove((java.lang.Object) names4);
        boolean boolean8 = names4.isEmpty();
        java.lang.String str9 = names4.space();
        java.lang.Object obj10 = null;
        boolean boolean11 = names4.containsKey(obj10);
        org.apache.avro.Schema.Parser parser12 = new org.apache.avro.Schema.Parser();
        org.apache.avro.Schema.Parser parser14 = parser12.setValidate(true);
        org.apache.avro.Schema.Parser parser16 = parser12.setValidate(true);
        java.util.Map<java.lang.String, org.apache.avro.Schema> strMap17 = parser16.getTypes();
        org.apache.avro.Schema.Parser parser19 = parser16.setValidate(false);
        boolean boolean20 = parser16.getValidate();
        boolean boolean21 = names4.containsKey((java.lang.Object) boolean20);
        org.junit.Assert.assertNotNull(obj3);
        org.junit.Assert.assertEquals(obj3.toString(), "{}");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj3), "{}");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj3), "{}");
        org.junit.Assert.assertNull(schema7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "[ ]" + "'", str9, "[ ]");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(parser14);
        org.junit.Assert.assertNotNull(parser16);
        org.junit.Assert.assertNotNull(strMap17);
        org.junit.Assert.assertNotNull(parser19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
    }

    @Test
    public void test1274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SchemaM3Random300Test2.test1274");
        org.apache.avro.Schema.Parser parser0 = new org.apache.avro.Schema.Parser();
        java.util.Map<java.lang.String, org.apache.avro.Schema> strMap1 = parser0.getTypes();
        java.util.Map<java.lang.String, org.apache.avro.Schema> strMap2 = parser0.getTypes();
        org.apache.avro.Schema.Parser parser3 = new org.apache.avro.Schema.Parser();
        java.util.Map<java.lang.String, org.apache.avro.Schema> strMap4 = parser3.getTypes();
        org.apache.avro.Schema.Parser parser5 = parser0.addTypes(strMap4);
        org.apache.avro.Schema schema7 = parser0.parse("{\r\n  \"type\" : \"map\",\r\n  \"values\" : [ ]\r\n}");
        // The following exception was thrown during execution in test generation
        try {
            schema7.addAlias("{\"type\":\"array\",\"items\":\"null\"}");
            org.junit.Assert.fail("Expected exception of type org.apache.avro.AvroRuntimeException; message: Not a named type: {\"type\":\"map\",\"values\":[]}");
        } catch (org.apache.avro.AvroRuntimeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strMap1);
        org.junit.Assert.assertNotNull(strMap2);
        org.junit.Assert.assertNotNull(strMap4);
        org.junit.Assert.assertNotNull(parser5);
        org.junit.Assert.assertNotNull(schema7);
    }

    @Test
    public void test1275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SchemaM3Random300Test2.test1275");
        org.apache.avro.Schema.Parser parser0 = new org.apache.avro.Schema.Parser();
        java.util.Map<java.lang.String, org.apache.avro.Schema> strMap1 = parser0.getTypes();
        org.apache.avro.Schema.Parser parser2 = new org.apache.avro.Schema.Parser();
        org.apache.avro.Schema.Parser parser4 = parser2.setValidate(true);
        java.util.Map<java.lang.String, org.apache.avro.Schema> strMap5 = parser2.getTypes();
        org.apache.avro.Schema.Parser parser6 = parser0.addTypes(strMap5);
        boolean boolean7 = parser6.getValidate();
        org.apache.avro.Schema schema9 = parser6.parse("[].union");
        org.junit.Assert.assertNotNull(strMap1);
        org.junit.Assert.assertNotNull(parser4);
        org.junit.Assert.assertNotNull(strMap5);
        org.junit.Assert.assertNotNull(parser6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(schema9);
    }

    @Test
    public void test1276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SchemaM3Random300Test2.test1276");
        java.lang.String[] strArray19 = new java.lang.String[] { "{\"type\":\"array\",\"items\":{\"type\":\"map\",\"values\":[]}}", "union type:MAP pos:-1", "{\"type\":\"array\",\"items\":{\"type\":\"map\",\"values\":[]}}", "{}", "{\r\n  \"type\" : \"map\",\r\n  \"values\" : {\r\n    \"type\" : \"map\",\r\n    \"values\" : [ ]\r\n  }\r\n}", "double", "{\r\n  \"type\" : \"map\",\r\n  \"values\" : [ ]\r\n}", "{\"type\":\"map\",\"values\":[]}", "{\"type\":\"array\",\"items\":[]}", "{\"type\":\"map\",\"values\":[]}", "{}", "union", "{\r\n  \"type\" : \"record\",\r\n  \"fields\" : [ ]\r\n}", "[].union", "{\r\n  \"type\" : \"map\",\r\n  \"values\" : [ ]\r\n}", "{\"type\":\"fixed\",\"name\":\"union\",\"namespace\":\"[]\",\"doc\":\"[ ]\",\"size\":0}" };
        java.util.ArrayList<java.lang.String> strList20 = new java.util.ArrayList<java.lang.String>();
        boolean boolean21 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList20, strArray19);
        org.apache.avro.Schema.LockableArrayList<java.lang.String> strList22 = new org.apache.avro.Schema.LockableArrayList<java.lang.String>((java.util.List<java.lang.String>) strList20);
        org.apache.avro.Schema.LockableArrayList<java.lang.String> strList23 = new org.apache.avro.Schema.LockableArrayList<java.lang.String>((java.util.List<java.lang.String>) strList22);
        org.apache.avro.Schema.LockableArrayList<java.lang.String> strList24 = new org.apache.avro.Schema.LockableArrayList<java.lang.String>((java.util.List<java.lang.String>) strList23);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.avro.Schema schema25 = org.apache.avro.Schema.createEnum("{\"type\":\"fixed\",\"name\":\"union\",\"namespace\":\"[]\",\"doc\":\"{\\r\\n  \\\"type\\\" : \\\"map\\\",\\r\\n  \\\"values\\\" : [ ]\\r\\n}\",\"size\":10}", "{\r\n  \"type\" : \"fixed\",\r\n  \"name\" : \"union\",\r\n  \"namespace\" : \"{}\",\r\n  \"doc\" : \"hi!\",\r\n  \"size\" : 1\r\n}", "[ ]", (java.util.List<java.lang.String>) strList23);
            org.junit.Assert.fail("Expected exception of type org.apache.avro.SchemaParseException; message: Illegal initial character: {\"type\":\"fixed\",\"name\":\"union\",\"namespace\":\"[]\",\"doc\":\"{\\r\\n  \\\"type\\\" : \\\"map\\\",\\r\\n  \\\"values\\\" : [ ]\\r\\n}\",\"size\":10}");
        } catch (org.apache.avro.SchemaParseException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray19);
        org.junit.Assert.assertArrayEquals(strArray19, new java.lang.String[] { "{\"type\":\"array\",\"items\":{\"type\":\"map\",\"values\":[]}}", "union type:MAP pos:-1", "{\"type\":\"array\",\"items\":{\"type\":\"map\",\"values\":[]}}", "{}", "{\r\n  \"type\" : \"map\",\r\n  \"values\" : {\r\n    \"type\" : \"map\",\r\n    \"values\" : [ ]\r\n  }\r\n}", "double", "{\r\n  \"type\" : \"map\",\r\n  \"values\" : [ ]\r\n}", "{\"type\":\"map\",\"values\":[]}", "{\"type\":\"array\",\"items\":[]}", "{\"type\":\"map\",\"values\":[]}", "{}", "union", "{\r\n  \"type\" : \"record\",\r\n  \"fields\" : [ ]\r\n}", "[].union", "{\r\n  \"type\" : \"map\",\r\n  \"values\" : [ ]\r\n}", "{\"type\":\"fixed\",\"name\":\"union\",\"namespace\":\"[]\",\"doc\":\"[ ]\",\"size\":0}" });
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
    }

    @Test
    public void test1277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SchemaM3Random300Test2.test1277");
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
        schema13.addProp("union type:UNION pos:-1", "");
        java.lang.String str17 = schema13.toString();
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<org.apache.avro.Schema> schemaList18 = schema13.getTypes();
            org.junit.Assert.fail("Expected exception of type org.apache.avro.AvroRuntimeException; message: Not a union: {\"type\":\"array\",\"items\":[],\"union type:UNION pos:-1\":\"\"}");
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
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "{\"type\":\"array\",\"items\":[],\"union type:UNION pos:-1\":\"\"}" + "'", str17, "{\"type\":\"array\",\"items\":[],\"union type:UNION pos:-1\":\"\"}");
    }

    @Test
    public void test1278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SchemaM3Random300Test2.test1278");
        java.lang.String[] strArray4 = new java.lang.String[] { "" };
        java.util.ArrayList<java.lang.String> strList5 = new java.util.ArrayList<java.lang.String>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList5, strArray4);
        org.apache.avro.Schema.LockableArrayList<java.lang.String> strList7 = new org.apache.avro.Schema.LockableArrayList<java.lang.String>((java.util.List<java.lang.String>) strList5);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.avro.Schema schema8 = org.apache.avro.Schema.createEnum("union type:MAP pos:-1", "{\"type\":\"map\",\"values\":{\"type\":\"enum\",\"name\":\"union\",\"namespace\":\"[]\",\"doc\":\"{}\",\"symbols\":[]}}", "{\"type\":\"map\",\"values\":{\"type\":\"record\",\"fields\":[]}}", (java.util.List<java.lang.String>) strList5);
            org.junit.Assert.fail("Expected exception of type org.apache.avro.SchemaParseException; message: Illegal character in: union type:MAP pos:-1");
        } catch (org.apache.avro.SchemaParseException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertArrayEquals(strArray4, new java.lang.String[] { "" });
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test1279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SchemaM3Random300Test2.test1279");
        org.apache.avro.Schema schema2 = org.apache.avro.Schema.parse("{\"type\":\"array\",\"items\":\"int\"}", false);
        org.junit.Assert.assertNotNull(schema2);
    }

    @Test
    public void test1280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SchemaM3Random300Test2.test1280");
        org.apache.avro.Schema.Type type0 = org.apache.avro.Schema.Type.STRING;
        org.apache.avro.Schema schema1 = org.apache.avro.Schema.create(type0);
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<org.apache.avro.Schema> schemaList2 = schema1.getTypes();
            org.junit.Assert.fail("Expected exception of type org.apache.avro.AvroRuntimeException; message: Not a union: \"string\"");
        } catch (org.apache.avro.AvroRuntimeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + type0 + "' != '" + org.apache.avro.Schema.Type.STRING + "'", type0.equals(org.apache.avro.Schema.Type.STRING));
        org.junit.Assert.assertNotNull(schema1);
    }

    @Test
    public void test1281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SchemaM3Random300Test2.test1281");
        org.apache.avro.Schema.Type type0 = org.apache.avro.Schema.Type.INT;
        org.apache.avro.Schema schema1 = org.apache.avro.Schema.create(type0);
        org.apache.avro.Schema schema2 = org.apache.avro.Schema.createArray(schema1);
        org.apache.avro.Schema schema3 = org.apache.avro.Schema.createMap(schema2);
        org.apache.avro.Schema schema4 = schema2.getElementType();
        org.apache.avro.Schema schema5 = org.apache.avro.Schema.createArray(schema4);
        org.apache.avro.Schema schema6 = org.apache.avro.Schema.createMap(schema4);
        org.junit.Assert.assertTrue("'" + type0 + "' != '" + org.apache.avro.Schema.Type.INT + "'", type0.equals(org.apache.avro.Schema.Type.INT));
        org.junit.Assert.assertNotNull(schema1);
        org.junit.Assert.assertNotNull(schema2);
        org.junit.Assert.assertNotNull(schema3);
        org.junit.Assert.assertNotNull(schema4);
        org.junit.Assert.assertNotNull(schema5);
        org.junit.Assert.assertNotNull(schema6);
    }

    @Test
    public void test1282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SchemaM3Random300Test2.test1282");
        org.codehaus.jackson.JsonNode jsonNode1 = org.apache.avro.Schema.parseJson("{\r\n  \"type\" : \"array\",\r\n  \"items\" : \"int\"\r\n}");
        org.junit.Assert.assertNotNull(jsonNode1);
    }

    @Test
    public void test1283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SchemaM3Random300Test2.test1283");
        org.apache.avro.Schema.LockableArrayList<java.lang.String> strList4 = new org.apache.avro.Schema.LockableArrayList<java.lang.String>(10);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.avro.Schema schema5 = org.apache.avro.Schema.createEnum("{null={\"type\":\"map\",\"values\":[]}}", "{\"type\":\"record\",\"fields\":[]}", "{\r\n  \"type\" : \"array\",\r\n  \"items\" : \"int\"\r\n}", (java.util.List<java.lang.String>) strList4);
            org.junit.Assert.fail("Expected exception of type org.apache.avro.SchemaParseException; message: Illegal initial character: {null={\"type\":\"map\",\"values\":[]}}");
        } catch (org.apache.avro.SchemaParseException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SchemaM3Random300Test2.test1284");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.avro.Schema schema4 = org.apache.avro.Schema.createRecord("", "", "{\r\n  \"type\" : \"array\",\r\n  \"items\" : {\r\n    \"type\" : \"map\",\r\n    \"values\" : [ ]\r\n  }\r\n}", true);
            org.junit.Assert.fail("Expected exception of type org.apache.avro.SchemaParseException; message: Empty name");
        } catch (org.apache.avro.SchemaParseException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SchemaM3Random300Test2.test1285");
        org.apache.avro.Schema.LockableArrayList<java.lang.Cloneable> cloneableList0 = new org.apache.avro.Schema.LockableArrayList<java.lang.Cloneable>();
    }

    @Test
    public void test1286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SchemaM3Random300Test2.test1286");
        org.apache.avro.Schema.LockableArrayList<org.apache.avro.Schema.Field.Order> orderList1 = new org.apache.avro.Schema.LockableArrayList<org.apache.avro.Schema.Field.Order>((int) '#');
    }

    @Test
    public void test1287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SchemaM3Random300Test2.test1287");
        org.apache.avro.Schema schema2 = org.apache.avro.Schema.parse("{\r\n  \"type\" : \"array\",\r\n  \"items\" : [ ]\r\n}", false);
        org.junit.Assert.assertNotNull(schema2);
    }

    @Test
    public void test1288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SchemaM3Random300Test2.test1288");
        org.apache.avro.Schema.Parser parser0 = new org.apache.avro.Schema.Parser();
        java.util.Map<java.lang.String, org.apache.avro.Schema> strMap1 = parser0.getTypes();
        java.util.Map<java.lang.String, org.apache.avro.Schema> strMap2 = parser0.getTypes();
        org.apache.avro.Schema.Parser parser3 = new org.apache.avro.Schema.Parser();
        java.util.Map<java.lang.String, org.apache.avro.Schema> strMap4 = parser3.getTypes();
        org.apache.avro.Schema.Parser parser5 = parser0.addTypes(strMap4);
        org.apache.avro.Schema schema7 = parser0.parse("{\r\n  \"type\" : \"map\",\r\n  \"values\" : [ ]\r\n}");
        org.apache.avro.Schema.Parser parser9 = parser0.setValidate(true);
        boolean boolean10 = parser0.getValidate();
        org.apache.avro.Schema.Parser parser12 = parser0.setValidate(false);
        org.apache.avro.Schema.Parser parser13 = new org.apache.avro.Schema.Parser();
        java.util.Map<java.lang.String, org.apache.avro.Schema> strMap14 = parser13.getTypes();
        org.apache.avro.Schema.Parser parser15 = parser12.addTypes(strMap14);
        org.apache.avro.Schema.Parser parser17 = parser15.setValidate(false);
        org.junit.Assert.assertNotNull(strMap1);
        org.junit.Assert.assertNotNull(strMap2);
        org.junit.Assert.assertNotNull(strMap4);
        org.junit.Assert.assertNotNull(parser5);
        org.junit.Assert.assertNotNull(schema7);
        org.junit.Assert.assertNotNull(parser9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(parser12);
        org.junit.Assert.assertNotNull(strMap14);
        org.junit.Assert.assertNotNull(parser15);
        org.junit.Assert.assertNotNull(parser17);
    }

    @Test
    public void test1289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SchemaM3Random300Test2.test1289");
        org.apache.avro.Schema.Parser parser0 = new org.apache.avro.Schema.Parser();
        java.util.Map<java.lang.String, org.apache.avro.Schema> strMap1 = parser0.getTypes();
        java.util.Map<java.lang.String, org.apache.avro.Schema> strMap2 = parser0.getTypes();
        org.apache.avro.Schema.Parser parser3 = new org.apache.avro.Schema.Parser();
        org.apache.avro.Schema.Parser parser5 = parser3.setValidate(true);
        java.util.Map<java.lang.String, org.apache.avro.Schema> strMap6 = parser3.getTypes();
        org.apache.avro.Schema.Parser parser7 = parser0.addTypes(strMap6);
        java.util.Map<java.lang.String, org.apache.avro.Schema> strMap8 = parser0.getTypes();
        org.apache.avro.Schema.Parser parser10 = parser0.setValidate(false);
        org.apache.avro.Schema.Parser parser12 = parser10.setValidate(true);
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
        org.junit.Assert.assertNotNull(strMap8);
        org.junit.Assert.assertNotNull(parser10);
        org.junit.Assert.assertNotNull(parser12);
    }

    @Test
    public void test1290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SchemaM3Random300Test2.test1290");
        org.apache.avro.Schema.Field[] fieldArray0 = new org.apache.avro.Schema.Field[] {};
        java.util.ArrayList<org.apache.avro.Schema.Field> fieldList1 = new java.util.ArrayList<org.apache.avro.Schema.Field>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<org.apache.avro.Schema.Field>) fieldList1, fieldArray0);
        org.apache.avro.Schema schema3 = org.apache.avro.Schema.createRecord((java.util.List<org.apache.avro.Schema.Field>) fieldList1);
        org.apache.avro.Schema schema4 = org.apache.avro.Schema.createRecord((java.util.List<org.apache.avro.Schema.Field>) fieldList1);
        org.apache.avro.Schema schema5 = org.apache.avro.Schema.createRecord((java.util.List<org.apache.avro.Schema.Field>) fieldList1);
        org.apache.avro.Schema schema6 = org.apache.avro.Schema.createRecord((java.util.List<org.apache.avro.Schema.Field>) fieldList1);
        org.apache.avro.Schema.Field field8 = schema6.getField("map");
        java.lang.String str10 = schema6.getProp("{}");
        java.lang.String str11 = schema6.toString();
        java.lang.String str12 = schema6.getName();
        java.lang.String str14 = schema6.getProp("{\"type\":\"fixed\",\"name\":\"union\",\"namespace\":\"union type:UNION pos:-1\",\"doc\":\"\",\"size\":10}");
        org.junit.Assert.assertNotNull(fieldArray0);
        org.junit.Assert.assertArrayEquals(fieldArray0, new org.apache.avro.Schema.Field[] {});
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(schema3);
        org.junit.Assert.assertNotNull(schema4);
        org.junit.Assert.assertNotNull(schema5);
        org.junit.Assert.assertNotNull(schema6);
        org.junit.Assert.assertNull(field8);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "{\"type\":\"record\",\"fields\":[]}" + "'", str11, "{\"type\":\"record\",\"fields\":[]}");
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(str14);
    }

    @Test
    public void test1291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SchemaM3Random300Test2.test1291");
        org.apache.avro.Schema.Type type0 = org.apache.avro.Schema.Type.STRING;
        org.apache.avro.Schema schema1 = org.apache.avro.Schema.create(type0);
        org.apache.avro.Schema schema2 = org.apache.avro.Schema.create(type0);
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<org.apache.avro.Schema> schemaList3 = schema2.getTypes();
            org.junit.Assert.fail("Expected exception of type org.apache.avro.AvroRuntimeException; message: Not a union: \"string\"");
        } catch (org.apache.avro.AvroRuntimeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + type0 + "' != '" + org.apache.avro.Schema.Type.STRING + "'", type0.equals(org.apache.avro.Schema.Type.STRING));
        org.junit.Assert.assertNotNull(schema1);
        org.junit.Assert.assertNotNull(schema2);
    }

    @Test
    public void test1292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SchemaM3Random300Test2.test1292");
        org.apache.avro.Schema.LockableArrayList<java.lang.String> strList4 = new org.apache.avro.Schema.LockableArrayList<java.lang.String>((int) '#');
        org.apache.avro.Schema.LockableArrayList<java.lang.String> strList5 = new org.apache.avro.Schema.LockableArrayList<java.lang.String>((java.util.List<java.lang.String>) strList4);
        org.apache.avro.Schema.LockableArrayList<java.lang.String> strList6 = new org.apache.avro.Schema.LockableArrayList<java.lang.String>((java.util.List<java.lang.String>) strList4);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.avro.Schema schema7 = org.apache.avro.Schema.createEnum("{\r\n  \"type\" : \"map\",\r\n  \"values\" : {\r\n    \"type\" : \"map\",\r\n    \"values\" : [ ]\r\n  }\r\n}", "[].union", "\"double\"", (java.util.List<java.lang.String>) strList6);
            org.junit.Assert.fail("Expected exception of type org.apache.avro.SchemaParseException; message: Illegal initial character: {??  \"type\" : \"map\",??  \"values\" : {??    \"type\" : \"map\",??    \"values\" : [ ]??  }??}");
        } catch (org.apache.avro.SchemaParseException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SchemaM3Random300Test2.test1293");
        org.apache.avro.Schema.LockableArrayList<java.lang.String> strList4 = new org.apache.avro.Schema.LockableArrayList<java.lang.String>((int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.avro.Schema schema5 = org.apache.avro.Schema.createEnum("{\r\n  \"type\" : \"array\",\r\n  \"items\" : [ ],\r\n  \"{}\" : \"hi!\"\r\n}", "{\"type\":\"int\",\"union type:UNION pos:-1\":\"[ ]\"}", "{null={\"type\":\"record\",\"fields\":[]}}", (java.util.List<java.lang.String>) strList4);
            org.junit.Assert.fail("Expected exception of type org.apache.avro.SchemaParseException; message: Illegal initial character: {??  \"type\" : \"array\",??  \"items\" : [ ],??  \"{}\" : \"hi!\"??}");
        } catch (org.apache.avro.SchemaParseException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SchemaM3Random300Test2.test1294");
        org.apache.avro.Schema.Parser parser0 = new org.apache.avro.Schema.Parser();
        org.apache.avro.Schema.Parser parser2 = parser0.setValidate(true);
        org.apache.avro.Schema.Parser parser4 = parser0.setValidate(true);
        java.util.Map<java.lang.String, org.apache.avro.Schema> strMap5 = parser4.getTypes();
        org.apache.avro.Schema.Parser parser7 = parser4.setValidate(false);
        org.apache.avro.Schema schema9 = parser4.parse("{\"type\":\"map\",\"values\":\"double\"}");
        org.junit.Assert.assertNotNull(parser2);
        org.junit.Assert.assertNotNull(parser4);
        org.junit.Assert.assertNotNull(strMap5);
        org.junit.Assert.assertNotNull(parser7);
        org.junit.Assert.assertNotNull(schema9);
    }

    @Test
    public void test1295() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SchemaM3Random300Test2.test1295");
        org.apache.avro.Schema.Parser parser0 = new org.apache.avro.Schema.Parser();
        java.util.Map<java.lang.String, org.apache.avro.Schema> strMap1 = parser0.getTypes();
        java.util.Map<java.lang.String, org.apache.avro.Schema> strMap2 = parser0.getTypes();
        org.apache.avro.Schema.Parser parser3 = new org.apache.avro.Schema.Parser();
        org.apache.avro.Schema.Parser parser5 = parser3.setValidate(true);
        java.util.Map<java.lang.String, org.apache.avro.Schema> strMap6 = parser3.getTypes();
        org.apache.avro.Schema.Parser parser7 = parser0.addTypes(strMap6);
        org.apache.avro.Schema.Parser parser9 = parser7.setValidate(true);
        org.apache.avro.Schema.Parser parser11 = parser7.setValidate(true);
        org.apache.avro.Schema.Parser parser13 = parser7.setValidate(true);
        org.apache.avro.Schema.Parser parser15 = parser7.setValidate(true);
        java.util.Map<java.lang.String, org.apache.avro.Schema> strMap16 = parser15.getTypes();
        java.util.Map<java.lang.String, org.apache.avro.Schema> strMap17 = parser15.getTypes();
        java.io.InputStream inputStream18 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.avro.Schema schema19 = parser15.parse(inputStream18);
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
        org.junit.Assert.assertNotNull(parser11);
        org.junit.Assert.assertNotNull(parser13);
        org.junit.Assert.assertNotNull(parser15);
        org.junit.Assert.assertNotNull(strMap16);
        org.junit.Assert.assertNotNull(strMap17);
    }

    @Test
    public void test1296() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SchemaM3Random300Test2.test1296");
        org.apache.avro.Schema schema2 = org.apache.avro.Schema.parse("{\"type\":\"map\",\"values\":[],\"\\\"double\\\"\":\"{\\\"type\\\":\\\"array\\\",\\\"items\\\":\\\"int\\\"}\"}", false);
        org.apache.avro.Schema schema3 = org.apache.avro.Schema.createArray(schema2);
        org.junit.Assert.assertNotNull(schema2);
        org.junit.Assert.assertNotNull(schema3);
    }

    @Test
    public void test1297() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SchemaM3Random300Test2.test1297");
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
        org.apache.avro.Schema schema27 = org.apache.avro.Schema.createArray(schema21);
        // The following exception was thrown during execution in test generation
        try {
            schema21.addAlias("[].union");
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
        org.junit.Assert.assertNotNull(schema27);
    }

    @Test
    public void test1298() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SchemaM3Random300Test2.test1298");
        org.apache.avro.Schema.Type type0 = org.apache.avro.Schema.Type.INT;
        org.apache.avro.Schema schema1 = org.apache.avro.Schema.create(type0);
        org.apache.avro.Schema schema2 = org.apache.avro.Schema.createArray(schema1);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str3 = schema1.getNamespace();
            org.junit.Assert.fail("Expected exception of type org.apache.avro.AvroRuntimeException; message: Not a named type: \"int\"");
        } catch (org.apache.avro.AvroRuntimeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + type0 + "' != '" + org.apache.avro.Schema.Type.INT + "'", type0.equals(org.apache.avro.Schema.Type.INT));
        org.junit.Assert.assertNotNull(schema1);
        org.junit.Assert.assertNotNull(schema2);
    }

    @Test
    public void test1299() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SchemaM3Random300Test2.test1299");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.avro.Schema schema2 = org.apache.avro.Schema.parse("{\"type\":\"array\",\"items\":{\"type\":\"record\",\"fields\":[]}}", true);
            org.junit.Assert.fail("Expected exception of type org.apache.avro.SchemaParseException; message: No name in schema: {\"type\":\"record\",\"fields\":[]}");
        } catch (org.apache.avro.SchemaParseException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1300() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SchemaM3Random300Test2.test1300");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.avro.Schema schema4 = org.apache.avro.Schema.createFixed("{\"type\":\"map\",\"values\":{\"type\":\"array\",\"items\":{\"type\":\"map\",\"values\":[]}}}", "union type:MAP pos:-1", "{\"type\":\"record\",\"fields\":[],\"{\\r\\n  \\\"type\\\" : \\\"fixed\\\",\\r\\n  \\\"name\\\" : \\\"union\\\",\\r\\n  \\\"namespace\\\" : \\\"[]\\\",\\r\\n  \\\"doc\\\" : \\\"[ ]\\\",\\r\\n  \\\"size\\\" : 0\\r\\n}\":\"[ ]\"}", (int) 'a');
            org.junit.Assert.fail("Expected exception of type org.apache.avro.SchemaParseException; message: Illegal initial character: {\"type\":\"map\",\"values\":{\"type\":\"array\",\"items\":{\"type\":\"map\",\"values\":[]}}}");
        } catch (org.apache.avro.SchemaParseException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1301() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SchemaM3Random300Test2.test1301");
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
        org.apache.avro.Schema schema17 = parser0.parse("{\r\n  \"type\" : \"array\",\r\n  \"items\" : {\r\n    \"type\" : \"map\",\r\n    \"values\" : [ ]\r\n  }\r\n}");
        java.util.Map<java.lang.String, org.apache.avro.Schema> strMap18 = parser0.getTypes();
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
        org.junit.Assert.assertNotNull(schema17);
        org.junit.Assert.assertNotNull(strMap18);
    }

    @Test
    public void test1302() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SchemaM3Random300Test2.test1302");
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
        java.util.List<org.apache.avro.Schema> schemaList41 = schema28.getTypes();
        org.apache.avro.Schema schema42 = org.apache.avro.Schema.createArray(schema28);
        // The following exception was thrown during execution in test generation
        try {
            schema42.addAlias("{\"type\":\"fixed\",\"name\":\"union\",\"namespace\":\"{}\",\"doc\":\"hi!\",\"size\":1}");
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
        org.junit.Assert.assertNotNull(schemaList41);
        org.junit.Assert.assertNotNull(schema42);
    }

    @Test
    public void test1303() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SchemaM3Random300Test2.test1303");
        org.apache.avro.Schema schema4 = org.apache.avro.Schema.createFixed("union", "{\"type\":\"fixed\",\"name\":\"union\",\"namespace\":\"[]\",\"doc\":\"{\\r\\n  \\\"type\\\" : \\\"map\\\",\\r\\n  \\\"values\\\" : [ ]\\r\\n}\",\"size\":10}", "{\"type\":\"fixed\",\"name\":\"union\",\"namespace\":\"[]\",\"doc\":\"[ ]\",\"size\":0,\"aliases\":[\"union\"]}", (int) (byte) 0);
        org.apache.avro.Schema schema5 = org.apache.avro.Schema.createMap(schema4);
        org.junit.Assert.assertNotNull(schema4);
        org.junit.Assert.assertNotNull(schema5);
    }

    @Test
    public void test1304() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SchemaM3Random300Test2.test1304");
        org.apache.avro.Schema.Type type0 = org.apache.avro.Schema.Type.INT;
        org.apache.avro.Schema schema1 = org.apache.avro.Schema.create(type0);
        org.apache.avro.Schema schema2 = org.apache.avro.Schema.createArray(schema1);
        schema1.addProp("union type:UNION pos:-1", "[ ]");
        org.apache.avro.Schema.Type type6 = schema1.getType();
        java.lang.String str8 = schema1.getProp("{\"type\":\"fixed\",\"name\":\"union\",\"namespace\":\"[]\",\"doc\":\"[ ]\",\"size\":0}");
        // The following exception was thrown during execution in test generation
        try {
            int int9 = schema1.getFixedSize();
            org.junit.Assert.fail("Expected exception of type org.apache.avro.AvroRuntimeException; message: Not fixed: {\"type\":\"int\",\"union type:UNION pos:-1\":\"[ ]\"}");
        } catch (org.apache.avro.AvroRuntimeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + type0 + "' != '" + org.apache.avro.Schema.Type.INT + "'", type0.equals(org.apache.avro.Schema.Type.INT));
        org.junit.Assert.assertNotNull(schema1);
        org.junit.Assert.assertNotNull(schema2);
        org.junit.Assert.assertTrue("'" + type6 + "' != '" + org.apache.avro.Schema.Type.INT + "'", type6.equals(org.apache.avro.Schema.Type.INT));
        org.junit.Assert.assertNull(str8);
    }

    @Test
    public void test1305() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SchemaM3Random300Test2.test1305");
        org.apache.avro.Schema schema4 = org.apache.avro.Schema.createFixed("union", "hi!", "{}", (int) (byte) 1);
        schema4.addProp("{\"type\":\"array\",\"items\":\"null\"}", "{\"type\":\"map\",\"values\":\"double\"}");
        org.junit.Assert.assertNotNull(schema4);
    }

    @Test
    public void test1306() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SchemaM3Random300Test2.test1306");
        org.apache.avro.Schema.Field[] fieldArray0 = new org.apache.avro.Schema.Field[] {};
        java.util.ArrayList<org.apache.avro.Schema.Field> fieldList1 = new java.util.ArrayList<org.apache.avro.Schema.Field>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<org.apache.avro.Schema.Field>) fieldList1, fieldArray0);
        org.apache.avro.Schema schema3 = org.apache.avro.Schema.createRecord((java.util.List<org.apache.avro.Schema.Field>) fieldList1);
        java.util.List<org.apache.avro.Schema.Field> fieldList4 = schema3.getFields();
        org.apache.avro.Schema schema5 = org.apache.avro.Schema.createRecord(fieldList4);
        org.apache.avro.Schema schema6 = org.apache.avro.Schema.createRecord(fieldList4);
        org.apache.avro.Schema schema7 = org.apache.avro.Schema.createRecord(fieldList4);
        org.apache.avro.Schema.Names names9 = new org.apache.avro.Schema.Names("{\"type\":\"fixed\",\"name\":\"union\",\"namespace\":\"[]\",\"doc\":\"{\\r\\n  \\\"type\\\" : \\\"map\\\",\\r\\n  \\\"values\\\" : [ ]\\r\\n}\",\"size\":10}");
        org.codehaus.jackson.JsonGenerator jsonGenerator10 = null;
        // The following exception was thrown during execution in test generation
        try {
            schema7.toJson(names9, jsonGenerator10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(fieldArray0);
        org.junit.Assert.assertArrayEquals(fieldArray0, new org.apache.avro.Schema.Field[] {});
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(schema3);
        org.junit.Assert.assertNotNull(fieldList4);
        org.junit.Assert.assertNotNull(schema5);
        org.junit.Assert.assertNotNull(schema6);
        org.junit.Assert.assertNotNull(schema7);
    }

    @Test
    public void test1307() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SchemaM3Random300Test2.test1307");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.avro.Schema schema4 = org.apache.avro.Schema.createRecord("{\"type\":\"array\",\"items\":{\"type\":\"array\",\"items\":{\"type\":\"map\",\"values\":[]}}}", "{\r\n  \"type\" : \"record\",\r\n  \"fields\" : [ ],\r\n  \"{\\r\\n  \\\"type\\\" : \\\"fixed\\\",\\r\\n  \\\"name\\\" : \\\"union\\\",\\r\\n  \\\"namespace\\\" : \\\"[]\\\",\\r\\n  \\\"doc\\\" : \\\"[ ]\\\",\\r\\n  \\\"size\\\" : 0\\r\\n}\" : \"[ ]\"\r\n}", "map", false);
            org.junit.Assert.fail("Expected exception of type org.apache.avro.SchemaParseException; message: Illegal initial character: {\"type\":\"array\",\"items\":{\"type\":\"array\",\"items\":{\"type\":\"map\",\"values\":[]}}}");
        } catch (org.apache.avro.SchemaParseException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1308() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SchemaM3Random300Test2.test1308");
        org.apache.avro.Schema schema2 = org.apache.avro.Schema.parse("{\"type\":\"map\",\"values\":[]}", true);
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<org.apache.avro.Schema.Field> fieldList3 = schema2.getFields();
            org.junit.Assert.fail("Expected exception of type org.apache.avro.AvroRuntimeException; message: Not a record: {\"type\":\"map\",\"values\":[]}");
        } catch (org.apache.avro.AvroRuntimeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(schema2);
    }

    @Test
    public void test1309() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SchemaM3Random300Test2.test1309");
        org.apache.avro.Schema.Parser parser0 = new org.apache.avro.Schema.Parser();
        java.util.Map<java.lang.String, org.apache.avro.Schema> strMap1 = parser0.getTypes();
        org.apache.avro.Schema.Parser parser3 = parser0.setValidate(false);
        boolean boolean4 = parser3.getValidate();
        java.util.Map<java.lang.String, org.apache.avro.Schema> strMap5 = parser3.getTypes();
        org.apache.avro.Schema schema7 = parser3.parse("\"double\"");
        java.lang.Class<?> wildcardClass8 = parser3.getClass();
        org.junit.Assert.assertNotNull(strMap1);
        org.junit.Assert.assertNotNull(parser3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(strMap5);
        org.junit.Assert.assertNotNull(schema7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test1310() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SchemaM3Random300Test2.test1310");
        org.apache.avro.Schema.Names names1 = new org.apache.avro.Schema.Names("{\r\n  \"type\" : \"map\",\r\n  \"values\" : {\r\n    \"type\" : \"enum\",\r\n    \"name\" : \"union\",\r\n    \"namespace\" : \"[]\",\r\n    \"doc\" : \"{}\",\r\n    \"symbols\" : [ ]\r\n  }\r\n}");
        names1.space("{\"type\":\"array\",\"items\":\"null\"}");
    }

    @Test
    public void test1311() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SchemaM3Random300Test2.test1311");
        org.apache.avro.Schema schema4 = org.apache.avro.Schema.createFixed("union", "{\"type\":\"fixed\",\"name\":\"union\",\"namespace\":\"[]\",\"doc\":\"{\\r\\n  \\\"type\\\" : \\\"map\\\",\\r\\n  \\\"values\\\" : [ ]\\r\\n}\",\"size\":10}", "{\"type\":\"fixed\",\"name\":\"union\",\"namespace\":\"[]\",\"doc\":\"[ ]\",\"size\":0,\"aliases\":[\"union\"]}", (int) (byte) 0);
        int int5 = schema4.getFixedSize();
        org.junit.Assert.assertNotNull(schema4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
    }

    @Test
    public void test1312() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SchemaM3Random300Test2.test1312");
        org.apache.avro.Schema.Parser parser0 = new org.apache.avro.Schema.Parser();
        java.util.Map<java.lang.String, org.apache.avro.Schema> strMap1 = parser0.getTypes();
        java.util.Map<java.lang.String, org.apache.avro.Schema> strMap2 = parser0.getTypes();
        org.apache.avro.Schema.Parser parser3 = new org.apache.avro.Schema.Parser();
        java.util.Map<java.lang.String, org.apache.avro.Schema> strMap4 = parser3.getTypes();
        org.apache.avro.Schema.Parser parser5 = parser0.addTypes(strMap4);
        org.apache.avro.Schema schema7 = parser0.parse("{\r\n  \"type\" : \"map\",\r\n  \"values\" : [ ]\r\n}");
        org.apache.avro.Schema.Parser parser9 = parser0.setValidate(true);
        org.apache.avro.Schema schema11 = parser9.parse("{\r\n  \"type\" : \"map\",\r\n  \"values\" : {\r\n    \"type\" : \"map\",\r\n    \"values\" : [ ]\r\n  }\r\n}");
        java.util.Map<java.lang.String, org.apache.avro.Schema> strMap12 = parser9.getTypes();
        org.junit.Assert.assertNotNull(strMap1);
        org.junit.Assert.assertNotNull(strMap2);
        org.junit.Assert.assertNotNull(strMap4);
        org.junit.Assert.assertNotNull(parser5);
        org.junit.Assert.assertNotNull(schema7);
        org.junit.Assert.assertNotNull(parser9);
        org.junit.Assert.assertNotNull(schema11);
        org.junit.Assert.assertNotNull(strMap12);
    }

    @Test
    public void test1313() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SchemaM3Random300Test2.test1313");
        org.apache.avro.Schema.Parser parser0 = new org.apache.avro.Schema.Parser();
        java.util.Map<java.lang.String, org.apache.avro.Schema> strMap1 = parser0.getTypes();
        java.util.Map<java.lang.String, org.apache.avro.Schema> strMap2 = parser0.getTypes();
        org.apache.avro.Schema.Parser parser3 = new org.apache.avro.Schema.Parser();
        org.apache.avro.Schema.Parser parser5 = parser3.setValidate(true);
        java.util.Map<java.lang.String, org.apache.avro.Schema> strMap6 = parser3.getTypes();
        org.apache.avro.Schema.Parser parser7 = parser0.addTypes(strMap6);
        java.util.Map<java.lang.String, org.apache.avro.Schema> strMap8 = parser0.getTypes();
        org.apache.avro.Schema.Parser parser10 = parser0.setValidate(false);
        org.apache.avro.Schema.Parser parser12 = parser0.setValidate(false);
        boolean boolean13 = parser12.getValidate();
        org.apache.avro.Schema.Parser parser14 = new org.apache.avro.Schema.Parser();
        java.util.Map<java.lang.String, org.apache.avro.Schema> strMap15 = parser14.getTypes();
        java.util.Map<java.lang.String, org.apache.avro.Schema> strMap16 = parser14.getTypes();
        org.apache.avro.Schema.Parser parser17 = new org.apache.avro.Schema.Parser();
        org.apache.avro.Schema.Parser parser19 = parser17.setValidate(true);
        java.util.Map<java.lang.String, org.apache.avro.Schema> strMap20 = parser17.getTypes();
        org.apache.avro.Schema.Parser parser21 = parser14.addTypes(strMap20);
        java.util.Map<java.lang.String, org.apache.avro.Schema> strMap22 = parser21.getTypes();
        org.apache.avro.Schema.Parser parser23 = parser12.addTypes(strMap22);
        boolean boolean24 = parser12.getValidate();
        boolean boolean25 = parser12.getValidate();
        org.junit.Assert.assertNotNull(strMap1);
        org.junit.Assert.assertNotNull(strMap2);
        org.junit.Assert.assertNotNull(parser5);
        org.junit.Assert.assertNotNull(strMap6);
        org.junit.Assert.assertNotNull(parser7);
        org.junit.Assert.assertNotNull(strMap8);
        org.junit.Assert.assertNotNull(parser10);
        org.junit.Assert.assertNotNull(parser12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(strMap15);
        org.junit.Assert.assertNotNull(strMap16);
        org.junit.Assert.assertNotNull(parser19);
        org.junit.Assert.assertNotNull(strMap20);
        org.junit.Assert.assertNotNull(parser21);
        org.junit.Assert.assertNotNull(strMap22);
        org.junit.Assert.assertNotNull(parser23);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
    }

    @Test
    public void test1314() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SchemaM3Random300Test2.test1314");
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
        org.apache.avro.Schema.Parser parser18 = parser6.setValidate(false);
        boolean boolean19 = parser18.getValidate();
        org.apache.avro.Schema schema21 = parser18.parse("{\r\n  \"type\" : \"array\",\r\n  \"items\" : {\r\n    \"type\" : \"map\",\r\n    \"values\" : [ ]\r\n  }\r\n}");
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
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(schema21);
    }

    @Test
    public void test1315() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SchemaM3Random300Test2.test1315");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.avro.Schema schema4 = org.apache.avro.Schema.createFixed("{\"type\":\"array\",\"items\":{\"type\":\"map\",\"values\":[]},\"union type:MAP pos:-1\":\"{\\\"type\\\":\\\"array\\\",\\\"items\\\":{\\\"type\\\":\\\"map\\\",\\\"values\\\":[]}}\"}", "union type:UNION pos:-1", "map", (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type org.apache.avro.SchemaParseException; message: Illegal initial character: {\"type\":\"array\",\"items\":{\"type\":\"map\",\"values\":[]},\"union type:MAP pos:-1\":\"{\\\"type\\\":\\\"array\\\",\\\"items\\\":{\\\"type\\\":\\\"map\\\",\\\"values\\\":[]}}\"}");
        } catch (org.apache.avro.SchemaParseException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1316() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SchemaM3Random300Test2.test1316");
        org.apache.avro.Schema.LockableArrayList<java.lang.String> strList3 = new org.apache.avro.Schema.LockableArrayList<java.lang.String>();
        org.apache.avro.Schema.LockableArrayList<java.lang.String> strList4 = new org.apache.avro.Schema.LockableArrayList<java.lang.String>((java.util.List<java.lang.String>) strList3);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.avro.Schema schema5 = org.apache.avro.Schema.createEnum("{\"type\":\"double\",\"float\":\"{\\\"type\\\":\\\"array\\\",\\\"items\\\":[]}\"}", "{null=null}", "{\"type\":\"record\",\"fields\":[],\"{\\r\\n  \\\"type\\\" : \\\"fixed\\\",\\r\\n  \\\"name\\\" : \\\"union\\\",\\r\\n  \\\"namespace\\\" : \\\"[]\\\",\\r\\n  \\\"doc\\\" : \\\"[ ]\\\",\\r\\n  \\\"size\\\" : 0\\r\\n}\":\"[ ]\"}", (java.util.List<java.lang.String>) strList4);
            org.junit.Assert.fail("Expected exception of type org.apache.avro.SchemaParseException; message: Illegal initial character: {\"type\":\"double\",\"float\":\"{\\\"type\\\":\\\"array\\\",\\\"items\\\":[]}\"}");
        } catch (org.apache.avro.SchemaParseException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1317() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SchemaM3Random300Test2.test1317");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.avro.Schema schema1 = org.apache.avro.Schema.parse("{}.union");
            org.junit.Assert.fail("Expected exception of type org.apache.avro.SchemaParseException; message: No type: {}");
        } catch (org.apache.avro.SchemaParseException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1318() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SchemaM3Random300Test2.test1318");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.avro.Schema schema4 = org.apache.avro.Schema.createFixed("\"null\"", "{\"type\":\"array\",\"items\":\"int\"}", "{\r\n  \"type\" : \"record\",\r\n  \"fields\" : [ ],\r\n  \"{\\r\\n  \\\"type\\\" : \\\"fixed\\\",\\r\\n  \\\"name\\\" : \\\"union\\\",\\r\\n  \\\"namespace\\\" : \\\"[]\\\",\\r\\n  \\\"doc\\\" : \\\"[ ]\\\",\\r\\n  \\\"size\\\" : 0\\r\\n}\" : \"[ ]\"\r\n}", 100);
            org.junit.Assert.fail("Expected exception of type org.apache.avro.SchemaParseException; message: Illegal initial character: \"null\"");
        } catch (org.apache.avro.SchemaParseException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1319() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SchemaM3Random300Test2.test1319");
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
            org.apache.avro.Schema.Field field11 = schema8.getField("{null={\"type\":\"record\",\"fields\":[]}}");
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
    public void test1320() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SchemaM3Random300Test2.test1320");
        org.apache.avro.Schema schema4 = org.apache.avro.Schema.createFixed("union", "", "union type:UNION pos:-1", 10);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean6 = schema4.hasEnumSymbol("map");
            org.junit.Assert.fail("Expected exception of type org.apache.avro.AvroRuntimeException; message: Not an enum: {\"type\":\"fixed\",\"name\":\"union\",\"namespace\":\"union type:UNION pos:-1\",\"doc\":\"\",\"size\":10}");
        } catch (org.apache.avro.AvroRuntimeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(schema4);
    }

    @Test
    public void test1321() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SchemaM3Random300Test2.test1321");
        java.lang.String[] strArray19 = new java.lang.String[] { "{\"type\":\"array\",\"items\":{\"type\":\"map\",\"values\":[]}}", "union type:MAP pos:-1", "{\"type\":\"array\",\"items\":{\"type\":\"map\",\"values\":[]}}", "{}", "{\r\n  \"type\" : \"map\",\r\n  \"values\" : {\r\n    \"type\" : \"map\",\r\n    \"values\" : [ ]\r\n  }\r\n}", "double", "{\r\n  \"type\" : \"map\",\r\n  \"values\" : [ ]\r\n}", "{\"type\":\"map\",\"values\":[]}", "{\"type\":\"array\",\"items\":[]}", "{\"type\":\"map\",\"values\":[]}", "{}", "union", "{\r\n  \"type\" : \"record\",\r\n  \"fields\" : [ ]\r\n}", "[].union", "{\r\n  \"type\" : \"map\",\r\n  \"values\" : [ ]\r\n}", "{\"type\":\"fixed\",\"name\":\"union\",\"namespace\":\"[]\",\"doc\":\"[ ]\",\"size\":0}" };
        java.util.ArrayList<java.lang.String> strList20 = new java.util.ArrayList<java.lang.String>();
        boolean boolean21 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList20, strArray19);
        org.apache.avro.Schema.LockableArrayList<java.lang.String> strList22 = new org.apache.avro.Schema.LockableArrayList<java.lang.String>((java.util.List<java.lang.String>) strList20);
        org.apache.avro.Schema.LockableArrayList<java.lang.String> strList23 = new org.apache.avro.Schema.LockableArrayList<java.lang.String>((java.util.List<java.lang.String>) strList22);
        org.apache.avro.Schema.LockableArrayList<java.lang.String> strList24 = new org.apache.avro.Schema.LockableArrayList<java.lang.String>((java.util.List<java.lang.String>) strList23);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.avro.Schema schema25 = org.apache.avro.Schema.createEnum("{\"type\":\"fixed\",\"name\":\"union\",\"namespace\":\"[]\",\"doc\":\"{\\r\\n  \\\"type\\\" : \\\"map\\\",\\r\\n  \\\"values\\\" : [ ]\\r\\n}\",\"size\":10}", "{\"type\":\"array\",\"items\":[],\"union type:UNION pos:-1\":\"\"}", "{\"type\":\"record\",\"fields\":[]}", (java.util.List<java.lang.String>) strList23);
            org.junit.Assert.fail("Expected exception of type org.apache.avro.SchemaParseException; message: Illegal initial character: {\"type\":\"fixed\",\"name\":\"union\",\"namespace\":\"[]\",\"doc\":\"{\\r\\n  \\\"type\\\" : \\\"map\\\",\\r\\n  \\\"values\\\" : [ ]\\r\\n}\",\"size\":10}");
        } catch (org.apache.avro.SchemaParseException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray19);
        org.junit.Assert.assertArrayEquals(strArray19, new java.lang.String[] { "{\"type\":\"array\",\"items\":{\"type\":\"map\",\"values\":[]}}", "union type:MAP pos:-1", "{\"type\":\"array\",\"items\":{\"type\":\"map\",\"values\":[]}}", "{}", "{\r\n  \"type\" : \"map\",\r\n  \"values\" : {\r\n    \"type\" : \"map\",\r\n    \"values\" : [ ]\r\n  }\r\n}", "double", "{\r\n  \"type\" : \"map\",\r\n  \"values\" : [ ]\r\n}", "{\"type\":\"map\",\"values\":[]}", "{\"type\":\"array\",\"items\":[]}", "{\"type\":\"map\",\"values\":[]}", "{}", "union", "{\r\n  \"type\" : \"record\",\r\n  \"fields\" : [ ]\r\n}", "[].union", "{\r\n  \"type\" : \"map\",\r\n  \"values\" : [ ]\r\n}", "{\"type\":\"fixed\",\"name\":\"union\",\"namespace\":\"[]\",\"doc\":\"[ ]\",\"size\":0}" });
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
    }

    @Test
    public void test1322() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SchemaM3Random300Test2.test1322");
        org.apache.avro.Schema.Parser parser0 = new org.apache.avro.Schema.Parser();
        java.util.Map<java.lang.String, org.apache.avro.Schema> strMap1 = parser0.getTypes();
        java.util.Map<java.lang.String, org.apache.avro.Schema> strMap2 = parser0.getTypes();
        org.apache.avro.Schema.Parser parser3 = new org.apache.avro.Schema.Parser();
        org.apache.avro.Schema.Parser parser5 = parser3.setValidate(true);
        java.util.Map<java.lang.String, org.apache.avro.Schema> strMap6 = parser3.getTypes();
        org.apache.avro.Schema.Parser parser7 = parser0.addTypes(strMap6);
        org.apache.avro.Schema.Parser parser9 = parser7.setValidate(true);
        org.apache.avro.Schema.Parser parser11 = parser7.setValidate(true);
        org.apache.avro.Schema.Parser parser13 = parser7.setValidate(true);
        org.apache.avro.Schema.Parser parser15 = parser7.setValidate(true);
        org.apache.avro.Schema.Parser parser17 = parser15.setValidate(false);
        boolean boolean18 = parser15.getValidate();
        java.io.InputStream inputStream19 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.avro.Schema schema20 = parser15.parse(inputStream19);
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
        org.junit.Assert.assertNotNull(parser11);
        org.junit.Assert.assertNotNull(parser13);
        org.junit.Assert.assertNotNull(parser15);
        org.junit.Assert.assertNotNull(parser17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test1323() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SchemaM3Random300Test2.test1323");
        org.apache.avro.Schema.Field[] fieldArray0 = new org.apache.avro.Schema.Field[] {};
        java.util.ArrayList<org.apache.avro.Schema.Field> fieldList1 = new java.util.ArrayList<org.apache.avro.Schema.Field>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<org.apache.avro.Schema.Field>) fieldList1, fieldArray0);
        org.apache.avro.Schema schema3 = org.apache.avro.Schema.createRecord((java.util.List<org.apache.avro.Schema.Field>) fieldList1);
        org.apache.avro.Schema schema4 = org.apache.avro.Schema.createRecord((java.util.List<org.apache.avro.Schema.Field>) fieldList1);
        org.apache.avro.Schema schema5 = org.apache.avro.Schema.createRecord((java.util.List<org.apache.avro.Schema.Field>) fieldList1);
        org.apache.avro.Schema schema6 = org.apache.avro.Schema.createRecord((java.util.List<org.apache.avro.Schema.Field>) fieldList1);
        java.lang.String str7 = schema6.getNamespace();
        java.util.List<org.apache.avro.Schema.Field> fieldList8 = schema6.getFields();
        java.lang.Class<?> wildcardClass9 = fieldList8.getClass();
        org.junit.Assert.assertNotNull(fieldArray0);
        org.junit.Assert.assertArrayEquals(fieldArray0, new org.apache.avro.Schema.Field[] {});
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(schema3);
        org.junit.Assert.assertNotNull(schema4);
        org.junit.Assert.assertNotNull(schema5);
        org.junit.Assert.assertNotNull(schema6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNotNull(fieldList8);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test1324() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SchemaM3Random300Test2.test1324");
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
        org.apache.avro.Schema.LockableArrayList<java.lang.String> strList12 = new org.apache.avro.Schema.LockableArrayList<java.lang.String>((int) (short) 10);
        org.apache.avro.Schema.LockableArrayList<java.lang.String> strList13 = new org.apache.avro.Schema.LockableArrayList<java.lang.String>((java.util.List<java.lang.String>) strList12);
        boolean boolean14 = schema10.equals((java.lang.Object) strList13);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.avro.Schema.Field field16 = schema10.getField("union type:UNION pos:-1");
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
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test1325() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SchemaM3Random300Test2.test1325");
        org.apache.avro.Schema.LockableArrayList<org.apache.avro.Schema.Type> typeList1 = new org.apache.avro.Schema.LockableArrayList<org.apache.avro.Schema.Type>((int) (short) 1);
    }

    @Test
    public void test1326() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SchemaM3Random300Test2.test1326");
        org.apache.avro.Schema[] schemaArray0 = new org.apache.avro.Schema[] {};
        java.util.ArrayList<org.apache.avro.Schema> schemaList1 = new java.util.ArrayList<org.apache.avro.Schema>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<org.apache.avro.Schema>) schemaList1, schemaArray0);
        org.apache.avro.Schema schema3 = org.apache.avro.Schema.createUnion((java.util.List<org.apache.avro.Schema>) schemaList1);
        org.apache.avro.Schema[] schemaArray4 = new org.apache.avro.Schema[] {};
        java.util.ArrayList<org.apache.avro.Schema> schemaList5 = new java.util.ArrayList<org.apache.avro.Schema>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<org.apache.avro.Schema>) schemaList5, schemaArray4);
        org.apache.avro.Schema schema7 = org.apache.avro.Schema.createUnion((java.util.List<org.apache.avro.Schema>) schemaList5);
        org.apache.avro.Schema schema8 = org.apache.avro.Schema.applyAliases(schema3, schema7);
        java.lang.String str10 = schema8.getProp("map");
        java.lang.String str12 = schema8.toString(true);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.avro.Schema schema13 = schema8.getValueType();
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
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "[ ]" + "'", str12, "[ ]");
    }

    @Test
    public void test1327() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SchemaM3Random300Test2.test1327");
        org.codehaus.jackson.JsonNode jsonNode1 = org.apache.avro.Schema.parseJson("{\r\n  \"type\" : \"array\",\r\n  \"items\" : [ ]\r\n}");
        org.junit.Assert.assertNotNull(jsonNode1);
    }

    @Test
    public void test1328() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SchemaM3Random300Test2.test1328");
        org.apache.avro.Schema.Parser parser0 = new org.apache.avro.Schema.Parser();
        org.apache.avro.Schema.Parser parser2 = parser0.setValidate(true);
        org.apache.avro.Schema.Parser parser4 = parser0.setValidate(true);
        org.apache.avro.Schema.Parser parser6 = parser0.setValidate(true);
        org.apache.avro.Schema.Parser parser8 = parser0.setValidate(false);
        org.apache.avro.Schema.Parser parser10 = parser8.setValidate(true);
        org.junit.Assert.assertNotNull(parser2);
        org.junit.Assert.assertNotNull(parser4);
        org.junit.Assert.assertNotNull(parser6);
        org.junit.Assert.assertNotNull(parser8);
        org.junit.Assert.assertNotNull(parser10);
    }

    @Test
    public void test1329() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SchemaM3Random300Test2.test1329");
        org.apache.avro.Schema.Type type0 = org.apache.avro.Schema.Type.FLOAT;
        org.apache.avro.Schema schema1 = org.apache.avro.Schema.create(type0);
        schema1.addProp("{\r\n  \"type\" : \"record\",\r\n  \"fields\" : [ ]\r\n}", "{\r\n  \"type\" : \"map\",\r\n  \"values\" : [ ]\r\n}");
        java.lang.String str5 = schema1.toString();
        org.junit.Assert.assertTrue("'" + type0 + "' != '" + org.apache.avro.Schema.Type.FLOAT + "'", type0.equals(org.apache.avro.Schema.Type.FLOAT));
        org.junit.Assert.assertNotNull(schema1);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "{\"type\":\"float\",\"{\\r\\n  \\\"type\\\" : \\\"record\\\",\\r\\n  \\\"fields\\\" : [ ]\\r\\n}\":\"{\\r\\n  \\\"type\\\" : \\\"map\\\",\\r\\n  \\\"values\\\" : [ ]\\r\\n}\"}" + "'", str5, "{\"type\":\"float\",\"{\\r\\n  \\\"type\\\" : \\\"record\\\",\\r\\n  \\\"fields\\\" : [ ]\\r\\n}\":\"{\\r\\n  \\\"type\\\" : \\\"map\\\",\\r\\n  \\\"values\\\" : [ ]\\r\\n}\"}");
    }

    @Test
    public void test1330() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SchemaM3Random300Test2.test1330");
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
            schema3.addProp("{\"type\":\"float\",\"{\\r\\n  \\\"type\\\" : \\\"record\\\",\\r\\n  \\\"fields\\\" : [ ]\\r\\n}\":\"{\\r\\n  \\\"type\\\" : \\\"map\\\",\\r\\n  \\\"values\\\" : [ ]\\r\\n}\"}", "{\"type\":\"map\",\"values\":{\"type\":\"enum\",\"name\":\"union\",\"namespace\":\"[]\",\"doc\":\"{}\",\"symbols\":[]}}");
            org.junit.Assert.fail("Expected exception of type org.apache.avro.AvroRuntimeException; message: Can't set properties on a union: []");
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
    public void test1331() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SchemaM3Random300Test2.test1331");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.avro.Schema schema4 = org.apache.avro.Schema.createRecord("{null=null}", "{\"type\":\"fixed\",\"name\":\"union\",\"namespace\":\"union type:UNION pos:-1\",\"doc\":\"\",\"size\":10}", "{}", true);
            org.junit.Assert.fail("Expected exception of type org.apache.avro.SchemaParseException; message: Illegal initial character: {null=null}");
        } catch (org.apache.avro.SchemaParseException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1332() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SchemaM3Random300Test2.test1332");
        org.apache.avro.Schema.LockableArrayList<java.lang.String> strList4 = new org.apache.avro.Schema.LockableArrayList<java.lang.String>((int) (short) 0);
        org.apache.avro.Schema.LockableArrayList<java.lang.String> strList5 = new org.apache.avro.Schema.LockableArrayList<java.lang.String>((java.util.List<java.lang.String>) strList4);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.avro.Schema schema6 = org.apache.avro.Schema.createEnum("{\"type\":\"map\",\"values\":[]}", "{\"type\":\"record\",\"fields\":[]}", "{}", (java.util.List<java.lang.String>) strList5);
            org.junit.Assert.fail("Expected exception of type org.apache.avro.SchemaParseException; message: Illegal initial character: {\"type\":\"map\",\"values\":[]}");
        } catch (org.apache.avro.SchemaParseException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1333() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SchemaM3Random300Test2.test1333");
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
        boolean boolean18 = parser0.getValidate();
        org.apache.avro.Schema.Parser parser20 = parser0.setValidate(false);
        org.apache.avro.Schema.Parser parser21 = new org.apache.avro.Schema.Parser();
        java.util.Map<java.lang.String, org.apache.avro.Schema> strMap22 = parser21.getTypes();
        java.util.Map<java.lang.String, org.apache.avro.Schema> strMap23 = parser21.getTypes();
        org.apache.avro.Schema.Parser parser24 = new org.apache.avro.Schema.Parser();
        java.util.Map<java.lang.String, org.apache.avro.Schema> strMap25 = parser24.getTypes();
        org.apache.avro.Schema.Parser parser26 = parser21.addTypes(strMap25);
        org.apache.avro.Schema schema28 = parser21.parse("{\r\n  \"type\" : \"map\",\r\n  \"values\" : [ ]\r\n}");
        org.apache.avro.Schema.Parser parser30 = parser21.setValidate(true);
        org.apache.avro.Schema.Parser parser31 = new org.apache.avro.Schema.Parser();
        java.util.Map<java.lang.String, org.apache.avro.Schema> strMap32 = parser31.getTypes();
        java.util.Map<java.lang.String, org.apache.avro.Schema> strMap33 = parser31.getTypes();
        org.apache.avro.Schema.Parser parser34 = parser30.addTypes(strMap33);
        boolean boolean35 = parser34.getValidate();
        org.apache.avro.Schema.Parser parser37 = parser34.setValidate(true);
        org.apache.avro.Schema.Parser parser38 = new org.apache.avro.Schema.Parser();
        java.util.Map<java.lang.String, org.apache.avro.Schema> strMap39 = parser38.getTypes();
        java.util.Map<java.lang.String, org.apache.avro.Schema> strMap40 = parser38.getTypes();
        org.apache.avro.Schema.Parser parser41 = new org.apache.avro.Schema.Parser();
        java.util.Map<java.lang.String, org.apache.avro.Schema> strMap42 = parser41.getTypes();
        org.apache.avro.Schema.Parser parser43 = parser38.addTypes(strMap42);
        org.apache.avro.Schema.Parser parser44 = parser37.addTypes(strMap42);
        org.apache.avro.Schema.Parser parser45 = parser0.addTypes(strMap42);
        org.apache.avro.Schema.Parser parser46 = new org.apache.avro.Schema.Parser();
        java.util.Map<java.lang.String, org.apache.avro.Schema> strMap47 = parser46.getTypes();
        java.util.Map<java.lang.String, org.apache.avro.Schema> strMap48 = parser46.getTypes();
        org.apache.avro.Schema.Parser parser49 = new org.apache.avro.Schema.Parser();
        org.apache.avro.Schema.Parser parser51 = parser49.setValidate(true);
        java.util.Map<java.lang.String, org.apache.avro.Schema> strMap52 = parser49.getTypes();
        org.apache.avro.Schema.Parser parser53 = parser46.addTypes(strMap52);
        org.apache.avro.Schema schema55 = parser53.parse("{\"type\":\"map\",\"values\":[]}");
        org.apache.avro.Schema.Parser parser57 = parser53.setValidate(false);
        org.apache.avro.Schema.Parser parser59 = parser53.setValidate(true);
        java.util.Map<java.lang.String, org.apache.avro.Schema> strMap60 = parser53.getTypes();
        org.apache.avro.Schema.Parser parser61 = parser45.addTypes(strMap60);
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
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNotNull(parser20);
        org.junit.Assert.assertNotNull(strMap22);
        org.junit.Assert.assertNotNull(strMap23);
        org.junit.Assert.assertNotNull(strMap25);
        org.junit.Assert.assertNotNull(parser26);
        org.junit.Assert.assertNotNull(schema28);
        org.junit.Assert.assertNotNull(parser30);
        org.junit.Assert.assertNotNull(strMap32);
        org.junit.Assert.assertNotNull(strMap33);
        org.junit.Assert.assertNotNull(parser34);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + true + "'", boolean35 == true);
        org.junit.Assert.assertNotNull(parser37);
        org.junit.Assert.assertNotNull(strMap39);
        org.junit.Assert.assertNotNull(strMap40);
        org.junit.Assert.assertNotNull(strMap42);
        org.junit.Assert.assertNotNull(parser43);
        org.junit.Assert.assertNotNull(parser44);
        org.junit.Assert.assertNotNull(parser45);
        org.junit.Assert.assertNotNull(strMap47);
        org.junit.Assert.assertNotNull(strMap48);
        org.junit.Assert.assertNotNull(parser51);
        org.junit.Assert.assertNotNull(strMap52);
        org.junit.Assert.assertNotNull(parser53);
        org.junit.Assert.assertNotNull(schema55);
        org.junit.Assert.assertNotNull(parser57);
        org.junit.Assert.assertNotNull(parser59);
        org.junit.Assert.assertNotNull(strMap60);
        org.junit.Assert.assertNotNull(parser61);
    }

    @Test
    public void test1334() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SchemaM3Random300Test2.test1334");
        org.apache.avro.Schema.Field[] fieldArray0 = new org.apache.avro.Schema.Field[] {};
        java.util.ArrayList<org.apache.avro.Schema.Field> fieldList1 = new java.util.ArrayList<org.apache.avro.Schema.Field>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<org.apache.avro.Schema.Field>) fieldList1, fieldArray0);
        org.apache.avro.Schema schema3 = org.apache.avro.Schema.createRecord((java.util.List<org.apache.avro.Schema.Field>) fieldList1);
        org.apache.avro.Schema.Field field5 = schema3.getField("");
        org.apache.avro.Schema schema6 = org.apache.avro.Schema.createMap(schema3);
        org.apache.avro.Schema.Type type7 = schema3.getType();
        java.lang.String str8 = schema3.getDoc();
        java.lang.String str9 = schema3.getFullName();
        org.junit.Assert.assertNotNull(fieldArray0);
        org.junit.Assert.assertArrayEquals(fieldArray0, new org.apache.avro.Schema.Field[] {});
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(schema3);
        org.junit.Assert.assertNull(field5);
        org.junit.Assert.assertNotNull(schema6);
        org.junit.Assert.assertTrue("'" + type7 + "' != '" + org.apache.avro.Schema.Type.RECORD + "'", type7.equals(org.apache.avro.Schema.Type.RECORD));
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str9);
    }

    @Test
    public void test1335() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SchemaM3Random300Test2.test1335");
        org.apache.avro.Schema.Parser parser0 = new org.apache.avro.Schema.Parser();
        java.util.Map<java.lang.String, org.apache.avro.Schema> strMap1 = parser0.getTypes();
        org.apache.avro.Schema.Parser parser3 = parser0.setValidate(false);
        org.apache.avro.Schema.Parser parser5 = parser3.setValidate(true);
        boolean boolean6 = parser3.getValidate();
        org.junit.Assert.assertNotNull(strMap1);
        org.junit.Assert.assertNotNull(parser3);
        org.junit.Assert.assertNotNull(parser5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test1336() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SchemaM3Random300Test2.test1336");
        org.apache.avro.Schema.Parser parser0 = new org.apache.avro.Schema.Parser();
        java.util.Map<java.lang.String, org.apache.avro.Schema> strMap1 = parser0.getTypes();
        java.util.Map<java.lang.String, org.apache.avro.Schema> strMap2 = parser0.getTypes();
        org.apache.avro.Schema.Parser parser3 = new org.apache.avro.Schema.Parser();
        org.apache.avro.Schema.Parser parser5 = parser3.setValidate(true);
        java.util.Map<java.lang.String, org.apache.avro.Schema> strMap6 = parser3.getTypes();
        org.apache.avro.Schema.Parser parser7 = parser0.addTypes(strMap6);
        java.util.Map<java.lang.String, org.apache.avro.Schema> strMap8 = parser0.getTypes();
        org.apache.avro.Schema.Parser parser10 = parser0.setValidate(false);
        org.apache.avro.Schema.Parser parser12 = parser0.setValidate(false);
        boolean boolean13 = parser12.getValidate();
        org.apache.avro.Schema.Parser parser14 = new org.apache.avro.Schema.Parser();
        org.apache.avro.Schema.Parser parser16 = parser14.setValidate(true);
        java.util.Map<java.lang.String, org.apache.avro.Schema> strMap17 = parser14.getTypes();
        org.apache.avro.Schema.Parser parser18 = parser12.addTypes(strMap17);
        java.io.File file19 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.avro.Schema schema20 = parser12.parse(file19);
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
        org.junit.Assert.assertNotNull(parser12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(parser16);
        org.junit.Assert.assertNotNull(strMap17);
        org.junit.Assert.assertNotNull(parser18);
    }

    @Test
    public void test1337() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SchemaM3Random300Test2.test1337");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.avro.Schema schema2 = org.apache.avro.Schema.parse("{\"type\":\"array\",\"items\":{\"type\":\"record\",\"fields\":[]}}", false);
            org.junit.Assert.fail("Expected exception of type org.apache.avro.SchemaParseException; message: No name in schema: {\"type\":\"record\",\"fields\":[]}");
        } catch (org.apache.avro.SchemaParseException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1338() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SchemaM3Random300Test2.test1338");
        org.apache.avro.Schema.LockableArrayList<org.apache.avro.Schema.Field> fieldList1 = new org.apache.avro.Schema.LockableArrayList<org.apache.avro.Schema.Field>(0);
        org.apache.avro.Schema schema2 = org.apache.avro.Schema.createRecord((java.util.List<org.apache.avro.Schema.Field>) fieldList1);
        java.lang.String str3 = schema2.getNamespace();
        org.junit.Assert.assertNotNull(schema2);
        org.junit.Assert.assertNull(str3);
    }

    @Test
    public void test1339() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SchemaM3Random300Test2.test1339");
        org.apache.avro.Schema schema1 = org.apache.avro.Schema.parse("{\"type\":\"array\",\"items\":{\"type\":\"map\",\"values\":[]}}");
        java.lang.String str2 = schema1.getFullName();
        java.lang.String str3 = schema1.getDoc();
        org.apache.avro.Schema schema4 = org.apache.avro.Schema.createMap(schema1);
        org.junit.Assert.assertNotNull(schema1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "array" + "'", str2, "array");
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(schema4);
    }

    @Test
    public void test1340() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SchemaM3Random300Test2.test1340");
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
        schema13.addProp("{\"type\":\"record\",\"fields\":[],\"{\\r\\n  \\\"type\\\" : \\\"fixed\\\",\\r\\n  \\\"name\\\" : \\\"union\\\",\\r\\n  \\\"namespace\\\" : \\\"[]\\\",\\r\\n  \\\"doc\\\" : \\\"[ ]\\\",\\r\\n  \\\"size\\\" : 0\\r\\n}\":\"[ ]\"}", "");
        schema13.addProp("double", "array");
        java.lang.String str21 = schema13.getProp("{\"type\":\"map\",\"values\":{\"type\":\"array\",\"items\":{\"type\":\"map\",\"values\":[]}}}");
        schema13.addProp("{\"type\":\"float\",\"{\\r\\n  \\\"type\\\" : \\\"record\\\",\\r\\n  \\\"fields\\\" : [ ]\\r\\n}\":\"{\\r\\n  \\\"type\\\" : \\\"map\\\",\\r\\n  \\\"values\\\" : [ ]\\r\\n}\"}", "{\"type\":\"fixed\",\"name\":\"union\",\"namespace\":\"union type:UNION pos:-1\",\"doc\":\"\",\"size\":10}");
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
        org.junit.Assert.assertNull(str21);
    }

    @Test
    public void test1341() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SchemaM3Random300Test2.test1341");
        org.apache.avro.Schema.Names names1 = new org.apache.avro.Schema.Names("{null={\"type\":\"map\",\"values\":[]}}");
    }

    @Test
    public void test1342() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SchemaM3Random300Test2.test1342");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.avro.Schema schema1 = org.apache.avro.Schema.parse("{null={\"type\":\"map\",\"values\":{\"type\":\"array\",\"items\":{\"type\":\"map\",\"values\":[]}}}}");
            org.junit.Assert.fail("Expected exception of type org.apache.avro.SchemaParseException; message: org.codehaus.jackson.JsonParseException: Unexpected character ('n' (code 110)): was expecting double-quote to start field name? at [Source: java.io.StringReader@751533ff; line: 1, column: 3]");
        } catch (org.apache.avro.SchemaParseException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1343() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SchemaM3Random300Test2.test1343");
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
        org.apache.avro.Schema schema41 = org.apache.avro.Schema.createArray(schema8);
        org.apache.avro.Schema.Type type42 = schema8.getType();
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
        org.junit.Assert.assertNotNull(schema41);
        org.junit.Assert.assertTrue("'" + type42 + "' != '" + org.apache.avro.Schema.Type.UNION + "'", type42.equals(org.apache.avro.Schema.Type.UNION));
    }

    @Test
    public void test1344() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SchemaM3Random300Test2.test1344");
        org.apache.avro.Schema.LockableArrayList<java.lang.String> strList7 = new org.apache.avro.Schema.LockableArrayList<java.lang.String>((int) '#');
        org.apache.avro.Schema.LockableArrayList<java.lang.String> strList8 = new org.apache.avro.Schema.LockableArrayList<java.lang.String>((java.util.List<java.lang.String>) strList7);
        org.apache.avro.Schema.LockableArrayList<java.lang.String> strList9 = new org.apache.avro.Schema.LockableArrayList<java.lang.String>((java.util.List<java.lang.String>) strList7);
        org.apache.avro.Schema schema10 = org.apache.avro.Schema.createEnum("array", "{\r\n  \"type\" : \"fixed\",\r\n  \"name\" : \"union\",\r\n  \"namespace\" : \"[]\",\r\n  \"doc\" : \"[ ]\",\r\n  \"size\" : 0\r\n}", "{\r\n  \"type\" : \"fixed\",\r\n  \"name\" : \"union\",\r\n  \"namespace\" : \"[]\",\r\n  \"doc\" : \"[ ]\",\r\n  \"size\" : 0\r\n}", (java.util.List<java.lang.String>) strList7);
        java.util.List<java.lang.String> strList11 = schema10.getEnumSymbols();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.avro.Schema schema12 = org.apache.avro.Schema.createEnum("{\"type\":\"fixed\",\"name\":\"union\",\"namespace\":\"{}\",\"doc\":\"hi!\",\"size\":1}", "union type:UNION pos:-1", "{\"type\":\"fixed\",\"name\":\"union\",\"namespace\":\"union type:UNION pos:-1\",\"doc\":\"\",\"size\":10}", strList11);
            org.junit.Assert.fail("Expected exception of type org.apache.avro.SchemaParseException; message: Illegal initial character: {\"type\":\"fixed\",\"name\":\"union\",\"namespace\":\"{}\",\"doc\":\"hi!\",\"size\":1}");
        } catch (org.apache.avro.SchemaParseException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(schema10);
        org.junit.Assert.assertNotNull(strList11);
    }

    @Test
    public void test1345() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SchemaM3Random300Test2.test1345");
        org.apache.avro.Schema.Names names1 = new org.apache.avro.Schema.Names("{\"type\":\"float\",\"{\\r\\n  \\\"type\\\" : \\\"record\\\",\\r\\n  \\\"fields\\\" : [ ]\\r\\n}\":\"{\\r\\n  \\\"type\\\" : \\\"map\\\",\\r\\n  \\\"values\\\" : [ ]\\r\\n}\"}");
    }

    @Test
    public void test1346() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SchemaM3Random300Test2.test1346");
        org.apache.avro.Schema.Parser parser0 = new org.apache.avro.Schema.Parser();
        java.util.Map<java.lang.String, org.apache.avro.Schema> strMap1 = parser0.getTypes();
        java.util.Map<java.lang.String, org.apache.avro.Schema> strMap2 = parser0.getTypes();
        org.apache.avro.Schema.Parser parser3 = new org.apache.avro.Schema.Parser();
        org.apache.avro.Schema.Parser parser5 = parser3.setValidate(true);
        java.util.Map<java.lang.String, org.apache.avro.Schema> strMap6 = parser3.getTypes();
        org.apache.avro.Schema.Parser parser7 = parser0.addTypes(strMap6);
        java.util.Map<java.lang.String, org.apache.avro.Schema> strMap8 = parser0.getTypes();
        org.apache.avro.Schema.Parser parser10 = parser0.setValidate(false);
        org.apache.avro.Schema.Parser parser12 = parser0.setValidate(true);
        java.io.InputStream inputStream13 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.avro.Schema schema14 = parser0.parse(inputStream13);
            org.junit.Assert.fail("Expected exception of type java.io.EOFException; message: No content to map to Object due to end of input");
        } catch (java.io.EOFException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strMap1);
        org.junit.Assert.assertNotNull(strMap2);
        org.junit.Assert.assertNotNull(parser5);
        org.junit.Assert.assertNotNull(strMap6);
        org.junit.Assert.assertNotNull(parser7);
        org.junit.Assert.assertNotNull(strMap8);
        org.junit.Assert.assertNotNull(parser10);
        org.junit.Assert.assertNotNull(parser12);
    }

    @Test
    public void test1347() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SchemaM3Random300Test2.test1347");
        org.apache.avro.Schema.Field[] fieldArray0 = new org.apache.avro.Schema.Field[] {};
        java.util.ArrayList<org.apache.avro.Schema.Field> fieldList1 = new java.util.ArrayList<org.apache.avro.Schema.Field>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<org.apache.avro.Schema.Field>) fieldList1, fieldArray0);
        org.apache.avro.Schema schema3 = org.apache.avro.Schema.createRecord((java.util.List<org.apache.avro.Schema.Field>) fieldList1);
        org.apache.avro.Schema.Field field5 = schema3.getField("");
        org.apache.avro.Schema schema6 = org.apache.avro.Schema.createMap(schema3);
        org.apache.avro.Schema.Type type7 = schema3.getType();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.avro.Schema schema8 = org.apache.avro.Schema.create(type7);
            org.junit.Assert.fail("Expected exception of type org.apache.avro.AvroRuntimeException; message: Can't create a: RECORD");
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
    public void test1348() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SchemaM3Random300Test2.test1348");
        org.apache.avro.Schema.Field[] fieldArray0 = new org.apache.avro.Schema.Field[] {};
        java.util.ArrayList<org.apache.avro.Schema.Field> fieldList1 = new java.util.ArrayList<org.apache.avro.Schema.Field>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<org.apache.avro.Schema.Field>) fieldList1, fieldArray0);
        org.apache.avro.Schema schema3 = org.apache.avro.Schema.createRecord((java.util.List<org.apache.avro.Schema.Field>) fieldList1);
        org.apache.avro.Schema schema4 = org.apache.avro.Schema.createRecord((java.util.List<org.apache.avro.Schema.Field>) fieldList1);
        org.apache.avro.Schema schema5 = org.apache.avro.Schema.createRecord((java.util.List<org.apache.avro.Schema.Field>) fieldList1);
        org.apache.avro.Schema schema6 = org.apache.avro.Schema.createRecord((java.util.List<org.apache.avro.Schema.Field>) fieldList1);
        org.apache.avro.Schema schema7 = org.apache.avro.Schema.createRecord((java.util.List<org.apache.avro.Schema.Field>) fieldList1);
        java.lang.String str8 = schema7.getName();
        java.util.Set<java.lang.String> strSet9 = schema7.getAliases();
        org.junit.Assert.assertNotNull(fieldArray0);
        org.junit.Assert.assertArrayEquals(fieldArray0, new org.apache.avro.Schema.Field[] {});
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(schema3);
        org.junit.Assert.assertNotNull(schema4);
        org.junit.Assert.assertNotNull(schema5);
        org.junit.Assert.assertNotNull(schema6);
        org.junit.Assert.assertNotNull(schema7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNotNull(strSet9);
    }

    @Test
    public void test1349() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SchemaM3Random300Test2.test1349");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.avro.Schema schema4 = org.apache.avro.Schema.createRecord("{null=null}", "{\r\n  \"type\" : \"map\",\r\n  \"values\" : {\r\n    \"type\" : \"enum\",\r\n    \"name\" : \"union\",\r\n    \"namespace\" : \"[]\",\r\n    \"doc\" : \"{}\",\r\n    \"symbols\" : [ ]\r\n  }\r\n}", "map", false);
            org.junit.Assert.fail("Expected exception of type org.apache.avro.SchemaParseException; message: Illegal initial character: {null=null}");
        } catch (org.apache.avro.SchemaParseException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1350() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SchemaM3Random300Test2.test1350");
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
        java.lang.String str11 = schema7.toString(false);
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
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "[]" + "'", str11, "[]");
    }

    @Test
    public void test1351() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SchemaM3Random300Test2.test1351");
        org.apache.avro.Schema schema2 = org.apache.avro.Schema.parse("[ ]", false);
        org.apache.avro.Schema schema3 = org.apache.avro.Schema.createMap(schema2);
        org.junit.Assert.assertNotNull(schema2);
        org.junit.Assert.assertNotNull(schema3);
    }

    @Test
    public void test1352() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SchemaM3Random300Test2.test1352");
        org.apache.avro.Schema schema4 = org.apache.avro.Schema.createFixed("union", "hi!", "{}", (int) (byte) 1);
        org.apache.avro.Schema[] schemaArray5 = new org.apache.avro.Schema[] {};
        java.util.ArrayList<org.apache.avro.Schema> schemaList6 = new java.util.ArrayList<org.apache.avro.Schema>();
        boolean boolean7 = java.util.Collections.addAll((java.util.Collection<org.apache.avro.Schema>) schemaList6, schemaArray5);
        org.apache.avro.Schema schema8 = org.apache.avro.Schema.createUnion((java.util.List<org.apache.avro.Schema>) schemaList6);
        org.apache.avro.Schema[] schemaArray9 = new org.apache.avro.Schema[] {};
        java.util.ArrayList<org.apache.avro.Schema> schemaList10 = new java.util.ArrayList<org.apache.avro.Schema>();
        boolean boolean11 = java.util.Collections.addAll((java.util.Collection<org.apache.avro.Schema>) schemaList10, schemaArray9);
        org.apache.avro.Schema schema12 = org.apache.avro.Schema.createUnion((java.util.List<org.apache.avro.Schema>) schemaList10);
        org.apache.avro.Schema schema13 = org.apache.avro.Schema.applyAliases(schema8, schema12);
        java.util.List<org.apache.avro.Schema> schemaList14 = schema13.getTypes();
        boolean boolean16 = schema13.equals((java.lang.Object) "hi!");
        java.lang.String str17 = schema13.getDoc();
        org.apache.avro.Schema schema18 = org.apache.avro.Schema.applyAliases(schema4, schema13);
        java.lang.String str20 = schema13.getProp("{}");
        org.apache.avro.Schema schema21 = org.apache.avro.Schema.createArray(schema13);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean23 = schema21.hasEnumSymbol("{\"type\":\"array\",\"items\":{\"type\":\"array\",\"items\":{\"type\":\"map\",\"values\":[]}}}");
            org.junit.Assert.fail("Expected exception of type org.apache.avro.AvroRuntimeException; message: Not an enum: {\"type\":\"array\",\"items\":[]}");
        } catch (org.apache.avro.AvroRuntimeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(schema4);
        org.junit.Assert.assertNotNull(schemaArray5);
        org.junit.Assert.assertArrayEquals(schemaArray5, new org.apache.avro.Schema[] {});
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(schema8);
        org.junit.Assert.assertNotNull(schemaArray9);
        org.junit.Assert.assertArrayEquals(schemaArray9, new org.apache.avro.Schema[] {});
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(schema12);
        org.junit.Assert.assertNotNull(schema13);
        org.junit.Assert.assertNotNull(schemaList14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertNotNull(schema18);
        org.junit.Assert.assertNull(str20);
        org.junit.Assert.assertNotNull(schema21);
    }

    @Test
    public void test1353() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SchemaM3Random300Test2.test1353");
        org.apache.avro.Schema.LockableArrayList<org.apache.avro.Schema.Field.Order> orderList0 = new org.apache.avro.Schema.LockableArrayList<org.apache.avro.Schema.Field.Order>();
    }

    @Test
    public void test1354() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SchemaM3Random300Test2.test1354");
        org.apache.avro.Schema[] schemaArray0 = new org.apache.avro.Schema[] {};
        java.util.ArrayList<org.apache.avro.Schema> schemaList1 = new java.util.ArrayList<org.apache.avro.Schema>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<org.apache.avro.Schema>) schemaList1, schemaArray0);
        org.apache.avro.Schema schema3 = org.apache.avro.Schema.createUnion((java.util.List<org.apache.avro.Schema>) schemaList1);
        java.util.List<org.apache.avro.Schema> schemaList4 = schema3.getTypes();
        org.apache.avro.Schema schema5 = org.apache.avro.Schema.createMap(schema3);
        org.apache.avro.Schema schema8 = org.apache.avro.Schema.parse("{\r\n  \"type\" : \"array\",\r\n  \"items\" : {\r\n    \"type\" : \"map\",\r\n    \"values\" : [ ]\r\n  }\r\n}", true);
        boolean boolean9 = schema3.equals((java.lang.Object) true);
        java.lang.String str10 = schema3.getFullName();
        org.apache.avro.Schema schema11 = org.apache.avro.Schema.createArray(schema3);
        schema11.addProp("{\"type\":\"array\",\"items\":{\"type\":\"map\",\"values\":[]}}", "array");
        org.apache.avro.Schema schema15 = schema11.getElementType();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean17 = schema11.hasEnumSymbol("{\r\n  \"type\" : \"array\",\r\n  \"items\" : {\r\n    \"type\" : \"map\",\r\n    \"values\" : [ ]\r\n  }\r\n}");
            org.junit.Assert.fail("Expected exception of type org.apache.avro.AvroRuntimeException; message: Not an enum: {\"type\":\"array\",\"items\":[],\"{\\\"type\\\":\\\"array\\\",\\\"items\\\":{\\\"type\\\":\\\"map\\\",\\\"values\\\":[]}}\":\"array\"}");
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
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "union" + "'", str10, "union");
        org.junit.Assert.assertNotNull(schema11);
        org.junit.Assert.assertNotNull(schema15);
    }

    @Test
    public void test1355() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SchemaM3Random300Test2.test1355");
        org.apache.avro.Schema.Type type0 = org.apache.avro.Schema.Type.INT;
        org.apache.avro.Schema schema1 = org.apache.avro.Schema.create(type0);
        org.apache.avro.Schema schema2 = org.apache.avro.Schema.createArray(schema1);
        org.apache.avro.Schema schema3 = org.apache.avro.Schema.createArray(schema1);
        java.lang.String str5 = schema3.getProp("");
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<java.lang.String> strList6 = schema3.getEnumSymbols();
            org.junit.Assert.fail("Expected exception of type org.apache.avro.AvroRuntimeException; message: Not an enum: {\"type\":\"array\",\"items\":\"int\"}");
        } catch (org.apache.avro.AvroRuntimeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + type0 + "' != '" + org.apache.avro.Schema.Type.INT + "'", type0.equals(org.apache.avro.Schema.Type.INT));
        org.junit.Assert.assertNotNull(schema1);
        org.junit.Assert.assertNotNull(schema2);
        org.junit.Assert.assertNotNull(schema3);
        org.junit.Assert.assertNull(str5);
    }

    @Test
    public void test1356() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SchemaM3Random300Test2.test1356");
        org.apache.avro.Schema schema1 = org.apache.avro.Schema.parse("{\r\n  \"type\" : \"map\",\r\n  \"values\" : {\r\n    \"type\" : \"map\",\r\n    \"values\" : [ ]\r\n  }\r\n}");
        java.lang.String str3 = schema1.toString(true);
        org.apache.avro.Schema.Type type4 = schema1.getType();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str5 = schema1.getNamespace();
            org.junit.Assert.fail("Expected exception of type org.apache.avro.AvroRuntimeException; message: Not a named type: {\"type\":\"map\",\"values\":{\"type\":\"map\",\"values\":[]}}");
        } catch (org.apache.avro.AvroRuntimeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(schema1);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "{\r\n  \"type\" : \"map\",\r\n  \"values\" : {\r\n    \"type\" : \"map\",\r\n    \"values\" : [ ]\r\n  }\r\n}" + "'", str3, "{\r\n  \"type\" : \"map\",\r\n  \"values\" : {\r\n    \"type\" : \"map\",\r\n    \"values\" : [ ]\r\n  }\r\n}");
        org.junit.Assert.assertTrue("'" + type4 + "' != '" + org.apache.avro.Schema.Type.MAP + "'", type4.equals(org.apache.avro.Schema.Type.MAP));
    }

    @Test
    public void test1357() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SchemaM3Random300Test2.test1357");
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
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean17 = schema15.hasEnumSymbol("{null={\"type\":\"map\",\"values\":{\"type\":\"array\",\"items\":{\"type\":\"map\",\"values\":[]}}}}");
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
    }

    @Test
    public void test1358() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SchemaM3Random300Test2.test1358");
        org.apache.avro.Schema.Parser parser0 = new org.apache.avro.Schema.Parser();
        java.util.Map<java.lang.String, org.apache.avro.Schema> strMap1 = parser0.getTypes();
        java.util.Map<java.lang.String, org.apache.avro.Schema> strMap2 = parser0.getTypes();
        org.apache.avro.Schema.Parser parser3 = new org.apache.avro.Schema.Parser();
        org.apache.avro.Schema.Parser parser5 = parser3.setValidate(true);
        java.util.Map<java.lang.String, org.apache.avro.Schema> strMap6 = parser3.getTypes();
        org.apache.avro.Schema.Parser parser7 = parser0.addTypes(strMap6);
        org.apache.avro.Schema.Parser parser9 = parser7.setValidate(true);
        org.apache.avro.Schema.Parser parser10 = new org.apache.avro.Schema.Parser();
        java.util.Map<java.lang.String, org.apache.avro.Schema> strMap11 = parser10.getTypes();
        java.util.Map<java.lang.String, org.apache.avro.Schema> strMap12 = parser10.getTypes();
        org.apache.avro.Schema.Parser parser13 = new org.apache.avro.Schema.Parser();
        java.util.Map<java.lang.String, org.apache.avro.Schema> strMap14 = parser13.getTypes();
        org.apache.avro.Schema.Parser parser15 = parser10.addTypes(strMap14);
        java.util.Map<java.lang.String, org.apache.avro.Schema> strMap16 = parser15.getTypes();
        org.apache.avro.Schema.Parser parser17 = parser9.addTypes(strMap16);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.avro.Schema schema19 = parser17.parse("{null={\"type\":\"map\",\"values\":[]}}");
            org.junit.Assert.fail("Expected exception of type org.apache.avro.SchemaParseException; message: org.codehaus.jackson.JsonParseException: Unexpected character ('n' (code 110)): was expecting double-quote to start field name? at [Source: java.io.StringReader@298831e0; line: 1, column: 3]");
        } catch (org.apache.avro.SchemaParseException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strMap1);
        org.junit.Assert.assertNotNull(strMap2);
        org.junit.Assert.assertNotNull(parser5);
        org.junit.Assert.assertNotNull(strMap6);
        org.junit.Assert.assertNotNull(parser7);
        org.junit.Assert.assertNotNull(parser9);
        org.junit.Assert.assertNotNull(strMap11);
        org.junit.Assert.assertNotNull(strMap12);
        org.junit.Assert.assertNotNull(strMap14);
        org.junit.Assert.assertNotNull(parser15);
        org.junit.Assert.assertNotNull(strMap16);
        org.junit.Assert.assertNotNull(parser17);
    }

    @Test
    public void test1359() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SchemaM3Random300Test2.test1359");
        org.apache.avro.Schema schema2 = org.apache.avro.Schema.parse("{\"type\":\"array\",\"items\":{\"type\":\"map\",\"values\":[]}}", false);
        java.lang.String str3 = schema2.toString();
        org.apache.avro.Schema schema4 = org.apache.avro.Schema.createMap(schema2);
        org.junit.Assert.assertNotNull(schema2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "{\"type\":\"array\",\"items\":{\"type\":\"map\",\"values\":[]}}" + "'", str3, "{\"type\":\"array\",\"items\":{\"type\":\"map\",\"values\":[]}}");
        org.junit.Assert.assertNotNull(schema4);
    }

    @Test
    public void test1360() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SchemaM3Random300Test2.test1360");
        org.apache.avro.Schema.Parser parser0 = new org.apache.avro.Schema.Parser();
        java.util.Map<java.lang.String, org.apache.avro.Schema> strMap1 = parser0.getTypes();
        java.util.Map<java.lang.String, org.apache.avro.Schema> strMap2 = parser0.getTypes();
        org.apache.avro.Schema.Parser parser3 = new org.apache.avro.Schema.Parser();
        java.util.Map<java.lang.String, org.apache.avro.Schema> strMap4 = parser3.getTypes();
        org.apache.avro.Schema.Parser parser5 = parser0.addTypes(strMap4);
        org.apache.avro.Schema schema7 = parser0.parse("{\r\n  \"type\" : \"map\",\r\n  \"values\" : [ ]\r\n}");
        org.apache.avro.Schema.Parser parser9 = parser0.setValidate(true);
        boolean boolean10 = parser9.getValidate();
        boolean boolean11 = parser9.getValidate();
        java.io.InputStream inputStream12 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.avro.Schema schema13 = parser9.parse(inputStream12);
            org.junit.Assert.fail("Expected exception of type java.io.EOFException; message: No content to map to Object due to end of input");
        } catch (java.io.EOFException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strMap1);
        org.junit.Assert.assertNotNull(strMap2);
        org.junit.Assert.assertNotNull(strMap4);
        org.junit.Assert.assertNotNull(parser5);
        org.junit.Assert.assertNotNull(schema7);
        org.junit.Assert.assertNotNull(parser9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test1361() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SchemaM3Random300Test2.test1361");
        org.apache.avro.Schema schema4 = org.apache.avro.Schema.createRecord("double", "float", "hi!", true);
        org.junit.Assert.assertNotNull(schema4);
    }

    @Test
    public void test1362() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SchemaM3Random300Test2.test1362");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.avro.Schema schema4 = org.apache.avro.Schema.createFixed("", "{\r\n  \"type\" : \"array\",\r\n  \"items\" : [ ],\r\n  \"{}\" : \"hi!\"\r\n}", "", (int) '#');
            org.junit.Assert.fail("Expected exception of type org.apache.avro.SchemaParseException; message: Empty name");
        } catch (org.apache.avro.SchemaParseException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1363() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SchemaM3Random300Test2.test1363");
        org.apache.avro.Schema.Names names1 = new org.apache.avro.Schema.Names("{\r\n  \"type\" : \"map\",\r\n  \"values\" : {\r\n    \"type\" : \"enum\",\r\n    \"name\" : \"union\",\r\n    \"namespace\" : \"[]\",\r\n    \"doc\" : \"{}\",\r\n    \"symbols\" : [ ]\r\n  }\r\n}");
        names1.space("{\"type\":\"fixed\",\"name\":\"union\",\"namespace\":\"{}\",\"doc\":\"hi!\",\"size\":1}");
    }

    @Test
    public void test1364() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SchemaM3Random300Test2.test1364");
        org.apache.avro.Schema.Field[] fieldArray0 = new org.apache.avro.Schema.Field[] {};
        java.util.ArrayList<org.apache.avro.Schema.Field> fieldList1 = new java.util.ArrayList<org.apache.avro.Schema.Field>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<org.apache.avro.Schema.Field>) fieldList1, fieldArray0);
        org.apache.avro.Schema schema3 = org.apache.avro.Schema.createRecord((java.util.List<org.apache.avro.Schema.Field>) fieldList1);
        java.util.List<org.apache.avro.Schema.Field> fieldList4 = schema3.getFields();
        org.apache.avro.Schema schema5 = org.apache.avro.Schema.createRecord(fieldList4);
        boolean boolean6 = schema5.isError();
        // The following exception was thrown during execution in test generation
        try {
            int int7 = schema5.getFixedSize();
            org.junit.Assert.fail("Expected exception of type org.apache.avro.AvroRuntimeException; message: Not fixed: {\"type\":\"record\",\"fields\":[]}");
        } catch (org.apache.avro.AvroRuntimeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(fieldArray0);
        org.junit.Assert.assertArrayEquals(fieldArray0, new org.apache.avro.Schema.Field[] {});
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(schema3);
        org.junit.Assert.assertNotNull(fieldList4);
        org.junit.Assert.assertNotNull(schema5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test1365() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SchemaM3Random300Test2.test1365");
        org.apache.avro.Schema.Parser parser0 = new org.apache.avro.Schema.Parser();
        java.util.Map<java.lang.String, org.apache.avro.Schema> strMap1 = parser0.getTypes();
        java.util.Map<java.lang.String, org.apache.avro.Schema> strMap2 = parser0.getTypes();
        org.apache.avro.Schema.Parser parser3 = new org.apache.avro.Schema.Parser();
        org.apache.avro.Schema.Parser parser5 = parser3.setValidate(true);
        java.util.Map<java.lang.String, org.apache.avro.Schema> strMap6 = parser3.getTypes();
        org.apache.avro.Schema.Parser parser7 = parser0.addTypes(strMap6);
        org.apache.avro.Schema schema9 = parser7.parse("{\"type\":\"map\",\"values\":[]}");
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
        org.junit.Assert.assertNotNull(schema9);
    }

    @Test
    public void test1366() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SchemaM3Random300Test2.test1366");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.avro.Schema schema4 = org.apache.avro.Schema.createRecord("{\"type\":\"record\",\"fields\":[],\"{\\r\\n  \\\"type\\\" : \\\"fixed\\\",\\r\\n  \\\"name\\\" : \\\"union\\\",\\r\\n  \\\"namespace\\\" : \\\"[]\\\",\\r\\n  \\\"doc\\\" : \\\"[ ]\\\",\\r\\n  \\\"size\\\" : 0\\r\\n}\":\"[ ]\"}", "{\r\n  \"type\" : \"array\",\r\n  \"items\" : [ ],\r\n  \"{}\" : \"hi!\"\r\n}", "float", true);
            org.junit.Assert.fail("Expected exception of type org.apache.avro.SchemaParseException; message: Illegal initial character: {\"type\":\"record\",\"fields\":[],\"{\\r\\n  \\\"type\\\" : \\\"fixed\\\",\\r\\n  \\\"name\\\" : \\\"union\\\",\\r\\n  \\\"namespace\\\" : \\\"[]\\\",\\r\\n  \\\"doc\\\" : \\\"[ ]\\\",\\r\\n  \\\"size\\\" : 0\\r\\n}\":\"[ ]\"}");
        } catch (org.apache.avro.SchemaParseException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1367() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SchemaM3Random300Test2.test1367");
        org.apache.avro.Schema.Names names0 = new org.apache.avro.Schema.Names();
        java.lang.String str1 = names0.space();
        names0.space("");
        java.lang.Class<?> wildcardClass4 = names0.getClass();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test1368() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SchemaM3Random300Test2.test1368");
        org.apache.avro.Schema.Names names1 = new org.apache.avro.Schema.Names("{}");
        boolean boolean2 = names1.isEmpty();
        java.lang.Object obj3 = names1.clone();
        org.apache.avro.Schema[] schemaArray4 = new org.apache.avro.Schema[] {};
        java.util.ArrayList<org.apache.avro.Schema> schemaList5 = new java.util.ArrayList<org.apache.avro.Schema>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<org.apache.avro.Schema>) schemaList5, schemaArray4);
        org.apache.avro.Schema schema7 = org.apache.avro.Schema.createUnion((java.util.List<org.apache.avro.Schema>) schemaList5);
        org.apache.avro.Schema schema8 = org.apache.avro.Schema.createUnion((java.util.List<org.apache.avro.Schema>) schemaList5);
        java.util.List<org.apache.avro.Schema> schemaList9 = schema8.getTypes();
        org.apache.avro.Schema schema10 = org.apache.avro.Schema.createUnion(schemaList9);
        boolean boolean11 = names1.equals((java.lang.Object) schemaList9);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(obj3);
        org.junit.Assert.assertEquals(obj3.toString(), "{}");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj3), "{}");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj3), "{}");
        org.junit.Assert.assertNotNull(schemaArray4);
        org.junit.Assert.assertArrayEquals(schemaArray4, new org.apache.avro.Schema[] {});
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(schema7);
        org.junit.Assert.assertNotNull(schema8);
        org.junit.Assert.assertNotNull(schemaList9);
        org.junit.Assert.assertNotNull(schema10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test1369() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SchemaM3Random300Test2.test1369");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.avro.Schema schema4 = org.apache.avro.Schema.createFixed("{\r\n  \"type\" : \"array\",\r\n  \"items\" : \"int\"\r\n}", "{\"type\":\"array\",\"items\":[]}", "{\"type\":\"array\",\"items\":[],\"union type:UNION pos:-1\":\"\"}", (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type org.apache.avro.SchemaParseException; message: Illegal initial character: {??  \"type\" : \"array\",??  \"items\" : \"int\"??}");
        } catch (org.apache.avro.SchemaParseException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1370() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SchemaM3Random300Test2.test1370");
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
            int int22 = schema8.getEnumOrdinal("\"null\"");
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
    public void test1371() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SchemaM3Random300Test2.test1371");
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
        java.lang.Class<?> wildcardClass16 = schema7.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test1372() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SchemaM3Random300Test2.test1372");
        org.apache.avro.Schema.LockableArrayList<java.util.AbstractCollection<java.lang.String>> strCollectionList0 = new org.apache.avro.Schema.LockableArrayList<java.util.AbstractCollection<java.lang.String>>();
        org.apache.avro.Schema.LockableArrayList<java.util.AbstractCollection<java.lang.String>> strCollectionList1 = new org.apache.avro.Schema.LockableArrayList<java.util.AbstractCollection<java.lang.String>>((java.util.List<java.util.AbstractCollection<java.lang.String>>) strCollectionList0);
        org.apache.avro.Schema.LockableArrayList<java.util.AbstractCollection<java.lang.String>> strCollectionList2 = new org.apache.avro.Schema.LockableArrayList<java.util.AbstractCollection<java.lang.String>>((java.util.List<java.util.AbstractCollection<java.lang.String>>) strCollectionList0);
    }

    @Test
    public void test1373() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SchemaM3Random300Test2.test1373");
        org.apache.avro.Schema.LockableArrayList<java.lang.String> strList7 = new org.apache.avro.Schema.LockableArrayList<java.lang.String>((int) (byte) 10);
        org.apache.avro.Schema schema8 = org.apache.avro.Schema.createEnum("[].union", "union type:UNION pos:-1", "union type:UNION pos:-1", (java.util.List<java.lang.String>) strList7);
        java.util.List<java.lang.String> strList9 = schema8.getEnumSymbols();
        org.apache.avro.Schema.LockableArrayList<java.lang.String> strList10 = new org.apache.avro.Schema.LockableArrayList<java.lang.String>(strList9);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.avro.Schema schema11 = org.apache.avro.Schema.createEnum("{\r\n  \"type\" : \"fixed\",\r\n  \"name\" : \"union\",\r\n  \"namespace\" : \"[]\",\r\n  \"doc\" : \"[ ]\",\r\n  \"size\" : 0\r\n}", "{null={\"type\":\"map\",\"values\":[]}}", "", strList9);
            org.junit.Assert.fail("Expected exception of type org.apache.avro.SchemaParseException; message: Illegal initial character: {??  \"type\" : \"fixed\",??  \"name\" : \"union\",??  \"namespace\" : \"[]\",??  \"doc\" : \"[ ]\",??  \"size\" : 0??}");
        } catch (org.apache.avro.SchemaParseException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(schema8);
        org.junit.Assert.assertNotNull(strList9);
    }

    @Test
    public void test1374() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SchemaM3Random300Test2.test1374");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.avro.Schema schema4 = org.apache.avro.Schema.createFixed("{\"type\":\"fixed\",\"name\":\"union\",\"namespace\":\"[]\",\"doc\":\"[ ]\",\"size\":0}", "{null={\"type\":\"map\",\"values\":{\"type\":\"array\",\"items\":{\"type\":\"map\",\"values\":[]}}}}", "", (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type org.apache.avro.SchemaParseException; message: Illegal initial character: {\"type\":\"fixed\",\"name\":\"union\",\"namespace\":\"[]\",\"doc\":\"[ ]\",\"size\":0}");
        } catch (org.apache.avro.SchemaParseException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1375() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SchemaM3Random300Test2.test1375");
        org.apache.avro.Schema.Field[] fieldArray0 = new org.apache.avro.Schema.Field[] {};
        java.util.ArrayList<org.apache.avro.Schema.Field> fieldList1 = new java.util.ArrayList<org.apache.avro.Schema.Field>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<org.apache.avro.Schema.Field>) fieldList1, fieldArray0);
        org.apache.avro.Schema schema3 = org.apache.avro.Schema.createRecord((java.util.List<org.apache.avro.Schema.Field>) fieldList1);
        org.apache.avro.Schema schema4 = org.apache.avro.Schema.createRecord((java.util.List<org.apache.avro.Schema.Field>) fieldList1);
        org.apache.avro.Schema schema5 = org.apache.avro.Schema.createRecord((java.util.List<org.apache.avro.Schema.Field>) fieldList1);
        org.apache.avro.Schema schema6 = org.apache.avro.Schema.createRecord((java.util.List<org.apache.avro.Schema.Field>) fieldList1);
        org.apache.avro.Schema schema7 = org.apache.avro.Schema.createRecord((java.util.List<org.apache.avro.Schema.Field>) fieldList1);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.avro.Schema schema8 = schema7.getElementType();
            org.junit.Assert.fail("Expected exception of type org.apache.avro.AvroRuntimeException; message: Not an array: {\"type\":\"record\",\"fields\":[]}");
        } catch (org.apache.avro.AvroRuntimeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(fieldArray0);
        org.junit.Assert.assertArrayEquals(fieldArray0, new org.apache.avro.Schema.Field[] {});
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(schema3);
        org.junit.Assert.assertNotNull(schema4);
        org.junit.Assert.assertNotNull(schema5);
        org.junit.Assert.assertNotNull(schema6);
        org.junit.Assert.assertNotNull(schema7);
    }

    @Test
    public void test1376() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SchemaM3Random300Test2.test1376");
        org.apache.avro.Schema.Names names0 = new org.apache.avro.Schema.Names();
        java.lang.String str1 = names0.toString();
        java.lang.Object obj2 = null;
        org.apache.avro.Schema schema3 = names0.remove(obj2);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "{}" + "'", str1, "{}");
        org.junit.Assert.assertNull(schema3);
    }

    @Test
    public void test1377() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SchemaM3Random300Test2.test1377");
        org.apache.avro.Schema.Parser parser0 = new org.apache.avro.Schema.Parser();
        java.util.Map<java.lang.String, org.apache.avro.Schema> strMap1 = parser0.getTypes();
        java.util.Map<java.lang.String, org.apache.avro.Schema> strMap2 = parser0.getTypes();
        org.apache.avro.Schema.Parser parser3 = new org.apache.avro.Schema.Parser();
        java.util.Map<java.lang.String, org.apache.avro.Schema> strMap4 = parser3.getTypes();
        org.apache.avro.Schema.Parser parser5 = parser0.addTypes(strMap4);
        org.apache.avro.Schema schema7 = parser0.parse("{\r\n  \"type\" : \"map\",\r\n  \"values\" : [ ]\r\n}");
        org.apache.avro.Schema.Parser parser9 = parser0.setValidate(true);
        boolean boolean10 = parser0.getValidate();
        boolean boolean11 = parser0.getValidate();
        boolean boolean12 = parser0.getValidate();
        org.junit.Assert.assertNotNull(strMap1);
        org.junit.Assert.assertNotNull(strMap2);
        org.junit.Assert.assertNotNull(strMap4);
        org.junit.Assert.assertNotNull(parser5);
        org.junit.Assert.assertNotNull(schema7);
        org.junit.Assert.assertNotNull(parser9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test1378() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SchemaM3Random300Test2.test1378");
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
            org.apache.avro.Schema schema35 = schema8.getElementType();
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
    public void test1379() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SchemaM3Random300Test2.test1379");
        org.apache.avro.Schema schema4 = org.apache.avro.Schema.createFixed("map", "", "double", (int) (short) 100);
        org.apache.avro.Schema.Type type5 = schema4.getType();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.avro.Schema schema6 = schema4.getValueType();
            org.junit.Assert.fail("Expected exception of type org.apache.avro.AvroRuntimeException; message: Not a map: {\"type\":\"fixed\",\"name\":\"map\",\"namespace\":\"double\",\"doc\":\"\",\"size\":100}");
        } catch (org.apache.avro.AvroRuntimeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(schema4);
        org.junit.Assert.assertTrue("'" + type5 + "' != '" + org.apache.avro.Schema.Type.FIXED + "'", type5.equals(org.apache.avro.Schema.Type.FIXED));
    }

    @Test
    public void test1380() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SchemaM3Random300Test2.test1380");
        org.apache.avro.Schema.Parser parser0 = new org.apache.avro.Schema.Parser();
        java.util.Map<java.lang.String, org.apache.avro.Schema> strMap1 = parser0.getTypes();
        java.util.Map<java.lang.String, org.apache.avro.Schema> strMap2 = parser0.getTypes();
        org.apache.avro.Schema.Parser parser3 = new org.apache.avro.Schema.Parser();
        org.apache.avro.Schema.Parser parser5 = parser3.setValidate(true);
        java.util.Map<java.lang.String, org.apache.avro.Schema> strMap6 = parser3.getTypes();
        org.apache.avro.Schema.Parser parser7 = parser0.addTypes(strMap6);
        org.apache.avro.Schema schema9 = parser7.parse("{\"type\":\"map\",\"values\":[]}");
        org.apache.avro.Schema.Parser parser11 = parser7.setValidate(false);
        org.apache.avro.Schema.Parser parser13 = parser7.setValidate(true);
        boolean boolean14 = parser13.getValidate();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.avro.Schema schema16 = parser13.parse("double");
            org.junit.Assert.fail("Expected exception of type org.apache.avro.SchemaParseException; message: org.codehaus.jackson.JsonParseException: Unexpected character ('d' (code 100)): expected a valid value (number, String, array, object, 'true', 'false' or 'null')? at [Source: java.io.StringReader@193a50ea; line: 1, column: 2]");
        } catch (org.apache.avro.SchemaParseException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strMap1);
        org.junit.Assert.assertNotNull(strMap2);
        org.junit.Assert.assertNotNull(parser5);
        org.junit.Assert.assertNotNull(strMap6);
        org.junit.Assert.assertNotNull(parser7);
        org.junit.Assert.assertNotNull(schema9);
        org.junit.Assert.assertNotNull(parser11);
        org.junit.Assert.assertNotNull(parser13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    }

    @Test
    public void test1381() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SchemaM3Random300Test2.test1381");
        org.apache.avro.Schema.Names names1 = new org.apache.avro.Schema.Names("{\r\n  \"type\" : \"map\",\r\n  \"values\" : {\r\n    \"type\" : \"fixed\",\r\n    \"name\" : \"union\",\r\n    \"namespace\" : \"[]\",\r\n    \"doc\" : \"[ ]\",\r\n    \"size\" : 0\r\n  }\r\n}");
    }

    @Test
    public void test1382() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SchemaM3Random300Test2.test1382");
        org.apache.avro.Schema[] schemaArray0 = new org.apache.avro.Schema[] {};
        java.util.ArrayList<org.apache.avro.Schema> schemaList1 = new java.util.ArrayList<org.apache.avro.Schema>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<org.apache.avro.Schema>) schemaList1, schemaArray0);
        org.apache.avro.Schema schema3 = org.apache.avro.Schema.createUnion((java.util.List<org.apache.avro.Schema>) schemaList1);
        java.util.List<org.apache.avro.Schema> schemaList4 = schema3.getTypes();
        org.apache.avro.Schema schema5 = org.apache.avro.Schema.createMap(schema3);
        org.apache.avro.Schema schema8 = org.apache.avro.Schema.parse("{\r\n  \"type\" : \"array\",\r\n  \"items\" : {\r\n    \"type\" : \"map\",\r\n    \"values\" : [ ]\r\n  }\r\n}", true);
        boolean boolean9 = schema3.equals((java.lang.Object) true);
        java.lang.String str10 = schema3.getFullName();
        org.apache.avro.Schema schema11 = org.apache.avro.Schema.createArray(schema3);
        schema11.addProp("{\"type\":\"array\",\"items\":{\"type\":\"map\",\"values\":[]}}", "array");
        org.apache.avro.Schema.Names names16 = new org.apache.avro.Schema.Names("{\"type\":\"record\",\"fields\":[]}");
        boolean boolean17 = names16.isEmpty();
        org.codehaus.jackson.JsonGenerator jsonGenerator18 = null;
        // The following exception was thrown during execution in test generation
        try {
            schema11.toJson(names16, jsonGenerator18);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
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
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "union" + "'", str10, "union");
        org.junit.Assert.assertNotNull(schema11);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
    }

    @Test
    public void test1383() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SchemaM3Random300Test2.test1383");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.avro.Schema schema4 = org.apache.avro.Schema.createRecord("", "{\r\n  \"type\" : \"record\",\r\n  \"fields\" : [ ],\r\n  \"{\\r\\n  \\\"type\\\" : \\\"fixed\\\",\\r\\n  \\\"name\\\" : \\\"union\\\",\\r\\n  \\\"namespace\\\" : \\\"[]\\\",\\r\\n  \\\"doc\\\" : \\\"[ ]\\\",\\r\\n  \\\"size\\\" : 0\\r\\n}\" : \"[ ]\"\r\n}", "union type:MAP pos:-1", false);
            org.junit.Assert.fail("Expected exception of type org.apache.avro.SchemaParseException; message: Empty name");
        } catch (org.apache.avro.SchemaParseException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1384() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SchemaM3Random300Test2.test1384");
        org.apache.avro.Schema.Type type0 = org.apache.avro.Schema.Type.DOUBLE;
        org.apache.avro.Schema schema1 = org.apache.avro.Schema.create(type0);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.avro.Schema schema2 = schema1.getElementType();
            org.junit.Assert.fail("Expected exception of type org.apache.avro.AvroRuntimeException; message: Not an array: \"double\"");
        } catch (org.apache.avro.AvroRuntimeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + type0 + "' != '" + org.apache.avro.Schema.Type.DOUBLE + "'", type0.equals(org.apache.avro.Schema.Type.DOUBLE));
        org.junit.Assert.assertNotNull(schema1);
    }

    @Test
    public void test1385() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SchemaM3Random300Test2.test1385");
        org.apache.avro.Schema.Parser parser0 = new org.apache.avro.Schema.Parser();
        java.util.Map<java.lang.String, org.apache.avro.Schema> strMap1 = parser0.getTypes();
        java.util.Map<java.lang.String, org.apache.avro.Schema> strMap2 = parser0.getTypes();
        org.apache.avro.Schema.Parser parser3 = new org.apache.avro.Schema.Parser();
        org.apache.avro.Schema.Parser parser5 = parser3.setValidate(true);
        java.util.Map<java.lang.String, org.apache.avro.Schema> strMap6 = parser3.getTypes();
        org.apache.avro.Schema.Parser parser7 = parser0.addTypes(strMap6);
        java.util.Map<java.lang.String, org.apache.avro.Schema> strMap8 = parser0.getTypes();
        org.apache.avro.Schema.Parser parser10 = parser0.setValidate(false);
        org.apache.avro.Schema.Parser parser12 = parser0.setValidate(false);
        org.apache.avro.Schema schema14 = parser12.parse("[].union");
        org.apache.avro.Schema schema16 = parser12.parse("{\"type\":\"array\",\"items\":{\"type\":\"map\",\"values\":[]}}");
        // The following exception was thrown during execution in test generation
        try {
            int int17 = schema16.getFixedSize();
            org.junit.Assert.fail("Expected exception of type org.apache.avro.AvroRuntimeException; message: Not fixed: {\"type\":\"array\",\"items\":{\"type\":\"map\",\"values\":[]}}");
        } catch (org.apache.avro.AvroRuntimeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strMap1);
        org.junit.Assert.assertNotNull(strMap2);
        org.junit.Assert.assertNotNull(parser5);
        org.junit.Assert.assertNotNull(strMap6);
        org.junit.Assert.assertNotNull(parser7);
        org.junit.Assert.assertNotNull(strMap8);
        org.junit.Assert.assertNotNull(parser10);
        org.junit.Assert.assertNotNull(parser12);
        org.junit.Assert.assertNotNull(schema14);
        org.junit.Assert.assertNotNull(schema16);
    }

    @Test
    public void test1386() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SchemaM3Random300Test2.test1386");
        org.apache.avro.Schema schema4 = org.apache.avro.Schema.createFixed("array", "{null={\"type\":\"map\",\"values\":{\"type\":\"array\",\"items\":{\"type\":\"map\",\"values\":[]}}}}", "{\r\n  \"type\" : \"fixed\",\r\n  \"name\" : \"union\",\r\n  \"namespace\" : \"union type:UNION pos:-1\",\r\n  \"doc\" : \"\",\r\n  \"size\" : 10\r\n}", (int) (byte) 0);
        org.junit.Assert.assertNotNull(schema4);
    }

    @Test
    public void test1387() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SchemaM3Random300Test2.test1387");
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
            org.apache.avro.Schema schema17 = parser7.parse(inputStream16);
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
    public void test1388() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SchemaM3Random300Test2.test1388");
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
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<java.lang.String> strList13 = schema11.getEnumSymbols();
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
        org.junit.Assert.assertNotNull(schema12);
    }

    @Test
    public void test1389() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SchemaM3Random300Test2.test1389");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.avro.Schema schema4 = org.apache.avro.Schema.createFixed("{\"type\":\"array\",\"items\":{\"type\":\"map\",\"values\":[]}}", "{null=null}", "\"null\"", 0);
            org.junit.Assert.fail("Expected exception of type org.apache.avro.SchemaParseException; message: Illegal initial character: {\"type\":\"array\",\"items\":{\"type\":\"map\",\"values\":[]}}");
        } catch (org.apache.avro.SchemaParseException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1390() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SchemaM3Random300Test2.test1390");
        org.apache.avro.Schema[] schemaArray0 = new org.apache.avro.Schema[] {};
        java.util.ArrayList<org.apache.avro.Schema> schemaList1 = new java.util.ArrayList<org.apache.avro.Schema>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<org.apache.avro.Schema>) schemaList1, schemaArray0);
        org.apache.avro.Schema schema3 = org.apache.avro.Schema.createUnion((java.util.List<org.apache.avro.Schema>) schemaList1);
        org.apache.avro.Schema[] schemaArray4 = new org.apache.avro.Schema[] {};
        java.util.ArrayList<org.apache.avro.Schema> schemaList5 = new java.util.ArrayList<org.apache.avro.Schema>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<org.apache.avro.Schema>) schemaList5, schemaArray4);
        org.apache.avro.Schema schema7 = org.apache.avro.Schema.createUnion((java.util.List<org.apache.avro.Schema>) schemaList5);
        org.apache.avro.Schema schema8 = org.apache.avro.Schema.applyAliases(schema3, schema7);
        org.apache.avro.Schema schema9 = org.apache.avro.Schema.createArray(schema8);
        java.lang.String str11 = schema9.toString(false);
        org.junit.Assert.assertNotNull(schemaArray0);
        org.junit.Assert.assertArrayEquals(schemaArray0, new org.apache.avro.Schema[] {});
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(schema3);
        org.junit.Assert.assertNotNull(schemaArray4);
        org.junit.Assert.assertArrayEquals(schemaArray4, new org.apache.avro.Schema[] {});
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(schema7);
        org.junit.Assert.assertNotNull(schema8);
        org.junit.Assert.assertNotNull(schema9);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "{\"type\":\"array\",\"items\":[]}" + "'", str11, "{\"type\":\"array\",\"items\":[]}");
    }

    @Test
    public void test1391() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SchemaM3Random300Test2.test1391");
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
        org.apache.avro.Schema schema25 = org.apache.avro.Schema.createMap(schema8);
        org.apache.avro.Schema.Field[] fieldArray26 = new org.apache.avro.Schema.Field[] {};
        java.util.ArrayList<org.apache.avro.Schema.Field> fieldList27 = new java.util.ArrayList<org.apache.avro.Schema.Field>();
        boolean boolean28 = java.util.Collections.addAll((java.util.Collection<org.apache.avro.Schema.Field>) fieldList27, fieldArray26);
        org.apache.avro.Schema schema29 = org.apache.avro.Schema.createRecord((java.util.List<org.apache.avro.Schema.Field>) fieldList27);
        org.apache.avro.Schema schema30 = org.apache.avro.Schema.createRecord((java.util.List<org.apache.avro.Schema.Field>) fieldList27);
        org.apache.avro.Schema schema31 = org.apache.avro.Schema.createRecord((java.util.List<org.apache.avro.Schema.Field>) fieldList27);
        org.apache.avro.Schema schema32 = org.apache.avro.Schema.createRecord((java.util.List<org.apache.avro.Schema.Field>) fieldList27);
        org.apache.avro.Schema schema33 = org.apache.avro.Schema.createRecord((java.util.List<org.apache.avro.Schema.Field>) fieldList27);
        org.apache.avro.Schema schema34 = org.apache.avro.Schema.createRecord((java.util.List<org.apache.avro.Schema.Field>) fieldList27);
        org.apache.avro.Schema schema35 = org.apache.avro.Schema.createRecord((java.util.List<org.apache.avro.Schema.Field>) fieldList27);
        // The following exception was thrown during execution in test generation
        try {
            schema25.setFields((java.util.List<org.apache.avro.Schema.Field>) fieldList27);
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
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "union" + "'", str21, "union");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "[]" + "'", str23, "[]");
        org.junit.Assert.assertNotNull(schema24);
        org.junit.Assert.assertNotNull(schema25);
        org.junit.Assert.assertNotNull(fieldArray26);
        org.junit.Assert.assertArrayEquals(fieldArray26, new org.apache.avro.Schema.Field[] {});
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNotNull(schema29);
        org.junit.Assert.assertNotNull(schema30);
        org.junit.Assert.assertNotNull(schema31);
        org.junit.Assert.assertNotNull(schema32);
        org.junit.Assert.assertNotNull(schema33);
        org.junit.Assert.assertNotNull(schema34);
        org.junit.Assert.assertNotNull(schema35);
    }

    @Test
    public void test1392() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SchemaM3Random300Test2.test1392");
        org.apache.avro.Schema.Parser parser0 = new org.apache.avro.Schema.Parser();
        java.util.Map<java.lang.String, org.apache.avro.Schema> strMap1 = parser0.getTypes();
        java.util.Map<java.lang.String, org.apache.avro.Schema> strMap2 = parser0.getTypes();
        org.apache.avro.Schema.Parser parser3 = new org.apache.avro.Schema.Parser();
        org.apache.avro.Schema.Parser parser5 = parser3.setValidate(true);
        java.util.Map<java.lang.String, org.apache.avro.Schema> strMap6 = parser3.getTypes();
        org.apache.avro.Schema.Parser parser7 = parser0.addTypes(strMap6);
        org.apache.avro.Schema.Parser parser9 = parser7.setValidate(true);
        org.apache.avro.Schema.Parser parser11 = parser7.setValidate(true);
        org.apache.avro.Schema.Parser parser13 = parser7.setValidate(true);
        org.apache.avro.Schema.Parser parser15 = parser7.setValidate(true);
        org.apache.avro.Schema.Parser parser16 = new org.apache.avro.Schema.Parser();
        java.util.Map<java.lang.String, org.apache.avro.Schema> strMap17 = parser16.getTypes();
        java.util.Map<java.lang.String, org.apache.avro.Schema> strMap18 = parser16.getTypes();
        org.apache.avro.Schema.Parser parser19 = new org.apache.avro.Schema.Parser();
        org.apache.avro.Schema.Parser parser21 = parser19.setValidate(true);
        java.util.Map<java.lang.String, org.apache.avro.Schema> strMap22 = parser19.getTypes();
        org.apache.avro.Schema.Parser parser23 = parser16.addTypes(strMap22);
        java.util.Map<java.lang.String, org.apache.avro.Schema> strMap24 = parser16.getTypes();
        org.apache.avro.Schema.Parser parser26 = parser16.setValidate(false);
        org.apache.avro.Schema.Parser parser28 = parser16.setValidate(false);
        boolean boolean29 = parser28.getValidate();
        org.apache.avro.Schema.Parser parser30 = new org.apache.avro.Schema.Parser();
        org.apache.avro.Schema.Parser parser32 = parser30.setValidate(true);
        java.util.Map<java.lang.String, org.apache.avro.Schema> strMap33 = parser30.getTypes();
        org.apache.avro.Schema.Parser parser34 = parser28.addTypes(strMap33);
        org.apache.avro.Schema.Parser parser35 = parser7.addTypes(strMap33);
        java.io.File file36 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.avro.Schema schema37 = parser35.parse(file36);
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
        org.junit.Assert.assertNotNull(parser11);
        org.junit.Assert.assertNotNull(parser13);
        org.junit.Assert.assertNotNull(parser15);
        org.junit.Assert.assertNotNull(strMap17);
        org.junit.Assert.assertNotNull(strMap18);
        org.junit.Assert.assertNotNull(parser21);
        org.junit.Assert.assertNotNull(strMap22);
        org.junit.Assert.assertNotNull(parser23);
        org.junit.Assert.assertNotNull(strMap24);
        org.junit.Assert.assertNotNull(parser26);
        org.junit.Assert.assertNotNull(parser28);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNotNull(parser32);
        org.junit.Assert.assertNotNull(strMap33);
        org.junit.Assert.assertNotNull(parser34);
        org.junit.Assert.assertNotNull(parser35);
    }

    @Test
    public void test1393() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SchemaM3Random300Test2.test1393");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.avro.Schema schema4 = org.apache.avro.Schema.createFixed("", "float", "[ ]", (-1));
            org.junit.Assert.fail("Expected exception of type org.apache.avro.SchemaParseException; message: Empty name");
        } catch (org.apache.avro.SchemaParseException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1394() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SchemaM3Random300Test2.test1394");
        org.apache.avro.Schema schema4 = org.apache.avro.Schema.createFixed("union", "hi!", "{}", (int) (byte) 1);
        org.apache.avro.Schema[] schemaArray5 = new org.apache.avro.Schema[] {};
        java.util.ArrayList<org.apache.avro.Schema> schemaList6 = new java.util.ArrayList<org.apache.avro.Schema>();
        boolean boolean7 = java.util.Collections.addAll((java.util.Collection<org.apache.avro.Schema>) schemaList6, schemaArray5);
        org.apache.avro.Schema schema8 = org.apache.avro.Schema.createUnion((java.util.List<org.apache.avro.Schema>) schemaList6);
        org.apache.avro.Schema[] schemaArray9 = new org.apache.avro.Schema[] {};
        java.util.ArrayList<org.apache.avro.Schema> schemaList10 = new java.util.ArrayList<org.apache.avro.Schema>();
        boolean boolean11 = java.util.Collections.addAll((java.util.Collection<org.apache.avro.Schema>) schemaList10, schemaArray9);
        org.apache.avro.Schema schema12 = org.apache.avro.Schema.createUnion((java.util.List<org.apache.avro.Schema>) schemaList10);
        org.apache.avro.Schema schema13 = org.apache.avro.Schema.applyAliases(schema8, schema12);
        java.util.List<org.apache.avro.Schema> schemaList14 = schema13.getTypes();
        boolean boolean16 = schema13.equals((java.lang.Object) "hi!");
        java.lang.String str17 = schema13.getDoc();
        org.apache.avro.Schema schema18 = org.apache.avro.Schema.applyAliases(schema4, schema13);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.avro.Schema schema19 = schema18.getElementType();
            org.junit.Assert.fail("Expected exception of type org.apache.avro.AvroRuntimeException; message: Not an array: {\"type\":\"fixed\",\"name\":\"union\",\"namespace\":\"{}\",\"doc\":\"hi!\",\"size\":1}");
        } catch (org.apache.avro.AvroRuntimeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(schema4);
        org.junit.Assert.assertNotNull(schemaArray5);
        org.junit.Assert.assertArrayEquals(schemaArray5, new org.apache.avro.Schema[] {});
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(schema8);
        org.junit.Assert.assertNotNull(schemaArray9);
        org.junit.Assert.assertArrayEquals(schemaArray9, new org.apache.avro.Schema[] {});
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(schema12);
        org.junit.Assert.assertNotNull(schema13);
        org.junit.Assert.assertNotNull(schemaList14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertNotNull(schema18);
    }

    @Test
    public void test1395() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SchemaM3Random300Test2.test1395");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.avro.Schema schema4 = org.apache.avro.Schema.createFixed("{\r\n  \"type\" : \"map\",\r\n  \"values\" : {\r\n    \"type\" : \"enum\",\r\n    \"name\" : \"union\",\r\n    \"namespace\" : \"[]\",\r\n    \"doc\" : \"{}\",\r\n    \"symbols\" : [ ]\r\n  }\r\n}", "", "", (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type org.apache.avro.SchemaParseException; message: Illegal initial character: {??  \"type\" : \"map\",??  \"values\" : {??    \"type\" : \"enum\",??    \"name\" : \"union\",??    \"namespace\" : \"[]\",??    \"doc\" : \"{}\",??    \"symbols\" : [ ]??  }??}");
        } catch (org.apache.avro.SchemaParseException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1396() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SchemaM3Random300Test2.test1396");
        org.apache.avro.Schema.Parser parser0 = new org.apache.avro.Schema.Parser();
        java.util.Map<java.lang.String, org.apache.avro.Schema> strMap1 = parser0.getTypes();
        java.util.Map<java.lang.String, org.apache.avro.Schema> strMap2 = parser0.getTypes();
        org.apache.avro.Schema.Parser parser3 = new org.apache.avro.Schema.Parser();
        java.util.Map<java.lang.String, org.apache.avro.Schema> strMap4 = parser3.getTypes();
        org.apache.avro.Schema.Parser parser5 = parser0.addTypes(strMap4);
        org.apache.avro.Schema schema7 = parser0.parse("{\r\n  \"type\" : \"map\",\r\n  \"values\" : [ ]\r\n}");
        org.apache.avro.Schema.Parser parser9 = parser0.setValidate(true);
        boolean boolean10 = parser0.getValidate();
        org.apache.avro.Schema.Parser parser12 = parser0.setValidate(false);
        java.io.File file13 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.avro.Schema schema14 = parser12.parse(file13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strMap1);
        org.junit.Assert.assertNotNull(strMap2);
        org.junit.Assert.assertNotNull(strMap4);
        org.junit.Assert.assertNotNull(parser5);
        org.junit.Assert.assertNotNull(schema7);
        org.junit.Assert.assertNotNull(parser9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(parser12);
    }

    @Test
    public void test1397() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SchemaM3Random300Test2.test1397");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.avro.Schema schema4 = org.apache.avro.Schema.createRecord("{\"type\":\"fixed\",\"name\":\"union\",\"namespace\":\"[]\",\"doc\":\"union type:UNION pos:-1\",\"size\":100}", "{\r\n  \"type\" : \"map\",\r\n  \"values\" : {\r\n    \"type\" : \"fixed\",\r\n    \"name\" : \"union\",\r\n    \"namespace\" : \"[]\",\r\n    \"doc\" : \"[ ]\",\r\n    \"size\" : 0\r\n  }\r\n}", "{\"type\":\"map\",\"values\":{\"type\":\"enum\",\"name\":\"union\",\"namespace\":\"[]\",\"doc\":\"{}\",\"symbols\":[]}}", true);
            org.junit.Assert.fail("Expected exception of type org.apache.avro.SchemaParseException; message: Illegal initial character: {\"type\":\"fixed\",\"name\":\"union\",\"namespace\":\"[]\",\"doc\":\"union type:UNION pos:-1\",\"size\":100}");
        } catch (org.apache.avro.SchemaParseException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1398() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SchemaM3Random300Test2.test1398");
        org.apache.avro.Schema[] schemaArray0 = new org.apache.avro.Schema[] {};
        java.util.ArrayList<org.apache.avro.Schema> schemaList1 = new java.util.ArrayList<org.apache.avro.Schema>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<org.apache.avro.Schema>) schemaList1, schemaArray0);
        org.apache.avro.Schema schema3 = org.apache.avro.Schema.createUnion((java.util.List<org.apache.avro.Schema>) schemaList1);
        org.apache.avro.Schema[] schemaArray4 = new org.apache.avro.Schema[] {};
        java.util.ArrayList<org.apache.avro.Schema> schemaList5 = new java.util.ArrayList<org.apache.avro.Schema>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<org.apache.avro.Schema>) schemaList5, schemaArray4);
        org.apache.avro.Schema schema7 = org.apache.avro.Schema.createUnion((java.util.List<org.apache.avro.Schema>) schemaList5);
        org.apache.avro.Schema schema8 = org.apache.avro.Schema.applyAliases(schema3, schema7);
        java.lang.String str10 = schema8.getProp("map");
        java.util.List<org.apache.avro.Schema> schemaList11 = schema8.getTypes();
        org.apache.avro.Schema schema12 = org.apache.avro.Schema.createUnion(schemaList11);
        org.junit.Assert.assertNotNull(schemaArray0);
        org.junit.Assert.assertArrayEquals(schemaArray0, new org.apache.avro.Schema[] {});
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(schema3);
        org.junit.Assert.assertNotNull(schemaArray4);
        org.junit.Assert.assertArrayEquals(schemaArray4, new org.apache.avro.Schema[] {});
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(schema7);
        org.junit.Assert.assertNotNull(schema8);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNotNull(schemaList11);
        org.junit.Assert.assertNotNull(schema12);
    }

    @Test
    public void test1399() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SchemaM3Random300Test2.test1399");
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
            org.apache.avro.Schema.Field field23 = schema20.getField("{\r\n  \"type\" : \"array\",\r\n  \"items\" : {\r\n    \"type\" : \"map\",\r\n    \"values\" : [ ]\r\n  }\r\n}");
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
    }

    @Test
    public void test1400() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SchemaM3Random300Test2.test1400");
        org.apache.avro.Schema.Parser parser0 = new org.apache.avro.Schema.Parser();
        java.util.Map<java.lang.String, org.apache.avro.Schema> strMap1 = parser0.getTypes();
        java.util.Map<java.lang.String, org.apache.avro.Schema> strMap2 = parser0.getTypes();
        org.apache.avro.Schema.Parser parser3 = new org.apache.avro.Schema.Parser();
        java.util.Map<java.lang.String, org.apache.avro.Schema> strMap4 = parser3.getTypes();
        org.apache.avro.Schema.Parser parser5 = parser0.addTypes(strMap4);
        org.apache.avro.Schema schema7 = parser0.parse("{\r\n  \"type\" : \"map\",\r\n  \"values\" : [ ]\r\n}");
        org.apache.avro.Schema.Parser parser9 = parser0.setValidate(true);
        boolean boolean10 = parser0.getValidate();
        org.apache.avro.Schema.Parser parser12 = parser0.setValidate(false);
        java.util.Map<java.lang.String, org.apache.avro.Schema> strMap13 = parser12.getTypes();
        org.apache.avro.Schema.Parser parser15 = parser12.setValidate(false);
        java.util.Map<java.lang.String, org.apache.avro.Schema> strMap16 = parser15.getTypes();
        org.junit.Assert.assertNotNull(strMap1);
        org.junit.Assert.assertNotNull(strMap2);
        org.junit.Assert.assertNotNull(strMap4);
        org.junit.Assert.assertNotNull(parser5);
        org.junit.Assert.assertNotNull(schema7);
        org.junit.Assert.assertNotNull(parser9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(parser12);
        org.junit.Assert.assertNotNull(strMap13);
        org.junit.Assert.assertNotNull(parser15);
        org.junit.Assert.assertNotNull(strMap16);
    }

    @Test
    public void test1401() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SchemaM3Random300Test2.test1401");
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
        org.apache.avro.Schema schema15 = parser7.parse("{\"type\":\"array\",\"items\":{\"type\":\"map\",\"values\":[]}}");
        org.apache.avro.Schema schema16 = schema15.getElementType();
        org.apache.avro.Schema schema17 = schema15.getElementType();
        org.junit.Assert.assertNotNull(strMap1);
        org.junit.Assert.assertNotNull(strMap2);
        org.junit.Assert.assertNotNull(parser5);
        org.junit.Assert.assertNotNull(strMap6);
        org.junit.Assert.assertNotNull(parser7);
        org.junit.Assert.assertNotNull(schema9);
        org.junit.Assert.assertNotNull(parser11);
        org.junit.Assert.assertNotNull(schema13);
        org.junit.Assert.assertNotNull(schema15);
        org.junit.Assert.assertNotNull(schema16);
        org.junit.Assert.assertNotNull(schema17);
    }

    @Test
    public void test1402() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SchemaM3Random300Test2.test1402");
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
        java.lang.String str23 = schema21.getProp("{\r\n  \"type\" : \"record\",\r\n  \"fields\" : [ ]\r\n}");
        java.lang.String str25 = schema21.getProp("{\"type\":\"fixed\",\"name\":\"union\",\"namespace\":\"[]\",\"doc\":\"union type:UNION pos:-1\",\"size\":100}");
        java.lang.String str27 = schema21.toString(false);
        java.lang.String str28 = schema21.getFullName();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.avro.Schema.Field field30 = schema21.getField("{\"type\":\"array\",\"items\":{\"type\":\"array\",\"items\":{\"type\":\"map\",\"values\":[]}}}");
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
        org.junit.Assert.assertNull(str23);
        org.junit.Assert.assertNull(str25);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "{\"type\":\"array\",\"items\":{\"type\":\"map\",\"values\":[]}}" + "'", str27, "{\"type\":\"array\",\"items\":{\"type\":\"map\",\"values\":[]}}");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "array" + "'", str28, "array");
    }

    @Test
    public void test1403() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SchemaM3Random300Test2.test1403");
        org.apache.avro.Schema schema4 = org.apache.avro.Schema.createFixed("union", "[ ]", "[]", 0);
        org.apache.avro.Schema.Type type5 = org.apache.avro.Schema.Type.INT;
        org.apache.avro.Schema schema6 = org.apache.avro.Schema.create(type5);
        org.apache.avro.Schema schema7 = org.apache.avro.Schema.createArray(schema6);
        org.apache.avro.Schema schema8 = org.apache.avro.Schema.applyAliases(schema4, schema7);
        java.lang.String str10 = schema7.getProp("{\"type\":\"fixed\",\"name\":\"union\",\"namespace\":\"union type:UNION pos:-1\",\"doc\":\"\",\"size\":10}");
        org.junit.Assert.assertNotNull(schema4);
        org.junit.Assert.assertTrue("'" + type5 + "' != '" + org.apache.avro.Schema.Type.INT + "'", type5.equals(org.apache.avro.Schema.Type.INT));
        org.junit.Assert.assertNotNull(schema6);
        org.junit.Assert.assertNotNull(schema7);
        org.junit.Assert.assertNotNull(schema8);
        org.junit.Assert.assertNull(str10);
    }

    @Test
    public void test1404() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SchemaM3Random300Test2.test1404");
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
        org.apache.avro.Schema schema23 = org.apache.avro.Schema.createMap(schema11);
        org.apache.avro.Schema schema24 = schema23.getValueType();
        java.lang.String str25 = schema23.getDoc();
        org.apache.avro.Schema.LockableArrayList<java.lang.String> strList27 = new org.apache.avro.Schema.LockableArrayList<java.lang.String>((int) ' ');
        boolean boolean28 = schema23.equals((java.lang.Object) strList27);
        org.apache.avro.Schema schema29 = org.apache.avro.Schema.createEnum("union", "union", "double", (java.util.List<java.lang.String>) strList27);
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<org.apache.avro.Schema.Field> fieldList30 = schema29.getFields();
            org.junit.Assert.fail("Expected exception of type org.apache.avro.AvroRuntimeException; message: Not a record: {\"type\":\"enum\",\"name\":\"union\",\"namespace\":\"double\",\"doc\":\"union\",\"symbols\":[]}");
        } catch (org.apache.avro.AvroRuntimeException e) {
            // Expected exception.
        }
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
        org.junit.Assert.assertNotNull(schema23);
        org.junit.Assert.assertNotNull(schema24);
        org.junit.Assert.assertNull(str25);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNotNull(schema29);
    }

    @Test
    public void test1405() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SchemaM3Random300Test2.test1405");
        org.apache.avro.Schema schema4 = org.apache.avro.Schema.createFixed("[].union", "union type:UNION pos:-1", "[]", (int) (short) 100);
        java.lang.String str5 = schema4.toString();
        int int6 = schema4.getFixedSize();
        java.util.Set<java.lang.String> strSet7 = schema4.getAliases();
        org.junit.Assert.assertNotNull(schema4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "{\"type\":\"fixed\",\"name\":\"union\",\"namespace\":\"[]\",\"doc\":\"union type:UNION pos:-1\",\"size\":100}" + "'", str5, "{\"type\":\"fixed\",\"name\":\"union\",\"namespace\":\"[]\",\"doc\":\"union type:UNION pos:-1\",\"size\":100}");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 100 + "'", int6 == 100);
        org.junit.Assert.assertNotNull(strSet7);
    }

    @Test
    public void test1406() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SchemaM3Random300Test2.test1406");
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
        org.apache.avro.Schema.Type type13 = schema12.getType();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.avro.Schema schema14 = org.apache.avro.Schema.create(type13);
            org.junit.Assert.fail("Expected exception of type org.apache.avro.AvroRuntimeException; message: Can't create a: MAP");
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
        org.junit.Assert.assertTrue("'" + type13 + "' != '" + org.apache.avro.Schema.Type.MAP + "'", type13.equals(org.apache.avro.Schema.Type.MAP));
    }

    @Test
    public void test1407() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SchemaM3Random300Test2.test1407");
        org.apache.avro.Schema.Parser parser0 = new org.apache.avro.Schema.Parser();
        java.util.Map<java.lang.String, org.apache.avro.Schema> strMap1 = parser0.getTypes();
        java.util.Map<java.lang.String, org.apache.avro.Schema> strMap2 = parser0.getTypes();
        org.apache.avro.Schema.Parser parser3 = new org.apache.avro.Schema.Parser();
        java.util.Map<java.lang.String, org.apache.avro.Schema> strMap4 = parser3.getTypes();
        org.apache.avro.Schema.Parser parser5 = parser0.addTypes(strMap4);
        org.apache.avro.Schema schema7 = parser0.parse("{\r\n  \"type\" : \"map\",\r\n  \"values\" : [ ]\r\n}");
        org.apache.avro.Schema.Parser parser9 = parser0.setValidate(true);
        org.apache.avro.Schema.Parser parser10 = new org.apache.avro.Schema.Parser();
        java.util.Map<java.lang.String, org.apache.avro.Schema> strMap11 = parser10.getTypes();
        java.util.Map<java.lang.String, org.apache.avro.Schema> strMap12 = parser10.getTypes();
        org.apache.avro.Schema.Parser parser13 = parser9.addTypes(strMap12);
        boolean boolean14 = parser13.getValidate();
        org.apache.avro.Schema.Parser parser16 = parser13.setValidate(true);
        java.lang.Class<?> wildcardClass17 = parser16.getClass();
        org.junit.Assert.assertNotNull(strMap1);
        org.junit.Assert.assertNotNull(strMap2);
        org.junit.Assert.assertNotNull(strMap4);
        org.junit.Assert.assertNotNull(parser5);
        org.junit.Assert.assertNotNull(schema7);
        org.junit.Assert.assertNotNull(parser9);
        org.junit.Assert.assertNotNull(strMap11);
        org.junit.Assert.assertNotNull(strMap12);
        org.junit.Assert.assertNotNull(parser13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(parser16);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test1408() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SchemaM3Random300Test2.test1408");
        org.apache.avro.Schema.Parser parser0 = new org.apache.avro.Schema.Parser();
        java.util.Map<java.lang.String, org.apache.avro.Schema> strMap1 = parser0.getTypes();
        java.util.Map<java.lang.String, org.apache.avro.Schema> strMap2 = parser0.getTypes();
        org.apache.avro.Schema.Parser parser3 = new org.apache.avro.Schema.Parser();
        org.apache.avro.Schema.Parser parser5 = parser3.setValidate(true);
        java.util.Map<java.lang.String, org.apache.avro.Schema> strMap6 = parser3.getTypes();
        org.apache.avro.Schema.Parser parser7 = parser0.addTypes(strMap6);
        org.apache.avro.Schema.Parser parser9 = parser7.setValidate(true);
        org.apache.avro.Schema.Parser parser10 = new org.apache.avro.Schema.Parser();
        java.util.Map<java.lang.String, org.apache.avro.Schema> strMap11 = parser10.getTypes();
        java.util.Map<java.lang.String, org.apache.avro.Schema> strMap12 = parser10.getTypes();
        org.apache.avro.Schema.Parser parser13 = new org.apache.avro.Schema.Parser();
        java.util.Map<java.lang.String, org.apache.avro.Schema> strMap14 = parser13.getTypes();
        org.apache.avro.Schema.Parser parser15 = parser10.addTypes(strMap14);
        java.util.Map<java.lang.String, org.apache.avro.Schema> strMap16 = parser15.getTypes();
        org.apache.avro.Schema.Parser parser17 = parser9.addTypes(strMap16);
        org.apache.avro.Schema.Parser parser19 = parser17.setValidate(false);
        java.io.InputStream inputStream20 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.avro.Schema schema21 = parser19.parse(inputStream20);
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
        org.junit.Assert.assertNotNull(strMap11);
        org.junit.Assert.assertNotNull(strMap12);
        org.junit.Assert.assertNotNull(strMap14);
        org.junit.Assert.assertNotNull(parser15);
        org.junit.Assert.assertNotNull(strMap16);
        org.junit.Assert.assertNotNull(parser17);
        org.junit.Assert.assertNotNull(parser19);
    }

    @Test
    public void test1409() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SchemaM3Random300Test2.test1409");
        org.apache.avro.Schema.Parser parser0 = new org.apache.avro.Schema.Parser();
        java.util.Map<java.lang.String, org.apache.avro.Schema> strMap1 = parser0.getTypes();
        java.util.Map<java.lang.String, org.apache.avro.Schema> strMap2 = parser0.getTypes();
        org.apache.avro.Schema.Parser parser3 = new org.apache.avro.Schema.Parser();
        org.apache.avro.Schema.Parser parser5 = parser3.setValidate(true);
        java.util.Map<java.lang.String, org.apache.avro.Schema> strMap6 = parser3.getTypes();
        org.apache.avro.Schema.Parser parser7 = parser0.addTypes(strMap6);
        org.apache.avro.Schema.Parser parser9 = parser7.setValidate(true);
        org.apache.avro.Schema.Parser parser10 = new org.apache.avro.Schema.Parser();
        java.util.Map<java.lang.String, org.apache.avro.Schema> strMap11 = parser10.getTypes();
        java.util.Map<java.lang.String, org.apache.avro.Schema> strMap12 = parser10.getTypes();
        org.apache.avro.Schema.Parser parser13 = new org.apache.avro.Schema.Parser();
        java.util.Map<java.lang.String, org.apache.avro.Schema> strMap14 = parser13.getTypes();
        org.apache.avro.Schema.Parser parser15 = parser10.addTypes(strMap14);
        java.util.Map<java.lang.String, org.apache.avro.Schema> strMap16 = parser15.getTypes();
        org.apache.avro.Schema.Parser parser17 = parser9.addTypes(strMap16);
        org.apache.avro.Schema.Parser parser19 = parser17.setValidate(false);
        boolean boolean20 = parser17.getValidate();
        java.lang.Class<?> wildcardClass21 = parser17.getClass();
        org.junit.Assert.assertNotNull(strMap1);
        org.junit.Assert.assertNotNull(strMap2);
        org.junit.Assert.assertNotNull(parser5);
        org.junit.Assert.assertNotNull(strMap6);
        org.junit.Assert.assertNotNull(parser7);
        org.junit.Assert.assertNotNull(parser9);
        org.junit.Assert.assertNotNull(strMap11);
        org.junit.Assert.assertNotNull(strMap12);
        org.junit.Assert.assertNotNull(strMap14);
        org.junit.Assert.assertNotNull(parser15);
        org.junit.Assert.assertNotNull(strMap16);
        org.junit.Assert.assertNotNull(parser17);
        org.junit.Assert.assertNotNull(parser19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test1410() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SchemaM3Random300Test2.test1410");
        org.apache.avro.Schema.Parser parser0 = new org.apache.avro.Schema.Parser();
        java.util.Map<java.lang.String, org.apache.avro.Schema> strMap1 = parser0.getTypes();
        java.util.Map<java.lang.String, org.apache.avro.Schema> strMap2 = parser0.getTypes();
        org.apache.avro.Schema.Parser parser3 = new org.apache.avro.Schema.Parser();
        org.apache.avro.Schema.Parser parser5 = parser3.setValidate(true);
        java.util.Map<java.lang.String, org.apache.avro.Schema> strMap6 = parser3.getTypes();
        org.apache.avro.Schema.Parser parser7 = parser0.addTypes(strMap6);
        org.apache.avro.Schema.Parser parser9 = parser7.setValidate(true);
        org.apache.avro.Schema.Parser parser10 = new org.apache.avro.Schema.Parser();
        java.util.Map<java.lang.String, org.apache.avro.Schema> strMap11 = parser10.getTypes();
        java.util.Map<java.lang.String, org.apache.avro.Schema> strMap12 = parser10.getTypes();
        org.apache.avro.Schema.Parser parser13 = new org.apache.avro.Schema.Parser();
        java.util.Map<java.lang.String, org.apache.avro.Schema> strMap14 = parser13.getTypes();
        org.apache.avro.Schema.Parser parser15 = parser10.addTypes(strMap14);
        java.util.Map<java.lang.String, org.apache.avro.Schema> strMap16 = parser15.getTypes();
        org.apache.avro.Schema.Parser parser17 = parser9.addTypes(strMap16);
        org.apache.avro.Schema.Parser parser19 = parser17.setValidate(false);
        org.apache.avro.Schema schema21 = parser19.parse("\"null\"");
        java.lang.String str23 = schema21.toString(false);
        org.junit.Assert.assertNotNull(strMap1);
        org.junit.Assert.assertNotNull(strMap2);
        org.junit.Assert.assertNotNull(parser5);
        org.junit.Assert.assertNotNull(strMap6);
        org.junit.Assert.assertNotNull(parser7);
        org.junit.Assert.assertNotNull(parser9);
        org.junit.Assert.assertNotNull(strMap11);
        org.junit.Assert.assertNotNull(strMap12);
        org.junit.Assert.assertNotNull(strMap14);
        org.junit.Assert.assertNotNull(parser15);
        org.junit.Assert.assertNotNull(strMap16);
        org.junit.Assert.assertNotNull(parser17);
        org.junit.Assert.assertNotNull(parser19);
        org.junit.Assert.assertNotNull(schema21);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "\"null\"" + "'", str23, "\"null\"");
    }

    @Test
    public void test1411() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SchemaM3Random300Test2.test1411");
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
        // The following exception was thrown during execution in test generation
        try {
            org.apache.avro.Schema schema11 = schema10.getValueType();
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
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "union" + "'", str9, "union");
        org.junit.Assert.assertNotNull(schema10);
    }

    @Test
    public void test1412() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SchemaM3Random300Test2.test1412");
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
            schema11.addProp("{\"type\":\"array\",\"items\":\"int\"}", "{\"type\":\"map\",\"values\":{\"type\":\"record\",\"fields\":[]}}");
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
        org.junit.Assert.assertNotNull(schema11);
    }

    @Test
    public void test1413() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SchemaM3Random300Test2.test1413");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.avro.Schema schema4 = org.apache.avro.Schema.createRecord("{\"type\":\"array\",\"items\":\"int\"}", "{\"type\":\"array\",\"items\":[],\"union type:UNION pos:-1\":\"\"}", "array", true);
            org.junit.Assert.fail("Expected exception of type org.apache.avro.SchemaParseException; message: Illegal initial character: {\"type\":\"array\",\"items\":\"int\"}");
        } catch (org.apache.avro.SchemaParseException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1414() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SchemaM3Random300Test2.test1414");
        org.apache.avro.Schema.Field[] fieldArray0 = new org.apache.avro.Schema.Field[] {};
        java.util.ArrayList<org.apache.avro.Schema.Field> fieldList1 = new java.util.ArrayList<org.apache.avro.Schema.Field>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<org.apache.avro.Schema.Field>) fieldList1, fieldArray0);
        org.apache.avro.Schema schema3 = org.apache.avro.Schema.createRecord((java.util.List<org.apache.avro.Schema.Field>) fieldList1);
        boolean boolean4 = schema3.isError();
        org.apache.avro.Schema schema5 = org.apache.avro.Schema.createArray(schema3);
        org.apache.avro.Schema.Field field7 = schema3.getField("{\"type\":\"array\",\"items\":\"int\"}");
        java.lang.String str8 = schema3.getNamespace();
        // The following exception was thrown during execution in test generation
        try {
            int int9 = schema3.getFixedSize();
            org.junit.Assert.fail("Expected exception of type org.apache.avro.AvroRuntimeException; message: Not fixed: {\"type\":\"record\",\"fields\":[]}");
        } catch (org.apache.avro.AvroRuntimeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(fieldArray0);
        org.junit.Assert.assertArrayEquals(fieldArray0, new org.apache.avro.Schema.Field[] {});
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(schema3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(schema5);
        org.junit.Assert.assertNull(field7);
        org.junit.Assert.assertNull(str8);
    }

    @Test
    public void test1415() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SchemaM3Random300Test2.test1415");
        org.apache.avro.Schema.Type type0 = org.apache.avro.Schema.Type.ARRAY;
        java.lang.Class<?> wildcardClass1 = type0.getClass();
        org.junit.Assert.assertTrue("'" + type0 + "' != '" + org.apache.avro.Schema.Type.ARRAY + "'", type0.equals(org.apache.avro.Schema.Type.ARRAY));
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test1416() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SchemaM3Random300Test2.test1416");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.avro.Schema schema1 = org.apache.avro.Schema.parse("{\r\n  \"type\" : \"record\",\r\n  \"fields\" : [ ],\r\n  \"{\\\"type\\\":\\\"array\\\",\\\"items\\\":[],\\\"union type:UNION pos:-1\\\":\\\"\\\"}\" : \"{null={\\\"type\\\":\\\"map\\\",\\\"values\\\":[]}}\"\r\n}");
            org.junit.Assert.fail("Expected exception of type org.apache.avro.SchemaParseException; message: No name in schema: {\"type\":\"record\",\"fields\":[],\"{\\\"type\\\":\\\"array\\\",\\\"items\\\":[],\\\"union type:UNION pos:-1\\\":\\\"\\\"}\":\"{null={\\\"type\\\":\\\"map\\\",\\\"values\\\":[]}}\"}");
        } catch (org.apache.avro.SchemaParseException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1417() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SchemaM3Random300Test2.test1417");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.avro.Schema schema4 = org.apache.avro.Schema.createFixed("{\r\n  \"type\" : \"map\",\r\n  \"values\" : [ ]\r\n}", "", "{\r\n  \"type\" : \"fixed\",\r\n  \"name\" : \"union\",\r\n  \"namespace\" : \"[]\",\r\n  \"doc\" : \"[ ]\",\r\n  \"size\" : 0,\r\n  \"{\\r\\n  \\\"type\\\" : \\\"fixed\\\",\\r\\n  \\\"name\\\" : \\\"union\\\",\\r\\n  \\\"namespace\\\" : \\\"[]\\\",\\r\\n  \\\"doc\\\" : \\\"[ ]\\\",\\r\\n  \\\"size\\\" : 0\\r\\n}\" : \"{\\r\\n  \\\"type\\\" : \\\"map\\\",\\r\\n  \\\"values\\\" : {\\r\\n    \\\"type\\\" : \\\"map\\\",\\r\\n    \\\"values\\\" : [ ]\\r\\n  }\\r\\n}\"\r\n}", (-1));
            org.junit.Assert.fail("Expected exception of type org.apache.avro.SchemaParseException; message: Illegal initial character: {??  \"type\" : \"map\",??  \"values\" : [ ]??}");
        } catch (org.apache.avro.SchemaParseException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1418() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SchemaM3Random300Test2.test1418");
        org.apache.avro.Schema.Parser parser0 = new org.apache.avro.Schema.Parser();
        java.util.Map<java.lang.String, org.apache.avro.Schema> strMap1 = parser0.getTypes();
        java.util.Map<java.lang.String, org.apache.avro.Schema> strMap2 = parser0.getTypes();
        org.apache.avro.Schema.Parser parser3 = new org.apache.avro.Schema.Parser();
        java.util.Map<java.lang.String, org.apache.avro.Schema> strMap4 = parser3.getTypes();
        org.apache.avro.Schema.Parser parser5 = parser0.addTypes(strMap4);
        org.apache.avro.Schema schema7 = parser0.parse("{\r\n  \"type\" : \"map\",\r\n  \"values\" : [ ]\r\n}");
        org.apache.avro.Schema schema8 = schema7.getValueType();
        org.apache.avro.Schema schema9 = org.apache.avro.Schema.createArray(schema7);
        java.lang.String str10 = schema9.toString();
        org.junit.Assert.assertNotNull(strMap1);
        org.junit.Assert.assertNotNull(strMap2);
        org.junit.Assert.assertNotNull(strMap4);
        org.junit.Assert.assertNotNull(parser5);
        org.junit.Assert.assertNotNull(schema7);
        org.junit.Assert.assertNotNull(schema8);
        org.junit.Assert.assertNotNull(schema9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "{\"type\":\"array\",\"items\":{\"type\":\"map\",\"values\":[]}}" + "'", str10, "{\"type\":\"array\",\"items\":{\"type\":\"map\",\"values\":[]}}");
    }

    @Test
    public void test1419() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SchemaM3Random300Test2.test1419");
        org.apache.avro.Schema.Parser parser0 = new org.apache.avro.Schema.Parser();
        java.util.Map<java.lang.String, org.apache.avro.Schema> strMap1 = parser0.getTypes();
        java.util.Map<java.lang.String, org.apache.avro.Schema> strMap2 = parser0.getTypes();
        org.apache.avro.Schema.Parser parser3 = new org.apache.avro.Schema.Parser();
        org.apache.avro.Schema.Parser parser5 = parser3.setValidate(true);
        java.util.Map<java.lang.String, org.apache.avro.Schema> strMap6 = parser3.getTypes();
        org.apache.avro.Schema.Parser parser7 = parser0.addTypes(strMap6);
        org.apache.avro.Schema.Parser parser9 = parser7.setValidate(true);
        org.apache.avro.Schema.Parser parser11 = parser7.setValidate(true);
        boolean boolean12 = parser7.getValidate();
        boolean boolean13 = parser7.getValidate();
        org.junit.Assert.assertNotNull(strMap1);
        org.junit.Assert.assertNotNull(strMap2);
        org.junit.Assert.assertNotNull(parser5);
        org.junit.Assert.assertNotNull(strMap6);
        org.junit.Assert.assertNotNull(parser7);
        org.junit.Assert.assertNotNull(parser9);
        org.junit.Assert.assertNotNull(parser11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
    }

    @Test
    public void test1420() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SchemaM3Random300Test2.test1420");
        org.apache.avro.Schema.Field[] fieldArray0 = new org.apache.avro.Schema.Field[] {};
        java.util.ArrayList<org.apache.avro.Schema.Field> fieldList1 = new java.util.ArrayList<org.apache.avro.Schema.Field>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<org.apache.avro.Schema.Field>) fieldList1, fieldArray0);
        org.apache.avro.Schema schema3 = org.apache.avro.Schema.createRecord((java.util.List<org.apache.avro.Schema.Field>) fieldList1);
        org.apache.avro.Schema schema4 = org.apache.avro.Schema.createRecord((java.util.List<org.apache.avro.Schema.Field>) fieldList1);
        org.apache.avro.Schema schema5 = org.apache.avro.Schema.createRecord((java.util.List<org.apache.avro.Schema.Field>) fieldList1);
        org.apache.avro.Schema schema6 = org.apache.avro.Schema.createRecord((java.util.List<org.apache.avro.Schema.Field>) fieldList1);
        org.apache.avro.Schema schema7 = org.apache.avro.Schema.createRecord((java.util.List<org.apache.avro.Schema.Field>) fieldList1);
        org.apache.avro.Schema schema8 = org.apache.avro.Schema.createRecord((java.util.List<org.apache.avro.Schema.Field>) fieldList1);
        org.apache.avro.Schema schema9 = org.apache.avro.Schema.createRecord((java.util.List<org.apache.avro.Schema.Field>) fieldList1);
        org.apache.avro.Schema schema10 = org.apache.avro.Schema.createRecord((java.util.List<org.apache.avro.Schema.Field>) fieldList1);
        org.apache.avro.Schema schema11 = org.apache.avro.Schema.createRecord((java.util.List<org.apache.avro.Schema.Field>) fieldList1);
        org.junit.Assert.assertNotNull(fieldArray0);
        org.junit.Assert.assertArrayEquals(fieldArray0, new org.apache.avro.Schema.Field[] {});
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(schema3);
        org.junit.Assert.assertNotNull(schema4);
        org.junit.Assert.assertNotNull(schema5);
        org.junit.Assert.assertNotNull(schema6);
        org.junit.Assert.assertNotNull(schema7);
        org.junit.Assert.assertNotNull(schema8);
        org.junit.Assert.assertNotNull(schema9);
        org.junit.Assert.assertNotNull(schema10);
        org.junit.Assert.assertNotNull(schema11);
    }

    @Test
    public void test1421() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SchemaM3Random300Test2.test1421");
        org.apache.avro.Schema.Parser parser0 = new org.apache.avro.Schema.Parser();
        java.util.Map<java.lang.String, org.apache.avro.Schema> strMap1 = parser0.getTypes();
        java.util.Map<java.lang.String, org.apache.avro.Schema> strMap2 = parser0.getTypes();
        org.apache.avro.Schema.Parser parser3 = new org.apache.avro.Schema.Parser();
        java.util.Map<java.lang.String, org.apache.avro.Schema> strMap4 = parser3.getTypes();
        org.apache.avro.Schema.Parser parser5 = parser0.addTypes(strMap4);
        org.apache.avro.Schema schema7 = parser0.parse("{\r\n  \"type\" : \"map\",\r\n  \"values\" : [ ]\r\n}");
        org.apache.avro.Schema.Parser parser9 = parser0.setValidate(true);
        boolean boolean10 = parser9.getValidate();
        boolean boolean11 = parser9.getValidate();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.avro.Schema schema13 = parser9.parse("union type:MAP pos:-1");
            org.junit.Assert.fail("Expected exception of type org.apache.avro.SchemaParseException; message: org.codehaus.jackson.JsonParseException: Unexpected character ('u' (code 117)): expected a valid value (number, String, array, object, 'true', 'false' or 'null')? at [Source: java.io.StringReader@2c951a16; line: 1, column: 2]");
        } catch (org.apache.avro.SchemaParseException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strMap1);
        org.junit.Assert.assertNotNull(strMap2);
        org.junit.Assert.assertNotNull(strMap4);
        org.junit.Assert.assertNotNull(parser5);
        org.junit.Assert.assertNotNull(schema7);
        org.junit.Assert.assertNotNull(parser9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test1422() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SchemaM3Random300Test2.test1422");
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
        org.apache.avro.Schema schema12 = org.apache.avro.Schema.createMap(schema8);
        // The following exception was thrown during execution in test generation
        try {
            schema8.addProp("{\"type\":\"array\",\"items\":[]}", "{\"type\":\"array\",\"items\":{\"type\":\"map\",\"values\":[]},\"union type:MAP pos:-1\":\"{\\\"type\\\":\\\"array\\\",\\\"items\\\":{\\\"type\\\":\\\"map\\\",\\\"values\\\":[]}}\"}");
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
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNotNull(schema12);
    }

    @Test
    public void test1423() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SchemaM3Random300Test2.test1423");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.avro.Schema schema4 = org.apache.avro.Schema.createFixed("union type:UNION pos:-1", "{}.union", "[].union", (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type org.apache.avro.SchemaParseException; message: Illegal character in: union type:UNION pos:-1");
        } catch (org.apache.avro.SchemaParseException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1424() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SchemaM3Random300Test2.test1424");
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
        java.lang.String str16 = schema7.getDoc();
        java.util.List<org.apache.avro.Schema> schemaList17 = schema7.getTypes();
        java.lang.String str19 = schema7.getProp("{\"type\":\"fixed\",\"name\":\"union\",\"namespace\":\"union type:UNION pos:-1\",\"doc\":\"\",\"size\":10}");
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
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertNotNull(schemaList17);
        org.junit.Assert.assertNull(str19);
    }

    @Test
    public void test1425() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SchemaM3Random300Test2.test1425");
        org.apache.avro.Schema.LockableArrayList<org.apache.avro.Schema.Field> fieldList1 = new org.apache.avro.Schema.LockableArrayList<org.apache.avro.Schema.Field>((int) (byte) 100);
        org.apache.avro.Schema schema2 = org.apache.avro.Schema.createRecord((java.util.List<org.apache.avro.Schema.Field>) fieldList1);
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<org.apache.avro.Schema> schemaList3 = schema2.getTypes();
            org.junit.Assert.fail("Expected exception of type org.apache.avro.AvroRuntimeException; message: Not a union: {\"type\":\"record\",\"fields\":[]}");
        } catch (org.apache.avro.AvroRuntimeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(schema2);
    }

    @Test
    public void test1426() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SchemaM3Random300Test2.test1426");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.avro.Schema schema4 = org.apache.avro.Schema.createFixed("{\r\n  \"type\" : \"record\",\r\n  \"fields\" : [ ],\r\n  \"{\\\"type\\\":\\\"array\\\",\\\"items\\\":[],\\\"union type:UNION pos:-1\\\":\\\"\\\"}\" : \"{null={\\\"type\\\":\\\"map\\\",\\\"values\\\":[]}}\"\r\n}", "{\"type\":\"float\",\"{\\r\\n  \\\"type\\\" : \\\"record\\\",\\r\\n  \\\"fields\\\" : [ ]\\r\\n}\":\"{\\r\\n  \\\"type\\\" : \\\"map\\\",\\r\\n  \\\"values\\\" : [ ]\\r\\n}\"}", "{\"type\":\"array\",\"items\":[],\"union type:UNION pos:-1\":\"\"}", (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type org.apache.avro.SchemaParseException; message: Illegal initial character: {??  \"type\" : \"record\",??  \"fields\" : [ ],??  \"{\\\"type\\\":\\\"array\\\",\\\"items\\\":[],\\\"union type:UNION pos:-1\\\":\\\"\\\"}\" : \"{null={\\\"type\\\":\\\"map\\\",\\\"values\\\":[]}}\"??}");
        } catch (org.apache.avro.SchemaParseException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1427() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SchemaM3Random300Test2.test1427");
        org.apache.avro.Schema schema2 = org.apache.avro.Schema.parse("{\"type\":\"fixed\",\"name\":\"union\",\"namespace\":\"{}\",\"doc\":\"hi!\",\"size\":1}", false);
        java.util.Set<java.lang.String> strSet3 = schema2.getAliases();
        org.junit.Assert.assertNotNull(schema2);
        org.junit.Assert.assertNotNull(strSet3);
    }

    @Test
    public void test1428() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SchemaM3Random300Test2.test1428");
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
        org.apache.avro.Schema.Type type24 = schema8.getType();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.avro.Schema schema25 = org.apache.avro.Schema.create(type24);
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
        org.junit.Assert.assertTrue("'" + type24 + "' != '" + org.apache.avro.Schema.Type.UNION + "'", type24.equals(org.apache.avro.Schema.Type.UNION));
    }

    @Test
    public void test1429() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SchemaM3Random300Test2.test1429");
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
            boolean boolean11 = schema9.hasEnumSymbol("map");
            org.junit.Assert.fail("Expected exception of type org.apache.avro.AvroRuntimeException; message: Not an enum: {\"type\":\"map\",\"values\":[]}");
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
    public void test1430() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SchemaM3Random300Test2.test1430");
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
        java.lang.String str22 = schema8.toString();
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
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "[]" + "'", str22, "[]");
    }

    @Test
    public void test1431() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SchemaM3Random300Test2.test1431");
        org.apache.avro.Schema.LockableArrayList<java.lang.String> strList4 = new org.apache.avro.Schema.LockableArrayList<java.lang.String>((int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.avro.Schema schema5 = org.apache.avro.Schema.createEnum("{\"type\":\"double\",\"float\":\"{\\\"type\\\":\\\"array\\\",\\\"items\\\":[]}\"}", "{\"type\":\"map\",\"values\":[],\"\\\"double\\\"\":\"{\\\"type\\\":\\\"array\\\",\\\"items\\\":\\\"int\\\"}\"}", "{\"type\":\"map\",\"values\":{\"type\":\"array\",\"items\":{\"type\":\"map\",\"values\":[]}}}", (java.util.List<java.lang.String>) strList4);
            org.junit.Assert.fail("Expected exception of type org.apache.avro.SchemaParseException; message: Illegal initial character: {\"type\":\"double\",\"float\":\"{\\\"type\\\":\\\"array\\\",\\\"items\\\":[]}\"}");
        } catch (org.apache.avro.SchemaParseException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1432() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SchemaM3Random300Test2.test1432");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.avro.Schema schema4 = org.apache.avro.Schema.createFixed("{\r\n  \"type\" : \"fixed\",\r\n  \"name\" : \"union\",\r\n  \"namespace\" : \"[]\",\r\n  \"doc\" : \"[ ]\",\r\n  \"size\" : 0\r\n}", "{\r\n  \"type\" : \"fixed\",\r\n  \"name\" : \"union\",\r\n  \"namespace\" : \"[]\",\r\n  \"doc\" : \"[ ]\",\r\n  \"size\" : 0\r\n}", "{\"type\":\"map\",\"values\":{\"type\":\"array\",\"items\":{\"type\":\"map\",\"values\":[]}}}", 10);
            org.junit.Assert.fail("Expected exception of type org.apache.avro.SchemaParseException; message: Illegal initial character: {??  \"type\" : \"fixed\",??  \"name\" : \"union\",??  \"namespace\" : \"[]\",??  \"doc\" : \"[ ]\",??  \"size\" : 0??}");
        } catch (org.apache.avro.SchemaParseException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1433() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SchemaM3Random300Test2.test1433");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.avro.Schema schema4 = org.apache.avro.Schema.createRecord("", "{\"type\":\"fixed\",\"name\":\"union\",\"namespace\":\"[]\",\"doc\":\"{\\r\\n  \\\"type\\\" : \\\"map\\\",\\r\\n  \\\"values\\\" : [ ]\\r\\n}\",\"size\":10}", "{\"type\":\"fixed\",\"name\":\"union\",\"namespace\":\"[]\",\"doc\":\"{\\r\\n  \\\"type\\\" : \\\"map\\\",\\r\\n  \\\"values\\\" : [ ]\\r\\n}\",\"size\":10}", false);
            org.junit.Assert.fail("Expected exception of type org.apache.avro.SchemaParseException; message: Empty name");
        } catch (org.apache.avro.SchemaParseException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1434() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SchemaM3Random300Test2.test1434");
        org.apache.avro.Schema.Names names1 = new org.apache.avro.Schema.Names("{null={\"type\":\"record\",\"fields\":[]}}");
    }

    @Test
    public void test1435() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SchemaM3Random300Test2.test1435");
        org.apache.avro.Schema schema1 = org.apache.avro.Schema.parse("{\"type\":\"fixed\",\"name\":\"union\",\"namespace\":\"[]\",\"doc\":\"union type:UNION pos:-1\",\"size\":100}");
        org.junit.Assert.assertNotNull(schema1);
    }

    @Test
    public void test1436() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SchemaM3Random300Test2.test1436");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.avro.Schema schema4 = org.apache.avro.Schema.createRecord("{\"type\":\"map\",\"values\":[]}", "", "", true);
            org.junit.Assert.fail("Expected exception of type org.apache.avro.SchemaParseException; message: Illegal initial character: {\"type\":\"map\",\"values\":[]}");
        } catch (org.apache.avro.SchemaParseException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1437() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SchemaM3Random300Test2.test1437");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.avro.Schema schema4 = org.apache.avro.Schema.createFixed("{\r\n  \"type\" : \"fixed\",\r\n  \"name\" : \"union\",\r\n  \"namespace\" : \"[]\",\r\n  \"doc\" : \"[ ]\",\r\n  \"size\" : 0,\r\n  \"{\\r\\n  \\\"type\\\" : \\\"fixed\\\",\\r\\n  \\\"name\\\" : \\\"union\\\",\\r\\n  \\\"namespace\\\" : \\\"[]\\\",\\r\\n  \\\"doc\\\" : \\\"[ ]\\\",\\r\\n  \\\"size\\\" : 0\\r\\n}\" : \"{\\r\\n  \\\"type\\\" : \\\"map\\\",\\r\\n  \\\"values\\\" : {\\r\\n    \\\"type\\\" : \\\"map\\\",\\r\\n    \\\"values\\\" : [ ]\\r\\n  }\\r\\n}\"\r\n}", "{\r\n  \"type\" : \"array\",\r\n  \"items\" : \"int\"\r\n}", "{\"type\":\"array\",\"items\":[]}", 0);
            org.junit.Assert.fail("Expected exception of type org.apache.avro.SchemaParseException; message: Illegal initial character: {??  \"type\" : \"fixed\",??  \"name\" : \"union\",??  \"namespace\" : \"[]\",??  \"doc\" : \"[ ]\",??  \"size\" : 0,??  \"{\\r\\n  \\\"type\\\" : \\\"fixed\\\",\\r\\n  \\\"name\\\" : \\\"union\\\",\\r\\n  \\\"namespace\\\" : \\\"[]\\\",\\r\\n  \\\"doc\\\" : \\\"[ ]\\\",\\r\\n  \\\"size\\\" : 0\\r\\n}\" : \"{\\r\\n  \\\"type\\\" : \\\"map\\\",\\r\\n  \\\"values\\\" : {\\r\\n    \\\"type\\\" : \\\"map\\\",\\r\\n    \\\"values\\\" : [ ]\\r\\n  }\\r\\n}\"??}");
        } catch (org.apache.avro.SchemaParseException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1438() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SchemaM3Random300Test2.test1438");
        org.apache.avro.Schema.Parser parser0 = new org.apache.avro.Schema.Parser();
        java.util.Map<java.lang.String, org.apache.avro.Schema> strMap1 = parser0.getTypes();
        java.util.Map<java.lang.String, org.apache.avro.Schema> strMap2 = parser0.getTypes();
        org.apache.avro.Schema.Parser parser3 = new org.apache.avro.Schema.Parser();
        java.util.Map<java.lang.String, org.apache.avro.Schema> strMap4 = parser3.getTypes();
        org.apache.avro.Schema.Parser parser5 = parser0.addTypes(strMap4);
        org.apache.avro.Schema schema7 = parser0.parse("{\r\n  \"type\" : \"map\",\r\n  \"values\" : [ ]\r\n}");
        org.apache.avro.Schema.Parser parser9 = parser0.setValidate(true);
        boolean boolean10 = parser0.getValidate();
        org.apache.avro.Schema.Parser parser12 = parser0.setValidate(false);
        java.io.File file13 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.avro.Schema schema14 = parser0.parse(file13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strMap1);
        org.junit.Assert.assertNotNull(strMap2);
        org.junit.Assert.assertNotNull(strMap4);
        org.junit.Assert.assertNotNull(parser5);
        org.junit.Assert.assertNotNull(schema7);
        org.junit.Assert.assertNotNull(parser9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(parser12);
    }

    @Test
    public void test1439() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SchemaM3Random300Test2.test1439");
        org.apache.avro.Schema schema2 = org.apache.avro.Schema.parse("{\r\n  \"type\" : \"array\",\r\n  \"items\" : [ ],\r\n  \"{}\" : \"hi!\"\r\n}", false);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str3 = schema2.getNamespace();
            org.junit.Assert.fail("Expected exception of type org.apache.avro.AvroRuntimeException; message: Not a named type: {\"type\":\"array\",\"items\":[],\"{}\":\"hi!\"}");
        } catch (org.apache.avro.AvroRuntimeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(schema2);
    }

    @Test
    public void test1440() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SchemaM3Random300Test2.test1440");
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
        boolean boolean16 = parser0.getValidate();
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
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
    }

    @Test
    public void test1441() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SchemaM3Random300Test2.test1441");
        org.apache.avro.Schema.Names names1 = new org.apache.avro.Schema.Names("{\"type\":\"record\",\"fields\":[],\"{\\r\\n  \\\"type\\\" : \\\"fixed\\\",\\r\\n  \\\"name\\\" : \\\"union\\\",\\r\\n  \\\"namespace\\\" : \\\"[]\\\",\\r\\n  \\\"doc\\\" : \\\"[ ]\\\",\\r\\n  \\\"size\\\" : 0\\r\\n}\":\"[ ]\"}");
        org.apache.avro.Schema.Type type2 = org.apache.avro.Schema.Type.INT;
        org.apache.avro.Schema schema3 = org.apache.avro.Schema.create(type2);
        org.apache.avro.Schema schema4 = org.apache.avro.Schema.createArray(schema3);
        org.apache.avro.Schema schema5 = org.apache.avro.Schema.createMap(schema4);
        boolean boolean6 = names1.containsKey((java.lang.Object) schema5);
        org.apache.avro.Schema schema7 = org.apache.avro.Schema.createArray(schema5);
        java.lang.String str9 = schema5.toString(false);
        org.junit.Assert.assertTrue("'" + type2 + "' != '" + org.apache.avro.Schema.Type.INT + "'", type2.equals(org.apache.avro.Schema.Type.INT));
        org.junit.Assert.assertNotNull(schema3);
        org.junit.Assert.assertNotNull(schema4);
        org.junit.Assert.assertNotNull(schema5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(schema7);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "{\"type\":\"map\",\"values\":{\"type\":\"array\",\"items\":\"int\"}}" + "'", str9, "{\"type\":\"map\",\"values\":{\"type\":\"array\",\"items\":\"int\"}}");
    }

    @Test
    public void test1442() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SchemaM3Random300Test2.test1442");
        org.apache.avro.Schema.Parser parser0 = new org.apache.avro.Schema.Parser();
        java.util.Map<java.lang.String, org.apache.avro.Schema> strMap1 = parser0.getTypes();
        java.util.Map<java.lang.String, org.apache.avro.Schema> strMap2 = parser0.getTypes();
        org.apache.avro.Schema.Parser parser3 = new org.apache.avro.Schema.Parser();
        java.util.Map<java.lang.String, org.apache.avro.Schema> strMap4 = parser3.getTypes();
        org.apache.avro.Schema.Parser parser5 = parser0.addTypes(strMap4);
        org.apache.avro.Schema schema7 = parser0.parse("{\r\n  \"type\" : \"map\",\r\n  \"values\" : [ ]\r\n}");
        org.apache.avro.Schema schema9 = parser0.parse("{\r\n  \"type\" : \"array\",\r\n  \"items\" : [ ]\r\n}");
        boolean boolean10 = parser0.getValidate();
        org.junit.Assert.assertNotNull(strMap1);
        org.junit.Assert.assertNotNull(strMap2);
        org.junit.Assert.assertNotNull(strMap4);
        org.junit.Assert.assertNotNull(parser5);
        org.junit.Assert.assertNotNull(schema7);
        org.junit.Assert.assertNotNull(schema9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test1443() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SchemaM3Random300Test2.test1443");
        org.apache.avro.Schema schema4 = org.apache.avro.Schema.createFixed("[].union", "union type:UNION pos:-1", "[]", (int) (short) 100);
        java.lang.String str5 = schema4.getName();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.avro.Schema schema6 = schema4.getElementType();
            org.junit.Assert.fail("Expected exception of type org.apache.avro.AvroRuntimeException; message: Not an array: {\"type\":\"fixed\",\"name\":\"union\",\"namespace\":\"[]\",\"doc\":\"union type:UNION pos:-1\",\"size\":100}");
        } catch (org.apache.avro.AvroRuntimeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(schema4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "union" + "'", str5, "union");
    }

    @Test
    public void test1444() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SchemaM3Random300Test2.test1444");
        org.apache.avro.Schema.Parser parser0 = new org.apache.avro.Schema.Parser();
        org.apache.avro.Schema.Parser parser2 = parser0.setValidate(true);
        java.util.Map<java.lang.String, org.apache.avro.Schema> strMap3 = parser2.getTypes();
        org.junit.Assert.assertNotNull(parser2);
        org.junit.Assert.assertNotNull(strMap3);
    }

    @Test
    public void test1445() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SchemaM3Random300Test2.test1445");
        org.apache.avro.Schema.Parser parser0 = new org.apache.avro.Schema.Parser();
        java.util.Map<java.lang.String, org.apache.avro.Schema> strMap1 = parser0.getTypes();
        org.apache.avro.Schema.Parser parser2 = new org.apache.avro.Schema.Parser();
        org.apache.avro.Schema.Parser parser4 = parser2.setValidate(true);
        java.util.Map<java.lang.String, org.apache.avro.Schema> strMap5 = parser2.getTypes();
        org.apache.avro.Schema.Parser parser6 = parser0.addTypes(strMap5);
        boolean boolean7 = parser6.getValidate();
        org.apache.avro.Schema.Parser parser9 = parser6.setValidate(true);
        org.apache.avro.Schema.Parser parser11 = parser6.setValidate(true);
        java.io.File file12 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.avro.Schema schema13 = parser11.parse(file12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strMap1);
        org.junit.Assert.assertNotNull(parser4);
        org.junit.Assert.assertNotNull(strMap5);
        org.junit.Assert.assertNotNull(parser6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(parser9);
        org.junit.Assert.assertNotNull(parser11);
    }

    @Test
    public void test1446() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SchemaM3Random300Test2.test1446");
        org.apache.avro.Schema schema4 = org.apache.avro.Schema.createFixed("int", "[].union", "{\"type\":\"record\",\"fields\":[]}", (int) (byte) 100);
        java.lang.String str5 = schema4.getDoc();
        org.junit.Assert.assertNotNull(schema4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "[].union" + "'", str5, "[].union");
    }

    @Test
    public void test1447() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SchemaM3Random300Test2.test1447");
        org.apache.avro.Schema.Names names1 = new org.apache.avro.Schema.Names("{}");
        java.lang.Object obj2 = names1.clone();
        names1.clear();
        int int4 = names1.size();
        int int5 = names1.size();
        org.junit.Assert.assertNotNull(obj2);
        org.junit.Assert.assertEquals(obj2.toString(), "{}");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj2), "{}");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj2), "{}");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
    }

    @Test
    public void test1448() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SchemaM3Random300Test2.test1448");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.avro.Schema schema4 = org.apache.avro.Schema.createFixed("{\r\n  \"type\" : \"record\",\r\n  \"fields\" : [ ],\r\n  \"{\\\"type\\\":\\\"array\\\",\\\"items\\\":[],\\\"union type:UNION pos:-1\\\":\\\"\\\"}\" : \"{null={\\\"type\\\":\\\"map\\\",\\\"values\\\":[]}}\"\r\n}", "{\r\n  \"type\" : \"record\",\r\n  \"fields\" : [ ],\r\n  \"{\\\"type\\\":\\\"array\\\",\\\"items\\\":[],\\\"union type:UNION pos:-1\\\":\\\"\\\"}\" : \"{null={\\\"type\\\":\\\"map\\\",\\\"values\\\":[]}}\"\r\n}", "{\"type\":\"map\",\"values\":{\"type\":\"enum\",\"name\":\"union\",\"namespace\":\"double\",\"doc\":\"union\",\"symbols\":[]}}", (int) '#');
            org.junit.Assert.fail("Expected exception of type org.apache.avro.SchemaParseException; message: Illegal initial character: {??  \"type\" : \"record\",??  \"fields\" : [ ],??  \"{\\\"type\\\":\\\"array\\\",\\\"items\\\":[],\\\"union type:UNION pos:-1\\\":\\\"\\\"}\" : \"{null={\\\"type\\\":\\\"map\\\",\\\"values\\\":[]}}\"??}");
        } catch (org.apache.avro.SchemaParseException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1449() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SchemaM3Random300Test2.test1449");
        org.apache.avro.Schema schema4 = org.apache.avro.Schema.createFixed("union", "[ ]", "[]", 0);
        org.apache.avro.Schema.Type type5 = org.apache.avro.Schema.Type.INT;
        org.apache.avro.Schema schema6 = org.apache.avro.Schema.create(type5);
        org.apache.avro.Schema schema7 = org.apache.avro.Schema.createArray(schema6);
        org.apache.avro.Schema schema8 = org.apache.avro.Schema.applyAliases(schema4, schema7);
        // The following exception was thrown during execution in test generation
        try {
            java.util.Set<java.lang.String> strSet9 = schema7.getAliases();
            org.junit.Assert.fail("Expected exception of type org.apache.avro.AvroRuntimeException; message: Not a named type: {\"type\":\"array\",\"items\":\"int\"}");
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
    public void test1450() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SchemaM3Random300Test2.test1450");
        org.apache.avro.Schema.Parser parser0 = new org.apache.avro.Schema.Parser();
        java.util.Map<java.lang.String, org.apache.avro.Schema> strMap1 = parser0.getTypes();
        java.util.Map<java.lang.String, org.apache.avro.Schema> strMap2 = parser0.getTypes();
        org.apache.avro.Schema.Parser parser3 = new org.apache.avro.Schema.Parser();
        java.util.Map<java.lang.String, org.apache.avro.Schema> strMap4 = parser3.getTypes();
        org.apache.avro.Schema.Parser parser5 = parser0.addTypes(strMap4);
        boolean boolean6 = parser0.getValidate();
        boolean boolean7 = parser0.getValidate();
        boolean boolean8 = parser0.getValidate();
        org.junit.Assert.assertNotNull(strMap1);
        org.junit.Assert.assertNotNull(strMap2);
        org.junit.Assert.assertNotNull(strMap4);
        org.junit.Assert.assertNotNull(parser5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test1451() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SchemaM3Random300Test2.test1451");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.avro.Schema schema4 = org.apache.avro.Schema.createRecord("{\"type\":\"map\",\"values\":\"double\"}", "{null={\"type\":\"fixed\",\"name\":\"union\",\"namespace\":\"[]\",\"doc\":\"[ ]\",\"size\":0}}", "{\"type\":\"fixed\",\"name\":\"union\",\"namespace\":\"[]\",\"doc\":\"[ ]\",\"size\":0}", true);
            org.junit.Assert.fail("Expected exception of type org.apache.avro.SchemaParseException; message: Illegal initial character: {\"type\":\"map\",\"values\":\"double\"}");
        } catch (org.apache.avro.SchemaParseException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1452() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SchemaM3Random300Test2.test1452");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.avro.Schema schema2 = org.apache.avro.Schema.parse("{null={\"type\":\"map\",\"values\":{\"type\":\"array\",\"items\":{\"type\":\"map\",\"values\":[]}}}}", true);
            org.junit.Assert.fail("Expected exception of type org.apache.avro.SchemaParseException; message: org.codehaus.jackson.JsonParseException: Unexpected character ('n' (code 110)): was expecting double-quote to start field name? at [Source: java.io.StringReader@7e251d7d; line: 1, column: 3]");
        } catch (org.apache.avro.SchemaParseException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1453() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SchemaM3Random300Test2.test1453");
        org.apache.avro.Schema.LockableArrayList<java.lang.String> strList7 = new org.apache.avro.Schema.LockableArrayList<java.lang.String>((int) '#');
        org.apache.avro.Schema.LockableArrayList<java.lang.String> strList8 = new org.apache.avro.Schema.LockableArrayList<java.lang.String>((java.util.List<java.lang.String>) strList7);
        org.apache.avro.Schema schema9 = org.apache.avro.Schema.createEnum("[].union", "union type:MAP pos:-1", "union type:UNION pos:-1", (java.util.List<java.lang.String>) strList8);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.avro.Schema schema10 = org.apache.avro.Schema.createEnum("{\"type\":\"map\",\"values\":{\"type\":\"array\",\"items\":\"int\"}}", "{\r\n  \"type\" : \"array\",\r\n  \"items\" : \"int\"\r\n}", "[].union", (java.util.List<java.lang.String>) strList8);
            org.junit.Assert.fail("Expected exception of type org.apache.avro.SchemaParseException; message: Illegal initial character: {\"type\":\"map\",\"values\":{\"type\":\"array\",\"items\":\"int\"}}");
        } catch (org.apache.avro.SchemaParseException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(schema9);
    }

    @Test
    public void test1454() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SchemaM3Random300Test2.test1454");
        org.apache.avro.Schema schema4 = org.apache.avro.Schema.createFixed("union", "", "union type:UNION pos:-1", 10);
        int int5 = schema4.getFixedSize();
        org.apache.avro.Schema schema6 = org.apache.avro.Schema.createArray(schema4);
        org.apache.avro.Schema schema7 = org.apache.avro.Schema.createArray(schema4);
        org.junit.Assert.assertNotNull(schema4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 10 + "'", int5 == 10);
        org.junit.Assert.assertNotNull(schema6);
        org.junit.Assert.assertNotNull(schema7);
    }

    @Test
    public void test1455() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SchemaM3Random300Test2.test1455");
        org.codehaus.jackson.JsonNode jsonNode1 = org.apache.avro.Schema.parseJson("{\"type\":\"map\",\"values\":{\"type\":\"array\",\"items\":\"int\"}}");
        org.junit.Assert.assertNotNull(jsonNode1);
    }

    @Test
    public void test1456() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SchemaM3Random300Test2.test1456");
        org.apache.avro.Schema schema1 = org.apache.avro.Schema.parse("{\"type\":\"fixed\",\"name\":\"union\",\"namespace\":\"[]\",\"doc\":\"{\\r\\n  \\\"type\\\" : \\\"map\\\",\\r\\n  \\\"values\\\" : [ ]\\r\\n}\",\"size\":10}");
        org.junit.Assert.assertNotNull(schema1);
    }

    @Test
    public void test1457() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SchemaM3Random300Test2.test1457");
        org.codehaus.jackson.JsonNode jsonNode1 = org.apache.avro.Schema.parseJson("{\r\n  \"type\" : \"fixed\",\r\n  \"name\" : \"union\",\r\n  \"namespace\" : \"union type:UNION pos:-1\",\r\n  \"doc\" : \"\",\r\n  \"size\" : 10\r\n}");
        org.junit.Assert.assertNotNull(jsonNode1);
    }

    @Test
    public void test1458() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SchemaM3Random300Test2.test1458");
        org.apache.avro.Schema schema0 = null;
        org.apache.avro.Schema schema1 = org.apache.avro.Schema.createArray(schema0);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = schema1.hasEnumSymbol("\"null\"");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(schema1);
    }

    @Test
    public void test1459() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SchemaM3Random300Test2.test1459");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.avro.Schema schema4 = org.apache.avro.Schema.createFixed("{\"type\":\"record\",\"fields\":[],\"{\\r\\n  \\\"type\\\" : \\\"map\\\",\\r\\n  \\\"values\\\" : {\\r\\n    \\\"type\\\" : \\\"map\\\",\\r\\n    \\\"values\\\" : [ ]\\r\\n  }\\r\\n}\":\"{}\"}", "{\"type\":\"record\",\"fields\":[]}", "[].union", 1);
            org.junit.Assert.fail("Expected exception of type org.apache.avro.SchemaParseException; message: Illegal initial character: {\"type\":\"record\",\"fields\":[],\"{\\r\\n  \\\"type\\\" : \\\"map\\\",\\r\\n  \\\"values\\\" : {\\r\\n    \\\"type\\\" : \\\"map\\\",\\r\\n    \\\"values\\\" : [ ]\\r\\n  }\\r\\n}\":\"{}\"}");
        } catch (org.apache.avro.SchemaParseException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1460() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SchemaM3Random300Test2.test1460");
        org.apache.avro.Schema.Names names0 = new org.apache.avro.Schema.Names();
        names0.space("[ ]");
        java.lang.Object obj3 = names0.clone();
        boolean boolean6 = names0.remove((java.lang.Object) 1, (java.lang.Object) true);
        org.apache.avro.Schema[] schemaArray7 = new org.apache.avro.Schema[] {};
        java.util.ArrayList<org.apache.avro.Schema> schemaList8 = new java.util.ArrayList<org.apache.avro.Schema>();
        boolean boolean9 = java.util.Collections.addAll((java.util.Collection<org.apache.avro.Schema>) schemaList8, schemaArray7);
        org.apache.avro.Schema schema10 = org.apache.avro.Schema.createUnion((java.util.List<org.apache.avro.Schema>) schemaList8);
        org.apache.avro.Schema[] schemaArray11 = new org.apache.avro.Schema[] {};
        java.util.ArrayList<org.apache.avro.Schema> schemaList12 = new java.util.ArrayList<org.apache.avro.Schema>();
        boolean boolean13 = java.util.Collections.addAll((java.util.Collection<org.apache.avro.Schema>) schemaList12, schemaArray11);
        org.apache.avro.Schema schema14 = org.apache.avro.Schema.createUnion((java.util.List<org.apache.avro.Schema>) schemaList12);
        org.apache.avro.Schema schema15 = org.apache.avro.Schema.applyAliases(schema10, schema14);
        java.util.List<org.apache.avro.Schema> schemaList16 = schema15.getTypes();
        boolean boolean18 = schema15.equals((java.lang.Object) "hi!");
        java.lang.String str19 = schema15.getDoc();
        org.apache.avro.Schema schema20 = names0.get((java.lang.Object) str19);
        java.util.Collection<org.apache.avro.Schema> schemaCollection21 = names0.values();
        org.codehaus.jackson.JsonFactory jsonFactory22 = org.apache.avro.Schema.FACTORY;
        org.codehaus.jackson.JsonFactory[] jsonFactoryArray23 = new org.codehaus.jackson.JsonFactory[] { jsonFactory22 };
        java.util.ArrayList<org.codehaus.jackson.JsonFactory> jsonFactoryList24 = new java.util.ArrayList<org.codehaus.jackson.JsonFactory>();
        boolean boolean25 = java.util.Collections.addAll((java.util.Collection<org.codehaus.jackson.JsonFactory>) jsonFactoryList24, jsonFactoryArray23);
        org.apache.avro.Schema.LockableArrayList<org.codehaus.jackson.JsonFactory> jsonFactoryList26 = new org.apache.avro.Schema.LockableArrayList<org.codehaus.jackson.JsonFactory>((java.util.List<org.codehaus.jackson.JsonFactory>) jsonFactoryList24);
        boolean boolean27 = names0.containsKey((java.lang.Object) jsonFactoryList26);
        org.apache.avro.Schema[] schemaArray28 = new org.apache.avro.Schema[] {};
        java.util.ArrayList<org.apache.avro.Schema> schemaList29 = new java.util.ArrayList<org.apache.avro.Schema>();
        boolean boolean30 = java.util.Collections.addAll((java.util.Collection<org.apache.avro.Schema>) schemaList29, schemaArray28);
        org.apache.avro.Schema schema31 = org.apache.avro.Schema.createUnion((java.util.List<org.apache.avro.Schema>) schemaList29);
        org.apache.avro.Schema[] schemaArray32 = new org.apache.avro.Schema[] {};
        java.util.ArrayList<org.apache.avro.Schema> schemaList33 = new java.util.ArrayList<org.apache.avro.Schema>();
        boolean boolean34 = java.util.Collections.addAll((java.util.Collection<org.apache.avro.Schema>) schemaList33, schemaArray32);
        org.apache.avro.Schema schema35 = org.apache.avro.Schema.createUnion((java.util.List<org.apache.avro.Schema>) schemaList33);
        org.apache.avro.Schema schema36 = org.apache.avro.Schema.applyAliases(schema31, schema35);
        java.util.List<org.apache.avro.Schema> schemaList37 = schema36.getTypes();
        boolean boolean39 = schema36.equals((java.lang.Object) "hi!");
        java.lang.String str40 = schema36.getDoc();
        org.apache.avro.Schema schema41 = org.apache.avro.Schema.createArray(schema36);
        java.lang.String str42 = schema36.getFullName();
        org.apache.avro.Schema schema43 = org.apache.avro.Schema.createMap(schema36);
        java.lang.String str44 = schema43.toString();
        java.lang.String str45 = schema43.toString();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean46 = names0.contains(schema43);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: org.apache.avro.Schema$MapSchema cannot be cast to org.apache.avro.Schema$NamedSchema");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(obj3);
        org.junit.Assert.assertEquals(obj3.toString(), "{}");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj3), "{}");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj3), "{}");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(schemaArray7);
        org.junit.Assert.assertArrayEquals(schemaArray7, new org.apache.avro.Schema[] {});
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(schema10);
        org.junit.Assert.assertNotNull(schemaArray11);
        org.junit.Assert.assertArrayEquals(schemaArray11, new org.apache.avro.Schema[] {});
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(schema14);
        org.junit.Assert.assertNotNull(schema15);
        org.junit.Assert.assertNotNull(schemaList16);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNull(str19);
        org.junit.Assert.assertNull(schema20);
        org.junit.Assert.assertNotNull(schemaCollection21);
        org.junit.Assert.assertNotNull(jsonFactory22);
        org.junit.Assert.assertNotNull(jsonFactoryArray23);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(schemaArray28);
        org.junit.Assert.assertArrayEquals(schemaArray28, new org.apache.avro.Schema[] {});
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertNotNull(schema31);
        org.junit.Assert.assertNotNull(schemaArray32);
        org.junit.Assert.assertArrayEquals(schemaArray32, new org.apache.avro.Schema[] {});
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertNotNull(schema35);
        org.junit.Assert.assertNotNull(schema36);
        org.junit.Assert.assertNotNull(schemaList37);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertNull(str40);
        org.junit.Assert.assertNotNull(schema41);
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "union" + "'", str42, "union");
        org.junit.Assert.assertNotNull(schema43);
        org.junit.Assert.assertEquals("'" + str44 + "' != '" + "{\"type\":\"map\",\"values\":[]}" + "'", str44, "{\"type\":\"map\",\"values\":[]}");
        org.junit.Assert.assertEquals("'" + str45 + "' != '" + "{\"type\":\"map\",\"values\":[]}" + "'", str45, "{\"type\":\"map\",\"values\":[]}");
    }

    @Test
    public void test1461() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SchemaM3Random300Test2.test1461");
        org.apache.avro.Schema[] schemaArray0 = new org.apache.avro.Schema[] {};
        java.util.ArrayList<org.apache.avro.Schema> schemaList1 = new java.util.ArrayList<org.apache.avro.Schema>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<org.apache.avro.Schema>) schemaList1, schemaArray0);
        org.apache.avro.Schema schema3 = org.apache.avro.Schema.createUnion((java.util.List<org.apache.avro.Schema>) schemaList1);
        java.util.List<org.apache.avro.Schema> schemaList4 = schema3.getTypes();
        org.apache.avro.Schema schema5 = org.apache.avro.Schema.createMap(schema3);
        org.apache.avro.Schema schema8 = org.apache.avro.Schema.parse("{\r\n  \"type\" : \"array\",\r\n  \"items\" : {\r\n    \"type\" : \"map\",\r\n    \"values\" : [ ]\r\n  }\r\n}", true);
        boolean boolean9 = schema3.equals((java.lang.Object) true);
        java.lang.Class<?> wildcardClass10 = schema3.getClass();
        org.junit.Assert.assertNotNull(schemaArray0);
        org.junit.Assert.assertArrayEquals(schemaArray0, new org.apache.avro.Schema[] {});
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(schema3);
        org.junit.Assert.assertNotNull(schemaList4);
        org.junit.Assert.assertNotNull(schema5);
        org.junit.Assert.assertNotNull(schema8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test1462() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SchemaM3Random300Test2.test1462");
        org.apache.avro.Schema schema4 = org.apache.avro.Schema.createFixed("union", "[ ]", "[]", 0);
        org.apache.avro.Schema.Type type5 = org.apache.avro.Schema.Type.INT;
        org.apache.avro.Schema schema6 = org.apache.avro.Schema.create(type5);
        org.apache.avro.Schema schema7 = org.apache.avro.Schema.createArray(schema6);
        org.apache.avro.Schema schema8 = org.apache.avro.Schema.applyAliases(schema4, schema7);
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<org.apache.avro.Schema> schemaList9 = schema7.getTypes();
            org.junit.Assert.fail("Expected exception of type org.apache.avro.AvroRuntimeException; message: Not a union: {\"type\":\"array\",\"items\":\"int\"}");
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
    public void test1463() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SchemaM3Random300Test2.test1463");
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
            java.util.List<java.lang.String> strList10 = schema8.getEnumSymbols();
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
    }

    @Test
    public void test1464() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SchemaM3Random300Test2.test1464");
        java.lang.String[] strArray4 = new java.lang.String[] { "" };
        java.util.ArrayList<java.lang.String> strList5 = new java.util.ArrayList<java.lang.String>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList5, strArray4);
        org.apache.avro.Schema.LockableArrayList<java.lang.String> strList7 = new org.apache.avro.Schema.LockableArrayList<java.lang.String>((java.util.List<java.lang.String>) strList5);
        org.apache.avro.Schema.LockableArrayList<java.lang.String> strList8 = new org.apache.avro.Schema.LockableArrayList<java.lang.String>((java.util.List<java.lang.String>) strList5);
        org.apache.avro.Schema.LockableArrayList<java.lang.String> strList9 = new org.apache.avro.Schema.LockableArrayList<java.lang.String>((java.util.List<java.lang.String>) strList5);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.avro.Schema schema10 = org.apache.avro.Schema.createEnum("{\r\n  \"type\" : \"array\",\r\n  \"items\" : [ ],\r\n  \"{}\" : \"hi!\"\r\n}", "{\"type\":\"record\",\"fields\":[],\"{\\r\\n  \\\"type\\\" : \\\"fixed\\\",\\r\\n  \\\"name\\\" : \\\"union\\\",\\r\\n  \\\"namespace\\\" : \\\"[]\\\",\\r\\n  \\\"doc\\\" : \\\"[ ]\\\",\\r\\n  \\\"size\\\" : 0\\r\\n}\":\"[ ]\"}", "{\"type\":\"map\",\"values\":{\"type\":\"array\",\"items\":{\"type\":\"map\",\"values\":[]}}}", (java.util.List<java.lang.String>) strList9);
            org.junit.Assert.fail("Expected exception of type org.apache.avro.SchemaParseException; message: Illegal initial character: {??  \"type\" : \"array\",??  \"items\" : [ ],??  \"{}\" : \"hi!\"??}");
        } catch (org.apache.avro.SchemaParseException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertArrayEquals(strArray4, new java.lang.String[] { "" });
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test1465() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SchemaM3Random300Test2.test1465");
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
        org.apache.avro.Schema schema21 = org.apache.avro.Schema.createUnion(schemaList20);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean23 = schema21.hasEnumSymbol("map");
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
        org.junit.Assert.assertNotNull(schema21);
    }

    @Test
    public void test1466() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SchemaM3Random300Test2.test1466");
        org.apache.avro.Schema.Parser parser0 = new org.apache.avro.Schema.Parser();
        java.util.Map<java.lang.String, org.apache.avro.Schema> strMap1 = parser0.getTypes();
        java.util.Map<java.lang.String, org.apache.avro.Schema> strMap2 = parser0.getTypes();
        org.apache.avro.Schema.Parser parser3 = new org.apache.avro.Schema.Parser();
        java.util.Map<java.lang.String, org.apache.avro.Schema> strMap4 = parser3.getTypes();
        org.apache.avro.Schema.Parser parser5 = parser0.addTypes(strMap4);
        org.apache.avro.Schema schema7 = parser0.parse("{\r\n  \"type\" : \"map\",\r\n  \"values\" : [ ]\r\n}");
        org.apache.avro.Schema.Parser parser9 = parser0.setValidate(true);
        java.util.Map<java.lang.String, org.apache.avro.Schema> strMap10 = parser0.getTypes();
        org.junit.Assert.assertNotNull(strMap1);
        org.junit.Assert.assertNotNull(strMap2);
        org.junit.Assert.assertNotNull(strMap4);
        org.junit.Assert.assertNotNull(parser5);
        org.junit.Assert.assertNotNull(schema7);
        org.junit.Assert.assertNotNull(parser9);
        org.junit.Assert.assertNotNull(strMap10);
    }

    @Test
    public void test1467() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SchemaM3Random300Test2.test1467");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.avro.Schema schema4 = org.apache.avro.Schema.createRecord("hi!", "\"double\"", "{\"type\":\"fixed\",\"name\":\"union\",\"namespace\":\"{}\",\"doc\":\"hi!\",\"size\":1}", true);
            org.junit.Assert.fail("Expected exception of type org.apache.avro.SchemaParseException; message: Illegal character in: hi!");
        } catch (org.apache.avro.SchemaParseException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1468() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SchemaM3Random300Test2.test1468");
        org.apache.avro.Schema.Parser parser0 = new org.apache.avro.Schema.Parser();
        java.util.Map<java.lang.String, org.apache.avro.Schema> strMap1 = parser0.getTypes();
        java.util.Map<java.lang.String, org.apache.avro.Schema> strMap2 = parser0.getTypes();
        org.apache.avro.Schema.Parser parser3 = new org.apache.avro.Schema.Parser();
        org.apache.avro.Schema.Parser parser5 = parser3.setValidate(true);
        java.util.Map<java.lang.String, org.apache.avro.Schema> strMap6 = parser3.getTypes();
        org.apache.avro.Schema.Parser parser7 = parser0.addTypes(strMap6);
        java.util.Map<java.lang.String, org.apache.avro.Schema> strMap8 = parser0.getTypes();
        org.apache.avro.Schema.Parser parser10 = parser0.setValidate(false);
        org.apache.avro.Schema.Parser parser12 = parser0.setValidate(false);
        org.apache.avro.Schema schema14 = parser12.parse("[].union");
        java.lang.String str15 = schema14.getName();
        org.junit.Assert.assertNotNull(strMap1);
        org.junit.Assert.assertNotNull(strMap2);
        org.junit.Assert.assertNotNull(parser5);
        org.junit.Assert.assertNotNull(strMap6);
        org.junit.Assert.assertNotNull(parser7);
        org.junit.Assert.assertNotNull(strMap8);
        org.junit.Assert.assertNotNull(parser10);
        org.junit.Assert.assertNotNull(parser12);
        org.junit.Assert.assertNotNull(schema14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "union" + "'", str15, "union");
    }

    @Test
    public void test1469() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SchemaM3Random300Test2.test1469");
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
            int int12 = schema7.getEnumOrdinal("\"null\"");
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
    }

    @Test
    public void test1470() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SchemaM3Random300Test2.test1470");
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
        org.apache.avro.Schema schema15 = org.apache.avro.Schema.createArray(schema8);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.avro.Schema schema16 = schema8.getElementType();
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
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNotNull(schema13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "union" + "'", str14, "union");
        org.junit.Assert.assertNotNull(schema15);
    }

    @Test
    public void test1471() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SchemaM3Random300Test2.test1471");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.avro.Schema schema4 = org.apache.avro.Schema.createFixed("{\r\n  \"type\" : \"array\",\r\n  \"items\" : [ ],\r\n  \"{}\" : \"hi!\"\r\n}", "{\"type\":\"array\",\"items\":\"null\"}", ".map", (int) 'a');
            org.junit.Assert.fail("Expected exception of type org.apache.avro.SchemaParseException; message: Illegal initial character: {??  \"type\" : \"array\",??  \"items\" : [ ],??  \"{}\" : \"hi!\"??}");
        } catch (org.apache.avro.SchemaParseException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1472() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SchemaM3Random300Test2.test1472");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.avro.Schema schema4 = org.apache.avro.Schema.createRecord("", "{\"type\":\"map\",\"values\":{\"type\":\"array\",\"items\":{\"type\":\"map\",\"values\":[]},\"\":\"{\\r\\n  \\\"type\\\" : \\\"record\\\",\\r\\n  \\\"fields\\\" : [ ]\\r\\n}\"}}", "{\r\n  \"type\" : \"fixed\",\r\n  \"name\" : \"union\",\r\n  \"namespace\" : \"union type:UNION pos:-1\",\r\n  \"doc\" : \"\",\r\n  \"size\" : 10\r\n}", false);
            org.junit.Assert.fail("Expected exception of type org.apache.avro.SchemaParseException; message: Empty name");
        } catch (org.apache.avro.SchemaParseException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1473() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SchemaM3Random300Test2.test1473");
        java.lang.String[] strArray19 = new java.lang.String[] { "{\"type\":\"array\",\"items\":{\"type\":\"map\",\"values\":[]}}", "union type:MAP pos:-1", "{\"type\":\"array\",\"items\":{\"type\":\"map\",\"values\":[]}}", "{}", "{\r\n  \"type\" : \"map\",\r\n  \"values\" : {\r\n    \"type\" : \"map\",\r\n    \"values\" : [ ]\r\n  }\r\n}", "double", "{\r\n  \"type\" : \"map\",\r\n  \"values\" : [ ]\r\n}", "{\"type\":\"map\",\"values\":[]}", "{\"type\":\"array\",\"items\":[]}", "{\"type\":\"map\",\"values\":[]}", "{}", "union", "{\r\n  \"type\" : \"record\",\r\n  \"fields\" : [ ]\r\n}", "[].union", "{\r\n  \"type\" : \"map\",\r\n  \"values\" : [ ]\r\n}", "{\"type\":\"fixed\",\"name\":\"union\",\"namespace\":\"[]\",\"doc\":\"[ ]\",\"size\":0}" };
        java.util.ArrayList<java.lang.String> strList20 = new java.util.ArrayList<java.lang.String>();
        boolean boolean21 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList20, strArray19);
        org.apache.avro.Schema.LockableArrayList<java.lang.String> strList22 = new org.apache.avro.Schema.LockableArrayList<java.lang.String>((java.util.List<java.lang.String>) strList20);
        org.apache.avro.Schema.LockableArrayList<java.lang.String> strList23 = new org.apache.avro.Schema.LockableArrayList<java.lang.String>((java.util.List<java.lang.String>) strList22);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.avro.Schema schema24 = org.apache.avro.Schema.createEnum("{\"type\":\"record\",\"fields\":[],\"{\\r\\n  \\\"type\\\" : \\\"map\\\",\\r\\n  \\\"values\\\" : {\\r\\n    \\\"type\\\" : \\\"map\\\",\\r\\n    \\\"values\\\" : [ ]\\r\\n  }\\r\\n}\":\"{}\"}", "{\"type\":\"array\",\"items\":{\"type\":\"array\",\"items\":{\"type\":\"map\",\"values\":[]}}}", "{\"type\":\"fixed\",\"name\":\"union\",\"namespace\":\"[]\",\"doc\":\"[ ]\",\"size\":0}", (java.util.List<java.lang.String>) strList23);
            org.junit.Assert.fail("Expected exception of type org.apache.avro.SchemaParseException; message: Illegal initial character: {\"type\":\"record\",\"fields\":[],\"{\\r\\n  \\\"type\\\" : \\\"map\\\",\\r\\n  \\\"values\\\" : {\\r\\n    \\\"type\\\" : \\\"map\\\",\\r\\n    \\\"values\\\" : [ ]\\r\\n  }\\r\\n}\":\"{}\"}");
        } catch (org.apache.avro.SchemaParseException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray19);
        org.junit.Assert.assertArrayEquals(strArray19, new java.lang.String[] { "{\"type\":\"array\",\"items\":{\"type\":\"map\",\"values\":[]}}", "union type:MAP pos:-1", "{\"type\":\"array\",\"items\":{\"type\":\"map\",\"values\":[]}}", "{}", "{\r\n  \"type\" : \"map\",\r\n  \"values\" : {\r\n    \"type\" : \"map\",\r\n    \"values\" : [ ]\r\n  }\r\n}", "double", "{\r\n  \"type\" : \"map\",\r\n  \"values\" : [ ]\r\n}", "{\"type\":\"map\",\"values\":[]}", "{\"type\":\"array\",\"items\":[]}", "{\"type\":\"map\",\"values\":[]}", "{}", "union", "{\r\n  \"type\" : \"record\",\r\n  \"fields\" : [ ]\r\n}", "[].union", "{\r\n  \"type\" : \"map\",\r\n  \"values\" : [ ]\r\n}", "{\"type\":\"fixed\",\"name\":\"union\",\"namespace\":\"[]\",\"doc\":\"[ ]\",\"size\":0}" });
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
    }

    @Test
    public void test1474() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SchemaM3Random300Test2.test1474");
        org.apache.avro.Schema.Parser parser0 = new org.apache.avro.Schema.Parser();
        java.util.Map<java.lang.String, org.apache.avro.Schema> strMap1 = parser0.getTypes();
        java.util.Map<java.lang.String, org.apache.avro.Schema> strMap2 = parser0.getTypes();
        org.apache.avro.Schema.Parser parser3 = new org.apache.avro.Schema.Parser();
        org.apache.avro.Schema.Parser parser5 = parser3.setValidate(true);
        java.util.Map<java.lang.String, org.apache.avro.Schema> strMap6 = parser3.getTypes();
        org.apache.avro.Schema.Parser parser7 = parser0.addTypes(strMap6);
        java.util.Map<java.lang.String, org.apache.avro.Schema> strMap8 = parser0.getTypes();
        org.apache.avro.Schema.Parser parser10 = parser0.setValidate(false);
        org.apache.avro.Schema.Parser parser12 = parser10.setValidate(true);
        org.apache.avro.Schema.Parser parser14 = parser10.setValidate(true);
        org.junit.Assert.assertNotNull(strMap1);
        org.junit.Assert.assertNotNull(strMap2);
        org.junit.Assert.assertNotNull(parser5);
        org.junit.Assert.assertNotNull(strMap6);
        org.junit.Assert.assertNotNull(parser7);
        org.junit.Assert.assertNotNull(strMap8);
        org.junit.Assert.assertNotNull(parser10);
        org.junit.Assert.assertNotNull(parser12);
        org.junit.Assert.assertNotNull(parser14);
    }

    @Test
    public void test1475() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SchemaM3Random300Test2.test1475");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.avro.Schema schema4 = org.apache.avro.Schema.createFixed("{\r\n  \"type\" : \"record\",\r\n  \"fields\" : [ ],\r\n  \"{\\\"type\\\":\\\"array\\\",\\\"items\\\":[],\\\"union type:UNION pos:-1\\\":\\\"\\\"}\" : \"{null={\\\"type\\\":\\\"map\\\",\\\"values\\\":[]}}\"\r\n}", "{\"type\":\"array\",\"items\":[],\"union type:UNION pos:-1\":\"\"}", "{\"type\":\"map\",\"values\":{\"type\":\"array\",\"items\":{\"type\":\"map\",\"values\":[]}}}", (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type org.apache.avro.SchemaParseException; message: Illegal initial character: {??  \"type\" : \"record\",??  \"fields\" : [ ],??  \"{\\\"type\\\":\\\"array\\\",\\\"items\\\":[],\\\"union type:UNION pos:-1\\\":\\\"\\\"}\" : \"{null={\\\"type\\\":\\\"map\\\",\\\"values\\\":[]}}\"??}");
        } catch (org.apache.avro.SchemaParseException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1476() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SchemaM3Random300Test2.test1476");
        org.apache.avro.Schema schema4 = org.apache.avro.Schema.createFixed("union", "{\r\n  \"type\" : \"map\",\r\n  \"values\" : {\r\n    \"type\" : \"enum\",\r\n    \"name\" : \"union\",\r\n    \"namespace\" : \"[]\",\r\n    \"doc\" : \"{}\",\r\n    \"symbols\" : [ ]\r\n  }\r\n}", "{\"type\":\"double\",\"float\":\"{\\\"type\\\":\\\"array\\\",\\\"items\\\":[]}\"}", (int) (short) 10);
        org.junit.Assert.assertNotNull(schema4);
    }

    @Test
    public void test1477() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SchemaM3Random300Test2.test1477");
        org.apache.avro.Schema schema2 = org.apache.avro.Schema.parse("\"null\"", true);
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<java.lang.String> strList3 = schema2.getEnumSymbols();
            org.junit.Assert.fail("Expected exception of type org.apache.avro.AvroRuntimeException; message: Not an enum: \"null\"");
        } catch (org.apache.avro.AvroRuntimeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(schema2);
    }

    @Test
    public void test1478() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SchemaM3Random300Test2.test1478");
        org.apache.avro.Schema schema2 = org.apache.avro.Schema.parse("[]", true);
        org.apache.avro.Schema.Type type3 = schema2.getType();
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<org.apache.avro.Schema.Field> fieldList4 = schema2.getFields();
            org.junit.Assert.fail("Expected exception of type org.apache.avro.AvroRuntimeException; message: Not a record: []");
        } catch (org.apache.avro.AvroRuntimeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(schema2);
        org.junit.Assert.assertTrue("'" + type3 + "' != '" + org.apache.avro.Schema.Type.UNION + "'", type3.equals(org.apache.avro.Schema.Type.UNION));
    }

    @Test
    public void test1479() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SchemaM3Random300Test2.test1479");
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
        org.apache.avro.Schema schema23 = org.apache.avro.Schema.createMap(schema11);
        org.apache.avro.Schema schema24 = schema23.getValueType();
        java.lang.String str25 = schema23.getDoc();
        org.apache.avro.Schema.LockableArrayList<java.lang.String> strList27 = new org.apache.avro.Schema.LockableArrayList<java.lang.String>((int) ' ');
        boolean boolean28 = schema23.equals((java.lang.Object) strList27);
        org.apache.avro.Schema schema29 = org.apache.avro.Schema.createEnum("union", "union", "double", (java.util.List<java.lang.String>) strList27);
        org.apache.avro.Schema schema30 = org.apache.avro.Schema.createMap(schema29);
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<java.lang.String> strList31 = schema30.getEnumSymbols();
            org.junit.Assert.fail("Expected exception of type org.apache.avro.AvroRuntimeException; message: Not an enum: {\"type\":\"map\",\"values\":{\"type\":\"enum\",\"name\":\"union\",\"namespace\":\"double\",\"doc\":\"union\",\"symbols\":[]}}");
        } catch (org.apache.avro.AvroRuntimeException e) {
            // Expected exception.
        }
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
        org.junit.Assert.assertNotNull(schema23);
        org.junit.Assert.assertNotNull(schema24);
        org.junit.Assert.assertNull(str25);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNotNull(schema29);
        org.junit.Assert.assertNotNull(schema30);
    }

    @Test
    public void test1480() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SchemaM3Random300Test2.test1480");
        org.apache.avro.Schema schema2 = org.apache.avro.Schema.parse("{\r\n  \"type\" : \"map\",\r\n  \"values\" : {\r\n    \"type\" : \"enum\",\r\n    \"name\" : \"union\",\r\n    \"namespace\" : \"[]\",\r\n    \"doc\" : \"{}\",\r\n    \"symbols\" : [ ]\r\n  }\r\n}", true);
        org.junit.Assert.assertNotNull(schema2);
    }

    @Test
    public void test1481() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SchemaM3Random300Test2.test1481");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.avro.Schema schema4 = org.apache.avro.Schema.createRecord("\"double\"", "int", "{\"type\":\"fixed\",\"name\":\"union\",\"namespace\":\"[]\",\"doc\":\"union type:UNION pos:-1\",\"size\":100}", true);
            org.junit.Assert.fail("Expected exception of type org.apache.avro.SchemaParseException; message: Illegal initial character: \"double\"");
        } catch (org.apache.avro.SchemaParseException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1482() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SchemaM3Random300Test2.test1482");
        org.apache.avro.Schema schema2 = org.apache.avro.Schema.parse("{\"type\":\"array\",\"items\":\"int\"}", true);
        org.apache.avro.Schema schema3 = schema2.getElementType();
        java.lang.String str5 = schema3.getProp("{\"type\":\"map\",\"values\":{\"type\":\"array\",\"items\":\"int\"}}");
        org.junit.Assert.assertNotNull(schema2);
        org.junit.Assert.assertNotNull(schema3);
        org.junit.Assert.assertNull(str5);
    }

    @Test
    public void test1483() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SchemaM3Random300Test2.test1483");
        org.apache.avro.Schema schema2 = org.apache.avro.Schema.parse("{\r\n  \"type\" : \"array\",\r\n  \"items\" : [ ],\r\n  \"{}\" : \"hi!\"\r\n}", false);
        java.lang.String str4 = schema2.toString(false);
        org.junit.Assert.assertNotNull(schema2);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "{\"type\":\"array\",\"items\":[],\"{}\":\"hi!\"}" + "'", str4, "{\"type\":\"array\",\"items\":[],\"{}\":\"hi!\"}");
    }

    @Test
    public void test1484() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SchemaM3Random300Test2.test1484");
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
            org.apache.avro.Schema schema12 = parser7.parse("");
            org.junit.Assert.fail("Expected exception of type org.apache.avro.SchemaParseException; message: java.io.EOFException: No content to map to Object due to end of input");
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
    public void test1485() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SchemaM3Random300Test2.test1485");
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
        java.util.List<org.apache.avro.Schema> schemaList17 = schema7.getTypes();
        java.lang.String str18 = schema7.getFullName();
        org.apache.avro.Schema schema19 = org.apache.avro.Schema.createMap(schema7);
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
        org.junit.Assert.assertNotNull(schemaList17);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "union" + "'", str18, "union");
        org.junit.Assert.assertNotNull(schema19);
    }

    @Test
    public void test1486() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SchemaM3Random300Test2.test1486");
        org.apache.avro.Schema[] schemaArray0 = new org.apache.avro.Schema[] {};
        java.util.ArrayList<org.apache.avro.Schema> schemaList1 = new java.util.ArrayList<org.apache.avro.Schema>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<org.apache.avro.Schema>) schemaList1, schemaArray0);
        org.apache.avro.Schema schema3 = org.apache.avro.Schema.createUnion((java.util.List<org.apache.avro.Schema>) schemaList1);
        java.util.List<org.apache.avro.Schema> schemaList4 = schema3.getTypes();
        org.apache.avro.Schema schema5 = org.apache.avro.Schema.createMap(schema3);
        org.apache.avro.Schema schema8 = org.apache.avro.Schema.parse("{\r\n  \"type\" : \"array\",\r\n  \"items\" : {\r\n    \"type\" : \"map\",\r\n    \"values\" : [ ]\r\n  }\r\n}", true);
        boolean boolean9 = schema3.equals((java.lang.Object) true);
        java.lang.String str10 = schema3.getFullName();
        org.apache.avro.Schema schema11 = org.apache.avro.Schema.createArray(schema3);
        java.lang.String str12 = schema3.getName();
        org.junit.Assert.assertNotNull(schemaArray0);
        org.junit.Assert.assertArrayEquals(schemaArray0, new org.apache.avro.Schema[] {});
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(schema3);
        org.junit.Assert.assertNotNull(schemaList4);
        org.junit.Assert.assertNotNull(schema5);
        org.junit.Assert.assertNotNull(schema8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "union" + "'", str10, "union");
        org.junit.Assert.assertNotNull(schema11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "union" + "'", str12, "union");
    }

    @Test
    public void test1487() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SchemaM3Random300Test2.test1487");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.avro.Schema schema4 = org.apache.avro.Schema.createFixed("{\"type\":\"record\",\"fields\":[],\"{\\r\\n  \\\"type\\\" : \\\"fixed\\\",\\r\\n  \\\"name\\\" : \\\"union\\\",\\r\\n  \\\"namespace\\\" : \\\"[]\\\",\\r\\n  \\\"doc\\\" : \\\"[ ]\\\",\\r\\n  \\\"size\\\" : 0\\r\\n}\":\"[ ]\"}", "{\r\n  \"type\" : \"array\",\r\n  \"items\" : [ ],\r\n  \"{}\" : \"hi!\"\r\n}", "[]", 0);
            org.junit.Assert.fail("Expected exception of type org.apache.avro.SchemaParseException; message: Illegal initial character: {\"type\":\"record\",\"fields\":[],\"{\\r\\n  \\\"type\\\" : \\\"fixed\\\",\\r\\n  \\\"name\\\" : \\\"union\\\",\\r\\n  \\\"namespace\\\" : \\\"[]\\\",\\r\\n  \\\"doc\\\" : \\\"[ ]\\\",\\r\\n  \\\"size\\\" : 0\\r\\n}\":\"[ ]\"}");
        } catch (org.apache.avro.SchemaParseException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1488() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SchemaM3Random300Test2.test1488");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.avro.Schema schema4 = org.apache.avro.Schema.createRecord("{null={\"type\":\"map\",\"values\":{\"type\":\"array\",\"items\":{\"type\":\"map\",\"values\":[]}}}}", "{}", "hi!", false);
            org.junit.Assert.fail("Expected exception of type org.apache.avro.SchemaParseException; message: Illegal initial character: {null={\"type\":\"map\",\"values\":{\"type\":\"array\",\"items\":{\"type\":\"map\",\"values\":[]}}}}");
        } catch (org.apache.avro.SchemaParseException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1489() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SchemaM3Random300Test2.test1489");
        org.apache.avro.Schema.Parser parser0 = new org.apache.avro.Schema.Parser();
        java.util.Map<java.lang.String, org.apache.avro.Schema> strMap1 = parser0.getTypes();
        org.apache.avro.Schema.Parser parser2 = new org.apache.avro.Schema.Parser();
        org.apache.avro.Schema.Parser parser4 = parser2.setValidate(true);
        java.util.Map<java.lang.String, org.apache.avro.Schema> strMap5 = parser2.getTypes();
        org.apache.avro.Schema.Parser parser6 = parser0.addTypes(strMap5);
        boolean boolean7 = parser0.getValidate();
        org.apache.avro.Schema schema9 = parser0.parse("{\"type\":\"array\",\"items\":[]}");
        org.apache.avro.Schema schema11 = parser0.parse("{\r\n  \"type\" : \"fixed\",\r\n  \"name\" : \"union\",\r\n  \"namespace\" : \"{}\",\r\n  \"doc\" : \"hi!\",\r\n  \"size\" : 1\r\n}");
        org.junit.Assert.assertNotNull(strMap1);
        org.junit.Assert.assertNotNull(parser4);
        org.junit.Assert.assertNotNull(strMap5);
        org.junit.Assert.assertNotNull(parser6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(schema9);
        org.junit.Assert.assertNotNull(schema11);
    }

    @Test
    public void test1490() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SchemaM3Random300Test2.test1490");
        org.apache.avro.Schema.Field[] fieldArray0 = new org.apache.avro.Schema.Field[] {};
        java.util.ArrayList<org.apache.avro.Schema.Field> fieldList1 = new java.util.ArrayList<org.apache.avro.Schema.Field>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<org.apache.avro.Schema.Field>) fieldList1, fieldArray0);
        org.apache.avro.Schema schema3 = org.apache.avro.Schema.createRecord((java.util.List<org.apache.avro.Schema.Field>) fieldList1);
        java.util.List<org.apache.avro.Schema.Field> fieldList4 = schema3.getFields();
        org.apache.avro.Schema schema5 = org.apache.avro.Schema.createRecord(fieldList4);
        org.apache.avro.Schema schema6 = org.apache.avro.Schema.createRecord(fieldList4);
        java.lang.String str8 = schema6.toString(false);
        // The following exception was thrown during execution in test generation
        try {
            schema6.addAlias("{null={\"type\":\"map\",\"values\":[]}}");
            org.junit.Assert.fail("Expected exception of type org.apache.avro.SchemaParseException; message: Illegal initial character: {null={\"type\":\"map\",\"values\":[]}}");
        } catch (org.apache.avro.SchemaParseException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(fieldArray0);
        org.junit.Assert.assertArrayEquals(fieldArray0, new org.apache.avro.Schema.Field[] {});
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(schema3);
        org.junit.Assert.assertNotNull(fieldList4);
        org.junit.Assert.assertNotNull(schema5);
        org.junit.Assert.assertNotNull(schema6);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "{\"type\":\"record\",\"fields\":[]}" + "'", str8, "{\"type\":\"record\",\"fields\":[]}");
    }

    @Test
    public void test1491() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SchemaM3Random300Test2.test1491");
        org.apache.avro.Schema.Parser parser0 = new org.apache.avro.Schema.Parser();
        java.util.Map<java.lang.String, org.apache.avro.Schema> strMap1 = parser0.getTypes();
        java.util.Map<java.lang.String, org.apache.avro.Schema> strMap2 = parser0.getTypes();
        org.apache.avro.Schema.Parser parser3 = new org.apache.avro.Schema.Parser();
        org.apache.avro.Schema.Parser parser5 = parser3.setValidate(true);
        java.util.Map<java.lang.String, org.apache.avro.Schema> strMap6 = parser3.getTypes();
        org.apache.avro.Schema.Parser parser7 = parser0.addTypes(strMap6);
        org.apache.avro.Schema schema9 = parser7.parse("{\"type\":\"map\",\"values\":[]}");
        org.apache.avro.Schema.Parser parser11 = parser7.setValidate(false);
        org.apache.avro.Schema.Parser parser13 = parser7.setValidate(true);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.avro.Schema schema15 = parser13.parse("union");
            org.junit.Assert.fail("Expected exception of type org.apache.avro.SchemaParseException; message: org.codehaus.jackson.JsonParseException: Unexpected character ('u' (code 117)): expected a valid value (number, String, array, object, 'true', 'false' or 'null')? at [Source: java.io.StringReader@5c201be7; line: 1, column: 2]");
        } catch (org.apache.avro.SchemaParseException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strMap1);
        org.junit.Assert.assertNotNull(strMap2);
        org.junit.Assert.assertNotNull(parser5);
        org.junit.Assert.assertNotNull(strMap6);
        org.junit.Assert.assertNotNull(parser7);
        org.junit.Assert.assertNotNull(schema9);
        org.junit.Assert.assertNotNull(parser11);
        org.junit.Assert.assertNotNull(parser13);
    }

    @Test
    public void test1492() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SchemaM3Random300Test2.test1492");
        org.apache.avro.Schema[] schemaArray0 = new org.apache.avro.Schema[] {};
        java.util.ArrayList<org.apache.avro.Schema> schemaList1 = new java.util.ArrayList<org.apache.avro.Schema>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<org.apache.avro.Schema>) schemaList1, schemaArray0);
        org.apache.avro.Schema schema3 = org.apache.avro.Schema.createUnion((java.util.List<org.apache.avro.Schema>) schemaList1);
        java.util.List<org.apache.avro.Schema> schemaList4 = schema3.getTypes();
        org.apache.avro.Schema schema5 = org.apache.avro.Schema.createUnion(schemaList4);
        org.apache.avro.Schema schema6 = org.apache.avro.Schema.createUnion(schemaList4);
        java.util.List<org.apache.avro.Schema> schemaList7 = schema6.getTypes();
        org.junit.Assert.assertNotNull(schemaArray0);
        org.junit.Assert.assertArrayEquals(schemaArray0, new org.apache.avro.Schema[] {});
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(schema3);
        org.junit.Assert.assertNotNull(schemaList4);
        org.junit.Assert.assertNotNull(schema5);
        org.junit.Assert.assertNotNull(schema6);
        org.junit.Assert.assertNotNull(schemaList7);
    }

    @Test
    public void test1493() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SchemaM3Random300Test2.test1493");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.avro.Schema schema2 = org.apache.avro.Schema.parse("{\r\n  \"type\" : \"map\",\r\n  \"values\" : {\r\n    \"type\" : \"record\",\r\n    \"fields\" : [ ]\r\n  }\r\n}", false);
            org.junit.Assert.fail("Expected exception of type org.apache.avro.SchemaParseException; message: No name in schema: {\"type\":\"record\",\"fields\":[]}");
        } catch (org.apache.avro.SchemaParseException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1494() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SchemaM3Random300Test2.test1494");
        org.apache.avro.Schema schema1 = org.apache.avro.Schema.parse("{\r\n  \"type\" : \"array\",\r\n  \"items\" : {\r\n    \"type\" : \"map\",\r\n    \"values\" : [ ]\r\n  }\r\n}");
        java.lang.String str2 = schema1.toString();
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<org.apache.avro.Schema.Field> fieldList3 = schema1.getFields();
            org.junit.Assert.fail("Expected exception of type org.apache.avro.AvroRuntimeException; message: Not a record: {\"type\":\"array\",\"items\":{\"type\":\"map\",\"values\":[]}}");
        } catch (org.apache.avro.AvroRuntimeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(schema1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "{\"type\":\"array\",\"items\":{\"type\":\"map\",\"values\":[]}}" + "'", str2, "{\"type\":\"array\",\"items\":{\"type\":\"map\",\"values\":[]}}");
    }

    @Test
    public void test1495() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SchemaM3Random300Test2.test1495");
        org.apache.avro.Schema schema2 = org.apache.avro.Schema.parse("[].union", true);
        org.junit.Assert.assertNotNull(schema2);
    }

    @Test
    public void test1496() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SchemaM3Random300Test2.test1496");
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
        org.apache.avro.Schema.Type type20 = schema8.getType();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.avro.Schema.Field field22 = schema8.getField("\"null\"");
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
        org.junit.Assert.assertTrue("'" + type20 + "' != '" + org.apache.avro.Schema.Type.UNION + "'", type20.equals(org.apache.avro.Schema.Type.UNION));
    }

    @Test
    public void test1497() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SchemaM3Random300Test2.test1497");
        org.apache.avro.Schema.Parser parser0 = new org.apache.avro.Schema.Parser();
        java.util.Map<java.lang.String, org.apache.avro.Schema> strMap1 = parser0.getTypes();
        java.util.Map<java.lang.String, org.apache.avro.Schema> strMap2 = parser0.getTypes();
        org.apache.avro.Schema.Parser parser3 = new org.apache.avro.Schema.Parser();
        java.util.Map<java.lang.String, org.apache.avro.Schema> strMap4 = parser3.getTypes();
        org.apache.avro.Schema.Parser parser5 = parser0.addTypes(strMap4);
        org.apache.avro.Schema.Parser parser7 = parser0.setValidate(true);
        org.apache.avro.Schema.Parser parser9 = parser0.setValidate(false);
        org.apache.avro.Schema.Parser parser11 = parser9.setValidate(false);
        java.io.File file12 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.avro.Schema schema13 = parser9.parse(file12);
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
        org.junit.Assert.assertNotNull(parser11);
    }

    @Test
    public void test1498() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SchemaM3Random300Test2.test1498");
        org.codehaus.jackson.JsonNode jsonNode1 = org.apache.avro.Schema.parseJson("{}.union");
        org.junit.Assert.assertNotNull(jsonNode1);
    }

    @Test
    public void test1499() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SchemaM3Random300Test2.test1499");
        org.apache.avro.Schema.Field[] fieldArray0 = new org.apache.avro.Schema.Field[] {};
        java.util.ArrayList<org.apache.avro.Schema.Field> fieldList1 = new java.util.ArrayList<org.apache.avro.Schema.Field>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<org.apache.avro.Schema.Field>) fieldList1, fieldArray0);
        org.apache.avro.Schema schema3 = org.apache.avro.Schema.createRecord((java.util.List<org.apache.avro.Schema.Field>) fieldList1);
        org.apache.avro.Schema schema4 = org.apache.avro.Schema.createRecord((java.util.List<org.apache.avro.Schema.Field>) fieldList1);
        org.apache.avro.Schema schema5 = org.apache.avro.Schema.createRecord((java.util.List<org.apache.avro.Schema.Field>) fieldList1);
        org.apache.avro.Schema schema6 = org.apache.avro.Schema.createRecord((java.util.List<org.apache.avro.Schema.Field>) fieldList1);
        // The following exception was thrown during execution in test generation
        try {
            schema6.addAlias("{\"type\":\"array\",\"items\":\"null\"}");
            org.junit.Assert.fail("Expected exception of type org.apache.avro.SchemaParseException; message: Illegal initial character: {\"type\":\"array\",\"items\":\"null\"}");
        } catch (org.apache.avro.SchemaParseException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(fieldArray0);
        org.junit.Assert.assertArrayEquals(fieldArray0, new org.apache.avro.Schema.Field[] {});
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(schema3);
        org.junit.Assert.assertNotNull(schema4);
        org.junit.Assert.assertNotNull(schema5);
        org.junit.Assert.assertNotNull(schema6);
    }

    @Test
    public void test1500() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SchemaM3Random300Test2.test1500");
        org.apache.avro.Schema schema2 = org.apache.avro.Schema.parse("{\"type\":\"array\",\"items\":{\"type\":\"map\",\"values\":[]}}", false);
        java.lang.String str3 = schema2.toString();
        // The following exception was thrown during execution in test generation
        try {
            int int5 = schema2.getEnumOrdinal("{\"type\":\"map\",\"values\":{\"type\":\"array\",\"items\":\"int\"}}");
            org.junit.Assert.fail("Expected exception of type org.apache.avro.AvroRuntimeException; message: Not an enum: {\"type\":\"array\",\"items\":{\"type\":\"map\",\"values\":[]}}");
        } catch (org.apache.avro.AvroRuntimeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(schema2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "{\"type\":\"array\",\"items\":{\"type\":\"map\",\"values\":[]}}" + "'", str3, "{\"type\":\"array\",\"items\":{\"type\":\"map\",\"values\":[]}}");
    }
}

