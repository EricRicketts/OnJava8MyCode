package org.example;

public class Tree {
    private int height;

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public String info() {
        return "Tree has height = " + height + " feet";
    }

    public String info(String s) {
        return s + ": Tree has height = " + height + " feet";
    }

    public Tree(int height) {
        this.height = height;
    }

    public Tree() {
        this.height = 0;
    }
}
