package Konular;

import java.util.Arrays;

public class Konu_CharArray {

    public static void main(String[] args) {

        // convert String to Char Array

        String str = "Dogan";
        char[] arr = str.toCharArray();

        System.out.println(arr);                        // Dogan  **** this works only for char[]
        System.out.println(Arrays.toString(arr));       // [D, o, g, a, n]


        // 2 ways to create char array

        char[] test = new char[]{'T', 'H', 'I', 'S', ' ', 'I', 'S', ' ', 'A', ' ', 'T', 'E', 'S', 'T'};
        char[] ch = {'T', 'E', 'S', 'T'};

        // index
        int index = Arrays.binarySearch(ch, 'S');    // 2


        // convert Char[] to String ==> 2 ways

        String output1 = new String(test);
        String output2 = String.valueOf(ch);

        System.out.println("output1 : " + output1);
        System.out.println("output2 : " + output2);

        // EQUALS()
        char[] arr1 = {'D', 'o', 'g', 'a', 'n'};
        char[] arr2 = {'D', 'o', 'g', 'a', 'n'};
        char[] arr3 = {'g', 'o', 'D', 'a', 'n'};

        System.out.println(Arrays.equals(arr1, arr2));      // true
        System.out.println(Arrays.equals(arr1, arr3));      // false


    }
}
