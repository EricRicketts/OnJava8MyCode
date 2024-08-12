package org.example;

public class Music {
    static String tune(Instrument instrument) {
        return instrument.play(Note.MIDDLE_C) + " " + instrument.play(Note.B_FLAT) + " " +
                instrument.play(Note.D_SHARP) + "\n";
    }

    static String tuneAll(Instrument[] instruments) {
        String tuningResult = "";
        for(Instrument instrument : instruments) {
            tuningResult = tuningResult.concat(tune(instrument));
        }
        return tuningResult;
    }
}
