package Coding.Duplicate_Unique_Common;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Array_CommonNumbers_String {
    public static void main(String[] args) {

        String[] arr1 = {"a", "b", "c", "d"};
        String[] arr2 = {"c", "d", "e", "f"};

        displayCommonStrings(arr1, arr2);                                          // void
        System.out.println(findCommonStrings(arr1, arr2));                         // return set
        System.out.println(Arrays.toString(findCommonStrings1(arr1, arr2)));       // return array

    }

    private static void displayCommonStrings(String[] arr1, String[] arr2) {
        Set<String> set = new HashSet<>();
        // Add all numbers from the first array to the set
        for (String each : arr1) {
            set.add(each);
        }
        System.out.print("Common elements: ");
        // Check each string in the second array against the set
        for (String each : arr2) {
            if (set.contains(each)) {
                System.out.print(each + " ");
            }
        }
    }

    private static Set findCommonStrings(String[] arr1, String[] arr2) {
        Set<String> set = new HashSet<>();
        Set<String> result = new HashSet<>();
        // Add all numbers from the first array to the set
        for (String each : arr1) {
            set.add(each);
        }
        // Check each number in the second array against the set
        for (String each : arr2) {
            if (set.contains(each)) {
                result.add(each);
            }
        }
        return result;
    }

    private static String[] findCommonStrings1(String[] arr1, String[] arr2) {
        Set<String> set = new HashSet<>();
        Set<String> result = new HashSet<>();
        // Add all strings from the first array to the set
        for (String each : arr1) {
            set.add(each);
        }
        // Check each string in the second array against the set
        for (String each : arr2) {
            if (set.contains(each)) {
                result.add(each);
            }
        }
        // Convert the result set to an array of strings
        return result.toArray(new String[0]);
    }





}
