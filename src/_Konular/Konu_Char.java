package _Konular;

import java.util.Arrays;

public class Konu_Char {
    public static void main(String[] args) {

        String str = "Hello";
        char[] chars = str.toCharArray();
        Arrays.sort(chars);
        System.out.println(Arrays.toString(chars));


    }
}
