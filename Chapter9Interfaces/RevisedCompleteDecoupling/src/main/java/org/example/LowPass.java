package org.example;

public class LowPass extends Filter {
    private double cutoff;

    public double getCutoff() {
        return cutoff;
    }

    public void setCutoff(double cutoff) {
        this.cutoff = cutoff;
    }

    @Override
    public Waveform process(Waveform waveform) {
        return super.process(waveform);
    }

    public LowPass(double cutoff) {this.cutoff = cutoff;}
}