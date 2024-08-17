package org.example;

public class BandPass extends Filter {
    private double lowCutoff, highCutoff;

    public double getLowCutoff() {
        return lowCutoff;
    }

    public void setLowCutoff(double lowCutoff) {
        this.lowCutoff = lowCutoff;
    }

    public double getHighCutoff() {
        return highCutoff;
    }

    public void setHighCutoff(double highCutoff) {
        this.highCutoff = highCutoff;
    }

    @Override
    public Waveform process(Waveform waveform) {
        return super.process(waveform);
    }

    public BandPass(double lowCutoff, double highCutoff) {
        this.lowCutoff = lowCutoff;
        this.highCutoff = highCutoff;
    }
}
