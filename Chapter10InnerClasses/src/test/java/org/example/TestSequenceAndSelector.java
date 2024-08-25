package org.example;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestSequenceAndSelector {
    private Sequence sequence;
    private Selector selector;
    private int sequenceSize;
    private final String[] expectedSequence = {"0", "1", "2", "3", "4", "5", "6", "7", "8", "9"};

    @BeforeEach
    void setUp() {
        sequenceSize = 10;
        sequence = new Sequence(sequenceSize);
        for(int i = 0; i < sequenceSize; i++) sequence.add(Integer.toString(i));
        selector = sequence.selector();
    }

    @Test
    public void testSequenceSize() {
        int actualSize = sequence.getItems().length;
        assertEquals(sequenceSize, actualSize);
    }

    @Test
    public void testSequenceContent() {
        String[] actualSequence = sequence.getItems();
        assertArrayEquals(expectedSequence, actualSequence);
    }

    @Test
    public void testSelector() {
        int j = 0;
        while(!selector.end()) {
            String expected = expectedSequence[j];
            String actual = selector.current();
            assertEquals(expected, actual);
            selector.next();
            j = j + 1;
        }
    }
}
