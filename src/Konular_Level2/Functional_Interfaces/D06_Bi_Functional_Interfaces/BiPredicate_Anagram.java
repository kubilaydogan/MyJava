package Konular_Level2.Functional_Interfaces.D06_Bi_Functional_Interfaces;

import java.util.Arrays;
import java.util.function.BiPredicate;

public class BiPredicate_Anagram {
    public static void main(String[] args) {

        // "heart", "earth"
        BiPredicate<String, String> anagram = (s1, s2) -> {
            char[] ch1 = s1.toCharArray();
            char[] ch2 = s2.toCharArray();
            Arrays.sort(ch1);
            Arrays.sort(ch2);
            return Arrays.equals(ch1, ch2);
        };

        boolean r2 = anagram.test("Java", "Python");
        System.out.println(r2);

    }
}
