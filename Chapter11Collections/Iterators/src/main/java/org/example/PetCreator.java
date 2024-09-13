package org.example;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class PetCreator {

    public static List<String> returnPetCreator() {
        List<String> pets = Arrays.asList(
            "Rat", "Manx", "Cymric",  "Mutt",  "Pug", "Cymric", "Pug",
            "Manx", "Cymric", "Rat", "EgyptianMau", "Hamster"
        );
        return pets;
    }
}
