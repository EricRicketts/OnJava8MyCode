package org.example;


import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.OptionalDataException;
import java.util.*;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class MapOfListTest {
    private final Map<Person, List< ? extends Pet>> petPeople = new HashMap<>();
    private String expected, actual;

    @BeforeEach
    public void setUp() {
        petPeople.put(new Person("Dawn", 30),
                Arrays.asList(
                        new Cymric("Molly", 5),
                        new Mutt("Spot", 6)));
        petPeople.put(new Person("Kate", 31),
                Arrays.asList(new Cat("Shackleton", 7),
                        new Cat("Elsie May", 8), new Dog("Margrett", 9)));
        petPeople.put(new Person("Marilyn", 32),
                Arrays.asList(
                        new Pug("Louie aka Louis Snorkelstein Dupree", 3),
                        new Cat("Stanford", 4),
                        new Cat("Pinkola", 4)));
        petPeople.put(new Person("Luke", 25),
                Arrays.asList(
                        new Rat("Fuzzy", 2), new Rat("Fizzy", 6)));
        petPeople.put(new Person("Isaac", 7),
                Arrays.asList(new Rat("Freckly", 6), new Rat("Frosty", 5)));
    }

    @Test
    public void testGetAllKeys() {
        String[] expectedPeople = new String[]{"Dawn", "Isaac", "Kate", "Luke", "Marilyn"};
        List<String> names = new ArrayList<>();
        for(Person person : petPeople.keySet()) {
            names.add(person.getName());
        }
        Collections.sort(names);
        String[] actualPeople = names.toArray(new String[0]);
        assertArrayEquals(expectedPeople, actualPeople);
    }

    @Test
    public void testGetAllValues() {
        /*
            [Molly, Spot, Shackleton, Elsie May, Margrett, Freckly, Louie aka
            Louis Snorkelstein Dupree, Stanford, Pinkola, Fuzzy, Fizzy]

            Elsie May, Fizzy, Freckly, Fuzzy, Louie aka Louis Snorkelstein Dupree,
            Margrett, Molly, Shackleton, Spot, Stanford
        */
        String[] expectedPetNames = {
            "Elsie May", "Fizzy", "Freckly", "Frosty", "Fuzzy", "Louie aka Louis Snorkelstein Dupree",
            "Margrett", "Molly", "Pinkola", "Shackleton", "Spot", "Stanford"
        };
        List<String> actualPetNames = new ArrayList<>();
        int index = 0;
        // have to do embedded loop because each owner has more than one pet, so each owner has what
        // is in essence an array of pets.  So pet is actually a collection of pets
        for (List<? extends Pet> pet : petPeople.values()) {
            for (Pet ownerPet : pet) {
                actualPetNames.add(ownerPet.getName());
            }
        }
        Collections.sort(actualPetNames);
        assertArrayEquals(expectedPetNames, actualPetNames.toArray(new String[0]));
    }
}
