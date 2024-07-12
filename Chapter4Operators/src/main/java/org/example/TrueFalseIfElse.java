package org.example;

public class TrueFalseIfElse {
    public static boolean returnTrueOrFalse(int b) {
        int a = 0;
        return a == b;
    }

    public static String IfElse(int b) {
        int a = 0;
        if (b < a) {
            return "b is less than zero";
        } else if (b > a) {
            return "b is greater than zero";
        } else {
            return "b is equal to zero";
        }
    }
}
