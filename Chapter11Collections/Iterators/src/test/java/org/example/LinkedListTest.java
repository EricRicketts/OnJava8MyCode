package org.example;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.LinkedList;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class LinkedListTest {
    private LinkedList<String> list;
    private String[] expectedValues, actualValues;
    private String expected, actual;

    @BeforeEach
    public void setUp() {
        list = LikedLIstCreator.generateLinkedList();
    }

    /*
    0: "Rat", 1: "Manx", 2: "Cymric",  3: "Mutt", 4: "Pug", 5: "Cymric",
    6: "Pug", 7: "Manx", 8: "Cymric", 9: "Rat", 10: "EgyptianMau", 11: "Hamster"

    "Rat", "Manx", "Cymric", "Mutt", "Pug", "Cymric",
    "Pug", "Manx", "Cymric", "Rat", "EgyptianMau", "Hamster"

    Rat, Manx, Cymric, Mutt, Pug, Cymric,
    Pug, Manx, Cymric, Rat, EgyptianMau, Hamster

     */

    @Test
    public void testGetFirstElement() {
        expectedValues = new String[]{"Rat", "Rat"};
        actualValues = new String[]{list.getFirst(), list.element()};
        assertArrayEquals(expectedValues, actualValues);
    }

    @Test
    public void testGetLastElement() {
        expectedValues = new String[]{"Hamster", "Hamster"};
        actualValues = new String[]{list.getLast(), list.peekLast()};
        assertArrayEquals(expectedValues, actualValues);
    }

    @Test
    public void testAddElementToFront() {
        expected = "[Lion, Rat, Manx, Cymric, Mutt, Pug, Cymric, Pug," +
                " Manx, Cymric, Rat, EgyptianMau, Hamster]";
        list.addFirst("Lion");
        actual = list.toString();
        assertEquals(expected, actual);
    }

    @Test
    public void testAddElementToBack() {
        expected = "[Rat, Manx, Cymric, Mutt, Pug, Cymric, Pug," +
                " Manx, Cymric, Rat, EgyptianMau, Hamster, Lion]";
        list.addLast("Lion");
        actual = list.toString();
        assertEquals(expected, actual);
    }

    @Test
    public void testRemoveElementFromFront() {
        expectedValues = new String[]{
            "Rat", "[Manx, Cymric, Mutt, Pug, Cymric," +
                " Pug, Manx, Cymric, Rat, EgyptianMau, Hamster]"
        };
        actual = list.removeFirst();
        actualValues = new String[]{actual, list.toString()};
        assertArrayEquals(expectedValues, actualValues);
    }

    @Test
    public void testRemoveElementFromBack() {
        expectedValues = new String[]{
                "[Rat, Manx, Cymric, Mutt, Pug, Cymric," +
                " Pug, Manx, Cymric, Rat, EgyptianMau]", "Hamster"
        };
        actual = list.removeLast();
        actualValues = new String[]{list.toString(), actual};
        assertArrayEquals(expectedValues, actualValues);
    }
}
