package org.example;

public class Stage {
    private Actor actor = new HappyActor();
    public void change() {
        this.actor = actor.getClass() == HappyActor.class ? new SadActor() : new HappyActor();
    }
    public String performPlay() { return this.actor.act(); }
}
