package Coding;

import java.util.ArrayList;
import java.util.List;

public class Character_findSpecialCharacters {
    public static void main(String[] args) {

        System.out.println(getSpecialCharacters("Mer.haba$%^&"));   // [., $, %, ^, &]
        findSpecialCharacters("Hello, World! 2024.");               // , ! .

    }

    public static void findSpecialCharacters(String input) {
        for (char c : input.toCharArray()) {
            if (!Character.isLetterOrDigit(c)) {
                System.out.print(c);
            }
        }
    }

    public static List<Character> getSpecialCharacters(String input) {
        List<Character> output = new ArrayList<>();
        for (char c : input.toCharArray()) {
            if (!Character.isLetterOrDigit(c)) {
                output.add(c);
            }
        }
        return output;
    }


}
