package org.example;

public class Pet {
    private String name;

    abstract String getName() { return name; };

    public Pet(String name;) {
        this.name = name;
    }
}