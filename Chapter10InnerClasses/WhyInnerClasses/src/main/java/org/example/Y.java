package org.example;

public class Y implements A {
    @Override
    public String getNameForA() {
        return "In Class Y Implementation of A.getNameForA()";
    }
    public B makeB() {
        return new B() {
            @Override
            public String getNameForB() {
                return "In Class Y Implementation of B.getNameForB()";
            }
        };
    }
}
