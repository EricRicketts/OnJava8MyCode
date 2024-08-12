package org.example;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestMusic {

    Instrument[] firstOrchestra, secondOrchestra;
    private String expected, actual;

    @BeforeEach
    public void setUp() {
        firstOrchestra = new Instrument[]{
            new Wind(), new Percussion(), new Stringed()
        };
        secondOrchestra = new Instrument[]{
            new Brass(), new Woodwind()
        };
    }

    @Test
    public void testFirstOrchestra() {
        expected = """
                Wind.play() MIDDLE_C Wind.play() B_FLAT Wind.play() D_SHARP
                Percussion.play() MIDDLE_C Percussion.play() B_FLAT Percussion.play() D_SHARP
                Stringed.play() MIDDLE_C Stringed.play() B_FLAT Stringed.play() D_SHARP
                """;
        actual = Music.tuneAll(firstOrchestra);
        assertEquals(expected, actual);
    }

    @Test
    public void testSecondOrchestra() {
        expected = """
                Brass.play() MIDDLE_C Brass.play() B_FLAT Brass.play() D_SHARP
                Woodwind.play() MIDDLE_C Woodwind.play() B_FLAT Woodwind.play() D_SHARP
                """;
        actual = Music.tuneAll(secondOrchestra);
        assertEquals(expected, actual);
    }
}
