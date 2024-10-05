package org.example;


import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class RecursionTest {

    public String expected, actual;
    final IntCall operation = (n) -> n * 2;

    @Test
    public void testRecursiveFactorialArgOne() {
        expected = "1";
        int recursiveValue = new RecursiveFactorial().recursiveMethod(1, operation);
        String actual = String.valueOf(recursiveValue);
        assertEquals(expected, actual);
    }

    @Test
    public void testRecursiveFactorialArgFive() {
        expected = "120";
        int recursiveValue = new RecursiveFactorial().recursiveMethod(5, operation);
        String actual = String.valueOf(recursiveValue);
        assertEquals(expected, actual);
    }
}
/*
 for the arg = 5 case, when arg = 1, value is 1.
 arg = 2, 2 * 1 = 2
 arg = 3, 3 * 2 = 6
 arg = 4, 4 * 6 = 24
 arg = 5, 5 * 24 = 120
*/
/*

*/
