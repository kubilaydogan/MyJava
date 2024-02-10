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
        System.out.println(removeDuplicates("AAABBBCCC"));             // ABC
    }

    public static String removeDuplicates(String str) {
        List list = Arrays.asList(str.split(""));
        Set<String> set = new HashSet<>(list);
        String result = "";
        for(String each :set){
            result += each;
        }
        return result;
    }

//    public static String removeDuplicates(String str) {
//        Set<String> set = new HashSet<>(Arrays.asList(str.split("")));
//        String result = "";
//        for(String each :set){
//            result += each;
//        }
//        return result;
//    }
}
