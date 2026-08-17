package com.milestone4.auto.randoop;

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
        org.apache.avro.Schema.Field[] fieldArray0 = new org.apache.avro.Schema.Field[] {};
        java.util.ArrayList<org.apache.avro.Schema.Field> fieldList1 = new java.util.ArrayList<org.apache.avro.Schema.Field>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<org.apache.avro.Schema.Field>) fieldList1, fieldArray0);
        org.apache.avro.Schema schema3 = org.apache.avro.Schema.createRecord((java.util.List<org.apache.avro.Schema.Field>) fieldList1);
        org.apache.avro.Schema.Type type4 = schema3.getType();
        org.apache.avro.Schema.Field[] fieldArray5 = new org.apache.avro.Schema.Field[] {};
        java.util.ArrayList<org.apache.avro.Schema.Field> fieldList6 = new java.util.ArrayList<org.apache.avro.Schema.Field>();
        boolean boolean7 = java.util.Collections.addAll((java.util.Collection<org.apache.avro.Schema.Field>) fieldList6, fieldArray5);
        org.apache.avro.Schema schema8 = org.apache.avro.Schema.createRecord((java.util.List<org.apache.avro.Schema.Field>) fieldList6);
        boolean boolean9 = schema3.equals((java.lang.Object) schema8);
        org.apache.avro.Schema schema10 = org.apache.avro.Schema.createArray(schema3);
        org.apache.avro.Schema schema11 = org.apache.avro.Schema.createMap(schema3);
        java.util.List<org.apache.avro.Schema.Field> fieldList12 = schema3.getFields();
        org.apache.avro.Schema.Field[] fieldArray13 = new org.apache.avro.Schema.Field[] {};
        java.util.ArrayList<org.apache.avro.Schema.Field> fieldList14 = new java.util.ArrayList<org.apache.avro.Schema.Field>();
        boolean boolean15 = java.util.Collections.addAll((java.util.Collection<org.apache.avro.Schema.Field>) fieldList14, fieldArray13);
        org.apache.avro.Schema schema16 = org.apache.avro.Schema.createRecord((java.util.List<org.apache.avro.Schema.Field>) fieldList14);
        org.apache.avro.Schema.Type type17 = schema16.getType();
        org.apache.avro.generic.GenericData.EnumSymbol enumSymbol19 = new org.apache.avro.generic.GenericData.EnumSymbol(schema16, "hi!");
        boolean boolean20 = schema16.isError();
        java.lang.String str21 = schema16.getFullName();
        java.lang.String str22 = schema16.getName();
        java.lang.String str24 = schema16.getProp("[]");
        org.apache.avro.Schema schema25 = org.apache.avro.Schema.applyAliases(schema3, schema16);
        org.apache.avro.generic.GenericData.Record record26 = new org.apache.avro.generic.GenericData.Record(schema16);
        org.apache.avro.Schema.Field[] fieldArray28 = new org.apache.avro.Schema.Field[] {};
        java.util.ArrayList<org.apache.avro.Schema.Field> fieldList29 = new java.util.ArrayList<org.apache.avro.Schema.Field>();
        boolean boolean30 = java.util.Collections.addAll((java.util.Collection<org.apache.avro.Schema.Field>) fieldList29, fieldArray28);
        java.util.stream.Stream<org.apache.avro.Schema.Field> fieldStream31 = fieldList29.parallelStream();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        record26.put("array type:RECORD pos:-1", (java.lang.Object) fieldStream31);
    }

    @Test
    public void test02() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test02");
        org.apache.avro.Schema schema4 = org.apache.avro.Schema.createRecord("null", "", "array", true);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str5 = schema4.toString();
    }

    @Test
    public void test03() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test03");
        org.apache.avro.Schema.Field[] fieldArray1 = new org.apache.avro.Schema.Field[] {};
        java.util.ArrayList<org.apache.avro.Schema.Field> fieldList2 = new java.util.ArrayList<org.apache.avro.Schema.Field>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<org.apache.avro.Schema.Field>) fieldList2, fieldArray1);
        org.apache.avro.Schema schema4 = org.apache.avro.Schema.createRecord((java.util.List<org.apache.avro.Schema.Field>) fieldList2);
        org.apache.avro.Schema.Type type5 = schema4.getType();
        org.apache.avro.Schema.Field[] fieldArray6 = new org.apache.avro.Schema.Field[] {};
        java.util.ArrayList<org.apache.avro.Schema.Field> fieldList7 = new java.util.ArrayList<org.apache.avro.Schema.Field>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<org.apache.avro.Schema.Field>) fieldList7, fieldArray6);
        org.apache.avro.Schema schema9 = org.apache.avro.Schema.createRecord((java.util.List<org.apache.avro.Schema.Field>) fieldList7);
        boolean boolean10 = schema4.equals((java.lang.Object) schema9);
        org.apache.avro.Schema schema11 = org.apache.avro.Schema.createArray(schema4);
        java.lang.String str12 = schema11.getName();
        org.apache.avro.generic.GenericData.Array<org.apache.avro.Schema.Type> typeList13 = new org.apache.avro.generic.GenericData.Array<org.apache.avro.Schema.Type>(0, schema11);
        org.apache.avro.Schema.Type type14 = typeList13.peek();
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on fieldList2 and typeList13.", fieldList2.equals(typeList13) == typeList13.equals(fieldList2));
    }

    @Test
    public void test04() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test04");
        org.apache.avro.Schema.Field[] fieldArray1 = new org.apache.avro.Schema.Field[] {};
        java.util.ArrayList<org.apache.avro.Schema.Field> fieldList2 = new java.util.ArrayList<org.apache.avro.Schema.Field>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<org.apache.avro.Schema.Field>) fieldList2, fieldArray1);
        org.apache.avro.Schema schema4 = org.apache.avro.Schema.createRecord((java.util.List<org.apache.avro.Schema.Field>) fieldList2);
        org.apache.avro.Schema.Type type5 = schema4.getType();
        org.apache.avro.Schema.Field[] fieldArray6 = new org.apache.avro.Schema.Field[] {};
        java.util.ArrayList<org.apache.avro.Schema.Field> fieldList7 = new java.util.ArrayList<org.apache.avro.Schema.Field>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<org.apache.avro.Schema.Field>) fieldList7, fieldArray6);
        org.apache.avro.Schema schema9 = org.apache.avro.Schema.createRecord((java.util.List<org.apache.avro.Schema.Field>) fieldList7);
        boolean boolean10 = schema4.equals((java.lang.Object) schema9);
        org.apache.avro.Schema schema11 = org.apache.avro.Schema.createArray(schema4);
        java.lang.String str12 = schema11.getName();
        org.apache.avro.generic.GenericData.Array<org.apache.avro.Schema.Type> typeList13 = new org.apache.avro.generic.GenericData.Array<org.apache.avro.Schema.Type>(0, schema11);
        int int14 = typeList13.size();
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on fieldList2 and typeList13.", fieldList2.equals(typeList13) == typeList13.equals(fieldList2));
    }

    @Test
    public void test05() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test05");
        org.apache.avro.Schema.Field[] fieldArray1 = new org.apache.avro.Schema.Field[] {};
        java.util.ArrayList<org.apache.avro.Schema.Field> fieldList2 = new java.util.ArrayList<org.apache.avro.Schema.Field>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<org.apache.avro.Schema.Field>) fieldList2, fieldArray1);
        org.apache.avro.Schema schema4 = org.apache.avro.Schema.createRecord((java.util.List<org.apache.avro.Schema.Field>) fieldList2);
        org.apache.avro.Schema.Type type5 = schema4.getType();
        org.apache.avro.Schema.Field[] fieldArray6 = new org.apache.avro.Schema.Field[] {};
        java.util.ArrayList<org.apache.avro.Schema.Field> fieldList7 = new java.util.ArrayList<org.apache.avro.Schema.Field>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<org.apache.avro.Schema.Field>) fieldList7, fieldArray6);
        org.apache.avro.Schema schema9 = org.apache.avro.Schema.createRecord((java.util.List<org.apache.avro.Schema.Field>) fieldList7);
        boolean boolean10 = schema4.equals((java.lang.Object) schema9);
        org.apache.avro.Schema schema11 = org.apache.avro.Schema.createArray(schema4);
        java.lang.String str12 = schema11.getName();
        org.apache.avro.generic.GenericData.Array<org.apache.avro.Schema.Type> typeList13 = new org.apache.avro.generic.GenericData.Array<org.apache.avro.Schema.Type>(0, schema11);
        typeList13.clear();
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on fieldList2 and typeList13.", fieldList2.equals(typeList13) == typeList13.equals(fieldList2));
    }

    @Test
    public void test06() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test06");
        org.apache.avro.Schema.Field[] fieldArray0 = new org.apache.avro.Schema.Field[] {};
        java.util.ArrayList<org.apache.avro.Schema.Field> fieldList1 = new java.util.ArrayList<org.apache.avro.Schema.Field>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<org.apache.avro.Schema.Field>) fieldList1, fieldArray0);
        org.apache.avro.Schema schema3 = org.apache.avro.Schema.createRecord((java.util.List<org.apache.avro.Schema.Field>) fieldList1);
        org.apache.avro.Schema.Type type4 = schema3.getType();
        org.apache.avro.Schema.Field[] fieldArray5 = new org.apache.avro.Schema.Field[] {};
        java.util.ArrayList<org.apache.avro.Schema.Field> fieldList6 = new java.util.ArrayList<org.apache.avro.Schema.Field>();
        boolean boolean7 = java.util.Collections.addAll((java.util.Collection<org.apache.avro.Schema.Field>) fieldList6, fieldArray5);
        org.apache.avro.Schema schema8 = org.apache.avro.Schema.createRecord((java.util.List<org.apache.avro.Schema.Field>) fieldList6);
        boolean boolean9 = schema3.equals((java.lang.Object) schema8);
        org.apache.avro.Schema schema10 = org.apache.avro.Schema.createArray(schema3);
        org.apache.avro.Schema schema11 = org.apache.avro.Schema.createMap(schema3);
        java.util.List<org.apache.avro.Schema.Field> fieldList12 = schema3.getFields();
        org.apache.avro.Schema.Field[] fieldArray13 = new org.apache.avro.Schema.Field[] {};
        java.util.ArrayList<org.apache.avro.Schema.Field> fieldList14 = new java.util.ArrayList<org.apache.avro.Schema.Field>();
        boolean boolean15 = java.util.Collections.addAll((java.util.Collection<org.apache.avro.Schema.Field>) fieldList14, fieldArray13);
        org.apache.avro.Schema schema16 = org.apache.avro.Schema.createRecord((java.util.List<org.apache.avro.Schema.Field>) fieldList14);
        org.apache.avro.Schema.Type type17 = schema16.getType();
        org.apache.avro.generic.GenericData.EnumSymbol enumSymbol19 = new org.apache.avro.generic.GenericData.EnumSymbol(schema16, "hi!");
        boolean boolean20 = schema16.isError();
        java.lang.String str21 = schema16.getFullName();
        java.lang.String str22 = schema16.getName();
        java.lang.String str24 = schema16.getProp("[]");
        org.apache.avro.Schema schema25 = org.apache.avro.Schema.applyAliases(schema3, schema16);
        org.apache.avro.generic.GenericData.Record record26 = new org.apache.avro.generic.GenericData.Record(schema16);
        java.lang.String str27 = record26.toString();
        org.apache.avro.Schema.Field[] fieldArray28 = new org.apache.avro.Schema.Field[] {};
        java.util.ArrayList<org.apache.avro.Schema.Field> fieldList29 = new java.util.ArrayList<org.apache.avro.Schema.Field>();
        boolean boolean30 = java.util.Collections.addAll((java.util.Collection<org.apache.avro.Schema.Field>) fieldList29, fieldArray28);
        org.apache.avro.Schema schema31 = org.apache.avro.Schema.createRecord((java.util.List<org.apache.avro.Schema.Field>) fieldList29);
        org.apache.avro.Schema.Type type32 = schema31.getType();
        org.apache.avro.generic.GenericData.EnumSymbol enumSymbol34 = new org.apache.avro.generic.GenericData.EnumSymbol(schema31, "hi!");
        java.lang.String str35 = enumSymbol34.toString();
        org.apache.avro.Schema.Field[] fieldArray36 = new org.apache.avro.Schema.Field[] {};
        java.util.ArrayList<org.apache.avro.Schema.Field> fieldList37 = new java.util.ArrayList<org.apache.avro.Schema.Field>();
        boolean boolean38 = java.util.Collections.addAll((java.util.Collection<org.apache.avro.Schema.Field>) fieldList37, fieldArray36);
        org.apache.avro.Schema schema39 = org.apache.avro.Schema.createRecord((java.util.List<org.apache.avro.Schema.Field>) fieldList37);
        org.apache.avro.Schema.Type type40 = schema39.getType();
        org.apache.avro.generic.GenericData.EnumSymbol enumSymbol42 = new org.apache.avro.generic.GenericData.EnumSymbol(schema39, "hi!");
        boolean boolean44 = enumSymbol42.equals((java.lang.Object) 0.0d);
        org.apache.avro.Schema.Field[] fieldArray45 = new org.apache.avro.Schema.Field[] {};
        java.util.ArrayList<org.apache.avro.Schema.Field> fieldList46 = new java.util.ArrayList<org.apache.avro.Schema.Field>();
        boolean boolean47 = java.util.Collections.addAll((java.util.Collection<org.apache.avro.Schema.Field>) fieldList46, fieldArray45);
        org.apache.avro.Schema schema48 = org.apache.avro.Schema.createRecord((java.util.List<org.apache.avro.Schema.Field>) fieldList46);
        org.apache.avro.Schema.Type type49 = schema48.getType();
        org.apache.avro.generic.GenericData.EnumSymbol enumSymbol51 = new org.apache.avro.generic.GenericData.EnumSymbol(schema48, "hi!");
        boolean boolean53 = enumSymbol51.equals((java.lang.Object) 0.0d);
        boolean boolean54 = enumSymbol42.equals((java.lang.Object) 0.0d);
        java.lang.String str55 = enumSymbol42.toString();
        boolean boolean56 = enumSymbol34.equals((java.lang.Object) enumSymbol42);
        org.apache.avro.Schema schema57 = enumSymbol42.getSchema();
        org.apache.avro.Schema.Type type58 = schema57.getType();
        org.apache.avro.generic.GenericData.Record record59 = new org.apache.avro.generic.GenericData.Record(schema57);
        int int60 = record26.compareTo(record59);
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on record26 and record59.", record26.equals(record59) == record59.equals(record26));
    }

    @Test
    public void test07() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test07");
        org.apache.avro.Schema.Field[] fieldArray1 = new org.apache.avro.Schema.Field[] {};
        java.util.ArrayList<org.apache.avro.Schema.Field> fieldList2 = new java.util.ArrayList<org.apache.avro.Schema.Field>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<org.apache.avro.Schema.Field>) fieldList2, fieldArray1);
        org.apache.avro.Schema schema4 = org.apache.avro.Schema.createRecord((java.util.List<org.apache.avro.Schema.Field>) fieldList2);
        org.apache.avro.Schema.Type type5 = schema4.getType();
        org.apache.avro.Schema.Field[] fieldArray6 = new org.apache.avro.Schema.Field[] {};
        java.util.ArrayList<org.apache.avro.Schema.Field> fieldList7 = new java.util.ArrayList<org.apache.avro.Schema.Field>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<org.apache.avro.Schema.Field>) fieldList7, fieldArray6);
        org.apache.avro.Schema schema9 = org.apache.avro.Schema.createRecord((java.util.List<org.apache.avro.Schema.Field>) fieldList7);
        boolean boolean10 = schema4.equals((java.lang.Object) schema9);
        org.apache.avro.Schema schema11 = org.apache.avro.Schema.createArray(schema4);
        java.lang.String str12 = schema11.getName();
        org.apache.avro.generic.GenericData.Array<org.apache.avro.Schema.Type> typeList13 = new org.apache.avro.generic.GenericData.Array<org.apache.avro.Schema.Type>(0, schema11);
        org.apache.avro.Schema.Field[] fieldArray15 = new org.apache.avro.Schema.Field[] {};
        java.util.ArrayList<org.apache.avro.Schema.Field> fieldList16 = new java.util.ArrayList<org.apache.avro.Schema.Field>();
        boolean boolean17 = java.util.Collections.addAll((java.util.Collection<org.apache.avro.Schema.Field>) fieldList16, fieldArray15);
        org.apache.avro.Schema schema18 = org.apache.avro.Schema.createRecord((java.util.List<org.apache.avro.Schema.Field>) fieldList16);
        org.apache.avro.Schema.Type type19 = schema18.getType();
        org.apache.avro.Schema.Field[] fieldArray20 = new org.apache.avro.Schema.Field[] {};
        java.util.ArrayList<org.apache.avro.Schema.Field> fieldList21 = new java.util.ArrayList<org.apache.avro.Schema.Field>();
        boolean boolean22 = java.util.Collections.addAll((java.util.Collection<org.apache.avro.Schema.Field>) fieldList21, fieldArray20);
        org.apache.avro.Schema schema23 = org.apache.avro.Schema.createRecord((java.util.List<org.apache.avro.Schema.Field>) fieldList21);
        boolean boolean24 = schema18.equals((java.lang.Object) schema23);
        org.apache.avro.Schema schema25 = org.apache.avro.Schema.createArray(schema18);
        java.lang.String str26 = schema25.getName();
        org.apache.avro.generic.GenericData.Array<org.apache.avro.Schema.Type> typeList27 = new org.apache.avro.generic.GenericData.Array<org.apache.avro.Schema.Type>(0, schema25);
        int int28 = typeList13.compareTo((org.apache.avro.generic.GenericArray<org.apache.avro.Schema.Type>) typeList27);
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on fieldList2 and typeList13.", fieldList2.equals(typeList13) == typeList13.equals(fieldList2));
    }

    @Test
    public void test08() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test08");
        org.apache.avro.Schema.Field[] fieldArray1 = new org.apache.avro.Schema.Field[] {};
        java.util.ArrayList<org.apache.avro.Schema.Field> fieldList2 = new java.util.ArrayList<org.apache.avro.Schema.Field>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<org.apache.avro.Schema.Field>) fieldList2, fieldArray1);
        org.apache.avro.Schema schema4 = org.apache.avro.Schema.createRecord((java.util.List<org.apache.avro.Schema.Field>) fieldList2);
        org.apache.avro.Schema.Type type5 = schema4.getType();
        org.apache.avro.Schema.Field[] fieldArray6 = new org.apache.avro.Schema.Field[] {};
        java.util.ArrayList<org.apache.avro.Schema.Field> fieldList7 = new java.util.ArrayList<org.apache.avro.Schema.Field>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<org.apache.avro.Schema.Field>) fieldList7, fieldArray6);
        org.apache.avro.Schema schema9 = org.apache.avro.Schema.createRecord((java.util.List<org.apache.avro.Schema.Field>) fieldList7);
        boolean boolean10 = schema4.equals((java.lang.Object) schema9);
        org.apache.avro.Schema schema11 = org.apache.avro.Schema.createArray(schema4);
        java.lang.String str12 = schema11.getName();
        org.apache.avro.generic.GenericData.Array<org.apache.avro.Schema.Type> typeList13 = new org.apache.avro.generic.GenericData.Array<org.apache.avro.Schema.Type>(0, schema11);
        java.util.Iterator<org.apache.avro.Schema.Type> typeItor14 = typeList13.iterator();
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on fieldList2 and typeList13.", fieldList2.equals(typeList13) == typeList13.equals(fieldList2));
    }

    @Test
    public void test09() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test09");
        org.apache.avro.Schema.Field[] fieldArray1 = new org.apache.avro.Schema.Field[] {};
        java.util.ArrayList<org.apache.avro.Schema.Field> fieldList2 = new java.util.ArrayList<org.apache.avro.Schema.Field>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<org.apache.avro.Schema.Field>) fieldList2, fieldArray1);
        org.apache.avro.Schema schema4 = org.apache.avro.Schema.createRecord((java.util.List<org.apache.avro.Schema.Field>) fieldList2);
        org.apache.avro.Schema.Type type5 = schema4.getType();
        org.apache.avro.Schema.Field[] fieldArray6 = new org.apache.avro.Schema.Field[] {};
        java.util.ArrayList<org.apache.avro.Schema.Field> fieldList7 = new java.util.ArrayList<org.apache.avro.Schema.Field>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<org.apache.avro.Schema.Field>) fieldList7, fieldArray6);
        org.apache.avro.Schema schema9 = org.apache.avro.Schema.createRecord((java.util.List<org.apache.avro.Schema.Field>) fieldList7);
        boolean boolean10 = schema4.equals((java.lang.Object) schema9);
        org.apache.avro.Schema schema11 = org.apache.avro.Schema.createArray(schema4);
        java.lang.String str12 = schema11.getName();
        org.apache.avro.generic.GenericData.Array<org.apache.avro.Schema.Type> typeList13 = new org.apache.avro.generic.GenericData.Array<org.apache.avro.Schema.Type>(0, schema11);
        org.apache.avro.Schema schema14 = typeList13.getSchema();
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on fieldList2 and typeList13.", fieldList2.equals(typeList13) == typeList13.equals(fieldList2));
    }

    @Test
    public void test10() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test10");
        org.apache.avro.Schema schema4 = org.apache.avro.Schema.createRecord("boolean", "{\r\n  \"type\" : \"record\",\r\n  \"fields\" : [ ]\r\n}", "{\"type\":\"map\",\"values\":{\"type\":\"record\",\"fields\":[]}}", true);
        org.apache.avro.generic.GenericData.EnumSymbol enumSymbol6 = new org.apache.avro.generic.GenericData.EnumSymbol(schema4, "{}");
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on schema4 and schema4", schema4.equals(schema4) ? schema4.hashCode() == schema4.hashCode() : true);
    }

    @Test
    public void test11() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test11");
        org.apache.avro.Schema.Field[] fieldArray1 = new org.apache.avro.Schema.Field[] {};
        java.util.ArrayList<org.apache.avro.Schema.Field> fieldList2 = new java.util.ArrayList<org.apache.avro.Schema.Field>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<org.apache.avro.Schema.Field>) fieldList2, fieldArray1);
        org.apache.avro.Schema schema4 = org.apache.avro.Schema.createRecord((java.util.List<org.apache.avro.Schema.Field>) fieldList2);
        org.apache.avro.Schema.Type type5 = schema4.getType();
        org.apache.avro.Schema.Field[] fieldArray6 = new org.apache.avro.Schema.Field[] {};
        java.util.ArrayList<org.apache.avro.Schema.Field> fieldList7 = new java.util.ArrayList<org.apache.avro.Schema.Field>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<org.apache.avro.Schema.Field>) fieldList7, fieldArray6);
        org.apache.avro.Schema schema9 = org.apache.avro.Schema.createRecord((java.util.List<org.apache.avro.Schema.Field>) fieldList7);
        boolean boolean10 = schema4.equals((java.lang.Object) schema9);
        org.apache.avro.Schema schema11 = org.apache.avro.Schema.createArray(schema4);
        java.lang.String str12 = schema11.getName();
        org.apache.avro.generic.GenericData.Array<org.apache.avro.Schema.Type> typeList13 = new org.apache.avro.generic.GenericData.Array<org.apache.avro.Schema.Type>(0, schema11);
        typeList13.reverse();
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on fieldList2 and typeList13.", fieldList2.equals(typeList13) == typeList13.equals(fieldList2));
    }

    @Test
    public void test12() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test12");
        org.apache.avro.Schema.Field[] fieldArray1 = new org.apache.avro.Schema.Field[] {};
        java.util.ArrayList<org.apache.avro.Schema.Field> fieldList2 = new java.util.ArrayList<org.apache.avro.Schema.Field>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<org.apache.avro.Schema.Field>) fieldList2, fieldArray1);
        org.apache.avro.Schema schema4 = org.apache.avro.Schema.createRecord((java.util.List<org.apache.avro.Schema.Field>) fieldList2);
        org.apache.avro.Schema.Type type5 = schema4.getType();
        org.apache.avro.Schema.Field[] fieldArray6 = new org.apache.avro.Schema.Field[] {};
        java.util.ArrayList<org.apache.avro.Schema.Field> fieldList7 = new java.util.ArrayList<org.apache.avro.Schema.Field>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<org.apache.avro.Schema.Field>) fieldList7, fieldArray6);
        org.apache.avro.Schema schema9 = org.apache.avro.Schema.createRecord((java.util.List<org.apache.avro.Schema.Field>) fieldList7);
        boolean boolean10 = schema4.equals((java.lang.Object) schema9);
        org.apache.avro.Schema schema11 = org.apache.avro.Schema.createArray(schema4);
        java.lang.String str12 = schema11.getName();
        org.apache.avro.generic.GenericData.Array<org.apache.avro.Schema.Type> typeList13 = new org.apache.avro.generic.GenericData.Array<org.apache.avro.Schema.Type>(0, schema11);
        org.apache.avro.generic.GenericData.EnumSymbol enumSymbol15 = new org.apache.avro.generic.GenericData.EnumSymbol(schema11, "{\"type\":\"record\",\"fields\":[]}");
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on fieldList2 and typeList13.", fieldList2.equals(typeList13) == typeList13.equals(fieldList2));
    }

    @Test
    public void test13() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test13");
        org.apache.avro.Schema.Field[] fieldArray1 = new org.apache.avro.Schema.Field[] {};
        java.util.ArrayList<org.apache.avro.Schema.Field> fieldList2 = new java.util.ArrayList<org.apache.avro.Schema.Field>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<org.apache.avro.Schema.Field>) fieldList2, fieldArray1);
        org.apache.avro.Schema schema4 = org.apache.avro.Schema.createRecord((java.util.List<org.apache.avro.Schema.Field>) fieldList2);
        org.apache.avro.Schema.Type type5 = schema4.getType();
        org.apache.avro.Schema.Field[] fieldArray6 = new org.apache.avro.Schema.Field[] {};
        java.util.ArrayList<org.apache.avro.Schema.Field> fieldList7 = new java.util.ArrayList<org.apache.avro.Schema.Field>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<org.apache.avro.Schema.Field>) fieldList7, fieldArray6);
        org.apache.avro.Schema schema9 = org.apache.avro.Schema.createRecord((java.util.List<org.apache.avro.Schema.Field>) fieldList7);
        boolean boolean10 = schema4.equals((java.lang.Object) schema9);
        org.apache.avro.Schema schema11 = org.apache.avro.Schema.createArray(schema4);
        java.lang.String str12 = schema11.getName();
        org.apache.avro.generic.GenericData.Array<org.apache.avro.Schema.Type> typeList13 = new org.apache.avro.generic.GenericData.Array<org.apache.avro.Schema.Type>(0, schema11);
        java.lang.String str14 = typeList13.toString();
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on fieldList2 and typeList13.", fieldList2.equals(typeList13) == typeList13.equals(fieldList2));
    }

    @Test
    public void test14() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test14");
        org.apache.avro.Schema.Field[] fieldArray1 = new org.apache.avro.Schema.Field[] {};
        java.util.ArrayList<org.apache.avro.Schema.Field> fieldList2 = new java.util.ArrayList<org.apache.avro.Schema.Field>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<org.apache.avro.Schema.Field>) fieldList2, fieldArray1);
        org.apache.avro.Schema schema4 = org.apache.avro.Schema.createRecord((java.util.List<org.apache.avro.Schema.Field>) fieldList2);
        org.apache.avro.Schema.Type type5 = schema4.getType();
        org.apache.avro.Schema.Field[] fieldArray6 = new org.apache.avro.Schema.Field[] {};
        java.util.ArrayList<org.apache.avro.Schema.Field> fieldList7 = new java.util.ArrayList<org.apache.avro.Schema.Field>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<org.apache.avro.Schema.Field>) fieldList7, fieldArray6);
        org.apache.avro.Schema schema9 = org.apache.avro.Schema.createRecord((java.util.List<org.apache.avro.Schema.Field>) fieldList7);
        boolean boolean10 = schema4.equals((java.lang.Object) schema9);
        org.apache.avro.Schema schema11 = org.apache.avro.Schema.createArray(schema4);
        java.lang.String str12 = schema11.getName();
        org.apache.avro.generic.GenericData.Array<org.apache.avro.Schema.Type> typeList13 = new org.apache.avro.generic.GenericData.Array<org.apache.avro.Schema.Type>(0, schema11);
        org.apache.avro.io.DecoderFactory decoderFactory14 = org.apache.avro.io.DecoderFactory.get();
        org.apache.avro.Schema.Field[] fieldArray15 = new org.apache.avro.Schema.Field[] {};
        java.util.ArrayList<org.apache.avro.Schema.Field> fieldList16 = new java.util.ArrayList<org.apache.avro.Schema.Field>();
        boolean boolean17 = java.util.Collections.addAll((java.util.Collection<org.apache.avro.Schema.Field>) fieldList16, fieldArray15);
        org.apache.avro.Schema schema18 = org.apache.avro.Schema.createRecord((java.util.List<org.apache.avro.Schema.Field>) fieldList16);
        org.apache.avro.Schema.Type type19 = schema18.getType();
        org.apache.avro.generic.GenericData.EnumSymbol enumSymbol21 = new org.apache.avro.generic.GenericData.EnumSymbol(schema18, "hi!");
        boolean boolean22 = schema18.isError();
        org.apache.avro.Schema.Field[] fieldArray23 = new org.apache.avro.Schema.Field[] {};
        java.util.ArrayList<org.apache.avro.Schema.Field> fieldList24 = new java.util.ArrayList<org.apache.avro.Schema.Field>();
        boolean boolean25 = java.util.Collections.addAll((java.util.Collection<org.apache.avro.Schema.Field>) fieldList24, fieldArray23);
        java.util.stream.Stream<org.apache.avro.Schema.Field> fieldStream26 = fieldList24.stream();
        org.apache.avro.Schema.Field[] fieldArray27 = new org.apache.avro.Schema.Field[] {};
        java.util.ArrayList<org.apache.avro.Schema.Field> fieldList28 = new java.util.ArrayList<org.apache.avro.Schema.Field>();
        boolean boolean29 = java.util.Collections.addAll((java.util.Collection<org.apache.avro.Schema.Field>) fieldList28, fieldArray27);
        org.apache.avro.Schema schema30 = org.apache.avro.Schema.createRecord((java.util.List<org.apache.avro.Schema.Field>) fieldList28);
        org.apache.avro.Schema.Type type31 = schema30.getType();
        org.apache.avro.Schema.Field[] fieldArray32 = new org.apache.avro.Schema.Field[] {};
        java.util.ArrayList<org.apache.avro.Schema.Field> fieldList33 = new java.util.ArrayList<org.apache.avro.Schema.Field>();
        boolean boolean34 = java.util.Collections.addAll((java.util.Collection<org.apache.avro.Schema.Field>) fieldList33, fieldArray32);
        org.apache.avro.Schema schema35 = org.apache.avro.Schema.createRecord((java.util.List<org.apache.avro.Schema.Field>) fieldList33);
        boolean boolean36 = schema30.equals((java.lang.Object) schema35);
        org.apache.avro.Schema schema37 = org.apache.avro.Schema.createArray(schema30);
        int int38 = fieldList24.lastIndexOf((java.lang.Object) schema37);
        org.apache.avro.io.DecoderFactory decoderFactory39 = org.apache.avro.io.DecoderFactory.defaultFactory();
        java.io.InputStream inputStream40 = null;
        org.apache.avro.io.DecoderFactory decoderFactory41 = org.apache.avro.io.DecoderFactory.defaultFactory();
        byte[] byteArray42 = new byte[] {};
        org.apache.avro.io.BinaryDecoder binaryDecoder43 = null;
        org.apache.avro.io.BinaryDecoder binaryDecoder44 = decoderFactory41.createBinaryDecoder(byteArray42, binaryDecoder43);
        org.apache.avro.io.DecoderFactory decoderFactory45 = org.apache.avro.io.DecoderFactory.defaultFactory();
        byte[] byteArray46 = new byte[] {};
        org.apache.avro.io.BinaryDecoder binaryDecoder47 = null;
        org.apache.avro.io.BinaryDecoder binaryDecoder48 = decoderFactory45.createBinaryDecoder(byteArray46, binaryDecoder47);
        binaryDecoder44.readFixed(byteArray46);
        org.apache.avro.io.BinaryDecoder binaryDecoder50 = decoderFactory39.directBinaryDecoder(inputStream40, binaryDecoder44);
        org.apache.avro.io.ResolvingDecoder resolvingDecoder51 = decoderFactory14.resolvingDecoder(schema18, schema37, (org.apache.avro.io.Decoder) binaryDecoder50);
        org.apache.avro.Schema.Field[] fieldArray52 = new org.apache.avro.Schema.Field[] {};
        java.util.ArrayList<org.apache.avro.Schema.Field> fieldList53 = new java.util.ArrayList<org.apache.avro.Schema.Field>();
        boolean boolean54 = java.util.Collections.addAll((java.util.Collection<org.apache.avro.Schema.Field>) fieldList53, fieldArray52);
        org.apache.avro.Schema schema55 = org.apache.avro.Schema.createRecord((java.util.List<org.apache.avro.Schema.Field>) fieldList53);
        org.apache.avro.Schema.Type type56 = schema55.getType();
        org.apache.avro.Schema.Field[] fieldArray57 = new org.apache.avro.Schema.Field[] {};
        java.util.ArrayList<org.apache.avro.Schema.Field> fieldList58 = new java.util.ArrayList<org.apache.avro.Schema.Field>();
        boolean boolean59 = java.util.Collections.addAll((java.util.Collection<org.apache.avro.Schema.Field>) fieldList58, fieldArray57);
        org.apache.avro.Schema schema60 = org.apache.avro.Schema.createRecord((java.util.List<org.apache.avro.Schema.Field>) fieldList58);
        boolean boolean61 = schema55.equals((java.lang.Object) schema60);
        org.apache.avro.Schema schema62 = org.apache.avro.Schema.createArray(schema55);
        org.apache.avro.io.DecoderFactory decoderFactory63 = org.apache.avro.io.DecoderFactory.defaultFactory();
        byte[] byteArray64 = new byte[] {};
        org.apache.avro.io.BinaryDecoder binaryDecoder65 = null;
        org.apache.avro.io.BinaryDecoder binaryDecoder66 = decoderFactory63.createBinaryDecoder(byteArray64, binaryDecoder65);
        org.apache.avro.io.DecoderFactory decoderFactory67 = org.apache.avro.io.DecoderFactory.defaultFactory();
        byte[] byteArray68 = new byte[] {};
        org.apache.avro.io.BinaryDecoder binaryDecoder69 = null;
        org.apache.avro.io.BinaryDecoder binaryDecoder70 = decoderFactory67.createBinaryDecoder(byteArray68, binaryDecoder69);
        binaryDecoder66.readFixed(byteArray68);
        org.apache.avro.generic.GenericData.Fixed fixed72 = new org.apache.avro.generic.GenericData.Fixed(schema55, byteArray68);
        java.lang.String str73 = schema55.getDoc();
        org.apache.avro.io.JsonDecoder jsonDecoder75 = decoderFactory14.jsonDecoder(schema55, "0.0");
        org.apache.avro.io.JsonDecoder jsonDecoder77 = jsonDecoder75.configure("");
        jsonDecoder75.skipTopSymbol();
        jsonDecoder75.skipTopSymbol();
        boolean boolean80 = typeList13.equals((java.lang.Object) jsonDecoder75);
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on fieldList2 and typeList13.", fieldList2.equals(typeList13) == typeList13.equals(fieldList2));
    }

    @Test
    public void test15() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test15");
        org.apache.avro.Schema.Field[] fieldArray1 = new org.apache.avro.Schema.Field[] {};
        java.util.ArrayList<org.apache.avro.Schema.Field> fieldList2 = new java.util.ArrayList<org.apache.avro.Schema.Field>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<org.apache.avro.Schema.Field>) fieldList2, fieldArray1);
        org.apache.avro.Schema schema4 = org.apache.avro.Schema.createRecord((java.util.List<org.apache.avro.Schema.Field>) fieldList2);
        org.apache.avro.Schema.Type type5 = schema4.getType();
        org.apache.avro.Schema.Field[] fieldArray6 = new org.apache.avro.Schema.Field[] {};
        java.util.ArrayList<org.apache.avro.Schema.Field> fieldList7 = new java.util.ArrayList<org.apache.avro.Schema.Field>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<org.apache.avro.Schema.Field>) fieldList7, fieldArray6);
        org.apache.avro.Schema schema9 = org.apache.avro.Schema.createRecord((java.util.List<org.apache.avro.Schema.Field>) fieldList7);
        boolean boolean10 = schema4.equals((java.lang.Object) schema9);
        org.apache.avro.Schema schema11 = org.apache.avro.Schema.createArray(schema4);
        java.lang.String str12 = schema11.getName();
        org.apache.avro.generic.GenericData.Array<org.apache.avro.Schema.Type> typeList13 = new org.apache.avro.generic.GenericData.Array<org.apache.avro.Schema.Type>(0, schema11);
        org.apache.avro.Schema.Field[] fieldArray14 = new org.apache.avro.Schema.Field[] {};
        java.util.ArrayList<org.apache.avro.Schema.Field> fieldList15 = new java.util.ArrayList<org.apache.avro.Schema.Field>();
        boolean boolean16 = java.util.Collections.addAll((java.util.Collection<org.apache.avro.Schema.Field>) fieldList15, fieldArray14);
        org.apache.avro.Schema schema17 = org.apache.avro.Schema.createRecord((java.util.List<org.apache.avro.Schema.Field>) fieldList15);
        org.apache.avro.Schema.Type type18 = schema17.getType();
        org.apache.avro.Schema.Field[] fieldArray19 = new org.apache.avro.Schema.Field[] {};
        java.util.ArrayList<org.apache.avro.Schema.Field> fieldList20 = new java.util.ArrayList<org.apache.avro.Schema.Field>();
        boolean boolean21 = java.util.Collections.addAll((java.util.Collection<org.apache.avro.Schema.Field>) fieldList20, fieldArray19);
        org.apache.avro.Schema schema22 = org.apache.avro.Schema.createRecord((java.util.List<org.apache.avro.Schema.Field>) fieldList20);
        boolean boolean23 = schema17.equals((java.lang.Object) schema22);
        org.apache.avro.Schema schema24 = org.apache.avro.Schema.createArray(schema17);
        org.apache.avro.io.DecoderFactory decoderFactory25 = org.apache.avro.io.DecoderFactory.defaultFactory();
        byte[] byteArray26 = new byte[] {};
        org.apache.avro.io.BinaryDecoder binaryDecoder27 = null;
        org.apache.avro.io.BinaryDecoder binaryDecoder28 = decoderFactory25.createBinaryDecoder(byteArray26, binaryDecoder27);
        org.apache.avro.io.DecoderFactory decoderFactory29 = org.apache.avro.io.DecoderFactory.defaultFactory();
        byte[] byteArray30 = new byte[] {};
        org.apache.avro.io.BinaryDecoder binaryDecoder31 = null;
        org.apache.avro.io.BinaryDecoder binaryDecoder32 = decoderFactory29.createBinaryDecoder(byteArray30, binaryDecoder31);
        binaryDecoder28.readFixed(byteArray30);
        org.apache.avro.generic.GenericData.Fixed fixed34 = new org.apache.avro.generic.GenericData.Fixed(schema17, byteArray30);
        org.apache.avro.Schema schema35 = null;
        byte[] byteArray37 = new byte[] { (byte) -1 };
        org.apache.avro.generic.GenericData.Fixed fixed38 = new org.apache.avro.generic.GenericData.Fixed(schema35, byteArray37);
        fixed34.bytes(byteArray37);
        org.apache.avro.Schema schema40 = fixed34.getSchema();
        java.lang.String str42 = schema40.getProp("[-1]");
        boolean boolean43 = typeList13.equals((java.lang.Object) "[-1]");
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on fieldList2 and typeList13.", fieldList2.equals(typeList13) == typeList13.equals(fieldList2));
    }

    @Test
    public void test16() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test16");
        org.apache.avro.Schema schema4 = org.apache.avro.Schema.createRecord("boolean", "{\r\n  \"type\" : \"record\",\r\n  \"fields\" : [ ]\r\n}", "{\"type\":\"map\",\"values\":{\"type\":\"record\",\"fields\":[]}}", true);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.avro.generic.GenericData.Fixed fixed5 = new org.apache.avro.generic.GenericData.Fixed(schema4);
    }

    @Test
    public void test17() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test17");
        org.apache.avro.generic.GenericData genericData0 = org.apache.avro.generic.GenericData.get();
        java.lang.String str2 = genericData0.toString((java.lang.Object) 0L);
        org.apache.avro.Schema.Field[] fieldArray3 = new org.apache.avro.Schema.Field[] {};
        java.util.ArrayList<org.apache.avro.Schema.Field> fieldList4 = new java.util.ArrayList<org.apache.avro.Schema.Field>();
        boolean boolean5 = java.util.Collections.addAll((java.util.Collection<org.apache.avro.Schema.Field>) fieldList4, fieldArray3);
        java.util.stream.Stream<org.apache.avro.Schema.Field> fieldStream6 = fieldList4.stream();
        org.apache.avro.Schema.Field[] fieldArray7 = new org.apache.avro.Schema.Field[] {};
        java.util.ArrayList<org.apache.avro.Schema.Field> fieldList8 = new java.util.ArrayList<org.apache.avro.Schema.Field>();
        boolean boolean9 = java.util.Collections.addAll((java.util.Collection<org.apache.avro.Schema.Field>) fieldList8, fieldArray7);
        org.apache.avro.Schema schema10 = org.apache.avro.Schema.createRecord((java.util.List<org.apache.avro.Schema.Field>) fieldList8);
        org.apache.avro.Schema.Type type11 = schema10.getType();
        org.apache.avro.Schema.Field[] fieldArray12 = new org.apache.avro.Schema.Field[] {};
        java.util.ArrayList<org.apache.avro.Schema.Field> fieldList13 = new java.util.ArrayList<org.apache.avro.Schema.Field>();
        boolean boolean14 = java.util.Collections.addAll((java.util.Collection<org.apache.avro.Schema.Field>) fieldList13, fieldArray12);
        org.apache.avro.Schema schema15 = org.apache.avro.Schema.createRecord((java.util.List<org.apache.avro.Schema.Field>) fieldList13);
        boolean boolean16 = schema10.equals((java.lang.Object) schema15);
        org.apache.avro.Schema schema17 = org.apache.avro.Schema.createArray(schema10);
        int int18 = fieldList4.lastIndexOf((java.lang.Object) schema17);
        org.apache.avro.Schema.Field[] fieldArray19 = new org.apache.avro.Schema.Field[] {};
        java.util.ArrayList<org.apache.avro.Schema.Field> fieldList20 = new java.util.ArrayList<org.apache.avro.Schema.Field>();
        boolean boolean21 = java.util.Collections.addAll((java.util.Collection<org.apache.avro.Schema.Field>) fieldList20, fieldArray19);
        org.apache.avro.Schema schema22 = org.apache.avro.Schema.createRecord((java.util.List<org.apache.avro.Schema.Field>) fieldList20);
        org.apache.avro.Schema.Type type23 = schema22.getType();
        org.apache.avro.Schema.Field[] fieldArray24 = new org.apache.avro.Schema.Field[] {};
        java.util.ArrayList<org.apache.avro.Schema.Field> fieldList25 = new java.util.ArrayList<org.apache.avro.Schema.Field>();
        boolean boolean26 = java.util.Collections.addAll((java.util.Collection<org.apache.avro.Schema.Field>) fieldList25, fieldArray24);
        org.apache.avro.Schema schema27 = org.apache.avro.Schema.createRecord((java.util.List<org.apache.avro.Schema.Field>) fieldList25);
        boolean boolean28 = schema22.equals((java.lang.Object) schema27);
        java.lang.String str29 = schema22.getDoc();
        org.apache.avro.Schema schema30 = org.apache.avro.Schema.createMap(schema22);
        boolean boolean31 = fieldList4.contains((java.lang.Object) schema30);
        org.apache.avro.Schema.Field[] fieldArray32 = new org.apache.avro.Schema.Field[] {};
        java.util.ArrayList<org.apache.avro.Schema.Field> fieldList33 = new java.util.ArrayList<org.apache.avro.Schema.Field>();
        boolean boolean34 = java.util.Collections.addAll((java.util.Collection<org.apache.avro.Schema.Field>) fieldList33, fieldArray32);
        org.apache.avro.Schema schema35 = org.apache.avro.Schema.createRecord((java.util.List<org.apache.avro.Schema.Field>) fieldList33);
        org.apache.avro.Schema.Type type36 = schema35.getType();
        org.apache.avro.Schema.Field[] fieldArray37 = new org.apache.avro.Schema.Field[] {};
        java.util.ArrayList<org.apache.avro.Schema.Field> fieldList38 = new java.util.ArrayList<org.apache.avro.Schema.Field>();
        boolean boolean39 = java.util.Collections.addAll((java.util.Collection<org.apache.avro.Schema.Field>) fieldList38, fieldArray37);
        org.apache.avro.Schema schema40 = org.apache.avro.Schema.createRecord((java.util.List<org.apache.avro.Schema.Field>) fieldList38);
        boolean boolean41 = schema35.equals((java.lang.Object) schema40);
        org.apache.avro.Schema schema42 = org.apache.avro.Schema.createArray(schema35);
        java.lang.String str43 = schema35.toString();
        java.lang.String str45 = schema35.toString(true);
        org.apache.avro.Schema.Field[] fieldArray46 = new org.apache.avro.Schema.Field[] {};
        java.util.ArrayList<org.apache.avro.Schema.Field> fieldList47 = new java.util.ArrayList<org.apache.avro.Schema.Field>();
        boolean boolean48 = java.util.Collections.addAll((java.util.Collection<org.apache.avro.Schema.Field>) fieldList47, fieldArray46);
        org.apache.avro.Schema schema49 = org.apache.avro.Schema.createRecord((java.util.List<org.apache.avro.Schema.Field>) fieldList47);
        org.apache.avro.Schema.Type type50 = schema49.getType();
        org.apache.avro.generic.GenericData.EnumSymbol enumSymbol52 = new org.apache.avro.generic.GenericData.EnumSymbol(schema49, "hi!");
        boolean boolean53 = schema49.isError();
        java.lang.String str54 = schema49.getFullName();
        int int55 = genericData0.compare((java.lang.Object) boolean31, (java.lang.Object) str45, schema49);
        org.apache.avro.Schema.Field[] fieldArray56 = new org.apache.avro.Schema.Field[] {};
        java.util.ArrayList<org.apache.avro.Schema.Field> fieldList57 = new java.util.ArrayList<org.apache.avro.Schema.Field>();
        boolean boolean58 = java.util.Collections.addAll((java.util.Collection<org.apache.avro.Schema.Field>) fieldList57, fieldArray56);
        org.apache.avro.Schema schema59 = org.apache.avro.Schema.createRecord((java.util.List<org.apache.avro.Schema.Field>) fieldList57);
        org.apache.avro.Schema.Type type60 = schema59.getType();
        org.apache.avro.Schema.Field[] fieldArray61 = new org.apache.avro.Schema.Field[] {};
        java.util.ArrayList<org.apache.avro.Schema.Field> fieldList62 = new java.util.ArrayList<org.apache.avro.Schema.Field>();
        boolean boolean63 = java.util.Collections.addAll((java.util.Collection<org.apache.avro.Schema.Field>) fieldList62, fieldArray61);
        org.apache.avro.Schema schema64 = org.apache.avro.Schema.createRecord((java.util.List<org.apache.avro.Schema.Field>) fieldList62);
        boolean boolean65 = schema59.equals((java.lang.Object) schema64);
        org.apache.avro.Schema schema66 = org.apache.avro.Schema.createArray(schema59);
        java.util.List<org.apache.avro.Schema.Field> fieldList67 = schema59.getFields();
        org.apache.avro.Schema.Field[] fieldArray68 = new org.apache.avro.Schema.Field[] {};
        java.util.ArrayList<org.apache.avro.Schema.Field> fieldList69 = new java.util.ArrayList<org.apache.avro.Schema.Field>();
        boolean boolean70 = java.util.Collections.addAll((java.util.Collection<org.apache.avro.Schema.Field>) fieldList69, fieldArray68);
        org.apache.avro.Schema schema71 = org.apache.avro.Schema.createRecord((java.util.List<org.apache.avro.Schema.Field>) fieldList69);
        org.apache.avro.Schema.Type type72 = schema71.getType();
        org.apache.avro.Schema.Field[] fieldArray73 = new org.apache.avro.Schema.Field[] {};
        java.util.ArrayList<org.apache.avro.Schema.Field> fieldList74 = new java.util.ArrayList<org.apache.avro.Schema.Field>();
        boolean boolean75 = java.util.Collections.addAll((java.util.Collection<org.apache.avro.Schema.Field>) fieldList74, fieldArray73);
        org.apache.avro.Schema schema76 = org.apache.avro.Schema.createRecord((java.util.List<org.apache.avro.Schema.Field>) fieldList74);
        boolean boolean77 = schema71.equals((java.lang.Object) schema76);
        org.apache.avro.Schema schema78 = org.apache.avro.Schema.createArray(schema71);
        org.apache.avro.Schema schema79 = org.apache.avro.Schema.createMap(schema71);
        boolean boolean80 = genericData0.validate(schema59, (java.lang.Object) schema79);
        java.lang.String str81 = schema79.getDoc();
        org.apache.avro.Schema.Type type82 = schema79.getType();
        org.apache.avro.Schema schema83 = org.apache.avro.Schema.createArray(schema79);
        org.apache.avro.Schema schema88 = org.apache.avro.Schema.createRecord("null", "", "array", true);
        boolean boolean89 = schema79.equals((java.lang.Object) true);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on schema88 and schema88", schema88.equals(schema88) ? schema88.hashCode() == schema88.hashCode() : true);
    }

    @Test
    public void test18() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test18");
        org.apache.avro.Schema schema4 = org.apache.avro.Schema.createRecord("boolean", "[]", "100.0", false);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.List<org.apache.avro.Schema> schemaList5 = schema4.getTypes();
    }

    @Test
    public void test19() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test19");
        org.apache.avro.Schema.Field[] fieldArray1 = new org.apache.avro.Schema.Field[] {};
        java.util.ArrayList<org.apache.avro.Schema.Field> fieldList2 = new java.util.ArrayList<org.apache.avro.Schema.Field>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<org.apache.avro.Schema.Field>) fieldList2, fieldArray1);
        org.apache.avro.Schema schema4 = org.apache.avro.Schema.createRecord((java.util.List<org.apache.avro.Schema.Field>) fieldList2);
        org.apache.avro.Schema.Type type5 = schema4.getType();
        org.apache.avro.Schema.Field[] fieldArray6 = new org.apache.avro.Schema.Field[] {};
        java.util.ArrayList<org.apache.avro.Schema.Field> fieldList7 = new java.util.ArrayList<org.apache.avro.Schema.Field>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<org.apache.avro.Schema.Field>) fieldList7, fieldArray6);
        org.apache.avro.Schema schema9 = org.apache.avro.Schema.createRecord((java.util.List<org.apache.avro.Schema.Field>) fieldList7);
        boolean boolean10 = schema4.equals((java.lang.Object) schema9);
        org.apache.avro.Schema schema11 = org.apache.avro.Schema.createArray(schema4);
        java.lang.String str12 = schema11.getName();
        org.apache.avro.generic.GenericData.Array<org.apache.avro.Schema.Type> typeList13 = new org.apache.avro.generic.GenericData.Array<org.apache.avro.Schema.Type>(0, schema11);
        org.apache.avro.io.DecoderFactory decoderFactory14 = org.apache.avro.io.DecoderFactory.defaultFactory();
        byte[] byteArray15 = new byte[] {};
        org.apache.avro.io.BinaryDecoder binaryDecoder16 = null;
        org.apache.avro.io.BinaryDecoder binaryDecoder17 = decoderFactory14.createBinaryDecoder(byteArray15, binaryDecoder16);
        org.apache.avro.Schema.Field[] fieldArray18 = new org.apache.avro.Schema.Field[] {};
        java.util.ArrayList<org.apache.avro.Schema.Field> fieldList19 = new java.util.ArrayList<org.apache.avro.Schema.Field>();
        boolean boolean20 = java.util.Collections.addAll((java.util.Collection<org.apache.avro.Schema.Field>) fieldList19, fieldArray18);
        org.apache.avro.Schema schema21 = org.apache.avro.Schema.createRecord((java.util.List<org.apache.avro.Schema.Field>) fieldList19);
        java.lang.String str22 = schema21.getFullName();
        java.lang.String str23 = schema21.getNamespace();
        org.apache.avro.io.DecoderFactory decoderFactory24 = org.apache.avro.io.DecoderFactory.get();
        org.apache.avro.Schema.Field[] fieldArray25 = new org.apache.avro.Schema.Field[] {};
        java.util.ArrayList<org.apache.avro.Schema.Field> fieldList26 = new java.util.ArrayList<org.apache.avro.Schema.Field>();
        boolean boolean27 = java.util.Collections.addAll((java.util.Collection<org.apache.avro.Schema.Field>) fieldList26, fieldArray25);
        org.apache.avro.Schema schema28 = org.apache.avro.Schema.createRecord((java.util.List<org.apache.avro.Schema.Field>) fieldList26);
        org.apache.avro.Schema.Type type29 = schema28.getType();
        org.apache.avro.Schema.Field[] fieldArray30 = new org.apache.avro.Schema.Field[] {};
        java.util.ArrayList<org.apache.avro.Schema.Field> fieldList31 = new java.util.ArrayList<org.apache.avro.Schema.Field>();
        boolean boolean32 = java.util.Collections.addAll((java.util.Collection<org.apache.avro.Schema.Field>) fieldList31, fieldArray30);
        org.apache.avro.Schema schema33 = org.apache.avro.Schema.createRecord((java.util.List<org.apache.avro.Schema.Field>) fieldList31);
        boolean boolean34 = schema28.equals((java.lang.Object) schema33);
        org.apache.avro.Schema schema35 = org.apache.avro.Schema.createArray(schema28);
        java.lang.String str36 = schema28.toString();
        java.lang.String str37 = schema28.getDoc();
        org.apache.avro.io.DecoderFactory decoderFactory38 = org.apache.avro.io.DecoderFactory.get();
        org.apache.avro.Schema schema39 = null;
        byte[] byteArray41 = new byte[] { (byte) -1 };
        org.apache.avro.generic.GenericData.Fixed fixed42 = new org.apache.avro.generic.GenericData.Fixed(schema39, byteArray41);
        org.apache.avro.Schema schema43 = fixed42.getSchema();
        org.apache.avro.Schema schema44 = null;
        byte[] byteArray46 = new byte[] { (byte) -1 };
        org.apache.avro.generic.GenericData.Fixed fixed47 = new org.apache.avro.generic.GenericData.Fixed(schema44, byteArray46);
        boolean boolean48 = fixed42.equals((java.lang.Object) byteArray46);
        org.apache.avro.io.DecoderFactory decoderFactory49 = org.apache.avro.io.DecoderFactory.defaultFactory();
        byte[] byteArray50 = new byte[] {};
        org.apache.avro.io.BinaryDecoder binaryDecoder51 = null;
        org.apache.avro.io.BinaryDecoder binaryDecoder52 = decoderFactory49.createBinaryDecoder(byteArray50, binaryDecoder51);
        java.io.InputStream inputStream53 = null;
        org.apache.avro.io.DecoderFactory decoderFactory54 = org.apache.avro.io.DecoderFactory.defaultFactory();
        byte[] byteArray55 = new byte[] {};
        org.apache.avro.io.BinaryDecoder binaryDecoder56 = null;
        org.apache.avro.io.BinaryDecoder binaryDecoder57 = decoderFactory54.createBinaryDecoder(byteArray55, binaryDecoder56);
        org.apache.avro.io.BinaryDecoder binaryDecoder58 = decoderFactory49.directBinaryDecoder(inputStream53, binaryDecoder56);
        org.apache.avro.io.BinaryDecoder binaryDecoder59 = decoderFactory38.binaryDecoder(byteArray46, binaryDecoder56);
        int int60 = decoderFactory38.getConfiguredBufferSize();
        java.io.InputStream inputStream61 = null;
        org.apache.avro.io.DecoderFactory decoderFactory62 = org.apache.avro.io.DecoderFactory.defaultFactory();
        byte[] byteArray63 = new byte[] {};
        org.apache.avro.io.BinaryDecoder binaryDecoder64 = null;
        org.apache.avro.io.BinaryDecoder binaryDecoder65 = decoderFactory62.createBinaryDecoder(byteArray63, binaryDecoder64);
        org.apache.avro.io.DecoderFactory decoderFactory66 = org.apache.avro.io.DecoderFactory.defaultFactory();
        byte[] byteArray67 = new byte[] {};
        org.apache.avro.io.BinaryDecoder binaryDecoder68 = null;
        org.apache.avro.io.BinaryDecoder binaryDecoder69 = decoderFactory66.createBinaryDecoder(byteArray67, binaryDecoder68);
        binaryDecoder65.readFixed(byteArray67);
        org.apache.avro.io.BinaryDecoder binaryDecoder71 = decoderFactory38.binaryDecoder(inputStream61, binaryDecoder65);
        org.apache.avro.io.ValidatingDecoder validatingDecoder72 = decoderFactory24.validatingDecoder(schema28, (org.apache.avro.io.Decoder) binaryDecoder65);
        org.apache.avro.io.ValidatingDecoder validatingDecoder73 = decoderFactory14.validatingDecoder(schema21, (org.apache.avro.io.Decoder) binaryDecoder65);
        boolean boolean74 = typeList13.equals((java.lang.Object) schema21);
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on fieldList2 and typeList13.", fieldList2.equals(typeList13) == typeList13.equals(fieldList2));
    }
}

