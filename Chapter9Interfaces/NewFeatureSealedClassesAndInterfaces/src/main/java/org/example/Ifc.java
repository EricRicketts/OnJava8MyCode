package org.example;

public sealed interface Ifc permits Imp1, Imp2{

    public String methodOne();

    public String methodTwo();
}
