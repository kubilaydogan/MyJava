package Coding;

public class String_Char_HarfKaydirma {
    public static void main(String[] args) {

        String str = "ABCDEF";      // Expected OUTPUT: BCDEFG
        System.out.println(solution(str));


        // Note:
        System.out.println( str.charAt(3)   );       // D
        System.out.println( str.charAt(3)+1 );       // 69
        System.out.println( (char) 69       );       // E
    }

    private static String solution(String str) {
        String target = "";
        for (int i = 0; i < str.length(); i++) {
            target += (char) (str.charAt(i) + 1);
        }
        return target;
    }
    // NOTE: int to char ==> char ch = (char) 6;
}
