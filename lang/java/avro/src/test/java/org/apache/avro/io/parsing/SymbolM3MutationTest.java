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
import java.util.Iterator;

import org.junit.Test;

/** Test di mutazione ideati appositamente per intercettare e invalidare i mutanti PIT latenti in Symbol. */
public class SymbolM3MutationTest {

  private static Symbol.Alternative alt(String... labels) {
    Symbol[] syms = new Symbol[labels.length];
    Arrays.fill(syms, Symbol.INT);
    return (Symbol.Alternative) Symbol.alt(syms, labels);
  }

  /** Verifica dello stato booleano false del flag per l'evento di inizio record. */
  @Test
  public void testRecordStartIsNotTrailing() {
    assertFalse(((Symbol.ImplicitAction) Symbol.RECORD_START).isTrailing);
  }

  /** Verifica dello stato booleano true del flag per l'evento di fine record. */
  @Test
  public void testRecordEndIsTrailing() {
    assertTrue(((Symbol.ImplicitAction) Symbol.RECORD_END).isTrailing);
  }

  /** findLabel restituisce l'indice esatto (uccide il mutante off-by-one). */
  @Test
  public void testFindLabelExactIndex() {
    Symbol.Alternative a = alt("i", "s", "l");
    assertEquals(0, a.findLabel("i"));
    assertEquals(1, a.findLabel("s"));
    assertEquals(2, a.findLabel("l"));
  }

  /** findLabel non ritorna sempre 0. */
  @Test
  public void testFindLabelNotAlwaysZero() {
    assertFalse(alt("i", "s").findLabel("s") == 0);
  }

  /** findLabel non ritorna sempre -1 quando l'etichetta esiste. */
  @Test
  public void testFindLabelNotAlwaysMinusOne() {
    assertFalse(alt("i").findLabel("i") == -1);
  }

  /** hasNext() false a iteratore esaurito (uccide il mutante < -> <=). */
  @Test
  public void testIteratorHasNextFalseWhenExhausted() {
    Iterator<Symbol> it = ((Symbol.Sequence) Symbol.seq(Symbol.INT)).iterator();
    it.next();
    assertFalse(it.hasNext());
  }

  /** next() pre-decrementa: il primo elemento e' production[length-1]. */
  @Test
  public void testIteratorPreDecrements() {
    Iterator<Symbol> it = ((Symbol.Sequence) Symbol.seq(Symbol.INT, Symbol.STRING)).iterator();
    assertSame(Symbol.STRING, it.next());
  }

  /** size() == production.length esatto. */
  @Test
  public void testSequenceSizeEqualsProductionLength() {
    Symbol.Sequence s = (Symbol.Sequence) Symbol.seq(Symbol.INT, Symbol.LONG, Symbol.STRING);
    assertEquals(s.production.length, s.size());
  }

  /** IntCheckAction conserva il valore di size. */
  @Test
  public void testIntCheckActionKeepsSize() {
    assertEquals(42, new Symbol.IntCheckAction(42).size);
  }

  /** EnumLabelsAction.findLabel ai confini della lista. */
  @Test
  public void testEnumLabelsFindLabelBoundaries() {
    Symbol.EnumLabelsAction a = new Symbol.EnumLabelsAction(Arrays.asList("FIRST", "MIDDLE", "LAST"));
    assertEquals(0, a.findLabel("FIRST"));
    assertEquals(2, a.findLabel("LAST"));
    assertEquals(-1, a.findLabel("OTHER"));
  }

  /** ResolvingAction non scambia writer e reader. */
  @Test
  public void testResolvingActionDoesNotSwap() {
    Symbol.ResolvingAction ra = (Symbol.ResolvingAction) Symbol.resolve(Symbol.INT, Symbol.LONG);
    assertSame(Symbol.INT, ra.writer);
    assertSame(Symbol.LONG, ra.reader);
  }

  /** Repeater.end e' esattamente il simbolo configurato. */
  @Test
  public void testRepeaterEndIsConfiguredSymbol() {
    Symbol.Repeater r = (Symbol.Repeater) Symbol.repeat(Symbol.ITEM_END, Symbol.INT);
    assertSame(Symbol.ITEM_END, r.end);
  }

  /** FieldAdjustAction non scambia indice e nome. */
  @Test
  public void testFieldAdjustDoesNotSwap() {
    Symbol.FieldAdjustAction a = new Symbol.FieldAdjustAction(7, "name");
    assertEquals(7, a.rindex);
    assertEquals("name", a.fname);
  }
}
