package Coding;

public class String_CreditCard {
    public static void main(String[] args) {

        String cc = "34296018534982067541";     // 20 digits
        System.out.println(ccaformat(cc));      // 3429 6018 5349 8206 7541

    }

    private static String ccaformat(String cc) {
        String result = "";
        for (int i = 0; i < cc.length(); i+=4) {
            result = result + cc.substring(i, i + 4) + " ";
        }
        return result.trim();
    }
}
