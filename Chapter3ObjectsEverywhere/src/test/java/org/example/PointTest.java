package org.example;


import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class PointTest {

    private Double[] expected, results;
    private Point p1, p2;

    @BeforeEach
    public void setUp() {
        p1 = new Point(5.50, 10.50);
        p2 = new Point(10.50, 15.50);
    }

    @Test
    public void testGetXAndGetY() {
        expected = new Double[]{5.50, 15.50};
        results = new Double[]{p1.getX(), p2.getY()};
        Assertions.assertArrayEquals(expected, results);
    }

}
