package Konular;

public class Konu_PrimitiveCasting {
    public static void main(String[] args) {

       // byte < short < char < int < long < float < double

       // WIDINING (AUTOMATIC) CASTING ==> Small box into large box
        int i = 126;
        long myLong  = i;
        float myFloat = i;
        double myDouble = i;

        System.out.println(myLong );            // 126
        System.out.println(myDouble);           // 126.0
        System.out.println(myFloat);            // 126.0

        // TYPE NARROWING
        // char c = i; ==> ERROR
        char c = (char) i;
        System.out.println(c);      // ~ (127 = space)

        byte b = 'A';
        System.out.println(b);      //65
        // byte c = '∑' ;  ==> ERROR ==> ASCII value for '∑' symbol is 228 (out of range)

        double d = 3.14 ;
        int a = (int) d ;           // 3
        System.out.println(a);      // type narrawing may loose data

        int x = (int)12.5f;
        System.out.println(x);      // 12


    }
}
