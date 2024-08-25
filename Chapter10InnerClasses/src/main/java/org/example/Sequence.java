package org.example;

public class Sequence {
    private final String[] items;
    private int next;

    public String[] getItems() {
        return items;
    }

    public int getNext() {
        return next;
    }

    public void add(String item) {
        if (this.getNext() < items.length) items[next++] = item;
    }

    public Sequence(int size) {
        items = new String[size];
        this.next = 0;
    }

    private class SequenceSelector implements Selector {
        private int i = 0;

        @Override
        public boolean end() {
            return i == items.length;
        }

        @Override
        public String current() {
            return getItems()[i];
        }

        @Override
        public void next() {
            if (i < items.length) i++;
        }
    }
    public Selector selector() { return new SequenceSelector(); }
}
