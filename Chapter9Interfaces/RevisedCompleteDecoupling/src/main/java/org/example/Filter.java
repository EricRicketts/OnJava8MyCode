package org.example;

public class Filter {
    public String name() {
        return getClass().getSimpleName();
    }

    public Waveform process(Waveform waveform) {
        return waveform;
    }
}
