package org.example;

public class FilterAdapter implements Processor {
    private Filter filter;

    public Filter getFilter() {
        return filter;
    }

    public void setFilter(Filter filter) {
        this.filter = filter;
    }

    @Override
    public String name() {
        return filter.name();
    }

    @Override
    public Waveform process(Object input) {
        return filter.process((Waveform)input);
    }

    public FilterAdapter(Filter filter) { this.filter = filter; }
}
