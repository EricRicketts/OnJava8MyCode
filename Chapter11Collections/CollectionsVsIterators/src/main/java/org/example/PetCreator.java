package org.example;

import java.util.ArrayList;
import java.util.List;

public class PetCreator {

    List<Pet> pets = new ArrayList<>();

    public PetCreator() {
        pets.add(new Cymric("Pet Abby"));
        pets.add(new Hamster("Pet Bill"));
        pets.add(new Labrador("Pet Charlie"));
        pets.add(new Manx("Pet Doug"));
        pets.add(new Mouse("Pet Erin"));
        pets.add(new Mutt("Pet Frank"));
        pets.add(new Pug("Pet Guy"));
        pets.add(new Rat("Pet Holly"));
        pets.add(new Siamese("Pet Inca"));
    }

    List<Pet> list(int numberOfPets) { return pets.subList(0, numberOfPets); }

    List<Pet> list() {
        int numberOfPets = pets.size();
        return list(numberOfPets);
    }
}
