package Coding.Reverse;

public class String_Reverse_a_word {

        /*
        Write a function that can reverse String
            Ex: Coding.Reverse("ABCD"); ==> DCBA
         */

    public static void main(String[] args) {
        System.out.println( reverse("USA") );
        System.out.println( reverse2("TEAM") );
    }

    public static String reverse(String str) {
        return new StringBuilder(str).reverse().toString();
    }

    public static String reverse2(String str) {
        String reverse = "";
        for (int i = str.length() - 1; i >= 0; i--) {
            reverse += str.charAt(i);
        }
        return reverse;
    }





}
