package org.example;

public class Instrument {
    public String play(Note n) {
        return "Instrument.play() " + n.toString();
    }

    public String what() {
        return "Instrument";
    }

    public String adjust() {
        return "Adjusting Instrument";
    }
}
