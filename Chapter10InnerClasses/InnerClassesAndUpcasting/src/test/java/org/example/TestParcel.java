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
    Interfaces Contents and Destination.  Because The PContents inner class is private, its implementation
    details are completely hidden from the client programmer.  PDestination is protected so access is only
    allowed by classes in the same package and inheritors of Parcel.  A client programmer cannot downcast to a
    private inner class, such as Parcel p = new Parcel(); Parcel.PContents = p.new PContents(); because the
    inner class name cannot be accessed.  With respect to the protected inner class a client programmer can
    only downcast to PDestination if you are in inheritor of Parcel.

    One other thing about Inner Classes, as we can see from this example the access modifiers can be private
    or protected in addition to public and package access.  Normal class access is restricted to public and
    package access.
*/