package org.example;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ParcelsTest {

    private Parcel parcel;
    private Parcel8 parcel8;
    int expectedValue, actualValue;

    @BeforeEach
    public void setUp() {
        parcel = new Parcel();
        parcel8 = new Parcel8();
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
}
