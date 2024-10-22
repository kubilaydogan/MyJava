package Konular;

import java.util.Arrays;

public class Konu_BooleanArray {
    public static void main(String[] args) {

        boolean[] arr = new boolean[5];
        System.out.println(Arrays.toString(arr));  // [false, false, false, false, false]

        Boolean[] arr1 = new Boolean[5];
        System.out.println(Arrays.toString(arr1));  // [null, null, null, null, null]

    }
}
