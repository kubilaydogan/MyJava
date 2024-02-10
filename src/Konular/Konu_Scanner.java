package Konular;

import java.util.Scanner;

public class Konu_Scanner {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Enter name, gender, age and salary:");

        String name = scan.nextLine();
        char gender = scan.next().charAt(0);
        int age = scan.nextInt();
        double salary = scan.nextDouble();


        System.out.println("Name: " + name);
        System.out.println("Gender: " + gender);
        System.out.println("Age: " + age);
        System.out.println("Salary: " + salary);

        // ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~

        System.out.print("Enter a sentence:");
        String str = scan.nextLine();
        System.out.println(str);

        System.out.println("True of false?");
        boolean b = scan.nextBoolean();
        System.out.print("Enter a number: ");
        int n = scan.nextInt();
        System.out.print("Enter a word:");
        String word = scan.next();              // sadece ilk kelimeyi alir
        System.out.print("Phone numer:");
        long mobileNo = scan.nextLong();
        System.out.println("\n" +b + "\n" + n + "\n" + word + "\n" + mobileNo);

        scan.close();
    }
}
