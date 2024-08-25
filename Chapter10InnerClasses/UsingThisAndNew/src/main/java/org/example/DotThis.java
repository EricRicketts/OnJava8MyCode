package org.example;

public class DotThis {
    public String f() { return "DotThis.f()"; }
    public class Inner {
        public DotThis outerObject() {
            return DotThis.this;
        }
        public Inner innerObject() { return this; }
        public String g() { return "Inner.g()"; }
    }
    public Inner inner() { return new Inner(); }
}