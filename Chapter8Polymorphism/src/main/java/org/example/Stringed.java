package org.example;

public class Stringed extends Instrument {
    @Override
    public String play(Note n) {
        return "Stringed.play() " + n.toString();
    }

    @Override
    public String what() {
        return "Stringed";
    }

    @Override
    public String adjust() {
        return "Adjusting Stringed";
    }
}
