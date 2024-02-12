package Konular;

import java.util.Arrays;

public class Konu_Char {
    public static void main(String[] args) {

        String str = "Hello";
        char[] chars = str.toCharArray();
        Arrays.sort(chars);
        System.out.println(Arrays.toString(chars));

        System.out.println(str.charAt(3));       // l
        System.out.println(str.charAt(3) + 1);   // 109
        System.out.println((char) 69);           // E

        System.out.println('z');              // z
        System.out.println('z' + 1 - 1);      // 122

        int w = str.charAt(2);                   // 108

        char a = 'a';
        char b = '6';
        char ch = 122;      // ch = 'z'

        System.out.println(a + b);    // 151 (ASCII)

        char c = 'K';
        System.out.println(--c);         // J
        System.out.println(c++);         // J
        System.out.println(++c);         // L


        int i = Integer.parseInt(b + "");
        int j = Character.getNumericValue(b);       // ****

    }
}
