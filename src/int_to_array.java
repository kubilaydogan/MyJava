import java.util.Arrays;

public class int_to_array {

    public static void main(String[] args) {
        int n =119955;
        System.out.println(Arrays.toString(intToIntArray(n)));      // [1, 1, 9, 9, 5, 5]
    }

    // int n =119955; ==> [1, 1, 9, 9, 5, 5]
    static int[] intToIntArray(int n) {
        String numbers = String.valueOf(n);
        int[] arr = new int[numbers.length()];
        int i=0;
        for(String each : numbers.split("")){
            arr[i++]=Integer.parseInt(each);
        }
        return arr;
    }

    static int[] intToIntArray2(int n) {
        int totalDigits = String.valueOf(n).length();
        int[] arr = new int[totalDigits];

        for(int i = totalDigits-1; i>=0; i--){      // Arrays.sort(arr) yapsak sayilar karisir
            arr[i] = n - (n/10) * 10;
            n = n/10;
        }
        return arr;
    }
}
