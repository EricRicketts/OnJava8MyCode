package org.example;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestCleanser {

    private Cleanser cleanser;
    String expected, actual;

    @BeforeEach
    void setUp() {
        cleanser = new Cleanser();
    }

    @Test
    void testCleanserDilute() {
        cleanser.dilute();
        expected = "Cleanser dilute()";
        actual = cleanser.toString();
        assertEquals(expected, actual);
    }

    @Test
    public void testCleanserAllCleaning() {
        cleanser.dilute();
        cleanser.apply();
        cleanser.scrub();
        expected = "Cleanser dilute() apply() scrub()";
        actual = cleanser.toString();
        assertEquals(expected, actual);
    }
}
