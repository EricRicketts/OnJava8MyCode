package org.example;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestWaterSource {

    private WaterSource waterSource;
    private String expected, actual;

    @BeforeEach
    public void setUp() {
        waterSource = new WaterSource();
    }

    @Test
    public void testWaterSourceToString() {
        expected = "Constructed";
        actual = waterSource.toString();
        assertEquals(expected, actual);
    }

    @Test
    public void testWaterSourceSetterAndGetter() {
        expected = "Not Constructed";
        waterSource.setStatus("Not Constructed");
        actual = waterSource.getStatus();
        assertEquals(expected, actual);
    }
}

