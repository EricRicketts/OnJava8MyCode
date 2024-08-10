package org.example;

public class Brass extends Wind {
    @Override
    public String play(Note n) {
        return "Brass.play() " + n.toString();
    }

    @Override
    public String what() {
        return "Brass";
    }

    @Override
    public String adjust() {
        return "Adjusting Brass";
    }
}
