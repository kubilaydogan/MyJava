package Konular.Collections_New;

import java.util.*;

public class Collections_List_String {
    public static void main(String[] args) {

        ArrayList<String> list = new ArrayList<>();
        list.add("Z");
        list.add("V");
        list.add("A");
        list.add(0, "J");
        list.set(1, "A");                   // [J, A, V, A]

        System.out.println(list);

        String str = list.get(1);
        int size = list.size();                 // 4

        int i = list.indexOf("A");              // 1
        int j = list.lastIndexOf("A");       // 3
        int z = list.indexOf("K");              // -1

        boolean b = list.contains("J");         // true
        boolean c = list.isEmpty();             // false

        list.remove("J");                   // delete "Kubilay"
        list.remove(0);                  // delete index 1
        System.out.println(list);               // [V, A]

        String s = list.remove(1);        // index ==> returns String   (s = "A")
        boolean d = list.remove("V");        // returns boolean


        // ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~

        List<String> lst = new ArrayList<>(Arrays.asList("A","B","C","D", "B", "C"));

        /* Eliminate DUPLICATES from LIST */
        Set<String> set = new HashSet<>(list);
        List newList = new ArrayList(set);

        if(!list.remove("F")){
            System.out.println("\"F\" not found in the list");
        }

        lst.addAll(list);
        lst.addAll(3,list);             // Adding list into list starting from index 3
        lst.clear();                           // []

        ArrayList<String> lst1 = new ArrayList<>(Arrays.asList("a","b","c","d"));
        ArrayList<String> lst2 = new ArrayList<>(Arrays.asList("a","b","c","d"));

        boolean b1 = lst1.equals(lst2);             // true
        boolean b2 = lst1.containsAll(lst2);        // true

    }
}
