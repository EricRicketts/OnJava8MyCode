package org.example;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Collections;
import java.util.LinkedHashSet;

import static org.junit.jupiter.api.Assertions.*;

public class SetTest {

    private LinkedHashSet<String> setOne, setTwo;
    private int[] expectedSize, actualSize;

    @BeforeEach
    public void setUp() {
        setOne = SetGenerator.generateSet();
        setTwo = SetGenerator.generateSecondSet();
    }

    @Test
    public void testCannotDuplicateElementsInSet() {
        expectedSize = new int[]{10, 10};
        actualSize = new int[2];
        actualSize[0] = setOne.size();
        setOne.add("Blue"); // Blue is already a color in the set
        actualSize[1] = setOne.size();
        assertArrayEquals(expectedSize, actualSize);
    }

    @Test
    public void testASetCanContainAnotherSet() {
        assertTrue(setOne.containsAll(setTwo));
    }

    @Test
    public void testRemoveItemAndAddSameItemBackIn() {
        expectedSize = new int[]{9, 10};
        actualSize = new int[2];
        setOne.remove("Yellow");
        actualSize[0] = setOne.size();
        setOne.add("Yellow");
        actualSize[1] = setOne.size();
        assertArrayEquals(expectedSize, actualSize);
    }

    @Test
    public void testAddNotAllButSome() {
        // only those elements not already in the set will be added
        Collections.addAll(setTwo, "Black", "White", "Purple", "Blue", "Red");
        assertEquals(7, setTwo.size());
    }

}
