package Coding.Frequency;

import java.util.*;

public class String_Frequency_of_letters {

    public static void main(String[] args) {

        String str = "BHAYKJSGDABCABCEFGAD";
        System.out.println(countLetter(str, "A"));              // 4
        System.out.println(countLetter(str, "B"));              // 3

        System.out.println(countAllLetters(str));            // {A=3, B=3, C=2, S=1, D=2, E=1, F=1, G=2, H=1, Y=1, J=1, K=1}

    }

    static int countChars(String str, char ch) {
        List<String> list = Arrays.asList(str.split(""));
        return Collections.frequency(list, ch+"" );
    }

    static int countLetter(String str, String target) {
        String[] arr = str.split("");
        List<String> list = Arrays.asList(arr);
        return Collections.frequency(list,target);
    }

    private static Map countAllLetters(String str) {
        String[] arr = str.split("");
        Map<String, Integer> map = new HashMap<>();
        Set<String> uniques = new HashSet<>(Arrays.asList(arr));
        for(String each: uniques){
            map.put(each, Collections.frequency(Arrays.asList(arr),each));
        }
        return map;
    }

}
