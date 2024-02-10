package Konular.Collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Collections_Collection {
    public static void main(String[] args) {

/*
    The root interface in the collection hierarchy.
    This interface is a member of the Java Collections Framework.

    Methods from Collection
    *** Query Operations ***
        int size();
        boolean isEmpty();
        boolean contains(Object o);

    *** Modification Operations ***
        boolean add(E e);
        boolean remove(Object o);

    *** Bulk Operations ***
        boolean containsAll(Collection<?> c);
        boolean addAll(Collection<? extends E> c);
        boolean removeAll(Collection<?> c);
        boolean removeIf(Predicate<? super E> filter) {
        boolean retainAll(Collection<?> c);
        clear();

    *** Comparison ***
        boolean equals(Object o);

        All the methods of this class throw the NullPointerException
        if the collection or object passed to the methods is null.

*/
        String[] arr = {"D", "B", "A", "C", "E"};
        List<String> list = new ArrayList<>();

        Collections.addAll(list, arr);
        Collections.addAll(list, "X", "Y","Z");

        Collections.sort(list);                 // [A, B, C, D, E, X, Y, Z]
        Collections.reverse(list);              // [Z, Y, X, E, D, C, B, A]

        int n = Collections.frequency(list,"A");        // n=1

        /* ******* ******* addAll ******* ******* */
        ArrayList<Integer> list1 = new ArrayList<>(Arrays.asList(1, 2, 3, 4));
        ArrayList<Integer> list2 = new ArrayList<>(Arrays.asList(5, 6));

        Integer[] array = {16, 17, 18};

        list1.addAll(list2);                            // [1, 2, 3, 4, 5, 6]
        list1.addAll(2, list2);                   // [1, 2, 5, 6, 3, 4, 5, 6]
        list1.addAll(4, Arrays.asList(7, 8));     // [1, 2, 5, 6, 7, 8, 3, 4, 5, 6]
        System.out.println(list1);
        list1.addAll(Arrays.asList(array));             // [1, 2, 5, 6, 7, 8, 3, 4, 5, 6, 16, 17, 18]

        System.out.println(list1);

        /* ******* ******* containsAll ******* ******* */
        boolean r1 = list1.contains(1);
        boolean r2 = list1.contains(5);
        boolean r3 = list1.contains(10);
        boolean result1 = r1 == true && r2 == true && r3 == true;
        System.out.println(result1);        // false

        boolean result = list1.containsAll(Arrays.asList(5, 6, 16));               // true
        Integer[] data = {4, 8, 12};
        boolean result2 = list1.containsAll(Arrays.asList(data));                   // false

        /* ******* ******* removeAll ******* ******* */

        list1.removeAll(Arrays.asList(13, 14, 15));             // list1.removeAll(Arrays.asList(arr));

        // remove all Ahmed's
        String[] namess = {"Ahmed", "John", "Aaron", "Ahmed", "Daniel", "Ahmed", "Ahmed"};

        ArrayList<String> nameList = new ArrayList<>( Arrays.asList(namess) );
        nameList.removeAll(  Arrays.asList("Ahmed")  );
        System.out.println(nameList);                      // [John, Aaron, Daniel]

        /* ******* ******* retainAll ******* ******* */

        ArrayList<Integer> lst = new ArrayList<>();
        lst.addAll( Arrays.asList(1,2,3,4,5,6,1,2,3) );

        lst.retainAll( Arrays.asList(1,2,3) );
        //{4,5,6}, {1,2,3, 1,2,3}

        System.out.println(lst);       // [1, 2, 3, 1, 2, 3]


    }
}
