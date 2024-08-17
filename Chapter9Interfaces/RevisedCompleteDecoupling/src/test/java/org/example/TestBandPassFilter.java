package org.example;

import org.apache.commons.lang3.ArrayUtils;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class TestBandPassFilter {

    private double[] expected, actual;
    private Waveform waveform;
    private BandPass bandPass;

    @BeforeEach
    public void setUp() {
        waveform = new Waveform();
        bandPass = new BandPass(5.25, 25.25);
    }

    @Test
    @Order(1)
    public void testBandPassApplicatorApply() {
        String[] expectedStrings = new String[]{
            "Using Processor BandPass Waveform [id = 0]" + "\n",
            "Using Processor BandPass Waveform [id = 1]" + "\n",
            "Using Processor BandPass Waveform [id = 2]" + "\n",
            "Using Processor BandPass Waveform [id = 3]" + "\n"
        };
        String actualString = Applicator.apply(new FilterAdapter(new BandPass(5.25, 25.25)), waveform);
        assertTrue(ArrayUtils.contains(expectedStrings, actualString));
    }

    @Test
    @Order(2)
    public void testGetBandPassCutOffs() {
        expected = new double[]{5.25, 25.25};
        actual = new double[]{bandPass.getLowCutoff(), bandPass.getHighCutoff()};
        assertArrayEquals(expected, actual);
    }

    @Test
    @Order(3)
    public void testSetBandPassCutOffs() {
        expected = new double[]{3.33, 33.33};
        bandPass.setLowCutoff(3.33);
        bandPass.setHighCutoff(33.33);
        actual = new double[]{bandPass.getLowCutoff(), bandPass.getHighCutoff()};
        assertArrayEquals(expected, actual);
    }
}
