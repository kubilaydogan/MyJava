package Coding;

import java.util.Arrays;

class Array2D_SumOfRows {
    // Complete the method so that it takes in a 2-D array
    // and returns the sums of the rows as an integer array.
    //EXPECTED RESULT = {4,6,11,3}

    public static void main(String[] args) {
        int[][] arr = {
                {1, 1, 2}, //sum = 4
                {3, 1, 2}, //sum = 6
                {3, 5, 3}, //sum = 11
                {0, 1, 2}  //sum = 3
        };

        System.out.println(Arrays.toString(rowSums(arr)));        // [4, 6, 11, 3]

    }

    public static int[] rowSums(int[][] nums) {
        int[] arr = new int[nums.length];   // rows
        int sum = 0;
        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums[i].length; j++) {    // columns
                sum += nums[i][j];
            }
            arr[i] = sum;
            sum = 0;
        }
        return arr;
    }
}
