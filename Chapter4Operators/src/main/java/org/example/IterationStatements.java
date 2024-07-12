package org.example;

import org.apache.commons.lang3.Range;

import java.util.ArrayList;

import static org.apache.commons.lang3.Range.*;

public class IterationStatements {

    public static int sumFirstTenIntegers() {
        int sum = 0;
        int number = 0;
        while (number < 10) {
            sum += number;
            number += 1;
        }
        return sum;
    }

    public static int sumFirstTenIntegersVersionTwo() {
        int sum = 0;
        int number = 0;
        do {
            sum += number;
            number += 1;
        } while(number < 10);
        return sum;
    }

    public static int sumFirstTenIntegersVersionThree() {
        int sum = 0;
        for (int i = 0; i < 10; i++) sum += i;
        return sum;
    }

    public static int sumFirstTenIntegersUsingForIn() {
        int[] range = new int[10];
        int sum = 0;
        for (int i = 0; i < 10; i++) range[i] = i;
        for(Integer i : range) {
            sum += i;
        }
        return sum;
    }
}
