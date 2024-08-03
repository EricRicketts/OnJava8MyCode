package org.example;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class TestDinnerPlate {

    private DinnerPlate firstDinnerPlate, secondDinnerPlate, thirdDinnerPlate;
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

    @Test
    public void testEquals() {
        thirdDinnerPlate = new DinnerPlate(Size.LARGE, Occasion.FORMAL);
        assertEquals(secondDinnerPlate, thirdDinnerPlate);
    }

    @Test
    public void testHashCode() {
        // the hashcode should be the same for a given object
        assertEquals(firstDinnerPlate.hashCode(), firstDinnerPlate.hashCode());
        // If the two instances are equal then the hashcode must be the same
        // for both instances, so redefining equals means redefining hashCode
        thirdDinnerPlate = new DinnerPlate();
        assertEquals(firstDinnerPlate, thirdDinnerPlate);
        assertEquals(firstDinnerPlate.hashCode(), thirdDinnerPlate.hashCode());
    }
}
