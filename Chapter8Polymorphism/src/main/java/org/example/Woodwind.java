package org.example;

public class Woodwind extends Wind {
    @Override
    public String play(Note n) {
        return "Woodwind.play() " + n.toString();
    }

    @Override
    public String what() {
        return "Woodwind";
    }

    @Override
    public String adjust() {
        return "Adjusting Woodwind";
    }
}
