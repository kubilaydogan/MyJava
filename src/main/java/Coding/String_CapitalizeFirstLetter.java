package Coding;

import java.util.Scanner;

public class String_CapitalizeFirstLetter {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter a string: ");
        System.out.println(capitalizeFirstLetter(s.nextLine()));       // Dikkat Dikkat
    }

    private static String capitalizeFirstLetter(String str) {
        String result = "";
        String[] arr = str.toLowerCase().split(" ");
        for (String each : arr) {
            result += Character.toUpperCase(each.charAt(0)) + each.substring(1) + " ";
        }
        return result.trim();
    }
}
