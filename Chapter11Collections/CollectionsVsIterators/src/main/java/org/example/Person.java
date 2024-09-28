package org.example;

import java.util.Objects;

public class Person {
    private String name;

    public String getName() { return name; };

    @Override
    public boolean equals(Object obj) {
        if (obj == null || getClass() != obj.getClass()) return false;
        Person other = (Person) obj;
        return this.getName().equals(other.getName());
    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }

    public Person(String name) {
        this.name = name;
    }
}
