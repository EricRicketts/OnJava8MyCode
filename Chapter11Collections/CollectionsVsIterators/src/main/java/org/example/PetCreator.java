package org.example;

import java.util.ArrayList;
import java.util.List;

public class PetCreator {

    List<Pet> pets = new ArrayList<>();

    public PetCreator() {
        pets.add(new Cymric("Pet Chelsea"));
        pets.add(new Hamster("Pet Holden"));
        pets.add(new Labrador("Pet Leon"));
        pets.add(new Manx("Pet Mike"));
        pets.add(new Mouse("Pet Mitch"));
        pets.add(new Mutt("Pet Moses"));
        pets.add(new Pug("Pet Peter"));
        pets.add(new Rat("Pet Ron"));
        pets.add(new Siamese("Pet Steve"));
    }

    List<Pet> list(int numberOfPets) { return pets.subList(0, numberOfPets); }

    List<Pet> list() {
        int numberOfPets = pets.size();
        return list(numberOfPets);
    }
}
