package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestSpiciness {

    @Test
    public void testOneSpicinessValue() {
        String expected = "HOT";
        Spiciness spiciness = Spiciness.HOT;
        String actual = spiciness.toString();
        assertEquals(expected, actual);
    }

    @Test
    public void testSpicinessValuesAndOrdinals() {
        String[] expected = {"NOT", "MILD", "MEDIUM", "HOT", "FLAMING"};
        Spiciness[] s = Spiciness.values();
        for (int index = 0; index < s.length; index++) {
            String expectedSpiciness = expected[index];
            String actualSpiciness = s[index].toString();
            assertEquals(expectedSpiciness, actualSpiciness);
            int actualOrdinal = s[index].ordinal();
            assertEquals(index, actualOrdinal);
        }
    }
}
