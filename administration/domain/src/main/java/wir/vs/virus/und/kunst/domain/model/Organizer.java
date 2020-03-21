package wir.vs.virus.und.kunst.domain.model;

import java.time.Instant;
import java.util.Set;
import java.util.SortedSet;
import java.util.TreeSet;
import java.util.stream.Collectors;

public class Organizer {
    private SortedSet<Festival> festivals;

    public Organizer() {
        festivals = new TreeSet<>();
    }

    public Set<Festival> getFestivalsInPast() {
        return festivals
                .stream()
                .filter(festival -> festival.getStart().isBefore(Instant.now()))
                .collect(Collectors.toSet());
    }

    public SortedSet<Festival> getFestivals() {
        return festivals;
    }

    public Organizer setFestivals(SortedSet<Festival> festivals) {
        this.festivals = festivals;
        return this;
    }

    public Organizer addFestival(Festival festival) {
        this.festivals.add(festival);
        return this;
    }
}
