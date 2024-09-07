package org.example;
import java.util.*;

public class Controller {
    private final String terminateController = "Terminating System\n";
    private final List<Event> eventList = new ArrayList<>();

    public void addEvent(Event event) { eventList.add(event); }

    public String run() {
        boolean terminated = false;
        String recordedEvents = "";
        while(!eventList.isEmpty()) {
            if (terminated) break;
            for(Event event : new ArrayList<>(eventList)) {
                if (event.ready()) {
                    recordedEvents = recordedEvents.concat(event.toString());
                    event.action();
                    event.recordAction();
                    eventList.remove(event);
                    if (event.toString().equals(terminateController)) {
                        terminated = true;
                        break;
                    }
                }
            }
        }
        return recordedEvents;
    }
}
