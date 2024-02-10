package Coding;

public class String_getnumbersFromString {
    public static void main(String[] args) {

        String str = "9online132x";

        System.out.println(sum(str));               // 15
        System.out.println(getNumbers(str));        // 9132
    }

    private static String getNumbers(String str) {
        String output = "";
        char[] ch = str.toCharArray();
        for (char each : ch) {
            if (Character.isDigit(each))
                output += each + "";
        }
        return output;
    }

    static int sum(String s) {
        int sum = 0;
        char[] ch = s.toCharArray();
        for (char each : ch) {
            if (Character.isDigit(each))
                sum += Integer.parseInt(each + "");
        }
        return sum;
    }

}
