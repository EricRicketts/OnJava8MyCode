package org.example;

public class Parcel {
    public Destination destination (String s) {
        final class PDestination implements Destination {
            private final String label;
            private PDestination (String whereTo) {
                this.label = whereTo;
            }
            @Override
            public String getLabel() { return label; }
        }
        return new PDestination(s);
    }
}
/*
    With the author's help, I hope explain what is going on here.  Destination is an Interface with abstract
    method getLabel().  An abstract method is a method without a body, such methods are said to have method
    signatures but not method body.

    We see that the method destination(String s) defined a class PDestination within its body.  Access to this
    is unavailable outside of method destination(String s).  The method returns a reference to the Destination
    Interface.  Fortunately, the method returns an object in which we can call the getLabel() method, which
    was part of the Interface definition for Destination.
*/
