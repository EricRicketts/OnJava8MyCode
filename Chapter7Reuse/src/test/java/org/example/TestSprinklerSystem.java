package org.example;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestSprinklerSystem {

    private SprinklerSystem sprinklerSystem;
    private String expected, actual;

    @BeforeEach
    public void setUp() {
        sprinklerSystem = new SprinklerSystem();
    }

    @Test
    public void testSprinklerSystemToString() {
        expected = "valve1 = 'first valve', valve2 = 'second valve', valve3 = 'third valve', " +
                "valve4 = 'fourth valve', waterSource = Constructed, i = 0, d = 0.0";
        actual = sprinklerSystem.toString();
        assertEquals(expected, actual);
    }

    @Test
    public void testSprinklerSystemSetAndGetValve1() {
        expected = "new first valve";
        sprinklerSystem.setValve1(expected);
        actual = sprinklerSystem.getValve1();
        assertEquals(expected, actual);
    }
}
