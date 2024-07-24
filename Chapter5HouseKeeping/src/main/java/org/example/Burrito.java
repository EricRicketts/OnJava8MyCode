package org.example;

public class Burrito {
    private final Spiciness degree;

    public Spiciness getDegree() {
        return degree;
    }
    /*
        Note I took this from the book because switch statements are a good use case for Enumerations.
        By using well named constants Enumerations produce a much clearer expression of intent in switch statements.
    */
    public String describe() {
        String description = "This Burrito is ";
        switch (this.getDegree()) {
            case NOT: description += "not spicy at all."; break;
            case MILD: case MEDIUM: description += "a little hot."; break;
            case HOT: case FLAMING: description += "maybe too hot."; break;
            default: description += "unknown in its spiciness."; break;
        }
        return description;
    }

    public Burrito(Spiciness degree) {
        this.degree = degree;
    }
}
