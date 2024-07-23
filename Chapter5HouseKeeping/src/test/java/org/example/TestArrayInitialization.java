package org.example;

import org.junit.jupiter.api.Test;

import java.util.Random;

import static org.junit.jupiter.api.Assertions.*;

public class TestArrayInitialization {
    private final int[] a1 = {1, 2, 3, 4, 5};

    @Test
    public void testSettingArraysEqualToOneAnother() {
        int[] a2;
        a2 = a1;
        assertArrayEquals(new int[]{1, 2, 3, 4, 5}, a2);
        for (int i = 0; i < a1.length; i++) {
            a1[i] += 1;
        }
        assertArrayEquals(new int[]{2, 3, 4, 5, 6}, a2);
        /*
            this works because Objects such as arrays are references in Java.  The array declaration an assignment
            above for a1 is a reference pointing to the initial memory location for {1, 2, 3, 4, 5}.  The assignment
            a2 = a1 means a2 shares the memory address for a1.  Thus, any changes to a1 are automatically picked up by
            a2 unless a1 is reassigned to another value.
        */
    }

    @Test
    public void testLengthAttribute() {
        assertEquals(5, a1.length);
    }

    @Test
    public void testArrayInitialization() {
        Random r = new Random(10);
        Double[] numericArray = new Double[r.nextInt(10)];
        double[] primitiveArray = new double[r.nextInt(10)];
        char[] charPrimitiveArray = new char[r.nextInt(10)];
        Character[] charArray = new Character[r.nextInt(10)];
        String[] stringArray = new String[r.nextInt(10)];
        for (Double aDouble : numericArray) {
            assertNull(aDouble);
        }
        for (double v : primitiveArray) {
            assertEquals(0.00, v);
        }
        for (char aChar : charPrimitiveArray) {
            assertEquals(0.00, aChar);
        }
        for (Character c : charArray) {
            assertNull(c);
        }
        for (String s1 : stringArray) {
            assertNull(s1);
        }
        for (Double d : numericArray) {
            assertNull(d);
        }
    }
}
