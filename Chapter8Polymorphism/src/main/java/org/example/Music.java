package org.example;

public class Music {
    public static String tune(Instrument instrument) {
        return instrument.play(Note.MIDDLE_C) + "\n"
                + instrument.play(Note.C_SHARP) + "\n"
                + instrument.play(Note.B_FLAT) + "\n";
    }

    public static String tuneAll(Instrument[] instruments) {
        String tuningResult = "";
        for(Instrument instrument : instruments) {
            tuningResult = tuningResult.concat(tune(instrument));
        }
        return tuningResult;
    }
}
