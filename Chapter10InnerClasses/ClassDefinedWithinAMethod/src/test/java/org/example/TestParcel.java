package org.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestParcel {

    @Test
    public void testClassDefinedWithinMethod() {
        Parcel parcel = new Parcel();
        String expected = "Dallas";
        Destination d = parcel.destination("Dallas");
        String actual = d.getLabel();
        assertEquals(expected, actual);
    }
}
