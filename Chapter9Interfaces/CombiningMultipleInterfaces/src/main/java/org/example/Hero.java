package org.example;

public class Hero extends ActionCharacter implements CanFight, CanSwim, CanFly {

    @Override
    public String fight() {
        return "Hero.fight() Hero can fight";
    }

    @Override
    public String fly() {
        return "Hero.fly() Hero can fly";
    }

    @Override
    public String swim() {
        return "Hero.swim() Hero can swim";
    }
}
