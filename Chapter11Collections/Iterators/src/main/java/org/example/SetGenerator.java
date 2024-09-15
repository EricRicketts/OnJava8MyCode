package org.example;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class SetGenerator {
    public static LinkedHashSet<String> generateSet() {
        LinkedHashSet<String> set = new LinkedHashSet<>();
        set.add("Yellow");
        set.add("Blue");
        set.add("Red");
        set.add("Green");
        set.add("Black");
        set.add("White");
        set.add("Purple");
        set.add("Grey");
        set.add("Orange");
        set.add("Pink");

        return set;
    }

    public static LinkedHashSet<String> generateSecondSet() {
        LinkedHashSet<String> set = new LinkedHashSet<>();
        set.add("Yellow");
        set.add("Blue");
        set.add("Red");
        set.add("Green");

        return set;
    }
}
