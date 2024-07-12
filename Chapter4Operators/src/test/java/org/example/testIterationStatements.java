package org.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class testIterationStatements {

    private final int expected = 45;
    private int results;

    @Test
    public void testWhileLoopSum() {
        results = IterationStatements.sumFirstTenIntegers();
        assertEquals(expected, results);
    }

    @Test
    public void testDoWhileLoopSum() {
        results = IterationStatements.sumFirstTenIntegersVersionTwo();
        assertEquals(expected, results);
    }

    @Test
    public void testForLoopSum() {
        results = IterationStatements.sumFirstTenIntegersVersionThree();
        assertEquals(expected, results);
    }

    @Test
    public void testForInLoopSum() {
        results = IterationStatements.sumFirstTenIntegersUsingForIn();
        assertEquals(expected, results);
    }
}
