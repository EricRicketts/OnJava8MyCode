package org.example;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestIfcImp1Imp2 {

    private Imp1 imp1;
    private Imp2 imp2;
    private String expected, actual;

    @BeforeEach
    public void setUp() {
        imp1 = new Imp1();
        imp2 = new Imp2();
    }

    @Test
    public void testImpl1MethodOne() {
        expected = "Ifc::Imp1 methodOne()";
        actual = imp1.methodOne();
        assertEquals(expected, actual);
    }

    @Test
    public void testImpl1MethodTwo() {
        expected = "Ifc::Imp1 methodTwo()";
        actual = imp1.methodTwo();
        assertEquals(expected, actual);
    }

    @Test
    public void testImp21MethodOne() {
        expected = "Ifc::Imp2 methodOne()";
        actual = imp2.methodOne();
        assertEquals(expected, actual);
    }

    @Test
    public void testImp21MethodTwo() {
        expected = "Ifc::Imp2 methodTwo()";
        actual = imp2.methodTwo();
        assertEquals(expected, actual);
    }
}
