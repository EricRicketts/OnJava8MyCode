package org.example;

public class RecursiveFactorial {

    public int recursiveMethod(int arg, IntCall intCall) {
        if (arg <= 1) return 1;
        return arg * recursiveMethod(arg - 1, intCall);
    }
}
