package org.example;

public class Leaf {
    private int i;

    public int getI() {
        return i;
    }

    public void setI(int i) {
        this.i = i;
    }

    public Leaf increment() {
        setI(getI() + 1);
        return this;
    }
}
