package org.apache.avro;

import org.junit.Test;

public class SchemaM3Random300Test4 {

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
    public void test2001() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SchemaM3Random300Test4.test2001");
        org.apache.avro.Schema.LockableArrayList<org.apache.avro.Schema.Parser> parserList1 = new org.apache.avro.Schema.LockableArrayList<org.apache.avro.Schema.Parser>((int) (short) 0);
    }

    @Test
    public void test2002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SchemaM3Random300Test4.test2002");
        org.apache.avro.Schema.LockableArrayList<java.lang.String> strList4 = new org.apache.avro.Schema.LockableArrayList<java.lang.String>((int) '#');
        org.apache.avro.Schema.LockableArrayList<java.lang.String> strList5 = new org.apache.avro.Schema.LockableArrayList<java.lang.String>((java.util.List<java.lang.String>) strList4);
        org.apache.avro.Schema schema6 = org.apache.avro.Schema.createEnum("[].union", "union type:MAP pos:-1", "union type:UNION pos:-1", (java.util.List<java.lang.String>) strList5);
        org.apache.avro.Schema.LockableArrayList<java.lang.String> strList7 = new org.apache.avro.Schema.LockableArrayList<java.lang.String>((java.util.List<java.lang.String>) strList5);
        org.apache.avro.Schema.LockableArrayList<java.lang.String> strList8 = new org.apache.avro.Schema.LockableArrayList<java.lang.String>((java.util.List<java.lang.String>) strList5);
        org.junit.Assert.assertNotNull(schema6);
    }

    @Test
    public void test2003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SchemaM3Random300Test4.test2003");
        org.apache.avro.Schema schema1 = org.apache.avro.Schema.parse("{\r\n  \"type\" : \"fixed\",\r\n  \"name\" : \"union\",\r\n  \"namespace\" : \"{}\",\r\n  \"doc\" : \"hi!\",\r\n  \"size\" : 1\r\n}");
        java.lang.String str2 = schema1.getNamespace();
        org.junit.Assert.assertNotNull(schema1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "{}" + "'", str2, "{}");
    }

    @Test
    public void test2004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SchemaM3Random300Test4.test2004");
        org.apache.avro.Schema schema4 = org.apache.avro.Schema.createFixed("union type:UNION pos:-1.union", "{null={\"type\":\"fixed\",\"name\":\"union\",\"namespace\":\"[]\",\"doc\":\"[ ]\",\"size\":0}}", "{\r\n  \"type\" : \"fixed\",\r\n  \"name\" : \"union\",\r\n  \"namespace\" : \"{}\",\r\n  \"doc\" : \"hi!\",\r\n  \"size\" : 1\r\n}", (int) (short) 0);
        org.junit.Assert.assertNotNull(schema4);
    }

    @Test
    public void test2005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SchemaM3Random300Test4.test2005");
        org.apache.avro.Schema.LockableArrayList<java.lang.String> strList4 = new org.apache.avro.Schema.LockableArrayList<java.lang.String>((int) (byte) 10);
        org.apache.avro.Schema schema5 = org.apache.avro.Schema.createEnum("[].union", "union type:UNION pos:-1", "union type:UNION pos:-1", (java.util.List<java.lang.String>) strList4);
        org.apache.avro.Schema.LockableArrayList<java.lang.String> strList6 = new org.apache.avro.Schema.LockableArrayList<java.lang.String>((java.util.List<java.lang.String>) strList4);
        org.apache.avro.Schema.LockableArrayList<java.lang.String> strList7 = new org.apache.avro.Schema.LockableArrayList<java.lang.String>((java.util.List<java.lang.String>) strList6);
        org.junit.Assert.assertNotNull(schema5);
    }

    @Test
    public void test2006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SchemaM3Random300Test4.test2006");
        org.apache.avro.Schema schema4 = org.apache.avro.Schema.createRecord("float", "{\"type\":\"array\",\"items\":{\"type\":\"array\",\"items\":{\"type\":\"map\",\"values\":[]}}}", "{\"type\":\"array\",\"items\":{\"type\":\"map\",\"values\":[]}}", false);
        org.junit.Assert.assertNotNull(schema4);
    }

    @Test
    public void test2007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SchemaM3Random300Test4.test2007");
        org.apache.avro.Schema[] schemaArray0 = new org.apache.avro.Schema[] {};
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
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str25 = schema24.getNamespace();
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
        org.junit.Assert.assertNull(str22);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "{\"type\":\"map\",\"values\":[]}" + "'", str23, "{\"type\":\"map\",\"values\":[]}");
        org.junit.Assert.assertNotNull(schema24);
    }

    @Test
    public void test2008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SchemaM3Random300Test4.test2008");
        org.apache.avro.Schema.LockableArrayList<java.lang.String> strList4 = new org.apache.avro.Schema.LockableArrayList<java.lang.String>((int) '#');
        // The following exception was thrown during execution in test generation
        try {
            org.apache.avro.Schema schema5 = org.apache.avro.Schema.createEnum("{\"type\":\"map\",\"values\":[]}", "{\r\n  \"type\" : \"fixed\",\r\n  \"name\" : \"union\",\r\n  \"namespace\" : \"union type:UNION pos:-1\",\r\n  \"doc\" : \"\",\r\n  \"size\" : 10\r\n}", "float", (java.util.List<java.lang.String>) strList4);
            org.junit.Assert.fail("Expected exception of type org.apache.avro.SchemaParseException; message: Illegal initial character: {\"type\":\"map\",\"values\":[]}");
        } catch (org.apache.avro.SchemaParseException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SchemaM3Random300Test4.test2009");
        org.apache.avro.Schema.Names names1 = new org.apache.avro.Schema.Names("{\r\n  \"type\" : \"map\",\r\n  \"values\" : [ ]\r\n}");
        java.util.Collection<org.apache.avro.Schema> schemaCollection2 = names1.values();
        org.junit.Assert.assertNotNull(schemaCollection2);
    }

    @Test
    public void test2010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SchemaM3Random300Test4.test2010");
        org.apache.avro.Schema.Parser parser0 = new org.apache.avro.Schema.Parser();
        java.util.Map<java.lang.String, org.apache.avro.Schema> strMap1 = parser0.getTypes();
        java.util.Map<java.lang.String, org.apache.avro.Schema> strMap2 = parser0.getTypes();
        org.apache.avro.Schema.Parser parser3 = new org.apache.avro.Schema.Parser();
        org.apache.avro.Schema.Parser parser5 = parser3.setValidate(true);
        java.util.Map<java.lang.String, org.apache.avro.Schema> strMap6 = parser3.getTypes();
        org.apache.avro.Schema.Parser parser7 = parser0.addTypes(strMap6);
        java.util.Map<java.lang.String, org.apache.avro.Schema> strMap8 = parser0.getTypes();
        org.apache.avro.Schema.Parser parser9 = new org.apache.avro.Schema.Parser();
        java.util.Map<java.lang.String, org.apache.avro.Schema> strMap10 = parser9.getTypes();
        java.util.Map<java.lang.String, org.apache.avro.Schema> strMap11 = parser9.getTypes();
        org.apache.avro.Schema.Parser parser12 = new org.apache.avro.Schema.Parser();
        org.apache.avro.Schema.Parser parser14 = parser12.setValidate(true);
        java.util.Map<java.lang.String, org.apache.avro.Schema> strMap15 = parser12.getTypes();
        org.apache.avro.Schema.Parser parser16 = parser9.addTypes(strMap15);
        org.apache.avro.Schema.Parser parser18 = parser16.setValidate(true);
        boolean boolean19 = parser16.getValidate();
        org.apache.avro.Schema.Parser parser20 = new org.apache.avro.Schema.Parser();
        org.apache.avro.Schema.Parser parser22 = parser20.setValidate(true);
        java.util.Map<java.lang.String, org.apache.avro.Schema> strMap23 = parser20.getTypes();
        org.apache.avro.Schema.Parser parser24 = parser16.addTypes(strMap23);
        org.apache.avro.Schema.Parser parser25 = parser0.addTypes(strMap23);
        java.io.InputStream inputStream26 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.avro.Schema schema27 = parser0.parse(inputStream26);
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
        org.junit.Assert.assertNotNull(strMap10);
        org.junit.Assert.assertNotNull(strMap11);
        org.junit.Assert.assertNotNull(parser14);
        org.junit.Assert.assertNotNull(strMap15);
        org.junit.Assert.assertNotNull(parser16);
        org.junit.Assert.assertNotNull(parser18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertNotNull(parser22);
        org.junit.Assert.assertNotNull(strMap23);
        org.junit.Assert.assertNotNull(parser24);
        org.junit.Assert.assertNotNull(parser25);
    }

    @Test
    public void test2011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SchemaM3Random300Test4.test2011");
        org.apache.avro.Schema schema2 = org.apache.avro.Schema.parse("{\"type\":\"fixed\",\"name\":\"map\",\"namespace\":\"\",\"doc\":\"array\",\"size\":97}", true);
        org.junit.Assert.assertNotNull(schema2);
    }

    @Test
    public void test2012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SchemaM3Random300Test4.test2012");
        org.apache.avro.Schema.Type type0 = org.apache.avro.Schema.Type.BOOLEAN;
        org.apache.avro.Schema schema1 = org.apache.avro.Schema.create(type0);
        org.apache.avro.Schema schema2 = org.apache.avro.Schema.create(type0);
        org.junit.Assert.assertTrue("'" + type0 + "' != '" + org.apache.avro.Schema.Type.BOOLEAN + "'", type0.equals(org.apache.avro.Schema.Type.BOOLEAN));
        org.junit.Assert.assertNotNull(schema1);
        org.junit.Assert.assertNotNull(schema2);
    }

    @Test
    public void test2013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SchemaM3Random300Test4.test2013");
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
        org.apache.avro.Schema schema22 = org.apache.avro.Schema.createUnion(schemaList18);
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
        org.junit.Assert.assertNotNull(schema22);
    }

    @Test
    public void test2014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SchemaM3Random300Test4.test2014");
        org.apache.avro.Schema.LockableArrayList<java.lang.String> strList7 = new org.apache.avro.Schema.LockableArrayList<java.lang.String>((int) (byte) 10);
        org.apache.avro.Schema schema8 = org.apache.avro.Schema.createEnum("[].union", "union type:UNION pos:-1", "union type:UNION pos:-1", (java.util.List<java.lang.String>) strList7);
        java.util.List<java.lang.String> strList9 = schema8.getEnumSymbols();
        org.apache.avro.Schema schema10 = org.apache.avro.Schema.createEnum("map", "\"null\"", "{}", strList9);
        schema10.addProp("{\"type\":\"record\",\"fields\":[],\"{\\r\\n  \\\"type\\\" : \\\"fixed\\\",\\r\\n  \\\"name\\\" : \\\"union\\\",\\r\\n  \\\"namespace\\\" : \\\"[]\\\",\\r\\n  \\\"doc\\\" : \\\"[ ]\\\",\\r\\n  \\\"size\\\" : 0\\r\\n}\":\"[ ]\"}", "{\"type\":\"record\",\"fields\":[]}");
        java.util.Set<java.lang.String> strSet14 = schema10.getAliases();
        schema10.addProp("{\r\n  \"type\" : \"map\",\r\n  \"values\" : {\r\n    \"type\" : \"record\",\r\n    \"fields\" : [ ]\r\n  }\r\n}", "{\r\n  \"type\" : \"array\",\r\n  \"items\" : \"int\"\r\n}");
        org.junit.Assert.assertNotNull(schema8);
        org.junit.Assert.assertNotNull(strList9);
        org.junit.Assert.assertNotNull(schema10);
        org.junit.Assert.assertNotNull(strSet14);
    }

    @Test
    public void test2015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SchemaM3Random300Test4.test2015");
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
        schema11.addProp("{\r\n  \"type\" : \"map\",\r\n  \"values\" : {\r\n    \"type\" : \"enum\",\r\n    \"name\" : \"union\",\r\n    \"namespace\" : \"[]\",\r\n    \"doc\" : \"{}\",\r\n    \"symbols\" : [ ]\r\n  }\r\n}", "{\"type\":\"array\",\"items\":[],\"{}\":\"hi!\"}");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean19 = schema11.hasEnumSymbol("{\"type\":\"map\",\"values\":{\"type\":\"enum\",\"name\":\"union\",\"namespace\":\"double\",\"doc\":\"union\",\"symbols\":[]}}");
            org.junit.Assert.fail("Expected exception of type org.apache.avro.AvroRuntimeException; message: Not an enum: {\"type\":\"array\",\"items\":{\"type\":\"map\",\"values\":[]},\"{\\r\\n  \\\"type\\\" : \\\"map\\\",\\r\\n  \\\"values\\\" : {\\r\\n    \\\"type\\\" : \\\"enum\\\",\\r\\n    \\\"name\\\" : \\\"union\\\",\\r\\n    \\\"namespace\\\" : \\\"[]\\\",\\r\\n    \\\"doc\\\" : \\\"{}\\\",\\r\\n    \\\"symbols\\\" : [ ]\\r\\n  }\\r\\n}\":\"{\\\"type\\\":\\\"array\\\",\\\"items\\\":[],\\\"{}\\\":\\\"hi!\\\"}\"}");
        } catch (org.apache.avro.AvroRuntimeException e) {
            // Expected exception.
        }
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
    public void test2016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SchemaM3Random300Test4.test2016");
        org.apache.avro.Schema.Parser parser0 = new org.apache.avro.Schema.Parser();
        org.apache.avro.Schema.Parser parser2 = parser0.setValidate(true);
        java.util.Map<java.lang.String, org.apache.avro.Schema> strMap3 = parser0.getTypes();
        org.apache.avro.Schema.Parser parser5 = parser0.setValidate(true);
        org.apache.avro.Schema schema7 = parser0.parse("{\r\n  \"type\" : \"array\",\r\n  \"items\" : {\r\n    \"type\" : \"map\",\r\n    \"values\" : [ ]\r\n  }\r\n}");
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
        org.junit.Assert.assertNotNull(parser5);
        org.junit.Assert.assertNotNull(schema7);
    }

    @Test
    public void test2017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SchemaM3Random300Test4.test2017");
        org.apache.avro.Schema schema2 = org.apache.avro.Schema.parse("{\r\n  \"type\" : \"map\",\r\n  \"values\" : {\r\n    \"type\" : \"fixed\",\r\n    \"name\" : \"union\",\r\n    \"namespace\" : \"[]\",\r\n    \"doc\" : \"[ ]\",\r\n    \"size\" : 0\r\n  }\r\n}", false);
        org.junit.Assert.assertNotNull(schema2);
    }

    @Test
    public void test2018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SchemaM3Random300Test4.test2018");
        org.apache.avro.Schema.Type type0 = org.apache.avro.Schema.Type.DOUBLE;
        org.apache.avro.Schema schema1 = org.apache.avro.Schema.create(type0);
        org.apache.avro.Schema schema2 = org.apache.avro.Schema.createMap(schema1);
        schema1.addProp("float", "{\"type\":\"array\",\"items\":[]}");
        java.lang.String str6 = schema1.getDoc();
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<org.apache.avro.Schema.Field> fieldList7 = schema1.getFields();
            org.junit.Assert.fail("Expected exception of type org.apache.avro.AvroRuntimeException; message: Not a record: {\"type\":\"double\",\"float\":\"{\\\"type\\\":\\\"array\\\",\\\"items\\\":[]}\"}");
        } catch (org.apache.avro.AvroRuntimeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + type0 + "' != '" + org.apache.avro.Schema.Type.DOUBLE + "'", type0.equals(org.apache.avro.Schema.Type.DOUBLE));
        org.junit.Assert.assertNotNull(schema1);
        org.junit.Assert.assertNotNull(schema2);
        org.junit.Assert.assertNull(str6);
    }

    @Test
    public void test2019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SchemaM3Random300Test4.test2019");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.avro.Schema schema4 = org.apache.avro.Schema.createRecord("{\"type\":\"fixed\",\"name\":\"union\",\"namespace\":\"{}\",\"doc\":\"hi!\",\"size\":1}", "{\"type\":\"array\",\"items\":{\"type\":\"map\",\"values\":[]},\"union type:MAP pos:-1\":\"{\\\"type\\\":\\\"array\\\",\\\"items\\\":{\\\"type\\\":\\\"map\\\",\\\"values\\\":[]}}\"}", "{\"type\":\"array\",\"items\":{\"type\":\"map\",\"values\":[]},\"union type:MAP pos:-1\":\"{\\\"type\\\":\\\"array\\\",\\\"items\\\":{\\\"type\\\":\\\"map\\\",\\\"values\\\":[]}}\"}", false);
            org.junit.Assert.fail("Expected exception of type org.apache.avro.SchemaParseException; message: Illegal initial character: {\"type\":\"fixed\",\"name\":\"union\",\"namespace\":\"{}\",\"doc\":\"hi!\",\"size\":1}");
        } catch (org.apache.avro.SchemaParseException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SchemaM3Random300Test4.test2020");
        org.apache.avro.Schema.Field[] fieldArray0 = new org.apache.avro.Schema.Field[] {};
        java.util.ArrayList<org.apache.avro.Schema.Field> fieldList1 = new java.util.ArrayList<org.apache.avro.Schema.Field>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<org.apache.avro.Schema.Field>) fieldList1, fieldArray0);
        org.apache.avro.Schema schema3 = org.apache.avro.Schema.createRecord((java.util.List<org.apache.avro.Schema.Field>) fieldList1);
        org.apache.avro.Schema.Field field5 = schema3.getField("");
        org.apache.avro.Schema schema6 = org.apache.avro.Schema.createMap(schema3);
        java.lang.String str7 = schema3.getNamespace();
        java.lang.String str9 = schema3.getProp("{\r\n  \"type\" : \"map\",\r\n  \"values\" : [ ]\r\n}");
        java.lang.String str10 = schema3.toString();
        org.junit.Assert.assertNotNull(fieldArray0);
        org.junit.Assert.assertArrayEquals(fieldArray0, new org.apache.avro.Schema.Field[] {});
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(schema3);
        org.junit.Assert.assertNull(field5);
        org.junit.Assert.assertNotNull(schema6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "{\"type\":\"record\",\"fields\":[]}" + "'", str10, "{\"type\":\"record\",\"fields\":[]}");
    }

    @Test
    public void test2021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SchemaM3Random300Test4.test2021");
        org.apache.avro.Schema schema4 = org.apache.avro.Schema.createRecord("[].union", "[].union", "{\"type\":\"map\",\"values\":{\"type\":\"record\",\"fields\":[],\"{\\r\\n  \\\"type\\\" : \\\"fixed\\\",\\r\\n  \\\"name\\\" : \\\"union\\\",\\r\\n  \\\"namespace\\\" : \\\"[]\\\",\\r\\n  \\\"doc\\\" : \\\"[ ]\\\",\\r\\n  \\\"size\\\" : 0\\r\\n}\":\"[ ]\"}}", false);
        org.junit.Assert.assertNotNull(schema4);
    }

    @Test
    public void test2022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SchemaM3Random300Test4.test2022");
        org.apache.avro.Schema.Type type0 = org.apache.avro.Schema.Type.INT;
        org.apache.avro.Schema schema1 = org.apache.avro.Schema.create(type0);
        org.apache.avro.Schema schema2 = org.apache.avro.Schema.create(type0);
        org.apache.avro.Schema.Names names3 = new org.apache.avro.Schema.Names();
        java.lang.String str4 = names3.space();
        names3.space("");
        boolean boolean7 = schema2.equals((java.lang.Object) names3);
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<java.lang.String> strList8 = schema2.getEnumSymbols();
            org.junit.Assert.fail("Expected exception of type org.apache.avro.AvroRuntimeException; message: Not an enum: \"int\"");
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
    public void test2023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SchemaM3Random300Test4.test2023");
        org.apache.avro.Schema.Parser parser0 = new org.apache.avro.Schema.Parser();
        java.util.Map<java.lang.String, org.apache.avro.Schema> strMap1 = parser0.getTypes();
        java.util.Map<java.lang.String, org.apache.avro.Schema> strMap2 = parser0.getTypes();
        org.apache.avro.Schema.Parser parser3 = new org.apache.avro.Schema.Parser();
        org.apache.avro.Schema.Parser parser5 = parser3.setValidate(true);
        java.util.Map<java.lang.String, org.apache.avro.Schema> strMap6 = parser3.getTypes();
        org.apache.avro.Schema.Parser parser7 = parser0.addTypes(strMap6);
        java.util.Map<java.lang.String, org.apache.avro.Schema> strMap8 = parser7.getTypes();
        org.apache.avro.Schema schema10 = parser7.parse("{\"type\":\"map\",\"values\":[]}");
        org.apache.avro.Schema schema12 = parser7.parse("{\"type\":\"array\",\"items\":{\"type\":\"array\",\"items\":{\"type\":\"map\",\"values\":[]}}}");
        org.apache.avro.Schema.Parser parser13 = new org.apache.avro.Schema.Parser();
        java.util.Map<java.lang.String, org.apache.avro.Schema> strMap14 = parser13.getTypes();
        java.util.Map<java.lang.String, org.apache.avro.Schema> strMap15 = parser13.getTypes();
        org.apache.avro.Schema.Parser parser16 = new org.apache.avro.Schema.Parser();
        org.apache.avro.Schema.Parser parser18 = parser16.setValidate(true);
        java.util.Map<java.lang.String, org.apache.avro.Schema> strMap19 = parser16.getTypes();
        org.apache.avro.Schema.Parser parser20 = parser13.addTypes(strMap19);
        org.apache.avro.Schema.Parser parser22 = parser20.setValidate(true);
        org.apache.avro.Schema.Parser parser24 = parser20.setValidate(true);
        org.apache.avro.Schema.Parser parser26 = parser20.setValidate(true);
        org.apache.avro.Schema.Parser parser28 = parser20.setValidate(true);
        java.util.Map<java.lang.String, org.apache.avro.Schema> strMap29 = parser28.getTypes();
        java.util.Map<java.lang.String, org.apache.avro.Schema> strMap30 = parser28.getTypes();
        org.apache.avro.Schema.Parser parser31 = parser7.addTypes(strMap30);
        org.junit.Assert.assertNotNull(strMap1);
        org.junit.Assert.assertNotNull(strMap2);
        org.junit.Assert.assertNotNull(parser5);
        org.junit.Assert.assertNotNull(strMap6);
        org.junit.Assert.assertNotNull(parser7);
        org.junit.Assert.assertNotNull(strMap8);
        org.junit.Assert.assertNotNull(schema10);
        org.junit.Assert.assertNotNull(schema12);
        org.junit.Assert.assertNotNull(strMap14);
        org.junit.Assert.assertNotNull(strMap15);
        org.junit.Assert.assertNotNull(parser18);
        org.junit.Assert.assertNotNull(strMap19);
        org.junit.Assert.assertNotNull(parser20);
        org.junit.Assert.assertNotNull(parser22);
        org.junit.Assert.assertNotNull(parser24);
        org.junit.Assert.assertNotNull(parser26);
        org.junit.Assert.assertNotNull(parser28);
        org.junit.Assert.assertNotNull(strMap29);
        org.junit.Assert.assertNotNull(strMap30);
        org.junit.Assert.assertNotNull(parser31);
    }

    @Test
    public void test2024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SchemaM3Random300Test4.test2024");
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
        java.io.File file19 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.avro.Schema schema20 = parser16.parse(file19);
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
    public void test2025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SchemaM3Random300Test4.test2025");
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
        java.io.InputStream inputStream23 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.avro.Schema schema24 = parser9.parse(inputStream23);
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
    public void test2026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SchemaM3Random300Test4.test2026");
        org.apache.avro.Schema.Type type0 = org.apache.avro.Schema.Type.INT;
        org.apache.avro.Schema schema1 = org.apache.avro.Schema.create(type0);
        org.apache.avro.Schema schema2 = org.apache.avro.Schema.createArray(schema1);
        java.lang.String str4 = schema1.getProp("{\"type\":\"array\",\"items\":{\"type\":\"map\",\"values\":[]}}");
        org.junit.Assert.assertTrue("'" + type0 + "' != '" + org.apache.avro.Schema.Type.INT + "'", type0.equals(org.apache.avro.Schema.Type.INT));
        org.junit.Assert.assertNotNull(schema1);
        org.junit.Assert.assertNotNull(schema2);
        org.junit.Assert.assertNull(str4);
    }

    @Test
    public void test2027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SchemaM3Random300Test4.test2027");
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
        org.apache.avro.Schema.Parser parser33 = parser7.addTypes(strMap32);
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
    public void test2028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SchemaM3Random300Test4.test2028");
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
        org.apache.avro.Schema schema15 = schema11.getElementType();
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
    public void test2029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SchemaM3Random300Test4.test2029");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.avro.Schema schema2 = org.apache.avro.Schema.parse("{\"type\":\"map\",\"values\":{\"type\":\"record\",\"fields\":[],\"{\\r\\n  \\\"type\\\" : \\\"fixed\\\",\\r\\n  \\\"name\\\" : \\\"union\\\",\\r\\n  \\\"namespace\\\" : \\\"[]\\\",\\r\\n  \\\"doc\\\" : \\\"[ ]\\\",\\r\\n  \\\"size\\\" : 0\\r\\n}\":\"[ ]\"}}", true);
            org.junit.Assert.fail("Expected exception of type org.apache.avro.SchemaParseException; message: No name in schema: {\"type\":\"record\",\"fields\":[],\"{\\r\\n  \\\"type\\\" : \\\"fixed\\\",\\r\\n  \\\"name\\\" : \\\"union\\\",\\r\\n  \\\"namespace\\\" : \\\"[]\\\",\\r\\n  \\\"doc\\\" : \\\"[ ]\\\",\\r\\n  \\\"size\\\" : 0\\r\\n}\":\"[ ]\"}");
        } catch (org.apache.avro.SchemaParseException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SchemaM3Random300Test4.test2030");
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
        int int20 = names0.size();
        java.util.Collection<org.apache.avro.Schema> schemaCollection21 = names0.values();
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
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertNotNull(schemaCollection21);
    }

    @Test
    public void test2031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SchemaM3Random300Test4.test2031");
        org.apache.avro.Schema.LockableArrayList<org.apache.avro.Schema> schemaList0 = new org.apache.avro.Schema.LockableArrayList<org.apache.avro.Schema>();
        org.apache.avro.Schema schema1 = org.apache.avro.Schema.createUnion((java.util.List<org.apache.avro.Schema>) schemaList0);
        // The following exception was thrown during execution in test generation
        try {
            schema1.addAlias("union type:UNION pos:-1");
            org.junit.Assert.fail("Expected exception of type org.apache.avro.AvroRuntimeException; message: Not a named type: []");
        } catch (org.apache.avro.AvroRuntimeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(schema1);
    }

    @Test
    public void test2032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SchemaM3Random300Test4.test2032");
        org.apache.avro.Schema.Field[] fieldArray0 = new org.apache.avro.Schema.Field[] {};
        java.util.ArrayList<org.apache.avro.Schema.Field> fieldList1 = new java.util.ArrayList<org.apache.avro.Schema.Field>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<org.apache.avro.Schema.Field>) fieldList1, fieldArray0);
        org.apache.avro.Schema schema3 = org.apache.avro.Schema.createRecord((java.util.List<org.apache.avro.Schema.Field>) fieldList1);
        boolean boolean4 = schema3.isError();
        java.util.List<org.apache.avro.Schema.Field> fieldList5 = schema3.getFields();
        org.apache.avro.Schema schema6 = org.apache.avro.Schema.createRecord(fieldList5);
        org.apache.avro.Schema schema7 = org.apache.avro.Schema.createRecord(fieldList5);
        org.junit.Assert.assertNotNull(fieldArray0);
        org.junit.Assert.assertArrayEquals(fieldArray0, new org.apache.avro.Schema.Field[] {});
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(schema3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(fieldList5);
        org.junit.Assert.assertNotNull(schema6);
        org.junit.Assert.assertNotNull(schema7);
    }

    @Test
    public void test2033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SchemaM3Random300Test4.test2033");
        org.apache.avro.Schema.LockableArrayList<java.lang.String> strList4 = new org.apache.avro.Schema.LockableArrayList<java.lang.String>((int) 'a');
        // The following exception was thrown during execution in test generation
        try {
            org.apache.avro.Schema schema5 = org.apache.avro.Schema.createEnum("", "{\"type\":\"fixed\",\"name\":\"union\",\"namespace\":\"{}\",\"doc\":\"hi!\",\"size\":1}", "{\r\n  \"type\" : \"record\",\r\n  \"fields\" : [ ],\r\n  \"{\\r\\n  \\\"type\\\" : \\\"fixed\\\",\\r\\n  \\\"name\\\" : \\\"union\\\",\\r\\n  \\\"namespace\\\" : \\\"[]\\\",\\r\\n  \\\"doc\\\" : \\\"[ ]\\\",\\r\\n  \\\"size\\\" : 0\\r\\n}\" : \"[ ]\"\r\n}", (java.util.List<java.lang.String>) strList4);
            org.junit.Assert.fail("Expected exception of type org.apache.avro.SchemaParseException; message: Empty name");
        } catch (org.apache.avro.SchemaParseException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SchemaM3Random300Test4.test2034");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.avro.Schema schema4 = org.apache.avro.Schema.createFixed("{\r\n  \"type\" : \"map\",\r\n  \"values\" : {\r\n    \"type\" : \"array\",\r\n    \"items\" : {\r\n      \"type\" : \"map\",\r\n      \"values\" : [ ]\r\n    },\r\n    \"\" : \"{\\r\\n  \\\"type\\\" : \\\"record\\\",\\r\\n  \\\"fields\\\" : [ ]\\r\\n}\"\r\n  }\r\n}", "[]", "{\r\n  \"type\" : \"fixed\",\r\n  \"name\" : \"union\",\r\n  \"namespace\" : \"[]\",\r\n  \"doc\" : \"[ ]\",\r\n  \"size\" : 0,\r\n  \"{\\r\\n  \\\"type\\\" : \\\"fixed\\\",\\r\\n  \\\"name\\\" : \\\"union\\\",\\r\\n  \\\"namespace\\\" : \\\"[]\\\",\\r\\n  \\\"doc\\\" : \\\"[ ]\\\",\\r\\n  \\\"size\\\" : 0\\r\\n}\" : \"{\\r\\n  \\\"type\\\" : \\\"map\\\",\\r\\n  \\\"values\\\" : {\\r\\n    \\\"type\\\" : \\\"map\\\",\\r\\n    \\\"values\\\" : [ ]\\r\\n  }\\r\\n}\"\r\n}", (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type org.apache.avro.SchemaParseException; message: Illegal initial character: {??  \"type\" : \"map\",??  \"values\" : {??    \"type\" : \"array\",??    \"items\" : {??      \"type\" : \"map\",??      \"values\" : [ ]??    },??    \"\" : \"{\\r\\n  \\\"type\\\" : \\\"record\\\",\\r\\n  \\\"fields\\\" : [ ]\\r\\n}\"??  }??}");
        } catch (org.apache.avro.SchemaParseException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SchemaM3Random300Test4.test2035");
        org.apache.avro.Schema schema4 = org.apache.avro.Schema.createFixed("array", "", "union", (int) (short) 1);
        org.apache.avro.Schema.Type type5 = schema4.getType();
        java.lang.String str6 = schema4.toString();
        org.junit.Assert.assertNotNull(schema4);
        org.junit.Assert.assertTrue("'" + type5 + "' != '" + org.apache.avro.Schema.Type.FIXED + "'", type5.equals(org.apache.avro.Schema.Type.FIXED));
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "{\"type\":\"fixed\",\"name\":\"array\",\"namespace\":\"union\",\"doc\":\"\",\"size\":1}" + "'", str6, "{\"type\":\"fixed\",\"name\":\"array\",\"namespace\":\"union\",\"doc\":\"\",\"size\":1}");
    }

    @Test
    public void test2036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SchemaM3Random300Test4.test2036");
        org.apache.avro.Schema schema1 = org.apache.avro.Schema.parse("{\"type\":\"array\",\"items\":{\"type\":\"map\",\"values\":[]}}");
        java.lang.String str2 = schema1.getFullName();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str3 = schema1.getNamespace();
            org.junit.Assert.fail("Expected exception of type org.apache.avro.AvroRuntimeException; message: Not a named type: {\"type\":\"array\",\"items\":{\"type\":\"map\",\"values\":[]}}");
        } catch (org.apache.avro.AvroRuntimeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(schema1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "array" + "'", str2, "array");
    }

    @Test
    public void test2037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SchemaM3Random300Test4.test2037");
        org.apache.avro.Schema[] schemaArray0 = new org.apache.avro.Schema[] {};
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
        org.apache.avro.Schema schema17 = schema13.getElementType();
        org.junit.Assert.assertNotNull(schemaArray0);
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
        org.junit.Assert.assertNotNull(schema17);
    }

    @Test
    public void test2038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SchemaM3Random300Test4.test2038");
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
        // The following exception was thrown during execution in test generation
        try {
            int int22 = schema21.getFixedSize();
            org.junit.Assert.fail("Expected exception of type org.apache.avro.AvroRuntimeException; message: Not fixed: \"null\"");
        } catch (org.apache.avro.AvroRuntimeException e) {
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
        org.junit.Assert.assertNotNull(schema21);
    }

    @Test
    public void test2039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SchemaM3Random300Test4.test2039");
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
            org.apache.avro.Schema schema10 = schema9.getValueType();
            org.junit.Assert.fail("Expected exception of type org.apache.avro.AvroRuntimeException; message: Not a map: {\"type\":\"array\",\"items\":[]}");
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
    public void test2040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SchemaM3Random300Test4.test2040");
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
        java.io.InputStream inputStream27 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.avro.Schema schema28 = parser6.parse(inputStream27);
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
        org.junit.Assert.assertNotNull(strMap20);
        org.junit.Assert.assertNotNull(parser23);
        org.junit.Assert.assertNotNull(strMap24);
        org.junit.Assert.assertNotNull(parser25);
        org.junit.Assert.assertNotNull(parser26);
    }

    @Test
    public void test2041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SchemaM3Random300Test4.test2041");
        org.apache.avro.Schema.Parser parser0 = new org.apache.avro.Schema.Parser();
        org.apache.avro.Schema.Parser parser2 = parser0.setValidate(true);
        org.apache.avro.Schema.Parser parser4 = parser0.setValidate(true);
        org.apache.avro.Schema.Parser parser6 = parser0.setValidate(true);
        org.apache.avro.Schema.Parser parser8 = parser0.setValidate(false);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.avro.Schema schema10 = parser8.parse("{}");
            org.junit.Assert.fail("Expected exception of type org.apache.avro.SchemaParseException; message: No type: {}");
        } catch (org.apache.avro.SchemaParseException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(parser2);
        org.junit.Assert.assertNotNull(parser4);
        org.junit.Assert.assertNotNull(parser6);
        org.junit.Assert.assertNotNull(parser8);
    }

    @Test
    public void test2042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SchemaM3Random300Test4.test2042");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.avro.Schema schema4 = org.apache.avro.Schema.createRecord("{\r\n  \"type\" : \"fixed\",\r\n  \"name\" : \"union\",\r\n  \"namespace\" : \"{}\",\r\n  \"doc\" : \"hi!\",\r\n  \"size\" : 1\r\n}", "double.map", "{\"type\":\"map\",\"values\":{\"type\":\"enum\",\"name\":\"union\",\"namespace\":\"double\",\"doc\":\"union\",\"symbols\":[]}}", true);
            org.junit.Assert.fail("Expected exception of type org.apache.avro.SchemaParseException; message: Illegal initial character: {??  \"type\" : \"fixed\",??  \"name\" : \"union\",??  \"namespace\" : \"{}\",??  \"doc\" : \"hi!\",??  \"size\" : 1??}");
        } catch (org.apache.avro.SchemaParseException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SchemaM3Random300Test4.test2043");
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
        org.apache.avro.Schema schema21 = parser18.parse("{\r\n  \"type\" : \"map\",\r\n  \"values\" : {\r\n    \"type\" : \"map\",\r\n    \"values\" : [ ]\r\n  }\r\n}");
        // The following exception was thrown during execution in test generation
        try {
            int int23 = schema21.getEnumOrdinal("{\"type\":\"array\",\"items\":[],\"{}\":\"hi!\"}");
            org.junit.Assert.fail("Expected exception of type org.apache.avro.AvroRuntimeException; message: Not an enum: {\"type\":\"map\",\"values\":{\"type\":\"map\",\"values\":[]}}");
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
        org.junit.Assert.assertNotNull(parser18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(schema21);
    }

    @Test
    public void test2044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SchemaM3Random300Test4.test2044");
        org.apache.avro.Schema.Parser parser0 = new org.apache.avro.Schema.Parser();
        java.util.Map<java.lang.String, org.apache.avro.Schema> strMap1 = parser0.getTypes();
        java.util.Map<java.lang.String, org.apache.avro.Schema> strMap2 = parser0.getTypes();
        org.apache.avro.Schema.Parser parser3 = new org.apache.avro.Schema.Parser();
        org.apache.avro.Schema.Parser parser5 = parser3.setValidate(true);
        java.util.Map<java.lang.String, org.apache.avro.Schema> strMap6 = parser3.getTypes();
        org.apache.avro.Schema.Parser parser7 = parser0.addTypes(strMap6);
        org.apache.avro.Schema.Parser parser9 = parser7.setValidate(true);
        org.apache.avro.Schema.Parser parser11 = parser7.setValidate(true);
        org.apache.avro.Schema.Parser parser13 = parser11.setValidate(false);
        java.util.Map<java.lang.String, org.apache.avro.Schema> strMap14 = parser11.getTypes();
        org.junit.Assert.assertNotNull(strMap1);
        org.junit.Assert.assertNotNull(strMap2);
        org.junit.Assert.assertNotNull(parser5);
        org.junit.Assert.assertNotNull(strMap6);
        org.junit.Assert.assertNotNull(parser7);
        org.junit.Assert.assertNotNull(parser9);
        org.junit.Assert.assertNotNull(parser11);
        org.junit.Assert.assertNotNull(parser13);
        org.junit.Assert.assertNotNull(strMap14);
    }

    @Test
    public void test2045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SchemaM3Random300Test4.test2045");
        org.apache.avro.Schema.Field[] fieldArray0 = new org.apache.avro.Schema.Field[] {};
        java.util.ArrayList<org.apache.avro.Schema.Field> fieldList1 = new java.util.ArrayList<org.apache.avro.Schema.Field>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<org.apache.avro.Schema.Field>) fieldList1, fieldArray0);
        org.apache.avro.Schema schema3 = org.apache.avro.Schema.createRecord((java.util.List<org.apache.avro.Schema.Field>) fieldList1);
        boolean boolean4 = schema3.isError();
        java.lang.String str5 = schema3.getFullName();
        org.junit.Assert.assertNotNull(fieldArray0);
        org.junit.Assert.assertArrayEquals(fieldArray0, new org.apache.avro.Schema.Field[] {});
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(schema3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str5);
    }

    @Test
    public void test2046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SchemaM3Random300Test4.test2046");
        org.apache.avro.Schema.LockableArrayList<org.apache.avro.Schema.Field> fieldList0 = new org.apache.avro.Schema.LockableArrayList<org.apache.avro.Schema.Field>();
    }

    @Test
    public void test2047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SchemaM3Random300Test4.test2047");
        org.apache.avro.Schema.Type type0 = org.apache.avro.Schema.Type.INT;
        org.apache.avro.Schema schema1 = org.apache.avro.Schema.create(type0);
        org.apache.avro.Schema schema2 = org.apache.avro.Schema.createArray(schema1);
        schema2.addProp("[ ]", "");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.avro.Schema.Field field7 = schema2.getField("[ ]");
            org.junit.Assert.fail("Expected exception of type org.apache.avro.AvroRuntimeException; message: Not a record: {\"type\":\"array\",\"items\":\"int\",\"[ ]\":\"\"}");
        } catch (org.apache.avro.AvroRuntimeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + type0 + "' != '" + org.apache.avro.Schema.Type.INT + "'", type0.equals(org.apache.avro.Schema.Type.INT));
        org.junit.Assert.assertNotNull(schema1);
        org.junit.Assert.assertNotNull(schema2);
    }

    @Test
    public void test2048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SchemaM3Random300Test4.test2048");
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
        boolean boolean20 = parser18.getValidate();
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
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test2049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SchemaM3Random300Test4.test2049");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.avro.Schema schema2 = org.apache.avro.Schema.parse("{\r\n  \"type\" : \"record\",\r\n  \"fields\" : [ ],\r\n  \"{\\\"type\\\":\\\"array\\\",\\\"items\\\":[],\\\"union type:UNION pos:-1\\\":\\\"\\\"}\" : \"{null={\\\"type\\\":\\\"map\\\",\\\"values\\\":[]}}\"\r\n}", true);
            org.junit.Assert.fail("Expected exception of type org.apache.avro.SchemaParseException; message: No name in schema: {\"type\":\"record\",\"fields\":[],\"{\\\"type\\\":\\\"array\\\",\\\"items\\\":[],\\\"union type:UNION pos:-1\\\":\\\"\\\"}\":\"{null={\\\"type\\\":\\\"map\\\",\\\"values\\\":[]}}\"}");
        } catch (org.apache.avro.SchemaParseException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SchemaM3Random300Test4.test2050");
        org.apache.avro.Schema[] schemaArray0 = new org.apache.avro.Schema[] {};
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
        java.lang.String str26 = schema24.getProp("{\r\n  \"type\" : \"fixed\",\r\n  \"name\" : \"union\",\r\n  \"namespace\" : \"[]\",\r\n  \"doc\" : \"[ ]\",\r\n  \"size\" : 0\r\n}");
        org.junit.Assert.assertNotNull(schemaArray0);
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
        org.junit.Assert.assertNull(str26);
    }

    @Test
    public void test2051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SchemaM3Random300Test4.test2051");
        org.apache.avro.Schema schema4 = org.apache.avro.Schema.createFixed("union", "hi!", "{}", (int) (byte) 1);
        schema4.addProp("{\r\n  \"type\" : \"map\",\r\n  \"values\" : {\r\n    \"type\" : \"fixed\",\r\n    \"name\" : \"union\",\r\n    \"namespace\" : \"[]\",\r\n    \"doc\" : \"[ ]\",\r\n    \"size\" : 0\r\n  }\r\n}", "{null={\"type\":\"fixed\",\"name\":\"union\",\"namespace\":\"[]\",\"doc\":\"[ ]\",\"size\":0}}");
        // The following exception was thrown during execution in test generation
        try {
            int int9 = schema4.getEnumOrdinal("{null=null}");
            org.junit.Assert.fail("Expected exception of type org.apache.avro.AvroRuntimeException; message: Not an enum: {\"type\":\"fixed\",\"name\":\"union\",\"namespace\":\"{}\",\"doc\":\"hi!\",\"size\":1,\"{\\r\\n  \\\"type\\\" : \\\"map\\\",\\r\\n  \\\"values\\\" : {\\r\\n    \\\"type\\\" : \\\"fixed\\\",\\r\\n    \\\"name\\\" : \\\"union\\\",\\r\\n    \\\"namespace\\\" : \\\"[]\\\",\\r\\n    \\\"doc\\\" : \\\"[ ]\\\",\\r\\n    \\\"size\\\" : 0\\r\\n  }\\r\\n}\":\"{null={\\\"type\\\":\\\"fixed\\\",\\\"name\\\":\\\"union\\\",\\\"namespace\\\":\\\"[]\\\",\\\"doc\\\":\\\"[ ]\\\",\\\"size\\\":0}}\"}");
        } catch (org.apache.avro.AvroRuntimeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(schema4);
    }

    @Test
    public void test2052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SchemaM3Random300Test4.test2052");
        org.apache.avro.Schema schema1 = org.apache.avro.Schema.parse("{\"type\":\"float\",\"{\\r\\n  \\\"type\\\" : \\\"record\\\",\\r\\n  \\\"fields\\\" : [ ]\\r\\n}\":\"{\\r\\n  \\\"type\\\" : \\\"map\\\",\\r\\n  \\\"values\\\" : [ ]\\r\\n}\"}");
        org.junit.Assert.assertNotNull(schema1);
    }

    @Test
    public void test2053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SchemaM3Random300Test4.test2053");
        org.apache.avro.Schema[] schemaArray0 = new org.apache.avro.Schema[] {};
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
        schema21.addProp("{\"type\":\"map\",\"values\":{\"type\":\"record\",\"fields\":[]}}", "array");
        org.junit.Assert.assertNotNull(schemaArray0);
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
    public void test2054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SchemaM3Random300Test4.test2054");
        org.apache.avro.Schema.Names names1 = new org.apache.avro.Schema.Names("{\"type\":\"map\",\"values\":[],\"\\\"double\\\"\":\"{\\\"type\\\":\\\"array\\\",\\\"items\\\":\\\"int\\\"}\"}");
    }

    @Test
    public void test2055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SchemaM3Random300Test4.test2055");
        org.apache.avro.Schema[] schemaArray0 = new org.apache.avro.Schema[] {};
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
            org.apache.avro.Schema schema42 = schema41.getValueType();
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
    public void test2056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SchemaM3Random300Test4.test2056");
        org.apache.avro.Schema[] schemaArray0 = new org.apache.avro.Schema[] {};
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
        java.lang.String str17 = schema15.getName();
        org.apache.avro.Schema.Type type18 = schema15.getType();
        org.junit.Assert.assertNotNull(schemaArray0);
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
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "array" + "'", str17, "array");
        org.junit.Assert.assertTrue("'" + type18 + "' != '" + org.apache.avro.Schema.Type.ARRAY + "'", type18.equals(org.apache.avro.Schema.Type.ARRAY));
    }

    @Test
    public void test2057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SchemaM3Random300Test4.test2057");
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
        java.lang.String str20 = schema18.getProp("{\"type\":\"map\",\"values\":{\"type\":\"array\",\"items\":{\"type\":\"map\",\"values\":[]},\"\":\"{\\r\\n  \\\"type\\\" : \\\"record\\\",\\r\\n  \\\"fields\\\" : [ ]\\r\\n}\"}}");
        java.lang.String str22 = schema18.getProp("{\r\n  \"type\" : \"array\",\r\n  \"items\" : {\r\n    \"type\" : \"map\",\r\n    \"values\" : [ ]\r\n  }\r\n}");
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
        org.junit.Assert.assertNull(str20);
        org.junit.Assert.assertNull(str22);
    }

    @Test
    public void test2058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SchemaM3Random300Test4.test2058");
        org.apache.avro.Schema.Names names0 = new org.apache.avro.Schema.Names();
        java.lang.String str1 = names0.space();
        java.util.Collection<org.apache.avro.Schema> schemaCollection2 = names0.values();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNotNull(schemaCollection2);
    }

    @Test
    public void test2059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SchemaM3Random300Test4.test2059");
        org.apache.avro.Schema.Field[] fieldArray0 = new org.apache.avro.Schema.Field[] {};
        java.util.ArrayList<org.apache.avro.Schema.Field> fieldList1 = new java.util.ArrayList<org.apache.avro.Schema.Field>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<org.apache.avro.Schema.Field>) fieldList1, fieldArray0);
        org.apache.avro.Schema schema3 = org.apache.avro.Schema.createRecord((java.util.List<org.apache.avro.Schema.Field>) fieldList1);
        boolean boolean4 = schema3.isError();
        org.apache.avro.Schema schema5 = org.apache.avro.Schema.createArray(schema3);
        org.apache.avro.Schema.Field field7 = schema3.getField("{\"type\":\"array\",\"items\":\"int\"}");
        java.lang.String str8 = schema3.getNamespace();
        java.lang.String str9 = schema3.getDoc();
        org.junit.Assert.assertNotNull(fieldArray0);
        org.junit.Assert.assertArrayEquals(fieldArray0, new org.apache.avro.Schema.Field[] {});
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(schema3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(schema5);
        org.junit.Assert.assertNull(field7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str9);
    }

    @Test
    public void test2060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SchemaM3Random300Test4.test2060");
        org.apache.avro.Schema schema4 = org.apache.avro.Schema.createRecord("{}.union", "\"double\"", "{\r\n  \"type\" : \"array\",\r\n  \"items\" : {\r\n    \"type\" : \"map\",\r\n    \"values\" : [ ]\r\n  }\r\n}", true);
        org.junit.Assert.assertNotNull(schema4);
    }

    @Test
    public void test2061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SchemaM3Random300Test4.test2061");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.avro.Schema schema4 = org.apache.avro.Schema.createRecord("float type:ARRAY pos:-1", "{\"type\":\"array\",\"items\":{\"type\":\"map\",\"values\":[]},\"union type:MAP pos:-1\":\"{\\\"type\\\":\\\"array\\\",\\\"items\\\":{\\\"type\\\":\\\"map\\\",\\\"values\\\":[]}}\"}", "{\"type\":\"fixed\",\"name\":\"union\",\"namespace\":\"[]\",\"doc\":\"[ ]\",\"size\":0}", false);
            org.junit.Assert.fail("Expected exception of type org.apache.avro.SchemaParseException; message: Illegal character in: float type:ARRAY pos:-1");
        } catch (org.apache.avro.SchemaParseException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SchemaM3Random300Test4.test2062");
        org.apache.avro.Schema[] schemaArray0 = new org.apache.avro.Schema[] {};
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
        org.apache.avro.Schema schema21 = org.apache.avro.Schema.createMap(schema19);
        // The following exception was thrown during execution in test generation
        try {
            schema19.addProp(".map", "{\r\n  \"type\" : \"map\",\r\n  \"values\" : {\r\n    \"type\" : \"record\",\r\n    \"fields\" : [ ]\r\n  }\r\n}");
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
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "union" + "'", str20, "union");
        org.junit.Assert.assertNotNull(schema21);
    }

    @Test
    public void test2063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SchemaM3Random300Test4.test2063");
        org.apache.avro.Schema.LockableArrayList<java.lang.String> strList1 = new org.apache.avro.Schema.LockableArrayList<java.lang.String>((int) (byte) 100);
        org.apache.avro.Schema.LockableArrayList<java.lang.String> strList2 = new org.apache.avro.Schema.LockableArrayList<java.lang.String>((java.util.List<java.lang.String>) strList1);
        org.apache.avro.Schema.LockableArrayList<java.lang.String> strList3 = new org.apache.avro.Schema.LockableArrayList<java.lang.String>((java.util.List<java.lang.String>) strList2);
        org.apache.avro.Schema.LockableArrayList<java.lang.String> strList4 = new org.apache.avro.Schema.LockableArrayList<java.lang.String>((java.util.List<java.lang.String>) strList3);
    }

    @Test
    public void test2064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SchemaM3Random300Test4.test2064");
        org.apache.avro.Schema.Parser parser0 = new org.apache.avro.Schema.Parser();
        java.util.Map<java.lang.String, org.apache.avro.Schema> strMap1 = parser0.getTypes();
        org.apache.avro.Schema.Parser parser3 = parser0.setValidate(false);
        org.apache.avro.Schema.Parser parser5 = parser3.setValidate(true);
        java.util.Map<java.lang.String, org.apache.avro.Schema> strMap6 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.avro.Schema.Parser parser7 = parser5.addTypes(strMap6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strMap1);
        org.junit.Assert.assertNotNull(parser3);
        org.junit.Assert.assertNotNull(parser5);
    }

    @Test
    public void test2065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SchemaM3Random300Test4.test2065");
        org.apache.avro.Schema.LockableArrayList<java.lang.String> strList7 = new org.apache.avro.Schema.LockableArrayList<java.lang.String>((int) ' ');
        org.apache.avro.Schema schema8 = org.apache.avro.Schema.createEnum("int", "map", "\"double\"", (java.util.List<java.lang.String>) strList7);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.avro.Schema schema9 = org.apache.avro.Schema.createEnum("{\r\n  \"type\" : \"record\",\r\n  \"fields\" : [ ],\r\n  \"{\\r\\n  \\\"type\\\" : \\\"fixed\\\",\\r\\n  \\\"name\\\" : \\\"union\\\",\\r\\n  \\\"namespace\\\" : \\\"[]\\\",\\r\\n  \\\"doc\\\" : \\\"[ ]\\\",\\r\\n  \\\"size\\\" : 0\\r\\n}\" : \"[ ]\"\r\n}", "[ ]", "{\r\n  \"type\" : \"array\",\r\n  \"items\" : [ ]\r\n}", (java.util.List<java.lang.String>) strList7);
            org.junit.Assert.fail("Expected exception of type org.apache.avro.SchemaParseException; message: Illegal initial character: {??  \"type\" : \"record\",??  \"fields\" : [ ],??  \"{\\r\\n  \\\"type\\\" : \\\"fixed\\\",\\r\\n  \\\"name\\\" : \\\"union\\\",\\r\\n  \\\"namespace\\\" : \\\"[]\\\",\\r\\n  \\\"doc\\\" : \\\"[ ]\\\",\\r\\n  \\\"size\\\" : 0\\r\\n}\" : \"[ ]\"??}");
        } catch (org.apache.avro.SchemaParseException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(schema8);
    }

    @Test
    public void test2066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SchemaM3Random300Test4.test2066");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.avro.Schema schema4 = org.apache.avro.Schema.createRecord("{\r\n  \"type\" : \"map\",\r\n  \"values\" : {\r\n    \"type\" : \"enum\",\r\n    \"name\" : \"union\",\r\n    \"namespace\" : \"[]\",\r\n    \"doc\" : \"{}\",\r\n    \"symbols\" : [ ]\r\n  }\r\n}", "{\"type\":\"record\",\"fields\":[],\"{\\r\\n  \\\"type\\\" : \\\"map\\\",\\r\\n  \\\"values\\\" : {\\r\\n    \\\"type\\\" : \\\"map\\\",\\r\\n    \\\"values\\\" : [ ]\\r\\n  }\\r\\n}\":\"{}\"}", "[ ]", true);
            org.junit.Assert.fail("Expected exception of type org.apache.avro.SchemaParseException; message: Illegal initial character: {??  \"type\" : \"map\",??  \"values\" : {??    \"type\" : \"enum\",??    \"name\" : \"union\",??    \"namespace\" : \"[]\",??    \"doc\" : \"{}\",??    \"symbols\" : [ ]??  }??}");
        } catch (org.apache.avro.SchemaParseException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SchemaM3Random300Test4.test2067");
        org.apache.avro.Schema schema4 = org.apache.avro.Schema.createFixed("union", "{\"type\":\"fixed\",\"name\":\"union\",\"namespace\":\"[]\",\"doc\":\"{\\r\\n  \\\"type\\\" : \\\"map\\\",\\r\\n  \\\"values\\\" : [ ]\\r\\n}\",\"size\":10}", "{\"type\":\"fixed\",\"name\":\"union\",\"namespace\":\"[]\",\"doc\":\"[ ]\",\"size\":0,\"aliases\":[\"union\"]}", (int) (byte) 0);
        java.lang.String str6 = schema4.getProp("{\"type\":\"double\",\"float\":\"{\\\"type\\\":\\\"array\\\",\\\"items\\\":[]}\"}");
        java.lang.String str8 = schema4.getProp("{\r\n  \"type\" : \"record\",\r\n  \"fields\" : [ ],\r\n  \"{\\\"type\\\":\\\"array\\\",\\\"items\\\":[],\\\"union type:UNION pos:-1\\\":\\\"\\\"}\" : \"{null={\\\"type\\\":\\\"map\\\",\\\"values\\\":[]}}\"\r\n}");
        org.junit.Assert.assertNotNull(schema4);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str8);
    }

    @Test
    public void test2068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SchemaM3Random300Test4.test2068");
        org.apache.avro.Schema schema2 = org.apache.avro.Schema.parse("{\"type\":\"array\",\"items\":{\"type\":\"map\",\"values\":{\"type\":\"map\",\"values\":[]}}}", false);
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<java.lang.String> strList3 = schema2.getEnumSymbols();
            org.junit.Assert.fail("Expected exception of type org.apache.avro.AvroRuntimeException; message: Not an enum: {\"type\":\"array\",\"items\":{\"type\":\"map\",\"values\":{\"type\":\"map\",\"values\":[]}}}");
        } catch (org.apache.avro.AvroRuntimeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(schema2);
    }

    @Test
    public void test2069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SchemaM3Random300Test4.test2069");
        org.apache.avro.Schema[] schemaArray0 = new org.apache.avro.Schema[] {};
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
            org.apache.avro.Schema.Field field36 = schema31.getField("\"null\"");
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
    public void test2070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SchemaM3Random300Test4.test2070");
        org.apache.avro.Schema.LockableArrayList<org.apache.avro.Schema> schemaList1 = new org.apache.avro.Schema.LockableArrayList<org.apache.avro.Schema>((int) (short) 100);
        org.apache.avro.Schema schema2 = org.apache.avro.Schema.createUnion((java.util.List<org.apache.avro.Schema>) schemaList1);
        java.lang.String str3 = schema2.getDoc();
        org.junit.Assert.assertNotNull(schema2);
        org.junit.Assert.assertNull(str3);
    }

    @Test
    public void test2071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SchemaM3Random300Test4.test2071");
        org.apache.avro.Schema[] schemaArray0 = new org.apache.avro.Schema[] {};
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
        java.lang.String str35 = schema34.getName();
        org.junit.Assert.assertNotNull(schemaArray0);
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
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "union" + "'", str35, "union");
    }

    @Test
    public void test2072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SchemaM3Random300Test4.test2072");
        org.apache.avro.Schema.Parser parser0 = new org.apache.avro.Schema.Parser();
        java.util.Map<java.lang.String, org.apache.avro.Schema> strMap1 = parser0.getTypes();
        java.util.Map<java.lang.String, org.apache.avro.Schema> strMap2 = parser0.getTypes();
        org.apache.avro.Schema.Parser parser3 = new org.apache.avro.Schema.Parser();
        java.util.Map<java.lang.String, org.apache.avro.Schema> strMap4 = parser3.getTypes();
        org.apache.avro.Schema.Parser parser5 = parser0.addTypes(strMap4);
        boolean boolean6 = parser5.getValidate();
        boolean boolean7 = parser5.getValidate();
        org.junit.Assert.assertNotNull(strMap1);
        org.junit.Assert.assertNotNull(strMap2);
        org.junit.Assert.assertNotNull(strMap4);
        org.junit.Assert.assertNotNull(parser5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test2073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SchemaM3Random300Test4.test2073");
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
        java.io.InputStream inputStream16 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.avro.Schema schema17 = parser12.parse(inputStream16);
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
        org.junit.Assert.assertNotNull(parser12);
        org.junit.Assert.assertNotNull(strMap13);
        org.junit.Assert.assertNotNull(parser15);
    }

    @Test
    public void test2074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SchemaM3Random300Test4.test2074");
        org.apache.avro.Schema schema2 = org.apache.avro.Schema.parse("[]", true);
        java.lang.String str3 = schema2.getName();
        org.junit.Assert.assertNotNull(schema2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "union" + "'", str3, "union");
    }

    @Test
    public void test2075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SchemaM3Random300Test4.test2075");
        org.apache.avro.Schema.Parser parser0 = new org.apache.avro.Schema.Parser();
        java.util.Map<java.lang.String, org.apache.avro.Schema> strMap1 = parser0.getTypes();
        boolean boolean2 = parser0.getValidate();
        java.io.File file3 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.avro.Schema schema4 = parser0.parse(file3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strMap1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test2076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SchemaM3Random300Test4.test2076");
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
        java.util.Map<java.lang.String, org.apache.avro.Schema> strMap27 = parser25.getTypes();
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
        org.junit.Assert.assertNotNull(strMap27);
    }

    @Test
    public void test2077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SchemaM3Random300Test4.test2077");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.avro.Schema schema4 = org.apache.avro.Schema.createFixed("union type:MAP pos:-1", "{\r\n  \"type\" : \"fixed\",\r\n  \"name\" : \"union\",\r\n  \"namespace\" : \"{}\",\r\n  \"doc\" : \"hi!\",\r\n  \"size\" : 1\r\n}", "{\"type\":\"map\",\"values\":{\"type\":\"record\",\"fields\":[],\"{\\r\\n  \\\"type\\\" : \\\"fixed\\\",\\r\\n  \\\"name\\\" : \\\"union\\\",\\r\\n  \\\"namespace\\\" : \\\"[]\\\",\\r\\n  \\\"doc\\\" : \\\"[ ]\\\",\\r\\n  \\\"size\\\" : 0\\r\\n}\":\"[ ]\"}}", (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type org.apache.avro.SchemaParseException; message: Illegal character in: union type:MAP pos:-1");
        } catch (org.apache.avro.SchemaParseException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SchemaM3Random300Test4.test2078");
        org.apache.avro.Schema schema1 = org.apache.avro.Schema.parse("{\"type\":\"array\",\"items\":{\"type\":\"map\",\"values\":[]}}");
        schema1.addProp("{\r\n  \"type\" : \"map\",\r\n  \"values\" : [ ]\r\n}", "{\r\n  \"type\" : \"map\",\r\n  \"values\" : [ ]\r\n}");
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<org.apache.avro.Schema.Field> fieldList5 = schema1.getFields();
            org.junit.Assert.fail("Expected exception of type org.apache.avro.AvroRuntimeException; message: Not a record: {\"type\":\"array\",\"items\":{\"type\":\"map\",\"values\":[]},\"{\\r\\n  \\\"type\\\" : \\\"map\\\",\\r\\n  \\\"values\\\" : [ ]\\r\\n}\":\"{\\r\\n  \\\"type\\\" : \\\"map\\\",\\r\\n  \\\"values\\\" : [ ]\\r\\n}\"}");
        } catch (org.apache.avro.AvroRuntimeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(schema1);
    }

    @Test
    public void test2079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SchemaM3Random300Test4.test2079");
        org.apache.avro.Schema[] schemaArray0 = new org.apache.avro.Schema[] {};
        java.util.ArrayList<org.apache.avro.Schema> schemaList1 = new java.util.ArrayList<org.apache.avro.Schema>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<org.apache.avro.Schema>) schemaList1, schemaArray0);
        org.apache.avro.Schema schema3 = org.apache.avro.Schema.createUnion((java.util.List<org.apache.avro.Schema>) schemaList1);
        org.apache.avro.Schema schema4 = org.apache.avro.Schema.createArray(schema3);
        java.lang.String str5 = schema3.getDoc();
        org.junit.Assert.assertNotNull(schemaArray0);
        org.junit.Assert.assertArrayEquals(schemaArray0, new org.apache.avro.Schema[] {});
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(schema3);
        org.junit.Assert.assertNotNull(schema4);
        org.junit.Assert.assertNull(str5);
    }

    @Test
    public void test2080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SchemaM3Random300Test4.test2080");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.avro.Schema schema4 = org.apache.avro.Schema.createFixed("\"null\"", "[ ]", "{\r\n  \"type\" : \"array\",\r\n  \"items\" : [ ],\r\n  \"{}\" : \"hi!\"\r\n}", 0);
            org.junit.Assert.fail("Expected exception of type org.apache.avro.SchemaParseException; message: Illegal initial character: \"null\"");
        } catch (org.apache.avro.SchemaParseException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SchemaM3Random300Test4.test2081");
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
        schema6.addProp("{\"type\":\"array\",\"items\":[],\"{}\":\"hi!\"}", "{\"type\":\"float\",\"{\\r\\n  \\\"type\\\" : \\\"record\\\",\\r\\n  \\\"fields\\\" : [ ]\\r\\n}\":\"{\\r\\n  \\\"type\\\" : \\\"map\\\",\\r\\n  \\\"values\\\" : [ ]\\r\\n}\"}");
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
    }

    @Test
    public void test2082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SchemaM3Random300Test4.test2082");
        org.apache.avro.Schema schema3 = org.apache.avro.Schema.parse("{\"type\":\"array\",\"items\":\"null\"}", true);
        schema3.addProp("union type:FIXED pos:-1", "{}");
        org.apache.avro.Schema schema7 = org.apache.avro.Schema.createMap(schema3);
        org.codehaus.jackson.JsonNode jsonNode10 = org.apache.avro.Schema.parseJson("{\"type\":\"map\",\"values\":{\"type\":\"record\",\"fields\":[]}}");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.avro.Schema.Field field11 = new org.apache.avro.Schema.Field("{\"type\":\"map\",\"values\":{\"type\":\"array\",\"items\":{\"type\":\"map\",\"values\":[]},\"\":\"{\\r\\n  \\\"type\\\" : \\\"record\\\",\\r\\n  \\\"fields\\\" : [ ]\\r\\n}\"}}", schema7, "{\r\n  \"type\" : \"map\",\r\n  \"values\" : {\r\n    \"type\" : \"map\",\r\n    \"values\" : [ ]\r\n  }\r\n}", jsonNode10);
            org.junit.Assert.fail("Expected exception of type org.apache.avro.SchemaParseException; message: Illegal initial character: {\"type\":\"map\",\"values\":{\"type\":\"array\",\"items\":{\"type\":\"map\",\"values\":[]},\"\":\"{\\r\\n  \\\"type\\\" : \\\"record\\\",\\r\\n  \\\"fields\\\" : [ ]\\r\\n}\"}}");
        } catch (org.apache.avro.SchemaParseException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(schema3);
        org.junit.Assert.assertNotNull(schema7);
        org.junit.Assert.assertNotNull(jsonNode10);
    }

    @Test
    public void test2083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SchemaM3Random300Test4.test2083");
        org.apache.avro.Schema.LockableArrayList<org.codehaus.jackson.ObjectCodec> objectCodecList1 = new org.apache.avro.Schema.LockableArrayList<org.codehaus.jackson.ObjectCodec>((int) (short) 0);
        org.apache.avro.Schema.LockableArrayList<org.codehaus.jackson.ObjectCodec> objectCodecList2 = new org.apache.avro.Schema.LockableArrayList<org.codehaus.jackson.ObjectCodec>((java.util.List<org.codehaus.jackson.ObjectCodec>) objectCodecList1);
    }

    @Test
    public void test2084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SchemaM3Random300Test4.test2084");
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
        org.apache.avro.Schema.Type type19 = schema18.getType();
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
        org.junit.Assert.assertTrue("'" + type19 + "' != '" + org.apache.avro.Schema.Type.ARRAY + "'", type19.equals(org.apache.avro.Schema.Type.ARRAY));
    }

    @Test
    public void test2085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SchemaM3Random300Test4.test2085");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.avro.Schema schema4 = org.apache.avro.Schema.createRecord("{\r\n  \"type\" : \"record\",\r\n  \"fields\" : [ ],\r\n  \"{\\\"type\\\":\\\"array\\\",\\\"items\\\":[],\\\"union type:UNION pos:-1\\\":\\\"\\\"}\" : \"{null={\\\"type\\\":\\\"map\\\",\\\"values\\\":[]}}\"\r\n}", "{\"type\":\"fixed\",\"name\":\"union\",\"namespace\":\"[]\",\"doc\":\"[ ]\",\"size\":0}", "{\"type\":\"map\",\"values\":{\"type\":\"array\",\"items\":{\"type\":\"map\",\"values\":[]},\"\":\"{\\r\\n  \\\"type\\\" : \\\"record\\\",\\r\\n  \\\"fields\\\" : [ ]\\r\\n}\"}}", true);
            org.junit.Assert.fail("Expected exception of type org.apache.avro.SchemaParseException; message: Illegal initial character: {??  \"type\" : \"record\",??  \"fields\" : [ ],??  \"{\\\"type\\\":\\\"array\\\",\\\"items\\\":[],\\\"union type:UNION pos:-1\\\":\\\"\\\"}\" : \"{null={\\\"type\\\":\\\"map\\\",\\\"values\\\":[]}}\"??}");
        } catch (org.apache.avro.SchemaParseException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SchemaM3Random300Test4.test2086");
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
        java.util.Map<java.lang.String, org.apache.avro.Schema> strMap41 = parser40.getTypes();
        org.apache.avro.Schema.Parser parser42 = new org.apache.avro.Schema.Parser();
        java.util.Map<java.lang.String, org.apache.avro.Schema> strMap43 = parser42.getTypes();
        java.util.Map<java.lang.String, org.apache.avro.Schema> strMap44 = parser42.getTypes();
        org.apache.avro.Schema.Parser parser45 = new org.apache.avro.Schema.Parser();
        org.apache.avro.Schema.Parser parser47 = parser45.setValidate(true);
        java.util.Map<java.lang.String, org.apache.avro.Schema> strMap48 = parser45.getTypes();
        org.apache.avro.Schema.Parser parser49 = parser42.addTypes(strMap48);
        org.apache.avro.Schema.Parser parser51 = parser49.setValidate(true);
        org.apache.avro.Schema.Parser parser52 = new org.apache.avro.Schema.Parser();
        java.util.Map<java.lang.String, org.apache.avro.Schema> strMap53 = parser52.getTypes();
        java.util.Map<java.lang.String, org.apache.avro.Schema> strMap54 = parser52.getTypes();
        org.apache.avro.Schema.Parser parser55 = new org.apache.avro.Schema.Parser();
        java.util.Map<java.lang.String, org.apache.avro.Schema> strMap56 = parser55.getTypes();
        org.apache.avro.Schema.Parser parser57 = parser52.addTypes(strMap56);
        java.util.Map<java.lang.String, org.apache.avro.Schema> strMap58 = parser57.getTypes();
        org.apache.avro.Schema.Parser parser59 = parser51.addTypes(strMap58);
        java.util.Map<java.lang.String, org.apache.avro.Schema> strMap60 = parser51.getTypes();
        org.apache.avro.Schema.Parser parser61 = parser40.addTypes(strMap60);
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
        org.junit.Assert.assertNotNull(strMap41);
        org.junit.Assert.assertNotNull(strMap43);
        org.junit.Assert.assertNotNull(strMap44);
        org.junit.Assert.assertNotNull(parser47);
        org.junit.Assert.assertNotNull(strMap48);
        org.junit.Assert.assertNotNull(parser49);
        org.junit.Assert.assertNotNull(parser51);
        org.junit.Assert.assertNotNull(strMap53);
        org.junit.Assert.assertNotNull(strMap54);
        org.junit.Assert.assertNotNull(strMap56);
        org.junit.Assert.assertNotNull(parser57);
        org.junit.Assert.assertNotNull(strMap58);
        org.junit.Assert.assertNotNull(parser59);
        org.junit.Assert.assertNotNull(strMap60);
        org.junit.Assert.assertNotNull(parser61);
    }

    @Test
    public void test2087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SchemaM3Random300Test4.test2087");
        org.apache.avro.Schema.Parser parser0 = new org.apache.avro.Schema.Parser();
        java.util.Map<java.lang.String, org.apache.avro.Schema> strMap1 = parser0.getTypes();
        java.util.Map<java.lang.String, org.apache.avro.Schema> strMap2 = parser0.getTypes();
        org.apache.avro.Schema.Parser parser3 = new org.apache.avro.Schema.Parser();
        org.apache.avro.Schema.Parser parser5 = parser3.setValidate(true);
        java.util.Map<java.lang.String, org.apache.avro.Schema> strMap6 = parser3.getTypes();
        org.apache.avro.Schema.Parser parser7 = parser0.addTypes(strMap6);
        java.io.InputStream inputStream8 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.avro.Schema schema9 = parser7.parse(inputStream8);
            org.junit.Assert.fail("Expected exception of type java.io.EOFException; message: No content to map to Object due to end of input");
        } catch (java.io.EOFException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strMap1);
        org.junit.Assert.assertNotNull(strMap2);
        org.junit.Assert.assertNotNull(parser5);
        org.junit.Assert.assertNotNull(strMap6);
        org.junit.Assert.assertNotNull(parser7);
    }

    @Test
    public void test2088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SchemaM3Random300Test4.test2088");
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
        boolean boolean20 = parser18.getValidate();
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
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
    }

    @Test
    public void test2089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SchemaM3Random300Test4.test2089");
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
        org.apache.avro.Schema.Parser parser14 = parser11.setValidate(false);
        boolean boolean15 = parser14.getValidate();
        java.util.Map<java.lang.String, org.apache.avro.Schema> strMap16 = parser14.getTypes();
        org.apache.avro.Schema.Parser parser17 = parser10.addTypes(strMap16);
        org.junit.Assert.assertNotNull(strMap1);
        org.junit.Assert.assertNotNull(strMap2);
        org.junit.Assert.assertNotNull(parser5);
        org.junit.Assert.assertNotNull(strMap6);
        org.junit.Assert.assertNotNull(parser7);
        org.junit.Assert.assertNotNull(strMap8);
        org.junit.Assert.assertNotNull(parser10);
        org.junit.Assert.assertNotNull(strMap12);
        org.junit.Assert.assertNotNull(parser14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(strMap16);
        org.junit.Assert.assertNotNull(parser17);
    }

    @Test
    public void test2090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SchemaM3Random300Test4.test2090");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.avro.Schema.LockableArrayList<java.lang.reflect.Type> typeList1 = new org.apache.avro.Schema.LockableArrayList<java.lang.reflect.Type>((-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal Capacity: -1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SchemaM3Random300Test4.test2091");
        org.apache.avro.Schema.Parser parser0 = new org.apache.avro.Schema.Parser();
        org.apache.avro.Schema.Parser parser2 = parser0.setValidate(true);
        java.util.Map<java.lang.String, org.apache.avro.Schema> strMap3 = parser0.getTypes();
        org.apache.avro.Schema schema5 = parser0.parse("{\"type\":\"array\",\"items\":{\"type\":\"map\",\"values\":[]}}");
        java.lang.String str7 = schema5.toString(true);
        org.junit.Assert.assertNotNull(parser2);
        org.junit.Assert.assertNotNull(strMap3);
        org.junit.Assert.assertNotNull(schema5);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "{\r\n  \"type\" : \"array\",\r\n  \"items\" : {\r\n    \"type\" : \"map\",\r\n    \"values\" : [ ]\r\n  }\r\n}" + "'", str7, "{\r\n  \"type\" : \"array\",\r\n  \"items\" : {\r\n    \"type\" : \"map\",\r\n    \"values\" : [ ]\r\n  }\r\n}");
    }

    @Test
    public void test2092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SchemaM3Random300Test4.test2092");
        org.apache.avro.Schema[] schemaArray0 = new org.apache.avro.Schema[] {};
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
        org.apache.avro.Schema[] schemaArray23 = new org.apache.avro.Schema[] {};
        java.util.ArrayList<org.apache.avro.Schema> schemaList24 = new java.util.ArrayList<org.apache.avro.Schema>();
        boolean boolean25 = java.util.Collections.addAll((java.util.Collection<org.apache.avro.Schema>) schemaList24, schemaArray23);
        org.apache.avro.Schema schema26 = org.apache.avro.Schema.createUnion((java.util.List<org.apache.avro.Schema>) schemaList24);
        org.apache.avro.Schema[] schemaArray27 = new org.apache.avro.Schema[] {};
        java.util.ArrayList<org.apache.avro.Schema> schemaList28 = new java.util.ArrayList<org.apache.avro.Schema>();
        boolean boolean29 = java.util.Collections.addAll((java.util.Collection<org.apache.avro.Schema>) schemaList28, schemaArray27);
        org.apache.avro.Schema schema30 = org.apache.avro.Schema.createUnion((java.util.List<org.apache.avro.Schema>) schemaList28);
        org.apache.avro.Schema schema31 = org.apache.avro.Schema.applyAliases(schema26, schema30);
        java.util.List<org.apache.avro.Schema> schemaList32 = schema31.getTypes();
        org.apache.avro.Schema[] schemaArray33 = new org.apache.avro.Schema[] {};
        java.util.ArrayList<org.apache.avro.Schema> schemaList34 = new java.util.ArrayList<org.apache.avro.Schema>();
        boolean boolean35 = java.util.Collections.addAll((java.util.Collection<org.apache.avro.Schema>) schemaList34, schemaArray33);
        org.apache.avro.Schema schema36 = org.apache.avro.Schema.createUnion((java.util.List<org.apache.avro.Schema>) schemaList34);
        org.apache.avro.Schema[] schemaArray37 = new org.apache.avro.Schema[] {};
        java.util.ArrayList<org.apache.avro.Schema> schemaList38 = new java.util.ArrayList<org.apache.avro.Schema>();
        boolean boolean39 = java.util.Collections.addAll((java.util.Collection<org.apache.avro.Schema>) schemaList38, schemaArray37);
        org.apache.avro.Schema schema40 = org.apache.avro.Schema.createUnion((java.util.List<org.apache.avro.Schema>) schemaList38);
        org.apache.avro.Schema schema41 = org.apache.avro.Schema.applyAliases(schema36, schema40);
        org.apache.avro.Schema schema42 = org.apache.avro.Schema.applyAliases(schema31, schema40);
        org.apache.avro.Schema schema43 = org.apache.avro.Schema.createMap(schema31);
        org.apache.avro.Schema schema44 = org.apache.avro.Schema.createArray(schema43);
        java.lang.String str45 = schema43.toString();
        java.lang.String str47 = schema43.getProp("{\"type\":\"map\",\"values\":[]}");
        java.lang.String str49 = schema43.getProp("[ ]");
        org.apache.avro.Schema schema50 = org.apache.avro.Schema.applyAliases(schema8, schema43);
        java.lang.String str51 = schema50.getName();
        org.junit.Assert.assertNotNull(schemaArray0);
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
        org.junit.Assert.assertNotNull(schemaArray23);
        org.junit.Assert.assertArrayEquals(schemaArray23, new org.apache.avro.Schema[] {});
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(schema26);
        org.junit.Assert.assertNotNull(schemaArray27);
        org.junit.Assert.assertArrayEquals(schemaArray27, new org.apache.avro.Schema[] {});
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNotNull(schema30);
        org.junit.Assert.assertNotNull(schema31);
        org.junit.Assert.assertNotNull(schemaList32);
        org.junit.Assert.assertNotNull(schemaArray33);
        org.junit.Assert.assertArrayEquals(schemaArray33, new org.apache.avro.Schema[] {});
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertNotNull(schema36);
        org.junit.Assert.assertNotNull(schemaArray37);
        org.junit.Assert.assertArrayEquals(schemaArray37, new org.apache.avro.Schema[] {});
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertNotNull(schema40);
        org.junit.Assert.assertNotNull(schema41);
        org.junit.Assert.assertNotNull(schema42);
        org.junit.Assert.assertNotNull(schema43);
        org.junit.Assert.assertNotNull(schema44);
        org.junit.Assert.assertEquals("'" + str45 + "' != '" + "{\"type\":\"map\",\"values\":[]}" + "'", str45, "{\"type\":\"map\",\"values\":[]}");
        org.junit.Assert.assertNull(str47);
        org.junit.Assert.assertNull(str49);
        org.junit.Assert.assertNotNull(schema50);
        org.junit.Assert.assertEquals("'" + str51 + "' != '" + "union" + "'", str51, "union");
    }

    @Test
    public void test2093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SchemaM3Random300Test4.test2093");
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
        names0.space("union type:UNION pos:-1");
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
    }

    @Test
    public void test2094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SchemaM3Random300Test4.test2094");
        org.apache.avro.Schema[] schemaArray0 = new org.apache.avro.Schema[] {};
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
        java.lang.String str31 = schema23.toString(true);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.avro.Schema.Field field33 = schema23.getField("{\"type\":\"fixed\",\"name\":\"union\",\"namespace\":\"union type:UNION pos:-1\",\"doc\":\"\",\"size\":10}");
            org.junit.Assert.fail("Expected exception of type org.apache.avro.AvroRuntimeException; message: Not a record: {\"type\":\"array\",\"items\":[],\"{}\":\"hi!\"}");
        } catch (org.apache.avro.AvroRuntimeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(schemaArray0);
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
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "{\r\n  \"type\" : \"array\",\r\n  \"items\" : [ ],\r\n  \"{}\" : \"hi!\"\r\n}" + "'", str31, "{\r\n  \"type\" : \"array\",\r\n  \"items\" : [ ],\r\n  \"{}\" : \"hi!\"\r\n}");
    }

    @Test
    public void test2095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SchemaM3Random300Test4.test2095");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.avro.Schema schema2 = org.apache.avro.Schema.parse("{null=[]}", false);
            org.junit.Assert.fail("Expected exception of type org.apache.avro.SchemaParseException; message: org.codehaus.jackson.JsonParseException: Unexpected character ('n' (code 110)): was expecting double-quote to start field name? at [Source: java.io.StringReader@7b1f96b3; line: 1, column: 3]");
        } catch (org.apache.avro.SchemaParseException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SchemaM3Random300Test4.test2096");
        org.apache.avro.Schema.Parser parser0 = new org.apache.avro.Schema.Parser();
        java.util.Map<java.lang.String, org.apache.avro.Schema> strMap1 = parser0.getTypes();
        boolean boolean2 = parser0.getValidate();
        org.apache.avro.Schema schema4 = parser0.parse("{\"type\":\"map\",\"values\":[]}");
        java.io.File file5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.avro.Schema schema6 = parser0.parse(file5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strMap1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(schema4);
    }

    @Test
    public void test2097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SchemaM3Random300Test4.test2097");
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
        java.lang.Object obj22 = null;
        boolean boolean23 = names0.containsValue(obj22);
        java.lang.String str24 = names0.space();
        java.util.Collection<org.apache.avro.Schema> schemaCollection25 = names0.values();
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
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "[ ]" + "'", str24, "[ ]");
        org.junit.Assert.assertNotNull(schemaCollection25);
    }

    @Test
    public void test2098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SchemaM3Random300Test4.test2098");
        java.lang.String[] strArray4 = new java.lang.String[] { "" };
        java.util.ArrayList<java.lang.String> strList5 = new java.util.ArrayList<java.lang.String>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList5, strArray4);
        org.apache.avro.Schema.LockableArrayList<java.lang.String> strList7 = new org.apache.avro.Schema.LockableArrayList<java.lang.String>((java.util.List<java.lang.String>) strList5);
        org.apache.avro.Schema.LockableArrayList<java.lang.String> strList8 = new org.apache.avro.Schema.LockableArrayList<java.lang.String>((java.util.List<java.lang.String>) strList5);
        org.apache.avro.Schema.LockableArrayList<java.lang.String> strList9 = new org.apache.avro.Schema.LockableArrayList<java.lang.String>((java.util.List<java.lang.String>) strList8);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.avro.Schema schema10 = org.apache.avro.Schema.createEnum("", "int type:FIXED pos:-1", "{\r\n  \"type\" : \"fixed\",\r\n  \"name\" : \"union\",\r\n  \"namespace\" : \"[]\",\r\n  \"doc\" : \"[ ]\",\r\n  \"size\" : 0\r\n}", (java.util.List<java.lang.String>) strList8);
            org.junit.Assert.fail("Expected exception of type org.apache.avro.SchemaParseException; message: Empty name");
        } catch (org.apache.avro.SchemaParseException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertArrayEquals(strArray4, new java.lang.String[] { "" });
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test2099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SchemaM3Random300Test4.test2099");
        org.apache.avro.Schema.LockableArrayList<java.lang.reflect.AnnotatedElement> annotatedElementList0 = new org.apache.avro.Schema.LockableArrayList<java.lang.reflect.AnnotatedElement>();
        org.apache.avro.Schema.LockableArrayList<java.lang.reflect.AnnotatedElement> annotatedElementList1 = new org.apache.avro.Schema.LockableArrayList<java.lang.reflect.AnnotatedElement>((java.util.List<java.lang.reflect.AnnotatedElement>) annotatedElementList0);
    }

    @Test
    public void test2100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SchemaM3Random300Test4.test2100");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.avro.Schema schema4 = org.apache.avro.Schema.createFixed("{}", "", "{\"type\":\"record\",\"fields\":[],\"{\\r\\n  \\\"type\\\" : \\\"fixed\\\",\\r\\n  \\\"name\\\" : \\\"union\\\",\\r\\n  \\\"namespace\\\" : \\\"[]\\\",\\r\\n  \\\"doc\\\" : \\\"[ ]\\\",\\r\\n  \\\"size\\\" : 0\\r\\n}\":\"[ ]\"}", 0);
            org.junit.Assert.fail("Expected exception of type org.apache.avro.SchemaParseException; message: Illegal initial character: {}");
        } catch (org.apache.avro.SchemaParseException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SchemaM3Random300Test4.test2101");
        org.apache.avro.Schema.Type type0 = org.apache.avro.Schema.Type.INT;
        org.apache.avro.Schema schema1 = org.apache.avro.Schema.create(type0);
        org.apache.avro.Schema schema2 = org.apache.avro.Schema.createArray(schema1);
        org.apache.avro.Schema schema3 = org.apache.avro.Schema.createArray(schema1);
        org.apache.avro.Schema schema4 = org.apache.avro.Schema.createMap(schema1);
        org.apache.avro.Schema schema5 = org.apache.avro.Schema.createArray(schema4);
        org.junit.Assert.assertTrue("'" + type0 + "' != '" + org.apache.avro.Schema.Type.INT + "'", type0.equals(org.apache.avro.Schema.Type.INT));
        org.junit.Assert.assertNotNull(schema1);
        org.junit.Assert.assertNotNull(schema2);
        org.junit.Assert.assertNotNull(schema3);
        org.junit.Assert.assertNotNull(schema4);
        org.junit.Assert.assertNotNull(schema5);
    }
}

