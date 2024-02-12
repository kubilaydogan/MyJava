package Konular.Collections_New;

import java.util.*;

public class Collections_LinkedList {
    public static void main(String[] args) {

        LinkedList<Integer> list = new LinkedList<>();
        list.add(5);
        list.add(7);
        list.add(7);
        list.add(2, 2);
        list.addFirst(1);
        list.addLast(9);

        System.out.println(list);               // [1, 5, 7, 2, 7, 9]
        System.out.println(list.getFirst());    // 1
        System.out.println(list.getLast());     // 9
        System.out.println(list.get(2));        // 7

        Integer isRemoved = list.remove(3);

        // **** remove an index returns the type
        // remove an object returns boolean:
        // boolean isRemoved = list.remove("a");

        Integer element = list.removeFirst();  // Throws NoSuchElementException if the LinkedList is empty
        String element1 = String.valueOf(list.removeLast());

        // ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~

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

        boolean removed = link.remove("C#");
        if (removed) {
            System.out.println("C# removed: " + link);
        }

        // Remove all the elements that satisfy the given predicate
        link.removeIf(n -> n.startsWith("C"));

        System.out.println(link);


        Iterator it = link.iterator();
        while(it.hasNext()){
            System.out.println(it.next());
        }

    }
}
