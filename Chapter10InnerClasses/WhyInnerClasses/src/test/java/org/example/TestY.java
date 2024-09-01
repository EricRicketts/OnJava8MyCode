package org.example;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestY {
    private Y y;
    private String expected, actual;

    @BeforeEach
    public void setUp() {
        y = new Y();
    }

    @Test
    public void testYGetNameForA() {
        expected = "In Class Y Implementation of A.getNameForA()";
        actual = y.getNameForA();
        assertEquals(expected, actual);
    }

    @Test
    public void testYGetNameForB() {
        expected = "In Class Y Implementation of B.getNameForB()";
        actual = y.makeB().getNameForB();
        assertEquals(expected, actual);
    }
}
