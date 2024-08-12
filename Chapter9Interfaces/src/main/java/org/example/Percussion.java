package org.example;

public class Percussion extends Instrument {
    @Override
    public String play(Note n) {
        return "Percussion.play() " + n.toString();
    }

    @Override
    public String what() { return "Percussion"; }

    @Override
    public String adjust() {
        return "Adjusting Percussion";
    }
}
