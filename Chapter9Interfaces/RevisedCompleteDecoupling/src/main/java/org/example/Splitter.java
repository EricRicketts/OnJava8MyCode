package org.example;

import java.util.Arrays;

public class Splitter implements StringProcessor {
    @Override
    public String process(Object input) {
        return Arrays.toString(((String)input).split(" "));
    }
}
