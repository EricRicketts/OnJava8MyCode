package org.example;

public class Z extends D {
    @Override
    public String getNameForD() {
        return "In Class Z Extension of D.getNameForD()";
    }

    public E makeE() {
        return new E() {
            @Override
            public String getNameForE() {
                return "In Class Z Extension of E.getNameForE()";
            }
        };
    }
}
