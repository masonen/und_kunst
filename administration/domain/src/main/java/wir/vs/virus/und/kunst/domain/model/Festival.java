package wir.vs.virus.und.kunst.domain.model;

import java.time.Instant;
import java.util.HashSet;
import java.util.Set;
import java.util.SortedSet;
import java.util.TreeSet;

public class Festival implements Comparable<Festival> {
    private Instant start;
    private SortedSet<Schedule> schedules;
    private Set<MapItem> mapItems;

    public Festival() {
        schedules = new TreeSet<>();
        mapItems = new HashSet<>();
    }

    public Instant getStart() {
        return start;
    }

    public Festival setStart(Instant start) {
        this.start = start;
        return this;
    }

    public Boolean hasSchedules() {
        return !this.schedules.isEmpty();
    }

    public SortedSet<Schedule> getSchedules() {
        return schedules;
    }

    public Festival setSchedules(SortedSet<Schedule> schedules) {
        this.schedules = schedules;
        return this;
    }

    public Boolean hasMapItems() {
        return !this.mapItems.isEmpty();
    }

    public Set<MapItem> getMapItems() {
        return mapItems;
    }

    public Festival setMapItems(Set<MapItem> mapItems) {
        this.mapItems = mapItems;
        return this;
    }

    @Override
    public int compareTo(Festival anotherFestival) {
        return this.start.compareTo(anotherFestival.start);
    }
}