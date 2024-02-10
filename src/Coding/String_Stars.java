package Coding;

public class String_Stars {
    public static void main(String[] args) {

        printStars(6);

    }

    private static void printStars(int rows) {
        int stars = 1;
        for (int r = 0; r < rows; r++) {
            for (int i = 0; i < stars; i++) {
                System.out.print("* ");
            }
            stars++;
            System.out.println();
        }
    }
}
/*
        *
        * *
        * * *
        * * * *
        * * * * *
        * * * * * *

 */