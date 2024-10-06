package org.example;

public class Strategize {
    Strategy strategy;
    String msg;
    Strategize(String msg) {
        this.strategy = new Soft();
        this.msg = msg;
    }

    String communicate() {
        return strategy.approach(this.msg);
    }

    void changeStrategy(Strategy strategy) {
        this.strategy = strategy;
    }
}
