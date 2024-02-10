package Coding;

public class Integer_findDigitCount {
    public static void main(String[] args) {
        int check = 12321;
        System.out.println(digits(check));
        System.out.println(digits2(check));

    }

    static int digits(int n) {
        return String.valueOf(n).length();
    }

    static int digits2(int n) {
        int result = 0;
        do {
            n = n / 10;
            result++;
        } while (n != 0);
        return result;
    }
}
