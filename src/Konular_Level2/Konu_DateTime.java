package Konular_Level2;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;

public class Konu_DateTime {
    public static void main(String[] args) {

        LocalDate date1 = LocalDate.now();
        LocalDate date2 = LocalDate.of(2019, 6, 18);
        LocalDate date3 = LocalDate.parse("2019-06-18", DateTimeFormatter.ISO_DATE);

        System.out.println("date1 = " + date1);
        System.out.println("date2 = " + date2);
        System.out.println("date3 = " + date3);

        System.out.println(date1.getYear());
        System.out.println(date1.isBefore(date2));
        System.out.println(date1.plus(4, ChronoUnit.DAYS));

        String current_hour = LocalTime.now().format(DateTimeFormatter.ofPattern("h:mm:ss"));
        System.out.println(current_hour);       // 7:54:18
    }
}
