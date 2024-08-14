package org.example;

public class OneTwoAndThree implements One, Two, Three {
    @Override
    public String first() { return "OneTwoAndThree implementation of One interface, first method"; }

    @Override
    public String third() { return "OneTwoAndThree implementation of Three interface, third method"; }
}
