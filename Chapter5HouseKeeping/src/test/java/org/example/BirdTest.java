package org.example;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class BirdTest {

    private Bird bird;
    private Double expected, results;

    @BeforeEach
    public void setUp() {
        bird = new Bird(); // even though a constructor is not defined in the class
        // java will provide a no argument constructor, which is required to create
        // an instance of the class
    }

    @Test
    public void testSetAndGetWingspan() {
        bird.setWingspan((Double) 10.50);
        expected = Double.valueOf(10.50);
        results = (Double) bird.getWingspan();
        assertEquals(expected, results);
    }

    @Test
    public void testSetAndGetHeight() {
        // see if casting is not required
        expected = 11.50;
        bird.setHeight(11.50);
        results = bird.getHeight();
        assertEquals(expected, results);
        // casting not required
        assertEquals("Double", expected.getClass().getSimpleName());
        assertEquals("Double", results.getClass().getSimpleName());
    }
}
