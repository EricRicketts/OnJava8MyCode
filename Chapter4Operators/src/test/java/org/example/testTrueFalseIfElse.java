package org.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class testTrueFalseIfElse {

    String expected, results;

    @Test
    public void testATrueValue() {
        assertTrue(TrueFalseIfElse.returnTrueOrFalse(0));
    }

    @Test
    public void testAFalseValue() {
        assertFalse(TrueFalseIfElse.returnTrueOrFalse(1));
    }

    @Test
    public void testIfBranch () {
        expected = "b is less than zero";
        results = TrueFalseIfElse.IfElse(-1);
        assertEquals(expected, results);
    }

    @Test
    public void testElseIfBranch () {
        expected = "b is greater than zero";
        results = TrueFalseIfElse.IfElse(1);
        assertEquals(expected, results);
    }

    @Test
    public void testElseBranch () {
        expected = "b is equal to zero";
        results = TrueFalseIfElse.IfElse(0);
        assertEquals(expected, results);
    }



}
