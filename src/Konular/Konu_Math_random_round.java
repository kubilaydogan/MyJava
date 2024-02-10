package Konular;

public class Konu_Math_random_round {
    public static void main(String[] args) {

        // random
        double rasgele = Math.random();		                    // 0-1 arasında
        double rasgele2 = Math.random() * 100;	                // 74.72192248526746
        double rasgele3 = Math.round(rasgele2);                 // 75.0
        double rasgele4 = Math.round( Math.random() * 100 );

        int i = (int) rasgele2;                                 // 74
        int j = (int) (Math.random() * 100);

        // java.lang.Math provides various math operations

        int max = Math.max(3, 9);
        System.out.println(max);        // 9

        int min = Math.min(3, 9);
        System.out.println(min);        // 3

        int c = Math.round(11/3);       // c = 3
        double d = Math.round(11/3);    // d = 3.0
        float f = Math.round(11/3);     // f = 3.0

        double e = Math.round((double)11/3);    // 4.0

        double m = Math.round(11.0/3);          // 4.0
        double n = Math.round(11/3.0);          // 4.0
        double s = Math.round(11.0/3.0);        // 4.0

        double t = Math.round((double)11/3*100)/100.0;        //3.67
        double v = Math.round((double)11/3*1000)/1000.0;      //3.667
        double w = Math.round((double)11/3*10000)/10000.0;    //3.6667      (depends on how much digits you want)

        System.out.println("Min and Max Values of: ");
        System.out.println("Integer (int)");
        System.out.println(Integer.MIN_VALUE);
        System.out.println(Integer.MAX_VALUE);
        System.out.println();
        System.out.println("Byte");
        System.out.println(Byte.MIN_VALUE);
        System.out.println(Byte.MAX_VALUE);
        System.out.println();
        System.out.println("Short");
        System.out.println(Short.MIN_VALUE);
        System.out.println(Short.MAX_VALUE);
        System.out.println();
        System.out.println("Float");
        System.out.println(Float.MIN_VALUE);
        System.out.println(Float.MAX_VALUE);
        System.out.println();
        System.out.println("Double");
        System.out.println(Double.MIN_VALUE);
        System.out.println(Double.MAX_VALUE);


    }
}
