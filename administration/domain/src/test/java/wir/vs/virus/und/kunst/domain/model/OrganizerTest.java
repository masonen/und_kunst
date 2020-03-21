package wir.vs.virus.und.kunst.domain.model;

import org.junit.Test;

import java.time.Instant;

import static java.time.temporal.ChronoUnit.SECONDS;
import static org.assertj.core.api.Assertions.assertThat;

public class OrganizerTest {

    @Test
    public void testIfOrganizerHasFestivalsInPast() {
        Festival festivalInPast = new Festival();
        festivalInPast.setStart(Instant.now().minus(5, SECONDS));

        Festival festivalInFuture = new Festival();
        festivalInFuture.setStart(Instant.now().plus(5, SECONDS));

        Organizer organizer = new Organizer();
        organizer.addFestival(festivalInPast);
        organizer.addFestival(festivalInFuture);

        assertThat(organizer.getFestivalsInPast()).hasSize(1);
    }
}
