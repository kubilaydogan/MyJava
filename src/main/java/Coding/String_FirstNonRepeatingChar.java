package Coding;

import java.util.*;

public class String_FirstNonRepeatingChar {
    public static void main(String[] args) {

        String[] inputs = {"Hello", "World"};
        String sentence = "Hello World! Hi";
        System.out.println(firstNonRepeatingLetter(sentence));
        System.out.println(firstNonRepeatingLetter2(sentence));
        firstNonRepeatingLetter(inputs);
    }

    static String firstNonRepeatingLetter2(String str) {
        List<String> list = new ArrayList<>(Arrays.asList(str.split("")));
        for (String each : list) {
            if (Collections.frequency(list, each) == 1) {
                return each;
            }
        }
        return "";
    }

//    static String firstNonRepeatingLetter2(String[] inputs) {
//        for(String each : inputs){
//            for (Character str : each) {
//                if (Collections.frequency(each, ) == 1) {
//                    return str;
//                }
//            }
//        }
//        return "";
//    }

    // ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~`

    public static String firstNonRepeatingLetter(String sentence) {
        if (sentence == null || sentence.isEmpty()) {
            return null;
        }

        LinkedHashMap<Character, Integer> letterCount = new LinkedHashMap<>();

        for (char letter : sentence.toCharArray()) {
            if (Character.isLetter(letter)) {
                letterCount.put(letter, letterCount.getOrDefault(letter, 0) + 1);
            }
        }

        // System.out.println(letterCount);

        for (Map.Entry<Character, Integer> entry : letterCount.entrySet()) {
            if (entry.getValue() == 1) {
                return entry.getKey().toString();
            }
        }
        return null; // No non-repeating letter found
    }

    public static void firstNonRepeatingLetter(String[] inputs) {
        for(String each : inputs){
            System.out.println(firstNonRepeatingLetter(each));
        }
    }

}




