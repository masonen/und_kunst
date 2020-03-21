package wir.vs.virus.und.kunst.domain.model;

import org.junit.Test;

import java.net.MalformedURLException;
import java.net.URL;

import static org.assertj.core.api.Assertions.assertThat;

public class ArtistTest {
    @Test
    public void verifyCreatedYouTubeStreamByArtist() throws MalformedURLException {
        URL youTubeUrl = new URL("https://www.youtube.com/watch?v=xxx");
        Artist artist = new Artist("hans", "miller");
        YouTubeStream expectedYouTubeStream = new YouTubeStream(artist, youTubeUrl);

        assertThat(artist.createYouTubeStream(youTubeUrl)).isEqualTo(expectedYouTubeStream);
    }
}
