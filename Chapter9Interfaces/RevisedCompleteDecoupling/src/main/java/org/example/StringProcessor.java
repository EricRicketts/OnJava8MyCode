package org.example;

public interface StringProcessor extends Processor {
    @Override
    String process(Object input);
}
