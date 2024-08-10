package org.example;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestMusic {

    private Instrument[] firstOrchestra, secondOrchestra;

    private String expected, actual;

    @BeforeEach
    public void setUp() {
        Wind wind = new Wind();
        Stringed stringed = new Stringed();
        Percussion percussion = new Percussion();
        Brass brass = new Brass();
        Woodwind woodwind = new Woodwind();
        firstOrchestra = new Instrument[]{
            wind,
            stringed,
            percussion
        };
        secondOrchestra = new Instrument[]{
            brass,
            woodwind
        };
    }

    @Test
    public void testFirstOrchestra() {
        expected = """
                Wind.play() MIDDLE_C
                Wind.play() C_SHARP
                Wind.play() B_FLAT
                Stringed.play() MIDDLE_C
                Stringed.play() C_SHARP
                Stringed.play() B_FLAT
                Percussion.play() MIDDLE_C
                Percussion.play() C_SHARP
                Percussion.play() B_FLAT
                """;
        actual = Music.tuneAll(firstOrchestra);
        assertEquals(expected, actual);
    }

    @Test
    public void testSecondOrchestra() {
        expected = """
                Brass.play() MIDDLE_C
                Brass.play() C_SHARP
                Brass.play() B_FLAT
                Woodwind.play() MIDDLE_C
                Woodwind.play() C_SHARP
                Woodwind.play() B_FLAT
                """;
        actual = Music.tuneAll(secondOrchestra);
        assertEquals(expected, actual);
    }
}
/*
    This code, most of it taken from the book OnJava8 is another important illustration of polymorphism.  Focus on the tune()
    method of the Music class.  Note the argument is an Instrument instance.  But during the above test, which calls the
    Music class tuneAll() method and which in turn calls the tune() method, every argument passed to the tune() method is something
    other than an Instrument instance.  All instances passed are subclasses of Instrument.  Yet in each case the proper play()
    method is called.  Java does not upcast the Non-Instrument arguments to Instrument, it is able to call play() on Wind,
    Stringed, Percussion, Brass, and Woodwind.  Again this is despite the argument to tune() being "Instrument instrument".
    This happens because of dynamic binding.  At runtime Java is able to figure out the correct method to call on the object
    being passed in.  Note this will only work if all the arguments being passed in are "Instrument", meaning they are an
    Instrument or a subclass of Instrument.  This makes sense as Wind, Stringed, Percussion, Brass, and Woodwind are all
    Instruments as they inherit from Instrument in some way or another (Brass and Woodwind inherit from Wind but Wind
    inherits from Instrument).

    Why is this important?  This enables the developer to essentially code the tune() method once.  The developer can leave
    the tune() method alone and continue to add new types without concern if the system will work correctly.  Again, the method
    will only work if an Instrument is passed in or a class which inherits from Instrument.

    From the book, "Once you know that all method binding in Java happens polymorphically via late binding, you can write your
    code to talk to the base class and know that all the derived-class cases will work correctly using the same code. Or to put it
    another way, you “send a message to an object and let the object figure out the right thing to do.”

    Again from the book, “Now let’s return to the musical instrument example. Because of polymorphism, you can add as many new
    types as you want to the system without changing the tune() method. In a well-designed OOP program, many of your methods will
    follow the model of tune() and communicate only with the base-class interface. Such a program is extensible because you can add
    new functionality by inheriting new data types from the common base class. The methods that manipulate the base-class interface
    will not change to accommodate the new classes.”
*/
