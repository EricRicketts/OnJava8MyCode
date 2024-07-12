package org.example;

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

}
