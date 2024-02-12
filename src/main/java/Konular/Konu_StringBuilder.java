package Konular;

public class Konu_StringBuilder {
    public static void main(String[] args) {

        // 3 ways to instantiate a StringBuilder
        StringBuilder sb = new StringBuilder();
        StringBuilder a = new StringBuilder("black");        // --> predefined content
        StringBuilder b = new StringBuilder(100);   // --> capacity

        // StringBuilder to String
        String str = sb.toString();


        // methods
        a.append("tea");
        a.append('s');
        a.append(7);
        a.append(3.16F);
        System.out.println(a);           // blackteas73.16       --or--

        sb.append("String" + true + 123 + 0.5 + 'c' + 1.235f);          // Stringtrue1230.5c1.235

        // ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
        int l = sb.length();
        char c = sb.charAt(0);
        sb.delete(15,23);                      // Stringtrue1230.
        sb.deleteCharAt(14);                   // Stringtrue1230
        sb.reverse();
        System.out.println(sb);                // 0321eurtgnirtS
        sb.insert(0, 'K');           // K0321eurtgnirtS
        sb.insert(2, 1);              // K01321eurtgnirtS
        sb.replace(5, 16,"");   // K0132
        sb.setLength(3);                       // K01

        System.out.println(sb);
        // ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
        System.out.println(sb.capacity());    // 34
        sb.trimToSize();
        System.out.println(sb.capacity());    //  22
        // ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~


    }
}
