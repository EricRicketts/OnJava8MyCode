package org.example;

import org.apache.commons.lang3.ArrayUtils;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class TestLowPassFilter {

    private double expected, actual;
    private Waveform waveform;
    private LowPass lowPass;

    @BeforeEach
    public void setUp() {
        waveform = new Waveform();
        lowPass = new LowPass(25.25);
    }

    @Test
    @Order(1)
    public void testLowPassApplicatorApply() {
        String[] expectedStrings = new String[]{
            "Using Processor LowPass Waveform [id = 0]" + "\n",
            "Using Processor LowPass Waveform [id = 1]" + "\n"
        };
        String actualString = Applicator.apply(new FilterAdapter(new LowPass(25.00)), waveform);
        assertTrue(ArrayUtils.contains(expectedStrings, actualString));
    }

    @Test
    @Order(2)
    public void testGetLowPassCutOff() {
        expected = 25.25;
        actual = lowPass.getCutoff();
        assertEquals(expected, actual);
    }

    @Test
    @Order(3)
    public void testSetLowPassFilter() {
        expected = 30.33;
        lowPass.setCutoff(30.33);
        actual = lowPass.getCutoff();
        assertEquals(expected, actual);
    }
}
