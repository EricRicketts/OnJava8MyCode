package org.example;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class LikedLIstCreator {
    public static LinkedList<String> generateLinkedList() {
        List<String> pets = Arrays.asList(
                "Rat", "Manx", "Cymric",  "Mutt",  "Pug", "Cymric", "Pug",
                "Manx", "Cymric", "Rat", "EgyptianMau", "Hamster"
        );
        return new LinkedList<>(pets);
    }
}
