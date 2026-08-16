/**
 * Milestone (De Angelis) — test con Mockito per org.apache.avro.io.JsonDecoder.
 *
 * Obiettivo: ISOLARE la SUT dal collaboratore che fornisce i byte (InputStream)
 * per verificarne la ROBUSTEZZA su scenari difficili da riprodurre con input reali:
 *   - IOException durante la lettura;
 *   - EOF immediato (stream vuoto).
 * Scelta: Mock PURO (non spy). Uno spy su un InputStream reale richiederebbe comunque
 * un file/array fisico, vanificando l'isolamento.
 * Accento: robustezza (comportamento) + una verifica di interazione (la SUT legge davvero
 * dallo stream). JUnit 4 + Mockito 5.x (mock() statico, nessun runner necessario).
 */
package com.milestone4.jsondecoder.mock;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.ArgumentMatchers.anyInt;
import static org.mockito.Mockito.atLeastOnce;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;

import org.apache.avro.Schema;
import org.apache.avro.Schema.Type;
import org.apache.avro.io.DecoderFactory;
import org.apache.avro.io.JsonDecoder;
import org.junit.Test;

public class TestJsonDecoderMock {

  /** IOException dallo stream in fase di configure -> deve propagarsi invariata. */
  @Test
  public void ioExceptionFromStreamPropagates() throws IOException {
    InputStream in = mock(InputStream.class);
    when(in.read()).thenThrow(new IOException("boom"));
    when(in.read(any(byte[].class))).thenThrow(new IOException("boom"));
    when(in.read(any(byte[].class), anyInt(), anyInt())).thenThrow(new IOException("boom"));

    try {
      DecoderFactory.get().jsonDecoder(Schema.create(Type.INT), in);
      fail("Attesa IOException propagata dallo stream");
    } catch (IOException expected) {
      assertEquals("boom", expected.getMessage());
    }

    // Interazione: la SUT ha effettivamente tentato di leggere dallo stream.
    verify(in, atLeastOnce()).read(any(byte[].class), anyInt(), anyInt());
  }

  /** Stream vuoto (EOF immediato) -> la lettura di un int deve fallire con EOFException. */
  @Test(expected = EOFException.class)
  public void emptyStreamThenReadIntThrowsEof() throws IOException {
    InputStream empty = mock(InputStream.class);
    when(empty.read()).thenReturn(-1);
    when(empty.read(any(byte[].class))).thenReturn(-1);
    when(empty.read(any(byte[].class), anyInt(), anyInt())).thenReturn(-1);

    JsonDecoder d = DecoderFactory.get().jsonDecoder(Schema.create(Type.INT), empty);
    d.readInt(); // nessun token disponibile -> EOFException
  }
}
