package Konular;

public class Konu_Primitives {
    public static void main(String[] args) {

        double divide1 =30/4;       // 7.0
        double divide2 =30/4d;      // 7.5
        double divide3 =30d/4d;     // 7.5

        int v = 7;
        int w = 2;
        System.out.println(v/w);            // 3
        System.out.println( (double)v/w );  // 3.5


        float f = 8f;
        double d = (double) f;

    }
}
