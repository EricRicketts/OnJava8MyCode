package org.example;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.List;
import java.util.ListIterator;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class ListIteratorTest {

    private ListIterator<String> listIterator, listIteratorStartsFromEnd;
    List<String> petCreator;
    private String[] expectedValues;

    @BeforeEach
    public void setUp() {
        petCreator = PetCreator.returnPetCreator();
        listIterator = petCreator.listIterator();
        listIteratorStartsFromEnd = petCreator.listIterator(petCreator.size());
        expectedValues = new String[]{
                "Rat", "Manx", "Cymric",  "Mutt",  "Pug", "Cymric", "Pug",
                "Manx", "Cymric", "Rat", "EgyptianMau", "Hamster"
        };
    }

    @Test
    public void testMoveForwardThroughListIterator() {
        int index = 0;
        while (listIterator.hasNext()) {
            String expectedValue = expectedValues[index];
            String actualValue = listIterator.next();
            Object[] expectedValues = new Object[]{
                    expectedValue, index + 1, index
            };
            Object[] actualValues = new Object[]{
                    actualValue, listIterator.nextIndex(), listIterator.previousIndex()
            };
            assertArrayEquals(expectedValues, actualValues);
            index += 1;
        }
    }

    @Test
    public void testMoveBackwardThroughListIterator() {
        int index = expectedValues.length - 1;
        while (listIteratorStartsFromEnd.hasPrevious()) {
            String expectedValue = expectedValues[index];
            String actualValue = listIteratorStartsFromEnd.previous();
            // the call to previous moves the cursor, so if we want the correct cursor positions
            // for the test we need to move the cursor each time by a call to previous()
            Object[] expectedValues = new Object[]{
                    expectedValue, index - 1, index
            };
            Object[] actualValues = new Object[]{
                    actualValue, listIteratorStartsFromEnd.previousIndex(),
                    listIteratorStartsFromEnd.nextIndex()
            };
            assertArrayEquals(expectedValues, actualValues);
            index -= 1;
        }
    }

    @Test
    public void testSetAValueWhileIteratingThroughTheList() {
        int index = 0;
        String[] arrayOfPets = new String[expectedValues.length];
        while(listIterator.hasNext()) {
            String currentValue = listIterator.next();
            if (currentValue.equals("EgyptianMau")) {
                listIterator.set("Egyptian Breed");
            }
        }
        expectedValues = new String[]{
                "Rat", "Manx", "Cymric",  "Mutt",  "Pug", "Cymric", "Pug",
                "Manx", "Cymric", "Rat", "Egyptian Breed", "Hamster"
        };
        listIterator = petCreator.listIterator();
        while(listIterator.hasNext()) {
            String currentValue = listIterator.next();
            arrayOfPets[index] = currentValue;
            index += 1;
        }
        assertArrayEquals(expectedValues, arrayOfPets);
    }
}
            /*
                listIterator.next() has to be called FIRST for the indices to match the above expected values.
                Otherwise, in the first iteration through the loop the actual indices will be 0, -1 vice
                1, 0.

                Based on the provided search results, here’s a concise answer:

                A ListIterator in Java does not have a “current” element, but rather a cursor position that
                lies between the element that would be returned by a call to previous() and the element that
                would be returned by a call to next(). This cursor position is not tied to a specific index,
                but rather represents the position between two elements.

                When you create a ListIterator, you can use methods like nextIndex() and previousIndex() to
                get the index of the element that would be returned by a subsequent call to next() or
                previous(), respectively. These indices are relative to the cursor position and can be used
                to determine the position of the element in the list.

                Here are some key points to note:

                nextIndex() returns the index of the element that would be returned by a subsequent call
                to next(). previousIndex() returns the index of the element that would be returned by a
                subsequent call to previous().

                The cursor position is not fixed at a specific index, but rather moves as you iterate through
                the list using next() or previous() methods.

                You cannot directly set the cursor index; instead, you use the next() or previous() methods
                to move the cursor and then use nextIndex() or previousIndex() to get the corresponding index.

                Here’s an example code snippet to illustrate this:

                List<String> list = Arrays.asList("a", "b", "c", "d", "e");
                ListIterator<String> iterator = list.listIterator();

                // Move the cursor to the second element
                iterator.next(); // cursor position is between "a" and "b"
                int currentIndex = iterator.nextIndex(); // returns 1

                // Move the cursor to the previous element
                iterator.previous(); // cursor position is between "b" and "a"
                int previousIndex = iterator.previousIndex(); // returns 0

                In this example, the cursor position is initially between “a” and “b”, and the nextIndex()
                method returns 1, indicating the index of the next element (“b”). When we move the cursor
                to the previous element using previous(), the cursor position becomes between “b” and “a”,
                and the previousIndex() method returns 0, indicating the index of the previous element (“a”).
            */
