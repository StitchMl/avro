package org.apache.avro;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class ErrorTest0 {

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
    public void test01() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test01");
        org.apache.avro.Schema schema4 = org.apache.avro.Schema.createRecord("map", "", "hi!", false);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.List<org.apache.avro.Schema> schemaList5 = schema4.getTypes();
    }

    @Test
    public void test02() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test02");
        org.apache.avro.Schema schema4 = org.apache.avro.Schema.createRecord("float", "{\"type\":\"array\",\"items\":[]}", "float", true);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int5 = schema4.getFixedSize();
    }

    @Test
    public void test03() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test03");
        org.apache.avro.Schema schema4 = org.apache.avro.Schema.createRecord("[].union", "union", "hi!", true);
        org.apache.avro.Schema.Type type5 = schema4.getType();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on schema4 and schema4", schema4.equals(schema4) ? schema4.hashCode() == schema4.hashCode() : true);
    }

    @Test
    public void test04() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test04");
        org.apache.avro.Schema.LockableArrayList<java.lang.String> strList3 = new org.apache.avro.Schema.LockableArrayList<java.lang.String>();
        org.apache.avro.Schema.LockableArrayList<java.lang.String> strList4 = new org.apache.avro.Schema.LockableArrayList<java.lang.String>((java.util.List<java.lang.String>) strList3);
        org.apache.avro.Schema schema5 = org.apache.avro.Schema.createEnum("[].union", "{}", "[].union", (java.util.List<java.lang.String>) strList4);
        org.apache.avro.Schema schema6 = org.apache.avro.Schema.createMap(schema5);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int8 = schema5.getEnumOrdinal("{\r\n  \"type\" : \"map\",\r\n  \"values\" : {\r\n    \"type\" : \"map\",\r\n    \"values\" : [ ]\r\n  }\r\n}");
    }

    @Test
    public void test05() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test05");
        org.apache.avro.Schema schema4 = org.apache.avro.Schema.createRecord("map", "", "hi!", false);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean6 = schema4.hasEnumSymbol("union");
    }

    @Test
    public void test06() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test06");
        org.apache.avro.Schema schema4 = org.apache.avro.Schema.createRecord("float", "{\"type\":\"map\",\"values\":[]}", "double", false);
        java.lang.String str5 = schema4.getFullName();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on schema4 and schema4", schema4.equals(schema4) ? schema4.hashCode() == schema4.hashCode() : true);
    }

    @Test
    public void test07() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test07");
        org.apache.avro.Schema schema4 = org.apache.avro.Schema.createRecord("[].union", "union", "union type:MAP pos:-1", false);
        java.lang.String str5 = schema4.getNamespace();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on schema4 and schema4", schema4.equals(schema4) ? schema4.hashCode() == schema4.hashCode() : true);
    }

    @Test
    public void test08() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test08");
        org.apache.avro.Schema.LockableArrayList<java.lang.String> strList3 = new org.apache.avro.Schema.LockableArrayList<java.lang.String>();
        org.apache.avro.Schema.LockableArrayList<java.lang.String> strList4 = new org.apache.avro.Schema.LockableArrayList<java.lang.String>((java.util.List<java.lang.String>) strList3);
        org.apache.avro.Schema schema5 = org.apache.avro.Schema.createEnum("[].union", "{}", "[].union", (java.util.List<java.lang.String>) strList4);
        org.apache.avro.Schema schema6 = org.apache.avro.Schema.createMap(schema5);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int8 = schema5.getEnumOrdinal("union type:UNION pos:-1");
    }

    @Test
    public void test09() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test09");
        org.apache.avro.Schema schema4 = org.apache.avro.Schema.createRecord("[].union", "union", "{\r\n  \"type\" : \"map\",\r\n  \"values\" : [ ]\r\n}", false);
        boolean boolean5 = schema4.isError();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on schema4 and schema4", schema4.equals(schema4) ? schema4.hashCode() == schema4.hashCode() : true);
    }

    @Test
    public void test10() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test10");
        org.apache.avro.Schema schema1 = org.apache.avro.Schema.parse("{\"type\":\"map\",\"values\":{\"type\":\"array\",\"items\":{\"type\":\"map\",\"values\":[]}}}");
        org.apache.avro.Schema schema6 = org.apache.avro.Schema.createRecord("[].union", "{\"type\":\"fixed\",\"name\":\"union\",\"namespace\":\"[]\",\"doc\":\"[ ]\",\"size\":0}", "{\"type\":\"map\",\"values\":{\"type\":\"array\",\"items\":{\"type\":\"map\",\"values\":[]}}}", true);
        boolean boolean7 = schema1.equals((java.lang.Object) "{\"type\":\"fixed\",\"name\":\"union\",\"namespace\":\"[]\",\"doc\":\"[ ]\",\"size\":0}");
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on schema6 and schema6", schema6.equals(schema6) ? schema6.hashCode() == schema6.hashCode() : true);
    }

    @Test
    public void test11() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test11");
        org.apache.avro.Schema schema4 = org.apache.avro.Schema.createRecord("[].union", "union", "hi!", true);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int5 = schema4.getFixedSize();
    }

    @Test
    public void test12() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test12");
        org.apache.avro.Schema schema4 = org.apache.avro.Schema.createRecord("float", "", "{\r\n  \"type\" : \"map\",\r\n  \"values\" : {\r\n    \"type\" : \"map\",\r\n    \"values\" : [ ]\r\n  }\r\n}", true);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.List<org.apache.avro.Schema> schemaList5 = schema4.getTypes();
    }

    @Test
    public void test13() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test13");
        org.apache.avro.Schema schema4 = org.apache.avro.Schema.createRecord("map", "{\r\n  \"type\" : \"fixed\",\r\n  \"name\" : \"union\",\r\n  \"namespace\" : \"[]\",\r\n  \"doc\" : \"[ ]\",\r\n  \"size\" : 0\r\n}", "map", true);
        org.apache.avro.Schema.Type type5 = schema4.getType();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on schema4 and schema4", schema4.equals(schema4) ? schema4.hashCode() == schema4.hashCode() : true);
    }

    @Test
    public void test14() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test14");
        org.apache.avro.Schema schema4 = org.apache.avro.Schema.createRecord("map", "{\r\n  \"type\" : \"fixed\",\r\n  \"name\" : \"union\",\r\n  \"namespace\" : \"[]\",\r\n  \"doc\" : \"[ ]\",\r\n  \"size\" : 0\r\n}", "map", true);
        java.lang.String str5 = schema4.getName();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on schema4 and schema4", schema4.equals(schema4) ? schema4.hashCode() == schema4.hashCode() : true);
    }

    @Test
    public void test15() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test15");
        org.apache.avro.Schema schema4 = org.apache.avro.Schema.createRecord("[].union", "union", "union type:MAP pos:-1", false);
        schema4.addProp("", "{\"type\":\"array\",\"items\":[]}");
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on schema4 and schema4", schema4.equals(schema4) ? schema4.hashCode() == schema4.hashCode() : true);
    }

    @Test
    public void test16() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test16");
        org.apache.avro.Schema schema4 = org.apache.avro.Schema.createRecord("double", "{\r\n  \"type\" : \"map\",\r\n  \"values\" : {\r\n    \"type\" : \"map\",\r\n    \"values\" : [ ]\r\n  }\r\n}", "", true);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str6 = schema4.toString(false);
    }

    @Test
    public void test17() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test17");
        org.apache.avro.Schema schema4 = org.apache.avro.Schema.createRecord("[].union", "union", "union type:MAP pos:-1", false);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.avro.Schema schema5 = schema4.getElementType();
    }

    @Test
    public void test18() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test18");
        org.apache.avro.Schema schema4 = org.apache.avro.Schema.createRecord("[].union", "{\r\n  \"type\" : \"array\",\r\n  \"items\" : {\r\n    \"type\" : \"map\",\r\n    \"values\" : [ ]\r\n  }\r\n}", "{\r\n  \"type\" : \"fixed\",\r\n  \"name\" : \"union\",\r\n  \"namespace\" : \"[]\",\r\n  \"doc\" : \"[ ]\",\r\n  \"size\" : 0\r\n}", false);
        java.util.List<org.apache.avro.Schema.Field> fieldList5 = schema4.getFields();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on schema4 and schema4", schema4.equals(schema4) ? schema4.hashCode() == schema4.hashCode() : true);
    }

    @Test
    public void test19() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test19");
        org.apache.avro.Schema schema4 = org.apache.avro.Schema.createRecord("[].union", "union", "union type:MAP pos:-1", false);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean6 = schema4.hasEnumSymbol("{\"type\":\"double\",\"float\":\"{\\\"type\\\":\\\"array\\\",\\\"items\\\":[]}\"}");
    }

    @Test
    public void test20() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test20");
        org.apache.avro.Schema schema4 = org.apache.avro.Schema.createRecord("float", "int", "map", false);
        boolean boolean5 = schema4.isError();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on schema4 and schema4", schema4.equals(schema4) ? schema4.hashCode() == schema4.hashCode() : true);
    }

    @Test
    public void test21() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test21");
        org.apache.avro.Schema schema4 = org.apache.avro.Schema.createRecord("[].union", "union", "{\r\n  \"type\" : \"map\",\r\n  \"values\" : [ ]\r\n}", false);
        org.apache.avro.Schema.Type type5 = schema4.getType();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on schema4 and schema4", schema4.equals(schema4) ? schema4.hashCode() == schema4.hashCode() : true);
    }

    @Test
    public void test22() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test22");
        org.apache.avro.Schema schema4 = org.apache.avro.Schema.createRecord("union", "{\"type\":\"array\",\"items\":[],\"union type:UNION pos:-1\":\"\"}", "\"double\"", true);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int6 = schema4.getEnumOrdinal("union");
    }

    @Test
    public void test23() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test23");
        org.apache.avro.Schema schema4 = org.apache.avro.Schema.createRecord("double", "{\"type\":\"map\",\"values\":[]}", "[]", true);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.avro.Schema schema5 = schema4.getValueType();
    }

    @Test
    public void test24() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test24");
        org.apache.avro.Schema schema4 = org.apache.avro.Schema.createRecord("[].union", "union", "{\r\n  \"type\" : \"map\",\r\n  \"values\" : [ ]\r\n}", false);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.List<org.apache.avro.Schema> schemaList5 = schema4.getTypes();
    }

    @Test
    public void test25() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test25");
        org.apache.avro.Schema schema4 = org.apache.avro.Schema.createRecord("float", "", "{\r\n  \"type\" : \"map\",\r\n  \"values\" : {\r\n    \"type\" : \"map\",\r\n    \"values\" : [ ]\r\n  }\r\n}", true);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int5 = schema4.getFixedSize();
    }

    @Test
    public void test26() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test26");
        org.apache.avro.Schema schema4 = org.apache.avro.Schema.createRecord("float", "", "{\r\n  \"type\" : \"map\",\r\n  \"values\" : {\r\n    \"type\" : \"map\",\r\n    \"values\" : [ ]\r\n  }\r\n}", true);
        java.util.Set<java.lang.String> strSet5 = schema4.getAliases();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on schema4 and schema4", schema4.equals(schema4) ? schema4.hashCode() == schema4.hashCode() : true);
    }

    @Test
    public void test27() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test27");
        org.apache.avro.Schema.LockableArrayList<java.lang.String> strList7 = new org.apache.avro.Schema.LockableArrayList<java.lang.String>((int) (byte) 10);
        org.apache.avro.Schema schema8 = org.apache.avro.Schema.createEnum("[].union", "union type:UNION pos:-1", "union type:UNION pos:-1", (java.util.List<java.lang.String>) strList7);
        java.util.List<java.lang.String> strList9 = schema8.getEnumSymbols();
        org.apache.avro.Schema schema10 = org.apache.avro.Schema.createEnum("map", "\"null\"", "{}", strList9);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int12 = schema10.getEnumOrdinal("{\"type\":\"fixed\",\"name\":\"union\",\"namespace\":\"union type:UNION pos:-1\",\"doc\":\"\",\"size\":10}");
    }

    @Test
    public void test28() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test28");
        org.apache.avro.Schema schema4 = org.apache.avro.Schema.createRecord("double", "", "{\"type\":\"record\",\"fields\":[]}", false);
        java.lang.String str5 = schema4.getNamespace();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on schema4 and schema4", schema4.equals(schema4) ? schema4.hashCode() == schema4.hashCode() : true);
    }

    @Test
    public void test29() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test29");
        org.apache.avro.Schema schema4 = org.apache.avro.Schema.createRecord("float", "{\"type\":\"map\",\"values\":[]}", "double", false);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int5 = schema4.getFixedSize();
    }

    @Test
    public void test30() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test30");
        org.apache.avro.Schema schema4 = org.apache.avro.Schema.createRecord("double", "{\r\n  \"type\" : \"map\",\r\n  \"values\" : {\r\n    \"type\" : \"map\",\r\n    \"values\" : [ ]\r\n  }\r\n}", "", true);
        org.apache.avro.Schema.Parser parser5 = new org.apache.avro.Schema.Parser();
        java.util.Map<java.lang.String, org.apache.avro.Schema> strMap6 = parser5.getTypes();
        java.util.Map<java.lang.String, org.apache.avro.Schema> strMap7 = parser5.getTypes();
        org.apache.avro.Schema.Parser parser8 = new org.apache.avro.Schema.Parser();
        java.util.Map<java.lang.String, org.apache.avro.Schema> strMap9 = parser8.getTypes();
        org.apache.avro.Schema.Parser parser10 = parser5.addTypes(strMap9);
        org.apache.avro.Schema schema12 = parser5.parse("{\r\n  \"type\" : \"map\",\r\n  \"values\" : [ ]\r\n}");
        org.apache.avro.Schema schema13 = schema12.getValueType();
        java.lang.String str14 = schema12.getName();
        org.apache.avro.Schema schema15 = schema12.getValueType();
        org.apache.avro.Schema schema16 = org.apache.avro.Schema.applyAliases(schema4, schema12);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on schema16 and schema16", schema16.equals(schema16) ? schema16.hashCode() == schema16.hashCode() : true);
    }

    @Test
    public void test31() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test31");
        org.apache.avro.Schema schema4 = org.apache.avro.Schema.createRecord("double", "{\"type\":\"map\",\"values\":[]}", "[]", true);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int5 = schema4.getFixedSize();
    }

    @Test
    public void test32() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test32");
        org.apache.avro.Schema schema4 = org.apache.avro.Schema.createRecord("double", "", "{\"type\":\"record\",\"fields\":[]}", false);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.List<java.lang.String> strList5 = schema4.getEnumSymbols();
    }

    @Test
    public void test33() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test33");
        org.apache.avro.Schema.Names names1 = new org.apache.avro.Schema.Names("{\"type\":\"array\",\"items\":{\"type\":\"map\",\"values\":[]}}");
        org.apache.avro.Schema.LockableArrayList<java.lang.String> strList3 = new org.apache.avro.Schema.LockableArrayList<java.lang.String>((int) '#');
        org.apache.avro.Schema.LockableArrayList<java.lang.String> strList4 = new org.apache.avro.Schema.LockableArrayList<java.lang.String>((java.util.List<java.lang.String>) strList3);
        org.apache.avro.Schema.LockableArrayList<java.lang.String> strList5 = new org.apache.avro.Schema.LockableArrayList<java.lang.String>((java.util.List<java.lang.String>) strList3);
        org.apache.avro.Schema.LockableArrayList<java.lang.String> strList6 = new org.apache.avro.Schema.LockableArrayList<java.lang.String>((java.util.List<java.lang.String>) strList5);
        org.apache.avro.Schema schema11 = org.apache.avro.Schema.createRecord("union", "{\r\n  \"type\" : \"array\",\r\n  \"items\" : [ ]\r\n}", "{\r\n  \"type\" : \"array\",\r\n  \"items\" : [ ]\r\n}", true);
        org.apache.avro.Schema schema12 = names1.getOrDefault((java.lang.Object) strList6, schema11);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on schema12 and schema12", schema12.equals(schema12) ? schema12.hashCode() == schema12.hashCode() : true);
    }

    @Test
    public void test34() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test34");
        org.apache.avro.Schema schema4 = org.apache.avro.Schema.createRecord(".map", "{\"type\":\"fixed\",\"name\":\"union\",\"namespace\":\"[]\",\"doc\":\"[ ]\",\"size\":0,\"aliases\":[\"union\"]}", "{\r\n  \"type\" : \"fixed\",\r\n  \"name\" : \"union\",\r\n  \"namespace\" : \"[]\",\r\n  \"doc\" : \"[ ]\",\r\n  \"size\" : 0,\r\n  \"{\\r\\n  \\\"type\\\" : \\\"fixed\\\",\\r\\n  \\\"name\\\" : \\\"union\\\",\\r\\n  \\\"namespace\\\" : \\\"[]\\\",\\r\\n  \\\"doc\\\" : \\\"[ ]\\\",\\r\\n  \\\"size\\\" : 0\\r\\n}\" : \"{\\r\\n  \\\"type\\\" : \\\"map\\\",\\r\\n  \\\"values\\\" : {\\r\\n    \\\"type\\\" : \\\"map\\\",\\r\\n    \\\"values\\\" : [ ]\\r\\n  }\\r\\n}\"\r\n}", false);
        org.apache.avro.Schema schema5 = org.apache.avro.Schema.createMap(schema4);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on schema4 and schema4", schema4.equals(schema4) ? schema4.hashCode() == schema4.hashCode() : true);
    }
}

