package Konular;

public class Konu_WrapperClasses {
    public static void main(String[] args) {
/*
    Every primitive has a Wrapper class that represents them in object level

    byte    --> Byte
    short   --> Short
    long    --> Long
    double  --> Double
    float   --> Float
    boolean --> Boolean

    char    ==> Character
    int     ==> Integer
 */
        int x = 8;
        Integer q = x;      // ==> auto-boxing
        int y = q;          // ==> auto-unboxing


        // valueOf()   --> from (primitive or String) to Wrapper
        int n = 9;
        String str = String.valueOf(n);         // "9"
        Integer in = Integer.valueOf(n);        // 9

        String k = "3.15";
        Float f = Float.valueOf(k);             // 3.15

        // parseXXX()  --> from String to primitive or Wrapper
        String m  = "9";
        float val = Float.parseFloat(m);

        // xxxValue()  --> extract primitive value from wrapper
        Integer b = 10;
        int c = b.intValue();

    }
}
