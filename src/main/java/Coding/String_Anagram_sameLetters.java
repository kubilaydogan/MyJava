package Coding;

import java.util.Arrays;

public class String_Anagram_sameLetters {

    /*
    Write a  function that check if a string is build out of the same letters as another string.
            Ex: same("abc", "cab"); -> true , Solution 1:
                same("abc", "abb"); -> false:

          ANAGRAM (ANLAMLI) || PERMUTATION (RASTGELE DIZILIM)  => BU SEKILDE DE SORULABILIR
     */

    public static void main(String[] args) {
        System.out.println(isItAnagram("abc", "cab"));
        System.out.println(isItAnagram("abc", "abb"));

    }

    static boolean isItAnagram(String a, String b) {
        char[] ch1 = a.toLowerCase().toCharArray();
        char[] ch2 = b.toLowerCase().toCharArray();

        Arrays.sort(ch1);
        Arrays.sort(ch2);

        return Arrays.equals(ch1, ch2);
    }
}
