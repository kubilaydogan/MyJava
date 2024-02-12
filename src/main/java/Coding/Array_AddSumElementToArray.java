package Coding;

import java.util.Arrays;

public class Array_AddSumElementToArray {
    public static void main(String[] args) {

        int[] arr = {1,23,4,5,6};
        System.out.println(Arrays.toString(addSum(arr)));           // [1, 23, 4, 5, 6, 39]
    }

    public static int[] addSum(int[] arr) {
        int[] output = Arrays.copyOf(arr,arr.length+1);
        int count =0;
        for (int each: arr) {
            count += each;
        }
        output[output.length-1] = count;
        return output;
    }
}
