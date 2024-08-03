package org.example;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class TestPlaceSetting {

    private PlaceSetting placeSetting;
    Object[] expected, actual;

    @BeforeEach
    public void setUp() {
        placeSetting = new PlaceSetting();
    }

    @Test
    public void testInheritedDinnerPlate() {
        expected = new Object[]{Size.MEDIUM, Occasion.ORDINARY};
        actual = new Object[]{placeSetting.getSize(), placeSetting.getOccasion()};
        assertArrayEquals(expected, actual);
    }

    @Test
    public void testUtensils() {
        expected = new Object[]{Size.MEDIUM, Occasion.ORDINARY,
                Size.MEDIUM, Occasion.ORDINARY, Size.MEDIUM, Occasion.ORDINARY};
        actual = new Object[]{placeSetting.getFork().getSize(), placeSetting.getFork().getOccasion(),
                                placeSetting.getSpoon().getSize(), placeSetting.getSpoon().getOccasion(),
                                placeSetting.getKnife().getSize(), placeSetting.getKnife().getOccasion(),
                            };
        assertArrayEquals(expected, actual);
    }

    @Test
    public void testForkGetterAndSetter() {
        expected = new Object[]{Size.LARGE, Occasion.FORMAL,};
        placeSetting.setFork(new Fork(Size.LARGE, Occasion.FORMAL));
        actual = new Object[]{placeSetting.getFork().getSize(), placeSetting.getFork().getOccasion()};
        assertArrayEquals(expected, actual);
    }
}
