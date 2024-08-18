package org.example;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestReducedHero {

    private ReducedHero reducedHero;
    private String expected, actual;

    @BeforeEach
    public void setUp() {
        reducedHero = new ReducedHero();
    }

    @Test
    public void testReducedHeroCanFly() {
        expected = "ReducedHero.fly() ReducedHero can fly";
        actual = reducedHero.fly();
        assertEquals(expected, actual);
    }

    @Test
    public void testReducedHeroCanSwim() {
        expected = "ReducedHero.swim() ReducedHero can swim";
        actual = reducedHero.swim();
        assertEquals(expected, actual);
    }

    @Test
    public void testReducedHeroCanFight() {
        expected = "ActionCharacter.fight() ActionCharacter can fight";
        actual = reducedHero.fight();
        assertEquals(expected, actual);
    }
}
