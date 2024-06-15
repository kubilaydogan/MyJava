package Coding.Duplicate_Unique_Common;

import java.util.HashSet;
import java.util.Set;

public class Array_CommonNumbers_Int {
    public static void main(String[] args) {

        int[] array1 = {1, 2, 3, 4, 5};
        int[] array2 = {3, 4, 5, 6, 7};

        System.out.println(findCommonNumbers2(array1, array2));
        findCommonNumbers(array1, array2);

    }

    public static void findCommonNumbers(int[] array1, int[] array2) {
        Set<Integer> set = new HashSet<>();
        // Add all numbers from the first array to the set
        for (int number : array1) {
            set.add(number);
        }

        System.out.print("Common numbers: ");
        // Check each number in the second array against the set
        for (int number : array2) {
            if (set.contains(number)) {
                System.out.print(number + " ");
            }
        }
    }

    public static Set findCommonNumbers2(int[] array1, int[] array2) {
        Set<Integer> set = new HashSet<>();
        Set<Integer> result = new HashSet<>();
        // Add all numbers from the first array to the set
        for (int number : array1) {
            set.add(number);
        }
        // Check each number in the second array against the set
        for (int number : array2) {
            if (set.contains(number)) {
                result.add(number);
            }
        }
        return result;
    }
}
