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
    public static String isVowelOrConsonant(String letter) {
        switch(letter) {
            case "a": case "A": case "e": case "E": case "i": case "I":
            case "o": case "O": case "u": case"U": {
                return letter + " is a vowel";
            }
            case "y": case "Y": {
                return letter + " is a sometimes a vowel";
            }
            case "b": case "B": case "c": case "C": case "d": case "D":
            case "f": case "F": case "g": case "G": case "h": case "H":
            case "j": case "J": case "k": case "K": case "l": case "L":
            case "m": case "M": case "n": case "N": case "p": case "P":
            case "q": case "Q": case "r": case "R": case "s": case "S":
            case "t": case "T": case "v": case "V": case "w": case "W":
            case "x": case "X": case "z": case "Z": {
                return letter + " is a consonant";
            }
            default:
                return letter + " is not a letter";
        }
    }
}
