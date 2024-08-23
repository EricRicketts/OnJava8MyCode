package org.example;

public sealed class Level1 extends Bottom permits Level2 {

    @Override
    public String methodOne() {
        return "Level1 methodOne()";
    }

    @Override
    public String methodTwo() {
        return "Level1 methodTwo()";
    }
}
