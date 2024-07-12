package org.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class DataOnlyTest {

    DataOnly dataOnly;
    Object[] expected, results;

    @BeforeEach
    void setUp() {
        dataOnly = new DataOnly(10, 10.00, false);
    }

    @Test
    public void testCreateInstanceFromClass() {
        expected = new Object[]{10, 10.00, false};
        results = new Object[]{dataOnly.getI(), dataOnly.getD(), dataOnly.isB()};
        Assertions.assertArrayEquals(expected, results);
    }

    @Test
    public void testAddToI() {
        dataOnly.addToI(5);
        Assertions.assertEquals(15, dataOnly.getI());
    }

    @Test
    public void testAddToD() {
        dataOnly.addToD(5.55);
        Assertions.assertEquals(15.55, dataOnly.getD());
    }

    @Test
    public void testStaticMethodsNeedNoInstance() {
        expected = new Object[]{5, 15};
        results = new Object[]{DataOnly.getStaticI(), 0};
        DataOnly.setStaticI(15);
        results[1] = DataOnly.getStaticI();
        Assertions.assertArrayEquals(expected, results);
    }

    @Test
    public void testInstancesCanCallStaticMethods() {
        // this is not a good practice but it can be done
        DataOnly.setStaticI(10);
        Assertions.assertEquals(10, dataOnly.getStaticI());
    }
}
