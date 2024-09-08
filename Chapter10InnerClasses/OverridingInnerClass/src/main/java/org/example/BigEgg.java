package org.example;

public class BigEgg extends Egg {
    public static class Yolk extends Egg.Yolk {
        private String whichYolk;

        public String getWhichYolk() {
            return whichYolk;
        }

        public void setWhichYolk(String whichYolk) {
            this.whichYolk = whichYolk;
        }

        public Yolk() { this.whichYolk = "BigEgg.Yolk()"; }

        @Override
        public String f() {
            return "BigEgg.Yolk.f()";
        }
    }
}
