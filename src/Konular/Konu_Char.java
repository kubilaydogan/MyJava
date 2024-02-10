package Konular;

import java.util.Arrays;

public class Konu_Char {
    public static void main(String[] args) {

        String str = "Hello";
        char[] chars = str.toCharArray();
        Arrays.sort(chars);
        System.out.println(Arrays.toString(chars));

        System.out.println( str.charAt(3)   );       // l
        System.out.println( str.charAt(3)+1 );       // 109
        System.out.println( (char) 69       );       // E

        char a = 'a';
        char b = '6';
        System.out.println(a+b);    // 151 (ASCII)

        int i = Integer.parseInt(b+"");
        int j = Character.getNumericValue(b);       // ****

    }
}
