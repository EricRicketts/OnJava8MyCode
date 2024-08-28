package org.example;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestParcel {

    private Parcel parcel;

    @BeforeEach
    public void setUp() {
        parcel = new Parcel();
    }

    @Test
    public void testParcelContents() {
        double expectedValue = 23.45;
        double actualValue;
        Parcel.Contents contents = parcel.new Contents(expectedValue);
        actualValue = contents.getValue();
        assertEquals(expectedValue, actualValue);
    }

    @Test
    public void testParcelDestination() {
        String expectedLabel = "Tasmania";
        String actualLabel;
        Parcel.Destination destination = parcel.new Destination(expectedLabel);
        actualLabel = destination.getLabel();
        assertEquals(expectedLabel, actualLabel);
    }
}
