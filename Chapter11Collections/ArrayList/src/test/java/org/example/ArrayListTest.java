package org.example;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

public class ArrayListTest {

    private ArrayList<String> arrayList;
    private String expected, actual;
    private String[] expectedValues, actualValues;

    @BeforeEach
    public void setUp() {
        arrayList = GenerateArrayList.returnArrayList();
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
        List<String> subList = arrayList.subList(1, 4);
        actualValues = subList.toArray(new String[0]);
        expectedValues = new String[]{"Foo", "Bar", "FooBar"};
        assertArrayEquals(expectedValues, actualValues);
    }
}
