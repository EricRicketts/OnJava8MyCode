package org.example;

public class LambdaExpressions {

    static Body body = h -> h + " No Parens!";

    static Body bodyTwo = (h) -> h + " More Details!";

    static Description description = () -> "Short Information";

    static Multi multi = (h, n) -> h + " " + n;

    static Description descriptionTwo = () -> {
        String first = "moreLines() method";
        String second = "from Description class";
        return first + " " + second;
    };
}
