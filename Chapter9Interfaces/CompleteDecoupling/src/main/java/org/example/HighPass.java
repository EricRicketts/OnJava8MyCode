package org.example;

public class HighPass extends Filter {
    private double cutoff;

    @Override
    public Waveform process(Waveform wf) { return wf; }

    public double getCutoff() {
        return cutoff;
    }

    public void setCutoff(double cutoff) {
        this.cutoff = cutoff;
    }

    public HighPass(double cutoff) {
        this.cutoff = cutoff;
    }
}
