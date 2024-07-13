package org.example;

public class SwitchStatements {

    public static String vowelsAndConsonants(int letterValue) {
        if (letterValue > 25) {
            return "letter values must be between 0 and 25";
        }
        int c = letterValue + 'a'; // we need to provide an offset for the
        // values between 0 and 25 in this case 'a' is converted to an integer
        // the code works below because the characters 'a', 'e', etc. evaluate
        // to an integer in the body of the switch
        switch (c) {
            case 'a':
            case 'e':
            case 'i':
            case 'o':
            case 'u': {
                char letter = (char) c;
                return letter + ", " + c + ": vowel";
            }
            case 'y': {
                char letter = (char) c;
                return letter + ", " + c + ": sometimes vowel";
            }
            default: {
                char letter = (char) c;
                return letter + ", " + c + ": consonant";
            }
        }
    }
}
