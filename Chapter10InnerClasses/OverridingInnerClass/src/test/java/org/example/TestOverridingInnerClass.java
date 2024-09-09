package org.example;


import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestOverridingInnerClass {

    private Egg egg;
    private Egg.Yolk eggYolk;
    private BigEgg.Yolk bigEggYolk;
    private String expected, actual;
    private String[] expectedStrings, actualStrings;

    @BeforeEach
    public void setUp() {
        egg = new Egg();
        eggYolk = new Egg.Yolk();
        bigEggYolk = new BigEgg.Yolk();
    }

    @Test
    public void testEggGetAndSetWhichEgg() {
        expectedStrings = new String[]{"new Egg()", "new Egg() next"};
        actualStrings = new String[2];
        actualStrings[0] = egg.getWhichEgg();
        egg.setWhichEgg("new Egg() next");
        actualStrings[1] = egg.getWhichEgg();
        assertArrayEquals(expectedStrings, actualStrings);
    }

    @Test
    public void testEggInsertYolkAndCallF() {
        expected = "Egg.Yolk.f()";
        egg.insertYolk(new Egg.Yolk());
        actual = egg.g();
        assertEquals(expected, actual);
    }

    @Test
    public void testEggGetAndSetYolk() {
        expectedStrings = new String[]{"Egg.Yolk()", "Egg.Yolk.next()"};
        actualStrings = new String[2];
        actualStrings[0] = eggYolk.getWhichYolk();
        eggYolk.setWhichYolk("Egg.Yolk.next()");
        actualStrings[1] = eggYolk.getWhichYolk();
        assertArrayEquals(expectedStrings, actualStrings);
    }

    @Test
    public void testEggYolkF() {
        expected = "Egg.Yolk.f()";
        actual = eggYolk.f();
        assertEquals(expected, actual);
    }

    @Test
    public void testBigEggGetYolk() {
        expected = "BigEgg.Yolk()";
        actual = bigEggYolk.getWhichYolk();
        assertEquals(expected, actual);
    }

    @Test
    public void testBigEggYolkF() {
        expected = "BigEgg.Yolk.f()";
        actual = bigEggYolk.f();
        assertEquals(expected, actual);
    }
}
