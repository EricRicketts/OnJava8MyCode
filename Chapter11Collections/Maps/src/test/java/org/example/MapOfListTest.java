package org.example;


import org.junit.jupiter.api.BeforeEach;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MapOfListTest {
    private final Map<Person, List< ? extends Pet>> petPeople = new HashMap<>();

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
}
