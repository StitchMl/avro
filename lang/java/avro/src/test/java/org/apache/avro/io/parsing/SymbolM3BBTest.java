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
import java.util.NoSuchElementException;

import org.junit.Test;

/** Test di specifica funzionale e valori di confine sulla struttura pubblica della classe Symbol. */
public class SymbolM3BBTest {

  private static Symbol.Alternative alt(String... labels) {
    Symbol[] syms = new Symbol[labels.length];
    Arrays.fill(syms, Symbol.INT);
    return (Symbol.Alternative) Symbol.alt(syms, labels);
  }

  /** Verifica lineare del tipo TERMINAL sui principali simboli di natura primitiva. */
  @Test
  public void testPrimitiveTerminals() {
    for (Symbol s : new Symbol[] {Symbol.NULL, Symbol.BOOLEAN, Symbol.INT,
        Symbol.LONG, Symbol.STRING, Symbol.BYTES}) {
      assertEquals(Symbol.Kind.TERMINAL, s.kind);
    }
  }

  /** Controllo del tipo TERMINAL sui marcatori strutturali di inizio/fine blocco. */
  @Test
  public void testStructuralTerminals() {
    for (Symbol s : new Symbol[] {Symbol.ARRAY_START, Symbol.ARRAY_END,
        Symbol.MAP_START, Symbol.MAP_END, Symbol.ITEM_END}) {
      assertEquals(Symbol.Kind.TERMINAL, s.kind);
    }
  }

  /** Verifica che le azioni automatiche di default siano catalogate come IMPLICIT_ACTION. */
  @Test
  public void testImplicitActionConstants() {
    for (Symbol s : new Symbol[] {Symbol.RECORD_START, Symbol.RECORD_END,
        Symbol.UNION_END, Symbol.DEFAULT_END_ACTION}) {
      assertEquals(Symbol.Kind.IMPLICIT_ACTION, s.kind);
    }
  }

  /** root posiziona un riferimento a se stesso all'indice zero della produzione. */
  @Test
  public void testRootHasSelfReferenceAtZero() {
    Symbol r = Symbol.root(Symbol.INT, Symbol.STRING);
    assertEquals(Symbol.Kind.ROOT, r.kind);
    assertSame(r, r.production[0]);
  }

  /** seq preserva l'ordine dei simboli inseriti. */
  @Test
  public void testSeqPreservesOrder() {
    Symbol s = Symbol.seq(Symbol.INT, Symbol.STRING);
    assertEquals(Symbol.Kind.SEQUENCE, s.kind);
    assertSame(Symbol.INT, s.production[0]);
    assertSame(Symbol.STRING, s.production[1]);
  }

  /** seq() senza parametri produce un array vuoto. */
  @Test
  public void testEmptySeq() {
    assertEquals(0, Symbol.seq().production.length);
  }

  /** Struttura del REPEATER e posizionamento del simbolo di coda. */
  @Test
  public void testRepeater() {
    Symbol r = Symbol.repeat(Symbol.ITEM_END, Symbol.INT);
    assertEquals(Symbol.Kind.REPEATER, r.kind);
    assertSame(r, r.production[0]);
    assertSame(Symbol.ITEM_END, ((Symbol.Repeater) r).end);
  }

  /** Associazione tra etichette e simboli in un costrutto Alternative. */
  @Test
  public void testAltKeepsSymbolsAndLabels() {
    Symbol.Alternative a = alt("i", "s");
    assertEquals(2, a.size());
    assertSame(Symbol.INT, a.getSymbol(0));
    assertEquals("s", a.getLabel(1));
  }

  /** error conserva la stringa di messaggio. */
  @Test
  public void testErrorKeepsMessage() {
    assertEquals("boom", ((Symbol.ErrorAction) Symbol.error("boom")).msg);
  }

  /** ResolvingAction collega gli schemi di lettura e scrittura. */
  @Test
  public void testResolveWiresWriterAndReader() {
    Symbol.ResolvingAction r = (Symbol.ResolvingAction) Symbol.resolve(Symbol.INT, Symbol.LONG);
    assertSame(Symbol.INT, r.writer);
    assertSame(Symbol.LONG, r.reader);
  }

  /** findLabel su etichetta presente restituisce la sua posizione. */
  @Test
  public void testFindLabelKnown() {
    assertEquals(1, alt("i", "s").findLabel("s"));
  }

  /** findLabel su etichetta assente restituisce -1. */
  @Test
  public void testFindLabelUnknown() {
    assertEquals(-1, alt("i").findLabel("nope"));
  }

  /** findLabel su etichetta null restituisce -1. */
  @Test
  public void testFindLabelNull() {
    assertEquals(-1, alt("i").findLabel(null));
  }

  /** L'iteratore della Sequence restituisce gli elementi dal fondo. */
  @Test
  public void testIteratorReverseOrder() {
    Iterator<Symbol> it = ((Symbol.Sequence) Symbol.seq(Symbol.INT, Symbol.STRING)).iterator();
    assertSame(Symbol.STRING, it.next());
    assertSame(Symbol.INT, it.next());
    assertFalse(it.hasNext());
  }

  /** next() oltre la fine dell'iteratore lancia NoSuchElementException. */
  @Test(expected = NoSuchElementException.class)
  public void testIteratorBeyondEnd() {
    Iterator<Symbol> it = ((Symbol.Sequence) Symbol.seq(Symbol.INT)).iterator();
    it.next();
    it.next();
  }

  /** remove() sull'iteratore non e' supportata. */
  @Test(expected = UnsupportedOperationException.class)
  public void testIteratorRemoveUnsupported() {
    Iterator<Symbol> it = ((Symbol.Sequence) Symbol.seq(Symbol.INT)).iterator();
    it.next();
    it.remove();
  }

  /** IntCheckAction e' EXPLICIT_ACTION e conserva la size ricevuta. */
  @Test
  public void testIntCheckActionKeepsSize() {
    Symbol.IntCheckAction a = new Symbol.IntCheckAction(7);
    assertEquals(Symbol.Kind.EXPLICIT_ACTION, a.kind);
    assertEquals(7, a.size);
  }

  /** IntCheckAction accetta anche la size di confine 0. */
  @Test
  public void testIntCheckActionAcceptsZero() {
    assertEquals(0, new Symbol.IntCheckAction(0).size);
  }

  /** EnumAdjustAction eredita la size e memorizza gli adjustments. */
  @Test
  public void testEnumAdjustAction() {
    Object[] adj = {0, 1, 2};
    Symbol.EnumAdjustAction a = new Symbol.EnumAdjustAction(3, adj);
    assertEquals(3, a.size);
    assertSame(adj, a.adjustments);
  }

  /** EnumLabelsAction.findLabel su etichetta nota, ignota e null. */
  @Test
  public void testEnumLabelsFindLabel() {
    Symbol.EnumLabelsAction a = new Symbol.EnumLabelsAction(Arrays.asList("RED", "GREEN", "BLUE"));
    assertEquals(0, a.findLabel("RED"));
    assertEquals(-1, a.findLabel("NOPE"));
    assertEquals(-1, a.findLabel(null));
  }

  /** EnumLabelsAction.getLabel restituisce l'etichetta all'indice. */
  @Test
  public void testEnumLabelsGetLabel() {
    Symbol.EnumLabelsAction a = new Symbol.EnumLabelsAction(Arrays.asList("RED", "GREEN", "BLUE"));
    assertEquals("BLUE", a.getLabel(2));
  }

  /** flattenedSize di un terminale isolato e' 1: il cammino completo flatten(map, map2)
   *  e' coperto indirettamente nel test control-flow (il tipo Fixup e' package-private). */
  @Test
  public void testTerminalFlattenedSizeIsOne() {
    assertEquals(1, Symbol.INT.flattenedSize());
  }
}
