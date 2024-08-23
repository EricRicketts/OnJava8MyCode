package org.example;

public sealed abstract class AC permits X {

    public abstract String methodOne();

    public abstract String methodTwo();
}
