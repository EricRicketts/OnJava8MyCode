package org.example;

import java.util.*;

public class StackCreator {
    public static ArrayDeque<String> generateStack() {
        List<String> pets = Arrays.asList(
                "Rat", "Manx", "Cymric",  "Mutt",  "Pug", "Cymric", "Pug",
                "Manx", "Cymric", "Rat", "EgyptianMau", "Hamster"
        );
        return new ArrayDeque<>(pets);
    }
}
