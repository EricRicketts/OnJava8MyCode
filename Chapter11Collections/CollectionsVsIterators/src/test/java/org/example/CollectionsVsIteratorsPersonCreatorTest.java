package org.example;


import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.*;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class CollectionsVsIteratorsPersonCreatorTest {

    public static String display(Iterator<Person> personIterator) {
        String personIteratorString;
        List<String> personIteratorStringList = new ArrayList<>();
        while (personIterator.hasNext()) {
            Person p = personIterator.next();
            personIteratorStringList.add("Person has name: " + p.getName() + "\n");
        }
        Collections.sort(personIteratorStringList);
        personIteratorString = String.join("", personIteratorStringList);
        return personIteratorString;
    }

    public static String display(Collection<Person> personCollection) {
        String personCollectionString;
        List<String> personIteratorStringList = new ArrayList<>();
        for(Person p : personCollection) {
            personIteratorStringList.add("Person has name: " + p.getName() + "\n");
        }
        Collections.sort(personIteratorStringList);
        personCollectionString = String.join("", personIteratorStringList);
        return personCollectionString;
    }

    private Map<Person, Pet> personPetMap;
    String actualValue;
    private final String expectedValue =
            """
                        Person has name: Person Chelsea
                        Person has name: Person Holden
                        Person has name: Person Leon
                        Person has name: Person Mike
                        Person has name: Person Mitch
                        Person has name: Person Moses
                        Person has name: Person Peter
                        Person has name: Person Ron
                        Person has name: Person Steve
                        """;
    private final String expectedValuesFromMap =
            """
                        Person Chelsea
                        Person Holden
                        Person Leon
                        Person Mike
                        Person Mitch
                        Person Moses
                        Person Peter
                        Person Ron
                        Person Steve
                        """;
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
        String expectedValueTest = """
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
        assertEquals(expectedValueTest, actualValue);
    }

    @Test
    public void testDisplayWithCollection() {
        actualValue = display(personPetMap.keySet());
        assertEquals(expectedValue, actualValue);
    }

    @Test
    public void testDisplayWithIterator() {
        actualValue = display(personPetMap.keySet().iterator());
        assertEquals(expectedValue, actualValue);
    }

    @Test
    public void testPetNames() {
        Collection<Person> personList = personPetMap.keySet();
        List<String> expectedPersonList =
                (List<String>) Arrays.asList(expectedValuesFromMap.split("\n"));
        for(Person p : personList) {
            String personName = p.getName();
            assertTrue(expectedPersonList.contains(personName));
        }
    }
}
/*
    For a great while I could not figure out why, when calling either of the two display()
    methods I could not get the expectedValue and actualValues to match.  Originally, the
    expectedValue was defined in the order of initialization in the PetCreator class.  It
    seems once I got into either display() method and then made the assertEquals() call, the
    order had changed from the initialization that took place in PetCreator.  When I checked
    actualValue right after the assignment => actualValue = display(personPetMap.values().iterator());
    and right before executing the assertion => assertEquals(expectedValue, actualValue) the actualValue
    had the initialization value.  Once the assertion took place the failure stated the expectedValue
    and actualValue were different strings, i.e., the characters were not in the same order.

    So I was unable to find out what caused this juxtaposition of characters once the assertEquals() was
    called.  The only way to fix this was to go into the display() methods and force a certain output.
    I did this by soring the output, now everything works.
*/
