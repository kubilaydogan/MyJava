package Konular_Level2;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class Konu_BigDecimal {
    public static void main(String[] args) {

        // why to use BigDecimal ???
        // It can handle very large and very small floating point numbers
        // with great precision but compensating with the time complexity a bit.

        double a = 0.03;
        double b = 0.04;
        double c = b - a;
        System.out.println(c);          // 0.010000000000000002

        BigDecimal _a = new BigDecimal("0.03");
        BigDecimal _b = new BigDecimal("0.04");
        BigDecimal _c = _b.subtract(_a);
        System.out.println(_c);         // 0.01

        /* ~~~~~~~~~~~~~~~~~~~ INITIALITION ~~~~~~~~~~~~~~~~~~~ */
        BigDecimal A = BigDecimal.valueOf(5.4);
        BigDecimal B = new BigDecimal("5.4");

        // BigDecimal class has some pre-defined constants:
        BigDecimal C = BigDecimal.ONE;
        BigDecimal D = BigDecimal.TEN;
        BigDecimal E = BigDecimal.ZERO;

        System.out.println(A.add(C));       // 6.4

        double x = A.doubleValue();
        String z = A.toString();


        BigDecimal bd1 = new BigDecimal("124567890.0987654321");
        BigDecimal bd2 = new BigDecimal("987654321.123456789");

        // Addition of two BigDecimals
        bd1 = bd1.add(bd2);
        System.out.println("BigDecimal1 = " + bd1);

        // Multiplication of two BigDecimals
        bd1 = bd1.multiply(bd2);
        System.out.println("BigDecimal1 = " + bd1);

        // Subtraction of two BigDecimals
        bd1 = bd1.subtract(bd2);
        System.out.println("BigDecimal1 = " + bd1);

        // Division of two BigDecimals
        bd1 = bd1.divide(bd2);
        System.out.println("BigDecimal1 = " + bd1);

        // BigDecima1 raised to the power of 2
        bd1 = bd1.pow(2);
        System.out.println("BigDecimal1 = " + bd1);

        // Negate value of BigDecimal1
        bd1 = bd1.negate();
        System.out.println("BigDecimal1 = " + bd1);

        /* ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~ */

        BigDecimal d1 = BigDecimal.valueOf(12.99);
        BigDecimal d2 = BigDecimal.valueOf(0.2);

        BigDecimal result = d1.multiply(d2);
        BigDecimal result1 = d1.multiply(d2).setScale(2, RoundingMode.HALF_UP);

        System.out.println(result);     // 2.598
        System.out.println(result1);    // 2.60

        BigDecimal zx = BigDecimal.valueOf(6.956).setScale(2,RoundingMode.HALF_UP);  //6.96


        int sum = d1.divide(d2).add(d1).multiply(d1).subtract(d2).intValue();

        /* ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~ */

        BigDecimal bdFromDouble = new BigDecimal(0.1);
        System.out.println(bdFromDouble);            // 0.1000000000000000055511151231257827021181583404541015625
        // Therefore, we should use the String constructor instead of the double constructor. ????
    }
}
