package Coding.Duplicate_Unique;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class String_FindFirstRepeatedChar {
    public static void main(String[] args) {
        System.out.println(findFirstRepeatedChar("abccdeghjj"));
        System.out.println(findFirstRepeatedChar(""));
    }

    static String findFirstRepeatedChar(String str) {
        List<String> list = new ArrayList<>(Arrays.asList(str.split("")));
        for (String each : list) {
            if (Collections.frequency(list, each) > 1) {
                return each;
            }
        }
        return "";
    }
}
