package org.example;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ParcelsTest {

    private Parcel parcel;
    private Parcel8 parcel8;
    private Parcel10 parcel10;
    int expectedValue, actualValue;

    @BeforeEach
    public void setUp() {
        parcel = new Parcel();
        parcel8 = new Parcel8();
        parcel10 = new Parcel10();
    }

    @Test
    public void testParcelGetValue() {
        expectedValue = 11;
        Contents contents = parcel.contents();
        actualValue = contents.getValue();
        assertEquals(expectedValue, actualValue);
    }

    @Test
    public void testParcelTraditionalInnerClass() {
        expectedValue = 11;
        Contents contents = parcel.moreContents();
        actualValue = contents.getValue();
        assertEquals(expectedValue, actualValue);
    }

    @Test
    public void testParcel8() {
        expectedValue = 55;
        Parcel8.Wrapping wrapping = parcel8.wrapping(11);
        actualValue = wrapping.getI();
        assertEquals(expectedValue, actualValue);
    }

    @Test
    public void testParcel10() {
        String expectedValue = "Arlington";
        Destination d = parcel10.destination("Arlington", 55.55F);
        String actualValue = d.getLabel();
        assertEquals(expectedValue, actualValue);
    }
}
