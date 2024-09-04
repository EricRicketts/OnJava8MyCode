package org.example;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestClosuresAndCallbacks {

    private Callee1 callee1;
    private Callee2 callee2;
    private Caller caller1, caller2;
    int[] expectedValues, actualValues;
    String expectedString, actualString;
    String[] expectedStrings, actualStrings;

    @BeforeEach
    public void setup() {
        callee1 = new Callee1();
        callee2 = new Callee2();
        caller1 = new Caller(callee1);
        caller2 = new Caller(callee2.getCallbackReference());
    }

    @Test
    public void testCallee1GetAndSetI() {
        expectedValues = new int[]{0, 1};
        actualValues = new int[2];
        actualValues[0] = callee1.getI();
        callee1.setI(1);
        actualValues[1] = callee1.getI();

        assertArrayEquals(expectedValues, actualValues);
    }

    @Test
    public void testCallee2GetAndSetI() {
        expectedValues = new int[]{0, 1};
        actualValues = new int[2];
        actualValues[0] = callee2.getI();
        callee2.setI(1);
        actualValues[1] = callee2.getI();

        assertArrayEquals(expectedValues, actualValues);
    }

    @Test
    public void testMyIncrementStaticF() {
        callee2.setI(0);
        expectedString = "MyIncrement.this.increment() i = 1";
        actualString = MyIncrement.f(callee2);

        assertEquals(expectedString, actualString);
    }

    @Test
    public void testCaller1() {
        String[] expectedStrings = {"1", "2"};
        String[] actualStrings = new String[2];
        actualStrings[0] = caller1.go();
        actualStrings[1] = caller1.go();
        assertArrayEquals(expectedStrings, actualStrings);
    }

    @Test
    public void testCaller2() {
        expectedStrings = new String[]{
                "MyIncrement.this.increment() i = 1",
                "MyIncrement.this.increment() i = 2"};
        actualStrings = new String[2];
        actualStrings[0] = caller2.go();
        actualStrings[1] = caller2.go();
        assertArrayEquals(expectedStrings, actualStrings);
    }
}
/*
    There is a lot to unpack in this code.  Because closures are such an essential topic, it makes
    sense to put in the time to explain this code and how closures work in Java.

    To begin with, what is a closure?  From the book, "A closure is a callable object that retains
    information from the scope where it was created."  An additional note, before lambdas were
    introduced in Java8, Inner classes were the only way to create closures in Java.  The author
    put this code in the book, in case the readers were required to read code pre-Java8.  Lambdas
    are a much cleaner and concise way to create closures.  They will be introduced in the Functional
    Programming chapter.


*/
