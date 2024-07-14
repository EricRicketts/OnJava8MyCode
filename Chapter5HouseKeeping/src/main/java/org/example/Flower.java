package org.example;

public class Flower {
    private int petalCount;
    private String comment;

    public int getPetalCount() {
        return petalCount;
    }

    public void setPetalCount(int petalCount) {
        this.petalCount = petalCount;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    public Flower(int petalCount) {
        this.petalCount = petalCount;
    }

    public Flower(String comment) {
        this.comment = comment;
    }

    public Flower(String comment, int petalCount) {
        // two element constructor calls single element constructor with the petalCount
        // and then sets the comment field
        this(petalCount);
        this.comment = comment;
    }

    public Flower() {
        // no argument constructor calls two argument constructor with predetermined arguments
        this("initial comment", 47);
    }

    @Override
    public String toString() {
        return "Flower{" +
                "petalCount=" + petalCount +
                ", comment='" + comment + '\'' +
                '}';
    }
}
