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
