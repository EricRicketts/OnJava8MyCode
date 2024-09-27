package org.example;

import java.util.ArrayList;
import java.util.List;

public class PersonCreator {

    List<Person> people = new ArrayList<>();

    public PersonCreator() {
        people.add(new Person("Person Chelsea"));
        people.add(new Person("Person Holden"));
        people.add(new Person("Person Leon"));
        people.add(new Person("Person Mike"));
        people.add(new Person("Person Mitch"));
        people.add(new Person("Person Moses"));
        people.add(new Person("Person Peter"));
        people.add(new Person("Person Ron"));
        people.add(new Person("Person Steve"));
    }

    List<Person> list(int numberOfPeople) { return people.subList(0, numberOfPeople); }

    List<Person> list() {
        int numberOfPeople = people.size();
        return list(numberOfPeople);
    }
}
