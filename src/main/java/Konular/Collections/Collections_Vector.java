package Konular.Collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Vector;

public class Collections_Vector {

    /*
       Vector implements the List interface.
       So we can use all the methods of List interface here.

       Vector implements a dynamic array.
       That means size is not fixed + access through index (--> maintains an insertion order)

       === Vector vs ArrayList ===
       Vector is synchronized, which means only one thread at a time can access the code,
       while ArrayList is not synchronized, which means multiple threads can work on arrayList at the same time.
       The performance of ArrayList is better.
 */

    public static void main(String[] args) {

        Vector v1 = new Vector();    // standard initial capacity is 10
        Vector v2 = new Vector(20);
        Vector v3 = new Vector(30, 5);

        List<Integer> list = new ArrayList<>(Arrays.asList(1, 3, 5, 7));
        Vector v4 = new Vector(list);

        v4.add(8);
        v4.add(2, 6);
        v4.remove(1);
        v4.set(0, 23);
        System.out.println(v4);     // [23, 6, 5, 7, 8]

    }

}
