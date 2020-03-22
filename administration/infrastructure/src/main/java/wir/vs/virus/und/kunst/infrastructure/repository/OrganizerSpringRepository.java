package wir.vs.virus.und.kunst.infrastructure.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import wir.vs.virus.und.kunst.domain.model.Organizer;
import wir.vs.virus.und.kunst.domain.repository.OrganizerRepository;

public interface OrganizerSpringRepository extends OrganizerRepository, MongoRepository<Organizer, String> {
}