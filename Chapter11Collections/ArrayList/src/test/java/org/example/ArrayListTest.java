package org.example;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

public class ArrayListTest {

    private ArrayList<String> arrayList;
    private List<String> subList;
    private String expected, actual;
    private String[] expectedValues, actualValues;

    @BeforeEach
    public void setUp() {
        arrayList = GenerateArrayList.returnArrayList();
        subList = arrayList.subList(1, 4);
    }

    @Test
    public void testListSize() {
        assertEquals(8, arrayList.size());
    }

    @Test
    public void testAddElement() {
        arrayList.add("New End");
        expected = "[Begin, Foo, Bar, FooBar, Fizz, Buzz, FizzBuzz, End, New End]";
        actual = arrayList.toString();
        assertEquals(expected, actual);
    }
    @Test
    public void testInsertAtIndex() {
        // "[Begin, Foo, Bar, FooBar, Fizz, Buzz, FizzBuzz, End]";
        // Fizz is index = 4 so "Inserted String" is added at index = 1 then all other elements
        // including the element originally at index = 4 (Fizz) are shifted right.
        arrayList.add(4, "Inserted String");
        expected = "[Begin, Foo, Bar, FooBar, Inserted String, Fizz, Buzz, FizzBuzz, End]";
        actual = arrayList.toString();
        assertEquals(expected, actual);
    }

    @Test
    public void testRemoveElementByObject() {
        // remove(Object o) returns a boolean
        assertTrue(arrayList.remove("FooBar"));
    }

    @Test
    public void testRemoveElementByIndex() {
        expected = "Buzz";
        actual = arrayList.remove(5);
        assertEquals(expected, actual);
    }

    @Test
    public void testContainsElement() {
        Boolean[] expectedValues = new Boolean[]{true, false};
        Boolean[] actualValues = new Boolean[]{
                arrayList.contains("FizzBuzz"), arrayList.contains("Not This")};
        assertArrayEquals(expectedValues, actualValues);
    }

    @Test
    public void testGetAndSetElement() {
        arrayList.set(1, "New Foo");
        assertEquals("New Foo", arrayList.get(1));
    }

    @Test
    public void testIndexOf() {
        // "[Begin, Foo, Bar, FooBar, Fizz, Buzz, FizzBuzz, End]";
        // indexOf will find the first occurrence in the list
        arrayList.add(3, "Foo");
        assertEquals(1, arrayList.indexOf("Foo"));
        expected = "[Begin, Foo, Bar, Foo, FooBar, Fizz, Buzz, FizzBuzz, End]";
        actual = arrayList.toString();
        assertEquals(expected, actual);
    }

    @Test
    public void testLastIndexOf() {
        // "[Begin, Foo, Bar, FooBar, Fizz, Buzz, FizzBuzz, End]";
        // LastIndexOf will find the last occurrence in the list
        arrayList.add(7, "Fizz");
        assertEquals(7, arrayList.lastIndexOf("Fizz"));
        expected = "[Begin, Foo, Bar, FooBar, Fizz, Buzz, FizzBuzz, Fizz, End]";
        actual = arrayList.toString();
        assertEquals(expected, actual);
    }

    @Test
    public void testCreateSubList() {
        // "[Begin, Foo, Bar, FooBar, Fizz, Buzz, FizzBuzz, End]";
        // subList starts at first index given and goes up to but not including
        // the second index
        actualValues = subList.toArray(new String[0]);
        expectedValues = new String[]{"Foo", "Bar", "FooBar"};
        assertArrayEquals(expectedValues, actualValues);
    }

    @Test
    public void testContainsAll() {
        assertTrue(arrayList.containsAll(subList));
    }

    @Test
    public void testAddAll() {
        // adds at the end of the list
        expectedValues = new String[]{
                "Begin", "Foo", "Bar", "FooBar", "Fizz", "Buzz",
                "FizzBuzz", "End", "Foo", "Bar", "FooBar"
        };
        arrayList.addAll(subList);
        actualValues = arrayList.toArray(new String[0]);
        assertArrayEquals(expectedValues, actualValues);
    }

    @Test
    public void testAddAllInMiddleOfList() {
        // "[Begin, Foo, Bar, FooBar, Fizz, Buzz, FizzBuzz, End]";
        arrayList.addAll(6, subList);
        expectedValues = new String[]{
                "Begin", "Foo", "Bar", "FooBar",
                "Fizz", "Buzz", "Foo", "Bar",
                "FooBar", "FizzBuzz", "End"
        };
        actualValues = arrayList.toArray(new String[0]);
        assertArrayEquals(expectedValues, actualValues);
    }

    @Test
    public void testRetainAll() {
        // retainAll returns true if the calling list is changed
        // it causes the original list to keep this intersection of itself
        // and the argument list passed to the method
        // so it retained "Begin", "FooBar", "Fizz" and "FizzBuzz"
        // it ignored "Last" and "Start"
        List<String> retainList = Arrays.asList(
                "Begin", "Last", "FooBar", "Start", "Fizz", "FizzBuzz"
        );
        assertTrue(arrayList.retainAll(retainList));
        expectedValues = new String[]{
                "Begin", "FooBar", "Fizz", "FizzBuzz"
        };
        actualValues = arrayList.toArray(new String[0]);
        assertArrayEquals(expectedValues, actualValues);
    }
}