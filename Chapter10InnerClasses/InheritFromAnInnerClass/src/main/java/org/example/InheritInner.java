package org.example;

public class InheritInner extends WithInner.Inner {
    public InheritInner(WithInner withInner) {
        withInner.super();
    }

    @Override
    public String toString() {
        return super.toString() + " InheritInner{}";
    }
}
