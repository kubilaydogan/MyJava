package Konular;

import java.text.DecimalFormat;

public class Konu_String2 {
    public static void main(String[] args) {

        // char arrray to String
        char[] text = {'H', 'e', 'l', 'l', 'o'};
        System.out.println(text);   // bu sekilde yazdirilabilen tek array tipi
        String s = new String(text);

        System.out.println(s);

        String t = s.intern();
        System.out.println(t);

        // You can call intern operation, which will basically create a version of a String which is interned.
        // Basically it means that both variables t and s are actually pointing to the same String object
        // rather than to create two different String objects.
        // This is a memory optimization.

        String v = t.concat(" World");          // Hello World
        String w = t + " World";                // Hello World

        System.out.println(1 + 1 + "u");            // 2u      --> 'u' olsaydi 119 cikardi. Bak.Ders22
        System.out.println("u" + 1 + 1);            //u11
        System.out.println("u" + (1 + 1));          //u2

        String a = "HelloWorld!";
        int n = a.indexOf('o');                      // n = 4
        int m = a.indexOf('o', 5);      // m = 6
        int k = a.indexOf('a');                      // k = -1
        char c = a.charAt(0);                        // c = H


    }
}
