package org.example;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class InnerInheritanceTest {

    private WithInner withInner;
    private WithInner.Inner inner;
    private InheritInner inheritInner;
    private String expected, actual;

    @BeforeEach
    public void setUp() {
        withInner = new WithInner();
        inner = new WithInner().new Inner();
        inheritInner = new InheritInner(withInner);
    }

    @Test
    public void testWithInnerClassName() {
        expected = "WithInner";
        actual = withInner.getClass().getSimpleName();
        assertEquals(expected, actual);
    }

    @Test
    public void testWithInnerToString() {
        expected = "WithInner{}";
        actual = withInner.toString();
        assertEquals(expected, actual);
    }

    @Test
    public void testWithInnerInnerClassName() {
        expected = "Inner";
        actual = inner.getClass().getSimpleName();
        assertEquals(expected, actual);
    }

    @Test
    public void testWithInnerInnerToString() {
        expected = "WithInner{} Inner{}";
        actual = inner.toString();
        assertEquals(expected, actual);
    }

    @Test
    public void testInheritInnerClassName() {
        expected = "InheritInner";
        actual = inheritInner.getClass().getSimpleName();
        assertEquals(expected, actual);
    }

    @Test
    public void testInheritInnerToString() {
        expected = "WithInner{} Inner{} InheritInner{}";
        actual = inheritInner.toString();
        assertEquals(expected, actual);
    }
}
/*
    Note in the setUp we had to create an instance of WithInner.Inner and pass it as an argument to
    the constructor of InheritInner class.  This is because with inheritance the automatic reference to
    the outer class is lost.  In this case InheritInner has no reference to the outer class, WithInner,
    of the inner class WithInner.Inner.  So in the constructor of InheritInner one must pass an explicit
    reference to the outer class.
*/
