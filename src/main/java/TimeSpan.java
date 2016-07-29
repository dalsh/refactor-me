import java.time.LocalTime;

/**
 * Created by dalsh on 29/07/2016.
 */
public class TimeSpan {

    private String from;
    private String to;

    public TimeSpan(String from, String to) {
        this.from = from;
        this.to = to;
    }

    public boolean isBetween(LocalTime instant) {
        return instant.isAfter(LocalTime.parse( getFrom() ))
                && instant.isBefore(LocalTime.parse( getTo() ));

    }

    public String getFrom() {
        return from;
    }

    public void setFrom(String from) {
        this.from = from;
    }

    public String getTo() {
        return to;
    }

    public void setTo(String to) {
        this.to = to;
    }
}
