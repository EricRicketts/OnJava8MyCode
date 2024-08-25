package org.example;


import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestDotThis {

    private DotThis.Inner dti;
    private String expected, actual;

    @BeforeEach
    public void setUp() {
        DotThis dotThis;
        dotThis = new DotThis();
        dti = dotThis.inner();
    }

    @Test
    public void testOuterObject() {
        expected = "DotThis.f()";
        actual = dti.outerObject().f();
        assertEquals(expected, actual);
    }

    @Test
    public void testInnerObject() {
        expected = "Inner.g()";
        actual = dti.innerObject().g();
        assertEquals(expected, actual);
    }
}