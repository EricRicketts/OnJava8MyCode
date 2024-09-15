package org.example;

public class Rat extends Pet {

    private String name;
    private int age;

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void setName(String name) {
        super.setName(name);
    }

    @Override
    public int getAge() {
        return age;
    }

    @Override
    public void setAge(int age) {
        super.setAge(age);
    }

    public Rat(String name, int age) {
        this.name = name;
        this.age = age;
    }
}
