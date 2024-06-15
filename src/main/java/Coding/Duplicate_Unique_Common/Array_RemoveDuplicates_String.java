package Coding.Duplicate_Unique_Common;

import java.util.Arrays;
import java.util.LinkedHashSet;

public class Array_RemoveDuplicates_String {
    public static void main(String[] args) {

        String[] arr = {"hello", "java", "hello", "Hello", "HELLO", "HELLO", "java"};
        System.out.println(Arrays.toString(removeDuplicates(arr)));     // [hello, java]                    ==> case-insensitive
        System.out.println(Arrays.toString(removeDuplicates2(arr)));    // [hello, java, Hello, HELLO]      ==> case-sensitive
    }

    public static String[] removeDuplicates(String[] array) {

        LinkedHashSet<String> uniqueStrings = new LinkedHashSet<>();
        for (String str : array) {
            String lowercaseStr = str.toLowerCase();
            if (uniqueStrings.add(lowercaseStr)) {
                uniqueStrings.add(str);
            }
        }
        return uniqueStrings.toArray(new String[0]);
    }

    public static String[] removeDuplicates2(String[] array){
        return Arrays.stream(array).distinct().toArray(String[]::new);
    }

}
