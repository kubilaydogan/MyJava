package Konular_Level2.Functional_Interfaces.D01_Functional_Interface;

public class Test {
    public static void main(String[] args) {

        StringFunctions longestString = (s1, s2) -> {
            if (s1.length() > s2.length())
                return s1;
            return s2;
        };

        System.out.println(longestString.function("Java", "C#"));

        /*  *   *   *   *   *   *   *   *   *   *   *   *   *   *   *   */

        DataFunction<String> reverse = s -> new StringBuilder(s).reverse().toString();
        DataFunction<String> reverse2 = (s) -> new StringBuilder(s).reverse().toString();
        DataFunction<String> reverse3 = s -> {
            // birden fazla line tutacaksa kodlama { } kullanilir
            String result = "";
            for (int i = s.length() - 1; i >= 0; i--)
                result += s.charAt(i);
            return result;
        };

        System.out.println(reverse.function("dogan"));

        /*  *   *   *   *   *   *   *   *   *   *   *   *   *   *   *   */

        DataFunction<Integer> cube = n -> n*n*n;
        System.out.println( cube.function(3));

    }
}
