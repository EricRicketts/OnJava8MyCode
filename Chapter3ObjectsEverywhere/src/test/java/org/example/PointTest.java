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
        p2.setX(20.22);
        p2.setY(30.33);
        expected = new Double[]{20.22, 30.33};
        results = new Double[]{p2.getX(), p2.getY()};
        Assertions.assertArrayEquals(expected, results);
    }

    @Test
    public void testStaticVariable() {
        // no object is needed to call a static method
        Assertions.assertEquals("Cartesian", Point.getType());
    }

    @Test
    public void testEqualityBetweenPoints() {
        // the "assertFalse" and "assertTrue" use the equals method
        Assertions.assertNotEquals(p1, p2);
        Assertions.assertFalse(p1.equals(p2));
        p2.setX(p1.getX());
        p2.setY(p1.getY());
        Assertions.assertEquals(p1, p2);
        Assertions.assertTrue(p1.equals(p2));
    }
}
