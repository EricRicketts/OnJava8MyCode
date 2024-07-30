package org.example;

public class Detergent extends Cleanser {
    @Override
    public void scrub() {
        // override inherited class method, give it different behavior
        append(" Detergent.scrub()");
        super.scrub();
    }
    public void foam() { append(" foam()"); }
    @Override
    public String toString() {
        return super.toString();
    }
}
