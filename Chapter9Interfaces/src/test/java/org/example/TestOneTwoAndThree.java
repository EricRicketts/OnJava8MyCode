package org.example;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestOneTwoAndThree {

    private OneTwoAndThree oneTwoAndThree;
    private String expected, actual;

    @BeforeEach
    public void setUp() {
        oneTwoAndThree = new OneTwoAndThree();
    }

    @Test
    public void testOneTwoAndThreeFirst() {
        /*
            In this test, we are testing the overridden method first() in the class definition for OneTwoAndThree.
            OneTwoAndThree implements interfaces One, Two, and Three.  Java demands a method body when implementing an
            Interface, as an Interface only requires a method declaration.
        */
        expected = "OneTwoAndThree implementation of One interface, first method";
        actual = oneTwoAndThree.first();
        assertEquals(expected, actual);
    }

    @Test
    public void testOneTwoAndThreeSecond() {
        /*
            Intentionally did not override the Interface Two.second() and set a default method within Interface Two.  Observe
            below that the default method will be called when oneTwoAndThree calls second().
        */
        expected = "Interface second";
        actual = oneTwoAndThree.second();
        assertEquals(expected, actual);
    }

    @Test
    public void testOneTwoAndThreeThird() {
        expected = "OneTwoAndThree implementation of Three interface, third method";
        actual = oneTwoAndThree.third();
        assertEquals(expected, actual);
    }

    @Test
    public void testOneStaticMethod() {
        expected = "Foo";
        actual = One.getX();
        assertEquals(expected, actual);
    }
}
