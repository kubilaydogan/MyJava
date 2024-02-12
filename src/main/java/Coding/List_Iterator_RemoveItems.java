package Coding;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class List_Iterator_RemoveItems {
    public static void main(String[] args) {

        // TASK: REMOVE NUMBERS OVER 50
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(30, 20, 40, 50, 60, 70));
        System.out.println(removeNumbersOver50(list));
        System.out.println(removeFromList4(list, 20));

        // TASK: REMOVE AN ELEMENT
        ArrayList<String> names = new ArrayList<>(Arrays.asList("Mark", "John", "Eric", "Eric"));
        System.out.println(removeFromList(names, "Eric"));
        System.out.println(removeFromList2(names, "Eric"));
        System.out.println(removeFromList3(names, "Eric"));
    }

    static List removeNumbersOver50(List<Integer> list) {
        Iterator<Integer> iter = list.iterator();
        while (iter.hasNext()) {
            Integer item = iter.next();
            if (item > 50) {
                iter.remove();
            }
        }
        return list;
    }

    // solution 1
    static List removeFromList(List<String> list, String item) {
        Iterator<String> iter = list.iterator();
        while (iter.hasNext()) {
            if (iter.next().equals(item))
                iter.remove();
        }
        return list;
    }

    // solution 2
    static List removeFromList2(List<String> list, String item) {
        list.removeAll(Arrays.asList(item));
        return list;
    }


    // solution 3
    static List<String> removeFromList3(List<String> list, String item) {
        list.removeIf(name -> name.equals(item));
        return list;
    }

    static List<Integer> removeFromList4(List<Integer> list, Integer item) {
        list.removeIf(name -> name.equals(item));
        return list;
    }

}
