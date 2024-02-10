package Konular;

import java.text.DecimalFormat;

public class Konu_DecimalFormat {
    public static void main(String[] args) {

        System.out.println("***************************************************");
        System.out.println("*******            DecimalFormat            *******");
        System.out.println("***************************************************");

        // 0 – prints a digit if provided, 0 otherwise
        // # – prints a digit if provided, nothing otherwise

        int fahrenheit = 70;
        double celsius = (5/9d) * fahrenheit;
        System.out.println(celsius);        // 38.88888888888889

        String str = new DecimalFormat("##.#").format(celsius);          // 38.9
        String stx = new DecimalFormat("###.00").format(celsius);        // 38.89
        String stz = new DecimalFormat("##.##").format(4321.12345);     // 4321.12


        DecimalFormat df = new DecimalFormat("#00.00##");
        double d = 120.6;
        System.out.println(df.format(d));                       // 120.60
        String s = df.format(81.9);
        System.out.println(s);

        String result = new DecimalFormat("#.##").format(d);
        System.out.println(result);     // 120.6


        double pi = 3.14597895623;
        String p = new DecimalFormat ("##.##").format(pi);
        System.out.println(p);
    }
}
