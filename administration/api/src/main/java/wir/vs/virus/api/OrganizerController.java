package wir.vs.virus.api;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;
import wir.vs.virus.und.kunst.domain.model.Organizer;
import wir.vs.virus.und.kunst.domain.repository.OrganizerRepository;

import java.util.List;

@RestController
public class OrganizerController {
    private OrganizerRepository organizerRepository;

    public OrganizerController(OrganizerRepository organizerRepository) {
        this.organizerRepository = organizerRepository;
    }

    @PostMapping("/organizer")
    public Organizer createOrganizer(Organizer organizer) {
        return organizerRepository.save(organizer);
    }

    @GetMapping("/organizer/all")
    public List<Organizer> getAllOrganizer() {
        return organizerRepository.findAll();
    }
}
