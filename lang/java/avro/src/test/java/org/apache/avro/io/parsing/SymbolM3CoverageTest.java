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
 */
package org.apache.avro.io.parsing;

import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.Collections;

import org.apache.avro.Schema;
import org.junit.Test;

/** Test di tracciamento scritti per raggiungere la piena copertura dei costruttori delle Action sussidiarie. */
public class SymbolM3CoverageTest {

  /** Controllo del salvataggio di indice e nome campo in FieldAdjustAction. */
  @Test
  public void testFieldAdjustStoresIndexAndName() {
    Symbol.FieldAdjustAction a = new Symbol.FieldAdjustAction(4, "age");
    assertEquals(4, a.rindex);
    assertEquals("age", a.fname);
  }

  /** Verifica della corretta persistenza del vettore di campi dentro l'azione. */
  @Test
  public void testFieldOrderStoresFieldArray() {
    Schema.Field[] fields = {new Schema.Field("x", Schema.create(Schema.Type.INT), null, null)};
    assertSame(fields, new Symbol.FieldOrderAction(fields).fields);
  }

  /** Controllo del mantenimento dell'array di byte associato al valore di default. */
  @Test
  public void testDefaultStartStoresBytes() {
    byte[] bytes = {1, 2, 3};
    assertSame(bytes, new Symbol.DefaultStartAction(bytes).contents);
  }

  /** Verifica della memorizzazione dell'indice e del riferimento al simbolo figlio nella union. */
  @Test
  public void testUnionAdjustStoresIndexAndChild() {
    Symbol.UnionAdjustAction a = new Symbol.UnionAdjustAction(2, Symbol.STRING);
    assertEquals(2, a.rindex);
    assertSame(Symbol.STRING, a.symToParse);
  }

  /** Controllo della corretta classificazione tipologica per WriterUnionAction. */
  @Test
  public void testWriterUnionIsImplicitAction() {
    assertEquals(Symbol.Kind.IMPLICIT_ACTION, new Symbol.WriterUnionAction().kind);
  }

  /** Verifica che SkipAction sia impostata come ad azione finale e mantenga il simbolo. */
  @Test
  public void testSkipActionIsTrailing() {
    Symbol.SkipAction a = new Symbol.SkipAction(Symbol.INT);
    assertSame(Symbol.INT, a.symToSkip);
    assertTrue(a.isTrailing);
  }

  /** Test dell'override del toString() sfruttando le costanti pubbliche dei terminali. */
  @Test
  public void testTerminalToString() {
    assertEquals("int", Symbol.INT.toString());
    assertEquals("array-start", Symbol.ARRAY_START.toString());
  }

  /** La proprietà size deve riflettere la dimensione reale dei simboli enum passati. */
  @Test
  public void testEnumLabelsSize() {
    Symbol.EnumLabelsAction a = new Symbol.EnumLabelsAction(Arrays.asList("ONE", "TWO", "THREE"));
    assertEquals(3, a.size);
  }

  /** Caso limite: comportamento della action con un solo elemento in lista. */
  @Test
  public void testEnumLabelsSingleLabel() {
    Symbol.EnumLabelsAction a = new Symbol.EnumLabelsAction(Collections.singletonList("ONLY"));
    assertEquals("ONLY", a.getLabel(0));
    assertEquals(0, a.findLabel("ONLY"));
  }

  /** Coerenza tra la dimensione totale e i metodi di lettura indicizzati per Alternative. */
  @Test
  public void testAlternativeAccessors() {
    Symbol[] syms = {Symbol.NULL, Symbol.BOOLEAN, Symbol.INT};
    String[] labs = {"n", "b", "i"};
    Symbol.Alternative a = (Symbol.Alternative) Symbol.alt(syms, labs);
    for (int i = 0; i < a.size(); i++) {
      assertSame(syms[i], a.getSymbol(i));
      assertEquals(labs[i], a.getLabel(i));
    }
  }

  /** Verifica del funzionamento dei metodi get(index) e size() sulle istanze di Sequence. */
  @Test
  public void testSequenceGetAndSize() {
    Symbol.Sequence s = (Symbol.Sequence) Symbol.seq(Symbol.LONG, Symbol.STRING);
    assertEquals(2, s.size());
    assertSame(Symbol.LONG, s.get(0));
    assertSame(Symbol.STRING, s.get(1));
  }
}
