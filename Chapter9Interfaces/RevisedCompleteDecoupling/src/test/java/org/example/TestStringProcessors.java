package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestStringProcessors {

    private String expected, actual;
    private final String S = "If she weighs the same as a Duck, she's made of wood.";

    @Test
    public void testUpCase() {
        expected = "Using Processor Upcase IF SHE WEIGHS THE SAME AS A DUCK, SHE'S MADE OF WOOD." + "\n";
        actual = Applicator.apply(new Upcase(), S);
        assertEquals(expected, actual);
    }

    @Test
    public void testDownCase() {
        expected = "Using Processor Downcase if she weighs the same as a duck, she's made of wood." + "\n";
        actual = Applicator.apply(new Downcase(), S);
        assertEquals(expected, actual);
    }

    @Test
    public void testSplitter() {
        expected = "Using Processor Splitter [If, she, weighs, the, same, as, a, Duck,, she's, made, of, wood.]" + "\n";
        actual = Applicator.apply(new Splitter(), S);
        assertEquals(expected, actual);
    }
}
