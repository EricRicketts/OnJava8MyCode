package org.example;

public interface Selector {
    boolean end();
    String current();
    void next();
}
/*
    Remember in Java all Interface methods are implicitly public, so there is no need to declare the
    access modifier for Interface methods.
*/
