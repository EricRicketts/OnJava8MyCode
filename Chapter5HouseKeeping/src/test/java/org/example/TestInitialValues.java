package org.example;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class TestInitialValues {

    private InitialValues initialValues, initialValues2;
    Object[] expected, results;

    @BeforeEach
    public void setUp() {
        initialValues  = new InitialValues();
        initialValues2 = new InitialValues();
    }

    @Test
    public void testIntegralInitialValues() {
        expected = new Object[]{(byte) 0, (short) 0, (int) 0, (long) 0};
        results = new Object[]{
                initialValues.getB(), initialValues.getS(), initialValues.getI(), initialValues.getL()
        };
        assertArrayEquals(expected, results);
    }

    @Test
    public void testFloatInitialValues() {
        expected = new Object[]{(float) 0.00, (double) 0.00};
        results = new Object[]{initialValues.getF(), initialValues.getD()};
        assertArrayEquals(expected, results);
    }

    @Test
    public void testBooleanCharStringInitialValues() {
        expected = new Object[]{false, '\u0000', null};
        results = new Object[]{initialValues.isT(), initialValues.getC(), initialValues.getStr()};
        assertArrayEquals(expected, results);
    }

    @Test
    public void testReferenceInitialValues() {
        assertNull(initialValues.getReference());
    }

    @Test
    public void testSetAndGetInitialValues() {
        initialValues2.setT(true);
        initialValues2.setC('x');
        initialValues2.setB((byte) 47);
        initialValues2.setS((short) 0xff);
        initialValues2.setI(999);
        initialValues2.setL((long) 1_234_567_890);
        initialValues2.setStr("foo");
        initialValues2.setReference(initialValues);

        expected = new Object[]{
                true, 'x', (byte) 47, (short) 0xff, (int) 999, (long) 1_234_567_890, "foo", initialValues
        };
        results = new Object[]{
                initialValues2.isT(), initialValues2.getC(), initialValues2.getB(), initialValues2.getS(),
                initialValues2.getI(), initialValues2.getL(), initialValues2.getStr(), initialValues2.getReference()
        };
        assertArrayEquals(expected, results);
    }
}
