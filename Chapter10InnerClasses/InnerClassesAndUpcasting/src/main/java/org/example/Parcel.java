package org.example;

public class Parcel {

    private class PDContents implements Contents {
        private final double value;

        @Override
        public double getValue() {
            return value;
        }

        public PDContents(double value) {
            this.value = value;
        }
    }

    protected final class PDestination implements Destination {
        private final String label;

        @Override
        public String getLabel() {
            return label;
        }

        public PDestination(String label) {
            this.label = label;
        }
    }

    public Destination destination(String label) {
        return new PDestination(label);
    }

    public Contents contents(double value) {
        return new PDContents(value);
    }
}
