package org.example;

public class Villain {
    private String name;

    protected String getName() {
        return name;
    }

    protected void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "I am a Villain and my name is " + this.getName();
    }

    public Villain(String name) {
        this.name = name;
    }
}
