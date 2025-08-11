package stopwatch;

import jdk.nashorn.internal.objects.annotations.Getter;
import jdk.nashorn.internal.objects.annotations.Setter;

public class StopWatch {
    int minutes;
    int hours;
    int days;


    public void record(int minutes) {
        if (minutes >= 0 && minutes >= 60) {
            int minutesRemaining = minutes - 60;
            this.hours += minutes / 60;
            this.minutes = minutesRemaining;
        }

        if (hours >= 24){
            this.days += 1;
        }

    }



    public int getHours() {
        return hours;
    }

    public int getMinutes() {
        return minutes;
    }
    public int getDays() {
        return days;
    }
}
