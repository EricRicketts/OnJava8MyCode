package org.example;

public class RandomValuesClass implements RandomValues {
    @Override
    public long getChosenLongValue() {
        return CHOSEN_LONG_VALUE;
    }

    @Override
    public double getChosenDoubleValue() {
        return CHOSEN_DOUBLE_VALUE;
    }
}
