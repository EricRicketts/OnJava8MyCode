package org.example;

import javax.swing.*;
import java.io.Serializable;

public class ReducedHero extends ActionCharacter implements CanSwim, CanFly {

    @Override
    public String fly() {
        return "ReducedHero.fly() ReducedHero can fly";
    }

    @Override
    public String swim() {
        return "ReducedHero.swim() ReducedHero can swim";
    }
}
