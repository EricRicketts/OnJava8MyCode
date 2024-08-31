package org.example;

public class Parcel11 {
    private static class ParcelContents implements Contents {
        private int i = 11;
        @Override public int getValue() { return i; }
    }
    protected static final class ParcelDestination implements Destination {
        private String label;
        private ParcelDestination(String whereTo) {
            label = whereTo;
        }
        @Override
        public String getLabel() { return label; }
        // Nested classes can contain other static elements:
        public static String f() { return "f() within ParcelDestination"; }
        static int x = 10;
        static class AnotherLevel {
            public static String f() { return "f() within AnotherLevel"; }
            static int x = 10;
        }
    }
    public static Destination destination(String s) {
        return new ParcelDestination(s);
    }
    public static Contents contents() {
        return new ParcelContents();
    }
}
