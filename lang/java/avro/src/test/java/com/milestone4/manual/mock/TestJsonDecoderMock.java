package com.milestone4.manual.mock;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertSame;
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

    @Test
    public void jsonDecoderPropagatesIOExceptionFromMockedInputStreamAndReadsStream()
            throws Exception {
        // ROBUSTNESS/behavior: I/O failures from the isolated InputStream must propagate.
        InputStream in = mock(InputStream.class);
        IOException expected = new IOException("forced read failure");

        when(in.read(any(byte[].class), anyInt(), anyInt())).thenThrow(expected);

        Schema schema = Schema.create(Type.INT);

        try {
            JsonDecoder decoder = DecoderFactory.get().jsonDecoder(schema, in);
            decoder.readInt();
            fail("Expected IOException");
        } catch (IOException actual) {
            assertSame(expected, actual);
            assertEquals("forced read failure", actual.getMessage());
        }

        verify(in, atLeastOnce()).read(
                any(byte[].class), anyInt(), anyInt());
    }

    @Test
    public void jsonDecoderThrowsEOFExceptionWhenMockedInputStreamIsEmpty()
            throws Exception {
        // ROBUSTNESS/behavior: an empty input must surface EOF when a primitive is requested.
        InputStream in = mock(InputStream.class);

        when(in.read(any(byte[].class), anyInt(), anyInt())).thenReturn(-1);

        Schema schema = Schema.create(Type.INT);
        JsonDecoder decoder = DecoderFactory.get().jsonDecoder(schema, in);

        try {
            decoder.readInt();
            fail("Expected EOFException");
        } catch (EOFException expected) {
            assertEquals(EOFException.class, expected.getClass());
        }

        verify(in, atLeastOnce()).read(
                any(byte[].class), anyInt(), anyInt());
    }
}