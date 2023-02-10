package oop.natoAlphabet;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

class NatoAlphabetTest {

    NatoAlphabet natoAlphabet;

    @BeforeEach
    void setUp() {
        natoAlphabet = new NatoAlphabet();
    }

    @Test
    public void itShouldEncodeHello() {
        String actual = natoAlphabet.encode("hello");
        assertEquals("hotel-echo-lima-lima-oscar", actual);
    }

    @Test
    public void itShouldDecodeMessages() {
        String actual = natoAlphabet.decode("hotel-echo-lima-lima-oscar");
        assertEquals("hello", actual);
    }

    @Test
    public void itShouldParseWhitespacesAsNull() {
        String actual = natoAlphabet.encode("khabib nurmagomedov");
        String expected = "kilo-hotel-alpha-bravo-india-bravo-null-november-uniform-romeo-mike-alpha-golf-oscar-mike-echo-delta-oscar-victor";
        assertEquals(expected, actual);
    }

    @Test
    public void itShouldThrowAnExceptionIfEncodingOutsideAlphabet() {
        assertThrows(Exception.class,
                () -> natoAlphabet.encode(""),
                "input outside NATO alphabet");
    }

    @Test
    public void itShouldThrowAnExceptionIfDecodingOutsideAlphabet() {
        assertThrows(Exception.class,
                () -> natoAlphabet.decode(""),
                "input outside NATO alphabet");
    }

}