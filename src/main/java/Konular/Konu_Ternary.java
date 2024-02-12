package Konular;

public class Konu_Ternary {
    public static void main(String[] args) {

        identify(5);

        StringBuilder myPet = new StringBuilder("Fluffy");
        StringBuilder yourPet = new StringBuilder("Fluffy");
        System.out.println(myPet == yourPet ? "same" : "different");        // different
        System.out.println(myPet.equals(yourPet) ? "same" : "different");   // different
        System.out.println(myPet.toString().contentEquals(yourPet) ? "same" : "different");   // same

    }

    // variable = (condition) ? expressionTrue :  expressionFalse;

    public static void identify(int n) {
        System.out.println(n % 2 == 0 ? "Even" : "Odd");
    }
}
