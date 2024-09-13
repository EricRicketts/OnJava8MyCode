package org.example;

import java.util.ArrayList;

public class GenerateArrayList {
    public static ArrayList<String> returnArrayList() {
        ArrayList<String> list = new ArrayList<String>();
        list.add("Begin");
        list.add("Foo");
        list.add("Bar");
        list.add("FooBar");
        list.add("Fizz");
        list.add("Buzz");
        list.add("FizzBuzz");
        list.add("End");
        return list;
    }
}
