package org.example;

public class Parcel {
    class Contents {
        private double value;

        public double getValue() {
            return value;
        }

        public void setValue(double value) {
            this.value = value;
        }

        public Contents(double value) {
            this.value = value;
        }
    }

    class Destination {
        private String label;

        public String getLabel() {
            return label;
        }

        public void setLabel(String label) {
            this.label = label;
        }

        public Destination(String label) {
            this.label = label;
        }
    }

    public Destination to(String label) {
        return new Destination(label);
    }

    public Contents contents(double value) {
        return new Contents(value);
    }

    public String ship(String destination, double price) {
        Destination d = new Destination(destination);
        Contents c = new Contents(price);
        return "Parcel going to " + d.getLabel() + " has value " + c.getValue();
    }
}
