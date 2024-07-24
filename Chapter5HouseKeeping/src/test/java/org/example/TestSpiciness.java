package org.example;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestSpiciness {

    private final String[] expected = {"NOT", "MILD", "MEDIUM", "HOT", "FLAMING"};
    Spiciness[] spiciness;

    @BeforeEach
    public void setUp() {
        spiciness = Spiciness.values();
    }

    @Test
    public void testOneSpicinessValue() {
        String expected = "HOT";
        Spiciness spiciness = Spiciness.HOT;
        String actual = spiciness.toString();
        assertEquals(expected, actual);
    }

    @Test
    public void testSpicinessValuesAndOrdinals() {
        for (int index = 0; index < spiciness.length; index++) {
            String expectedSpiciness = expected[index];
            String actualSpiciness = spiciness[index].toString();
            assertEquals(expectedSpiciness, actualSpiciness);
            int actualOrdinal = spiciness[index].ordinal();
            assertEquals(index, actualOrdinal);
        }
    }
}
