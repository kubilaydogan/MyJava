package Konular;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Konu_Arrays_sort {
    public static void main(String[] args) {

        int[] arr1 = {13, 7, 6, 45, 21, 9, 101, 102};
        Arrays.sort(arr1);                               // [6, 7, 9, 13, 21, 45, 101, 102]

        int[] arr2 = {13, 7, 6, 45, 21, 9, 2, 100};
        Arrays.sort(arr2, 1, 5);        // [13, 6, 7, 21, 45, 9, 2, 100]
        // Sorted index 1-4 ***

        // ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
        System.out.println(Arrays.toString(sortArrayInDescendingOrder(arr1)));
        // ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~

//        Integer[] arr = {13, 7, 6, 45, 21, 9, 2, 100};
//        Arrays.sort(arr, Collections.reverseOrder());  // [100, 45, 21, 13, 9, 7, 6, 2]
//
//        String[] names = {"MM", "LL", "AA", "HH","KK"};
//        Arrays.sort(names);                             // [AA, HH, KK, LL, MM]
//        Arrays.sort(names, Collections.reverseOrder()); // [MM, LL, KK, HH, AA]
//
//        List<Integer> list = Arrays.asList(5, 0, 2, 1, 6, 7, 4);
//        list.sort(Collections.reverseOrder());

        Integer[] arr = {13, 7, 6, 45, 21, 9, 2, 100};
        Arrays.sort(arr);
        Arrays.sort(arr, Collections.reverseOrder());

        String[] names = {"MM", "LL", "AA", "HH", "KK"};
        Arrays.sort(names);
        Arrays.sort(names, Collections.reverseOrder());

        List<Integer> list = Arrays.asList(5, 0, 2, 1, 6, 7, 4);
        Collections.sort(list);
        list.sort(Collections.reverseOrder());

        System.out.println(Arrays.toString(arr));
        System.out.println(Arrays.toString(names));
        System.out.println(list);

        // ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~`

        String name = "CyberZone @123";
        char[] nameChars = name.toCharArray();

        Arrays.sort(nameChars);
        System.out.println(Arrays.toString(nameChars));
        // [ , 1, 2, 3, C, Z, b, e, e, n, o, r, y]
        // array is sorted by ASCII Code value low to high
        // numbers >> special chars>> uppercase >> lowercase

        ArrayList<String> lst1 = new ArrayList<>(Arrays.asList("X", "a", "k", "1", "@", "2", "b", "D", "c"));
        Collections.sort(lst1);
        System.out.println("lst1: " + lst1);
    }

    // reverseOrder
    private static int[] sortArrayInDescendingOrder(int[] arr) {
        int[] result = new int[arr.length];
        int index = arr.length - 1;
        for (int each : arr) {
            result[index] = each;
            index--;
        }
        return result;
    }
}
