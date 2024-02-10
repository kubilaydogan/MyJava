package _Konular;

public class Konu_Character {
    public static void main(String[] args) {
        String str = "D75";

        System.out.println(Character.isAlphabetic(str.charAt(0))); // true
        System.out.println(Character.isDigit(str.charAt(1)));

        System.out.println(getSum(str));


    }

    static int getSum(String str) {
        int sum = 0;
        for (char each : str.toCharArray()) {
            if (Character.isDigit(each)) {
                sum += Integer.parseInt(each + "");
            }
        }
        return sum;
    }

}
