package org.example;

public class RandomShapes {
    public Shape get(int shapeNumber) {
        return switch (shapeNumber) {
            case 0 -> new Circle();
            case 1 -> new Square();
            case 2 -> new Triangle();
            default -> new Shape();
        };
    }

    public Shape[] array(int size) {
        Shape[] shapes = new Shape[size];
        for (int i = 0; i < shapes.length; i++) {
            shapes[i] = get(i);
        }
        return shapes;
    }
}
