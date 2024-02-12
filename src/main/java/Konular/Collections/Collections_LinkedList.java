package Konular.Collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class Collections_LinkedList {
    public static void main(String[] args) {

        LinkedList<Integer> list = new LinkedList<>();
        list.add(5); list.add(7); list.add(7);
        list.addFirst(1);
        list.addLast(9);

        System.out.println(list);
        System.out.println(list.getFirst());
        System.out.println(list.getLast());

        // Creating a LinkedList
        LinkedList<String> llist = new LinkedList<>();
        llist.add("Hido");
        llist.add("Melisa");
        llist.add("Lena");
        llist.add("Ayfer");
        llist.add(3, "Lisa");
        llist.addFirst("Kubi");
        llist.addLast("Bahadir");

        // Adding all the elements from an existing collection to the end of the LinkedList
        List<String> familyFriends = new ArrayList<>(Arrays.asList("Jesse", "Walt"));
       
        llist.addAll(familyFriends);
        System.out.println(llist);      // [Kubi, Hido, Melisa, Lena, Lisa, Ayfer, Bahadir, Jesse, Walt]
        System.out.println(llist.getFirst());       // Kubi
        System.out.println(llist.getLast());        // Walt
        System.out.println(llist.get(2));           // Melisa

        String first = llist.get(0);
        String element = llist.removeFirst();  // Throws NoSuchElementException if the LinkedList is empty
        String element1 = llist.removeLast();
        // ******* \\

        LinkedList<String> link = new LinkedList<>();

        link.add("Assembly");
        link.add("Fortran");
        link.add("Pascal");
        link.add("C");
        link.add("C++");
        link.add("Java");
        link.add("C#");
        link.add("Kotlin");

        link.remove("jnjn");

        boolean isRemoved = link.remove("C#");
        if(isRemoved) {
            System.out.println("C# removed: " + link);
        }

        // Remove all the elements that satisfy the given predicate
        link.removeIf(n -> n.startsWith("C"));

        System.out.println(link);



    }
}
