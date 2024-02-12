package Konular.Collections;

import java.util.ArrayList;

public class ArrayList_vs_Arrays {
    public static void main(String[] args) {

        // Array is a fixed size data structure while ArrayList is not.
        // ArrayList is dynamic, so it can increase and decrease its size automatically.

        int[] arr = new int[4];     // it can hold max 4 int

        ArrayList<Integer> lst = new ArrayList<>();           // In arraylist we don't need to mention size
        ArrayList<Integer> list = new ArrayList<>(4);   // But we can specify the capacity

        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);        // the size of arraylist will be increased to 4 automatically.

        // But consider a scenario when there is a need to add huge number of elements to an already
        // full ArrayList, in such case ArrayList has to be resized many times which would result in
        // a poor performance. For such cases ensureCapacity() method  is very useful as it increases
        // the size of the ArrayList by a specified capacity.

        list.ensureCapacity(50);        // size is increased to 50

        // The arraylist is having capacity of 50 but there are only 20 elements in it,
        // calling trimToSize() method on this ArrayList would change the capacity from 50 to 20.

        list.trimToSize();
        // trimToSize() is used for memory optimization. It trims the capacity to the current list size.


    }
}
