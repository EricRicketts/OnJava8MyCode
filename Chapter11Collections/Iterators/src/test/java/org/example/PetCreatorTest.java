package org.example;


import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class PetCreatorTest {
    private List<String> petCreator;
    private String[] expectedValues;

    @BeforeEach
    public void setUp() {
        petCreator = PetCreator.returnPetCreator();
        expectedValues = new String[]{
                "Rat", "Manx", "Cymric",  "Mutt",  "Pug", "Cymric", "Pug",
                "Manx", "Cymric", "Rat", "EgyptianMau", "Hamster"
        };
    }

    @Test
    public void testIterateOverListUsingWhileLoop() {
        Iterator<String> it = petCreator.iterator();
        int index = 0;
        while(it.hasNext()) {
            String actualValue = it.next();
            String expectedValue = expectedValues[index];
            assertEquals(expectedValue, actualValue);
            index += 1;
        }
    }

    @Test
    public void testIterateOverListUsingForLoop() {
        // simpler approach no iterator needed
        int index = 0;
        for(String pet : petCreator) {
            assertEquals(expectedValues[index], pet);
            index += 1;
        }
    }

    @Test
    public void testRemoveFromIterator() {
        String exceptions = "";
        Iterator<String> it = petCreator.iterator();
        for(int index = 0; index < 6; index++) {
            it.next();
            try {
               it.remove();
            } catch(Exception e) {
                exceptions = exceptions.concat(e.getMessage());
            }
        }
        expectedValues = new String[]{
                "Pug", "Manx", "Cymric", "Rat", "EgyptianMau", "Hamster"
        };
        List<String> mutableList = new ArrayList<>();
        it.forEachRemaining(mutableList::add);
        String[] actualValues = mutableList.toArray(new String[0]);
        assertArrayEquals(expectedValues, actualValues);
    }
}
