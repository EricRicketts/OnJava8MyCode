package org.example;


import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MethodReferencesIntroductionTest {

    Describe describe;
    Callable callable;
    private String expected, actual;

    @Test
    public void testCallFromDescribeObject() {
        describe = new Describe();
        callable = describe::show;
        expected = "call()";
        actual = callable.call("call()");

        assertEquals(expected, actual);
        /*
            This code can be very confusing, so it is important that we understand the basics.
            To start off with, note that all methods defined have the same signature as Callable.
            They are all "String <method_name>(String argument)".  I am not sure the purpose is clear
            for doing such a thing as one can only invoke the method defined in the class.  The
            Callable instance callable can only invoke the "call()" method on a Callable instance.  It
            cannot invoke a Describe method on a Callable instance.

            So the method reference assignment is fine because of identical method signatures, however,
            a Describe method cannot be invoked on a Callable object.  Nor can we do something like this:
            describe = callable, because we cannot assign a Callable object to a Describe object.
        */
    }

    @Test
    public void testHelloCall() {
        expected = "Hello, Bob";
        callable = MethodReferences::hello;
        actual = callable.call("Bob");
        assertEquals(expected, actual);
    }

    @Test
    public void testHelpCall() {
        expected = "valuable information";
        callable = new MethodReferences.Description("valuable")::help;
        actual = callable.call("information");
        assertEquals(expected, actual);
    }


}
