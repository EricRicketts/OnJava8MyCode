package org.example;

public class DataOnly {
    private static int staticI = 5;
    private int i;
    private double d;
    private boolean b;

    public double getD() {
        return d;
    }

    public void setD(double d) {
        this.d = d;
    }

    public boolean isB() {
        return b;
    }

    public void setB(boolean b) {
        this.b = b;
    }

    public static int getStaticI() {
        return staticI;
    }

    public static void setStaticI(int staticI) {
        DataOnly.staticI = staticI;
    }

    public int getI() {
        return i;
    }

    public void setI(int i) {
        this.i = i;
    }

    public void addToI(int adder) {
        this.setI(this.getI() + adder);
    }

    public void addToD(double adder) {
        this.setD(this.getD() + adder);
    }

    public DataOnly(int i, double d, boolean b) {
        this.i = i;
        this.d = d;
        this.b = b;
    }
    // no need for equals and hashCode in this class as the tests will only be
    // comparing primitives
}
