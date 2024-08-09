package org.example;


import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class TestShapes {

    RandomShapes randomShapes;

    @BeforeEach
    void setUp() {
        randomShapes = new RandomShapes();
    }

    @Test
    public void testAllShapes() {
        String[] actual = new String[4];
        String[] expected = new String[]{
            "Circle.draw()", "Square.draw()", "Triangle.draw()", "Shape.draw()"
        };
        Shape[] shapes = randomShapes.array(4);
        for (int i = 0; i < shapes.length; i++) {
            actual[i] = shapes[i].draw();
        }
        assertArrayEquals(expected, actual);
    }
}
/*
    This test file demonstrate polymorphism.  This is a very important concept to understand.  Note in line 24 I declare an array of Shapes.
    In line 26 I call the "draw()" method on the Shape object.  But if that Shape instance is one of the array of Shape instances, how does
    Java know how to call the correct "draw()" method.  We can see from the expected array that the subclasses have been appropriately
    identified and called during the assignment "actual[i] = shapes[i].draw()".  Delving deeper when i = 0 we had actual[0] = shapes[0].draw()
    and we see from the expected results that the method "draw()" was called from a Circle object.  Java knew to do this by what is called
    "dynamic binding" or "runtime binding".  From the book, "“When a language implements late binding, there must be some mechanism to
    determine the type of the object at runtime and to call the appropriate method. That is, the compiler still doesn’t know the object type,
    but the method-call mechanism finds out and calls the correct method body.”
*/
