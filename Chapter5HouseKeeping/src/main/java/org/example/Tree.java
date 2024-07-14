package org.example;

public class Tree {
    private int height;

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    // below we have two versions of method "info" this is an example of method overloading
    // as with constructors each of the overloaded methods must take a different argument list
    // note the methods can actually have the same parameters but in different order this would
    // still qualify as an overloaded method but it is bad practice making the code more difficult
    // to maintain
    public String info() {
        return "Tree has height = " + height + " feet";
    }

    public String info(String s) {
        return s + ": Tree has height = " + height + " feet";
    }

    // below we have two constructors, this is an example of constructor overloading
    public Tree(int height) {
        this.height = height;
    }

    public Tree() {
        this.height = 0;
    }
}
