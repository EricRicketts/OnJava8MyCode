package org.example;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestParcel {

    private Parcel parcel;

    @BeforeEach
    void setUp() {
        parcel = new Parcel();
    }

    @Test
    void testParcelContents() {
        double expectedValue = 10.11;
        double actualValue;
        Contents contents = parcel.contents(10.11);
        actualValue = contents.getValue();
        assertEquals(expectedValue, actualValue);
    }

    @Test
    void testParcelDestination() {
        String expectedLabel = "New York";
        String actualLabel;
        Destination destination = parcel.destination(expectedLabel);
        actualLabel = destination.getLabel();
        assertEquals(expectedLabel, actualLabel);
    }
}
/*
    This is a very interesting features of Inner classes.  In this case, we are in essence upcasting to the
    Interfaces Contents and Destination.
*/