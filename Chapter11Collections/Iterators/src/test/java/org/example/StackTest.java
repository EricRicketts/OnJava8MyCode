package org.example;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayDeque;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class StackTest {
    /*
    Rat, Manx, Cymric, Mutt, Pug, Cymric,
    Pug, Manx, Cymric, Rat, EgyptianMau, Hamster
    */
    private ArrayDeque<String> stack;
    private String expected, actual;

    @BeforeEach
    public void setUp() {
        stack = StackCreator.generateStack();
    }

    @Test
    public void testPeekLast() {
        expected = "Hamster";
        actual = stack.peekLast();
        assertEquals(expected, actual);
    }

    @Test
    public void testPush() {
        // remember when the stack is created with LIFO properties
        // so before Lion is pushed onto the stack, Rat is considered
        // to be the last element.
        expected = "[Lion, Rat, Manx, Cymric, Mutt, Pug, Cymric," +
                " Pug, Manx, Cymric, Rat, EgyptianMau, Hamster]";
        stack.push("Lion");
        actual = stack.toString();
        assertEquals(expected, actual);
    }

    @Test
    public void testPop() {
        String[] expectedValues, actualValues;
        expectedValues = new String[]{"[Manx, Cymric, Mutt, Pug, Cymric," +
                " Pug, Manx, Cymric, Rat, EgyptianMau, Hamster]", "Rat"};
        actual = stack.pop();
        actualValues = new String[]{stack.toString(), actual};
        assertArrayEquals(expectedValues, actualValues);
    }
}
