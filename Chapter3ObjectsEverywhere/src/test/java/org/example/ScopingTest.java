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
            }
            Assertions.assertEquals(10, x); // retains value moving from inner and back to original
            // scope
            {
                x = 11;
                Assertions.assertEquals(11, x);
            }
            Assertions.assertEquals(11, x); // retains value if changed at inner scope
        }
    }
}
