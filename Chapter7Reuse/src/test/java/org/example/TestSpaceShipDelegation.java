package org.example;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestSpaceShipDelegation {

    private SpaceShipDelegation spaceShipDelegation;
    private String expected, actual;

    @BeforeEach
    void setUp() {
        spaceShipDelegation = new SpaceShipDelegation("Apollo 11");
    }

    @Test
    public void testGetName() {
        expected = "Apollo 11";
        actual = spaceShipDelegation.getName();
        assertEquals(expected, actual);
    }

    @Test
    public void testUpControls() {
        expected = "up by 15ft/sec";
        actual = spaceShipDelegation.up(15);
        assertEquals(expected, actual);
    }
}
