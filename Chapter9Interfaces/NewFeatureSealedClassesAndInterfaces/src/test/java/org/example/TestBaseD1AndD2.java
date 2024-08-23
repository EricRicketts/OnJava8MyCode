package org.example;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestBaseD1AndD2 {

    private Base base;
    private D1 d1;
    private D2 d2;
    private String expected, actual;

    @BeforeEach
    public void setUp() {
        base = new Base();
        d1 = new D1();
        d2 = new D2();
    }

    @Test
    public void testBaseWhat() {
        expected = "Base{}";
        actual = base.what();
        assertEquals(expected, actual);
    }

    @Test
    public void testD1What() {
        expected = "D1{}";
        actual = d1.what();
        assertEquals(expected, actual);
    }

    @Test
    public void testD1Method() {
        expected = "this is a method within the D1 class";
        actual = d1.d1Method();
        assertEquals(expected, actual);
    }

    @Test
    public void testD2What() {
        expected = "D2{}";
        actual = d2.what();
        assertEquals(expected, actual);
    }

    @Test
    public void testD2Method() {
        expected = "this is a method within the D2 class";
        actual = d2.d2Method();
        assertEquals(expected, actual);
    }
}