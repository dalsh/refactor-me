import java.time.DayOfWeek;
import java.time.LocalTime;
import java.util.HashMap;
import java.util.Map;


/**
 * @author Hugh Glykod
 */
public class Restaurant {

    private String name;

    private Map<DayOfWeek, TimeSpan> openingHours;

    public Restaurant() {
        this.setOpeningHours( getDefaultOpeningHours() );
    }

    public boolean isOpen(DayOfWeek day) {
        return openingHours.get(day).isBetween(LocalTime.now());
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Map<DayOfWeek, TimeSpan> getOpeningHours() {
        if (openingHours == null) {
            openingHours = new HashMap<>();
        }
        return openingHours;
    }

    public void setOpeningHours(Map<DayOfWeek, TimeSpan> openingHours) {
        this.openingHours = openingHours;
    }

    private Map<DayOfWeek, TimeSpan> getDefaultOpeningHours() {
        Map<DayOfWeek, TimeSpan> hours = new HashMap<>();

        TimeSpan defaultOpeningHours = new TimeSpan("09:00", "18:00");

        hours.put(DayOfWeek.MONDAY, defaultOpeningHours);
        hours.put(DayOfWeek.TUESDAY, defaultOpeningHours);
        hours.put(DayOfWeek.WEDNESDAY, defaultOpeningHours);
        hours.put(DayOfWeek.THURSDAY, defaultOpeningHours);
        hours.put(DayOfWeek.FRIDAY, defaultOpeningHours);
        hours.put(DayOfWeek.SATURDAY, defaultOpeningHours);

        return hours;
    }
}
