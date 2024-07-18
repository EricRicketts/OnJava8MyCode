package org.example;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestOrderOfInitialization {

    OrderOfInitialization orderOfInitialization;

    @BeforeEach
    public void setUp() {
        orderOfInitialization = new OrderOfInitialization();
    }

    @Test
    public void testGetI() {
        assertEquals(11, orderOfInitialization.getI());
    }

    @Test
    public void testGetJ() {
        assertEquals(110, orderOfInitialization.getJ());
    }
}
