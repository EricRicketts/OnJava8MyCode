package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestDotNew {

    @Test
    public void testDotNewInnerClass() {
        DotNew dotNew = new DotNew();
        DotNew.Inner inner = dotNew.new Inner();
        String expected = "DotNew.Inner.h()";
        String actual = inner.j();
        assertEquals(expected, actual);
    }
}
