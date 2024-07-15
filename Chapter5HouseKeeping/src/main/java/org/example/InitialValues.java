package org.example;

public class InitialValues {
    private boolean t; // false
    private char c;  // 'u0000'
    private byte b; // 0
    private short s; // 0
    private int i; // 0
    private long l; // 0
    private float f; // 0.00
    private double d; // 0.00
    private String str; // null
    private InitialValues reference; // null

    public boolean isT() {
        return t;
    }

    public void setT(boolean t) {
        this.t = t;
    }

    public char getC() {
        return c;
    }

    public void setC(char c) {
        this.c = c;
    }

    public byte getB() {
        return b;
    }

    public void setB(byte b) {
        this.b = b;
    }

    public short getS() {
        return s;
    }

    public void setS(short s) {
        this.s = s;
    }

    public int getI() {
        return i;
    }

    public void setI(int i) {
        this.i = i;
    }

    public long getL() {
        return l;
    }

    public void setL(long l) {
        this.l = l;
    }

    public float getF() {
        return f;
    }

    public void setF(float f) {
        this.f = f;
    }

    public double getD() {
        return d;
    }

    public void setD(double d) {
        this.d = d;
    }

    public String getStr() {
        return str;
    }

    public void setStr(String str) {
        this.str = str;
    }

    public InitialValues getReference() {
        return reference;
    }

    public void setReference(InitialValues reference) {
        this.reference = reference;
    }
}
