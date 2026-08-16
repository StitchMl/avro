/**
 * Milestone (De Angelis) — test con Mockito per org.apache.avro.generic.GenericData.
 *
 * GenericData e' DATA-CENTRIC: opera su collaboratori "veri" e stabili (Schema, Field,
 * value-object). Per la maggior parte delle funzionalita' il mocking e' SUPERFLUO e i test
 * unitari usano oggetti reali (vedi suite Black-box). Documentiamo questa scelta come
 * giustificazione metodologica (Intellectual Control), non come mancanza.
 *
 * Usiamo Mockito solo DOVE AGGIUNGE VALORE: un interaction test su GenericRecord, che e'
 * un'interfaccia (IndexedRecord) e quindi mockabile senza incappare nei metodi 'final' di
 * Schema. Dimostra che GenericData "parla" col collaboratore via getSchema()/get(),
 * senza dover costruire uno stato dati complesso.
 * Accento: comportamento (assert) + interazione (verify). JUnit 4 + Mockito 5.x.
 */
package com.milestone4.genericdata.mock;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;
import static org.mockito.ArgumentMatchers.anyInt;
import static org.mockito.Mockito.atLeastOnce;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import org.apache.avro.Schema;
import org.apache.avro.generic.GenericData;
import org.apache.avro.generic.GenericRecord;
import org.junit.Test;

public class TestGenericDataMock {

  private static final String REC =
      "{\"type\":\"record\",\"name\":\"R\",\"fields\":["
      + "{\"name\":\"a\",\"type\":\"int\"},"
      + "{\"name\":\"b\",\"type\":\"int\"}]}";

  /**
   * Interaction test: toString(record) interroga il collaboratore.
   * Schema reale (value-object) -> nessun mock; GenericRecord mockato -> verify.
   */
  @Test
  public void toStringInteractsWithRecord() {
    Schema s = Schema.parse(REC);                 // collaboratore "vero": niente mock
    GenericRecord rec = mock(GenericRecord.class);
    when(rec.getSchema()).thenReturn(s);
    when(rec.get(anyInt())).thenReturn(0);

    String out = GenericData.get().toString(rec); // comportamento
    assertNotNull(out);
    assertTrue("output deve contenere i nomi dei campi", out.contains("a") && out.contains("b"));

    // interazione: GenericData legge schema e valori dal collaboratore
    verify(rec, atLeastOnce()).getSchema();
    verify(rec).get(0);
    verify(rec).get(1);
  }
}
