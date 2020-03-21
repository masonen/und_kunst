package wir.vs.virus.und.kunst.domain.model;

import java.util.Set;
import java.util.TreeSet;

public class Schedule {
    private Set<TimeSlot> timeSlots;

    public Schedule() {
        timeSlots = new TreeSet<>();
    }

    public Set<TimeSlot> getTimeSlots() {
        return timeSlots;
    }

    public Schedule setTimeSlots(Set<TimeSlot> timeSlots) {
        this.timeSlots = timeSlots;
        return this;
    }
}
