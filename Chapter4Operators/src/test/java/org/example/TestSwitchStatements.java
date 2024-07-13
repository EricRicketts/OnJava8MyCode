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
    public void testSwitchForVowelsOnly() {
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

    @Test
    public void testSwitchForConsonantsOnly() {
        int[] letterValues = {1, 10, 15, 25};
        String[] results = new String[letterValues.length];
        String[] expected = new String[]{
                "b, 98: consonant", "k, 107: consonant", "p, 112: consonant", "z, 122: consonant"
        };
        for (int i = 0; i < letterValues.length; i++) {
            int letterValue = letterValues[i];
            results[i] = SwitchStatements.vowelsAndConsonants(letterValue);
        }
        assertArrayEquals(expected, results);
    }

    @Test
    public void testIsVowelOrConsonantOnlyVowels() {
        String[] letters = new String[]{
            "a", "A", "e", "E", "i", "I", "o", "O", "u", "U"
        };
        String[] results = new String[letters.length];
        String[] expected = new String[]{
            "a is a vowel", "A is a vowel", "e is a vowel", "E is a vowel", "i is a vowel",
            "I is a vowel", "o is a vowel", "O is a vowel", "u is a vowel", "U is a vowel"
        };
        for (int i = 0; i < letters.length; i++) {
            String letter = letters[i];
            results[i] = SwitchStatements.isVowelOrConsonant(letter);
        }
        assertArrayEquals(expected, results);
    }

    @Test
    public void testIsVowelOrConsonantOnlyConsonants() {
        String[] letters = new String[]{
                "b", "B", "h", "H", "n", "N", "t", "T", "x", "X"
        };
        String[] results = new String[letters.length];
        String[] expected = new String[]{
            "b is a consonant", "B is a consonant", "h is a consonant",
            "H is a consonant", "n is a consonant", "N is a consonant",
            "t is a consonant", "T is a consonant", "x is a consonant",
            "X is a consonant"
        };
        for (int i = 0; i < letters.length; i++) {
            String letter = letters[i];
            results[i] = SwitchStatements.isVowelOrConsonant(letter);
        }
        assertArrayEquals(expected, results);
    }

    @Test
    public void testDefaultForIsVowelOrConsonant() {
        String[] characters = new String[]{"%", "1"};
        String[] results = new String[characters.length];
        String[] expected = new String[]{"% is not a letter", "1 is not a letter"};
        for (int i = 0; i < characters.length; i++) {
            String letter =characters[i];
            results[i] = SwitchStatements.isVowelOrConsonant(letter);
        }
        assertArrayEquals(expected, results);
    }
}
