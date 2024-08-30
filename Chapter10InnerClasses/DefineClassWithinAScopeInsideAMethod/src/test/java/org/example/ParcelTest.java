package org.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class ParcelTest {

    @Test
    public void testClassDefinedInAMethodScope() {
        Parcel parcel = new Parcel();
        String expected = "trackingSlip";
        String actual = parcel.internalTracking(true);
        assertEquals(expected, actual);
    }
}