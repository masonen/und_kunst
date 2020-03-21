package wir.vs.virus.und.kunst.domain.model;

public class TimeSlot extends MapItem {
    private Stream stream;

    public Stream getStream() {
        return stream;
    }

    public TimeSlot setStream(Stream stream) {
        this.stream = stream;
        return this;
    }
}
