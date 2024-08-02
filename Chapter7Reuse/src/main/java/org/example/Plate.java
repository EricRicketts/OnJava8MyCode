package org.example;

public abstract class Plate {
    private final Size size;
    private final Occasion occasion;

    public Plate(Size size, Occasion occasion) {
        this.size = size;
        this.occasion = occasion;
    }

    public Plate() {
        this.size = Size.MEDIUM;
        this.occasion = Occasion.ORDINARY;
    }

    public Size getSize() {
        return size;
    }

    public Occasion getOccasion() {
        return occasion;
    }

    @Override
    public final boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Plate plate)) return false;

        return getSize() == plate.getSize() && getOccasion() == plate.getOccasion();
    }

    @Override
    public int hashCode() {
        int result = getSize().hashCode();
        result = 31 * result + getOccasion().hashCode();
        return result;
    }

    @Override
    public String toString() {
        return "Plate{" +
                "size = " + size +
                ", occasion = " + occasion +
                '}';
    }
}
