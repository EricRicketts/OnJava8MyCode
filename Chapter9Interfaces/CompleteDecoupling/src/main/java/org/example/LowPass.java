package org.example;

public class LowPass extends Filter {
    private double cutoff;

    @Override
    public Waveform process(Waveform wf) { return wf; }

    public double getCutoff() {
        return cutoff;
    }

    public void setCutoff(double cutoff) {
        this.cutoff = cutoff;
    }

    public LowPass(double cutoff) {
        this.cutoff = cutoff;
    }
}
