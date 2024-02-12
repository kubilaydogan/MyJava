package Konular;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class Konu_Character {
    public static void main(String[] args) {

        assertTrue(Character.isDigit('7'));
        assertTrue(Character.isLetter('a'));
        assertTrue(Character.isAlphabetic('a'));

        assertTrue(Character.isLowerCase('a'));
        assertTrue(Character.isUpperCase('A'));

        assertTrue(Character.isWhitespace(' '));

        int n = Character.getNumericValue('9');     // n= 9

        System.out.println(getSum("D75"));

    }

    static int getSum(String str) {
        int sum = 0;
        for (char each : str.toCharArray()) {
            if (Character.isDigit(each)) {
              //sum += Integer.parseInt(each + "");
                sum += Character.getNumericValue(each);
            }
        }
        return sum;
    }
}
