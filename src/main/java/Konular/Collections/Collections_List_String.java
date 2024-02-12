package Konular.Collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Collections_List_String {
    public static void main(String[] args) {

        ArrayList<String> list = new ArrayList<>();
        /*  Basic Methods  */
        list.add("Ali");
        list.add("Lena");
        list.add("Kubilay");
        list.add(0, "Melisa");
        list.set(1, "Hidayet");         // update/change index 1
        String str = list.get(1);
        Collections.sort(list);                 // [Hidayet, Kubilay, Lena, Melisa]
        int i1 = list.indexOf("Hidayet");       // 0
        int i2 = list.indexOf("Ayfer");         // -1
        int size = list.size();                 // 4
        boolean b = list.contains("Lena");      // true
        boolean c = list.isEmpty();             // false
        list.remove("Kubilay");             // delete "Kubilay"
        list.remove(1);                  // delete index 1
        for (String each : list) {
            System.out.println(each);
        }
        list.addAll(list);
        list.addAll(3,list);             // Adding list1 into list starting from index 3
        list.clear();                           // []


        ArrayList<String> lst1 = new ArrayList<>(Arrays.asList("a","b","c","d"));
        ArrayList<String> lst2 = new ArrayList<>(Arrays.asList("a","b","c","d"));
        boolean k = lst1.equals(lst2);        // false ==> Bcos of 2 similar, but different objects


    }
}
