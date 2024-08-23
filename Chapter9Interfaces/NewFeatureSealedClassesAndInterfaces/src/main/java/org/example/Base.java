package org.example;

public sealed class Base permits D1, D2 {

    public String what() {
        return this.toString();
    }

    @Override
    public String toString() {
        return this.getClass().getSimpleName() + "{}";
    }
}