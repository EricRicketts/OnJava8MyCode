package org.example;

public sealed class Super permits Sub1, Sub2 {

    public String methodOne() {
        return this.getClass().getSimpleName() + "." +
                new Object(){}.getClass().getEnclosingMethod().getName();
    }

    public String methodTwo() {
        return this.getClass().getSimpleName() + "." +
                new Object(){}.getClass().getEnclosingMethod().getName();
    }
}
