package org.example;

public class Downcase implements StringProcessor {

    @Override
    public String process(Object input) {
        return ((String)input).toLowerCase();
    }
}
