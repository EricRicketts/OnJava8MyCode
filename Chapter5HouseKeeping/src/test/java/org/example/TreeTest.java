package org.example;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class TreeTest {
    private Tree treeOne, treeTwo;
    private String expected, results;

    @BeforeEach
    public void setUp() {
        treeOne = new Tree();
        treeTwo = new Tree(30);
    }

    @Test
    public void testSecondTreeHeight() {
        int expected = 30;
        int results = treeTwo.getHeight();
        assertEquals(expected, results);
    }

    @Test
    public void testFirstTreeHeight() {
        int expected = 0;
        int results = treeOne.getHeight();
        assertEquals(expected, results);
    }

    @Test
    public void testInfoMethodWithArgument() {
        expected = "overloaded method: Tree has height = 30 feet";
        results = treeTwo.info("overloaded method");
        assertEquals(expected, results);
    }

    @Test
    public void testInfoMethodWithoutArgument() {
        expected = "Tree has height = 0 feet";
        results = treeOne.info();
        assertEquals(expected, results);
    }
}
