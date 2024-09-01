package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ClassInsideInterfaceTest {

    @Test
    public void testClassInsideInterface() {
        String expected = "Howdy!!  class ClassWithinInterface contained in interface ClassInterface";
        ClassInterface classInterface = new ClassInterface.ClassWithinInterface();
        String actual = classInterface.howdy();
        assertEquals(expected, actual);
    }
}
/*
    What would be the reason for embedding a class inside an interface?  The author of "On Java Eight"
    states that one can do so to offer common code to use with all the different implementations of the
    interface.  In this case, though contrived, anyone using the "ClassInterface" interface gets access to
    the accompanying "ClassWithinInterface" class.
*/
