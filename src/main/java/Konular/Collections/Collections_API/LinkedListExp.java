package Konular.Collections.Collections_API;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;

public class LinkedListExp {
    public static void main(String[] args) {

        ArrayList<String> list = new ArrayList<String>();
        list.add("Hillsborough");
        list.add("New");
        list.add("Jersey");
        list.remove(1);  // Remove value at index 2
        System.out.println(list);

        LinkedList linkl = new LinkedList();
        linkl.add("Hillsborough");
        linkl.add("New");
        linkl.add("Jersey");
        linkl.remove("New");
        System.out.println(linkl);

        ArrayList al = new ArrayList();
        al.add(3);
        al.add(2);
        al.add(1);
        al.add(4);
        al.add(5);
        al.add(6);
        al.add(6);

        Iterator iter1 = al.iterator();
        while(iter1.hasNext()){
            System.out.println(iter1.next());
        }

        LinkedList ll = new LinkedList();
        ll.add(3);
        ll.add(2);
        ll.add(1);
        ll.add(4);
        ll.add(5);
        ll.add(6);
        ll.add(6);

        Iterator iter2 = al.iterator();
        while(iter2.hasNext()){
            System.out.println(iter2.next());
        }


    }
}

