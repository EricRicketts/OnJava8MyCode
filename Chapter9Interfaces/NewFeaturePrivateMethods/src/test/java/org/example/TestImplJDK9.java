package org.example;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestImplJDK9 {

    ImplJDK9 implJDK9;
    String expected, actual;

    @BeforeEach
    void setUp() {
        implJDK9 = new ImplJDK9();
    }

    @Test
    public void testImplJDK9F() {
        expected = "JDK9::fd()";
        actual = implJDK9.f();
        assertEquals(expected, actual);
    }

    @Test
    public void testJDK9G() {
        expected = "JDK9::fs()";
        actual = implJDK9.g();
        assertEquals(expected, actual);
    }
}
