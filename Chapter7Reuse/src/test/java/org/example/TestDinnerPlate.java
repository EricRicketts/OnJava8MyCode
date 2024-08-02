package org.example;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class TestDinnerPlate {

    private DinnerPlate firstDinnerPlate, secondDinnerPlate;
    private Object[] expected, actual;

    @BeforeEach
    public void setUp() {
        firstDinnerPlate = new DinnerPlate();
        secondDinnerPlate = new DinnerPlate(Size.LARGE, Occasion.FORMAL);
    }

    @Test
    public void testFirstDinnerPlate() {
        expected = new Object[]{Size.MEDIUM, Occasion.ORDINARY};
        actual = new Object[]{firstDinnerPlate.getSize(), firstDinnerPlate.getOccasion()};
        assertArrayEquals(expected, actual);
    }

    @Test
    public void testSecondDinnerPlate() {
        expected = new Object[]{Size.LARGE, Occasion.FORMAL};
        actual = new Object[]{secondDinnerPlate.getSize(), secondDinnerPlate.getOccasion()};
        assertArrayEquals(expected, actual);
    }
}
