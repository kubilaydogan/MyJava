package Konular_Level2;

import java.util.Locale;

public class Konu_Locale {
    public static void main(String[] args) {

        // java.util.Locale class represents languages and countries

        Locale uk = new Locale("en", "GB");
        Locale us = new Locale("en", "US");
        Locale cf = new Locale("fr", "CA");
        Locale fr = new Locale("fr", "029");    // Caribbean

        Locale es = new Locale("es");

        Locale current = Locale.getDefault();
        System.out.println(current);        // en_US

        System.out.println(uk);             // en_GB




    }
}
