package Coding.Reverse;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Array_Reverse_StringArray {

    public static void main(String[] args) {
        String[] arr = {"coding", "start", "Day", "Day", "start", "1", "Day", "Perfect", "Sunday"};

        System.out.println(Arrays.toString(reverseStingArray(arr)));

    }

    public static String[] reverseStingArray(String[] arr) {
        String[] result = new String[arr.length];
        int n = 0;
        for (int i = arr.length - 1; i >= 0; i--) {
            result[n++] = arr[i];
        }
        return result;
    }

    public static String[] reverseStingArray2(String[] arr) {
        List<String> rev = Arrays.asList(arr);
        Collections.reverse(rev);
        arr = (String[]) rev.toArray();
        return arr;
    }
}
