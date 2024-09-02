package org.example;

public class Caller {
    private Incrementable callbackReference;
    public Caller(Incrementable callbackReference) {
        this.callbackReference = callbackReference;
    }

    public String go() { return this.callbackReference.increment(); }
}
