package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class TestVariableArguments {

    private String expected, results;

    public static String printObjectArray(Object[] args) {
        String str = "";
        for (Object obj : args) {
            str = str.concat(obj.toString() + " ");
        }
        return str.trim();
    }

    public static String printSpreadArray(Object... args) {
        String str = "";
        for (Object obj : args) {
            str = str.concat(obj.toString() + " ");
        }
        return str.trim();
    }

    @Test
    public void testPrintObjectArray() {
        expected = "47 3.14 11.11";
        results = printObjectArray(new Object[] { 47, 3.14, 11.11 });
        assertTrue(expected.equals(results));
        // String foo = printObjectArray(1, 2, 3) => this syntax will not work with the method defined as
        // (Object[] args) you must pass in the arguments as a self-contained array
    }

    @Test
    public void testPrintSpreadArray() {
        expected = "1.05 3 5.55 foo bar";
        results = printSpreadArray(1.05, 3, 5.55, "foo", "bar");
        assertTrue(expected.equals(results));
        results = printSpreadArray(new Object[] {1.05, 3, 5.55, "foo", "bar"});
        assertTrue(expected.equals(results));
        // with this syntax you can write the method arguments as a comma separated list no array syntax is necessary
        // but the syntax will accept both forms of arguments
    }
}
