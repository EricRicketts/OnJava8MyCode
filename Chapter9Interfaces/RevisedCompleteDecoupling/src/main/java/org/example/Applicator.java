package org.example;

public class Applicator {
    public static String apply(Processor p, Object s) {
        return "Using Processor " + p.name() + " " + p.process(s) + "\n";
    }
}
