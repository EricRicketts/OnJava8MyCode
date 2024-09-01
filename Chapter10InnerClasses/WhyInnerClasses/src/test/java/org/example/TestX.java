package org.example;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestX {
    private X x;
    private String expected, actual;

    @BeforeEach
    public void setUp() {
        x = new X();
    }

    @Test
    public void testXGetNameForA() {
        expected = "In Class X Implementation of A.getNameForA()";
        actual = x.getNameForA();
        assertEquals(expected, actual);
    }

    @Test
    public void testXGetNameForB() {
        expected = "In Class X Implementation of B.getNameForB()";
        actual = x.getNameForB();
        assertEquals(expected, actual);
    }
}
