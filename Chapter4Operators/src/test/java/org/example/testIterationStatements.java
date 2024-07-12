package org.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class testIterationStatements {

    private final int expected = 45;
    private int results;

    @Test
    public void TestWhileLoopSum() {
        results = IterationStatements.sumFirstTenIntegers();
        assertEquals(expected, results);
    }

    @Test
    public void TestDoWhileLoopSum() {
        results = IterationStatements.sumFirstTenIntegersVersionTwo();
        assertEquals(expected, results);
    }

    @Test
    public void TestForLoopSum() {
        results = IterationStatements.sumFirstTenIntegersVersionThree();
        assertEquals(expected, results);
    }
}
