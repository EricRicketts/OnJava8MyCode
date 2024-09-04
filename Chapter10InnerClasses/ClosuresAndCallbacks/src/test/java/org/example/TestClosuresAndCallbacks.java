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
    information from the scope where it was created."

    From the book, "With a callback, some other object is given a piece of information that allows
    it to call back into the originating object at some later point."

    An additional note, before lambdas were introduced in Java8, Inner classes were the only way to
    create closures in Java.  The author put this code in the book, in case the readers were required
    to read code pre-Java8.  Lambdas are a much cleaner and concise way to create closures.  They will
    be introduced in the Functional Programming chapter.

    Class Callee1 is very simple, it just implements the Incrementable Interface, overriding the
    increment() method.

    I do not fully understand the author's explanation of the Callee2 class.  The Callee2 class inherits
    from the MyIncrement class.  The MyIncrement class has a different implementation of the increment()
    method than does the Incrementable Interface.

    Whey MyIncrement is inherited into Callee2, increment() cannot be overridden for use by Incrementable,
    so one is forced to provide a separate implementation using an inner class.  I think what the author
    means by this is that increment() from MyIncrement inherited by Callee2 has no way of redefining the
    increment() method in such a way that Incrementable can use it.

    In this case, in order to implement the Incrementable Interface we must create an Inner class that
    references the Incrementable Interface.  We do this with the Closure class.

    I think I understand the author's point.  In the case of Callee1 and Incrementable there is a
    distinct separation of concerns between the Interface and the implementation.  Callee1 could just
    be one of many implementations of the Incrementable Interface.

    In the case of Callee2 we have a different implementation of the increment() method defined by
    the MyIncrement class which Callee2 has inherited.  Now in order to define a particular implementation
    of the increment() method from the Incrementable Interface, Callee2 has to define an Inner class, which
    in this case is the Closure class.
*/
