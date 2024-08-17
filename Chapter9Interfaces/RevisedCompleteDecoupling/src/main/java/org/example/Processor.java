package org.example;

public interface Processor {
    default String name() {
        return this.getClass().getSimpleName();
    }

    public Object process(Object input);
}
