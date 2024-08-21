package org.example;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestImplOld {

    private ImplOld implOld;
    private String expected, actual;

    @BeforeEach
    public void setUp() {
        implOld = new ImplOld();
    }

    @Test
    public void testImplOldF() {
        expected = "Old::fd()";
        actual = implOld.fd();
        assertEquals(expected, actual);
    }

    @Test
    public void testImplOldG() {
        expected = "Old::fs()";
        actual = Old.fs();
        assertEquals(expected, actual);
    }
}
/*
    Before the Introduction of default and static methods for Interfaces, all Interfaces were
    implicitly public.  Methods defined with the "default" modifier are implicitly public.  In the
    example above the "default" method is public.

    As will be shown later with the introduction of JDK9, one can define private methods for
    interfaces.
*/
