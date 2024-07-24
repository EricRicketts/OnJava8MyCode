package org.example;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestBurrito {

    private String expected, actual;
    private Burrito plain, greenChile, jalapeno;

    @BeforeEach
    public void setUp() {
        plain = new Burrito(Spiciness.NOT);
        greenChile = new Burrito(Spiciness.MEDIUM);
        jalapeno = new Burrito(Spiciness.HOT);
    }
    @Test
    public void testAMildBurrito() {
        expected = "This Burrito is not spicy at all.";
        actual = plain.describe();
        assertEquals(expected, actual);
    }

    @Test
    public void testAMediumBurrito() {
        expected = "This Burrito is a little hot.";
        actual = greenChile.describe();
        assertEquals(expected, actual);
    }

    @Test
    public void testAHotBurrito() {
        expected = "This Burrito is maybe too hot.";
        actual = jalapeno.describe();
        assertEquals(expected, actual);
    }
}
