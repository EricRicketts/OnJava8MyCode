package org.example;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestOrc {

    private Orc orc;
    private String expected, actual;

    @BeforeEach
    void setUp() {
        orc = new Orc("Limburger", 12);
    }

    @Test
    public void testFirstOrc() {
        expected = "Orc 12: I am a Villain and my name is Limburger";
        actual  = orc.toString();
        assertEquals(expected, actual);
    }

    @Test
    public void testChangeOrc() {
        orc.change("Bob", 19);
        expected = "Orc 19: I am a Villain and my name is Bob";
        actual  = orc.toString();
        assertEquals(expected, actual);
    }
}
