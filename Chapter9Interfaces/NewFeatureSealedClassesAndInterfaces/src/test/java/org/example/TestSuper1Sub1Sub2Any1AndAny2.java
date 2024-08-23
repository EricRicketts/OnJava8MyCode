package org.example;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestSuper1Sub1Sub2Any1AndAny2 {
    private Super super1;
    private Sub1 sub1;
    private Sub2 sub2;
    private Any1 any1;
    private Any2 any2;
    private String expected, actual;

    @BeforeEach
    public void setUp() {
        super1 = new Super();
        sub1 = new Sub1();
        sub2 = new Sub2();
        any1 = new Any1();
        any2 = new Any2();
    }

    @Test
    public void testSuperMethodOne() {
        expected = "Super.methodOne";
        actual = super1.methodOne();
        assertEquals(expected, actual);
    }

    @Test
    public void testSuperMethodTwo() {
        expected = "Super.methodTwo";
        actual = super1.methodTwo();
        assertEquals(expected, actual);
    }

    @Test
    public void testSub1MethodOne() {
        expected = "Sub1.methodOne";
        actual = sub1.methodOne();
        assertEquals(expected, actual);
    }

    @Test
    public void testSub1MethodTwo() {
        expected = "Sub1.methodTwo";
        actual = sub1.methodTwo();
        assertEquals(expected, actual);
    }

    @Test
    public void testSub2MethodOne() {
        expected = "Sub2.methodOne";
        actual = sub2.methodOne();
        assertEquals(expected, actual);
    }

    @Test
    public void testSub2MethodTwo() {
        expected = "Sub2.methodTwo";
        actual = sub2.methodTwo();
        assertEquals(expected, actual);
    }

    @Test
    public void testAny1MethodOne() {
        expected = "Any1.methodOne";
        actual = any1.methodOne();
        assertEquals(expected, actual);
    }

    @Test
    public void testAny1MethodTwo() {
        expected = "Any1.methodTwo";
        actual = any1.methodTwo();
        assertEquals(expected, actual);
    }

    @Test
    public void testAny2MethodOne() {
        expected = "Any2.methodOne";
        actual = any2.methodOne();
        assertEquals(expected, actual);
    }

    @Test
    public void testAny2MethodTwo() {
        expected = "Any2.methodTwo";
        actual = any2.methodTwo();
        assertEquals(expected, actual);
    }
}
