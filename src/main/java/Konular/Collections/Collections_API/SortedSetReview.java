package Konular.Collections.Collections_API;

import java.util.Comparator;
import java.util.SortedSet;
import java.util.TreeSet;

public class SortedSetReview {
    public static void main(String[] args) {

        //Comparator<String> revStrCom = Collections.reverseOrder();
        Comparator<String> revStrCom = Comparator.reverseOrder();


        SortedSet<String> sSet = new TreeSet<>();

        sSet.add("Secil");
        sSet.add("Emine");
        sSet.add("Kubi");
        sSet.add("Emine");
        sSet.add("Emine");
        sSet.add("Ulku");

        System.out.println(sSet);       // [Emine, Kubi, Secil, Ulku]

        sSet.forEach(each -> System.out.println(each));
        //Emine
        //Kubi
        //Secil
        //Ulku

    }
}
