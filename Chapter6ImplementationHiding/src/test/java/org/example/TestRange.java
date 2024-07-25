package org.example;
import org.junit.jupiter.api.Test;

import static org.example.Range.*;
import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestRange {

    private int[] expected, actual;

    @Test
    public void testFullRange() {
        expected = new int[]{10, 13, 16, 19};
        // with the class name present the name space => package org.example takes care of
        // the class Range because that class was already defined in package org.example in
        // the src/main/java/org/example directory
        actual = Range.range(10, 21, 3);
        assertArrayEquals(expected, actual);
        // since the import static org.example.Range.*; exists we can call the range
        // methods directly.  The below call highlights the import =>
        // import static org.example.Range.*; because we are making use of the import
        // to call the methods without the qualifying class name.
        actual = range(10, 21, 3);
    }

    @Test
    public void testNegativeRange() {
        expected = new int[]{21, 18, 15, 12};
        actual = range(21, 10, -3);
        assertArrayEquals(expected, actual);
    }

    @Test
    public void testNoRange() {
        expected = new int[]{};
        actual = range(-5, 5, -3);
        assertArrayEquals(expected, actual);
    }

    @Test
    public void testNegativeToPositiveRange() {
        expected = new int[]{-5, -2, 1, 4};
        actual = range(-5, 5, 3);
        assertArrayEquals(expected, actual);
    }

    @Test
    public void testRangeSequenceStepByOne() {
        expected = new int[]{10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20};
        actual = range(10, 21);
        assertArrayEquals(expected, actual);
    }

    @Test
    public void testRangeSequence() {
        expected = new int[]{0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
        actual = range(10);
        assertArrayEquals(expected, actual);
    }
}
