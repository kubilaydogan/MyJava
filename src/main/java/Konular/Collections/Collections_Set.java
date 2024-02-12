package Konular.Collections;

import java.util.*;

public class Collections_Set {
    public static void main(String[] args) {

        Set<String> set = new HashSet<>();
        set.add("Hello");
        set.add("Hello");
        set.add("Hi");

        System.out.println(set);            // [Hi, Hello]  --> UNORDERED
        boolean d = set.contains("Hello");  // true
        set.remove("Hello");

        if(set.remove("Hi")){
            System.out.println("\"Hi\" is removed");
        }
        System.out.println(set);            // []
        set.add(null);
        System.out.println(set);            // [null]
        set.clear();
        System.out.println(set);            // []

        if(set.isEmpty()){
            //...
        }

        List<String> list = Arrays.asList("23","23","a","a","t","t");
        set.addAll(list);
        System.out.println(set);        // [23, a, t]

        // or

        Set<String> mySet = new HashSet<>(list);

        // ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~

        List<Integer> list1 = Arrays.asList(3,3,3,4,7,5,33,35);
        List<Integer> list2 = Arrays.asList(3,3,3,3,3,5,33,34);

        Set<Integer> mySet1 = new TreeSet<>(list1);     // [3, 4, 5, 7, 33, 35] - TreeSet is ordered
        Set<Integer> mySet2 = new HashSet<>(list2);     // [33, 34, 3, 5]   - HashSet does not care about order


    }
}
