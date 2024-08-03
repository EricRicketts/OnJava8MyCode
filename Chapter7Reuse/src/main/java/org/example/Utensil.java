package org.example;

public abstract class Utensil {

    private final Size size;
    private final Occasion occasion;

    public Size getSize() {
        return size;
    }

    public Occasion getOccasion() {
        return occasion;
    }

    @Override
    public final boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Utensil utensil)) return false;

        return getSize() == utensil.getSize() && getOccasion() == utensil.getOccasion();
    }

    @Override
    public int hashCode() {
        int result = getSize().hashCode();
        result = 31 * result + getOccasion().hashCode();
        return result;
    }

    @Override
    public String toString() {
        return "Utensil{" +
                "size = " + size +
                ", occasion = " + occasion +
                '}';
    }

    public Utensil(Size size, Occasion occasion) {
        this.size = size;
        this.occasion = occasion;
    }

    public Utensil() {
        this.size = Size.MEDIUM;
        this.occasion = Occasion.ORDINARY;
    }
}
