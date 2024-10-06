package org.example;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class StrategizeTest {
    private String expected, actual;
    private Strategy strategy;
    private Strategy[] strategies = new Strategy[] {
            new Strategy() {
                @Override
                public String approach(String msg) {
                    return msg.toUpperCase() + "!";
                }
            },
            msg -> msg.substring(0, 5),
            Unrelated::twice
    };

    @Test
    public void testSingleStrategy() {
        Strategize s = new Strategize("Hello there");
        expected = "hello there?"; // initial implementation from Soft class is to lower case and append a "?"
        actual = s.communicate();
        assertEquals(expected, actual);
    }

    @Test
    public void testMultipleStrategies() {
        int index = 0;
        String[] expectedStrategyResults = new String[]{
                "HELLO THERE!", "Hello", "Hello there Hello there"
        };
        Strategize strategize = new Strategize("Hello there");
        for (Strategy newStrategy : strategies) {
            strategize.changeStrategy(newStrategy);
            actual = strategize.communicate();
            expected = expectedStrategyResults[index];
            assertEquals(expected, actual);
            index += 1;
        }
    }
}
/*
    In the past before Lambda Expressions, how would one structure Java so that a method behaves differently from one
    call to the next?  One can create an object of the desired behavior inside a method then pass the object to the
    method that we want to control.

    In this case, the Strategy class provides the desired functionality in its approach() method.  By creating different
    Strategy objects you can create different Strategy behavior.  This is what we have done above.
*/
