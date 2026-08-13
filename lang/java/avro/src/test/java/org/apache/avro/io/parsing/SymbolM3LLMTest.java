/**
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements. See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership. The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License. You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 */
package org.apache.avro.io.parsing;

import static org.junit.Assert.*;

import java.util.Arrays;

import org.junit.Test;

/**
 * Hand-curated tests derived from LLM-assisted exploration of the
 * {@link Symbol} public surface, accepted only after manual review for
 * determinism and behavioral relevance. Each test pins a contract that an
 * automated generator would not naturally encode but that is meaningful
 * for grammar-symbol callers.
 */
public class SymbolM3LLMTest {

 /**
 * Two distinct {@code Terminal} instances with the same print name must
 * NOT compare equal by identity (each {@code public static final} terminal
 * is a unique sentinel). This pins the JVM-identity contract.
 */
 @Test
 public void primitiveTerminals_areDistinctSingletonInstances() {
 assertNotSame(Symbol.INT, Symbol.LONG);
 assertNotSame(Symbol.STRING, Symbol.BYTES);
 assertNotSame(Symbol.NULL, Symbol.BOOLEAN);
 }

 /**
 * {@code Symbol.RECORD_END} and {@code Symbol.UNION_END} are distinct
 * instances even though both have {@code isTrailing == true}; the parser
 * uses object identity to distinguish them.
 */
 @Test
 public void recordEndAndUnionEnd_areDistinctTrailingInstances() {
 Symbol.ImplicitAction recEnd = (Symbol.ImplicitAction) Symbol.RECORD_END;
 Symbol.ImplicitAction unionEnd = (Symbol.ImplicitAction) Symbol.UNION_END;

 assertNotSame(recEnd, unionEnd);
 assertTrue(recEnd.isTrailing);
 assertTrue(unionEnd.isTrailing);
 }

 /**
 * {@code MAP_KEY_MARKER} is a {@code TERMINAL} and not interchangeable
 * with {@code MAP_START} (pins the distinct sentinel contract).
 */
 @Test
 public void mapKeyMarker_isTerminalDistinctFromMapStart() {
 assertEquals(Symbol.Kind.TERMINAL, Symbol.MAP_KEY_MARKER.kind);
 assertNotSame(Symbol.MAP_START, Symbol.MAP_KEY_MARKER);
 }

 /**
 * The {@code Kind} enum exposes seven values; this pins the enum cardinality
 * so that adding a new kind without updating the parser dispatch surface is
 * caught by the regression suite.
 */
 @Test
 public void kindEnum_exposesExactlySevenValues() {
 assertEquals(7, Symbol.Kind.values().length);
 assertTrue(Arrays.asList(Symbol.Kind.values()).containsAll(Arrays.asList(
 Symbol.Kind.TERMINAL,
 Symbol.Kind.ROOT,
 Symbol.Kind.SEQUENCE,
 Symbol.Kind.REPEATER,
 Symbol.Kind.ALTERNATIVE,
 Symbol.Kind.IMPLICIT_ACTION,
 Symbol.Kind.EXPLICIT_ACTION)));
 }

 /**
 * A {@code Sequence} of length one still walks in reverse: iterator yields
 * the only element and then terminates. This guards against an off-by-one
 * regression that LLM-suggested rewrites of the iterator could introduce.
 */
 @Test
 public void singletonSequenceIterator_yieldsOneElementAndStops() {
 Symbol.Sequence s = (Symbol.Sequence) Symbol.seq(Symbol.FLOAT);

 java.util.Iterator<Symbol> it = s.iterator();
 assertTrue(it.hasNext());
 assertSame(Symbol.FLOAT, it.next());
 assertFalse(it.hasNext());
 }

 /**
 * The first matching label wins in {@code Alternative.findLabel}, even if a
 * later branch carries the same label string (pins ordered semantics).
 */
 @Test
 public void alternativeFindLabel_returnsFirstOccurrenceOnDuplicates() {
 Symbol.Alternative a = (Symbol.Alternative) Symbol.alt(
 new Symbol[] { Symbol.INT, Symbol.LONG, Symbol.INT },
 new String[] { "x", "y", "x" });

 assertEquals(0, a.findLabel("x"));
 }

 /**
 * {@code IntCheckAction} with a negative size is currently accepted by the
 * constructor (no defensive validation). This pins the current contract;
 * tightening it later would require adapting this test.
 */
 @Test
 public void intCheckAction_acceptsNegativeSize() {
 Symbol.IntCheckAction a = new Symbol.IntCheckAction(-3);

 assertEquals(-3, a.size);
 }

 /**
 * {@code resolve} chains writer and reader symbols verbatim; this pins the
 * absence of any auto-flattening or rewriting at construction time.
 */
 @Test
 public void resolve_doesNotRewriteWriterOrReader() {
 Symbol writer = Symbol.seq(Symbol.INT, Symbol.STRING);
 Symbol reader = Symbol.seq(Symbol.INT, Symbol.STRING);

 Symbol.ResolvingAction r =
 (Symbol.ResolvingAction) Symbol.resolve(writer, reader);

 assertSame(writer, r.writer);
 assertSame(reader, r.reader);
 }
}
