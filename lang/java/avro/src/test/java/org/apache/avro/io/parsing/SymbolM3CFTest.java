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

/** Analisi dei flussi logici (Control-Flow) interni alle produzioni e alle ricerche in Symbol. */
public class SymbolM3CFTest {

  private static Symbol.Alternative alt(String... labels) {
    Symbol[] syms = new Symbol[labels.length];
    Arrays.fill(syms, Symbol.INT);
    return (Symbol.Alternative) Symbol.alt(syms, labels);
  }

  /** Ramo di uscita immediata se l'etichetta passata come argomento è nulla. */
  @Test
  public void testFindLabelNull() {
    assertEquals(-1, alt("i").findLabel(null));
  }

  /** Ramo di successo quando il ciclo trova la corrispondenza esatta della stringa. */
  @Test
  public void testFindLabelMatch() {
    assertEquals(1, alt("i", "s", "l").findLabel("s"));
  }

  /** Uscita naturale dal ciclo for con risultato -1 se la stringa non esiste. */
  @Test
  public void testFindLabelNoMatch() {
    assertEquals(-1, alt("i", "s").findLabel("z"));
  }

  /** Controllo che hasNext() sia subito false se la sequenza è vuota. */
  @Test
  public void testEmptySequenceHasNoElements() {
    assertFalse(((Symbol.Sequence) Symbol.seq()).iterator().hasNext());
  }

  /** Flusso di un'iterazione singola su una sequenza con un solo elemento. */
  @Test
  public void testSingletonYieldsOneSymbol() {
    Iterator<Symbol> it = ((Symbol.Sequence) Symbol.seq(Symbol.INT)).iterator();
    assertSame(Symbol.INT, it.next());
    assertFalse(it.hasNext());
  }

  /** Verifica del ciclo completo di scorrimento all'indietro per sequenze multiple. */
  @Test
  public void testMultiElementWalksInReverse() {
    Iterator<Symbol> it =
        ((Symbol.Sequence) Symbol.seq(Symbol.INT, Symbol.LONG, Symbol.STRING)).iterator();
    assertSame(Symbol.STRING, it.next());
    assertSame(Symbol.LONG, it.next());
    assertSame(Symbol.INT, it.next());
  }

  /** Calcolo lineare della dimensione complessiva basato sulla somma dei terminali. */
  @Test
  public void testFlattenedSizeOverTerminals() {
    assertEquals(3, ((Symbol.Sequence) Symbol.seq(Symbol.INT, Symbol.LONG, Symbol.STRING)).flattenedSize());
  }

  /** Controllo del ramo ricorsivo quando flattenedSize incontra una Sequence interna. */
  @Test
  public void testFlattenedSizeSumsNestedSequence() {
    Symbol inner = Symbol.seq(Symbol.INT, Symbol.STRING);
    assertEquals(3, ((Symbol.Sequence) Symbol.seq(Symbol.LONG, inner)).flattenedSize());
  }

  /** Ramo di allocazione iniziale della radice con auto-riferimento in prima posizione. */
  @Test
  public void testRootReservesSlotZeroForSelf() {
    Symbol r = Symbol.root(Symbol.INT, Symbol.STRING);
    assertEquals(3, r.production.length); // [self, INT, STRING]
    assertSame(r, r.production[0]);
  }

  /** Analisi del layout di un repeater con inserimento dei simboli dopo lo slot zero. */
  @Test
  public void testRepeaterReservesSlotZeroForSelf() {
    Symbol.Repeater r = (Symbol.Repeater) Symbol.repeat(Symbol.ITEM_END, Symbol.INT, Symbol.STRING);
    assertSame(r, r.production[0]);
    assertSame(Symbol.INT, r.production[1]);
    assertSame(Symbol.STRING, r.production[2]);
    assertSame(Symbol.ITEM_END, r.end);
  }

  /** Controllo dello stato del flag isTrailing per azioni di testa e di coda. */
  @Test
  public void testImplicitActionTrailingFlag() {
    assertFalse(((Symbol.ImplicitAction) Symbol.RECORD_START).isTrailing);
    assertTrue(((Symbol.ImplicitAction) Symbol.RECORD_END).isTrailing);
  }
}
