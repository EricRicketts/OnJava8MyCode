package org.example;

public interface Old {
    default String fd() { return "Old::fd()"; }
    static String fs() { return "Old::fs()"; }
    default String f() { return fd(); }
    static String g() { return fs(); }
}
