package org.example;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class TestFinalData {

    private FinalData fd1, fd2;
    private int[] expected, actual;

    @BeforeEach
    void setUp() {
        fd1 = new FinalData("fd1");
        fd2 = new FinalData("fd2");
    }

    @Test
    public void testValueOne() {
        expected = new int[]{9, 9};
        actual = new int[]{fd1.getValueOne(), fd2.getValueOne()};
        assertArrayEquals(expected, actual);
    }

    @Test
    public void testValuesTwoAndThree() {
        expected = new int[]{99, 39};
        actual = new int[]{fd1.getValueTwo(), FinalData.VALUE_THREE};
        assertArrayEquals(expected, actual);
    }

    @Test
    public void testValuesIFourAndIntFive() {
        // this test shows final values can be initialized at compile time and
        // the values can be randomly generated
        // i4 is "private final int" which means that it is constant for any
        // instance of FinalData.  However, since each instance is created by
        // different constructor calls, the values for "getValueIFour() can be
        // different for different instances.  But the value for each instance
        // will be constant.  It cannot be called by the class itself
        // because the "static" keyword is not present in the accessor list
        boolean testI4 = fd1.getValueIFour() >= 0 && fd2.getValueIFour() < 20;
        // we can access INT_5 from the class itself because it is package private
        // we would not be able to do this outside of the package, we would have
        // to define a method to call INT_5 outside the package
        boolean testIntFive = FinalData.INT_5 >= 0 && FinalData.INT_5 < 20;
        assertTrue(testI4 && testIntFive);
    }

    @Test
    public void testV1() {
        // this is normal behavior for a private variable, it can only be
        // accessed and updated through methods
        assertEquals(11, fd1.getV1().i);
        fd1.setV1(new Value(12));
        assertEquals(12, fd1.getV1().i);
    }

    @Test
    public void testV2() {
        // because v2 is private and final it can only be accessed outside the class
        // by a getter method.  In this case the value is constant across instances
        // of FinalData because it is initialized to an instance of Value with the same
        // value for the "i" field.  If we were to use a random number generator like we
        // did with i4 the values could be different between two instances.
        assertEquals(22, fd1.getV2().i);
        assertEquals(22, fd2.getV2().i);
    }

    @Test
    public void testV3() {
        // we need a getter to retrieve the value outside FinalData, within FinalData
        // the class is used to retrieve the value because it has static in the accessor list
        assertEquals(33, fd1.getVAl_3().i);
    }
}
