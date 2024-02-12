package Coding;

public class Integer_SumOfDigits {
    /*
    write a function that can return the sum of digits of an integer Do not use any string manipulations
        Ex:
            input: 123
            output: 6
     */

    public static void main(String[] args) {
        System.out.println(sumOfDigits(123));
        System.out.println(sumOfDigits2(123));
    }

    public static int sumOfDigits(int number) {
        String numbers = String.valueOf(number);
        int sum = 0;
        for(char each : numbers.toCharArray()){
            sum += Integer.parseInt(each +"");
        }
        return sum;
    }

    public static int sumOfDigits2(int number) {
        int sum = 0;
        while (number > 0) {
            sum += (number % 10);
            number /= 10;
        }
        return sum;
    }

}
