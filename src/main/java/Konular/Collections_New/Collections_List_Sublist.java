package Konular.Collections_New;

import java.security.PrivilegedExceptionAction;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Collections_List_Sublist {
    public static void main(String[] args) {

        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 6, 7);

        // changes in a sublist effects original list as sublist does not create a new list
        List<Integer> range = list.subList(1, 3);
        System.out.println(range);             // [2, 3]

        range.set(0, 20);
        range.set(1, 30);

        System.out.println(list);              // [1, 20, 30, 4, 5, 6, 7]

        //  ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~

        ArrayList<Integer> list1 = new ArrayList<>(Arrays.asList(10,20,30,40));
        ArrayList<Integer> list2 = list1;
        list1.remove(3);
        System.out.println(list1);          // [10, 20, 30]
        System.out.println(list2);          // [10, 20, 30]

    }
}
