import java.util.Arrays;

public class Array_FindMax_Min {
    public static void main(String[] args) {

        int[] arr = {3, 74, 8, 12, 25, 56};
        System.out.println(getMaxNumberFromArray(arr));
        System.out.println(maxValue(arr));
        System.out.println(minValue(arr));
    }

    static int getMaxNumberFromArray(int[] arr) {
        Arrays.sort(arr);
        return arr[arr.length - 1];
    }

    static int maxValue(int[] n) {
        int max = Integer.MIN_VALUE;
        for (int each : n)
            if (each > max)
                max = each;
        return max;
    }

    static int minValue(int[] n) {
        int min = Integer.MAX_VALUE;
        for (int each : n) {
            if (each < min) {
                min = each;
            }
        }
        return min;
    }
}
