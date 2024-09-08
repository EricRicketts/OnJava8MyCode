package org.example;

public class WithInner {
    @Override
    public String toString() {
        return "WithInner{}";
    }

    public class Inner {
        @Override
        public String toString() {
            return WithInner.this + " " + "Inner{}";
        }
    }
}
