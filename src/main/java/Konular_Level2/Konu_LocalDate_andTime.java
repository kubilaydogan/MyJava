package Konular_Level2;

import java.time.*;

import static java.time.LocalTime.now;

public class Konu_LocalDate_andTime {
    public static void main(String[] args) {

        // LocalTime | LocalDate | LocalDateTime

        // ~~~~~~~~~~~~~~~~~~~~~~~~ LocalTime ~~~~~~~~~~~~~~~~~~~~~~~~
        System.out.println(now());              // 19:12:39.592319
        System.out.println("now() to get current time | it returns LocalTime");

        LocalTime thisTime = LocalTime.now();
        System.out.println(thisTime);           // 19:12:39.596330

        LocalTime n = LocalTime.of(10, 6);
        System.out.println(n);                  // 10:06

        // ~~~~~~~~~~~~~~~~ LocalDate & LocalDateTime ~~~~~~~~~~~~~~~~

        LocalDate today = LocalDate.now();
        System.out.println(today);              // 2023-07-03

        LocalDateTime currentDateTime = LocalDateTime.now();
        System.out.println(currentDateTime);       // 2023-07-03T19:12:39.596568

        LocalDateTime someDateTime = LocalDateTime.of(2011, Month.APRIL, 26, 12, 30);
        System.out.println(someDateTime);

        LocalDate whatWasTheDate = someDateTime.toLocalDate();
        System.out.println(whatWasTheDate);      // 2021-04-26

        LocalTime whatWasTheTime = currentDateTime.toLocalTime();
        System.out.println(whatWasTheTime);      // 19:12:39.596568

        // ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~

        // plusXXX() | minusXXX() | withXXX()
        LocalDateTime current = LocalDateTime.now();
        LocalDateTime different = current.withMinute(14).withDayOfMonth(7).plusHours(12);       // dakikayi 14, gunu 7 olarak belirliyoruz. Ama burada plus 12 oldugu icin bir sonraki gune geciyor
        int year = current.getYear();
        boolean before = current.isBefore(different);

        System.out.println("hello");
        System.out.println(current);            // 2023-07-03T19:34:05.745009
        System.out.println(different);          // 2023-07-08T07:14:05.745009
        System.out.println(before);             // true

        // ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
        // instants | durations | periods

        LocalDate foolsDay = LocalDate.of(2022, Month.APRIL, 1);
        Period howLong = Period.between(today, foolsDay);
        int days = howLong.getDays();

        Duration twoHours = Duration.ofHours(2);
        long seconds = twoHours.minusMinutes(45).getSeconds();

        System.out.println(howLong);        // P-1Y-3M-2D
        System.out.println(days);           // -2
        System.out.println(seconds);        // 4500     (yani 75 dk)

    }
}
