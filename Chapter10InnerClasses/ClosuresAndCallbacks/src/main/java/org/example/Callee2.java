package org.example;

public class Callee2 extends MyIncrement {
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
        return super.increment() + " i = " + this.getI();
    }

    private class Closure implements Incrementable {
        @Override
        public String increment() {
            return Callee2.this.increment();
        }
    }

    public Incrementable getCallbackReference() {
        return new Closure();
    }
}
