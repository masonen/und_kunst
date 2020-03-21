package wir.vs.virus.und.kunst.domain.model;

import java.net.URL;

public class YouTubeStream implements Stream {
    private Artist artist;
    private URL url;

    public YouTubeStream() {
    }

    public YouTubeStream(Artist artist, URL url) {
        this.artist = artist;
        this.url = url;
    }

    @Override
    public Artist getArtist() {
        return artist;
    }

    public YouTubeStream setArtist(Artist artist) {
        this.artist = artist;
        return this;
    }

    @Override
    public URL getUrl() {
        return url;
    }

    public YouTubeStream setUrl(URL url) {
        this.url = url;
        return this;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        YouTubeStream that = (YouTubeStream) o;

        if (artist != null ? !artist.equals(that.artist) : that.artist != null) return false;
        return url != null ? url.equals(that.url) : that.url == null;
    }

    @Override
    public int hashCode() {
        int result = artist != null ? artist.hashCode() : 0;
        result = 31 * result + (url != null ? url.hashCode() : 0);
        return result;
    }
}
