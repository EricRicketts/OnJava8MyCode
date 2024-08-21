package org.example;

public interface JDK9 {
    private String fd() {
        return "JDK9::fd()";
    }

    private String fs() {
        return "JDK9::fs()";
    }

    default String f() { return fd(); }

    default String g() { return fs(); }
}
