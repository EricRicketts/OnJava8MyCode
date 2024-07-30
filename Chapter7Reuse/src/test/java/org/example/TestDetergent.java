package org.example;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestDetergent {

    private Detergent detergent;
    String expected, actual;

    @BeforeEach
    public void setUp() {
        detergent = new Detergent();
    }

    @Test
    public void testDetergentScrub() {
        detergent.scrub();
        expected = "Cleanser Detergent.scrub() scrub()";
        actual = detergent.toString();
        assertEquals(expected, actual);
    }

    @Test
    public void testDetergentFoam() {
        detergent.foam();
        expected = "Cleanser foam()";
        actual = detergent.toString();
        assertEquals(expected, actual);
    }

    @Test
    public void testDetergent() {
        detergent.dilute();
        detergent.apply();
        detergent.scrub();
        detergent.foam();
        expected = "Cleanser dilute() apply() Detergent.scrub() scrub() foam()";
        actual = detergent.toString();
        assertEquals(expected, actual);
    }
}
