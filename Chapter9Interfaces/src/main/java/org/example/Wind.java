package org.example;

public class Wind extends Instrument {
    @Override
    public String play(Note n) {
        return "Wind.play() " + n.toString();
    }

    @Override
    public String what() { return "Wind"; }

    @Override
    public String adjust() {
        return "Adjusting Wind";
    }
}
