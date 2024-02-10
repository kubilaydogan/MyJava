package Duplicate_Unique;

import java.util.*;

public class String_IndexOfFirstUniqueChar {
    public static void main(String[] args) {
        String str = "americam";
        System.out.println(indexOfFirstNonRepeatingChar(str));  //2
    }
    /*
    Given a string, find the first non-repeating character in it and return its index.
    If it doesn't exist, return -1.
     */

    public static int indexOfFirstNonRepeatingChar(String str) {
        List list = new LinkedList(Arrays.asList(str.split("")));
        // List list = Arrays.asList(str.split(""));
        Set<String> set = new LinkedHashSet<>(list);
        for (String each : set) {
            if (Collections.frequency(list, each) == 1) {
                return str.indexOf(each);
            }
        }
        return -1;
    }


}
