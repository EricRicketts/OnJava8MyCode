package org.example;

public sealed class Level2 extends Level1 permits Level3 {

    @Override
    public String methodOne() {
        return "Level2 methodOne()";
    }

    @Override
    public String methodTwo() {
        return "Level2 methodTwo()";
    }
}
