package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class FlowerTest {

    @Test
    public void testFlower(){
        Flower flower = new Flower();
        String expected = "Flower{petalCount=47, comment='initial comment'}";
        String actual = flower.toString();
        assertEquals(expected, actual);
    }
}
