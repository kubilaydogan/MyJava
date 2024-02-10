package Duplicate_Unique;

import java.util.*;

public class List_RemoveDuplicates {
    public static void main(String[] args) {

        List<String> list = new ArrayList<>(Arrays.asList("A", "B", "C", "D", "B", "C"));
        List<Integer> list2 = new ArrayList<>(Arrays.asList(1, 1, 2, 2, 3, 3));

        System.out.println(removeDuplicates(list));             // [A, B, C, D]
        System.out.println(removeDuplicates(list2));            // [1, 2, 3]
    }

    private static Set removeDuplicates(List list){
        Set set = new HashSet<>(list);
        return set;
    }
}
