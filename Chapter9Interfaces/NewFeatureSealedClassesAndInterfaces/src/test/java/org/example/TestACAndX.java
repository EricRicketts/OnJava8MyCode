package org.example;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestACAndX {

    private X x;
    private String expected, actual;

    @BeforeEach
    public void setUp() {
        x = new X();
    }

    @Test
    public void testMethodOne() {
        expected = "AC::X methodOne()";
        actual = x.methodOne();
        assertEquals(expected, actual);
    }

    @Test
    public void testMethodTwo() {
        expected = "AC::X methodTwo()";
        actual = x.methodTwo();
        assertEquals(expected, actual);
    }
}
