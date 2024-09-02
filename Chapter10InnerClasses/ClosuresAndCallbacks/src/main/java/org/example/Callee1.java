package org.example;

public class Callee1 implements Incrementable {
    private int i = 0;

    public int getI() {
        return i;
    }

    public void setI(int i) {
        this.i = i;
    }

    @Override
    public String increment() {
        this.setI(this.getI() + 1);
        return String.valueOf(this.getI());
    }
}
/*
    We see that this is a very simple, i.e., to fully define
    this increment() method from interface "Incrementable".
*/
