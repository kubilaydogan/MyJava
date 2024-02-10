package Coding.Reverse;

public class ReverseNumber {
    public static void main(String[] args) {

        int n = 12345;
        System.out.println(reverseNumber(n));
    }

    // int n = 12345; ==> 54321
    public static int reverseNumber(int n) {
        String number = String.valueOf(n);
        StringBuilder sb = new StringBuilder(number);
        sb.reverse();
        return Integer.parseInt(sb.toString());
    }

    // or
    public static int reverse(int number) {
        String num = String.valueOf(number);
        String rev = new StringBuilder(num).reverse().toString();
        return Integer.parseInt(rev);
    }

    // without using StringBuilder
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
