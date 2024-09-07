package org.example;
import java.util.Date;
import java.util.concurrent.TimeUnit;

public class GreenhouseControls extends Controller {
    private boolean light = false;
    private boolean water = false;
    private String thermostat = "Day";
    private String recordedControllerActions = "";

    public String getRecordedControllerActions() {
        return recordedControllerActions;
    }

    public void setRecordedControllerActions(String recordedControllerActions) {
        this.recordedControllerActions =
                this.recordedControllerActions.concat(recordedControllerActions);
    }


    public class LightOn extends Event {
        private final String lightOnString = "Greenhouse light is on\n";
        public LightOn(long delayTime) {
            super(delayTime);
        }

        @Override
        public void action() {
            light = true;
        }

        @Override
        public void recordAction() {
            setRecordedControllerActions(lightOnString);
        }

        @Override
        public String toString() {
            return lightOnString;
        }
    }

    public class LightOff extends Event {
        private final String lightOffString = "Greenhouse light is off\n";
        public LightOff(long delayTime) {
            super(delayTime);
        }

        @Override
        public void action() {
            light = false;
        }

        @Override
        public void recordAction() {
            setRecordedControllerActions(lightOffString);
        }

        @Override
        public String toString() {
            return lightOffString;
        }
    }

    public class WaterOn extends Event {
        private final String waterOnString = "Greenhouse water is on\n";
        public WaterOn(long delayTime) {
            super(delayTime);
        }

        @Override
        public void action() {
            water = true;
        }

        @Override
        public void recordAction() {
            setRecordedControllerActions(waterOnString);
        }

        @Override
        public String toString() {
            return waterOnString;
        }
    }

    public class WaterOff extends Event {
        private final String waterOffString = "Greenhouse water is off\n";
        public WaterOff(long delayTime) {
            super(delayTime);
        }

        @Override
        public void action() {
            water = false;
        }

        @Override
        public void recordAction() {
            setRecordedControllerActions(waterOffString);
        }

        @Override
        public String toString() {
            return waterOffString;
        }
    }

    public class ThermostatNight extends Event {
        private final String thermostatNightString = "Thermostat on night setting\n";
        public ThermostatNight(long delayTime) {
            super(delayTime);
        }

        @Override
        public void action() {
            thermostat = "Night";
        }

        @Override
        public void recordAction() {
            setRecordedControllerActions(thermostatNightString);
        }

        @Override
        public String toString() {
            return thermostatNightString;
        }
    }

    public class ThermostatDay extends Event {
        private final String thermostatDayString = "Thermostat on day setting\n";
        public ThermostatDay(long delayTime) {
            super(delayTime);
        }

        @Override
        public void action() {
            thermostat = "Day";
        }

        @Override
        public void recordAction() {
            setRecordedControllerActions(thermostatDayString);
        }

        @Override
        public String toString() {
            return thermostatDayString;
        }
    }

    public class Bell extends Event {
        private final Long delayTimeInBell;
        private final String bellString = "Bing!!\n";
        public Bell(long delayTime) {
            super(delayTime);
            delayTimeInBell = delayTime;
        }

        public Long getDelayTimeInBell() {
            return delayTimeInBell;
        }

        @Override
        public void action() {
            addEvent(new Bell(delayTimeInBell));
        }

        @Override
        public void recordAction() {
            setRecordedControllerActions(bellString);
        }

        @Override
        public String toString() {
            return bellString;
        }
    }

    public class Restart extends Event {
        private Event[] eventsList;
        private final String restartString = "Restarting System\n";
        public Restart(long delayTime, Event[] eventsList) {
            super(delayTime);
            this.eventsList = eventsList;
            for (Event event : eventsList) { addEvent(event); }
        }

        @Override
        public void action() {
            for(Event event : eventsList) {
                event.start();
                addEvent(event);
            }
            start();
            addEvent(this);
        }

        @Override
        public void recordAction() {
            setRecordedControllerActions(restartString);
        }

        @Override
        public String toString() {
            return restartString;
        }
    }

    public class Terminate extends Event {
        private final String terminateString = "Terminating System\n";
        public Terminate(long delayTime) {
            super(delayTime);
        }

        @Override
        public void action() {
//            System.exit(0);
        }

        @Override
        public void recordAction() {
            setRecordedControllerActions(terminateString);
        }

        @Override
        public String toString() {
            return terminateString;
        }
    }
}
