package Coding;

import java.util.Scanner;

public class Scanner_addNumbers {
    public static void main(String[] args) {

        addNumbers(100);
    }

    public static int addNumbers(int limit) {
        System.out.println("Enter some numbers to add: ");
        Scanner scanner = new Scanner(System.in);
        int count = 0;
        while (scanner.hasNext()) {
            count = count + scanner.nextInt();
            System.out.println(count);
            if (count > limit) {
                System.out.println("Max exceeded!");
                break;
            }
        }
        return count;
    }
}
