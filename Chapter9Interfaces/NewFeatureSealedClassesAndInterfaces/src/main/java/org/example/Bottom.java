package org.example;

public sealed class Bottom permits Level1 {

    public String methodOne() {
        return "Bottom methodOne()";
    }

    public String methodTwo() {
        return "Bottom methodTwo()";
    }
}
