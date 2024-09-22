package org.example;


import org.junit.jupiter.api.BeforeEach;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class CollectionsVsIteratorsTest {

    private PetCreator pets;
    private PersonCreator people;
    private Map<Person, Pet> personPetMap;

    @BeforeEach
    public void setUp() {
        pets = new PetCreator();
        people = new PersonCreator();
        personPetMap = new HashMap<>();
        for (int index = 0; index < people.list().size(); index++) {
            Person person = people.list().get(index);
            Pet pet = pets.list().get(index);
            personPetMap.put(person, pet);
        }
    }

}
