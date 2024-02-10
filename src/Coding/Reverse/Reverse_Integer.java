package Coding.Reverse;

public class Reverse_Integer {

    public static void main(String[] args) {
        System.out.println(reverse(456));

    }

    public static int reverse(int number) {
        String num = String.valueOf(number);
        String rev = new StringBuilder(num).reverse().toString();
        return Integer.parseInt(rev);
    }

    public static int reverse2(int number) {
        if (number < 10 && number >= 0) {
            return number;
        }
        int result = 0;
        while (number != 0) {
            result = result * 10 + number % 10;
            number /= 10;
        }
        return result;
    }


}
