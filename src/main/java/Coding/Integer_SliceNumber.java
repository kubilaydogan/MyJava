package Coding;

public class Integer_SliceNumber {
    public static void main(String[] args) {

        int num = 81295;
        int digit1, digit2, digit3, digit4, digit5;

        digit5 = num - ((num / 10) * 10);
        num = num / 10;
        digit4 = num - ((num / 10) * 10);
        num = num / 10;
        digit3 = num - ((num / 10) * 10);
        num = num / 10;
        digit2 = num - ((num / 10) * 10);
        num = num / 10;
        digit1 = num - ((num / 10) * 10);

        System.out.println(digit1 + "\n" + digit2 + "\n" + digit3 + "\n" + digit4 + "\n" + digit5);

    }
}
