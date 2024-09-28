package org.example;

import java.util.Objects;

public class Pet {
    private String name;

    public String getName() { return name; };

    @Override
    public boolean equals(Object obj) {
        if (obj == null || getClass() != obj.getClass()) return false;
        Pet other = (Pet) obj;
        return this.getName().equals(other.getName());
    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }

    public Pet(String name) {
        this.name = name;
    }
}
