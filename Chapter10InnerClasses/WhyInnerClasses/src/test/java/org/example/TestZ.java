package org.example;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestZ {
    private Z z;
    private String expected, actual;

    @BeforeEach
    public void setUp() {
        z = new Z();
    }

    @Test
    public void testD() {
        expected = "In Class Z Extension of D.getNameForD()";
        actual = z.getNameForD();
        assertEquals(expected, actual);
    }

    @Test
    public void testE() {
        expected = "In Class Z Extension of E.getNameForE()";
        actual = z.makeE().getNameForE();
        assertEquals(expected, actual);
    }
}
