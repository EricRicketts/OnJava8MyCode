package org.example;
import java.util.*;

public class Controller {

    private final List<Event> eventList = new ArrayList<>();

    public void addEvent(Event event) { eventList.add(event); }

    public String run() {
        String runResults = "";
        while(!eventList.isEmpty()) {
            for(Event event : new ArrayList<>(eventList)) {
                if (event.ready()) {
                    runResults = runResults.concat(" " + event);
                    event.action();
                    eventList.remove(event);
                }
            }
        }
        return runResults;
    }
}
