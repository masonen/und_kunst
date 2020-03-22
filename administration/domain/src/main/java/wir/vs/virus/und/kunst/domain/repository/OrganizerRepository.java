package wir.vs.virus.und.kunst.domain.repository;

import org.springframework.stereotype.Component;
import wir.vs.virus.und.kunst.domain.model.Organizer;

import java.util.List;

@Component
public interface OrganizerRepository {
    Organizer save(Organizer organizer);
    List<Organizer> findAll();
}
