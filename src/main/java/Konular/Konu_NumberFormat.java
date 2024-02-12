package Konular;

import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.text.ParseException;
import java.util.Locale;

public class Konu_NumberFormat {
    public static void main(String[] args) throws ParseException {

        // DecimalFormat double degerleri formatlar
        // NumberFormat String degerleri formatlar

        String value = "444,33";
        NumberFormat nf = NumberFormat.getInstance(Locale.GERMANY);
        System.out.println(nf.parse(value));            // 444.33

        nf = NumberFormat.getInstance(Locale.US);
        System.out.println(nf.parse(value));            // 44433    ***

        System.out.println("***************************************************");

        String deger = "444.33";

        nf = NumberFormat.getInstance(Locale.GERMANY);
        System.out.println(nf.parse(deger));            // 44433

        nf = NumberFormat.getInstance(Locale.US);
        System.out.println(nf.parse(deger));            // 444.33    ***



    }
}
