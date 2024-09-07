package org.example;


import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestGreenhouseControls {

    private GreenhouseControls greenhouseControls;
    private final String expected =
        """
        Thermostat on night setting
        Greenhouse light is on
        Greenhouse light is off
        Greenhouse water is on
        Greenhouse water is off
        Bing!!
        Thermostat on day setting
        Bing!!
        Restarting System
        Thermostat on night setting
        Greenhouse light is on
        Greenhouse light is off
        Greenhouse water is on
        Bing!!
        Greenhouse water is off
        Thermostat on day setting
        Bing!!
        Restarting System
        Thermostat on night setting
        Greenhouse light is on
        Greenhouse light is off
        Bing!!
        Greenhouse water is on
        Greenhouse water is off
        Terminating System
        """;
    private String actual;

    @BeforeEach
    public void setUp() {
        greenhouseControls = new GreenhouseControls();
        greenhouseControls.addEvent(greenhouseControls.new Bell(900));
        Event[] eventList = {
                greenhouseControls.new ThermostatNight(0),
                greenhouseControls.new LightOn(200),
                greenhouseControls.new LightOff(400),
                greenhouseControls.new WaterOn(600),
                greenhouseControls.new WaterOff(800),
                greenhouseControls.new ThermostatDay(1400)
        };
        greenhouseControls.addEvent(greenhouseControls.new Restart(2000, eventList));
        greenhouseControls.addEvent(greenhouseControls.new Terminate(5000));
        actual = greenhouseControls.run();
    }

    @Test
    public void testOutputAndStoredResults() {
        assertEquals(actual, greenhouseControls.getRecordedControllerActions());
    }

    @Test
    public void testStoredGreenhouseControls() {
        String actualStored = greenhouseControls.getRecordedControllerActions();
        String[] expectedArray = new String[]{expected, expected};
        String[] actualArray = new String[]{actual, actualStored};
        assertArrayEquals(expectedArray, actualArray);
    }
}
/*
    I feel in this case essential to understand the output captured by the expected string.
    Understand the time delays shown take effect after an original start time or after a restart.
    The other thing to keep in mind is whenever the bell is invoked it adds itself back into the
    event process by its action() method.  So this first bell is added as the first event, then when
    its action() method is called it adds another bell at an interval of 900.  When restarting the
    original event list is cycled through from the beginning.

    0: Thermostat night
    200: light on
    400: light off
    600: water on
    800: water off
    900: Bell
    1400: Thermostat day
    1800: Bell
    2000: Restart
    2000: Thermostat night
    2200: light on
    2400: light off
    2600: water on
    2700: Bell
    2800: water off
    3400: Thermostat day
    3600: Bell
    4000: Restart
    4000: Thermostat night
    4200: light on
    4400: light off
    4500: Bell
    4600: water on
    4800: water off
    5000: Terminate
*/
