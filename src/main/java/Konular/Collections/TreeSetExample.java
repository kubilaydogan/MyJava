package Konular.Collections;

import java.util.SortedSet;
import java.util.TreeSet;

public class TreeSetExample {
    public static void main(String[] args) {

        // Collection >> Set >> SortedSet  : SortedSet interface extends Set interface

        TreeSet<Integer> set = new TreeSet<>();
        set.add(23);
        set.add(23);
        set.add(3);
        set.add(3);
        set.add(13);
        set.add(20);
        set.add(-230);

        System.out.println(set);      // [-230, 3, 13, 20, 23]
        System.out.println( set.size() );

        // GETTING LOWERST ELEMENT
        System.out.println("LOWEST ELEMENT  : " + set.first());

        // GETTING HIGHEST ELEMENT
        System.out.println("HIGHEST ELEMENT  : " + set.last());


        // GETTING THE VIEW OUT OF THE SET -- subset middle view
        SortedSet<Integer> myView = set.subSet(3, 21) ;
        System.out.println( myView );           // [3, 13, 20]

        // GETTING THE VIEW OUT OF THE SET -- headSet  from beginning till a value
        SortedSet<Integer> myView2 = set.headSet(13);
        System.out.println(myView2);    // [-230, 3]

        System.out.println( set.headSet(13,true)   ); // 13 will be included [-230, 3, 13]

        // GETTING THE VIEW OUT OF THE SET -- tailSet  from middle till the end
        SortedSet<Integer> myView3 = set.tailSet(13);
        System.out.println(myView3);    // [13, 20, 23]


    }
}
