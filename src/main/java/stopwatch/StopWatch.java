package stopwatch;

import jdk.nashorn.internal.objects.annotations.Getter;
import jdk.nashorn.internal.objects.annotations.Setter;

public class StopWatch {
    int minutes;
    int hours;
    public void record(int minutes) {
        if (minutes >= 0) {
            this.minutes = minutes;
        }

        if (minutes >= 60){
            this.hours += 1;
        }
    }



    public int getHours() {
        return hours;
    }

    public int getMinutes() {
        return minutes;
    }
}
