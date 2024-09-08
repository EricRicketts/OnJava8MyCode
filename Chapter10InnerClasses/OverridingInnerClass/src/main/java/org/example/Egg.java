package org.example;

public class Egg {
    private String whichEgg;
    protected static class Yolk {
        private String whichYolk;

        public String getWhichYolk() {
            return whichYolk;
        }

        public void setWhichYolk(String whichYolk) {
            this.whichYolk = whichYolk;
        }

        public Yolk() { this.whichYolk = "Egg.Yolk()"; }

        public String f() { return "Egg.Yolk.f()"; }
    }

    public Egg() { this.whichEgg = "new Egg()"; }

    public String getWhichEgg() {
        return whichEgg;
    }

    public void setWhichEgg(String whichEgg) {
        this.whichEgg = whichEgg;
    }

    private Yolk yolk = new Yolk();

    public void insertYolk(Yolk yolk) { this.yolk = yolk; }

    public String g() { return yolk.f(); }
}