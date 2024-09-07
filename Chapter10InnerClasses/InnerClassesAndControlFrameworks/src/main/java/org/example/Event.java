package org.example;
import java.time.*;

public abstract class Event {
    private Instant eventTime;
    protected final Duration duration;
    public Event(long millisecondDelay) {
        duration = Duration.ofMillis(millisecondDelay);
        start();
    }

    public Instant getEventTime() {
        return eventTime;
    }

    public void setEventTime(Instant eventTime) {
        this.eventTime = eventTime;
    }

    public Duration getDuration() {
        return duration;
    }

    public void start() {
        this.eventTime = Instant.now().plus(duration);
    }

    public boolean ready() {
        return Instant.now().isAfter(eventTime);
    }

    public abstract void action();

    public abstract void recordAction();
}
