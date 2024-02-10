package Reverse;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Array_Reverse_IntArray {

    // write a function that can reverse an array

    public static void main(String[] args) {

        int[] arr = {1, 2, 3, 4, 5, 6};
        System.out.println(Arrays.toString(reverse(arr)));       // [6, 5, 4, 3, 2, 1]
        System.out.println(Arrays.toString(reverse1(arr)));      // [6, 5, 4, 3, 2, 1]
        System.out.println(Arrays.toString(reverse2(arr)));      // [6, 5, 4, 3, 2, 1]
        System.out.println(reverse3(arr));                      // [6, 5, 4, 3, 2, 1]
    }

    public static int[] reverse(int[] arr) {
        List<Integer> list = new ArrayList<>();
        for(int each:arr){
            list.add(each);
        }
        Collections.reverse(list);
        return list.stream().mapToInt(i->i).toArray();
    }

    public static int[] reverse1(int[] arr){
        int[] result = new int[arr.length];
        for(int i = arr.length-1, j=0; i >= 0 ; i--, j++){
            result[j] = arr[i];
        }
        return result;
    }

    public static int[] reverse2(int[] arr){
        int[] result = new int[arr.length];
        int j = 0;
        for (int i = arr.length - 1; i >= 0; i--) {
            result[j++] = arr[i];
        }
        return result;
    }

    public static String reverse3(int[] arr){
        int[] result = new int[arr.length];
        for(int i = arr.length-1, j=0; i >= 0 ; i--, j++){
            result[j] = arr[i];
        }
        return Arrays.toString(result);
    }

}
