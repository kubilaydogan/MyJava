package Coding.Frequency;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Array_Frequency_of_a_Digit {
    public static void main(String[] args) {

        // occurrence of n in int[]

        int[] data = new int[]{5, 0, 0, 1, 0, 7, 4};
        System.out.println(frequencyOfDigit(data, 0));          // 3
        System.out.println(frequencyOfDigit2(data, 0));
    }

    public static int frequencyOfDigit(int[] arr, int n) {
        List<Integer> list = new ArrayList<>();
        for (int each : arr) {
            list.add(each);
        }
        return Collections.frequency(list, n);
    }


    public static int frequencyOfDigit2(int[] arr, int n) {
        int occurrence = 0;
        for (int each : arr) {
            if (each == n)
                occurrence++;
        }
        return occurrence;
    }



}
