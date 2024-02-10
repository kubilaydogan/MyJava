package Coding.Duplicate_Unique;

public class String_HasNoDuplicateCharacters {
    public static void main(String[] args) {
        System.out.println(hasUniqueChars("Kubilay"));
        System.out.println(hasUniqueChars("anne"));

        String word = "alphanumeric";
        System.out.println(hasUniqueChars(word));
    }

    public static boolean hasUniqueChars(String str) {
        return str.chars().distinct().count() == str.length();
    }
}
