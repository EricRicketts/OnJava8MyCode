package org.example;


import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestParcel {
    Parcel parcel;
    private String expectedDestination, actualDestination;
    private double expectedValue, actualValue;

    @BeforeEach
    public void setUp() {
        parcel = new Parcel();
    }

    @Test
    public void testParcelAndDestination() {
        expectedDestination = "Borneo";
        Parcel.Destination destination = parcel.to(expectedDestination);
        actualDestination = destination.getLabel();
        assertEquals(expectedDestination, actualDestination);
    }

    @Test
    public void testParcelAndValue() {
        expectedValue = 110.55;
        Parcel.Contents contents = parcel.contents(expectedValue);
        actualValue = contents.getValue();
        assertEquals(expectedValue, actualValue);
    }

    @Test
    public void testParcelAndSetDestination() {
        expectedDestination = "Mumbai";
        Parcel.Destination destination = parcel.to(expectedDestination);
        actualDestination = destination.getLabel();
        assertEquals(expectedDestination, actualDestination);
        expectedDestination = "Borneo";
        destination.setLabel(expectedDestination);
        actualDestination = destination.getLabel();
        assertEquals(expectedDestination, actualDestination);
    }

    @Test
    public void testParcelAndSetValue() {
        expectedValue = 110.55;
        Parcel.Contents contents = parcel.contents(expectedValue);
        actualValue = contents.getValue();
        assertEquals(expectedValue, actualValue);
        expectedValue = 150.05;
        contents.setValue(expectedValue);
        actualValue = contents.getValue();
        assertEquals(expectedValue, actualValue);
    }

    @Test
    public void testShipParcel() {
        String expected = "Parcel going to Omaha has value 133.33";
        String actual = parcel.ship("Omaha", 133.33);
        assertEquals(expected, actual);
    }
}