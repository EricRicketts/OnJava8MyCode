package org.example;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestActionCharacter {

    @Test
    public void testActionCharacter() {
        String expected = "ActionCharacter.fight() ActionCharacter can fight";
        String actual = new ActionCharacter().fight();
        assertEquals(expected, actual);
    }
}
