package org.example;


import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.*;

import static org.junit.jupiter.api.Assertions.*;

public class CollectionsVsIteratorsPetCreatorTest {

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
    String actualValue;
    private static final String peopleString =
        "Person Chelsea\n" +
        "Person Holden\n" +
        "Person Leon\n" +
        "Person Mike\n" +
        "Person Mitch\n" +
        "Person Moses\n" +
        "Person Peter\n" +
        "Person Ron\n" +
        "Person Steve\n";
    private static final String expectedValue =
            "Pet has name: Pet Abby\n" +
            "Pet has name: Pet Bill\n" +
            "Pet has name: Pet Charlie\n" +
            "Pet has name: Pet Doug\n" +
            "Pet has name: Pet Erin\n" +
            "Pet has name: Pet Frank\n" +
            "Pet has name: Pet Guy\n" +
            "Pet has name: Pet Holly\n" +
            "Pet has name: Pet Inca\n";
        private static final String expectedValuesFromMap =
            "Pet Abby\n" +
            "Pet Bill\n" +
            "Pet Charlie\n" +
            "Pet Doug\n" +
            "Pet Erin\n" +
            "Pet Frank\n" +
            "Pet Guy\n" +
            "Pet Holly\n" +
            "Pet Inca\n";
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
        actualValue = display(personPetMap.values());
        assertEquals(expectedValue, actualValue);
    }

    @Test
    public void testDisplayWithIterator() {
        actualValue = display(personPetMap.values().iterator());
        assertEquals(expectedValue, actualValue);
    }

    @Test
    public void testPetNames() {
        Collection<Pet> petList = personPetMap.values();
        List<String> expectedPetList =
                (List<String>) Arrays.asList(expectedValuesFromMap.split("\n"));
        for(Pet p : petList) {
            String petName = p.getName();
            assertTrue(expectedPetList.contains(petName));
        }
    }

    @Test
    public void testContainsKeyAndValue() {
        boolean[] expectedValues = {true, true};
        boolean[] actualValues = new boolean[]{
                personPetMap.containsKey(new Person("Person Mitch")),
                personPetMap.containsValue(new Manx("Pet Doug"))
        };
        assertArrayEquals(expectedValues, actualValues);
    }

    @Test
    public void testGetValueFromKey() {
        assertTrue(personPetMap.containsKey(new Person("Person Holden")));
        Hamster hamster = (Hamster) personPetMap.get(new Person("Person Holden"));
        assertEquals(new Hamster("Pet Bill"), hamster);
    }

    @Test
    public void testReplaceValue() {
        String personName = "Person Ron";
        String newPetName = "Pet FizzBuzz";
        Rat rat = (Rat) personPetMap.get(new Person(personName));
        personPetMap.replace(new Person(personName), new Pet(newPetName));
        Pet pet = personPetMap.get(new Person(personName));
        assertEquals(new Rat("Pet Holly"), rat);
        assertEquals(new Pet("Pet FizzBuzz"), pet);
    }

    @Test
    public void testForEach() {
        List<String> peopleNames = new ArrayList<>(Arrays.asList(peopleString.split("\n")));
        List<String> petNames = new ArrayList<>(Arrays.asList(expectedValuesFromMap.split("\n")));
        for(Map.Entry<Person, Pet> entry : personPetMap.entrySet()) {
            Person person = entry.getKey();
            Pet pet = entry.getValue();
            assertTrue(peopleNames.contains(person.getName()));
            assertTrue(petNames.contains(pet.getName()));
        }
    }

    @Test
    public void testRemove() {
        assertEquals(9, personPetMap.size());
        assertTrue(personPetMap.containsKey(new Person("Person Leon")));
        personPetMap.remove(new Person("Person Leon"));
        assertEquals(8, personPetMap.size());
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
