package org.example;

import org.example.Parcel11.ParcelDestination;
import org.example.Parcel11.ParcelDestination.AnotherLevel;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class ParcelsTest {

    private Parcel parcel;
    private Parcel8 parcel8;
    private Parcel10 parcel10;
    int expectedValue, actualValue;
    int[] expectedValues, actualValues;
    String expectedValueString, actualValueString;

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

    @Test
    public void testContentsWithinParcel11() {
        Contents contents = Parcel11.contents();
        expectedValue = 11;
        actualValue = contents.getValue();
        assertEquals(expectedValue, actualValue);
    }

    @Test
    public void testDestinationWithinParcel11() {
        Destination destination = Parcel11.destination("Arlington");
        expectedValueString = "Arlington";
        actualValueString = destination.getLabel();
        assertEquals(expectedValueString, actualValueString);
    }

    @Test
    public void testParcel11AndParcelDestinationStaticVariableX() {
        expectedValues = new int[]{10, 20};
        actualValues = new int[2];
        actualValues[0] = Parcel11.ParcelDestination.x = 10;
        Parcel11.ParcelDestination.x = 20;
        actualValues[1] = Parcel11.ParcelDestination.x;
        assertArrayEquals(expectedValues, actualValues);
    }

    @Test
    public void testParcelDestinationStaticVariableX() {
        expectedValues = new int[]{10, 40};
        actualValues = new int[2];
        actualValues[0] = ParcelDestination.x = 10;
        ParcelDestination.x = 40;
        actualValues[1] = ParcelDestination.x;
        assertArrayEquals(expectedValues, actualValues);
    }

    @Test
    public void testParcel11StaticFunctionF() {
        expectedValueString = "f() within ParcelDestination";
        actualValueString = Parcel11.ParcelDestination.f();
        assertEquals(expectedValueString, actualValueString);
    }

    @Test
    public void testParcel11AnotherLevelStaticVariableX() {
        expectedValues = new int[]{10, 30};
        actualValues = new int[2];
        actualValues[0] = Parcel11.ParcelDestination.AnotherLevel.x = 10;
        Parcel11.ParcelDestination.AnotherLevel.x = 30;
        actualValues[1] = Parcel11.ParcelDestination.AnotherLevel.x;
        assertArrayEquals(expectedValues, actualValues);
    }

    @Test
    public void testAnotherLevelStaticVariableX() {
        expectedValues = new int[]{30, 60};
        actualValues = new int[2];
        actualValues[0] = AnotherLevel.x = 30;
        AnotherLevel.x = 60;
        actualValues[1] = AnotherLevel.x;
        assertArrayEquals(expectedValues, actualValues);
    }

    @Test
    public void testParcel11AnotherLevelStaticFunctionF() {
        expectedValueString = "f() within AnotherLevel";
        actualValueString = Parcel11.ParcelDestination.AnotherLevel.f();
        assertEquals(expectedValueString, actualValueString);
    }

    @Test
    public void testAnotherLevelStaticFunctionF() {
        expectedValueString = "f() within AnotherLevel";
        actualValueString = AnotherLevel.f();
        assertEquals(expectedValueString, actualValueString);
    }


}
