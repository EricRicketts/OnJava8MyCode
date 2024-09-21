package org.example;


import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.LinkedList;
import java.util.Queue;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class QueueTest {

    private Queue<String> queue;
    private String[] expectedValues, actualValues;

    @BeforeEach
    public void setUp() {
        queue = new LinkedList<>();
        String letters = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        for (String letter : letters.split("")) {
            queue.offer(letter);
        }
    }

    @Test
    public void testLengthOfQueue() {
        assertEquals(26, queue.size());
    }

    @Test
    public void testIsPeekAndElement() {
        expectedValues = new String[]{"A", "A"};
        actualValues = new String[]{queue.peek(), queue.element()};
        assertArrayEquals(expectedValues, actualValues);
    }

    @Test
    public void testPollAndRemove() {
        expectedValues = new String[]{"A", "B"};
        actualValues = new String[]{queue.poll(), queue.remove()};
    }
}
