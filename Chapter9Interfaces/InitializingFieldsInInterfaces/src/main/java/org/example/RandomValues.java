package org.example;

import java.util.Random;

public interface RandomValues {
    Random RAND = new Random(47);
    int RANDOM_INT = RAND.nextInt(10);
    long  CHOSEN_LONG_VALUE = 123_456_789;
    float RANDOM_FLOAT = RAND.nextFloat() * 10;
    double CHOSEN_DOUBLE_VALUE = 123_456.789;

    public long getChosenLongValue();

    public double getChosenDoubleValue();
}
/*
    this is an anti-pattern when it comes to defining a set of constants to be used in a global fashion.
    Most importantly, an Interface is meant as a contract for defining behavior, with the code above no
    behavioral contract is defined.  Another argument is namespace pollution, this interface name will
    be in any class that implements our interface and in any of its sub-classes.
*/
