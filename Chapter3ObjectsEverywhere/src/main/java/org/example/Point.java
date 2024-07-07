package org.example;

public class Point {
    public static String type = "Cartesian";

    private Double x, y;

    public Double getX() {
        return x;
    }

    public void setX(Double x) {
        this.x = x;
    }

    public Double getY() {
        return y;
    }

    public void setY(Double y) {
        this.y = y;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Point point)) return false;

        if (!getX().equals(point.getX())) return false;
        return getY().equals(point.getY());
    }

    @Override
    public int hashCode() {
        int result = getX().hashCode();
        result = 31 * result + getY().hashCode();
        return result;
    }

    public Point(Double x, Double y) {
        this.x = x;
        this.y = y;
    }
}
