package org.apache.avro;

import org.junit.Test;

public class SchemaM3Random300Test1 {

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
    public void test0501() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SchemaM3Random300Test1.test0501");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.avro.Schema schema4 = org.apache.avro.Schema.createFixed("{\"type\":\"array\",\"items\":\"int\"}", "map", "hi!", (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type org.apache.avro.SchemaParseException; message: Illegal initial character: {\"type\":\"array\",\"items\":\"int\"}");
        } catch (org.apache.avro.SchemaParseException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0502() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SchemaM3Random300Test1.test0502");
        org.apache.avro.Schema.Parser parser0 = new org.apache.avro.Schema.Parser();
        org.apache.avro.Schema.Parser parser2 = parser0.setValidate(true);
        org.apache.avro.Schema.Parser parser4 = parser0.setValidate(true);
        org.apache.avro.Schema.Parser parser6 = parser0.setValidate(true);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.avro.Schema schema8 = parser6.parse("{\"type\":\"record\",\"fields\":[]}");
            org.junit.Assert.fail("Expected exception of type org.apache.avro.SchemaParseException; message: No name in schema: {\"type\":\"record\",\"fields\":[]}");
        } catch (org.apache.avro.SchemaParseException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(parser2);
        org.junit.Assert.assertNotNull(parser4);
        org.junit.Assert.assertNotNull(parser6);
    }

    @Test
    public void test0503() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SchemaM3Random300Test1.test0503");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.avro.Schema schema4 = org.apache.avro.Schema.createRecord("{\r\n  \"type\" : \"map\",\r\n  \"values\" : [ ]\r\n}", "", "float", true);
            org.junit.Assert.fail("Expected exception of type org.apache.avro.SchemaParseException; message: Illegal initial character: {??  \"type\" : \"map\",??  \"values\" : [ ]??}");
        } catch (org.apache.avro.SchemaParseException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0504() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SchemaM3Random300Test1.test0504");
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
        java.lang.String str22 = schema8.getFullName();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str23 = schema8.getNamespace();
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
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "union" + "'", str22, "union");
    }

    @Test
    public void test0505() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SchemaM3Random300Test1.test0505");
        java.util.List<java.lang.String> strList3 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.avro.Schema schema4 = org.apache.avro.Schema.createEnum("{\"type\":\"array\",\"items\":[]}", "[ ]", "{\r\n  \"type\" : \"fixed\",\r\n  \"name\" : \"union\",\r\n  \"namespace\" : \"[]\",\r\n  \"doc\" : \"[ ]\",\r\n  \"size\" : 0\r\n}", strList3);
            org.junit.Assert.fail("Expected exception of type org.apache.avro.SchemaParseException; message: Illegal initial character: {\"type\":\"array\",\"items\":[]}");
        } catch (org.apache.avro.SchemaParseException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0506() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SchemaM3Random300Test1.test0506");
        org.apache.avro.Schema.Names names1 = new org.apache.avro.Schema.Names("{\"type\":\"record\",\"fields\":[]}");
        java.lang.String str2 = names1.space();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "{\"type\":\"record\",\"fields\":[]}" + "'", str2, "{\"type\":\"record\",\"fields\":[]}");
    }

    @Test
    public void test0507() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SchemaM3Random300Test1.test0507");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.avro.Schema schema4 = org.apache.avro.Schema.createRecord("{\r\n  \"type\" : \"array\",\r\n  \"items\" : {\r\n    \"type\" : \"map\",\r\n    \"values\" : [ ]\r\n  }\r\n}", "{\"type\":\"map\",\"values\":[]}", "{\"type\":\"record\",\"fields\":[]}", false);
            org.junit.Assert.fail("Expected exception of type org.apache.avro.SchemaParseException; message: Illegal initial character: {??  \"type\" : \"array\",??  \"items\" : {??    \"type\" : \"map\",??    \"values\" : [ ]??  }??}");
        } catch (org.apache.avro.SchemaParseException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0508() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SchemaM3Random300Test1.test0508");
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
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str12 = schema11.getNamespace();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
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
    }

    @Test
    public void test0509() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SchemaM3Random300Test1.test0509");
        org.apache.avro.Schema.Type type0 = org.apache.avro.Schema.Type.INT;
        org.apache.avro.Schema schema1 = org.apache.avro.Schema.create(type0);
        org.apache.avro.Schema schema2 = org.apache.avro.Schema.create(type0);
        // The following exception was thrown during execution in test generation
        try {
            schema2.addAlias("union type:UNION pos:-1");
            org.junit.Assert.fail("Expected exception of type org.apache.avro.AvroRuntimeException; message: Not a named type: \"int\"");
        } catch (org.apache.avro.AvroRuntimeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + type0 + "' != '" + org.apache.avro.Schema.Type.INT + "'", type0.equals(org.apache.avro.Schema.Type.INT));
        org.junit.Assert.assertNotNull(schema1);
        org.junit.Assert.assertNotNull(schema2);
    }

    @Test
    public void test0510() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SchemaM3Random300Test1.test0510");
        org.apache.avro.Schema.LockableArrayList<java.lang.String> strList7 = new org.apache.avro.Schema.LockableArrayList<java.lang.String>((int) (byte) 10);
        org.apache.avro.Schema schema8 = org.apache.avro.Schema.createEnum("[].union", "union type:UNION pos:-1", "union type:UNION pos:-1", (java.util.List<java.lang.String>) strList7);
        java.util.List<java.lang.String> strList9 = schema8.getEnumSymbols();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.avro.Schema schema10 = org.apache.avro.Schema.createEnum("{\"type\":\"map\",\"values\":[]}", "union type:MAP pos:-1", "{}", strList9);
            org.junit.Assert.fail("Expected exception of type org.apache.avro.SchemaParseException; message: Illegal initial character: {\"type\":\"map\",\"values\":[]}");
        } catch (org.apache.avro.SchemaParseException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(schema8);
        org.junit.Assert.assertNotNull(strList9);
    }

    @Test
    public void test0511() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SchemaM3Random300Test1.test0511");
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
        org.apache.avro.Schema.Parser parser19 = parser9.setValidate(false);
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
    public void test0512() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SchemaM3Random300Test1.test0512");
        org.apache.avro.Schema.Parser parser0 = new org.apache.avro.Schema.Parser();
        java.util.Map<java.lang.String, org.apache.avro.Schema> strMap1 = parser0.getTypes();
        org.apache.avro.Schema.Parser parser2 = new org.apache.avro.Schema.Parser();
        org.apache.avro.Schema.Parser parser4 = parser2.setValidate(true);
        java.util.Map<java.lang.String, org.apache.avro.Schema> strMap5 = parser2.getTypes();
        org.apache.avro.Schema.Parser parser6 = parser0.addTypes(strMap5);
        java.lang.Class<?> wildcardClass7 = strMap5.getClass();
        org.junit.Assert.assertNotNull(strMap1);
        org.junit.Assert.assertNotNull(parser4);
        org.junit.Assert.assertNotNull(strMap5);
        org.junit.Assert.assertNotNull(parser6);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0513() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SchemaM3Random300Test1.test0513");
        org.apache.avro.Schema.LockableArrayList<org.codehaus.jackson.JsonNode> jsonNodeList1 = new org.apache.avro.Schema.LockableArrayList<org.codehaus.jackson.JsonNode>((int) 'a');
    }

    @Test
    public void test0514() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SchemaM3Random300Test1.test0514");
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
            java.util.List<org.apache.avro.Schema.Field> fieldList14 = schema11.getFields();
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
        org.junit.Assert.assertNull(str13);
    }

    @Test
    public void test0515() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SchemaM3Random300Test1.test0515");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.avro.Schema schema2 = org.apache.avro.Schema.parse("union", false);
            org.junit.Assert.fail("Expected exception of type org.apache.avro.SchemaParseException; message: org.codehaus.jackson.JsonParseException: Unexpected character ('u' (code 117)): expected a valid value (number, String, array, object, 'true', 'false' or 'null')? at [Source: java.io.StringReader@3be75955; line: 1, column: 2]");
        } catch (org.apache.avro.SchemaParseException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0516() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SchemaM3Random300Test1.test0516");
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
            java.util.List<java.lang.String> strList12 = schema11.getEnumSymbols();
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
    public void test0517() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SchemaM3Random300Test1.test0517");
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
        boolean boolean13 = parser7.getValidate();
        org.junit.Assert.assertNotNull(strMap1);
        org.junit.Assert.assertNotNull(strMap2);
        org.junit.Assert.assertNotNull(parser5);
        org.junit.Assert.assertNotNull(strMap6);
        org.junit.Assert.assertNotNull(parser7);
        org.junit.Assert.assertNotNull(schema9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(parser12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
    }

    @Test
    public void test0518() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SchemaM3Random300Test1.test0518");
        org.apache.avro.Schema schema1 = org.apache.avro.Schema.parse("{\"type\":\"array\",\"items\":{\"type\":\"map\",\"values\":[]}}");
        java.lang.String str3 = schema1.getProp("double");
        // The following exception was thrown during execution in test generation
        try {
            schema1.addAlias("{\r\n  \"type\" : \"array\",\r\n  \"items\" : {\r\n    \"type\" : \"map\",\r\n    \"values\" : [ ]\r\n  }\r\n}");
            org.junit.Assert.fail("Expected exception of type org.apache.avro.AvroRuntimeException; message: Not a named type: {\"type\":\"array\",\"items\":{\"type\":\"map\",\"values\":[]}}");
        } catch (org.apache.avro.AvroRuntimeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(schema1);
        org.junit.Assert.assertNull(str3);
    }

    @Test
    public void test0519() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SchemaM3Random300Test1.test0519");
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
        java.lang.String str12 = schema8.getDoc();
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
        org.junit.Assert.assertNull(str12);
    }

    @Test
    public void test0520() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SchemaM3Random300Test1.test0520");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.avro.Schema schema4 = org.apache.avro.Schema.createFixed("{\"type\":\"record\",\"fields\":[],\"{\\r\\n  \\\"type\\\" : \\\"fixed\\\",\\r\\n  \\\"name\\\" : \\\"union\\\",\\r\\n  \\\"namespace\\\" : \\\"[]\\\",\\r\\n  \\\"doc\\\" : \\\"[ ]\\\",\\r\\n  \\\"size\\\" : 0\\r\\n}\":\"[ ]\"}", "union type:UNION pos:-1", "{\"type\":\"map\",\"values\":[]}", 10);
            org.junit.Assert.fail("Expected exception of type org.apache.avro.SchemaParseException; message: Illegal initial character: {\"type\":\"record\",\"fields\":[],\"{\\r\\n  \\\"type\\\" : \\\"fixed\\\",\\r\\n  \\\"name\\\" : \\\"union\\\",\\r\\n  \\\"namespace\\\" : \\\"[]\\\",\\r\\n  \\\"doc\\\" : \\\"[ ]\\\",\\r\\n  \\\"size\\\" : 0\\r\\n}\":\"[ ]\"}");
        } catch (org.apache.avro.SchemaParseException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0521() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SchemaM3Random300Test1.test0521");
        org.apache.avro.Schema schema4 = org.apache.avro.Schema.createFixed("union", "[ ]", "[]", 0);
        org.apache.avro.Schema.Type type5 = org.apache.avro.Schema.Type.INT;
        org.apache.avro.Schema schema6 = org.apache.avro.Schema.create(type5);
        org.apache.avro.Schema schema7 = org.apache.avro.Schema.createArray(schema6);
        org.apache.avro.Schema schema8 = org.apache.avro.Schema.applyAliases(schema4, schema7);
        java.util.Set<java.lang.String> strSet9 = schema8.getAliases();
        // The following exception was thrown during execution in test generation
        try {
            int int11 = schema8.getEnumOrdinal("{\"type\":\"record\",\"fields\":[],\"{\\r\\n  \\\"type\\\" : \\\"fixed\\\",\\r\\n  \\\"name\\\" : \\\"union\\\",\\r\\n  \\\"namespace\\\" : \\\"[]\\\",\\r\\n  \\\"doc\\\" : \\\"[ ]\\\",\\r\\n  \\\"size\\\" : 0\\r\\n}\":\"[ ]\"}");
            org.junit.Assert.fail("Expected exception of type org.apache.avro.AvroRuntimeException; message: Not an enum: {\"type\":\"fixed\",\"name\":\"union\",\"namespace\":\"[]\",\"doc\":\"[ ]\",\"size\":0}");
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
    public void test0522() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SchemaM3Random300Test1.test0522");
        org.apache.avro.Schema.Parser parser0 = new org.apache.avro.Schema.Parser();
        java.util.Map<java.lang.String, org.apache.avro.Schema> strMap1 = parser0.getTypes();
        java.util.Map<java.lang.String, org.apache.avro.Schema> strMap2 = parser0.getTypes();
        org.apache.avro.Schema.Parser parser3 = new org.apache.avro.Schema.Parser();
        java.util.Map<java.lang.String, org.apache.avro.Schema> strMap4 = parser3.getTypes();
        org.apache.avro.Schema.Parser parser5 = parser0.addTypes(strMap4);
        boolean boolean6 = parser0.getValidate();
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
        org.junit.Assert.assertNotNull(strMap2);
        org.junit.Assert.assertNotNull(strMap4);
        org.junit.Assert.assertNotNull(parser5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test0523() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SchemaM3Random300Test1.test0523");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.avro.Schema schema4 = org.apache.avro.Schema.createRecord("{}", "", "", false);
            org.junit.Assert.fail("Expected exception of type org.apache.avro.SchemaParseException; message: Illegal initial character: {}");
        } catch (org.apache.avro.SchemaParseException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0524() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SchemaM3Random300Test1.test0524");
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
        java.lang.String str25 = schema21.getName();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.avro.Schema schema26 = schema21.getValueType();
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
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "array" + "'", str25, "array");
    }

    @Test
    public void test0525() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SchemaM3Random300Test1.test0525");
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
            boolean boolean18 = schema7.hasEnumSymbol("{\"type\":\"fixed\",\"name\":\"union\",\"namespace\":\"[]\",\"doc\":\"[ ]\",\"size\":0}");
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
    public void test0526() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SchemaM3Random300Test1.test0526");
        org.apache.avro.Schema.LockableArrayList<java.lang.String> strList7 = new org.apache.avro.Schema.LockableArrayList<java.lang.String>((int) (byte) 10);
        org.apache.avro.Schema schema8 = org.apache.avro.Schema.createEnum("[].union", "union type:UNION pos:-1", "union type:UNION pos:-1", (java.util.List<java.lang.String>) strList7);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.avro.Schema schema9 = org.apache.avro.Schema.createEnum("{}", "array", "{\r\n  \"type\" : \"map\",\r\n  \"values\" : [ ]\r\n}", (java.util.List<java.lang.String>) strList7);
            org.junit.Assert.fail("Expected exception of type org.apache.avro.SchemaParseException; message: Illegal initial character: {}");
        } catch (org.apache.avro.SchemaParseException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(schema8);
    }

    @Test
    public void test0527() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SchemaM3Random300Test1.test0527");
        org.apache.avro.Schema.Parser parser0 = new org.apache.avro.Schema.Parser();
        java.util.Map<java.lang.String, org.apache.avro.Schema> strMap1 = parser0.getTypes();
        java.util.Map<java.lang.String, org.apache.avro.Schema> strMap2 = parser0.getTypes();
        org.apache.avro.Schema.Parser parser3 = new org.apache.avro.Schema.Parser();
        org.apache.avro.Schema.Parser parser5 = parser3.setValidate(true);
        java.util.Map<java.lang.String, org.apache.avro.Schema> strMap6 = parser3.getTypes();
        org.apache.avro.Schema.Parser parser7 = parser0.addTypes(strMap6);
        org.apache.avro.Schema.Parser parser9 = parser7.setValidate(true);
        org.apache.avro.Schema.Parser parser11 = parser7.setValidate(true);
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
        org.junit.Assert.assertNotNull(parser9);
        org.junit.Assert.assertNotNull(parser11);
    }

    @Test
    public void test0528() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SchemaM3Random300Test1.test0528");
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
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str13 = schema11.getProp("{\"type\":\"fixed\",\"name\":\"union\",\"namespace\":\"[]\",\"doc\":\"[ ]\",\"size\":0}");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
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
    }

    @Test
    public void test0529() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SchemaM3Random300Test1.test0529");
        org.apache.avro.Schema schema4 = org.apache.avro.Schema.createRecord("[].union", "{\"type\":\"fixed\",\"name\":\"union\",\"namespace\":\"[]\",\"doc\":\"[ ]\",\"size\":0}", "{\"type\":\"map\",\"values\":{\"type\":\"array\",\"items\":{\"type\":\"map\",\"values\":[]}}}", true);
        org.junit.Assert.assertNotNull(schema4);
    }

    @Test
    public void test0530() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SchemaM3Random300Test1.test0530");
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
        java.lang.String str13 = schema10.toString(true);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean15 = schema10.hasEnumSymbol("{\r\n  \"type\" : \"map\",\r\n  \"values\" : {\r\n    \"type\" : \"map\",\r\n    \"values\" : [ ]\r\n  }\r\n}");
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
        org.junit.Assert.assertNotNull(schema11);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "{\r\n  \"type\" : \"map\",\r\n  \"values\" : [ ]\r\n}" + "'", str13, "{\r\n  \"type\" : \"map\",\r\n  \"values\" : [ ]\r\n}");
    }

    @Test
    public void test0531() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SchemaM3Random300Test1.test0531");
        org.apache.avro.Schema.Parser parser0 = new org.apache.avro.Schema.Parser();
        java.util.Map<java.lang.String, org.apache.avro.Schema> strMap1 = parser0.getTypes();
        java.util.Map<java.lang.String, org.apache.avro.Schema> strMap2 = parser0.getTypes();
        org.apache.avro.Schema.Parser parser3 = new org.apache.avro.Schema.Parser();
        java.util.Map<java.lang.String, org.apache.avro.Schema> strMap4 = parser3.getTypes();
        org.apache.avro.Schema.Parser parser5 = parser0.addTypes(strMap4);
        org.apache.avro.Schema.Parser parser7 = parser0.setValidate(true);
        org.apache.avro.Schema.Parser parser9 = parser0.setValidate(false);
        java.util.Map<java.lang.String, org.apache.avro.Schema> strMap10 = parser0.getTypes();
        java.io.File file11 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.avro.Schema schema12 = parser0.parse(file11);
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
        org.junit.Assert.assertNotNull(strMap10);
    }

    @Test
    public void test0532() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SchemaM3Random300Test1.test0532");
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
        org.apache.avro.Schema.Parser parser19 = parser9.setValidate(false);
        java.io.InputStream inputStream20 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.avro.Schema schema21 = parser9.parse(inputStream20);
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
    public void test0533() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SchemaM3Random300Test1.test0533");
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
            java.util.List<org.apache.avro.Schema> schemaList8 = schema7.getTypes();
            org.junit.Assert.fail("Expected exception of type org.apache.avro.AvroRuntimeException; message: Not a union: {\"type\":\"record\",\"fields\":[]}");
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
    public void test0534() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SchemaM3Random300Test1.test0534");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.avro.Schema schema4 = org.apache.avro.Schema.createFixed("hi!", "{\"type\":\"fixed\",\"name\":\"union\",\"namespace\":\"[]\",\"doc\":\"union type:UNION pos:-1\",\"size\":100}", "{\"type\":\"array\",\"items\":{\"type\":\"map\",\"values\":[]}}", (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type org.apache.avro.SchemaParseException; message: Illegal character in: hi!");
        } catch (org.apache.avro.SchemaParseException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0535() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SchemaM3Random300Test1.test0535");
        org.apache.avro.Schema.Parser parser0 = new org.apache.avro.Schema.Parser();
        org.apache.avro.Schema.Parser parser2 = parser0.setValidate(true);
        org.apache.avro.Schema.Parser parser4 = parser0.setValidate(true);
        org.apache.avro.Schema.Parser parser6 = parser0.setValidate(true);
        org.apache.avro.Schema schema8 = parser0.parse("[].union");
        org.apache.avro.Schema schema10 = parser0.parse("[ ]");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean12 = schema10.hasEnumSymbol("union type:UNION pos:-1");
            org.junit.Assert.fail("Expected exception of type org.apache.avro.AvroRuntimeException; message: Not an enum: []");
        } catch (org.apache.avro.AvroRuntimeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(parser2);
        org.junit.Assert.assertNotNull(parser4);
        org.junit.Assert.assertNotNull(parser6);
        org.junit.Assert.assertNotNull(schema8);
        org.junit.Assert.assertNotNull(schema10);
    }

    @Test
    public void test0536() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SchemaM3Random300Test1.test0536");
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
        names0.space("{\"type\":\"array\",\"items\":{\"type\":\"map\",\"values\":[]}}");
        java.util.Collection<org.apache.avro.Schema> schemaCollection20 = names0.values();
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
        org.junit.Assert.assertNotNull(schemaCollection20);
    }

    @Test
    public void test0537() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SchemaM3Random300Test1.test0537");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.avro.Schema schema4 = org.apache.avro.Schema.createFixed("{\"type\":\"fixed\",\"name\":\"union\",\"namespace\":\"[]\",\"doc\":\"[ ]\",\"size\":0}", "{\"type\":\"map\",\"values\":{\"type\":\"array\",\"items\":{\"type\":\"map\",\"values\":[]},\"\":\"{\\r\\n  \\\"type\\\" : \\\"record\\\",\\r\\n  \\\"fields\\\" : [ ]\\r\\n}\"}}", "{\"type\":\"array\",\"items\":[]}", (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type org.apache.avro.SchemaParseException; message: Illegal initial character: {\"type\":\"fixed\",\"name\":\"union\",\"namespace\":\"[]\",\"doc\":\"[ ]\",\"size\":0}");
        } catch (org.apache.avro.SchemaParseException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0538() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SchemaM3Random300Test1.test0538");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.avro.Schema schema4 = org.apache.avro.Schema.createRecord("{\"type\":\"map\",\"values\":{\"type\":\"array\",\"items\":{\"type\":\"map\",\"values\":[]}}}", "\"double\"", "union", true);
            org.junit.Assert.fail("Expected exception of type org.apache.avro.SchemaParseException; message: Illegal initial character: {\"type\":\"map\",\"values\":{\"type\":\"array\",\"items\":{\"type\":\"map\",\"values\":[]}}}");
        } catch (org.apache.avro.SchemaParseException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0539() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SchemaM3Random300Test1.test0539");
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
            java.util.List<org.apache.avro.Schema.Field> fieldList13 = schema12.getFields();
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
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNotNull(schema12);
    }

    @Test
    public void test0540() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SchemaM3Random300Test1.test0540");
        org.apache.avro.Schema schema1 = org.apache.avro.Schema.parse("{\"type\":\"array\",\"items\":[]}");
        java.lang.String str2 = schema1.getName();
        org.apache.avro.Schema.Field[] fieldArray3 = new org.apache.avro.Schema.Field[] {};
        java.util.ArrayList<org.apache.avro.Schema.Field> fieldList4 = new java.util.ArrayList<org.apache.avro.Schema.Field>();
        boolean boolean5 = java.util.Collections.addAll((java.util.Collection<org.apache.avro.Schema.Field>) fieldList4, fieldArray3);
        org.apache.avro.Schema schema6 = org.apache.avro.Schema.createRecord((java.util.List<org.apache.avro.Schema.Field>) fieldList4);
        org.apache.avro.Schema schema7 = org.apache.avro.Schema.createRecord((java.util.List<org.apache.avro.Schema.Field>) fieldList4);
        // The following exception was thrown during execution in test generation
        try {
            schema1.setFields((java.util.List<org.apache.avro.Schema.Field>) fieldList4);
            org.junit.Assert.fail("Expected exception of type org.apache.avro.AvroRuntimeException; message: Not a record: {\"type\":\"array\",\"items\":[]}");
        } catch (org.apache.avro.AvroRuntimeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(schema1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "array" + "'", str2, "array");
        org.junit.Assert.assertNotNull(fieldArray3);
        org.junit.Assert.assertArrayEquals(fieldArray3, new org.apache.avro.Schema.Field[] {});
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(schema6);
        org.junit.Assert.assertNotNull(schema7);
    }

    @Test
    public void test0541() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SchemaM3Random300Test1.test0541");
        java.util.List<java.lang.String> strList3 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.avro.Schema schema4 = org.apache.avro.Schema.createEnum("\"double\"", "", "[].union", strList3);
            org.junit.Assert.fail("Expected exception of type org.apache.avro.SchemaParseException; message: Illegal initial character: \"double\"");
        } catch (org.apache.avro.SchemaParseException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0542() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SchemaM3Random300Test1.test0542");
        org.codehaus.jackson.JsonNode jsonNode0 = null;
        org.apache.avro.Schema.Names names1 = new org.apache.avro.Schema.Names();
        names1.space("[ ]");
        java.lang.Object obj4 = names1.clone();
        boolean boolean7 = names1.remove((java.lang.Object) 1, (java.lang.Object) true);
        org.apache.avro.Schema[] schemaArray8 = new org.apache.avro.Schema[] {};
        java.util.ArrayList<org.apache.avro.Schema> schemaList9 = new java.util.ArrayList<org.apache.avro.Schema>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<org.apache.avro.Schema>) schemaList9, schemaArray8);
        org.apache.avro.Schema schema11 = org.apache.avro.Schema.createUnion((java.util.List<org.apache.avro.Schema>) schemaList9);
        org.apache.avro.Schema[] schemaArray12 = new org.apache.avro.Schema[] {};
        java.util.ArrayList<org.apache.avro.Schema> schemaList13 = new java.util.ArrayList<org.apache.avro.Schema>();
        boolean boolean14 = java.util.Collections.addAll((java.util.Collection<org.apache.avro.Schema>) schemaList13, schemaArray12);
        org.apache.avro.Schema schema15 = org.apache.avro.Schema.createUnion((java.util.List<org.apache.avro.Schema>) schemaList13);
        org.apache.avro.Schema schema16 = org.apache.avro.Schema.applyAliases(schema11, schema15);
        java.util.List<org.apache.avro.Schema> schemaList17 = schema16.getTypes();
        boolean boolean19 = schema16.equals((java.lang.Object) "hi!");
        java.lang.String str20 = schema16.getDoc();
        org.apache.avro.Schema schema21 = names1.get((java.lang.Object) str20);
        java.util.Collection<org.apache.avro.Schema> schemaCollection22 = names1.values();
        org.codehaus.jackson.JsonFactory jsonFactory23 = org.apache.avro.Schema.FACTORY;
        org.codehaus.jackson.JsonFactory[] jsonFactoryArray24 = new org.codehaus.jackson.JsonFactory[] { jsonFactory23 };
        java.util.ArrayList<org.codehaus.jackson.JsonFactory> jsonFactoryList25 = new java.util.ArrayList<org.codehaus.jackson.JsonFactory>();
        boolean boolean26 = java.util.Collections.addAll((java.util.Collection<org.codehaus.jackson.JsonFactory>) jsonFactoryList25, jsonFactoryArray24);
        org.apache.avro.Schema.LockableArrayList<org.codehaus.jackson.JsonFactory> jsonFactoryList27 = new org.apache.avro.Schema.LockableArrayList<org.codehaus.jackson.JsonFactory>((java.util.List<org.codehaus.jackson.JsonFactory>) jsonFactoryList25);
        boolean boolean28 = names1.containsKey((java.lang.Object) jsonFactoryList27);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.avro.Schema schema29 = org.apache.avro.Schema.parse(jsonNode0, names1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(obj4);
        org.junit.Assert.assertEquals(obj4.toString(), "{}");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj4), "{}");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj4), "{}");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(schemaArray8);
        org.junit.Assert.assertArrayEquals(schemaArray8, new org.apache.avro.Schema[] {});
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(schema11);
        org.junit.Assert.assertNotNull(schemaArray12);
        org.junit.Assert.assertArrayEquals(schemaArray12, new org.apache.avro.Schema[] {});
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(schema15);
        org.junit.Assert.assertNotNull(schema16);
        org.junit.Assert.assertNotNull(schemaList17);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNull(str20);
        org.junit.Assert.assertNull(schema21);
        org.junit.Assert.assertNotNull(schemaCollection22);
        org.junit.Assert.assertNotNull(jsonFactory23);
        org.junit.Assert.assertNotNull(jsonFactoryArray24);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
    }

    @Test
    public void test0543() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SchemaM3Random300Test1.test0543");
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
        java.io.InputStream inputStream19 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.avro.Schema schema20 = parser6.parse(inputStream19);
            org.junit.Assert.fail("Expected exception of type java.io.EOFException; message: No content to map to Object due to end of input");
        } catch (java.io.EOFException e) {
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
    public void test0544() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SchemaM3Random300Test1.test0544");
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
        org.apache.avro.Schema schema15 = schema14.getElementType();
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
        org.junit.Assert.assertNotNull(schema15);
    }

    @Test
    public void test0545() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SchemaM3Random300Test1.test0545");
        org.apache.avro.Schema.LockableArrayList<org.codehaus.jackson.ObjectCodec> objectCodecList1 = new org.apache.avro.Schema.LockableArrayList<org.codehaus.jackson.ObjectCodec>((int) (short) 1);
    }

    @Test
    public void test0546() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SchemaM3Random300Test1.test0546");
        org.apache.avro.Schema.LockableArrayList<java.lang.String> strList4 = new org.apache.avro.Schema.LockableArrayList<java.lang.String>((int) '#');
        // The following exception was thrown during execution in test generation
        try {
            org.apache.avro.Schema schema5 = org.apache.avro.Schema.createEnum("\"double\"", "\"double\"", "[]", (java.util.List<java.lang.String>) strList4);
            org.junit.Assert.fail("Expected exception of type org.apache.avro.SchemaParseException; message: Illegal initial character: \"double\"");
        } catch (org.apache.avro.SchemaParseException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0547() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SchemaM3Random300Test1.test0547");
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
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<java.lang.String> strList10 = schema9.getEnumSymbols();
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
        org.junit.Assert.assertNotNull(schema9);
    }

    @Test
    public void test0548() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SchemaM3Random300Test1.test0548");
        org.apache.avro.Schema.Names names1 = new org.apache.avro.Schema.Names("union");
        java.lang.String str2 = names1.space();
        java.util.Collection<org.apache.avro.Schema> schemaCollection3 = names1.values();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "union" + "'", str2, "union");
        org.junit.Assert.assertNotNull(schemaCollection3);
    }

    @Test
    public void test0549() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SchemaM3Random300Test1.test0549");
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
            java.util.List<java.lang.String> strList9 = schema8.getEnumSymbols();
            org.junit.Assert.fail("Expected exception of type org.apache.avro.AvroRuntimeException; message: Not an enum: []");
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
    public void test0550() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SchemaM3Random300Test1.test0550");
        org.apache.avro.Schema.LockableArrayList<org.apache.avro.Schema> schemaList1 = new org.apache.avro.Schema.LockableArrayList<org.apache.avro.Schema>(1);
        org.apache.avro.Schema schema2 = org.apache.avro.Schema.createUnion((java.util.List<org.apache.avro.Schema>) schemaList1);
        java.lang.String str3 = schema2.toString();
        org.junit.Assert.assertNotNull(schema2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "[]" + "'", str3, "[]");
    }

    @Test
    public void test0551() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SchemaM3Random300Test1.test0551");
        org.apache.avro.Schema.Parser parser0 = new org.apache.avro.Schema.Parser();
        org.apache.avro.Schema.Parser parser2 = parser0.setValidate(true);
        java.util.Map<java.lang.String, org.apache.avro.Schema> strMap3 = parser0.getTypes();
        org.apache.avro.Schema schema5 = parser0.parse("{\"type\":\"array\",\"items\":{\"type\":\"map\",\"values\":[]}}");
        java.io.File file6 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.avro.Schema schema7 = parser0.parse(file6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(parser2);
        org.junit.Assert.assertNotNull(strMap3);
        org.junit.Assert.assertNotNull(schema5);
    }

    @Test
    public void test0552() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SchemaM3Random300Test1.test0552");
        org.apache.avro.Schema.Type type0 = org.apache.avro.Schema.Type.FLOAT;
        org.apache.avro.Schema schema1 = org.apache.avro.Schema.create(type0);
        org.apache.avro.Schema schema2 = org.apache.avro.Schema.create(type0);
        // The following exception was thrown during execution in test generation
        try {
            schema2.addAlias("{}");
            org.junit.Assert.fail("Expected exception of type org.apache.avro.AvroRuntimeException; message: Not a named type: \"float\"");
        } catch (org.apache.avro.AvroRuntimeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + type0 + "' != '" + org.apache.avro.Schema.Type.FLOAT + "'", type0.equals(org.apache.avro.Schema.Type.FLOAT));
        org.junit.Assert.assertNotNull(schema1);
        org.junit.Assert.assertNotNull(schema2);
    }

    @Test
    public void test0553() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SchemaM3Random300Test1.test0553");
        org.apache.avro.Schema schema4 = org.apache.avro.Schema.createFixed("float", "[ ]", "array", 1);
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<org.apache.avro.Schema> schemaList5 = schema4.getTypes();
            org.junit.Assert.fail("Expected exception of type org.apache.avro.AvroRuntimeException; message: Not a union: {\"type\":\"fixed\",\"name\":\"float\",\"namespace\":\"array\",\"doc\":\"[ ]\",\"size\":1}");
        } catch (org.apache.avro.AvroRuntimeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(schema4);
    }

    @Test
    public void test0554() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SchemaM3Random300Test1.test0554");
        org.apache.avro.Schema.Names names0 = new org.apache.avro.Schema.Names();
        names0.space("[ ]");
        java.util.Collection<org.apache.avro.Schema> schemaCollection3 = names0.values();
        java.util.Collection<org.apache.avro.Schema> schemaCollection4 = names0.values();
        org.junit.Assert.assertNotNull(schemaCollection3);
        org.junit.Assert.assertNotNull(schemaCollection4);
    }

    @Test
    public void test0555() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SchemaM3Random300Test1.test0555");
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
        org.apache.avro.Schema.Field[] fieldArray21 = new org.apache.avro.Schema.Field[] {};
        java.util.ArrayList<org.apache.avro.Schema.Field> fieldList22 = new java.util.ArrayList<org.apache.avro.Schema.Field>();
        boolean boolean23 = java.util.Collections.addAll((java.util.Collection<org.apache.avro.Schema.Field>) fieldList22, fieldArray21);
        org.apache.avro.Schema schema24 = org.apache.avro.Schema.createRecord((java.util.List<org.apache.avro.Schema.Field>) fieldList22);
        java.util.List<org.apache.avro.Schema.Field> fieldList25 = schema24.getFields();
        org.apache.avro.Schema schema26 = org.apache.avro.Schema.createRecord(fieldList25);
        org.apache.avro.Schema schema27 = org.apache.avro.Schema.createRecord(fieldList25);
        org.apache.avro.Schema schema28 = org.apache.avro.Schema.createRecord(fieldList25);
        // The following exception was thrown during execution in test generation
        try {
            schema8.setFields(fieldList25);
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
        org.junit.Assert.assertNotNull(fieldArray21);
        org.junit.Assert.assertArrayEquals(fieldArray21, new org.apache.avro.Schema.Field[] {});
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(schema24);
        org.junit.Assert.assertNotNull(fieldList25);
        org.junit.Assert.assertNotNull(schema26);
        org.junit.Assert.assertNotNull(schema27);
        org.junit.Assert.assertNotNull(schema28);
    }

    @Test
    public void test0556() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SchemaM3Random300Test1.test0556");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.avro.Schema schema4 = org.apache.avro.Schema.createRecord("hi!", "{\r\n  \"type\" : \"map\",\r\n  \"values\" : [ ]\r\n}", "[]", false);
            org.junit.Assert.fail("Expected exception of type org.apache.avro.SchemaParseException; message: Illegal character in: hi!");
        } catch (org.apache.avro.SchemaParseException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0557() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SchemaM3Random300Test1.test0557");
        org.apache.avro.Schema schema4 = org.apache.avro.Schema.createFixed("[].union", "union type:UNION pos:-1", "[]", (int) (short) 100);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean5 = schema4.isError();
            org.junit.Assert.fail("Expected exception of type org.apache.avro.AvroRuntimeException; message: Not a record: {\"type\":\"fixed\",\"name\":\"union\",\"namespace\":\"[]\",\"doc\":\"union type:UNION pos:-1\",\"size\":100}");
        } catch (org.apache.avro.AvroRuntimeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(schema4);
    }

    @Test
    public void test0558() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SchemaM3Random300Test1.test0558");
        org.apache.avro.Schema.LockableArrayList<java.util.RandomAccess> randomAccessList1 = new org.apache.avro.Schema.LockableArrayList<java.util.RandomAccess>(10);
    }

    @Test
    public void test0559() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SchemaM3Random300Test1.test0559");
        org.codehaus.jackson.JsonNode jsonNode1 = org.apache.avro.Schema.parseJson("{\"type\":\"record\",\"fields\":[]}");
        org.junit.Assert.assertNotNull(jsonNode1);
    }

    @Test
    public void test0560() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SchemaM3Random300Test1.test0560");
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
        java.lang.Class<?> wildcardClass16 = schema15.getClass();
        org.junit.Assert.assertNotNull(strMap1);
        org.junit.Assert.assertNotNull(strMap2);
        org.junit.Assert.assertNotNull(parser5);
        org.junit.Assert.assertNotNull(strMap6);
        org.junit.Assert.assertNotNull(parser7);
        org.junit.Assert.assertNotNull(schema9);
        org.junit.Assert.assertNotNull(parser11);
        org.junit.Assert.assertNotNull(schema13);
        org.junit.Assert.assertNotNull(schema15);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test0561() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SchemaM3Random300Test1.test0561");
        org.apache.avro.Schema.LockableArrayList<java.lang.String> strList3 = new org.apache.avro.Schema.LockableArrayList<java.lang.String>();
        org.apache.avro.Schema.LockableArrayList<java.lang.String> strList4 = new org.apache.avro.Schema.LockableArrayList<java.lang.String>((java.util.List<java.lang.String>) strList3);
        org.apache.avro.Schema schema5 = org.apache.avro.Schema.createEnum("[].union", "{}", "[].union", (java.util.List<java.lang.String>) strList4);
        org.apache.avro.Schema schema6 = org.apache.avro.Schema.createMap(schema5);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean7 = schema5.isError();
            org.junit.Assert.fail("Expected exception of type org.apache.avro.AvroRuntimeException; message: Not a record: {\"type\":\"enum\",\"name\":\"union\",\"namespace\":\"[]\",\"doc\":\"{}\",\"symbols\":[]}");
        } catch (org.apache.avro.AvroRuntimeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(schema5);
        org.junit.Assert.assertNotNull(schema6);
    }

    @Test
    public void test0562() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SchemaM3Random300Test1.test0562");
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
        java.lang.String str12 = schema4.getName();
        org.apache.avro.Schema schema13 = org.apache.avro.Schema.createMap(schema4);
        // The following exception was thrown during execution in test generation
        try {
            java.util.Set<java.lang.String> strSet14 = schema4.getAliases();
            org.junit.Assert.fail("Expected exception of type org.apache.avro.AvroRuntimeException; message: Not a named type: []");
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
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "union" + "'", str12, "union");
        org.junit.Assert.assertNotNull(schema13);
    }

    @Test
    public void test0563() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SchemaM3Random300Test1.test0563");
        org.apache.avro.Schema.Names names0 = new org.apache.avro.Schema.Names();
        java.lang.String str1 = names0.toString();
        java.lang.String str2 = names0.toString();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "{}" + "'", str1, "{}");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "{}" + "'", str2, "{}");
    }

    @Test
    public void test0564() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SchemaM3Random300Test1.test0564");
        org.apache.avro.Schema.Parser parser0 = new org.apache.avro.Schema.Parser();
        java.util.Map<java.lang.String, org.apache.avro.Schema> strMap1 = parser0.getTypes();
        java.util.Map<java.lang.String, org.apache.avro.Schema> strMap2 = parser0.getTypes();
        org.apache.avro.Schema.Parser parser3 = new org.apache.avro.Schema.Parser();
        org.apache.avro.Schema.Parser parser5 = parser3.setValidate(true);
        java.util.Map<java.lang.String, org.apache.avro.Schema> strMap6 = parser3.getTypes();
        org.apache.avro.Schema.Parser parser7 = parser0.addTypes(strMap6);
        org.apache.avro.Schema.Parser parser9 = parser7.setValidate(true);
        org.apache.avro.Schema.Parser parser11 = parser7.setValidate(true);
        org.apache.avro.Schema schema13 = parser7.parse("{\"type\":\"array\",\"items\":\"int\"}");
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
        org.junit.Assert.assertNotNull(parser9);
        org.junit.Assert.assertNotNull(parser11);
        org.junit.Assert.assertNotNull(schema13);
    }

    @Test
    public void test0565() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SchemaM3Random300Test1.test0565");
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
        org.apache.avro.Schema schema13 = org.apache.avro.Schema.createArray(schema11);
        // The following exception was thrown during execution in test generation
        try {
            schema13.addAlias("{null={\"type\":\"fixed\",\"name\":\"union\",\"namespace\":\"[]\",\"doc\":\"[ ]\",\"size\":0}}");
            org.junit.Assert.fail("Expected exception of type org.apache.avro.AvroRuntimeException; message: Not a named type: {\"type\":\"array\",\"items\":{\"type\":\"array\",\"items\":{\"type\":\"map\",\"values\":[]}}}");
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
        org.junit.Assert.assertNotNull(schema13);
    }

    @Test
    public void test0566() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SchemaM3Random300Test1.test0566");
        // The following exception was thrown during execution in test generation
        try {
            org.codehaus.jackson.JsonNode jsonNode1 = org.apache.avro.Schema.parseJson("float");
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: org.codehaus.jackson.JsonParseException: Unrecognized token 'float': was expecting 'null', 'true' or 'false'? at [Source: java.io.StringReader@efe1928; line: 1, column: 11]");
        } catch (java.lang.RuntimeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0567() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SchemaM3Random300Test1.test0567");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.avro.Schema schema4 = org.apache.avro.Schema.createRecord("{\"type\":\"array\",\"items\":{\"type\":\"map\",\"values\":[]}}", "", "{\"type\":\"map\",\"values\":[]}", true);
            org.junit.Assert.fail("Expected exception of type org.apache.avro.SchemaParseException; message: Illegal initial character: {\"type\":\"array\",\"items\":{\"type\":\"map\",\"values\":[]}}");
        } catch (org.apache.avro.SchemaParseException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0568() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SchemaM3Random300Test1.test0568");
        org.apache.avro.Schema schema2 = org.apache.avro.Schema.parse("{\"type\":\"map\",\"values\":{\"type\":\"array\",\"items\":{\"type\":\"map\",\"values\":[]}}}", false);
        org.apache.avro.Schema.Field[] fieldArray3 = new org.apache.avro.Schema.Field[] {};
        java.util.ArrayList<org.apache.avro.Schema.Field> fieldList4 = new java.util.ArrayList<org.apache.avro.Schema.Field>();
        boolean boolean5 = java.util.Collections.addAll((java.util.Collection<org.apache.avro.Schema.Field>) fieldList4, fieldArray3);
        org.apache.avro.Schema schema6 = org.apache.avro.Schema.createRecord((java.util.List<org.apache.avro.Schema.Field>) fieldList4);
        org.apache.avro.Schema schema7 = org.apache.avro.Schema.createRecord((java.util.List<org.apache.avro.Schema.Field>) fieldList4);
        org.apache.avro.Schema schema8 = org.apache.avro.Schema.createRecord((java.util.List<org.apache.avro.Schema.Field>) fieldList4);
        org.apache.avro.Schema schema9 = org.apache.avro.Schema.createRecord((java.util.List<org.apache.avro.Schema.Field>) fieldList4);
        org.apache.avro.Schema schema10 = org.apache.avro.Schema.createRecord((java.util.List<org.apache.avro.Schema.Field>) fieldList4);
        org.apache.avro.Schema schema11 = org.apache.avro.Schema.createRecord((java.util.List<org.apache.avro.Schema.Field>) fieldList4);
        // The following exception was thrown during execution in test generation
        try {
            schema2.setFields((java.util.List<org.apache.avro.Schema.Field>) fieldList4);
            org.junit.Assert.fail("Expected exception of type org.apache.avro.AvroRuntimeException; message: Not a record: {\"type\":\"map\",\"values\":{\"type\":\"array\",\"items\":{\"type\":\"map\",\"values\":[]}}}");
        } catch (org.apache.avro.AvroRuntimeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(schema2);
        org.junit.Assert.assertNotNull(fieldArray3);
        org.junit.Assert.assertArrayEquals(fieldArray3, new org.apache.avro.Schema.Field[] {});
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(schema6);
        org.junit.Assert.assertNotNull(schema7);
        org.junit.Assert.assertNotNull(schema8);
        org.junit.Assert.assertNotNull(schema9);
        org.junit.Assert.assertNotNull(schema10);
        org.junit.Assert.assertNotNull(schema11);
    }

    @Test
    public void test0569() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SchemaM3Random300Test1.test0569");
        org.apache.avro.Schema[] schemaArray0 = new org.apache.avro.Schema[] {};
        java.util.ArrayList<org.apache.avro.Schema> schemaList1 = new java.util.ArrayList<org.apache.avro.Schema>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<org.apache.avro.Schema>) schemaList1, schemaArray0);
        org.apache.avro.Schema schema3 = org.apache.avro.Schema.createUnion((java.util.List<org.apache.avro.Schema>) schemaList1);
        java.util.List<org.apache.avro.Schema> schemaList4 = schema3.getTypes();
        java.lang.String str5 = schema3.getDoc();
        // The following exception was thrown during execution in test generation
        try {
            schema3.addProp("{null={\"type\":\"fixed\",\"name\":\"union\",\"namespace\":\"[]\",\"doc\":\"[ ]\",\"size\":0}}", "{\"type\":\"array\",\"items\":\"int\"}");
            org.junit.Assert.fail("Expected exception of type org.apache.avro.AvroRuntimeException; message: Can't set properties on a union: []");
        } catch (org.apache.avro.AvroRuntimeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(schemaArray0);
        org.junit.Assert.assertArrayEquals(schemaArray0, new org.apache.avro.Schema[] {});
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(schema3);
        org.junit.Assert.assertNotNull(schemaList4);
        org.junit.Assert.assertNull(str5);
    }

    @Test
    public void test0570() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SchemaM3Random300Test1.test0570");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.avro.Schema schema4 = org.apache.avro.Schema.createFixed("union type:MAP pos:-1", "", "{\"type\":\"map\",\"values\":{\"type\":\"array\",\"items\":{\"type\":\"map\",\"values\":[]}}}", (int) ' ');
            org.junit.Assert.fail("Expected exception of type org.apache.avro.SchemaParseException; message: Illegal character in: union type:MAP pos:-1");
        } catch (org.apache.avro.SchemaParseException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0571() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SchemaM3Random300Test1.test0571");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.avro.Schema schema4 = org.apache.avro.Schema.createFixed("{\"type\":\"fixed\",\"name\":\"union\",\"namespace\":\"[]\",\"doc\":\"union type:UNION pos:-1\",\"size\":100}", "union type:MAP pos:-1", "{\"type\":\"map\",\"values\":{\"type\":\"array\",\"items\":{\"type\":\"map\",\"values\":[]},\"\":\"{\\r\\n  \\\"type\\\" : \\\"record\\\",\\r\\n  \\\"fields\\\" : [ ]\\r\\n}\"}}", 100);
            org.junit.Assert.fail("Expected exception of type org.apache.avro.SchemaParseException; message: Illegal initial character: {\"type\":\"fixed\",\"name\":\"union\",\"namespace\":\"[]\",\"doc\":\"union type:UNION pos:-1\",\"size\":100}");
        } catch (org.apache.avro.SchemaParseException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0572() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SchemaM3Random300Test1.test0572");
        org.apache.avro.Schema schema1 = org.apache.avro.Schema.parse("{\r\n  \"type\" : \"array\",\r\n  \"items\" : {\r\n    \"type\" : \"map\",\r\n    \"values\" : [ ]\r\n  }\r\n}");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = schema1.getFixedSize();
            org.junit.Assert.fail("Expected exception of type org.apache.avro.AvroRuntimeException; message: Not fixed: {\"type\":\"array\",\"items\":{\"type\":\"map\",\"values\":[]}}");
        } catch (org.apache.avro.AvroRuntimeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(schema1);
    }

    @Test
    public void test0573() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SchemaM3Random300Test1.test0573");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.avro.Schema schema4 = org.apache.avro.Schema.createRecord("{}", "{\r\n  \"type\" : \"map\",\r\n  \"values\" : [ ]\r\n}", "{\"type\":\"record\",\"fields\":[],\"{\\r\\n  \\\"type\\\" : \\\"fixed\\\",\\r\\n  \\\"name\\\" : \\\"union\\\",\\r\\n  \\\"namespace\\\" : \\\"[]\\\",\\r\\n  \\\"doc\\\" : \\\"[ ]\\\",\\r\\n  \\\"size\\\" : 0\\r\\n}\":\"[ ]\"}", true);
            org.junit.Assert.fail("Expected exception of type org.apache.avro.SchemaParseException; message: Illegal initial character: {}");
        } catch (org.apache.avro.SchemaParseException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0574() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SchemaM3Random300Test1.test0574");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.avro.Schema schema4 = org.apache.avro.Schema.createRecord("", "{\r\n  \"type\" : \"map\",\r\n  \"values\" : {\r\n    \"type\" : \"map\",\r\n    \"values\" : [ ]\r\n  }\r\n}", "float", false);
            org.junit.Assert.fail("Expected exception of type org.apache.avro.SchemaParseException; message: Empty name");
        } catch (org.apache.avro.SchemaParseException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0575() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SchemaM3Random300Test1.test0575");
        org.apache.avro.Schema.Parser parser0 = new org.apache.avro.Schema.Parser();
        org.apache.avro.Schema.Parser parser2 = parser0.setValidate(true);
        java.util.Map<java.lang.String, org.apache.avro.Schema> strMap3 = parser0.getTypes();
        org.apache.avro.Schema.Parser parser5 = parser0.setValidate(true);
        org.apache.avro.Schema.Parser parser7 = parser0.setValidate(true);
        java.util.Map<java.lang.String, org.apache.avro.Schema> strMap8 = parser0.getTypes();
        org.apache.avro.Schema.Parser parser10 = parser0.setValidate(false);
        org.apache.avro.Schema.Parser parser12 = parser10.setValidate(true);
        org.apache.avro.Schema schema14 = parser10.parse("{\r\n  \"type\" : \"array\",\r\n  \"items\" : {\r\n    \"type\" : \"map\",\r\n    \"values\" : [ ]\r\n  }\r\n}");
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<java.lang.String> strList15 = schema14.getEnumSymbols();
            org.junit.Assert.fail("Expected exception of type org.apache.avro.AvroRuntimeException; message: Not an enum: {\"type\":\"array\",\"items\":{\"type\":\"map\",\"values\":[]}}");
        } catch (org.apache.avro.AvroRuntimeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(parser2);
        org.junit.Assert.assertNotNull(strMap3);
        org.junit.Assert.assertNotNull(parser5);
        org.junit.Assert.assertNotNull(parser7);
        org.junit.Assert.assertNotNull(strMap8);
        org.junit.Assert.assertNotNull(parser10);
        org.junit.Assert.assertNotNull(parser12);
        org.junit.Assert.assertNotNull(schema14);
    }

    @Test
    public void test0576() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SchemaM3Random300Test1.test0576");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.avro.Schema.LockableArrayList<java.lang.String> strList1 = new org.apache.avro.Schema.LockableArrayList<java.lang.String>((-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal Capacity: -1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0577() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SchemaM3Random300Test1.test0577");
        org.apache.avro.Schema schema4 = org.apache.avro.Schema.createRecord("[].union", "union", "{\r\n  \"type\" : \"map\",\r\n  \"values\" : [ ]\r\n}", false);
        org.junit.Assert.assertNotNull(schema4);
    }

    @Test
    public void test0578() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SchemaM3Random300Test1.test0578");
        org.apache.avro.Schema schema2 = org.apache.avro.Schema.parse("{\"type\":\"array\",\"items\":\"int\"}", true);
        org.apache.avro.Schema schema3 = schema2.getElementType();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean4 = schema3.isError();
            org.junit.Assert.fail("Expected exception of type org.apache.avro.AvroRuntimeException; message: Not a record: \"int\"");
        } catch (org.apache.avro.AvroRuntimeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(schema2);
        org.junit.Assert.assertNotNull(schema3);
    }

    @Test
    public void test0579() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SchemaM3Random300Test1.test0579");
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
            boolean boolean22 = schema21.isError();
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
        org.junit.Assert.assertNotNull(schema21);
    }

    @Test
    public void test0580() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SchemaM3Random300Test1.test0580");
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
        // The following exception was thrown during execution in test generation
        try {
            org.apache.avro.Schema schema14 = parser12.parse("double");
            org.junit.Assert.fail("Expected exception of type org.apache.avro.SchemaParseException; message: org.codehaus.jackson.JsonParseException: Unexpected character ('d' (code 100)): expected a valid value (number, String, array, object, 'true', 'false' or 'null')? at [Source: java.io.StringReader@3ce9d3af; line: 1, column: 2]");
        } catch (org.apache.avro.SchemaParseException e) {
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
    public void test0581() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SchemaM3Random300Test1.test0581");
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
        org.apache.avro.Schema schema17 = org.apache.avro.Schema.createArray(schema12);
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<org.apache.avro.Schema> schemaList18 = schema12.getTypes();
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
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNotNull(schema12);
        org.junit.Assert.assertNotNull(schema15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(schema17);
    }

    @Test
    public void test0582() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SchemaM3Random300Test1.test0582");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.avro.Schema schema4 = org.apache.avro.Schema.createFixed("{\r\n  \"type\" : \"fixed\",\r\n  \"name\" : \"union\",\r\n  \"namespace\" : \"[]\",\r\n  \"doc\" : \"[ ]\",\r\n  \"size\" : 0\r\n}", "union type:MAP pos:-1", "[ ]", (int) '4');
            org.junit.Assert.fail("Expected exception of type org.apache.avro.SchemaParseException; message: Illegal initial character: {??  \"type\" : \"fixed\",??  \"name\" : \"union\",??  \"namespace\" : \"[]\",??  \"doc\" : \"[ ]\",??  \"size\" : 0??}");
        } catch (org.apache.avro.SchemaParseException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0583() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SchemaM3Random300Test1.test0583");
        org.apache.avro.Schema.Parser parser0 = new org.apache.avro.Schema.Parser();
        org.apache.avro.Schema.Parser parser2 = parser0.setValidate(true);
        org.apache.avro.Schema.Parser parser4 = parser0.setValidate(true);
        boolean boolean5 = parser0.getValidate();
        java.io.File file6 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.avro.Schema schema7 = parser0.parse(file6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(parser2);
        org.junit.Assert.assertNotNull(parser4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
    }

    @Test
    public void test0584() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SchemaM3Random300Test1.test0584");
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
        java.lang.String str22 = schema8.toString(true);
        java.lang.String str23 = schema8.toString();
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
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "{\r\n  \"type\" : \"fixed\",\r\n  \"name\" : \"union\",\r\n  \"namespace\" : \"[]\",\r\n  \"doc\" : \"[ ]\",\r\n  \"size\" : 0\r\n}" + "'", str22, "{\r\n  \"type\" : \"fixed\",\r\n  \"name\" : \"union\",\r\n  \"namespace\" : \"[]\",\r\n  \"doc\" : \"[ ]\",\r\n  \"size\" : 0\r\n}");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "{\"type\":\"fixed\",\"name\":\"union\",\"namespace\":\"[]\",\"doc\":\"[ ]\",\"size\":0}" + "'", str23, "{\"type\":\"fixed\",\"name\":\"union\",\"namespace\":\"[]\",\"doc\":\"[ ]\",\"size\":0}");
    }

    @Test
    public void test0585() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SchemaM3Random300Test1.test0585");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.avro.Schema schema4 = org.apache.avro.Schema.createFixed("{\"type\":\"array\",\"items\":{\"type\":\"map\",\"values\":[]}}", "", "map", (int) '4');
            org.junit.Assert.fail("Expected exception of type org.apache.avro.SchemaParseException; message: Illegal initial character: {\"type\":\"array\",\"items\":{\"type\":\"map\",\"values\":[]}}");
        } catch (org.apache.avro.SchemaParseException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0586() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SchemaM3Random300Test1.test0586");
        // The following exception was thrown during execution in test generation
        try {
            org.codehaus.jackson.JsonNode jsonNode1 = org.apache.avro.Schema.parseJson("double");
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: org.codehaus.jackson.JsonParseException: Unexpected character ('d' (code 100)): expected a valid value (number, String, array, object, 'true', 'false' or 'null')? at [Source: java.io.StringReader@449009a4; line: 1, column: 2]");
        } catch (java.lang.RuntimeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0587() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SchemaM3Random300Test1.test0587");
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
        java.util.Map<java.lang.String, org.apache.avro.Schema> strMap16 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.avro.Schema.Parser parser17 = parser7.addTypes(strMap16);
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
    }

    @Test
    public void test0588() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SchemaM3Random300Test1.test0588");
        org.apache.avro.Schema schema4 = org.apache.avro.Schema.createRecord("double", "{\"type\":\"map\",\"values\":[]}", "[]", true);
        org.junit.Assert.assertNotNull(schema4);
    }

    @Test
    public void test0589() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SchemaM3Random300Test1.test0589");
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
            boolean boolean19 = schema7.hasEnumSymbol("{\"type\":\"record\",\"fields\":[],\"{\\r\\n  \\\"type\\\" : \\\"fixed\\\",\\r\\n  \\\"name\\\" : \\\"union\\\",\\r\\n  \\\"namespace\\\" : \\\"[]\\\",\\r\\n  \\\"doc\\\" : \\\"[ ]\\\",\\r\\n  \\\"size\\\" : 0\\r\\n}\":\"[ ]\"}");
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
        org.junit.Assert.assertNotNull(schemaList17);
    }

    @Test
    public void test0590() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SchemaM3Random300Test1.test0590");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.avro.Schema schema4 = org.apache.avro.Schema.createFixed("{\r\n  \"type\" : \"fixed\",\r\n  \"name\" : \"union\",\r\n  \"namespace\" : \"[]\",\r\n  \"doc\" : \"[ ]\",\r\n  \"size\" : 0\r\n}", "{\r\n  \"type\" : \"fixed\",\r\n  \"name\" : \"union\",\r\n  \"namespace\" : \"[]\",\r\n  \"doc\" : \"[ ]\",\r\n  \"size\" : 0\r\n}", "{\"type\":\"array\",\"items\":{\"type\":\"map\",\"values\":[]}}", (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type org.apache.avro.SchemaParseException; message: Illegal initial character: {??  \"type\" : \"fixed\",??  \"name\" : \"union\",??  \"namespace\" : \"[]\",??  \"doc\" : \"[ ]\",??  \"size\" : 0??}");
        } catch (org.apache.avro.SchemaParseException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0591() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SchemaM3Random300Test1.test0591");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.avro.Schema schema4 = org.apache.avro.Schema.createFixed("{\"type\":\"fixed\",\"name\":\"union\",\"namespace\":\"[]\",\"doc\":\"union type:UNION pos:-1\",\"size\":100}", "{\"type\":\"record\",\"fields\":[],\"{\\r\\n  \\\"type\\\" : \\\"fixed\\\",\\r\\n  \\\"name\\\" : \\\"union\\\",\\r\\n  \\\"namespace\\\" : \\\"[]\\\",\\r\\n  \\\"doc\\\" : \\\"[ ]\\\",\\r\\n  \\\"size\\\" : 0\\r\\n}\":\"[ ]\"}", "{}", 0);
            org.junit.Assert.fail("Expected exception of type org.apache.avro.SchemaParseException; message: Illegal initial character: {\"type\":\"fixed\",\"name\":\"union\",\"namespace\":\"[]\",\"doc\":\"union type:UNION pos:-1\",\"size\":100}");
        } catch (org.apache.avro.SchemaParseException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0592() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SchemaM3Random300Test1.test0592");
        org.apache.avro.Schema.Names names1 = new org.apache.avro.Schema.Names("");
        org.apache.avro.Schema.Type type2 = org.apache.avro.Schema.Type.FLOAT;
        org.apache.avro.Schema schema3 = org.apache.avro.Schema.create(type2);
        schema3.addProp("{\r\n  \"type\" : \"record\",\r\n  \"fields\" : [ ]\r\n}", "{\r\n  \"type\" : \"map\",\r\n  \"values\" : [ ]\r\n}");
        java.lang.String str8 = schema3.getProp("union type:MAP pos:-1");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean9 = names1.contains(schema3);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: org.apache.avro.Schema$FloatSchema cannot be cast to org.apache.avro.Schema$NamedSchema");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + type2 + "' != '" + org.apache.avro.Schema.Type.FLOAT + "'", type2.equals(org.apache.avro.Schema.Type.FLOAT));
        org.junit.Assert.assertNotNull(schema3);
        org.junit.Assert.assertNull(str8);
    }

    @Test
    public void test0593() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SchemaM3Random300Test1.test0593");
        org.apache.avro.Schema.LockableArrayList<java.lang.String> strList4 = new org.apache.avro.Schema.LockableArrayList<java.lang.String>((int) (short) 0);
        org.apache.avro.Schema.LockableArrayList<java.lang.String> strList5 = new org.apache.avro.Schema.LockableArrayList<java.lang.String>((java.util.List<java.lang.String>) strList4);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.avro.Schema schema6 = org.apache.avro.Schema.createEnum("{\r\n  \"type\" : \"record\",\r\n  \"fields\" : [ ]\r\n}", "{\r\n  \"type\" : \"record\",\r\n  \"fields\" : [ ]\r\n}", "hi!", (java.util.List<java.lang.String>) strList5);
            org.junit.Assert.fail("Expected exception of type org.apache.avro.SchemaParseException; message: Illegal initial character: {??  \"type\" : \"record\",??  \"fields\" : [ ]??}");
        } catch (org.apache.avro.SchemaParseException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0594() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SchemaM3Random300Test1.test0594");
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
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean12 = schema8.isError();
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
        org.junit.Assert.assertNull(str11);
    }

    @Test
    public void test0595() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SchemaM3Random300Test1.test0595");
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
            java.util.List<java.lang.String> strList13 = schema12.getEnumSymbols();
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
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNotNull(schema12);
    }

    @Test
    public void test0596() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SchemaM3Random300Test1.test0596");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.avro.Schema schema4 = org.apache.avro.Schema.createFixed("", "{\"type\":\"fixed\",\"name\":\"union\",\"namespace\":\"[]\",\"doc\":\"union type:UNION pos:-1\",\"size\":100}", "\"double\"", 10);
            org.junit.Assert.fail("Expected exception of type org.apache.avro.SchemaParseException; message: Empty name");
        } catch (org.apache.avro.SchemaParseException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0597() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SchemaM3Random300Test1.test0597");
        org.apache.avro.Schema.Type type0 = org.apache.avro.Schema.Type.FIXED;
        java.lang.Class<?> wildcardClass1 = type0.getClass();
        org.junit.Assert.assertTrue("'" + type0 + "' != '" + org.apache.avro.Schema.Type.FIXED + "'", type0.equals(org.apache.avro.Schema.Type.FIXED));
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test0598() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SchemaM3Random300Test1.test0598");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.avro.Schema schema4 = org.apache.avro.Schema.createRecord("{\"type\":\"array\",\"items\":{\"type\":\"map\",\"values\":[]}}", "union", "", true);
            org.junit.Assert.fail("Expected exception of type org.apache.avro.SchemaParseException; message: Illegal initial character: {\"type\":\"array\",\"items\":{\"type\":\"map\",\"values\":[]}}");
        } catch (org.apache.avro.SchemaParseException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0599() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SchemaM3Random300Test1.test0599");
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
        // The following exception was thrown during execution in test generation
        try {
            org.apache.avro.Schema schema17 = parser7.parse("");
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
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(parser13);
        org.junit.Assert.assertNotNull(strMap14);
        org.junit.Assert.assertNotNull(parser15);
    }

    @Test
    public void test0600() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SchemaM3Random300Test1.test0600");
        org.apache.avro.Schema.Field[] fieldArray0 = new org.apache.avro.Schema.Field[] {};
        java.util.ArrayList<org.apache.avro.Schema.Field> fieldList1 = new java.util.ArrayList<org.apache.avro.Schema.Field>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<org.apache.avro.Schema.Field>) fieldList1, fieldArray0);
        org.apache.avro.Schema schema3 = org.apache.avro.Schema.createRecord((java.util.List<org.apache.avro.Schema.Field>) fieldList1);
        org.apache.avro.Schema schema4 = org.apache.avro.Schema.createRecord((java.util.List<org.apache.avro.Schema.Field>) fieldList1);
        org.apache.avro.Schema schema5 = org.apache.avro.Schema.createRecord((java.util.List<org.apache.avro.Schema.Field>) fieldList1);
        org.apache.avro.Schema schema6 = org.apache.avro.Schema.createRecord((java.util.List<org.apache.avro.Schema.Field>) fieldList1);
        org.apache.avro.Schema schema7 = org.apache.avro.Schema.createRecord((java.util.List<org.apache.avro.Schema.Field>) fieldList1);
        org.apache.avro.Schema schema8 = org.apache.avro.Schema.createRecord((java.util.List<org.apache.avro.Schema.Field>) fieldList1);
        java.lang.String str9 = schema8.getDoc();
        org.junit.Assert.assertNotNull(fieldArray0);
        org.junit.Assert.assertArrayEquals(fieldArray0, new org.apache.avro.Schema.Field[] {});
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(schema3);
        org.junit.Assert.assertNotNull(schema4);
        org.junit.Assert.assertNotNull(schema5);
        org.junit.Assert.assertNotNull(schema6);
        org.junit.Assert.assertNotNull(schema7);
        org.junit.Assert.assertNotNull(schema8);
        org.junit.Assert.assertNull(str9);
    }

    @Test
    public void test0601() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SchemaM3Random300Test1.test0601");
        org.apache.avro.Schema.Type type0 = org.apache.avro.Schema.Type.INT;
        org.apache.avro.Schema schema1 = org.apache.avro.Schema.create(type0);
        org.apache.avro.Schema schema2 = org.apache.avro.Schema.create(type0);
        org.apache.avro.Schema schema3 = org.apache.avro.Schema.create(type0);
        java.lang.String str4 = schema3.getName();
        org.junit.Assert.assertTrue("'" + type0 + "' != '" + org.apache.avro.Schema.Type.INT + "'", type0.equals(org.apache.avro.Schema.Type.INT));
        org.junit.Assert.assertNotNull(schema1);
        org.junit.Assert.assertNotNull(schema2);
        org.junit.Assert.assertNotNull(schema3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "int" + "'", str4, "int");
    }

    @Test
    public void test0602() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SchemaM3Random300Test1.test0602");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.avro.Schema schema2 = org.apache.avro.Schema.parse("union", true);
            org.junit.Assert.fail("Expected exception of type org.apache.avro.SchemaParseException; message: org.codehaus.jackson.JsonParseException: Unexpected character ('u' (code 117)): expected a valid value (number, String, array, object, 'true', 'false' or 'null')? at [Source: java.io.StringReader@5bf074a8; line: 1, column: 2]");
        } catch (org.apache.avro.SchemaParseException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0603() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SchemaM3Random300Test1.test0603");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.avro.Schema schema4 = org.apache.avro.Schema.createFixed("[ ]", "[]", "{null={\"type\":\"fixed\",\"name\":\"union\",\"namespace\":\"[]\",\"doc\":\"[ ]\",\"size\":0}}", (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type org.apache.avro.SchemaParseException; message: Illegal initial character: [ ]");
        } catch (org.apache.avro.SchemaParseException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0604() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SchemaM3Random300Test1.test0604");
        org.apache.avro.Schema.LockableArrayList<java.lang.String> strList7 = new org.apache.avro.Schema.LockableArrayList<java.lang.String>((int) (byte) 10);
        org.apache.avro.Schema schema8 = org.apache.avro.Schema.createEnum("[].union", "union type:UNION pos:-1", "union type:UNION pos:-1", (java.util.List<java.lang.String>) strList7);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.avro.Schema schema9 = org.apache.avro.Schema.createEnum("", "map", "{\r\n  \"type\" : \"array\",\r\n  \"items\" : {\r\n    \"type\" : \"map\",\r\n    \"values\" : [ ]\r\n  }\r\n}", (java.util.List<java.lang.String>) strList7);
            org.junit.Assert.fail("Expected exception of type org.apache.avro.SchemaParseException; message: Empty name");
        } catch (org.apache.avro.SchemaParseException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(schema8);
    }

    @Test
    public void test0605() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SchemaM3Random300Test1.test0605");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.avro.Schema schema4 = org.apache.avro.Schema.createRecord("union type:UNION pos:-1", "array", "{\r\n  \"type\" : \"fixed\",\r\n  \"name\" : \"union\",\r\n  \"namespace\" : \"[]\",\r\n  \"doc\" : \"[ ]\",\r\n  \"size\" : 0\r\n}", true);
            org.junit.Assert.fail("Expected exception of type org.apache.avro.SchemaParseException; message: Illegal character in: union type:UNION pos:-1");
        } catch (org.apache.avro.SchemaParseException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0606() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SchemaM3Random300Test1.test0606");
        org.apache.avro.Schema.Type type0 = org.apache.avro.Schema.Type.DOUBLE;
        org.apache.avro.Schema schema1 = org.apache.avro.Schema.create(type0);
        org.apache.avro.Schema schema2 = org.apache.avro.Schema.createMap(schema1);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean4 = schema2.hasEnumSymbol("{\"type\":\"array\",\"items\":{\"type\":\"map\",\"values\":[]}}");
            org.junit.Assert.fail("Expected exception of type org.apache.avro.AvroRuntimeException; message: Not an enum: {\"type\":\"map\",\"values\":\"double\"}");
        } catch (org.apache.avro.AvroRuntimeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + type0 + "' != '" + org.apache.avro.Schema.Type.DOUBLE + "'", type0.equals(org.apache.avro.Schema.Type.DOUBLE));
        org.junit.Assert.assertNotNull(schema1);
        org.junit.Assert.assertNotNull(schema2);
    }

    @Test
    public void test0607() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SchemaM3Random300Test1.test0607");
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
            org.apache.avro.Schema schema12 = schema8.getValueType();
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
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "[ ]" + "'", str11, "[ ]");
    }

    @Test
    public void test0608() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SchemaM3Random300Test1.test0608");
        org.apache.avro.Schema.LockableArrayList<java.lang.String> strList4 = new org.apache.avro.Schema.LockableArrayList<java.lang.String>((int) (short) 10);
        org.apache.avro.Schema.LockableArrayList<java.lang.String> strList5 = new org.apache.avro.Schema.LockableArrayList<java.lang.String>((java.util.List<java.lang.String>) strList4);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.avro.Schema schema6 = org.apache.avro.Schema.createEnum("{\"type\":\"array\",\"items\":\"int\"}", "{\r\n  \"type\" : \"array\",\r\n  \"items\" : {\r\n    \"type\" : \"map\",\r\n    \"values\" : [ ]\r\n  }\r\n}", "[]", (java.util.List<java.lang.String>) strList4);
            org.junit.Assert.fail("Expected exception of type org.apache.avro.SchemaParseException; message: Illegal initial character: {\"type\":\"array\",\"items\":\"int\"}");
        } catch (org.apache.avro.SchemaParseException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0609() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SchemaM3Random300Test1.test0609");
        org.apache.avro.Schema schema4 = org.apache.avro.Schema.createFixed("union", "[ ]", "[]", 0);
        org.apache.avro.Schema.Type type5 = org.apache.avro.Schema.Type.INT;
        org.apache.avro.Schema schema6 = org.apache.avro.Schema.create(type5);
        org.apache.avro.Schema schema7 = org.apache.avro.Schema.createArray(schema6);
        org.apache.avro.Schema schema8 = org.apache.avro.Schema.applyAliases(schema4, schema7);
        org.apache.avro.Schema.Field[] fieldArray9 = new org.apache.avro.Schema.Field[] {};
        java.util.ArrayList<org.apache.avro.Schema.Field> fieldList10 = new java.util.ArrayList<org.apache.avro.Schema.Field>();
        boolean boolean11 = java.util.Collections.addAll((java.util.Collection<org.apache.avro.Schema.Field>) fieldList10, fieldArray9);
        org.apache.avro.Schema schema12 = org.apache.avro.Schema.createRecord((java.util.List<org.apache.avro.Schema.Field>) fieldList10);
        java.util.List<org.apache.avro.Schema.Field> fieldList13 = schema12.getFields();
        // The following exception was thrown during execution in test generation
        try {
            schema8.setFields(fieldList13);
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
        org.junit.Assert.assertNotNull(fieldList13);
    }

    @Test
    public void test0610() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SchemaM3Random300Test1.test0610");
        java.util.List<java.lang.String> strList3 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.avro.Schema schema4 = org.apache.avro.Schema.createEnum("{\r\n  \"type\" : \"array\",\r\n  \"items\" : {\r\n    \"type\" : \"map\",\r\n    \"values\" : [ ]\r\n  }\r\n}", "{\"type\":\"fixed\",\"name\":\"union\",\"namespace\":\"[]\",\"doc\":\"union type:UNION pos:-1\",\"size\":100}", "union type:UNION pos:-1", strList3);
            org.junit.Assert.fail("Expected exception of type org.apache.avro.SchemaParseException; message: Illegal initial character: {??  \"type\" : \"array\",??  \"items\" : {??    \"type\" : \"map\",??    \"values\" : [ ]??  }??}");
        } catch (org.apache.avro.SchemaParseException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0611() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SchemaM3Random300Test1.test0611");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.avro.Schema schema4 = org.apache.avro.Schema.createFixed("{\"type\":\"fixed\",\"name\":\"union\",\"namespace\":\"[]\",\"doc\":\"[ ]\",\"size\":0}", "[]", "union type:MAP pos:-1", (int) ' ');
            org.junit.Assert.fail("Expected exception of type org.apache.avro.SchemaParseException; message: Illegal initial character: {\"type\":\"fixed\",\"name\":\"union\",\"namespace\":\"[]\",\"doc\":\"[ ]\",\"size\":0}");
        } catch (org.apache.avro.SchemaParseException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0612() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SchemaM3Random300Test1.test0612");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.avro.Schema schema1 = org.apache.avro.Schema.parse("union");
            org.junit.Assert.fail("Expected exception of type org.apache.avro.SchemaParseException; message: org.codehaus.jackson.JsonParseException: Unexpected character ('u' (code 117)): expected a valid value (number, String, array, object, 'true', 'false' or 'null')? at [Source: java.io.StringReader@445a2fa8; line: 1, column: 2]");
        } catch (org.apache.avro.SchemaParseException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0613() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SchemaM3Random300Test1.test0613");
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
        java.lang.String str17 = schema8.getFullName();
        java.lang.String str18 = schema8.getFullName();
        org.apache.avro.Schema.Parser parser19 = new org.apache.avro.Schema.Parser();
        java.util.Map<java.lang.String, org.apache.avro.Schema> strMap20 = parser19.getTypes();
        java.util.Map<java.lang.String, org.apache.avro.Schema> strMap21 = parser19.getTypes();
        org.apache.avro.Schema.Parser parser22 = new org.apache.avro.Schema.Parser();
        org.apache.avro.Schema.Parser parser24 = parser22.setValidate(true);
        java.util.Map<java.lang.String, org.apache.avro.Schema> strMap25 = parser22.getTypes();
        org.apache.avro.Schema.Parser parser26 = parser19.addTypes(strMap25);
        org.apache.avro.Schema schema28 = parser26.parse("{\"type\":\"map\",\"values\":[]}");
        org.apache.avro.Schema.Parser parser30 = parser26.setValidate(false);
        org.apache.avro.Schema schema32 = parser26.parse("[].union");
        boolean boolean33 = schema8.equals((java.lang.Object) schema32);
        org.codehaus.jackson.JsonNode jsonNode36 = org.apache.avro.Schema.parseJson("[].union");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.avro.Schema.Field field37 = new org.apache.avro.Schema.Field("{\"type\":\"array\",\"items\":{\"type\":\"map\",\"values\":[]}}", schema8, "{null={\"type\":\"fixed\",\"name\":\"union\",\"namespace\":\"[]\",\"doc\":\"[ ]\",\"size\":0}}", jsonNode36);
            org.junit.Assert.fail("Expected exception of type org.apache.avro.SchemaParseException; message: Illegal initial character: {\"type\":\"array\",\"items\":{\"type\":\"map\",\"values\":[]}}");
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
        org.junit.Assert.assertNotNull(schema11);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "union" + "'", str17, "union");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "union" + "'", str18, "union");
        org.junit.Assert.assertNotNull(strMap20);
        org.junit.Assert.assertNotNull(strMap21);
        org.junit.Assert.assertNotNull(parser24);
        org.junit.Assert.assertNotNull(strMap25);
        org.junit.Assert.assertNotNull(parser26);
        org.junit.Assert.assertNotNull(schema28);
        org.junit.Assert.assertNotNull(parser30);
        org.junit.Assert.assertNotNull(schema32);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
        org.junit.Assert.assertNotNull(jsonNode36);
    }

    @Test
    public void test0614() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SchemaM3Random300Test1.test0614");
        org.apache.avro.Schema.LockableArrayList<java.lang.String> strList4 = new org.apache.avro.Schema.LockableArrayList<java.lang.String>((int) '#');
        // The following exception was thrown during execution in test generation
        try {
            org.apache.avro.Schema schema5 = org.apache.avro.Schema.createEnum("{\"type\":\"array\",\"items\":[]}", "", "float", (java.util.List<java.lang.String>) strList4);
            org.junit.Assert.fail("Expected exception of type org.apache.avro.SchemaParseException; message: Illegal initial character: {\"type\":\"array\",\"items\":[]}");
        } catch (org.apache.avro.SchemaParseException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0615() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SchemaM3Random300Test1.test0615");
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
            java.lang.String str17 = schema15.getNamespace();
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
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "[]" + "'", str14, "[]");
        org.junit.Assert.assertNotNull(schema15);
        org.junit.Assert.assertTrue("'" + type16 + "' != '" + org.apache.avro.Schema.Type.ARRAY + "'", type16.equals(org.apache.avro.Schema.Type.ARRAY));
    }

    @Test
    public void test0616() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SchemaM3Random300Test1.test0616");
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
            org.apache.avro.Schema schema21 = schema20.getElementType();
            org.junit.Assert.fail("Expected exception of type org.apache.avro.AvroRuntimeException; message: Not an array: {\"type\":\"fixed\",\"name\":\"union\",\"namespace\":\"[]\",\"doc\":\"[ ]\",\"size\":0}");
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
    public void test0617() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SchemaM3Random300Test1.test0617");
        org.apache.avro.Schema.LockableArrayList<org.apache.avro.Schema.Field> fieldList1 = new org.apache.avro.Schema.LockableArrayList<org.apache.avro.Schema.Field>((int) (byte) 100);
        org.apache.avro.Schema schema2 = org.apache.avro.Schema.createRecord((java.util.List<org.apache.avro.Schema.Field>) fieldList1);
        // The following exception was thrown during execution in test generation
        try {
            int int4 = schema2.getEnumOrdinal("{\r\n  \"type\" : \"record\",\r\n  \"fields\" : [ ]\r\n}");
            org.junit.Assert.fail("Expected exception of type org.apache.avro.AvroRuntimeException; message: Not an enum: {\"type\":\"record\",\"fields\":[]}");
        } catch (org.apache.avro.AvroRuntimeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(schema2);
    }

    @Test
    public void test0618() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SchemaM3Random300Test1.test0618");
        org.apache.avro.Schema.LockableArrayList<java.lang.String> strList7 = new org.apache.avro.Schema.LockableArrayList<java.lang.String>((int) (byte) 10);
        org.apache.avro.Schema schema8 = org.apache.avro.Schema.createEnum("[].union", "union type:UNION pos:-1", "union type:UNION pos:-1", (java.util.List<java.lang.String>) strList7);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.avro.Schema schema9 = org.apache.avro.Schema.createEnum("{\r\n  \"type\" : \"map\",\r\n  \"values\" : [ ]\r\n}", "double", "hi!", (java.util.List<java.lang.String>) strList7);
            org.junit.Assert.fail("Expected exception of type org.apache.avro.SchemaParseException; message: Illegal initial character: {??  \"type\" : \"map\",??  \"values\" : [ ]??}");
        } catch (org.apache.avro.SchemaParseException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(schema8);
    }

    @Test
    public void test0619() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SchemaM3Random300Test1.test0619");
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
        java.lang.String str41 = schema28.getDoc();
        org.apache.avro.Schema.Names names42 = null;
        org.codehaus.jackson.JsonGenerator jsonGenerator43 = null;
        // The following exception was thrown during execution in test generation
        try {
            schema28.toJson(names42, jsonGenerator43);
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
        org.junit.Assert.assertNull(str41);
    }

    @Test
    public void test0620() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SchemaM3Random300Test1.test0620");
        org.apache.avro.Schema.Parser parser0 = new org.apache.avro.Schema.Parser();
        java.util.Map<java.lang.String, org.apache.avro.Schema> strMap1 = parser0.getTypes();
        java.util.Map<java.lang.String, org.apache.avro.Schema> strMap2 = parser0.getTypes();
        org.apache.avro.Schema.Parser parser3 = new org.apache.avro.Schema.Parser();
        org.apache.avro.Schema.Parser parser5 = parser3.setValidate(true);
        java.util.Map<java.lang.String, org.apache.avro.Schema> strMap6 = parser3.getTypes();
        org.apache.avro.Schema.Parser parser7 = parser0.addTypes(strMap6);
        java.util.Map<java.lang.String, org.apache.avro.Schema> strMap8 = parser0.getTypes();
        org.apache.avro.Schema.Parser parser10 = parser0.setValidate(false);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.avro.Schema schema12 = parser10.parse("int");
            org.junit.Assert.fail("Expected exception of type org.apache.avro.SchemaParseException; message: org.codehaus.jackson.JsonParseException: Unexpected character ('i' (code 105)): expected a valid value (number, String, array, object, 'true', 'false' or 'null')? at [Source: java.io.StringReader@7383795f; line: 1, column: 2]");
        } catch (org.apache.avro.SchemaParseException e) {
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
    public void test0621() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SchemaM3Random300Test1.test0621");
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
        java.lang.String str12 = schema11.getFullName();
        java.lang.Class<?> wildcardClass13 = schema11.getClass();
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
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "union" + "'", str12, "union");
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0622() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SchemaM3Random300Test1.test0622");
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
        java.lang.String str15 = schema13.getProp("{\"type\":\"fixed\",\"name\":\"union\",\"namespace\":\"[]\",\"doc\":\"[ ]\",\"size\":0}");
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<java.lang.String> strList16 = schema13.getEnumSymbols();
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
        org.junit.Assert.assertNull(str15);
    }

    @Test
    public void test0623() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SchemaM3Random300Test1.test0623");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.avro.Schema schema4 = org.apache.avro.Schema.createFixed("{\"type\":\"fixed\",\"name\":\"union\",\"namespace\":\"[]\",\"doc\":\"union type:UNION pos:-1\",\"size\":100}", "{\"type\":\"map\",\"values\":{\"type\":\"array\",\"items\":{\"type\":\"map\",\"values\":[]}}}", "{\"type\":\"record\",\"fields\":[],\"{\\r\\n  \\\"type\\\" : \\\"fixed\\\",\\r\\n  \\\"name\\\" : \\\"union\\\",\\r\\n  \\\"namespace\\\" : \\\"[]\\\",\\r\\n  \\\"doc\\\" : \\\"[ ]\\\",\\r\\n  \\\"size\\\" : 0\\r\\n}\":\"[ ]\"}", (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type org.apache.avro.SchemaParseException; message: Illegal initial character: {\"type\":\"fixed\",\"name\":\"union\",\"namespace\":\"[]\",\"doc\":\"union type:UNION pos:-1\",\"size\":100}");
        } catch (org.apache.avro.SchemaParseException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0624() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SchemaM3Random300Test1.test0624");
        org.apache.avro.Schema schema2 = org.apache.avro.Schema.parse("{\"type\":\"map\",\"values\":{\"type\":\"array\",\"items\":{\"type\":\"map\",\"values\":[]}}}", true);
        org.junit.Assert.assertNotNull(schema2);
    }

    @Test
    public void test0625() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SchemaM3Random300Test1.test0625");
        org.apache.avro.Schema.LockableArrayList<org.codehaus.jackson.map.ObjectMapper> objectMapperList1 = new org.apache.avro.Schema.LockableArrayList<org.codehaus.jackson.map.ObjectMapper>(10);
        java.lang.Class<?> wildcardClass2 = objectMapperList1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test0626() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SchemaM3Random300Test1.test0626");
        org.apache.avro.Schema schema4 = org.apache.avro.Schema.createRecord("float", "int", "map", false);
        org.junit.Assert.assertNotNull(schema4);
    }

    @Test
    public void test0627() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SchemaM3Random300Test1.test0627");
        org.apache.avro.Schema.Parser parser0 = new org.apache.avro.Schema.Parser();
        java.util.Map<java.lang.String, org.apache.avro.Schema> strMap1 = parser0.getTypes();
        java.util.Map<java.lang.String, org.apache.avro.Schema> strMap2 = parser0.getTypes();
        org.apache.avro.Schema.Parser parser3 = new org.apache.avro.Schema.Parser();
        org.apache.avro.Schema.Parser parser5 = parser3.setValidate(true);
        java.util.Map<java.lang.String, org.apache.avro.Schema> strMap6 = parser3.getTypes();
        org.apache.avro.Schema.Parser parser7 = parser0.addTypes(strMap6);
        org.apache.avro.Schema schema9 = parser7.parse("{\"type\":\"map\",\"values\":[]}");
        org.apache.avro.Schema.Parser parser11 = parser7.setValidate(false);
        java.io.File file12 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.avro.Schema schema13 = parser7.parse(file12);
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
    }

    @Test
    public void test0628() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SchemaM3Random300Test1.test0628");
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
            int int15 = schema14.getFixedSize();
            org.junit.Assert.fail("Expected exception of type org.apache.avro.AvroRuntimeException; message: Not fixed: {\"type\":\"array\",\"items\":[]}");
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
    public void test0629() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SchemaM3Random300Test1.test0629");
        org.apache.avro.Schema schema4 = org.apache.avro.Schema.createFixed("union", "[ ]", "[]", 0);
        org.apache.avro.Schema.Type type5 = org.apache.avro.Schema.Type.INT;
        org.apache.avro.Schema schema6 = org.apache.avro.Schema.create(type5);
        org.apache.avro.Schema schema7 = org.apache.avro.Schema.createArray(schema6);
        org.apache.avro.Schema schema8 = org.apache.avro.Schema.applyAliases(schema4, schema7);
        org.apache.avro.Schema.Type type9 = schema8.getType();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.avro.Schema schema10 = org.apache.avro.Schema.create(type9);
            org.junit.Assert.fail("Expected exception of type org.apache.avro.AvroRuntimeException; message: Can't create a: FIXED");
        } catch (org.apache.avro.AvroRuntimeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(schema4);
        org.junit.Assert.assertTrue("'" + type5 + "' != '" + org.apache.avro.Schema.Type.INT + "'", type5.equals(org.apache.avro.Schema.Type.INT));
        org.junit.Assert.assertNotNull(schema6);
        org.junit.Assert.assertNotNull(schema7);
        org.junit.Assert.assertNotNull(schema8);
        org.junit.Assert.assertTrue("'" + type9 + "' != '" + org.apache.avro.Schema.Type.FIXED + "'", type9.equals(org.apache.avro.Schema.Type.FIXED));
    }

    @Test
    public void test0630() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SchemaM3Random300Test1.test0630");
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
        org.apache.avro.Schema.Field[] fieldArray24 = new org.apache.avro.Schema.Field[] {};
        java.util.ArrayList<org.apache.avro.Schema.Field> fieldList25 = new java.util.ArrayList<org.apache.avro.Schema.Field>();
        boolean boolean26 = java.util.Collections.addAll((java.util.Collection<org.apache.avro.Schema.Field>) fieldList25, fieldArray24);
        org.apache.avro.Schema schema27 = org.apache.avro.Schema.createRecord((java.util.List<org.apache.avro.Schema.Field>) fieldList25);
        org.apache.avro.Schema schema28 = org.apache.avro.Schema.createRecord((java.util.List<org.apache.avro.Schema.Field>) fieldList25);
        org.apache.avro.Schema schema29 = org.apache.avro.Schema.createRecord((java.util.List<org.apache.avro.Schema.Field>) fieldList25);
        org.apache.avro.Schema schema30 = org.apache.avro.Schema.createRecord((java.util.List<org.apache.avro.Schema.Field>) fieldList25);
        org.apache.avro.Schema schema31 = org.apache.avro.Schema.createRecord((java.util.List<org.apache.avro.Schema.Field>) fieldList25);
        org.apache.avro.Schema schema32 = org.apache.avro.Schema.createRecord((java.util.List<org.apache.avro.Schema.Field>) fieldList25);
        // The following exception was thrown during execution in test generation
        try {
            schema13.setFields((java.util.List<org.apache.avro.Schema.Field>) fieldList25);
            org.junit.Assert.fail("Expected exception of type org.apache.avro.AvroRuntimeException; message: Not a record: []");
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
        org.junit.Assert.assertNotNull(fieldArray24);
        org.junit.Assert.assertArrayEquals(fieldArray24, new org.apache.avro.Schema.Field[] {});
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(schema27);
        org.junit.Assert.assertNotNull(schema28);
        org.junit.Assert.assertNotNull(schema29);
        org.junit.Assert.assertNotNull(schema30);
        org.junit.Assert.assertNotNull(schema31);
        org.junit.Assert.assertNotNull(schema32);
    }

    @Test
    public void test0631() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SchemaM3Random300Test1.test0631");
        org.apache.avro.Schema.Names names1 = new org.apache.avro.Schema.Names("{\r\n  \"type\" : \"array\",\r\n  \"items\" : {\r\n    \"type\" : \"map\",\r\n    \"values\" : [ ]\r\n  }\r\n}");
        names1.space("{\"type\":\"array\",\"items\":[]}");
        java.lang.Object obj4 = names1.clone();
        org.junit.Assert.assertNotNull(obj4);
        org.junit.Assert.assertEquals(obj4.toString(), "{}");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj4), "{}");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj4), "{}");
    }

    @Test
    public void test0632() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SchemaM3Random300Test1.test0632");
        org.apache.avro.Schema.LockableArrayList<java.lang.String> strList4 = new org.apache.avro.Schema.LockableArrayList<java.lang.String>((int) '#');
        org.apache.avro.Schema.LockableArrayList<java.lang.String> strList5 = new org.apache.avro.Schema.LockableArrayList<java.lang.String>((java.util.List<java.lang.String>) strList4);
        org.apache.avro.Schema.LockableArrayList<java.lang.String> strList6 = new org.apache.avro.Schema.LockableArrayList<java.lang.String>((java.util.List<java.lang.String>) strList4);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.avro.Schema schema7 = org.apache.avro.Schema.createEnum("{\r\n  \"type\" : \"map\",\r\n  \"values\" : [ ]\r\n}", "{null={\"type\":\"fixed\",\"name\":\"union\",\"namespace\":\"[]\",\"doc\":\"[ ]\",\"size\":0}}", "{\r\n  \"type\" : \"fixed\",\r\n  \"name\" : \"union\",\r\n  \"namespace\" : \"[]\",\r\n  \"doc\" : \"[ ]\",\r\n  \"size\" : 0\r\n}", (java.util.List<java.lang.String>) strList6);
            org.junit.Assert.fail("Expected exception of type org.apache.avro.SchemaParseException; message: Illegal initial character: {??  \"type\" : \"map\",??  \"values\" : [ ]??}");
        } catch (org.apache.avro.SchemaParseException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0633() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SchemaM3Random300Test1.test0633");
        org.apache.avro.Schema.Field[] fieldArray0 = new org.apache.avro.Schema.Field[] {};
        java.util.ArrayList<org.apache.avro.Schema.Field> fieldList1 = new java.util.ArrayList<org.apache.avro.Schema.Field>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<org.apache.avro.Schema.Field>) fieldList1, fieldArray0);
        org.apache.avro.Schema schema3 = org.apache.avro.Schema.createRecord((java.util.List<org.apache.avro.Schema.Field>) fieldList1);
        org.apache.avro.Schema schema4 = org.apache.avro.Schema.createRecord((java.util.List<org.apache.avro.Schema.Field>) fieldList1);
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<org.apache.avro.Schema> schemaList5 = schema4.getTypes();
            org.junit.Assert.fail("Expected exception of type org.apache.avro.AvroRuntimeException; message: Not a union: {\"type\":\"record\",\"fields\":[]}");
        } catch (org.apache.avro.AvroRuntimeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(fieldArray0);
        org.junit.Assert.assertArrayEquals(fieldArray0, new org.apache.avro.Schema.Field[] {});
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(schema3);
        org.junit.Assert.assertNotNull(schema4);
    }

    @Test
    public void test0634() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SchemaM3Random300Test1.test0634");
        org.codehaus.jackson.JsonNode jsonNode1 = org.apache.avro.Schema.parseJson("{\"type\":\"record\",\"fields\":[],\"{\\r\\n  \\\"type\\\" : \\\"fixed\\\",\\r\\n  \\\"name\\\" : \\\"union\\\",\\r\\n  \\\"namespace\\\" : \\\"[]\\\",\\r\\n  \\\"doc\\\" : \\\"[ ]\\\",\\r\\n  \\\"size\\\" : 0\\r\\n}\":\"[ ]\"}");
        org.junit.Assert.assertNotNull(jsonNode1);
    }

    @Test
    public void test0635() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SchemaM3Random300Test1.test0635");
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
        java.lang.String str15 = schema14.toString();
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<org.apache.avro.Schema.Field> fieldList16 = schema14.getFields();
            org.junit.Assert.fail("Expected exception of type org.apache.avro.AvroRuntimeException; message: Not a record: {\"type\":\"map\",\"values\":{\"type\":\"array\",\"items\":{\"type\":\"map\",\"values\":[]}}}");
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
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "{\"type\":\"map\",\"values\":{\"type\":\"array\",\"items\":{\"type\":\"map\",\"values\":[]}}}" + "'", str15, "{\"type\":\"map\",\"values\":{\"type\":\"array\",\"items\":{\"type\":\"map\",\"values\":[]}}}");
    }

    @Test
    public void test0636() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SchemaM3Random300Test1.test0636");
        org.apache.avro.Schema.Parser parser0 = new org.apache.avro.Schema.Parser();
        java.util.Map<java.lang.String, org.apache.avro.Schema> strMap1 = parser0.getTypes();
        java.util.Map<java.lang.String, org.apache.avro.Schema> strMap2 = parser0.getTypes();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.avro.Schema schema4 = parser0.parse("");
            org.junit.Assert.fail("Expected exception of type org.apache.avro.SchemaParseException; message: java.io.EOFException: No content to map to Object due to end of input");
        } catch (org.apache.avro.SchemaParseException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strMap1);
        org.junit.Assert.assertNotNull(strMap2);
    }

    @Test
    public void test0637() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SchemaM3Random300Test1.test0637");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.avro.Schema schema4 = org.apache.avro.Schema.createFixed("[ ]", "", "{\"type\":\"array\",\"items\":\"int\"}", (int) '#');
            org.junit.Assert.fail("Expected exception of type org.apache.avro.SchemaParseException; message: Illegal initial character: [ ]");
        } catch (org.apache.avro.SchemaParseException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0638() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SchemaM3Random300Test1.test0638");
        org.apache.avro.Schema.LockableArrayList<java.util.AbstractCollection<java.lang.String>> strCollectionList1 = new org.apache.avro.Schema.LockableArrayList<java.util.AbstractCollection<java.lang.String>>(0);
    }

    @Test
    public void test0639() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SchemaM3Random300Test1.test0639");
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
    public void test0640() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SchemaM3Random300Test1.test0640");
        org.apache.avro.Schema.Field[] fieldArray0 = new org.apache.avro.Schema.Field[] {};
        java.util.ArrayList<org.apache.avro.Schema.Field> fieldList1 = new java.util.ArrayList<org.apache.avro.Schema.Field>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<org.apache.avro.Schema.Field>) fieldList1, fieldArray0);
        org.apache.avro.Schema schema3 = org.apache.avro.Schema.createRecord((java.util.List<org.apache.avro.Schema.Field>) fieldList1);
        // The following exception was thrown during execution in test generation
        try {
            schema3.addAlias("{\"type\":\"array\",\"items\":[]}");
            org.junit.Assert.fail("Expected exception of type org.apache.avro.SchemaParseException; message: Illegal initial character: {\"type\":\"array\",\"items\":[]}");
        } catch (org.apache.avro.SchemaParseException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(fieldArray0);
        org.junit.Assert.assertArrayEquals(fieldArray0, new org.apache.avro.Schema.Field[] {});
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(schema3);
    }

    @Test
    public void test0641() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SchemaM3Random300Test1.test0641");
        java.util.List<org.apache.avro.Schema.Field> fieldList0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.avro.Schema schema1 = org.apache.avro.Schema.createRecord(fieldList0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0642() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SchemaM3Random300Test1.test0642");
        org.apache.avro.Schema schema4 = org.apache.avro.Schema.createFixed("[].union", "union type:UNION pos:-1", "[]", (int) (short) 100);
        java.lang.String str5 = schema4.getNamespace();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.avro.Schema schema6 = schema4.getValueType();
            org.junit.Assert.fail("Expected exception of type org.apache.avro.AvroRuntimeException; message: Not a map: {\"type\":\"fixed\",\"name\":\"union\",\"namespace\":\"[]\",\"doc\":\"union type:UNION pos:-1\",\"size\":100}");
        } catch (org.apache.avro.AvroRuntimeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(schema4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "[]" + "'", str5, "[]");
    }

    @Test
    public void test0643() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SchemaM3Random300Test1.test0643");
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
        org.apache.avro.Schema.Type type21 = schema8.getType();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.avro.Schema schema22 = org.apache.avro.Schema.create(type21);
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
        org.junit.Assert.assertNotNull(schema20);
        org.junit.Assert.assertTrue("'" + type21 + "' != '" + org.apache.avro.Schema.Type.UNION + "'", type21.equals(org.apache.avro.Schema.Type.UNION));
    }

    @Test
    public void test0644() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SchemaM3Random300Test1.test0644");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.avro.Schema schema4 = org.apache.avro.Schema.createFixed("{\"type\":\"map\",\"values\":{\"type\":\"array\",\"items\":{\"type\":\"map\",\"values\":[]},\"\":\"{\\r\\n  \\\"type\\\" : \\\"record\\\",\\r\\n  \\\"fields\\\" : [ ]\\r\\n}\"}}", "{\"type\":\"record\",\"fields\":[],\"{\\r\\n  \\\"type\\\" : \\\"fixed\\\",\\r\\n  \\\"name\\\" : \\\"union\\\",\\r\\n  \\\"namespace\\\" : \\\"[]\\\",\\r\\n  \\\"doc\\\" : \\\"[ ]\\\",\\r\\n  \\\"size\\\" : 0\\r\\n}\":\"[ ]\"}", "{\"type\":\"array\",\"items\":[]}", (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type org.apache.avro.SchemaParseException; message: Illegal initial character: {\"type\":\"map\",\"values\":{\"type\":\"array\",\"items\":{\"type\":\"map\",\"values\":[]},\"\":\"{\\r\\n  \\\"type\\\" : \\\"record\\\",\\r\\n  \\\"fields\\\" : [ ]\\r\\n}\"}}");
        } catch (org.apache.avro.SchemaParseException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0645() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SchemaM3Random300Test1.test0645");
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
        org.apache.avro.Schema.Parser parser19 = parser9.setValidate(false);
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
        org.junit.Assert.assertNotNull(strMap11);
        org.junit.Assert.assertNotNull(strMap12);
        org.junit.Assert.assertNotNull(strMap14);
        org.junit.Assert.assertNotNull(parser15);
        org.junit.Assert.assertNotNull(strMap16);
        org.junit.Assert.assertNotNull(parser17);
        org.junit.Assert.assertNotNull(parser19);
    }

    @Test
    public void test0646() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SchemaM3Random300Test1.test0646");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.avro.Schema schema4 = org.apache.avro.Schema.createRecord("{\r\n  \"type\" : \"array\",\r\n  \"items\" : {\r\n    \"type\" : \"map\",\r\n    \"values\" : [ ]\r\n  }\r\n}", "{\"type\":\"record\",\"fields\":[]}", "{null={\"type\":\"fixed\",\"name\":\"union\",\"namespace\":\"[]\",\"doc\":\"[ ]\",\"size\":0}}", false);
            org.junit.Assert.fail("Expected exception of type org.apache.avro.SchemaParseException; message: Illegal initial character: {??  \"type\" : \"array\",??  \"items\" : {??    \"type\" : \"map\",??    \"values\" : [ ]??  }??}");
        } catch (org.apache.avro.SchemaParseException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0647() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SchemaM3Random300Test1.test0647");
        org.apache.avro.Schema.Field[] fieldArray0 = new org.apache.avro.Schema.Field[] {};
        java.util.ArrayList<org.apache.avro.Schema.Field> fieldList1 = new java.util.ArrayList<org.apache.avro.Schema.Field>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<org.apache.avro.Schema.Field>) fieldList1, fieldArray0);
        org.apache.avro.Schema schema3 = org.apache.avro.Schema.createRecord((java.util.List<org.apache.avro.Schema.Field>) fieldList1);
        org.apache.avro.Schema.Field field5 = schema3.getField("");
        org.apache.avro.Schema schema6 = org.apache.avro.Schema.createMap(schema3);
        java.lang.String str7 = schema3.getNamespace();
        org.apache.avro.Schema schema8 = org.apache.avro.Schema.createMap(schema3);
        org.apache.avro.Schema.Type type9 = schema8.getType();
        org.junit.Assert.assertNotNull(fieldArray0);
        org.junit.Assert.assertArrayEquals(fieldArray0, new org.apache.avro.Schema.Field[] {});
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(schema3);
        org.junit.Assert.assertNull(field5);
        org.junit.Assert.assertNotNull(schema6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNotNull(schema8);
        org.junit.Assert.assertTrue("'" + type9 + "' != '" + org.apache.avro.Schema.Type.MAP + "'", type9.equals(org.apache.avro.Schema.Type.MAP));
    }

    @Test
    public void test0648() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SchemaM3Random300Test1.test0648");
        org.apache.avro.Schema.Field[] fieldArray0 = new org.apache.avro.Schema.Field[] {};
        java.util.ArrayList<org.apache.avro.Schema.Field> fieldList1 = new java.util.ArrayList<org.apache.avro.Schema.Field>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<org.apache.avro.Schema.Field>) fieldList1, fieldArray0);
        org.apache.avro.Schema schema3 = org.apache.avro.Schema.createRecord((java.util.List<org.apache.avro.Schema.Field>) fieldList1);
        java.util.List<org.apache.avro.Schema.Field> fieldList4 = schema3.getFields();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.avro.Schema schema5 = schema3.getElementType();
            org.junit.Assert.fail("Expected exception of type org.apache.avro.AvroRuntimeException; message: Not an array: {\"type\":\"record\",\"fields\":[]}");
        } catch (org.apache.avro.AvroRuntimeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(fieldArray0);
        org.junit.Assert.assertArrayEquals(fieldArray0, new org.apache.avro.Schema.Field[] {});
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(schema3);
        org.junit.Assert.assertNotNull(fieldList4);
    }

    @Test
    public void test0649() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SchemaM3Random300Test1.test0649");
        org.codehaus.jackson.JsonNode jsonNode1 = org.apache.avro.Schema.parseJson("\"null\"");
        org.junit.Assert.assertNotNull(jsonNode1);
    }

    @Test
    public void test0650() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SchemaM3Random300Test1.test0650");
        org.apache.avro.Schema.LockableArrayList<java.lang.Iterable<java.lang.String>> strIterableList1 = new org.apache.avro.Schema.LockableArrayList<java.lang.Iterable<java.lang.String>>((int) (short) 100);
    }

    @Test
    public void test0651() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SchemaM3Random300Test1.test0651");
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
            java.util.Set<java.lang.String> strSet14 = schema8.getAliases();
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
    public void test0652() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SchemaM3Random300Test1.test0652");
        org.apache.avro.Schema.Parser parser0 = new org.apache.avro.Schema.Parser();
        org.apache.avro.Schema.Parser parser2 = parser0.setValidate(true);
        java.util.Map<java.lang.String, org.apache.avro.Schema> strMap3 = parser0.getTypes();
        org.apache.avro.Schema.Parser parser5 = parser0.setValidate(true);
        org.apache.avro.Schema.Parser parser7 = parser0.setValidate(true);
        java.util.Map<java.lang.String, org.apache.avro.Schema> strMap8 = parser0.getTypes();
        org.apache.avro.Schema.Parser parser10 = parser0.setValidate(false);
        org.apache.avro.Schema.Parser parser12 = parser10.setValidate(true);
        java.io.InputStream inputStream13 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.avro.Schema schema14 = parser10.parse(inputStream13);
            org.junit.Assert.fail("Expected exception of type java.io.EOFException; message: No content to map to Object due to end of input");
        } catch (java.io.EOFException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(parser2);
        org.junit.Assert.assertNotNull(strMap3);
        org.junit.Assert.assertNotNull(parser5);
        org.junit.Assert.assertNotNull(parser7);
        org.junit.Assert.assertNotNull(strMap8);
        org.junit.Assert.assertNotNull(parser10);
        org.junit.Assert.assertNotNull(parser12);
    }

    @Test
    public void test0653() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SchemaM3Random300Test1.test0653");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.avro.Schema schema4 = org.apache.avro.Schema.createFixed("{\"type\":\"map\",\"values\":{\"type\":\"array\",\"items\":{\"type\":\"map\",\"values\":[]},\"\":\"{\\r\\n  \\\"type\\\" : \\\"record\\\",\\r\\n  \\\"fields\\\" : [ ]\\r\\n}\"}}", "union type:MAP pos:-1", "{\"type\":\"array\",\"items\":\"int\"}", (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type org.apache.avro.SchemaParseException; message: Illegal initial character: {\"type\":\"map\",\"values\":{\"type\":\"array\",\"items\":{\"type\":\"map\",\"values\":[]},\"\":\"{\\r\\n  \\\"type\\\" : \\\"record\\\",\\r\\n  \\\"fields\\\" : [ ]\\r\\n}\"}}");
        } catch (org.apache.avro.SchemaParseException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0654() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SchemaM3Random300Test1.test0654");
        org.apache.avro.Schema.Names names1 = new org.apache.avro.Schema.Names("");
        org.apache.avro.Schema schema2 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = names1.contains(schema2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0655() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SchemaM3Random300Test1.test0655");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.avro.Schema schema1 = org.apache.avro.Schema.parse("map");
            org.junit.Assert.fail("Expected exception of type org.apache.avro.SchemaParseException; message: org.codehaus.jackson.JsonParseException: Unexpected character ('m' (code 109)): expected a valid value (number, String, array, object, 'true', 'false' or 'null')? at [Source: java.io.StringReader@5fb00eb7; line: 1, column: 2]");
        } catch (org.apache.avro.SchemaParseException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0656() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SchemaM3Random300Test1.test0656");
        org.apache.avro.Schema.LockableArrayList<org.codehaus.jackson.JsonFactory> jsonFactoryList0 = new org.apache.avro.Schema.LockableArrayList<org.codehaus.jackson.JsonFactory>();
    }

    @Test
    public void test0657() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SchemaM3Random300Test1.test0657");
        org.apache.avro.Schema.LockableArrayList<java.lang.String> strList4 = new org.apache.avro.Schema.LockableArrayList<java.lang.String>((int) (short) 0);
        org.apache.avro.Schema.LockableArrayList<java.lang.String> strList5 = new org.apache.avro.Schema.LockableArrayList<java.lang.String>((java.util.List<java.lang.String>) strList4);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.avro.Schema schema6 = org.apache.avro.Schema.createEnum("{}", "[].union", "{\"type\":\"record\",\"fields\":[]}", (java.util.List<java.lang.String>) strList4);
            org.junit.Assert.fail("Expected exception of type org.apache.avro.SchemaParseException; message: Illegal initial character: {}");
        } catch (org.apache.avro.SchemaParseException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0658() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SchemaM3Random300Test1.test0658");
        org.apache.avro.Schema.Parser parser0 = new org.apache.avro.Schema.Parser();
        java.util.Map<java.lang.String, org.apache.avro.Schema> strMap1 = parser0.getTypes();
        java.util.Map<java.lang.String, org.apache.avro.Schema> strMap2 = parser0.getTypes();
        org.apache.avro.Schema.Parser parser3 = new org.apache.avro.Schema.Parser();
        java.util.Map<java.lang.String, org.apache.avro.Schema> strMap4 = parser3.getTypes();
        org.apache.avro.Schema.Parser parser5 = parser0.addTypes(strMap4);
        org.apache.avro.Schema schema7 = parser0.parse("{\r\n  \"type\" : \"map\",\r\n  \"values\" : [ ]\r\n}");
        org.apache.avro.Schema.Parser parser9 = parser0.setValidate(true);
        org.apache.avro.Schema schema11 = parser9.parse("{\r\n  \"type\" : \"map\",\r\n  \"values\" : {\r\n    \"type\" : \"map\",\r\n    \"values\" : [ ]\r\n  }\r\n}");
        // The following exception was thrown during execution in test generation
        try {
            int int13 = schema11.getEnumOrdinal("{}");
            org.junit.Assert.fail("Expected exception of type org.apache.avro.AvroRuntimeException; message: Not an enum: {\"type\":\"map\",\"values\":{\"type\":\"map\",\"values\":[]}}");
        } catch (org.apache.avro.AvroRuntimeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strMap1);
        org.junit.Assert.assertNotNull(strMap2);
        org.junit.Assert.assertNotNull(strMap4);
        org.junit.Assert.assertNotNull(parser5);
        org.junit.Assert.assertNotNull(schema7);
        org.junit.Assert.assertNotNull(parser9);
        org.junit.Assert.assertNotNull(schema11);
    }

    @Test
    public void test0659() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SchemaM3Random300Test1.test0659");
        org.apache.avro.Schema.Parser parser0 = new org.apache.avro.Schema.Parser();
        org.apache.avro.Schema.Parser parser2 = parser0.setValidate(true);
        java.util.Map<java.lang.String, org.apache.avro.Schema> strMap3 = parser0.getTypes();
        java.util.Map<java.lang.String, org.apache.avro.Schema> strMap4 = parser0.getTypes();
        org.apache.avro.Schema schema6 = parser0.parse("{\"type\":\"map\",\"values\":[]}");
        boolean boolean7 = parser0.getValidate();
        org.apache.avro.Schema.Parser parser9 = parser0.setValidate(false);
        org.junit.Assert.assertNotNull(parser2);
        org.junit.Assert.assertNotNull(strMap3);
        org.junit.Assert.assertNotNull(strMap4);
        org.junit.Assert.assertNotNull(schema6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(parser9);
    }

    @Test
    public void test0660() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SchemaM3Random300Test1.test0660");
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
        // The following exception was thrown during execution in test generation
        try {
            java.util.Set<java.lang.String> strSet24 = schema20.getAliases();
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
        org.junit.Assert.assertNull(str22);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "map" + "'", str23, "map");
    }

    @Test
    public void test0661() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SchemaM3Random300Test1.test0661");
        org.apache.avro.Schema schema4 = org.apache.avro.Schema.createFixed("[].union", "union type:UNION pos:-1", "[]", (int) (short) 100);
        java.lang.String str6 = schema4.getProp("{\"type\":\"map\",\"values\":{\"type\":\"array\",\"items\":{\"type\":\"map\",\"values\":[]},\"\":\"{\\r\\n  \\\"type\\\" : \\\"record\\\",\\r\\n  \\\"fields\\\" : [ ]\\r\\n}\"}}");
        java.lang.String str7 = schema4.getNamespace();
        org.junit.Assert.assertNotNull(schema4);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "[]" + "'", str7, "[]");
    }

    @Test
    public void test0662() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SchemaM3Random300Test1.test0662");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.avro.Schema schema4 = org.apache.avro.Schema.createFixed("", "{\r\n  \"type\" : \"map\",\r\n  \"values\" : {\r\n    \"type\" : \"enum\",\r\n    \"name\" : \"union\",\r\n    \"namespace\" : \"[]\",\r\n    \"doc\" : \"{}\",\r\n    \"symbols\" : [ ]\r\n  }\r\n}", "double", (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type org.apache.avro.SchemaParseException; message: Empty name");
        } catch (org.apache.avro.SchemaParseException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0663() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SchemaM3Random300Test1.test0663");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.avro.Schema schema4 = org.apache.avro.Schema.createRecord("{null={\"type\":\"fixed\",\"name\":\"union\",\"namespace\":\"[]\",\"doc\":\"[ ]\",\"size\":0}}", "float", "", true);
            org.junit.Assert.fail("Expected exception of type org.apache.avro.SchemaParseException; message: Illegal initial character: {null={\"type\":\"fixed\",\"name\":\"union\",\"namespace\":\"[]\",\"doc\":\"[ ]\",\"size\":0}}");
        } catch (org.apache.avro.SchemaParseException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0664() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SchemaM3Random300Test1.test0664");
        org.apache.avro.Schema.Type type0 = org.apache.avro.Schema.Type.MAP;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.avro.Schema schema1 = org.apache.avro.Schema.create(type0);
            org.junit.Assert.fail("Expected exception of type org.apache.avro.AvroRuntimeException; message: Can't create a: MAP");
        } catch (org.apache.avro.AvroRuntimeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + type0 + "' != '" + org.apache.avro.Schema.Type.MAP + "'", type0.equals(org.apache.avro.Schema.Type.MAP));
    }

    @Test
    public void test0665() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SchemaM3Random300Test1.test0665");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.avro.Schema schema4 = org.apache.avro.Schema.createFixed("{\"type\":\"map\",\"values\":{\"type\":\"array\",\"items\":{\"type\":\"map\",\"values\":[]}}}", "map", "[ ]", (int) ' ');
            org.junit.Assert.fail("Expected exception of type org.apache.avro.SchemaParseException; message: Illegal initial character: {\"type\":\"map\",\"values\":{\"type\":\"array\",\"items\":{\"type\":\"map\",\"values\":[]}}}");
        } catch (org.apache.avro.SchemaParseException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0666() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SchemaM3Random300Test1.test0666");
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
            boolean boolean24 = schema8.hasEnumSymbol("{\"type\":\"map\",\"values\":{\"type\":\"array\",\"items\":{\"type\":\"map\",\"values\":[]},\"\":\"{\\r\\n  \\\"type\\\" : \\\"record\\\",\\r\\n  \\\"fields\\\" : [ ]\\r\\n}\"}}");
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
    public void test0667() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SchemaM3Random300Test1.test0667");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.avro.Schema schema4 = org.apache.avro.Schema.createFixed("{null={\"type\":\"fixed\",\"name\":\"union\",\"namespace\":\"[]\",\"doc\":\"[ ]\",\"size\":0}}", "{\"type\":\"record\",\"fields\":[],\"{\\r\\n  \\\"type\\\" : \\\"fixed\\\",\\r\\n  \\\"name\\\" : \\\"union\\\",\\r\\n  \\\"namespace\\\" : \\\"[]\\\",\\r\\n  \\\"doc\\\" : \\\"[ ]\\\",\\r\\n  \\\"size\\\" : 0\\r\\n}\":\"[ ]\"}", "[].union", (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type org.apache.avro.SchemaParseException; message: Illegal initial character: {null={\"type\":\"fixed\",\"name\":\"union\",\"namespace\":\"[]\",\"doc\":\"[ ]\",\"size\":0}}");
        } catch (org.apache.avro.SchemaParseException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0668() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SchemaM3Random300Test1.test0668");
        org.apache.avro.Schema schema4 = org.apache.avro.Schema.createFixed("union", "[ ]", "[]", 0);
        org.apache.avro.Schema.Type type5 = org.apache.avro.Schema.Type.INT;
        org.apache.avro.Schema schema6 = org.apache.avro.Schema.create(type5);
        org.apache.avro.Schema schema7 = org.apache.avro.Schema.createArray(schema6);
        org.apache.avro.Schema schema8 = org.apache.avro.Schema.applyAliases(schema4, schema7);
        org.apache.avro.Schema.Type type9 = schema8.getType();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.avro.Schema schema10 = schema8.getValueType();
            org.junit.Assert.fail("Expected exception of type org.apache.avro.AvroRuntimeException; message: Not a map: {\"type\":\"fixed\",\"name\":\"union\",\"namespace\":\"[]\",\"doc\":\"[ ]\",\"size\":0}");
        } catch (org.apache.avro.AvroRuntimeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(schema4);
        org.junit.Assert.assertTrue("'" + type5 + "' != '" + org.apache.avro.Schema.Type.INT + "'", type5.equals(org.apache.avro.Schema.Type.INT));
        org.junit.Assert.assertNotNull(schema6);
        org.junit.Assert.assertNotNull(schema7);
        org.junit.Assert.assertNotNull(schema8);
        org.junit.Assert.assertTrue("'" + type9 + "' != '" + org.apache.avro.Schema.Type.FIXED + "'", type9.equals(org.apache.avro.Schema.Type.FIXED));
    }

    @Test
    public void test0669() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SchemaM3Random300Test1.test0669");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.avro.Schema schema4 = org.apache.avro.Schema.createRecord("union type:MAP pos:-1", "float", "{\r\n  \"type\" : \"record\",\r\n  \"fields\" : [ ]\r\n}", false);
            org.junit.Assert.fail("Expected exception of type org.apache.avro.SchemaParseException; message: Illegal character in: union type:MAP pos:-1");
        } catch (org.apache.avro.SchemaParseException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0670() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SchemaM3Random300Test1.test0670");
        org.apache.avro.Schema.LockableArrayList<java.lang.String> strList4 = new org.apache.avro.Schema.LockableArrayList<java.lang.String>((int) '#');
        org.apache.avro.Schema.LockableArrayList<java.lang.String> strList5 = new org.apache.avro.Schema.LockableArrayList<java.lang.String>((java.util.List<java.lang.String>) strList4);
        org.apache.avro.Schema.LockableArrayList<java.lang.String> strList6 = new org.apache.avro.Schema.LockableArrayList<java.lang.String>((java.util.List<java.lang.String>) strList5);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.avro.Schema schema7 = org.apache.avro.Schema.createEnum("union type:UNION pos:-1", "{\"type\":\"map\",\"values\":[]}", "", (java.util.List<java.lang.String>) strList5);
            org.junit.Assert.fail("Expected exception of type org.apache.avro.SchemaParseException; message: Illegal character in: union type:UNION pos:-1");
        } catch (org.apache.avro.SchemaParseException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0671() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SchemaM3Random300Test1.test0671");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.avro.Schema schema4 = org.apache.avro.Schema.createRecord("", "union type:MAP pos:-1", "[ ]", false);
            org.junit.Assert.fail("Expected exception of type org.apache.avro.SchemaParseException; message: Empty name");
        } catch (org.apache.avro.SchemaParseException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0672() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SchemaM3Random300Test1.test0672");
        org.apache.avro.Schema.Parser parser0 = new org.apache.avro.Schema.Parser();
        org.apache.avro.Schema.Parser parser2 = parser0.setValidate(true);
        java.util.Map<java.lang.String, org.apache.avro.Schema> strMap3 = parser0.getTypes();
        org.apache.avro.Schema.Parser parser5 = parser0.setValidate(true);
        org.apache.avro.Schema.Parser parser7 = parser0.setValidate(true);
        java.util.Map<java.lang.String, org.apache.avro.Schema> strMap8 = parser0.getTypes();
        org.apache.avro.Schema.Parser parser10 = parser0.setValidate(false);
        org.apache.avro.Schema.Parser parser12 = parser10.setValidate(true);
        boolean boolean13 = parser12.getValidate();
        org.junit.Assert.assertNotNull(parser2);
        org.junit.Assert.assertNotNull(strMap3);
        org.junit.Assert.assertNotNull(parser5);
        org.junit.Assert.assertNotNull(parser7);
        org.junit.Assert.assertNotNull(strMap8);
        org.junit.Assert.assertNotNull(parser10);
        org.junit.Assert.assertNotNull(parser12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
    }

    @Test
    public void test0673() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SchemaM3Random300Test1.test0673");
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
            java.util.List<org.apache.avro.Schema.Field> fieldList25 = schema24.getFields();
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
    public void test0674() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SchemaM3Random300Test1.test0674");
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
        java.lang.String str23 = schema21.getDoc();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.avro.Schema schema24 = schema21.getElementType();
            org.junit.Assert.fail("Expected exception of type org.apache.avro.AvroRuntimeException; message: Not an array: []");
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
        org.junit.Assert.assertNull(str23);
    }

    @Test
    public void test0675() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SchemaM3Random300Test1.test0675");
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
        org.apache.avro.Schema schema17 = org.apache.avro.Schema.createArray(schema12);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.avro.Schema schema18 = schema12.getElementType();
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
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNotNull(schema12);
        org.junit.Assert.assertNotNull(schema15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(schema17);
    }

    @Test
    public void test0676() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SchemaM3Random300Test1.test0676");
        // The following exception was thrown during execution in test generation
        try {
            org.codehaus.jackson.JsonNode jsonNode1 = org.apache.avro.Schema.parseJson("{null={\"type\":\"fixed\",\"name\":\"union\",\"namespace\":\"[]\",\"doc\":\"[ ]\",\"size\":0}}");
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: org.codehaus.jackson.JsonParseException: Unexpected character ('n' (code 110)): was expecting double-quote to start field name? at [Source: java.io.StringReader@7b1090e3; line: 1, column: 3]");
        } catch (java.lang.RuntimeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0677() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SchemaM3Random300Test1.test0677");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.avro.Schema schema4 = org.apache.avro.Schema.createFixed("{\"type\":\"record\",\"fields\":[]}", "{\r\n  \"type\" : \"array\",\r\n  \"items\" : {\r\n    \"type\" : \"map\",\r\n    \"values\" : [ ]\r\n  }\r\n}", "", 0);
            org.junit.Assert.fail("Expected exception of type org.apache.avro.SchemaParseException; message: Illegal initial character: {\"type\":\"record\",\"fields\":[]}");
        } catch (org.apache.avro.SchemaParseException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0678() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SchemaM3Random300Test1.test0678");
        org.apache.avro.Schema.Parser parser0 = new org.apache.avro.Schema.Parser();
        org.apache.avro.Schema.Parser parser2 = parser0.setValidate(true);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.avro.Schema schema4 = parser2.parse("hi!");
            org.junit.Assert.fail("Expected exception of type org.apache.avro.SchemaParseException; message: org.codehaus.jackson.JsonParseException: Unexpected character ('h' (code 104)): expected a valid value (number, String, array, object, 'true', 'false' or 'null')? at [Source: java.io.StringReader@595f1d01; line: 1, column: 2]");
        } catch (org.apache.avro.SchemaParseException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(parser2);
    }

    @Test
    public void test0679() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SchemaM3Random300Test1.test0679");
        org.apache.avro.Schema.LockableArrayList<java.lang.String> strList4 = new org.apache.avro.Schema.LockableArrayList<java.lang.String>((int) (byte) 10);
        org.apache.avro.Schema schema5 = org.apache.avro.Schema.createEnum("[].union", "union type:UNION pos:-1", "union type:UNION pos:-1", (java.util.List<java.lang.String>) strList4);
        java.lang.String str6 = schema5.getName();
        java.lang.String str7 = schema5.getNamespace();
        org.junit.Assert.assertNotNull(schema5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "union" + "'", str6, "union");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "[]" + "'", str7, "[]");
    }

    @Test
    public void test0680() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SchemaM3Random300Test1.test0680");
        org.apache.avro.Schema.Names names1 = new org.apache.avro.Schema.Names("map");
    }

    @Test
    public void test0681() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SchemaM3Random300Test1.test0681");
        org.apache.avro.Schema.Field[] fieldArray0 = new org.apache.avro.Schema.Field[] {};
        java.util.ArrayList<org.apache.avro.Schema.Field> fieldList1 = new java.util.ArrayList<org.apache.avro.Schema.Field>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<org.apache.avro.Schema.Field>) fieldList1, fieldArray0);
        org.apache.avro.Schema schema3 = org.apache.avro.Schema.createRecord((java.util.List<org.apache.avro.Schema.Field>) fieldList1);
        java.util.List<org.apache.avro.Schema.Field> fieldList4 = schema3.getFields();
        org.apache.avro.Schema schema5 = org.apache.avro.Schema.createRecord(fieldList4);
        org.apache.avro.Schema.LockableArrayList<org.apache.avro.Schema.Field> fieldList7 = new org.apache.avro.Schema.LockableArrayList<org.apache.avro.Schema.Field>((int) (byte) 100);
        org.apache.avro.Schema schema8 = org.apache.avro.Schema.createRecord((java.util.List<org.apache.avro.Schema.Field>) fieldList7);
        // The following exception was thrown during execution in test generation
        try {
            schema5.setFields((java.util.List<org.apache.avro.Schema.Field>) fieldList7);
            org.junit.Assert.fail("Expected exception of type org.apache.avro.AvroRuntimeException; message: Fields are already set");
        } catch (org.apache.avro.AvroRuntimeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(fieldArray0);
        org.junit.Assert.assertArrayEquals(fieldArray0, new org.apache.avro.Schema.Field[] {});
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(schema3);
        org.junit.Assert.assertNotNull(fieldList4);
        org.junit.Assert.assertNotNull(schema5);
        org.junit.Assert.assertNotNull(schema8);
    }

    @Test
    public void test0682() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SchemaM3Random300Test1.test0682");
        org.apache.avro.Schema.Parser parser0 = new org.apache.avro.Schema.Parser();
        java.util.Map<java.lang.String, org.apache.avro.Schema> strMap1 = parser0.getTypes();
        java.util.Map<java.lang.String, org.apache.avro.Schema> strMap2 = parser0.getTypes();
        org.apache.avro.Schema.Parser parser3 = new org.apache.avro.Schema.Parser();
        java.util.Map<java.lang.String, org.apache.avro.Schema> strMap4 = parser3.getTypes();
        org.apache.avro.Schema.Parser parser5 = parser0.addTypes(strMap4);
        org.apache.avro.Schema.Parser parser7 = parser0.setValidate(true);
        org.apache.avro.Schema.Parser parser9 = parser0.setValidate(false);
        java.util.Map<java.lang.String, org.apache.avro.Schema> strMap10 = parser0.getTypes();
        java.util.Map<java.lang.String, org.apache.avro.Schema> strMap11 = parser0.getTypes();
        org.junit.Assert.assertNotNull(strMap1);
        org.junit.Assert.assertNotNull(strMap2);
        org.junit.Assert.assertNotNull(strMap4);
        org.junit.Assert.assertNotNull(parser5);
        org.junit.Assert.assertNotNull(parser7);
        org.junit.Assert.assertNotNull(parser9);
        org.junit.Assert.assertNotNull(strMap10);
        org.junit.Assert.assertNotNull(strMap11);
    }

    @Test
    public void test0683() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SchemaM3Random300Test1.test0683");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.avro.Schema.LockableArrayList<org.codehaus.jackson.Versioned> versionedList1 = new org.apache.avro.Schema.LockableArrayList<org.codehaus.jackson.Versioned>((int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal Capacity: -1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0684() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SchemaM3Random300Test1.test0684");
        org.apache.avro.Schema schema4 = org.apache.avro.Schema.createRecord("int", "{\r\n  \"type\" : \"fixed\",\r\n  \"name\" : \"union\",\r\n  \"namespace\" : \"[]\",\r\n  \"doc\" : \"[ ]\",\r\n  \"size\" : 0\r\n}", "{\"type\":\"map\",\"values\":{\"type\":\"array\",\"items\":{\"type\":\"map\",\"values\":[]},\"\":\"{\\r\\n  \\\"type\\\" : \\\"record\\\",\\r\\n  \\\"fields\\\" : [ ]\\r\\n}\"}}", true);
        org.junit.Assert.assertNotNull(schema4);
    }

    @Test
    public void test0685() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SchemaM3Random300Test1.test0685");
        org.apache.avro.Schema.LockableArrayList<java.lang.String> strList4 = new org.apache.avro.Schema.LockableArrayList<java.lang.String>((int) '#');
        org.apache.avro.Schema.LockableArrayList<java.lang.String> strList5 = new org.apache.avro.Schema.LockableArrayList<java.lang.String>((java.util.List<java.lang.String>) strList4);
        org.apache.avro.Schema.LockableArrayList<java.lang.String> strList6 = new org.apache.avro.Schema.LockableArrayList<java.lang.String>((java.util.List<java.lang.String>) strList4);
        org.apache.avro.Schema.LockableArrayList<java.lang.String> strList7 = new org.apache.avro.Schema.LockableArrayList<java.lang.String>((java.util.List<java.lang.String>) strList6);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.avro.Schema schema8 = org.apache.avro.Schema.createEnum("{\"type\":\"map\",\"values\":{\"type\":\"array\",\"items\":{\"type\":\"map\",\"values\":[]}}}", "{\"type\":\"fixed\",\"name\":\"union\",\"namespace\":\"[]\",\"doc\":\"union type:UNION pos:-1\",\"size\":100}", "{\r\n  \"type\" : \"map\",\r\n  \"values\" : {\r\n    \"type\" : \"map\",\r\n    \"values\" : [ ]\r\n  }\r\n}", (java.util.List<java.lang.String>) strList7);
            org.junit.Assert.fail("Expected exception of type org.apache.avro.SchemaParseException; message: Illegal initial character: {\"type\":\"map\",\"values\":{\"type\":\"array\",\"items\":{\"type\":\"map\",\"values\":[]}}}");
        } catch (org.apache.avro.SchemaParseException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0686() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SchemaM3Random300Test1.test0686");
        org.apache.avro.Schema.Parser parser0 = new org.apache.avro.Schema.Parser();
        org.apache.avro.Schema.Parser parser2 = parser0.setValidate(true);
        java.util.Map<java.lang.String, org.apache.avro.Schema> strMap3 = parser0.getTypes();
        java.util.Map<java.lang.String, org.apache.avro.Schema> strMap4 = parser0.getTypes();
        boolean boolean5 = parser0.getValidate();
        org.junit.Assert.assertNotNull(parser2);
        org.junit.Assert.assertNotNull(strMap3);
        org.junit.Assert.assertNotNull(strMap4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
    }

    @Test
    public void test0687() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SchemaM3Random300Test1.test0687");
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
            schema7.addAlias("map");
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
    public void test0688() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SchemaM3Random300Test1.test0688");
        org.apache.avro.Schema.Parser parser0 = new org.apache.avro.Schema.Parser();
        org.apache.avro.Schema.Parser parser2 = parser0.setValidate(true);
        java.util.Map<java.lang.String, org.apache.avro.Schema> strMap3 = parser0.getTypes();
        java.util.Map<java.lang.String, org.apache.avro.Schema> strMap4 = parser0.getTypes();
        org.apache.avro.Schema schema6 = parser0.parse("{\"type\":\"map\",\"values\":[]}");
        boolean boolean7 = parser0.getValidate();
        boolean boolean8 = parser0.getValidate();
        org.junit.Assert.assertNotNull(parser2);
        org.junit.Assert.assertNotNull(strMap3);
        org.junit.Assert.assertNotNull(strMap4);
        org.junit.Assert.assertNotNull(schema6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test0689() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SchemaM3Random300Test1.test0689");
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
            org.apache.avro.Schema schema12 = parser0.parse(file11);
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
    public void test0690() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SchemaM3Random300Test1.test0690");
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
            java.util.List<java.lang.String> strList18 = schema15.getEnumSymbols();
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
    public void test0691() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SchemaM3Random300Test1.test0691");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.avro.Schema schema4 = org.apache.avro.Schema.createFixed("{\r\n  \"type\" : \"map\",\r\n  \"values\" : [ ]\r\n}", "{\"type\":\"map\",\"values\":{\"type\":\"array\",\"items\":{\"type\":\"map\",\"values\":[]}}}", "{\"type\":\"map\",\"values\":{\"type\":\"array\",\"items\":{\"type\":\"map\",\"values\":[]},\"\":\"{\\r\\n  \\\"type\\\" : \\\"record\\\",\\r\\n  \\\"fields\\\" : [ ]\\r\\n}\"}}", (int) '4');
            org.junit.Assert.fail("Expected exception of type org.apache.avro.SchemaParseException; message: Illegal initial character: {??  \"type\" : \"map\",??  \"values\" : [ ]??}");
        } catch (org.apache.avro.SchemaParseException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0692() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SchemaM3Random300Test1.test0692");
        org.apache.avro.Schema.LockableArrayList<org.apache.avro.Schema.Type> typeList1 = new org.apache.avro.Schema.LockableArrayList<org.apache.avro.Schema.Type>((int) (byte) 0);
    }

    @Test
    public void test0693() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SchemaM3Random300Test1.test0693");
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
        org.apache.avro.Schema schema17 = org.apache.avro.Schema.createArray(schema12);
        // The following exception was thrown during execution in test generation
        try {
            java.util.Set<java.lang.String> strSet18 = schema12.getAliases();
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
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNotNull(schema12);
        org.junit.Assert.assertNotNull(schema15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(schema17);
    }

    @Test
    public void test0694() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SchemaM3Random300Test1.test0694");
        org.apache.avro.Schema.Field[] fieldArray0 = new org.apache.avro.Schema.Field[] {};
        java.util.ArrayList<org.apache.avro.Schema.Field> fieldList1 = new java.util.ArrayList<org.apache.avro.Schema.Field>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<org.apache.avro.Schema.Field>) fieldList1, fieldArray0);
        org.apache.avro.Schema schema3 = org.apache.avro.Schema.createRecord((java.util.List<org.apache.avro.Schema.Field>) fieldList1);
        org.apache.avro.Schema.Field field5 = schema3.getField("");
        org.apache.avro.Schema schema6 = org.apache.avro.Schema.createMap(schema3);
        java.lang.String str7 = schema3.getNamespace();
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<org.apache.avro.Schema> schemaList8 = schema3.getTypes();
            org.junit.Assert.fail("Expected exception of type org.apache.avro.AvroRuntimeException; message: Not a union: {\"type\":\"record\",\"fields\":[]}");
        } catch (org.apache.avro.AvroRuntimeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(fieldArray0);
        org.junit.Assert.assertArrayEquals(fieldArray0, new org.apache.avro.Schema.Field[] {});
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(schema3);
        org.junit.Assert.assertNull(field5);
        org.junit.Assert.assertNotNull(schema6);
        org.junit.Assert.assertNull(str7);
    }

    @Test
    public void test0695() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SchemaM3Random300Test1.test0695");
        org.apache.avro.Schema schema1 = null;
        org.codehaus.jackson.JsonNode jsonNode4 = org.apache.avro.Schema.parseJson("{\"type\":\"array\",\"items\":\"int\"}");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.avro.Schema.Field field5 = new org.apache.avro.Schema.Field("{\"type\":\"map\",\"values\":{\"type\":\"array\",\"items\":{\"type\":\"map\",\"values\":[]},\"\":\"{\\r\\n  \\\"type\\\" : \\\"record\\\",\\r\\n  \\\"fields\\\" : [ ]\\r\\n}\"}}", schema1, "{\"type\":\"array\",\"items\":{\"type\":\"map\",\"values\":[]}}", jsonNode4);
            org.junit.Assert.fail("Expected exception of type org.apache.avro.SchemaParseException; message: Illegal initial character: {\"type\":\"map\",\"values\":{\"type\":\"array\",\"items\":{\"type\":\"map\",\"values\":[]},\"\":\"{\\r\\n  \\\"type\\\" : \\\"record\\\",\\r\\n  \\\"fields\\\" : [ ]\\r\\n}\"}}");
        } catch (org.apache.avro.SchemaParseException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(jsonNode4);
    }

    @Test
    public void test0696() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SchemaM3Random300Test1.test0696");
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
            org.apache.avro.Schema schema13 = schema8.getElementType();
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
        org.junit.Assert.assertNotNull(schema12);
    }

    @Test
    public void test0697() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SchemaM3Random300Test1.test0697");
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
        java.lang.String str22 = schema21.getDoc();
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
        org.junit.Assert.assertNull(str22);
    }

    @Test
    public void test0698() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SchemaM3Random300Test1.test0698");
        java.util.List<java.lang.String> strList3 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.avro.Schema schema4 = org.apache.avro.Schema.createEnum("double", "map", "float", strList3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0699() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SchemaM3Random300Test1.test0699");
        org.apache.avro.Schema schema1 = org.apache.avro.Schema.parse("{\r\n  \"type\" : \"array\",\r\n  \"items\" : {\r\n    \"type\" : \"map\",\r\n    \"values\" : [ ]\r\n  }\r\n}");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = schema1.getNamespace();
            org.junit.Assert.fail("Expected exception of type org.apache.avro.AvroRuntimeException; message: Not a named type: {\"type\":\"array\",\"items\":{\"type\":\"map\",\"values\":[]}}");
        } catch (org.apache.avro.AvroRuntimeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(schema1);
    }

    @Test
    public void test0700() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SchemaM3Random300Test1.test0700");
        org.apache.avro.Schema.Names names1 = new org.apache.avro.Schema.Names("array");
    }

    @Test
    public void test0701() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SchemaM3Random300Test1.test0701");
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
        org.apache.avro.Schema schema12 = org.apache.avro.Schema.createArray(schema11);
        org.apache.avro.Schema schema13 = schema12.getElementType();
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
        org.junit.Assert.assertNotNull(schema13);
    }

    @Test
    public void test0702() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SchemaM3Random300Test1.test0702");
        org.apache.avro.Schema.LockableArrayList<java.util.RandomAccess> randomAccessList0 = new org.apache.avro.Schema.LockableArrayList<java.util.RandomAccess>();
    }

    @Test
    public void test0703() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SchemaM3Random300Test1.test0703");
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
        java.lang.String str14 = schema12.toString(false);
        org.junit.Assert.assertNotNull(strMap1);
        org.junit.Assert.assertNotNull(strMap2);
        org.junit.Assert.assertNotNull(strMap4);
        org.junit.Assert.assertNotNull(parser5);
        org.junit.Assert.assertNotNull(parser7);
        org.junit.Assert.assertNotNull(parser9);
        org.junit.Assert.assertNotNull(strMap10);
        org.junit.Assert.assertNotNull(schema12);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "{\"type\":\"array\",\"items\":[]}" + "'", str14, "{\"type\":\"array\",\"items\":[]}");
    }

    @Test
    public void test0704() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SchemaM3Random300Test1.test0704");
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
        java.io.InputStream inputStream26 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.avro.Schema schema27 = parser25.parse(inputStream26);
            org.junit.Assert.fail("Expected exception of type java.io.EOFException; message: No content to map to Object due to end of input");
        } catch (java.io.EOFException e) {
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
    }

    @Test
    public void test0705() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SchemaM3Random300Test1.test0705");
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
        org.apache.avro.Schema.Names names18 = null;
        org.codehaus.jackson.JsonGenerator jsonGenerator19 = null;
        // The following exception was thrown during execution in test generation
        try {
            schema7.toJson(names18, jsonGenerator19);
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
        org.junit.Assert.assertNotNull(schema10);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertNotNull(schemaList17);
    }

    @Test
    public void test0706() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SchemaM3Random300Test1.test0706");
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
        org.apache.avro.Schema.Type type29 = schema27.getType();
        org.apache.avro.Schema schema30 = org.apache.avro.Schema.createMap(schema27);
        org.apache.avro.Schema schema31 = org.apache.avro.Schema.createArray(schema30);
        org.apache.avro.Schema schema32 = org.apache.avro.Schema.applyAliases(schema19, schema31);
        // The following exception was thrown during execution in test generation
        try {
            int int34 = schema19.getEnumOrdinal("hi!");
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
        org.junit.Assert.assertTrue("'" + type29 + "' != '" + org.apache.avro.Schema.Type.UNION + "'", type29.equals(org.apache.avro.Schema.Type.UNION));
        org.junit.Assert.assertNotNull(schema30);
        org.junit.Assert.assertNotNull(schema31);
        org.junit.Assert.assertNotNull(schema32);
    }

    @Test
    public void test0707() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SchemaM3Random300Test1.test0707");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.avro.Schema.LockableArrayList<org.apache.avro.Schema.Parser> parserList1 = new org.apache.avro.Schema.LockableArrayList<org.apache.avro.Schema.Parser>((int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal Capacity: -1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0708() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SchemaM3Random300Test1.test0708");
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
            org.apache.avro.Schema schema13 = parser6.parse(file12);
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
    public void test0709() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SchemaM3Random300Test1.test0709");
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
            org.apache.avro.Schema schema18 = parser9.parse(inputStream17);
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
    public void test0710() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SchemaM3Random300Test1.test0710");
        org.apache.avro.Schema.LockableArrayList<java.lang.Cloneable> cloneableList1 = new org.apache.avro.Schema.LockableArrayList<java.lang.Cloneable>((int) '#');
    }

    @Test
    public void test0711() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SchemaM3Random300Test1.test0711");
        org.apache.avro.Schema.Names names0 = new org.apache.avro.Schema.Names();
        names0.space("[ ]");
        java.lang.Object obj3 = names0.clone();
        boolean boolean6 = names0.remove((java.lang.Object) 1, (java.lang.Object) true);
        names0.space("union type:MAP pos:-1");
        java.lang.Object obj9 = names0.clone();
        org.apache.avro.Schema.Type type10 = org.apache.avro.Schema.Type.DOUBLE;
        org.apache.avro.Schema schema11 = org.apache.avro.Schema.create(type10);
        org.apache.avro.Schema schema12 = org.apache.avro.Schema.createMap(schema11);
        schema11.addProp("float", "{\"type\":\"array\",\"items\":[]}");
        // The following exception was thrown during execution in test generation
        try {
            names0.add(schema11);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: org.apache.avro.Schema$DoubleSchema cannot be cast to org.apache.avro.Schema$NamedSchema");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(obj3);
        org.junit.Assert.assertEquals(obj3.toString(), "{}");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj3), "{}");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj3), "{}");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(obj9);
        org.junit.Assert.assertEquals(obj9.toString(), "{}");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj9), "{}");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj9), "{}");
        org.junit.Assert.assertTrue("'" + type10 + "' != '" + org.apache.avro.Schema.Type.DOUBLE + "'", type10.equals(org.apache.avro.Schema.Type.DOUBLE));
        org.junit.Assert.assertNotNull(schema11);
        org.junit.Assert.assertNotNull(schema12);
    }

    @Test
    public void test0712() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SchemaM3Random300Test1.test0712");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.avro.Schema schema4 = org.apache.avro.Schema.createRecord("{\"type\":\"fixed\",\"name\":\"union\",\"namespace\":\"[]\",\"doc\":\"[ ]\",\"size\":0,\"aliases\":[\"union\"]}", "map", "union type:MAP pos:-1", true);
            org.junit.Assert.fail("Expected exception of type org.apache.avro.SchemaParseException; message: Illegal initial character: {\"type\":\"fixed\",\"name\":\"union\",\"namespace\":\"[]\",\"doc\":\"[ ]\",\"size\":0,\"aliases\":[\"union\"]}");
        } catch (org.apache.avro.SchemaParseException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0713() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SchemaM3Random300Test1.test0713");
        org.apache.avro.Schema.LockableArrayList<java.lang.String> strList4 = new org.apache.avro.Schema.LockableArrayList<java.lang.String>(1);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.avro.Schema schema5 = org.apache.avro.Schema.createEnum("[]", "{\"type\":\"record\",\"fields\":[],\"{\\r\\n  \\\"type\\\" : \\\"fixed\\\",\\r\\n  \\\"name\\\" : \\\"union\\\",\\r\\n  \\\"namespace\\\" : \\\"[]\\\",\\r\\n  \\\"doc\\\" : \\\"[ ]\\\",\\r\\n  \\\"size\\\" : 0\\r\\n}\":\"[ ]\"}", "{\r\n  \"type\" : \"record\",\r\n  \"fields\" : [ ]\r\n}", (java.util.List<java.lang.String>) strList4);
            org.junit.Assert.fail("Expected exception of type org.apache.avro.SchemaParseException; message: Illegal initial character: []");
        } catch (org.apache.avro.SchemaParseException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0714() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SchemaM3Random300Test1.test0714");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.avro.Schema schema4 = org.apache.avro.Schema.createRecord("{\r\n  \"type\" : \"map\",\r\n  \"values\" : {\r\n    \"type\" : \"enum\",\r\n    \"name\" : \"union\",\r\n    \"namespace\" : \"[]\",\r\n    \"doc\" : \"{}\",\r\n    \"symbols\" : [ ]\r\n  }\r\n}", "{\"type\":\"array\",\"items\":\"int\"}", "{\r\n  \"type\" : \"fixed\",\r\n  \"name\" : \"union\",\r\n  \"namespace\" : \"[]\",\r\n  \"doc\" : \"[ ]\",\r\n  \"size\" : 0\r\n}", false);
            org.junit.Assert.fail("Expected exception of type org.apache.avro.SchemaParseException; message: Illegal initial character: {??  \"type\" : \"map\",??  \"values\" : {??    \"type\" : \"enum\",??    \"name\" : \"union\",??    \"namespace\" : \"[]\",??    \"doc\" : \"{}\",??    \"symbols\" : [ ]??  }??}");
        } catch (org.apache.avro.SchemaParseException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0715() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SchemaM3Random300Test1.test0715");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.avro.Schema schema4 = org.apache.avro.Schema.createFixed("union type:UNION pos:-1", "hi!", "union type:UNION pos:-1", (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type org.apache.avro.SchemaParseException; message: Illegal character in: union type:UNION pos:-1");
        } catch (org.apache.avro.SchemaParseException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0716() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SchemaM3Random300Test1.test0716");
        org.apache.avro.Schema schema4 = org.apache.avro.Schema.createFixed("union", "[ ]", "[]", 0);
        org.apache.avro.Schema.Type type5 = org.apache.avro.Schema.Type.INT;
        org.apache.avro.Schema schema6 = org.apache.avro.Schema.create(type5);
        org.apache.avro.Schema schema7 = org.apache.avro.Schema.createArray(schema6);
        org.apache.avro.Schema schema8 = org.apache.avro.Schema.applyAliases(schema4, schema7);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean9 = schema4.isError();
            org.junit.Assert.fail("Expected exception of type org.apache.avro.AvroRuntimeException; message: Not a record: {\"type\":\"fixed\",\"name\":\"union\",\"namespace\":\"[]\",\"doc\":\"[ ]\",\"size\":0}");
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
    public void test0717() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SchemaM3Random300Test1.test0717");
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
            org.apache.avro.Schema schema17 = parser15.parse(inputStream16);
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
    public void test0718() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SchemaM3Random300Test1.test0718");
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
        java.lang.String str12 = schema4.getName();
        org.apache.avro.Schema schema13 = org.apache.avro.Schema.createMap(schema4);
        // The following exception was thrown during execution in test generation
        try {
            int int14 = schema4.getFixedSize();
            org.junit.Assert.fail("Expected exception of type org.apache.avro.AvroRuntimeException; message: Not fixed: []");
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
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "union" + "'", str12, "union");
        org.junit.Assert.assertNotNull(schema13);
    }

    @Test
    public void test0719() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SchemaM3Random300Test1.test0719");
        org.apache.avro.Schema.LockableArrayList<org.apache.avro.Schema> schemaList1 = new org.apache.avro.Schema.LockableArrayList<org.apache.avro.Schema>(1);
        org.apache.avro.Schema schema2 = org.apache.avro.Schema.createUnion((java.util.List<org.apache.avro.Schema>) schemaList1);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.avro.Schema.Field field4 = schema2.getField("array");
            org.junit.Assert.fail("Expected exception of type org.apache.avro.AvroRuntimeException; message: Not a record: []");
        } catch (org.apache.avro.AvroRuntimeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(schema2);
    }

    @Test
    public void test0720() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SchemaM3Random300Test1.test0720");
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
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean17 = schema12.isError();
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
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNotNull(schema12);
        org.junit.Assert.assertNotNull(schema15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test0721() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SchemaM3Random300Test1.test0721");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.avro.Schema schema4 = org.apache.avro.Schema.createRecord("{null={\"type\":\"fixed\",\"name\":\"union\",\"namespace\":\"[]\",\"doc\":\"[ ]\",\"size\":0}}", "", "{\"type\":\"map\",\"values\":{\"type\":\"array\",\"items\":{\"type\":\"map\",\"values\":[]}}}", false);
            org.junit.Assert.fail("Expected exception of type org.apache.avro.SchemaParseException; message: Illegal initial character: {null={\"type\":\"fixed\",\"name\":\"union\",\"namespace\":\"[]\",\"doc\":\"[ ]\",\"size\":0}}");
        } catch (org.apache.avro.SchemaParseException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0722() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SchemaM3Random300Test1.test0722");
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
    public void test0723() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SchemaM3Random300Test1.test0723");
        org.apache.avro.Schema.Parser parser0 = new org.apache.avro.Schema.Parser();
        org.apache.avro.Schema.Parser parser2 = parser0.setValidate(true);
        java.util.Map<java.lang.String, org.apache.avro.Schema> strMap3 = parser0.getTypes();
        org.apache.avro.Schema.Parser parser5 = parser0.setValidate(true);
        org.apache.avro.Schema.Parser parser7 = parser0.setValidate(true);
        java.util.Map<java.lang.String, org.apache.avro.Schema> strMap8 = parser0.getTypes();
        org.apache.avro.Schema.Parser parser10 = parser0.setValidate(false);
        org.apache.avro.Schema.Parser parser12 = parser10.setValidate(true);
        java.util.Map<java.lang.String, org.apache.avro.Schema> strMap13 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.avro.Schema.Parser parser14 = parser12.addTypes(strMap13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(parser2);
        org.junit.Assert.assertNotNull(strMap3);
        org.junit.Assert.assertNotNull(parser5);
        org.junit.Assert.assertNotNull(parser7);
        org.junit.Assert.assertNotNull(strMap8);
        org.junit.Assert.assertNotNull(parser10);
        org.junit.Assert.assertNotNull(parser12);
    }

    @Test
    public void test0724() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SchemaM3Random300Test1.test0724");
        java.lang.String[] strArray4 = new java.lang.String[] { "" };
        java.util.ArrayList<java.lang.String> strList5 = new java.util.ArrayList<java.lang.String>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList5, strArray4);
        org.apache.avro.Schema.LockableArrayList<java.lang.String> strList7 = new org.apache.avro.Schema.LockableArrayList<java.lang.String>((java.util.List<java.lang.String>) strList5);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.avro.Schema schema8 = org.apache.avro.Schema.createEnum("{\"type\":\"array\",\"items\":\"int\"}", "{\"type\":\"fixed\",\"name\":\"union\",\"namespace\":\"[]\",\"doc\":\"union type:UNION pos:-1\",\"size\":100}", "\"double\"", (java.util.List<java.lang.String>) strList7);
            org.junit.Assert.fail("Expected exception of type org.apache.avro.SchemaParseException; message: Illegal initial character: {\"type\":\"array\",\"items\":\"int\"}");
        } catch (org.apache.avro.SchemaParseException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertArrayEquals(strArray4, new java.lang.String[] { "" });
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test0725() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SchemaM3Random300Test1.test0725");
        org.apache.avro.Schema.LockableArrayList<java.lang.String> strList7 = new org.apache.avro.Schema.LockableArrayList<java.lang.String>((int) (byte) 10);
        org.apache.avro.Schema schema8 = org.apache.avro.Schema.createEnum("[].union", "union type:UNION pos:-1", "union type:UNION pos:-1", (java.util.List<java.lang.String>) strList7);
        java.util.List<java.lang.String> strList9 = schema8.getEnumSymbols();
        org.apache.avro.Schema schema10 = org.apache.avro.Schema.createEnum("map", "\"null\"", "{}", strList9);
        schema10.addProp("{\"type\":\"record\",\"fields\":[],\"{\\r\\n  \\\"type\\\" : \\\"fixed\\\",\\r\\n  \\\"name\\\" : \\\"union\\\",\\r\\n  \\\"namespace\\\" : \\\"[]\\\",\\r\\n  \\\"doc\\\" : \\\"[ ]\\\",\\r\\n  \\\"size\\\" : 0\\r\\n}\":\"[ ]\"}", "{\"type\":\"record\",\"fields\":[]}");
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<org.apache.avro.Schema> schemaList14 = schema10.getTypes();
            org.junit.Assert.fail("Expected exception of type org.apache.avro.AvroRuntimeException; message: Not a union: {\"type\":\"enum\",\"name\":\"map\",\"namespace\":\"{}\",\"doc\":\"\\\"null\\\"\",\"symbols\":[],\"{\\\"type\\\":\\\"record\\\",\\\"fields\\\":[],\\\"{\\\\r\\\\n  \\\\\\\"type\\\\\\\" : \\\\\\\"fixed\\\\\\\",\\\\r\\\\n  \\\\\\\"name\\\\\\\" : \\\\\\\"union\\\\\\\",\\\\r\\\\n  \\\\\\\"namespace\\\\\\\" : \\\\\\\"[]\\\\\\\",\\\\r\\\\n  \\\\\\\"doc\\\\\\\" : \\\\\\\"[ ]\\\\\\\",\\\\r\\\\n  \\\\\\\"size\\\\\\\" : 0\\\\r\\\\n}\\\":\\\"[ ]\\\"}\":\"{\\\"type\\\":\\\"record\\\",\\\"fields\\\":[]}\"}");
        } catch (org.apache.avro.AvroRuntimeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(schema8);
        org.junit.Assert.assertNotNull(strList9);
        org.junit.Assert.assertNotNull(schema10);
    }

    @Test
    public void test0726() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SchemaM3Random300Test1.test0726");
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
            java.lang.String str13 = schema10.getNamespace();
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
        org.junit.Assert.assertNotNull(schema12);
    }

    @Test
    public void test0727() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SchemaM3Random300Test1.test0727");
        org.apache.avro.Schema[] schemaArray0 = new org.apache.avro.Schema[] {};
        java.util.ArrayList<org.apache.avro.Schema> schemaList1 = new java.util.ArrayList<org.apache.avro.Schema>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<org.apache.avro.Schema>) schemaList1, schemaArray0);
        org.apache.avro.Schema schema3 = org.apache.avro.Schema.createUnion((java.util.List<org.apache.avro.Schema>) schemaList1);
        java.util.List<org.apache.avro.Schema> schemaList4 = schema3.getTypes();
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<java.lang.String> strList5 = schema3.getEnumSymbols();
            org.junit.Assert.fail("Expected exception of type org.apache.avro.AvroRuntimeException; message: Not an enum: []");
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
    public void test0728() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SchemaM3Random300Test1.test0728");
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
        java.lang.Class<?> wildcardClass16 = type15.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test0729() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SchemaM3Random300Test1.test0729");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.avro.Schema schema4 = org.apache.avro.Schema.createFixed("{\"type\":\"record\",\"fields\":[]}", "array", "[]", (int) ' ');
            org.junit.Assert.fail("Expected exception of type org.apache.avro.SchemaParseException; message: Illegal initial character: {\"type\":\"record\",\"fields\":[]}");
        } catch (org.apache.avro.SchemaParseException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0730() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SchemaM3Random300Test1.test0730");
        org.apache.avro.Schema.LockableArrayList<java.lang.String> strList4 = new org.apache.avro.Schema.LockableArrayList<java.lang.String>((int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.avro.Schema schema5 = org.apache.avro.Schema.createEnum("{\"type\":\"array\",\"items\":[]}", "{\"type\":\"record\",\"fields\":[],\"{\\r\\n  \\\"type\\\" : \\\"fixed\\\",\\r\\n  \\\"name\\\" : \\\"union\\\",\\r\\n  \\\"namespace\\\" : \\\"[]\\\",\\r\\n  \\\"doc\\\" : \\\"[ ]\\\",\\r\\n  \\\"size\\\" : 0\\r\\n}\":\"[ ]\"}", "{\r\n  \"type\" : \"map\",\r\n  \"values\" : {\r\n    \"type\" : \"map\",\r\n    \"values\" : [ ]\r\n  }\r\n}", (java.util.List<java.lang.String>) strList4);
            org.junit.Assert.fail("Expected exception of type org.apache.avro.SchemaParseException; message: Illegal initial character: {\"type\":\"array\",\"items\":[]}");
        } catch (org.apache.avro.SchemaParseException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0731() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SchemaM3Random300Test1.test0731");
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
        java.lang.String str23 = schema22.getFullName();
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
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "union" + "'", str23, "union");
    }

    @Test
    public void test0732() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SchemaM3Random300Test1.test0732");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.avro.Schema schema4 = org.apache.avro.Schema.createFixed("{\"type\":\"map\",\"values\":{\"type\":\"array\",\"items\":{\"type\":\"map\",\"values\":[]},\"\":\"{\\r\\n  \\\"type\\\" : \\\"record\\\",\\r\\n  \\\"fields\\\" : [ ]\\r\\n}\"}}", "{\r\n  \"type\" : \"map\",\r\n  \"values\" : {\r\n    \"type\" : \"map\",\r\n    \"values\" : [ ]\r\n  }\r\n}", "double", (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type org.apache.avro.SchemaParseException; message: Illegal initial character: {\"type\":\"map\",\"values\":{\"type\":\"array\",\"items\":{\"type\":\"map\",\"values\":[]},\"\":\"{\\r\\n  \\\"type\\\" : \\\"record\\\",\\r\\n  \\\"fields\\\" : [ ]\\r\\n}\"}}");
        } catch (org.apache.avro.SchemaParseException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0733() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SchemaM3Random300Test1.test0733");
        org.apache.avro.Schema.Names names1 = new org.apache.avro.Schema.Names("union type:UNION pos:-1");
        int int2 = names1.size();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test0734() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SchemaM3Random300Test1.test0734");
        org.apache.avro.Schema.LockableArrayList<java.lang.String> strList7 = new org.apache.avro.Schema.LockableArrayList<java.lang.String>((int) (byte) 10);
        org.apache.avro.Schema schema8 = org.apache.avro.Schema.createEnum("[].union", "union type:UNION pos:-1", "union type:UNION pos:-1", (java.util.List<java.lang.String>) strList7);
        java.util.List<java.lang.String> strList9 = schema8.getEnumSymbols();
        org.apache.avro.Schema schema10 = org.apache.avro.Schema.createEnum("map", "\"null\"", "{}", strList9);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.avro.Schema schema11 = schema10.getElementType();
            org.junit.Assert.fail("Expected exception of type org.apache.avro.AvroRuntimeException; message: Not an array: {\"type\":\"enum\",\"name\":\"map\",\"namespace\":\"{}\",\"doc\":\"\\\"null\\\"\",\"symbols\":[]}");
        } catch (org.apache.avro.AvroRuntimeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(schema8);
        org.junit.Assert.assertNotNull(strList9);
        org.junit.Assert.assertNotNull(schema10);
    }

    @Test
    public void test0735() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SchemaM3Random300Test1.test0735");
        org.apache.avro.Schema.Parser parser0 = new org.apache.avro.Schema.Parser();
        java.util.Map<java.lang.String, org.apache.avro.Schema> strMap1 = parser0.getTypes();
        java.util.Map<java.lang.String, org.apache.avro.Schema> strMap2 = parser0.getTypes();
        org.apache.avro.Schema.Parser parser3 = new org.apache.avro.Schema.Parser();
        java.util.Map<java.lang.String, org.apache.avro.Schema> strMap4 = parser3.getTypes();
        org.apache.avro.Schema.Parser parser5 = parser0.addTypes(strMap4);
        java.util.Map<java.lang.String, org.apache.avro.Schema> strMap6 = parser5.getTypes();
        java.io.InputStream inputStream7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.avro.Schema schema8 = parser5.parse(inputStream7);
            org.junit.Assert.fail("Expected exception of type java.io.EOFException; message: No content to map to Object due to end of input");
        } catch (java.io.EOFException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strMap1);
        org.junit.Assert.assertNotNull(strMap2);
        org.junit.Assert.assertNotNull(strMap4);
        org.junit.Assert.assertNotNull(parser5);
        org.junit.Assert.assertNotNull(strMap6);
    }

    @Test
    public void test0736() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SchemaM3Random300Test1.test0736");
        org.apache.avro.Schema schema4 = org.apache.avro.Schema.createFixed("map", "", "double", (int) (short) 100);
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
    public void test0737() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SchemaM3Random300Test1.test0737");
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
        java.lang.String str12 = schema4.getName();
        org.apache.avro.Schema schema13 = org.apache.avro.Schema.createMap(schema4);
        java.lang.String str14 = schema13.getFullName();
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
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "union" + "'", str12, "union");
        org.junit.Assert.assertNotNull(schema13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "map" + "'", str14, "map");
    }

    @Test
    public void test0738() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SchemaM3Random300Test1.test0738");
        org.apache.avro.Schema.Parser parser0 = new org.apache.avro.Schema.Parser();
        java.util.Map<java.lang.String, org.apache.avro.Schema> strMap1 = parser0.getTypes();
        java.util.Map<java.lang.String, org.apache.avro.Schema> strMap2 = parser0.getTypes();
        boolean boolean3 = parser0.getValidate();
        org.apache.avro.Schema.Parser parser5 = parser0.setValidate(true);
        boolean boolean6 = parser0.getValidate();
        java.io.InputStream inputStream7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.avro.Schema schema8 = parser0.parse(inputStream7);
            org.junit.Assert.fail("Expected exception of type java.io.EOFException; message: No content to map to Object due to end of input");
        } catch (java.io.EOFException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strMap1);
        org.junit.Assert.assertNotNull(strMap2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(parser5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test0739() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SchemaM3Random300Test1.test0739");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.avro.Schema schema2 = org.apache.avro.Schema.parse("{\"type\":\"record\",\"fields\":[]}", true);
            org.junit.Assert.fail("Expected exception of type org.apache.avro.SchemaParseException; message: No name in schema: {\"type\":\"record\",\"fields\":[]}");
        } catch (org.apache.avro.SchemaParseException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0740() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SchemaM3Random300Test1.test0740");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.avro.Schema schema4 = org.apache.avro.Schema.createFixed("\"null\"", "{\"type\":\"fixed\",\"name\":\"union\",\"namespace\":\"[]\",\"doc\":\"{\\r\\n  \\\"type\\\" : \\\"map\\\",\\r\\n  \\\"values\\\" : [ ]\\r\\n}\",\"size\":10}", "union type:UNION pos:-1", (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type org.apache.avro.SchemaParseException; message: Illegal initial character: \"null\"");
        } catch (org.apache.avro.SchemaParseException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0741() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SchemaM3Random300Test1.test0741");
        org.apache.avro.Schema.Parser parser0 = new org.apache.avro.Schema.Parser();
        org.apache.avro.Schema.Parser parser2 = parser0.setValidate(true);
        org.apache.avro.Schema.Parser parser4 = parser0.setValidate(true);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.avro.Schema schema6 = parser0.parse("int");
            org.junit.Assert.fail("Expected exception of type org.apache.avro.SchemaParseException; message: org.codehaus.jackson.JsonParseException: Unexpected character ('i' (code 105)): expected a valid value (number, String, array, object, 'true', 'false' or 'null')? at [Source: java.io.StringReader@40115dc5; line: 1, column: 2]");
        } catch (org.apache.avro.SchemaParseException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(parser2);
        org.junit.Assert.assertNotNull(parser4);
    }

    @Test
    public void test0742() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SchemaM3Random300Test1.test0742");
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
            int int13 = schema10.getEnumOrdinal("map");
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
        org.junit.Assert.assertNotNull(schema11);
    }

    @Test
    public void test0743() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SchemaM3Random300Test1.test0743");
        org.apache.avro.Schema schema2 = org.apache.avro.Schema.parse("{\"type\":\"fixed\",\"name\":\"union\",\"namespace\":\"[]\",\"doc\":\"[ ]\",\"size\":0}", false);
        org.junit.Assert.assertNotNull(schema2);
    }

    @Test
    public void test0744() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SchemaM3Random300Test1.test0744");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.avro.Schema schema4 = org.apache.avro.Schema.createFixed("{\"type\":\"fixed\",\"name\":\"union\",\"namespace\":\"[]\",\"doc\":\"[ ]\",\"size\":0,\"aliases\":[\"union\"]}", "{\"type\":\"fixed\",\"name\":\"union\",\"namespace\":\"[]\",\"doc\":\"[ ]\",\"size\":0,\"aliases\":[\"union\"]}", "{\r\n  \"type\" : \"map\",\r\n  \"values\" : [ ]\r\n}", (int) '#');
            org.junit.Assert.fail("Expected exception of type org.apache.avro.SchemaParseException; message: Illegal initial character: {\"type\":\"fixed\",\"name\":\"union\",\"namespace\":\"[]\",\"doc\":\"[ ]\",\"size\":0,\"aliases\":[\"union\"]}");
        } catch (org.apache.avro.SchemaParseException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0745() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SchemaM3Random300Test1.test0745");
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
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<java.lang.String> strList24 = schema21.getEnumSymbols();
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
        org.junit.Assert.assertNull(str23);
    }

    @Test
    public void test0746() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SchemaM3Random300Test1.test0746");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.avro.Schema schema4 = org.apache.avro.Schema.createRecord("\"double\"", "", "{\r\n  \"type\" : \"map\",\r\n  \"values\" : {\r\n    \"type\" : \"enum\",\r\n    \"name\" : \"union\",\r\n    \"namespace\" : \"[]\",\r\n    \"doc\" : \"{}\",\r\n    \"symbols\" : [ ]\r\n  }\r\n}", false);
            org.junit.Assert.fail("Expected exception of type org.apache.avro.SchemaParseException; message: Illegal initial character: \"double\"");
        } catch (org.apache.avro.SchemaParseException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0747() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SchemaM3Random300Test1.test0747");
        org.apache.avro.Schema.Parser parser0 = new org.apache.avro.Schema.Parser();
        org.apache.avro.Schema.Parser parser2 = parser0.setValidate(true);
        java.util.Map<java.lang.String, org.apache.avro.Schema> strMap3 = parser0.getTypes();
        org.apache.avro.Schema.Parser parser5 = parser0.setValidate(true);
        org.apache.avro.Schema.Parser parser7 = parser0.setValidate(true);
        java.util.Map<java.lang.String, org.apache.avro.Schema> strMap8 = parser0.getTypes();
        org.apache.avro.Schema.Parser parser10 = parser0.setValidate(false);
        org.apache.avro.Schema.Parser parser12 = parser10.setValidate(true);
        org.apache.avro.Schema schema14 = parser10.parse("{\r\n  \"type\" : \"array\",\r\n  \"items\" : {\r\n    \"type\" : \"map\",\r\n    \"values\" : [ ]\r\n  }\r\n}");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean16 = schema14.hasEnumSymbol("{\"type\":\"map\",\"values\":{\"type\":\"array\",\"items\":{\"type\":\"map\",\"values\":[]}}}");
            org.junit.Assert.fail("Expected exception of type org.apache.avro.AvroRuntimeException; message: Not an enum: {\"type\":\"array\",\"items\":{\"type\":\"map\",\"values\":[]}}");
        } catch (org.apache.avro.AvroRuntimeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(parser2);
        org.junit.Assert.assertNotNull(strMap3);
        org.junit.Assert.assertNotNull(parser5);
        org.junit.Assert.assertNotNull(parser7);
        org.junit.Assert.assertNotNull(strMap8);
        org.junit.Assert.assertNotNull(parser10);
        org.junit.Assert.assertNotNull(parser12);
        org.junit.Assert.assertNotNull(schema14);
    }

    @Test
    public void test0748() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SchemaM3Random300Test1.test0748");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.avro.Schema schema4 = org.apache.avro.Schema.createFixed("{\"type\":\"map\",\"values\":[]}", "{\"type\":\"fixed\",\"name\":\"union\",\"namespace\":\"[]\",\"doc\":\"{\\r\\n  \\\"type\\\" : \\\"map\\\",\\r\\n  \\\"values\\\" : [ ]\\r\\n}\",\"size\":10}", "{\r\n  \"type\" : \"record\",\r\n  \"fields\" : [ ]\r\n}", (-1));
            org.junit.Assert.fail("Expected exception of type org.apache.avro.SchemaParseException; message: Illegal initial character: {\"type\":\"map\",\"values\":[]}");
        } catch (org.apache.avro.SchemaParseException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0749() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SchemaM3Random300Test1.test0749");
        org.apache.avro.Schema.LockableArrayList<java.lang.String> strList4 = new org.apache.avro.Schema.LockableArrayList<java.lang.String>((int) '#');
        org.apache.avro.Schema.LockableArrayList<java.lang.String> strList5 = new org.apache.avro.Schema.LockableArrayList<java.lang.String>((java.util.List<java.lang.String>) strList4);
        org.apache.avro.Schema.LockableArrayList<java.lang.String> strList6 = new org.apache.avro.Schema.LockableArrayList<java.lang.String>((java.util.List<java.lang.String>) strList4);
        org.apache.avro.Schema.LockableArrayList<java.lang.String> strList7 = new org.apache.avro.Schema.LockableArrayList<java.lang.String>((java.util.List<java.lang.String>) strList6);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.avro.Schema schema8 = org.apache.avro.Schema.createEnum("{\"type\":\"map\",\"values\":[]}", "hi!", "{\"type\":\"fixed\",\"name\":\"union\",\"namespace\":\"[]\",\"doc\":\"{\\r\\n  \\\"type\\\" : \\\"map\\\",\\r\\n  \\\"values\\\" : [ ]\\r\\n}\",\"size\":10}", (java.util.List<java.lang.String>) strList6);
            org.junit.Assert.fail("Expected exception of type org.apache.avro.SchemaParseException; message: Illegal initial character: {\"type\":\"map\",\"values\":[]}");
        } catch (org.apache.avro.SchemaParseException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0750() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SchemaM3Random300Test1.test0750");
        org.apache.avro.Schema.Parser parser0 = new org.apache.avro.Schema.Parser();
        java.util.Map<java.lang.String, org.apache.avro.Schema> strMap1 = parser0.getTypes();
        java.util.Map<java.lang.String, org.apache.avro.Schema> strMap2 = parser0.getTypes();
        org.apache.avro.Schema.Parser parser3 = new org.apache.avro.Schema.Parser();
        org.apache.avro.Schema.Parser parser5 = parser3.setValidate(true);
        java.util.Map<java.lang.String, org.apache.avro.Schema> strMap6 = parser3.getTypes();
        org.apache.avro.Schema.Parser parser7 = parser0.addTypes(strMap6);
        org.apache.avro.Schema schema9 = parser7.parse("{\"type\":\"map\",\"values\":[]}");
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
        org.junit.Assert.assertNotNull(schema9);
    }

    @Test
    public void test0751() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SchemaM3Random300Test1.test0751");
        org.apache.avro.Schema.Names names0 = new org.apache.avro.Schema.Names();
        names0.space("[ ]");
        java.lang.Object obj3 = names0.clone();
        org.apache.avro.Schema.Type type4 = org.apache.avro.Schema.Type.RECORD;
        boolean boolean5 = names0.containsKey((java.lang.Object) type4);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.avro.Schema schema6 = org.apache.avro.Schema.create(type4);
            org.junit.Assert.fail("Expected exception of type org.apache.avro.AvroRuntimeException; message: Can't create a: RECORD");
        } catch (org.apache.avro.AvroRuntimeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(obj3);
        org.junit.Assert.assertEquals(obj3.toString(), "{}");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj3), "{}");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj3), "{}");
        org.junit.Assert.assertTrue("'" + type4 + "' != '" + org.apache.avro.Schema.Type.RECORD + "'", type4.equals(org.apache.avro.Schema.Type.RECORD));
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test0752() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SchemaM3Random300Test1.test0752");
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
            java.util.Set<java.lang.String> strSet13 = schema12.getAliases();
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
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNotNull(schema12);
    }

    @Test
    public void test0753() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SchemaM3Random300Test1.test0753");
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
        java.lang.String str13 = schema10.toString(true);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.avro.Schema schema14 = schema10.getElementType();
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
        org.junit.Assert.assertNotNull(schema11);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "{\r\n  \"type\" : \"map\",\r\n  \"values\" : [ ]\r\n}" + "'", str13, "{\r\n  \"type\" : \"map\",\r\n  \"values\" : [ ]\r\n}");
    }

    @Test
    public void test0754() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SchemaM3Random300Test1.test0754");
        org.apache.avro.Schema[] schemaArray6 = new org.apache.avro.Schema[] {};
        java.util.ArrayList<org.apache.avro.Schema> schemaList7 = new java.util.ArrayList<org.apache.avro.Schema>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<org.apache.avro.Schema>) schemaList7, schemaArray6);
        org.apache.avro.Schema schema9 = org.apache.avro.Schema.createUnion((java.util.List<org.apache.avro.Schema>) schemaList7);
        org.apache.avro.Schema[] schemaArray10 = new org.apache.avro.Schema[] {};
        java.util.ArrayList<org.apache.avro.Schema> schemaList11 = new java.util.ArrayList<org.apache.avro.Schema>();
        boolean boolean12 = java.util.Collections.addAll((java.util.Collection<org.apache.avro.Schema>) schemaList11, schemaArray10);
        org.apache.avro.Schema schema13 = org.apache.avro.Schema.createUnion((java.util.List<org.apache.avro.Schema>) schemaList11);
        org.apache.avro.Schema schema14 = org.apache.avro.Schema.applyAliases(schema9, schema13);
        java.util.List<org.apache.avro.Schema> schemaList15 = schema14.getTypes();
        org.apache.avro.Schema[] schemaArray16 = new org.apache.avro.Schema[] {};
        java.util.ArrayList<org.apache.avro.Schema> schemaList17 = new java.util.ArrayList<org.apache.avro.Schema>();
        boolean boolean18 = java.util.Collections.addAll((java.util.Collection<org.apache.avro.Schema>) schemaList17, schemaArray16);
        org.apache.avro.Schema schema19 = org.apache.avro.Schema.createUnion((java.util.List<org.apache.avro.Schema>) schemaList17);
        org.apache.avro.Schema[] schemaArray20 = new org.apache.avro.Schema[] {};
        java.util.ArrayList<org.apache.avro.Schema> schemaList21 = new java.util.ArrayList<org.apache.avro.Schema>();
        boolean boolean22 = java.util.Collections.addAll((java.util.Collection<org.apache.avro.Schema>) schemaList21, schemaArray20);
        org.apache.avro.Schema schema23 = org.apache.avro.Schema.createUnion((java.util.List<org.apache.avro.Schema>) schemaList21);
        org.apache.avro.Schema schema24 = org.apache.avro.Schema.applyAliases(schema19, schema23);
        org.apache.avro.Schema schema25 = org.apache.avro.Schema.applyAliases(schema14, schema23);
        org.apache.avro.Schema schema26 = org.apache.avro.Schema.createMap(schema14);
        org.apache.avro.Schema schema27 = schema26.getValueType();
        java.lang.String str28 = schema26.getDoc();
        org.apache.avro.Schema.LockableArrayList<java.lang.String> strList30 = new org.apache.avro.Schema.LockableArrayList<java.lang.String>((int) ' ');
        boolean boolean31 = schema26.equals((java.lang.Object) strList30);
        org.apache.avro.Schema schema32 = org.apache.avro.Schema.createEnum("union", "union", "double", (java.util.List<java.lang.String>) strList30);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.avro.Schema schema33 = org.apache.avro.Schema.createEnum("{\"type\":\"map\",\"values\":{\"type\":\"array\",\"items\":{\"type\":\"map\",\"values\":[]}}}", "{}", "", (java.util.List<java.lang.String>) strList30);
            org.junit.Assert.fail("Expected exception of type org.apache.avro.SchemaParseException; message: Illegal initial character: {\"type\":\"map\",\"values\":{\"type\":\"array\",\"items\":{\"type\":\"map\",\"values\":[]}}}");
        } catch (org.apache.avro.SchemaParseException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(schemaArray6);
        org.junit.Assert.assertArrayEquals(schemaArray6, new org.apache.avro.Schema[] {});
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(schema9);
        org.junit.Assert.assertNotNull(schemaArray10);
        org.junit.Assert.assertArrayEquals(schemaArray10, new org.apache.avro.Schema[] {});
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(schema13);
        org.junit.Assert.assertNotNull(schema14);
        org.junit.Assert.assertNotNull(schemaList15);
        org.junit.Assert.assertNotNull(schemaArray16);
        org.junit.Assert.assertArrayEquals(schemaArray16, new org.apache.avro.Schema[] {});
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(schema19);
        org.junit.Assert.assertNotNull(schemaArray20);
        org.junit.Assert.assertArrayEquals(schemaArray20, new org.apache.avro.Schema[] {});
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(schema23);
        org.junit.Assert.assertNotNull(schema24);
        org.junit.Assert.assertNotNull(schema25);
        org.junit.Assert.assertNotNull(schema26);
        org.junit.Assert.assertNotNull(schema27);
        org.junit.Assert.assertNull(str28);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertNotNull(schema32);
    }

    @Test
    public void test0755() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SchemaM3Random300Test1.test0755");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.avro.Schema schema4 = org.apache.avro.Schema.createRecord("{\"type\":\"array\",\"items\":\"int\"}", "", "{\"type\":\"map\",\"values\":{\"type\":\"array\",\"items\":{\"type\":\"map\",\"values\":[]},\"\":\"{\\r\\n  \\\"type\\\" : \\\"record\\\",\\r\\n  \\\"fields\\\" : [ ]\\r\\n}\"}}", true);
            org.junit.Assert.fail("Expected exception of type org.apache.avro.SchemaParseException; message: Illegal initial character: {\"type\":\"array\",\"items\":\"int\"}");
        } catch (org.apache.avro.SchemaParseException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0756() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SchemaM3Random300Test1.test0756");
        org.apache.avro.Schema.LockableArrayList<java.lang.String> strList3 = new org.apache.avro.Schema.LockableArrayList<java.lang.String>();
        org.apache.avro.Schema.LockableArrayList<java.lang.String> strList4 = new org.apache.avro.Schema.LockableArrayList<java.lang.String>((java.util.List<java.lang.String>) strList3);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.avro.Schema schema5 = org.apache.avro.Schema.createEnum("{\"type\":\"array\",\"items\":[]}", "{\"type\":\"fixed\",\"name\":\"union\",\"namespace\":\"[]\",\"doc\":\"[ ]\",\"size\":0,\"aliases\":[\"union\"]}", "{\r\n  \"type\" : \"map\",\r\n  \"values\" : {\r\n    \"type\" : \"map\",\r\n    \"values\" : [ ]\r\n  }\r\n}", (java.util.List<java.lang.String>) strList4);
            org.junit.Assert.fail("Expected exception of type org.apache.avro.SchemaParseException; message: Illegal initial character: {\"type\":\"array\",\"items\":[]}");
        } catch (org.apache.avro.SchemaParseException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0757() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SchemaM3Random300Test1.test0757");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.avro.Schema schema4 = org.apache.avro.Schema.createRecord("{\"type\":\"map\",\"values\":{\"type\":\"enum\",\"name\":\"union\",\"namespace\":\"[]\",\"doc\":\"{}\",\"symbols\":[]}}", "{\"type\":\"array\",\"items\":{\"type\":\"map\",\"values\":[]}}", "", false);
            org.junit.Assert.fail("Expected exception of type org.apache.avro.SchemaParseException; message: Illegal initial character: {\"type\":\"map\",\"values\":{\"type\":\"enum\",\"name\":\"union\",\"namespace\":\"[]\",\"doc\":\"{}\",\"symbols\":[]}}");
        } catch (org.apache.avro.SchemaParseException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0758() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SchemaM3Random300Test1.test0758");
        java.lang.String[] strArray4 = new java.lang.String[] { "" };
        java.util.ArrayList<java.lang.String> strList5 = new java.util.ArrayList<java.lang.String>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList5, strArray4);
        org.apache.avro.Schema.LockableArrayList<java.lang.String> strList7 = new org.apache.avro.Schema.LockableArrayList<java.lang.String>((java.util.List<java.lang.String>) strList5);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.avro.Schema schema8 = org.apache.avro.Schema.createEnum("{\r\n  \"type\" : \"map\",\r\n  \"values\" : {\r\n    \"type\" : \"enum\",\r\n    \"name\" : \"union\",\r\n    \"namespace\" : \"[]\",\r\n    \"doc\" : \"{}\",\r\n    \"symbols\" : [ ]\r\n  }\r\n}", "[]", "{null={\"type\":\"record\",\"fields\":[]}}", (java.util.List<java.lang.String>) strList5);
            org.junit.Assert.fail("Expected exception of type org.apache.avro.SchemaParseException; message: Illegal initial character: {??  \"type\" : \"map\",??  \"values\" : {??    \"type\" : \"enum\",??    \"name\" : \"union\",??    \"namespace\" : \"[]\",??    \"doc\" : \"{}\",??    \"symbols\" : [ ]??  }??}");
        } catch (org.apache.avro.SchemaParseException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertArrayEquals(strArray4, new java.lang.String[] { "" });
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test0759() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SchemaM3Random300Test1.test0759");
        org.apache.avro.Schema.Type type0 = org.apache.avro.Schema.Type.DOUBLE;
        org.apache.avro.Schema schema1 = org.apache.avro.Schema.create(type0);
        org.apache.avro.Schema schema2 = org.apache.avro.Schema.createMap(schema1);
        schema1.addProp("float", "{\"type\":\"array\",\"items\":[]}");
        java.lang.String str6 = schema1.getDoc();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.avro.Schema schema7 = schema1.getValueType();
            org.junit.Assert.fail("Expected exception of type org.apache.avro.AvroRuntimeException; message: Not a map: {\"type\":\"double\",\"float\":\"{\\\"type\\\":\\\"array\\\",\\\"items\\\":[]}\"}");
        } catch (org.apache.avro.AvroRuntimeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + type0 + "' != '" + org.apache.avro.Schema.Type.DOUBLE + "'", type0.equals(org.apache.avro.Schema.Type.DOUBLE));
        org.junit.Assert.assertNotNull(schema1);
        org.junit.Assert.assertNotNull(schema2);
        org.junit.Assert.assertNull(str6);
    }

    @Test
    public void test0760() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SchemaM3Random300Test1.test0760");
        org.apache.avro.Schema schema1 = org.apache.avro.Schema.parse("{\"type\":\"map\",\"values\":{\"type\":\"array\",\"items\":{\"type\":\"map\",\"values\":[]},\"\":\"{\\r\\n  \\\"type\\\" : \\\"record\\\",\\r\\n  \\\"fields\\\" : [ ]\\r\\n}\"}}");
        org.junit.Assert.assertNotNull(schema1);
    }

    @Test
    public void test0761() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SchemaM3Random300Test1.test0761");
        org.apache.avro.Schema.LockableArrayList<java.lang.String> strList4 = new org.apache.avro.Schema.LockableArrayList<java.lang.String>((int) '#');
        org.apache.avro.Schema.LockableArrayList<java.lang.String> strList5 = new org.apache.avro.Schema.LockableArrayList<java.lang.String>((java.util.List<java.lang.String>) strList4);
        org.apache.avro.Schema.LockableArrayList<java.lang.String> strList6 = new org.apache.avro.Schema.LockableArrayList<java.lang.String>((java.util.List<java.lang.String>) strList4);
        org.apache.avro.Schema schema7 = org.apache.avro.Schema.createEnum("array", "{\r\n  \"type\" : \"fixed\",\r\n  \"name\" : \"union\",\r\n  \"namespace\" : \"[]\",\r\n  \"doc\" : \"[ ]\",\r\n  \"size\" : 0\r\n}", "{\r\n  \"type\" : \"fixed\",\r\n  \"name\" : \"union\",\r\n  \"namespace\" : \"[]\",\r\n  \"doc\" : \"[ ]\",\r\n  \"size\" : 0\r\n}", (java.util.List<java.lang.String>) strList4);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.avro.Schema schema8 = schema7.getElementType();
            org.junit.Assert.fail("Expected exception of type org.apache.avro.AvroRuntimeException; message: Not an array: {\"type\":\"enum\",\"name\":\"array\",\"namespace\":\"{\\r\\n  \\\"type\\\" : \\\"fixed\\\",\\r\\n  \\\"name\\\" : \\\"union\\\",\\r\\n  \\\"namespace\\\" : \\\"[]\\\",\\r\\n  \\\"doc\\\" : \\\"[ ]\\\",\\r\\n  \\\"size\\\" : 0\\r\\n}\",\"doc\":\"{\\r\\n  \\\"type\\\" : \\\"fixed\\\",\\r\\n  \\\"name\\\" : \\\"union\\\",\\r\\n  \\\"namespace\\\" : \\\"[]\\\",\\r\\n  \\\"doc\\\" : \\\"[ ]\\\",\\r\\n  \\\"size\\\" : 0\\r\\n}\",\"symbols\":[]}");
        } catch (org.apache.avro.AvroRuntimeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(schema7);
    }

    @Test
    public void test0762() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SchemaM3Random300Test1.test0762");
        org.apache.avro.Schema.Parser parser0 = new org.apache.avro.Schema.Parser();
        java.util.Map<java.lang.String, org.apache.avro.Schema> strMap1 = parser0.getTypes();
        java.util.Map<java.lang.String, org.apache.avro.Schema> strMap2 = parser0.getTypes();
        boolean boolean3 = parser0.getValidate();
        org.apache.avro.Schema.Parser parser5 = parser0.setValidate(true);
        java.io.File file6 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.avro.Schema schema7 = parser5.parse(file6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strMap1);
        org.junit.Assert.assertNotNull(strMap2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(parser5);
    }

    @Test
    public void test0763() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SchemaM3Random300Test1.test0763");
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
        java.lang.Class<?> wildcardClass14 = schema4.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test0764() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SchemaM3Random300Test1.test0764");
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
            java.lang.String str15 = schema8.getNamespace();
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
    public void test0765() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SchemaM3Random300Test1.test0765");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.avro.Schema schema4 = org.apache.avro.Schema.createRecord("{\"type\":\"array\",\"items\":[]}", "map", "float", false);
            org.junit.Assert.fail("Expected exception of type org.apache.avro.SchemaParseException; message: Illegal initial character: {\"type\":\"array\",\"items\":[]}");
        } catch (org.apache.avro.SchemaParseException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0766() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SchemaM3Random300Test1.test0766");
        org.apache.avro.Schema schema4 = org.apache.avro.Schema.createRecord("[].union", "{\r\n  \"type\" : \"array\",\r\n  \"items\" : {\r\n    \"type\" : \"map\",\r\n    \"values\" : [ ]\r\n  }\r\n}", "{\r\n  \"type\" : \"fixed\",\r\n  \"name\" : \"union\",\r\n  \"namespace\" : \"[]\",\r\n  \"doc\" : \"[ ]\",\r\n  \"size\" : 0\r\n}", false);
        org.junit.Assert.assertNotNull(schema4);
    }

    @Test
    public void test0767() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SchemaM3Random300Test1.test0767");
        java.lang.String[] strArray19 = new java.lang.String[] { "{\"type\":\"array\",\"items\":{\"type\":\"map\",\"values\":[]}}", "union type:MAP pos:-1", "{\"type\":\"array\",\"items\":{\"type\":\"map\",\"values\":[]}}", "{}", "{\r\n  \"type\" : \"map\",\r\n  \"values\" : {\r\n    \"type\" : \"map\",\r\n    \"values\" : [ ]\r\n  }\r\n}", "double", "{\r\n  \"type\" : \"map\",\r\n  \"values\" : [ ]\r\n}", "{\"type\":\"map\",\"values\":[]}", "{\"type\":\"array\",\"items\":[]}", "{\"type\":\"map\",\"values\":[]}", "{}", "union", "{\r\n  \"type\" : \"record\",\r\n  \"fields\" : [ ]\r\n}", "[].union", "{\r\n  \"type\" : \"map\",\r\n  \"values\" : [ ]\r\n}", "{\"type\":\"fixed\",\"name\":\"union\",\"namespace\":\"[]\",\"doc\":\"[ ]\",\"size\":0}" };
        java.util.ArrayList<java.lang.String> strList20 = new java.util.ArrayList<java.lang.String>();
        boolean boolean21 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList20, strArray19);
        org.apache.avro.Schema.LockableArrayList<java.lang.String> strList22 = new org.apache.avro.Schema.LockableArrayList<java.lang.String>((java.util.List<java.lang.String>) strList20);
        org.apache.avro.Schema.LockableArrayList<java.lang.String> strList23 = new org.apache.avro.Schema.LockableArrayList<java.lang.String>((java.util.List<java.lang.String>) strList22);
        org.apache.avro.Schema.LockableArrayList<java.lang.String> strList24 = new org.apache.avro.Schema.LockableArrayList<java.lang.String>((java.util.List<java.lang.String>) strList23);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.avro.Schema schema25 = org.apache.avro.Schema.createEnum("[].union", "{\"type\":\"array\",\"items\":\"int\"}", "{\"type\":\"map\",\"values\":[]}", (java.util.List<java.lang.String>) strList23);
            org.junit.Assert.fail("Expected exception of type org.apache.avro.SchemaParseException; message: Illegal initial character: {\"type\":\"array\",\"items\":{\"type\":\"map\",\"values\":[]}}");
        } catch (org.apache.avro.SchemaParseException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray19);
        org.junit.Assert.assertArrayEquals(strArray19, new java.lang.String[] { "{\"type\":\"array\",\"items\":{\"type\":\"map\",\"values\":[]}}", "union type:MAP pos:-1", "{\"type\":\"array\",\"items\":{\"type\":\"map\",\"values\":[]}}", "{}", "{\r\n  \"type\" : \"map\",\r\n  \"values\" : {\r\n    \"type\" : \"map\",\r\n    \"values\" : [ ]\r\n  }\r\n}", "double", "{\r\n  \"type\" : \"map\",\r\n  \"values\" : [ ]\r\n}", "{\"type\":\"map\",\"values\":[]}", "{\"type\":\"array\",\"items\":[]}", "{\"type\":\"map\",\"values\":[]}", "{}", "union", "{\r\n  \"type\" : \"record\",\r\n  \"fields\" : [ ]\r\n}", "[].union", "{\r\n  \"type\" : \"map\",\r\n  \"values\" : [ ]\r\n}", "{\"type\":\"fixed\",\"name\":\"union\",\"namespace\":\"[]\",\"doc\":\"[ ]\",\"size\":0}" });
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
    }

    @Test
    public void test0768() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SchemaM3Random300Test1.test0768");
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
        org.apache.avro.Schema.Type type29 = schema27.getType();
        org.apache.avro.Schema schema30 = org.apache.avro.Schema.createMap(schema27);
        org.apache.avro.Schema schema31 = org.apache.avro.Schema.createArray(schema30);
        org.apache.avro.Schema schema32 = org.apache.avro.Schema.applyAliases(schema19, schema31);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.avro.Schema schema33 = schema19.getValueType();
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
        org.junit.Assert.assertTrue("'" + type29 + "' != '" + org.apache.avro.Schema.Type.UNION + "'", type29.equals(org.apache.avro.Schema.Type.UNION));
        org.junit.Assert.assertNotNull(schema30);
        org.junit.Assert.assertNotNull(schema31);
        org.junit.Assert.assertNotNull(schema32);
    }

    @Test
    public void test0769() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SchemaM3Random300Test1.test0769");
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
        org.apache.avro.Schema schema31 = org.apache.avro.Schema.createArray(schema29);
        // The following exception was thrown during execution in test generation
        try {
            schema29.addAlias("\"null\"");
            org.junit.Assert.fail("Expected exception of type org.apache.avro.SchemaParseException; message: Illegal initial character: \"null\"");
        } catch (org.apache.avro.SchemaParseException e) {
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
        org.junit.Assert.assertNotNull(schema31);
    }

    @Test
    public void test0770() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SchemaM3Random300Test1.test0770");
        org.apache.avro.Schema[] schemaArray0 = new org.apache.avro.Schema[] {};
        java.util.ArrayList<org.apache.avro.Schema> schemaList1 = new java.util.ArrayList<org.apache.avro.Schema>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<org.apache.avro.Schema>) schemaList1, schemaArray0);
        org.apache.avro.Schema schema3 = org.apache.avro.Schema.createUnion((java.util.List<org.apache.avro.Schema>) schemaList1);
        java.util.List<org.apache.avro.Schema> schemaList4 = schema3.getTypes();
        org.apache.avro.Schema schema5 = org.apache.avro.Schema.createUnion(schemaList4);
        org.apache.avro.Schema.Parser parser6 = new org.apache.avro.Schema.Parser();
        java.util.Map<java.lang.String, org.apache.avro.Schema> strMap7 = parser6.getTypes();
        java.util.Map<java.lang.String, org.apache.avro.Schema> strMap8 = parser6.getTypes();
        org.apache.avro.Schema.Parser parser9 = new org.apache.avro.Schema.Parser();
        org.apache.avro.Schema.Parser parser11 = parser9.setValidate(true);
        java.util.Map<java.lang.String, org.apache.avro.Schema> strMap12 = parser9.getTypes();
        org.apache.avro.Schema.Parser parser13 = parser6.addTypes(strMap12);
        org.apache.avro.Schema.Parser parser15 = parser13.setValidate(true);
        org.apache.avro.Schema.Parser parser16 = new org.apache.avro.Schema.Parser();
        java.util.Map<java.lang.String, org.apache.avro.Schema> strMap17 = parser16.getTypes();
        java.util.Map<java.lang.String, org.apache.avro.Schema> strMap18 = parser16.getTypes();
        org.apache.avro.Schema.Parser parser19 = new org.apache.avro.Schema.Parser();
        java.util.Map<java.lang.String, org.apache.avro.Schema> strMap20 = parser19.getTypes();
        org.apache.avro.Schema.Parser parser21 = parser16.addTypes(strMap20);
        java.util.Map<java.lang.String, org.apache.avro.Schema> strMap22 = parser21.getTypes();
        org.apache.avro.Schema.Parser parser23 = parser15.addTypes(strMap22);
        boolean boolean24 = schema5.equals((java.lang.Object) parser15);
        java.lang.Class<?> wildcardClass25 = parser15.getClass();
        org.junit.Assert.assertNotNull(schemaArray0);
        org.junit.Assert.assertArrayEquals(schemaArray0, new org.apache.avro.Schema[] {});
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(schema3);
        org.junit.Assert.assertNotNull(schemaList4);
        org.junit.Assert.assertNotNull(schema5);
        org.junit.Assert.assertNotNull(strMap7);
        org.junit.Assert.assertNotNull(strMap8);
        org.junit.Assert.assertNotNull(parser11);
        org.junit.Assert.assertNotNull(strMap12);
        org.junit.Assert.assertNotNull(parser13);
        org.junit.Assert.assertNotNull(parser15);
        org.junit.Assert.assertNotNull(strMap17);
        org.junit.Assert.assertNotNull(strMap18);
        org.junit.Assert.assertNotNull(strMap20);
        org.junit.Assert.assertNotNull(parser21);
        org.junit.Assert.assertNotNull(strMap22);
        org.junit.Assert.assertNotNull(parser23);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test0771() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SchemaM3Random300Test1.test0771");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.avro.Schema schema2 = org.apache.avro.Schema.parse("{null={\"type\":\"record\",\"fields\":[]}}", false);
            org.junit.Assert.fail("Expected exception of type org.apache.avro.SchemaParseException; message: org.codehaus.jackson.JsonParseException: Unexpected character ('n' (code 110)): was expecting double-quote to start field name? at [Source: java.io.StringReader@3c788c0a; line: 1, column: 3]");
        } catch (org.apache.avro.SchemaParseException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0772() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SchemaM3Random300Test1.test0772");
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
            org.apache.avro.Schema schema19 = parser0.parse(inputStream18);
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
    public void test0773() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SchemaM3Random300Test1.test0773");
        org.apache.avro.Schema.Names names1 = new org.apache.avro.Schema.Names("union");
        java.lang.String str2 = names1.space();
        boolean boolean3 = names1.isEmpty();
        names1.clear();
        names1.clear();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "union" + "'", str2, "union");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
    }

    @Test
    public void test0774() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SchemaM3Random300Test1.test0774");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.avro.Schema schema4 = org.apache.avro.Schema.createRecord("[ ]", "float", "{\"type\":\"fixed\",\"name\":\"union\",\"namespace\":\"[]\",\"doc\":\"union type:UNION pos:-1\",\"size\":100}", true);
            org.junit.Assert.fail("Expected exception of type org.apache.avro.SchemaParseException; message: Illegal initial character: [ ]");
        } catch (org.apache.avro.SchemaParseException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0775() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SchemaM3Random300Test1.test0775");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.avro.Schema schema4 = org.apache.avro.Schema.createRecord("{\"type\":\"record\",\"fields\":[],\"{\\r\\n  \\\"type\\\" : \\\"fixed\\\",\\r\\n  \\\"name\\\" : \\\"union\\\",\\r\\n  \\\"namespace\\\" : \\\"[]\\\",\\r\\n  \\\"doc\\\" : \\\"[ ]\\\",\\r\\n  \\\"size\\\" : 0\\r\\n}\":\"[ ]\"}", "[].union", "map", true);
            org.junit.Assert.fail("Expected exception of type org.apache.avro.SchemaParseException; message: Illegal initial character: {\"type\":\"record\",\"fields\":[],\"{\\r\\n  \\\"type\\\" : \\\"fixed\\\",\\r\\n  \\\"name\\\" : \\\"union\\\",\\r\\n  \\\"namespace\\\" : \\\"[]\\\",\\r\\n  \\\"doc\\\" : \\\"[ ]\\\",\\r\\n  \\\"size\\\" : 0\\r\\n}\":\"[ ]\"}");
        } catch (org.apache.avro.SchemaParseException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0776() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SchemaM3Random300Test1.test0776");
        org.apache.avro.Schema.LockableArrayList<java.lang.String> strList7 = new org.apache.avro.Schema.LockableArrayList<java.lang.String>((int) (byte) 10);
        org.apache.avro.Schema schema8 = org.apache.avro.Schema.createEnum("[].union", "union type:UNION pos:-1", "union type:UNION pos:-1", (java.util.List<java.lang.String>) strList7);
        java.util.List<java.lang.String> strList9 = schema8.getEnumSymbols();
        org.apache.avro.Schema schema10 = org.apache.avro.Schema.createEnum("map", "\"null\"", "{}", strList9);
        schema10.addProp("{\"type\":\"record\",\"fields\":[],\"{\\r\\n  \\\"type\\\" : \\\"fixed\\\",\\r\\n  \\\"name\\\" : \\\"union\\\",\\r\\n  \\\"namespace\\\" : \\\"[]\\\",\\r\\n  \\\"doc\\\" : \\\"[ ]\\\",\\r\\n  \\\"size\\\" : 0\\r\\n}\":\"[ ]\"}", "{\"type\":\"record\",\"fields\":[]}");
        java.lang.String str14 = schema10.getName();
        org.junit.Assert.assertNotNull(schema8);
        org.junit.Assert.assertNotNull(strList9);
        org.junit.Assert.assertNotNull(schema10);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "map" + "'", str14, "map");
    }

    @Test
    public void test0777() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SchemaM3Random300Test1.test0777");
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
        java.lang.String str13 = schema8.toString();
        java.lang.Class<?> wildcardClass14 = schema8.getClass();
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
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "[]" + "'", str13, "[]");
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test0778() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SchemaM3Random300Test1.test0778");
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
        java.lang.String str29 = schema25.getProp("[ ]");
        java.lang.String str30 = schema25.getFullName();
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
        org.junit.Assert.assertNull(str29);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "union" + "'", str30, "union");
    }

    @Test
    public void test0779() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SchemaM3Random300Test1.test0779");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.avro.Schema schema4 = org.apache.avro.Schema.createFixed("{\"type\":\"map\",\"values\":{\"type\":\"array\",\"items\":{\"type\":\"map\",\"values\":[]}}}", "{\"type\":\"fixed\",\"name\":\"union\",\"namespace\":\"[]\",\"doc\":\"union type:UNION pos:-1\",\"size\":100}", "union", (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type org.apache.avro.SchemaParseException; message: Illegal initial character: {\"type\":\"map\",\"values\":{\"type\":\"array\",\"items\":{\"type\":\"map\",\"values\":[]}}}");
        } catch (org.apache.avro.SchemaParseException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0780() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SchemaM3Random300Test1.test0780");
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
        org.apache.avro.Schema schema15 = org.apache.avro.Schema.createArray(schema14);
        java.lang.String str16 = schema14.toString();
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
        org.junit.Assert.assertNotNull(schema15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "{\"type\":\"array\",\"items\":{\"type\":\"array\",\"items\":{\"type\":\"map\",\"values\":[]}}}" + "'", str16, "{\"type\":\"array\",\"items\":{\"type\":\"array\",\"items\":{\"type\":\"map\",\"values\":[]}}}");
    }

    @Test
    public void test0781() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SchemaM3Random300Test1.test0781");
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
        java.io.InputStream inputStream15 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.avro.Schema schema16 = parser7.parse(inputStream15);
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
        org.junit.Assert.assertNotNull(schema13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test0782() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SchemaM3Random300Test1.test0782");
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
            int int11 = schema10.getFixedSize();
            org.junit.Assert.fail("Expected exception of type org.apache.avro.AvroRuntimeException; message: Not fixed: {\"type\":\"array\",\"items\":[]}");
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
    public void test0783() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SchemaM3Random300Test1.test0783");
        org.apache.avro.Schema.Field[] fieldArray0 = new org.apache.avro.Schema.Field[] {};
        java.util.ArrayList<org.apache.avro.Schema.Field> fieldList1 = new java.util.ArrayList<org.apache.avro.Schema.Field>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<org.apache.avro.Schema.Field>) fieldList1, fieldArray0);
        org.apache.avro.Schema schema3 = org.apache.avro.Schema.createRecord((java.util.List<org.apache.avro.Schema.Field>) fieldList1);
        org.apache.avro.Schema.Field field5 = schema3.getField("");
        org.apache.avro.Schema schema6 = org.apache.avro.Schema.createMap(schema3);
        org.apache.avro.Schema.Type type7 = schema3.getType();
        java.util.Set<java.lang.String> strSet8 = schema3.getAliases();
        org.junit.Assert.assertNotNull(fieldArray0);
        org.junit.Assert.assertArrayEquals(fieldArray0, new org.apache.avro.Schema.Field[] {});
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(schema3);
        org.junit.Assert.assertNull(field5);
        org.junit.Assert.assertNotNull(schema6);
        org.junit.Assert.assertTrue("'" + type7 + "' != '" + org.apache.avro.Schema.Type.RECORD + "'", type7.equals(org.apache.avro.Schema.Type.RECORD));
        org.junit.Assert.assertNotNull(strSet8);
    }

    @Test
    public void test0784() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SchemaM3Random300Test1.test0784");
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
        // The following exception was thrown during execution in test generation
        try {
            org.apache.avro.Schema schema28 = parser26.parse("map");
            org.junit.Assert.fail("Expected exception of type org.apache.avro.SchemaParseException; message: org.codehaus.jackson.JsonParseException: Unexpected character ('m' (code 109)): expected a valid value (number, String, array, object, 'true', 'false' or 'null')? at [Source: java.io.StringReader@29ed6b15; line: 1, column: 2]");
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
        org.junit.Assert.assertNotNull(parser18);
        org.junit.Assert.assertNotNull(strMap20);
        org.junit.Assert.assertNotNull(parser23);
        org.junit.Assert.assertNotNull(strMap24);
        org.junit.Assert.assertNotNull(parser25);
        org.junit.Assert.assertNotNull(parser26);
    }

    @Test
    public void test0785() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SchemaM3Random300Test1.test0785");
        org.apache.avro.Schema.Field[] fieldArray0 = new org.apache.avro.Schema.Field[] {};
        java.util.ArrayList<org.apache.avro.Schema.Field> fieldList1 = new java.util.ArrayList<org.apache.avro.Schema.Field>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<org.apache.avro.Schema.Field>) fieldList1, fieldArray0);
        org.apache.avro.Schema schema3 = org.apache.avro.Schema.createRecord((java.util.List<org.apache.avro.Schema.Field>) fieldList1);
        org.apache.avro.Schema.Field field5 = schema3.getField("");
        org.apache.avro.Schema schema6 = org.apache.avro.Schema.createMap(schema3);
        org.apache.avro.Schema.Type type7 = schema3.getType();
        org.apache.avro.Schema.Field[] fieldArray8 = new org.apache.avro.Schema.Field[] {};
        java.util.ArrayList<org.apache.avro.Schema.Field> fieldList9 = new java.util.ArrayList<org.apache.avro.Schema.Field>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<org.apache.avro.Schema.Field>) fieldList9, fieldArray8);
        org.apache.avro.Schema schema11 = org.apache.avro.Schema.createRecord((java.util.List<org.apache.avro.Schema.Field>) fieldList9);
        java.util.List<org.apache.avro.Schema.Field> fieldList12 = schema11.getFields();
        org.apache.avro.Schema schema13 = org.apache.avro.Schema.createRecord(fieldList12);
        // The following exception was thrown during execution in test generation
        try {
            schema3.setFields(fieldList12);
            org.junit.Assert.fail("Expected exception of type org.apache.avro.AvroRuntimeException; message: Fields are already set");
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
        org.junit.Assert.assertNotNull(fieldArray8);
        org.junit.Assert.assertArrayEquals(fieldArray8, new org.apache.avro.Schema.Field[] {});
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(schema11);
        org.junit.Assert.assertNotNull(fieldList12);
        org.junit.Assert.assertNotNull(schema13);
    }

    @Test
    public void test0786() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SchemaM3Random300Test1.test0786");
        org.apache.avro.Schema schema2 = org.apache.avro.Schema.parse("\"null\"", true);
        org.apache.avro.Schema.Names names4 = new org.apache.avro.Schema.Names("union");
        java.lang.String str5 = names4.space();
        boolean boolean6 = names4.isEmpty();
        org.codehaus.jackson.JsonGenerator jsonGenerator7 = null;
        // The following exception was thrown during execution in test generation
        try {
            schema2.fieldsToJson(names4, jsonGenerator7);
            org.junit.Assert.fail("Expected exception of type org.apache.avro.AvroRuntimeException; message: Not a record: \"null\"");
        } catch (org.apache.avro.AvroRuntimeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(schema2);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "union" + "'", str5, "union");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test0787() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SchemaM3Random300Test1.test0787");
        org.apache.avro.Schema.LockableArrayList<java.util.List<java.lang.String>> strListList0 = new org.apache.avro.Schema.LockableArrayList<java.util.List<java.lang.String>>();
    }

    @Test
    public void test0788() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SchemaM3Random300Test1.test0788");
        org.apache.avro.Schema.Names names1 = new org.apache.avro.Schema.Names("[].union");
        names1.clear();
    }

    @Test
    public void test0789() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SchemaM3Random300Test1.test0789");
        org.apache.avro.Schema.LockableArrayList<java.lang.String> strList4 = new org.apache.avro.Schema.LockableArrayList<java.lang.String>(100);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.avro.Schema schema5 = org.apache.avro.Schema.createEnum("{\r\n  \"type\" : \"fixed\",\r\n  \"name\" : \"union\",\r\n  \"namespace\" : \"[]\",\r\n  \"doc\" : \"[ ]\",\r\n  \"size\" : 0\r\n}", "{\"type\":\"array\",\"items\":[]}", "{null={\"type\":\"fixed\",\"name\":\"union\",\"namespace\":\"[]\",\"doc\":\"[ ]\",\"size\":0}}", (java.util.List<java.lang.String>) strList4);
            org.junit.Assert.fail("Expected exception of type org.apache.avro.SchemaParseException; message: Illegal initial character: {??  \"type\" : \"fixed\",??  \"name\" : \"union\",??  \"namespace\" : \"[]\",??  \"doc\" : \"[ ]\",??  \"size\" : 0??}");
        } catch (org.apache.avro.SchemaParseException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0790() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SchemaM3Random300Test1.test0790");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.avro.Schema schema4 = org.apache.avro.Schema.createRecord("{\r\n  \"type\" : \"fixed\",\r\n  \"name\" : \"union\",\r\n  \"namespace\" : \"[]\",\r\n  \"doc\" : \"[ ]\",\r\n  \"size\" : 0\r\n}", "{\"type\":\"record\",\"fields\":[]}", "{\"type\":\"map\",\"values\":{\"type\":\"array\",\"items\":{\"type\":\"map\",\"values\":[]}}}", true);
            org.junit.Assert.fail("Expected exception of type org.apache.avro.SchemaParseException; message: Illegal initial character: {??  \"type\" : \"fixed\",??  \"name\" : \"union\",??  \"namespace\" : \"[]\",??  \"doc\" : \"[ ]\",??  \"size\" : 0??}");
        } catch (org.apache.avro.SchemaParseException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0791() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SchemaM3Random300Test1.test0791");
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
        org.apache.avro.Schema schema17 = org.apache.avro.Schema.createArray(schema12);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.avro.Schema schema18 = schema17.getValueType();
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
        org.junit.Assert.assertNotNull(schemaList9);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNotNull(schema12);
        org.junit.Assert.assertNotNull(schema15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(schema17);
    }

    @Test
    public void test0792() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SchemaM3Random300Test1.test0792");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.avro.Schema schema1 = org.apache.avro.Schema.parse("{\"type\":\"record\",\"fields\":[],\"{\\r\\n  \\\"type\\\" : \\\"fixed\\\",\\r\\n  \\\"name\\\" : \\\"union\\\",\\r\\n  \\\"namespace\\\" : \\\"[]\\\",\\r\\n  \\\"doc\\\" : \\\"[ ]\\\",\\r\\n  \\\"size\\\" : 0\\r\\n}\":\"[ ]\"}");
            org.junit.Assert.fail("Expected exception of type org.apache.avro.SchemaParseException; message: No name in schema: {\"type\":\"record\",\"fields\":[],\"{\\r\\n  \\\"type\\\" : \\\"fixed\\\",\\r\\n  \\\"name\\\" : \\\"union\\\",\\r\\n  \\\"namespace\\\" : \\\"[]\\\",\\r\\n  \\\"doc\\\" : \\\"[ ]\\\",\\r\\n  \\\"size\\\" : 0\\r\\n}\":\"[ ]\"}");
        } catch (org.apache.avro.SchemaParseException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0793() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SchemaM3Random300Test1.test0793");
        org.apache.avro.Schema.LockableArrayList<java.lang.String> strList4 = new org.apache.avro.Schema.LockableArrayList<java.lang.String>((int) (byte) 0);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.avro.Schema schema5 = org.apache.avro.Schema.createEnum("{\"type\":\"record\",\"fields\":[]}", "{\"type\":\"array\",\"items\":\"int\"}", "", (java.util.List<java.lang.String>) strList4);
            org.junit.Assert.fail("Expected exception of type org.apache.avro.SchemaParseException; message: Illegal initial character: {\"type\":\"record\",\"fields\":[]}");
        } catch (org.apache.avro.SchemaParseException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0794() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SchemaM3Random300Test1.test0794");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.avro.Schema schema4 = org.apache.avro.Schema.createRecord("{\"type\":\"array\",\"items\":\"null\"}", "{null={\"type\":\"record\",\"fields\":[]}}", "\"double\"", true);
            org.junit.Assert.fail("Expected exception of type org.apache.avro.SchemaParseException; message: Illegal initial character: {\"type\":\"array\",\"items\":\"null\"}");
        } catch (org.apache.avro.SchemaParseException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0795() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SchemaM3Random300Test1.test0795");
        org.apache.avro.Schema.Field[] fieldArray0 = new org.apache.avro.Schema.Field[] {};
        java.util.ArrayList<org.apache.avro.Schema.Field> fieldList1 = new java.util.ArrayList<org.apache.avro.Schema.Field>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<org.apache.avro.Schema.Field>) fieldList1, fieldArray0);
        org.apache.avro.Schema schema3 = org.apache.avro.Schema.createRecord((java.util.List<org.apache.avro.Schema.Field>) fieldList1);
        org.apache.avro.Schema.Field field5 = schema3.getField("");
        org.apache.avro.Schema schema6 = org.apache.avro.Schema.createMap(schema3);
        org.apache.avro.Schema.Type type7 = schema3.getType();
        java.lang.String str9 = schema3.toString(false);
        java.lang.String str10 = schema3.getNamespace();
        org.junit.Assert.assertNotNull(fieldArray0);
        org.junit.Assert.assertArrayEquals(fieldArray0, new org.apache.avro.Schema.Field[] {});
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(schema3);
        org.junit.Assert.assertNull(field5);
        org.junit.Assert.assertNotNull(schema6);
        org.junit.Assert.assertTrue("'" + type7 + "' != '" + org.apache.avro.Schema.Type.RECORD + "'", type7.equals(org.apache.avro.Schema.Type.RECORD));
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "{\"type\":\"record\",\"fields\":[]}" + "'", str9, "{\"type\":\"record\",\"fields\":[]}");
        org.junit.Assert.assertNull(str10);
    }

    @Test
    public void test0796() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SchemaM3Random300Test1.test0796");
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
        java.io.File file26 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.avro.Schema schema27 = parser6.parse(file26);
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
    }

    @Test
    public void test0797() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SchemaM3Random300Test1.test0797");
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
            org.apache.avro.Schema.Field field25 = schema8.getField("[].union");
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
        org.junit.Assert.assertTrue("'" + type23 + "' != '" + org.apache.avro.Schema.Type.UNION + "'", type23.equals(org.apache.avro.Schema.Type.UNION));
    }

    @Test
    public void test0798() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SchemaM3Random300Test1.test0798");
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
        java.lang.String str12 = schema11.getFullName();
        java.lang.String str13 = schema11.getFullName();
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
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "union" + "'", str12, "union");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "union" + "'", str13, "union");
    }

    @Test
    public void test0799() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SchemaM3Random300Test1.test0799");
        org.apache.avro.Schema.LockableArrayList<org.apache.avro.Schema> schemaList1 = new org.apache.avro.Schema.LockableArrayList<org.apache.avro.Schema>(1);
        org.apache.avro.Schema schema2 = org.apache.avro.Schema.createUnion((java.util.List<org.apache.avro.Schema>) schemaList1);
        org.apache.avro.Schema schema3 = org.apache.avro.Schema.createUnion((java.util.List<org.apache.avro.Schema>) schemaList1);
        org.apache.avro.Schema schema4 = org.apache.avro.Schema.createUnion((java.util.List<org.apache.avro.Schema>) schemaList1);
        java.lang.String str5 = schema4.toString();
        org.junit.Assert.assertNotNull(schema2);
        org.junit.Assert.assertNotNull(schema3);
        org.junit.Assert.assertNotNull(schema4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "[]" + "'", str5, "[]");
    }

    @Test
    public void test0800() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SchemaM3Random300Test1.test0800");
        org.apache.avro.Schema.Parser parser0 = new org.apache.avro.Schema.Parser();
        java.util.Map<java.lang.String, org.apache.avro.Schema> strMap1 = parser0.getTypes();
        java.util.Map<java.lang.String, org.apache.avro.Schema> strMap2 = parser0.getTypes();
        org.apache.avro.Schema.Parser parser3 = new org.apache.avro.Schema.Parser();
        org.apache.avro.Schema.Parser parser5 = parser3.setValidate(true);
        java.util.Map<java.lang.String, org.apache.avro.Schema> strMap6 = parser3.getTypes();
        org.apache.avro.Schema.Parser parser7 = parser0.addTypes(strMap6);
        org.apache.avro.Schema schema9 = parser7.parse("{\"type\":\"map\",\"values\":[]}");
        org.apache.avro.Schema.Parser parser11 = parser7.setValidate(false);
        java.io.File file12 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.avro.Schema schema13 = parser11.parse(file12);
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
    }

    @Test
    public void test0801() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SchemaM3Random300Test1.test0801");
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
        java.lang.String str17 = schema15.getFullName();
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
    public void test0802() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SchemaM3Random300Test1.test0802");
        org.apache.avro.Schema.Parser parser0 = new org.apache.avro.Schema.Parser();
        org.apache.avro.Schema.Parser parser2 = parser0.setValidate(true);
        org.apache.avro.Schema.Parser parser4 = parser0.setValidate(true);
        java.util.Map<java.lang.String, org.apache.avro.Schema> strMap5 = parser4.getTypes();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.avro.Schema schema7 = parser4.parse("{null={\"type\":\"record\",\"fields\":[]}}");
            org.junit.Assert.fail("Expected exception of type org.apache.avro.SchemaParseException; message: org.codehaus.jackson.JsonParseException: Unexpected character ('n' (code 110)): was expecting double-quote to start field name? at [Source: java.io.StringReader@52c6db69; line: 1, column: 3]");
        } catch (org.apache.avro.SchemaParseException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(parser2);
        org.junit.Assert.assertNotNull(parser4);
        org.junit.Assert.assertNotNull(strMap5);
    }

    @Test
    public void test0803() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SchemaM3Random300Test1.test0803");
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
        org.apache.avro.Schema.Type type25 = schema24.getType();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.avro.Schema schema26 = org.apache.avro.Schema.create(type25);
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
        org.junit.Assert.assertTrue("'" + type25 + "' != '" + org.apache.avro.Schema.Type.ARRAY + "'", type25.equals(org.apache.avro.Schema.Type.ARRAY));
    }

    @Test
    public void test0804() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SchemaM3Random300Test1.test0804");
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
            boolean boolean13 = schema8.isError();
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
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "[ ]" + "'", str12, "[ ]");
    }

    @Test
    public void test0805() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SchemaM3Random300Test1.test0805");
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
        org.apache.avro.Schema.Type type21 = schema17.getType();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.avro.Schema schema22 = org.apache.avro.Schema.create(type21);
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
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "[]" + "'", str20, "[]");
        org.junit.Assert.assertTrue("'" + type21 + "' != '" + org.apache.avro.Schema.Type.UNION + "'", type21.equals(org.apache.avro.Schema.Type.UNION));
    }

    @Test
    public void test0806() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SchemaM3Random300Test1.test0806");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.avro.Schema schema4 = org.apache.avro.Schema.createFixed("map", "{\"type\":\"map\",\"values\":{\"type\":\"array\",\"items\":{\"type\":\"map\",\"values\":[]}}}", "{\"type\":\"map\",\"values\":{\"type\":\"array\",\"items\":{\"type\":\"map\",\"values\":[]}}}", (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid fixed size: -1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0807() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SchemaM3Random300Test1.test0807");
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
        java.lang.String str22 = schema17.getDoc();
        java.lang.String str23 = schema17.getName();
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
        org.junit.Assert.assertNull(str22);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "union" + "'", str23, "union");
    }

    @Test
    public void test0808() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SchemaM3Random300Test1.test0808");
        org.apache.avro.Schema schema4 = org.apache.avro.Schema.createRecord("double", "", "{\"type\":\"record\",\"fields\":[]}", false);
        org.junit.Assert.assertNotNull(schema4);
    }

    @Test
    public void test0809() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SchemaM3Random300Test1.test0809");
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
        java.lang.String str15 = schema11.getFullName();
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
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "array" + "'", str15, "array");
    }

    @Test
    public void test0810() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SchemaM3Random300Test1.test0810");
        org.apache.avro.Schema.Field[] fieldArray0 = new org.apache.avro.Schema.Field[] {};
        java.util.ArrayList<org.apache.avro.Schema.Field> fieldList1 = new java.util.ArrayList<org.apache.avro.Schema.Field>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<org.apache.avro.Schema.Field>) fieldList1, fieldArray0);
        org.apache.avro.Schema schema3 = org.apache.avro.Schema.createRecord((java.util.List<org.apache.avro.Schema.Field>) fieldList1);
        org.apache.avro.Schema schema4 = org.apache.avro.Schema.createRecord((java.util.List<org.apache.avro.Schema.Field>) fieldList1);
        org.apache.avro.Schema schema5 = org.apache.avro.Schema.createRecord((java.util.List<org.apache.avro.Schema.Field>) fieldList1);
        org.apache.avro.Schema schema6 = org.apache.avro.Schema.createRecord((java.util.List<org.apache.avro.Schema.Field>) fieldList1);
        org.apache.avro.Schema.Field field8 = schema6.getField("map");
        java.lang.String str10 = schema6.toString(true);
        java.lang.String str11 = schema6.getName();
        // The following exception was thrown during execution in test generation
        try {
            schema6.addAlias("{\"type\":\"fixed\",\"name\":\"union\",\"namespace\":\"[]\",\"doc\":\"[ ]\",\"size\":0,\"aliases\":[\"union\"]}");
            org.junit.Assert.fail("Expected exception of type org.apache.avro.SchemaParseException; message: Illegal initial character: {\"type\":\"fixed\",\"name\":\"union\",\"namespace\":\"[]\",\"doc\":\"[ ]\",\"size\":0,\"aliases\":[\"union\"]}");
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
        org.junit.Assert.assertNull(field8);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "{\r\n  \"type\" : \"record\",\r\n  \"fields\" : [ ]\r\n}" + "'", str10, "{\r\n  \"type\" : \"record\",\r\n  \"fields\" : [ ]\r\n}");
        org.junit.Assert.assertNull(str11);
    }

    @Test
    public void test0811() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SchemaM3Random300Test1.test0811");
        org.codehaus.jackson.JsonNode jsonNode1 = org.apache.avro.Schema.parseJson("{\"type\":\"array\",\"items\":[]}");
        org.junit.Assert.assertNotNull(jsonNode1);
    }

    @Test
    public void test0812() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SchemaM3Random300Test1.test0812");
        org.apache.avro.Schema.Type type0 = org.apache.avro.Schema.Type.NULL;
        org.apache.avro.Schema schema1 = org.apache.avro.Schema.create(type0);
        org.apache.avro.Schema schema2 = org.apache.avro.Schema.create(type0);
        org.apache.avro.Schema schema3 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.avro.Schema schema4 = org.apache.avro.Schema.applyAliases(schema2, schema3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + type0 + "' != '" + org.apache.avro.Schema.Type.NULL + "'", type0.equals(org.apache.avro.Schema.Type.NULL));
        org.junit.Assert.assertNotNull(schema1);
        org.junit.Assert.assertNotNull(schema2);
    }

    @Test
    public void test0813() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SchemaM3Random300Test1.test0813");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.avro.Schema schema4 = org.apache.avro.Schema.createFixed("\"null\"", "{\"type\":\"record\",\"fields\":[],\"{\\r\\n  \\\"type\\\" : \\\"fixed\\\",\\r\\n  \\\"name\\\" : \\\"union\\\",\\r\\n  \\\"namespace\\\" : \\\"[]\\\",\\r\\n  \\\"doc\\\" : \\\"[ ]\\\",\\r\\n  \\\"size\\\" : 0\\r\\n}\":\"[ ]\"}", "{\r\n  \"type\" : \"map\",\r\n  \"values\" : [ ]\r\n}", (int) '4');
            org.junit.Assert.fail("Expected exception of type org.apache.avro.SchemaParseException; message: Illegal initial character: \"null\"");
        } catch (org.apache.avro.SchemaParseException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0814() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SchemaM3Random300Test1.test0814");
        org.apache.avro.Schema.LockableArrayList<java.lang.Cloneable> cloneableList1 = new org.apache.avro.Schema.LockableArrayList<java.lang.Cloneable>((int) '4');
    }

    @Test
    public void test0815() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SchemaM3Random300Test1.test0815");
        org.apache.avro.Schema schema2 = org.apache.avro.Schema.parse("[]", true);
        org.apache.avro.Schema.Type type3 = schema2.getType();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean5 = schema2.hasEnumSymbol("{\r\n  \"type\" : \"map\",\r\n  \"values\" : [ ]\r\n}");
            org.junit.Assert.fail("Expected exception of type org.apache.avro.AvroRuntimeException; message: Not an enum: []");
        } catch (org.apache.avro.AvroRuntimeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(schema2);
        org.junit.Assert.assertTrue("'" + type3 + "' != '" + org.apache.avro.Schema.Type.UNION + "'", type3.equals(org.apache.avro.Schema.Type.UNION));
    }

    @Test
    public void test0816() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SchemaM3Random300Test1.test0816");
        org.apache.avro.Schema.Type type0 = org.apache.avro.Schema.Type.INT;
        org.apache.avro.Schema schema1 = org.apache.avro.Schema.create(type0);
        org.apache.avro.Schema schema2 = org.apache.avro.Schema.createArray(schema1);
        org.apache.avro.Schema schema3 = org.apache.avro.Schema.createMap(schema2);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.avro.Schema schema4 = schema2.getValueType();
            org.junit.Assert.fail("Expected exception of type org.apache.avro.AvroRuntimeException; message: Not a map: {\"type\":\"array\",\"items\":\"int\"}");
        } catch (org.apache.avro.AvroRuntimeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + type0 + "' != '" + org.apache.avro.Schema.Type.INT + "'", type0.equals(org.apache.avro.Schema.Type.INT));
        org.junit.Assert.assertNotNull(schema1);
        org.junit.Assert.assertNotNull(schema2);
        org.junit.Assert.assertNotNull(schema3);
    }

    @Test
    public void test0817() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SchemaM3Random300Test1.test0817");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.avro.Schema schema4 = org.apache.avro.Schema.createRecord("{\"type\":\"map\",\"values\":{\"type\":\"array\",\"items\":{\"type\":\"map\",\"values\":[]}}}", "{\"type\":\"array\",\"items\":{\"type\":\"map\",\"values\":[]}}", "{\"type\":\"record\",\"fields\":[]}", true);
            org.junit.Assert.fail("Expected exception of type org.apache.avro.SchemaParseException; message: Illegal initial character: {\"type\":\"map\",\"values\":{\"type\":\"array\",\"items\":{\"type\":\"map\",\"values\":[]}}}");
        } catch (org.apache.avro.SchemaParseException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0818() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SchemaM3Random300Test1.test0818");
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
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean15 = schema14.isError();
            org.junit.Assert.fail("Expected exception of type org.apache.avro.AvroRuntimeException; message: Not a record: []");
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
    }

    @Test
    public void test0819() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SchemaM3Random300Test1.test0819");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.avro.Schema schema4 = org.apache.avro.Schema.createRecord("union type:MAP pos:-1", "{null={\"type\":\"fixed\",\"name\":\"union\",\"namespace\":\"[]\",\"doc\":\"[ ]\",\"size\":0}}", "{null={\"type\":\"fixed\",\"name\":\"union\",\"namespace\":\"[]\",\"doc\":\"[ ]\",\"size\":0}}", false);
            org.junit.Assert.fail("Expected exception of type org.apache.avro.SchemaParseException; message: Illegal character in: union type:MAP pos:-1");
        } catch (org.apache.avro.SchemaParseException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0820() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SchemaM3Random300Test1.test0820");
        org.apache.avro.Schema.Parser parser0 = new org.apache.avro.Schema.Parser();
        org.apache.avro.Schema.Parser parser2 = parser0.setValidate(true);
        java.util.Map<java.lang.String, org.apache.avro.Schema> strMap3 = parser0.getTypes();
        org.apache.avro.Schema.Parser parser5 = parser0.setValidate(true);
        java.io.InputStream inputStream6 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.avro.Schema schema7 = parser5.parse(inputStream6);
            org.junit.Assert.fail("Expected exception of type java.io.EOFException; message: No content to map to Object due to end of input");
        } catch (java.io.EOFException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(parser2);
        org.junit.Assert.assertNotNull(strMap3);
        org.junit.Assert.assertNotNull(parser5);
    }

    @Test
    public void test0821() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SchemaM3Random300Test1.test0821");
        org.apache.avro.Schema schema4 = org.apache.avro.Schema.createFixed("[].union", "union type:UNION pos:-1", "[]", (int) (short) 100);
        java.lang.String str5 = schema4.toString();
        java.lang.String str6 = schema4.toString();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.avro.Schema schema7 = schema4.getElementType();
            org.junit.Assert.fail("Expected exception of type org.apache.avro.AvroRuntimeException; message: Not an array: {\"type\":\"fixed\",\"name\":\"union\",\"namespace\":\"[]\",\"doc\":\"union type:UNION pos:-1\",\"size\":100}");
        } catch (org.apache.avro.AvroRuntimeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(schema4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "{\"type\":\"fixed\",\"name\":\"union\",\"namespace\":\"[]\",\"doc\":\"union type:UNION pos:-1\",\"size\":100}" + "'", str5, "{\"type\":\"fixed\",\"name\":\"union\",\"namespace\":\"[]\",\"doc\":\"union type:UNION pos:-1\",\"size\":100}");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "{\"type\":\"fixed\",\"name\":\"union\",\"namespace\":\"[]\",\"doc\":\"union type:UNION pos:-1\",\"size\":100}" + "'", str6, "{\"type\":\"fixed\",\"name\":\"union\",\"namespace\":\"[]\",\"doc\":\"union type:UNION pos:-1\",\"size\":100}");
    }

    @Test
    public void test0822() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SchemaM3Random300Test1.test0822");
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
        org.apache.avro.Schema schema18 = org.apache.avro.Schema.createUnion(schemaList16);
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
        org.junit.Assert.assertNotNull(schema18);
    }

    @Test
    public void test0823() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SchemaM3Random300Test1.test0823");
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
        java.util.List<org.apache.avro.Schema> schemaList12 = schema4.getTypes();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.avro.Schema schema13 = schema4.getValueType();
            org.junit.Assert.fail("Expected exception of type org.apache.avro.AvroRuntimeException; message: Not a map: []");
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
        org.junit.Assert.assertNotNull(schemaList12);
    }

    @Test
    public void test0824() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SchemaM3Random300Test1.test0824");
        org.apache.avro.Schema schema4 = org.apache.avro.Schema.createFixed("union", "", "union type:UNION pos:-1", 10);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean5 = schema4.isError();
            org.junit.Assert.fail("Expected exception of type org.apache.avro.AvroRuntimeException; message: Not a record: {\"type\":\"fixed\",\"name\":\"union\",\"namespace\":\"union type:UNION pos:-1\",\"doc\":\"\",\"size\":10}");
        } catch (org.apache.avro.AvroRuntimeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(schema4);
    }

    @Test
    public void test0825() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SchemaM3Random300Test1.test0825");
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
            java.util.List<org.apache.avro.Schema> schemaList10 = schema9.getTypes();
            org.junit.Assert.fail("Expected exception of type org.apache.avro.AvroRuntimeException; message: Not a union: {\"type\":\"map\",\"values\":[]}");
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
    public void test0826() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SchemaM3Random300Test1.test0826");
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
        java.util.Map<java.lang.String, org.apache.avro.Schema> strMap14 = parser12.getTypes();
        org.junit.Assert.assertNotNull(strMap1);
        org.junit.Assert.assertNotNull(strMap2);
        org.junit.Assert.assertNotNull(strMap4);
        org.junit.Assert.assertNotNull(parser5);
        org.junit.Assert.assertNotNull(schema7);
        org.junit.Assert.assertNotNull(parser9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(parser12);
        org.junit.Assert.assertNotNull(strMap13);
        org.junit.Assert.assertNotNull(strMap14);
    }

    @Test
    public void test0827() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SchemaM3Random300Test1.test0827");
        org.apache.avro.Schema.Parser parser0 = new org.apache.avro.Schema.Parser();
        org.apache.avro.Schema.Parser parser2 = parser0.setValidate(true);
        org.apache.avro.Schema.Parser parser4 = parser0.setValidate(true);
        org.apache.avro.Schema.Parser parser6 = parser0.setValidate(true);
        java.io.File file7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.avro.Schema schema8 = parser0.parse(file7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(parser2);
        org.junit.Assert.assertNotNull(parser4);
        org.junit.Assert.assertNotNull(parser6);
    }

    @Test
    public void test0828() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SchemaM3Random300Test1.test0828");
        org.apache.avro.Schema.Parser parser0 = new org.apache.avro.Schema.Parser();
        java.util.Map<java.lang.String, org.apache.avro.Schema> strMap1 = parser0.getTypes();
        java.util.Map<java.lang.String, org.apache.avro.Schema> strMap2 = parser0.getTypes();
        org.apache.avro.Schema.Parser parser3 = new org.apache.avro.Schema.Parser();
        java.util.Map<java.lang.String, org.apache.avro.Schema> strMap4 = parser3.getTypes();
        org.apache.avro.Schema.Parser parser5 = parser0.addTypes(strMap4);
        org.apache.avro.Schema schema7 = parser0.parse("{\r\n  \"type\" : \"map\",\r\n  \"values\" : [ ]\r\n}");
        java.lang.String str9 = schema7.getProp("{\"type\":\"array\",\"items\":[]}");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean11 = schema7.hasEnumSymbol("{null={\"type\":\"record\",\"fields\":[]}}");
            org.junit.Assert.fail("Expected exception of type org.apache.avro.AvroRuntimeException; message: Not an enum: {\"type\":\"map\",\"values\":[]}");
        } catch (org.apache.avro.AvroRuntimeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strMap1);
        org.junit.Assert.assertNotNull(strMap2);
        org.junit.Assert.assertNotNull(strMap4);
        org.junit.Assert.assertNotNull(parser5);
        org.junit.Assert.assertNotNull(schema7);
        org.junit.Assert.assertNull(str9);
    }

    @Test
    public void test0829() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SchemaM3Random300Test1.test0829");
        org.apache.avro.Schema schema2 = org.apache.avro.Schema.parse("[]", true);
        org.apache.avro.Schema.Type type3 = schema2.getType();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.avro.Schema.Field field5 = schema2.getField("[]");
            org.junit.Assert.fail("Expected exception of type org.apache.avro.AvroRuntimeException; message: Not a record: []");
        } catch (org.apache.avro.AvroRuntimeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(schema2);
        org.junit.Assert.assertTrue("'" + type3 + "' != '" + org.apache.avro.Schema.Type.UNION + "'", type3.equals(org.apache.avro.Schema.Type.UNION));
    }

    @Test
    public void test0830() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SchemaM3Random300Test1.test0830");
        org.codehaus.jackson.JsonNode jsonNode1 = org.apache.avro.Schema.parseJson("{\r\n  \"type\" : \"array\",\r\n  \"items\" : [ ],\r\n  \"{}\" : \"hi!\"\r\n}");
        org.junit.Assert.assertNotNull(jsonNode1);
    }

    @Test
    public void test0831() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SchemaM3Random300Test1.test0831");
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
        java.lang.String str28 = schema21.getName();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Set<java.lang.String> strSet29 = schema21.getAliases();
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
        org.junit.Assert.assertNull(str23);
        org.junit.Assert.assertNull(str25);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "{\"type\":\"array\",\"items\":{\"type\":\"map\",\"values\":[]}}" + "'", str27, "{\"type\":\"array\",\"items\":{\"type\":\"map\",\"values\":[]}}");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "array" + "'", str28, "array");
    }

    @Test
    public void test0832() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SchemaM3Random300Test1.test0832");
        org.apache.avro.Schema.LockableArrayList<java.lang.CharSequence> charSequenceList0 = new org.apache.avro.Schema.LockableArrayList<java.lang.CharSequence>();
    }

    @Test
    public void test0833() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SchemaM3Random300Test1.test0833");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.avro.Schema schema4 = org.apache.avro.Schema.createRecord("{\"type\":\"map\",\"values\":{\"type\":\"array\",\"items\":{\"type\":\"map\",\"values\":[]}}}", "{\"type\":\"map\",\"values\":[]}", "union", true);
            org.junit.Assert.fail("Expected exception of type org.apache.avro.SchemaParseException; message: Illegal initial character: {\"type\":\"map\",\"values\":{\"type\":\"array\",\"items\":{\"type\":\"map\",\"values\":[]}}}");
        } catch (org.apache.avro.SchemaParseException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0834() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SchemaM3Random300Test1.test0834");
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
        java.lang.String str12 = schema11.getFullName();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean14 = schema11.hasEnumSymbol("{}");
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
        org.junit.Assert.assertNotNull(schema11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "union" + "'", str12, "union");
    }

    @Test
    public void test0835() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SchemaM3Random300Test1.test0835");
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
        java.lang.String str13 = schema11.getFullName();
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
    public void test0836() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SchemaM3Random300Test1.test0836");
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
            org.apache.avro.Schema.Field field10 = schema8.getField("{\"type\":\"map\",\"values\":{\"type\":\"enum\",\"name\":\"union\",\"namespace\":\"[]\",\"doc\":\"{}\",\"symbols\":[]}}");
            org.junit.Assert.fail("Expected exception of type org.apache.avro.AvroRuntimeException; message: Not a record: []");
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
    public void test0837() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SchemaM3Random300Test1.test0837");
        org.codehaus.jackson.JsonNode jsonNode1 = org.apache.avro.Schema.parseJson("{\"type\":\"map\",\"values\":{\"type\":\"enum\",\"name\":\"union\",\"namespace\":\"[]\",\"doc\":\"{}\",\"symbols\":[]}}");
        org.junit.Assert.assertNotNull(jsonNode1);
    }

    @Test
    public void test0838() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SchemaM3Random300Test1.test0838");
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
        org.apache.avro.Schema.Type type21 = schema8.getType();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.avro.Schema schema22 = schema8.getElementType();
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
        org.junit.Assert.assertTrue("'" + type21 + "' != '" + org.apache.avro.Schema.Type.UNION + "'", type21.equals(org.apache.avro.Schema.Type.UNION));
    }

    @Test
    public void test0839() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SchemaM3Random300Test1.test0839");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.avro.Schema schema4 = org.apache.avro.Schema.createFixed("{\"type\":\"array\",\"items\":\"int\"}", "{\"type\":\"map\",\"values\":[]}", "union type:MAP pos:-1", (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type org.apache.avro.SchemaParseException; message: Illegal initial character: {\"type\":\"array\",\"items\":\"int\"}");
        } catch (org.apache.avro.SchemaParseException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0840() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SchemaM3Random300Test1.test0840");
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
            org.apache.avro.Schema schema30 = schema29.getElementType();
            org.junit.Assert.fail("Expected exception of type org.apache.avro.AvroRuntimeException; message: Not an array: {\"type\":\"enum\",\"name\":\"union\",\"namespace\":\"double\",\"doc\":\"union\",\"symbols\":[]}");
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
    public void test0841() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SchemaM3Random300Test1.test0841");
        org.codehaus.jackson.JsonNode jsonNode1 = org.apache.avro.Schema.parseJson("{\"type\":\"fixed\",\"name\":\"union\",\"namespace\":\"[]\",\"doc\":\"[ ]\",\"size\":0}");
        org.junit.Assert.assertNotNull(jsonNode1);
    }

    @Test
    public void test0842() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SchemaM3Random300Test1.test0842");
        org.apache.avro.Schema.Parser parser0 = new org.apache.avro.Schema.Parser();
        java.util.Map<java.lang.String, org.apache.avro.Schema> strMap1 = parser0.getTypes();
        java.util.Map<java.lang.String, org.apache.avro.Schema> strMap2 = parser0.getTypes();
        boolean boolean3 = parser0.getValidate();
        org.apache.avro.Schema.Parser parser5 = parser0.setValidate(true);
        boolean boolean6 = parser0.getValidate();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.avro.Schema schema8 = parser0.parse("{null={\"type\":\"map\",\"values\":[]}}");
            org.junit.Assert.fail("Expected exception of type org.apache.avro.SchemaParseException; message: org.codehaus.jackson.JsonParseException: Unexpected character ('n' (code 110)): was expecting double-quote to start field name? at [Source: java.io.StringReader@12e5180; line: 1, column: 3]");
        } catch (org.apache.avro.SchemaParseException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strMap1);
        org.junit.Assert.assertNotNull(strMap2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(parser5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test0843() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SchemaM3Random300Test1.test0843");
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
            boolean boolean12 = schema3.isError();
            org.junit.Assert.fail("Expected exception of type org.apache.avro.AvroRuntimeException; message: Not a record: []");
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
    public void test0844() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SchemaM3Random300Test1.test0844");
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
        java.lang.String str26 = schema21.getName();
        java.lang.String str27 = schema21.getDoc();
        org.apache.avro.Schema.LockableArrayList<java.lang.String> strList32 = new org.apache.avro.Schema.LockableArrayList<java.lang.String>((int) (byte) 10);
        org.apache.avro.Schema schema33 = org.apache.avro.Schema.createEnum("[].union", "union type:UNION pos:-1", "union type:UNION pos:-1", (java.util.List<java.lang.String>) strList32);
        java.util.List<java.lang.String> strList34 = schema33.getEnumSymbols();
        boolean boolean35 = schema21.equals((java.lang.Object) strList34);
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
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "array" + "'", str26, "array");
        org.junit.Assert.assertNull(str27);
        org.junit.Assert.assertNotNull(schema33);
        org.junit.Assert.assertNotNull(strList34);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
    }

    @Test
    public void test0845() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SchemaM3Random300Test1.test0845");
        org.apache.avro.Schema.Names names1 = new org.apache.avro.Schema.Names("{\"type\":\"fixed\",\"name\":\"union\",\"namespace\":\"[]\",\"doc\":\"[ ]\",\"size\":0}");
    }

    @Test
    public void test0846() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SchemaM3Random300Test1.test0846");
        org.apache.avro.Schema.LockableArrayList<java.lang.String> strList7 = new org.apache.avro.Schema.LockableArrayList<java.lang.String>((int) '#');
        org.apache.avro.Schema.LockableArrayList<java.lang.String> strList8 = new org.apache.avro.Schema.LockableArrayList<java.lang.String>((java.util.List<java.lang.String>) strList7);
        org.apache.avro.Schema schema9 = org.apache.avro.Schema.createEnum("[].union", "union type:MAP pos:-1", "union type:UNION pos:-1", (java.util.List<java.lang.String>) strList8);
        org.apache.avro.Schema.LockableArrayList<java.lang.String> strList10 = new org.apache.avro.Schema.LockableArrayList<java.lang.String>((java.util.List<java.lang.String>) strList8);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.avro.Schema schema11 = org.apache.avro.Schema.createEnum("union type:MAP pos:-1", "{null={\"type\":\"map\",\"values\":[]}}", "{\"type\":\"fixed\",\"name\":\"union\",\"namespace\":\"[]\",\"doc\":\"{\\r\\n  \\\"type\\\" : \\\"map\\\",\\r\\n  \\\"values\\\" : [ ]\\r\\n}\",\"size\":10}", (java.util.List<java.lang.String>) strList10);
            org.junit.Assert.fail("Expected exception of type org.apache.avro.SchemaParseException; message: Illegal character in: union type:MAP pos:-1");
        } catch (org.apache.avro.SchemaParseException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(schema9);
    }

    @Test
    public void test0847() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SchemaM3Random300Test1.test0847");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.avro.Schema schema4 = org.apache.avro.Schema.createFixed("", "map", "{null={\"type\":\"fixed\",\"name\":\"union\",\"namespace\":\"[]\",\"doc\":\"[ ]\",\"size\":0}}", 100);
            org.junit.Assert.fail("Expected exception of type org.apache.avro.SchemaParseException; message: Empty name");
        } catch (org.apache.avro.SchemaParseException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0848() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SchemaM3Random300Test1.test0848");
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
        org.apache.avro.Schema.Type type29 = schema27.getType();
        org.apache.avro.Schema schema30 = org.apache.avro.Schema.createMap(schema27);
        org.apache.avro.Schema schema31 = org.apache.avro.Schema.createArray(schema30);
        org.apache.avro.Schema schema32 = org.apache.avro.Schema.applyAliases(schema19, schema31);
        java.lang.Class<?> wildcardClass33 = schema31.getClass();
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
        org.junit.Assert.assertTrue("'" + type29 + "' != '" + org.apache.avro.Schema.Type.UNION + "'", type29.equals(org.apache.avro.Schema.Type.UNION));
        org.junit.Assert.assertNotNull(schema30);
        org.junit.Assert.assertNotNull(schema31);
        org.junit.Assert.assertNotNull(schema32);
        org.junit.Assert.assertNotNull(wildcardClass33);
    }

    @Test
    public void test0849() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SchemaM3Random300Test1.test0849");
        org.apache.avro.Schema.Parser parser0 = new org.apache.avro.Schema.Parser();
        java.util.Map<java.lang.String, org.apache.avro.Schema> strMap1 = parser0.getTypes();
        org.apache.avro.Schema.Parser parser3 = parser0.setValidate(false);
        boolean boolean4 = parser3.getValidate();
        java.util.Map<java.lang.String, org.apache.avro.Schema> strMap5 = parser3.getTypes();
        org.apache.avro.Schema schema7 = parser3.parse("\"double\"");
        java.io.File file8 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.avro.Schema schema9 = parser3.parse(file8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strMap1);
        org.junit.Assert.assertNotNull(parser3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(strMap5);
        org.junit.Assert.assertNotNull(schema7);
    }

    @Test
    public void test0850() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SchemaM3Random300Test1.test0850");
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
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean43 = schema28.hasEnumSymbol("{\r\n  \"type\" : \"array\",\r\n  \"items\" : [ ],\r\n  \"{}\" : \"hi!\"\r\n}");
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
        org.junit.Assert.assertNotNull(schemaList41);
    }

    @Test
    public void test0851() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SchemaM3Random300Test1.test0851");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.avro.Schema schema4 = org.apache.avro.Schema.createFixed("{\"type\":\"map\",\"values\":{\"type\":\"array\",\"items\":{\"type\":\"map\",\"values\":[]},\"\":\"{\\r\\n  \\\"type\\\" : \\\"record\\\",\\r\\n  \\\"fields\\\" : [ ]\\r\\n}\"}}", "map", "{}", (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type org.apache.avro.SchemaParseException; message: Illegal initial character: {\"type\":\"map\",\"values\":{\"type\":\"array\",\"items\":{\"type\":\"map\",\"values\":[]},\"\":\"{\\r\\n  \\\"type\\\" : \\\"record\\\",\\r\\n  \\\"fields\\\" : [ ]\\r\\n}\"}}");
        } catch (org.apache.avro.SchemaParseException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0852() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SchemaM3Random300Test1.test0852");
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
            org.apache.avro.Schema.Field field20 = schema4.getField("{\"type\":\"array\",\"items\":[]}");
            org.junit.Assert.fail("Expected exception of type org.apache.avro.AvroRuntimeException; message: Not a record: {\"type\":\"fixed\",\"name\":\"union\",\"namespace\":\"{}\",\"doc\":\"hi!\",\"size\":1}");
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
    public void test0853() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SchemaM3Random300Test1.test0853");
        org.codehaus.jackson.JsonNode jsonNode1 = org.apache.avro.Schema.parseJson("{\"type\":\"array\",\"items\":\"int\"}");
        org.apache.avro.Schema.Names names3 = new org.apache.avro.Schema.Names("{}");
        boolean boolean4 = names3.isEmpty();
        java.lang.Object obj5 = names3.clone();
        org.apache.avro.Schema schema6 = org.apache.avro.Schema.parse(jsonNode1, names3);
        java.lang.String str7 = schema6.getDoc();
        org.junit.Assert.assertNotNull(jsonNode1);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(obj5);
        org.junit.Assert.assertEquals(obj5.toString(), "{}");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj5), "{}");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj5), "{}");
        org.junit.Assert.assertNotNull(schema6);
        org.junit.Assert.assertNull(str7);
    }

    @Test
    public void test0854() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SchemaM3Random300Test1.test0854");
        org.apache.avro.Schema.Parser parser0 = new org.apache.avro.Schema.Parser();
        org.apache.avro.Schema.Parser parser2 = parser0.setValidate(true);
        java.util.Map<java.lang.String, org.apache.avro.Schema> strMap3 = parser0.getTypes();
        org.apache.avro.Schema.Parser parser5 = parser0.setValidate(true);
        org.apache.avro.Schema.Parser parser7 = parser5.setValidate(true);
        java.io.InputStream inputStream8 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.avro.Schema schema9 = parser7.parse(inputStream8);
            org.junit.Assert.fail("Expected exception of type java.io.EOFException; message: No content to map to Object due to end of input");
        } catch (java.io.EOFException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(parser2);
        org.junit.Assert.assertNotNull(strMap3);
        org.junit.Assert.assertNotNull(parser5);
        org.junit.Assert.assertNotNull(parser7);
    }

    @Test
    public void test0855() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SchemaM3Random300Test1.test0855");
        org.apache.avro.Schema.LockableArrayList<java.lang.String> strList4 = new org.apache.avro.Schema.LockableArrayList<java.lang.String>((int) ' ');
        // The following exception was thrown during execution in test generation
        try {
            org.apache.avro.Schema schema5 = org.apache.avro.Schema.createEnum("{\"type\":\"array\",\"items\":{\"type\":\"array\",\"items\":{\"type\":\"map\",\"values\":[]}}}", "\"null\"", "{\"type\":\"array\",\"items\":{\"type\":\"map\",\"values\":[]}}", (java.util.List<java.lang.String>) strList4);
            org.junit.Assert.fail("Expected exception of type org.apache.avro.SchemaParseException; message: Illegal initial character: {\"type\":\"array\",\"items\":{\"type\":\"array\",\"items\":{\"type\":\"map\",\"values\":[]}}}");
        } catch (org.apache.avro.SchemaParseException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0856() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SchemaM3Random300Test1.test0856");
        org.apache.avro.Schema.Field[] fieldArray0 = new org.apache.avro.Schema.Field[] {};
        java.util.ArrayList<org.apache.avro.Schema.Field> fieldList1 = new java.util.ArrayList<org.apache.avro.Schema.Field>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<org.apache.avro.Schema.Field>) fieldList1, fieldArray0);
        org.apache.avro.Schema schema3 = org.apache.avro.Schema.createRecord((java.util.List<org.apache.avro.Schema.Field>) fieldList1);
        org.apache.avro.Schema schema4 = org.apache.avro.Schema.createRecord((java.util.List<org.apache.avro.Schema.Field>) fieldList1);
        org.apache.avro.Schema schema5 = org.apache.avro.Schema.createRecord((java.util.List<org.apache.avro.Schema.Field>) fieldList1);
        org.apache.avro.Schema schema6 = org.apache.avro.Schema.createRecord((java.util.List<org.apache.avro.Schema.Field>) fieldList1);
        org.apache.avro.Schema schema7 = org.apache.avro.Schema.createRecord((java.util.List<org.apache.avro.Schema.Field>) fieldList1);
        org.apache.avro.Schema schema8 = org.apache.avro.Schema.createRecord((java.util.List<org.apache.avro.Schema.Field>) fieldList1);
        // The following exception was thrown during execution in test generation
        try {
            schema8.addAlias("{\"type\":\"array\",\"items\":[]}");
            org.junit.Assert.fail("Expected exception of type org.apache.avro.SchemaParseException; message: Illegal initial character: {\"type\":\"array\",\"items\":[]}");
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
        org.junit.Assert.assertNotNull(schema7);
        org.junit.Assert.assertNotNull(schema8);
    }

    @Test
    public void test0857() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SchemaM3Random300Test1.test0857");
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
            schema12.addAlias("{\r\n  \"type\" : \"record\",\r\n  \"fields\" : [ ]\r\n}");
            org.junit.Assert.fail("Expected exception of type org.apache.avro.AvroRuntimeException; message: Not a named type: {\"type\":\"array\",\"items\":[]}");
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
    public void test0858() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SchemaM3Random300Test1.test0858");
        org.apache.avro.Schema.LockableArrayList<java.lang.Iterable<java.lang.String>> strIterableList1 = new org.apache.avro.Schema.LockableArrayList<java.lang.Iterable<java.lang.String>>((int) (byte) 0);
    }

    @Test
    public void test0859() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SchemaM3Random300Test1.test0859");
        // The following exception was thrown during execution in test generation
        try {
            org.codehaus.jackson.JsonNode jsonNode1 = org.apache.avro.Schema.parseJson("{null={\"type\":\"record\",\"fields\":[]}}");
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: org.codehaus.jackson.JsonParseException: Unexpected character ('n' (code 110)): was expecting double-quote to start field name? at [Source: java.io.StringReader@2d94f6cb; line: 1, column: 3]");
        } catch (java.lang.RuntimeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0860() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SchemaM3Random300Test1.test0860");
        org.apache.avro.Schema schema4 = org.apache.avro.Schema.createFixed("array", "[].union", "{\"type\":\"fixed\",\"name\":\"union\",\"namespace\":\"[]\",\"doc\":\"[ ]\",\"size\":0,\"aliases\":[\"union\"]}", 0);
        org.junit.Assert.assertNotNull(schema4);
    }

    @Test
    public void test0861() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SchemaM3Random300Test1.test0861");
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
        java.lang.String str24 = schema8.getName();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.avro.Schema schema25 = schema8.getElementType();
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
        org.junit.Assert.assertNotNull(schemaList20);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "[]" + "'", str22, "[]");
        org.junit.Assert.assertNotNull(schema23);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "union" + "'", str24, "union");
    }

    @Test
    public void test0862() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SchemaM3Random300Test1.test0862");
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
        org.apache.avro.Schema.Type type25 = schema24.getType();
        // The following exception was thrown during execution in test generation
        try {
            int int26 = schema24.getFixedSize();
            org.junit.Assert.fail("Expected exception of type org.apache.avro.AvroRuntimeException; message: Not fixed: {\"type\":\"array\",\"items\":[]}");
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
        org.junit.Assert.assertTrue("'" + type25 + "' != '" + org.apache.avro.Schema.Type.ARRAY + "'", type25.equals(org.apache.avro.Schema.Type.ARRAY));
    }

    @Test
    public void test0863() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SchemaM3Random300Test1.test0863");
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
        java.lang.String str41 = schema28.getDoc();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.avro.Schema schema42 = schema28.getElementType();
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
        org.junit.Assert.assertNull(str41);
    }

    @Test
    public void test0864() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SchemaM3Random300Test1.test0864");
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
        org.apache.avro.Schema.Names names17 = null;
        org.codehaus.jackson.JsonGenerator jsonGenerator18 = null;
        // The following exception was thrown during execution in test generation
        try {
            schema16.fieldsToJson(names17, jsonGenerator18);
            org.junit.Assert.fail("Expected exception of type org.apache.avro.AvroRuntimeException; message: Not a record: {\"type\":\"array\",\"items\":{\"type\":\"map\",\"values\":[]}}");
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
    public void test0865() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SchemaM3Random300Test1.test0865");
        org.codehaus.jackson.JsonNode jsonNode1 = org.apache.avro.Schema.parseJson("{\"type\":\"fixed\",\"name\":\"union\",\"namespace\":\"[]\",\"doc\":\"[ ]\",\"size\":0,\"aliases\":[\"union\"]}");
        org.junit.Assert.assertNotNull(jsonNode1);
    }

    @Test
    public void test0866() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SchemaM3Random300Test1.test0866");
        org.codehaus.jackson.JsonNode jsonNode1 = org.apache.avro.Schema.parseJson("{\"type\":\"array\",\"items\":\"null\"}");
        org.junit.Assert.assertNotNull(jsonNode1);
    }

    @Test
    public void test0867() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SchemaM3Random300Test1.test0867");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.avro.Schema schema4 = org.apache.avro.Schema.createFixed("{\"type\":\"map\",\"values\":{\"type\":\"array\",\"items\":{\"type\":\"map\",\"values\":[]},\"\":\"{\\r\\n  \\\"type\\\" : \\\"record\\\",\\r\\n  \\\"fields\\\" : [ ]\\r\\n}\"}}", "{\"type\":\"fixed\",\"name\":\"union\",\"namespace\":\"[]\",\"doc\":\"union type:UNION pos:-1\",\"size\":100}", "{\"type\":\"array\",\"items\":{\"type\":\"array\",\"items\":{\"type\":\"map\",\"values\":[]}}}", 0);
            org.junit.Assert.fail("Expected exception of type org.apache.avro.SchemaParseException; message: Illegal initial character: {\"type\":\"map\",\"values\":{\"type\":\"array\",\"items\":{\"type\":\"map\",\"values\":[]},\"\":\"{\\r\\n  \\\"type\\\" : \\\"record\\\",\\r\\n  \\\"fields\\\" : [ ]\\r\\n}\"}}");
        } catch (org.apache.avro.SchemaParseException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0868() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SchemaM3Random300Test1.test0868");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.avro.Schema schema2 = org.apache.avro.Schema.parse("{\"type\":\"record\",\"fields\":[],\"{\\r\\n  \\\"type\\\" : \\\"fixed\\\",\\r\\n  \\\"name\\\" : \\\"union\\\",\\r\\n  \\\"namespace\\\" : \\\"[]\\\",\\r\\n  \\\"doc\\\" : \\\"[ ]\\\",\\r\\n  \\\"size\\\" : 0\\r\\n}\":\"[ ]\"}", false);
            org.junit.Assert.fail("Expected exception of type org.apache.avro.SchemaParseException; message: No name in schema: {\"type\":\"record\",\"fields\":[],\"{\\r\\n  \\\"type\\\" : \\\"fixed\\\",\\r\\n  \\\"name\\\" : \\\"union\\\",\\r\\n  \\\"namespace\\\" : \\\"[]\\\",\\r\\n  \\\"doc\\\" : \\\"[ ]\\\",\\r\\n  \\\"size\\\" : 0\\r\\n}\":\"[ ]\"}");
        } catch (org.apache.avro.SchemaParseException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0869() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SchemaM3Random300Test1.test0869");
        org.apache.avro.Schema schema1 = org.apache.avro.Schema.parse("\"null\"");
        org.junit.Assert.assertNotNull(schema1);
    }

    @Test
    public void test0870() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SchemaM3Random300Test1.test0870");
        org.apache.avro.Schema.LockableArrayList<java.lang.String> strList4 = new org.apache.avro.Schema.LockableArrayList<java.lang.String>((int) 'a');
        org.apache.avro.Schema.LockableArrayList<java.lang.String> strList5 = new org.apache.avro.Schema.LockableArrayList<java.lang.String>((java.util.List<java.lang.String>) strList4);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.avro.Schema schema6 = org.apache.avro.Schema.createEnum("{\r\n  \"type\" : \"map\",\r\n  \"values\" : {\r\n    \"type\" : \"enum\",\r\n    \"name\" : \"union\",\r\n    \"namespace\" : \"[]\",\r\n    \"doc\" : \"{}\",\r\n    \"symbols\" : [ ]\r\n  }\r\n}", "{\"type\":\"array\",\"items\":[]}", "{\"type\":\"array\",\"items\":{\"type\":\"map\",\"values\":[]}}", (java.util.List<java.lang.String>) strList5);
            org.junit.Assert.fail("Expected exception of type org.apache.avro.SchemaParseException; message: Illegal initial character: {??  \"type\" : \"map\",??  \"values\" : {??    \"type\" : \"enum\",??    \"name\" : \"union\",??    \"namespace\" : \"[]\",??    \"doc\" : \"{}\",??    \"symbols\" : [ ]??  }??}");
        } catch (org.apache.avro.SchemaParseException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0871() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SchemaM3Random300Test1.test0871");
        java.lang.String[] strArray19 = new java.lang.String[] { "{\"type\":\"array\",\"items\":{\"type\":\"map\",\"values\":[]}}", "union type:MAP pos:-1", "{\"type\":\"array\",\"items\":{\"type\":\"map\",\"values\":[]}}", "{}", "{\r\n  \"type\" : \"map\",\r\n  \"values\" : {\r\n    \"type\" : \"map\",\r\n    \"values\" : [ ]\r\n  }\r\n}", "double", "{\r\n  \"type\" : \"map\",\r\n  \"values\" : [ ]\r\n}", "{\"type\":\"map\",\"values\":[]}", "{\"type\":\"array\",\"items\":[]}", "{\"type\":\"map\",\"values\":[]}", "{}", "union", "{\r\n  \"type\" : \"record\",\r\n  \"fields\" : [ ]\r\n}", "[].union", "{\r\n  \"type\" : \"map\",\r\n  \"values\" : [ ]\r\n}", "{\"type\":\"fixed\",\"name\":\"union\",\"namespace\":\"[]\",\"doc\":\"[ ]\",\"size\":0}" };
        java.util.ArrayList<java.lang.String> strList20 = new java.util.ArrayList<java.lang.String>();
        boolean boolean21 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList20, strArray19);
        org.apache.avro.Schema.LockableArrayList<java.lang.String> strList22 = new org.apache.avro.Schema.LockableArrayList<java.lang.String>((java.util.List<java.lang.String>) strList20);
        org.apache.avro.Schema.LockableArrayList<java.lang.String> strList23 = new org.apache.avro.Schema.LockableArrayList<java.lang.String>((java.util.List<java.lang.String>) strList22);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.avro.Schema schema24 = org.apache.avro.Schema.createEnum("{\"type\":\"map\",\"values\":[]}", "[]", "{\r\n  \"type\" : \"fixed\",\r\n  \"name\" : \"union\",\r\n  \"namespace\" : \"[]\",\r\n  \"doc\" : \"[ ]\",\r\n  \"size\" : 0\r\n}", (java.util.List<java.lang.String>) strList23);
            org.junit.Assert.fail("Expected exception of type org.apache.avro.SchemaParseException; message: Illegal initial character: {\"type\":\"map\",\"values\":[]}");
        } catch (org.apache.avro.SchemaParseException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray19);
        org.junit.Assert.assertArrayEquals(strArray19, new java.lang.String[] { "{\"type\":\"array\",\"items\":{\"type\":\"map\",\"values\":[]}}", "union type:MAP pos:-1", "{\"type\":\"array\",\"items\":{\"type\":\"map\",\"values\":[]}}", "{}", "{\r\n  \"type\" : \"map\",\r\n  \"values\" : {\r\n    \"type\" : \"map\",\r\n    \"values\" : [ ]\r\n  }\r\n}", "double", "{\r\n  \"type\" : \"map\",\r\n  \"values\" : [ ]\r\n}", "{\"type\":\"map\",\"values\":[]}", "{\"type\":\"array\",\"items\":[]}", "{\"type\":\"map\",\"values\":[]}", "{}", "union", "{\r\n  \"type\" : \"record\",\r\n  \"fields\" : [ ]\r\n}", "[].union", "{\r\n  \"type\" : \"map\",\r\n  \"values\" : [ ]\r\n}", "{\"type\":\"fixed\",\"name\":\"union\",\"namespace\":\"[]\",\"doc\":\"[ ]\",\"size\":0}" });
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
    }

    @Test
    public void test0872() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SchemaM3Random300Test1.test0872");
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
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str10 = schema9.getNamespace();
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
        org.junit.Assert.assertNotNull(schema9);
    }

    @Test
    public void test0873() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SchemaM3Random300Test1.test0873");
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
            boolean boolean12 = schema7.isError();
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
        org.junit.Assert.assertNotNull(schema11);
    }

    @Test
    public void test0874() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SchemaM3Random300Test1.test0874");
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
        org.apache.avro.Schema.Type type41 = schema28.getType();
        java.lang.String str42 = schema28.getDoc();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean44 = schema28.hasEnumSymbol("{\r\n  \"type\" : \"array\",\r\n  \"items\" : {\r\n    \"type\" : \"map\",\r\n    \"values\" : [ ]\r\n  }\r\n}");
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
        org.junit.Assert.assertTrue("'" + type41 + "' != '" + org.apache.avro.Schema.Type.UNION + "'", type41.equals(org.apache.avro.Schema.Type.UNION));
        org.junit.Assert.assertNull(str42);
    }

    @Test
    public void test0875() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SchemaM3Random300Test1.test0875");
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
        // The following exception was thrown during execution in test generation
        try {
            int int12 = schema11.getFixedSize();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
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
    }

    @Test
    public void test0876() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SchemaM3Random300Test1.test0876");
        org.apache.avro.Schema.Names names1 = new org.apache.avro.Schema.Names("{\"type\":\"array\",\"items\":{\"type\":\"map\",\"values\":[]}}");
    }

    @Test
    public void test0877() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SchemaM3Random300Test1.test0877");
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
        java.lang.String str17 = schema13.getName();
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
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "array" + "'", str17, "array");
    }

    @Test
    public void test0878() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SchemaM3Random300Test1.test0878");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.avro.Schema schema4 = org.apache.avro.Schema.createFixed("[]", "", "{\"type\":\"record\",\"fields\":[],\"{\\r\\n  \\\"type\\\" : \\\"fixed\\\",\\r\\n  \\\"name\\\" : \\\"union\\\",\\r\\n  \\\"namespace\\\" : \\\"[]\\\",\\r\\n  \\\"doc\\\" : \\\"[ ]\\\",\\r\\n  \\\"size\\\" : 0\\r\\n}\":\"[ ]\"}", (int) 'a');
            org.junit.Assert.fail("Expected exception of type org.apache.avro.SchemaParseException; message: Illegal initial character: []");
        } catch (org.apache.avro.SchemaParseException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0879() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SchemaM3Random300Test1.test0879");
        org.apache.avro.Schema.LockableArrayList<java.util.AbstractCollection<java.lang.String>> strCollectionList1 = new org.apache.avro.Schema.LockableArrayList<java.util.AbstractCollection<java.lang.String>>(1);
    }

    @Test
    public void test0880() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SchemaM3Random300Test1.test0880");
        org.apache.avro.Schema.LockableArrayList<java.lang.String> strList6 = new org.apache.avro.Schema.LockableArrayList<java.lang.String>();
        org.apache.avro.Schema.LockableArrayList<java.lang.String> strList7 = new org.apache.avro.Schema.LockableArrayList<java.lang.String>((java.util.List<java.lang.String>) strList6);
        org.apache.avro.Schema schema8 = org.apache.avro.Schema.createEnum("[].union", "{}", "[].union", (java.util.List<java.lang.String>) strList7);
        org.apache.avro.Schema.LockableArrayList<java.lang.String> strList9 = new org.apache.avro.Schema.LockableArrayList<java.lang.String>((java.util.List<java.lang.String>) strList7);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.avro.Schema schema10 = org.apache.avro.Schema.createEnum("{\"type\":\"array\",\"items\":\"null\"}", "{\"type\":\"map\",\"values\":[]}", "union type:UNION pos:-1", (java.util.List<java.lang.String>) strList9);
            org.junit.Assert.fail("Expected exception of type org.apache.avro.SchemaParseException; message: Illegal initial character: {\"type\":\"array\",\"items\":\"null\"}");
        } catch (org.apache.avro.SchemaParseException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(schema8);
    }

    @Test
    public void test0881() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SchemaM3Random300Test1.test0881");
        org.apache.avro.Schema.LockableArrayList<java.io.Serializable> serializableList0 = new org.apache.avro.Schema.LockableArrayList<java.io.Serializable>();
        org.apache.avro.Schema.LockableArrayList<java.io.Serializable> serializableList1 = new org.apache.avro.Schema.LockableArrayList<java.io.Serializable>((java.util.List<java.io.Serializable>) serializableList0);
        org.apache.avro.Schema.LockableArrayList<java.io.Serializable> serializableList2 = new org.apache.avro.Schema.LockableArrayList<java.io.Serializable>((java.util.List<java.io.Serializable>) serializableList0);
    }

    @Test
    public void test0882() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SchemaM3Random300Test1.test0882");
        org.apache.avro.Schema.LockableArrayList<java.lang.String> strList4 = new org.apache.avro.Schema.LockableArrayList<java.lang.String>(100);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.avro.Schema schema5 = org.apache.avro.Schema.createEnum("{null={\"type\":\"fixed\",\"name\":\"union\",\"namespace\":\"[]\",\"doc\":\"[ ]\",\"size\":0}}", "{\"type\":\"fixed\",\"name\":\"union\",\"namespace\":\"[]\",\"doc\":\"[ ]\",\"size\":0}", "{\"type\":\"map\",\"values\":{\"type\":\"array\",\"items\":{\"type\":\"map\",\"values\":[]}}}", (java.util.List<java.lang.String>) strList4);
            org.junit.Assert.fail("Expected exception of type org.apache.avro.SchemaParseException; message: Illegal initial character: {null={\"type\":\"fixed\",\"name\":\"union\",\"namespace\":\"[]\",\"doc\":\"[ ]\",\"size\":0}}");
        } catch (org.apache.avro.SchemaParseException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0883() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SchemaM3Random300Test1.test0883");
        org.apache.avro.Schema schema2 = org.apache.avro.Schema.parse("{\"type\":\"map\",\"values\":[]}", true);
        java.lang.String str3 = schema2.getName();
        schema2.addProp("double", "{null={\"type\":\"record\",\"fields\":[]}}");
        org.junit.Assert.assertNotNull(schema2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "map" + "'", str3, "map");
    }

    @Test
    public void test0884() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SchemaM3Random300Test1.test0884");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.avro.Schema schema4 = org.apache.avro.Schema.createRecord("{\r\n  \"type\" : \"map\",\r\n  \"values\" : {\r\n    \"type\" : \"enum\",\r\n    \"name\" : \"union\",\r\n    \"namespace\" : \"[]\",\r\n    \"doc\" : \"{}\",\r\n    \"symbols\" : [ ]\r\n  }\r\n}", "{\"type\":\"array\",\"items\":{\"type\":\"map\",\"values\":[]},\"union type:MAP pos:-1\":\"{\\\"type\\\":\\\"array\\\",\\\"items\\\":{\\\"type\\\":\\\"map\\\",\\\"values\\\":[]}}\"}", "{\r\n  \"type\" : \"map\",\r\n  \"values\" : {\r\n    \"type\" : \"map\",\r\n    \"values\" : [ ]\r\n  }\r\n}", false);
            org.junit.Assert.fail("Expected exception of type org.apache.avro.SchemaParseException; message: Illegal initial character: {??  \"type\" : \"map\",??  \"values\" : {??    \"type\" : \"enum\",??    \"name\" : \"union\",??    \"namespace\" : \"[]\",??    \"doc\" : \"{}\",??    \"symbols\" : [ ]??  }??}");
        } catch (org.apache.avro.SchemaParseException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0885() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SchemaM3Random300Test1.test0885");
        org.apache.avro.Schema.LockableArrayList<java.lang.String> strList4 = new org.apache.avro.Schema.LockableArrayList<java.lang.String>(0);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.avro.Schema schema5 = org.apache.avro.Schema.createEnum("{\"type\":\"fixed\",\"name\":\"union\",\"namespace\":\"[]\",\"doc\":\"union type:UNION pos:-1\",\"size\":100}", "{\"type\":\"array\",\"items\":\"null\"}", "{\"type\":\"double\",\"float\":\"{\\\"type\\\":\\\"array\\\",\\\"items\\\":[]}\"}", (java.util.List<java.lang.String>) strList4);
            org.junit.Assert.fail("Expected exception of type org.apache.avro.SchemaParseException; message: Illegal initial character: {\"type\":\"fixed\",\"name\":\"union\",\"namespace\":\"[]\",\"doc\":\"union type:UNION pos:-1\",\"size\":100}");
        } catch (org.apache.avro.SchemaParseException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0886() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SchemaM3Random300Test1.test0886");
        org.apache.avro.Schema.LockableArrayList<java.lang.String> strList4 = new org.apache.avro.Schema.LockableArrayList<java.lang.String>(10);
        org.apache.avro.Schema.LockableArrayList<java.lang.String> strList5 = new org.apache.avro.Schema.LockableArrayList<java.lang.String>((java.util.List<java.lang.String>) strList4);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.avro.Schema schema6 = org.apache.avro.Schema.createEnum("\"null\"", "{\"type\":\"array\",\"items\":[]}", "", (java.util.List<java.lang.String>) strList5);
            org.junit.Assert.fail("Expected exception of type org.apache.avro.SchemaParseException; message: Illegal initial character: \"null\"");
        } catch (org.apache.avro.SchemaParseException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0887() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SchemaM3Random300Test1.test0887");
        org.apache.avro.Schema.Parser parser0 = new org.apache.avro.Schema.Parser();
        org.apache.avro.Schema.Parser parser2 = parser0.setValidate(true);
        java.util.Map<java.lang.String, org.apache.avro.Schema> strMap3 = parser0.getTypes();
        org.apache.avro.Schema.Parser parser5 = parser0.setValidate(true);
        org.apache.avro.Schema.Parser parser7 = parser0.setValidate(true);
        java.util.Map<java.lang.String, org.apache.avro.Schema> strMap8 = parser0.getTypes();
        org.apache.avro.Schema.Parser parser10 = parser0.setValidate(false);
        java.io.InputStream inputStream11 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.avro.Schema schema12 = parser10.parse(inputStream11);
            org.junit.Assert.fail("Expected exception of type java.io.EOFException; message: No content to map to Object due to end of input");
        } catch (java.io.EOFException e) {
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
    public void test0888() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SchemaM3Random300Test1.test0888");
        org.apache.avro.Schema.Parser parser0 = new org.apache.avro.Schema.Parser();
        java.util.Map<java.lang.String, org.apache.avro.Schema> strMap1 = parser0.getTypes();
        java.util.Map<java.lang.String, org.apache.avro.Schema> strMap2 = parser0.getTypes();
        org.apache.avro.Schema.Parser parser3 = new org.apache.avro.Schema.Parser();
        java.util.Map<java.lang.String, org.apache.avro.Schema> strMap4 = parser3.getTypes();
        org.apache.avro.Schema.Parser parser5 = parser0.addTypes(strMap4);
        org.apache.avro.Schema schema7 = parser0.parse("{\r\n  \"type\" : \"map\",\r\n  \"values\" : [ ]\r\n}");
        org.apache.avro.Schema schema8 = schema7.getValueType();
        org.apache.avro.Schema schema9 = org.apache.avro.Schema.createArray(schema7);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean11 = schema9.hasEnumSymbol("{\"type\":\"array\",\"items\":[]}");
            org.junit.Assert.fail("Expected exception of type org.apache.avro.AvroRuntimeException; message: Not an enum: {\"type\":\"array\",\"items\":{\"type\":\"map\",\"values\":[]}}");
        } catch (org.apache.avro.AvroRuntimeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strMap1);
        org.junit.Assert.assertNotNull(strMap2);
        org.junit.Assert.assertNotNull(strMap4);
        org.junit.Assert.assertNotNull(parser5);
        org.junit.Assert.assertNotNull(schema7);
        org.junit.Assert.assertNotNull(schema8);
        org.junit.Assert.assertNotNull(schema9);
    }

    @Test
    public void test0889() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SchemaM3Random300Test1.test0889");
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
        org.apache.avro.Schema.Parser parser20 = parser6.setValidate(true);
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
        org.junit.Assert.assertNotNull(parser20);
    }

    @Test
    public void test0890() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SchemaM3Random300Test1.test0890");
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
        java.io.File file15 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.avro.Schema schema16 = parser7.parse(file15);
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
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test0891() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SchemaM3Random300Test1.test0891");
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
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean22 = schema13.hasEnumSymbol("{\r\n  \"type\" : \"map\",\r\n  \"values\" : {\r\n    \"type\" : \"enum\",\r\n    \"name\" : \"union\",\r\n    \"namespace\" : \"[]\",\r\n    \"doc\" : \"{}\",\r\n    \"symbols\" : [ ]\r\n  }\r\n}");
            org.junit.Assert.fail("Expected exception of type org.apache.avro.AvroRuntimeException; message: Not an enum: []");
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
    }

    @Test
    public void test0892() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SchemaM3Random300Test1.test0892");
        org.apache.avro.Schema.Type type0 = org.apache.avro.Schema.Type.INT;
        org.apache.avro.Schema schema1 = org.apache.avro.Schema.create(type0);
        org.apache.avro.Schema schema2 = org.apache.avro.Schema.createArray(schema1);
        org.apache.avro.Schema schema3 = org.apache.avro.Schema.createMap(schema2);
        org.apache.avro.Schema schema4 = schema2.getElementType();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean5 = schema4.isError();
            org.junit.Assert.fail("Expected exception of type org.apache.avro.AvroRuntimeException; message: Not a record: \"int\"");
        } catch (org.apache.avro.AvroRuntimeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + type0 + "' != '" + org.apache.avro.Schema.Type.INT + "'", type0.equals(org.apache.avro.Schema.Type.INT));
        org.junit.Assert.assertNotNull(schema1);
        org.junit.Assert.assertNotNull(schema2);
        org.junit.Assert.assertNotNull(schema3);
        org.junit.Assert.assertNotNull(schema4);
    }

    @Test
    public void test0893() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SchemaM3Random300Test1.test0893");
        org.apache.avro.Schema.Parser parser0 = new org.apache.avro.Schema.Parser();
        org.apache.avro.Schema.Parser parser2 = parser0.setValidate(true);
        java.util.Map<java.lang.String, org.apache.avro.Schema> strMap3 = parser0.getTypes();
        org.apache.avro.Schema.Parser parser5 = parser0.setValidate(true);
        org.apache.avro.Schema.Parser parser7 = parser0.setValidate(true);
        java.io.InputStream inputStream8 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.avro.Schema schema9 = parser7.parse(inputStream8);
            org.junit.Assert.fail("Expected exception of type java.io.EOFException; message: No content to map to Object due to end of input");
        } catch (java.io.EOFException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(parser2);
        org.junit.Assert.assertNotNull(strMap3);
        org.junit.Assert.assertNotNull(parser5);
        org.junit.Assert.assertNotNull(parser7);
    }

    @Test
    public void test0894() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SchemaM3Random300Test1.test0894");
        org.apache.avro.Schema.LockableArrayList<java.lang.String> strList3 = new org.apache.avro.Schema.LockableArrayList<java.lang.String>();
        org.apache.avro.Schema.LockableArrayList<java.lang.String> strList4 = new org.apache.avro.Schema.LockableArrayList<java.lang.String>((java.util.List<java.lang.String>) strList3);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.avro.Schema schema5 = org.apache.avro.Schema.createEnum("{\r\n  \"type\" : \"map\",\r\n  \"values\" : [ ]\r\n}", "{\"type\":\"map\",\"values\":{\"type\":\"enum\",\"name\":\"union\",\"namespace\":\"[]\",\"doc\":\"{}\",\"symbols\":[]}}", "\"double\"", (java.util.List<java.lang.String>) strList4);
            org.junit.Assert.fail("Expected exception of type org.apache.avro.SchemaParseException; message: Illegal initial character: {??  \"type\" : \"map\",??  \"values\" : [ ]??}");
        } catch (org.apache.avro.SchemaParseException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0895() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SchemaM3Random300Test1.test0895");
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
            int int14 = schema12.getEnumOrdinal("{}");
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
    public void test0896() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SchemaM3Random300Test1.test0896");
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
            boolean boolean22 = schema8.isError();
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
    public void test0897() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SchemaM3Random300Test1.test0897");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.avro.Schema schema2 = org.apache.avro.Schema.parse("int", true);
            org.junit.Assert.fail("Expected exception of type org.apache.avro.SchemaParseException; message: org.codehaus.jackson.JsonParseException: Unexpected character ('i' (code 105)): expected a valid value (number, String, array, object, 'true', 'false' or 'null')? at [Source: java.io.StringReader@2ff11d0f; line: 1, column: 2]");
        } catch (org.apache.avro.SchemaParseException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0898() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SchemaM3Random300Test1.test0898");
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
        org.apache.avro.Schema.Names names14 = new org.apache.avro.Schema.Names();
        names14.clear();
        org.codehaus.jackson.JsonGenerator jsonGenerator16 = null;
        // The following exception was thrown during execution in test generation
        try {
            schema11.toJson(names14, jsonGenerator16);
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
        org.junit.Assert.assertNotNull(schema10);
        org.junit.Assert.assertNotNull(schema11);
        org.junit.Assert.assertNotNull(schema12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "array" + "'", str13, "array");
    }

    @Test
    public void test0899() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SchemaM3Random300Test1.test0899");
        org.apache.avro.Schema.Type type0 = org.apache.avro.Schema.Type.INT;
        org.apache.avro.Schema schema1 = org.apache.avro.Schema.create(type0);
        org.apache.avro.Schema schema2 = org.apache.avro.Schema.createArray(schema1);
        schema2.addProp("[ ]", "");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean7 = schema2.hasEnumSymbol("union type:UNION pos:-1");
            org.junit.Assert.fail("Expected exception of type org.apache.avro.AvroRuntimeException; message: Not an enum: {\"type\":\"array\",\"items\":\"int\",\"[ ]\":\"\"}");
        } catch (org.apache.avro.AvroRuntimeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + type0 + "' != '" + org.apache.avro.Schema.Type.INT + "'", type0.equals(org.apache.avro.Schema.Type.INT));
        org.junit.Assert.assertNotNull(schema1);
        org.junit.Assert.assertNotNull(schema2);
    }

    @Test
    public void test0900() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SchemaM3Random300Test1.test0900");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.avro.Schema schema4 = org.apache.avro.Schema.createRecord("{\r\n  \"type\" : \"record\",\r\n  \"fields\" : [ ]\r\n}", "array", "int", true);
            org.junit.Assert.fail("Expected exception of type org.apache.avro.SchemaParseException; message: Illegal initial character: {??  \"type\" : \"record\",??  \"fields\" : [ ]??}");
        } catch (org.apache.avro.SchemaParseException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0901() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SchemaM3Random300Test1.test0901");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.avro.Schema schema4 = org.apache.avro.Schema.createRecord("{\r\n  \"type\" : \"map\",\r\n  \"values\" : {\r\n    \"type\" : \"enum\",\r\n    \"name\" : \"union\",\r\n    \"namespace\" : \"[]\",\r\n    \"doc\" : \"{}\",\r\n    \"symbols\" : [ ]\r\n  }\r\n}", "{null={\"type\":\"record\",\"fields\":[]}}", "{\"type\":\"array\",\"items\":{\"type\":\"map\",\"values\":[]},\"union type:MAP pos:-1\":\"{\\\"type\\\":\\\"array\\\",\\\"items\\\":{\\\"type\\\":\\\"map\\\",\\\"values\\\":[]}}\"}", true);
            org.junit.Assert.fail("Expected exception of type org.apache.avro.SchemaParseException; message: Illegal initial character: {??  \"type\" : \"map\",??  \"values\" : {??    \"type\" : \"enum\",??    \"name\" : \"union\",??    \"namespace\" : \"[]\",??    \"doc\" : \"{}\",??    \"symbols\" : [ ]??  }??}");
        } catch (org.apache.avro.SchemaParseException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0902() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SchemaM3Random300Test1.test0902");
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
        // The following exception was thrown during execution in test generation
        try {
            org.apache.avro.Schema schema15 = schema11.getValueType();
            org.junit.Assert.fail("Expected exception of type org.apache.avro.AvroRuntimeException; message: Not a map: {\"type\":\"array\",\"items\":[],\"{\\\"type\\\":\\\"array\\\",\\\"items\\\":{\\\"type\\\":\\\"map\\\",\\\"values\\\":[]}}\":\"array\"}");
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
    public void test0903() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SchemaM3Random300Test1.test0903");
        // The following exception was thrown during execution in test generation
        try {
            org.codehaus.jackson.JsonNode jsonNode1 = org.apache.avro.Schema.parseJson("union type:UNION pos:-1");
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: org.codehaus.jackson.JsonParseException: Unexpected character ('u' (code 117)): expected a valid value (number, String, array, object, 'true', 'false' or 'null')? at [Source: java.io.StringReader@49b63745; line: 1, column: 2]");
        } catch (java.lang.RuntimeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0904() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SchemaM3Random300Test1.test0904");
        // The following exception was thrown during execution in test generation
        try {
            org.codehaus.jackson.JsonNode jsonNode1 = org.apache.avro.Schema.parseJson("int");
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: org.codehaus.jackson.JsonParseException: Unexpected character ('i' (code 105)): expected a valid value (number, String, array, object, 'true', 'false' or 'null')? at [Source: java.io.StringReader@692dbc4; line: 1, column: 2]");
        } catch (java.lang.RuntimeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0905() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SchemaM3Random300Test1.test0905");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.avro.Schema.LockableArrayList<java.util.AbstractList<java.lang.String>> strListList1 = new org.apache.avro.Schema.LockableArrayList<java.util.AbstractList<java.lang.String>>((int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal Capacity: -1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0906() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SchemaM3Random300Test1.test0906");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.avro.Schema schema4 = org.apache.avro.Schema.createFixed("{\"type\":\"fixed\",\"name\":\"union\",\"namespace\":\"[]\",\"doc\":\"[ ]\",\"size\":0,\"aliases\":[\"union\"]}", "{\r\n  \"type\" : \"fixed\",\r\n  \"name\" : \"union\",\r\n  \"namespace\" : \"[]\",\r\n  \"doc\" : \"[ ]\",\r\n  \"size\" : 0\r\n}", "{\"type\":\"fixed\",\"name\":\"union\",\"namespace\":\"[]\",\"doc\":\"[ ]\",\"size\":0}", (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type org.apache.avro.SchemaParseException; message: Illegal initial character: {\"type\":\"fixed\",\"name\":\"union\",\"namespace\":\"[]\",\"doc\":\"[ ]\",\"size\":0,\"aliases\":[\"union\"]}");
        } catch (org.apache.avro.SchemaParseException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0907() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SchemaM3Random300Test1.test0907");
        org.apache.avro.Schema.LockableArrayList<java.lang.String> strList4 = new org.apache.avro.Schema.LockableArrayList<java.lang.String>((int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.avro.Schema schema5 = org.apache.avro.Schema.createEnum("\"null\"", "{\r\n  \"type\" : \"array\",\r\n  \"items\" : [ ],\r\n  \"{}\" : \"hi!\"\r\n}", "{null={\"type\":\"fixed\",\"name\":\"union\",\"namespace\":\"[]\",\"doc\":\"[ ]\",\"size\":0}}", (java.util.List<java.lang.String>) strList4);
            org.junit.Assert.fail("Expected exception of type org.apache.avro.SchemaParseException; message: Illegal initial character: \"null\"");
        } catch (org.apache.avro.SchemaParseException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0908() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SchemaM3Random300Test1.test0908");
        org.apache.avro.Schema.Names names1 = new org.apache.avro.Schema.Names("\"double\"");
        names1.space("int");
        org.apache.avro.Schema schema8 = org.apache.avro.Schema.createFixed("float", "[ ]", "array", 1);
        boolean boolean9 = names1.contains(schema8);
        org.junit.Assert.assertNotNull(schema8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test0909() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SchemaM3Random300Test1.test0909");
        org.apache.avro.Schema.LockableArrayList<org.apache.avro.Schema.LockableArrayList<java.lang.String>> strListList0 = new org.apache.avro.Schema.LockableArrayList<org.apache.avro.Schema.LockableArrayList<java.lang.String>>();
    }

    @Test
    public void test0910() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SchemaM3Random300Test1.test0910");
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
        java.io.File file14 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.avro.Schema schema15 = parser12.parse(file14);
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
    }

    @Test
    public void test0911() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SchemaM3Random300Test1.test0911");
        org.apache.avro.Schema.LockableArrayList<java.lang.String> strList4 = new org.apache.avro.Schema.LockableArrayList<java.lang.String>((int) '#');
        org.apache.avro.Schema.LockableArrayList<java.lang.String> strList5 = new org.apache.avro.Schema.LockableArrayList<java.lang.String>((java.util.List<java.lang.String>) strList4);
        org.apache.avro.Schema.LockableArrayList<java.lang.String> strList6 = new org.apache.avro.Schema.LockableArrayList<java.lang.String>((java.util.List<java.lang.String>) strList4);
        org.apache.avro.Schema.LockableArrayList<java.lang.String> strList7 = new org.apache.avro.Schema.LockableArrayList<java.lang.String>((java.util.List<java.lang.String>) strList6);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.avro.Schema schema8 = org.apache.avro.Schema.createEnum("{\r\n  \"type\" : \"record\",\r\n  \"fields\" : [ ]\r\n}", "\"double\"", "", (java.util.List<java.lang.String>) strList6);
            org.junit.Assert.fail("Expected exception of type org.apache.avro.SchemaParseException; message: Illegal initial character: {??  \"type\" : \"record\",??  \"fields\" : [ ]??}");
        } catch (org.apache.avro.SchemaParseException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0912() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SchemaM3Random300Test1.test0912");
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
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<java.lang.String> strList25 = schema23.getEnumSymbols();
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
    }

    @Test
    public void test0913() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SchemaM3Random300Test1.test0913");
        org.apache.avro.Schema schema2 = org.apache.avro.Schema.parse("{\"type\":\"array\",\"items\":[]}", true);
        org.junit.Assert.assertNotNull(schema2);
    }

    @Test
    public void test0914() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SchemaM3Random300Test1.test0914");
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
        org.apache.avro.Schema.Names names23 = new org.apache.avro.Schema.Names();
        names23.clear();
        org.codehaus.jackson.JsonGenerator jsonGenerator25 = null;
        // The following exception was thrown during execution in test generation
        try {
            schema21.fieldsToJson(names23, jsonGenerator25);
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
    public void test0915() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SchemaM3Random300Test1.test0915");
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
        java.io.File file16 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.avro.Schema schema17 = parser7.parse(file16);
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
    }

    @Test
    public void test0916() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SchemaM3Random300Test1.test0916");
        java.lang.String[] strArray19 = new java.lang.String[] { "{\"type\":\"array\",\"items\":{\"type\":\"map\",\"values\":[]}}", "union type:MAP pos:-1", "{\"type\":\"array\",\"items\":{\"type\":\"map\",\"values\":[]}}", "{}", "{\r\n  \"type\" : \"map\",\r\n  \"values\" : {\r\n    \"type\" : \"map\",\r\n    \"values\" : [ ]\r\n  }\r\n}", "double", "{\r\n  \"type\" : \"map\",\r\n  \"values\" : [ ]\r\n}", "{\"type\":\"map\",\"values\":[]}", "{\"type\":\"array\",\"items\":[]}", "{\"type\":\"map\",\"values\":[]}", "{}", "union", "{\r\n  \"type\" : \"record\",\r\n  \"fields\" : [ ]\r\n}", "[].union", "{\r\n  \"type\" : \"map\",\r\n  \"values\" : [ ]\r\n}", "{\"type\":\"fixed\",\"name\":\"union\",\"namespace\":\"[]\",\"doc\":\"[ ]\",\"size\":0}" };
        java.util.ArrayList<java.lang.String> strList20 = new java.util.ArrayList<java.lang.String>();
        boolean boolean21 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList20, strArray19);
        org.apache.avro.Schema.LockableArrayList<java.lang.String> strList22 = new org.apache.avro.Schema.LockableArrayList<java.lang.String>((java.util.List<java.lang.String>) strList20);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.avro.Schema schema23 = org.apache.avro.Schema.createEnum("{\r\n  \"type\" : \"array\",\r\n  \"items\" : [ ],\r\n  \"{}\" : \"hi!\"\r\n}", "{null={\"type\":\"fixed\",\"name\":\"union\",\"namespace\":\"[]\",\"doc\":\"[ ]\",\"size\":0}}", "union type:MAP pos:-1", (java.util.List<java.lang.String>) strList22);
            org.junit.Assert.fail("Expected exception of type org.apache.avro.SchemaParseException; message: Illegal initial character: {??  \"type\" : \"array\",??  \"items\" : [ ],??  \"{}\" : \"hi!\"??}");
        } catch (org.apache.avro.SchemaParseException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray19);
        org.junit.Assert.assertArrayEquals(strArray19, new java.lang.String[] { "{\"type\":\"array\",\"items\":{\"type\":\"map\",\"values\":[]}}", "union type:MAP pos:-1", "{\"type\":\"array\",\"items\":{\"type\":\"map\",\"values\":[]}}", "{}", "{\r\n  \"type\" : \"map\",\r\n  \"values\" : {\r\n    \"type\" : \"map\",\r\n    \"values\" : [ ]\r\n  }\r\n}", "double", "{\r\n  \"type\" : \"map\",\r\n  \"values\" : [ ]\r\n}", "{\"type\":\"map\",\"values\":[]}", "{\"type\":\"array\",\"items\":[]}", "{\"type\":\"map\",\"values\":[]}", "{}", "union", "{\r\n  \"type\" : \"record\",\r\n  \"fields\" : [ ]\r\n}", "[].union", "{\r\n  \"type\" : \"map\",\r\n  \"values\" : [ ]\r\n}", "{\"type\":\"fixed\",\"name\":\"union\",\"namespace\":\"[]\",\"doc\":\"[ ]\",\"size\":0}" });
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
    }

    @Test
    public void test0917() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SchemaM3Random300Test1.test0917");
        org.codehaus.jackson.JsonNode jsonNode1 = org.apache.avro.Schema.parseJson("{\r\n  \"type\" : \"array\",\r\n  \"items\" : {\r\n    \"type\" : \"map\",\r\n    \"values\" : [ ]\r\n  }\r\n}");
        org.junit.Assert.assertNotNull(jsonNode1);
    }

    @Test
    public void test0918() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SchemaM3Random300Test1.test0918");
        org.apache.avro.Schema.Parser parser0 = new org.apache.avro.Schema.Parser();
        java.util.Map<java.lang.String, org.apache.avro.Schema> strMap1 = parser0.getTypes();
        java.util.Map<java.lang.String, org.apache.avro.Schema> strMap2 = parser0.getTypes();
        org.apache.avro.Schema.Parser parser3 = new org.apache.avro.Schema.Parser();
        java.util.Map<java.lang.String, org.apache.avro.Schema> strMap4 = parser3.getTypes();
        org.apache.avro.Schema.Parser parser5 = parser0.addTypes(strMap4);
        org.apache.avro.Schema schema7 = parser0.parse("{\r\n  \"type\" : \"map\",\r\n  \"values\" : [ ]\r\n}");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean9 = schema7.hasEnumSymbol("{}");
            org.junit.Assert.fail("Expected exception of type org.apache.avro.AvroRuntimeException; message: Not an enum: {\"type\":\"map\",\"values\":[]}");
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
    public void test0919() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SchemaM3Random300Test1.test0919");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.avro.Schema schema4 = org.apache.avro.Schema.createFixed("{\r\n  \"type\" : \"array\",\r\n  \"items\" : {\r\n    \"type\" : \"map\",\r\n    \"values\" : [ ]\r\n  }\r\n}", "{\"type\":\"double\",\"float\":\"{\\\"type\\\":\\\"array\\\",\\\"items\\\":[]}\"}", "{\r\n  \"type\" : \"map\",\r\n  \"values\" : {\r\n    \"type\" : \"map\",\r\n    \"values\" : [ ]\r\n  }\r\n}", (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type org.apache.avro.SchemaParseException; message: Illegal initial character: {??  \"type\" : \"array\",??  \"items\" : {??    \"type\" : \"map\",??    \"values\" : [ ]??  }??}");
        } catch (org.apache.avro.SchemaParseException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0920() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SchemaM3Random300Test1.test0920");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.avro.Schema schema4 = org.apache.avro.Schema.createFixed("{null={\"type\":\"record\",\"fields\":[]}}", "{\"type\":\"map\",\"values\":[]}", "union", (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type org.apache.avro.SchemaParseException; message: Illegal initial character: {null={\"type\":\"record\",\"fields\":[]}}");
        } catch (org.apache.avro.SchemaParseException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0921() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SchemaM3Random300Test1.test0921");
        java.lang.String[] strArray19 = new java.lang.String[] { "{\"type\":\"array\",\"items\":{\"type\":\"map\",\"values\":[]}}", "union type:MAP pos:-1", "{\"type\":\"array\",\"items\":{\"type\":\"map\",\"values\":[]}}", "{}", "{\r\n  \"type\" : \"map\",\r\n  \"values\" : {\r\n    \"type\" : \"map\",\r\n    \"values\" : [ ]\r\n  }\r\n}", "double", "{\r\n  \"type\" : \"map\",\r\n  \"values\" : [ ]\r\n}", "{\"type\":\"map\",\"values\":[]}", "{\"type\":\"array\",\"items\":[]}", "{\"type\":\"map\",\"values\":[]}", "{}", "union", "{\r\n  \"type\" : \"record\",\r\n  \"fields\" : [ ]\r\n}", "[].union", "{\r\n  \"type\" : \"map\",\r\n  \"values\" : [ ]\r\n}", "{\"type\":\"fixed\",\"name\":\"union\",\"namespace\":\"[]\",\"doc\":\"[ ]\",\"size\":0}" };
        java.util.ArrayList<java.lang.String> strList20 = new java.util.ArrayList<java.lang.String>();
        boolean boolean21 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList20, strArray19);
        org.apache.avro.Schema.LockableArrayList<java.lang.String> strList22 = new org.apache.avro.Schema.LockableArrayList<java.lang.String>((java.util.List<java.lang.String>) strList20);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.avro.Schema schema23 = org.apache.avro.Schema.createEnum("{null={\"type\":\"record\",\"fields\":[]}}", "{\r\n  \"type\" : \"map\",\r\n  \"values\" : {\r\n    \"type\" : \"record\",\r\n    \"fields\" : [ ]\r\n  }\r\n}", "{\r\n  \"type\" : \"map\",\r\n  \"values\" : {\r\n    \"type\" : \"map\",\r\n    \"values\" : [ ]\r\n  }\r\n}", (java.util.List<java.lang.String>) strList20);
            org.junit.Assert.fail("Expected exception of type org.apache.avro.SchemaParseException; message: Illegal initial character: {null={\"type\":\"record\",\"fields\":[]}}");
        } catch (org.apache.avro.SchemaParseException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray19);
        org.junit.Assert.assertArrayEquals(strArray19, new java.lang.String[] { "{\"type\":\"array\",\"items\":{\"type\":\"map\",\"values\":[]}}", "union type:MAP pos:-1", "{\"type\":\"array\",\"items\":{\"type\":\"map\",\"values\":[]}}", "{}", "{\r\n  \"type\" : \"map\",\r\n  \"values\" : {\r\n    \"type\" : \"map\",\r\n    \"values\" : [ ]\r\n  }\r\n}", "double", "{\r\n  \"type\" : \"map\",\r\n  \"values\" : [ ]\r\n}", "{\"type\":\"map\",\"values\":[]}", "{\"type\":\"array\",\"items\":[]}", "{\"type\":\"map\",\"values\":[]}", "{}", "union", "{\r\n  \"type\" : \"record\",\r\n  \"fields\" : [ ]\r\n}", "[].union", "{\r\n  \"type\" : \"map\",\r\n  \"values\" : [ ]\r\n}", "{\"type\":\"fixed\",\"name\":\"union\",\"namespace\":\"[]\",\"doc\":\"[ ]\",\"size\":0}" });
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
    }

    @Test
    public void test0922() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SchemaM3Random300Test1.test0922");
        org.apache.avro.Schema.Parser parser0 = new org.apache.avro.Schema.Parser();
        org.apache.avro.Schema.Parser parser2 = parser0.setValidate(true);
        java.util.Map<java.lang.String, org.apache.avro.Schema> strMap3 = parser0.getTypes();
        java.util.Map<java.lang.String, org.apache.avro.Schema> strMap4 = parser0.getTypes();
        org.apache.avro.Schema schema6 = parser0.parse("{\"type\":\"map\",\"values\":[]}");
        boolean boolean7 = parser0.getValidate();
        java.io.File file8 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.avro.Schema schema9 = parser0.parse(file8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(parser2);
        org.junit.Assert.assertNotNull(strMap3);
        org.junit.Assert.assertNotNull(strMap4);
        org.junit.Assert.assertNotNull(schema6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test0923() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SchemaM3Random300Test1.test0923");
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
        java.lang.Object obj18 = names0.clone();
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
        org.junit.Assert.assertNotNull(obj18);
        org.junit.Assert.assertEquals(obj18.toString(), "{}");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj18), "{}");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj18), "{}");
    }

    @Test
    public void test0924() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SchemaM3Random300Test1.test0924");
        // The following exception was thrown during execution in test generation
        try {
            org.codehaus.jackson.JsonNode jsonNode1 = org.apache.avro.Schema.parseJson("{null=null}");
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: org.codehaus.jackson.JsonParseException: Unexpected character ('n' (code 110)): was expecting double-quote to start field name? at [Source: java.io.StringReader@fc8cf7; line: 1, column: 3]");
        } catch (java.lang.RuntimeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0925() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SchemaM3Random300Test1.test0925");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.avro.Schema schema4 = org.apache.avro.Schema.createFixed("{null={\"type\":\"fixed\",\"name\":\"union\",\"namespace\":\"[]\",\"doc\":\"[ ]\",\"size\":0}}", "{\r\n  \"type\" : \"map\",\r\n  \"values\" : {\r\n    \"type\" : \"map\",\r\n    \"values\" : [ ]\r\n  }\r\n}", "{null=null}", (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type org.apache.avro.SchemaParseException; message: Illegal initial character: {null={\"type\":\"fixed\",\"name\":\"union\",\"namespace\":\"[]\",\"doc\":\"[ ]\",\"size\":0}}");
        } catch (org.apache.avro.SchemaParseException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0926() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SchemaM3Random300Test1.test0926");
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
        java.lang.String str12 = schema10.getName();
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<org.apache.avro.Schema.Field> fieldList13 = schema10.getFields();
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
        org.junit.Assert.assertNotNull(schema10);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "union" + "'", str12, "union");
    }

    @Test
    public void test0927() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SchemaM3Random300Test1.test0927");
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
        java.lang.String str20 = schema19.getFullName();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.avro.Schema.Field field22 = schema19.getField("\"double\"");
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
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "union" + "'", str20, "union");
    }

    @Test
    public void test0928() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SchemaM3Random300Test1.test0928");
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
        org.junit.Assert.assertNotNull(parser5);
        org.junit.Assert.assertNotNull(strMap6);
        org.junit.Assert.assertNotNull(parser7);
        org.junit.Assert.assertNotNull(strMap8);
        org.junit.Assert.assertNotNull(parser10);
        org.junit.Assert.assertNotNull(parser12);
    }

    @Test
    public void test0929() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SchemaM3Random300Test1.test0929");
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
            int int13 = schema10.getEnumOrdinal("{\"type\":\"array\",\"items\":{\"type\":\"record\",\"fields\":[]}}");
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
        org.junit.Assert.assertNotNull(schema11);
    }

    @Test
    public void test0930() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SchemaM3Random300Test1.test0930");
        org.apache.avro.Schema.Parser parser0 = new org.apache.avro.Schema.Parser();
        org.apache.avro.Schema.Parser parser2 = parser0.setValidate(true);
        java.util.Map<java.lang.String, org.apache.avro.Schema> strMap3 = parser0.getTypes();
        org.apache.avro.Schema.Parser parser5 = parser0.setValidate(true);
        java.util.Map<java.lang.String, org.apache.avro.Schema> strMap6 = parser5.getTypes();
        org.junit.Assert.assertNotNull(parser2);
        org.junit.Assert.assertNotNull(strMap3);
        org.junit.Assert.assertNotNull(parser5);
        org.junit.Assert.assertNotNull(strMap6);
    }

    @Test
    public void test0931() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SchemaM3Random300Test1.test0931");
        org.apache.avro.Schema.LockableArrayList<java.lang.String> strList4 = new org.apache.avro.Schema.LockableArrayList<java.lang.String>((int) (byte) 100);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.avro.Schema schema5 = org.apache.avro.Schema.createEnum("{\r\n  \"type\" : \"map\",\r\n  \"values\" : {\r\n    \"type\" : \"record\",\r\n    \"fields\" : [ ]\r\n  }\r\n}", "int", "double", (java.util.List<java.lang.String>) strList4);
            org.junit.Assert.fail("Expected exception of type org.apache.avro.SchemaParseException; message: Illegal initial character: {??  \"type\" : \"map\",??  \"values\" : {??    \"type\" : \"record\",??    \"fields\" : [ ]??  }??}");
        } catch (org.apache.avro.SchemaParseException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0932() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SchemaM3Random300Test1.test0932");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.avro.Schema schema4 = org.apache.avro.Schema.createFixed("{\"type\":\"array\",\"items\":{\"type\":\"map\",\"values\":[]},\"union type:MAP pos:-1\":\"{\\\"type\\\":\\\"array\\\",\\\"items\\\":{\\\"type\\\":\\\"map\\\",\\\"values\\\":[]}}\"}", "{}", "{\"type\":\"fixed\",\"name\":\"union\",\"namespace\":\"[]\",\"doc\":\"[ ]\",\"size\":0}", (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type org.apache.avro.SchemaParseException; message: Illegal initial character: {\"type\":\"array\",\"items\":{\"type\":\"map\",\"values\":[]},\"union type:MAP pos:-1\":\"{\\\"type\\\":\\\"array\\\",\\\"items\\\":{\\\"type\\\":\\\"map\\\",\\\"values\\\":[]}}\"}");
        } catch (org.apache.avro.SchemaParseException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0933() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SchemaM3Random300Test1.test0933");
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
        org.apache.avro.Schema.Type type29 = schema27.getType();
        org.apache.avro.Schema schema30 = org.apache.avro.Schema.createMap(schema27);
        org.apache.avro.Schema schema31 = org.apache.avro.Schema.createArray(schema30);
        org.apache.avro.Schema schema32 = org.apache.avro.Schema.applyAliases(schema19, schema31);
        java.lang.String str33 = schema31.getDoc();
        org.apache.avro.Schema.Type type34 = schema31.getType();
        // The following exception was thrown during execution in test generation
        try {
            schema31.addAlias("{\r\n  \"type\" : \"fixed\",\r\n  \"name\" : \"union\",\r\n  \"namespace\" : \"[]\",\r\n  \"doc\" : \"[ ]\",\r\n  \"size\" : 0\r\n}");
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
        org.junit.Assert.assertNotNull(schemaArray20);
        org.junit.Assert.assertArrayEquals(schemaArray20, new org.apache.avro.Schema[] {});
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(schema23);
        org.junit.Assert.assertNotNull(schemaArray24);
        org.junit.Assert.assertArrayEquals(schemaArray24, new org.apache.avro.Schema[] {});
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(schema27);
        org.junit.Assert.assertNotNull(schema28);
        org.junit.Assert.assertTrue("'" + type29 + "' != '" + org.apache.avro.Schema.Type.UNION + "'", type29.equals(org.apache.avro.Schema.Type.UNION));
        org.junit.Assert.assertNotNull(schema30);
        org.junit.Assert.assertNotNull(schema31);
        org.junit.Assert.assertNotNull(schema32);
        org.junit.Assert.assertNull(str33);
        org.junit.Assert.assertTrue("'" + type34 + "' != '" + org.apache.avro.Schema.Type.ARRAY + "'", type34.equals(org.apache.avro.Schema.Type.ARRAY));
    }

    @Test
    public void test0934() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SchemaM3Random300Test1.test0934");
        org.apache.avro.Schema.Parser parser0 = new org.apache.avro.Schema.Parser();
        org.apache.avro.Schema.Parser parser2 = parser0.setValidate(true);
        boolean boolean3 = parser0.getValidate();
        java.io.File file4 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.avro.Schema schema5 = parser0.parse(file4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(parser2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
    }

    @Test
    public void test0935() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SchemaM3Random300Test1.test0935");
        org.apache.avro.Schema.Parser parser0 = new org.apache.avro.Schema.Parser();
        java.util.Map<java.lang.String, org.apache.avro.Schema> strMap1 = parser0.getTypes();
        java.util.Map<java.lang.String, org.apache.avro.Schema> strMap2 = parser0.getTypes();
        boolean boolean3 = parser0.getValidate();
        org.apache.avro.Schema.Parser parser5 = parser0.setValidate(true);
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
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(parser5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test0936() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SchemaM3Random300Test1.test0936");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.avro.Schema schema4 = org.apache.avro.Schema.createRecord("{\"type\":\"array\",\"items\":\"int\"}", "{\"type\":\"record\",\"fields\":[],\"{\\r\\n  \\\"type\\\" : \\\"fixed\\\",\\r\\n  \\\"name\\\" : \\\"union\\\",\\r\\n  \\\"namespace\\\" : \\\"[]\\\",\\r\\n  \\\"doc\\\" : \\\"[ ]\\\",\\r\\n  \\\"size\\\" : 0\\r\\n}\":\"[ ]\"}", "{\r\n  \"type\" : \"map\",\r\n  \"values\" : [ ]\r\n}", false);
            org.junit.Assert.fail("Expected exception of type org.apache.avro.SchemaParseException; message: Illegal initial character: {\"type\":\"array\",\"items\":\"int\"}");
        } catch (org.apache.avro.SchemaParseException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0937() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SchemaM3Random300Test1.test0937");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.avro.Schema schema4 = org.apache.avro.Schema.createFixed("{\"type\":\"array\",\"items\":[],\"union type:UNION pos:-1\":\"\"}", "{\"type\":\"fixed\",\"name\":\"union\",\"namespace\":\"[]\",\"doc\":\"{\\r\\n  \\\"type\\\" : \\\"map\\\",\\r\\n  \\\"values\\\" : [ ]\\r\\n}\",\"size\":10}", "map", 1);
            org.junit.Assert.fail("Expected exception of type org.apache.avro.SchemaParseException; message: Illegal initial character: {\"type\":\"array\",\"items\":[],\"union type:UNION pos:-1\":\"\"}");
        } catch (org.apache.avro.SchemaParseException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0938() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SchemaM3Random300Test1.test0938");
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
        java.lang.String str23 = schema21.getDoc();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.avro.Schema.Field field25 = schema21.getField("{null={\"type\":\"record\",\"fields\":[]}}");
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
        org.junit.Assert.assertNull(str23);
    }

    @Test
    public void test0939() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SchemaM3Random300Test1.test0939");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.avro.Schema schema4 = org.apache.avro.Schema.createRecord("{\"type\":\"array\",\"items\":{\"type\":\"map\",\"values\":[]}}", "{\"type\":\"array\",\"items\":\"null\"}", "{\r\n  \"type\" : \"array\",\r\n  \"items\" : {\r\n    \"type\" : \"map\",\r\n    \"values\" : [ ]\r\n  }\r\n}", true);
            org.junit.Assert.fail("Expected exception of type org.apache.avro.SchemaParseException; message: Illegal initial character: {\"type\":\"array\",\"items\":{\"type\":\"map\",\"values\":[]}}");
        } catch (org.apache.avro.SchemaParseException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0940() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SchemaM3Random300Test1.test0940");
        java.util.List<java.lang.String> strList3 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.avro.Schema schema4 = org.apache.avro.Schema.createEnum("{\"type\":\"record\",\"fields\":[],\"{\\r\\n  \\\"type\\\" : \\\"fixed\\\",\\r\\n  \\\"name\\\" : \\\"union\\\",\\r\\n  \\\"namespace\\\" : \\\"[]\\\",\\r\\n  \\\"doc\\\" : \\\"[ ]\\\",\\r\\n  \\\"size\\\" : 0\\r\\n}\":\"[ ]\"}", "float", "{\r\n  \"type\" : \"map\",\r\n  \"values\" : [ ]\r\n}", strList3);
            org.junit.Assert.fail("Expected exception of type org.apache.avro.SchemaParseException; message: Illegal initial character: {\"type\":\"record\",\"fields\":[],\"{\\r\\n  \\\"type\\\" : \\\"fixed\\\",\\r\\n  \\\"name\\\" : \\\"union\\\",\\r\\n  \\\"namespace\\\" : \\\"[]\\\",\\r\\n  \\\"doc\\\" : \\\"[ ]\\\",\\r\\n  \\\"size\\\" : 0\\r\\n}\":\"[ ]\"}");
        } catch (org.apache.avro.SchemaParseException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0941() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SchemaM3Random300Test1.test0941");
        org.apache.avro.Schema.LockableArrayList<java.lang.String> strList4 = new org.apache.avro.Schema.LockableArrayList<java.lang.String>((int) '#');
        // The following exception was thrown during execution in test generation
        try {
            org.apache.avro.Schema schema5 = org.apache.avro.Schema.createEnum("{\"type\":\"fixed\",\"name\":\"union\",\"namespace\":\"[]\",\"doc\":\"[ ]\",\"size\":0,\"aliases\":[\"union\"]}", "{\r\n  \"type\" : \"record\",\r\n  \"fields\" : [ ]\r\n}", "{\"type\":\"fixed\",\"name\":\"union\",\"namespace\":\"[]\",\"doc\":\"{\\r\\n  \\\"type\\\" : \\\"map\\\",\\r\\n  \\\"values\\\" : [ ]\\r\\n}\",\"size\":10}", (java.util.List<java.lang.String>) strList4);
            org.junit.Assert.fail("Expected exception of type org.apache.avro.SchemaParseException; message: Illegal initial character: {\"type\":\"fixed\",\"name\":\"union\",\"namespace\":\"[]\",\"doc\":\"[ ]\",\"size\":0,\"aliases\":[\"union\"]}");
        } catch (org.apache.avro.SchemaParseException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0942() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SchemaM3Random300Test1.test0942");
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
            org.apache.avro.Schema schema42 = parser12.parse(inputStream41);
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
    public void test0943() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SchemaM3Random300Test1.test0943");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.avro.Schema schema4 = org.apache.avro.Schema.createFixed("{}", "double", "{\r\n  \"type\" : \"map\",\r\n  \"values\" : {\r\n    \"type\" : \"record\",\r\n    \"fields\" : [ ]\r\n  }\r\n}", 0);
            org.junit.Assert.fail("Expected exception of type org.apache.avro.SchemaParseException; message: Illegal initial character: {}");
        } catch (org.apache.avro.SchemaParseException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0944() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SchemaM3Random300Test1.test0944");
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
        java.lang.String str24 = schema8.getName();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.avro.Schema.Field field26 = schema8.getField("{\"type\":\"record\",\"fields\":[],\"{\\r\\n  \\\"type\\\" : \\\"fixed\\\",\\r\\n  \\\"name\\\" : \\\"union\\\",\\r\\n  \\\"namespace\\\" : \\\"[]\\\",\\r\\n  \\\"doc\\\" : \\\"[ ]\\\",\\r\\n  \\\"size\\\" : 0\\r\\n}\":\"[ ]\"}");
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
        org.junit.Assert.assertNotNull(schema23);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "union" + "'", str24, "union");
    }

    @Test
    public void test0945() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SchemaM3Random300Test1.test0945");
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
            java.util.List<java.lang.String> strList10 = schema3.getEnumSymbols();
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
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "union" + "'", str9, "union");
    }

    @Test
    public void test0946() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SchemaM3Random300Test1.test0946");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.avro.Schema schema4 = org.apache.avro.Schema.createFixed("{\"type\":\"record\",\"fields\":[],\"{\\r\\n  \\\"type\\\" : \\\"fixed\\\",\\r\\n  \\\"name\\\" : \\\"union\\\",\\r\\n  \\\"namespace\\\" : \\\"[]\\\",\\r\\n  \\\"doc\\\" : \\\"[ ]\\\",\\r\\n  \\\"size\\\" : 0\\r\\n}\":\"[ ]\"}", "{\"type\":\"map\",\"values\":{\"type\":\"enum\",\"name\":\"union\",\"namespace\":\"[]\",\"doc\":\"{}\",\"symbols\":[]}}", "{}", 0);
            org.junit.Assert.fail("Expected exception of type org.apache.avro.SchemaParseException; message: Illegal initial character: {\"type\":\"record\",\"fields\":[],\"{\\r\\n  \\\"type\\\" : \\\"fixed\\\",\\r\\n  \\\"name\\\" : \\\"union\\\",\\r\\n  \\\"namespace\\\" : \\\"[]\\\",\\r\\n  \\\"doc\\\" : \\\"[ ]\\\",\\r\\n  \\\"size\\\" : 0\\r\\n}\":\"[ ]\"}");
        } catch (org.apache.avro.SchemaParseException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0947() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SchemaM3Random300Test1.test0947");
        org.apache.avro.Schema schema2 = org.apache.avro.Schema.parse("[]", false);
        // The following exception was thrown during execution in test generation
        try {
            schema2.addAlias("[]");
            org.junit.Assert.fail("Expected exception of type org.apache.avro.AvroRuntimeException; message: Not a named type: []");
        } catch (org.apache.avro.AvroRuntimeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(schema2);
    }

    @Test
    public void test0948() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SchemaM3Random300Test1.test0948");
        org.apache.avro.Schema.Type type0 = org.apache.avro.Schema.Type.INT;
        org.apache.avro.Schema schema1 = org.apache.avro.Schema.create(type0);
        org.apache.avro.Schema schema2 = org.apache.avro.Schema.createArray(schema1);
        schema1.addProp("union type:UNION pos:-1", "[ ]");
        org.apache.avro.Schema.Type type6 = schema1.getType();
        java.lang.String str7 = schema1.toString();
        org.junit.Assert.assertTrue("'" + type0 + "' != '" + org.apache.avro.Schema.Type.INT + "'", type0.equals(org.apache.avro.Schema.Type.INT));
        org.junit.Assert.assertNotNull(schema1);
        org.junit.Assert.assertNotNull(schema2);
        org.junit.Assert.assertTrue("'" + type6 + "' != '" + org.apache.avro.Schema.Type.INT + "'", type6.equals(org.apache.avro.Schema.Type.INT));
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "{\"type\":\"int\",\"union type:UNION pos:-1\":\"[ ]\"}" + "'", str7, "{\"type\":\"int\",\"union type:UNION pos:-1\":\"[ ]\"}");
    }

    @Test
    public void test0949() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SchemaM3Random300Test1.test0949");
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
        java.lang.String str12 = schema4.getName();
        org.apache.avro.Schema schema13 = org.apache.avro.Schema.createMap(schema4);
        // The following exception was thrown during execution in test generation
        try {
            schema13.addAlias("{\r\n  \"type\" : \"array\",\r\n  \"items\" : [ ],\r\n  \"{}\" : \"hi!\"\r\n}");
            org.junit.Assert.fail("Expected exception of type org.apache.avro.AvroRuntimeException; message: Not a named type: {\"type\":\"map\",\"values\":[]}");
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
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "union" + "'", str12, "union");
        org.junit.Assert.assertNotNull(schema13);
    }

    @Test
    public void test0950() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SchemaM3Random300Test1.test0950");
        org.apache.avro.Schema.LockableArrayList<java.lang.Cloneable> cloneableList1 = new org.apache.avro.Schema.LockableArrayList<java.lang.Cloneable>((int) (byte) 10);
        org.apache.avro.Schema.LockableArrayList<java.lang.Cloneable> cloneableList2 = new org.apache.avro.Schema.LockableArrayList<java.lang.Cloneable>((java.util.List<java.lang.Cloneable>) cloneableList1);
    }

    @Test
    public void test0951() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SchemaM3Random300Test1.test0951");
        org.apache.avro.Schema schema2 = org.apache.avro.Schema.parse("[ ]", false);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = schema2.isError();
            org.junit.Assert.fail("Expected exception of type org.apache.avro.AvroRuntimeException; message: Not a record: []");
        } catch (org.apache.avro.AvroRuntimeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(schema2);
    }

    @Test
    public void test0952() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SchemaM3Random300Test1.test0952");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.avro.Schema schema4 = org.apache.avro.Schema.createRecord("", "union type:UNION pos:-1", "union type:UNION pos:-1", false);
            org.junit.Assert.fail("Expected exception of type org.apache.avro.SchemaParseException; message: Empty name");
        } catch (org.apache.avro.SchemaParseException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0953() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SchemaM3Random300Test1.test0953");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.avro.Schema schema4 = org.apache.avro.Schema.createFixed("{\r\n  \"type\" : \"record\",\r\n  \"fields\" : [ ]\r\n}", "map", "{\"type\":\"array\",\"items\":{\"type\":\"map\",\"values\":[]}}", 0);
            org.junit.Assert.fail("Expected exception of type org.apache.avro.SchemaParseException; message: Illegal initial character: {??  \"type\" : \"record\",??  \"fields\" : [ ]??}");
        } catch (org.apache.avro.SchemaParseException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0954() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SchemaM3Random300Test1.test0954");
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
        org.apache.avro.Schema schema12 = org.apache.avro.Schema.createArray(schema11);
        // The following exception was thrown during execution in test generation
        try {
            int int13 = schema11.getFixedSize();
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
        org.junit.Assert.assertNotNull(schema11);
        org.junit.Assert.assertNotNull(schema12);
    }

    @Test
    public void test0955() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SchemaM3Random300Test1.test0955");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.avro.Schema schema4 = org.apache.avro.Schema.createRecord("hi!", "{\"type\":\"fixed\",\"name\":\"union\",\"namespace\":\"[]\",\"doc\":\"[ ]\",\"size\":0}", "[]", false);
            org.junit.Assert.fail("Expected exception of type org.apache.avro.SchemaParseException; message: Illegal character in: hi!");
        } catch (org.apache.avro.SchemaParseException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0956() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SchemaM3Random300Test1.test0956");
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
        java.lang.String str24 = schema23.getName();
        schema23.addProp("{}", "hi!");
        java.lang.String str28 = schema23.getDoc();
        org.apache.avro.Schema schema29 = schema23.getElementType();
        // The following exception was thrown during execution in test generation
        try {
            int int31 = schema29.getEnumOrdinal("{null={\"type\":\"fixed\",\"name\":\"union\",\"namespace\":\"[]\",\"doc\":\"[ ]\",\"size\":0}}");
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
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "[]" + "'", str22, "[]");
        org.junit.Assert.assertNotNull(schema23);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "array" + "'", str24, "array");
        org.junit.Assert.assertNull(str28);
        org.junit.Assert.assertNotNull(schema29);
    }

    @Test
    public void test0957() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SchemaM3Random300Test1.test0957");
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
        org.apache.avro.Schema.Field[] fieldArray14 = new org.apache.avro.Schema.Field[] {};
        java.util.ArrayList<org.apache.avro.Schema.Field> fieldList15 = new java.util.ArrayList<org.apache.avro.Schema.Field>();
        boolean boolean16 = java.util.Collections.addAll((java.util.Collection<org.apache.avro.Schema.Field>) fieldList15, fieldArray14);
        org.apache.avro.Schema schema17 = org.apache.avro.Schema.createRecord((java.util.List<org.apache.avro.Schema.Field>) fieldList15);
        java.util.List<org.apache.avro.Schema.Field> fieldList18 = schema17.getFields();
        org.apache.avro.Schema schema19 = org.apache.avro.Schema.createRecord(fieldList18);
        org.apache.avro.Schema schema20 = org.apache.avro.Schema.createRecord(fieldList18);
        org.apache.avro.Schema schema21 = org.apache.avro.Schema.createRecord(fieldList18);
        // The following exception was thrown during execution in test generation
        try {
            schema12.setFields(fieldList18);
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
        org.junit.Assert.assertNotNull(fieldArray14);
        org.junit.Assert.assertArrayEquals(fieldArray14, new org.apache.avro.Schema.Field[] {});
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(schema17);
        org.junit.Assert.assertNotNull(fieldList18);
        org.junit.Assert.assertNotNull(schema19);
        org.junit.Assert.assertNotNull(schema20);
        org.junit.Assert.assertNotNull(schema21);
    }

    @Test
    public void test0958() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SchemaM3Random300Test1.test0958");
        org.apache.avro.Schema.Parser parser1 = new org.apache.avro.Schema.Parser();
        org.apache.avro.Schema.Parser parser3 = parser1.setValidate(true);
        java.util.Map<java.lang.String, org.apache.avro.Schema> strMap4 = parser1.getTypes();
        boolean boolean5 = parser1.getValidate();
        org.apache.avro.Schema schema7 = parser1.parse("[ ]");
        org.codehaus.jackson.JsonNode jsonNode10 = org.apache.avro.Schema.parseJson("{\"type\":\"fixed\",\"name\":\"union\",\"namespace\":\"[]\",\"doc\":\"{\\r\\n  \\\"type\\\" : \\\"map\\\",\\r\\n  \\\"values\\\" : [ ]\\r\\n}\",\"size\":10}");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.avro.Schema.Field field11 = new org.apache.avro.Schema.Field("union type:UNION pos:-1", schema7, "{\r\n  \"type\" : \"record\",\r\n  \"fields\" : [ ]\r\n}", jsonNode10);
            org.junit.Assert.fail("Expected exception of type org.apache.avro.SchemaParseException; message: Illegal character in: union type:UNION pos:-1");
        } catch (org.apache.avro.SchemaParseException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(parser3);
        org.junit.Assert.assertNotNull(strMap4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(schema7);
        org.junit.Assert.assertNotNull(jsonNode10);
    }

    @Test
    public void test0959() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SchemaM3Random300Test1.test0959");
        org.apache.avro.Schema.LockableArrayList<java.lang.String> strList4 = new org.apache.avro.Schema.LockableArrayList<java.lang.String>((int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.avro.Schema schema5 = org.apache.avro.Schema.createEnum("union type:MAP pos:-1", "{\"type\":\"array\",\"items\":\"null\"}", "{\r\n  \"type\" : \"map\",\r\n  \"values\" : {\r\n    \"type\" : \"map\",\r\n    \"values\" : [ ]\r\n  }\r\n}", (java.util.List<java.lang.String>) strList4);
            org.junit.Assert.fail("Expected exception of type org.apache.avro.SchemaParseException; message: Illegal character in: union type:MAP pos:-1");
        } catch (org.apache.avro.SchemaParseException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0960() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SchemaM3Random300Test1.test0960");
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
        boolean boolean14 = parser12.getValidate();
        org.junit.Assert.assertNotNull(strMap1);
        org.junit.Assert.assertNotNull(strMap2);
        org.junit.Assert.assertNotNull(strMap4);
        org.junit.Assert.assertNotNull(parser5);
        org.junit.Assert.assertNotNull(schema7);
        org.junit.Assert.assertNotNull(parser9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(parser12);
        org.junit.Assert.assertNotNull(strMap13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test0961() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SchemaM3Random300Test1.test0961");
        org.apache.avro.Schema[] schemaArray0 = new org.apache.avro.Schema[] {};
        java.util.ArrayList<org.apache.avro.Schema> schemaList1 = new java.util.ArrayList<org.apache.avro.Schema>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<org.apache.avro.Schema>) schemaList1, schemaArray0);
        org.apache.avro.Schema schema3 = org.apache.avro.Schema.createUnion((java.util.List<org.apache.avro.Schema>) schemaList1);
        java.lang.String str4 = schema3.getFullName();
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<java.lang.String> strList5 = schema3.getEnumSymbols();
            org.junit.Assert.fail("Expected exception of type org.apache.avro.AvroRuntimeException; message: Not an enum: []");
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
    public void test0962() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SchemaM3Random300Test1.test0962");
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
        java.io.InputStream inputStream17 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.avro.Schema schema18 = parser0.parse(inputStream17);
            org.junit.Assert.fail("Expected exception of type java.io.EOFException; message: No content to map to Object due to end of input");
        } catch (java.io.EOFException e) {
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
    public void test0963() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SchemaM3Random300Test1.test0963");
        org.apache.avro.Schema.Parser parser0 = new org.apache.avro.Schema.Parser();
        org.apache.avro.Schema.Parser parser2 = parser0.setValidate(true);
        java.util.Map<java.lang.String, org.apache.avro.Schema> strMap3 = parser0.getTypes();
        org.apache.avro.Schema.Parser parser5 = parser0.setValidate(true);
        org.apache.avro.Schema.Parser parser7 = parser0.setValidate(true);
        java.util.Map<java.lang.String, org.apache.avro.Schema> strMap8 = parser0.getTypes();
        org.apache.avro.Schema.Parser parser10 = parser0.setValidate(false);
        org.apache.avro.Schema.Parser parser12 = parser10.setValidate(true);
        java.util.Map<java.lang.String, org.apache.avro.Schema> strMap13 = parser12.getTypes();
        org.junit.Assert.assertNotNull(parser2);
        org.junit.Assert.assertNotNull(strMap3);
        org.junit.Assert.assertNotNull(parser5);
        org.junit.Assert.assertNotNull(parser7);
        org.junit.Assert.assertNotNull(strMap8);
        org.junit.Assert.assertNotNull(parser10);
        org.junit.Assert.assertNotNull(parser12);
        org.junit.Assert.assertNotNull(strMap13);
    }

    @Test
    public void test0964() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SchemaM3Random300Test1.test0964");
        java.util.List<org.apache.avro.Schema.LockableArrayList<java.lang.String>> strListList0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.avro.Schema.LockableArrayList<org.apache.avro.Schema.LockableArrayList<java.lang.String>> strListList1 = new org.apache.avro.Schema.LockableArrayList<org.apache.avro.Schema.LockableArrayList<java.lang.String>>(strListList0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0965() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SchemaM3Random300Test1.test0965");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.avro.Schema schema4 = org.apache.avro.Schema.createFixed("", "{\r\n  \"type\" : \"map\",\r\n  \"values\" : {\r\n    \"type\" : \"record\",\r\n    \"fields\" : [ ]\r\n  }\r\n}", "{\r\n  \"type\" : \"fixed\",\r\n  \"name\" : \"union\",\r\n  \"namespace\" : \"[]\",\r\n  \"doc\" : \"[ ]\",\r\n  \"size\" : 0\r\n}", (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type org.apache.avro.SchemaParseException; message: Empty name");
        } catch (org.apache.avro.SchemaParseException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0966() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SchemaM3Random300Test1.test0966");
        org.codehaus.jackson.JsonNode jsonNode1 = org.apache.avro.Schema.parseJson("{\"type\":\"map\",\"values\":[],\"\\\"double\\\"\":\"{\\\"type\\\":\\\"array\\\",\\\"items\\\":\\\"int\\\"}\"}");
        org.junit.Assert.assertNotNull(jsonNode1);
    }

    @Test
    public void test0967() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SchemaM3Random300Test1.test0967");
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
            int int13 = schema12.getFixedSize();
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
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNotNull(schema12);
    }

    @Test
    public void test0968() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SchemaM3Random300Test1.test0968");
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
            boolean boolean36 = schema29.hasEnumSymbol("{\r\n  \"type\" : \"record\",\r\n  \"fields\" : [ ]\r\n}");
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
    public void test0969() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SchemaM3Random300Test1.test0969");
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
        java.lang.String str24 = schema23.getName();
        schema23.addProp("{}", "hi!");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Set<java.lang.String> strSet28 = schema23.getAliases();
            org.junit.Assert.fail("Expected exception of type org.apache.avro.AvroRuntimeException; message: Not a named type: {\"type\":\"array\",\"items\":[],\"{}\":\"hi!\"}");
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
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "array" + "'", str24, "array");
    }

    @Test
    public void test0970() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SchemaM3Random300Test1.test0970");
        org.codehaus.jackson.JsonNode jsonNode1 = org.apache.avro.Schema.parseJson("{\"type\":\"map\",\"values\":\"double\"}");
        org.junit.Assert.assertNotNull(jsonNode1);
    }

    @Test
    public void test0971() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SchemaM3Random300Test1.test0971");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.avro.Schema schema4 = org.apache.avro.Schema.createRecord("{\r\n  \"type\" : \"array\",\r\n  \"items\" : [ ],\r\n  \"{}\" : \"hi!\"\r\n}", "{\r\n  \"type\" : \"record\",\r\n  \"fields\" : [ ]\r\n}", "{\"type\":\"map\",\"values\":[]}", true);
            org.junit.Assert.fail("Expected exception of type org.apache.avro.SchemaParseException; message: Illegal initial character: {??  \"type\" : \"array\",??  \"items\" : [ ],??  \"{}\" : \"hi!\"??}");
        } catch (org.apache.avro.SchemaParseException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0972() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SchemaM3Random300Test1.test0972");
        org.apache.avro.Schema schema2 = org.apache.avro.Schema.parse("[]", true);
        org.apache.avro.Schema.Type type3 = schema2.getType();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.avro.Schema schema4 = org.apache.avro.Schema.create(type3);
            org.junit.Assert.fail("Expected exception of type org.apache.avro.AvroRuntimeException; message: Can't create a: UNION");
        } catch (org.apache.avro.AvroRuntimeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(schema2);
        org.junit.Assert.assertTrue("'" + type3 + "' != '" + org.apache.avro.Schema.Type.UNION + "'", type3.equals(org.apache.avro.Schema.Type.UNION));
    }

    @Test
    public void test0973() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SchemaM3Random300Test1.test0973");
        org.apache.avro.Schema.Type type0 = org.apache.avro.Schema.Type.FLOAT;
        org.apache.avro.Schema schema1 = org.apache.avro.Schema.create(type0);
        schema1.addProp("{\r\n  \"type\" : \"record\",\r\n  \"fields\" : [ ]\r\n}", "{\r\n  \"type\" : \"map\",\r\n  \"values\" : [ ]\r\n}");
        java.lang.String str6 = schema1.getProp("union type:MAP pos:-1");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean8 = schema1.hasEnumSymbol("{null={\"type\":\"fixed\",\"name\":\"union\",\"namespace\":\"[]\",\"doc\":\"[ ]\",\"size\":0}}");
            org.junit.Assert.fail("Expected exception of type org.apache.avro.AvroRuntimeException; message: Not an enum: {\"type\":\"float\",\"{\\r\\n  \\\"type\\\" : \\\"record\\\",\\r\\n  \\\"fields\\\" : [ ]\\r\\n}\":\"{\\r\\n  \\\"type\\\" : \\\"map\\\",\\r\\n  \\\"values\\\" : [ ]\\r\\n}\"}");
        } catch (org.apache.avro.AvroRuntimeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + type0 + "' != '" + org.apache.avro.Schema.Type.FLOAT + "'", type0.equals(org.apache.avro.Schema.Type.FLOAT));
        org.junit.Assert.assertNotNull(schema1);
        org.junit.Assert.assertNull(str6);
    }

    @Test
    public void test0974() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SchemaM3Random300Test1.test0974");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.avro.Schema schema4 = org.apache.avro.Schema.createFixed("{\"type\":\"map\",\"values\":{\"type\":\"array\",\"items\":{\"type\":\"map\",\"values\":[]},\"\":\"{\\r\\n  \\\"type\\\" : \\\"record\\\",\\r\\n  \\\"fields\\\" : [ ]\\r\\n}\"}}", "{\"type\":\"fixed\",\"name\":\"union\",\"namespace\":\"[]\",\"doc\":\"[ ]\",\"size\":0,\"aliases\":[\"union\"]}", "{null=null}", (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type org.apache.avro.SchemaParseException; message: Illegal initial character: {\"type\":\"map\",\"values\":{\"type\":\"array\",\"items\":{\"type\":\"map\",\"values\":[]},\"\":\"{\\r\\n  \\\"type\\\" : \\\"record\\\",\\r\\n  \\\"fields\\\" : [ ]\\r\\n}\"}}");
        } catch (org.apache.avro.SchemaParseException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0975() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SchemaM3Random300Test1.test0975");
        org.apache.avro.Schema.LockableArrayList<java.lang.Iterable<java.lang.String>> strIterableList0 = new org.apache.avro.Schema.LockableArrayList<java.lang.Iterable<java.lang.String>>();
    }

    @Test
    public void test0976() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SchemaM3Random300Test1.test0976");
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
        java.lang.String str13 = schema10.toString(true);
        java.lang.String str14 = schema10.getName();
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<org.apache.avro.Schema.Field> fieldList15 = schema10.getFields();
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
        org.junit.Assert.assertNotNull(schema11);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "{\r\n  \"type\" : \"map\",\r\n  \"values\" : [ ]\r\n}" + "'", str13, "{\r\n  \"type\" : \"map\",\r\n  \"values\" : [ ]\r\n}");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "map" + "'", str14, "map");
    }

    @Test
    public void test0977() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SchemaM3Random300Test1.test0977");
        org.apache.avro.Schema.LockableArrayList<java.lang.String> strList7 = new org.apache.avro.Schema.LockableArrayList<java.lang.String>((int) ' ');
        org.apache.avro.Schema schema8 = org.apache.avro.Schema.createEnum("int", "map", "\"double\"", (java.util.List<java.lang.String>) strList7);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.avro.Schema schema9 = org.apache.avro.Schema.createEnum("\"null\"", "\"double\"", "{\"type\":\"int\",\"union type:UNION pos:-1\":\"[ ]\"}", (java.util.List<java.lang.String>) strList7);
            org.junit.Assert.fail("Expected exception of type org.apache.avro.SchemaParseException; message: Illegal initial character: \"null\"");
        } catch (org.apache.avro.SchemaParseException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(schema8);
    }

    @Test
    public void test0978() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SchemaM3Random300Test1.test0978");
        org.apache.avro.Schema.LockableArrayList<java.lang.Enum<org.apache.avro.Schema.Field.Order>> orderEnumList0 = new org.apache.avro.Schema.LockableArrayList<java.lang.Enum<org.apache.avro.Schema.Field.Order>>();
    }

    @Test
    public void test0979() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SchemaM3Random300Test1.test0979");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.avro.Schema schema4 = org.apache.avro.Schema.createFixed("union type:UNION pos:-1", "{null={\"type\":\"map\",\"values\":[]}}", "array", (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type org.apache.avro.SchemaParseException; message: Illegal character in: union type:UNION pos:-1");
        } catch (org.apache.avro.SchemaParseException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0980() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SchemaM3Random300Test1.test0980");
        org.apache.avro.Schema.LockableArrayList<org.apache.avro.Schema.Type> typeList0 = new org.apache.avro.Schema.LockableArrayList<org.apache.avro.Schema.Type>();
        org.apache.avro.Schema.LockableArrayList<org.apache.avro.Schema.Type> typeList1 = new org.apache.avro.Schema.LockableArrayList<org.apache.avro.Schema.Type>((java.util.List<org.apache.avro.Schema.Type>) typeList0);
        org.apache.avro.Schema.LockableArrayList<org.apache.avro.Schema.Type> typeList2 = new org.apache.avro.Schema.LockableArrayList<org.apache.avro.Schema.Type>((java.util.List<org.apache.avro.Schema.Type>) typeList1);
    }

    @Test
    public void test0981() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SchemaM3Random300Test1.test0981");
        org.apache.avro.Schema.LockableArrayList<java.lang.String> strList4 = new org.apache.avro.Schema.LockableArrayList<java.lang.String>((int) (byte) 100);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.avro.Schema schema5 = org.apache.avro.Schema.createEnum("{\"type\":\"map\",\"values\":{\"type\":\"array\",\"items\":{\"type\":\"map\",\"values\":[]},\"\":\"{\\r\\n  \\\"type\\\" : \\\"record\\\",\\r\\n  \\\"fields\\\" : [ ]\\r\\n}\"}}", "[].union", "{\"type\":\"array\",\"items\":[]}", (java.util.List<java.lang.String>) strList4);
            org.junit.Assert.fail("Expected exception of type org.apache.avro.SchemaParseException; message: Illegal initial character: {\"type\":\"map\",\"values\":{\"type\":\"array\",\"items\":{\"type\":\"map\",\"values\":[]},\"\":\"{\\r\\n  \\\"type\\\" : \\\"record\\\",\\r\\n  \\\"fields\\\" : [ ]\\r\\n}\"}}");
        } catch (org.apache.avro.SchemaParseException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0982() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SchemaM3Random300Test1.test0982");
        org.apache.avro.Schema.Names names1 = new org.apache.avro.Schema.Names("\"null\"");
        int int2 = names1.size();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test0983() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SchemaM3Random300Test1.test0983");
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
        java.util.List<org.apache.avro.Schema.Field> fieldList25 = null;
        // The following exception was thrown during execution in test generation
        try {
            schema24.setFields(fieldList25);
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
    public void test0984() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SchemaM3Random300Test1.test0984");
        org.apache.avro.Schema.LockableArrayList<org.codehaus.jackson.JsonNode> jsonNodeList1 = new org.apache.avro.Schema.LockableArrayList<org.codehaus.jackson.JsonNode>((int) (short) 10);
    }

    @Test
    public void test0985() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SchemaM3Random300Test1.test0985");
        org.apache.avro.Schema schema1 = org.apache.avro.Schema.parse("{\"type\":\"array\",\"items\":{\"type\":\"array\",\"items\":{\"type\":\"map\",\"values\":[]}}}");
        schema1.addProp("map", "[]");
        org.junit.Assert.assertNotNull(schema1);
    }

    @Test
    public void test0986() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SchemaM3Random300Test1.test0986");
        org.apache.avro.Schema.Type type0 = org.apache.avro.Schema.Type.NULL;
        org.apache.avro.Schema schema1 = org.apache.avro.Schema.create(type0);
        org.apache.avro.Schema schema2 = org.apache.avro.Schema.create(type0);
        java.lang.String str4 = schema2.toString(true);
        org.apache.avro.Schema schema5 = org.apache.avro.Schema.createArray(schema2);
        schema5.addProp("{\"type\":\"array\",\"items\":{\"type\":\"map\",\"values\":[]}}", "{\r\n  \"type\" : \"map\",\r\n  \"values\" : [ ]\r\n}");
        java.lang.String str9 = schema5.getDoc();
        org.junit.Assert.assertTrue("'" + type0 + "' != '" + org.apache.avro.Schema.Type.NULL + "'", type0.equals(org.apache.avro.Schema.Type.NULL));
        org.junit.Assert.assertNotNull(schema1);
        org.junit.Assert.assertNotNull(schema2);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "\"null\"" + "'", str4, "\"null\"");
        org.junit.Assert.assertNotNull(schema5);
        org.junit.Assert.assertNull(str9);
    }

    @Test
    public void test0987() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SchemaM3Random300Test1.test0987");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.avro.Schema schema4 = org.apache.avro.Schema.createFixed("{null={\"type\":\"fixed\",\"name\":\"union\",\"namespace\":\"[]\",\"doc\":\"[ ]\",\"size\":0}}", "{\r\n  \"type\" : \"map\",\r\n  \"values\" : {\r\n    \"type\" : \"map\",\r\n    \"values\" : [ ]\r\n  }\r\n}", "{null=null}", 10);
            org.junit.Assert.fail("Expected exception of type org.apache.avro.SchemaParseException; message: Illegal initial character: {null={\"type\":\"fixed\",\"name\":\"union\",\"namespace\":\"[]\",\"doc\":\"[ ]\",\"size\":0}}");
        } catch (org.apache.avro.SchemaParseException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0988() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SchemaM3Random300Test1.test0988");
        org.codehaus.jackson.JsonNode jsonNode1 = org.apache.avro.Schema.parseJson("{\r\n  \"type\" : \"map\",\r\n  \"values\" : {\r\n    \"type\" : \"enum\",\r\n    \"name\" : \"union\",\r\n    \"namespace\" : \"[]\",\r\n    \"doc\" : \"{}\",\r\n    \"symbols\" : [ ]\r\n  }\r\n}");
        org.junit.Assert.assertNotNull(jsonNode1);
    }

    @Test
    public void test0989() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SchemaM3Random300Test1.test0989");
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
        java.io.InputStream inputStream14 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.avro.Schema schema15 = parser13.parse(inputStream14);
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
        org.junit.Assert.assertNotNull(parser13);
    }

    @Test
    public void test0990() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SchemaM3Random300Test1.test0990");
        org.apache.avro.Schema schema1 = org.apache.avro.Schema.parse("\"double\"");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Set<java.lang.String> strSet2 = schema1.getAliases();
            org.junit.Assert.fail("Expected exception of type org.apache.avro.AvroRuntimeException; message: Not a named type: \"double\"");
        } catch (org.apache.avro.AvroRuntimeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(schema1);
    }

    @Test
    public void test0991() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SchemaM3Random300Test1.test0991");
        org.apache.avro.Schema.Parser parser0 = new org.apache.avro.Schema.Parser();
        org.apache.avro.Schema.Parser parser2 = parser0.setValidate(true);
        org.apache.avro.Schema.Parser parser4 = parser0.setValidate(true);
        java.util.Map<java.lang.String, org.apache.avro.Schema> strMap5 = parser4.getTypes();
        org.apache.avro.Schema.Parser parser7 = parser4.setValidate(false);
        java.io.File file8 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.avro.Schema schema9 = parser7.parse(file8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(parser2);
        org.junit.Assert.assertNotNull(parser4);
        org.junit.Assert.assertNotNull(strMap5);
        org.junit.Assert.assertNotNull(parser7);
    }

    @Test
    public void test0992() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SchemaM3Random300Test1.test0992");
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
        org.apache.avro.Schema.Parser parser26 = parser12.setValidate(false);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.avro.Schema schema28 = parser12.parse("union type:UNION pos:-1");
            org.junit.Assert.fail("Expected exception of type org.apache.avro.SchemaParseException; message: org.codehaus.jackson.JsonParseException: Unexpected character ('u' (code 117)): expected a valid value (number, String, array, object, 'true', 'false' or 'null')? at [Source: java.io.StringReader@3c960f4; line: 1, column: 2]");
        } catch (org.apache.avro.SchemaParseException e) {
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
        org.junit.Assert.assertNotNull(strMap15);
        org.junit.Assert.assertNotNull(strMap16);
        org.junit.Assert.assertNotNull(parser19);
        org.junit.Assert.assertNotNull(strMap20);
        org.junit.Assert.assertNotNull(parser21);
        org.junit.Assert.assertNotNull(strMap22);
        org.junit.Assert.assertNotNull(parser23);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(parser26);
    }

    @Test
    public void test0993() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SchemaM3Random300Test1.test0993");
        org.apache.avro.Schema schema2 = org.apache.avro.Schema.parse("{\"type\":\"fixed\",\"name\":\"union\",\"namespace\":\"[]\",\"doc\":\"[ ]\",\"size\":0,\"aliases\":[\"union\"]}", false);
        org.junit.Assert.assertNotNull(schema2);
    }

    @Test
    public void test0994() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SchemaM3Random300Test1.test0994");
        org.apache.avro.Schema.Names names1 = new org.apache.avro.Schema.Names("[ ]");
        names1.space("{\r\n  \"type\" : \"record\",\r\n  \"fields\" : [ ]\r\n}");
        java.lang.Object obj4 = names1.clone();
        org.junit.Assert.assertNotNull(obj4);
        org.junit.Assert.assertEquals(obj4.toString(), "{}");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj4), "{}");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj4), "{}");
    }

    @Test
    public void test0995() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SchemaM3Random300Test1.test0995");
        java.util.List<java.lang.String> strList3 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.avro.Schema schema4 = org.apache.avro.Schema.createEnum("{\r\n  \"type\" : \"array\",\r\n  \"items\" : [ ]\r\n}", "double", "{\"type\":\"fixed\",\"name\":\"union\",\"namespace\":\"[]\",\"doc\":\"union type:UNION pos:-1\",\"size\":100}", strList3);
            org.junit.Assert.fail("Expected exception of type org.apache.avro.SchemaParseException; message: Illegal initial character: {??  \"type\" : \"array\",??  \"items\" : [ ]??}");
        } catch (org.apache.avro.SchemaParseException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0996() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SchemaM3Random300Test1.test0996");
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
        org.apache.avro.Schema schema21 = org.apache.avro.Schema.createMap(schema9);
        org.codehaus.jackson.JsonNode jsonNode23 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.avro.Schema.Field field24 = new org.apache.avro.Schema.Field("{\"type\":\"array\",\"items\":{\"type\":\"map\",\"values\":[]},\"union type:MAP pos:-1\":\"{\\\"type\\\":\\\"array\\\",\\\"items\\\":{\\\"type\\\":\\\"map\\\",\\\"values\\\":[]}}\"}", schema9, "{\"type\":\"record\",\"fields\":[]}", jsonNode23);
            org.junit.Assert.fail("Expected exception of type org.apache.avro.SchemaParseException; message: Illegal initial character: {\"type\":\"array\",\"items\":{\"type\":\"map\",\"values\":[]},\"union type:MAP pos:-1\":\"{\\\"type\\\":\\\"array\\\",\\\"items\\\":{\\\"type\\\":\\\"map\\\",\\\"values\\\":[]}}\"}");
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
        org.junit.Assert.assertNotNull(schema21);
    }

    @Test
    public void test0997() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SchemaM3Random300Test1.test0997");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.avro.Schema schema4 = org.apache.avro.Schema.createRecord("[ ]", "{\"type\":\"array\",\"items\":[]}", "{\"type\":\"array\",\"items\":[],\"union type:UNION pos:-1\":\"\"}", true);
            org.junit.Assert.fail("Expected exception of type org.apache.avro.SchemaParseException; message: Illegal initial character: [ ]");
        } catch (org.apache.avro.SchemaParseException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0998() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SchemaM3Random300Test1.test0998");
        org.apache.avro.Schema.Parser parser0 = new org.apache.avro.Schema.Parser();
        java.util.Map<java.lang.String, org.apache.avro.Schema> strMap1 = parser0.getTypes();
        java.util.Map<java.lang.String, org.apache.avro.Schema> strMap2 = parser0.getTypes();
        org.apache.avro.Schema.Parser parser3 = new org.apache.avro.Schema.Parser();
        org.apache.avro.Schema.Parser parser5 = parser3.setValidate(true);
        java.util.Map<java.lang.String, org.apache.avro.Schema> strMap6 = parser3.getTypes();
        org.apache.avro.Schema.Parser parser7 = parser0.addTypes(strMap6);
        java.util.Map<java.lang.String, org.apache.avro.Schema> strMap8 = parser0.getTypes();
        org.apache.avro.Schema.Parser parser10 = parser0.setValidate(false);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.avro.Schema schema12 = parser10.parse("union type:MAP pos:-1");
            org.junit.Assert.fail("Expected exception of type org.apache.avro.SchemaParseException; message: org.codehaus.jackson.JsonParseException: Unexpected character ('u' (code 117)): expected a valid value (number, String, array, object, 'true', 'false' or 'null')? at [Source: java.io.StringReader@7b965b1b; line: 1, column: 2]");
        } catch (org.apache.avro.SchemaParseException e) {
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
    public void test0999() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SchemaM3Random300Test1.test0999");
        org.apache.avro.Schema.Parser parser0 = new org.apache.avro.Schema.Parser();
        java.util.Map<java.lang.String, org.apache.avro.Schema> strMap1 = parser0.getTypes();
        java.util.Map<java.lang.String, org.apache.avro.Schema> strMap2 = parser0.getTypes();
        boolean boolean3 = parser0.getValidate();
        org.apache.avro.Schema.Parser parser5 = parser0.setValidate(true);
        org.apache.avro.Schema schema7 = parser5.parse("\"null\"");
        // The following exception was thrown during execution in test generation
        try {
            int int9 = schema7.getEnumOrdinal("union type:MAP pos:-1");
            org.junit.Assert.fail("Expected exception of type org.apache.avro.AvroRuntimeException; message: Not an enum: \"null\"");
        } catch (org.apache.avro.AvroRuntimeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strMap1);
        org.junit.Assert.assertNotNull(strMap2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(parser5);
        org.junit.Assert.assertNotNull(schema7);
    }

    @Test
    public void test1000() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SchemaM3Random300Test1.test1000");
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
            schema11.addAlias("{\"type\":\"array\",\"items\":\"int\"}");
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
}

