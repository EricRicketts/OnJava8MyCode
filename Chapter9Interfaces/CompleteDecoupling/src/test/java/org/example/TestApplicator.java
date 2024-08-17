package org.example;


import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestApplicator {
    private final static String s = "We are such stuff as dreams are made on.";
    private String expected, actual;

    @Test
    public void testUpcase() {
        expected = "Using Processor Upcase WE ARE SUCH STUFF AS DREAMS ARE MADE ON." + "\n";
        actual = Applicator.apply(new Upcase(), s);
        assertEquals(expected, actual);
    }

    @Test
    public void testDowncase() {
        expected = "Using Processor Downcase we are such stuff as dreams are made on." + "\n";
        actual = Applicator.apply(new Downcase(), s);
        assertEquals(expected, actual);
    }

    @Test
    public void testSplitter() {
        expected = "Using Processor Splitter [We, are, such, stuff, as, dreams, are, made, on.]" + "\n";
        actual = Applicator.apply(new Splitter(), s);
        assertEquals(expected, actual);
    }
}