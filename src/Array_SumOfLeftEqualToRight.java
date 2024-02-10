public class Array_SumOfLeftEqualToRight {
    /*
    Given an array of integers, write a function to return the item in the array,
    where the sum of all items on its left is equal to the sum of the ones on the right.
    For example:    Given [4, 9, 1, 3, 6, 4]
                    your function should give item 1, because 4+9 = 3+6+4              */

    public static void main(String[] args) {
        int[] arr = {4, 9, 1, 3, 6, 4};
        System.out.println(equilibrium(arr));
        System.out.println(equilibrium2(arr));

    }

    public static int equilibrium(int[] array) {
        int result = 0;

        for (int i = 1; i < array.length; i++) {
            int sumOfLeft = 0;
            int sumOfRight = 0;

            for (int j = 0; j < i; j++) {
                sumOfLeft += array[j];
            }

            for (int k = i + 1; k < array.length; k++) {
                sumOfRight += array[k];
            }

            if (sumOfLeft == sumOfRight) {
                result = array[i];
            }
        }
        return result;
    }

    public static int equilibrium2(int[] array) {
        int result = 0;
        int sumOfLeft = 0;
        int sumOfRight = 0;
        int i = 0;
        int j = array.length - 1;
        do {
            sumOfLeft += array[j];
            sumOfRight += array[j];
            if (sumOfLeft == sumOfRight) {
                result = array[i];
            }
            j--;
            i++;
        } while (i<j);
        return result;
    }
}
