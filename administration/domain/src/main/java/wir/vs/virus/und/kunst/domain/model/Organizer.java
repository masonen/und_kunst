package wir.vs.virus.und.kunst.domain.model;

import org.springframework.data.annotation.Id;

import java.time.Instant;
import java.util.Set;
import java.util.SortedSet;
import java.util.TreeSet;
import java.util.stream.Collectors;

public class Organizer {
    @Id
    private String id;
    private String name;
    private SortedSet<Festival> festivals;

    public Organizer() {
        festivals = new TreeSet<>();
    }

    public String getId() {
        return id;
    }

    public Organizer setId(String id) {
        this.id = id;
        return this;
    }

    public String getName() {
        return name;
    }

    public Organizer setName(String name) {
        this.name = name;
        return this;
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
