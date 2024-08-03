package org.example;

public class PlaceSetting extends DinnerPlate {
    private Fork fork;
    private Spoon spoon;
    private Knife knife;

    public void initializeUtensils() {
        this.fork = new Fork();
        this.spoon = new Spoon();
        this.knife = new Knife();
    }

    public Fork getFork() {
        return fork;
    }

    public void setFork(Fork fork) {
        this.fork = fork;
    }

    public Spoon getSpoon() {
        return spoon;
    }

    public void setSpoon(Spoon spoon) {
        this.spoon = spoon;
    }

    public Knife getKnife() {
        return knife;
    }

    public void setKnife(Knife knife) {
        this.knife = knife;
    }

    public PlaceSetting() {
        super();
        initializeUtensils();
    }

    public PlaceSetting(Size size, Occasion occasion) {
        super(size, occasion);
        initializeUtensils();
    }
}
