package stopwatch;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class StopWatchTest {

    @Test
    void test1() {
        StopWatch stopWatch = new StopWatch();
        stopWatch.record(14);
        int minutes = stopWatch.getMinutes();
        Assertions.assertEquals(14, minutes);
    }

    @Test
    void test2() {
        StopWatch stopWatch = new StopWatch();
        stopWatch.record(-5);
        int minutes = stopWatch.getMinutes();
        if (minutes != 0) {
            Assertions.fail("Invalid value");
        }
    }

    @Test
    void givenMinutesEqualSixty_whenAdded_thenIncreaseHour(){
        StopWatch stopWatch = new StopWatch();
        stopWatch.record(60);
        int minutes = stopWatch.getMinutes();
        int hours = stopWatch.getHours();

        Assertions.assertEquals(1 , hours);
    }

    @Test
    void givenHoursEqualTwentyFour_whenAdded_thenIncreaseDay(){
        StopWatch stopWatch = new StopWatch();
        stopWatch.record(1440);
        int days = stopWatch.getDays();

        Assertions.assertEquals(1 , days);

    }

}
