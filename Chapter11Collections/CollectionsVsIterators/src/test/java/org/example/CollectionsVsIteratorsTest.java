package org.example;


import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.*;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class CollectionsVsIteratorsTest {

    public static String display(Iterator<Pet> petIterator) {
        String petIteratorString;
        List<String> petIteratorStringList = new ArrayList<>();
        while (petIterator.hasNext()) {
            Pet p = petIterator.next();
            petIteratorStringList.add("Pet has name: " + p.getName() + "\n");
        }
        Collections.sort(petIteratorStringList);
        petIteratorString = String.join("", petIteratorStringList);
        return petIteratorString;
    }

    public static String display(Collection<Pet> petCollection) {
        String petCollectionString;
        List<String> petIteratorStringList = new ArrayList<>();
        for(Pet p : petCollection) {
            petIteratorStringList.add("Pet has name: " + p.getName() + "\n");
        }
        Collections.sort(petIteratorStringList);
        petCollectionString = String.join("", petIteratorStringList);
        return petCollectionString;
    }

    private Map<Person, Pet> personPetMap;
    String expectedValue, actualValue;
    String[] expectedValues, actualValues;

    @BeforeEach
    public void setUp() {
       PetCreator pets = new PetCreator();
        PersonCreator people = new PersonCreator();
        personPetMap = new HashMap<>();
        for (int index = 0; index < people.list().size(); index++) {
            Person person = people.list().get(index);
            Pet pet = pets.list().get(index);
            personPetMap.put(person, pet);
        }
    }

    @Test
    public void testSizeOfPersonPetMapKeys() {
        assertEquals(9, personPetMap.keySet().size());
    }

    @Test
    public void testSizeOfPersonPetMapValues() {
        assertEquals(9, personPetMap.values().size());
    }

    @Test
    public void testEqualStrings() {
        /*
            I had to run this experiment to see if there was something wrong with
            IntelliJ as I could not get the two strings to equate using the display
            methods above.
        */
        actualValue = "";
        expectedValue = """
                one two
                three four
                five six
                seven eight
                nine zero
                """;
        List<String> stringList = new ArrayList<>();
        stringList.add("one two\n");
        stringList.add("three four\n");
        stringList.add("five six\n");
        stringList.add("seven eight\n");
        stringList.add("nine zero\n");

        for(String str : stringList) {
            actualValue = actualValue.concat(str);
        }
        assertEquals(expectedValue, actualValue);
    }

    @Test
    public void testDisplayWithIterator() {
        expectedValue =
                """
                        Pet has name: Pet Chelsea
                        Pet has name: Pet Holden
                        Pet has name: Pet Leon
                        Pet has name: Pet Mike
                        Pet has name: Pet Mitch
                        Pet has name: Pet Moses
                        Pet has name: Pet Peter
                        Pet has name: Pet Ron
                        Pet has name: Pet Steve
                        """;
        actualValue = display(personPetMap.values());
        assertEquals(expectedValue, actualValue);
    }
}
