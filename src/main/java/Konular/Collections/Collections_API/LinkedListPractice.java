package Konular.Collections.Collections_API;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class LinkedListPractice {

    public static void main(String[] args) {
        List<Integer> list1 = new ArrayList<>();
        List<Integer> list2 = new LinkedList<>();


        list2.add(2); list2.add(2);
        list2.add(5); list2.add(8);
        //list2.add(5L); ERROR
        //list2.add(5f);  ERROR

        for (int i=0; i<list2.size(); i++){
            System.out.print(list2.get(i) + " | ");     // 2 | 2 | 5 | 8 |
        }

        System.out.println(list2);           // [2, 2, 5, 8]
        list2.remove(2);
        System.out.println(list2);                      // [2, 2, 8]
        list2.remove(Integer.valueOf(2));
        System.out.println(list2);                      // [2, 8]

        List<Long> list3 = new LinkedList<>();
        list3.add(1L);
        list3.add(50L);
        list3.add(80L);
        list3.add(10L);
        System.out.println(list3);                  // [1, 50, 80, 10]
        list3.remove(1L);
        System.out.println(list3);                  //[50, 80, 10]
        list3.remove(1);
        System.out.println(list3);                  // [50, 10]
        // list3.add(8);    ERROR =>> We cannot pass a int value


    }
}
