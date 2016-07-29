import java.time.DayOfWeek;
import java.time.LocalTime;

import static java.time.DayOfWeek.MONDAY;
import static java.time.DayOfWeek.TUESDAY;
import static java.time.DayOfWeek.WEDNESDAY;

/**
 * @author Hugh Glykod
 */
public class Restaurant {

    private String name;

    private String mondayOpen = "09:00";
    private String mondayClose = "18:00";
    private String tuesdayOpen = "09:00";
    private String tuesdayClose = "18:00";
    private String wednesdayOpen = "09:00";
    private String wednesdayClose = "18:00";
    private String thursdayOpen = "09:00";
    private String thursdayClose = "18:00";
    private String fridayOpen = "09:00";
    private String fridayClose = "18:00";
    private String saturdayOpen = "09:00";
    private String saturdayClose = "18:00";

    public boolean isOpen(DayOfWeek day) {
        if (day == MONDAY) {
            if (LocalTime.now().isAfter(LocalTime.parse(mondayOpen)) && LocalTime.now().isBefore(LocalTime.parse(mondayClose))) {
                return true;
            } else {
                return false;
            }
        }
        if (day == TUESDAY) {
            if (LocalTime.now().isAfter(LocalTime.parse(tuesdayOpen)) && LocalTime.now().isBefore(LocalTime.parse(tuesdayClose))) {
                return true;
            } else {
                return false;
            }
        }
        if (day == WEDNESDAY) {
            if (LocalTime.now().isAfter(LocalTime.parse(wednesdayOpen)) && LocalTime.now().isBefore(LocalTime.parse(wednesdayClose))) {
                return true;
            } else {
                return false;
            }
        }
        if (day == DayOfWeek.THURSDAY) {
            if (LocalTime.now().isAfter(LocalTime.parse(thursdayOpen)) && LocalTime.now().isBefore(LocalTime.parse(thursdayClose))) {
                return true;
            } else {
                return false;
            }
        }
        if (day == DayOfWeek.FRIDAY) {
            if (LocalTime.now().isAfter(LocalTime.parse(fridayOpen)) && LocalTime.now().isBefore(LocalTime.parse(fridayClose))) {
                return true;
            } else {
                return false;
            }
        }
        if (day == DayOfWeek.SATURDAY) {
            if (LocalTime.now().isAfter(LocalTime.parse(saturdayOpen)) && LocalTime.now().isBefore(LocalTime.parse(saturdayClose))) {
                return true;
            } else {
                return false;
            }
        }
        return false;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMondayOpen() {
        return mondayOpen;
    }

    public void setMondayOpen(String mondayOpen) {
        this.mondayOpen = mondayOpen;
    }

    public String getMondayClose() {
        return mondayClose;
    }

    public void setMondayClose(String mondayClose) {
        this.mondayClose = mondayClose;
    }

    public String getTuesdayOpen() {
        return tuesdayOpen;
    }

    public void setTuesdayOpen(String tuesdayOpen) {
        this.tuesdayOpen = tuesdayOpen;
    }

    public String getTuesdayClose() {
        return tuesdayClose;
    }

    public void setTuesdayClose(String tuesdayClose) {
        this.tuesdayClose = tuesdayClose;
    }

    public String getWednesdayOpen() {
        return wednesdayOpen;
    }

    public void setWednesdayOpen(String wednesdayOpen) {
        this.wednesdayOpen = wednesdayOpen;
    }

    public String getWednesdayClose() {
        return wednesdayClose;
    }

    public void setWednesdayClose(String wednesdayClose) {
        this.wednesdayClose = wednesdayClose;
    }

    public String getThursdayOpen() {
        return thursdayOpen;
    }

    public void setThursdayOpen(String thursdayOpen) {
        this.thursdayOpen = thursdayOpen;
    }

    public String getThursdayClose() {
        return thursdayClose;
    }

    public void setThursdayClose(String thursdayClose) {
        this.thursdayClose = thursdayClose;
    }

    public String getFridayOpen() {
        return fridayOpen;
    }

    public void setFridayOpen(String fridayOpen) {
        this.fridayOpen = fridayOpen;
    }

    public String getFridayClose() {
        return fridayClose;
    }

    public void setFridayClose(String fridayClose) {
        this.fridayClose = fridayClose;
    }

    public String getSaturdayOpen() {
        return saturdayOpen;
    }

    public void setSaturdayOpen(String saturdayOpen) {
        this.saturdayOpen = saturdayOpen;
    }

    public String getSaturdayClose() {
        return saturdayClose;
    }

    public void setSaturdayClose(String saturdayClose) {
        this.saturdayClose = saturdayClose;
    }
}
