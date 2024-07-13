package org.example;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

// for this test we have the following numeric order for the lowercase letters
// a: 97, b: 98, c: 99, d: 100, e: 101, f: 102, g: 103, h: 104, i: 105, j: 106, k: 107,
// l: 108, m: 109, n: 110, o: 111, p: 112, q: 113, r: 114, s: 115, t: 116, u: 117
// v: 118, w: 119, x: 120, y: 121, z: 122

// a: 0, b: 1, c: 2, d: 3, e: 4, f: 5, g: 6, h: 7, i: 8, j: 9, k: 10,
// l: 11, m: 12, n: 13, o: 14, p: 15, q: 16, r: 17, s: 18, t: 19, u: 20
// v: 21, w: 22, x: 23, y: 24, z: 25
public class TestSwitchStatements {

    @Test
    public void testSwitchOnInteger() {
        int[] letterValues = {0, 4, 8, 14, 20, 24};
        String[] results = new String[letterValues.length];
        String[] expected = new String[]{
                "a, 97: vowel", "e, 101: vowel", "i, 105: vowel",
                "o, 111: vowel", "u, 117: vowel", "y, 121: sometimes vowel"
        };
        for (int i = 0; i < letterValues.length; i++) {
            int letterValue = letterValues[i];
            results[i] = SwitchStatements.vowelsAndConsonants(letterValue);
        }
        assertArrayEquals(expected, results);
    }
}
