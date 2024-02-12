package Konular.Collections_New;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Collections_List_Integer {
    public static void main(String[] args) {

        // ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
        Integer[] arr = {10, 20, 30, 40, 50};
        // int[] & char[] will not be accepted by list

        // ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
        // Initialization
        // ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
        List<Integer> list = new ArrayList<>();
        List<Integer> list2 = new ArrayList<>(Arrays.asList(5, 0, 0, 1, 0, 7, 4));
        List<Integer> list3 = new ArrayList<>(Arrays.asList(arr));
        List<Integer> list4 = Arrays.asList(5, 0, 0, 1, 0, 7, 4);
        List<Integer> list5 = Arrays.asList(arr);
        List<Integer> list6 = new ArrayList<>(list4);
        List list7 = new ArrayList();                  // Row Type

        // ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
        list.add(3);
        list.add(3);                          // allows dublicate values
        list.add(0, 2);
        list.add(0, null);
        System.out.println(list);             // [null, 2, 3, 3]

        list.remove(2);                 // [null, 2, 3]
        list.set(0, 1);                       // [1, 2, 3]

        int n = list.get(1);
        int s = list.size();

        Collections.reverse(list);            // [3, 2, 1]
        Collections.sort(list);              // [1, 2, 3]

        // Row Type
        list7.add(10);
        list7.add("hello");
        list7.add(5d);
        System.out.println(list7);      // [10, hello, 5.0]

        // ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
        // List to int[]
        // ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~

        int[] array = list4.stream().mapToInt(i->i).toArray();
    }
}
