package Konular;

public class Konu_String {
    public static void main(String[] args) {

        // concat()
        String str1 = "Kubilay ";
        String str2 = "Dogan";

        str1 = str1.concat(str2);
        System.out.println(str1);

        // compare
        String word = "Dogan";
        boolean b1 = word.contains("dogan");
        boolean b2 = word.equals("dogan");
        boolean b3 = word.equalsIgnoreCase("dogan");

        System.out.println(b1);     // false
        System.out.println(b2);     // false
        System.out.println(b3);     // true

        // equal
        String a = "Hello";
        String b = "Hello";

        System.out.println(a == b);         // true  --> referencing same object
        System.out.println(a.equals(b));  // true  --> same content

        // == is used:
        //  (1) to compare primitive values
        //  (2) to determine if 2 references are pointing the same object

        String c = new String("Hello");     // referencing different object
        System.out.println(a == c);                // false
        System.out.println(a.equals(c));           // true  --> same content


    }
}
