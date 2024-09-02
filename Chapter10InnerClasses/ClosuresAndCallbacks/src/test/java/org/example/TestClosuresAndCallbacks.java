package org.example;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestClosuresAndCallbacks {

    private Callee1 callee1;
    private Callee2 callee2;
    int[] expectedValues, actualValues;
    String expectedString, actualString;

    @BeforeEach
    public void setup() {
        callee1 = new Callee1();
        callee2 = new Callee2();
    }

    @Test
    public void testCallee1GetAndSetI() {
        expectedValues = new int[]{0, 1};
        actualValues = new int[2];
        actualValues[0] = callee1.getI();
        callee1.setI(1);
        actualValues[1] = callee1.getI();

        assertArrayEquals(expectedValues, actualValues);
    }

    @Test
    public void testCallee2GetAndSetI() {
        expectedValues = new int[]{0, 1};
        actualValues = new int[2];
        actualValues[0] = callee2.getI();
        callee2.setI(1);
        actualValues[1] = callee2.getI();

        assertArrayEquals(expectedValues, actualValues);
    }

    @Test
    public void testMyIncrementStaticF() {
        callee2.setI(0);
        expectedString = "MyIncrement.this.increment() i = 1";
        actualString = MyIncrement.f(callee2);

        assertEquals(expectedString, actualString);
    }
}
