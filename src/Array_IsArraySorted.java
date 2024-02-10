// you will only check if an array is sorted ==> true or false

import java.util.Arrays;

public class Array_IsArraySorted {

    public static void main(String[] args) {
        int[] arr = {2, 3, 5, 4, 9};
        System.out.println(isArraySorted(arr));
        System.out.println(isArraySorted2(arr));
    }

    public static boolean isArraySorted(int[] nums) {
        int[] arr = Arrays.copyOf(nums, nums.length);
        Arrays.sort(arr);
        return Arrays.equals(arr, nums);
    }

    public static boolean isArraySorted2(int[] nums) {
        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i] > nums[i + 1])
                return false;
        }
        return true;
    }
}
