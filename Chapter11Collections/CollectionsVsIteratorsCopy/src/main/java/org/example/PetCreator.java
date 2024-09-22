package org.example;

import java.util.ArrayList;
import java.util.List;

public class PetCreator {

    List<Pet> pets = new ArrayList<>();

    public PetCreator() {
        pets.add(new Cymric("Chris"));
        pets.add(new Hamster("Holden"));
        pets.add(new Labrador("Leon"));
        pets.add(new Manx("Mike"));
        pets.add(new Mouse("Michael"));
        pets.add(new Mutt("Michelle"));
        pets.add(new Pug("Peter"));
        pets.add(new Rat("Randy"));
        pets.add(new Siamese("Sam"));
    }

    public List<Pet> list(int numberOfPets) {
        return pets.subList(0, numberOfPets);
    }
}
