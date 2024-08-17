package org.example;

import org.apache.commons.lang3.ArrayUtils;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class TestHighPassFilter {

    private double expected, actual;
    private Waveform waveform;
    private HighPass highPass;

    @BeforeEach
    public void setUp() {
        waveform = new Waveform();
        highPass = new HighPass(5.25);
    }

    @Test
    @Order(1)
    public void testHighPassApplicatorApply() {
        String[] expectedStrings = new String[]{
            "Using Processor HighPass Waveform [id = 0]" + "\n",
            "Using Processor HighPass Waveform [id = 1]" + "\n",
            "Using Processor HighPass Waveform [id = 2]" + "\n",
            "Using Processor HighPass Waveform [id = 3]" + "\n"
        };
        String actualString = Applicator.apply(new FilterAdapter(new HighPass(5.25)), waveform);
        assertTrue(ArrayUtils.contains(expectedStrings, actualString));
    }

    @Test
    @Order(2)
    public void testGetHighPassCutOff() {
        expected = 5.25;
        actual = highPass.getCutoff();
        assertEquals(expected, actual);
    }

    @Test
    @Order(3)
    public void testSetHighPassFilter() {
        expected = 3.33;
        highPass.setCutoff(3.33);
        actual = highPass.getCutoff();
        assertEquals(expected, actual);
    }
}
