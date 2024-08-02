package org.example;

public class SpaceShipDelegation {
    private final String name;
    private final SpaceShipControls controls = new SpaceShipControls();

    public SpaceShipDelegation(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    /*
        The methods below are an example of delegation.  A controls object is created but in the methods
        below for
    */
    public String up(int velocity) {
        return controls.up(velocity);
    }

    public String down(int velocity) {
        return controls.down(velocity);
    }

    public String left(int velocity) {
        return controls.left(velocity);
    }

    public String right(int velocity) {
        return controls.right(velocity);
    }

    public String forward(int velocity) {
        return controls.forward(velocity);
    }

    public String back(int velocity) {
        return controls.back(velocity);
    }
}
