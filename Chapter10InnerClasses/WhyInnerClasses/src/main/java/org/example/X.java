package org.example;

public class X implements A, B {
    @Override
    public String getNameForB() {
        return "In Class X Implementation of B.getNameForB()";
    }

    @Override
    public String getNameForA() {
        return "In Class X Implementation of A.getNameForA()";
    }
}
