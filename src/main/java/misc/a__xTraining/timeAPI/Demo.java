package misc.a__xTraining.timeAPI;

import sun.nio.cs.ext.MacCentralEurope;

import java.time.LocalDate;
import java.time.Month;
import java.time.ZoneId;

/**
 *
 */
public class Demo {
    public static void main(String[] args) {
        LocalDate localDate = LocalDate.now();
        System.out.println(localDate);

        LocalDate firstOfCurrentYear = LocalDate.of(2022, Month.FEBRUARY, 1);
        System.out.println(firstOfCurrentYear);

        LocalDate todayKiev = LocalDate.now(ZoneId.of("Europe/Kiev"));
        System.out.println(todayKiev);
    }
}


// timestamp to Instant
// convert instant to LocalDateTime
