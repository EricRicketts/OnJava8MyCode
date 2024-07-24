package org.example;


import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestSimpleNameSpace {

    @Test
    public void testFullyQualifiedName() {
        /*
           Below is the fully qualified name space to Java's ArrayList class.  We can always do this
           and it will work, however this gets tedious after a while and importing the appropriate
           name space shortens the code but does not detract from readability, as we see in the next
           test.
        */
        java.util.ArrayList<Integer> list = new java.util.ArrayList<Integer>();
        list.add(0); list.add(1); list.add(2);
        assertEquals(3, list.size());
    }

    @Test
    public void testPartiallyQualifiedName() {
        // see above java.util.ArrayList imported, also used the "var" keyword for Java to infer the
        // variable type.
        var list = new java.util.ArrayList<Integer>();
        list.add(0); list.add(1); list.add(2);
        assertEquals(3, list.size());
    }
}
