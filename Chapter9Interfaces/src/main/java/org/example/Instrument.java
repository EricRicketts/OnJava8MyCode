package org.example;

abstract class Instrument {
    private int i;
    public abstract String play(Note n);
    public String what() { return "Instrument"; }
    public abstract String adjust();

    public int getI() {
        return i;
    }

    public void setI(int i) {
        this.i = i;
    }
}
