package org.example;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class HeroAndActionCharacterTest {
    private Hero hero;
    private ReducedHero reducedHero;
    private ActionCharacter actionCharacter;
    private String expected, actual;

    @BeforeEach
    public void setUp() {
        hero = new Hero();
        reducedHero = new ReducedHero();
        actionCharacter = new ActionCharacter();
    }

    @Test
    public void testActionCharacter() {
        expected = "Action Character fight()";
        actual = actionCharacter.fight();
        assertEquals(expected, actual);
    }

    @Test
    public void testHeroCanFight() {
        expected = "Hero.fight() Hero can fight";
        actual = hero.fight();
        assertEquals(expected, actual);
    }

    @Test
    public void testHeroCanSwim() {
        expected = "Hero.swim() Hero can swim";
        actual = hero.swim();
        assertEquals(expected, actual);
    }

    @Test
    public void testHeroCanFly() {
        expected = "Hero.fly() Hero can fly";
        actual = hero.fly();
        assertEquals(expected, actual);
    }
}
