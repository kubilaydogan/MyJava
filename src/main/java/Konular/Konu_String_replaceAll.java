package Konular;

public class Konu_String_replaceAll {
    public static void main(String[] args) {
        String str = "Hi,    007 James Bond!!!";

        boolean hasLowerCaseChar = str.matches("(.*[a-z].*)"),
                hasUpperCaseChar = str.matches("(.*[A-Z].*)"),
                hasDigits = str.matches("(.*[0-9].*)"),
                hasSpecialChar = str.matches("(.*[ -/, :-@].*)");

        System.out.println(hasLowerCaseChar);
        System.out.println(hasUpperCaseChar);
        System.out.println(hasDigits);
        System.out.println(hasSpecialChar);

        // onlyNumbers
        str = str.replaceAll("[^0-9]", " ");
        System.out.println(str.trim());     // 007

        // removeDigits
        str = str.replaceAll("[0-9]", " ");
        // tek space'e düşürme
        str = str.replaceAll("\\s+", " ");
        // removeSpecialCharacters
        str = str.replaceAll("[^a-zA-Z0-9]", " ");
        // onlyLetters
        str = str.replaceAll("[^a-zA-Z]", " ");
        // removeWhatYouWant
        str = str.replaceAll("[?!.#$,]", " ");
        // onlyNumbers
        str = str.replaceAll("[\\D]+", " ");

    }
}
