package org.apache.avro.io.parsing;

import org.junit.Test;

public class SymbolM3RandomTest {

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
 System.out.format("%n%s%n", "SymbolRandoopGen0.test01");
 org.apache.avro.io.parsing.Symbol.IntCheckAction intCheckAction1 = new org.apache.avro.io.parsing.Symbol.IntCheckAction((int) 'a');
 }

 @Test
 public void test02() throws Throwable {
 if (debug)
 System.out.format("%n%s%n", "SymbolRandoopGen0.test02");
 org.apache.avro.io.parsing.Symbol symbol1 = org.apache.avro.io.parsing.Symbol.error("hi!");
 org.junit.Assert.assertNotNull(symbol1);
 }

 @Test
 public void test03() throws Throwable {
 if (debug)
 System.out.format("%n%s%n", "SymbolRandoopGen0.test03");
 org.apache.avro.io.parsing.Symbol.Kind kind0 = org.apache.avro.io.parsing.Symbol.Kind.ALTERNATIVE;
 org.junit.Assert.assertTrue("'" + kind0 + "' != '" + org.apache.avro.io.parsing.Symbol.Kind.ALTERNATIVE + "'", kind0.equals(org.apache.avro.io.parsing.Symbol.Kind.ALTERNATIVE));
 }

 @Test
 public void test04() throws Throwable {
 if (debug)
 System.out.format("%n%s%n", "SymbolRandoopGen0.test04");
 org.apache.avro.io.parsing.Symbol symbol0 = org.apache.avro.io.parsing.Symbol.STRING;
 org.junit.Assert.assertNotNull(symbol0);
 }

 @Test
 public void test05() throws Throwable {
 if (debug)
 System.out.format("%n%s%n", "SymbolRandoopGen0.test05");
 org.apache.avro.io.parsing.Symbol symbol0 = org.apache.avro.io.parsing.Symbol.BOOLEAN;
 org.junit.Assert.assertNotNull(symbol0);
 }

 @Test
 public void test06() throws Throwable {
 if (debug)
 System.out.format("%n%s%n", "SymbolRandoopGen0.test06");
 org.apache.avro.io.parsing.Symbol symbol0 = org.apache.avro.io.parsing.Symbol.BYTES;
 org.apache.avro.io.parsing.Symbol.Kind kind1 = symbol0.kind;
 java.lang.Class<?> wildcardClass2 = kind1.getClass();
 org.junit.Assert.assertNotNull(symbol0);
 org.junit.Assert.assertTrue("'" + kind1 + "' != '" + org.apache.avro.io.parsing.Symbol.Kind.TERMINAL + "'", kind1.equals(org.apache.avro.io.parsing.Symbol.Kind.TERMINAL));
 org.junit.Assert.assertNotNull(wildcardClass2);
 }

 @Test
 public void test07() throws Throwable {
 if (debug)
 System.out.format("%n%s%n", "SymbolRandoopGen0.test07");
 org.apache.avro.io.parsing.Symbol symbol0 = org.apache.avro.io.parsing.Symbol.BYTES;
 org.apache.avro.io.parsing.Symbol.Kind kind1 = symbol0.kind;
 org.apache.avro.io.parsing.Symbol symbol2 = org.apache.avro.io.parsing.Symbol.BYTES;
 org.apache.avro.io.parsing.Symbol symbol3 = org.apache.avro.io.parsing.Symbol.resolve(symbol0, symbol2);
 int int4 = symbol0.flattenedSize();
 org.junit.Assert.assertNotNull(symbol0);
 org.junit.Assert.assertTrue("'" + kind1 + "' != '" + org.apache.avro.io.parsing.Symbol.Kind.TERMINAL + "'", kind1.equals(org.apache.avro.io.parsing.Symbol.Kind.TERMINAL));
 org.junit.Assert.assertNotNull(symbol2);
 org.junit.Assert.assertNotNull(symbol3);
 org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
 }

 @Test
 public void test08() throws Throwable {
 if (debug)
 System.out.format("%n%s%n", "SymbolRandoopGen0.test08");
 org.apache.avro.io.parsing.Symbol symbol0 = org.apache.avro.io.parsing.Symbol.NULL;
 org.apache.avro.io.parsing.Symbol symbol1 = org.apache.avro.io.parsing.Symbol.NULL;
 org.apache.avro.io.parsing.Symbol symbol2 = org.apache.avro.io.parsing.Symbol.NULL;
 org.apache.avro.io.parsing.Symbol symbol3 = org.apache.avro.io.parsing.Symbol.NULL;
 org.apache.avro.io.parsing.Symbol symbol4 = org.apache.avro.io.parsing.Symbol.NULL;
 org.apache.avro.io.parsing.Symbol[] symbolArray5 = new org.apache.avro.io.parsing.Symbol[] { symbol1, symbol2, symbol3, symbol4 };
 java.lang.String[] strArray6 = new java.lang.String[] {};
 org.apache.avro.io.parsing.Symbol symbol7 = org.apache.avro.io.parsing.Symbol.alt(symbolArray5, strArray6);
 org.apache.avro.io.parsing.Symbol symbol8 = org.apache.avro.io.parsing.Symbol.repeat(symbol0, symbolArray5);
 java.lang.Class<?> wildcardClass9 = symbol8.getClass();
 org.junit.Assert.assertNotNull(symbol0);
 org.junit.Assert.assertNotNull(symbol1);
 org.junit.Assert.assertNotNull(symbol2);
 org.junit.Assert.assertNotNull(symbol3);
 org.junit.Assert.assertNotNull(symbol4);
 org.junit.Assert.assertNotNull(symbolArray5);
 org.junit.Assert.assertNotNull(strArray6);
 org.junit.Assert.assertArrayEquals(strArray6, new java.lang.String[] {});
 org.junit.Assert.assertNotNull(symbol7);
 org.junit.Assert.assertNotNull(symbol8);
 org.junit.Assert.assertNotNull(wildcardClass9);
 }

 @Test
 public void test09() throws Throwable {
 if (debug)
 System.out.format("%n%s%n", "SymbolRandoopGen0.test09");
 org.apache.avro.io.parsing.Symbol symbol0 = org.apache.avro.io.parsing.Symbol.NULL;
 org.apache.avro.io.parsing.Symbol symbol1 = org.apache.avro.io.parsing.Symbol.NULL;
 org.apache.avro.io.parsing.Symbol symbol2 = org.apache.avro.io.parsing.Symbol.NULL;
 org.apache.avro.io.parsing.Symbol symbol3 = org.apache.avro.io.parsing.Symbol.NULL;
 org.apache.avro.io.parsing.Symbol[] symbolArray4 = new org.apache.avro.io.parsing.Symbol[] { symbol0, symbol1, symbol2, symbol3 };
 java.lang.String[] strArray5 = new java.lang.String[] {};
 org.apache.avro.io.parsing.Symbol symbol6 = org.apache.avro.io.parsing.Symbol.alt(symbolArray4, strArray5);
 int int8 = org.apache.avro.io.parsing.Symbol.flattenedSize(symbolArray4, (int) '4');
 org.junit.Assert.assertNotNull(symbol0);
 org.junit.Assert.assertNotNull(symbol1);
 org.junit.Assert.assertNotNull(symbol2);
 org.junit.Assert.assertNotNull(symbol3);
 org.junit.Assert.assertNotNull(symbolArray4);
 org.junit.Assert.assertNotNull(strArray5);
 org.junit.Assert.assertArrayEquals(strArray5, new java.lang.String[] {});
 org.junit.Assert.assertNotNull(symbol6);
 org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
 }

 @Test
 public void test10() throws Throwable {
 if (debug)
 System.out.format("%n%s%n", "SymbolRandoopGen0.test10");
 org.apache.avro.io.parsing.Symbol symbol0 = org.apache.avro.io.parsing.Symbol.ENUM;
 org.junit.Assert.assertNotNull(symbol0);
 }

 @Test
 public void test11() throws Throwable {
 if (debug)
 System.out.format("%n%s%n", "SymbolRandoopGen0.test11");
 org.apache.avro.io.parsing.Symbol symbol0 = org.apache.avro.io.parsing.Symbol.ITEM_END;
 org.junit.Assert.assertNotNull(symbol0);
 }

 @Test
 public void test12() throws Throwable {
 if (debug)
 System.out.format("%n%s%n", "SymbolRandoopGen0.test12");
 org.apache.avro.io.parsing.Symbol symbol0 = org.apache.avro.io.parsing.Symbol.NULL;
 org.apache.avro.io.parsing.Symbol symbol1 = org.apache.avro.io.parsing.Symbol.NULL;
 org.apache.avro.io.parsing.Symbol symbol2 = org.apache.avro.io.parsing.Symbol.NULL;
 org.apache.avro.io.parsing.Symbol symbol3 = org.apache.avro.io.parsing.Symbol.NULL;
 org.apache.avro.io.parsing.Symbol symbol4 = org.apache.avro.io.parsing.Symbol.NULL;
 org.apache.avro.io.parsing.Symbol[] symbolArray5 = new org.apache.avro.io.parsing.Symbol[] { symbol1, symbol2, symbol3, symbol4 };
 java.lang.String[] strArray6 = new java.lang.String[] {};
 org.apache.avro.io.parsing.Symbol symbol7 = org.apache.avro.io.parsing.Symbol.alt(symbolArray5, strArray6);
 org.apache.avro.io.parsing.Symbol symbol8 = org.apache.avro.io.parsing.Symbol.repeat(symbol0, symbolArray5);
 org.apache.avro.io.parsing.Symbol.WriterUnionAction writerUnionAction9 = new org.apache.avro.io.parsing.Symbol.WriterUnionAction();
 org.apache.avro.io.parsing.Symbol symbol10 = org.apache.avro.io.parsing.Symbol.resolve(symbol8, (org.apache.avro.io.parsing.Symbol) writerUnionAction9);
 org.junit.Assert.assertNotNull(symbol0);
 org.junit.Assert.assertNotNull(symbol1);
 org.junit.Assert.assertNotNull(symbol2);
 org.junit.Assert.assertNotNull(symbol3);
 org.junit.Assert.assertNotNull(symbol4);
 org.junit.Assert.assertNotNull(symbolArray5);
 org.junit.Assert.assertNotNull(strArray6);
 org.junit.Assert.assertArrayEquals(strArray6, new java.lang.String[] {});
 org.junit.Assert.assertNotNull(symbol7);
 org.junit.Assert.assertNotNull(symbol8);
 org.junit.Assert.assertNotNull(symbol10);
 }

 @Test
 public void test13() throws Throwable {
 if (debug)
 System.out.format("%n%s%n", "SymbolRandoopGen0.test13");
 org.apache.avro.io.parsing.Symbol symbol0 = org.apache.avro.io.parsing.Symbol.RECORD_END;
 org.apache.avro.io.parsing.Symbol symbol1 = org.apache.avro.io.parsing.Symbol.MAP_END;
 org.apache.avro.io.parsing.Symbol symbol2 = org.apache.avro.io.parsing.Symbol.NULL;
 org.apache.avro.io.parsing.Symbol symbol3 = org.apache.avro.io.parsing.Symbol.NULL;
 org.apache.avro.io.parsing.Symbol symbol4 = org.apache.avro.io.parsing.Symbol.NULL;
 org.apache.avro.io.parsing.Symbol symbol5 = org.apache.avro.io.parsing.Symbol.NULL;
 org.apache.avro.io.parsing.Symbol[] symbolArray6 = new org.apache.avro.io.parsing.Symbol[] { symbol2, symbol3, symbol4, symbol5 };
 java.lang.String[] strArray7 = new java.lang.String[] {};
 org.apache.avro.io.parsing.Symbol symbol8 = org.apache.avro.io.parsing.Symbol.alt(symbolArray6, strArray7);
 org.apache.avro.io.parsing.Symbol symbol9 = org.apache.avro.io.parsing.Symbol.resolve(symbol1, symbol8);
 org.apache.avro.io.parsing.Symbol symbol10 = org.apache.avro.io.parsing.Symbol.resolve(symbol0, symbol9);
 org.junit.Assert.assertNotNull(symbol0);
 org.junit.Assert.assertNotNull(symbol1);
 org.junit.Assert.assertNotNull(symbol2);
 org.junit.Assert.assertNotNull(symbol3);
 org.junit.Assert.assertNotNull(symbol4);
 org.junit.Assert.assertNotNull(symbol5);
 org.junit.Assert.assertNotNull(symbolArray6);
 org.junit.Assert.assertNotNull(strArray7);
 org.junit.Assert.assertArrayEquals(strArray7, new java.lang.String[] {});
 org.junit.Assert.assertNotNull(symbol8);
 org.junit.Assert.assertNotNull(symbol9);
 org.junit.Assert.assertNotNull(symbol10);
 }

 @Test
 public void test14() throws Throwable {
 if (debug)
 System.out.format("%n%s%n", "SymbolRandoopGen0.test14");
 org.apache.avro.io.parsing.Symbol symbol0 = org.apache.avro.io.parsing.Symbol.MAP_KEY_MARKER;
 org.junit.Assert.assertNotNull(symbol0);
 }

 @Test
 public void test15() throws Throwable {
 if (debug)
 System.out.format("%n%s%n", "SymbolRandoopGen0.test15");
 java.lang.String[] strArray1 = new java.lang.String[] { "hi!" };
 java.util.ArrayList<java.lang.String> strList2 = new java.util.ArrayList<java.lang.String>();
 boolean boolean3 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList2, strArray1);
 org.apache.avro.io.parsing.Symbol.EnumLabelsAction enumLabelsAction4 = new org.apache.avro.io.parsing.Symbol.EnumLabelsAction((java.util.List<java.lang.String>) strList2);
 org.apache.avro.io.parsing.Symbol.EnumLabelsAction enumLabelsAction5 = new org.apache.avro.io.parsing.Symbol.EnumLabelsAction((java.util.List<java.lang.String>) strList2);
 // The following exception was thrown during execution in test generation
 try {
 java.lang.String str7 = enumLabelsAction5.getLabel(100);
 org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 100, Size: 1");
 } catch (java.lang.IndexOutOfBoundsException e) {
 // Expected exception.
 }
 org.junit.Assert.assertNotNull(strArray1);
 org.junit.Assert.assertArrayEquals(strArray1, new java.lang.String[] { "hi!" });
 org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
 }

 @Test
 public void test16() throws Throwable {
 if (debug)
 System.out.format("%n%s%n", "SymbolRandoopGen0.test16");
 org.apache.avro.io.parsing.Symbol symbol0 = org.apache.avro.io.parsing.Symbol.ARRAY_END;
 org.junit.Assert.assertNotNull(symbol0);
 }

 @Test
 public void test17() throws Throwable {
 if (debug)
 System.out.format("%n%s%n", "SymbolRandoopGen0.test17");
 org.apache.avro.io.parsing.Symbol.Kind kind0 = org.apache.avro.io.parsing.Symbol.Kind.IMPLICIT_ACTION;
 org.junit.Assert.assertTrue("'" + kind0 + "' != '" + org.apache.avro.io.parsing.Symbol.Kind.IMPLICIT_ACTION + "'", kind0.equals(org.apache.avro.io.parsing.Symbol.Kind.IMPLICIT_ACTION));
 }

 @Test
 public void test18() throws Throwable {
 if (debug)
 System.out.format("%n%s%n", "SymbolRandoopGen0.test18");
 org.apache.avro.io.parsing.Symbol.Kind kind0 = org.apache.avro.io.parsing.Symbol.Kind.TERMINAL;
 org.junit.Assert.assertTrue("'" + kind0 + "' != '" + org.apache.avro.io.parsing.Symbol.Kind.TERMINAL + "'", kind0.equals(org.apache.avro.io.parsing.Symbol.Kind.TERMINAL));
 }

 @Test
 public void test19() throws Throwable {
 if (debug)
 System.out.format("%n%s%n", "SymbolRandoopGen0.test19");
 org.apache.avro.io.parsing.Symbol symbol1 = org.apache.avro.io.parsing.Symbol.NULL;
 org.apache.avro.io.parsing.Symbol symbol2 = org.apache.avro.io.parsing.Symbol.NULL;
 org.apache.avro.io.parsing.Symbol symbol3 = org.apache.avro.io.parsing.Symbol.NULL;
 org.apache.avro.io.parsing.Symbol symbol4 = org.apache.avro.io.parsing.Symbol.NULL;
 org.apache.avro.io.parsing.Symbol symbol5 = org.apache.avro.io.parsing.Symbol.NULL;
 org.apache.avro.io.parsing.Symbol[] symbolArray6 = new org.apache.avro.io.parsing.Symbol[] { symbol2, symbol3, symbol4, symbol5 };
 java.lang.String[] strArray7 = new java.lang.String[] {};
 org.apache.avro.io.parsing.Symbol symbol8 = org.apache.avro.io.parsing.Symbol.alt(symbolArray6, strArray7);
 org.apache.avro.io.parsing.Symbol symbol9 = org.apache.avro.io.parsing.Symbol.repeat(symbol1, symbolArray6);
 org.apache.avro.io.parsing.Symbol.EnumAdjustAction enumAdjustAction10 = new org.apache.avro.io.parsing.Symbol.EnumAdjustAction(100, (java.lang.Object[]) symbolArray6);
 int int11 = enumAdjustAction10.size;
 org.junit.Assert.assertNotNull(symbol1);
 org.junit.Assert.assertNotNull(symbol2);
 org.junit.Assert.assertNotNull(symbol3);
 org.junit.Assert.assertNotNull(symbol4);
 org.junit.Assert.assertNotNull(symbol5);
 org.junit.Assert.assertNotNull(symbolArray6);
 org.junit.Assert.assertNotNull(strArray7);
 org.junit.Assert.assertArrayEquals(strArray7, new java.lang.String[] {});
 org.junit.Assert.assertNotNull(symbol8);
 org.junit.Assert.assertNotNull(symbol9);
 org.junit.Assert.assertTrue("'" + int11 + "' != '" + 100 + "'", int11 == 100);
 }

 @Test
 public void test20() throws Throwable {
 if (debug)
 System.out.format("%n%s%n", "SymbolRandoopGen0.test20");
 org.apache.avro.io.parsing.Symbol symbol1 = org.apache.avro.io.parsing.Symbol.BYTES;
 org.apache.avro.io.parsing.Symbol.Kind kind2 = symbol1.kind;
 org.apache.avro.io.parsing.Symbol symbol3 = org.apache.avro.io.parsing.Symbol.BYTES;
 org.apache.avro.io.parsing.Symbol symbol4 = org.apache.avro.io.parsing.Symbol.resolve(symbol1, symbol3);
 org.apache.avro.io.parsing.Symbol.UnionAdjustAction unionAdjustAction5 = new org.apache.avro.io.parsing.Symbol.UnionAdjustAction((-1), symbol3);
 int int6 = symbol3.flattenedSize();
 org.junit.Assert.assertNotNull(symbol1);
 org.junit.Assert.assertTrue("'" + kind2 + "' != '" + org.apache.avro.io.parsing.Symbol.Kind.TERMINAL + "'", kind2.equals(org.apache.avro.io.parsing.Symbol.Kind.TERMINAL));
 org.junit.Assert.assertNotNull(symbol3);
 org.junit.Assert.assertNotNull(symbol4);
 org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
 }

 @Test
 public void test21() throws Throwable {
 if (debug)
 System.out.format("%n%s%n", "SymbolRandoopGen0.test21");
 java.lang.String[] strArray1 = new java.lang.String[] { "hi!" };
 java.util.ArrayList<java.lang.String> strList2 = new java.util.ArrayList<java.lang.String>();
 boolean boolean3 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList2, strArray1);
 org.apache.avro.io.parsing.Symbol.EnumLabelsAction enumLabelsAction4 = new org.apache.avro.io.parsing.Symbol.EnumLabelsAction((java.util.List<java.lang.String>) strList2);
 org.apache.avro.io.parsing.Symbol.EnumLabelsAction enumLabelsAction5 = new org.apache.avro.io.parsing.Symbol.EnumLabelsAction((java.util.List<java.lang.String>) strList2);
 int int7 = enumLabelsAction5.findLabel("hi!");
 int int9 = enumLabelsAction5.findLabel("");
 int int11 = enumLabelsAction5.findLabel("");
 org.junit.Assert.assertNotNull(strArray1);
 org.junit.Assert.assertArrayEquals(strArray1, new java.lang.String[] { "hi!" });
 org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
 org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
 org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
 org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
 }

 @Test
 public void test22() throws Throwable {
 if (debug)
 System.out.format("%n%s%n", "SymbolRandoopGen0.test22");
 org.apache.avro.io.parsing.Symbol.Kind kind0 = org.apache.avro.io.parsing.Symbol.Kind.SEQUENCE;
 org.junit.Assert.assertTrue("'" + kind0 + "' != '" + org.apache.avro.io.parsing.Symbol.Kind.SEQUENCE + "'", kind0.equals(org.apache.avro.io.parsing.Symbol.Kind.SEQUENCE));
 }

 @Test
 public void test23() throws Throwable {
 if (debug)
 System.out.format("%n%s%n", "SymbolRandoopGen0.test23");
 java.lang.String[] strArray1 = new java.lang.String[] { "hi!" };
 java.util.ArrayList<java.lang.String> strList2 = new java.util.ArrayList<java.lang.String>();
 boolean boolean3 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList2, strArray1);
 org.apache.avro.io.parsing.Symbol.EnumLabelsAction enumLabelsAction4 = new org.apache.avro.io.parsing.Symbol.EnumLabelsAction((java.util.List<java.lang.String>) strList2);
 org.apache.avro.io.parsing.Symbol.EnumLabelsAction enumLabelsAction5 = new org.apache.avro.io.parsing.Symbol.EnumLabelsAction((java.util.List<java.lang.String>) strList2);
 // The following exception was thrown during execution in test generation
 try {
 java.lang.String str7 = enumLabelsAction5.getLabel((int) (short) 1);
 org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 1, Size: 1");
 } catch (java.lang.IndexOutOfBoundsException e) {
 // Expected exception.
 }
 org.junit.Assert.assertNotNull(strArray1);
 org.junit.Assert.assertArrayEquals(strArray1, new java.lang.String[] { "hi!" });
 org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
 }

 @Test
 public void test24() throws Throwable {
 if (debug)
 System.out.format("%n%s%n", "SymbolRandoopGen0.test24");
 org.apache.avro.io.parsing.Symbol symbol0 = org.apache.avro.io.parsing.Symbol.ARRAY_START;
 org.junit.Assert.assertNotNull(symbol0);
 }

 @Test
 public void test25() throws Throwable {
 if (debug)
 System.out.format("%n%s%n", "SymbolRandoopGen0.test25");
 org.apache.avro.io.parsing.Symbol symbol1 = org.apache.avro.io.parsing.Symbol.BYTES;
 org.apache.avro.io.parsing.Symbol.Kind kind2 = symbol1.kind;
 org.apache.avro.io.parsing.Symbol symbol3 = org.apache.avro.io.parsing.Symbol.BYTES;
 org.apache.avro.io.parsing.Symbol symbol4 = org.apache.avro.io.parsing.Symbol.resolve(symbol1, symbol3);
 org.apache.avro.io.parsing.Symbol.UnionAdjustAction unionAdjustAction5 = new org.apache.avro.io.parsing.Symbol.UnionAdjustAction((-1), symbol3);
 org.apache.avro.io.parsing.Symbol[] symbolArray6 = unionAdjustAction5.production;
 org.junit.Assert.assertNotNull(symbol1);
 org.junit.Assert.assertTrue("'" + kind2 + "' != '" + org.apache.avro.io.parsing.Symbol.Kind.TERMINAL + "'", kind2.equals(org.apache.avro.io.parsing.Symbol.Kind.TERMINAL));
 org.junit.Assert.assertNotNull(symbol3);
 org.junit.Assert.assertNotNull(symbol4);
 org.junit.Assert.assertNull(symbolArray6);
 }

 @Test
 public void test26() throws Throwable {
 if (debug)
 System.out.format("%n%s%n", "SymbolRandoopGen0.test26");
 org.apache.avro.io.parsing.Symbol symbol0 = org.apache.avro.io.parsing.Symbol.UNION;
 org.apache.avro.io.parsing.Symbol symbol2 = org.apache.avro.io.parsing.Symbol.NULL;
 org.apache.avro.io.parsing.Symbol symbol3 = org.apache.avro.io.parsing.Symbol.NULL;
 org.apache.avro.io.parsing.Symbol symbol4 = org.apache.avro.io.parsing.Symbol.NULL;
 org.apache.avro.io.parsing.Symbol symbol5 = org.apache.avro.io.parsing.Symbol.NULL;
 org.apache.avro.io.parsing.Symbol[] symbolArray6 = new org.apache.avro.io.parsing.Symbol[] { symbol2, symbol3, symbol4, symbol5 };
 java.lang.String[] strArray7 = new java.lang.String[] {};
 org.apache.avro.io.parsing.Symbol symbol8 = org.apache.avro.io.parsing.Symbol.alt(symbolArray6, strArray7);
 int int10 = org.apache.avro.io.parsing.Symbol.flattenedSize(symbolArray6, (int) 'a');
 org.apache.avro.io.parsing.Symbol.EnumAdjustAction enumAdjustAction11 = new org.apache.avro.io.parsing.Symbol.EnumAdjustAction((int) 'a', (java.lang.Object[]) symbolArray6);
 org.apache.avro.io.parsing.Symbol symbol12 = org.apache.avro.io.parsing.Symbol.repeat(symbol0, symbolArray6);
 org.junit.Assert.assertNotNull(symbol0);
 org.junit.Assert.assertNotNull(symbol2);
 org.junit.Assert.assertNotNull(symbol3);
 org.junit.Assert.assertNotNull(symbol4);
 org.junit.Assert.assertNotNull(symbol5);
 org.junit.Assert.assertNotNull(symbolArray6);
 org.junit.Assert.assertNotNull(strArray7);
 org.junit.Assert.assertArrayEquals(strArray7, new java.lang.String[] {});
 org.junit.Assert.assertNotNull(symbol8);
 org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
 org.junit.Assert.assertNotNull(symbol12);
 }

 @Test
 public void test27() throws Throwable {
 if (debug)
 System.out.format("%n%s%n", "SymbolRandoopGen0.test27");
 org.apache.avro.io.parsing.Symbol symbol0 = org.apache.avro.io.parsing.Symbol.FIELD_ACTION;
 org.junit.Assert.assertNotNull(symbol0);
 }

 @Test
 public void test28() throws Throwable {
 if (debug)
 System.out.format("%n%s%n", "SymbolRandoopGen0.test28");
 org.apache.avro.io.parsing.Symbol symbol0 = org.apache.avro.io.parsing.Symbol.NULL;
 org.apache.avro.io.parsing.Symbol symbol1 = org.apache.avro.io.parsing.Symbol.NULL;
 org.apache.avro.io.parsing.Symbol symbol2 = org.apache.avro.io.parsing.Symbol.NULL;
 org.apache.avro.io.parsing.Symbol symbol3 = org.apache.avro.io.parsing.Symbol.NULL;
 org.apache.avro.io.parsing.Symbol[] symbolArray4 = new org.apache.avro.io.parsing.Symbol[] { symbol0, symbol1, symbol2, symbol3 };
 java.lang.String[] strArray5 = new java.lang.String[] {};
 org.apache.avro.io.parsing.Symbol symbol6 = org.apache.avro.io.parsing.Symbol.alt(symbolArray4, strArray5);
 int int8 = org.apache.avro.io.parsing.Symbol.flattenedSize(symbolArray4, (int) 'a');
 int int10 = org.apache.avro.io.parsing.Symbol.flattenedSize(symbolArray4, (int) ' ');
 org.junit.Assert.assertNotNull(symbol0);
 org.junit.Assert.assertNotNull(symbol1);
 org.junit.Assert.assertNotNull(symbol2);
 org.junit.Assert.assertNotNull(symbol3);
 org.junit.Assert.assertNotNull(symbolArray4);
 org.junit.Assert.assertNotNull(strArray5);
 org.junit.Assert.assertArrayEquals(strArray5, new java.lang.String[] {});
 org.junit.Assert.assertNotNull(symbol6);
 org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
 org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
 }

 @Test
 public void test29() throws Throwable {
 if (debug)
 System.out.format("%n%s%n", "SymbolRandoopGen0.test29");
 org.apache.avro.io.parsing.Symbol symbol0 = org.apache.avro.io.parsing.Symbol.FLOAT;
 org.junit.Assert.assertNotNull(symbol0);
 }

 @Test
 public void test30() throws Throwable {
 if (debug)
 System.out.format("%n%s%n", "SymbolRandoopGen0.test30");
 org.apache.avro.io.parsing.Symbol symbol0 = org.apache.avro.io.parsing.Symbol.MAP_START;
 org.apache.avro.io.parsing.Symbol.SkipAction skipAction1 = new org.apache.avro.io.parsing.Symbol.SkipAction(symbol0);
 org.apache.avro.io.parsing.Symbol symbol2 = skipAction1.symToSkip;
 org.junit.Assert.assertNotNull(symbol0);
 org.junit.Assert.assertNotNull(symbol2);
 }

 @Test
 public void test31() throws Throwable {
 if (debug)
 System.out.format("%n%s%n", "SymbolRandoopGen0.test31");
 org.apache.avro.io.parsing.Symbol symbol0 = org.apache.avro.io.parsing.Symbol.UNION_END;
 org.junit.Assert.assertNotNull(symbol0);
 }

 @Test
 public void test32() throws Throwable {
 if (debug)
 System.out.format("%n%s%n", "SymbolRandoopGen0.test32");
 org.apache.avro.io.parsing.Symbol.Kind kind0 = org.apache.avro.io.parsing.Symbol.Kind.ROOT;
 org.junit.Assert.assertTrue("'" + kind0 + "' != '" + org.apache.avro.io.parsing.Symbol.Kind.ROOT + "'", kind0.equals(org.apache.avro.io.parsing.Symbol.Kind.ROOT));
 }

 @Test
 public void test33() throws Throwable {
 if (debug)
 System.out.format("%n%s%n", "SymbolRandoopGen0.test33");
 org.apache.avro.io.parsing.Symbol symbol0 = org.apache.avro.io.parsing.Symbol.RECORD_END;
 org.apache.avro.io.parsing.Symbol.Kind kind1 = symbol0.kind;
 org.junit.Assert.assertNotNull(symbol0);
 org.junit.Assert.assertTrue("'" + kind1 + "' != '" + org.apache.avro.io.parsing.Symbol.Kind.IMPLICIT_ACTION + "'", kind1.equals(org.apache.avro.io.parsing.Symbol.Kind.IMPLICIT_ACTION));
 }

 @Test
 public void test34() throws Throwable {
 if (debug)
 System.out.format("%n%s%n", "SymbolRandoopGen0.test34");
 byte[] byteArray1 = new byte[] { (byte) 100 };
 org.apache.avro.io.parsing.Symbol.DefaultStartAction defaultStartAction2 = new org.apache.avro.io.parsing.Symbol.DefaultStartAction(byteArray1);
 byte[] byteArray3 = defaultStartAction2.contents;
 org.junit.Assert.assertNotNull(byteArray1);
 org.junit.Assert.assertArrayEquals(byteArray1, new byte[] { (byte) 100 });
 org.junit.Assert.assertNotNull(byteArray3);
 org.junit.Assert.assertArrayEquals(byteArray3, new byte[] { (byte) 100 });
 }

 @Test
 public void test35() throws Throwable {
 if (debug)
 System.out.format("%n%s%n", "SymbolRandoopGen0.test35");
 org.apache.avro.io.parsing.Symbol symbol0 = org.apache.avro.io.parsing.Symbol.INT;
 org.junit.Assert.assertNotNull(symbol0);
 }

 @Test
 public void test36() throws Throwable {
 if (debug)
 System.out.format("%n%s%n", "SymbolRandoopGen0.test36");
 byte[] byteArray1 = new byte[] { (byte) 100 };
 org.apache.avro.io.parsing.Symbol.DefaultStartAction defaultStartAction2 = new org.apache.avro.io.parsing.Symbol.DefaultStartAction(byteArray1);
 org.apache.avro.io.parsing.Symbol.DefaultStartAction defaultStartAction3 = new org.apache.avro.io.parsing.Symbol.DefaultStartAction(byteArray1);
 org.junit.Assert.assertNotNull(byteArray1);
 org.junit.Assert.assertArrayEquals(byteArray1, new byte[] { (byte) 100 });
 }

 @Test
 public void test37() throws Throwable {
 if (debug)
 System.out.format("%n%s%n", "SymbolRandoopGen0.test37");
 org.apache.avro.io.parsing.Symbol.IntCheckAction intCheckAction1 = new org.apache.avro.io.parsing.Symbol.IntCheckAction((int) ' ');
 org.apache.avro.io.parsing.Symbol.Kind kind2 = intCheckAction1.kind;
 org.junit.Assert.assertTrue("'" + kind2 + "' != '" + org.apache.avro.io.parsing.Symbol.Kind.EXPLICIT_ACTION + "'", kind2.equals(org.apache.avro.io.parsing.Symbol.Kind.EXPLICIT_ACTION));
 }

 @Test
 public void test38() throws Throwable {
 if (debug)
 System.out.format("%n%s%n", "SymbolRandoopGen0.test38");
 org.apache.avro.Schema.Field field1 = null;
 org.apache.avro.Schema.Field[] fieldArray2 = new org.apache.avro.Schema.Field[] { field1 };
 org.apache.avro.io.parsing.Symbol.FieldOrderAction fieldOrderAction3 = new org.apache.avro.io.parsing.Symbol.FieldOrderAction(fieldArray2);
 org.apache.avro.io.parsing.Symbol.EnumAdjustAction enumAdjustAction4 = new org.apache.avro.io.parsing.Symbol.EnumAdjustAction((int) '#', (java.lang.Object[]) fieldArray2);
 org.junit.Assert.assertNotNull(fieldArray2);
 org.junit.Assert.assertArrayEquals(fieldArray2, new org.apache.avro.Schema.Field[] { null });
 }

 @Test
 public void test39() throws Throwable {
 if (debug)
 System.out.format("%n%s%n", "SymbolRandoopGen0.test39");
 org.apache.avro.io.parsing.Symbol symbol1 = org.apache.avro.io.parsing.Symbol.NULL;
 org.apache.avro.io.parsing.Symbol symbol2 = org.apache.avro.io.parsing.Symbol.NULL;
 org.apache.avro.io.parsing.Symbol symbol3 = org.apache.avro.io.parsing.Symbol.NULL;
 org.apache.avro.io.parsing.Symbol symbol4 = org.apache.avro.io.parsing.Symbol.NULL;
 org.apache.avro.io.parsing.Symbol symbol5 = org.apache.avro.io.parsing.Symbol.NULL;
 org.apache.avro.io.parsing.Symbol[] symbolArray6 = new org.apache.avro.io.parsing.Symbol[] { symbol2, symbol3, symbol4, symbol5 };
 java.lang.String[] strArray7 = new java.lang.String[] {};
 org.apache.avro.io.parsing.Symbol symbol8 = org.apache.avro.io.parsing.Symbol.alt(symbolArray6, strArray7);
 org.apache.avro.io.parsing.Symbol symbol9 = org.apache.avro.io.parsing.Symbol.repeat(symbol1, symbolArray6);
 org.apache.avro.io.parsing.Symbol.EnumAdjustAction enumAdjustAction10 = new org.apache.avro.io.parsing.Symbol.EnumAdjustAction(100, (java.lang.Object[]) symbolArray6);
 java.lang.Object[] objArray11 = enumAdjustAction10.adjustments;
 java.lang.Object[] objArray12 = enumAdjustAction10.adjustments;
 org.junit.Assert.assertNotNull(symbol1);
 org.junit.Assert.assertNotNull(symbol2);
 org.junit.Assert.assertNotNull(symbol3);
 org.junit.Assert.assertNotNull(symbol4);
 org.junit.Assert.assertNotNull(symbol5);
 org.junit.Assert.assertNotNull(symbolArray6);
 org.junit.Assert.assertNotNull(strArray7);
 org.junit.Assert.assertArrayEquals(strArray7, new java.lang.String[] {});
 org.junit.Assert.assertNotNull(symbol8);
 org.junit.Assert.assertNotNull(symbol9);
 org.junit.Assert.assertNotNull(objArray11);
 org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray11), "[null, null, null, null]");
 org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray11), "[null, null, null, null]");
 org.junit.Assert.assertNotNull(objArray12);
 org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray12), "[null, null, null, null]");
 org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray12), "[null, null, null, null]");
 }

 @Test
 public void test40() throws Throwable {
 if (debug)
 System.out.format("%n%s%n", "SymbolRandoopGen0.test40");
 org.apache.avro.io.parsing.Symbol symbol0 = org.apache.avro.io.parsing.Symbol.NULL;
 org.apache.avro.io.parsing.Symbol symbol1 = org.apache.avro.io.parsing.Symbol.NULL;
 org.apache.avro.io.parsing.Symbol symbol2 = org.apache.avro.io.parsing.Symbol.NULL;
 org.apache.avro.io.parsing.Symbol symbol3 = org.apache.avro.io.parsing.Symbol.NULL;
 org.apache.avro.io.parsing.Symbol[] symbolArray4 = new org.apache.avro.io.parsing.Symbol[] { symbol0, symbol1, symbol2, symbol3 };
 java.lang.String[] strArray5 = new java.lang.String[] {};
 org.apache.avro.io.parsing.Symbol symbol6 = org.apache.avro.io.parsing.Symbol.alt(symbolArray4, strArray5);
 int int8 = org.apache.avro.io.parsing.Symbol.flattenedSize(symbolArray4, (int) 'a');
 org.apache.avro.io.parsing.Symbol symbol9 = org.apache.avro.io.parsing.Symbol.seq(symbolArray4);
 org.apache.avro.io.parsing.Symbol.SkipAction skipAction10 = new org.apache.avro.io.parsing.Symbol.SkipAction(symbol9);
 org.junit.Assert.assertNotNull(symbol0);
 org.junit.Assert.assertNotNull(symbol1);
 org.junit.Assert.assertNotNull(symbol2);
 org.junit.Assert.assertNotNull(symbol3);
 org.junit.Assert.assertNotNull(symbolArray4);
 org.junit.Assert.assertNotNull(strArray5);
 org.junit.Assert.assertArrayEquals(strArray5, new java.lang.String[] {});
 org.junit.Assert.assertNotNull(symbol6);
 org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
 org.junit.Assert.assertNotNull(symbol9);
 }

 @Test
 public void test41() throws Throwable {
 if (debug)
 System.out.format("%n%s%n", "SymbolRandoopGen0.test41");
 org.apache.avro.io.parsing.Symbol symbol0 = null;
 java.lang.String[] strArray2 = new java.lang.String[] { "hi!" };
 java.util.ArrayList<java.lang.String> strList3 = new java.util.ArrayList<java.lang.String>();
 boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList3, strArray2);
 org.apache.avro.io.parsing.Symbol.EnumLabelsAction enumLabelsAction5 = new org.apache.avro.io.parsing.Symbol.EnumLabelsAction((java.util.List<java.lang.String>) strList3);
 org.apache.avro.io.parsing.Symbol.EnumLabelsAction enumLabelsAction6 = new org.apache.avro.io.parsing.Symbol.EnumLabelsAction((java.util.List<java.lang.String>) strList3);
 int int8 = enumLabelsAction6.findLabel("hi!");
 int int9 = enumLabelsAction6.flattenedSize();
 org.apache.avro.io.parsing.Symbol symbol10 = org.apache.avro.io.parsing.Symbol.resolve(symbol0, (org.apache.avro.io.parsing.Symbol) enumLabelsAction6);
 org.junit.Assert.assertNotNull(strArray2);
 org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] { "hi!" });
 org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
 org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
 org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
 org.junit.Assert.assertNotNull(symbol10);
 }

 @Test
 public void test42() throws Throwable {
 if (debug)
 System.out.format("%n%s%n", "SymbolRandoopGen0.test42");
 byte[] byteArray3 = new byte[] { (byte) -1, (byte) 10, (byte) 100 };
 org.apache.avro.io.parsing.Symbol.DefaultStartAction defaultStartAction4 = new org.apache.avro.io.parsing.Symbol.DefaultStartAction(byteArray3);
 byte[] byteArray5 = defaultStartAction4.contents;
 org.junit.Assert.assertNotNull(byteArray3);
 org.junit.Assert.assertArrayEquals(byteArray3, new byte[] { (byte) -1, (byte) 10, (byte) 100 });
 org.junit.Assert.assertNotNull(byteArray5);
 org.junit.Assert.assertArrayEquals(byteArray5, new byte[] { (byte) -1, (byte) 10, (byte) 100 });
 }

 @Test
 public void test43() throws Throwable {
 if (debug)
 System.out.format("%n%s%n", "SymbolRandoopGen0.test43");
 java.lang.String[] strArray1 = new java.lang.String[] { "hi!" };
 java.util.ArrayList<java.lang.String> strList2 = new java.util.ArrayList<java.lang.String>();
 boolean boolean3 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList2, strArray1);
 org.apache.avro.io.parsing.Symbol.EnumLabelsAction enumLabelsAction4 = new org.apache.avro.io.parsing.Symbol.EnumLabelsAction((java.util.List<java.lang.String>) strList2);
 org.apache.avro.io.parsing.Symbol.EnumLabelsAction enumLabelsAction5 = new org.apache.avro.io.parsing.Symbol.EnumLabelsAction((java.util.List<java.lang.String>) strList2);
 int int7 = enumLabelsAction5.findLabel("hi!");
 int int8 = enumLabelsAction5.size;
 // The following exception was thrown during execution in test generation
 try {
 java.lang.String str10 = enumLabelsAction5.getLabel((int) (short) 100);
 org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 100, Size: 1");
 } catch (java.lang.IndexOutOfBoundsException e) {
 // Expected exception.
 }
 org.junit.Assert.assertNotNull(strArray1);
 org.junit.Assert.assertArrayEquals(strArray1, new java.lang.String[] { "hi!" });
 org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
 org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
 org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
 }

 @Test
 public void test44() throws Throwable {
 if (debug)
 System.out.format("%n%s%n", "SymbolRandoopGen0.test44");
 java.lang.String[] strArray1 = new java.lang.String[] { "hi!" };
 java.util.ArrayList<java.lang.String> strList2 = new java.util.ArrayList<java.lang.String>();
 boolean boolean3 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList2, strArray1);
 org.apache.avro.io.parsing.Symbol.EnumLabelsAction enumLabelsAction4 = new org.apache.avro.io.parsing.Symbol.EnumLabelsAction((java.util.List<java.lang.String>) strList2);
 org.apache.avro.io.parsing.Symbol.EnumLabelsAction enumLabelsAction5 = new org.apache.avro.io.parsing.Symbol.EnumLabelsAction((java.util.List<java.lang.String>) strList2);
 int int7 = enumLabelsAction5.findLabel("hi!");
 int int8 = enumLabelsAction5.flattenedSize();
 java.util.List<java.lang.String> strList9 = enumLabelsAction5.symbols;
 java.util.List<java.lang.String> strList10 = enumLabelsAction5.symbols;
 org.junit.Assert.assertNotNull(strArray1);
 org.junit.Assert.assertArrayEquals(strArray1, new java.lang.String[] { "hi!" });
 org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
 org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
 org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
 org.junit.Assert.assertNotNull(strList9);
 org.junit.Assert.assertNotNull(strList10);
 }

 @Test
 public void test45() throws Throwable {
 if (debug)
 System.out.format("%n%s%n", "SymbolRandoopGen0.test45");
 org.apache.avro.io.parsing.Symbol symbol2 = org.apache.avro.io.parsing.Symbol.NULL;
 org.apache.avro.io.parsing.Symbol symbol3 = org.apache.avro.io.parsing.Symbol.NULL;
 org.apache.avro.io.parsing.Symbol symbol4 = org.apache.avro.io.parsing.Symbol.NULL;
 org.apache.avro.io.parsing.Symbol symbol5 = org.apache.avro.io.parsing.Symbol.NULL;
 org.apache.avro.io.parsing.Symbol[] symbolArray6 = new org.apache.avro.io.parsing.Symbol[] { symbol2, symbol3, symbol4, symbol5 };
 java.lang.String[] strArray7 = new java.lang.String[] {};
 org.apache.avro.io.parsing.Symbol symbol8 = org.apache.avro.io.parsing.Symbol.alt(symbolArray6, strArray7);
 int int10 = org.apache.avro.io.parsing.Symbol.flattenedSize(symbolArray6, (int) 'a');
 org.apache.avro.io.parsing.Symbol.EnumAdjustAction enumAdjustAction11 = new org.apache.avro.io.parsing.Symbol.EnumAdjustAction((int) 'a', (java.lang.Object[]) symbolArray6);
 java.lang.String[] strArray12 = new java.lang.String[] {};
 org.apache.avro.io.parsing.Symbol symbol13 = org.apache.avro.io.parsing.Symbol.alt(symbolArray6, strArray12);
 org.apache.avro.io.parsing.Symbol.EnumAdjustAction enumAdjustAction14 = new org.apache.avro.io.parsing.Symbol.EnumAdjustAction(100, (java.lang.Object[]) strArray12);
 org.junit.Assert.assertNotNull(symbol2);
 org.junit.Assert.assertNotNull(symbol3);
 org.junit.Assert.assertNotNull(symbol4);
 org.junit.Assert.assertNotNull(symbol5);
 org.junit.Assert.assertNotNull(symbolArray6);
 org.junit.Assert.assertNotNull(strArray7);
 org.junit.Assert.assertArrayEquals(strArray7, new java.lang.String[] {});
 org.junit.Assert.assertNotNull(symbol8);
 org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
 org.junit.Assert.assertNotNull(strArray12);
 org.junit.Assert.assertArrayEquals(strArray12, new java.lang.String[] {});
 org.junit.Assert.assertNotNull(symbol13);
 }

 @Test
 public void test46() throws Throwable {
 if (debug)
 System.out.format("%n%s%n", "SymbolRandoopGen0.test46");
 org.apache.avro.io.parsing.Symbol.Kind kind0 = org.apache.avro.io.parsing.Symbol.Kind.REPEATER;
 org.junit.Assert.assertTrue("'" + kind0 + "' != '" + org.apache.avro.io.parsing.Symbol.Kind.REPEATER + "'", kind0.equals(org.apache.avro.io.parsing.Symbol.Kind.REPEATER));
 }

 @Test
 public void test47() throws Throwable {
 if (debug)
 System.out.format("%n%s%n", "SymbolRandoopGen0.test47");
 org.apache.avro.io.parsing.Symbol symbol0 = null;
 org.apache.avro.io.parsing.Symbol symbol2 = org.apache.avro.io.parsing.Symbol.NULL;
 org.apache.avro.io.parsing.Symbol symbol3 = org.apache.avro.io.parsing.Symbol.NULL;
 org.apache.avro.io.parsing.Symbol symbol4 = org.apache.avro.io.parsing.Symbol.NULL;
 org.apache.avro.io.parsing.Symbol symbol5 = org.apache.avro.io.parsing.Symbol.NULL;
 org.apache.avro.io.parsing.Symbol[] symbolArray6 = new org.apache.avro.io.parsing.Symbol[] { symbol2, symbol3, symbol4, symbol5 };
 java.lang.String[] strArray7 = new java.lang.String[] {};
 org.apache.avro.io.parsing.Symbol symbol8 = org.apache.avro.io.parsing.Symbol.alt(symbolArray6, strArray7);
 int int10 = org.apache.avro.io.parsing.Symbol.flattenedSize(symbolArray6, (int) 'a');
 org.apache.avro.io.parsing.Symbol.EnumAdjustAction enumAdjustAction11 = new org.apache.avro.io.parsing.Symbol.EnumAdjustAction((int) 'a', (java.lang.Object[]) symbolArray6);
 java.lang.String[] strArray12 = new java.lang.String[] {};
 org.apache.avro.io.parsing.Symbol symbol13 = org.apache.avro.io.parsing.Symbol.alt(symbolArray6, strArray12);
 org.apache.avro.io.parsing.Symbol symbol14 = org.apache.avro.io.parsing.Symbol.repeat(symbol0, symbolArray6);
 org.junit.Assert.assertNotNull(symbol2);
 org.junit.Assert.assertNotNull(symbol3);
 org.junit.Assert.assertNotNull(symbol4);
 org.junit.Assert.assertNotNull(symbol5);
 org.junit.Assert.assertNotNull(symbolArray6);
 org.junit.Assert.assertNotNull(strArray7);
 org.junit.Assert.assertArrayEquals(strArray7, new java.lang.String[] {});
 org.junit.Assert.assertNotNull(symbol8);
 org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
 org.junit.Assert.assertNotNull(strArray12);
 org.junit.Assert.assertArrayEquals(strArray12, new java.lang.String[] {});
 org.junit.Assert.assertNotNull(symbol13);
 org.junit.Assert.assertNotNull(symbol14);
 }

 @Test
 public void test48() throws Throwable {
 if (debug)
 System.out.format("%n%s%n", "SymbolRandoopGen0.test48");
 org.apache.avro.io.parsing.Symbol symbol0 = org.apache.avro.io.parsing.Symbol.NULL;
 org.apache.avro.io.parsing.Symbol symbol1 = org.apache.avro.io.parsing.Symbol.NULL;
 org.apache.avro.io.parsing.Symbol symbol2 = org.apache.avro.io.parsing.Symbol.NULL;
 org.apache.avro.io.parsing.Symbol symbol3 = org.apache.avro.io.parsing.Symbol.NULL;
 org.apache.avro.io.parsing.Symbol[] symbolArray4 = new org.apache.avro.io.parsing.Symbol[] { symbol0, symbol1, symbol2, symbol3 };
 java.lang.String[] strArray5 = new java.lang.String[] {};
 org.apache.avro.io.parsing.Symbol symbol6 = org.apache.avro.io.parsing.Symbol.alt(symbolArray4, strArray5);
 int int8 = org.apache.avro.io.parsing.Symbol.flattenedSize(symbolArray4, (int) 'a');
 org.apache.avro.io.parsing.Symbol symbol9 = org.apache.avro.io.parsing.Symbol.seq(symbolArray4);
 org.apache.avro.io.parsing.Symbol symbol10 = org.apache.avro.io.parsing.Symbol.NULL;
 org.apache.avro.io.parsing.Symbol symbol11 = org.apache.avro.io.parsing.Symbol.NULL;
 org.apache.avro.io.parsing.Symbol symbol12 = org.apache.avro.io.parsing.Symbol.NULL;
 org.apache.avro.io.parsing.Symbol symbol13 = org.apache.avro.io.parsing.Symbol.NULL;
 org.apache.avro.io.parsing.Symbol[] symbolArray14 = new org.apache.avro.io.parsing.Symbol[] { symbol10, symbol11, symbol12, symbol13 };
 java.lang.String[] strArray15 = new java.lang.String[] {};
 org.apache.avro.io.parsing.Symbol symbol16 = org.apache.avro.io.parsing.Symbol.alt(symbolArray14, strArray15);
 org.apache.avro.io.parsing.Symbol symbol17 = org.apache.avro.io.parsing.Symbol.alt(symbolArray4, strArray15);
 org.junit.Assert.assertNotNull(symbol0);
 org.junit.Assert.assertNotNull(symbol1);
 org.junit.Assert.assertNotNull(symbol2);
 org.junit.Assert.assertNotNull(symbol3);
 org.junit.Assert.assertNotNull(symbolArray4);
 org.junit.Assert.assertNotNull(strArray5);
 org.junit.Assert.assertArrayEquals(strArray5, new java.lang.String[] {});
 org.junit.Assert.assertNotNull(symbol6);
 org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
 org.junit.Assert.assertNotNull(symbol9);
 org.junit.Assert.assertNotNull(symbol10);
 org.junit.Assert.assertNotNull(symbol11);
 org.junit.Assert.assertNotNull(symbol12);
 org.junit.Assert.assertNotNull(symbol13);
 org.junit.Assert.assertNotNull(symbolArray14);
 org.junit.Assert.assertNotNull(strArray15);
 org.junit.Assert.assertArrayEquals(strArray15, new java.lang.String[] {});
 org.junit.Assert.assertNotNull(symbol16);
 org.junit.Assert.assertNotNull(symbol17);
 }

 @Test
 public void test49() throws Throwable {
 if (debug)
 System.out.format("%n%s%n", "SymbolRandoopGen0.test49");
 java.lang.String[] strArray1 = new java.lang.String[] { "hi!" };
 java.util.ArrayList<java.lang.String> strList2 = new java.util.ArrayList<java.lang.String>();
 boolean boolean3 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList2, strArray1);
 org.apache.avro.io.parsing.Symbol.EnumLabelsAction enumLabelsAction4 = new org.apache.avro.io.parsing.Symbol.EnumLabelsAction((java.util.List<java.lang.String>) strList2);
 org.apache.avro.io.parsing.Symbol.EnumLabelsAction enumLabelsAction5 = new org.apache.avro.io.parsing.Symbol.EnumLabelsAction((java.util.List<java.lang.String>) strList2);
 int int7 = enumLabelsAction5.findLabel("hi!");
 int int8 = enumLabelsAction5.size;
 java.util.List<java.lang.String> strList9 = enumLabelsAction5.symbols;
 org.junit.Assert.assertNotNull(strArray1);
 org.junit.Assert.assertArrayEquals(strArray1, new java.lang.String[] { "hi!" });
 org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
 org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
 org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
 org.junit.Assert.assertNotNull(strList9);
 }

 @Test
 public void test50() throws Throwable {
 if (debug)
 System.out.format("%n%s%n", "SymbolRandoopGen0.test50");
 org.apache.avro.io.parsing.Symbol symbol1 = org.apache.avro.io.parsing.Symbol.NULL;
 org.apache.avro.io.parsing.Symbol symbol2 = org.apache.avro.io.parsing.Symbol.NULL;
 org.apache.avro.io.parsing.Symbol symbol3 = org.apache.avro.io.parsing.Symbol.NULL;
 org.apache.avro.io.parsing.Symbol symbol4 = org.apache.avro.io.parsing.Symbol.NULL;
 org.apache.avro.io.parsing.Symbol symbol5 = org.apache.avro.io.parsing.Symbol.NULL;
 org.apache.avro.io.parsing.Symbol[] symbolArray6 = new org.apache.avro.io.parsing.Symbol[] { symbol2, symbol3, symbol4, symbol5 };
 java.lang.String[] strArray7 = new java.lang.String[] {};
 org.apache.avro.io.parsing.Symbol symbol8 = org.apache.avro.io.parsing.Symbol.alt(symbolArray6, strArray7);
 org.apache.avro.io.parsing.Symbol symbol9 = org.apache.avro.io.parsing.Symbol.repeat(symbol1, symbolArray6);
 org.apache.avro.io.parsing.Symbol.EnumAdjustAction enumAdjustAction10 = new org.apache.avro.io.parsing.Symbol.EnumAdjustAction(100, (java.lang.Object[]) symbolArray6);
 java.lang.String[] strArray16 = new java.lang.String[] { "", "", "", "hi!", "" };
 org.apache.avro.io.parsing.Symbol symbol17 = org.apache.avro.io.parsing.Symbol.alt(symbolArray6, strArray16);
 org.junit.Assert.assertNotNull(symbol1);
 org.junit.Assert.assertNotNull(symbol2);
 org.junit.Assert.assertNotNull(symbol3);
 org.junit.Assert.assertNotNull(symbol4);
 org.junit.Assert.assertNotNull(symbol5);
 org.junit.Assert.assertNotNull(symbolArray6);
 org.junit.Assert.assertNotNull(strArray7);
 org.junit.Assert.assertArrayEquals(strArray7, new java.lang.String[] {});
 org.junit.Assert.assertNotNull(symbol8);
 org.junit.Assert.assertNotNull(symbol9);
 org.junit.Assert.assertNotNull(strArray16);
 org.junit.Assert.assertArrayEquals(strArray16, new java.lang.String[] { "", "", "", "hi!", "" });
 org.junit.Assert.assertNotNull(symbol17);
 }

 @Test
 public void test51() throws Throwable {
 if (debug)
 System.out.format("%n%s%n", "SymbolRandoopGen0.test51");
 org.apache.avro.io.parsing.Symbol.FieldAdjustAction fieldAdjustAction2 = new org.apache.avro.io.parsing.Symbol.FieldAdjustAction(10, "hi!");
 int int3 = fieldAdjustAction2.rindex;
 java.lang.String str4 = fieldAdjustAction2.fname;
 java.lang.String str5 = fieldAdjustAction2.fname;
 org.junit.Assert.assertTrue("'" + int3 + "' != '" + 10 + "'", int3 == 10);
 org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
 org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
 }

 @Test
 public void test52() throws Throwable {
 if (debug)
 System.out.format("%n%s%n", "SymbolRandoopGen0.test52");
 org.apache.avro.io.parsing.Symbol symbol0 = org.apache.avro.io.parsing.Symbol.LONG;
 org.junit.Assert.assertNotNull(symbol0);
 }

 @Test
 public void test53() throws Throwable {
 if (debug)
 System.out.format("%n%s%n", "SymbolRandoopGen0.test53");
 org.apache.avro.io.parsing.Symbol symbol1 = org.apache.avro.io.parsing.Symbol.DEFAULT_END_ACTION;
 org.apache.avro.io.parsing.Symbol.UnionAdjustAction unionAdjustAction2 = new org.apache.avro.io.parsing.Symbol.UnionAdjustAction((int) 'a', symbol1);
 int int3 = unionAdjustAction2.flattenedSize();
 org.junit.Assert.assertNotNull(symbol1);
 org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
 }

 @Test
 public void test54() throws Throwable {
 if (debug)
 System.out.format("%n%s%n", "SymbolRandoopGen0.test54");
 org.apache.avro.io.parsing.Symbol symbol2 = org.apache.avro.io.parsing.Symbol.NULL;
 org.apache.avro.io.parsing.Symbol symbol3 = org.apache.avro.io.parsing.Symbol.NULL;
 org.apache.avro.io.parsing.Symbol symbol4 = org.apache.avro.io.parsing.Symbol.NULL;
 org.apache.avro.io.parsing.Symbol symbol5 = org.apache.avro.io.parsing.Symbol.NULL;
 org.apache.avro.io.parsing.Symbol symbol6 = org.apache.avro.io.parsing.Symbol.NULL;
 org.apache.avro.io.parsing.Symbol[] symbolArray7 = new org.apache.avro.io.parsing.Symbol[] { symbol3, symbol4, symbol5, symbol6 };
 java.lang.String[] strArray8 = new java.lang.String[] {};
 org.apache.avro.io.parsing.Symbol symbol9 = org.apache.avro.io.parsing.Symbol.alt(symbolArray7, strArray8);
 org.apache.avro.io.parsing.Symbol symbol10 = org.apache.avro.io.parsing.Symbol.repeat(symbol2, symbolArray7);
 org.apache.avro.io.parsing.Symbol.EnumAdjustAction enumAdjustAction11 = new org.apache.avro.io.parsing.Symbol.EnumAdjustAction(100, (java.lang.Object[]) symbolArray7);
 org.apache.avro.io.parsing.Symbol.UnionAdjustAction unionAdjustAction12 = new org.apache.avro.io.parsing.Symbol.UnionAdjustAction((int) (short) 1, (org.apache.avro.io.parsing.Symbol) enumAdjustAction11);
 org.apache.avro.io.parsing.Symbol.SkipAction skipAction13 = new org.apache.avro.io.parsing.Symbol.SkipAction((org.apache.avro.io.parsing.Symbol) unionAdjustAction12);
 org.apache.avro.io.parsing.Symbol.SkipAction skipAction14 = new org.apache.avro.io.parsing.Symbol.SkipAction((org.apache.avro.io.parsing.Symbol) skipAction13);
 org.apache.avro.io.parsing.Symbol symbol15 = skipAction13.symToSkip;
 org.junit.Assert.assertNotNull(symbol2);
 org.junit.Assert.assertNotNull(symbol3);
 org.junit.Assert.assertNotNull(symbol4);
 org.junit.Assert.assertNotNull(symbol5);
 org.junit.Assert.assertNotNull(symbol6);
 org.junit.Assert.assertNotNull(symbolArray7);
 org.junit.Assert.assertNotNull(strArray8);
 org.junit.Assert.assertArrayEquals(strArray8, new java.lang.String[] {});
 org.junit.Assert.assertNotNull(symbol9);
 org.junit.Assert.assertNotNull(symbol10);
 org.junit.Assert.assertNotNull(symbol15);
 }

 @Test
 public void test55() throws Throwable {
 if (debug)
 System.out.format("%n%s%n", "SymbolRandoopGen0.test55");
 org.apache.avro.io.parsing.Symbol.FieldAdjustAction fieldAdjustAction2 = new org.apache.avro.io.parsing.Symbol.FieldAdjustAction(100, "hi!");
 java.lang.String str3 = fieldAdjustAction2.fname;
 org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
 }

 @Test
 public void test56() throws Throwable {
 if (debug)
 System.out.format("%n%s%n", "SymbolRandoopGen0.test56");
 java.lang.String[] strArray1 = new java.lang.String[] { "hi!" };
 java.util.ArrayList<java.lang.String> strList2 = new java.util.ArrayList<java.lang.String>();
 boolean boolean3 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList2, strArray1);
 org.apache.avro.io.parsing.Symbol.EnumLabelsAction enumLabelsAction4 = new org.apache.avro.io.parsing.Symbol.EnumLabelsAction((java.util.List<java.lang.String>) strList2);
 org.apache.avro.io.parsing.Symbol.EnumLabelsAction enumLabelsAction5 = new org.apache.avro.io.parsing.Symbol.EnumLabelsAction((java.util.List<java.lang.String>) strList2);
 org.apache.avro.io.parsing.Symbol.EnumLabelsAction enumLabelsAction6 = new org.apache.avro.io.parsing.Symbol.EnumLabelsAction((java.util.List<java.lang.String>) strList2);
 java.util.List<java.lang.String> strList7 = enumLabelsAction6.symbols;
 org.junit.Assert.assertNotNull(strArray1);
 org.junit.Assert.assertArrayEquals(strArray1, new java.lang.String[] { "hi!" });
 org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
 org.junit.Assert.assertNotNull(strList7);
 }

 @Test
 public void test57() throws Throwable {
 if (debug)
 System.out.format("%n%s%n", "SymbolRandoopGen0.test57");
 java.lang.String[] strArray1 = new java.lang.String[] { "hi!" };
 java.util.ArrayList<java.lang.String> strList2 = new java.util.ArrayList<java.lang.String>();
 boolean boolean3 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList2, strArray1);
 org.apache.avro.io.parsing.Symbol.EnumLabelsAction enumLabelsAction4 = new org.apache.avro.io.parsing.Symbol.EnumLabelsAction((java.util.List<java.lang.String>) strList2);
 org.apache.avro.io.parsing.Symbol.EnumLabelsAction enumLabelsAction5 = new org.apache.avro.io.parsing.Symbol.EnumLabelsAction((java.util.List<java.lang.String>) strList2);
 int int7 = enumLabelsAction5.findLabel("hi!");
 int int8 = enumLabelsAction5.flattenedSize();
 java.util.List<java.lang.String> strList9 = enumLabelsAction5.symbols;
 org.apache.avro.io.parsing.Symbol[] symbolArray10 = enumLabelsAction5.production;
 org.junit.Assert.assertNotNull(strArray1);
 org.junit.Assert.assertArrayEquals(strArray1, new java.lang.String[] { "hi!" });
 org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
 org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
 org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
 org.junit.Assert.assertNotNull(strList9);
 org.junit.Assert.assertNull(symbolArray10);
 }

 @Test
 public void test58() throws Throwable {
 if (debug)
 System.out.format("%n%s%n", "SymbolRandoopGen0.test58");
 org.apache.avro.io.parsing.Symbol symbol0 = org.apache.avro.io.parsing.Symbol.DOUBLE;
 org.junit.Assert.assertNotNull(symbol0);
 }

 @Test
 public void test59() throws Throwable {
 if (debug)
 System.out.format("%n%s%n", "SymbolRandoopGen0.test59");
 java.lang.String[] strArray1 = new java.lang.String[] { "hi!" };
 java.util.ArrayList<java.lang.String> strList2 = new java.util.ArrayList<java.lang.String>();
 boolean boolean3 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList2, strArray1);
 org.apache.avro.io.parsing.Symbol.EnumLabelsAction enumLabelsAction4 = new org.apache.avro.io.parsing.Symbol.EnumLabelsAction((java.util.List<java.lang.String>) strList2);
 org.apache.avro.io.parsing.Symbol.EnumLabelsAction enumLabelsAction5 = new org.apache.avro.io.parsing.Symbol.EnumLabelsAction((java.util.List<java.lang.String>) strList2);
 org.apache.avro.io.parsing.Symbol.EnumLabelsAction enumLabelsAction6 = new org.apache.avro.io.parsing.Symbol.EnumLabelsAction((java.util.List<java.lang.String>) strList2);
 org.apache.avro.io.parsing.Symbol.EnumLabelsAction enumLabelsAction7 = new org.apache.avro.io.parsing.Symbol.EnumLabelsAction((java.util.List<java.lang.String>) strList2);
 org.junit.Assert.assertNotNull(strArray1);
 org.junit.Assert.assertArrayEquals(strArray1, new java.lang.String[] { "hi!" });
 org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
 }
}

