package Coding.Duplicate_Unique;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Array_RemoveDuplicates {

    /*
    Write a function that can remove the duplicates from an array of integers
     */

    public static void main(String[] args) {
        int[] arr = {2, 4, 6, 8, 2, 4, 6, 8};
        System.out.println(Arrays.toString(removeDuplicatesWithStream(arr)));
        System.out.println(Arrays.toString(removeDuplicates(arr)));         // [2, 4, 6, 8]
        System.out.println(Arrays.toString(removeDuplicates2(arr)));
    }

    //solution 1

    public static int[] removeDuplicates(int[] array) {
        Set<Integer> set = new HashSet<>();
        for (int each : array) {
            set.add(each);
        }
        int[] arr = new int[set.size()];
        int i=0;
        for(Integer each : set){
            arr[i++] = each;
        }
        return arr;
    }

    //solution 2
    public static int[] removeDuplicates2(int[] array) {
        ArrayList<Integer> list = new ArrayList<>();
        for (int each : array) {
            if (!list.contains(each)) {
                list.add(each);
            }
        }
        int[] arr = new int[list.size()];
        for (int i = 0; i < list.size(); i++) {
            arr[i] = list.get(i);
        }
        return arr;
    }

    // solution 3
    public static int[] removeDuplicatesWithStream(int[] array){
        return Arrays.stream(array).distinct().toArray();
    }





}
