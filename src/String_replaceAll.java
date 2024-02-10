public class String_replaceAll {
    public static void main(String[] args) {

        String sentence = "Hi, 007 James Bond!!!";
        System.out.println(removeSpecialCharacters(sentence));         // Hi 007 James Bond
        System.out.println(onlyLetters(sentence));                      // Hi James Bond
        System.out.println(removeDigits(sentence));                     // Hi, James Bond!!!
        System.out.println(removeWhatYouWant(sentence));                // Hi 007 James Bond
        System.out.println(removeWhatYouWant2(sentence));               // Hi James Bond

        /*
        // tek space'e düşürme
        str = str.replaceAll("\\s+", " ");
        // removeSpecialCharacters
        str = str.replaceAll("[^a-zA-Z0-9]", " ");
        // onlyLetters
        str = str.replaceAll("[^a-zA-Z]", " ");
        // removeDigits
        str = str.replaceAll("[0-9]", " ");
        // removeWhatYouWant
        str = str.replaceAll("[?!.#$,]", " ");
        */

    }

    public static String removeSpecialCharacters(String str) {
        str = str.replaceAll("[^a-zA-Z0-9]", " ");
        str = str.replaceAll("\\s+", " ");
        return str.trim();
    }

    public static String removeDigits(String str) {
        str = str.replaceAll("[0-9]", " ");
        str = str.replaceAll("\\s+", " ");
        return str.trim();
    }

    public static String onlyLetters(String input) {
        input = input.replaceAll("[^a-zA-Z]", " ");         // keep only letters
        input = input.replaceAll("\\s+", " ");              // remove multiple spaces
        return input.trim();
    }

    public static String removeWhatYouWant(String input){
        input = input.replaceAll("[?!.#$,]", " ");          // Specify what u want to remove
        input = input.replaceAll("\\s+", " ");
        return input;
    }

    public static String removeWhatYouWant2(String input){
        input = input.replaceAll("[,!\\d]", " ");
        input = input.replaceAll("\\s+", " ");
        return input;
    }
}
