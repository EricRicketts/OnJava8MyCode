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

    @Test
    public void testSetXAndSetY() {
        p2.setX(20.00);
        p2.setY(30.00);
        expected = new Double[]{20.00, 30.00};
        results = new Double[]{p2.getX(), p2.getY()};
        Assertions.assertArrayEquals(expected, results);
    }

    @Test
    public void testStaticVariable() {
        // no object is needed to call a static method
        Assertions.assertEquals("Cartesian", Point.getType());
    }
}
