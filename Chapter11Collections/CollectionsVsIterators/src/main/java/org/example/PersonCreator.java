package org.example;

import java.util.ArrayList;
import java.util.List;

public class PersonCreator {

    List<Person> people = new ArrayList<>();

    public PersonCreator() {
        people.add(new Person("Chelsea"));
        people.add(new Person("Holden"));
        people.add(new Person("Leon"));
        people.add(new Person("Mike"));
        people.add(new Person("Mitch"));
        people.add(new Person("Moses"));
        people.add(new Person("Peter"));
        people.add(new Person("Ron"));
        people.add(new Person("Steve"));
    }

    List<Person> list(int numberOfPeople) { return people.subList(0, numberOfPeople); }

    List<Person> list() {
        int numberOfPeople = people.size();
        return list(numberOfPeople);
    }
}
