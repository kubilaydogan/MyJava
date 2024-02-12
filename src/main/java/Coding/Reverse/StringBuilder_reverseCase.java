package Coding.Reverse;

public class StringBuilder_reverseCase {
    public static void main(String[] args) {
        System.out.println(reverseCase("HI dogan"));            // hi DOGAN
        System.out.println(reverseCase("hEllO"));               // HeLLo
        System.out.println(reverseCase("--hEl3lO--"));          // --HeL3Lo--
    }


    // "hEllO" ==> HeLLo
    public static String reverseCase(String text) {
        StringBuilder sb = new StringBuilder(text);
        for (int i = 0; i < text.length(); i++) {
            if (Character.isUpperCase(sb.charAt(i))) {
                sb.insert(i, Character.toLowerCase(sb.charAt(i)));
                sb.deleteCharAt(i+1);
            }else if(Character.isLowerCase(sb.charAt(i))) {
                sb.insert(i, Character.toUpperCase(sb.charAt(i)));
                sb.deleteCharAt(i+1);
            }
        }
        return sb.toString();
    }

}
