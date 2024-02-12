package Coding.Duplicate_Unique;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class String_RemoveDuplicates {
    /*
    Write function that can remove the duplicated values from String
            Ex: removeDup("AAABBBCCC") ==> ABC
     */

    public static void main(String[] args) {
        System.out.println(removeDuplicates("AAABBBCCC"));    // ABC
    }

    // "AAABBBCCC" ==> ABD
    public static String removeDuplicates2(String a) {
        String result = "";
        for (int i = 0; i < a.length(); i++) {
            if (!result.contains(a.charAt(i) + "")) {
                result += a.charAt(i) + "";
            }
        }
        return result;
    }

    public static String removeDuplicates3(String a) {
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < a.length(); i++) {
            if (!result.toString().contains(a.charAt(i) + "")) {
                result.append(a.charAt(i));
            }
        }
        return result.toString();
    }

    public static String removeDuplicates(String str) {
        List<String> list = Arrays.asList(str.split(""));
        Set<String> set = new HashSet<>(list);
        String result = "";
        for (String each : set) {
            result += each;
        }
        return result;
    }


}
