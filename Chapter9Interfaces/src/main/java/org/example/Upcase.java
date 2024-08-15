package org.example;

public class Upcase implements StringProcessor {
    @Override
    public String process(Object input) {
        return ((String)input).toUpperCase();
    }
}
