package org.example;

public interface Processor {
    default String name() {
        return this.getClass().getSimpleName();
    }

    Object process(Object input);
}
