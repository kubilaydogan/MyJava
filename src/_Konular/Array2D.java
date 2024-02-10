package _Konular;

import java.util.Arrays;

public class Array2D {
    public static void main(String[] args) {

        int[][] arr = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};

        System.out.println(Arrays.deepToString(arr));       // [[1, 2, 3], [4, 5, 6], [7, 8, 9]]
        System.out.println(arr[2][2]);                      // 0
        // ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
        int[][] array = new int [2][3];     // [row][column]
        System.out.println(Arrays.deepToString(array));     // [[0, 0, 0], [0, 0, 0]]

        array[1][2] = 2;
        System.out.println(Arrays.deepToString(array));     // [[0, 0, 0], [0, 0, 2]]

        array[0][2] = arr[2][2];
        System.out.println(Arrays.deepToString(array));     // [[0, 0, 9], [0, 0, 2]]

        // ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~

        int[][] nums = new int[5][];                        // sadece ilk değer de girilebilir
        System.out.println(Arrays.deepToString(nums));      // [null, null, null, null, null]

        // ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~

        /* COMPARE */
        int[][] x = { { 4, 2, 8 }, { 3, 1, 5 } };
        int[][] y = { { 4, 2, 8 }, { 3, 1, 5 } };

        System.out.println(Arrays.deepEquals(x,y));         // true

        // ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~

        /* ITEARTION */
        for (int row = 0; row < arr.length; row++) {
            for (int column = 0; column < arr[row].length; column++) {
                System.out.print(arr[row][column]);
            }
            System.out.println();
        }

    }
}
