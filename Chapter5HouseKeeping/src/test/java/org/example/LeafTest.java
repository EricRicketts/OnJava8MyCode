package org.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class LeafTest {

    @Test
    public void testLeaf() {
        // since increment() returns a Leaf instance we can chain the increment calls
        Leaf leaf = new Leaf();
        Assertions.assertEquals(3, leaf.increment().increment().increment().getI());
    }
}
