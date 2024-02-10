package Konular_Level2;

import java.time.LocalDate;
import java.time.Month;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;
import java.util.Locale;

public class Konu_DateTime2 {
    public static void main(String[] args) {

        LocalDate date = LocalDate.of(2021, Month.APRIL,26);
        Locale locale = new Locale("en", "GB");
        DateTimeFormatter format = DateTimeFormatter.ofPattern("EEEE dd MMM yyyy", locale);

        String result = date.format(format);
        System.out.println(result);             // Monday 26 Apr 2021

        date = LocalDate.parse("Tuesday 31 Mar 2020", format);
        locale = new Locale("ru");
        format = DateTimeFormatter.ofLocalizedDate(FormatStyle.FULL).localizedBy(locale);
        result = date.format(format);

        System.out.println(result);     // вторник, 31 марта 2020 г.


    }
}
