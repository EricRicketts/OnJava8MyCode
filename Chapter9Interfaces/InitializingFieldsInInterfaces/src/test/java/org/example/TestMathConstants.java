package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestMathConstants {

    private double expected, actual;

    @Test
    public void testPI() {
        expected = 3.1416;
        actual = MathConstants.PI;
        assertEquals(expected, actual);
    }

    @Test
    public void testGoldenRatio() {
        expected = 1.6180;
        actual = MathConstants.GOLDEN_RATIO;
        assertEquals(expected, actual);
    }
}
