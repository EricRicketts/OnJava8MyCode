package org.example;

public class Parcel8 {
    public class Wrapping {
        private int i;
        public Wrapping(int i) { this.i = i; }
        public int getI() { return i; }
    }
    public Wrapping wrapping(int x) {
        return new Wrapping(x) {
            @Override
            public int getI() { return super.getI() * 5; }
        }; // this semicolon marks the end the expression that happens to contain an anonymous class
    }
}
/*
    In my own words what looks to be creating an instance of the Wrapping class but with a shortcut for
    the instantiation of an instance for class Wrapping (specifically referring to line 10).  Also, not
    only does there seem to be an instantiation but at the same time a new class defined via extension.
    Looks like public class Wrapping2 extends Wrapping { ... }
*/
