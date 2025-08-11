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
            if (hours >= 8){
                this.days += hours/8;
            }
        }else if (minutes >= 0)
        {
            this.minutes = minutes;
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
