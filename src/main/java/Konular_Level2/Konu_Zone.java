package Konular_Level2;

import java.time.LocalDateTime;
import java.time.Month;
import java.time.ZoneId;
import java.time.ZonedDateTime;

public class Konu_Zone {
    public static void main(String[] args) {

        ZoneId london = ZoneId.of("Europe/London");
        ZoneId la = ZoneId.of("America/Los_Angeles");

        LocalDateTime someTime = LocalDateTime.of(2021, Month.MARCH, 13, 07, 15);
        ZonedDateTime londonTime = ZonedDateTime.of(someTime, london);
        ZonedDateTime laTime = londonTime.withZoneSameInstant(la);

        System.out.println(someTime);
        System.out.println(londonTime);
        System.out.println(laTime);

        //Diger kullanimlar
        ZoneId z1 = ZoneId.of("GMT+2");
        ZoneId z2 = ZoneId.of("UTC-05:00");
        ZoneId z3 = ZoneId.systemDefault();

        System.out.println(z1);     // GMT+02:00
        System.out.println(z2);     // UTC-05:00
        System.out.println(z3);     // America/New_York
    }
}
