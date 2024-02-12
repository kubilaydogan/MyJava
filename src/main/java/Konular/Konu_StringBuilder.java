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
        sb.reverse();

        // ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
        int l = sb.length();
        char c = sb.charAt(0);

        // ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
        System.out.println(sb.capacity());    // 34
        sb.trimToSize();
        System.out.println(sb.capacity());    //  22
        // ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~

        StringBuilder sb1 = new StringBuilder("helloworld");
        sb1.insert(0, 'K');             // Khelloworld
        sb1.insert(1, 1);               // K1helloworld
        sb1.insert(2, ":");           // K1:helloworld
        sb1.replace(0, 3, "");    // helloworld
        sb1.setLength(5);                        // hello
        sb1.deleteCharAt(2);               // helo
        sb1.delete(1, 4);                        // h
        System.out.println(sb1);

    }
}
