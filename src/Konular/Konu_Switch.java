package Konular;

import java.util.Scanner;

public class Konu_Switch {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int statusCode = scan.nextInt();

        switch (statusCode) {
            case 200:
                System.out.println("OK (fulfilled)");
                break;
            case 401:
                System.out.println("unauthorized");
                break;
            case 403:
                System.out.println("forbidden");
                break;
            case 404:
                System.out.println("not found");
                break;
            case 500:
                System.out.println("server error");
                break;
            default:
                System.out.println("not supported status code");
                break;
        }

        // ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~ \\

        int x = 2;       // Integer, Byte, byte, short ...
        switch (x) {
            case 1:
                System.out.println("One");
                break;
            case 2:
                System.out.println("Two");
                break;
        }
    }
}
