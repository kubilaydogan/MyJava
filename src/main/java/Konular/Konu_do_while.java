package Konular;

public class Konu_do_while {

    // Create a method that can divide two numbers without using
    // division operators and Math class.
    public static void main(String[] args) {
        devide(13, 3);
        devide(13, 0);
        devide(13, -2);
    }

    static void devide(int n, int m) {
        if(m<=0){
            System.out.println("Invalid Number");
            return;
        }
        int count = 0;
        do {
            n -= m;
            count++;
        } while (n >= m);
        System.out.println("Result is: " + count + " and the remainder is " + n);
    }

}
