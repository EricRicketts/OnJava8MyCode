package org.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ScopingTest {

    @Test
    public void testVariablesScopedByBlock() {
        {
            int x = 10;
            {
                int y = 12;
                Assertions.assertEquals(10, x);
                Assertions.assertEquals(12, y);
                // y cannot be used in the outer scope where x is declared it must be used in the current
                // scope or an inner scope
            }
            Assertions.assertEquals(10, x); // retains value moving from inner and back to original
            // scope
            {
                x = 11; // we can reassign a variable in an inner scope
                Assertions.assertEquals(11, x);
                // we cannot do => int x = 11; a variable cannot be redeclared in an inner scope
            }
            Assertions.assertEquals(11, x); // retains value if changed at inner scope
            x = 12; // we can reassign a variable in the scope in which it was created
            Assertions.assertEquals(12, x);
        }
    }
}
