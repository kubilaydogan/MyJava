package Konular.Collections;

import java.util.*;

public class Collections_List {
    public static void main(String[] args) {

        Integer[] arr = {10, 20, 30, 40, 50};

        List<Integer> li = Arrays.asList(5, 0, 0, 1, 0, 7, 4);
        int[] a = li.stream().mapToInt(i->i).toArray();

        List<Integer> list = new ArrayList<>();
        List<Integer> list2 = new ArrayList<>(Arrays.asList(5, 0, 0, 1, 0, 7, 4));
        List<Integer> list3 = new ArrayList<>(Arrays.asList(arr));
        List<Integer> list4 = Arrays.asList(5, 0, 0, 1, 0, 7, 4);
        List<Integer> list5 = Arrays.asList(arr);      // int[] will not work as its requires Integer
        List<Integer> list6 = new ArrayList<>(list4);
        List list7 = new ArrayList();                  // Row Type

        list.add(3);
        list.add(3);                          // allows dublicate values
        list.add(0, 2);
        list.add(0, null);
        System.out.println(list);             // [null, 2, 3, 3]
        list.remove(2);                 // [null, 2, 3]
        list.set(0, 1);                       // [1, 2, 3]
        System.out.println(list);
        int n = list.get(1);
        int s = list.size();

        Collections.reverse(list);            // [3, 2, 1]
        Collections.sort(list);              // [1, 2, 3]

        // Row Type
        list7.add(10);
        list7.add("hello");
        list7.add(5d);
        System.out.println(list7);      // [10, hello, 5.0]

        /* Eliminate DUPLICATES from LIST */
        List<String> ls = new ArrayList<>(Arrays.asList("A","B","C","D", "B", "C"));
        Set<String> set = new HashSet<>(ls);
        List newList = new ArrayList(set);

        boolean b = list.contains("B");
        int i = list.indexOf("A");

        list.remove(0);
        list.remove("D");

        if(!ls.remove("F")){
            System.out.println("\"F\" not found in the list");
        }

    }
}
