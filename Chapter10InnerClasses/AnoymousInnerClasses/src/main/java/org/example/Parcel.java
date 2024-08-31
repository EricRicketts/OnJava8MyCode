package org.example;

public class Parcel {
    public Contents contents() {
        return new Contents() {
            private final int value = 11;
            @Override
            public int getValue() { return value; }
        };
    }

    class MyContents implements Contents {
        private final int value = 11;
        @Override
        public int getValue() { return value; }
    }

    public Contents moreContents() {
        return new MyContents();
    }
}
/*
    The method returns a Contents() instance, which by the way is an Interface.  What the contents()
    method is doing by returning an instance of an anonymous class is the same as lines 12 - 20, where
    an inner class is defined and the returned in the method moreContents();  The author says, "Create an
    object of an anonymous class that is inherited from Contents."

    Note we say it returns an anonymous instance because we have return new Contents() { ... }.  Normally
    for an instance creation we would say "Contents contents = new Contents();".  This is what a
    constructor does, it returns an instance of the class.  In this case we are not only returning an
    instance of a class but with the Inner class we are defining a class at the same time.
*/
