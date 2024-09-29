package org.example;


import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class LambdaExpressionsTest {

    private String expected, actual;

    @Test
    public void testFirstBody() {
        expected = "Wow! No Parens!";
        actual = LambdaExpressions.body.detailed("Wow!");
        assertEquals(expected, actual);
    }

    @Test
    public void testSecondBody() {
        expected = "Oh! More Details!";
        actual = LambdaExpressions.bodyTwo.detailed("Oh!");
        assertEquals(expected, actual);
    }

    @Test
    public void testFistDescription() {
        expected = "Short Information";
        actual = LambdaExpressions.description.brief();
        assertEquals(expected, actual);
    }

    @Test
    public void testSecondDescription() {
        expected = "moreLines() method from Description class";
        actual = LambdaExpressions.descriptionTwo.brief();
        assertEquals(expected, actual);
    }

    @Test
    public void testMulti() {
        expected = "Foo 34.11";
        actual = LambdaExpressions.multi.twoArg("Foo", 34.11);
        assertEquals(expected, actual);
    }
}
