package org.example;


import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class TestRandomValuesClass {

    private RandomValuesClass randomValuesClass;
    long expectedLong, actualLong;
    double expectedDouble, actualDouble;

    @BeforeEach
    void setUp() {
        randomValuesClass = new RandomValuesClass();
    }

    @Test
    public void testGetChosenLongValue() {
        expectedLong = 123_456_789;
        actualLong = randomValuesClass.getChosenLongValue();
        assertEquals(expectedLong, actualLong);
    }

    @Test
    public void testGetChosenDoubleValue() {
        expectedDouble = 123_456.789;
        actualDouble = randomValuesClass.getChosenDoubleValue();
        assertEquals(expectedDouble, actualDouble);
    }

    @Test
    public void testInterfaceConstantsInteger() {
        boolean rangeForRandomInt = RandomValues.RANDOM_INT >= 0 && RandomValues.RANDOM_INT < 10;
        assertTrue(rangeForRandomInt);
    }

    @Test
    public void testInterfaceConstantsFloat() {
        boolean rangeForRandomFloat = RandomValues.RANDOM_FLOAT > 0 && RandomValues.RANDOM_FLOAT < 10;
        assertTrue(rangeForRandomFloat);
    }
}