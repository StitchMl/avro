package org.apache.avro;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class SchemaM3Random300Test3 {

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
    public void test1501() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SchemaM3Random300Test3.test1501");
        org.apache.avro.Schema.Type type0 = org.apache.avro.Schema.Type.INT;
        org.apache.avro.Schema schema1 = org.apache.avro.Schema.create(type0);
        org.apache.avro.Schema schema2 = org.apache.avro.Schema.createArray(schema1);
        schema1.addProp("union type:UNION pos:-1", "[ ]");
        org.apache.avro.Schema.Type type6 = schema1.getType();
        org.apache.avro.Schema schema7 = org.apache.avro.Schema.create(type6);
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<java.lang.String> strList8 = schema7.getEnumSymbols();
            org.junit.Assert.fail("Expected exception of type org.apache.avro.AvroRuntimeException; message: Not an enum: \"int\"");
        } catch (org.apache.avro.AvroRuntimeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + type0 + "' != '" + org.apache.avro.Schema.Type.INT + "'", type0.equals(org.apache.avro.Schema.Type.INT));
        org.junit.Assert.assertNotNull(schema1);
        org.junit.Assert.assertNotNull(schema2);
        org.junit.Assert.assertTrue("'" + type6 + "' != '" + org.apache.avro.Schema.Type.INT + "'", type6.equals(org.apache.avro.Schema.Type.INT));
        org.junit.Assert.assertNotNull(schema7);
    }

    @Test
    public void test1502() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SchemaM3Random300Test3.test1502");
        org.apache.avro.Schema.Parser parser0 = new org.apache.avro.Schema.Parser();
        java.util.Map<java.lang.String, org.apache.avro.Schema> strMap1 = parser0.getTypes();
        org.apache.avro.Schema.Parser parser3 = parser0.setValidate(false);
        org.apache.avro.Schema schema5 = parser0.parse("{\r\n  \"type\" : \"array\",\r\n  \"items\" : \"int\"\r\n}");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.avro.Schema schema7 = parser0.parse("{}");
            org.junit.Assert.fail("Expected exception of type org.apache.avro.SchemaParseException; message: No type: {}");
        } catch (org.apache.avro.SchemaParseException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strMap1);
        org.junit.Assert.assertNotNull(parser3);
        org.junit.Assert.assertNotNull(schema5);
    }

    @Test
    public void test1503() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SchemaM3Random300Test3.test1503");
        org.apache.avro.Schema.LockableArrayList<org.apache.avro.Schema> schemaList1 = new org.apache.avro.Schema.LockableArrayList<org.apache.avro.Schema>(1);
        org.apache.avro.Schema schema2 = org.apache.avro.Schema.createUnion((java.util.List<org.apache.avro.Schema>) schemaList1);
        org.apache.avro.Schema schema3 = org.apache.avro.Schema.createUnion((java.util.List<org.apache.avro.Schema>) schemaList1);
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<org.apache.avro.Schema.Field> fieldList4 = schema3.getFields();
            org.junit.Assert.fail("Expected exception of type org.apache.avro.AvroRuntimeException; message: Not a record: []");
        } catch (org.apache.avro.AvroRuntimeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(schema2);
        org.junit.Assert.assertNotNull(schema3);
    }

    @Test
    public void test1504() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SchemaM3Random300Test3.test1504");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.avro.Schema schema2 = org.apache.avro.Schema.parse("union type:UNION pos:-1", true);
            org.junit.Assert.fail("Expected exception of type org.apache.avro.SchemaParseException; message: org.codehaus.jackson.JsonParseException: Unexpected character ('u' (code 117)): expected a valid value (number, String, array, object, 'true', 'false' or 'null')? at [Source: java.io.StringReader@a2dee30; line: 1, column: 2]");
        } catch (org.apache.avro.SchemaParseException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1505() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SchemaM3Random300Test3.test1505");
        org.apache.avro.Schema.LockableArrayList<org.apache.avro.Schema> schemaList1 = new org.apache.avro.Schema.LockableArrayList<org.apache.avro.Schema>((int) (short) 100);
        org.apache.avro.Schema schema2 = org.apache.avro.Schema.createUnion((java.util.List<org.apache.avro.Schema>) schemaList1);
        org.apache.avro.Schema schema3 = org.apache.avro.Schema.createUnion((java.util.List<org.apache.avro.Schema>) schemaList1);
        org.junit.Assert.assertNotNull(schema2);
        org.junit.Assert.assertNotNull(schema3);
    }

    @Test
    public void test1506() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SchemaM3Random300Test3.test1506");
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
        boolean boolean17 = parser16.getValidate();
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
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
    }

    @Test
    public void test1507() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SchemaM3Random300Test3.test1507");
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
        org.apache.avro.Schema schema14 = parser0.parse("{\r\n  \"type\" : \"fixed\",\r\n  \"name\" : \"union\",\r\n  \"namespace\" : \"[]\",\r\n  \"doc\" : \"[ ]\",\r\n  \"size\" : 0\r\n}");
        org.apache.avro.Schema.Parser parser15 = new org.apache.avro.Schema.Parser();
        java.util.Map<java.lang.String, org.apache.avro.Schema> strMap16 = parser15.getTypes();
        org.apache.avro.Schema.Parser parser17 = new org.apache.avro.Schema.Parser();
        org.apache.avro.Schema.Parser parser19 = parser17.setValidate(true);
        java.util.Map<java.lang.String, org.apache.avro.Schema> strMap20 = parser17.getTypes();
        org.apache.avro.Schema.Parser parser21 = parser15.addTypes(strMap20);
        boolean boolean22 = parser15.getValidate();
        org.apache.avro.Schema.Parser parser23 = new org.apache.avro.Schema.Parser();
        java.util.Map<java.lang.String, org.apache.avro.Schema> strMap24 = parser23.getTypes();
        java.util.Map<java.lang.String, org.apache.avro.Schema> strMap25 = parser23.getTypes();
        org.apache.avro.Schema.Parser parser26 = new org.apache.avro.Schema.Parser();
        org.apache.avro.Schema.Parser parser28 = parser26.setValidate(true);
        java.util.Map<java.lang.String, org.apache.avro.Schema> strMap29 = parser26.getTypes();
        org.apache.avro.Schema.Parser parser30 = parser23.addTypes(strMap29);
        org.apache.avro.Schema.Parser parser31 = parser15.addTypes(strMap29);
        org.apache.avro.Schema.Parser parser32 = parser0.addTypes(strMap29);
        org.junit.Assert.assertNotNull(strMap1);
        org.junit.Assert.assertNotNull(strMap2);
        org.junit.Assert.assertNotNull(strMap4);
        org.junit.Assert.assertNotNull(parser5);
        org.junit.Assert.assertNotNull(parser7);
        org.junit.Assert.assertNotNull(parser9);
        org.junit.Assert.assertNotNull(strMap10);
        org.junit.Assert.assertNotNull(schema12);
        org.junit.Assert.assertNotNull(schema14);
        org.junit.Assert.assertNotNull(strMap16);
        org.junit.Assert.assertNotNull(parser19);
        org.junit.Assert.assertNotNull(strMap20);
        org.junit.Assert.assertNotNull(parser21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertNotNull(strMap24);
        org.junit.Assert.assertNotNull(strMap25);
        org.junit.Assert.assertNotNull(parser28);
        org.junit.Assert.assertNotNull(strMap29);
        org.junit.Assert.assertNotNull(parser30);
        org.junit.Assert.assertNotNull(parser31);
        org.junit.Assert.assertNotNull(parser32);
    }

    @Test
    public void test1508() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SchemaM3Random300Test3.test1508");
        org.apache.avro.Schema schema3 = org.apache.avro.Schema.parse("{\"type\":\"fixed\",\"name\":\"union\",\"namespace\":\"[]\",\"doc\":\"union type:UNION pos:-1\",\"size\":100}", true);
        org.codehaus.jackson.JsonNode jsonNode6 = org.apache.avro.Schema.parseJson("[ ]");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.avro.Schema.Field field7 = new org.apache.avro.Schema.Field("{\"type\":\"map\",\"values\":{\"type\":\"enum\",\"name\":\"union\",\"namespace\":\"double\",\"doc\":\"union\",\"symbols\":[]}}", schema3, "union type:UNION pos:-1", jsonNode6);
            org.junit.Assert.fail("Expected exception of type org.apache.avro.SchemaParseException; message: Illegal initial character: {\"type\":\"map\",\"values\":{\"type\":\"enum\",\"name\":\"union\",\"namespace\":\"double\",\"doc\":\"union\",\"symbols\":[]}}");
        } catch (org.apache.avro.SchemaParseException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(schema3);
        org.junit.Assert.assertNotNull(jsonNode6);
    }

    @Test
    public void test1509() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SchemaM3Random300Test3.test1509");
        org.apache.avro.Schema.Parser parser0 = new org.apache.avro.Schema.Parser();
        java.util.Map<java.lang.String, org.apache.avro.Schema> strMap1 = parser0.getTypes();
        org.apache.avro.Schema.Parser parser3 = parser0.setValidate(false);
        boolean boolean4 = parser3.getValidate();
        org.apache.avro.Schema.Parser parser5 = new org.apache.avro.Schema.Parser();
        java.util.Map<java.lang.String, org.apache.avro.Schema> strMap6 = parser5.getTypes();
        java.util.Map<java.lang.String, org.apache.avro.Schema> strMap7 = parser5.getTypes();
        org.apache.avro.Schema.Parser parser8 = parser3.addTypes(strMap7);
        org.apache.avro.Schema.Parser parser10 = parser8.setValidate(false);
        org.junit.Assert.assertNotNull(strMap1);
        org.junit.Assert.assertNotNull(parser3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(strMap6);
        org.junit.Assert.assertNotNull(strMap7);
        org.junit.Assert.assertNotNull(parser8);
        org.junit.Assert.assertNotNull(parser10);
    }

    @Test
    public void test1510() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SchemaM3Random300Test3.test1510");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.avro.Schema schema4 = org.apache.avro.Schema.createFixed("{\"type\":\"fixed\",\"name\":\"union\",\"namespace\":\"[]\",\"doc\":\"union type:UNION pos:-1\",\"size\":100}", "{\r\n  \"type\" : \"record\",\r\n  \"fields\" : [ ]\r\n}", "map", (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type org.apache.avro.SchemaParseException; message: Illegal initial character: {\"type\":\"fixed\",\"name\":\"union\",\"namespace\":\"[]\",\"doc\":\"union type:UNION pos:-1\",\"size\":100}");
        } catch (org.apache.avro.SchemaParseException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1511() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SchemaM3Random300Test3.test1511");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.avro.Schema schema4 = org.apache.avro.Schema.createRecord("{\r\n  \"type\" : \"record\",\r\n  \"fields\" : [ ],\r\n  \"{\\\"type\\\":\\\"array\\\",\\\"items\\\":[],\\\"union type:UNION pos:-1\\\":\\\"\\\"}\" : \"{null={\\\"type\\\":\\\"map\\\",\\\"values\\\":[]}}\"\r\n}", "{\r\n  \"type\" : \"record\",\r\n  \"fields\" : [ ]\r\n}", "{null=[]}", false);
            org.junit.Assert.fail("Expected exception of type org.apache.avro.SchemaParseException; message: Illegal initial character: {??  \"type\" : \"record\",??  \"fields\" : [ ],??  \"{\\\"type\\\":\\\"array\\\",\\\"items\\\":[],\\\"union type:UNION pos:-1\\\":\\\"\\\"}\" : \"{null={\\\"type\\\":\\\"map\\\",\\\"values\\\":[]}}\"??}");
        } catch (org.apache.avro.SchemaParseException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1512() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SchemaM3Random300Test3.test1512");
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
            int int36 = schema31.getEnumOrdinal("{\r\n  \"type\" : \"array\",\r\n  \"items\" : [ ]\r\n}");
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
    public void test1513() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SchemaM3Random300Test3.test1513");
        java.lang.String[] strArray40 = new java.lang.String[] { "{\"type\":\"map\",\"values\":{\"type\":\"array\",\"items\":{\"type\":\"map\",\"values\":[]},\"\":\"{\\r\\n  \\\"type\\\" : \\\"record\\\",\\r\\n  \\\"fields\\\" : [ ]\\r\\n}\"}}", "{\r\n  \"type\" : \"array\",\r\n  \"items\" : {\r\n    \"type\" : \"map\",\r\n    \"values\" : [ ]\r\n  }\r\n}", "{\"type\":\"map\",\"values\":{\"type\":\"enum\",\"name\":\"union\",\"namespace\":\"[]\",\"doc\":\"{}\",\"symbols\":[]}}", "{\"type\":\"array\",\"items\":[],\"union type:UNION pos:-1\":\"\"}", "[].union", "{\"type\":\"record\",\"fields\":[]}", "{\"type\":\"fixed\",\"name\":\"union\",\"namespace\":\"[]\",\"doc\":\"[ ]\",\"size\":0,\"aliases\":[\"union\"]}", "{\"type\":\"map\",\"values\":{\"type\":\"enum\",\"name\":\"union\",\"namespace\":\"double\",\"doc\":\"union\",\"symbols\":[]}}", "{\"type\":\"fixed\",\"name\":\"union\",\"namespace\":\"[]\",\"doc\":\"union type:UNION pos:-1\",\"size\":100}", "[]", "{\"type\":\"map\",\"values\":[],\"\\\"double\\\"\":\"{\\\"type\\\":\\\"array\\\",\\\"items\\\":\\\"int\\\"}\"}", "map", "{null={\"type\":\"record\",\"fields\":[]}}", "{\"type\":\"map\",\"values\":[],\"\\\"double\\\"\":\"{\\\"type\\\":\\\"array\\\",\\\"items\\\":\\\"int\\\"}\"}", "{\"type\":\"fixed\",\"name\":\"union\",\"namespace\":\"[]\",\"doc\":\"union type:UNION pos:-1\",\"size\":100}", "{\r\n  \"type\" : \"array\",\r\n  \"items\" : [ ],\r\n  \"{}\" : \"hi!\"\r\n}", "{\"type\":\"array\",\"items\":[],\"union type:UNION pos:-1\":\"\"}", "{\"type\":\"fixed\",\"name\":\"union\",\"namespace\":\"[]\",\"doc\":\"union type:UNION pos:-1\",\"size\":100}", "{\"type\":\"map\",\"values\":[],\"\\\"double\\\"\":\"{\\\"type\\\":\\\"array\\\",\\\"items\\\":\\\"int\\\"}\"}", "{\"type\":\"map\",\"values\":{\"type\":\"record\",\"fields\":[]}}", "{\"type\":\"fixed\",\"name\":\"union\",\"namespace\":\"[]\",\"doc\":\"union type:UNION pos:-1\",\"size\":100}", "{}.union", "array", "{\"type\":\"int\",\"union type:UNION pos:-1\":\"[ ]\"}", "{\"type\":\"float\",\"{\\r\\n  \\\"type\\\" : \\\"record\\\",\\r\\n  \\\"fields\\\" : [ ]\\r\\n}\":\"{\\r\\n  \\\"type\\\" : \\\"map\\\",\\r\\n  \\\"values\\\" : [ ]\\r\\n}\"}", "{\"type\":\"record\",\"fields\":[],\"{\\r\\n  \\\"type\\\" : \\\"map\\\",\\r\\n  \\\"values\\\" : {\\r\\n    \\\"type\\\" : \\\"map\\\",\\r\\n    \\\"values\\\" : [ ]\\r\\n  }\\r\\n}\":\"{}\"}", "{null={\"type\":\"map\",\"values\":[]}}", "int", "{\"type\":\"map\",\"values\":{\"type\":\"enum\",\"name\":\"union\",\"namespace\":\"double\",\"doc\":\"union\",\"symbols\":[]}}", "{\"type\":\"map\",\"values\":{\"type\":\"enum\",\"name\":\"union\",\"namespace\":\"double\",\"doc\":\"union\",\"symbols\":[]}}", "{null={\"type\":\"map\",\"values\":[]}}", "{\"type\":\"array\",\"items\":{\"type\":\"record\",\"fields\":[]}}", "{\"type\":\"map\",\"values\":[]}", "hi!", "{\r\n  \"type\" : \"map\",\r\n  \"values\" : {\r\n    \"type\" : \"enum\",\r\n    \"name\" : \"union\",\r\n    \"namespace\" : \"[]\",\r\n    \"doc\" : \"{}\",\r\n    \"symbols\" : [ ]\r\n  }\r\n}", "union type:FIXED pos:-1", "{null=[]}" };
        java.util.ArrayList<java.lang.String> strList41 = new java.util.ArrayList<java.lang.String>();
        boolean boolean42 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList41, strArray40);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.avro.Schema schema43 = org.apache.avro.Schema.createEnum("{\r\n  \"type\" : \"fixed\",\r\n  \"name\" : \"union\",\r\n  \"namespace\" : \"{}\",\r\n  \"doc\" : \"hi!\",\r\n  \"size\" : 1\r\n}", "{\"type\":\"map\",\"values\":[],\"\\\"double\\\"\":\"{\\\"type\\\":\\\"array\\\",\\\"items\\\":\\\"int\\\"}\"}", "union type:FIXED pos:-1", (java.util.List<java.lang.String>) strList41);
            org.junit.Assert.fail("Expected exception of type org.apache.avro.SchemaParseException; message: Illegal initial character: {??  \"type\" : \"fixed\",??  \"name\" : \"union\",??  \"namespace\" : \"{}\",??  \"doc\" : \"hi!\",??  \"size\" : 1??}");
        } catch (org.apache.avro.SchemaParseException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray40);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + true + "'", boolean42 == true);
    }

    @Test
    public void test1514() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SchemaM3Random300Test3.test1514");
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
        org.apache.avro.Schema.Type type28 = schema27.getType();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.avro.Schema schema29 = org.apache.avro.Schema.create(type28);
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
        org.junit.Assert.assertTrue("'" + type28 + "' != '" + org.apache.avro.Schema.Type.UNION + "'", type28.equals(org.apache.avro.Schema.Type.UNION));
    }

    @Test
    public void test1515() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SchemaM3Random300Test3.test1515");
        org.apache.avro.Schema schema1 = org.apache.avro.Schema.parse("{\"type\":\"array\",\"items\":[]}");
        java.lang.String str2 = schema1.getName();
        java.lang.String str3 = schema1.getDoc();
        // The following exception was thrown during execution in test generation
        try {
            int int4 = schema1.getFixedSize();
            org.junit.Assert.fail("Expected exception of type org.apache.avro.AvroRuntimeException; message: Not fixed: {\"type\":\"array\",\"items\":[]}");
        } catch (org.apache.avro.AvroRuntimeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(schema1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "array" + "'", str2, "array");
        org.junit.Assert.assertNull(str3);
    }

    @Test
    public void test1516() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SchemaM3Random300Test3.test1516");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.avro.Schema schema4 = org.apache.avro.Schema.createFixed("{\r\n  \"type\" : \"record\",\r\n  \"fields\" : [ ]\r\n}", "{\"type\":\"fixed\",\"name\":\"union\",\"namespace\":\"[]\",\"doc\":\"{\\r\\n  \\\"type\\\" : \\\"map\\\",\\r\\n  \\\"values\\\" : [ ]\\r\\n}\",\"size\":10}", "", (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type org.apache.avro.SchemaParseException; message: Illegal initial character: {??  \"type\" : \"record\",??  \"fields\" : [ ]??}");
        } catch (org.apache.avro.SchemaParseException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1517() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SchemaM3Random300Test3.test1517");
        org.apache.avro.Schema.LockableArrayList<java.util.AbstractList<java.lang.String>> strListList1 = new org.apache.avro.Schema.LockableArrayList<java.util.AbstractList<java.lang.String>>((int) (short) 100);
    }

    @Test
    public void test1518() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SchemaM3Random300Test3.test1518");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.avro.Schema schema4 = org.apache.avro.Schema.createFixed("union type:MAP pos:-1", "[].union", "{\"type\":\"map\",\"values\":{\"type\":\"array\",\"items\":\"int\"}}", (int) 'a');
            org.junit.Assert.fail("Expected exception of type org.apache.avro.SchemaParseException; message: Illegal character in: union type:MAP pos:-1");
        } catch (org.apache.avro.SchemaParseException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1519() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SchemaM3Random300Test3.test1519");
        org.apache.avro.Schema.LockableArrayList<org.apache.avro.Schema.Field> fieldList1 = new org.apache.avro.Schema.LockableArrayList<org.apache.avro.Schema.Field>(0);
        org.apache.avro.Schema schema2 = org.apache.avro.Schema.createRecord((java.util.List<org.apache.avro.Schema.Field>) fieldList1);
        org.apache.avro.Schema.Field field4 = schema2.getField("[]");
        java.lang.String str6 = schema2.toString(true);
        org.junit.Assert.assertNotNull(schema2);
        org.junit.Assert.assertNull(field4);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "{\r\n  \"type\" : \"record\",\r\n  \"fields\" : [ ]\r\n}" + "'", str6, "{\r\n  \"type\" : \"record\",\r\n  \"fields\" : [ ]\r\n}");
    }

    @Test
    public void test1520() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SchemaM3Random300Test3.test1520");
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
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<org.apache.avro.Schema.Field> fieldList26 = schema25.getFields();
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
    }

    @Test
    public void test1521() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SchemaM3Random300Test3.test1521");
        org.apache.avro.Schema.Parser parser0 = new org.apache.avro.Schema.Parser();
        java.util.Map<java.lang.String, org.apache.avro.Schema> strMap1 = parser0.getTypes();
        java.util.Map<java.lang.String, org.apache.avro.Schema> strMap2 = parser0.getTypes();
        org.apache.avro.Schema.Parser parser3 = new org.apache.avro.Schema.Parser();
        java.util.Map<java.lang.String, org.apache.avro.Schema> strMap4 = parser3.getTypes();
        org.apache.avro.Schema.Parser parser5 = parser0.addTypes(strMap4);
        org.apache.avro.Schema schema7 = parser0.parse("{\r\n  \"type\" : \"map\",\r\n  \"values\" : [ ]\r\n}");
        org.apache.avro.Schema schema8 = schema7.getValueType();
        java.lang.String str9 = schema7.getName();
        org.apache.avro.Schema schema10 = schema7.getValueType();
        org.apache.avro.Schema.Type type11 = schema10.getType();
        org.junit.Assert.assertNotNull(strMap1);
        org.junit.Assert.assertNotNull(strMap2);
        org.junit.Assert.assertNotNull(strMap4);
        org.junit.Assert.assertNotNull(parser5);
        org.junit.Assert.assertNotNull(schema7);
        org.junit.Assert.assertNotNull(schema8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "map" + "'", str9, "map");
        org.junit.Assert.assertNotNull(schema10);
        org.junit.Assert.assertTrue("'" + type11 + "' != '" + org.apache.avro.Schema.Type.UNION + "'", type11.equals(org.apache.avro.Schema.Type.UNION));
    }

    @Test
    public void test1522() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SchemaM3Random300Test3.test1522");
        org.apache.avro.Schema.Type type0 = org.apache.avro.Schema.Type.NULL;
        org.apache.avro.Schema schema1 = org.apache.avro.Schema.create(type0);
        org.apache.avro.Schema schema2 = org.apache.avro.Schema.create(type0);
        java.lang.String str4 = schema2.toString(true);
        java.lang.String str6 = schema2.toString(false);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.avro.Schema schema7 = schema2.getValueType();
            org.junit.Assert.fail("Expected exception of type org.apache.avro.AvroRuntimeException; message: Not a map: \"null\"");
        } catch (org.apache.avro.AvroRuntimeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + type0 + "' != '" + org.apache.avro.Schema.Type.NULL + "'", type0.equals(org.apache.avro.Schema.Type.NULL));
        org.junit.Assert.assertNotNull(schema1);
        org.junit.Assert.assertNotNull(schema2);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "\"null\"" + "'", str4, "\"null\"");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "\"null\"" + "'", str6, "\"null\"");
    }

    @Test
    public void test1523() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SchemaM3Random300Test3.test1523");
        org.codehaus.jackson.JsonNode jsonNode1 = org.apache.avro.Schema.parseJson("{\"type\":\"array\",\"items\":[],\"{}\":\"hi!\"}");
        org.junit.Assert.assertNotNull(jsonNode1);
    }

    @Test
    public void test1524() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SchemaM3Random300Test3.test1524");
        org.apache.avro.Schema.Parser parser0 = new org.apache.avro.Schema.Parser();
        org.apache.avro.Schema.Parser parser2 = parser0.setValidate(true);
        java.util.Map<java.lang.String, org.apache.avro.Schema> strMap3 = parser0.getTypes();
        boolean boolean4 = parser0.getValidate();
        org.apache.avro.Schema schema6 = parser0.parse("[ ]");
        java.lang.String str8 = schema6.getProp("{\"type\":\"fixed\",\"name\":\"map\",\"namespace\":\"\",\"doc\":\"array\",\"size\":97}");
        org.junit.Assert.assertNotNull(parser2);
        org.junit.Assert.assertNotNull(strMap3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(schema6);
        org.junit.Assert.assertNull(str8);
    }

    @Test
    public void test1525() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SchemaM3Random300Test3.test1525");
        org.apache.avro.Schema.Parser parser0 = new org.apache.avro.Schema.Parser();
        org.apache.avro.Schema.Parser parser2 = parser0.setValidate(true);
        java.util.Map<java.lang.String, org.apache.avro.Schema> strMap3 = parser0.getTypes();
        org.apache.avro.Schema.Parser parser5 = parser0.setValidate(true);
        org.apache.avro.Schema.Parser parser7 = parser0.setValidate(true);
        java.util.Map<java.lang.String, org.apache.avro.Schema> strMap8 = parser0.getTypes();
        boolean boolean9 = parser0.getValidate();
        org.junit.Assert.assertNotNull(parser2);
        org.junit.Assert.assertNotNull(strMap3);
        org.junit.Assert.assertNotNull(parser5);
        org.junit.Assert.assertNotNull(parser7);
        org.junit.Assert.assertNotNull(strMap8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test1526() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SchemaM3Random300Test3.test1526");
        org.apache.avro.Schema.Names names1 = new org.apache.avro.Schema.Names("union");
        org.apache.avro.Schema[] schemaArray2 = new org.apache.avro.Schema[] {};
        java.util.ArrayList<org.apache.avro.Schema> schemaList3 = new java.util.ArrayList<org.apache.avro.Schema>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<org.apache.avro.Schema>) schemaList3, schemaArray2);
        org.apache.avro.Schema schema5 = org.apache.avro.Schema.createUnion((java.util.List<org.apache.avro.Schema>) schemaList3);
        java.lang.String str6 = schema5.getFullName();
        boolean boolean7 = names1.equals((java.lang.Object) schema5);
        org.apache.avro.Schema schema8 = org.apache.avro.Schema.createArray(schema5);
        java.lang.String str9 = schema5.toString();
        org.junit.Assert.assertNotNull(schemaArray2);
        org.junit.Assert.assertArrayEquals(schemaArray2, new org.apache.avro.Schema[] {});
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(schema5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "union" + "'", str6, "union");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(schema8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "[]" + "'", str9, "[]");
    }

    @Test
    public void test1527() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SchemaM3Random300Test3.test1527");
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
        // The following exception was thrown during execution in test generation
        try {
            java.util.Set<java.lang.String> strSet22 = schema17.getAliases();
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
        org.junit.Assert.assertNotNull(schemaList21);
    }

    @Test
    public void test1528() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SchemaM3Random300Test3.test1528");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.avro.Schema schema4 = org.apache.avro.Schema.createRecord("{null={\"type\":\"map\",\"values\":{\"type\":\"array\",\"items\":{\"type\":\"map\",\"values\":[]}}}}", "{}.union", "{\r\n  \"type\" : \"record\",\r\n  \"fields\" : [ ]\r\n}", true);
            org.junit.Assert.fail("Expected exception of type org.apache.avro.SchemaParseException; message: Illegal initial character: {null={\"type\":\"map\",\"values\":{\"type\":\"array\",\"items\":{\"type\":\"map\",\"values\":[]}}}}");
        } catch (org.apache.avro.SchemaParseException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1529() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SchemaM3Random300Test3.test1529");
        org.apache.avro.Schema.Names names1 = new org.apache.avro.Schema.Names("{\r\n  \"type\" : \"record\",\r\n  \"fields\" : [ ],\r\n  \"{\\\"type\\\":\\\"array\\\",\\\"items\\\":[],\\\"union type:UNION pos:-1\\\":\\\"\\\"}\" : \"{null={\\\"type\\\":\\\"map\\\",\\\"values\\\":[]}}\"\r\n}");
    }

    @Test
    public void test1530() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SchemaM3Random300Test3.test1530");
        org.apache.avro.Schema.Parser parser0 = new org.apache.avro.Schema.Parser();
        java.util.Map<java.lang.String, org.apache.avro.Schema> strMap1 = parser0.getTypes();
        org.apache.avro.Schema.Parser parser2 = new org.apache.avro.Schema.Parser();
        org.apache.avro.Schema.Parser parser4 = parser2.setValidate(true);
        java.util.Map<java.lang.String, org.apache.avro.Schema> strMap5 = parser2.getTypes();
        org.apache.avro.Schema.Parser parser6 = parser0.addTypes(strMap5);
        boolean boolean7 = parser6.getValidate();
        java.io.InputStream inputStream8 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.avro.Schema schema9 = parser6.parse(inputStream8);
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
    public void test1531() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SchemaM3Random300Test3.test1531");
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
        // The following exception was thrown during execution in test generation
        try {
            org.apache.avro.Schema schema29 = org.apache.avro.Schema.createEnum("{\"type\":\"map\",\"values\":{\"type\":\"array\",\"items\":{\"type\":\"map\",\"values\":[]}}}", "{\"type\":\"map\",\"values\":{\"type\":\"array\",\"items\":{\"type\":\"map\",\"values\":[]}}}", "{\"type\":\"map\",\"values\":{\"type\":\"array\",\"items\":{\"type\":\"map\",\"values\":[]}}}", (java.util.List<java.lang.String>) strList27);
            org.junit.Assert.fail("Expected exception of type org.apache.avro.SchemaParseException; message: Illegal initial character: {\"type\":\"map\",\"values\":{\"type\":\"array\",\"items\":{\"type\":\"map\",\"values\":[]}}}");
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
    }

    @Test
    public void test1532() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SchemaM3Random300Test3.test1532");
        org.apache.avro.Schema schema1 = org.apache.avro.Schema.parse("{\"type\":\"array\",\"items\":[]}");
        java.lang.String str2 = schema1.getName();
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<org.apache.avro.Schema> schemaList3 = schema1.getTypes();
            org.junit.Assert.fail("Expected exception of type org.apache.avro.AvroRuntimeException; message: Not a union: {\"type\":\"array\",\"items\":[]}");
        } catch (org.apache.avro.AvroRuntimeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(schema1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "array" + "'", str2, "array");
    }

    @Test
    public void test1533() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SchemaM3Random300Test3.test1533");
        org.apache.avro.Schema schema2 = org.apache.avro.Schema.parse("{\"type\":\"fixed\",\"name\":\"union\",\"namespace\":\"{}\",\"doc\":\"hi!\",\"size\":1}", false);
        java.lang.String str3 = schema2.getFullName();
        org.junit.Assert.assertNotNull(schema2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "{}.union" + "'", str3, "{}.union");
    }

    @Test
    public void test1534() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SchemaM3Random300Test3.test1534");
        org.apache.avro.Schema schema2 = org.apache.avro.Schema.parse("[ ]", true);
        org.junit.Assert.assertNotNull(schema2);
    }

    @Test
    public void test1535() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SchemaM3Random300Test3.test1535");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.avro.Schema schema4 = org.apache.avro.Schema.createFixed("{\"type\":\"fixed\",\"name\":\"union\",\"namespace\":\"[]\",\"doc\":\"[ ]\",\"size\":0}", "{\r\n  \"type\" : \"record\",\r\n  \"fields\" : [ ],\r\n  \"{\\r\\n  \\\"type\\\" : \\\"fixed\\\",\\r\\n  \\\"name\\\" : \\\"union\\\",\\r\\n  \\\"namespace\\\" : \\\"[]\\\",\\r\\n  \\\"doc\\\" : \\\"[ ]\\\",\\r\\n  \\\"size\\\" : 0\\r\\n}\" : \"[ ]\"\r\n}", "{null={\"type\":\"record\",\"fields\":[]}}", (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type org.apache.avro.SchemaParseException; message: Illegal initial character: {\"type\":\"fixed\",\"name\":\"union\",\"namespace\":\"[]\",\"doc\":\"[ ]\",\"size\":0}");
        } catch (org.apache.avro.SchemaParseException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1536() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SchemaM3Random300Test3.test1536");
        org.apache.avro.Schema schema2 = org.apache.avro.Schema.parse("{\r\n  \"type\" : \"array\",\r\n  \"items\" : [ ],\r\n  \"{}\" : \"hi!\"\r\n}", false);
        org.apache.avro.Schema.Field[] fieldArray3 = new org.apache.avro.Schema.Field[] {};
        java.util.ArrayList<org.apache.avro.Schema.Field> fieldList4 = new java.util.ArrayList<org.apache.avro.Schema.Field>();
        boolean boolean5 = java.util.Collections.addAll((java.util.Collection<org.apache.avro.Schema.Field>) fieldList4, fieldArray3);
        org.apache.avro.Schema schema6 = org.apache.avro.Schema.createRecord((java.util.List<org.apache.avro.Schema.Field>) fieldList4);
        java.util.List<org.apache.avro.Schema.Field> fieldList7 = schema6.getFields();
        org.apache.avro.Schema schema8 = org.apache.avro.Schema.createRecord(fieldList7);
        org.apache.avro.Schema schema9 = org.apache.avro.Schema.createRecord(fieldList7);
        org.apache.avro.Schema schema10 = org.apache.avro.Schema.createRecord(fieldList7);
        org.apache.avro.Schema schema11 = org.apache.avro.Schema.createRecord(fieldList7);
        org.apache.avro.Schema schema12 = org.apache.avro.Schema.createRecord(fieldList7);
        // The following exception was thrown during execution in test generation
        try {
            schema2.setFields(fieldList7);
            org.junit.Assert.fail("Expected exception of type org.apache.avro.AvroRuntimeException; message: Not a record: {\"type\":\"array\",\"items\":[],\"{}\":\"hi!\"}");
        } catch (org.apache.avro.AvroRuntimeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(schema2);
        org.junit.Assert.assertNotNull(fieldArray3);
        org.junit.Assert.assertArrayEquals(fieldArray3, new org.apache.avro.Schema.Field[] {});
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(schema6);
        org.junit.Assert.assertNotNull(fieldList7);
        org.junit.Assert.assertNotNull(schema8);
        org.junit.Assert.assertNotNull(schema9);
        org.junit.Assert.assertNotNull(schema10);
        org.junit.Assert.assertNotNull(schema11);
        org.junit.Assert.assertNotNull(schema12);
    }

    @Test
    public void test1537() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SchemaM3Random300Test3.test1537");
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
            java.util.List<java.lang.String> strList33 = schema31.getEnumSymbols();
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
    public void test1538() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SchemaM3Random300Test3.test1538");
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
        java.lang.String str41 = schema40.getName();
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
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "union" + "'", str41, "union");
    }

    @Test
    public void test1539() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SchemaM3Random300Test3.test1539");
        org.apache.avro.Schema.Type type0 = org.apache.avro.Schema.Type.INT;
        org.apache.avro.Schema schema1 = org.apache.avro.Schema.create(type0);
        schema1.addProp("{\r\n  \"type\" : \"map\",\r\n  \"values\" : {\r\n    \"type\" : \"map\",\r\n    \"values\" : [ ]\r\n  }\r\n}", "{}");
        org.apache.avro.Schema schema5 = org.apache.avro.Schema.createArray(schema1);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str6 = schema1.getNamespace();
            org.junit.Assert.fail("Expected exception of type org.apache.avro.AvroRuntimeException; message: Not a named type: {\"type\":\"int\",\"{\\r\\n  \\\"type\\\" : \\\"map\\\",\\r\\n  \\\"values\\\" : {\\r\\n    \\\"type\\\" : \\\"map\\\",\\r\\n    \\\"values\\\" : [ ]\\r\\n  }\\r\\n}\":\"{}\"}");
        } catch (org.apache.avro.AvroRuntimeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + type0 + "' != '" + org.apache.avro.Schema.Type.INT + "'", type0.equals(org.apache.avro.Schema.Type.INT));
        org.junit.Assert.assertNotNull(schema1);
        org.junit.Assert.assertNotNull(schema5);
    }

    @Test
    public void test1540() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SchemaM3Random300Test3.test1540");
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
        java.lang.String str35 = schema29.toString();
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<java.lang.String> strList36 = schema29.getEnumSymbols();
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
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "[]" + "'", str35, "[]");
    }

    @Test
    public void test1541() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SchemaM3Random300Test3.test1541");
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
        org.apache.avro.Schema.Parser parser16 = parser7.setValidate(true);
        boolean boolean17 = parser16.getValidate();
        org.junit.Assert.assertNotNull(strMap1);
        org.junit.Assert.assertNotNull(strMap2);
        org.junit.Assert.assertNotNull(parser5);
        org.junit.Assert.assertNotNull(strMap6);
        org.junit.Assert.assertNotNull(parser7);
        org.junit.Assert.assertNotNull(schema9);
        org.junit.Assert.assertNotNull(parser11);
        org.junit.Assert.assertNotNull(schema13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(parser16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
    }

    @Test
    public void test1542() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SchemaM3Random300Test3.test1542");
        org.apache.avro.Schema.LockableArrayList<org.apache.avro.Schema.Parser> parserList1 = new org.apache.avro.Schema.LockableArrayList<org.apache.avro.Schema.Parser>((int) (short) 100);
        org.apache.avro.Schema.LockableArrayList<org.apache.avro.Schema.Parser> parserList2 = new org.apache.avro.Schema.LockableArrayList<org.apache.avro.Schema.Parser>((java.util.List<org.apache.avro.Schema.Parser>) parserList1);
    }

    @Test
    public void test1543() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SchemaM3Random300Test3.test1543");
        // The following exception was thrown during execution in test generation
        try {
            org.codehaus.jackson.JsonNode jsonNode1 = org.apache.avro.Schema.parseJson(".map");
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: org.codehaus.jackson.JsonParseException: Unexpected character ('.' (code 46)): expected a valid value (number, String, array, object, 'true', 'false' or 'null')? at [Source: java.io.StringReader@265a9f4f; line: 1, column: 2]");
        } catch (java.lang.RuntimeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1544() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SchemaM3Random300Test3.test1544");
        org.apache.avro.Schema.Names names1 = new org.apache.avro.Schema.Names("union type:UNION pos:-1");
        names1.space("map");
        java.lang.String str4 = names1.space();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "map" + "'", str4, "map");
    }

    @Test
    public void test1545() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SchemaM3Random300Test3.test1545");
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
            schema7.addProp("{\r\n  \"type\" : \"map\",\r\n  \"values\" : {\r\n    \"type\" : \"record\",\r\n    \"fields\" : [ ]\r\n  }\r\n}", "{null=null}");
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
    public void test1546() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SchemaM3Random300Test3.test1546");
        org.apache.avro.Schema schema4 = org.apache.avro.Schema.createRecord(".map", "{\"type\":\"fixed\",\"name\":\"union\",\"namespace\":\"[]\",\"doc\":\"[ ]\",\"size\":0,\"aliases\":[\"union\"]}", "{\r\n  \"type\" : \"fixed\",\r\n  \"name\" : \"union\",\r\n  \"namespace\" : \"[]\",\r\n  \"doc\" : \"[ ]\",\r\n  \"size\" : 0,\r\n  \"{\\r\\n  \\\"type\\\" : \\\"fixed\\\",\\r\\n  \\\"name\\\" : \\\"union\\\",\\r\\n  \\\"namespace\\\" : \\\"[]\\\",\\r\\n  \\\"doc\\\" : \\\"[ ]\\\",\\r\\n  \\\"size\\\" : 0\\r\\n}\" : \"{\\r\\n  \\\"type\\\" : \\\"map\\\",\\r\\n  \\\"values\\\" : {\\r\\n    \\\"type\\\" : \\\"map\\\",\\r\\n    \\\"values\\\" : [ ]\\r\\n  }\\r\\n}\"\r\n}", false);
        org.junit.Assert.assertNotNull(schema4);
    }

    @Test
    public void test1547() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SchemaM3Random300Test3.test1547");
        org.apache.avro.Schema schema1 = org.apache.avro.Schema.parse("{\"type\":\"array\",\"items\":[]}");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean2 = schema1.isError();
            org.junit.Assert.fail("Expected exception of type org.apache.avro.AvroRuntimeException; message: Not a record: {\"type\":\"array\",\"items\":[]}");
        } catch (org.apache.avro.AvroRuntimeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(schema1);
    }

    @Test
    public void test1548() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SchemaM3Random300Test3.test1548");
        org.apache.avro.Schema.Parser parser0 = new org.apache.avro.Schema.Parser();
        java.util.Map<java.lang.String, org.apache.avro.Schema> strMap1 = parser0.getTypes();
        java.util.Map<java.lang.String, org.apache.avro.Schema> strMap2 = parser0.getTypes();
        org.apache.avro.Schema.Parser parser3 = new org.apache.avro.Schema.Parser();
        java.util.Map<java.lang.String, org.apache.avro.Schema> strMap4 = parser3.getTypes();
        org.apache.avro.Schema.Parser parser5 = parser0.addTypes(strMap4);
        java.util.Map<java.lang.String, org.apache.avro.Schema> strMap6 = parser5.getTypes();
        java.lang.Class<?> wildcardClass7 = strMap6.getClass();
        org.junit.Assert.assertNotNull(strMap1);
        org.junit.Assert.assertNotNull(strMap2);
        org.junit.Assert.assertNotNull(strMap4);
        org.junit.Assert.assertNotNull(parser5);
        org.junit.Assert.assertNotNull(strMap6);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test1549() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SchemaM3Random300Test3.test1549");
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
            int int22 = schema13.getFixedSize();
            org.junit.Assert.fail("Expected exception of type org.apache.avro.AvroRuntimeException; message: Not fixed: []");
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
    public void test1550() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SchemaM3Random300Test3.test1550");
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
            int int10 = schema3.getFixedSize();
            org.junit.Assert.fail("Expected exception of type org.apache.avro.AvroRuntimeException; message: Not fixed: {\"type\":\"record\",\"fields\":[]}");
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
    public void test1551() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SchemaM3Random300Test3.test1551");
        org.apache.avro.Schema.Parser parser0 = new org.apache.avro.Schema.Parser();
        java.util.Map<java.lang.String, org.apache.avro.Schema> strMap1 = parser0.getTypes();
        java.util.Map<java.lang.String, org.apache.avro.Schema> strMap2 = parser0.getTypes();
        org.apache.avro.Schema.Parser parser3 = new org.apache.avro.Schema.Parser();
        org.apache.avro.Schema.Parser parser5 = parser3.setValidate(true);
        java.util.Map<java.lang.String, org.apache.avro.Schema> strMap6 = parser3.getTypes();
        org.apache.avro.Schema.Parser parser7 = parser0.addTypes(strMap6);
        org.apache.avro.Schema schema9 = parser7.parse("{\"type\":\"map\",\"values\":[]}");
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
        org.junit.Assert.assertNotNull(schema9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test1552() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SchemaM3Random300Test3.test1552");
        java.lang.String[] strArray19 = new java.lang.String[] { "{\"type\":\"array\",\"items\":{\"type\":\"map\",\"values\":[]}}", "union type:MAP pos:-1", "{\"type\":\"array\",\"items\":{\"type\":\"map\",\"values\":[]}}", "{}", "{\r\n  \"type\" : \"map\",\r\n  \"values\" : {\r\n    \"type\" : \"map\",\r\n    \"values\" : [ ]\r\n  }\r\n}", "double", "{\r\n  \"type\" : \"map\",\r\n  \"values\" : [ ]\r\n}", "{\"type\":\"map\",\"values\":[]}", "{\"type\":\"array\",\"items\":[]}", "{\"type\":\"map\",\"values\":[]}", "{}", "union", "{\r\n  \"type\" : \"record\",\r\n  \"fields\" : [ ]\r\n}", "[].union", "{\r\n  \"type\" : \"map\",\r\n  \"values\" : [ ]\r\n}", "{\"type\":\"fixed\",\"name\":\"union\",\"namespace\":\"[]\",\"doc\":\"[ ]\",\"size\":0}" };
        java.util.ArrayList<java.lang.String> strList20 = new java.util.ArrayList<java.lang.String>();
        boolean boolean21 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList20, strArray19);
        org.apache.avro.Schema.LockableArrayList<java.lang.String> strList22 = new org.apache.avro.Schema.LockableArrayList<java.lang.String>((java.util.List<java.lang.String>) strList20);
        org.apache.avro.Schema.LockableArrayList<java.lang.String> strList23 = new org.apache.avro.Schema.LockableArrayList<java.lang.String>((java.util.List<java.lang.String>) strList22);
        org.apache.avro.Schema.LockableArrayList<java.lang.String> strList24 = new org.apache.avro.Schema.LockableArrayList<java.lang.String>((java.util.List<java.lang.String>) strList23);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.avro.Schema schema25 = org.apache.avro.Schema.createEnum("{\"type\":\"fixed\",\"name\":\"union\",\"namespace\":\"[]\",\"doc\":\"union type:UNION pos:-1\",\"size\":100}", "{\r\n  \"type\" : \"array\",\r\n  \"items\" : {\r\n    \"type\" : \"map\",\r\n    \"values\" : [ ]\r\n  }\r\n}", "", (java.util.List<java.lang.String>) strList24);
            org.junit.Assert.fail("Expected exception of type org.apache.avro.SchemaParseException; message: Illegal initial character: {\"type\":\"fixed\",\"name\":\"union\",\"namespace\":\"[]\",\"doc\":\"union type:UNION pos:-1\",\"size\":100}");
        } catch (org.apache.avro.SchemaParseException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray19);
        org.junit.Assert.assertArrayEquals(strArray19, new java.lang.String[] { "{\"type\":\"array\",\"items\":{\"type\":\"map\",\"values\":[]}}", "union type:MAP pos:-1", "{\"type\":\"array\",\"items\":{\"type\":\"map\",\"values\":[]}}", "{}", "{\r\n  \"type\" : \"map\",\r\n  \"values\" : {\r\n    \"type\" : \"map\",\r\n    \"values\" : [ ]\r\n  }\r\n}", "double", "{\r\n  \"type\" : \"map\",\r\n  \"values\" : [ ]\r\n}", "{\"type\":\"map\",\"values\":[]}", "{\"type\":\"array\",\"items\":[]}", "{\"type\":\"map\",\"values\":[]}", "{}", "union", "{\r\n  \"type\" : \"record\",\r\n  \"fields\" : [ ]\r\n}", "[].union", "{\r\n  \"type\" : \"map\",\r\n  \"values\" : [ ]\r\n}", "{\"type\":\"fixed\",\"name\":\"union\",\"namespace\":\"[]\",\"doc\":\"[ ]\",\"size\":0}" });
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
    }

    @Test
    public void test1553() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SchemaM3Random300Test3.test1553");
        org.apache.avro.Schema.LockableArrayList<java.lang.String> strList4 = new org.apache.avro.Schema.LockableArrayList<java.lang.String>((int) '4');
        org.apache.avro.Schema.LockableArrayList<java.lang.String> strList5 = new org.apache.avro.Schema.LockableArrayList<java.lang.String>((java.util.List<java.lang.String>) strList4);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.avro.Schema schema6 = org.apache.avro.Schema.createEnum("{\r\n  \"type\" : \"array\",\r\n  \"items\" : {\r\n    \"type\" : \"map\",\r\n    \"values\" : [ ]\r\n  }\r\n}", "", "union", (java.util.List<java.lang.String>) strList5);
            org.junit.Assert.fail("Expected exception of type org.apache.avro.SchemaParseException; message: Illegal initial character: {??  \"type\" : \"array\",??  \"items\" : {??    \"type\" : \"map\",??    \"values\" : [ ]??  }??}");
        } catch (org.apache.avro.SchemaParseException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1554() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SchemaM3Random300Test3.test1554");
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
        java.lang.String str19 = schema18.toString();
        org.apache.avro.Schema schema20 = org.apache.avro.Schema.createMap(schema18);
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
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "{\"type\":\"fixed\",\"name\":\"union\",\"namespace\":\"{}\",\"doc\":\"hi!\",\"size\":1}" + "'", str19, "{\"type\":\"fixed\",\"name\":\"union\",\"namespace\":\"{}\",\"doc\":\"hi!\",\"size\":1}");
        org.junit.Assert.assertNotNull(schema20);
    }

    @Test
    public void test1555() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SchemaM3Random300Test3.test1555");
        org.apache.avro.Schema schema2 = org.apache.avro.Schema.parse("{\"type\":\"array\",\"items\":{\"type\":\"array\",\"items\":{\"type\":\"map\",\"values\":[]}}}", true);
        org.junit.Assert.assertNotNull(schema2);
    }

    @Test
    public void test1556() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SchemaM3Random300Test3.test1556");
        org.apache.avro.Schema.LockableArrayList<java.lang.String> strList4 = new org.apache.avro.Schema.LockableArrayList<java.lang.String>((int) (short) 0);
        org.apache.avro.Schema schema5 = org.apache.avro.Schema.createEnum("map", "", "{null=null}", (java.util.List<java.lang.String>) strList4);
        org.junit.Assert.assertNotNull(schema5);
    }

    @Test
    public void test1557() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SchemaM3Random300Test3.test1557");
        org.apache.avro.Schema schema1 = org.apache.avro.Schema.parse("{\"type\":\"map\",\"values\":{\"type\":\"enum\",\"name\":\"union\",\"namespace\":\"[]\",\"doc\":\"{}\",\"symbols\":[]}}");
        java.lang.String str2 = schema1.toString();
        org.junit.Assert.assertNotNull(schema1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "{\"type\":\"map\",\"values\":{\"type\":\"enum\",\"name\":\"union\",\"namespace\":\"[]\",\"doc\":\"{}\",\"symbols\":[]}}" + "'", str2, "{\"type\":\"map\",\"values\":{\"type\":\"enum\",\"name\":\"union\",\"namespace\":\"[]\",\"doc\":\"{}\",\"symbols\":[]}}");
    }

    @Test
    public void test1558() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SchemaM3Random300Test3.test1558");
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
            org.apache.avro.Schema schema13 = schema4.getElementType();
            org.junit.Assert.fail("Expected exception of type org.apache.avro.AvroRuntimeException; message: Not an array: []");
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
    public void test1559() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SchemaM3Random300Test3.test1559");
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
        org.apache.avro.Schema.Parser parser17 = parser0.setValidate(false);
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
    public void test1560() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SchemaM3Random300Test3.test1560");
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
            int int18 = schema15.getEnumOrdinal("map");
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
        org.junit.Assert.assertTrue("'" + type16 + "' != '" + org.apache.avro.Schema.Type.ARRAY + "'", type16.equals(org.apache.avro.Schema.Type.ARRAY));
    }

    @Test
    public void test1561() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SchemaM3Random300Test3.test1561");
        // The following exception was thrown during execution in test generation
        try {
            org.codehaus.jackson.JsonNode jsonNode1 = org.apache.avro.Schema.parseJson("{null={\"type\":\"map\",\"values\":[]}}");
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: org.codehaus.jackson.JsonParseException: Unexpected character ('n' (code 110)): was expecting double-quote to start field name? at [Source: java.io.StringReader@59ba0fcb; line: 1, column: 3]");
        } catch (java.lang.RuntimeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1562() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SchemaM3Random300Test3.test1562");
        org.apache.avro.Schema.Parser parser0 = new org.apache.avro.Schema.Parser();
        java.util.Map<java.lang.String, org.apache.avro.Schema> strMap1 = parser0.getTypes();
        java.util.Map<java.lang.String, org.apache.avro.Schema> strMap2 = parser0.getTypes();
        org.apache.avro.Schema.Parser parser3 = new org.apache.avro.Schema.Parser();
        org.apache.avro.Schema.Parser parser5 = parser3.setValidate(true);
        java.util.Map<java.lang.String, org.apache.avro.Schema> strMap6 = parser3.getTypes();
        org.apache.avro.Schema.Parser parser7 = parser0.addTypes(strMap6);
        org.apache.avro.Schema.Parser parser9 = parser7.setValidate(true);
        org.apache.avro.Schema.Parser parser11 = parser9.setValidate(true);
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
    public void test1563() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SchemaM3Random300Test3.test1563");
        org.apache.avro.Schema.Parser parser0 = new org.apache.avro.Schema.Parser();
        java.util.Map<java.lang.String, org.apache.avro.Schema> strMap1 = parser0.getTypes();
        java.util.Map<java.lang.String, org.apache.avro.Schema> strMap2 = parser0.getTypes();
        org.apache.avro.Schema.Parser parser3 = new org.apache.avro.Schema.Parser();
        org.apache.avro.Schema.Parser parser5 = parser3.setValidate(true);
        java.util.Map<java.lang.String, org.apache.avro.Schema> strMap6 = parser3.getTypes();
        org.apache.avro.Schema.Parser parser7 = parser0.addTypes(strMap6);
        org.apache.avro.Schema schema9 = parser7.parse("{\"type\":\"map\",\"values\":[]}");
        org.apache.avro.Schema.Parser parser11 = parser7.setValidate(false);
        java.util.Map<java.lang.String, org.apache.avro.Schema> strMap12 = parser11.getTypes();
        org.junit.Assert.assertNotNull(strMap1);
        org.junit.Assert.assertNotNull(strMap2);
        org.junit.Assert.assertNotNull(parser5);
        org.junit.Assert.assertNotNull(strMap6);
        org.junit.Assert.assertNotNull(parser7);
        org.junit.Assert.assertNotNull(schema9);
        org.junit.Assert.assertNotNull(parser11);
        org.junit.Assert.assertNotNull(strMap12);
    }

    @Test
    public void test1564() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SchemaM3Random300Test3.test1564");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.avro.Schema schema4 = org.apache.avro.Schema.createFixed("{\"type\":\"array\",\"items\":\"int\"}", "{\r\n  \"type\" : \"array\",\r\n  \"items\" : [ ]\r\n}", "{\"type\":\"array\",\"items\":{\"type\":\"array\",\"items\":{\"type\":\"map\",\"values\":[]}}}", (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type org.apache.avro.SchemaParseException; message: Illegal initial character: {\"type\":\"array\",\"items\":\"int\"}");
        } catch (org.apache.avro.SchemaParseException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1565() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SchemaM3Random300Test3.test1565");
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
        // The following exception was thrown during execution in test generation
        try {
            schema21.addAlias("{null={\"type\":\"map\",\"values\":{\"type\":\"array\",\"items\":{\"type\":\"map\",\"values\":[]}}}}");
            org.junit.Assert.fail("Expected exception of type org.apache.avro.AvroRuntimeException; message: Not a named type: {\"type\":\"map\",\"values\":[]}");
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
        org.junit.Assert.assertNotNull(schema21);
        org.junit.Assert.assertNull(str22);
    }

    @Test
    public void test1566() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SchemaM3Random300Test3.test1566");
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
            int int25 = schema20.getEnumOrdinal("{\"type\":\"map\",\"values\":{\"type\":\"record\",\"fields\":[]}}");
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
        org.junit.Assert.assertNotNull(schema21);
        org.junit.Assert.assertNull(str22);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "map" + "'", str23, "map");
    }

    @Test
    public void test1567() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SchemaM3Random300Test3.test1567");
        org.apache.avro.Schema.LockableArrayList<java.lang.String> strList4 = new org.apache.avro.Schema.LockableArrayList<java.lang.String>((int) '#');
        org.apache.avro.Schema.LockableArrayList<java.lang.String> strList5 = new org.apache.avro.Schema.LockableArrayList<java.lang.String>((java.util.List<java.lang.String>) strList4);
        org.apache.avro.Schema.LockableArrayList<java.lang.String> strList6 = new org.apache.avro.Schema.LockableArrayList<java.lang.String>((java.util.List<java.lang.String>) strList5);
        org.apache.avro.Schema.LockableArrayList<java.lang.String> strList7 = new org.apache.avro.Schema.LockableArrayList<java.lang.String>((java.util.List<java.lang.String>) strList6);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.avro.Schema schema8 = org.apache.avro.Schema.createEnum("{\"type\":\"array\",\"items\":\"null\"}", "{\r\n  \"type\" : \"array\",\r\n  \"items\" : {\r\n    \"type\" : \"map\",\r\n    \"values\" : [ ]\r\n  }\r\n}", "{\"type\":\"map\",\"values\":{\"type\":\"array\",\"items\":{\"type\":\"map\",\"values\":[]},\"\":\"{\\r\\n  \\\"type\\\" : \\\"record\\\",\\r\\n  \\\"fields\\\" : [ ]\\r\\n}\"}}", (java.util.List<java.lang.String>) strList7);
            org.junit.Assert.fail("Expected exception of type org.apache.avro.SchemaParseException; message: Illegal initial character: {\"type\":\"array\",\"items\":\"null\"}");
        } catch (org.apache.avro.SchemaParseException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1568() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SchemaM3Random300Test3.test1568");
        org.apache.avro.Schema schema1 = org.apache.avro.Schema.parse("{\"type\":\"fixed\",\"name\":\"union\",\"namespace\":\"[]\",\"doc\":\"[ ]\",\"size\":0,\"aliases\":[\"union\"]}");
        org.junit.Assert.assertNotNull(schema1);
    }

    @Test
    public void test1569() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SchemaM3Random300Test3.test1569");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.avro.Schema schema4 = org.apache.avro.Schema.createRecord("{\"type\":\"map\",\"values\":{\"type\":\"array\",\"items\":{\"type\":\"map\",\"values\":[]}}}", "union", "{\"type\":\"map\",\"values\":\"double\"}", false);
            org.junit.Assert.fail("Expected exception of type org.apache.avro.SchemaParseException; message: Illegal initial character: {\"type\":\"map\",\"values\":{\"type\":\"array\",\"items\":{\"type\":\"map\",\"values\":[]}}}");
        } catch (org.apache.avro.SchemaParseException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1570() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SchemaM3Random300Test3.test1570");
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
            org.apache.avro.Schema.Field field26 = schema21.getField("{\"type\":\"record\",\"fields\":[],\"{\\r\\n  \\\"type\\\" : \\\"map\\\",\\r\\n  \\\"values\\\" : {\\r\\n    \\\"type\\\" : \\\"map\\\",\\r\\n    \\\"values\\\" : [ ]\\r\\n  }\\r\\n}\":\"{}\"}");
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
    }

    @Test
    public void test1571() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SchemaM3Random300Test3.test1571");
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
            boolean boolean16 = schema8.isError();
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
        org.junit.Assert.assertTrue("'" + type15 + "' != '" + org.apache.avro.Schema.Type.UNION + "'", type15.equals(org.apache.avro.Schema.Type.UNION));
    }

    @Test
    public void test1572() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SchemaM3Random300Test3.test1572");
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
        org.apache.avro.Schema schema11 = org.apache.avro.Schema.createArray(schema10);
        // The following exception was thrown during execution in test generation
        try {
            java.util.Set<java.lang.String> strSet12 = schema11.getAliases();
            org.junit.Assert.fail("Expected exception of type org.apache.avro.AvroRuntimeException; message: Not a named type: {\"type\":\"array\",\"items\":{\"type\":\"array\",\"items\":[]}}");
        } catch (org.apache.avro.AvroRuntimeException e) {
            // Expected exception.
        }
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
        org.junit.Assert.assertNotNull(schema11);
    }

    @Test
    public void test1573() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SchemaM3Random300Test3.test1573");
        org.apache.avro.Schema schema2 = org.apache.avro.Schema.parse("{\r\n  \"type\" : \"fixed\",\r\n  \"name\" : \"union\",\r\n  \"namespace\" : \"[]\",\r\n  \"doc\" : \"[ ]\",\r\n  \"size\" : 0\r\n}", true);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.avro.Schema.Field field4 = schema2.getField("{\r\n  \"type\" : \"record\",\r\n  \"fields\" : [ ],\r\n  \"{\\r\\n  \\\"type\\\" : \\\"fixed\\\",\\r\\n  \\\"name\\\" : \\\"union\\\",\\r\\n  \\\"namespace\\\" : \\\"[]\\\",\\r\\n  \\\"doc\\\" : \\\"[ ]\\\",\\r\\n  \\\"size\\\" : 0\\r\\n}\" : \"[ ]\"\r\n}");
            org.junit.Assert.fail("Expected exception of type org.apache.avro.AvroRuntimeException; message: Not a record: {\"type\":\"fixed\",\"name\":\"union\",\"namespace\":\"[]\",\"doc\":\"[ ]\",\"size\":0}");
        } catch (org.apache.avro.AvroRuntimeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(schema2);
    }

    @Test
    public void test1574() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SchemaM3Random300Test3.test1574");
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
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "[ ]" + "'", str12, "[ ]");
    }

    @Test
    public void test1575() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SchemaM3Random300Test3.test1575");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.avro.Schema schema4 = org.apache.avro.Schema.createFixed("", "int", "union type:UNION pos:-1.union", (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type org.apache.avro.SchemaParseException; message: Empty name");
        } catch (org.apache.avro.SchemaParseException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1576() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SchemaM3Random300Test3.test1576");
        org.apache.avro.Schema.LockableArrayList<java.lang.String> strList1 = new org.apache.avro.Schema.LockableArrayList<java.lang.String>((int) (byte) 100);
        org.apache.avro.Schema.LockableArrayList<java.lang.String> strList2 = new org.apache.avro.Schema.LockableArrayList<java.lang.String>((java.util.List<java.lang.String>) strList1);
        java.lang.Class<?> wildcardClass3 = strList1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test1577() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SchemaM3Random300Test3.test1577");
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
        java.lang.String str25 = schema23.getProp("{\"type\":\"array\",\"items\":[]}");
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
            schema23.setFields((java.util.List<org.apache.avro.Schema.Field>) fieldList27);
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
        org.junit.Assert.assertNotNull(schemaList20);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "[]" + "'", str22, "[]");
        org.junit.Assert.assertNotNull(schema23);
        org.junit.Assert.assertNull(str25);
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
    public void test1578() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SchemaM3Random300Test3.test1578");
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
        org.apache.avro.Schema[] schemaArray16 = new org.apache.avro.Schema[] {};
        java.util.ArrayList<org.apache.avro.Schema> schemaList17 = new java.util.ArrayList<org.apache.avro.Schema>();
        boolean boolean18 = java.util.Collections.addAll((java.util.Collection<org.apache.avro.Schema>) schemaList17, schemaArray16);
        org.apache.avro.Schema schema19 = org.apache.avro.Schema.createUnion((java.util.List<org.apache.avro.Schema>) schemaList17);
        org.apache.avro.Schema[] schemaArray20 = new org.apache.avro.Schema[] {};
        java.util.ArrayList<org.apache.avro.Schema> schemaList21 = new java.util.ArrayList<org.apache.avro.Schema>();
        boolean boolean22 = java.util.Collections.addAll((java.util.Collection<org.apache.avro.Schema>) schemaList21, schemaArray20);
        org.apache.avro.Schema schema23 = org.apache.avro.Schema.createUnion((java.util.List<org.apache.avro.Schema>) schemaList21);
        org.apache.avro.Schema schema24 = org.apache.avro.Schema.applyAliases(schema19, schema23);
        org.apache.avro.Schema.Type type25 = schema23.getType();
        org.apache.avro.Schema schema26 = org.apache.avro.Schema.createMap(schema23);
        org.apache.avro.Schema.Names names27 = new org.apache.avro.Schema.Names();
        java.lang.String str28 = names27.space();
        names27.space("");
        boolean boolean31 = schema23.equals((java.lang.Object) "");
        java.lang.String str32 = schema23.getFullName();
        org.apache.avro.Schema schema33 = org.apache.avro.Schema.applyAliases(schema15, schema23);
        java.lang.String str34 = schema23.getFullName();
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
        org.junit.Assert.assertNotNull(schemaArray16);
        org.junit.Assert.assertArrayEquals(schemaArray16, new org.apache.avro.Schema[] {});
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(schema19);
        org.junit.Assert.assertNotNull(schemaArray20);
        org.junit.Assert.assertArrayEquals(schemaArray20, new org.apache.avro.Schema[] {});
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(schema23);
        org.junit.Assert.assertNotNull(schema24);
        org.junit.Assert.assertTrue("'" + type25 + "' != '" + org.apache.avro.Schema.Type.UNION + "'", type25.equals(org.apache.avro.Schema.Type.UNION));
        org.junit.Assert.assertNotNull(schema26);
        org.junit.Assert.assertNull(str28);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "union" + "'", str32, "union");
        org.junit.Assert.assertNotNull(schema33);
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "union" + "'", str34, "union");
    }

    @Test
    public void test1579() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SchemaM3Random300Test3.test1579");
        org.apache.avro.Schema.Names names1 = new org.apache.avro.Schema.Names("{\"type\":\"double\",\"float\":\"{\\\"type\\\":\\\"array\\\",\\\"items\\\":[]}\"}");
    }

    @Test
    public void test1580() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SchemaM3Random300Test3.test1580");
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
            org.apache.avro.Schema schema17 = parser7.parse("{null={\"type\":\"record\",\"fields\":[]}}");
            org.junit.Assert.fail("Expected exception of type org.apache.avro.SchemaParseException; message: org.codehaus.jackson.JsonParseException: Unexpected character ('n' (code 110)): was expecting double-quote to start field name? at [Source: java.io.StringReader@69f9e5f3; line: 1, column: 3]");
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
    public void test1581() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SchemaM3Random300Test3.test1581");
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
        org.apache.avro.Schema schema24 = names0.remove((java.lang.Object) "{\"type\":\"map\",\"values\":[],\"\\\"double\\\"\":\"{\\\"type\\\":\\\"array\\\",\\\"items\\\":\\\"int\\\"}\"}");
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
        org.junit.Assert.assertNull(schema24);
    }

    @Test
    public void test1582() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SchemaM3Random300Test3.test1582");
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
        java.lang.String str30 = schema21.toString(true);
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
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "{\r\n  \"type\" : \"array\",\r\n  \"items\" : {\r\n    \"type\" : \"map\",\r\n    \"values\" : [ ]\r\n  }\r\n}" + "'", str30, "{\r\n  \"type\" : \"array\",\r\n  \"items\" : {\r\n    \"type\" : \"map\",\r\n    \"values\" : [ ]\r\n  }\r\n}");
    }

    @Test
    public void test1583() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SchemaM3Random300Test3.test1583");
        org.apache.avro.Schema.Names names1 = new org.apache.avro.Schema.Names("{}");
        org.apache.avro.Schema schema4 = org.apache.avro.Schema.parse("{\"type\":\"array\",\"items\":{\"type\":\"map\",\"values\":[]}}", false);
        java.lang.String str6 = schema4.getProp("{\"type\":\"map\",\"values\":{\"type\":\"array\",\"items\":{\"type\":\"map\",\"values\":[]}}}");
        boolean boolean7 = names1.containsKey((java.lang.Object) str6);
        org.junit.Assert.assertNotNull(schema4);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test1584() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SchemaM3Random300Test3.test1584");
        org.codehaus.jackson.JsonNode jsonNode1 = org.apache.avro.Schema.parseJson("{\r\n  \"type\" : \"record\",\r\n  \"fields\" : [ ],\r\n  \"{\\\"type\\\":\\\"array\\\",\\\"items\\\":[],\\\"union type:UNION pos:-1\\\":\\\"\\\"}\" : \"{null={\\\"type\\\":\\\"map\\\",\\\"values\\\":[]}}\"\r\n}");
        org.junit.Assert.assertNotNull(jsonNode1);
    }

    @Test
    public void test1585() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SchemaM3Random300Test3.test1585");
        org.apache.avro.Schema.Parser parser0 = new org.apache.avro.Schema.Parser();
        org.apache.avro.Schema.Parser parser2 = parser0.setValidate(true);
        org.apache.avro.Schema.Parser parser4 = parser0.setValidate(true);
        java.util.Map<java.lang.String, org.apache.avro.Schema> strMap5 = parser4.getTypes();
        org.apache.avro.Schema.Parser parser7 = parser4.setValidate(false);
        java.util.Map<java.lang.String, org.apache.avro.Schema> strMap8 = parser4.getTypes();
        org.junit.Assert.assertNotNull(parser2);
        org.junit.Assert.assertNotNull(parser4);
        org.junit.Assert.assertNotNull(strMap5);
        org.junit.Assert.assertNotNull(parser7);
        org.junit.Assert.assertNotNull(strMap8);
    }

    @Test
    public void test1586() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SchemaM3Random300Test3.test1586");
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
        org.apache.avro.Schema.Parser parser18 = parser9.setValidate(false);
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
        org.junit.Assert.assertNotNull(parser18);
    }

    @Test
    public void test1587() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SchemaM3Random300Test3.test1587");
        org.apache.avro.Schema schema1 = org.apache.avro.Schema.parse("{\"type\":\"array\",\"items\":[],\"{}\":\"hi!\"}");
        org.junit.Assert.assertNotNull(schema1);
    }

    @Test
    public void test1588() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SchemaM3Random300Test3.test1588");
        org.apache.avro.Schema.Field[] fieldArray0 = new org.apache.avro.Schema.Field[] {};
        java.util.ArrayList<org.apache.avro.Schema.Field> fieldList1 = new java.util.ArrayList<org.apache.avro.Schema.Field>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<org.apache.avro.Schema.Field>) fieldList1, fieldArray0);
        org.apache.avro.Schema schema3 = org.apache.avro.Schema.createRecord((java.util.List<org.apache.avro.Schema.Field>) fieldList1);
        java.util.List<org.apache.avro.Schema.Field> fieldList4 = schema3.getFields();
        org.apache.avro.Schema schema5 = org.apache.avro.Schema.createRecord(fieldList4);
        org.apache.avro.Schema schema6 = org.apache.avro.Schema.createRecord(fieldList4);
        java.lang.String str8 = schema6.toString(false);
        java.lang.String str9 = schema6.getDoc();
        org.junit.Assert.assertNotNull(fieldArray0);
        org.junit.Assert.assertArrayEquals(fieldArray0, new org.apache.avro.Schema.Field[] {});
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(schema3);
        org.junit.Assert.assertNotNull(fieldList4);
        org.junit.Assert.assertNotNull(schema5);
        org.junit.Assert.assertNotNull(schema6);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "{\"type\":\"record\",\"fields\":[]}" + "'", str8, "{\"type\":\"record\",\"fields\":[]}");
        org.junit.Assert.assertNull(str9);
    }

    @Test
    public void test1589() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SchemaM3Random300Test3.test1589");
        org.apache.avro.Schema.Parser parser0 = new org.apache.avro.Schema.Parser();
        java.util.Map<java.lang.String, org.apache.avro.Schema> strMap1 = parser0.getTypes();
        java.util.Map<java.lang.String, org.apache.avro.Schema> strMap2 = parser0.getTypes();
        org.apache.avro.Schema.Parser parser3 = new org.apache.avro.Schema.Parser();
        java.util.Map<java.lang.String, org.apache.avro.Schema> strMap4 = parser3.getTypes();
        org.apache.avro.Schema.Parser parser5 = parser0.addTypes(strMap4);
        org.apache.avro.Schema.Parser parser7 = parser0.setValidate(true);
        org.apache.avro.Schema.Parser parser9 = parser0.setValidate(false);
        java.util.Map<java.lang.String, org.apache.avro.Schema> strMap10 = parser0.getTypes();
        boolean boolean11 = parser0.getValidate();
        org.apache.avro.Schema.Parser parser13 = parser0.setValidate(false);
        org.apache.avro.Schema schema15 = parser0.parse("\"int\"");
        org.junit.Assert.assertNotNull(strMap1);
        org.junit.Assert.assertNotNull(strMap2);
        org.junit.Assert.assertNotNull(strMap4);
        org.junit.Assert.assertNotNull(parser5);
        org.junit.Assert.assertNotNull(parser7);
        org.junit.Assert.assertNotNull(parser9);
        org.junit.Assert.assertNotNull(strMap10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(parser13);
        org.junit.Assert.assertNotNull(schema15);
    }

    @Test
    public void test1590() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SchemaM3Random300Test3.test1590");
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
        java.util.Map<java.lang.String, org.apache.avro.Schema> strMap19 = parser0.getTypes();
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
        org.junit.Assert.assertNotNull(strMap19);
    }

    @Test
    public void test1591() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SchemaM3Random300Test3.test1591");
        org.apache.avro.Schema.LockableArrayList<java.lang.String> strList3 = new org.apache.avro.Schema.LockableArrayList<java.lang.String>();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.avro.Schema schema4 = org.apache.avro.Schema.createEnum("{\"type\":\"fixed\",\"name\":\"union\",\"namespace\":\"{}\",\"doc\":\"hi!\",\"size\":1}", "[]", "\"double\"", (java.util.List<java.lang.String>) strList3);
            org.junit.Assert.fail("Expected exception of type org.apache.avro.SchemaParseException; message: Illegal initial character: {\"type\":\"fixed\",\"name\":\"union\",\"namespace\":\"{}\",\"doc\":\"hi!\",\"size\":1}");
        } catch (org.apache.avro.SchemaParseException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1592() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SchemaM3Random300Test3.test1592");
        org.apache.avro.Schema schema2 = org.apache.avro.Schema.parse("{\"type\":\"map\",\"values\":[]}", true);
        java.lang.String str3 = schema2.getName();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Set<java.lang.String> strSet4 = schema2.getAliases();
            org.junit.Assert.fail("Expected exception of type org.apache.avro.AvroRuntimeException; message: Not a named type: {\"type\":\"map\",\"values\":[]}");
        } catch (org.apache.avro.AvroRuntimeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(schema2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "map" + "'", str3, "map");
    }

    @Test
    public void test1593() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SchemaM3Random300Test3.test1593");
        org.apache.avro.Schema.Names names1 = new org.apache.avro.Schema.Names("union type:UNION pos:-1");
        names1.space("hi!");
    }

    @Test
    public void test1594() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SchemaM3Random300Test3.test1594");
        org.apache.avro.Schema.Names names1 = new org.apache.avro.Schema.Names("{\"type\":\"fixed\",\"name\":\"union\",\"namespace\":\"[]\",\"doc\":\"union type:UNION pos:-1\",\"size\":100}");
        names1.clear();
        java.lang.Object obj3 = names1.clone();
        org.junit.Assert.assertNotNull(obj3);
        org.junit.Assert.assertEquals(obj3.toString(), "{}");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj3), "{}");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj3), "{}");
    }

    @Test
    public void test1595() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SchemaM3Random300Test3.test1595");
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
        org.apache.avro.Schema.Parser parser14 = new org.apache.avro.Schema.Parser();
        org.apache.avro.Schema.Parser parser16 = parser14.setValidate(true);
        org.apache.avro.Schema.Parser parser18 = parser14.setValidate(true);
        org.apache.avro.Schema.Parser parser20 = parser14.setValidate(true);
        java.util.Map<java.lang.String, org.apache.avro.Schema> strMap21 = parser14.getTypes();
        org.apache.avro.Schema.Parser parser22 = parser9.addTypes(strMap21);
        java.io.File file23 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.avro.Schema schema24 = parser9.parse(file23);
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
        org.junit.Assert.assertNotNull(parser16);
        org.junit.Assert.assertNotNull(parser18);
        org.junit.Assert.assertNotNull(parser20);
        org.junit.Assert.assertNotNull(strMap21);
        org.junit.Assert.assertNotNull(parser22);
    }

    @Test
    public void test1596() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SchemaM3Random300Test3.test1596");
        org.apache.avro.Schema schema1 = org.apache.avro.Schema.parse("{\"type\":\"array\",\"items\":{\"type\":\"array\",\"items\":{\"type\":\"map\",\"values\":[]}}}");
        org.apache.avro.Schema schema2 = org.apache.avro.Schema.createMap(schema1);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.avro.Schema schema3 = schema1.getValueType();
            org.junit.Assert.fail("Expected exception of type org.apache.avro.AvroRuntimeException; message: Not a map: {\"type\":\"array\",\"items\":{\"type\":\"array\",\"items\":{\"type\":\"map\",\"values\":[]}}}");
        } catch (org.apache.avro.AvroRuntimeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(schema1);
        org.junit.Assert.assertNotNull(schema2);
    }

    @Test
    public void test1597() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SchemaM3Random300Test3.test1597");
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
        org.apache.avro.Schema schema14 = parser0.parse("{\"type\":\"double\",\"float\":\"{\\\"type\\\":\\\"array\\\",\\\"items\\\":[]}\"}");
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
    public void test1598() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SchemaM3Random300Test3.test1598");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.avro.Schema schema4 = org.apache.avro.Schema.createRecord("", "double", "{\"type\":\"record\",\"fields\":[],\"{\\r\\n  \\\"type\\\" : \\\"fixed\\\",\\r\\n  \\\"name\\\" : \\\"union\\\",\\r\\n  \\\"namespace\\\" : \\\"[]\\\",\\r\\n  \\\"doc\\\" : \\\"[ ]\\\",\\r\\n  \\\"size\\\" : 0\\r\\n}\":\"[ ]\"}", true);
            org.junit.Assert.fail("Expected exception of type org.apache.avro.SchemaParseException; message: Empty name");
        } catch (org.apache.avro.SchemaParseException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1599() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SchemaM3Random300Test3.test1599");
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
        java.lang.String str44 = schema43.getName();
        java.lang.String str46 = schema43.getProp("");
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
        org.junit.Assert.assertEquals("'" + str44 + "' != '" + "union" + "'", str44, "union");
        org.junit.Assert.assertNull(str46);
    }

    @Test
    public void test1600() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SchemaM3Random300Test3.test1600");
        org.apache.avro.Schema.LockableArrayList<java.lang.Object> objList1 = new org.apache.avro.Schema.LockableArrayList<java.lang.Object>((int) 'a');
    }

    @Test
    public void test1601() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SchemaM3Random300Test3.test1601");
        org.apache.avro.Schema schema1 = org.apache.avro.Schema.parse("{\"type\":\"fixed\",\"name\":\"union\",\"namespace\":\"[]\",\"doc\":\"[ ]\",\"size\":0}");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.avro.Schema.Field field3 = schema1.getField("{\r\n  \"type\" : \"array\",\r\n  \"items\" : [ ],\r\n  \"{}\" : \"hi!\"\r\n}");
            org.junit.Assert.fail("Expected exception of type org.apache.avro.AvroRuntimeException; message: Not a record: {\"type\":\"fixed\",\"name\":\"union\",\"namespace\":\"[]\",\"doc\":\"[ ]\",\"size\":0}");
        } catch (org.apache.avro.AvroRuntimeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(schema1);
    }

    @Test
    public void test1602() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SchemaM3Random300Test3.test1602");
        java.util.List<java.lang.String> strList0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.avro.Schema.LockableArrayList<java.lang.String> strList1 = new org.apache.avro.Schema.LockableArrayList<java.lang.String>(strList0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1603() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SchemaM3Random300Test3.test1603");
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
        org.apache.avro.Schema schema27 = org.apache.avro.Schema.createMap(schema21);
        java.lang.String str28 = schema21.getFullName();
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
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "array" + "'", str28, "array");
    }

    @Test
    public void test1604() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SchemaM3Random300Test3.test1604");
        java.util.List<java.lang.String> strList3 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.avro.Schema schema4 = org.apache.avro.Schema.createEnum("{\"type\":\"map\",\"values\":{\"type\":\"record\",\"fields\":[]}}", "{\"type\":\"float\",\"{\\r\\n  \\\"type\\\" : \\\"record\\\",\\r\\n  \\\"fields\\\" : [ ]\\r\\n}\":\"{\\r\\n  \\\"type\\\" : \\\"map\\\",\\r\\n  \\\"values\\\" : [ ]\\r\\n}\"}", "[ ]", strList3);
            org.junit.Assert.fail("Expected exception of type org.apache.avro.SchemaParseException; message: Illegal initial character: {\"type\":\"map\",\"values\":{\"type\":\"record\",\"fields\":[]}}");
        } catch (org.apache.avro.SchemaParseException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1605() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SchemaM3Random300Test3.test1605");
        org.apache.avro.Schema.Names names1 = new org.apache.avro.Schema.Names("[]");
        java.util.Collection<org.apache.avro.Schema> schemaCollection2 = names1.values();
        org.junit.Assert.assertNotNull(schemaCollection2);
    }

    @Test
    public void test1606() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SchemaM3Random300Test3.test1606");
        org.apache.avro.Schema schema1 = org.apache.avro.Schema.parse("{\"type\":\"array\",\"items\":{\"type\":\"array\",\"items\":{\"type\":\"map\",\"values\":[]}}}");
        org.apache.avro.Schema schema2 = org.apache.avro.Schema.createMap(schema1);
        // The following exception was thrown during execution in test generation
        try {
            int int3 = schema1.getFixedSize();
            org.junit.Assert.fail("Expected exception of type org.apache.avro.AvroRuntimeException; message: Not fixed: {\"type\":\"array\",\"items\":{\"type\":\"array\",\"items\":{\"type\":\"map\",\"values\":[]}}}");
        } catch (org.apache.avro.AvroRuntimeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(schema1);
        org.junit.Assert.assertNotNull(schema2);
    }

    @Test
    public void test1607() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SchemaM3Random300Test3.test1607");
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
        schema8.addProp("", "{\"type\":\"record\",\"fields\":[],\"{\\r\\n  \\\"type\\\" : \\\"map\\\",\\r\\n  \\\"values\\\" : {\\r\\n    \\\"type\\\" : \\\"map\\\",\\r\\n    \\\"values\\\" : [ ]\\r\\n  }\\r\\n}\":\"{}\"}");
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
    }

    @Test
    public void test1608() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SchemaM3Random300Test3.test1608");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.avro.Schema schema4 = org.apache.avro.Schema.createFixed("{\"type\":\"map\",\"values\":[]}", "union type:MAP pos:-1", "{\r\n  \"type\" : \"fixed\",\r\n  \"name\" : \"union\",\r\n  \"namespace\" : \"union type:UNION pos:-1\",\r\n  \"doc\" : \"\",\r\n  \"size\" : 10\r\n}", (-1));
            org.junit.Assert.fail("Expected exception of type org.apache.avro.SchemaParseException; message: Illegal initial character: {\"type\":\"map\",\"values\":[]}");
        } catch (org.apache.avro.SchemaParseException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1609() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SchemaM3Random300Test3.test1609");
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
        org.codehaus.jackson.JsonNode jsonNode13 = org.apache.avro.Schema.parseJson("{\"type\":\"array\",\"items\":\"int\"}");
        org.apache.avro.Schema.Field field14 = new org.apache.avro.Schema.Field("double", schema9, "[].union", jsonNode13);
        java.lang.String str16 = schema9.getProp("union type:FIXED pos:-1");
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
        org.junit.Assert.assertNotNull(jsonNode13);
        org.junit.Assert.assertNull(str16);
    }

    @Test
    public void test1610() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SchemaM3Random300Test3.test1610");
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
        org.apache.avro.Schema schema15 = org.apache.avro.Schema.createArray(schema11);
        // The following exception was thrown during execution in test generation
        try {
            schema11.addAlias("{\r\n  \"type\" : \"array\",\r\n  \"items\" : [ ],\r\n  \"{}\" : \"hi!\"\r\n}");
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
        org.junit.Assert.assertNotNull(schema14);
        org.junit.Assert.assertNotNull(schema15);
    }

    @Test
    public void test1611() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SchemaM3Random300Test3.test1611");
        org.apache.avro.Schema schema2 = org.apache.avro.Schema.parse("{\"type\":\"array\",\"items\":{\"type\":\"map\",\"values\":[]}}", false);
        java.lang.String str3 = schema2.toString();
        // The following exception was thrown during execution in test generation
        try {
            int int5 = schema2.getEnumOrdinal("{\"type\":\"array\",\"items\":{\"type\":\"array\",\"items\":{\"type\":\"map\",\"values\":[]}}}");
            org.junit.Assert.fail("Expected exception of type org.apache.avro.AvroRuntimeException; message: Not an enum: {\"type\":\"array\",\"items\":{\"type\":\"map\",\"values\":[]}}");
        } catch (org.apache.avro.AvroRuntimeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(schema2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "{\"type\":\"array\",\"items\":{\"type\":\"map\",\"values\":[]}}" + "'", str3, "{\"type\":\"array\",\"items\":{\"type\":\"map\",\"values\":[]}}");
    }

    @Test
    public void test1612() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SchemaM3Random300Test3.test1612");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.avro.Schema schema4 = org.apache.avro.Schema.createFixed("{\"type\":\"array\",\"items\":[],\"{}\":\"hi!\"}", "{null={\"type\":\"map\",\"values\":{\"type\":\"array\",\"items\":{\"type\":\"map\",\"values\":[]}}}}", "{\r\n  \"type\" : \"record\",\r\n  \"fields\" : [ ],\r\n  \"{\\\"type\\\":\\\"array\\\",\\\"items\\\":[],\\\"union type:UNION pos:-1\\\":\\\"\\\"}\" : \"{null={\\\"type\\\":\\\"map\\\",\\\"values\\\":[]}}\"\r\n}", (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type org.apache.avro.SchemaParseException; message: Illegal initial character: {\"type\":\"array\",\"items\":[],\"{}\":\"hi!\"}");
        } catch (org.apache.avro.SchemaParseException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1613() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SchemaM3Random300Test3.test1613");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.avro.Schema schema4 = org.apache.avro.Schema.createRecord("union type:MAP pos:-1", "{null={\"type\":\"map\",\"values\":{\"type\":\"array\",\"items\":{\"type\":\"map\",\"values\":[]}}}}", "{\r\n  \"type\" : \"map\",\r\n  \"values\" : {\r\n    \"type\" : \"enum\",\r\n    \"name\" : \"union\",\r\n    \"namespace\" : \"[]\",\r\n    \"doc\" : \"{}\",\r\n    \"symbols\" : [ ]\r\n  }\r\n}", false);
            org.junit.Assert.fail("Expected exception of type org.apache.avro.SchemaParseException; message: Illegal character in: union type:MAP pos:-1");
        } catch (org.apache.avro.SchemaParseException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1614() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SchemaM3Random300Test3.test1614");
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
        org.apache.avro.Schema schema13 = org.apache.avro.Schema.createUnion(schemaList12);
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
        org.junit.Assert.assertNotNull(schema13);
    }

    @Test
    public void test1615() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SchemaM3Random300Test3.test1615");
        org.apache.avro.Schema.Parser parser0 = new org.apache.avro.Schema.Parser();
        java.util.Map<java.lang.String, org.apache.avro.Schema> strMap1 = parser0.getTypes();
        java.util.Map<java.lang.String, org.apache.avro.Schema> strMap2 = parser0.getTypes();
        org.apache.avro.Schema.Parser parser3 = new org.apache.avro.Schema.Parser();
        org.apache.avro.Schema.Parser parser5 = parser3.setValidate(true);
        java.util.Map<java.lang.String, org.apache.avro.Schema> strMap6 = parser3.getTypes();
        org.apache.avro.Schema.Parser parser7 = parser0.addTypes(strMap6);
        java.util.Map<java.lang.String, org.apache.avro.Schema> strMap8 = parser0.getTypes();
        org.apache.avro.Schema.Parser parser10 = parser0.setValidate(false);
        java.io.InputStream inputStream11 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.avro.Schema schema12 = parser0.parse(inputStream11);
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
    }

    @Test
    public void test1616() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SchemaM3Random300Test3.test1616");
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
        boolean boolean13 = parser12.getValidate();
        org.apache.avro.Schema.Parser parser15 = parser12.setValidate(true);
        org.junit.Assert.assertNotNull(strMap1);
        org.junit.Assert.assertNotNull(strMap2);
        org.junit.Assert.assertNotNull(parser5);
        org.junit.Assert.assertNotNull(strMap6);
        org.junit.Assert.assertNotNull(parser7);
        org.junit.Assert.assertNotNull(schema9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(parser12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(parser15);
    }

    @Test
    public void test1617() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SchemaM3Random300Test3.test1617");
        org.apache.avro.Schema.Names names1 = new org.apache.avro.Schema.Names("{null=[]}");
    }

    @Test
    public void test1618() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SchemaM3Random300Test3.test1618");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.avro.Schema.LockableArrayList<org.codehaus.jackson.map.ObjectMapper> objectMapperList1 = new org.apache.avro.Schema.LockableArrayList<org.codehaus.jackson.map.ObjectMapper>((int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal Capacity: -1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1619() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SchemaM3Random300Test3.test1619");
        org.apache.avro.Schema.LockableArrayList<java.util.ArrayList<java.lang.String>> strListList1 = new org.apache.avro.Schema.LockableArrayList<java.util.ArrayList<java.lang.String>>((int) (short) 1);
        org.apache.avro.Schema.LockableArrayList<java.util.ArrayList<java.lang.String>> strListList2 = new org.apache.avro.Schema.LockableArrayList<java.util.ArrayList<java.lang.String>>((java.util.List<java.util.ArrayList<java.lang.String>>) strListList1);
        org.apache.avro.Schema.LockableArrayList<java.util.ArrayList<java.lang.String>> strListList3 = new org.apache.avro.Schema.LockableArrayList<java.util.ArrayList<java.lang.String>>((java.util.List<java.util.ArrayList<java.lang.String>>) strListList1);
    }

    @Test
    public void test1620() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SchemaM3Random300Test3.test1620");
        org.apache.avro.Schema schema2 = org.apache.avro.Schema.parse("{\"type\":\"map\",\"values\":[]}", true);
        // The following exception was thrown during execution in test generation
        try {
            int int4 = schema2.getEnumOrdinal("{\"type\":\"array\",\"items\":{\"type\":\"map\",\"values\":[]},\"union type:MAP pos:-1\":\"{\\\"type\\\":\\\"array\\\",\\\"items\\\":{\\\"type\\\":\\\"map\\\",\\\"values\\\":[]}}\"}");
            org.junit.Assert.fail("Expected exception of type org.apache.avro.AvroRuntimeException; message: Not an enum: {\"type\":\"map\",\"values\":[]}");
        } catch (org.apache.avro.AvroRuntimeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(schema2);
    }

    @Test
    public void test1621() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SchemaM3Random300Test3.test1621");
        org.apache.avro.Schema.Type type0 = org.apache.avro.Schema.Type.DOUBLE;
        org.apache.avro.Schema schema1 = org.apache.avro.Schema.create(type0);
        org.apache.avro.Schema schema2 = org.apache.avro.Schema.createMap(schema1);
        schema1.addProp("float", "{\"type\":\"array\",\"items\":[]}");
        java.lang.String str6 = schema1.toString();
        java.lang.String str7 = schema1.toString();
        org.junit.Assert.assertTrue("'" + type0 + "' != '" + org.apache.avro.Schema.Type.DOUBLE + "'", type0.equals(org.apache.avro.Schema.Type.DOUBLE));
        org.junit.Assert.assertNotNull(schema1);
        org.junit.Assert.assertNotNull(schema2);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "{\"type\":\"double\",\"float\":\"{\\\"type\\\":\\\"array\\\",\\\"items\\\":[]}\"}" + "'", str6, "{\"type\":\"double\",\"float\":\"{\\\"type\\\":\\\"array\\\",\\\"items\\\":[]}\"}");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "{\"type\":\"double\",\"float\":\"{\\\"type\\\":\\\"array\\\",\\\"items\\\":[]}\"}" + "'", str7, "{\"type\":\"double\",\"float\":\"{\\\"type\\\":\\\"array\\\",\\\"items\\\":[]}\"}");
    }

    @Test
    public void test1622() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SchemaM3Random300Test3.test1622");
        org.apache.avro.Schema.Parser parser0 = new org.apache.avro.Schema.Parser();
        java.util.Map<java.lang.String, org.apache.avro.Schema> strMap1 = parser0.getTypes();
        org.apache.avro.Schema.Parser parser3 = parser0.setValidate(false);
        boolean boolean4 = parser3.getValidate();
        org.apache.avro.Schema.Parser parser6 = parser3.setValidate(true);
        org.junit.Assert.assertNotNull(strMap1);
        org.junit.Assert.assertNotNull(parser3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(parser6);
    }

    @Test
    public void test1623() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SchemaM3Random300Test3.test1623");
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
        java.util.Map<java.lang.String, org.apache.avro.Schema> strMap22 = parser19.getTypes();
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
        org.junit.Assert.assertNotNull(strMap22);
    }

    @Test
    public void test1624() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SchemaM3Random300Test3.test1624");
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
            schema8.addAlias("{\r\n  \"type\" : \"map\",\r\n  \"values\" : {\r\n    \"type\" : \"record\",\r\n    \"fields\" : [ ]\r\n  }\r\n}");
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
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNotNull(schema14);
    }

    @Test
    public void test1625() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SchemaM3Random300Test3.test1625");
        org.apache.avro.Schema schema4 = org.apache.avro.Schema.createRecord("double", "int", "union type:UNION pos:-1.union", true);
        org.junit.Assert.assertNotNull(schema4);
    }

    @Test
    public void test1626() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SchemaM3Random300Test3.test1626");
        org.apache.avro.Schema schema4 = org.apache.avro.Schema.createFixed("union", "", "union type:UNION pos:-1", 10);
        int int5 = schema4.getFixedSize();
        org.apache.avro.Schema schema6 = org.apache.avro.Schema.createArray(schema4);
        java.lang.String str7 = schema4.getNamespace();
        org.junit.Assert.assertNotNull(schema4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 10 + "'", int5 == 10);
        org.junit.Assert.assertNotNull(schema6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "union type:UNION pos:-1" + "'", str7, "union type:UNION pos:-1");
    }

    @Test
    public void test1627() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SchemaM3Random300Test3.test1627");
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
            org.apache.avro.Schema schema14 = schema4.getElementType();
            org.junit.Assert.fail("Expected exception of type org.apache.avro.AvroRuntimeException; message: Not an array: []");
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
    public void test1628() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SchemaM3Random300Test3.test1628");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.avro.Schema.LockableArrayList<java.util.AbstractCollection<java.lang.String>> strCollectionList1 = new org.apache.avro.Schema.LockableArrayList<java.util.AbstractCollection<java.lang.String>>((-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal Capacity: -1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1629() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SchemaM3Random300Test3.test1629");
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
        java.lang.String str19 = schema18.toString();
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<org.apache.avro.Schema> schemaList20 = schema18.getTypes();
            org.junit.Assert.fail("Expected exception of type org.apache.avro.AvroRuntimeException; message: Not a union: {\"type\":\"fixed\",\"name\":\"union\",\"namespace\":\"{}\",\"doc\":\"hi!\",\"size\":1}");
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
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "{\"type\":\"fixed\",\"name\":\"union\",\"namespace\":\"{}\",\"doc\":\"hi!\",\"size\":1}" + "'", str19, "{\"type\":\"fixed\",\"name\":\"union\",\"namespace\":\"{}\",\"doc\":\"hi!\",\"size\":1}");
    }

    @Test
    public void test1630() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SchemaM3Random300Test3.test1630");
        org.apache.avro.Schema.Parser parser0 = new org.apache.avro.Schema.Parser();
        java.util.Map<java.lang.String, org.apache.avro.Schema> strMap1 = parser0.getTypes();
        java.util.Map<java.lang.String, org.apache.avro.Schema> strMap2 = parser0.getTypes();
        org.apache.avro.Schema.Parser parser3 = new org.apache.avro.Schema.Parser();
        java.util.Map<java.lang.String, org.apache.avro.Schema> strMap4 = parser3.getTypes();
        org.apache.avro.Schema.Parser parser5 = parser0.addTypes(strMap4);
        boolean boolean6 = parser0.getValidate();
        boolean boolean7 = parser0.getValidate();
        org.apache.avro.Schema schema9 = parser0.parse("{\r\n  \"type\" : \"fixed\",\r\n  \"name\" : \"union\",\r\n  \"namespace\" : \"[]\",\r\n  \"doc\" : \"[ ]\",\r\n  \"size\" : 0,\r\n  \"{\\r\\n  \\\"type\\\" : \\\"fixed\\\",\\r\\n  \\\"name\\\" : \\\"union\\\",\\r\\n  \\\"namespace\\\" : \\\"[]\\\",\\r\\n  \\\"doc\\\" : \\\"[ ]\\\",\\r\\n  \\\"size\\\" : 0\\r\\n}\" : \"{\\r\\n  \\\"type\\\" : \\\"map\\\",\\r\\n  \\\"values\\\" : {\\r\\n    \\\"type\\\" : \\\"map\\\",\\r\\n    \\\"values\\\" : [ ]\\r\\n  }\\r\\n}\"\r\n}");
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
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(schema9);
    }

    @Test
    public void test1631() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SchemaM3Random300Test3.test1631");
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
        org.apache.avro.Schema schema18 = parser9.parse("{\r\n  \"type\" : \"array\",\r\n  \"items\" : \"int\"\r\n}");
        org.apache.avro.Schema schema19 = schema18.getElementType();
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
        org.junit.Assert.assertNotNull(schema18);
        org.junit.Assert.assertNotNull(schema19);
    }

    @Test
    public void test1632() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SchemaM3Random300Test3.test1632");
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
        org.apache.avro.Schema schema16 = schema15.getElementType();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.avro.Schema.Field field18 = schema16.getField("{\"type\":\"array\",\"items\":[],\"union type:UNION pos:-1\":\"\"}");
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
        org.junit.Assert.assertNotNull(schema16);
    }

    @Test
    public void test1633() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SchemaM3Random300Test3.test1633");
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
        names0.space("{\r\n  \"type\" : \"map\",\r\n  \"values\" : {\r\n    \"type\" : \"enum\",\r\n    \"name\" : \"union\",\r\n    \"namespace\" : \"[]\",\r\n    \"doc\" : \"{}\",\r\n    \"symbols\" : [ ]\r\n  }\r\n}");
        names0.clear();
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
    public void test1634() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SchemaM3Random300Test3.test1634");
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
        java.util.Map<java.lang.String, org.apache.avro.Schema> strMap27 = parser26.getTypes();
        java.io.InputStream inputStream28 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.avro.Schema schema29 = parser26.parse(inputStream28);
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
        org.junit.Assert.assertNotNull(strMap27);
    }

    @Test
    public void test1635() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SchemaM3Random300Test3.test1635");
        org.apache.avro.Schema[] schemaArray0 = new org.apache.avro.Schema[] {};
        java.util.ArrayList<org.apache.avro.Schema> schemaList1 = new java.util.ArrayList<org.apache.avro.Schema>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<org.apache.avro.Schema>) schemaList1, schemaArray0);
        org.apache.avro.Schema schema3 = org.apache.avro.Schema.createUnion((java.util.List<org.apache.avro.Schema>) schemaList1);
        java.util.List<org.apache.avro.Schema> schemaList4 = schema3.getTypes();
        org.apache.avro.Schema schema5 = org.apache.avro.Schema.createMap(schema3);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.avro.Schema.Field field7 = schema3.getField("{\"type\":\"fixed\",\"name\":\"union\",\"namespace\":\"[]\",\"doc\":\"[ ]\",\"size\":0}");
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
    }

    @Test
    public void test1636() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SchemaM3Random300Test3.test1636");
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
        org.apache.avro.Schema schema18 = parser6.parse("{\r\n  \"type\" : \"map\",\r\n  \"values\" : [ ]\r\n}");
        java.lang.String str19 = schema18.getFullName();
        // The following exception was thrown during execution in test generation
        try {
            int int21 = schema18.getEnumOrdinal("{\"type\":\"float\",\"{\\r\\n  \\\"type\\\" : \\\"record\\\",\\r\\n  \\\"fields\\\" : [ ]\\r\\n}\":\"{\\r\\n  \\\"type\\\" : \\\"map\\\",\\r\\n  \\\"values\\\" : [ ]\\r\\n}\"}");
            org.junit.Assert.fail("Expected exception of type org.apache.avro.AvroRuntimeException; message: Not an enum: {\"type\":\"map\",\"values\":[]}");
        } catch (org.apache.avro.AvroRuntimeException e) {
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
        org.junit.Assert.assertNotNull(schema18);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "map" + "'", str19, "map");
    }

    @Test
    public void test1637() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SchemaM3Random300Test3.test1637");
        org.apache.avro.Schema schema2 = org.apache.avro.Schema.parse("{\"type\":\"array\",\"items\":\"int\"}", true);
        org.apache.avro.Schema schema3 = schema2.getElementType();
        // The following exception was thrown during execution in test generation
        try {
            int int5 = schema2.getEnumOrdinal("{}");
            org.junit.Assert.fail("Expected exception of type org.apache.avro.AvroRuntimeException; message: Not an enum: {\"type\":\"array\",\"items\":\"int\"}");
        } catch (org.apache.avro.AvroRuntimeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(schema2);
        org.junit.Assert.assertNotNull(schema3);
    }

    @Test
    public void test1638() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SchemaM3Random300Test3.test1638");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.avro.Schema schema4 = org.apache.avro.Schema.createFixed("{\"type\":\"record\",\"fields\":[],\"{\\r\\n  \\\"type\\\" : \\\"fixed\\\",\\r\\n  \\\"name\\\" : \\\"union\\\",\\r\\n  \\\"namespace\\\" : \\\"[]\\\",\\r\\n  \\\"doc\\\" : \\\"[ ]\\\",\\r\\n  \\\"size\\\" : 0\\r\\n}\":\"[ ]\"}", "union type:UNION pos:-1.union", "union", 10);
            org.junit.Assert.fail("Expected exception of type org.apache.avro.SchemaParseException; message: Illegal initial character: {\"type\":\"record\",\"fields\":[],\"{\\r\\n  \\\"type\\\" : \\\"fixed\\\",\\r\\n  \\\"name\\\" : \\\"union\\\",\\r\\n  \\\"namespace\\\" : \\\"[]\\\",\\r\\n  \\\"doc\\\" : \\\"[ ]\\\",\\r\\n  \\\"size\\\" : 0\\r\\n}\":\"[ ]\"}");
        } catch (org.apache.avro.SchemaParseException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1639() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SchemaM3Random300Test3.test1639");
        org.apache.avro.Schema.Parser parser0 = new org.apache.avro.Schema.Parser();
        java.util.Map<java.lang.String, org.apache.avro.Schema> strMap1 = parser0.getTypes();
        java.util.Map<java.lang.String, org.apache.avro.Schema> strMap2 = parser0.getTypes();
        org.apache.avro.Schema.Parser parser3 = new org.apache.avro.Schema.Parser();
        org.apache.avro.Schema.Parser parser5 = parser3.setValidate(true);
        java.util.Map<java.lang.String, org.apache.avro.Schema> strMap6 = parser3.getTypes();
        org.apache.avro.Schema.Parser parser7 = parser0.addTypes(strMap6);
        org.apache.avro.Schema.Parser parser9 = parser7.setValidate(true);
        java.util.Map<java.lang.String, org.apache.avro.Schema> strMap10 = parser7.getTypes();
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
        org.junit.Assert.assertNotNull(parser9);
        org.junit.Assert.assertNotNull(strMap10);
    }

    @Test
    public void test1640() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SchemaM3Random300Test3.test1640");
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
        java.lang.String str16 = schema15.toString();
        java.lang.String str18 = schema15.getProp("{\r\n  \"type\" : \"record\",\r\n  \"fields\" : [ ]\r\n}");
        java.lang.String str19 = schema15.getName();
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
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "{\"type\":\"map\",\"values\":[]}" + "'", str16, "{\"type\":\"map\",\"values\":[]}");
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "map" + "'", str19, "map");
    }

    @Test
    public void test1641() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SchemaM3Random300Test3.test1641");
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
        org.apache.avro.Schema schema18 = parser9.parse("{\r\n  \"type\" : \"array\",\r\n  \"items\" : \"int\"\r\n}");
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<org.apache.avro.Schema> schemaList19 = schema18.getTypes();
            org.junit.Assert.fail("Expected exception of type org.apache.avro.AvroRuntimeException; message: Not a union: {\"type\":\"array\",\"items\":\"int\"}");
        } catch (org.apache.avro.AvroRuntimeException e) {
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
        org.junit.Assert.assertNotNull(schema18);
    }

    @Test
    public void test1642() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SchemaM3Random300Test3.test1642");
        org.apache.avro.Schema.Parser parser0 = new org.apache.avro.Schema.Parser();
        org.apache.avro.Schema.Parser parser2 = parser0.setValidate(true);
        org.apache.avro.Schema.Parser parser4 = parser0.setValidate(true);
        org.apache.avro.Schema.Parser parser6 = parser0.setValidate(true);
        org.apache.avro.Schema schema8 = parser0.parse("[].union");
        org.apache.avro.Schema schema10 = parser0.parse("{\"type\":\"fixed\",\"name\":\"union\",\"namespace\":\"[]\",\"doc\":\"[ ]\",\"size\":0}");
        java.lang.String str11 = schema10.getFullName();
        org.junit.Assert.assertNotNull(parser2);
        org.junit.Assert.assertNotNull(parser4);
        org.junit.Assert.assertNotNull(parser6);
        org.junit.Assert.assertNotNull(schema8);
        org.junit.Assert.assertNotNull(schema10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "[].union" + "'", str11, "[].union");
    }

    @Test
    public void test1643() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SchemaM3Random300Test3.test1643");
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
        boolean boolean17 = parser16.getValidate();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.avro.Schema schema19 = parser16.parse("{null=null}");
            org.junit.Assert.fail("Expected exception of type org.apache.avro.SchemaParseException; message: org.codehaus.jackson.JsonParseException: Unexpected character ('n' (code 110)): was expecting double-quote to start field name? at [Source: java.io.StringReader@17b61d9c; line: 1, column: 3]");
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
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test1644() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SchemaM3Random300Test3.test1644");
        org.apache.avro.Schema.LockableArrayList<org.apache.avro.Schema.Parser> parserList1 = new org.apache.avro.Schema.LockableArrayList<org.apache.avro.Schema.Parser>((int) (short) 1);
    }

    @Test
    public void test1645() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SchemaM3Random300Test3.test1645");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.avro.Schema schema4 = org.apache.avro.Schema.createFixed("hi!", "{null={\"type\":\"map\",\"values\":{\"type\":\"array\",\"items\":{\"type\":\"map\",\"values\":[]}}}}", "{\"type\":\"fixed\",\"name\":\"union\",\"namespace\":\"[]\",\"doc\":\"{\\r\\n  \\\"type\\\" : \\\"map\\\",\\r\\n  \\\"values\\\" : [ ]\\r\\n}\",\"size\":10}", 0);
            org.junit.Assert.fail("Expected exception of type org.apache.avro.SchemaParseException; message: Illegal character in: hi!");
        } catch (org.apache.avro.SchemaParseException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1646() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SchemaM3Random300Test3.test1646");
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
        boolean boolean46 = parser45.getValidate();
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
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
    }

    @Test
    public void test1647() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SchemaM3Random300Test3.test1647");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.avro.Schema schema4 = org.apache.avro.Schema.createFixed("{\r\n  \"type\" : \"record\",\r\n  \"fields\" : [ ]\r\n}", "{\r\n  \"type\" : \"array\",\r\n  \"items\" : \"int\"\r\n}", "", (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type org.apache.avro.SchemaParseException; message: Illegal initial character: {??  \"type\" : \"record\",??  \"fields\" : [ ]??}");
        } catch (org.apache.avro.SchemaParseException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1648() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SchemaM3Random300Test3.test1648");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.avro.Schema schema4 = org.apache.avro.Schema.createRecord("{\r\n  \"type\" : \"fixed\",\r\n  \"name\" : \"union\",\r\n  \"namespace\" : \"[]\",\r\n  \"doc\" : \"[ ]\",\r\n  \"size\" : 0\r\n}", "{\"type\":\"array\",\"items\":[],\"union type:UNION pos:-1\":\"\"}", "{\r\n  \"type\" : \"record\",\r\n  \"fields\" : [ ]\r\n}", true);
            org.junit.Assert.fail("Expected exception of type org.apache.avro.SchemaParseException; message: Illegal initial character: {??  \"type\" : \"fixed\",??  \"name\" : \"union\",??  \"namespace\" : \"[]\",??  \"doc\" : \"[ ]\",??  \"size\" : 0??}");
        } catch (org.apache.avro.SchemaParseException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1649() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SchemaM3Random300Test3.test1649");
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
            org.apache.avro.Schema schema13 = schema12.getValueType();
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
        org.junit.Assert.assertNotNull(schema12);
    }

    @Test
    public void test1650() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SchemaM3Random300Test3.test1650");
        org.apache.avro.Schema schema1 = org.apache.avro.Schema.parse("[]");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Set<java.lang.String> strSet2 = schema1.getAliases();
            org.junit.Assert.fail("Expected exception of type org.apache.avro.AvroRuntimeException; message: Not a named type: []");
        } catch (org.apache.avro.AvroRuntimeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(schema1);
    }

    @Test
    public void test1651() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SchemaM3Random300Test3.test1651");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.avro.Schema schema4 = org.apache.avro.Schema.createRecord("{\r\n  \"type\" : \"map\",\r\n  \"values\" : {\r\n    \"type\" : \"map\",\r\n    \"values\" : [ ]\r\n  }\r\n}", "{\r\n  \"type\" : \"array\",\r\n  \"items\" : [ ]\r\n}", "{\r\n  \"type\" : \"record\",\r\n  \"fields\" : [ ],\r\n  \"{\\\"type\\\":\\\"array\\\",\\\"items\\\":[],\\\"union type:UNION pos:-1\\\":\\\"\\\"}\" : \"{null={\\\"type\\\":\\\"map\\\",\\\"values\\\":[]}}\"\r\n}", false);
            org.junit.Assert.fail("Expected exception of type org.apache.avro.SchemaParseException; message: Illegal initial character: {??  \"type\" : \"map\",??  \"values\" : {??    \"type\" : \"map\",??    \"values\" : [ ]??  }??}");
        } catch (org.apache.avro.SchemaParseException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1652() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SchemaM3Random300Test3.test1652");
        org.apache.avro.Schema.LockableArrayList<java.lang.String> strList4 = new org.apache.avro.Schema.LockableArrayList<java.lang.String>((int) (byte) 10);
        org.apache.avro.Schema schema5 = org.apache.avro.Schema.createEnum("[].union", "union type:UNION pos:-1", "union type:UNION pos:-1", (java.util.List<java.lang.String>) strList4);
        org.apache.avro.Schema schema6 = org.apache.avro.Schema.createArray(schema5);
        // The following exception was thrown during execution in test generation
        try {
            schema6.addAlias("union type:MAP pos:-1");
            org.junit.Assert.fail("Expected exception of type org.apache.avro.AvroRuntimeException; message: Not a named type: {\"type\":\"array\",\"items\":{\"type\":\"enum\",\"name\":\"union\",\"namespace\":\"[]\",\"doc\":\"union type:UNION pos:-1\",\"symbols\":[]}}");
        } catch (org.apache.avro.AvroRuntimeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(schema5);
        org.junit.Assert.assertNotNull(schema6);
    }

    @Test
    public void test1653() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SchemaM3Random300Test3.test1653");
        java.util.ArrayList<java.lang.Comparable<java.lang.String>> strComparableList11 = new java.util.ArrayList<java.lang.Comparable<java.lang.String>>();
        boolean boolean12 = strComparableList11.add((java.lang.Comparable<java.lang.String>) "{\r\n  \"type\" : \"array\",\r\n  \"items\" : [ ],\r\n  \"{}\" : \"hi!\"\r\n}");
        boolean boolean13 = strComparableList11.add((java.lang.Comparable<java.lang.String>) "{\r\n  \"type\" : \"fixed\",\r\n  \"name\" : \"union\",\r\n  \"namespace\" : \"union type:UNION pos:-1\",\r\n  \"doc\" : \"\",\r\n  \"size\" : 10\r\n}");
        boolean boolean14 = strComparableList11.add((java.lang.Comparable<java.lang.String>) "{\"type\":\"fixed\",\"name\":\"map\",\"namespace\":\"\",\"doc\":\"array\",\"size\":97}");
        boolean boolean15 = strComparableList11.add((java.lang.Comparable<java.lang.String>) "[].union");
        boolean boolean16 = strComparableList11.add((java.lang.Comparable<java.lang.String>) "[]");
        boolean boolean17 = strComparableList11.add((java.lang.Comparable<java.lang.String>) "float");
        boolean boolean18 = strComparableList11.add((java.lang.Comparable<java.lang.String>) "{null={\"type\":\"fixed\",\"name\":\"union\",\"namespace\":\"[]\",\"doc\":\"[ ]\",\"size\":0}}");
        boolean boolean19 = strComparableList11.add((java.lang.Comparable<java.lang.String>) "int");
        boolean boolean20 = strComparableList11.add((java.lang.Comparable<java.lang.String>) "{\"type\":\"array\",\"items\":{\"type\":\"map\",\"values\":[]}}");
        boolean boolean21 = strComparableList11.add((java.lang.Comparable<java.lang.String>) "{\r\n  \"type\" : \"fixed\",\r\n  \"name\" : \"union\",\r\n  \"namespace\" : \"[]\",\r\n  \"doc\" : \"[ ]\",\r\n  \"size\" : 0,\r\n  \"{\\r\\n  \\\"type\\\" : \\\"fixed\\\",\\r\\n  \\\"name\\\" : \\\"union\\\",\\r\\n  \\\"namespace\\\" : \\\"[]\\\",\\r\\n  \\\"doc\\\" : \\\"[ ]\\\",\\r\\n  \\\"size\\\" : 0\\r\\n}\" : \"{\\r\\n  \\\"type\\\" : \\\"map\\\",\\r\\n  \\\"values\\\" : {\\r\\n    \\\"type\\\" : \\\"map\\\",\\r\\n    \\\"values\\\" : [ ]\\r\\n  }\\r\\n}\"\r\n}");
        boolean boolean22 = strComparableList11.add((java.lang.Comparable<java.lang.String>) "{\"type\":\"float\",\"{\\r\\n  \\\"type\\\" : \\\"record\\\",\\r\\n  \\\"fields\\\" : [ ]\\r\\n}\":\"{\\r\\n  \\\"type\\\" : \\\"map\\\",\\r\\n  \\\"values\\\" : [ ]\\r\\n}\"}");
        org.apache.avro.Schema.LockableArrayList<java.lang.Comparable<java.lang.String>> strComparableList23 = new org.apache.avro.Schema.LockableArrayList<java.lang.Comparable<java.lang.String>>((java.util.List<java.lang.Comparable<java.lang.String>>) strComparableList11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
    }

    @Test
    public void test1654() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SchemaM3Random300Test3.test1654");
        org.apache.avro.Schema.Names names0 = new org.apache.avro.Schema.Names();
        names0.space("[ ]");
        java.lang.Object obj3 = names0.clone();
        org.apache.avro.Schema.Names names4 = new org.apache.avro.Schema.Names();
        names4.space("[ ]");
        org.apache.avro.Schema schema7 = names0.remove((java.lang.Object) names4);
        java.util.Collection<org.apache.avro.Schema> schemaCollection8 = names4.values();
        java.lang.Object obj9 = names4.clone();
        org.junit.Assert.assertNotNull(obj3);
        org.junit.Assert.assertEquals(obj3.toString(), "{}");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj3), "{}");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj3), "{}");
        org.junit.Assert.assertNull(schema7);
        org.junit.Assert.assertNotNull(schemaCollection8);
        org.junit.Assert.assertNotNull(obj9);
        org.junit.Assert.assertEquals(obj9.toString(), "{}");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj9), "{}");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj9), "{}");
    }

    @Test
    public void test1655() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SchemaM3Random300Test3.test1655");
        org.apache.avro.Schema.LockableArrayList<java.lang.String> strList1 = new org.apache.avro.Schema.LockableArrayList<java.lang.String>((int) (byte) 10);
        org.apache.avro.Schema.LockableArrayList<java.lang.String> strList2 = new org.apache.avro.Schema.LockableArrayList<java.lang.String>((java.util.List<java.lang.String>) strList1);
        org.apache.avro.Schema.LockableArrayList<java.lang.String> strList3 = new org.apache.avro.Schema.LockableArrayList<java.lang.String>((java.util.List<java.lang.String>) strList1);
    }

    @Test
    public void test1656() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SchemaM3Random300Test3.test1656");
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
        org.junit.Assert.assertNotNull(schema7);
        org.junit.Assert.assertNotNull(parser9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test1657() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SchemaM3Random300Test3.test1657");
        org.apache.avro.Schema.Names names1 = new org.apache.avro.Schema.Names("{\"type\":\"map\",\"values\":{\"type\":\"array\",\"items\":\"int\"}}");
    }

    @Test
    public void test1658() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SchemaM3Random300Test3.test1658");
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
        java.lang.String str44 = names0.space();
        java.util.Collection<org.apache.avro.Schema> schemaCollection45 = names0.values();
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
        org.junit.Assert.assertNull(str44);
        org.junit.Assert.assertNotNull(schemaCollection45);
    }

    @Test
    public void test1659() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SchemaM3Random300Test3.test1659");
        org.apache.avro.Schema.Type type0 = org.apache.avro.Schema.Type.INT;
        org.apache.avro.Schema schema1 = org.apache.avro.Schema.create(type0);
        org.apache.avro.Schema schema2 = org.apache.avro.Schema.create(type0);
        org.apache.avro.Schema schema3 = org.apache.avro.Schema.create(type0);
        org.apache.avro.Schema schema4 = org.apache.avro.Schema.create(type0);
        org.apache.avro.Schema schema5 = org.apache.avro.Schema.create(type0);
        org.apache.avro.Schema schema6 = org.apache.avro.Schema.create(type0);
        org.junit.Assert.assertTrue("'" + type0 + "' != '" + org.apache.avro.Schema.Type.INT + "'", type0.equals(org.apache.avro.Schema.Type.INT));
        org.junit.Assert.assertNotNull(schema1);
        org.junit.Assert.assertNotNull(schema2);
        org.junit.Assert.assertNotNull(schema3);
        org.junit.Assert.assertNotNull(schema4);
        org.junit.Assert.assertNotNull(schema5);
        org.junit.Assert.assertNotNull(schema6);
    }

    @Test
    public void test1660() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SchemaM3Random300Test3.test1660");
        org.apache.avro.Schema.Parser parser0 = new org.apache.avro.Schema.Parser();
        java.util.Map<java.lang.String, org.apache.avro.Schema> strMap1 = parser0.getTypes();
        java.util.Map<java.lang.String, org.apache.avro.Schema> strMap2 = parser0.getTypes();
        org.apache.avro.Schema.Parser parser3 = new org.apache.avro.Schema.Parser();
        org.apache.avro.Schema.Parser parser5 = parser3.setValidate(true);
        java.util.Map<java.lang.String, org.apache.avro.Schema> strMap6 = parser3.getTypes();
        org.apache.avro.Schema.Parser parser7 = parser0.addTypes(strMap6);
        java.util.Map<java.lang.String, org.apache.avro.Schema> strMap8 = parser0.getTypes();
        org.apache.avro.Schema.Parser parser10 = parser0.setValidate(false);
        org.apache.avro.Schema.Parser parser11 = new org.apache.avro.Schema.Parser();
        java.util.Map<java.lang.String, org.apache.avro.Schema> strMap12 = parser11.getTypes();
        org.apache.avro.Schema.Parser parser13 = new org.apache.avro.Schema.Parser();
        org.apache.avro.Schema.Parser parser15 = parser13.setValidate(true);
        java.util.Map<java.lang.String, org.apache.avro.Schema> strMap16 = parser13.getTypes();
        org.apache.avro.Schema.Parser parser17 = parser11.addTypes(strMap16);
        boolean boolean18 = parser11.getValidate();
        boolean boolean19 = parser11.getValidate();
        org.apache.avro.Schema.Parser parser20 = new org.apache.avro.Schema.Parser();
        java.util.Map<java.lang.String, org.apache.avro.Schema> strMap21 = parser20.getTypes();
        java.util.Map<java.lang.String, org.apache.avro.Schema> strMap22 = parser20.getTypes();
        org.apache.avro.Schema.Parser parser23 = new org.apache.avro.Schema.Parser();
        java.util.Map<java.lang.String, org.apache.avro.Schema> strMap24 = parser23.getTypes();
        org.apache.avro.Schema.Parser parser25 = parser20.addTypes(strMap24);
        org.apache.avro.Schema.Parser parser26 = parser11.addTypes(strMap24);
        org.apache.avro.Schema.Parser parser27 = parser0.addTypes(strMap24);
        java.io.File file28 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.avro.Schema schema29 = parser27.parse(file28);
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
        org.junit.Assert.assertNotNull(strMap12);
        org.junit.Assert.assertNotNull(parser15);
        org.junit.Assert.assertNotNull(strMap16);
        org.junit.Assert.assertNotNull(parser17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertNotNull(strMap21);
        org.junit.Assert.assertNotNull(strMap22);
        org.junit.Assert.assertNotNull(strMap24);
        org.junit.Assert.assertNotNull(parser25);
        org.junit.Assert.assertNotNull(parser26);
        org.junit.Assert.assertNotNull(parser27);
    }

    @Test
    public void test1661() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SchemaM3Random300Test3.test1661");
        org.apache.avro.Schema.LockableArrayList<java.lang.String> strList4 = new org.apache.avro.Schema.LockableArrayList<java.lang.String>((int) ' ');
        org.apache.avro.Schema schema5 = org.apache.avro.Schema.createEnum("int", "map", "\"double\"", (java.util.List<java.lang.String>) strList4);
        org.apache.avro.Schema.LockableArrayList<java.lang.String> strList6 = new org.apache.avro.Schema.LockableArrayList<java.lang.String>((java.util.List<java.lang.String>) strList4);
        org.junit.Assert.assertNotNull(schema5);
    }

    @Test
    public void test1662() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SchemaM3Random300Test3.test1662");
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
            int int24 = schema8.getEnumOrdinal("{\"type\":\"record\",\"fields\":[],\"{\\r\\n  \\\"type\\\" : \\\"fixed\\\",\\r\\n  \\\"name\\\" : \\\"union\\\",\\r\\n  \\\"namespace\\\" : \\\"[]\\\",\\r\\n  \\\"doc\\\" : \\\"[ ]\\\",\\r\\n  \\\"size\\\" : 0\\r\\n}\":\"[ ]\"}");
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
    }

    @Test
    public void test1663() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SchemaM3Random300Test3.test1663");
        org.apache.avro.Schema.Parser parser0 = new org.apache.avro.Schema.Parser();
        java.util.Map<java.lang.String, org.apache.avro.Schema> strMap1 = parser0.getTypes();
        java.util.Map<java.lang.String, org.apache.avro.Schema> strMap2 = parser0.getTypes();
        org.apache.avro.Schema.Parser parser3 = new org.apache.avro.Schema.Parser();
        java.util.Map<java.lang.String, org.apache.avro.Schema> strMap4 = parser3.getTypes();
        org.apache.avro.Schema.Parser parser5 = parser0.addTypes(strMap4);
        org.apache.avro.Schema schema7 = parser0.parse("{\r\n  \"type\" : \"map\",\r\n  \"values\" : [ ]\r\n}");
        org.apache.avro.Schema.Parser parser9 = parser0.setValidate(true);
        org.apache.avro.Schema schema11 = parser9.parse("{\r\n  \"type\" : \"map\",\r\n  \"values\" : {\r\n    \"type\" : \"map\",\r\n    \"values\" : [ ]\r\n  }\r\n}");
        org.apache.avro.Schema.Parser parser13 = parser9.setValidate(true);
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
        org.junit.Assert.assertNotNull(strMap4);
        org.junit.Assert.assertNotNull(parser5);
        org.junit.Assert.assertNotNull(schema7);
        org.junit.Assert.assertNotNull(parser9);
        org.junit.Assert.assertNotNull(schema11);
        org.junit.Assert.assertNotNull(parser13);
    }

    @Test
    public void test1664() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SchemaM3Random300Test3.test1664");
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
        org.apache.avro.Schema[] schemaArray16 = new org.apache.avro.Schema[] {};
        java.util.ArrayList<org.apache.avro.Schema> schemaList17 = new java.util.ArrayList<org.apache.avro.Schema>();
        boolean boolean18 = java.util.Collections.addAll((java.util.Collection<org.apache.avro.Schema>) schemaList17, schemaArray16);
        org.apache.avro.Schema schema19 = org.apache.avro.Schema.createUnion((java.util.List<org.apache.avro.Schema>) schemaList17);
        org.apache.avro.Schema[] schemaArray20 = new org.apache.avro.Schema[] {};
        java.util.ArrayList<org.apache.avro.Schema> schemaList21 = new java.util.ArrayList<org.apache.avro.Schema>();
        boolean boolean22 = java.util.Collections.addAll((java.util.Collection<org.apache.avro.Schema>) schemaList21, schemaArray20);
        org.apache.avro.Schema schema23 = org.apache.avro.Schema.createUnion((java.util.List<org.apache.avro.Schema>) schemaList21);
        org.apache.avro.Schema schema24 = org.apache.avro.Schema.applyAliases(schema19, schema23);
        org.apache.avro.Schema.Type type25 = schema23.getType();
        org.apache.avro.Schema schema26 = org.apache.avro.Schema.createMap(schema23);
        org.apache.avro.Schema.Names names27 = new org.apache.avro.Schema.Names();
        java.lang.String str28 = names27.space();
        names27.space("");
        boolean boolean31 = schema23.equals((java.lang.Object) "");
        java.lang.String str32 = schema23.getFullName();
        org.apache.avro.Schema schema33 = org.apache.avro.Schema.applyAliases(schema15, schema23);
        java.lang.Class<?> wildcardClass34 = schema15.getClass();
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
        org.junit.Assert.assertNotNull(schemaArray16);
        org.junit.Assert.assertArrayEquals(schemaArray16, new org.apache.avro.Schema[] {});
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(schema19);
        org.junit.Assert.assertNotNull(schemaArray20);
        org.junit.Assert.assertArrayEquals(schemaArray20, new org.apache.avro.Schema[] {});
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(schema23);
        org.junit.Assert.assertNotNull(schema24);
        org.junit.Assert.assertTrue("'" + type25 + "' != '" + org.apache.avro.Schema.Type.UNION + "'", type25.equals(org.apache.avro.Schema.Type.UNION));
        org.junit.Assert.assertNotNull(schema26);
        org.junit.Assert.assertNull(str28);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "union" + "'", str32, "union");
        org.junit.Assert.assertNotNull(schema33);
        org.junit.Assert.assertNotNull(wildcardClass34);
    }

    @Test
    public void test1665() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SchemaM3Random300Test3.test1665");
        org.apache.avro.Schema.Names names1 = new org.apache.avro.Schema.Names("{\"type\":\"map\",\"values\":\"double\"}");
    }

    @Test
    public void test1666() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SchemaM3Random300Test3.test1666");
        org.apache.avro.Schema.LockableArrayList<java.lang.String> strList4 = new org.apache.avro.Schema.LockableArrayList<java.lang.String>(100);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.avro.Schema schema5 = org.apache.avro.Schema.createEnum("{\"type\":\"fixed\",\"name\":\"union\",\"namespace\":\"[]\",\"doc\":\"{\\r\\n  \\\"type\\\" : \\\"map\\\",\\r\\n  \\\"values\\\" : [ ]\\r\\n}\",\"size\":10}", "[].union", "{\r\n  \"type\" : \"fixed\",\r\n  \"name\" : \"union\",\r\n  \"namespace\" : \"[]\",\r\n  \"doc\" : \"[ ]\",\r\n  \"size\" : 0,\r\n  \"{\\r\\n  \\\"type\\\" : \\\"fixed\\\",\\r\\n  \\\"name\\\" : \\\"union\\\",\\r\\n  \\\"namespace\\\" : \\\"[]\\\",\\r\\n  \\\"doc\\\" : \\\"[ ]\\\",\\r\\n  \\\"size\\\" : 0\\r\\n}\" : \"{\\r\\n  \\\"type\\\" : \\\"map\\\",\\r\\n  \\\"values\\\" : {\\r\\n    \\\"type\\\" : \\\"map\\\",\\r\\n    \\\"values\\\" : [ ]\\r\\n  }\\r\\n}\"\r\n}", (java.util.List<java.lang.String>) strList4);
            org.junit.Assert.fail("Expected exception of type org.apache.avro.SchemaParseException; message: Illegal initial character: {\"type\":\"fixed\",\"name\":\"union\",\"namespace\":\"[]\",\"doc\":\"{\\r\\n  \\\"type\\\" : \\\"map\\\",\\r\\n  \\\"values\\\" : [ ]\\r\\n}\",\"size\":10}");
        } catch (org.apache.avro.SchemaParseException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1667() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SchemaM3Random300Test3.test1667");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.avro.Schema schema4 = org.apache.avro.Schema.createFixed("{\r\n  \"type\" : \"array\",\r\n  \"items\" : [ ],\r\n  \"{}\" : \"hi!\"\r\n}", "{\r\n  \"type\" : \"map\",\r\n  \"values\" : {\r\n    \"type\" : \"fixed\",\r\n    \"name\" : \"union\",\r\n    \"namespace\" : \"[]\",\r\n    \"doc\" : \"[ ]\",\r\n    \"size\" : 0\r\n  }\r\n}", "{\r\n  \"type\" : \"map\",\r\n  \"values\" : [ ]\r\n}", 10);
            org.junit.Assert.fail("Expected exception of type org.apache.avro.SchemaParseException; message: Illegal initial character: {??  \"type\" : \"array\",??  \"items\" : [ ],??  \"{}\" : \"hi!\"??}");
        } catch (org.apache.avro.SchemaParseException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1668() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SchemaM3Random300Test3.test1668");
        org.apache.avro.Schema.Parser parser0 = new org.apache.avro.Schema.Parser();
        java.util.Map<java.lang.String, org.apache.avro.Schema> strMap1 = parser0.getTypes();
        java.util.Map<java.lang.String, org.apache.avro.Schema> strMap2 = parser0.getTypes();
        org.apache.avro.Schema.Parser parser3 = new org.apache.avro.Schema.Parser();
        org.apache.avro.Schema.Parser parser5 = parser3.setValidate(true);
        java.util.Map<java.lang.String, org.apache.avro.Schema> strMap6 = parser3.getTypes();
        org.apache.avro.Schema.Parser parser7 = parser0.addTypes(strMap6);
        java.util.Map<java.lang.String, org.apache.avro.Schema> strMap8 = parser0.getTypes();
        java.lang.Class<?> wildcardClass9 = strMap8.getClass();
        org.junit.Assert.assertNotNull(strMap1);
        org.junit.Assert.assertNotNull(strMap2);
        org.junit.Assert.assertNotNull(parser5);
        org.junit.Assert.assertNotNull(strMap6);
        org.junit.Assert.assertNotNull(parser7);
        org.junit.Assert.assertNotNull(strMap8);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test1669() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SchemaM3Random300Test3.test1669");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.avro.Schema schema4 = org.apache.avro.Schema.createRecord("{null={\"type\":\"record\",\"fields\":[]}}", "", "union type:MAP pos:-1", true);
            org.junit.Assert.fail("Expected exception of type org.apache.avro.SchemaParseException; message: Illegal initial character: {null={\"type\":\"record\",\"fields\":[]}}");
        } catch (org.apache.avro.SchemaParseException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1670() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SchemaM3Random300Test3.test1670");
        org.apache.avro.Schema.Field[] fieldArray0 = new org.apache.avro.Schema.Field[] {};
        java.util.ArrayList<org.apache.avro.Schema.Field> fieldList1 = new java.util.ArrayList<org.apache.avro.Schema.Field>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<org.apache.avro.Schema.Field>) fieldList1, fieldArray0);
        org.apache.avro.Schema schema3 = org.apache.avro.Schema.createRecord((java.util.List<org.apache.avro.Schema.Field>) fieldList1);
        org.apache.avro.Schema schema4 = org.apache.avro.Schema.createRecord((java.util.List<org.apache.avro.Schema.Field>) fieldList1);
        org.apache.avro.Schema schema5 = org.apache.avro.Schema.createRecord((java.util.List<org.apache.avro.Schema.Field>) fieldList1);
        org.apache.avro.Schema schema6 = org.apache.avro.Schema.createRecord((java.util.List<org.apache.avro.Schema.Field>) fieldList1);
        java.lang.String str7 = schema6.getFullName();
        java.lang.String str8 = schema6.getFullName();
        java.lang.String str9 = schema6.getName();
        org.junit.Assert.assertNotNull(fieldArray0);
        org.junit.Assert.assertArrayEquals(fieldArray0, new org.apache.avro.Schema.Field[] {});
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(schema3);
        org.junit.Assert.assertNotNull(schema4);
        org.junit.Assert.assertNotNull(schema5);
        org.junit.Assert.assertNotNull(schema6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str9);
    }

    @Test
    public void test1671() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SchemaM3Random300Test3.test1671");
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
        org.apache.avro.Schema[] schemaArray16 = new org.apache.avro.Schema[] {};
        java.util.ArrayList<org.apache.avro.Schema> schemaList17 = new java.util.ArrayList<org.apache.avro.Schema>();
        boolean boolean18 = java.util.Collections.addAll((java.util.Collection<org.apache.avro.Schema>) schemaList17, schemaArray16);
        org.apache.avro.Schema schema19 = org.apache.avro.Schema.createUnion((java.util.List<org.apache.avro.Schema>) schemaList17);
        org.apache.avro.Schema[] schemaArray20 = new org.apache.avro.Schema[] {};
        java.util.ArrayList<org.apache.avro.Schema> schemaList21 = new java.util.ArrayList<org.apache.avro.Schema>();
        boolean boolean22 = java.util.Collections.addAll((java.util.Collection<org.apache.avro.Schema>) schemaList21, schemaArray20);
        org.apache.avro.Schema schema23 = org.apache.avro.Schema.createUnion((java.util.List<org.apache.avro.Schema>) schemaList21);
        org.apache.avro.Schema schema24 = org.apache.avro.Schema.applyAliases(schema19, schema23);
        org.apache.avro.Schema.Type type25 = schema23.getType();
        org.apache.avro.Schema schema26 = org.apache.avro.Schema.createMap(schema23);
        org.apache.avro.Schema.Names names27 = new org.apache.avro.Schema.Names();
        java.lang.String str28 = names27.space();
        names27.space("");
        boolean boolean31 = schema23.equals((java.lang.Object) "");
        java.lang.String str32 = schema23.getFullName();
        org.apache.avro.Schema schema33 = org.apache.avro.Schema.applyAliases(schema15, schema23);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean34 = schema15.isError();
            org.junit.Assert.fail("Expected exception of type org.apache.avro.AvroRuntimeException; message: Not a record: {\"type\":\"array\",\"items\":{\"type\":\"array\",\"items\":{\"type\":\"array\",\"items\":{\"type\":\"map\",\"values\":[]}}}}");
        } catch (org.apache.avro.AvroRuntimeException e) {
            // Expected exception.
        }
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
        org.junit.Assert.assertNotNull(schemaArray16);
        org.junit.Assert.assertArrayEquals(schemaArray16, new org.apache.avro.Schema[] {});
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(schema19);
        org.junit.Assert.assertNotNull(schemaArray20);
        org.junit.Assert.assertArrayEquals(schemaArray20, new org.apache.avro.Schema[] {});
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(schema23);
        org.junit.Assert.assertNotNull(schema24);
        org.junit.Assert.assertTrue("'" + type25 + "' != '" + org.apache.avro.Schema.Type.UNION + "'", type25.equals(org.apache.avro.Schema.Type.UNION));
        org.junit.Assert.assertNotNull(schema26);
        org.junit.Assert.assertNull(str28);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "union" + "'", str32, "union");
        org.junit.Assert.assertNotNull(schema33);
    }

    @Test
    public void test1672() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SchemaM3Random300Test3.test1672");
        org.apache.avro.Schema.LockableArrayList<java.util.ArrayList<java.lang.String>> strListList1 = new org.apache.avro.Schema.LockableArrayList<java.util.ArrayList<java.lang.String>>((int) (short) 0);
        org.apache.avro.Schema.LockableArrayList<java.util.ArrayList<java.lang.String>> strListList2 = new org.apache.avro.Schema.LockableArrayList<java.util.ArrayList<java.lang.String>>((java.util.List<java.util.ArrayList<java.lang.String>>) strListList1);
    }

    @Test
    public void test1673() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SchemaM3Random300Test3.test1673");
        org.apache.avro.Schema.Field[] fieldArray0 = new org.apache.avro.Schema.Field[] {};
        java.util.ArrayList<org.apache.avro.Schema.Field> fieldList1 = new java.util.ArrayList<org.apache.avro.Schema.Field>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<org.apache.avro.Schema.Field>) fieldList1, fieldArray0);
        org.apache.avro.Schema schema3 = org.apache.avro.Schema.createRecord((java.util.List<org.apache.avro.Schema.Field>) fieldList1);
        org.apache.avro.Schema schema4 = org.apache.avro.Schema.createRecord((java.util.List<org.apache.avro.Schema.Field>) fieldList1);
        org.apache.avro.Schema schema5 = org.apache.avro.Schema.createRecord((java.util.List<org.apache.avro.Schema.Field>) fieldList1);
        org.apache.avro.Schema schema6 = org.apache.avro.Schema.createRecord((java.util.List<org.apache.avro.Schema.Field>) fieldList1);
        org.apache.avro.Schema.Field field8 = schema6.getField("map");
        java.util.Set<java.lang.String> strSet9 = schema6.getAliases();
        org.junit.Assert.assertNotNull(fieldArray0);
        org.junit.Assert.assertArrayEquals(fieldArray0, new org.apache.avro.Schema.Field[] {});
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(schema3);
        org.junit.Assert.assertNotNull(schema4);
        org.junit.Assert.assertNotNull(schema5);
        org.junit.Assert.assertNotNull(schema6);
        org.junit.Assert.assertNull(field8);
        org.junit.Assert.assertNotNull(strSet9);
    }

    @Test
    public void test1674() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SchemaM3Random300Test3.test1674");
        org.apache.avro.Schema.LockableArrayList<java.lang.String> strList4 = new org.apache.avro.Schema.LockableArrayList<java.lang.String>(1);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.avro.Schema schema5 = org.apache.avro.Schema.createEnum("{\"type\":\"fixed\",\"name\":\"union\",\"namespace\":\"{}\",\"doc\":\"hi!\",\"size\":1}", "{\r\n  \"type\" : \"map\",\r\n  \"values\" : {\r\n    \"type\" : \"record\",\r\n    \"fields\" : [ ]\r\n  }\r\n}", "{\"type\":\"map\",\"values\":{\"type\":\"array\",\"items\":\"int\"}}", (java.util.List<java.lang.String>) strList4);
            org.junit.Assert.fail("Expected exception of type org.apache.avro.SchemaParseException; message: Illegal initial character: {\"type\":\"fixed\",\"name\":\"union\",\"namespace\":\"{}\",\"doc\":\"hi!\",\"size\":1}");
        } catch (org.apache.avro.SchemaParseException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1675() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SchemaM3Random300Test3.test1675");
        org.apache.avro.Schema.Parser parser0 = new org.apache.avro.Schema.Parser();
        org.apache.avro.Schema.Parser parser2 = parser0.setValidate(true);
        org.apache.avro.Schema.Parser parser4 = parser0.setValidate(true);
        org.apache.avro.Schema.Parser parser6 = parser0.setValidate(true);
        org.apache.avro.Schema schema8 = parser0.parse("[].union");
        org.apache.avro.Schema schema10 = parser0.parse("{\"type\":\"fixed\",\"name\":\"union\",\"namespace\":\"[]\",\"doc\":\"[ ]\",\"size\":0}");
        java.lang.String str12 = schema10.getProp("{}");
        org.apache.avro.Schema.Field[] fieldArray13 = new org.apache.avro.Schema.Field[] {};
        java.util.ArrayList<org.apache.avro.Schema.Field> fieldList14 = new java.util.ArrayList<org.apache.avro.Schema.Field>();
        boolean boolean15 = java.util.Collections.addAll((java.util.Collection<org.apache.avro.Schema.Field>) fieldList14, fieldArray13);
        org.apache.avro.Schema schema16 = org.apache.avro.Schema.createRecord((java.util.List<org.apache.avro.Schema.Field>) fieldList14);
        java.util.List<org.apache.avro.Schema.Field> fieldList17 = schema16.getFields();
        org.apache.avro.Schema schema18 = org.apache.avro.Schema.createRecord(fieldList17);
        // The following exception was thrown during execution in test generation
        try {
            schema10.setFields(fieldList17);
            org.junit.Assert.fail("Expected exception of type org.apache.avro.AvroRuntimeException; message: Not a record: {\"type\":\"fixed\",\"name\":\"union\",\"namespace\":\"[]\",\"doc\":\"[ ]\",\"size\":0}");
        } catch (org.apache.avro.AvroRuntimeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(parser2);
        org.junit.Assert.assertNotNull(parser4);
        org.junit.Assert.assertNotNull(parser6);
        org.junit.Assert.assertNotNull(schema8);
        org.junit.Assert.assertNotNull(schema10);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNotNull(fieldArray13);
        org.junit.Assert.assertArrayEquals(fieldArray13, new org.apache.avro.Schema.Field[] {});
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(schema16);
        org.junit.Assert.assertNotNull(fieldList17);
        org.junit.Assert.assertNotNull(schema18);
    }

    @Test
    public void test1676() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SchemaM3Random300Test3.test1676");
        org.apache.avro.Schema schema2 = org.apache.avro.Schema.parse("\"double\"", false);
        org.junit.Assert.assertNotNull(schema2);
    }

    @Test
    public void test1677() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SchemaM3Random300Test3.test1677");
        org.apache.avro.Schema.Names names1 = new org.apache.avro.Schema.Names("union type:UNION pos:-1");
        java.lang.String str2 = names1.toString();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "{}" + "'", str2, "{}");
    }

    @Test
    public void test1678() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SchemaM3Random300Test3.test1678");
        org.apache.avro.Schema.Parser parser0 = new org.apache.avro.Schema.Parser();
        java.util.Map<java.lang.String, org.apache.avro.Schema> strMap1 = parser0.getTypes();
        org.apache.avro.Schema.Parser parser2 = new org.apache.avro.Schema.Parser();
        org.apache.avro.Schema.Parser parser4 = parser2.setValidate(true);
        java.util.Map<java.lang.String, org.apache.avro.Schema> strMap5 = parser2.getTypes();
        org.apache.avro.Schema.Parser parser6 = parser0.addTypes(strMap5);
        boolean boolean7 = parser0.getValidate();
        boolean boolean8 = parser0.getValidate();
        boolean boolean9 = parser0.getValidate();
        org.apache.avro.Schema.Parser parser11 = parser0.setValidate(true);
        org.junit.Assert.assertNotNull(strMap1);
        org.junit.Assert.assertNotNull(parser4);
        org.junit.Assert.assertNotNull(strMap5);
        org.junit.Assert.assertNotNull(parser6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(parser11);
    }

    @Test
    public void test1679() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SchemaM3Random300Test3.test1679");
        org.apache.avro.Schema.LockableArrayList<java.lang.String> strList4 = new org.apache.avro.Schema.LockableArrayList<java.lang.String>((int) (byte) 10);
        org.apache.avro.Schema schema5 = org.apache.avro.Schema.createEnum("[].union", "union type:UNION pos:-1", "union type:UNION pos:-1", (java.util.List<java.lang.String>) strList4);
        org.apache.avro.Schema schema6 = org.apache.avro.Schema.createArray(schema5);
        org.apache.avro.Schema schema7 = org.apache.avro.Schema.createArray(schema5);
        org.apache.avro.Schema schema8 = org.apache.avro.Schema.createArray(schema7);
        org.junit.Assert.assertNotNull(schema5);
        org.junit.Assert.assertNotNull(schema6);
        org.junit.Assert.assertNotNull(schema7);
        org.junit.Assert.assertNotNull(schema8);
    }

    @Test
    public void test1680() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SchemaM3Random300Test3.test1680");
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
            java.util.List<org.apache.avro.Schema.Field> fieldList25 = schema21.getFields();
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
    }

    @Test
    public void test1681() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SchemaM3Random300Test3.test1681");
        org.apache.avro.Schema schema1 = org.apache.avro.Schema.parse("{\"type\":\"array\",\"items\":[]}");
        java.lang.String str2 = schema1.getName();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean4 = schema1.hasEnumSymbol(".map");
            org.junit.Assert.fail("Expected exception of type org.apache.avro.AvroRuntimeException; message: Not an enum: {\"type\":\"array\",\"items\":[]}");
        } catch (org.apache.avro.AvroRuntimeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(schema1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "array" + "'", str2, "array");
    }

    @Test
    public void test1682() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SchemaM3Random300Test3.test1682");
        org.apache.avro.Schema schema2 = org.apache.avro.Schema.parse("{\"type\":\"map\",\"values\":{\"type\":\"array\",\"items\":{\"type\":\"map\",\"values\":[]},\"\":\"{\\r\\n  \\\"type\\\" : \\\"record\\\",\\r\\n  \\\"fields\\\" : [ ]\\r\\n}\"}}", false);
        java.lang.String str3 = schema2.getDoc();
        java.lang.String str5 = schema2.toString(true);
        org.junit.Assert.assertNotNull(schema2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "{\r\n  \"type\" : \"map\",\r\n  \"values\" : {\r\n    \"type\" : \"array\",\r\n    \"items\" : {\r\n      \"type\" : \"map\",\r\n      \"values\" : [ ]\r\n    },\r\n    \"\" : \"{\\r\\n  \\\"type\\\" : \\\"record\\\",\\r\\n  \\\"fields\\\" : [ ]\\r\\n}\"\r\n  }\r\n}" + "'", str5, "{\r\n  \"type\" : \"map\",\r\n  \"values\" : {\r\n    \"type\" : \"array\",\r\n    \"items\" : {\r\n      \"type\" : \"map\",\r\n      \"values\" : [ ]\r\n    },\r\n    \"\" : \"{\\r\\n  \\\"type\\\" : \\\"record\\\",\\r\\n  \\\"fields\\\" : [ ]\\r\\n}\"\r\n  }\r\n}");
    }

    @Test
    public void test1683() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SchemaM3Random300Test3.test1683");
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
        org.apache.avro.Schema schema18 = parser6.parse("{\r\n  \"type\" : \"map\",\r\n  \"values\" : [ ]\r\n}");
        boolean boolean19 = parser6.getValidate();
        org.junit.Assert.assertNotNull(parser2);
        org.junit.Assert.assertNotNull(parser4);
        org.junit.Assert.assertNotNull(parser6);
        org.junit.Assert.assertNotNull(parser9);
        org.junit.Assert.assertNotNull(strMap10);
        org.junit.Assert.assertNotNull(parser12);
        org.junit.Assert.assertNotNull(parser14);
        org.junit.Assert.assertNotNull(strMap15);
        org.junit.Assert.assertNotNull(parser16);
        org.junit.Assert.assertNotNull(schema18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
    }

    @Test
    public void test1684() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SchemaM3Random300Test3.test1684");
        org.apache.avro.Schema.Names names1 = new org.apache.avro.Schema.Names("{\"type\":\"array\",\"items\":[],\"union type:UNION pos:-1\":\"\"}");
        java.lang.String str2 = names1.toString();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "{}" + "'", str2, "{}");
    }

    @Test
    public void test1685() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SchemaM3Random300Test3.test1685");
        org.apache.avro.Schema.Parser parser0 = new org.apache.avro.Schema.Parser();
        org.apache.avro.Schema.Parser parser2 = parser0.setValidate(true);
        java.util.Map<java.lang.String, org.apache.avro.Schema> strMap3 = parser0.getTypes();
        boolean boolean4 = parser0.getValidate();
        org.apache.avro.Schema schema6 = parser0.parse("[ ]");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean8 = schema6.hasEnumSymbol("{\"type\":\"float\",\"{\\r\\n  \\\"type\\\" : \\\"record\\\",\\r\\n  \\\"fields\\\" : [ ]\\r\\n}\":\"{\\r\\n  \\\"type\\\" : \\\"map\\\",\\r\\n  \\\"values\\\" : [ ]\\r\\n}\"}");
            org.junit.Assert.fail("Expected exception of type org.apache.avro.AvroRuntimeException; message: Not an enum: []");
        } catch (org.apache.avro.AvroRuntimeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(parser2);
        org.junit.Assert.assertNotNull(strMap3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(schema6);
    }

    @Test
    public void test1686() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SchemaM3Random300Test3.test1686");
        org.apache.avro.Schema schema2 = org.apache.avro.Schema.parse("\"int\"", false);
        org.junit.Assert.assertNotNull(schema2);
    }

    @Test
    public void test1687() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SchemaM3Random300Test3.test1687");
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
        org.apache.avro.Schema schema43 = org.apache.avro.Schema.createUnion(schemaList41);
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
        org.junit.Assert.assertNotNull(schema43);
    }

    @Test
    public void test1688() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SchemaM3Random300Test3.test1688");
        org.apache.avro.Schema.Type type0 = org.apache.avro.Schema.Type.INT;
        org.apache.avro.Schema schema1 = org.apache.avro.Schema.create(type0);
        org.apache.avro.Schema schema2 = org.apache.avro.Schema.create(type0);
        java.lang.String str3 = schema2.getDoc();
        java.lang.String str4 = schema2.toString();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean5 = schema2.isError();
            org.junit.Assert.fail("Expected exception of type org.apache.avro.AvroRuntimeException; message: Not a record: \"int\"");
        } catch (org.apache.avro.AvroRuntimeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + type0 + "' != '" + org.apache.avro.Schema.Type.INT + "'", type0.equals(org.apache.avro.Schema.Type.INT));
        org.junit.Assert.assertNotNull(schema1);
        org.junit.Assert.assertNotNull(schema2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "\"int\"" + "'", str4, "\"int\"");
    }

    @Test
    public void test1689() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SchemaM3Random300Test3.test1689");
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
            boolean boolean16 = schema14.hasEnumSymbol("{\r\n  \"type\" : \"fixed\",\r\n  \"name\" : \"union\",\r\n  \"namespace\" : \"{}\",\r\n  \"doc\" : \"hi!\",\r\n  \"size\" : 1\r\n}");
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
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "array" + "'", str13, "array");
        org.junit.Assert.assertNotNull(schema14);
    }

    @Test
    public void test1690() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SchemaM3Random300Test3.test1690");
        org.apache.avro.Schema schema1 = org.apache.avro.Schema.parse("{\r\n  \"type\" : \"map\",\r\n  \"values\" : {\r\n    \"type\" : \"array\",\r\n    \"items\" : {\r\n      \"type\" : \"map\",\r\n      \"values\" : [ ]\r\n    },\r\n    \"\" : \"{\\r\\n  \\\"type\\\" : \\\"record\\\",\\r\\n  \\\"fields\\\" : [ ]\\r\\n}\"\r\n  }\r\n}");
        org.junit.Assert.assertNotNull(schema1);
    }

    @Test
    public void test1691() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SchemaM3Random300Test3.test1691");
        org.apache.avro.Schema.Parser parser0 = new org.apache.avro.Schema.Parser();
        java.util.Map<java.lang.String, org.apache.avro.Schema> strMap1 = parser0.getTypes();
        java.util.Map<java.lang.String, org.apache.avro.Schema> strMap2 = parser0.getTypes();
        org.apache.avro.Schema.Parser parser3 = new org.apache.avro.Schema.Parser();
        org.apache.avro.Schema.Parser parser5 = parser3.setValidate(true);
        java.util.Map<java.lang.String, org.apache.avro.Schema> strMap6 = parser3.getTypes();
        org.apache.avro.Schema.Parser parser7 = parser0.addTypes(strMap6);
        java.util.Map<java.lang.String, org.apache.avro.Schema> strMap8 = parser0.getTypes();
        java.io.InputStream inputStream9 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.avro.Schema schema10 = parser0.parse(inputStream9);
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
    }

    @Test
    public void test1692() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SchemaM3Random300Test3.test1692");
        org.apache.avro.Schema schema4 = org.apache.avro.Schema.createRecord("array", "{\"type\":\"double\",\"float\":\"{\\\"type\\\":\\\"array\\\",\\\"items\\\":[]}\"}", "{\"type\":\"double\",\"float\":\"{\\\"type\\\":\\\"array\\\",\\\"items\\\":[]}\"}", false);
        org.junit.Assert.assertNotNull(schema4);
    }

    @Test
    public void test1693() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SchemaM3Random300Test3.test1693");
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
            boolean boolean24 = schema21.hasEnumSymbol("{\r\n  \"type\" : \"array\",\r\n  \"items\" : [ ],\r\n  \"{}\" : \"hi!\"\r\n}");
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
    public void test1694() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SchemaM3Random300Test3.test1694");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.avro.Schema schema4 = org.apache.avro.Schema.createFixed("{\r\n  \"type\" : \"record\",\r\n  \"fields\" : [ ]\r\n}", "\"null\"", "{\"type\":\"double\",\"float\":\"{\\\"type\\\":\\\"array\\\",\\\"items\\\":[]}\"}", (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type org.apache.avro.SchemaParseException; message: Illegal initial character: {??  \"type\" : \"record\",??  \"fields\" : [ ]??}");
        } catch (org.apache.avro.SchemaParseException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1695() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SchemaM3Random300Test3.test1695");
        org.apache.avro.Schema.Parser parser0 = new org.apache.avro.Schema.Parser();
        org.apache.avro.Schema.Parser parser2 = parser0.setValidate(true);
        java.util.Map<java.lang.String, org.apache.avro.Schema> strMap3 = parser0.getTypes();
        org.apache.avro.Schema schema5 = parser0.parse("{\"type\":\"array\",\"items\":{\"type\":\"map\",\"values\":[]}}");
        java.lang.String str6 = schema5.getFullName();
        org.junit.Assert.assertNotNull(parser2);
        org.junit.Assert.assertNotNull(strMap3);
        org.junit.Assert.assertNotNull(schema5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "array" + "'", str6, "array");
    }

    @Test
    public void test1696() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SchemaM3Random300Test3.test1696");
        org.apache.avro.Schema schema2 = org.apache.avro.Schema.parse("{\"type\":\"double\",\"float\":\"{\\\"type\\\":\\\"array\\\",\\\"items\\\":[]}\"}", false);
        org.junit.Assert.assertNotNull(schema2);
    }

    @Test
    public void test1697() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SchemaM3Random300Test3.test1697");
        // The following exception was thrown during execution in test generation
        try {
            org.codehaus.jackson.JsonNode jsonNode1 = org.apache.avro.Schema.parseJson("int type:FIXED pos:-1");
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: org.codehaus.jackson.JsonParseException: Unexpected character ('i' (code 105)): expected a valid value (number, String, array, object, 'true', 'false' or 'null')? at [Source: java.io.StringReader@1452ef7e; line: 1, column: 2]");
        } catch (java.lang.RuntimeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1698() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SchemaM3Random300Test3.test1698");
        org.apache.avro.Schema.Type type0 = org.apache.avro.Schema.Type.INT;
        org.apache.avro.Schema schema1 = org.apache.avro.Schema.create(type0);
        org.apache.avro.Schema schema2 = org.apache.avro.Schema.create(type0);
        org.apache.avro.Schema.Names names3 = new org.apache.avro.Schema.Names();
        java.lang.String str4 = names3.space();
        names3.space("");
        boolean boolean7 = schema2.equals((java.lang.Object) names3);
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
        java.lang.String str19 = schema16.getProp("{\r\n  \"type\" : \"array\",\r\n  \"items\" : {\r\n    \"type\" : \"map\",\r\n    \"values\" : [ ]\r\n  }\r\n}");
        boolean boolean20 = names3.equals((java.lang.Object) "{\r\n  \"type\" : \"array\",\r\n  \"items\" : {\r\n    \"type\" : \"map\",\r\n    \"values\" : [ ]\r\n  }\r\n}");
        names3.space("{\r\n  \"type\" : \"map\",\r\n  \"values\" : {\r\n    \"type\" : \"map\",\r\n    \"values\" : [ ]\r\n  }\r\n}");
        org.junit.Assert.assertTrue("'" + type0 + "' != '" + org.apache.avro.Schema.Type.INT + "'", type0.equals(org.apache.avro.Schema.Type.INT));
        org.junit.Assert.assertNotNull(schema1);
        org.junit.Assert.assertNotNull(schema2);
        org.junit.Assert.assertNull(str4);
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
        org.junit.Assert.assertNull(str19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test1699() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SchemaM3Random300Test3.test1699");
        org.apache.avro.Schema.Parser parser0 = new org.apache.avro.Schema.Parser();
        java.util.Map<java.lang.String, org.apache.avro.Schema> strMap1 = parser0.getTypes();
        java.util.Map<java.lang.String, org.apache.avro.Schema> strMap2 = parser0.getTypes();
        org.apache.avro.Schema.Parser parser3 = new org.apache.avro.Schema.Parser();
        java.util.Map<java.lang.String, org.apache.avro.Schema> strMap4 = parser3.getTypes();
        org.apache.avro.Schema.Parser parser5 = parser0.addTypes(strMap4);
        boolean boolean6 = parser0.getValidate();
        boolean boolean7 = parser0.getValidate();
        org.apache.avro.Schema schema9 = parser0.parse("{\r\n  \"type\" : \"fixed\",\r\n  \"name\" : \"union\",\r\n  \"namespace\" : \"[]\",\r\n  \"doc\" : \"[ ]\",\r\n  \"size\" : 0,\r\n  \"{\\r\\n  \\\"type\\\" : \\\"fixed\\\",\\r\\n  \\\"name\\\" : \\\"union\\\",\\r\\n  \\\"namespace\\\" : \\\"[]\\\",\\r\\n  \\\"doc\\\" : \\\"[ ]\\\",\\r\\n  \\\"size\\\" : 0\\r\\n}\" : \"{\\r\\n  \\\"type\\\" : \\\"map\\\",\\r\\n  \\\"values\\\" : {\\r\\n    \\\"type\\\" : \\\"map\\\",\\r\\n    \\\"values\\\" : [ ]\\r\\n  }\\r\\n}\"\r\n}");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.avro.Schema schema11 = parser0.parse("{\"type\":\"fixed\",\"name\":\"union\",\"namespace\":\"[]\",\"doc\":\"union type:UNION pos:-1\",\"size\":100}");
            org.junit.Assert.fail("Expected exception of type org.apache.avro.SchemaParseException; message: Can't redefine: [].union");
        } catch (org.apache.avro.SchemaParseException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strMap1);
        org.junit.Assert.assertNotNull(strMap2);
        org.junit.Assert.assertNotNull(strMap4);
        org.junit.Assert.assertNotNull(parser5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(schema9);
    }

    @Test
    public void test1700() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SchemaM3Random300Test3.test1700");
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
        schema11.addProp("{}.union", "");
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
    public void test1701() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SchemaM3Random300Test3.test1701");
        org.apache.avro.Schema.Type type0 = org.apache.avro.Schema.Type.STRING;
        org.apache.avro.Schema schema1 = org.apache.avro.Schema.create(type0);
        org.apache.avro.Schema schema2 = org.apache.avro.Schema.create(type0);
        org.apache.avro.Schema schema3 = org.apache.avro.Schema.create(type0);
        org.junit.Assert.assertTrue("'" + type0 + "' != '" + org.apache.avro.Schema.Type.STRING + "'", type0.equals(org.apache.avro.Schema.Type.STRING));
        org.junit.Assert.assertNotNull(schema1);
        org.junit.Assert.assertNotNull(schema2);
        org.junit.Assert.assertNotNull(schema3);
    }

    @Test
    public void test1702() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SchemaM3Random300Test3.test1702");
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
        // The following exception was thrown during execution in test generation
        try {
            org.apache.avro.Schema schema13 = parser0.parse("union type:FIXED pos:-1");
            org.junit.Assert.fail("Expected exception of type org.apache.avro.SchemaParseException; message: org.codehaus.jackson.JsonParseException: Unexpected character ('u' (code 117)): expected a valid value (number, String, array, object, 'true', 'false' or 'null')? at [Source: java.io.StringReader@1b8e06f; line: 1, column: 2]");
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
    public void test1703() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SchemaM3Random300Test3.test1703");
        org.apache.avro.Schema.Field[] fieldArray0 = new org.apache.avro.Schema.Field[] {};
        java.util.ArrayList<org.apache.avro.Schema.Field> fieldList1 = new java.util.ArrayList<org.apache.avro.Schema.Field>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<org.apache.avro.Schema.Field>) fieldList1, fieldArray0);
        org.apache.avro.Schema schema3 = org.apache.avro.Schema.createRecord((java.util.List<org.apache.avro.Schema.Field>) fieldList1);
        org.apache.avro.Schema schema4 = org.apache.avro.Schema.createRecord((java.util.List<org.apache.avro.Schema.Field>) fieldList1);
        org.apache.avro.Schema schema5 = org.apache.avro.Schema.createArray(schema4);
        java.lang.String str6 = schema5.getDoc();
        java.lang.String str8 = schema5.getProp("{\"type\":\"record\",\"fields\":[]}");
        org.apache.avro.Schema schema9 = schema5.getElementType();
        java.lang.Class<?> wildcardClass10 = schema9.getClass();
        org.junit.Assert.assertNotNull(fieldArray0);
        org.junit.Assert.assertArrayEquals(fieldArray0, new org.apache.avro.Schema.Field[] {});
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(schema3);
        org.junit.Assert.assertNotNull(schema4);
        org.junit.Assert.assertNotNull(schema5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNotNull(schema9);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test1704() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SchemaM3Random300Test3.test1704");
        org.apache.avro.Schema.LockableArrayList<java.lang.String> strList7 = new org.apache.avro.Schema.LockableArrayList<java.lang.String>((int) 'a');
        org.apache.avro.Schema schema8 = org.apache.avro.Schema.createEnum("map", "{\r\n  \"type\" : \"map\",\r\n  \"values\" : [ ]\r\n}", "{\r\n  \"type\" : \"record\",\r\n  \"fields\" : [ ]\r\n}", (java.util.List<java.lang.String>) strList7);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.avro.Schema schema9 = org.apache.avro.Schema.createEnum("{null=[]}", "{\"type\":\"map\",\"values\":[],\"\\\"double\\\"\":\"{\\\"type\\\":\\\"array\\\",\\\"items\\\":\\\"int\\\"}\"}", "{\r\n  \"type\" : \"map\",\r\n  \"values\" : {\r\n    \"type\" : \"record\",\r\n    \"fields\" : [ ]\r\n  }\r\n}", (java.util.List<java.lang.String>) strList7);
            org.junit.Assert.fail("Expected exception of type org.apache.avro.SchemaParseException; message: Illegal initial character: {null=[]}");
        } catch (org.apache.avro.SchemaParseException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(schema8);
    }

    @Test
    public void test1705() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SchemaM3Random300Test3.test1705");
        java.util.List<java.lang.String> strList3 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.avro.Schema schema4 = org.apache.avro.Schema.createEnum("union type:FIXED pos:-1", "{\r\n  \"type\" : \"record\",\r\n  \"fields\" : [ ],\r\n  \"{\\\"type\\\":\\\"array\\\",\\\"items\\\":[],\\\"union type:UNION pos:-1\\\":\\\"\\\"}\" : \"{null={\\\"type\\\":\\\"map\\\",\\\"values\\\":[]}}\"\r\n}", "{\r\n  \"type\" : \"record\",\r\n  \"fields\" : [ ],\r\n  \"{\\\"type\\\":\\\"array\\\",\\\"items\\\":[],\\\"union type:UNION pos:-1\\\":\\\"\\\"}\" : \"{null={\\\"type\\\":\\\"map\\\",\\\"values\\\":[]}}\"\r\n}", strList3);
            org.junit.Assert.fail("Expected exception of type org.apache.avro.SchemaParseException; message: Illegal character in: union type:FIXED pos:-1");
        } catch (org.apache.avro.SchemaParseException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1706() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SchemaM3Random300Test3.test1706");
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
    public void test1707() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SchemaM3Random300Test3.test1707");
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
        org.apache.avro.Schema.Parser parser25 = parser23.setValidate(true);
        org.apache.avro.Schema.Parser parser27 = parser23.setValidate(true);
        org.apache.avro.Schema.Parser parser29 = parser23.setValidate(true);
        org.apache.avro.Schema.Parser parser31 = parser23.setValidate(true);
        java.util.Map<java.lang.String, org.apache.avro.Schema> strMap32 = parser31.getTypes();
        java.util.Map<java.lang.String, org.apache.avro.Schema> strMap33 = parser31.getTypes();
        org.apache.avro.Schema.Parser parser34 = parser7.addTypes(strMap33);
        boolean boolean35 = parser7.getValidate();
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
        org.junit.Assert.assertNotNull(parser25);
        org.junit.Assert.assertNotNull(parser27);
        org.junit.Assert.assertNotNull(parser29);
        org.junit.Assert.assertNotNull(parser31);
        org.junit.Assert.assertNotNull(strMap32);
        org.junit.Assert.assertNotNull(strMap33);
        org.junit.Assert.assertNotNull(parser34);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + true + "'", boolean35 == true);
    }

    @Test
    public void test1708() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SchemaM3Random300Test3.test1708");
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
        org.apache.avro.Schema.Parser parser18 = new org.apache.avro.Schema.Parser();
        java.util.Map<java.lang.String, org.apache.avro.Schema> strMap19 = parser18.getTypes();
        java.util.Map<java.lang.String, org.apache.avro.Schema> strMap20 = parser18.getTypes();
        org.apache.avro.Schema.Parser parser21 = new org.apache.avro.Schema.Parser();
        org.apache.avro.Schema.Parser parser23 = parser21.setValidate(true);
        java.util.Map<java.lang.String, org.apache.avro.Schema> strMap24 = parser21.getTypes();
        org.apache.avro.Schema.Parser parser25 = parser18.addTypes(strMap24);
        org.apache.avro.Schema schema27 = parser25.parse("{\"type\":\"map\",\"values\":[]}");
        org.apache.avro.Schema.Parser parser29 = parser25.setValidate(false);
        org.apache.avro.Schema.Parser parser31 = parser25.setValidate(true);
        java.util.Map<java.lang.String, org.apache.avro.Schema> strMap32 = parser25.getTypes();
        org.apache.avro.Schema.Parser parser33 = parser0.addTypes(strMap32);
        java.io.File file34 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.avro.Schema schema35 = parser0.parse(file34);
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
        org.junit.Assert.assertNotNull(schema17);
        org.junit.Assert.assertNotNull(strMap19);
        org.junit.Assert.assertNotNull(strMap20);
        org.junit.Assert.assertNotNull(parser23);
        org.junit.Assert.assertNotNull(strMap24);
        org.junit.Assert.assertNotNull(parser25);
        org.junit.Assert.assertNotNull(schema27);
        org.junit.Assert.assertNotNull(parser29);
        org.junit.Assert.assertNotNull(parser31);
        org.junit.Assert.assertNotNull(strMap32);
        org.junit.Assert.assertNotNull(parser33);
    }

    @Test
    public void test1709() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SchemaM3Random300Test3.test1709");
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
        org.apache.avro.Schema schema14 = org.apache.avro.Schema.createArray(schema13);
        org.junit.Assert.assertNotNull(strMap1);
        org.junit.Assert.assertNotNull(strMap2);
        org.junit.Assert.assertNotNull(parser5);
        org.junit.Assert.assertNotNull(strMap6);
        org.junit.Assert.assertNotNull(parser7);
        org.junit.Assert.assertNotNull(parser9);
        org.junit.Assert.assertNotNull(parser11);
        org.junit.Assert.assertNotNull(schema13);
        org.junit.Assert.assertNotNull(schema14);
    }

    @Test
    public void test1710() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SchemaM3Random300Test3.test1710");
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
        java.lang.String str20 = schema13.toString(false);
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
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "[]" + "'", str20, "[]");
    }

    @Test
    public void test1711() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SchemaM3Random300Test3.test1711");
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
        org.apache.avro.Schema schema17 = parser7.parse("[ ]");
        // The following exception was thrown during execution in test generation
        try {
            int int18 = schema17.getFixedSize();
            org.junit.Assert.fail("Expected exception of type org.apache.avro.AvroRuntimeException; message: Not fixed: []");
        } catch (org.apache.avro.AvroRuntimeException e) {
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
        org.junit.Assert.assertNotNull(schema17);
    }

    @Test
    public void test1712() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SchemaM3Random300Test3.test1712");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.avro.Schema schema4 = org.apache.avro.Schema.createRecord("{\"type\":\"array\",\"items\":{\"type\":\"map\",\"values\":[]}}", "{}", "union type:UNION pos:-1", false);
            org.junit.Assert.fail("Expected exception of type org.apache.avro.SchemaParseException; message: Illegal initial character: {\"type\":\"array\",\"items\":{\"type\":\"map\",\"values\":[]}}");
        } catch (org.apache.avro.SchemaParseException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1713() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SchemaM3Random300Test3.test1713");
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
        org.apache.avro.Schema schema28 = parser26.parse("{\r\n  \"type\" : \"fixed\",\r\n  \"name\" : \"union\",\r\n  \"namespace\" : \"[]\",\r\n  \"doc\" : \"[ ]\",\r\n  \"size\" : 0\r\n}");
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
        org.junit.Assert.assertNotNull(schema28);
    }

    @Test
    public void test1714() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SchemaM3Random300Test3.test1714");
        org.apache.avro.Schema.Parser parser0 = new org.apache.avro.Schema.Parser();
        org.apache.avro.Schema.Parser parser2 = parser0.setValidate(true);
        org.apache.avro.Schema.Parser parser4 = parser0.setValidate(true);
        org.apache.avro.Schema.Parser parser6 = parser0.setValidate(true);
        java.util.Map<java.lang.String, org.apache.avro.Schema> strMap7 = parser0.getTypes();
        boolean boolean8 = parser0.getValidate();
        org.junit.Assert.assertNotNull(parser2);
        org.junit.Assert.assertNotNull(parser4);
        org.junit.Assert.assertNotNull(parser6);
        org.junit.Assert.assertNotNull(strMap7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test1715() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SchemaM3Random300Test3.test1715");
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
        org.apache.avro.Schema schema18 = parser6.parse("{\r\n  \"type\" : \"map\",\r\n  \"values\" : [ ]\r\n}");
        org.apache.avro.Schema schema20 = parser6.parse("{\"type\":\"array\",\"items\":[],\"{}\":\"hi!\"}");
        org.junit.Assert.assertNotNull(parser2);
        org.junit.Assert.assertNotNull(parser4);
        org.junit.Assert.assertNotNull(parser6);
        org.junit.Assert.assertNotNull(parser9);
        org.junit.Assert.assertNotNull(strMap10);
        org.junit.Assert.assertNotNull(parser12);
        org.junit.Assert.assertNotNull(parser14);
        org.junit.Assert.assertNotNull(strMap15);
        org.junit.Assert.assertNotNull(parser16);
        org.junit.Assert.assertNotNull(schema18);
        org.junit.Assert.assertNotNull(schema20);
    }

    @Test
    public void test1716() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SchemaM3Random300Test3.test1716");
        org.codehaus.jackson.JsonNode jsonNode1 = org.apache.avro.Schema.parseJson("{\"type\":\"record\",\"fields\":[],\"{\\r\\n  \\\"type\\\" : \\\"map\\\",\\r\\n  \\\"values\\\" : {\\r\\n    \\\"type\\\" : \\\"map\\\",\\r\\n    \\\"values\\\" : [ ]\\r\\n  }\\r\\n}\":\"{}\"}");
        org.junit.Assert.assertNotNull(jsonNode1);
    }

    @Test
    public void test1717() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SchemaM3Random300Test3.test1717");
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
        java.lang.String str12 = schema6.getDoc();
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
        org.junit.Assert.assertNull(str12);
    }

    @Test
    public void test1718() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SchemaM3Random300Test3.test1718");
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
        org.junit.Assert.assertNotNull(parser9);
        org.junit.Assert.assertNotNull(strMap11);
        org.junit.Assert.assertNotNull(strMap12);
        org.junit.Assert.assertNotNull(strMap14);
        org.junit.Assert.assertNotNull(parser15);
        org.junit.Assert.assertNotNull(strMap16);
        org.junit.Assert.assertNotNull(parser17);
    }

    @Test
    public void test1719() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SchemaM3Random300Test3.test1719");
        org.apache.avro.Schema schema2 = org.apache.avro.Schema.parse("{\"type\":\"map\",\"values\":[]}", false);
        java.lang.String str3 = schema2.getName();
        // The following exception was thrown during execution in test generation
        try {
            int int5 = schema2.getEnumOrdinal("{\"type\":\"array\",\"items\":\"null\"}");
            org.junit.Assert.fail("Expected exception of type org.apache.avro.AvroRuntimeException; message: Not an enum: {\"type\":\"map\",\"values\":[]}");
        } catch (org.apache.avro.AvroRuntimeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(schema2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "map" + "'", str3, "map");
    }

    @Test
    public void test1720() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SchemaM3Random300Test3.test1720");
        org.apache.avro.Schema schema2 = org.apache.avro.Schema.parse("{\"type\":\"fixed\",\"name\":\"union\",\"namespace\":\"union type:UNION pos:-1\",\"doc\":\"\",\"size\":10}", false);
        org.junit.Assert.assertNotNull(schema2);
    }

    @Test
    public void test1721() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SchemaM3Random300Test3.test1721");
        org.apache.avro.Schema schema4 = org.apache.avro.Schema.createFixed("float", "\"double\"", "float", 10);
        org.apache.avro.Schema.Names names6 = new org.apache.avro.Schema.Names("{\"type\":\"int\",\"union type:UNION pos:-1\":\"[ ]\"}");
        boolean boolean7 = schema4.equals((java.lang.Object) "{\"type\":\"int\",\"union type:UNION pos:-1\":\"[ ]\"}");
        org.junit.Assert.assertNotNull(schema4);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test1722() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SchemaM3Random300Test3.test1722");
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
        org.apache.avro.Schema schema18 = parser6.parse("{\r\n  \"type\" : \"map\",\r\n  \"values\" : [ ]\r\n}");
        org.apache.avro.Schema schema19 = org.apache.avro.Schema.createMap(schema18);
        java.lang.String str21 = schema19.getProp("{}");
        org.junit.Assert.assertNotNull(parser2);
        org.junit.Assert.assertNotNull(parser4);
        org.junit.Assert.assertNotNull(parser6);
        org.junit.Assert.assertNotNull(parser9);
        org.junit.Assert.assertNotNull(strMap10);
        org.junit.Assert.assertNotNull(parser12);
        org.junit.Assert.assertNotNull(parser14);
        org.junit.Assert.assertNotNull(strMap15);
        org.junit.Assert.assertNotNull(parser16);
        org.junit.Assert.assertNotNull(schema18);
        org.junit.Assert.assertNotNull(schema19);
        org.junit.Assert.assertNull(str21);
    }

    @Test
    public void test1723() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SchemaM3Random300Test3.test1723");
        org.apache.avro.Schema.Names names1 = new org.apache.avro.Schema.Names(".map");
    }

    @Test
    public void test1724() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SchemaM3Random300Test3.test1724");
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
        org.apache.avro.Schema schema23 = org.apache.avro.Schema.createUnion(schemaList21);
        org.apache.avro.Schema schema24 = org.apache.avro.Schema.createUnion(schemaList21);
        org.apache.avro.Schema schema25 = org.apache.avro.Schema.createUnion(schemaList21);
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
        org.junit.Assert.assertNotNull(schema23);
        org.junit.Assert.assertNotNull(schema24);
        org.junit.Assert.assertNotNull(schema25);
    }

    @Test
    public void test1725() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SchemaM3Random300Test3.test1725");
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
        org.apache.avro.Schema.Parser parser19 = parser17.setValidate(false);
        java.lang.Class<?> wildcardClass20 = parser19.getClass();
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
        org.junit.Assert.assertNotNull(parser19);
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test1726() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SchemaM3Random300Test3.test1726");
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
            boolean boolean13 = schema11.isError();
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
    }

    @Test
    public void test1727() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SchemaM3Random300Test3.test1727");
        org.apache.avro.Schema schema1 = org.apache.avro.Schema.parse("[]");
        java.util.List<org.apache.avro.Schema> schemaList2 = schema1.getTypes();
        org.junit.Assert.assertNotNull(schema1);
        org.junit.Assert.assertNotNull(schemaList2);
    }

    @Test
    public void test1728() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SchemaM3Random300Test3.test1728");
        org.apache.avro.Schema.Names names1 = new org.apache.avro.Schema.Names("{null=null}");
        org.apache.avro.Schema schema2 = null;
        // The following exception was thrown during execution in test generation
        try {
            names1.add(schema2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1729() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SchemaM3Random300Test3.test1729");
        org.apache.avro.Schema schema4 = org.apache.avro.Schema.createFixed("union", "[ ]", "[]", 0);
        java.lang.String str6 = schema4.getProp("map");
        org.apache.avro.Schema.Type type7 = schema4.getType();
        org.junit.Assert.assertNotNull(schema4);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + type7 + "' != '" + org.apache.avro.Schema.Type.FIXED + "'", type7.equals(org.apache.avro.Schema.Type.FIXED));
    }

    @Test
    public void test1730() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SchemaM3Random300Test3.test1730");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.avro.Schema schema4 = org.apache.avro.Schema.createFixed("", "union", "{\r\n  \"type\" : \"record\",\r\n  \"fields\" : [ ],\r\n  \"{\\\"type\\\":\\\"array\\\",\\\"items\\\":[],\\\"union type:UNION pos:-1\\\":\\\"\\\"}\" : \"{null={\\\"type\\\":\\\"map\\\",\\\"values\\\":[]}}\"\r\n}", (int) '#');
            org.junit.Assert.fail("Expected exception of type org.apache.avro.SchemaParseException; message: Empty name");
        } catch (org.apache.avro.SchemaParseException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1731() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SchemaM3Random300Test3.test1731");
        org.apache.avro.Schema.Parser parser0 = new org.apache.avro.Schema.Parser();
        java.util.Map<java.lang.String, org.apache.avro.Schema> strMap1 = parser0.getTypes();
        java.util.Map<java.lang.String, org.apache.avro.Schema> strMap2 = parser0.getTypes();
        org.apache.avro.Schema.Parser parser3 = new org.apache.avro.Schema.Parser();
        org.apache.avro.Schema.Parser parser5 = parser3.setValidate(true);
        java.util.Map<java.lang.String, org.apache.avro.Schema> strMap6 = parser3.getTypes();
        org.apache.avro.Schema.Parser parser7 = parser0.addTypes(strMap6);
        org.apache.avro.Schema schema9 = parser7.parse("{\"type\":\"map\",\"values\":[]}");
        java.lang.String str11 = schema9.getProp("{\"type\":\"map\",\"values\":{\"type\":\"array\",\"items\":{\"type\":\"map\",\"values\":[]},\"\":\"{\\r\\n  \\\"type\\\" : \\\"record\\\",\\r\\n  \\\"fields\\\" : [ ]\\r\\n}\"}}");
        org.junit.Assert.assertNotNull(strMap1);
        org.junit.Assert.assertNotNull(strMap2);
        org.junit.Assert.assertNotNull(parser5);
        org.junit.Assert.assertNotNull(strMap6);
        org.junit.Assert.assertNotNull(parser7);
        org.junit.Assert.assertNotNull(schema9);
        org.junit.Assert.assertNull(str11);
    }

    @Test
    public void test1732() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SchemaM3Random300Test3.test1732");
        org.apache.avro.Schema schema2 = org.apache.avro.Schema.parse("{\"type\":\"int\",\"union type:UNION pos:-1\":\"[ ]\"}", false);
        org.junit.Assert.assertNotNull(schema2);
    }

    @Test
    public void test1733() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SchemaM3Random300Test3.test1733");
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
        java.lang.String str23 = schema21.toString(true);
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
    public void test1734() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SchemaM3Random300Test3.test1734");
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
        org.apache.avro.Schema.Parser parser18 = parser9.setValidate(true);
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
        org.junit.Assert.assertNotNull(parser18);
    }

    @Test
    public void test1735() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SchemaM3Random300Test3.test1735");
        org.apache.avro.Schema schema2 = org.apache.avro.Schema.parse("{\"type\":\"fixed\",\"name\":\"union\",\"namespace\":\"[]\",\"doc\":\"[ ]\",\"size\":0}", true);
        java.lang.String str3 = schema2.getDoc();
        org.junit.Assert.assertNotNull(schema2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "[ ]" + "'", str3, "[ ]");
    }

    @Test
    public void test1736() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SchemaM3Random300Test3.test1736");
        org.apache.avro.Schema.Type type0 = org.apache.avro.Schema.Type.INT;
        org.apache.avro.Schema schema1 = org.apache.avro.Schema.create(type0);
        org.apache.avro.Schema schema2 = org.apache.avro.Schema.create(type0);
        org.apache.avro.Schema schema3 = org.apache.avro.Schema.create(type0);
        org.apache.avro.Schema schema4 = org.apache.avro.Schema.create(type0);
        org.apache.avro.Schema schema5 = org.apache.avro.Schema.create(type0);
        java.lang.Class<?> wildcardClass6 = schema5.getClass();
        org.junit.Assert.assertTrue("'" + type0 + "' != '" + org.apache.avro.Schema.Type.INT + "'", type0.equals(org.apache.avro.Schema.Type.INT));
        org.junit.Assert.assertNotNull(schema1);
        org.junit.Assert.assertNotNull(schema2);
        org.junit.Assert.assertNotNull(schema3);
        org.junit.Assert.assertNotNull(schema4);
        org.junit.Assert.assertNotNull(schema5);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test1737() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SchemaM3Random300Test3.test1737");
        org.apache.avro.Schema schema1 = org.apache.avro.Schema.parse("{\r\n  \"type\" : \"fixed\",\r\n  \"name\" : \"union\",\r\n  \"namespace\" : \"{}\",\r\n  \"doc\" : \"hi!\",\r\n  \"size\" : 1\r\n}");
        java.lang.String str2 = schema1.getDoc();
        org.junit.Assert.assertNotNull(schema1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!" + "'", str2, "hi!");
    }

    @Test
    public void test1738() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SchemaM3Random300Test3.test1738");
        org.apache.avro.Schema schema4 = org.apache.avro.Schema.createFixed("[].union", "union type:UNION pos:-1", "[]", (int) (short) 100);
        java.lang.String str5 = schema4.toString();
        java.lang.Class<?> wildcardClass6 = schema4.getClass();
        org.junit.Assert.assertNotNull(schema4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "{\"type\":\"fixed\",\"name\":\"union\",\"namespace\":\"[]\",\"doc\":\"union type:UNION pos:-1\",\"size\":100}" + "'", str5, "{\"type\":\"fixed\",\"name\":\"union\",\"namespace\":\"[]\",\"doc\":\"union type:UNION pos:-1\",\"size\":100}");
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test1739() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SchemaM3Random300Test3.test1739");
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
        org.apache.avro.Schema[] schemaArray16 = new org.apache.avro.Schema[] {};
        java.util.ArrayList<org.apache.avro.Schema> schemaList17 = new java.util.ArrayList<org.apache.avro.Schema>();
        boolean boolean18 = java.util.Collections.addAll((java.util.Collection<org.apache.avro.Schema>) schemaList17, schemaArray16);
        org.apache.avro.Schema schema19 = org.apache.avro.Schema.createUnion((java.util.List<org.apache.avro.Schema>) schemaList17);
        org.apache.avro.Schema[] schemaArray20 = new org.apache.avro.Schema[] {};
        java.util.ArrayList<org.apache.avro.Schema> schemaList21 = new java.util.ArrayList<org.apache.avro.Schema>();
        boolean boolean22 = java.util.Collections.addAll((java.util.Collection<org.apache.avro.Schema>) schemaList21, schemaArray20);
        org.apache.avro.Schema schema23 = org.apache.avro.Schema.createUnion((java.util.List<org.apache.avro.Schema>) schemaList21);
        org.apache.avro.Schema schema24 = org.apache.avro.Schema.applyAliases(schema19, schema23);
        org.apache.avro.Schema.Type type25 = schema23.getType();
        org.apache.avro.Schema schema26 = org.apache.avro.Schema.createMap(schema23);
        org.apache.avro.Schema.Names names27 = new org.apache.avro.Schema.Names();
        java.lang.String str28 = names27.space();
        names27.space("");
        boolean boolean31 = schema23.equals((java.lang.Object) "");
        java.lang.String str32 = schema23.getFullName();
        org.apache.avro.Schema schema33 = org.apache.avro.Schema.applyAliases(schema15, schema23);
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<java.lang.String> strList34 = schema15.getEnumSymbols();
            org.junit.Assert.fail("Expected exception of type org.apache.avro.AvroRuntimeException; message: Not an enum: {\"type\":\"array\",\"items\":{\"type\":\"array\",\"items\":{\"type\":\"array\",\"items\":{\"type\":\"map\",\"values\":[]}}}}");
        } catch (org.apache.avro.AvroRuntimeException e) {
            // Expected exception.
        }
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
        org.junit.Assert.assertNotNull(schemaArray16);
        org.junit.Assert.assertArrayEquals(schemaArray16, new org.apache.avro.Schema[] {});
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(schema19);
        org.junit.Assert.assertNotNull(schemaArray20);
        org.junit.Assert.assertArrayEquals(schemaArray20, new org.apache.avro.Schema[] {});
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(schema23);
        org.junit.Assert.assertNotNull(schema24);
        org.junit.Assert.assertTrue("'" + type25 + "' != '" + org.apache.avro.Schema.Type.UNION + "'", type25.equals(org.apache.avro.Schema.Type.UNION));
        org.junit.Assert.assertNotNull(schema26);
        org.junit.Assert.assertNull(str28);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "union" + "'", str32, "union");
        org.junit.Assert.assertNotNull(schema33);
    }

    @Test
    public void test1740() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SchemaM3Random300Test3.test1740");
        org.codehaus.jackson.JsonNode jsonNode1 = org.apache.avro.Schema.parseJson("{\"type\":\"map\",\"values\":{\"type\":\"enum\",\"name\":\"union\",\"namespace\":\"double\",\"doc\":\"union\",\"symbols\":[]}}");
        org.junit.Assert.assertNotNull(jsonNode1);
    }

    @Test
    public void test1741() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SchemaM3Random300Test3.test1741");
        org.apache.avro.Schema.Parser parser0 = new org.apache.avro.Schema.Parser();
        java.util.Map<java.lang.String, org.apache.avro.Schema> strMap1 = parser0.getTypes();
        org.apache.avro.Schema.Parser parser2 = new org.apache.avro.Schema.Parser();
        org.apache.avro.Schema.Parser parser4 = parser2.setValidate(true);
        java.util.Map<java.lang.String, org.apache.avro.Schema> strMap5 = parser2.getTypes();
        org.apache.avro.Schema.Parser parser6 = parser0.addTypes(strMap5);
        boolean boolean7 = parser0.getValidate();
        org.apache.avro.Schema schema9 = parser0.parse("{\"type\":\"array\",\"items\":[]}");
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<org.apache.avro.Schema> schemaList10 = schema9.getTypes();
            org.junit.Assert.fail("Expected exception of type org.apache.avro.AvroRuntimeException; message: Not a union: {\"type\":\"array\",\"items\":[]}");
        } catch (org.apache.avro.AvroRuntimeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strMap1);
        org.junit.Assert.assertNotNull(parser4);
        org.junit.Assert.assertNotNull(strMap5);
        org.junit.Assert.assertNotNull(parser6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(schema9);
    }

    @Test
    public void test1742() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SchemaM3Random300Test3.test1742");
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
        java.lang.String str23 = schema20.toString();
        org.apache.avro.Schema schema24 = org.apache.avro.Schema.createArray(schema20);
        java.lang.String str25 = schema20.getDoc();
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
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "{\"type\":\"map\",\"values\":[]}" + "'", str23, "{\"type\":\"map\",\"values\":[]}");
        org.junit.Assert.assertNotNull(schema24);
        org.junit.Assert.assertNull(str25);
    }

    @Test
    public void test1743() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SchemaM3Random300Test3.test1743");
        org.apache.avro.Schema schema1 = org.apache.avro.Schema.parse("[]");
        java.lang.String str2 = schema1.toString();
        org.junit.Assert.assertNotNull(schema1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "[]" + "'", str2, "[]");
    }

    @Test
    public void test1744() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SchemaM3Random300Test3.test1744");
        org.apache.avro.Schema.LockableArrayList<java.lang.String> strList4 = new org.apache.avro.Schema.LockableArrayList<java.lang.String>(10);
        org.apache.avro.Schema.LockableArrayList<java.lang.String> strList5 = new org.apache.avro.Schema.LockableArrayList<java.lang.String>((java.util.List<java.lang.String>) strList4);
        org.apache.avro.Schema.LockableArrayList<java.lang.String> strList6 = new org.apache.avro.Schema.LockableArrayList<java.lang.String>((java.util.List<java.lang.String>) strList5);
        org.apache.avro.Schema schema7 = org.apache.avro.Schema.createEnum("int", "{\r\n  \"type\" : \"map\",\r\n  \"values\" : {\r\n    \"type\" : \"enum\",\r\n    \"name\" : \"union\",\r\n    \"namespace\" : \"[]\",\r\n    \"doc\" : \"{}\",\r\n    \"symbols\" : [ ]\r\n  }\r\n}", "{null=null}", (java.util.List<java.lang.String>) strList5);
        org.junit.Assert.assertNotNull(schema7);
    }

    @Test
    public void test1745() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SchemaM3Random300Test3.test1745");
        org.apache.avro.Schema.Names names1 = new org.apache.avro.Schema.Names("{\r\n  \"type\" : \"array\",\r\n  \"items\" : [ ],\r\n  \"{}\" : \"hi!\"\r\n}");
    }

    @Test
    public void test1746() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SchemaM3Random300Test3.test1746");
        org.apache.avro.Schema.LockableArrayList<java.lang.String> strList7 = new org.apache.avro.Schema.LockableArrayList<java.lang.String>((int) '#');
        org.apache.avro.Schema.LockableArrayList<java.lang.String> strList8 = new org.apache.avro.Schema.LockableArrayList<java.lang.String>((java.util.List<java.lang.String>) strList7);
        org.apache.avro.Schema.LockableArrayList<java.lang.String> strList9 = new org.apache.avro.Schema.LockableArrayList<java.lang.String>((java.util.List<java.lang.String>) strList7);
        org.apache.avro.Schema schema10 = org.apache.avro.Schema.createEnum("array", "{\r\n  \"type\" : \"fixed\",\r\n  \"name\" : \"union\",\r\n  \"namespace\" : \"[]\",\r\n  \"doc\" : \"[ ]\",\r\n  \"size\" : 0\r\n}", "{\r\n  \"type\" : \"fixed\",\r\n  \"name\" : \"union\",\r\n  \"namespace\" : \"[]\",\r\n  \"doc\" : \"[ ]\",\r\n  \"size\" : 0\r\n}", (java.util.List<java.lang.String>) strList7);
        java.util.List<java.lang.String> strList11 = schema10.getEnumSymbols();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.avro.Schema schema12 = org.apache.avro.Schema.createEnum("{\"type\":\"map\",\"values\":{\"type\":\"array\",\"items\":\"int\"}}", "{\"type\":\"array\",\"items\":\"int\"}", "double", strList11);
            org.junit.Assert.fail("Expected exception of type org.apache.avro.SchemaParseException; message: Illegal initial character: {\"type\":\"map\",\"values\":{\"type\":\"array\",\"items\":\"int\"}}");
        } catch (org.apache.avro.SchemaParseException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(schema10);
        org.junit.Assert.assertNotNull(strList11);
    }

    @Test
    public void test1747() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SchemaM3Random300Test3.test1747");
        org.apache.avro.Schema.Parser parser0 = new org.apache.avro.Schema.Parser();
        java.util.Map<java.lang.String, org.apache.avro.Schema> strMap1 = parser0.getTypes();
        java.util.Map<java.lang.String, org.apache.avro.Schema> strMap2 = parser0.getTypes();
        org.apache.avro.Schema.Parser parser3 = new org.apache.avro.Schema.Parser();
        java.util.Map<java.lang.String, org.apache.avro.Schema> strMap4 = parser3.getTypes();
        org.apache.avro.Schema.Parser parser5 = parser0.addTypes(strMap4);
        org.apache.avro.Schema schema7 = parser0.parse("{\r\n  \"type\" : \"map\",\r\n  \"values\" : [ ]\r\n}");
        org.apache.avro.Schema schema8 = schema7.getValueType();
        org.apache.avro.Schema schema9 = org.apache.avro.Schema.createArray(schema7);
        java.lang.String str11 = schema7.getProp("{\"type\":\"fixed\",\"name\":\"union\",\"namespace\":\"[]\",\"doc\":\"union type:UNION pos:-1\",\"size\":100}");
        org.junit.Assert.assertNotNull(strMap1);
        org.junit.Assert.assertNotNull(strMap2);
        org.junit.Assert.assertNotNull(strMap4);
        org.junit.Assert.assertNotNull(parser5);
        org.junit.Assert.assertNotNull(schema7);
        org.junit.Assert.assertNotNull(schema8);
        org.junit.Assert.assertNotNull(schema9);
        org.junit.Assert.assertNull(str11);
    }

    @Test
    public void test1748() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SchemaM3Random300Test3.test1748");
        org.apache.avro.Schema.Names names1 = new org.apache.avro.Schema.Names("{\r\n  \"type\" : \"map\",\r\n  \"values\" : {\r\n    \"type\" : \"record\",\r\n    \"fields\" : [ ]\r\n  }\r\n}");
    }

    @Test
    public void test1749() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SchemaM3Random300Test3.test1749");
        org.apache.avro.Schema.Parser parser0 = new org.apache.avro.Schema.Parser();
        java.util.Map<java.lang.String, org.apache.avro.Schema> strMap1 = parser0.getTypes();
        java.util.Map<java.lang.String, org.apache.avro.Schema> strMap2 = parser0.getTypes();
        org.apache.avro.Schema.Parser parser3 = new org.apache.avro.Schema.Parser();
        java.util.Map<java.lang.String, org.apache.avro.Schema> strMap4 = parser3.getTypes();
        org.apache.avro.Schema.Parser parser5 = parser0.addTypes(strMap4);
        org.apache.avro.Schema schema7 = parser0.parse("{\r\n  \"type\" : \"map\",\r\n  \"values\" : [ ]\r\n}");
        org.apache.avro.Schema.Parser parser9 = parser0.setValidate(true);
        org.apache.avro.Schema schema11 = parser9.parse("{\r\n  \"type\" : \"map\",\r\n  \"values\" : {\r\n    \"type\" : \"map\",\r\n    \"values\" : [ ]\r\n  }\r\n}");
        org.apache.avro.Schema.Parser parser13 = parser9.setValidate(false);
        java.util.Map<java.lang.String, org.apache.avro.Schema> strMap14 = parser13.getTypes();
        org.junit.Assert.assertNotNull(strMap1);
        org.junit.Assert.assertNotNull(strMap2);
        org.junit.Assert.assertNotNull(strMap4);
        org.junit.Assert.assertNotNull(parser5);
        org.junit.Assert.assertNotNull(schema7);
        org.junit.Assert.assertNotNull(parser9);
        org.junit.Assert.assertNotNull(schema11);
        org.junit.Assert.assertNotNull(parser13);
        org.junit.Assert.assertNotNull(strMap14);
    }

    @Test
    public void test1750() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SchemaM3Random300Test3.test1750");
        org.apache.avro.Schema.LockableArrayList<java.lang.CharSequence> charSequenceList1 = new org.apache.avro.Schema.LockableArrayList<java.lang.CharSequence>(0);
        org.apache.avro.Schema.LockableArrayList<java.lang.CharSequence> charSequenceList2 = new org.apache.avro.Schema.LockableArrayList<java.lang.CharSequence>((java.util.List<java.lang.CharSequence>) charSequenceList1);
        org.apache.avro.Schema.LockableArrayList<java.lang.CharSequence> charSequenceList3 = new org.apache.avro.Schema.LockableArrayList<java.lang.CharSequence>((java.util.List<java.lang.CharSequence>) charSequenceList2);
    }

    @Test
    public void test1751() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SchemaM3Random300Test3.test1751");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.avro.Schema schema4 = org.apache.avro.Schema.createRecord("{\r\n  \"type\" : \"map\",\r\n  \"values\" : {\r\n    \"type\" : \"enum\",\r\n    \"name\" : \"union\",\r\n    \"namespace\" : \"[]\",\r\n    \"doc\" : \"{}\",\r\n    \"symbols\" : [ ]\r\n  }\r\n}", "{\r\n  \"type\" : \"fixed\",\r\n  \"name\" : \"union\",\r\n  \"namespace\" : \"[]\",\r\n  \"doc\" : \"[ ]\",\r\n  \"size\" : 0,\r\n  \"{\\r\\n  \\\"type\\\" : \\\"fixed\\\",\\r\\n  \\\"name\\\" : \\\"union\\\",\\r\\n  \\\"namespace\\\" : \\\"[]\\\",\\r\\n  \\\"doc\\\" : \\\"[ ]\\\",\\r\\n  \\\"size\\\" : 0\\r\\n}\" : \"{\\r\\n  \\\"type\\\" : \\\"map\\\",\\r\\n  \\\"values\\\" : {\\r\\n    \\\"type\\\" : \\\"map\\\",\\r\\n    \\\"values\\\" : [ ]\\r\\n  }\\r\\n}\"\r\n}", "{null=null}", false);
            org.junit.Assert.fail("Expected exception of type org.apache.avro.SchemaParseException; message: Illegal initial character: {??  \"type\" : \"map\",??  \"values\" : {??    \"type\" : \"enum\",??    \"name\" : \"union\",??    \"namespace\" : \"[]\",??    \"doc\" : \"{}\",??    \"symbols\" : [ ]??  }??}");
        } catch (org.apache.avro.SchemaParseException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1752() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SchemaM3Random300Test3.test1752");
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
        java.lang.String str23 = schema20.getFullName();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str24 = schema20.getNamespace();
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
    public void test1753() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SchemaM3Random300Test3.test1753");
        org.apache.avro.Schema.Names names0 = new org.apache.avro.Schema.Names();
        names0.space("[ ]");
        java.lang.Object obj3 = names0.clone();
        org.apache.avro.Schema.Names names4 = new org.apache.avro.Schema.Names();
        names4.space("[ ]");
        org.apache.avro.Schema schema7 = names0.remove((java.lang.Object) names4);
        boolean boolean8 = names0.isEmpty();
        org.junit.Assert.assertNotNull(obj3);
        org.junit.Assert.assertEquals(obj3.toString(), "{}");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj3), "{}");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj3), "{}");
        org.junit.Assert.assertNull(schema7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test1754() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SchemaM3Random300Test3.test1754");
        org.apache.avro.Schema.Type type0 = org.apache.avro.Schema.Type.LONG;
        org.apache.avro.Schema schema1 = org.apache.avro.Schema.create(type0);
        org.apache.avro.Schema schema2 = org.apache.avro.Schema.create(type0);
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<java.lang.String> strList3 = schema2.getEnumSymbols();
            org.junit.Assert.fail("Expected exception of type org.apache.avro.AvroRuntimeException; message: Not an enum: \"long\"");
        } catch (org.apache.avro.AvroRuntimeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + type0 + "' != '" + org.apache.avro.Schema.Type.LONG + "'", type0.equals(org.apache.avro.Schema.Type.LONG));
        org.junit.Assert.assertNotNull(schema1);
        org.junit.Assert.assertNotNull(schema2);
    }

    @Test
    public void test1755() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SchemaM3Random300Test3.test1755");
        org.apache.avro.Schema schema4 = org.apache.avro.Schema.createFixed("[].union", "union type:UNION pos:-1", "[]", (int) (short) 100);
        java.lang.String str5 = schema4.getName();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean6 = schema4.isError();
            org.junit.Assert.fail("Expected exception of type org.apache.avro.AvroRuntimeException; message: Not a record: {\"type\":\"fixed\",\"name\":\"union\",\"namespace\":\"[]\",\"doc\":\"union type:UNION pos:-1\",\"size\":100}");
        } catch (org.apache.avro.AvroRuntimeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(schema4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "union" + "'", str5, "union");
    }

    @Test
    public void test1756() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SchemaM3Random300Test3.test1756");
        org.apache.avro.Schema.Parser parser0 = new org.apache.avro.Schema.Parser();
        org.apache.avro.Schema.Parser parser2 = parser0.setValidate(true);
        org.apache.avro.Schema.Parser parser4 = parser0.setValidate(false);
        java.util.Map<java.lang.String, org.apache.avro.Schema> strMap5 = parser4.getTypes();
        java.io.InputStream inputStream6 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.avro.Schema schema7 = parser4.parse(inputStream6);
            org.junit.Assert.fail("Expected exception of type java.io.EOFException; message: No content to map to Object due to end of input");
        } catch (java.io.EOFException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(parser2);
        org.junit.Assert.assertNotNull(parser4);
        org.junit.Assert.assertNotNull(strMap5);
    }

    @Test
    public void test1757() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SchemaM3Random300Test3.test1757");
        org.apache.avro.Schema.Field[] fieldArray0 = new org.apache.avro.Schema.Field[] {};
        java.util.ArrayList<org.apache.avro.Schema.Field> fieldList1 = new java.util.ArrayList<org.apache.avro.Schema.Field>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<org.apache.avro.Schema.Field>) fieldList1, fieldArray0);
        org.apache.avro.Schema schema3 = org.apache.avro.Schema.createRecord((java.util.List<org.apache.avro.Schema.Field>) fieldList1);
        org.apache.avro.Schema.Field field5 = schema3.getField("");
        org.apache.avro.Schema schema6 = org.apache.avro.Schema.createMap(schema3);
        java.lang.String str7 = schema3.getNamespace();
        org.apache.avro.Schema schema8 = org.apache.avro.Schema.createMap(schema3);
        java.lang.String str9 = schema3.getName();
        org.junit.Assert.assertNotNull(fieldArray0);
        org.junit.Assert.assertArrayEquals(fieldArray0, new org.apache.avro.Schema.Field[] {});
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(schema3);
        org.junit.Assert.assertNull(field5);
        org.junit.Assert.assertNotNull(schema6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNotNull(schema8);
        org.junit.Assert.assertNull(str9);
    }

    @Test
    public void test1758() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SchemaM3Random300Test3.test1758");
        org.apache.avro.Schema.Field[] fieldArray0 = new org.apache.avro.Schema.Field[] {};
        java.util.ArrayList<org.apache.avro.Schema.Field> fieldList1 = new java.util.ArrayList<org.apache.avro.Schema.Field>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<org.apache.avro.Schema.Field>) fieldList1, fieldArray0);
        org.apache.avro.Schema schema3 = org.apache.avro.Schema.createRecord((java.util.List<org.apache.avro.Schema.Field>) fieldList1);
        org.apache.avro.Schema.Field field5 = schema3.getField("");
        org.apache.avro.Schema schema6 = org.apache.avro.Schema.createMap(schema3);
        org.apache.avro.Schema.Type type7 = schema3.getType();
        java.lang.String str8 = schema3.getDoc();
        java.lang.String str9 = schema3.getName();
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
    public void test1759() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SchemaM3Random300Test3.test1759");
        org.apache.avro.Schema[] schemaArray0 = new org.apache.avro.Schema[] {};
        java.util.ArrayList<org.apache.avro.Schema> schemaList1 = new java.util.ArrayList<org.apache.avro.Schema>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<org.apache.avro.Schema>) schemaList1, schemaArray0);
        org.apache.avro.Schema schema3 = org.apache.avro.Schema.createUnion((java.util.List<org.apache.avro.Schema>) schemaList1);
        java.util.List<org.apache.avro.Schema> schemaList4 = schema3.getTypes();
        java.lang.String str5 = schema3.getName();
        java.util.List<org.apache.avro.Schema> schemaList6 = schema3.getTypes();
        org.apache.avro.Schema schema7 = org.apache.avro.Schema.createUnion(schemaList6);
        java.lang.String str9 = schema7.getProp("{\"type\":\"fixed\",\"name\":\"union\",\"namespace\":\"[]\",\"doc\":\"{\\r\\n  \\\"type\\\" : \\\"map\\\",\\r\\n  \\\"values\\\" : [ ]\\r\\n}\",\"size\":10}");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Set<java.lang.String> strSet10 = schema7.getAliases();
            org.junit.Assert.fail("Expected exception of type org.apache.avro.AvroRuntimeException; message: Not a named type: []");
        } catch (org.apache.avro.AvroRuntimeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(schemaArray0);
        org.junit.Assert.assertArrayEquals(schemaArray0, new org.apache.avro.Schema[] {});
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(schema3);
        org.junit.Assert.assertNotNull(schemaList4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "union" + "'", str5, "union");
        org.junit.Assert.assertNotNull(schemaList6);
        org.junit.Assert.assertNotNull(schema7);
        org.junit.Assert.assertNull(str9);
    }

    @Test
    public void test1760() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SchemaM3Random300Test3.test1760");
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
            boolean boolean14 = schema12.hasEnumSymbol("hi!");
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
        org.junit.Assert.assertTrue("'" + type9 + "' != '" + org.apache.avro.Schema.Type.UNION + "'", type9.equals(org.apache.avro.Schema.Type.UNION));
        org.junit.Assert.assertNotNull(schema10);
        org.junit.Assert.assertNotNull(schema11);
        org.junit.Assert.assertNotNull(schema12);
    }

    @Test
    public void test1761() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SchemaM3Random300Test3.test1761");
        org.apache.avro.Schema.LockableArrayList<java.util.ArrayList<java.lang.String>> strListList1 = new org.apache.avro.Schema.LockableArrayList<java.util.ArrayList<java.lang.String>>((int) 'a');
    }

    @Test
    public void test1762() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SchemaM3Random300Test3.test1762");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.avro.Schema schema4 = org.apache.avro.Schema.createFixed("{\"type\":\"array\",\"items\":\"null\"}", "{\r\n  \"type\" : \"fixed\",\r\n  \"name\" : \"union\",\r\n  \"namespace\" : \"{}\",\r\n  \"doc\" : \"hi!\",\r\n  \"size\" : 1\r\n}", "{\"type\":\"array\",\"items\":[],\"union type:UNION pos:-1\":\"\"}", (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type org.apache.avro.SchemaParseException; message: Illegal initial character: {\"type\":\"array\",\"items\":\"null\"}");
        } catch (org.apache.avro.SchemaParseException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1763() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SchemaM3Random300Test3.test1763");
        org.apache.avro.Schema.LockableArrayList<java.lang.Comparable<java.lang.String>> strComparableList1 = new org.apache.avro.Schema.LockableArrayList<java.lang.Comparable<java.lang.String>>((int) '#');
    }

    @Test
    public void test1764() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SchemaM3Random300Test3.test1764");
        // The following exception was thrown during execution in test generation
        try {
            org.codehaus.jackson.JsonNode jsonNode1 = org.apache.avro.Schema.parseJson("{null={\"type\":\"map\",\"values\":{\"type\":\"array\",\"items\":{\"type\":\"map\",\"values\":[]}}}}");
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: org.codehaus.jackson.JsonParseException: Unexpected character ('n' (code 110)): was expecting double-quote to start field name? at [Source: java.io.StringReader@375bffc5; line: 1, column: 3]");
        } catch (java.lang.RuntimeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1765() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SchemaM3Random300Test3.test1765");
        org.apache.avro.Schema schema4 = org.apache.avro.Schema.createFixed("union", "[ ]", "[]", 0);
        org.apache.avro.Schema.Type type5 = org.apache.avro.Schema.Type.INT;
        org.apache.avro.Schema schema6 = org.apache.avro.Schema.create(type5);
        org.apache.avro.Schema schema7 = org.apache.avro.Schema.createArray(schema6);
        org.apache.avro.Schema schema8 = org.apache.avro.Schema.applyAliases(schema4, schema7);
        java.lang.String str10 = schema7.toString(false);
        java.lang.String str12 = schema7.toString(false);
        java.lang.String str14 = schema7.toString(true);
        schema7.addProp("{\r\n  \"type\" : \"fixed\",\r\n  \"name\" : \"union\",\r\n  \"namespace\" : \"union type:UNION pos:-1\",\r\n  \"doc\" : \"\",\r\n  \"size\" : 10\r\n}", "{\"type\":\"map\",\"values\":{\"type\":\"record\",\"fields\":[]}}");
        org.junit.Assert.assertNotNull(schema4);
        org.junit.Assert.assertTrue("'" + type5 + "' != '" + org.apache.avro.Schema.Type.INT + "'", type5.equals(org.apache.avro.Schema.Type.INT));
        org.junit.Assert.assertNotNull(schema6);
        org.junit.Assert.assertNotNull(schema7);
        org.junit.Assert.assertNotNull(schema8);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "{\"type\":\"array\",\"items\":\"int\"}" + "'", str10, "{\"type\":\"array\",\"items\":\"int\"}");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "{\"type\":\"array\",\"items\":\"int\"}" + "'", str12, "{\"type\":\"array\",\"items\":\"int\"}");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "{\r\n  \"type\" : \"array\",\r\n  \"items\" : \"int\"\r\n}" + "'", str14, "{\r\n  \"type\" : \"array\",\r\n  \"items\" : \"int\"\r\n}");
    }

    @Test
    public void test1766() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SchemaM3Random300Test3.test1766");
        org.apache.avro.Schema.LockableArrayList<java.lang.String> strList4 = new org.apache.avro.Schema.LockableArrayList<java.lang.String>(10);
        org.apache.avro.Schema schema5 = org.apache.avro.Schema.createEnum("{}.union", "union type:MAP pos:-1", "[].union", (java.util.List<java.lang.String>) strList4);
        org.junit.Assert.assertNotNull(schema5);
    }

    @Test
    public void test1767() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SchemaM3Random300Test3.test1767");
        org.apache.avro.Schema.Parser parser0 = new org.apache.avro.Schema.Parser();
        java.util.Map<java.lang.String, org.apache.avro.Schema> strMap1 = parser0.getTypes();
        org.apache.avro.Schema.Parser parser2 = new org.apache.avro.Schema.Parser();
        java.util.Map<java.lang.String, org.apache.avro.Schema> strMap3 = parser2.getTypes();
        org.apache.avro.Schema.Parser parser5 = parser2.setValidate(false);
        boolean boolean6 = parser5.getValidate();
        java.util.Map<java.lang.String, org.apache.avro.Schema> strMap7 = parser5.getTypes();
        org.apache.avro.Schema.Parser parser8 = parser0.addTypes(strMap7);
        org.junit.Assert.assertNotNull(strMap1);
        org.junit.Assert.assertNotNull(strMap3);
        org.junit.Assert.assertNotNull(parser5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(strMap7);
        org.junit.Assert.assertNotNull(parser8);
    }

    @Test
    public void test1768() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SchemaM3Random300Test3.test1768");
        org.apache.avro.Schema[] schemaArray0 = new org.apache.avro.Schema[] {};
        java.util.ArrayList<org.apache.avro.Schema> schemaList1 = new java.util.ArrayList<org.apache.avro.Schema>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<org.apache.avro.Schema>) schemaList1, schemaArray0);
        org.apache.avro.Schema schema3 = org.apache.avro.Schema.createUnion((java.util.List<org.apache.avro.Schema>) schemaList1);
        java.util.List<org.apache.avro.Schema> schemaList4 = schema3.getTypes();
        org.apache.avro.Schema schema5 = org.apache.avro.Schema.createMap(schema3);
        org.apache.avro.Schema schema8 = org.apache.avro.Schema.parse("{\r\n  \"type\" : \"array\",\r\n  \"items\" : {\r\n    \"type\" : \"map\",\r\n    \"values\" : [ ]\r\n  }\r\n}", true);
        boolean boolean9 = schema3.equals((java.lang.Object) true);
        java.util.List<org.apache.avro.Schema> schemaList10 = schema3.getTypes();
        org.apache.avro.Schema schema11 = org.apache.avro.Schema.createUnion(schemaList10);
        org.junit.Assert.assertNotNull(schemaArray0);
        org.junit.Assert.assertArrayEquals(schemaArray0, new org.apache.avro.Schema[] {});
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(schema3);
        org.junit.Assert.assertNotNull(schemaList4);
        org.junit.Assert.assertNotNull(schema5);
        org.junit.Assert.assertNotNull(schema8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(schemaList10);
        org.junit.Assert.assertNotNull(schema11);
    }

    @Test
    public void test1769() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SchemaM3Random300Test3.test1769");
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
        org.apache.avro.Schema schema15 = parser7.parse("{\"type\":\"fixed\",\"name\":\"map\",\"namespace\":\"\",\"doc\":\"array\",\"size\":97}");
        org.junit.Assert.assertNotNull(strMap1);
        org.junit.Assert.assertNotNull(strMap2);
        org.junit.Assert.assertNotNull(parser5);
        org.junit.Assert.assertNotNull(strMap6);
        org.junit.Assert.assertNotNull(parser7);
        org.junit.Assert.assertNotNull(parser9);
        org.junit.Assert.assertNotNull(parser11);
        org.junit.Assert.assertNotNull(parser13);
        org.junit.Assert.assertNotNull(schema15);
    }

    @Test
    public void test1770() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SchemaM3Random300Test3.test1770");
        org.apache.avro.Schema.LockableArrayList<java.lang.String> strList4 = new org.apache.avro.Schema.LockableArrayList<java.lang.String>((int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.avro.Schema schema5 = org.apache.avro.Schema.createEnum("\"null\"", "{\"type\":\"map\",\"values\":{\"type\":\"array\",\"items\":\"int\"}}", "{\"type\":\"array\",\"items\":\"int\"}", (java.util.List<java.lang.String>) strList4);
            org.junit.Assert.fail("Expected exception of type org.apache.avro.SchemaParseException; message: Illegal initial character: \"null\"");
        } catch (org.apache.avro.SchemaParseException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1771() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SchemaM3Random300Test3.test1771");
        org.apache.avro.Schema.LockableArrayList<java.lang.reflect.AnnotatedElement> annotatedElementList1 = new org.apache.avro.Schema.LockableArrayList<java.lang.reflect.AnnotatedElement>(10);
        org.apache.avro.Schema.LockableArrayList<java.lang.reflect.AnnotatedElement> annotatedElementList2 = new org.apache.avro.Schema.LockableArrayList<java.lang.reflect.AnnotatedElement>((java.util.List<java.lang.reflect.AnnotatedElement>) annotatedElementList1);
    }

    @Test
    public void test1772() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SchemaM3Random300Test3.test1772");
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
        org.apache.avro.Schema schema18 = org.apache.avro.Schema.createUnion(schemaList17);
        org.apache.avro.Schema schema19 = org.apache.avro.Schema.createUnion(schemaList17);
        org.apache.avro.Schema schema20 = org.apache.avro.Schema.createUnion(schemaList17);
        org.apache.avro.Schema schema21 = org.apache.avro.Schema.createUnion(schemaList17);
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
        org.junit.Assert.assertNotNull(schema18);
        org.junit.Assert.assertNotNull(schema19);
        org.junit.Assert.assertNotNull(schema20);
        org.junit.Assert.assertNotNull(schema21);
    }

    @Test
    public void test1773() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SchemaM3Random300Test3.test1773");
        org.apache.avro.Schema schema4 = org.apache.avro.Schema.createFixed("union", "", "union type:UNION pos:-1", 10);
        org.apache.avro.Schema schema6 = org.apache.avro.Schema.parse("{\"type\":\"map\",\"values\":{\"type\":\"enum\",\"name\":\"union\",\"namespace\":\"double\",\"doc\":\"union\",\"symbols\":[]}}");
        boolean boolean7 = schema4.equals((java.lang.Object) "{\"type\":\"map\",\"values\":{\"type\":\"enum\",\"name\":\"union\",\"namespace\":\"double\",\"doc\":\"union\",\"symbols\":[]}}");
        org.junit.Assert.assertNotNull(schema4);
        org.junit.Assert.assertNotNull(schema6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test1774() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SchemaM3Random300Test3.test1774");
        org.apache.avro.Schema.LockableArrayList<org.apache.avro.Schema> schemaList1 = new org.apache.avro.Schema.LockableArrayList<org.apache.avro.Schema>(1);
        org.apache.avro.Schema schema2 = org.apache.avro.Schema.createUnion((java.util.List<org.apache.avro.Schema>) schemaList1);
        org.apache.avro.Schema schema3 = org.apache.avro.Schema.createUnion((java.util.List<org.apache.avro.Schema>) schemaList1);
        org.apache.avro.Schema schema4 = org.apache.avro.Schema.createUnion((java.util.List<org.apache.avro.Schema>) schemaList1);
        org.apache.avro.Schema schema5 = org.apache.avro.Schema.createUnion((java.util.List<org.apache.avro.Schema>) schemaList1);
        org.junit.Assert.assertNotNull(schema2);
        org.junit.Assert.assertNotNull(schema3);
        org.junit.Assert.assertNotNull(schema4);
        org.junit.Assert.assertNotNull(schema5);
    }

    @Test
    public void test1775() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SchemaM3Random300Test3.test1775");
        org.apache.avro.Schema schema2 = org.apache.avro.Schema.parse("{\r\n  \"type\" : \"map\",\r\n  \"values\" : {\r\n    \"type\" : \"array\",\r\n    \"items\" : {\r\n      \"type\" : \"map\",\r\n      \"values\" : [ ]\r\n    },\r\n    \"\" : \"{\\r\\n  \\\"type\\\" : \\\"record\\\",\\r\\n  \\\"fields\\\" : [ ]\\r\\n}\"\r\n  }\r\n}", true);
        org.junit.Assert.assertNotNull(schema2);
    }

    @Test
    public void test1776() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SchemaM3Random300Test3.test1776");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.avro.Schema schema4 = org.apache.avro.Schema.createRecord("{\"type\":\"array\",\"items\":{\"type\":\"array\",\"items\":{\"type\":\"map\",\"values\":[]}}}", "{\r\n  \"type\" : \"record\",\r\n  \"fields\" : [ ],\r\n  \"{\\r\\n  \\\"type\\\" : \\\"fixed\\\",\\r\\n  \\\"name\\\" : \\\"union\\\",\\r\\n  \\\"namespace\\\" : \\\"[]\\\",\\r\\n  \\\"doc\\\" : \\\"[ ]\\\",\\r\\n  \\\"size\\\" : 0\\r\\n}\" : \"[ ]\"\r\n}", "{\r\n  \"type\" : \"array\",\r\n  \"items\" : {\r\n    \"type\" : \"map\",\r\n    \"values\" : [ ]\r\n  }\r\n}", false);
            org.junit.Assert.fail("Expected exception of type org.apache.avro.SchemaParseException; message: Illegal initial character: {\"type\":\"array\",\"items\":{\"type\":\"array\",\"items\":{\"type\":\"map\",\"values\":[]}}}");
        } catch (org.apache.avro.SchemaParseException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1777() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SchemaM3Random300Test3.test1777");
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
        java.lang.String str34 = schema31.getFullName();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean36 = schema31.hasEnumSymbol("{null=null}");
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
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "array" + "'", str34, "array");
    }

    @Test
    public void test1778() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SchemaM3Random300Test3.test1778");
        org.apache.avro.Schema.LockableArrayList<java.lang.String> strList1 = new org.apache.avro.Schema.LockableArrayList<java.lang.String>((int) (short) 0);
        org.apache.avro.Schema.LockableArrayList<java.lang.String> strList2 = new org.apache.avro.Schema.LockableArrayList<java.lang.String>((java.util.List<java.lang.String>) strList1);
        org.apache.avro.Schema.LockableArrayList<java.lang.String> strList3 = new org.apache.avro.Schema.LockableArrayList<java.lang.String>((java.util.List<java.lang.String>) strList2);
        org.apache.avro.Schema.LockableArrayList<java.lang.String> strList4 = new org.apache.avro.Schema.LockableArrayList<java.lang.String>((java.util.List<java.lang.String>) strList3);
    }

    @Test
    public void test1779() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SchemaM3Random300Test3.test1779");
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
        org.apache.avro.Schema.Parser parser15 = parser7.setValidate(false);
        org.junit.Assert.assertNotNull(strMap1);
        org.junit.Assert.assertNotNull(strMap2);
        org.junit.Assert.assertNotNull(parser5);
        org.junit.Assert.assertNotNull(strMap6);
        org.junit.Assert.assertNotNull(parser7);
        org.junit.Assert.assertNotNull(parser9);
        org.junit.Assert.assertNotNull(parser11);
        org.junit.Assert.assertNotNull(schema13);
        org.junit.Assert.assertNotNull(parser15);
    }

    @Test
    public void test1780() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SchemaM3Random300Test3.test1780");
        org.apache.avro.Schema[] schemaArray0 = new org.apache.avro.Schema[] {};
        java.util.ArrayList<org.apache.avro.Schema> schemaList1 = new java.util.ArrayList<org.apache.avro.Schema>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<org.apache.avro.Schema>) schemaList1, schemaArray0);
        org.apache.avro.Schema schema3 = org.apache.avro.Schema.createUnion((java.util.List<org.apache.avro.Schema>) schemaList1);
        org.apache.avro.Schema[] schemaArray4 = new org.apache.avro.Schema[] {};
        java.util.ArrayList<org.apache.avro.Schema> schemaList5 = new java.util.ArrayList<org.apache.avro.Schema>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<org.apache.avro.Schema>) schemaList5, schemaArray4);
        org.apache.avro.Schema schema7 = org.apache.avro.Schema.createUnion((java.util.List<org.apache.avro.Schema>) schemaList5);
        org.apache.avro.Schema schema8 = org.apache.avro.Schema.applyAliases(schema3, schema7);
        java.lang.String str10 = schema8.getProp("union");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.avro.Schema schema11 = schema8.getElementType();
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
        org.junit.Assert.assertNull(str10);
    }

    @Test
    public void test1781() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SchemaM3Random300Test3.test1781");
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
        // The following exception was thrown during execution in test generation
        try {
            schema15.addAlias("{\r\n  \"type\" : \"record\",\r\n  \"fields\" : [ ]\r\n}");
            org.junit.Assert.fail("Expected exception of type org.apache.avro.AvroRuntimeException; message: Not a named type: {\"type\":\"array\",\"items\":{\"type\":\"map\",\"values\":[]}}");
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
    }

    @Test
    public void test1782() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SchemaM3Random300Test3.test1782");
        org.apache.avro.Schema.LockableArrayList<java.util.List<java.lang.String>> strListList1 = new org.apache.avro.Schema.LockableArrayList<java.util.List<java.lang.String>>((int) '#');
    }

    @Test
    public void test1783() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SchemaM3Random300Test3.test1783");
        org.apache.avro.Schema.Names names1 = new org.apache.avro.Schema.Names("{\r\n  \"type\" : \"map\",\r\n  \"values\" : {\r\n    \"type\" : \"array\",\r\n    \"items\" : {\r\n      \"type\" : \"map\",\r\n      \"values\" : [ ]\r\n    },\r\n    \"\" : \"{\\r\\n  \\\"type\\\" : \\\"record\\\",\\r\\n  \\\"fields\\\" : [ ]\\r\\n}\"\r\n  }\r\n}");
    }

    @Test
    public void test1784() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SchemaM3Random300Test3.test1784");
        org.apache.avro.Schema.Type type0 = org.apache.avro.Schema.Type.NULL;
        org.apache.avro.Schema schema1 = org.apache.avro.Schema.create(type0);
        org.apache.avro.Schema schema2 = org.apache.avro.Schema.create(type0);
        java.lang.String str4 = schema2.toString(true);
        java.lang.String str5 = schema2.toString();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str6 = schema2.getNamespace();
            org.junit.Assert.fail("Expected exception of type org.apache.avro.AvroRuntimeException; message: Not a named type: \"null\"");
        } catch (org.apache.avro.AvroRuntimeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + type0 + "' != '" + org.apache.avro.Schema.Type.NULL + "'", type0.equals(org.apache.avro.Schema.Type.NULL));
        org.junit.Assert.assertNotNull(schema1);
        org.junit.Assert.assertNotNull(schema2);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "\"null\"" + "'", str4, "\"null\"");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "\"null\"" + "'", str5, "\"null\"");
    }

    @Test
    public void test1785() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SchemaM3Random300Test3.test1785");
        org.apache.avro.Schema.Parser parser0 = new org.apache.avro.Schema.Parser();
        java.util.Map<java.lang.String, org.apache.avro.Schema> strMap1 = parser0.getTypes();
        java.util.Map<java.lang.String, org.apache.avro.Schema> strMap2 = parser0.getTypes();
        org.apache.avro.Schema.Parser parser3 = new org.apache.avro.Schema.Parser();
        org.apache.avro.Schema.Parser parser5 = parser3.setValidate(true);
        java.util.Map<java.lang.String, org.apache.avro.Schema> strMap6 = parser3.getTypes();
        org.apache.avro.Schema.Parser parser7 = parser0.addTypes(strMap6);
        org.apache.avro.Schema.Parser parser9 = parser7.setValidate(true);
        java.util.Map<java.lang.String, org.apache.avro.Schema> strMap10 = parser7.getTypes();
        boolean boolean11 = parser7.getValidate();
        org.junit.Assert.assertNotNull(strMap1);
        org.junit.Assert.assertNotNull(strMap2);
        org.junit.Assert.assertNotNull(parser5);
        org.junit.Assert.assertNotNull(strMap6);
        org.junit.Assert.assertNotNull(parser7);
        org.junit.Assert.assertNotNull(parser9);
        org.junit.Assert.assertNotNull(strMap10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test1786() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SchemaM3Random300Test3.test1786");
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
        org.apache.avro.Schema.Parser parser17 = parser15.setValidate(true);
        java.io.File file18 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.avro.Schema schema19 = parser15.parse(file18);
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
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(parser13);
        org.junit.Assert.assertNotNull(strMap14);
        org.junit.Assert.assertNotNull(parser15);
        org.junit.Assert.assertNotNull(parser17);
    }

    @Test
    public void test1787() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SchemaM3Random300Test3.test1787");
        org.apache.avro.Schema.Names names1 = new org.apache.avro.Schema.Names("{\"type\":\"record\",\"fields\":[],\"{\\r\\n  \\\"type\\\" : \\\"fixed\\\",\\r\\n  \\\"name\\\" : \\\"union\\\",\\r\\n  \\\"namespace\\\" : \\\"[]\\\",\\r\\n  \\\"doc\\\" : \\\"[ ]\\\",\\r\\n  \\\"size\\\" : 0\\r\\n}\":\"[ ]\"}");
        org.apache.avro.Schema.LockableArrayList<java.lang.String> strList6 = new org.apache.avro.Schema.LockableArrayList<java.lang.String>((int) (byte) 10);
        org.apache.avro.Schema schema7 = org.apache.avro.Schema.createEnum("[].union", "union type:UNION pos:-1", "union type:UNION pos:-1", (java.util.List<java.lang.String>) strList6);
        org.apache.avro.Schema schema8 = org.apache.avro.Schema.createArray(schema7);
        org.apache.avro.Schema schema9 = org.apache.avro.Schema.createArray(schema7);
        boolean boolean10 = names1.equals((java.lang.Object) schema9);
        org.junit.Assert.assertNotNull(schema7);
        org.junit.Assert.assertNotNull(schema8);
        org.junit.Assert.assertNotNull(schema9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test1788() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SchemaM3Random300Test3.test1788");
        org.apache.avro.Schema.LockableArrayList<org.apache.avro.Schema.Field> fieldList1 = new org.apache.avro.Schema.LockableArrayList<org.apache.avro.Schema.Field>((int) (byte) 100);
        org.apache.avro.Schema schema2 = org.apache.avro.Schema.createRecord((java.util.List<org.apache.avro.Schema.Field>) fieldList1);
        org.apache.avro.Schema schema3 = org.apache.avro.Schema.createRecord((java.util.List<org.apache.avro.Schema.Field>) fieldList1);
        org.apache.avro.Schema schema4 = org.apache.avro.Schema.createRecord((java.util.List<org.apache.avro.Schema.Field>) fieldList1);
        org.apache.avro.Schema schema5 = org.apache.avro.Schema.createRecord((java.util.List<org.apache.avro.Schema.Field>) fieldList1);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.avro.Schema schema6 = schema5.getValueType();
            org.junit.Assert.fail("Expected exception of type org.apache.avro.AvroRuntimeException; message: Not a map: {\"type\":\"record\",\"fields\":[]}");
        } catch (org.apache.avro.AvroRuntimeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(schema2);
        org.junit.Assert.assertNotNull(schema3);
        org.junit.Assert.assertNotNull(schema4);
        org.junit.Assert.assertNotNull(schema5);
    }

    @Test
    public void test1789() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SchemaM3Random300Test3.test1789");
        org.apache.avro.Schema.Field[] fieldArray0 = new org.apache.avro.Schema.Field[] {};
        java.util.ArrayList<org.apache.avro.Schema.Field> fieldList1 = new java.util.ArrayList<org.apache.avro.Schema.Field>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<org.apache.avro.Schema.Field>) fieldList1, fieldArray0);
        org.apache.avro.Schema schema3 = org.apache.avro.Schema.createRecord((java.util.List<org.apache.avro.Schema.Field>) fieldList1);
        java.util.List<org.apache.avro.Schema.Field> fieldList4 = schema3.getFields();
        org.apache.avro.Schema schema5 = org.apache.avro.Schema.createRecord(fieldList4);
        org.apache.avro.Schema schema6 = org.apache.avro.Schema.createRecord(fieldList4);
        java.lang.String str7 = schema6.getName();
        org.junit.Assert.assertNotNull(fieldArray0);
        org.junit.Assert.assertArrayEquals(fieldArray0, new org.apache.avro.Schema.Field[] {});
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(schema3);
        org.junit.Assert.assertNotNull(fieldList4);
        org.junit.Assert.assertNotNull(schema5);
        org.junit.Assert.assertNotNull(schema6);
        org.junit.Assert.assertNull(str7);
    }

    @Test
    public void test1790() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SchemaM3Random300Test3.test1790");
        org.apache.avro.Schema.Parser parser0 = new org.apache.avro.Schema.Parser();
        org.apache.avro.Schema.Parser parser2 = parser0.setValidate(true);
        org.apache.avro.Schema.Parser parser4 = parser0.setValidate(false);
        boolean boolean5 = parser4.getValidate();
        org.apache.avro.Schema.Parser parser7 = parser4.setValidate(true);
        org.junit.Assert.assertNotNull(parser2);
        org.junit.Assert.assertNotNull(parser4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(parser7);
    }

    @Test
    public void test1791() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SchemaM3Random300Test3.test1791");
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
            int int27 = schema23.getFixedSize();
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
        org.junit.Assert.assertNotNull(schemaList20);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "[]" + "'", str22, "[]");
        org.junit.Assert.assertNotNull(schema23);
        org.junit.Assert.assertNotNull(schema24);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "array" + "'", str25, "array");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "{\"type\":\"array\",\"items\":[]}" + "'", str26, "{\"type\":\"array\",\"items\":[]}");
    }

    @Test
    public void test1792() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SchemaM3Random300Test3.test1792");
        org.apache.avro.Schema.Parser parser0 = new org.apache.avro.Schema.Parser();
        org.apache.avro.Schema.Parser parser2 = parser0.setValidate(true);
        java.util.Map<java.lang.String, org.apache.avro.Schema> strMap3 = parser0.getTypes();
        org.apache.avro.Schema.Parser parser5 = parser0.setValidate(true);
        org.apache.avro.Schema.Parser parser7 = parser0.setValidate(true);
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
        org.junit.Assert.assertNotNull(parser5);
        org.junit.Assert.assertNotNull(parser7);
    }

    @Test
    public void test1793() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SchemaM3Random300Test3.test1793");
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
        org.apache.avro.Schema.Parser parser18 = new org.apache.avro.Schema.Parser();
        java.util.Map<java.lang.String, org.apache.avro.Schema> strMap19 = parser18.getTypes();
        org.apache.avro.Schema.Parser parser20 = new org.apache.avro.Schema.Parser();
        org.apache.avro.Schema.Parser parser22 = parser20.setValidate(true);
        java.util.Map<java.lang.String, org.apache.avro.Schema> strMap23 = parser20.getTypes();
        org.apache.avro.Schema.Parser parser24 = parser18.addTypes(strMap23);
        boolean boolean25 = parser18.getValidate();
        org.apache.avro.Schema.Parser parser26 = new org.apache.avro.Schema.Parser();
        java.util.Map<java.lang.String, org.apache.avro.Schema> strMap27 = parser26.getTypes();
        java.util.Map<java.lang.String, org.apache.avro.Schema> strMap28 = parser26.getTypes();
        org.apache.avro.Schema.Parser parser29 = new org.apache.avro.Schema.Parser();
        org.apache.avro.Schema.Parser parser31 = parser29.setValidate(true);
        java.util.Map<java.lang.String, org.apache.avro.Schema> strMap32 = parser29.getTypes();
        org.apache.avro.Schema.Parser parser33 = parser26.addTypes(strMap32);
        org.apache.avro.Schema.Parser parser34 = parser18.addTypes(strMap32);
        org.apache.avro.Schema.Parser parser35 = parser0.addTypes(strMap32);
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
        org.junit.Assert.assertNotNull(strMap19);
        org.junit.Assert.assertNotNull(parser22);
        org.junit.Assert.assertNotNull(strMap23);
        org.junit.Assert.assertNotNull(parser24);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertNotNull(strMap27);
        org.junit.Assert.assertNotNull(strMap28);
        org.junit.Assert.assertNotNull(parser31);
        org.junit.Assert.assertNotNull(strMap32);
        org.junit.Assert.assertNotNull(parser33);
        org.junit.Assert.assertNotNull(parser34);
        org.junit.Assert.assertNotNull(parser35);
    }

    @Test
    public void test1794() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SchemaM3Random300Test3.test1794");
        org.apache.avro.Schema.Parser parser0 = new org.apache.avro.Schema.Parser();
        java.util.Map<java.lang.String, org.apache.avro.Schema> strMap1 = parser0.getTypes();
        java.util.Map<java.lang.String, org.apache.avro.Schema> strMap2 = parser0.getTypes();
        org.apache.avro.Schema.Parser parser3 = new org.apache.avro.Schema.Parser();
        java.util.Map<java.lang.String, org.apache.avro.Schema> strMap4 = parser3.getTypes();
        org.apache.avro.Schema.Parser parser5 = parser0.addTypes(strMap4);
        org.apache.avro.Schema schema7 = parser0.parse("{\r\n  \"type\" : \"map\",\r\n  \"values\" : [ ]\r\n}");
        org.apache.avro.Schema.Parser parser9 = parser0.setValidate(true);
        org.apache.avro.Schema schema11 = parser0.parse("{\"type\":\"map\",\"values\":{\"type\":\"enum\",\"name\":\"union\",\"namespace\":\"[]\",\"doc\":\"{}\",\"symbols\":[]}}");
        org.junit.Assert.assertNotNull(strMap1);
        org.junit.Assert.assertNotNull(strMap2);
        org.junit.Assert.assertNotNull(strMap4);
        org.junit.Assert.assertNotNull(parser5);
        org.junit.Assert.assertNotNull(schema7);
        org.junit.Assert.assertNotNull(parser9);
        org.junit.Assert.assertNotNull(schema11);
    }

    @Test
    public void test1795() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SchemaM3Random300Test3.test1795");
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
            int int24 = schema20.getEnumOrdinal("union type:MAP pos:-1");
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
        org.junit.Assert.assertNotNull(schema21);
        org.junit.Assert.assertNull(str22);
    }

    @Test
    public void test1796() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SchemaM3Random300Test3.test1796");
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
            boolean boolean19 = schema15.hasEnumSymbol("{\"type\":\"float\",\"{\\r\\n  \\\"type\\\" : \\\"record\\\",\\r\\n  \\\"fields\\\" : [ ]\\r\\n}\":\"{\\r\\n  \\\"type\\\" : \\\"map\\\",\\r\\n  \\\"values\\\" : [ ]\\r\\n}\"}");
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
    public void test1797() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SchemaM3Random300Test3.test1797");
        org.apache.avro.Schema schema1 = org.apache.avro.Schema.parse("{\"type\":\"fixed\",\"name\":\"union\",\"namespace\":\"{}\",\"doc\":\"hi!\",\"size\":1}");
        java.lang.String str3 = schema1.toString(false);
        org.junit.Assert.assertNotNull(schema1);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "{\"type\":\"fixed\",\"name\":\"union\",\"namespace\":\"{}\",\"doc\":\"hi!\",\"size\":1}" + "'", str3, "{\"type\":\"fixed\",\"name\":\"union\",\"namespace\":\"{}\",\"doc\":\"hi!\",\"size\":1}");
    }

    @Test
    public void test1798() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SchemaM3Random300Test3.test1798");
        org.apache.avro.Schema.Parser parser0 = new org.apache.avro.Schema.Parser();
        org.apache.avro.Schema.Parser parser2 = parser0.setValidate(true);
        java.util.Map<java.lang.String, org.apache.avro.Schema> strMap3 = parser0.getTypes();
        org.apache.avro.Schema.Parser parser5 = parser0.setValidate(true);
        org.apache.avro.Schema.Parser parser7 = parser5.setValidate(true);
        java.io.InputStream inputStream8 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.avro.Schema schema9 = parser5.parse(inputStream8);
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
    public void test1799() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SchemaM3Random300Test3.test1799");
        org.apache.avro.Schema.Parser parser0 = new org.apache.avro.Schema.Parser();
        java.util.Map<java.lang.String, org.apache.avro.Schema> strMap1 = parser0.getTypes();
        org.apache.avro.Schema.Parser parser2 = new org.apache.avro.Schema.Parser();
        org.apache.avro.Schema.Parser parser4 = parser2.setValidate(true);
        java.util.Map<java.lang.String, org.apache.avro.Schema> strMap5 = parser2.getTypes();
        org.apache.avro.Schema.Parser parser6 = parser0.addTypes(strMap5);
        boolean boolean7 = parser0.getValidate();
        org.apache.avro.Schema schema9 = parser0.parse("{\"type\":\"array\",\"items\":[]}");
        org.apache.avro.Schema.Parser parser11 = parser0.setValidate(false);
        java.io.InputStream inputStream12 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.avro.Schema schema13 = parser0.parse(inputStream12);
            org.junit.Assert.fail("Expected exception of type java.io.EOFException; message: No content to map to Object due to end of input");
        } catch (java.io.EOFException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strMap1);
        org.junit.Assert.assertNotNull(parser4);
        org.junit.Assert.assertNotNull(strMap5);
        org.junit.Assert.assertNotNull(parser6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(schema9);
        org.junit.Assert.assertNotNull(parser11);
    }

    @Test
    public void test1800() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SchemaM3Random300Test3.test1800");
        org.apache.avro.Schema.Names names0 = new org.apache.avro.Schema.Names();
        names0.space("[ ]");
        int int3 = names0.size();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void test1801() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SchemaM3Random300Test3.test1801");
        org.apache.avro.Schema.LockableArrayList<org.codehaus.jackson.JsonNode> jsonNodeList1 = new org.apache.avro.Schema.LockableArrayList<org.codehaus.jackson.JsonNode>(1);
    }

    @Test
    public void test1802() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SchemaM3Random300Test3.test1802");
        org.apache.avro.Schema[] schemaArray0 = new org.apache.avro.Schema[] {};
        java.util.ArrayList<org.apache.avro.Schema> schemaList1 = new java.util.ArrayList<org.apache.avro.Schema>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<org.apache.avro.Schema>) schemaList1, schemaArray0);
        org.apache.avro.Schema schema3 = org.apache.avro.Schema.createUnion((java.util.List<org.apache.avro.Schema>) schemaList1);
        org.apache.avro.Schema schema4 = org.apache.avro.Schema.createUnion((java.util.List<org.apache.avro.Schema>) schemaList1);
        java.util.List<org.apache.avro.Schema> schemaList5 = schema4.getTypes();
        org.apache.avro.Schema schema6 = org.apache.avro.Schema.createUnion(schemaList5);
        org.apache.avro.Schema schema7 = org.apache.avro.Schema.createUnion(schemaList5);
        org.junit.Assert.assertNotNull(schemaArray0);
        org.junit.Assert.assertArrayEquals(schemaArray0, new org.apache.avro.Schema[] {});
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(schema3);
        org.junit.Assert.assertNotNull(schema4);
        org.junit.Assert.assertNotNull(schemaList5);
        org.junit.Assert.assertNotNull(schema6);
        org.junit.Assert.assertNotNull(schema7);
    }

    @Test
    public void test1803() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SchemaM3Random300Test3.test1803");
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
        org.apache.avro.Schema schema22 = org.apache.avro.Schema.createUnion(schemaList20);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.avro.Schema schema23 = schema22.getValueType();
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
        org.junit.Assert.assertNotNull(schema21);
        org.junit.Assert.assertNotNull(schema22);
    }

    @Test
    public void test1804() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SchemaM3Random300Test3.test1804");
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
        org.apache.avro.Schema schema22 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.avro.Schema schema23 = org.apache.avro.Schema.applyAliases(schema8, schema22);
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
        org.junit.Assert.assertNull(str21);
    }

    @Test
    public void test1805() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SchemaM3Random300Test3.test1805");
        org.codehaus.jackson.JsonNode jsonNode1 = org.apache.avro.Schema.parseJson("{\"type\":\"array\",\"items\":{\"type\":\"array\",\"items\":{\"type\":\"map\",\"values\":[]}}}");
        org.junit.Assert.assertNotNull(jsonNode1);
    }

    @Test
    public void test1806() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SchemaM3Random300Test3.test1806");
        org.apache.avro.Schema.LockableArrayList<java.lang.Cloneable> cloneableList1 = new org.apache.avro.Schema.LockableArrayList<java.lang.Cloneable>(0);
    }

    @Test
    public void test1807() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SchemaM3Random300Test3.test1807");
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
        java.lang.String str18 = schema13.getProp("union type:UNION pos:-1");
        org.apache.avro.Schema.Names names20 = new org.apache.avro.Schema.Names("union");
        java.lang.String str21 = names20.space();
        boolean boolean22 = names20.isEmpty();
        int int23 = names20.size();
        org.codehaus.jackson.JsonGenerator jsonGenerator24 = null;
        // The following exception was thrown during execution in test generation
        try {
            schema13.toJson(names20, jsonGenerator24);
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
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNotNull(schema13);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "union" + "'", str21, "union");
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
    }

    @Test
    public void test1808() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SchemaM3Random300Test3.test1808");
        org.apache.avro.Schema.LockableArrayList<java.lang.String> strList4 = new org.apache.avro.Schema.LockableArrayList<java.lang.String>((int) '#');
        org.apache.avro.Schema.LockableArrayList<java.lang.String> strList5 = new org.apache.avro.Schema.LockableArrayList<java.lang.String>((java.util.List<java.lang.String>) strList4);
        org.apache.avro.Schema.LockableArrayList<java.lang.String> strList6 = new org.apache.avro.Schema.LockableArrayList<java.lang.String>((java.util.List<java.lang.String>) strList5);
        org.apache.avro.Schema.LockableArrayList<java.lang.String> strList7 = new org.apache.avro.Schema.LockableArrayList<java.lang.String>((java.util.List<java.lang.String>) strList6);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.avro.Schema schema8 = org.apache.avro.Schema.createEnum("{\"type\":\"map\",\"values\":[]}", "float type:ARRAY pos:-1", "{null=[]}", (java.util.List<java.lang.String>) strList6);
            org.junit.Assert.fail("Expected exception of type org.apache.avro.SchemaParseException; message: Illegal initial character: {\"type\":\"map\",\"values\":[]}");
        } catch (org.apache.avro.SchemaParseException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1809() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SchemaM3Random300Test3.test1809");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.avro.Schema schema4 = org.apache.avro.Schema.createRecord("", ".map", "\"double\"", true);
            org.junit.Assert.fail("Expected exception of type org.apache.avro.SchemaParseException; message: Empty name");
        } catch (org.apache.avro.SchemaParseException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1810() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SchemaM3Random300Test3.test1810");
        org.apache.avro.Schema.Parser parser0 = new org.apache.avro.Schema.Parser();
        org.apache.avro.Schema.Parser parser2 = parser0.setValidate(true);
        org.apache.avro.Schema.Parser parser4 = parser0.setValidate(true);
        org.apache.avro.Schema.Parser parser6 = parser0.setValidate(true);
        org.apache.avro.Schema schema8 = parser0.parse("[].union");
        org.apache.avro.Schema schema10 = parser0.parse("{\"type\":\"fixed\",\"name\":\"union\",\"namespace\":\"[]\",\"doc\":\"[ ]\",\"size\":0}");
        org.apache.avro.Schema.Type type11 = schema10.getType();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.avro.Schema.Field field13 = schema10.getField("");
            org.junit.Assert.fail("Expected exception of type org.apache.avro.AvroRuntimeException; message: Not a record: {\"type\":\"fixed\",\"name\":\"union\",\"namespace\":\"[]\",\"doc\":\"[ ]\",\"size\":0}");
        } catch (org.apache.avro.AvroRuntimeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(parser2);
        org.junit.Assert.assertNotNull(parser4);
        org.junit.Assert.assertNotNull(parser6);
        org.junit.Assert.assertNotNull(schema8);
        org.junit.Assert.assertNotNull(schema10);
        org.junit.Assert.assertTrue("'" + type11 + "' != '" + org.apache.avro.Schema.Type.FIXED + "'", type11.equals(org.apache.avro.Schema.Type.FIXED));
    }

    @Test
    public void test1811() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SchemaM3Random300Test3.test1811");
        org.apache.avro.Schema.Parser parser0 = new org.apache.avro.Schema.Parser();
        java.util.Map<java.lang.String, org.apache.avro.Schema> strMap1 = parser0.getTypes();
        java.util.Map<java.lang.String, org.apache.avro.Schema> strMap2 = parser0.getTypes();
        org.apache.avro.Schema.Parser parser3 = new org.apache.avro.Schema.Parser();
        org.apache.avro.Schema.Parser parser5 = parser3.setValidate(true);
        java.util.Map<java.lang.String, org.apache.avro.Schema> strMap6 = parser3.getTypes();
        org.apache.avro.Schema.Parser parser7 = parser0.addTypes(strMap6);
        java.util.Map<java.lang.String, org.apache.avro.Schema> strMap8 = parser0.getTypes();
        org.apache.avro.Schema.Parser parser10 = parser0.setValidate(false);
        org.apache.avro.Schema.Parser parser11 = new org.apache.avro.Schema.Parser();
        java.util.Map<java.lang.String, org.apache.avro.Schema> strMap12 = parser11.getTypes();
        org.apache.avro.Schema.Parser parser13 = new org.apache.avro.Schema.Parser();
        org.apache.avro.Schema.Parser parser15 = parser13.setValidate(true);
        java.util.Map<java.lang.String, org.apache.avro.Schema> strMap16 = parser13.getTypes();
        org.apache.avro.Schema.Parser parser17 = parser11.addTypes(strMap16);
        boolean boolean18 = parser11.getValidate();
        boolean boolean19 = parser11.getValidate();
        org.apache.avro.Schema.Parser parser20 = new org.apache.avro.Schema.Parser();
        java.util.Map<java.lang.String, org.apache.avro.Schema> strMap21 = parser20.getTypes();
        java.util.Map<java.lang.String, org.apache.avro.Schema> strMap22 = parser20.getTypes();
        org.apache.avro.Schema.Parser parser23 = new org.apache.avro.Schema.Parser();
        java.util.Map<java.lang.String, org.apache.avro.Schema> strMap24 = parser23.getTypes();
        org.apache.avro.Schema.Parser parser25 = parser20.addTypes(strMap24);
        org.apache.avro.Schema.Parser parser26 = parser11.addTypes(strMap24);
        org.apache.avro.Schema.Parser parser27 = parser0.addTypes(strMap24);
        org.apache.avro.Schema.Parser parser29 = parser27.setValidate(false);
        java.io.File file30 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.avro.Schema schema31 = parser29.parse(file30);
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
        org.junit.Assert.assertNotNull(strMap12);
        org.junit.Assert.assertNotNull(parser15);
        org.junit.Assert.assertNotNull(strMap16);
        org.junit.Assert.assertNotNull(parser17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertNotNull(strMap21);
        org.junit.Assert.assertNotNull(strMap22);
        org.junit.Assert.assertNotNull(strMap24);
        org.junit.Assert.assertNotNull(parser25);
        org.junit.Assert.assertNotNull(parser26);
        org.junit.Assert.assertNotNull(parser27);
        org.junit.Assert.assertNotNull(parser29);
    }

    @Test
    public void test1812() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SchemaM3Random300Test3.test1812");
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
        java.util.Map<java.lang.String, org.apache.avro.Schema> strMap19 = parser12.getTypes();
        org.apache.avro.Schema.Parser parser20 = new org.apache.avro.Schema.Parser();
        java.util.Map<java.lang.String, org.apache.avro.Schema> strMap21 = parser20.getTypes();
        java.util.Map<java.lang.String, org.apache.avro.Schema> strMap22 = parser20.getTypes();
        org.apache.avro.Schema.Parser parser23 = new org.apache.avro.Schema.Parser();
        org.apache.avro.Schema.Parser parser25 = parser23.setValidate(true);
        java.util.Map<java.lang.String, org.apache.avro.Schema> strMap26 = parser23.getTypes();
        org.apache.avro.Schema.Parser parser27 = parser20.addTypes(strMap26);
        org.apache.avro.Schema.Parser parser29 = parser27.setValidate(true);
        org.apache.avro.Schema.Parser parser31 = parser27.setValidate(true);
        java.util.Map<java.lang.String, org.apache.avro.Schema> strMap32 = parser27.getTypes();
        org.apache.avro.Schema.Parser parser33 = parser12.addTypes(strMap32);
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
        org.junit.Assert.assertNotNull(strMap21);
        org.junit.Assert.assertNotNull(strMap22);
        org.junit.Assert.assertNotNull(parser25);
        org.junit.Assert.assertNotNull(strMap26);
        org.junit.Assert.assertNotNull(parser27);
        org.junit.Assert.assertNotNull(parser29);
        org.junit.Assert.assertNotNull(parser31);
        org.junit.Assert.assertNotNull(strMap32);
        org.junit.Assert.assertNotNull(parser33);
    }

    @Test
    public void test1813() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SchemaM3Random300Test3.test1813");
        org.apache.avro.Schema schema2 = org.apache.avro.Schema.parse("{\"type\":\"array\",\"items\":\"null\"}", true);
        java.lang.String str3 = schema2.toString();
        org.junit.Assert.assertNotNull(schema2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "{\"type\":\"array\",\"items\":\"null\"}" + "'", str3, "{\"type\":\"array\",\"items\":\"null\"}");
    }

    @Test
    public void test1814() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SchemaM3Random300Test3.test1814");
        org.apache.avro.Schema schema1 = org.apache.avro.Schema.parse("{\r\n  \"type\" : \"array\",\r\n  \"items\" : [ ],\r\n  \"{}\" : \"hi!\"\r\n}");
        org.junit.Assert.assertNotNull(schema1);
    }

    @Test
    public void test1815() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SchemaM3Random300Test3.test1815");
        org.apache.avro.Schema.Parser parser0 = new org.apache.avro.Schema.Parser();
        java.util.Map<java.lang.String, org.apache.avro.Schema> strMap1 = parser0.getTypes();
        java.util.Map<java.lang.String, org.apache.avro.Schema> strMap2 = parser0.getTypes();
        org.apache.avro.Schema.Parser parser3 = new org.apache.avro.Schema.Parser();
        java.util.Map<java.lang.String, org.apache.avro.Schema> strMap4 = parser3.getTypes();
        org.apache.avro.Schema.Parser parser5 = parser0.addTypes(strMap4);
        org.apache.avro.Schema schema7 = parser0.parse("{\r\n  \"type\" : \"map\",\r\n  \"values\" : [ ]\r\n}");
        org.apache.avro.Schema schema8 = schema7.getValueType();
        java.lang.String str9 = schema7.getName();
        org.apache.avro.Schema schema10 = org.apache.avro.Schema.createArray(schema7);
        org.junit.Assert.assertNotNull(strMap1);
        org.junit.Assert.assertNotNull(strMap2);
        org.junit.Assert.assertNotNull(strMap4);
        org.junit.Assert.assertNotNull(parser5);
        org.junit.Assert.assertNotNull(schema7);
        org.junit.Assert.assertNotNull(schema8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "map" + "'", str9, "map");
        org.junit.Assert.assertNotNull(schema10);
    }

    @Test
    public void test1816() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SchemaM3Random300Test3.test1816");
        org.apache.avro.Schema.Parser parser0 = new org.apache.avro.Schema.Parser();
        java.util.Map<java.lang.String, org.apache.avro.Schema> strMap1 = parser0.getTypes();
        java.util.Map<java.lang.String, org.apache.avro.Schema> strMap2 = parser0.getTypes();
        org.apache.avro.Schema.Parser parser3 = new org.apache.avro.Schema.Parser();
        java.util.Map<java.lang.String, org.apache.avro.Schema> strMap4 = parser3.getTypes();
        org.apache.avro.Schema.Parser parser5 = parser0.addTypes(strMap4);
        org.apache.avro.Schema.Parser parser7 = parser0.setValidate(true);
        org.apache.avro.Schema.Parser parser9 = parser0.setValidate(false);
        org.apache.avro.Schema.Parser parser10 = new org.apache.avro.Schema.Parser();
        org.apache.avro.Schema.Parser parser12 = parser10.setValidate(true);
        org.apache.avro.Schema.Parser parser14 = parser10.setValidate(true);
        org.apache.avro.Schema.Parser parser16 = parser10.setValidate(true);
        org.apache.avro.Schema.Parser parser18 = parser10.setValidate(false);
        boolean boolean19 = parser10.getValidate();
        java.util.Map<java.lang.String, org.apache.avro.Schema> strMap20 = parser10.getTypes();
        org.apache.avro.Schema.Parser parser21 = parser9.addTypes(strMap20);
        org.junit.Assert.assertNotNull(strMap1);
        org.junit.Assert.assertNotNull(strMap2);
        org.junit.Assert.assertNotNull(strMap4);
        org.junit.Assert.assertNotNull(parser5);
        org.junit.Assert.assertNotNull(parser7);
        org.junit.Assert.assertNotNull(parser9);
        org.junit.Assert.assertNotNull(parser12);
        org.junit.Assert.assertNotNull(parser14);
        org.junit.Assert.assertNotNull(parser16);
        org.junit.Assert.assertNotNull(parser18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(strMap20);
        org.junit.Assert.assertNotNull(parser21);
    }

    @Test
    public void test1817() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SchemaM3Random300Test3.test1817");
        org.apache.avro.Schema.Parser parser0 = new org.apache.avro.Schema.Parser();
        java.util.Map<java.lang.String, org.apache.avro.Schema> strMap1 = parser0.getTypes();
        java.util.Map<java.lang.String, org.apache.avro.Schema> strMap2 = parser0.getTypes();
        org.apache.avro.Schema.Parser parser3 = new org.apache.avro.Schema.Parser();
        java.util.Map<java.lang.String, org.apache.avro.Schema> strMap4 = parser3.getTypes();
        org.apache.avro.Schema.Parser parser5 = parser0.addTypes(strMap4);
        org.apache.avro.Schema schema7 = parser0.parse("{\r\n  \"type\" : \"map\",\r\n  \"values\" : [ ]\r\n}");
        java.util.Map<java.lang.String, org.apache.avro.Schema> strMap8 = parser0.getTypes();
        org.junit.Assert.assertNotNull(strMap1);
        org.junit.Assert.assertNotNull(strMap2);
        org.junit.Assert.assertNotNull(strMap4);
        org.junit.Assert.assertNotNull(parser5);
        org.junit.Assert.assertNotNull(schema7);
        org.junit.Assert.assertNotNull(strMap8);
    }

    @Test
    public void test1818() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SchemaM3Random300Test3.test1818");
        org.apache.avro.Schema.Parser parser0 = new org.apache.avro.Schema.Parser();
        java.util.Map<java.lang.String, org.apache.avro.Schema> strMap1 = parser0.getTypes();
        org.apache.avro.Schema.Parser parser3 = parser0.setValidate(false);
        org.apache.avro.Schema schema5 = parser0.parse("{\r\n  \"type\" : \"array\",\r\n  \"items\" : \"int\"\r\n}");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Set<java.lang.String> strSet6 = schema5.getAliases();
            org.junit.Assert.fail("Expected exception of type org.apache.avro.AvroRuntimeException; message: Not a named type: {\"type\":\"array\",\"items\":\"int\"}");
        } catch (org.apache.avro.AvroRuntimeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strMap1);
        org.junit.Assert.assertNotNull(parser3);
        org.junit.Assert.assertNotNull(schema5);
    }

    @Test
    public void test1819() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SchemaM3Random300Test3.test1819");
        org.apache.avro.Schema.Parser parser0 = new org.apache.avro.Schema.Parser();
        java.util.Map<java.lang.String, org.apache.avro.Schema> strMap1 = parser0.getTypes();
        java.util.Map<java.lang.String, org.apache.avro.Schema> strMap2 = parser0.getTypes();
        org.apache.avro.Schema.Parser parser3 = new org.apache.avro.Schema.Parser();
        java.util.Map<java.lang.String, org.apache.avro.Schema> strMap4 = parser3.getTypes();
        org.apache.avro.Schema.Parser parser5 = parser0.addTypes(strMap4);
        boolean boolean6 = parser5.getValidate();
        org.apache.avro.Schema.Parser parser7 = new org.apache.avro.Schema.Parser();
        java.util.Map<java.lang.String, org.apache.avro.Schema> strMap8 = parser7.getTypes();
        java.util.Map<java.lang.String, org.apache.avro.Schema> strMap9 = parser7.getTypes();
        org.apache.avro.Schema.Parser parser10 = new org.apache.avro.Schema.Parser();
        org.apache.avro.Schema.Parser parser12 = parser10.setValidate(true);
        java.util.Map<java.lang.String, org.apache.avro.Schema> strMap13 = parser10.getTypes();
        org.apache.avro.Schema.Parser parser14 = parser7.addTypes(strMap13);
        org.apache.avro.Schema.Parser parser16 = parser14.setValidate(true);
        org.apache.avro.Schema.Parser parser17 = new org.apache.avro.Schema.Parser();
        java.util.Map<java.lang.String, org.apache.avro.Schema> strMap18 = parser17.getTypes();
        java.util.Map<java.lang.String, org.apache.avro.Schema> strMap19 = parser17.getTypes();
        org.apache.avro.Schema.Parser parser20 = new org.apache.avro.Schema.Parser();
        java.util.Map<java.lang.String, org.apache.avro.Schema> strMap21 = parser20.getTypes();
        org.apache.avro.Schema.Parser parser22 = parser17.addTypes(strMap21);
        java.util.Map<java.lang.String, org.apache.avro.Schema> strMap23 = parser22.getTypes();
        org.apache.avro.Schema.Parser parser24 = parser16.addTypes(strMap23);
        org.apache.avro.Schema.Parser parser26 = parser24.setValidate(false);
        java.util.Map<java.lang.String, org.apache.avro.Schema> strMap27 = parser24.getTypes();
        org.apache.avro.Schema.Parser parser28 = parser5.addTypes(strMap27);
        org.apache.avro.Schema.Parser parser30 = parser28.setValidate(false);
        org.junit.Assert.assertNotNull(strMap1);
        org.junit.Assert.assertNotNull(strMap2);
        org.junit.Assert.assertNotNull(strMap4);
        org.junit.Assert.assertNotNull(parser5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(strMap8);
        org.junit.Assert.assertNotNull(strMap9);
        org.junit.Assert.assertNotNull(parser12);
        org.junit.Assert.assertNotNull(strMap13);
        org.junit.Assert.assertNotNull(parser14);
        org.junit.Assert.assertNotNull(parser16);
        org.junit.Assert.assertNotNull(strMap18);
        org.junit.Assert.assertNotNull(strMap19);
        org.junit.Assert.assertNotNull(strMap21);
        org.junit.Assert.assertNotNull(parser22);
        org.junit.Assert.assertNotNull(strMap23);
        org.junit.Assert.assertNotNull(parser24);
        org.junit.Assert.assertNotNull(parser26);
        org.junit.Assert.assertNotNull(strMap27);
        org.junit.Assert.assertNotNull(parser28);
        org.junit.Assert.assertNotNull(parser30);
    }

    @Test
    public void test1820() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SchemaM3Random300Test3.test1820");
        org.apache.avro.Schema schema1 = org.apache.avro.Schema.parse("{\"type\":\"array\",\"items\":[]}");
        java.lang.String str2 = schema1.getName();
        java.lang.String str4 = schema1.toString(true);
        // The following exception was thrown during execution in test generation
        try {
            java.util.Set<java.lang.String> strSet5 = schema1.getAliases();
            org.junit.Assert.fail("Expected exception of type org.apache.avro.AvroRuntimeException; message: Not a named type: {\"type\":\"array\",\"items\":[]}");
        } catch (org.apache.avro.AvroRuntimeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(schema1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "array" + "'", str2, "array");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "{\r\n  \"type\" : \"array\",\r\n  \"items\" : [ ]\r\n}" + "'", str4, "{\r\n  \"type\" : \"array\",\r\n  \"items\" : [ ]\r\n}");
    }

    @Test
    public void test1821() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SchemaM3Random300Test3.test1821");
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
        org.apache.avro.Schema.Parser parser14 = parser12.setValidate(false);
        boolean boolean15 = parser14.getValidate();
        org.apache.avro.Schema schema17 = parser14.parse("{\r\n  \"type\" : \"map\",\r\n  \"values\" : {\r\n    \"type\" : \"map\",\r\n    \"values\" : [ ]\r\n  }\r\n}");
        boolean boolean18 = parser14.getValidate();
        org.junit.Assert.assertNotNull(strMap1);
        org.junit.Assert.assertNotNull(strMap2);
        org.junit.Assert.assertNotNull(parser5);
        org.junit.Assert.assertNotNull(strMap6);
        org.junit.Assert.assertNotNull(parser7);
        org.junit.Assert.assertNotNull(strMap8);
        org.junit.Assert.assertNotNull(parser10);
        org.junit.Assert.assertNotNull(parser12);
        org.junit.Assert.assertNotNull(parser14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(schema17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test1822() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SchemaM3Random300Test3.test1822");
        org.apache.avro.Schema schema2 = org.apache.avro.Schema.parse("{\r\n  \"type\" : \"map\",\r\n  \"values\" : {\r\n    \"type\" : \"fixed\",\r\n    \"name\" : \"union\",\r\n    \"namespace\" : \"[]\",\r\n    \"doc\" : \"[ ]\",\r\n    \"size\" : 0\r\n  }\r\n}", true);
        org.apache.avro.Schema schema3 = org.apache.avro.Schema.createArray(schema2);
        org.junit.Assert.assertNotNull(schema2);
        org.junit.Assert.assertNotNull(schema3);
    }

    @Test
    public void test1823() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SchemaM3Random300Test3.test1823");
        org.apache.avro.Schema.Names names1 = new org.apache.avro.Schema.Names("union type:UNION pos:-1.union");
    }

    @Test
    public void test1824() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SchemaM3Random300Test3.test1824");
        org.apache.avro.Schema.Type type0 = org.apache.avro.Schema.Type.DOUBLE;
        org.apache.avro.Schema schema1 = org.apache.avro.Schema.create(type0);
        org.apache.avro.Schema.Type type2 = schema1.getType();
        org.junit.Assert.assertTrue("'" + type0 + "' != '" + org.apache.avro.Schema.Type.DOUBLE + "'", type0.equals(org.apache.avro.Schema.Type.DOUBLE));
        org.junit.Assert.assertNotNull(schema1);
        org.junit.Assert.assertTrue("'" + type2 + "' != '" + org.apache.avro.Schema.Type.DOUBLE + "'", type2.equals(org.apache.avro.Schema.Type.DOUBLE));
    }

    @Test
    public void test1825() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SchemaM3Random300Test3.test1825");
        java.util.List<java.lang.Enum<org.apache.avro.Schema.Field.Order>> orderEnumList0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.avro.Schema.LockableArrayList<java.lang.Enum<org.apache.avro.Schema.Field.Order>> orderEnumList1 = new org.apache.avro.Schema.LockableArrayList<java.lang.Enum<org.apache.avro.Schema.Field.Order>>(orderEnumList0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1826() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SchemaM3Random300Test3.test1826");
        org.apache.avro.Schema.LockableArrayList<java.lang.String> strList3 = new org.apache.avro.Schema.LockableArrayList<java.lang.String>();
        org.apache.avro.Schema.LockableArrayList<java.lang.String> strList4 = new org.apache.avro.Schema.LockableArrayList<java.lang.String>((java.util.List<java.lang.String>) strList3);
        org.apache.avro.Schema schema5 = org.apache.avro.Schema.createEnum("[].union", "{}", "[].union", (java.util.List<java.lang.String>) strList4);
        org.apache.avro.Schema.LockableArrayList<java.lang.String> strList6 = new org.apache.avro.Schema.LockableArrayList<java.lang.String>((java.util.List<java.lang.String>) strList4);
        org.apache.avro.Schema.LockableArrayList<java.lang.String> strList7 = new org.apache.avro.Schema.LockableArrayList<java.lang.String>((java.util.List<java.lang.String>) strList4);
        org.junit.Assert.assertNotNull(schema5);
    }

    @Test
    public void test1827() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SchemaM3Random300Test3.test1827");
        org.apache.avro.Schema.Type type0 = org.apache.avro.Schema.Type.INT;
        org.apache.avro.Schema schema1 = org.apache.avro.Schema.create(type0);
        org.apache.avro.Schema schema2 = org.apache.avro.Schema.create(type0);
        schema2.addProp("{\r\n  \"type\" : \"record\",\r\n  \"fields\" : [ ]\r\n}", "map");
        org.apache.avro.Schema schema8 = org.apache.avro.Schema.parse("{\"type\":\"array\",\"items\":\"int\"}", true);
        org.apache.avro.Schema schema9 = schema8.getElementType();
        java.lang.String str10 = schema8.getDoc();
        org.apache.avro.Schema schema11 = org.apache.avro.Schema.applyAliases(schema2, schema8);
        org.junit.Assert.assertTrue("'" + type0 + "' != '" + org.apache.avro.Schema.Type.INT + "'", type0.equals(org.apache.avro.Schema.Type.INT));
        org.junit.Assert.assertNotNull(schema1);
        org.junit.Assert.assertNotNull(schema2);
        org.junit.Assert.assertNotNull(schema8);
        org.junit.Assert.assertNotNull(schema9);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNotNull(schema11);
    }

    @Test
    public void test1828() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SchemaM3Random300Test3.test1828");
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
        java.io.File file27 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.avro.Schema schema28 = parser6.parse(file27);
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
        org.junit.Assert.assertNotNull(strMap20);
        org.junit.Assert.assertNotNull(parser23);
        org.junit.Assert.assertNotNull(strMap24);
        org.junit.Assert.assertNotNull(parser25);
        org.junit.Assert.assertNotNull(parser26);
    }

    @Test
    public void test1829() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SchemaM3Random300Test3.test1829");
        org.apache.avro.Schema.Names names1 = new org.apache.avro.Schema.Names("{}");
        java.lang.Object obj2 = names1.clone();
        names1.clear();
        int int4 = names1.size();
        java.lang.Object obj5 = names1.clone();
        names1.space("{\r\n  \"type\" : \"map\",\r\n  \"values\" : {\r\n    \"type\" : \"enum\",\r\n    \"name\" : \"union\",\r\n    \"namespace\" : \"[]\",\r\n    \"doc\" : \"{}\",\r\n    \"symbols\" : [ ]\r\n  }\r\n}");
        org.junit.Assert.assertNotNull(obj2);
        org.junit.Assert.assertEquals(obj2.toString(), "{}");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj2), "{}");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj2), "{}");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(obj5);
        org.junit.Assert.assertEquals(obj5.toString(), "{}");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj5), "{}");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj5), "{}");
    }

    @Test
    public void test1830() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SchemaM3Random300Test3.test1830");
        org.apache.avro.Schema[] schemaArray0 = new org.apache.avro.Schema[] {};
        java.util.ArrayList<org.apache.avro.Schema> schemaList1 = new java.util.ArrayList<org.apache.avro.Schema>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<org.apache.avro.Schema>) schemaList1, schemaArray0);
        org.apache.avro.Schema schema3 = org.apache.avro.Schema.createUnion((java.util.List<org.apache.avro.Schema>) schemaList1);
        java.util.List<org.apache.avro.Schema> schemaList4 = schema3.getTypes();
        org.apache.avro.Schema.Type type5 = schema3.getType();
        java.lang.Object obj6 = null;
        boolean boolean7 = schema3.equals(obj6);
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
        boolean boolean25 = schema3.equals((java.lang.Object) parser14);
        // The following exception was thrown during execution in test generation
        try {
            int int26 = schema3.getFixedSize();
            org.junit.Assert.fail("Expected exception of type org.apache.avro.AvroRuntimeException; message: Not fixed: []");
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
        org.junit.Assert.assertNotNull(parser10);
        org.junit.Assert.assertNotNull(parser12);
        org.junit.Assert.assertNotNull(parser14);
        org.junit.Assert.assertNotNull(parser17);
        org.junit.Assert.assertNotNull(strMap18);
        org.junit.Assert.assertNotNull(parser20);
        org.junit.Assert.assertNotNull(parser22);
        org.junit.Assert.assertNotNull(strMap23);
        org.junit.Assert.assertNotNull(parser24);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
    }

    @Test
    public void test1831() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SchemaM3Random300Test3.test1831");
        java.lang.String[] strArray19 = new java.lang.String[] { "{\"type\":\"array\",\"items\":{\"type\":\"map\",\"values\":[]}}", "union type:MAP pos:-1", "{\"type\":\"array\",\"items\":{\"type\":\"map\",\"values\":[]}}", "{}", "{\r\n  \"type\" : \"map\",\r\n  \"values\" : {\r\n    \"type\" : \"map\",\r\n    \"values\" : [ ]\r\n  }\r\n}", "double", "{\r\n  \"type\" : \"map\",\r\n  \"values\" : [ ]\r\n}", "{\"type\":\"map\",\"values\":[]}", "{\"type\":\"array\",\"items\":[]}", "{\"type\":\"map\",\"values\":[]}", "{}", "union", "{\r\n  \"type\" : \"record\",\r\n  \"fields\" : [ ]\r\n}", "[].union", "{\r\n  \"type\" : \"map\",\r\n  \"values\" : [ ]\r\n}", "{\"type\":\"fixed\",\"name\":\"union\",\"namespace\":\"[]\",\"doc\":\"[ ]\",\"size\":0}" };
        java.util.ArrayList<java.lang.String> strList20 = new java.util.ArrayList<java.lang.String>();
        boolean boolean21 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList20, strArray19);
        org.apache.avro.Schema.LockableArrayList<java.lang.String> strList22 = new org.apache.avro.Schema.LockableArrayList<java.lang.String>((java.util.List<java.lang.String>) strList20);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.avro.Schema schema23 = org.apache.avro.Schema.createEnum("{\r\n  \"type\" : \"array\",\r\n  \"items\" : {\r\n    \"type\" : \"map\",\r\n    \"values\" : [ ]\r\n  }\r\n}", "", "union type:MAP pos:-1", (java.util.List<java.lang.String>) strList22);
            org.junit.Assert.fail("Expected exception of type org.apache.avro.SchemaParseException; message: Illegal initial character: {??  \"type\" : \"array\",??  \"items\" : {??    \"type\" : \"map\",??    \"values\" : [ ]??  }??}");
        } catch (org.apache.avro.SchemaParseException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray19);
        org.junit.Assert.assertArrayEquals(strArray19, new java.lang.String[] { "{\"type\":\"array\",\"items\":{\"type\":\"map\",\"values\":[]}}", "union type:MAP pos:-1", "{\"type\":\"array\",\"items\":{\"type\":\"map\",\"values\":[]}}", "{}", "{\r\n  \"type\" : \"map\",\r\n  \"values\" : {\r\n    \"type\" : \"map\",\r\n    \"values\" : [ ]\r\n  }\r\n}", "double", "{\r\n  \"type\" : \"map\",\r\n  \"values\" : [ ]\r\n}", "{\"type\":\"map\",\"values\":[]}", "{\"type\":\"array\",\"items\":[]}", "{\"type\":\"map\",\"values\":[]}", "{}", "union", "{\r\n  \"type\" : \"record\",\r\n  \"fields\" : [ ]\r\n}", "[].union", "{\r\n  \"type\" : \"map\",\r\n  \"values\" : [ ]\r\n}", "{\"type\":\"fixed\",\"name\":\"union\",\"namespace\":\"[]\",\"doc\":\"[ ]\",\"size\":0}" });
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
    }

    @Test
    public void test1832() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SchemaM3Random300Test3.test1832");
        org.apache.avro.Schema.LockableArrayList<java.lang.String> strList4 = new org.apache.avro.Schema.LockableArrayList<java.lang.String>(100);
        org.apache.avro.Schema.LockableArrayList<java.lang.String> strList5 = new org.apache.avro.Schema.LockableArrayList<java.lang.String>((java.util.List<java.lang.String>) strList4);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.avro.Schema schema6 = org.apache.avro.Schema.createEnum("hi!", "{\r\n  \"type\" : \"fixed\",\r\n  \"name\" : \"union\",\r\n  \"namespace\" : \"union type:UNION pos:-1\",\r\n  \"doc\" : \"\",\r\n  \"size\" : 10\r\n}", "{\"type\":\"fixed\",\"name\":\"union\",\"namespace\":\"union type:UNION pos:-1\",\"doc\":\"\",\"size\":10}", (java.util.List<java.lang.String>) strList4);
            org.junit.Assert.fail("Expected exception of type org.apache.avro.SchemaParseException; message: Illegal character in: hi!");
        } catch (org.apache.avro.SchemaParseException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1833() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SchemaM3Random300Test3.test1833");
        org.apache.avro.Schema.Field[] fieldArray0 = new org.apache.avro.Schema.Field[] {};
        java.util.ArrayList<org.apache.avro.Schema.Field> fieldList1 = new java.util.ArrayList<org.apache.avro.Schema.Field>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<org.apache.avro.Schema.Field>) fieldList1, fieldArray0);
        org.apache.avro.Schema schema3 = org.apache.avro.Schema.createRecord((java.util.List<org.apache.avro.Schema.Field>) fieldList1);
        org.apache.avro.Schema schema4 = org.apache.avro.Schema.createRecord((java.util.List<org.apache.avro.Schema.Field>) fieldList1);
        org.apache.avro.Schema schema5 = org.apache.avro.Schema.createRecord((java.util.List<org.apache.avro.Schema.Field>) fieldList1);
        org.apache.avro.Schema schema6 = org.apache.avro.Schema.createRecord((java.util.List<org.apache.avro.Schema.Field>) fieldList1);
        java.lang.String str7 = schema6.getNamespace();
        java.lang.String str8 = schema6.getNamespace();
        java.util.List<org.apache.avro.Schema.Field> fieldList9 = schema6.getFields();
        java.lang.String str11 = schema6.getProp("union");
        org.junit.Assert.assertNotNull(fieldArray0);
        org.junit.Assert.assertArrayEquals(fieldArray0, new org.apache.avro.Schema.Field[] {});
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(schema3);
        org.junit.Assert.assertNotNull(schema4);
        org.junit.Assert.assertNotNull(schema5);
        org.junit.Assert.assertNotNull(schema6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNotNull(fieldList9);
        org.junit.Assert.assertNull(str11);
    }

    @Test
    public void test1834() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SchemaM3Random300Test3.test1834");
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
        org.apache.avro.Schema schema17 = parser7.parse("[ ]");
        java.util.Map<java.lang.String, org.apache.avro.Schema> strMap18 = parser7.getTypes();
        org.apache.avro.Schema.Parser parser20 = parser7.setValidate(false);
        org.junit.Assert.assertNotNull(strMap1);
        org.junit.Assert.assertNotNull(strMap2);
        org.junit.Assert.assertNotNull(parser5);
        org.junit.Assert.assertNotNull(strMap6);
        org.junit.Assert.assertNotNull(parser7);
        org.junit.Assert.assertNotNull(parser9);
        org.junit.Assert.assertNotNull(parser11);
        org.junit.Assert.assertNotNull(parser13);
        org.junit.Assert.assertNotNull(parser15);
        org.junit.Assert.assertNotNull(schema17);
        org.junit.Assert.assertNotNull(strMap18);
        org.junit.Assert.assertNotNull(parser20);
    }

    @Test
    public void test1835() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SchemaM3Random300Test3.test1835");
        org.apache.avro.Schema[] schemaArray0 = new org.apache.avro.Schema[] {};
        java.util.ArrayList<org.apache.avro.Schema> schemaList1 = new java.util.ArrayList<org.apache.avro.Schema>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<org.apache.avro.Schema>) schemaList1, schemaArray0);
        org.apache.avro.Schema schema3 = org.apache.avro.Schema.createUnion((java.util.List<org.apache.avro.Schema>) schemaList1);
        org.apache.avro.Schema schema4 = org.apache.avro.Schema.createUnion((java.util.List<org.apache.avro.Schema>) schemaList1);
        org.apache.avro.Schema schema5 = org.apache.avro.Schema.createUnion((java.util.List<org.apache.avro.Schema>) schemaList1);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean7 = schema5.hasEnumSymbol("{\"type\":\"map\",\"values\":\"double\"}");
            org.junit.Assert.fail("Expected exception of type org.apache.avro.AvroRuntimeException; message: Not an enum: []");
        } catch (org.apache.avro.AvroRuntimeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(schemaArray0);
        org.junit.Assert.assertArrayEquals(schemaArray0, new org.apache.avro.Schema[] {});
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(schema3);
        org.junit.Assert.assertNotNull(schema4);
        org.junit.Assert.assertNotNull(schema5);
    }

    @Test
    public void test1836() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SchemaM3Random300Test3.test1836");
        org.codehaus.jackson.JsonNode jsonNode1 = org.apache.avro.Schema.parseJson("{\r\n  \"type\" : \"fixed\",\r\n  \"name\" : \"union\",\r\n  \"namespace\" : \"{}\",\r\n  \"doc\" : \"hi!\",\r\n  \"size\" : 1\r\n}");
        org.junit.Assert.assertNotNull(jsonNode1);
    }

    @Test
    public void test1837() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SchemaM3Random300Test3.test1837");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.avro.Schema schema4 = org.apache.avro.Schema.createFixed("{\"type\":\"array\",\"items\":{\"type\":\"array\",\"items\":{\"type\":\"map\",\"values\":[]}}}", "hi!", "{\"type\":\"map\",\"values\":{\"type\":\"array\",\"items\":{\"type\":\"map\",\"values\":[]}}}", 100);
            org.junit.Assert.fail("Expected exception of type org.apache.avro.SchemaParseException; message: Illegal initial character: {\"type\":\"array\",\"items\":{\"type\":\"array\",\"items\":{\"type\":\"map\",\"values\":[]}}}");
        } catch (org.apache.avro.SchemaParseException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1838() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SchemaM3Random300Test3.test1838");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.avro.Schema schema4 = org.apache.avro.Schema.createRecord("{\"type\":\"fixed\",\"name\":\"union\",\"namespace\":\"[]\",\"doc\":\"[ ]\",\"size\":0,\"aliases\":[\"union\"]}", "union type:UNION pos:-1.union", "{\"type\":\"map\",\"values\":{\"type\":\"enum\",\"name\":\"union\",\"namespace\":\"[]\",\"doc\":\"{}\",\"symbols\":[]}}", false);
            org.junit.Assert.fail("Expected exception of type org.apache.avro.SchemaParseException; message: Illegal initial character: {\"type\":\"fixed\",\"name\":\"union\",\"namespace\":\"[]\",\"doc\":\"[ ]\",\"size\":0,\"aliases\":[\"union\"]}");
        } catch (org.apache.avro.SchemaParseException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1839() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SchemaM3Random300Test3.test1839");
        org.apache.avro.Schema.LockableArrayList<java.lang.String> strList7 = new org.apache.avro.Schema.LockableArrayList<java.lang.String>((int) (byte) 10);
        org.apache.avro.Schema schema8 = org.apache.avro.Schema.createEnum("[].union", "union type:UNION pos:-1", "union type:UNION pos:-1", (java.util.List<java.lang.String>) strList7);
        java.util.List<java.lang.String> strList9 = schema8.getEnumSymbols();
        org.apache.avro.Schema schema10 = org.apache.avro.Schema.createEnum("map", "\"null\"", "{}", strList9);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.avro.Schema.Field field12 = schema10.getField("map");
            org.junit.Assert.fail("Expected exception of type org.apache.avro.AvroRuntimeException; message: Not a record: {\"type\":\"enum\",\"name\":\"map\",\"namespace\":\"{}\",\"doc\":\"\\\"null\\\"\",\"symbols\":[]}");
        } catch (org.apache.avro.AvroRuntimeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(schema8);
        org.junit.Assert.assertNotNull(strList9);
        org.junit.Assert.assertNotNull(schema10);
    }

    @Test
    public void test1840() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SchemaM3Random300Test3.test1840");
        java.lang.String[] strArray4 = new java.lang.String[] { "" };
        java.util.ArrayList<java.lang.String> strList5 = new java.util.ArrayList<java.lang.String>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList5, strArray4);
        org.apache.avro.Schema.LockableArrayList<java.lang.String> strList7 = new org.apache.avro.Schema.LockableArrayList<java.lang.String>((java.util.List<java.lang.String>) strList5);
        org.apache.avro.Schema.LockableArrayList<java.lang.String> strList8 = new org.apache.avro.Schema.LockableArrayList<java.lang.String>((java.util.List<java.lang.String>) strList5);
        org.apache.avro.Schema.LockableArrayList<java.lang.String> strList9 = new org.apache.avro.Schema.LockableArrayList<java.lang.String>((java.util.List<java.lang.String>) strList5);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.avro.Schema schema10 = org.apache.avro.Schema.createEnum("{\"type\":\"fixed\",\"name\":\"union\",\"namespace\":\"[]\",\"doc\":\"union type:UNION pos:-1\",\"size\":100}", "{\r\n  \"type\" : \"array\",\r\n  \"items\" : [ ]\r\n}", "union type:MAP pos:-1", (java.util.List<java.lang.String>) strList5);
            org.junit.Assert.fail("Expected exception of type org.apache.avro.SchemaParseException; message: Illegal initial character: {\"type\":\"fixed\",\"name\":\"union\",\"namespace\":\"[]\",\"doc\":\"union type:UNION pos:-1\",\"size\":100}");
        } catch (org.apache.avro.SchemaParseException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertArrayEquals(strArray4, new java.lang.String[] { "" });
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test1841() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SchemaM3Random300Test3.test1841");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.avro.Schema schema4 = org.apache.avro.Schema.createFixed("{\"type\":\"array\",\"items\":{\"type\":\"record\",\"fields\":[]}}", "{\"type\":\"array\",\"items\":[]}", "{\"type\":\"fixed\",\"name\":\"union\",\"namespace\":\"[]\",\"doc\":\"union type:UNION pos:-1\",\"size\":100}", 0);
            org.junit.Assert.fail("Expected exception of type org.apache.avro.SchemaParseException; message: Illegal initial character: {\"type\":\"array\",\"items\":{\"type\":\"record\",\"fields\":[]}}");
        } catch (org.apache.avro.SchemaParseException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1842() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SchemaM3Random300Test3.test1842");
        org.apache.avro.Schema[] schemaArray0 = new org.apache.avro.Schema[] {};
        java.util.ArrayList<org.apache.avro.Schema> schemaList1 = new java.util.ArrayList<org.apache.avro.Schema>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<org.apache.avro.Schema>) schemaList1, schemaArray0);
        org.apache.avro.Schema schema3 = org.apache.avro.Schema.createUnion((java.util.List<org.apache.avro.Schema>) schemaList1);
        java.util.List<org.apache.avro.Schema> schemaList4 = schema3.getTypes();
        org.apache.avro.Schema schema5 = org.apache.avro.Schema.createMap(schema3);
        java.lang.String str7 = schema5.getProp("{\r\n  \"type\" : \"record\",\r\n  \"fields\" : [ ],\r\n  \"{\\r\\n  \\\"type\\\" : \\\"fixed\\\",\\r\\n  \\\"name\\\" : \\\"union\\\",\\r\\n  \\\"namespace\\\" : \\\"[]\\\",\\r\\n  \\\"doc\\\" : \\\"[ ]\\\",\\r\\n  \\\"size\\\" : 0\\r\\n}\" : \"[ ]\"\r\n}");
        org.junit.Assert.assertNotNull(schemaArray0);
        org.junit.Assert.assertArrayEquals(schemaArray0, new org.apache.avro.Schema[] {});
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(schema3);
        org.junit.Assert.assertNotNull(schemaList4);
        org.junit.Assert.assertNotNull(schema5);
        org.junit.Assert.assertNull(str7);
    }

    @Test
    public void test1843() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SchemaM3Random300Test3.test1843");
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
        java.lang.String str44 = schema43.getName();
        java.lang.String str45 = schema43.toString();
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
        org.junit.Assert.assertEquals("'" + str44 + "' != '" + "union" + "'", str44, "union");
        org.junit.Assert.assertEquals("'" + str45 + "' != '" + "[]" + "'", str45, "[]");
    }

    @Test
    public void test1844() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SchemaM3Random300Test3.test1844");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.avro.Schema schema4 = org.apache.avro.Schema.createFixed("", "", "{\r\n  \"type\" : \"array\",\r\n  \"items\" : [ ]\r\n}", (int) 'a');
            org.junit.Assert.fail("Expected exception of type org.apache.avro.SchemaParseException; message: Empty name");
        } catch (org.apache.avro.SchemaParseException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1845() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SchemaM3Random300Test3.test1845");
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
        org.apache.avro.Schema schema13 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.avro.Schema schema14 = org.apache.avro.Schema.applyAliases(schema10, schema13);
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
    }

    @Test
    public void test1846() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SchemaM3Random300Test3.test1846");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.avro.Schema schema1 = org.apache.avro.Schema.parse("union type:UNION pos:-1.union");
            org.junit.Assert.fail("Expected exception of type org.apache.avro.SchemaParseException; message: org.codehaus.jackson.JsonParseException: Unexpected character ('u' (code 117)): expected a valid value (number, String, array, object, 'true', 'false' or 'null')? at [Source: java.io.StringReader@2123f03b; line: 1, column: 2]");
        } catch (org.apache.avro.SchemaParseException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1847() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SchemaM3Random300Test3.test1847");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.avro.Schema schema4 = org.apache.avro.Schema.createRecord("{\"type\":\"array\",\"items\":{\"type\":\"array\",\"items\":{\"type\":\"map\",\"values\":[]}}}", "{\"type\":\"array\",\"items\":[]}", "{\r\n  \"type\" : \"array\",\r\n  \"items\" : [ ],\r\n  \"{}\" : \"hi!\"\r\n}", false);
            org.junit.Assert.fail("Expected exception of type org.apache.avro.SchemaParseException; message: Illegal initial character: {\"type\":\"array\",\"items\":{\"type\":\"array\",\"items\":{\"type\":\"map\",\"values\":[]}}}");
        } catch (org.apache.avro.SchemaParseException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1848() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SchemaM3Random300Test3.test1848");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.avro.Schema schema4 = org.apache.avro.Schema.createRecord("{null={\"type\":\"fixed\",\"name\":\"union\",\"namespace\":\"[]\",\"doc\":\"[ ]\",\"size\":0}}", "{null={\"type\":\"fixed\",\"name\":\"union\",\"namespace\":\"[]\",\"doc\":\"[ ]\",\"size\":0}}", "{null={\"type\":\"fixed\",\"name\":\"union\",\"namespace\":\"[]\",\"doc\":\"[ ]\",\"size\":0}}", true);
            org.junit.Assert.fail("Expected exception of type org.apache.avro.SchemaParseException; message: Illegal initial character: {null={\"type\":\"fixed\",\"name\":\"union\",\"namespace\":\"[]\",\"doc\":\"[ ]\",\"size\":0}}");
        } catch (org.apache.avro.SchemaParseException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1849() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SchemaM3Random300Test3.test1849");
        org.apache.avro.Schema[] schemaArray0 = new org.apache.avro.Schema[] {};
        java.util.ArrayList<org.apache.avro.Schema> schemaList1 = new java.util.ArrayList<org.apache.avro.Schema>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<org.apache.avro.Schema>) schemaList1, schemaArray0);
        org.apache.avro.Schema schema3 = org.apache.avro.Schema.createUnion((java.util.List<org.apache.avro.Schema>) schemaList1);
        org.apache.avro.Schema[] schemaArray4 = new org.apache.avro.Schema[] {};
        java.util.ArrayList<org.apache.avro.Schema> schemaList5 = new java.util.ArrayList<org.apache.avro.Schema>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<org.apache.avro.Schema>) schemaList5, schemaArray4);
        org.apache.avro.Schema schema7 = org.apache.avro.Schema.createUnion((java.util.List<org.apache.avro.Schema>) schemaList5);
        org.apache.avro.Schema schema8 = org.apache.avro.Schema.applyAliases(schema3, schema7);
        java.lang.String str10 = schema8.getProp("union");
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
        org.junit.Assert.assertNull(str10);
    }

    @Test
    public void test1850() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SchemaM3Random300Test3.test1850");
        org.apache.avro.Schema.Field[] fieldArray0 = new org.apache.avro.Schema.Field[] {};
        java.util.ArrayList<org.apache.avro.Schema.Field> fieldList1 = new java.util.ArrayList<org.apache.avro.Schema.Field>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<org.apache.avro.Schema.Field>) fieldList1, fieldArray0);
        org.apache.avro.Schema schema3 = org.apache.avro.Schema.createRecord((java.util.List<org.apache.avro.Schema.Field>) fieldList1);
        org.apache.avro.Schema schema4 = org.apache.avro.Schema.createRecord((java.util.List<org.apache.avro.Schema.Field>) fieldList1);
        org.apache.avro.Schema schema5 = org.apache.avro.Schema.createRecord((java.util.List<org.apache.avro.Schema.Field>) fieldList1);
        java.util.Set<java.lang.String> strSet6 = schema5.getAliases();
        org.junit.Assert.assertNotNull(fieldArray0);
        org.junit.Assert.assertArrayEquals(fieldArray0, new org.apache.avro.Schema.Field[] {});
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(schema3);
        org.junit.Assert.assertNotNull(schema4);
        org.junit.Assert.assertNotNull(schema5);
        org.junit.Assert.assertNotNull(strSet6);
    }

    @Test
    public void test1851() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SchemaM3Random300Test3.test1851");
        org.apache.avro.Schema.Names names1 = new org.apache.avro.Schema.Names("{\r\n  \"type\" : \"fixed\",\r\n  \"name\" : \"union\",\r\n  \"namespace\" : \"[]\",\r\n  \"doc\" : \"[ ]\",\r\n  \"size\" : 0,\r\n  \"{\\r\\n  \\\"type\\\" : \\\"fixed\\\",\\r\\n  \\\"name\\\" : \\\"union\\\",\\r\\n  \\\"namespace\\\" : \\\"[]\\\",\\r\\n  \\\"doc\\\" : \\\"[ ]\\\",\\r\\n  \\\"size\\\" : 0\\r\\n}\" : \"{\\r\\n  \\\"type\\\" : \\\"map\\\",\\r\\n  \\\"values\\\" : {\\r\\n    \\\"type\\\" : \\\"map\\\",\\r\\n    \\\"values\\\" : [ ]\\r\\n  }\\r\\n}\"\r\n}");
    }

    @Test
    public void test1852() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SchemaM3Random300Test3.test1852");
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
        org.apache.avro.Schema schema18 = parser6.parse("{\r\n  \"type\" : \"map\",\r\n  \"values\" : [ ]\r\n}");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Set<java.lang.String> strSet19 = schema18.getAliases();
            org.junit.Assert.fail("Expected exception of type org.apache.avro.AvroRuntimeException; message: Not a named type: {\"type\":\"map\",\"values\":[]}");
        } catch (org.apache.avro.AvroRuntimeException e) {
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
        org.junit.Assert.assertNotNull(schema18);
    }

    @Test
    public void test1853() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SchemaM3Random300Test3.test1853");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.avro.Schema schema2 = org.apache.avro.Schema.parse("union type:FIXED pos:-1", false);
            org.junit.Assert.fail("Expected exception of type org.apache.avro.SchemaParseException; message: org.codehaus.jackson.JsonParseException: Unexpected character ('u' (code 117)): expected a valid value (number, String, array, object, 'true', 'false' or 'null')? at [Source: java.io.StringReader@61f8b0b3; line: 1, column: 2]");
        } catch (org.apache.avro.SchemaParseException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1854() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SchemaM3Random300Test3.test1854");
        org.apache.avro.Schema.Names names1 = new org.apache.avro.Schema.Names("int type:FIXED pos:-1");
    }

    @Test
    public void test1855() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SchemaM3Random300Test3.test1855");
        org.apache.avro.Schema.Parser parser0 = new org.apache.avro.Schema.Parser();
        java.util.Map<java.lang.String, org.apache.avro.Schema> strMap1 = parser0.getTypes();
        org.apache.avro.Schema.Parser parser2 = new org.apache.avro.Schema.Parser();
        org.apache.avro.Schema.Parser parser4 = parser2.setValidate(true);
        java.util.Map<java.lang.String, org.apache.avro.Schema> strMap5 = parser2.getTypes();
        org.apache.avro.Schema.Parser parser6 = parser0.addTypes(strMap5);
        boolean boolean7 = parser6.getValidate();
        org.apache.avro.Schema.Parser parser9 = parser6.setValidate(true);
        org.apache.avro.Schema.Parser parser11 = parser6.setValidate(true);
        java.util.Map<java.lang.String, org.apache.avro.Schema> strMap12 = parser6.getTypes();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.avro.Schema schema14 = parser6.parse(".map");
            org.junit.Assert.fail("Expected exception of type org.apache.avro.SchemaParseException; message: org.codehaus.jackson.JsonParseException: Unexpected character ('.' (code 46)): expected a valid value (number, String, array, object, 'true', 'false' or 'null')? at [Source: java.io.StringReader@286592f7; line: 1, column: 2]");
        } catch (org.apache.avro.SchemaParseException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strMap1);
        org.junit.Assert.assertNotNull(parser4);
        org.junit.Assert.assertNotNull(strMap5);
        org.junit.Assert.assertNotNull(parser6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(parser9);
        org.junit.Assert.assertNotNull(parser11);
        org.junit.Assert.assertNotNull(strMap12);
    }

    @Test
    public void test1856() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SchemaM3Random300Test3.test1856");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.avro.Schema schema4 = org.apache.avro.Schema.createFixed("{\r\n  \"type\" : \"map\",\r\n  \"values\" : {\r\n    \"type\" : \"record\",\r\n    \"fields\" : [ ]\r\n  }\r\n}", "{\"type\":\"map\",\"values\":{\"type\":\"record\",\"fields\":[]}}", "{\"type\":\"record\",\"fields\":[],\"{\\r\\n  \\\"type\\\" : \\\"map\\\",\\r\\n  \\\"values\\\" : {\\r\\n    \\\"type\\\" : \\\"map\\\",\\r\\n    \\\"values\\\" : [ ]\\r\\n  }\\r\\n}\":\"{}\"}", (int) '4');
            org.junit.Assert.fail("Expected exception of type org.apache.avro.SchemaParseException; message: Illegal initial character: {??  \"type\" : \"map\",??  \"values\" : {??    \"type\" : \"record\",??    \"fields\" : [ ]??  }??}");
        } catch (org.apache.avro.SchemaParseException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1857() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SchemaM3Random300Test3.test1857");
        org.apache.avro.Schema.Type type0 = org.apache.avro.Schema.Type.INT;
        org.apache.avro.Schema schema1 = org.apache.avro.Schema.create(type0);
        org.apache.avro.Schema schema2 = org.apache.avro.Schema.createArray(schema1);
        schema1.addProp("union type:UNION pos:-1", "[ ]");
        org.apache.avro.Schema.Type type6 = schema1.getType();
        org.apache.avro.Schema schema7 = org.apache.avro.Schema.create(type6);
        schema7.addProp("{\r\n  \"type\" : \"map\",\r\n  \"values\" : [ ]\r\n}", "{\r\n  \"type\" : \"fixed\",\r\n  \"name\" : \"union\",\r\n  \"namespace\" : \"[]\",\r\n  \"doc\" : \"[ ]\",\r\n  \"size\" : 0,\r\n  \"{\\r\\n  \\\"type\\\" : \\\"fixed\\\",\\r\\n  \\\"name\\\" : \\\"union\\\",\\r\\n  \\\"namespace\\\" : \\\"[]\\\",\\r\\n  \\\"doc\\\" : \\\"[ ]\\\",\\r\\n  \\\"size\\\" : 0\\r\\n}\" : \"{\\r\\n  \\\"type\\\" : \\\"map\\\",\\r\\n  \\\"values\\\" : {\\r\\n    \\\"type\\\" : \\\"map\\\",\\r\\n    \\\"values\\\" : [ ]\\r\\n  }\\r\\n}\"\r\n}");
        java.lang.String str11 = schema7.getDoc();
        org.junit.Assert.assertTrue("'" + type0 + "' != '" + org.apache.avro.Schema.Type.INT + "'", type0.equals(org.apache.avro.Schema.Type.INT));
        org.junit.Assert.assertNotNull(schema1);
        org.junit.Assert.assertNotNull(schema2);
        org.junit.Assert.assertTrue("'" + type6 + "' != '" + org.apache.avro.Schema.Type.INT + "'", type6.equals(org.apache.avro.Schema.Type.INT));
        org.junit.Assert.assertNotNull(schema7);
        org.junit.Assert.assertNull(str11);
    }

    @Test
    public void test1858() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SchemaM3Random300Test3.test1858");
        org.apache.avro.Schema.Names names1 = new org.apache.avro.Schema.Names("\"int\"");
    }

    @Test
    public void test1859() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SchemaM3Random300Test3.test1859");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.avro.Schema schema4 = org.apache.avro.Schema.createRecord("{\r\n  \"type\" : \"array\",\r\n  \"items\" : \"int\"\r\n}", "union type:FIXED pos:-1", "{}", false);
            org.junit.Assert.fail("Expected exception of type org.apache.avro.SchemaParseException; message: Illegal initial character: {??  \"type\" : \"array\",??  \"items\" : \"int\"??}");
        } catch (org.apache.avro.SchemaParseException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1860() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SchemaM3Random300Test3.test1860");
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
        org.apache.avro.Schema schema16 = org.apache.avro.Schema.createMap(schema15);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.avro.Schema.Field field18 = schema15.getField("{\r\n  \"type\" : \"fixed\",\r\n  \"name\" : \"union\",\r\n  \"namespace\" : \"{}\",\r\n  \"doc\" : \"hi!\",\r\n  \"size\" : 1\r\n}");
            org.junit.Assert.fail("Expected exception of type org.apache.avro.AvroRuntimeException; message: Not a record: {\"type\":\"array\",\"items\":{\"type\":\"map\",\"values\":[]}}");
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
        org.junit.Assert.assertNotNull(schema16);
    }

    @Test
    public void test1861() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SchemaM3Random300Test3.test1861");
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
        boolean boolean19 = parser18.getValidate();
        org.apache.avro.Schema schema21 = parser18.parse("{\"type\":\"array\",\"items\":\"null\"}");
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
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertNotNull(schema21);
    }

    @Test
    public void test1862() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SchemaM3Random300Test3.test1862");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.avro.Schema schema2 = org.apache.avro.Schema.parse("union type:MAP pos:-1", true);
            org.junit.Assert.fail("Expected exception of type org.apache.avro.SchemaParseException; message: org.codehaus.jackson.JsonParseException: Unexpected character ('u' (code 117)): expected a valid value (number, String, array, object, 'true', 'false' or 'null')? at [Source: java.io.StringReader@f18349a; line: 1, column: 2]");
        } catch (org.apache.avro.SchemaParseException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1863() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SchemaM3Random300Test3.test1863");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.avro.Schema.LockableArrayList<org.apache.avro.Schema.LockableArrayList<java.lang.String>> strListList1 = new org.apache.avro.Schema.LockableArrayList<org.apache.avro.Schema.LockableArrayList<java.lang.String>>((int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal Capacity: -1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1864() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SchemaM3Random300Test3.test1864");
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
        schema12.addProp("{\r\n  \"type\" : \"record\",\r\n  \"fields\" : [ ],\r\n  \"{\\\"type\\\":\\\"array\\\",\\\"items\\\":[],\\\"union type:UNION pos:-1\\\":\\\"\\\"}\" : \"{null={\\\"type\\\":\\\"map\\\",\\\"values\\\":[]}}\"\r\n}", "[ ]");
        // The following exception was thrown during execution in test generation
        try {
            int int17 = schema12.getEnumOrdinal("{\"type\":\"map\",\"values\":[],\"\\\"double\\\"\":\"{\\\"type\\\":\\\"array\\\",\\\"items\\\":\\\"int\\\"}\"}");
            org.junit.Assert.fail("Expected exception of type org.apache.avro.AvroRuntimeException; message: Not an enum: {\"type\":\"array\",\"items\":{\"type\":\"map\",\"values\":[]},\"{\\r\\n  \\\"type\\\" : \\\"record\\\",\\r\\n  \\\"fields\\\" : [ ],\\r\\n  \\\"{\\\\\\\"type\\\\\\\":\\\\\\\"array\\\\\\\",\\\\\\\"items\\\\\\\":[],\\\\\\\"union type:UNION pos:-1\\\\\\\":\\\\\\\"\\\\\\\"}\\\" : \\\"{null={\\\\\\\"type\\\\\\\":\\\\\\\"map\\\\\\\",\\\\\\\"values\\\\\\\":[]}}\\\"\\r\\n}\":\"[ ]\"}");
        } catch (org.apache.avro.AvroRuntimeException e) {
            // Expected exception.
        }
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
    public void test1865() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SchemaM3Random300Test3.test1865");
        org.apache.avro.Schema schema1 = org.apache.avro.Schema.parse("{\r\n  \"type\" : \"array\",\r\n  \"items\" : {\r\n    \"type\" : \"map\",\r\n    \"values\" : [ ]\r\n  }\r\n}");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = schema1.getEnumOrdinal("{\"type\":\"float\",\"{\\r\\n  \\\"type\\\" : \\\"record\\\",\\r\\n  \\\"fields\\\" : [ ]\\r\\n}\":\"{\\r\\n  \\\"type\\\" : \\\"map\\\",\\r\\n  \\\"values\\\" : [ ]\\r\\n}\"}");
            org.junit.Assert.fail("Expected exception of type org.apache.avro.AvroRuntimeException; message: Not an enum: {\"type\":\"array\",\"items\":{\"type\":\"map\",\"values\":[]}}");
        } catch (org.apache.avro.AvroRuntimeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(schema1);
    }

    @Test
    public void test1866() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SchemaM3Random300Test3.test1866");
        org.apache.avro.Schema.LockableArrayList<java.lang.String> strList4 = new org.apache.avro.Schema.LockableArrayList<java.lang.String>((int) '#');
        org.apache.avro.Schema.LockableArrayList<java.lang.String> strList5 = new org.apache.avro.Schema.LockableArrayList<java.lang.String>((java.util.List<java.lang.String>) strList4);
        org.apache.avro.Schema.LockableArrayList<java.lang.String> strList6 = new org.apache.avro.Schema.LockableArrayList<java.lang.String>((java.util.List<java.lang.String>) strList4);
        org.apache.avro.Schema schema7 = org.apache.avro.Schema.createEnum("array", "{\r\n  \"type\" : \"fixed\",\r\n  \"name\" : \"union\",\r\n  \"namespace\" : \"[]\",\r\n  \"doc\" : \"[ ]\",\r\n  \"size\" : 0\r\n}", "{\r\n  \"type\" : \"fixed\",\r\n  \"name\" : \"union\",\r\n  \"namespace\" : \"[]\",\r\n  \"doc\" : \"[ ]\",\r\n  \"size\" : 0\r\n}", (java.util.List<java.lang.String>) strList4);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.avro.Schema.Field field9 = schema7.getField("{\"type\":\"map\",\"values\":{\"type\":\"array\",\"items\":{\"type\":\"map\",\"values\":[]},\"\":\"{\\r\\n  \\\"type\\\" : \\\"record\\\",\\r\\n  \\\"fields\\\" : [ ]\\r\\n}\"}}");
            org.junit.Assert.fail("Expected exception of type org.apache.avro.AvroRuntimeException; message: Not a record: {\"type\":\"enum\",\"name\":\"array\",\"namespace\":\"{\\r\\n  \\\"type\\\" : \\\"fixed\\\",\\r\\n  \\\"name\\\" : \\\"union\\\",\\r\\n  \\\"namespace\\\" : \\\"[]\\\",\\r\\n  \\\"doc\\\" : \\\"[ ]\\\",\\r\\n  \\\"size\\\" : 0\\r\\n}\",\"doc\":\"{\\r\\n  \\\"type\\\" : \\\"fixed\\\",\\r\\n  \\\"name\\\" : \\\"union\\\",\\r\\n  \\\"namespace\\\" : \\\"[]\\\",\\r\\n  \\\"doc\\\" : \\\"[ ]\\\",\\r\\n  \\\"size\\\" : 0\\r\\n}\",\"symbols\":[]}");
        } catch (org.apache.avro.AvroRuntimeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(schema7);
    }

    @Test
    public void test1867() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SchemaM3Random300Test3.test1867");
        org.apache.avro.Schema.LockableArrayList<java.lang.String> strList4 = new org.apache.avro.Schema.LockableArrayList<java.lang.String>((int) (byte) 10);
        org.apache.avro.Schema schema5 = org.apache.avro.Schema.createEnum("[].union", "union type:UNION pos:-1", "union type:UNION pos:-1", (java.util.List<java.lang.String>) strList4);
        java.util.List<java.lang.String> strList6 = schema5.getEnumSymbols();
        org.apache.avro.Schema.Type type7 = schema5.getType();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.avro.Schema schema8 = org.apache.avro.Schema.create(type7);
            org.junit.Assert.fail("Expected exception of type org.apache.avro.AvroRuntimeException; message: Can't create a: ENUM");
        } catch (org.apache.avro.AvroRuntimeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(schema5);
        org.junit.Assert.assertNotNull(strList6);
        org.junit.Assert.assertTrue("'" + type7 + "' != '" + org.apache.avro.Schema.Type.ENUM + "'", type7.equals(org.apache.avro.Schema.Type.ENUM));
    }

    @Test
    public void test1868() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SchemaM3Random300Test3.test1868");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.avro.Schema schema1 = org.apache.avro.Schema.parse("{null=[]}");
            org.junit.Assert.fail("Expected exception of type org.apache.avro.SchemaParseException; message: org.codehaus.jackson.JsonParseException: Unexpected character ('n' (code 110)): was expecting double-quote to start field name? at [Source: java.io.StringReader@cb2c3b8; line: 1, column: 3]");
        } catch (org.apache.avro.SchemaParseException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1869() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SchemaM3Random300Test3.test1869");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.avro.Schema schema4 = org.apache.avro.Schema.createRecord("{\"type\":\"array\",\"items\":{\"type\":\"array\",\"items\":{\"type\":\"map\",\"values\":[]}}}", "union type:FIXED pos:-1", "{null={\"type\":\"map\",\"values\":[]}}", true);
            org.junit.Assert.fail("Expected exception of type org.apache.avro.SchemaParseException; message: Illegal initial character: {\"type\":\"array\",\"items\":{\"type\":\"array\",\"items\":{\"type\":\"map\",\"values\":[]}}}");
        } catch (org.apache.avro.SchemaParseException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1870() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SchemaM3Random300Test3.test1870");
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
            java.util.Set<java.lang.String> strSet19 = schema13.getAliases();
            org.junit.Assert.fail("Expected exception of type org.apache.avro.AvroRuntimeException; message: Not a named type: []");
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
    public void test1871() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SchemaM3Random300Test3.test1871");
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
        java.io.File file19 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.avro.Schema schema20 = parser15.parse(file19);
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
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test1872() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SchemaM3Random300Test3.test1872");
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
        org.apache.avro.Schema.Type type13 = schema11.getType();
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
        org.junit.Assert.assertTrue("'" + type13 + "' != '" + org.apache.avro.Schema.Type.UNION + "'", type13.equals(org.apache.avro.Schema.Type.UNION));
    }

    @Test
    public void test1873() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SchemaM3Random300Test3.test1873");
        org.apache.avro.Schema schema2 = org.apache.avro.Schema.parse("{\"type\":\"fixed\",\"name\":\"union\",\"namespace\":\"[]\",\"doc\":\"{\\r\\n  \\\"type\\\" : \\\"map\\\",\\r\\n  \\\"values\\\" : [ ]\\r\\n}\",\"size\":10}", false);
        org.junit.Assert.assertNotNull(schema2);
    }

    @Test
    public void test1874() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SchemaM3Random300Test3.test1874");
        org.apache.avro.Schema.Type type0 = org.apache.avro.Schema.Type.INT;
        org.apache.avro.Schema schema1 = org.apache.avro.Schema.create(type0);
        org.apache.avro.Schema schema2 = org.apache.avro.Schema.create(type0);
        org.apache.avro.Schema schema3 = org.apache.avro.Schema.create(type0);
        org.apache.avro.Schema schema4 = org.apache.avro.Schema.create(type0);
        org.apache.avro.Schema schema5 = org.apache.avro.Schema.create(type0);
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<java.lang.String> strList6 = schema5.getEnumSymbols();
            org.junit.Assert.fail("Expected exception of type org.apache.avro.AvroRuntimeException; message: Not an enum: \"int\"");
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
    public void test1875() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SchemaM3Random300Test3.test1875");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.avro.Schema schema1 = org.apache.avro.Schema.parse("{\"type\":\"map\",\"values\":{\"type\":\"record\",\"fields\":[]}}");
            org.junit.Assert.fail("Expected exception of type org.apache.avro.SchemaParseException; message: No name in schema: {\"type\":\"record\",\"fields\":[]}");
        } catch (org.apache.avro.SchemaParseException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1876() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SchemaM3Random300Test3.test1876");
        org.apache.avro.Schema.Field[] fieldArray0 = new org.apache.avro.Schema.Field[] {};
        java.util.ArrayList<org.apache.avro.Schema.Field> fieldList1 = new java.util.ArrayList<org.apache.avro.Schema.Field>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<org.apache.avro.Schema.Field>) fieldList1, fieldArray0);
        org.apache.avro.Schema schema3 = org.apache.avro.Schema.createRecord((java.util.List<org.apache.avro.Schema.Field>) fieldList1);
        org.apache.avro.Schema schema4 = org.apache.avro.Schema.createRecord((java.util.List<org.apache.avro.Schema.Field>) fieldList1);
        org.apache.avro.Schema schema5 = org.apache.avro.Schema.createArray(schema4);
        java.lang.String str6 = schema5.getDoc();
        java.lang.String str8 = schema5.getProp("{\"type\":\"record\",\"fields\":[]}");
        // The following exception was thrown during execution in test generation
        try {
            schema5.addAlias("{\"type\":\"fixed\",\"name\":\"union\",\"namespace\":\"[]\",\"doc\":\"union type:UNION pos:-1\",\"size\":100}");
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
    }

    @Test
    public void test1877() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SchemaM3Random300Test3.test1877");
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
        org.apache.avro.Schema.Field field11 = schema9.getField("double");
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
        org.junit.Assert.assertNull(field11);
    }

    @Test
    public void test1878() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SchemaM3Random300Test3.test1878");
        org.apache.avro.Schema.LockableArrayList<java.lang.String> strList4 = new org.apache.avro.Schema.LockableArrayList<java.lang.String>(10);
        org.apache.avro.Schema.LockableArrayList<java.lang.String> strList5 = new org.apache.avro.Schema.LockableArrayList<java.lang.String>((java.util.List<java.lang.String>) strList4);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.avro.Schema schema6 = org.apache.avro.Schema.createEnum("{\"type\":\"map\",\"values\":[],\"\\\"double\\\"\":\"{\\\"type\\\":\\\"array\\\",\\\"items\\\":\\\"int\\\"}\"}", "{null={\"type\":\"fixed\",\"name\":\"union\",\"namespace\":\"[]\",\"doc\":\"[ ]\",\"size\":0}}", "", (java.util.List<java.lang.String>) strList4);
            org.junit.Assert.fail("Expected exception of type org.apache.avro.SchemaParseException; message: Illegal initial character: {\"type\":\"map\",\"values\":[],\"\\\"double\\\"\":\"{\\\"type\\\":\\\"array\\\",\\\"items\\\":\\\"int\\\"}\"}");
        } catch (org.apache.avro.SchemaParseException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1879() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SchemaM3Random300Test3.test1879");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.avro.Schema schema4 = org.apache.avro.Schema.createFixed("{\"type\":\"map\",\"values\":[]}", "{\"type\":\"fixed\",\"name\":\"union\",\"namespace\":\"[]\",\"doc\":\"{\\r\\n  \\\"type\\\" : \\\"map\\\",\\r\\n  \\\"values\\\" : [ ]\\r\\n}\",\"size\":10}", "{\r\n  \"type\" : \"record\",\r\n  \"fields\" : [ ]\r\n}", (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type org.apache.avro.SchemaParseException; message: Illegal initial character: {\"type\":\"map\",\"values\":[]}");
        } catch (org.apache.avro.SchemaParseException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1880() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SchemaM3Random300Test3.test1880");
        org.apache.avro.Schema.Parser parser0 = new org.apache.avro.Schema.Parser();
        java.util.Map<java.lang.String, org.apache.avro.Schema> strMap1 = parser0.getTypes();
        org.apache.avro.Schema.Parser parser2 = new org.apache.avro.Schema.Parser();
        org.apache.avro.Schema.Parser parser4 = parser2.setValidate(true);
        java.util.Map<java.lang.String, org.apache.avro.Schema> strMap5 = parser2.getTypes();
        org.apache.avro.Schema.Parser parser6 = parser0.addTypes(strMap5);
        java.util.Map<java.lang.String, org.apache.avro.Schema> strMap7 = parser6.getTypes();
        java.io.File file8 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.avro.Schema schema9 = parser6.parse(file8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strMap1);
        org.junit.Assert.assertNotNull(parser4);
        org.junit.Assert.assertNotNull(strMap5);
        org.junit.Assert.assertNotNull(parser6);
        org.junit.Assert.assertNotNull(strMap7);
    }

    @Test
    public void test1881() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SchemaM3Random300Test3.test1881");
        org.apache.avro.Schema.LockableArrayList<org.apache.avro.Schema.Field> fieldList1 = new org.apache.avro.Schema.LockableArrayList<org.apache.avro.Schema.Field>((int) (byte) 100);
        org.apache.avro.Schema schema2 = org.apache.avro.Schema.createRecord((java.util.List<org.apache.avro.Schema.Field>) fieldList1);
        org.apache.avro.Schema schema3 = org.apache.avro.Schema.createRecord((java.util.List<org.apache.avro.Schema.Field>) fieldList1);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.avro.Schema schema4 = schema3.getValueType();
            org.junit.Assert.fail("Expected exception of type org.apache.avro.AvroRuntimeException; message: Not a map: {\"type\":\"record\",\"fields\":[]}");
        } catch (org.apache.avro.AvroRuntimeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(schema2);
        org.junit.Assert.assertNotNull(schema3);
    }

    @Test
    public void test1882() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SchemaM3Random300Test3.test1882");
        org.apache.avro.Schema schema2 = org.apache.avro.Schema.parse("{\r\n  \"type\" : \"array\",\r\n  \"items\" : \"int\"\r\n}", true);
        org.junit.Assert.assertNotNull(schema2);
    }

    @Test
    public void test1883() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SchemaM3Random300Test3.test1883");
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
        java.lang.String str18 = schema12.getFullName();
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
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "map" + "'", str18, "map");
    }

    @Test
    public void test1884() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SchemaM3Random300Test3.test1884");
        org.apache.avro.Schema[] schemaArray0 = new org.apache.avro.Schema[] {};
        java.util.ArrayList<org.apache.avro.Schema> schemaList1 = new java.util.ArrayList<org.apache.avro.Schema>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<org.apache.avro.Schema>) schemaList1, schemaArray0);
        org.apache.avro.Schema schema3 = org.apache.avro.Schema.createUnion((java.util.List<org.apache.avro.Schema>) schemaList1);
        java.util.List<org.apache.avro.Schema> schemaList4 = schema3.getTypes();
        java.lang.String str5 = schema3.getName();
        java.util.List<org.apache.avro.Schema> schemaList6 = schema3.getTypes();
        org.apache.avro.Schema schema7 = org.apache.avro.Schema.createUnion(schemaList6);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean9 = schema7.hasEnumSymbol("{\"type\":\"array\",\"items\":[],\"union type:UNION pos:-1\":\"\"}");
            org.junit.Assert.fail("Expected exception of type org.apache.avro.AvroRuntimeException; message: Not an enum: []");
        } catch (org.apache.avro.AvroRuntimeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(schemaArray0);
        org.junit.Assert.assertArrayEquals(schemaArray0, new org.apache.avro.Schema[] {});
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(schema3);
        org.junit.Assert.assertNotNull(schemaList4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "union" + "'", str5, "union");
        org.junit.Assert.assertNotNull(schemaList6);
        org.junit.Assert.assertNotNull(schema7);
    }

    @Test
    public void test1885() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SchemaM3Random300Test3.test1885");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.avro.Schema schema4 = org.apache.avro.Schema.createFixed("{\"type\":\"double\",\"float\":\"{\\\"type\\\":\\\"array\\\",\\\"items\\\":[]}\"}", "{\"type\":\"double\",\"float\":\"{\\\"type\\\":\\\"array\\\",\\\"items\\\":[]}\"}", "", 100);
            org.junit.Assert.fail("Expected exception of type org.apache.avro.SchemaParseException; message: Illegal initial character: {\"type\":\"double\",\"float\":\"{\\\"type\\\":\\\"array\\\",\\\"items\\\":[]}\"}");
        } catch (org.apache.avro.SchemaParseException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1886() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SchemaM3Random300Test3.test1886");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.avro.Schema schema2 = org.apache.avro.Schema.parse("union type:UNION pos:-1.union", false);
            org.junit.Assert.fail("Expected exception of type org.apache.avro.SchemaParseException; message: org.codehaus.jackson.JsonParseException: Unexpected character ('u' (code 117)): expected a valid value (number, String, array, object, 'true', 'false' or 'null')? at [Source: java.io.StringReader@35dc2722; line: 1, column: 2]");
        } catch (org.apache.avro.SchemaParseException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1887() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SchemaM3Random300Test3.test1887");
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
            schema15.addAlias("{\r\n  \"type\" : \"record\",\r\n  \"fields\" : [ ],\r\n  \"{\\r\\n  \\\"type\\\" : \\\"fixed\\\",\\r\\n  \\\"name\\\" : \\\"union\\\",\\r\\n  \\\"namespace\\\" : \\\"[]\\\",\\r\\n  \\\"doc\\\" : \\\"[ ]\\\",\\r\\n  \\\"size\\\" : 0\\r\\n}\" : \"[ ]\"\r\n}");
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
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "union" + "'", str14, "union");
        org.junit.Assert.assertNotNull(schema15);
    }

    @Test
    public void test1888() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SchemaM3Random300Test3.test1888");
        org.apache.avro.Schema.Parser parser0 = new org.apache.avro.Schema.Parser();
        java.util.Map<java.lang.String, org.apache.avro.Schema> strMap1 = parser0.getTypes();
        java.util.Map<java.lang.String, org.apache.avro.Schema> strMap2 = parser0.getTypes();
        boolean boolean3 = parser0.getValidate();
        org.apache.avro.Schema.Parser parser5 = parser0.setValidate(true);
        org.apache.avro.Schema schema7 = parser0.parse("{\"type\":\"map\",\"values\":[]}");
        org.apache.avro.Schema.Parser parser8 = new org.apache.avro.Schema.Parser();
        java.util.Map<java.lang.String, org.apache.avro.Schema> strMap9 = parser8.getTypes();
        java.util.Map<java.lang.String, org.apache.avro.Schema> strMap10 = parser8.getTypes();
        org.apache.avro.Schema.Parser parser11 = new org.apache.avro.Schema.Parser();
        org.apache.avro.Schema.Parser parser13 = parser11.setValidate(true);
        java.util.Map<java.lang.String, org.apache.avro.Schema> strMap14 = parser11.getTypes();
        org.apache.avro.Schema.Parser parser15 = parser8.addTypes(strMap14);
        org.apache.avro.Schema schema17 = parser15.parse("{\"type\":\"map\",\"values\":[]}");
        org.apache.avro.Schema.Parser parser19 = parser15.setValidate(false);
        org.apache.avro.Schema.Parser parser20 = new org.apache.avro.Schema.Parser();
        org.apache.avro.Schema.Parser parser22 = parser20.setValidate(true);
        java.util.Map<java.lang.String, org.apache.avro.Schema> strMap23 = parser20.getTypes();
        org.apache.avro.Schema.Parser parser25 = parser20.setValidate(true);
        org.apache.avro.Schema.Parser parser27 = parser20.setValidate(true);
        java.util.Map<java.lang.String, org.apache.avro.Schema> strMap28 = parser20.getTypes();
        org.apache.avro.Schema.Parser parser30 = parser20.setValidate(false);
        org.apache.avro.Schema.Parser parser32 = parser30.setValidate(true);
        java.util.Map<java.lang.String, org.apache.avro.Schema> strMap33 = parser30.getTypes();
        org.apache.avro.Schema.Parser parser34 = parser15.addTypes(strMap33);
        org.apache.avro.Schema.Parser parser35 = parser0.addTypes(strMap33);
        boolean boolean36 = parser0.getValidate();
        org.junit.Assert.assertNotNull(strMap1);
        org.junit.Assert.assertNotNull(strMap2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(parser5);
        org.junit.Assert.assertNotNull(schema7);
        org.junit.Assert.assertNotNull(strMap9);
        org.junit.Assert.assertNotNull(strMap10);
        org.junit.Assert.assertNotNull(parser13);
        org.junit.Assert.assertNotNull(strMap14);
        org.junit.Assert.assertNotNull(parser15);
        org.junit.Assert.assertNotNull(schema17);
        org.junit.Assert.assertNotNull(parser19);
        org.junit.Assert.assertNotNull(parser22);
        org.junit.Assert.assertNotNull(strMap23);
        org.junit.Assert.assertNotNull(parser25);
        org.junit.Assert.assertNotNull(parser27);
        org.junit.Assert.assertNotNull(strMap28);
        org.junit.Assert.assertNotNull(parser30);
        org.junit.Assert.assertNotNull(parser32);
        org.junit.Assert.assertNotNull(strMap33);
        org.junit.Assert.assertNotNull(parser34);
        org.junit.Assert.assertNotNull(parser35);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
    }

    @Test
    public void test1889() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SchemaM3Random300Test3.test1889");
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
        org.apache.avro.Schema schema12 = schema11.getValueType();
        org.apache.avro.Schema schema13 = org.apache.avro.Schema.createArray(schema12);
        org.codehaus.jackson.JsonNode jsonNode15 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.avro.Schema.Field field16 = new org.apache.avro.Schema.Field("{\"type\":\"map\",\"values\":{\"type\":\"enum\",\"name\":\"union\",\"namespace\":\"double\",\"doc\":\"union\",\"symbols\":[]}}", schema13, "{\r\n  \"type\" : \"fixed\",\r\n  \"name\" : \"union\",\r\n  \"namespace\" : \"union type:UNION pos:-1\",\r\n  \"doc\" : \"\",\r\n  \"size\" : 10\r\n}", jsonNode15);
            org.junit.Assert.fail("Expected exception of type org.apache.avro.SchemaParseException; message: Illegal initial character: {\"type\":\"map\",\"values\":{\"type\":\"enum\",\"name\":\"union\",\"namespace\":\"double\",\"doc\":\"union\",\"symbols\":[]}}");
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
        org.junit.Assert.assertNotNull(schema12);
        org.junit.Assert.assertNotNull(schema13);
    }

    @Test
    public void test1890() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SchemaM3Random300Test3.test1890");
        org.apache.avro.Schema.LockableArrayList<java.lang.String> strList4 = new org.apache.avro.Schema.LockableArrayList<java.lang.String>(100);
        org.apache.avro.Schema schema5 = org.apache.avro.Schema.createEnum("array", "{\"type\":\"map\",\"values\":{\"type\":\"array\",\"items\":{\"type\":\"map\",\"values\":[]},\"\":\"{\\r\\n  \\\"type\\\" : \\\"record\\\",\\r\\n  \\\"fields\\\" : [ ]\\r\\n}\"}}", "{\r\n  \"type\" : \"array\",\r\n  \"items\" : {\r\n    \"type\" : \"map\",\r\n    \"values\" : [ ]\r\n  }\r\n}", (java.util.List<java.lang.String>) strList4);
        org.apache.avro.Schema.LockableArrayList<java.lang.String> strList6 = new org.apache.avro.Schema.LockableArrayList<java.lang.String>((java.util.List<java.lang.String>) strList4);
        org.apache.avro.Schema.LockableArrayList<java.lang.String> strList7 = new org.apache.avro.Schema.LockableArrayList<java.lang.String>((java.util.List<java.lang.String>) strList4);
        org.junit.Assert.assertNotNull(schema5);
    }

    @Test
    public void test1891() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SchemaM3Random300Test3.test1891");
        org.apache.avro.Schema schema1 = org.apache.avro.Schema.parse("{\"type\":\"array\",\"items\":{\"type\":\"array\",\"items\":{\"type\":\"map\",\"values\":[]}}}");
        org.apache.avro.Schema schema2 = org.apache.avro.Schema.createMap(schema1);
        org.apache.avro.Schema schema3 = schema2.getValueType();
        org.junit.Assert.assertNotNull(schema1);
        org.junit.Assert.assertNotNull(schema2);
        org.junit.Assert.assertNotNull(schema3);
    }

    @Test
    public void test1892() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SchemaM3Random300Test3.test1892");
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
        org.apache.avro.Schema schema26 = parser15.parse("{\"type\":\"fixed\",\"name\":\"union\",\"namespace\":\"[]\",\"doc\":\"[ ]\",\"size\":0}");
        org.apache.avro.Schema.Parser parser28 = parser15.setValidate(false);
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
        org.junit.Assert.assertNotNull(schema26);
        org.junit.Assert.assertNotNull(parser28);
    }

    @Test
    public void test1893() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SchemaM3Random300Test3.test1893");
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
        java.lang.String str14 = schema11.getDoc();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Set<java.lang.String> strSet15 = schema11.getAliases();
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
        org.junit.Assert.assertNull(str14);
    }

    @Test
    public void test1894() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SchemaM3Random300Test3.test1894");
        org.apache.avro.Schema schema1 = org.apache.avro.Schema.parse("{\r\n  \"type\" : \"map\",\r\n  \"values\" : {\r\n    \"type\" : \"fixed\",\r\n    \"name\" : \"union\",\r\n    \"namespace\" : \"[]\",\r\n    \"doc\" : \"[ ]\",\r\n    \"size\" : 0\r\n  }\r\n}");
        org.apache.avro.Schema schema3 = org.apache.avro.Schema.parse("{\"type\":\"array\",\"items\":{\"type\":\"array\",\"items\":{\"type\":\"map\",\"values\":[]}}}");
        org.apache.avro.Schema schema4 = org.apache.avro.Schema.applyAliases(schema1, schema3);
        // The following exception was thrown during execution in test generation
        try {
            java.util.Set<java.lang.String> strSet5 = schema1.getAliases();
            org.junit.Assert.fail("Expected exception of type org.apache.avro.AvroRuntimeException; message: Not a named type: {\"type\":\"map\",\"values\":{\"type\":\"fixed\",\"name\":\"union\",\"namespace\":\"[]\",\"doc\":\"[ ]\",\"size\":0}}");
        } catch (org.apache.avro.AvroRuntimeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(schema1);
        org.junit.Assert.assertNotNull(schema3);
        org.junit.Assert.assertNotNull(schema4);
    }

    @Test
    public void test1895() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SchemaM3Random300Test3.test1895");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.avro.Schema schema1 = org.apache.avro.Schema.parse("{null={\"type\":\"fixed\",\"name\":\"union\",\"namespace\":\"[]\",\"doc\":\"[ ]\",\"size\":0}}");
            org.junit.Assert.fail("Expected exception of type org.apache.avro.SchemaParseException; message: org.codehaus.jackson.JsonParseException: Unexpected character ('n' (code 110)): was expecting double-quote to start field name? at [Source: java.io.StringReader@5ea6e213; line: 1, column: 3]");
        } catch (org.apache.avro.SchemaParseException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1896() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SchemaM3Random300Test3.test1896");
        org.apache.avro.Schema.Type type0 = org.apache.avro.Schema.Type.INT;
        org.apache.avro.Schema schema1 = org.apache.avro.Schema.create(type0);
        org.apache.avro.Schema schema2 = org.apache.avro.Schema.create(type0);
        org.apache.avro.Schema schema3 = org.apache.avro.Schema.createMap(schema2);
        // The following exception was thrown during execution in test generation
        try {
            schema2.addAlias("\"double\"");
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
    public void test1897() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SchemaM3Random300Test3.test1897");
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
        java.util.Map<java.lang.String, org.apache.avro.Schema> strMap18 = parser0.getTypes();
        java.util.Map<java.lang.String, org.apache.avro.Schema> strMap19 = parser0.getTypes();
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
        org.junit.Assert.assertNotNull(strMap18);
        org.junit.Assert.assertNotNull(strMap19);
    }

    @Test
    public void test1898() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SchemaM3Random300Test3.test1898");
        org.codehaus.jackson.JsonNode jsonNode1 = org.apache.avro.Schema.parseJson("{\"type\":\"array\",\"items\":\"int\"}");
        org.apache.avro.Schema.Names names3 = new org.apache.avro.Schema.Names("{}");
        boolean boolean4 = names3.isEmpty();
        java.lang.Object obj5 = names3.clone();
        org.apache.avro.Schema schema6 = org.apache.avro.Schema.parse(jsonNode1, names3);
        java.lang.String str7 = schema6.getName();
        java.lang.String str8 = schema6.getName();
        org.junit.Assert.assertNotNull(jsonNode1);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(obj5);
        org.junit.Assert.assertEquals(obj5.toString(), "{}");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj5), "{}");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj5), "{}");
        org.junit.Assert.assertNotNull(schema6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "array" + "'", str7, "array");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "array" + "'", str8, "array");
    }

    @Test
    public void test1899() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SchemaM3Random300Test3.test1899");
        org.apache.avro.Schema.Names names1 = new org.apache.avro.Schema.Names("{\"type\":\"fixed\",\"name\":\"union\",\"namespace\":\"[]\",\"doc\":\"{\\r\\n  \\\"type\\\" : \\\"map\\\",\\r\\n  \\\"values\\\" : [ ]\\r\\n}\",\"size\":10}");
        int int2 = names1.size();
        java.lang.String str3 = names1.space();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "{\"type\":\"fixed\",\"name\":\"union\",\"namespace\":\"[]\",\"doc\":\"{\\r\\n  \\\"type\\\" : \\\"map\\\",\\r\\n  \\\"values\\\" : [ ]\\r\\n}\",\"size\":10}" + "'", str3, "{\"type\":\"fixed\",\"name\":\"union\",\"namespace\":\"[]\",\"doc\":\"{\\r\\n  \\\"type\\\" : \\\"map\\\",\\r\\n  \\\"values\\\" : [ ]\\r\\n}\",\"size\":10}");
    }

    @Test
    public void test1900() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SchemaM3Random300Test3.test1900");
        org.apache.avro.Schema.Parser parser0 = new org.apache.avro.Schema.Parser();
        org.apache.avro.Schema.Parser parser2 = parser0.setValidate(true);
        java.util.Map<java.lang.String, org.apache.avro.Schema> strMap3 = parser0.getTypes();
        org.apache.avro.Schema schema5 = parser0.parse("{\"type\":\"array\",\"items\":{\"type\":\"map\",\"values\":[]}}");
        java.lang.String str6 = schema5.getDoc();
        org.junit.Assert.assertNotNull(parser2);
        org.junit.Assert.assertNotNull(strMap3);
        org.junit.Assert.assertNotNull(schema5);
        org.junit.Assert.assertNull(str6);
    }

    @Test
    public void test1901() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SchemaM3Random300Test3.test1901");
        org.apache.avro.Schema schema4 = org.apache.avro.Schema.createFixed("double", "", "{null={\"type\":\"map\",\"values\":[]}}", 100);
        schema4.addProp("{\"type\":\"fixed\",\"name\":\"union\",\"namespace\":\"[]\",\"doc\":\"union type:UNION pos:-1\",\"size\":100}", "{\"type\":\"array\",\"items\":\"int\"}");
        org.junit.Assert.assertNotNull(schema4);
    }

    @Test
    public void test1902() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SchemaM3Random300Test3.test1902");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.avro.Schema schema2 = org.apache.avro.Schema.parse("union type:UNION pos:-1.union", true);
            org.junit.Assert.fail("Expected exception of type org.apache.avro.SchemaParseException; message: org.codehaus.jackson.JsonParseException: Unexpected character ('u' (code 117)): expected a valid value (number, String, array, object, 'true', 'false' or 'null')? at [Source: java.io.StringReader@7d3484c; line: 1, column: 2]");
        } catch (org.apache.avro.SchemaParseException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1903() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SchemaM3Random300Test3.test1903");
        org.apache.avro.Schema.LockableArrayList<java.lang.String> strList4 = new org.apache.avro.Schema.LockableArrayList<java.lang.String>((int) (byte) 10);
        org.apache.avro.Schema schema5 = org.apache.avro.Schema.createEnum("[].union", "union type:UNION pos:-1", "union type:UNION pos:-1", (java.util.List<java.lang.String>) strList4);
        org.apache.avro.Schema schema6 = org.apache.avro.Schema.createArray(schema5);
        org.apache.avro.Schema schema7 = org.apache.avro.Schema.createArray(schema5);
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<org.apache.avro.Schema.Field> fieldList8 = schema7.getFields();
            org.junit.Assert.fail("Expected exception of type org.apache.avro.AvroRuntimeException; message: Not a record: {\"type\":\"array\",\"items\":{\"type\":\"enum\",\"name\":\"union\",\"namespace\":\"[]\",\"doc\":\"union type:UNION pos:-1\",\"symbols\":[]}}");
        } catch (org.apache.avro.AvroRuntimeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(schema5);
        org.junit.Assert.assertNotNull(schema6);
        org.junit.Assert.assertNotNull(schema7);
    }

    @Test
    public void test1904() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SchemaM3Random300Test3.test1904");
        org.apache.avro.Schema.Names names1 = new org.apache.avro.Schema.Names("{\"type\":\"map\",\"values\":{\"type\":\"enum\",\"name\":\"union\",\"namespace\":\"[]\",\"doc\":\"{}\",\"symbols\":[]}}");
    }

    @Test
    public void test1905() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SchemaM3Random300Test3.test1905");
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
        org.apache.avro.Schema.Parser parser19 = parser17.setValidate(false);
        org.apache.avro.Schema.Parser parser21 = parser17.setValidate(true);
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
        org.junit.Assert.assertNotNull(parser19);
        org.junit.Assert.assertNotNull(parser21);
    }

    @Test
    public void test1906() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SchemaM3Random300Test3.test1906");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.avro.Schema schema4 = org.apache.avro.Schema.createRecord("[ ]", "{\"type\":\"fixed\",\"name\":\"map\",\"namespace\":\"double\",\"doc\":\"\",\"size\":100}", "{\r\n  \"type\" : \"map\",\r\n  \"values\" : {\r\n    \"type\" : \"array\",\r\n    \"items\" : {\r\n      \"type\" : \"map\",\r\n      \"values\" : [ ]\r\n    },\r\n    \"\" : \"{\\r\\n  \\\"type\\\" : \\\"record\\\",\\r\\n  \\\"fields\\\" : [ ]\\r\\n}\"\r\n  }\r\n}", true);
            org.junit.Assert.fail("Expected exception of type org.apache.avro.SchemaParseException; message: Illegal initial character: [ ]");
        } catch (org.apache.avro.SchemaParseException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1907() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SchemaM3Random300Test3.test1907");
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
        java.lang.String str21 = schema15.getFullName();
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
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "array" + "'", str21, "array");
    }

    @Test
    public void test1908() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SchemaM3Random300Test3.test1908");
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
            org.apache.avro.Schema schema33 = org.apache.avro.Schema.createEnum("{\"type\":\"int\",\"union type:UNION pos:-1\":\"[ ]\"}", "{\"type\":\"array\",\"items\":[],\"{}\":\"hi!\"}", "{null={\"type\":\"fixed\",\"name\":\"union\",\"namespace\":\"[]\",\"doc\":\"[ ]\",\"size\":0}}", (java.util.List<java.lang.String>) strList30);
            org.junit.Assert.fail("Expected exception of type org.apache.avro.SchemaParseException; message: Illegal initial character: {\"type\":\"int\",\"union type:UNION pos:-1\":\"[ ]\"}");
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
    public void test1909() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SchemaM3Random300Test3.test1909");
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
        java.util.Map<java.lang.String, org.apache.avro.Schema> strMap21 = parser17.getTypes();
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
        org.junit.Assert.assertNotNull(strMap21);
    }

    @Test
    public void test1910() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SchemaM3Random300Test3.test1910");
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
        java.io.File file13 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.avro.Schema schema14 = parser10.parse(file13);
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
    public void test1911() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SchemaM3Random300Test3.test1911");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.avro.Schema schema2 = org.apache.avro.Schema.parse("float type:ARRAY pos:-1", false);
            org.junit.Assert.fail("Expected exception of type org.apache.avro.SchemaParseException; message: org.codehaus.jackson.JsonParseException: Unrecognized token 'float': was expecting 'null', 'true' or 'false'? at [Source: java.io.StringReader@63727fa4; line: 1, column: 6]");
        } catch (org.apache.avro.SchemaParseException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1912() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SchemaM3Random300Test3.test1912");
        org.apache.avro.Schema.LockableArrayList<java.util.Collection<java.lang.String>> strCollectionList1 = new org.apache.avro.Schema.LockableArrayList<java.util.Collection<java.lang.String>>((int) 'a');
        org.apache.avro.Schema.LockableArrayList<java.util.Collection<java.lang.String>> strCollectionList2 = new org.apache.avro.Schema.LockableArrayList<java.util.Collection<java.lang.String>>((java.util.List<java.util.Collection<java.lang.String>>) strCollectionList1);
    }

    @Test
    public void test1913() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SchemaM3Random300Test3.test1913");
        org.apache.avro.Schema.Names names1 = new org.apache.avro.Schema.Names("{\"type\":\"array\",\"items\":\"int\"}");
    }

    @Test
    public void test1914() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SchemaM3Random300Test3.test1914");
        org.apache.avro.Schema schema2 = org.apache.avro.Schema.parse("{\"type\":\"fixed\",\"name\":\"map\",\"namespace\":\"double\",\"doc\":\"\",\"size\":100}", false);
        org.junit.Assert.assertNotNull(schema2);
    }

    @Test
    public void test1915() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SchemaM3Random300Test3.test1915");
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
    public void test1916() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SchemaM3Random300Test3.test1916");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.avro.Schema schema4 = org.apache.avro.Schema.createRecord("{\"type\":\"fixed\",\"name\":\"union\",\"namespace\":\"[]\",\"doc\":\"union type:UNION pos:-1\",\"size\":100}", "{\"type\":\"record\",\"fields\":[],\"{\\r\\n  \\\"type\\\" : \\\"fixed\\\",\\r\\n  \\\"name\\\" : \\\"union\\\",\\r\\n  \\\"namespace\\\" : \\\"[]\\\",\\r\\n  \\\"doc\\\" : \\\"[ ]\\\",\\r\\n  \\\"size\\\" : 0\\r\\n}\":\"[ ]\"}", "{\r\n  \"type\" : \"fixed\",\r\n  \"name\" : \"union\",\r\n  \"namespace\" : \"[]\",\r\n  \"doc\" : \"[ ]\",\r\n  \"size\" : 0\r\n}", false);
            org.junit.Assert.fail("Expected exception of type org.apache.avro.SchemaParseException; message: Illegal initial character: {\"type\":\"fixed\",\"name\":\"union\",\"namespace\":\"[]\",\"doc\":\"union type:UNION pos:-1\",\"size\":100}");
        } catch (org.apache.avro.SchemaParseException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1917() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SchemaM3Random300Test3.test1917");
        org.apache.avro.Schema.LockableArrayList<org.apache.avro.Schema.Names> namesList1 = new org.apache.avro.Schema.LockableArrayList<org.apache.avro.Schema.Names>(10);
        org.apache.avro.Schema.LockableArrayList<org.apache.avro.Schema.Names> namesList2 = new org.apache.avro.Schema.LockableArrayList<org.apache.avro.Schema.Names>((java.util.List<org.apache.avro.Schema.Names>) namesList1);
    }

    @Test
    public void test1918() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SchemaM3Random300Test3.test1918");
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
            java.util.List<java.lang.String> strList21 = schema16.getEnumSymbols();
            org.junit.Assert.fail("Expected exception of type org.apache.avro.AvroRuntimeException; message: Not an enum: []");
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
    public void test1919() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SchemaM3Random300Test3.test1919");
        org.apache.avro.Schema.Parser parser0 = new org.apache.avro.Schema.Parser();
        org.apache.avro.Schema.Parser parser2 = parser0.setValidate(true);
        org.apache.avro.Schema.Parser parser4 = parser0.setValidate(true);
        org.apache.avro.Schema.Parser parser6 = parser0.setValidate(true);
        org.apache.avro.Schema.Parser parser8 = parser0.setValidate(false);
        boolean boolean9 = parser0.getValidate();
        java.util.Map<java.lang.String, org.apache.avro.Schema> strMap10 = parser0.getTypes();
        org.apache.avro.Schema.Parser parser12 = parser0.setValidate(true);
        org.junit.Assert.assertNotNull(parser2);
        org.junit.Assert.assertNotNull(parser4);
        org.junit.Assert.assertNotNull(parser6);
        org.junit.Assert.assertNotNull(parser8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(strMap10);
        org.junit.Assert.assertNotNull(parser12);
    }

    @Test
    public void test1920() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SchemaM3Random300Test3.test1920");
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
        java.io.File file46 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.avro.Schema schema47 = parser45.parse(file46);
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
    }

    @Test
    public void test1921() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SchemaM3Random300Test3.test1921");
        org.apache.avro.Schema schema4 = org.apache.avro.Schema.createFixed("union", "", "union type:UNION pos:-1", 10);
        int int5 = schema4.getFixedSize();
        java.lang.String str6 = schema4.getName();
        org.junit.Assert.assertNotNull(schema4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 10 + "'", int5 == 10);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "union" + "'", str6, "union");
    }

    @Test
    public void test1922() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SchemaM3Random300Test3.test1922");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.avro.Schema schema2 = org.apache.avro.Schema.parse("{\"type\":\"map\",\"values\":{\"type\":\"record\",\"fields\":[]}}", false);
            org.junit.Assert.fail("Expected exception of type org.apache.avro.SchemaParseException; message: No name in schema: {\"type\":\"record\",\"fields\":[]}");
        } catch (org.apache.avro.SchemaParseException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1923() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SchemaM3Random300Test3.test1923");
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
        java.lang.String str23 = schema22.toString();
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
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "[]" + "'", str23, "[]");
    }

    @Test
    public void test1924() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SchemaM3Random300Test3.test1924");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.avro.Schema schema4 = org.apache.avro.Schema.createFixed("union type:FIXED pos:-1", "union type:UNION pos:-1.union", "int", 100);
            org.junit.Assert.fail("Expected exception of type org.apache.avro.SchemaParseException; message: Illegal character in: union type:FIXED pos:-1");
        } catch (org.apache.avro.SchemaParseException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1925() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SchemaM3Random300Test3.test1925");
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
            java.util.List<java.lang.String> strList25 = schema20.getEnumSymbols();
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
    public void test1926() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SchemaM3Random300Test3.test1926");
        org.apache.avro.Schema.Parser parser0 = new org.apache.avro.Schema.Parser();
        java.util.Map<java.lang.String, org.apache.avro.Schema> strMap1 = parser0.getTypes();
        java.util.Map<java.lang.String, org.apache.avro.Schema> strMap2 = parser0.getTypes();
        org.apache.avro.Schema.Parser parser3 = new org.apache.avro.Schema.Parser();
        org.apache.avro.Schema.Parser parser5 = parser3.setValidate(true);
        java.util.Map<java.lang.String, org.apache.avro.Schema> strMap6 = parser3.getTypes();
        org.apache.avro.Schema.Parser parser7 = parser0.addTypes(strMap6);
        java.util.Map<java.lang.String, org.apache.avro.Schema> strMap8 = parser0.getTypes();
        org.apache.avro.Schema.Parser parser10 = parser0.setValidate(false);
        org.apache.avro.Schema.Parser parser11 = new org.apache.avro.Schema.Parser();
        java.util.Map<java.lang.String, org.apache.avro.Schema> strMap12 = parser11.getTypes();
        org.apache.avro.Schema.Parser parser13 = new org.apache.avro.Schema.Parser();
        org.apache.avro.Schema.Parser parser15 = parser13.setValidate(true);
        java.util.Map<java.lang.String, org.apache.avro.Schema> strMap16 = parser13.getTypes();
        org.apache.avro.Schema.Parser parser17 = parser11.addTypes(strMap16);
        boolean boolean18 = parser11.getValidate();
        boolean boolean19 = parser11.getValidate();
        org.apache.avro.Schema.Parser parser20 = new org.apache.avro.Schema.Parser();
        java.util.Map<java.lang.String, org.apache.avro.Schema> strMap21 = parser20.getTypes();
        java.util.Map<java.lang.String, org.apache.avro.Schema> strMap22 = parser20.getTypes();
        org.apache.avro.Schema.Parser parser23 = new org.apache.avro.Schema.Parser();
        java.util.Map<java.lang.String, org.apache.avro.Schema> strMap24 = parser23.getTypes();
        org.apache.avro.Schema.Parser parser25 = parser20.addTypes(strMap24);
        org.apache.avro.Schema.Parser parser26 = parser11.addTypes(strMap24);
        org.apache.avro.Schema.Parser parser27 = parser0.addTypes(strMap24);
        org.apache.avro.Schema schema29 = parser0.parse("{\r\n  \"type\" : \"map\",\r\n  \"values\" : {\r\n    \"type\" : \"enum\",\r\n    \"name\" : \"union\",\r\n    \"namespace\" : \"[]\",\r\n    \"doc\" : \"{}\",\r\n    \"symbols\" : [ ]\r\n  }\r\n}");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str30 = schema29.getNamespace();
            org.junit.Assert.fail("Expected exception of type org.apache.avro.AvroRuntimeException; message: Not a named type: {\"type\":\"map\",\"values\":{\"type\":\"enum\",\"name\":\"union\",\"namespace\":\"[]\",\"doc\":\"{}\",\"symbols\":[]}}");
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
        org.junit.Assert.assertNotNull(strMap12);
        org.junit.Assert.assertNotNull(parser15);
        org.junit.Assert.assertNotNull(strMap16);
        org.junit.Assert.assertNotNull(parser17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertNotNull(strMap21);
        org.junit.Assert.assertNotNull(strMap22);
        org.junit.Assert.assertNotNull(strMap24);
        org.junit.Assert.assertNotNull(parser25);
        org.junit.Assert.assertNotNull(parser26);
        org.junit.Assert.assertNotNull(parser27);
        org.junit.Assert.assertNotNull(schema29);
    }

    @Test
    public void test1927() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SchemaM3Random300Test3.test1927");
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
        // The following exception was thrown during execution in test generation
        try {
            org.apache.avro.Schema.Field field23 = schema16.getField("{\"type\":\"fixed\",\"name\":\"union\",\"namespace\":\"[]\",\"doc\":\"union type:UNION pos:-1\",\"size\":100}");
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
        org.junit.Assert.assertNotNull(schema21);
    }

    @Test
    public void test1928() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SchemaM3Random300Test3.test1928");
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
        org.apache.avro.Schema.Parser parser17 = parser7.setValidate(false);
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
        org.junit.Assert.assertNotNull(parser17);
    }

    @Test
    public void test1929() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SchemaM3Random300Test3.test1929");
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
        // The following exception was thrown during execution in test generation
        try {
            org.apache.avro.Schema.Field field28 = schema21.getField("{}");
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
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "{\"type\":\"array\",\"items\":{\"type\":\"map\",\"values\":[]}}" + "'", str25, "{\"type\":\"array\",\"items\":{\"type\":\"map\",\"values\":[]}}");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "array" + "'", str26, "array");
    }

    @Test
    public void test1930() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SchemaM3Random300Test3.test1930");
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
            boolean boolean13 = schema11.hasEnumSymbol("union type:MAP pos:-1");
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
    public void test1931() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SchemaM3Random300Test3.test1931");
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
        java.lang.String str25 = schema8.getProp("\"int\"");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean26 = schema8.isError();
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
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "[]" + "'", str23, "[]");
        org.junit.Assert.assertNull(str25);
    }

    @Test
    public void test1932() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SchemaM3Random300Test3.test1932");
        org.apache.avro.Schema.Parser parser0 = new org.apache.avro.Schema.Parser();
        org.apache.avro.Schema.Parser parser2 = parser0.setValidate(true);
        java.util.Map<java.lang.String, org.apache.avro.Schema> strMap3 = parser0.getTypes();
        org.apache.avro.Schema.Parser parser5 = parser0.setValidate(true);
        org.apache.avro.Schema.Parser parser7 = parser0.setValidate(true);
        java.util.Map<java.lang.String, org.apache.avro.Schema> strMap8 = parser0.getTypes();
        org.apache.avro.Schema.Parser parser10 = parser0.setValidate(false);
        org.apache.avro.Schema.Parser parser12 = parser10.setValidate(true);
        org.apache.avro.Schema.Parser parser14 = parser10.setValidate(false);
        org.apache.avro.Schema.Parser parser15 = new org.apache.avro.Schema.Parser();
        java.util.Map<java.lang.String, org.apache.avro.Schema> strMap16 = parser15.getTypes();
        org.apache.avro.Schema.Parser parser17 = new org.apache.avro.Schema.Parser();
        org.apache.avro.Schema.Parser parser19 = parser17.setValidate(true);
        java.util.Map<java.lang.String, org.apache.avro.Schema> strMap20 = parser17.getTypes();
        org.apache.avro.Schema.Parser parser21 = parser15.addTypes(strMap20);
        boolean boolean22 = parser15.getValidate();
        boolean boolean23 = parser15.getValidate();
        java.util.Map<java.lang.String, org.apache.avro.Schema> strMap24 = parser15.getTypes();
        org.apache.avro.Schema.Parser parser25 = parser14.addTypes(strMap24);
        org.apache.avro.Schema schema27 = parser14.parse("{\"type\":\"float\",\"{\\r\\n  \\\"type\\\" : \\\"record\\\",\\r\\n  \\\"fields\\\" : [ ]\\r\\n}\":\"{\\r\\n  \\\"type\\\" : \\\"map\\\",\\r\\n  \\\"values\\\" : [ ]\\r\\n}\"}");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.avro.Schema schema29 = parser14.parse("float type:ARRAY pos:-1");
            org.junit.Assert.fail("Expected exception of type org.apache.avro.SchemaParseException; message: org.codehaus.jackson.JsonParseException: Unrecognized token 'float': was expecting 'null', 'true' or 'false'? at [Source: java.io.StringReader@49142921; line: 1, column: 6]");
        } catch (org.apache.avro.SchemaParseException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(parser2);
        org.junit.Assert.assertNotNull(strMap3);
        org.junit.Assert.assertNotNull(parser5);
        org.junit.Assert.assertNotNull(parser7);
        org.junit.Assert.assertNotNull(strMap8);
        org.junit.Assert.assertNotNull(parser10);
        org.junit.Assert.assertNotNull(parser12);
        org.junit.Assert.assertNotNull(parser14);
        org.junit.Assert.assertNotNull(strMap16);
        org.junit.Assert.assertNotNull(parser19);
        org.junit.Assert.assertNotNull(strMap20);
        org.junit.Assert.assertNotNull(parser21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertNotNull(strMap24);
        org.junit.Assert.assertNotNull(parser25);
        org.junit.Assert.assertNotNull(schema27);
    }

    @Test
    public void test1933() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SchemaM3Random300Test3.test1933");
        org.apache.avro.Schema.LockableArrayList<java.lang.String> strList1 = new org.apache.avro.Schema.LockableArrayList<java.lang.String>((int) '#');
        org.apache.avro.Schema.LockableArrayList<java.lang.String> strList2 = new org.apache.avro.Schema.LockableArrayList<java.lang.String>((java.util.List<java.lang.String>) strList1);
        org.apache.avro.Schema.LockableArrayList<java.lang.String> strList3 = new org.apache.avro.Schema.LockableArrayList<java.lang.String>((java.util.List<java.lang.String>) strList2);
        org.apache.avro.Schema.LockableArrayList<java.lang.String> strList4 = new org.apache.avro.Schema.LockableArrayList<java.lang.String>((java.util.List<java.lang.String>) strList3);
        org.apache.avro.Schema.LockableArrayList<java.lang.String> strList5 = new org.apache.avro.Schema.LockableArrayList<java.lang.String>((java.util.List<java.lang.String>) strList3);
    }

    @Test
    public void test1934() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SchemaM3Random300Test3.test1934");
        org.apache.avro.Schema.Type type0 = org.apache.avro.Schema.Type.BOOLEAN;
        org.apache.avro.Schema schema1 = org.apache.avro.Schema.create(type0);
        schema1.addProp("{\"type\":\"record\",\"fields\":[],\"{\\r\\n  \\\"type\\\" : \\\"fixed\\\",\\r\\n  \\\"name\\\" : \\\"union\\\",\\r\\n  \\\"namespace\\\" : \\\"[]\\\",\\r\\n  \\\"doc\\\" : \\\"[ ]\\\",\\r\\n  \\\"size\\\" : 0\\r\\n}\":\"[ ]\"}", "{\"type\":\"map\",\"values\":[]}");
        org.junit.Assert.assertTrue("'" + type0 + "' != '" + org.apache.avro.Schema.Type.BOOLEAN + "'", type0.equals(org.apache.avro.Schema.Type.BOOLEAN));
        org.junit.Assert.assertNotNull(schema1);
    }

    @Test
    public void test1935() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SchemaM3Random300Test3.test1935");
        org.apache.avro.Schema.Names names1 = new org.apache.avro.Schema.Names("union");
        org.apache.avro.Schema[] schemaArray2 = new org.apache.avro.Schema[] {};
        java.util.ArrayList<org.apache.avro.Schema> schemaList3 = new java.util.ArrayList<org.apache.avro.Schema>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<org.apache.avro.Schema>) schemaList3, schemaArray2);
        org.apache.avro.Schema schema5 = org.apache.avro.Schema.createUnion((java.util.List<org.apache.avro.Schema>) schemaList3);
        java.lang.String str6 = schema5.getFullName();
        boolean boolean7 = names1.equals((java.lang.Object) schema5);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.avro.Schema schema8 = schema5.getElementType();
            org.junit.Assert.fail("Expected exception of type org.apache.avro.AvroRuntimeException; message: Not an array: []");
        } catch (org.apache.avro.AvroRuntimeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(schemaArray2);
        org.junit.Assert.assertArrayEquals(schemaArray2, new org.apache.avro.Schema[] {});
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(schema5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "union" + "'", str6, "union");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test1936() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SchemaM3Random300Test3.test1936");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.avro.Schema schema4 = org.apache.avro.Schema.createFixed("{\"type\":\"map\",\"values\":[],\"\\\"double\\\"\":\"{\\\"type\\\":\\\"array\\\",\\\"items\\\":\\\"int\\\"}\"}", "{\"type\":\"fixed\",\"name\":\"union\",\"namespace\":\"[]\",\"doc\":\"[ ]\",\"size\":0}", "{\r\n  \"type\" : \"record\",\r\n  \"fields\" : [ ]\r\n}", (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type org.apache.avro.SchemaParseException; message: Illegal initial character: {\"type\":\"map\",\"values\":[],\"\\\"double\\\"\":\"{\\\"type\\\":\\\"array\\\",\\\"items\\\":\\\"int\\\"}\"}");
        } catch (org.apache.avro.SchemaParseException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1937() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SchemaM3Random300Test3.test1937");
        org.apache.avro.Schema.Parser parser0 = new org.apache.avro.Schema.Parser();
        org.apache.avro.Schema.Parser parser2 = parser0.setValidate(true);
        java.util.Map<java.lang.String, org.apache.avro.Schema> strMap3 = parser0.getTypes();
        java.util.Map<java.lang.String, org.apache.avro.Schema> strMap4 = parser0.getTypes();
        org.apache.avro.Schema schema6 = parser0.parse("{\"type\":\"map\",\"values\":[]}");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.avro.Schema.Field field8 = schema6.getField("{\r\n  \"type\" : \"record\",\r\n  \"fields\" : [ ]\r\n}");
            org.junit.Assert.fail("Expected exception of type org.apache.avro.AvroRuntimeException; message: Not a record: {\"type\":\"map\",\"values\":[]}");
        } catch (org.apache.avro.AvroRuntimeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(parser2);
        org.junit.Assert.assertNotNull(strMap3);
        org.junit.Assert.assertNotNull(strMap4);
        org.junit.Assert.assertNotNull(schema6);
    }

    @Test
    public void test1938() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SchemaM3Random300Test3.test1938");
        org.apache.avro.Schema.LockableArrayList<java.util.AbstractList<java.lang.String>> strListList0 = new org.apache.avro.Schema.LockableArrayList<java.util.AbstractList<java.lang.String>>();
        org.apache.avro.Schema.LockableArrayList<java.util.AbstractList<java.lang.String>> strListList1 = new org.apache.avro.Schema.LockableArrayList<java.util.AbstractList<java.lang.String>>((java.util.List<java.util.AbstractList<java.lang.String>>) strListList0);
    }

    @Test
    public void test1939() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SchemaM3Random300Test3.test1939");
        org.apache.avro.Schema schema2 = org.apache.avro.Schema.parse("\"double\"", true);
        // The following exception was thrown during execution in test generation
        try {
            java.util.Set<java.lang.String> strSet3 = schema2.getAliases();
            org.junit.Assert.fail("Expected exception of type org.apache.avro.AvroRuntimeException; message: Not a named type: \"double\"");
        } catch (org.apache.avro.AvroRuntimeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(schema2);
    }

    @Test
    public void test1940() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SchemaM3Random300Test3.test1940");
        org.apache.avro.Schema[] schemaArray3 = new org.apache.avro.Schema[] {};
        java.util.ArrayList<org.apache.avro.Schema> schemaList4 = new java.util.ArrayList<org.apache.avro.Schema>();
        boolean boolean5 = java.util.Collections.addAll((java.util.Collection<org.apache.avro.Schema>) schemaList4, schemaArray3);
        org.apache.avro.Schema schema6 = org.apache.avro.Schema.createUnion((java.util.List<org.apache.avro.Schema>) schemaList4);
        org.apache.avro.Schema[] schemaArray7 = new org.apache.avro.Schema[] {};
        java.util.ArrayList<org.apache.avro.Schema> schemaList8 = new java.util.ArrayList<org.apache.avro.Schema>();
        boolean boolean9 = java.util.Collections.addAll((java.util.Collection<org.apache.avro.Schema>) schemaList8, schemaArray7);
        org.apache.avro.Schema schema10 = org.apache.avro.Schema.createUnion((java.util.List<org.apache.avro.Schema>) schemaList8);
        org.apache.avro.Schema schema11 = org.apache.avro.Schema.applyAliases(schema6, schema10);
        org.apache.avro.Schema.Type type12 = schema10.getType();
        org.apache.avro.Schema schema13 = org.apache.avro.Schema.createMap(schema10);
        org.apache.avro.Schema.LockableArrayList<java.lang.String> strList15 = new org.apache.avro.Schema.LockableArrayList<java.lang.String>((int) (short) 10);
        org.apache.avro.Schema.LockableArrayList<java.lang.String> strList16 = new org.apache.avro.Schema.LockableArrayList<java.lang.String>((java.util.List<java.lang.String>) strList15);
        boolean boolean17 = schema13.equals((java.lang.Object) strList16);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.avro.Schema schema18 = org.apache.avro.Schema.createEnum("", "{\"type\":\"map\",\"values\":{\"type\":\"array\",\"items\":{\"type\":\"map\",\"values\":[]},\"\":\"{\\r\\n  \\\"type\\\" : \\\"record\\\",\\r\\n  \\\"fields\\\" : [ ]\\r\\n}\"}}", "{\r\n  \"type\" : \"map\",\r\n  \"values\" : [ ]\r\n}", (java.util.List<java.lang.String>) strList16);
            org.junit.Assert.fail("Expected exception of type org.apache.avro.SchemaParseException; message: Empty name");
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
        org.junit.Assert.assertTrue("'" + type12 + "' != '" + org.apache.avro.Schema.Type.UNION + "'", type12.equals(org.apache.avro.Schema.Type.UNION));
        org.junit.Assert.assertNotNull(schema13);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test1941() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SchemaM3Random300Test3.test1941");
        org.codehaus.jackson.JsonNode jsonNode1 = org.apache.avro.Schema.parseJson("{\"type\":\"map\",\"values\":{\"type\":\"array\",\"items\":{\"type\":\"map\",\"values\":[]},\"\":\"{\\r\\n  \\\"type\\\" : \\\"record\\\",\\r\\n  \\\"fields\\\" : [ ]\\r\\n}\"}}");
        org.apache.avro.Schema.Names names2 = null;
        org.apache.avro.Schema schema3 = org.apache.avro.Schema.parse(jsonNode1, names2);
        org.junit.Assert.assertNotNull(jsonNode1);
        org.junit.Assert.assertNotNull(schema3);
    }

    @Test
    public void test1942() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SchemaM3Random300Test3.test1942");
        org.apache.avro.Schema schema1 = org.apache.avro.Schema.parse("{\"type\":\"int\",\"union type:UNION pos:-1\":\"[ ]\"}");
        org.apache.avro.Schema schema2 = org.apache.avro.Schema.createArray(schema1);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str3 = schema1.getNamespace();
            org.junit.Assert.fail("Expected exception of type org.apache.avro.AvroRuntimeException; message: Not a named type: {\"type\":\"int\",\"union type:UNION pos:-1\":\"[ ]\"}");
        } catch (org.apache.avro.AvroRuntimeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(schema1);
        org.junit.Assert.assertNotNull(schema2);
    }

    @Test
    public void test1943() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SchemaM3Random300Test3.test1943");
        org.apache.avro.Schema schema4 = org.apache.avro.Schema.createRecord("{}.union", "{\"type\":\"array\",\"items\":{\"type\":\"map\",\"values\":[]},\"union type:MAP pos:-1\":\"{\\\"type\\\":\\\"array\\\",\\\"items\\\":{\\\"type\\\":\\\"map\\\",\\\"values\\\":[]}}\"}", "\"null\"", false);
        org.junit.Assert.assertNotNull(schema4);
    }

    @Test
    public void test1944() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SchemaM3Random300Test3.test1944");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.avro.Schema schema4 = org.apache.avro.Schema.createFixed("{\"type\":\"float\",\"{\\r\\n  \\\"type\\\" : \\\"record\\\",\\r\\n  \\\"fields\\\" : [ ]\\r\\n}\":\"{\\r\\n  \\\"type\\\" : \\\"map\\\",\\r\\n  \\\"values\\\" : [ ]\\r\\n}\"}", "{\"type\":\"array\",\"items\":{\"type\":\"map\",\"values\":[]},\"union type:MAP pos:-1\":\"{\\\"type\\\":\\\"array\\\",\\\"items\\\":{\\\"type\\\":\\\"map\\\",\\\"values\\\":[]}}\"}", "", (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type org.apache.avro.SchemaParseException; message: Illegal initial character: {\"type\":\"float\",\"{\\r\\n  \\\"type\\\" : \\\"record\\\",\\r\\n  \\\"fields\\\" : [ ]\\r\\n}\":\"{\\r\\n  \\\"type\\\" : \\\"map\\\",\\r\\n  \\\"values\\\" : [ ]\\r\\n}\"}");
        } catch (org.apache.avro.SchemaParseException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1945() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SchemaM3Random300Test3.test1945");
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
        java.io.InputStream inputStream14 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.avro.Schema schema15 = parser12.parse(inputStream14);
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
    }

    @Test
    public void test1946() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SchemaM3Random300Test3.test1946");
        org.apache.avro.Schema.Field[] fieldArray0 = new org.apache.avro.Schema.Field[] {};
        java.util.ArrayList<org.apache.avro.Schema.Field> fieldList1 = new java.util.ArrayList<org.apache.avro.Schema.Field>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<org.apache.avro.Schema.Field>) fieldList1, fieldArray0);
        org.apache.avro.Schema schema3 = org.apache.avro.Schema.createRecord((java.util.List<org.apache.avro.Schema.Field>) fieldList1);
        boolean boolean4 = schema3.isError();
        org.apache.avro.Schema schema5 = org.apache.avro.Schema.createArray(schema3);
        java.lang.String str6 = schema3.getName();
        org.apache.avro.Schema.Type type7 = schema3.getType();
        org.junit.Assert.assertNotNull(fieldArray0);
        org.junit.Assert.assertArrayEquals(fieldArray0, new org.apache.avro.Schema.Field[] {});
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(schema3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(schema5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + type7 + "' != '" + org.apache.avro.Schema.Type.RECORD + "'", type7.equals(org.apache.avro.Schema.Type.RECORD));
    }

    @Test
    public void test1947() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SchemaM3Random300Test3.test1947");
        org.apache.avro.Schema.Names names1 = new org.apache.avro.Schema.Names("float type:ARRAY pos:-1");
    }

    @Test
    public void test1948() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SchemaM3Random300Test3.test1948");
        org.apache.avro.Schema.Names names1 = new org.apache.avro.Schema.Names("{\"type\":\"map\",\"values\":{\"type\":\"array\",\"items\":{\"type\":\"map\",\"values\":[]}}}");
        java.lang.String str2 = names1.toString();
        java.util.Collection<org.apache.avro.Schema> schemaCollection3 = names1.values();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "{}" + "'", str2, "{}");
        org.junit.Assert.assertNotNull(schemaCollection3);
    }

    @Test
    public void test1949() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SchemaM3Random300Test3.test1949");
        org.apache.avro.Schema.Parser parser0 = new org.apache.avro.Schema.Parser();
        org.apache.avro.Schema.Parser parser2 = parser0.setValidate(true);
        org.apache.avro.Schema.Parser parser4 = parser0.setValidate(false);
        org.apache.avro.Schema.Parser parser6 = parser0.setValidate(true);
        java.util.Map<java.lang.String, org.apache.avro.Schema> strMap7 = parser0.getTypes();
        org.junit.Assert.assertNotNull(parser2);
        org.junit.Assert.assertNotNull(parser4);
        org.junit.Assert.assertNotNull(parser6);
        org.junit.Assert.assertNotNull(strMap7);
    }

    @Test
    public void test1950() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SchemaM3Random300Test3.test1950");
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
        org.apache.avro.Schema schema11 = org.apache.avro.Schema.createArray(schema10);
        org.apache.avro.Schema.Type type12 = schema10.getType();
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
        org.junit.Assert.assertNotNull(schema11);
        org.junit.Assert.assertTrue("'" + type12 + "' != '" + org.apache.avro.Schema.Type.ARRAY + "'", type12.equals(org.apache.avro.Schema.Type.ARRAY));
    }

    @Test
    public void test1951() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SchemaM3Random300Test3.test1951");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.avro.Schema schema4 = org.apache.avro.Schema.createRecord("\"int\"", "{\"type\":\"float\",\"{\\r\\n  \\\"type\\\" : \\\"record\\\",\\r\\n  \\\"fields\\\" : [ ]\\r\\n}\":\"{\\r\\n  \\\"type\\\" : \\\"map\\\",\\r\\n  \\\"values\\\" : [ ]\\r\\n}\"}", "", false);
            org.junit.Assert.fail("Expected exception of type org.apache.avro.SchemaParseException; message: Illegal initial character: \"int\"");
        } catch (org.apache.avro.SchemaParseException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1952() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SchemaM3Random300Test3.test1952");
        org.apache.avro.Schema.LockableArrayList<org.codehaus.jackson.Versioned> versionedList1 = new org.apache.avro.Schema.LockableArrayList<org.codehaus.jackson.Versioned>(0);
    }

    @Test
    public void test1953() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SchemaM3Random300Test3.test1953");
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
        java.lang.String str19 = schema18.toString();
        java.lang.String str21 = schema18.toString(false);
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
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "{\"type\":\"fixed\",\"name\":\"union\",\"namespace\":\"{}\",\"doc\":\"hi!\",\"size\":1}" + "'", str19, "{\"type\":\"fixed\",\"name\":\"union\",\"namespace\":\"{}\",\"doc\":\"hi!\",\"size\":1}");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "{\"type\":\"fixed\",\"name\":\"union\",\"namespace\":\"{}\",\"doc\":\"hi!\",\"size\":1}" + "'", str21, "{\"type\":\"fixed\",\"name\":\"union\",\"namespace\":\"{}\",\"doc\":\"hi!\",\"size\":1}");
    }

    @Test
    public void test1954() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SchemaM3Random300Test3.test1954");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.avro.Schema schema2 = org.apache.avro.Schema.parse("{}.union", true);
            org.junit.Assert.fail("Expected exception of type org.apache.avro.SchemaParseException; message: No type: {}");
        } catch (org.apache.avro.SchemaParseException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1955() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SchemaM3Random300Test3.test1955");
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
        org.apache.avro.Schema.Parser parser25 = parser23.setValidate(true);
        org.apache.avro.Schema.Parser parser27 = parser23.setValidate(true);
        org.apache.avro.Schema.Parser parser29 = parser23.setValidate(true);
        org.apache.avro.Schema.Parser parser31 = parser23.setValidate(true);
        java.util.Map<java.lang.String, org.apache.avro.Schema> strMap32 = parser31.getTypes();
        java.util.Map<java.lang.String, org.apache.avro.Schema> strMap33 = parser31.getTypes();
        org.apache.avro.Schema.Parser parser34 = parser7.addTypes(strMap33);
        org.apache.avro.Schema.Parser parser36 = parser7.setValidate(false);
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
        org.junit.Assert.assertNotNull(parser25);
        org.junit.Assert.assertNotNull(parser27);
        org.junit.Assert.assertNotNull(parser29);
        org.junit.Assert.assertNotNull(parser31);
        org.junit.Assert.assertNotNull(strMap32);
        org.junit.Assert.assertNotNull(strMap33);
        org.junit.Assert.assertNotNull(parser34);
        org.junit.Assert.assertNotNull(parser36);
    }

    @Test
    public void test1956() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SchemaM3Random300Test3.test1956");
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
            schema31.addAlias("{\"type\":\"fixed\",\"name\":\"map\",\"namespace\":\"double\",\"doc\":\"\",\"size\":100}");
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
    public void test1957() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SchemaM3Random300Test3.test1957");
        org.apache.avro.Schema.LockableArrayList<java.lang.String> strList1 = new org.apache.avro.Schema.LockableArrayList<java.lang.String>((int) ' ');
        org.apache.avro.Schema.LockableArrayList<java.lang.String> strList2 = new org.apache.avro.Schema.LockableArrayList<java.lang.String>((java.util.List<java.lang.String>) strList1);
    }

    @Test
    public void test1958() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SchemaM3Random300Test3.test1958");
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
        org.apache.avro.Schema.Parser parser18 = parser16.setValidate(false);
        org.apache.avro.Schema.Parser parser19 = new org.apache.avro.Schema.Parser();
        java.util.Map<java.lang.String, org.apache.avro.Schema> strMap20 = parser19.getTypes();
        org.apache.avro.Schema.Parser parser21 = new org.apache.avro.Schema.Parser();
        org.apache.avro.Schema.Parser parser23 = parser21.setValidate(true);
        java.util.Map<java.lang.String, org.apache.avro.Schema> strMap24 = parser21.getTypes();
        org.apache.avro.Schema.Parser parser25 = parser19.addTypes(strMap24);
        org.apache.avro.Schema.Parser parser26 = parser16.addTypes(strMap24);
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
    public void test1959() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SchemaM3Random300Test3.test1959");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.avro.Schema schema2 = org.apache.avro.Schema.parse("float type:ARRAY pos:-1", true);
            org.junit.Assert.fail("Expected exception of type org.apache.avro.SchemaParseException; message: org.codehaus.jackson.JsonParseException: Unrecognized token 'float': was expecting 'null', 'true' or 'false'? at [Source: java.io.StringReader@723a64d6; line: 1, column: 6]");
        } catch (org.apache.avro.SchemaParseException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1960() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SchemaM3Random300Test3.test1960");
        org.apache.avro.Schema.Parser parser0 = new org.apache.avro.Schema.Parser();
        java.util.Map<java.lang.String, org.apache.avro.Schema> strMap1 = parser0.getTypes();
        java.util.Map<java.lang.String, org.apache.avro.Schema> strMap2 = parser0.getTypes();
        org.apache.avro.Schema.Parser parser3 = new org.apache.avro.Schema.Parser();
        java.util.Map<java.lang.String, org.apache.avro.Schema> strMap4 = parser3.getTypes();
        org.apache.avro.Schema.Parser parser5 = parser0.addTypes(strMap4);
        org.apache.avro.Schema.Parser parser7 = parser0.setValidate(true);
        org.apache.avro.Schema.Parser parser9 = parser0.setValidate(false);
        org.apache.avro.Schema.Parser parser11 = parser9.setValidate(false);
        org.apache.avro.Schema.Parser parser13 = parser9.setValidate(false);
        org.junit.Assert.assertNotNull(strMap1);
        org.junit.Assert.assertNotNull(strMap2);
        org.junit.Assert.assertNotNull(strMap4);
        org.junit.Assert.assertNotNull(parser5);
        org.junit.Assert.assertNotNull(parser7);
        org.junit.Assert.assertNotNull(parser9);
        org.junit.Assert.assertNotNull(parser11);
        org.junit.Assert.assertNotNull(parser13);
    }

    @Test
    public void test1961() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SchemaM3Random300Test3.test1961");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.avro.Schema schema4 = org.apache.avro.Schema.createRecord("{\"type\":\"int\",\"union type:UNION pos:-1\":\"[ ]\"}", "{\r\n  \"type\" : \"fixed\",\r\n  \"name\" : \"union\",\r\n  \"namespace\" : \"{}\",\r\n  \"doc\" : \"hi!\",\r\n  \"size\" : 1\r\n}", "union type:MAP pos:-1", true);
            org.junit.Assert.fail("Expected exception of type org.apache.avro.SchemaParseException; message: Illegal initial character: {\"type\":\"int\",\"union type:UNION pos:-1\":\"[ ]\"}");
        } catch (org.apache.avro.SchemaParseException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1962() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SchemaM3Random300Test3.test1962");
        org.apache.avro.Schema[] schemaArray0 = new org.apache.avro.Schema[] {};
        java.util.ArrayList<org.apache.avro.Schema> schemaList1 = new java.util.ArrayList<org.apache.avro.Schema>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<org.apache.avro.Schema>) schemaList1, schemaArray0);
        org.apache.avro.Schema schema3 = org.apache.avro.Schema.createUnion((java.util.List<org.apache.avro.Schema>) schemaList1);
        // The following exception was thrown during execution in test generation
        try {
            schema3.addAlias("double");
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
    public void test1963() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SchemaM3Random300Test3.test1963");
        org.apache.avro.Schema.LockableArrayList<org.apache.avro.Schema.Names> namesList0 = new org.apache.avro.Schema.LockableArrayList<org.apache.avro.Schema.Names>();
        org.apache.avro.Schema.LockableArrayList<org.apache.avro.Schema.Names> namesList1 = new org.apache.avro.Schema.LockableArrayList<org.apache.avro.Schema.Names>((java.util.List<org.apache.avro.Schema.Names>) namesList0);
    }

    @Test
    public void test1964() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SchemaM3Random300Test3.test1964");
        org.apache.avro.Schema schema2 = org.apache.avro.Schema.parse("{\r\n  \"type\" : \"map\",\r\n  \"values\" : {\r\n    \"type\" : \"map\",\r\n    \"values\" : [ ]\r\n  }\r\n}", true);
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<java.lang.String> strList3 = schema2.getEnumSymbols();
            org.junit.Assert.fail("Expected exception of type org.apache.avro.AvroRuntimeException; message: Not an enum: {\"type\":\"map\",\"values\":{\"type\":\"map\",\"values\":[]}}");
        } catch (org.apache.avro.AvroRuntimeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(schema2);
    }

    @Test
    public void test1965() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SchemaM3Random300Test3.test1965");
        org.apache.avro.Schema.Type type0 = org.apache.avro.Schema.Type.BYTES;
        org.apache.avro.Schema schema1 = org.apache.avro.Schema.create(type0);
        org.apache.avro.Schema.Type type2 = schema1.getType();
        org.apache.avro.Schema schema3 = org.apache.avro.Schema.create(type2);
        org.junit.Assert.assertTrue("'" + type0 + "' != '" + org.apache.avro.Schema.Type.BYTES + "'", type0.equals(org.apache.avro.Schema.Type.BYTES));
        org.junit.Assert.assertNotNull(schema1);
        org.junit.Assert.assertTrue("'" + type2 + "' != '" + org.apache.avro.Schema.Type.BYTES + "'", type2.equals(org.apache.avro.Schema.Type.BYTES));
        org.junit.Assert.assertNotNull(schema3);
    }

    @Test
    public void test1966() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SchemaM3Random300Test3.test1966");
        org.apache.avro.Schema.Names names0 = new org.apache.avro.Schema.Names();
        java.lang.String str1 = names0.space();
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
        java.lang.String str13 = schema10.getProp("{\r\n  \"type\" : \"array\",\r\n  \"items\" : {\r\n    \"type\" : \"map\",\r\n    \"values\" : [ ]\r\n  }\r\n}");
        org.apache.avro.Schema schema14 = org.apache.avro.Schema.createArray(schema10);
        boolean boolean15 = names0.containsKey((java.lang.Object) schema14);
        java.lang.String str16 = schema14.getFullName();
        org.junit.Assert.assertNull(str1);
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
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNotNull(schema14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "array" + "'", str16, "array");
    }

    @Test
    public void test1967() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SchemaM3Random300Test3.test1967");
        org.apache.avro.Schema.Parser parser0 = new org.apache.avro.Schema.Parser();
        java.util.Map<java.lang.String, org.apache.avro.Schema> strMap1 = parser0.getTypes();
        java.util.Map<java.lang.String, org.apache.avro.Schema> strMap2 = parser0.getTypes();
        org.apache.avro.Schema.Parser parser3 = new org.apache.avro.Schema.Parser();
        org.apache.avro.Schema.Parser parser5 = parser3.setValidate(true);
        java.util.Map<java.lang.String, org.apache.avro.Schema> strMap6 = parser3.getTypes();
        org.apache.avro.Schema.Parser parser7 = parser0.addTypes(strMap6);
        java.util.Map<java.lang.String, org.apache.avro.Schema> strMap8 = parser0.getTypes();
        org.apache.avro.Schema.Parser parser10 = parser0.setValidate(false);
        org.apache.avro.Schema.Parser parser11 = new org.apache.avro.Schema.Parser();
        java.util.Map<java.lang.String, org.apache.avro.Schema> strMap12 = parser11.getTypes();
        org.apache.avro.Schema.Parser parser13 = new org.apache.avro.Schema.Parser();
        org.apache.avro.Schema.Parser parser15 = parser13.setValidate(true);
        java.util.Map<java.lang.String, org.apache.avro.Schema> strMap16 = parser13.getTypes();
        org.apache.avro.Schema.Parser parser17 = parser11.addTypes(strMap16);
        boolean boolean18 = parser11.getValidate();
        boolean boolean19 = parser11.getValidate();
        org.apache.avro.Schema.Parser parser20 = new org.apache.avro.Schema.Parser();
        java.util.Map<java.lang.String, org.apache.avro.Schema> strMap21 = parser20.getTypes();
        java.util.Map<java.lang.String, org.apache.avro.Schema> strMap22 = parser20.getTypes();
        org.apache.avro.Schema.Parser parser23 = new org.apache.avro.Schema.Parser();
        java.util.Map<java.lang.String, org.apache.avro.Schema> strMap24 = parser23.getTypes();
        org.apache.avro.Schema.Parser parser25 = parser20.addTypes(strMap24);
        org.apache.avro.Schema.Parser parser26 = parser11.addTypes(strMap24);
        org.apache.avro.Schema.Parser parser27 = parser0.addTypes(strMap24);
        org.apache.avro.Schema schema29 = parser27.parse("[].union");
        // The following exception was thrown during execution in test generation
        try {
            schema29.addAlias("int");
            org.junit.Assert.fail("Expected exception of type org.apache.avro.AvroRuntimeException; message: Not a named type: []");
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
        org.junit.Assert.assertNotNull(strMap12);
        org.junit.Assert.assertNotNull(parser15);
        org.junit.Assert.assertNotNull(strMap16);
        org.junit.Assert.assertNotNull(parser17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertNotNull(strMap21);
        org.junit.Assert.assertNotNull(strMap22);
        org.junit.Assert.assertNotNull(strMap24);
        org.junit.Assert.assertNotNull(parser25);
        org.junit.Assert.assertNotNull(parser26);
        org.junit.Assert.assertNotNull(parser27);
        org.junit.Assert.assertNotNull(schema29);
    }

    @Test
    public void test1968() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SchemaM3Random300Test3.test1968");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.avro.Schema schema4 = org.apache.avro.Schema.createFixed("\"double\"", "{\r\n  \"type\" : \"map\",\r\n  \"values\" : {\r\n    \"type\" : \"map\",\r\n    \"values\" : [ ]\r\n  }\r\n}", "{\"type\":\"array\",\"items\":[]}", (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type org.apache.avro.SchemaParseException; message: Illegal initial character: \"double\"");
        } catch (org.apache.avro.SchemaParseException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1969() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SchemaM3Random300Test3.test1969");
        org.apache.avro.Schema.Field[] fieldArray0 = new org.apache.avro.Schema.Field[] {};
        java.util.ArrayList<org.apache.avro.Schema.Field> fieldList1 = new java.util.ArrayList<org.apache.avro.Schema.Field>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<org.apache.avro.Schema.Field>) fieldList1, fieldArray0);
        org.apache.avro.Schema schema3 = org.apache.avro.Schema.createRecord((java.util.List<org.apache.avro.Schema.Field>) fieldList1);
        org.apache.avro.Schema schema4 = org.apache.avro.Schema.createRecord((java.util.List<org.apache.avro.Schema.Field>) fieldList1);
        org.apache.avro.Schema schema5 = org.apache.avro.Schema.createRecord((java.util.List<org.apache.avro.Schema.Field>) fieldList1);
        org.apache.avro.Schema schema6 = org.apache.avro.Schema.createRecord((java.util.List<org.apache.avro.Schema.Field>) fieldList1);
        java.lang.String str7 = schema6.getNamespace();
        // The following exception was thrown during execution in test generation
        try {
            int int9 = schema6.getEnumOrdinal("{\r\n  \"type\" : \"record\",\r\n  \"fields\" : [ ]\r\n}");
            org.junit.Assert.fail("Expected exception of type org.apache.avro.AvroRuntimeException; message: Not an enum: {\"type\":\"record\",\"fields\":[]}");
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
        org.junit.Assert.assertNull(str7);
    }

    @Test
    public void test1970() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SchemaM3Random300Test3.test1970");
        org.apache.avro.Schema schema1 = org.apache.avro.Schema.parse("{\"type\":\"array\",\"items\":{\"type\":\"map\",\"values\":[]},\"union type:MAP pos:-1\":\"{\\\"type\\\":\\\"array\\\",\\\"items\\\":{\\\"type\\\":\\\"map\\\",\\\"values\\\":[]}}\"}");
        // The following exception was thrown during execution in test generation
        try {
            schema1.addAlias("{\r\n  \"type\" : \"array\",\r\n  \"items\" : [ ],\r\n  \"{}\" : \"hi!\"\r\n}");
            org.junit.Assert.fail("Expected exception of type org.apache.avro.AvroRuntimeException; message: Not a named type: {\"type\":\"array\",\"items\":{\"type\":\"map\",\"values\":[]},\"union type:MAP pos:-1\":\"{\\\"type\\\":\\\"array\\\",\\\"items\\\":{\\\"type\\\":\\\"map\\\",\\\"values\\\":[]}}\"}");
        } catch (org.apache.avro.AvroRuntimeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(schema1);
    }

    @Test
    public void test1971() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SchemaM3Random300Test3.test1971");
        org.apache.avro.Schema schema4 = org.apache.avro.Schema.createFixed("[].union", "union type:UNION pos:-1", "[]", (int) (short) 100);
        java.lang.String str5 = schema4.toString();
        java.lang.String str6 = schema4.toString();
        // The following exception was thrown during execution in test generation
        try {
            schema4.addAlias("{\"type\":\"fixed\",\"name\":\"union\",\"namespace\":\"union type:UNION pos:-1\",\"doc\":\"\",\"size\":10}");
            org.junit.Assert.fail("Expected exception of type org.apache.avro.SchemaParseException; message: Illegal initial character: {\"type\":\"fixed\",\"name\":\"union\",\"namespace\":\"union type:UNION pos:-1\",\"doc\":\"\",\"size\":10}");
        } catch (org.apache.avro.SchemaParseException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(schema4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "{\"type\":\"fixed\",\"name\":\"union\",\"namespace\":\"[]\",\"doc\":\"union type:UNION pos:-1\",\"size\":100}" + "'", str5, "{\"type\":\"fixed\",\"name\":\"union\",\"namespace\":\"[]\",\"doc\":\"union type:UNION pos:-1\",\"size\":100}");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "{\"type\":\"fixed\",\"name\":\"union\",\"namespace\":\"[]\",\"doc\":\"union type:UNION pos:-1\",\"size\":100}" + "'", str6, "{\"type\":\"fixed\",\"name\":\"union\",\"namespace\":\"[]\",\"doc\":\"union type:UNION pos:-1\",\"size\":100}");
    }

    @Test
    public void test1972() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SchemaM3Random300Test3.test1972");
        org.apache.avro.Schema.Parser parser0 = new org.apache.avro.Schema.Parser();
        org.apache.avro.Schema.Parser parser2 = parser0.setValidate(true);
        org.apache.avro.Schema.Parser parser4 = parser0.setValidate(true);
        java.util.Map<java.lang.String, org.apache.avro.Schema> strMap5 = parser4.getTypes();
        org.apache.avro.Schema.Parser parser7 = parser4.setValidate(false);
        java.util.Map<java.lang.String, org.apache.avro.Schema> strMap8 = parser7.getTypes();
        org.apache.avro.Schema.Parser parser10 = parser7.setValidate(true);
        org.junit.Assert.assertNotNull(parser2);
        org.junit.Assert.assertNotNull(parser4);
        org.junit.Assert.assertNotNull(strMap5);
        org.junit.Assert.assertNotNull(parser7);
        org.junit.Assert.assertNotNull(strMap8);
        org.junit.Assert.assertNotNull(parser10);
    }

    @Test
    public void test1973() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SchemaM3Random300Test3.test1973");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.avro.Schema schema4 = org.apache.avro.Schema.createFixed("{\r\n  \"type\" : \"map\",\r\n  \"values\" : [ ]\r\n}", "{null={\"type\":\"record\",\"fields\":[]}}", "{\r\n  \"type\" : \"fixed\",\r\n  \"name\" : \"union\",\r\n  \"namespace\" : \"union type:UNION pos:-1\",\r\n  \"doc\" : \"\",\r\n  \"size\" : 10\r\n}", (-1));
            org.junit.Assert.fail("Expected exception of type org.apache.avro.SchemaParseException; message: Illegal initial character: {??  \"type\" : \"map\",??  \"values\" : [ ]??}");
        } catch (org.apache.avro.SchemaParseException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1974() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SchemaM3Random300Test3.test1974");
        org.apache.avro.Schema[] schemaArray0 = new org.apache.avro.Schema[] {};
        java.util.ArrayList<org.apache.avro.Schema> schemaList1 = new java.util.ArrayList<org.apache.avro.Schema>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<org.apache.avro.Schema>) schemaList1, schemaArray0);
        org.apache.avro.Schema schema3 = org.apache.avro.Schema.createUnion((java.util.List<org.apache.avro.Schema>) schemaList1);
        org.apache.avro.Schema schema4 = org.apache.avro.Schema.createUnion((java.util.List<org.apache.avro.Schema>) schemaList1);
        java.util.List<org.apache.avro.Schema> schemaList5 = schema4.getTypes();
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<org.apache.avro.Schema.Field> fieldList6 = schema4.getFields();
            org.junit.Assert.fail("Expected exception of type org.apache.avro.AvroRuntimeException; message: Not a record: []");
        } catch (org.apache.avro.AvroRuntimeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(schemaArray0);
        org.junit.Assert.assertArrayEquals(schemaArray0, new org.apache.avro.Schema[] {});
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(schema3);
        org.junit.Assert.assertNotNull(schema4);
        org.junit.Assert.assertNotNull(schemaList5);
    }

    @Test
    public void test1975() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SchemaM3Random300Test3.test1975");
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
        org.apache.avro.Schema schema15 = org.apache.avro.Schema.createMap(schema8);
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
        org.junit.Assert.assertNotNull(schema15);
    }

    @Test
    public void test1976() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SchemaM3Random300Test3.test1976");
        org.apache.avro.Schema schema2 = org.apache.avro.Schema.parse("{\"type\":\"float\",\"{\\r\\n  \\\"type\\\" : \\\"record\\\",\\r\\n  \\\"fields\\\" : [ ]\\r\\n}\":\"{\\r\\n  \\\"type\\\" : \\\"map\\\",\\r\\n  \\\"values\\\" : [ ]\\r\\n}\"}", true);
        org.junit.Assert.assertNotNull(schema2);
    }

    @Test
    public void test1977() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SchemaM3Random300Test3.test1977");
        org.apache.avro.Schema.Parser parser0 = new org.apache.avro.Schema.Parser();
        org.apache.avro.Schema.Parser parser2 = parser0.setValidate(true);
        java.util.Map<java.lang.String, org.apache.avro.Schema> strMap3 = parser0.getTypes();
        org.apache.avro.Schema.Parser parser5 = parser0.setValidate(true);
        org.apache.avro.Schema.Parser parser7 = parser5.setValidate(true);
        org.apache.avro.Schema.Parser parser9 = parser7.setValidate(false);
        org.junit.Assert.assertNotNull(parser2);
        org.junit.Assert.assertNotNull(strMap3);
        org.junit.Assert.assertNotNull(parser5);
        org.junit.Assert.assertNotNull(parser7);
        org.junit.Assert.assertNotNull(parser9);
    }

    @Test
    public void test1978() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SchemaM3Random300Test3.test1978");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.avro.Schema schema4 = org.apache.avro.Schema.createFixed("{\"type\":\"array\",\"items\":{\"type\":\"array\",\"items\":{\"type\":\"map\",\"values\":[]}}}", "float", "{\"type\":\"float\",\"{\\r\\n  \\\"type\\\" : \\\"record\\\",\\r\\n  \\\"fields\\\" : [ ]\\r\\n}\":\"{\\r\\n  \\\"type\\\" : \\\"map\\\",\\r\\n  \\\"values\\\" : [ ]\\r\\n}\"}", 100);
            org.junit.Assert.fail("Expected exception of type org.apache.avro.SchemaParseException; message: Illegal initial character: {\"type\":\"array\",\"items\":{\"type\":\"array\",\"items\":{\"type\":\"map\",\"values\":[]}}}");
        } catch (org.apache.avro.SchemaParseException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1979() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SchemaM3Random300Test3.test1979");
        org.apache.avro.Schema.Parser parser0 = new org.apache.avro.Schema.Parser();
        java.util.Map<java.lang.String, org.apache.avro.Schema> strMap1 = parser0.getTypes();
        java.util.Map<java.lang.String, org.apache.avro.Schema> strMap2 = parser0.getTypes();
        org.apache.avro.Schema.Parser parser3 = new org.apache.avro.Schema.Parser();
        java.util.Map<java.lang.String, org.apache.avro.Schema> strMap4 = parser3.getTypes();
        org.apache.avro.Schema.Parser parser5 = parser0.addTypes(strMap4);
        org.apache.avro.Schema.Parser parser7 = parser0.setValidate(true);
        org.apache.avro.Schema.Parser parser9 = parser0.setValidate(false);
        java.util.Map<java.lang.String, org.apache.avro.Schema> strMap10 = parser0.getTypes();
        boolean boolean11 = parser0.getValidate();
        org.apache.avro.Schema.Parser parser13 = parser0.setValidate(false);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.avro.Schema schema15 = parser13.parse("{null={\"type\":\"record\",\"fields\":[]}}");
            org.junit.Assert.fail("Expected exception of type org.apache.avro.SchemaParseException; message: org.codehaus.jackson.JsonParseException: Unexpected character ('n' (code 110)): was expecting double-quote to start field name? at [Source: java.io.StringReader@3bdb6ded; line: 1, column: 3]");
        } catch (org.apache.avro.SchemaParseException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strMap1);
        org.junit.Assert.assertNotNull(strMap2);
        org.junit.Assert.assertNotNull(strMap4);
        org.junit.Assert.assertNotNull(parser5);
        org.junit.Assert.assertNotNull(parser7);
        org.junit.Assert.assertNotNull(parser9);
        org.junit.Assert.assertNotNull(strMap10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(parser13);
    }

    @Test
    public void test1980() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SchemaM3Random300Test3.test1980");
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
        java.lang.String str10 = schema9.getFullName();
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
        org.junit.Assert.assertNull(str10);
    }

    @Test
    public void test1981() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SchemaM3Random300Test3.test1981");
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
        java.lang.String str22 = schema20.getProp("{\"type\":\"map\",\"values\":{\"type\":\"enum\",\"name\":\"union\",\"namespace\":\"[]\",\"doc\":\"{}\",\"symbols\":[]}}");
        org.apache.avro.Schema schema23 = org.apache.avro.Schema.createMap(schema20);
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
        org.junit.Assert.assertNull(str22);
        org.junit.Assert.assertNotNull(schema23);
    }

    @Test
    public void test1982() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SchemaM3Random300Test3.test1982");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.avro.Schema schema4 = org.apache.avro.Schema.createFixed("{null={\"type\":\"map\",\"values\":{\"type\":\"array\",\"items\":{\"type\":\"map\",\"values\":[]}}}}", "float", "{\r\n  \"type\" : \"map\",\r\n  \"values\" : {\r\n    \"type\" : \"array\",\r\n    \"items\" : {\r\n      \"type\" : \"map\",\r\n      \"values\" : [ ]\r\n    },\r\n    \"\" : \"{\\r\\n  \\\"type\\\" : \\\"record\\\",\\r\\n  \\\"fields\\\" : [ ]\\r\\n}\"\r\n  }\r\n}", 1);
            org.junit.Assert.fail("Expected exception of type org.apache.avro.SchemaParseException; message: Illegal initial character: {null={\"type\":\"map\",\"values\":{\"type\":\"array\",\"items\":{\"type\":\"map\",\"values\":[]}}}}");
        } catch (org.apache.avro.SchemaParseException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1983() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SchemaM3Random300Test3.test1983");
        org.apache.avro.Schema schema1 = org.apache.avro.Schema.parse("{\"type\":\"fixed\",\"name\":\"map\",\"namespace\":\"\",\"doc\":\"array\",\"size\":97}");
        org.junit.Assert.assertNotNull(schema1);
    }

    @Test
    public void test1984() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SchemaM3Random300Test3.test1984");
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
            org.apache.avro.Schema.Field field29 = schema25.getField("{\"type\":\"map\",\"values\":[]}");
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
    public void test1985() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SchemaM3Random300Test3.test1985");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.avro.Schema schema4 = org.apache.avro.Schema.createFixed("{\"type\":\"array\",\"items\":{\"type\":\"record\",\"fields\":[]}}", "", "{}.union", (int) 'a');
            org.junit.Assert.fail("Expected exception of type org.apache.avro.SchemaParseException; message: Illegal initial character: {\"type\":\"array\",\"items\":{\"type\":\"record\",\"fields\":[]}}");
        } catch (org.apache.avro.SchemaParseException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1986() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SchemaM3Random300Test3.test1986");
        org.apache.avro.Schema schema4 = org.apache.avro.Schema.createFixed("double.map", "{\"type\":\"map\",\"values\":{\"type\":\"enum\",\"name\":\"union\",\"namespace\":\"[]\",\"doc\":\"{}\",\"symbols\":[]}}", "{\r\n  \"type\" : \"array\",\r\n  \"items\" : [ ],\r\n  \"{}\" : \"hi!\"\r\n}", (int) 'a');
        org.junit.Assert.assertNotNull(schema4);
    }

    @Test
    public void test1987() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SchemaM3Random300Test3.test1987");
        org.apache.avro.Schema.Parser parser0 = new org.apache.avro.Schema.Parser();
        java.util.Map<java.lang.String, org.apache.avro.Schema> strMap1 = parser0.getTypes();
        java.util.Map<java.lang.String, org.apache.avro.Schema> strMap2 = parser0.getTypes();
        org.apache.avro.Schema.Parser parser3 = new org.apache.avro.Schema.Parser();
        java.util.Map<java.lang.String, org.apache.avro.Schema> strMap4 = parser3.getTypes();
        org.apache.avro.Schema.Parser parser5 = parser0.addTypes(strMap4);
        org.apache.avro.Schema schema7 = parser0.parse("{\r\n  \"type\" : \"map\",\r\n  \"values\" : [ ]\r\n}");
        org.apache.avro.Schema schema8 = schema7.getValueType();
        org.apache.avro.Schema schema9 = org.apache.avro.Schema.createMap(schema7);
        org.junit.Assert.assertNotNull(strMap1);
        org.junit.Assert.assertNotNull(strMap2);
        org.junit.Assert.assertNotNull(strMap4);
        org.junit.Assert.assertNotNull(parser5);
        org.junit.Assert.assertNotNull(schema7);
        org.junit.Assert.assertNotNull(schema8);
        org.junit.Assert.assertNotNull(schema9);
    }

    @Test
    public void test1988() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SchemaM3Random300Test3.test1988");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.avro.Schema schema4 = org.apache.avro.Schema.createRecord("{\"type\":\"map\",\"values\":{\"type\":\"array\",\"items\":{\"type\":\"map\",\"values\":[]}}}", "{\"type\":\"record\",\"fields\":[],\"{\\r\\n  \\\"type\\\" : \\\"map\\\",\\r\\n  \\\"values\\\" : {\\r\\n    \\\"type\\\" : \\\"map\\\",\\r\\n    \\\"values\\\" : [ ]\\r\\n  }\\r\\n}\":\"{}\"}", "{\r\n  \"type\" : \"fixed\",\r\n  \"name\" : \"union\",\r\n  \"namespace\" : \"[]\",\r\n  \"doc\" : \"[ ]\",\r\n  \"size\" : 0,\r\n  \"{\\r\\n  \\\"type\\\" : \\\"fixed\\\",\\r\\n  \\\"name\\\" : \\\"union\\\",\\r\\n  \\\"namespace\\\" : \\\"[]\\\",\\r\\n  \\\"doc\\\" : \\\"[ ]\\\",\\r\\n  \\\"size\\\" : 0\\r\\n}\" : \"{\\r\\n  \\\"type\\\" : \\\"map\\\",\\r\\n  \\\"values\\\" : {\\r\\n    \\\"type\\\" : \\\"map\\\",\\r\\n    \\\"values\\\" : [ ]\\r\\n  }\\r\\n}\"\r\n}", true);
            org.junit.Assert.fail("Expected exception of type org.apache.avro.SchemaParseException; message: Illegal initial character: {\"type\":\"map\",\"values\":{\"type\":\"array\",\"items\":{\"type\":\"map\",\"values\":[]}}}");
        } catch (org.apache.avro.SchemaParseException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1989() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SchemaM3Random300Test3.test1989");
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
        org.apache.avro.Schema.LockableArrayList<org.codehaus.jackson.JsonFactory> jsonFactoryList28 = new org.apache.avro.Schema.LockableArrayList<org.codehaus.jackson.JsonFactory>((java.util.List<org.codehaus.jackson.JsonFactory>) jsonFactoryList26);
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
    }

    @Test
    public void test1990() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SchemaM3Random300Test3.test1990");
        org.apache.avro.Schema.LockableArrayList<org.apache.avro.Schema.Names> namesList1 = new org.apache.avro.Schema.LockableArrayList<org.apache.avro.Schema.Names>((int) (short) 1);
        org.apache.avro.Schema.LockableArrayList<org.apache.avro.Schema.Names> namesList2 = new org.apache.avro.Schema.LockableArrayList<org.apache.avro.Schema.Names>((java.util.List<org.apache.avro.Schema.Names>) namesList1);
    }

    @Test
    public void test1991() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SchemaM3Random300Test3.test1991");
        org.apache.avro.Schema[] schemaArray0 = new org.apache.avro.Schema[] {};
        java.util.ArrayList<org.apache.avro.Schema> schemaList1 = new java.util.ArrayList<org.apache.avro.Schema>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<org.apache.avro.Schema>) schemaList1, schemaArray0);
        org.apache.avro.Schema schema3 = org.apache.avro.Schema.createUnion((java.util.List<org.apache.avro.Schema>) schemaList1);
        java.util.List<org.apache.avro.Schema> schemaList4 = schema3.getTypes();
        org.apache.avro.Schema schema5 = org.apache.avro.Schema.createUnion(schemaList4);
        org.apache.avro.Schema schema6 = org.apache.avro.Schema.createUnion(schemaList4);
        org.apache.avro.Schema.Type type7 = schema6.getType();
        // The following exception was thrown during execution in test generation
        try {
            int int9 = schema6.getEnumOrdinal("{\"type\":\"array\",\"items\":{\"type\":\"map\",\"values\":[]},\"union type:MAP pos:-1\":\"{\\\"type\\\":\\\"array\\\",\\\"items\\\":{\\\"type\\\":\\\"map\\\",\\\"values\\\":[]}}\"}");
            org.junit.Assert.fail("Expected exception of type org.apache.avro.AvroRuntimeException; message: Not an enum: []");
        } catch (org.apache.avro.AvroRuntimeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(schemaArray0);
        org.junit.Assert.assertArrayEquals(schemaArray0, new org.apache.avro.Schema[] {});
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(schema3);
        org.junit.Assert.assertNotNull(schemaList4);
        org.junit.Assert.assertNotNull(schema5);
        org.junit.Assert.assertNotNull(schema6);
        org.junit.Assert.assertTrue("'" + type7 + "' != '" + org.apache.avro.Schema.Type.UNION + "'", type7.equals(org.apache.avro.Schema.Type.UNION));
    }

    @Test
    public void test1992() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SchemaM3Random300Test3.test1992");
        org.apache.avro.Schema.Parser parser0 = new org.apache.avro.Schema.Parser();
        java.util.Map<java.lang.String, org.apache.avro.Schema> strMap1 = parser0.getTypes();
        org.apache.avro.Schema.Parser parser2 = new org.apache.avro.Schema.Parser();
        org.apache.avro.Schema.Parser parser4 = parser2.setValidate(true);
        java.util.Map<java.lang.String, org.apache.avro.Schema> strMap5 = parser2.getTypes();
        org.apache.avro.Schema.Parser parser6 = parser0.addTypes(strMap5);
        boolean boolean7 = parser6.getValidate();
        org.apache.avro.Schema.Parser parser9 = parser6.setValidate(true);
        org.apache.avro.Schema schema11 = parser6.parse("{\"type\":\"fixed\",\"name\":\"union\",\"namespace\":\"[]\",\"doc\":\"{\\r\\n  \\\"type\\\" : \\\"map\\\",\\r\\n  \\\"values\\\" : [ ]\\r\\n}\",\"size\":10}");
        java.util.Map<java.lang.String, org.apache.avro.Schema> strMap12 = parser6.getTypes();
        org.junit.Assert.assertNotNull(strMap1);
        org.junit.Assert.assertNotNull(parser4);
        org.junit.Assert.assertNotNull(strMap5);
        org.junit.Assert.assertNotNull(parser6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(parser9);
        org.junit.Assert.assertNotNull(schema11);
        org.junit.Assert.assertNotNull(strMap12);
    }

    @Test
    public void test1993() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SchemaM3Random300Test3.test1993");
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
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean22 = schema13.isError();
            org.junit.Assert.fail("Expected exception of type org.apache.avro.AvroRuntimeException; message: Not a record: {\"type\":\"array\",\"items\":[],\"{\\\"type\\\":\\\"record\\\",\\\"fields\\\":[],\\\"{\\\\r\\\\n  \\\\\\\"type\\\\\\\" : \\\\\\\"fixed\\\\\\\",\\\\r\\\\n  \\\\\\\"name\\\\\\\" : \\\\\\\"union\\\\\\\",\\\\r\\\\n  \\\\\\\"namespace\\\\\\\" : \\\\\\\"[]\\\\\\\",\\\\r\\\\n  \\\\\\\"doc\\\\\\\" : \\\\\\\"[ ]\\\\\\\",\\\\r\\\\n  \\\\\\\"size\\\\\\\" : 0\\\\r\\\\n}\\\":\\\"[ ]\\\"}\":\"\",\"double\":\"array\"}");
        } catch (org.apache.avro.AvroRuntimeException e) {
            // Expected exception.
        }
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
    public void test1994() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SchemaM3Random300Test3.test1994");
        org.apache.avro.Schema.LockableArrayList<org.apache.avro.Schema.Field> fieldList1 = new org.apache.avro.Schema.LockableArrayList<org.apache.avro.Schema.Field>(0);
        org.apache.avro.Schema schema2 = org.apache.avro.Schema.createRecord((java.util.List<org.apache.avro.Schema.Field>) fieldList1);
        java.lang.String str4 = schema2.getProp("");
        org.junit.Assert.assertNotNull(schema2);
        org.junit.Assert.assertNull(str4);
    }

    @Test
    public void test1995() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SchemaM3Random300Test3.test1995");
        org.apache.avro.Schema.LockableArrayList<java.lang.String> strList1 = new org.apache.avro.Schema.LockableArrayList<java.lang.String>((int) (short) 0);
        org.apache.avro.Schema.LockableArrayList<java.lang.String> strList2 = new org.apache.avro.Schema.LockableArrayList<java.lang.String>((java.util.List<java.lang.String>) strList1);
        org.apache.avro.Schema.LockableArrayList<java.lang.String> strList3 = new org.apache.avro.Schema.LockableArrayList<java.lang.String>((java.util.List<java.lang.String>) strList2);
        org.apache.avro.Schema.LockableArrayList<java.lang.String> strList4 = new org.apache.avro.Schema.LockableArrayList<java.lang.String>((java.util.List<java.lang.String>) strList2);
    }

    @Test
    public void test1996() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SchemaM3Random300Test3.test1996");
        org.apache.avro.Schema.Parser parser0 = new org.apache.avro.Schema.Parser();
        org.apache.avro.Schema.Parser parser2 = parser0.setValidate(true);
        org.apache.avro.Schema.Parser parser4 = parser0.setValidate(true);
        org.apache.avro.Schema.Parser parser6 = parser4.setValidate(true);
        org.junit.Assert.assertNotNull(parser2);
        org.junit.Assert.assertNotNull(parser4);
        org.junit.Assert.assertNotNull(parser6);
    }

    @Test
    public void test1997() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SchemaM3Random300Test3.test1997");
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
            int int25 = schema21.getFixedSize();
            org.junit.Assert.fail("Expected exception of type org.apache.avro.AvroRuntimeException; message: Not fixed: {\"type\":\"array\",\"items\":{\"type\":\"map\",\"values\":[]}}");
        } catch (org.apache.avro.AvroRuntimeException e) {
            // Expected exception.
        }
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
    public void test1998() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SchemaM3Random300Test3.test1998");
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
        java.lang.String str14 = schema8.getDoc();
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
        org.junit.Assert.assertNull(str14);
    }

    @Test
    public void test1999() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SchemaM3Random300Test3.test1999");
        org.apache.avro.Schema.Field[] fieldArray0 = new org.apache.avro.Schema.Field[] {};
        java.util.ArrayList<org.apache.avro.Schema.Field> fieldList1 = new java.util.ArrayList<org.apache.avro.Schema.Field>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<org.apache.avro.Schema.Field>) fieldList1, fieldArray0);
        org.apache.avro.Schema schema3 = org.apache.avro.Schema.createRecord((java.util.List<org.apache.avro.Schema.Field>) fieldList1);
        org.apache.avro.Schema.Field field5 = schema3.getField("");
        org.apache.avro.Schema schema6 = org.apache.avro.Schema.createMap(schema3);
        org.apache.avro.Schema.Type type7 = schema3.getType();
        org.apache.avro.Schema schema8 = org.apache.avro.Schema.createMap(schema3);
        boolean boolean9 = schema3.isError();
        org.apache.avro.Schema.Type type10 = schema3.getType();
        org.junit.Assert.assertNotNull(fieldArray0);
        org.junit.Assert.assertArrayEquals(fieldArray0, new org.apache.avro.Schema.Field[] {});
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(schema3);
        org.junit.Assert.assertNull(field5);
        org.junit.Assert.assertNotNull(schema6);
        org.junit.Assert.assertTrue("'" + type7 + "' != '" + org.apache.avro.Schema.Type.RECORD + "'", type7.equals(org.apache.avro.Schema.Type.RECORD));
        org.junit.Assert.assertNotNull(schema8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + type10 + "' != '" + org.apache.avro.Schema.Type.RECORD + "'", type10.equals(org.apache.avro.Schema.Type.RECORD));
    }

    @Test
    public void test2000() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SchemaM3Random300Test3.test2000");
        org.apache.avro.Schema.Type type0 = org.apache.avro.Schema.Type.NULL;
        org.apache.avro.Schema schema1 = org.apache.avro.Schema.create(type0);
        org.apache.avro.Schema schema2 = org.apache.avro.Schema.create(type0);
        java.lang.String str4 = schema2.toString(true);
        org.apache.avro.Schema schema5 = org.apache.avro.Schema.createArray(schema2);
        java.lang.String str6 = schema5.toString();
        // The following exception was thrown during execution in test generation
        try {
            int int7 = schema5.getFixedSize();
            org.junit.Assert.fail("Expected exception of type org.apache.avro.AvroRuntimeException; message: Not fixed: {\"type\":\"array\",\"items\":\"null\"}");
        } catch (org.apache.avro.AvroRuntimeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + type0 + "' != '" + org.apache.avro.Schema.Type.NULL + "'", type0.equals(org.apache.avro.Schema.Type.NULL));
        org.junit.Assert.assertNotNull(schema1);
        org.junit.Assert.assertNotNull(schema2);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "\"null\"" + "'", str4, "\"null\"");
        org.junit.Assert.assertNotNull(schema5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "{\"type\":\"array\",\"items\":\"null\"}" + "'", str6, "{\"type\":\"array\",\"items\":\"null\"}");
    }
}

