package wir.vs.virus.und.kunst.domain.model;

import java.net.URL;

public class Artist {
    private String firstName;
    private String lastName;

    public Artist() {
    }

    public Artist(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public YouTubeStream createYouTubeStream(URL url) {
        return new YouTubeStream(this, url);
    }

    public String getFirstName() {
        return firstName;
    }

    public Artist setFirstName(String firstName) {
        this.firstName = firstName;
        return this;
    }

    public String getLastName() {
        return lastName;
    }

    public Artist setLastName(String lastName) {
        this.lastName = lastName;
        return this;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Artist artist = (Artist) o;

        if (firstName != null ? !firstName.equals(artist.firstName) : artist.firstName != null) return false;
        return lastName != null ? lastName.equals(artist.lastName) : artist.lastName == null;
    }

    @Override
    public int hashCode() {
        int result = firstName != null ? firstName.hashCode() : 0;
        result = 31 * result + (lastName != null ? lastName.hashCode() : 0);
        return result;
    }
}
