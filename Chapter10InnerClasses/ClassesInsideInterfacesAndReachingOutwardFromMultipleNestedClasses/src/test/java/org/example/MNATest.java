package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MNATest {

    @Test
    public void testMNA() {
        String expected = "f() in MNA. g() in MNA.A h() in MNA.A.B";
        String actual;
        MNA mna = new MNA();
        MNA.A mna_a = mna.new A();
        MNA.A.B mna_a_b = mna_a.new B();
        actual = mna_a_b.h();
        assertEquals(expected, actual);
    }
}
/*
    This code demonstrates the private methods g() and f() are callable without any qualification.
    It does not matter how deeply nested a class is in multiple nested classes.  Nested classes
    can access all members are all levels within the nested hierarchy.

    We also see the syntax for accessing any nested classes anywhere within the nested class hierarchy.
*/
