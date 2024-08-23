package org.example;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestBottomLevel1Level2AndLevel3 {

    private Bottom bottom;
    private Level1 level1;
    private Level2 level2;
    private Level3 level3;
    private String expected, actual;

    @BeforeEach
    public void setUp() {
        bottom = new Bottom();
        level1 = new Level1();
        level2 = new Level2();
        level3 = new Level3();
    }

    @Test
    public void testBottomMethodOne() {
        expected = "Bottom methodOne()";
        actual = bottom.methodOne();
        assertEquals(expected, actual);
    }

    @Test
    public void testBottomMethodTwo() {
        expected = "Bottom methodTwo()";
        actual = bottom.methodTwo();
        assertEquals(expected, actual);
    }

    @Test
    public void testLevel1MethodOne() {
        expected = "Level1 methodOne()";
        actual = level1.methodOne();
        assertEquals(expected, actual);
    }

    @Test
    public void testLevel1MethodTwo() {
        expected = "Level1 methodTwo()";
        actual = level1.methodTwo();
        assertEquals(expected, actual);
    }

    @Test
    public void testLevel2MethodOne() {
        expected = "Level2 methodOne()";
        actual = level2.methodOne();
        assertEquals(expected, actual);
    }

    @Test
    public void testLevel2MethodTwo() {
        expected = "Level2 methodTwo()";
        actual = level2.methodTwo();
        assertEquals(expected, actual);
    }

    @Test
    public void testLevel3MethodOne() {
        expected = "Level3 methodOne()";
        actual = level3.methodOne();
        assertEquals(expected, actual);
    }

    @Test
    public void testLevel3MethodTwo() {
        expected = "Level3 methodTwo()";
        actual = level3.methodTwo();
        assertEquals(expected, actual);
    }
}
