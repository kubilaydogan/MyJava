import java.util.Arrays;

public class Array_MoveAllZerosToTheEnd {
    public static void main(String[] args) {

        int[] arr = {5, 0, 0, 1, 0, 7, 4};
        System.out.println(Arrays.toString(moveZerosToTheEnd(arr)));  // [5, 1, 7, 4, 0, 0, 0]

        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));   // [0, 0, 0, 1, 4, 5, 7]
    }

    static int[] moveZerosToTheEnd(int[] array) {

        int[] result = new int[array.length];
        int i = 0;
        for (int each : array) {
            if (each != 0)
                result[i++] = each;
        }
        return result;
    }


}
