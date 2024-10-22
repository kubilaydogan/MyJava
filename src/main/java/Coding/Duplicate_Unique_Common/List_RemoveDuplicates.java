package Coding.Duplicate_Unique_Common;

import java.util.*;

public class List_RemoveDuplicates {
    public static void main(String[] args) {
        // Create a return method that can remove duplicated values from an ArrayList

        List<String> list = new ArrayList<>(Arrays.asList("A", "B", "C", "D", "B", "C"));
        List<Integer> list2 = new ArrayList<>(Arrays.asList(1, 1, 2, 2, 3, 3));

        System.out.println(removeDuplicates(list));             // [A, B, C, D]
        System.out.println(removeDuplicates(list2));            // [1, 2, 3]
        System.out.println(removeDuplicates2(list2));         // [1, 2, 3]
        System.out.println(removeDuplicates2(list));          //  [A, B, C, D]
    }

    private static Set removeDuplicates(List list) {
        Set set = new HashSet<>(list);
        return set;
    }

    // Do not use Set interfaces
    private static List removeDuplicates2(List list) {
        List output = new ArrayList();
        for(int i=0; i<list.size(); i++){
            if(!output.contains(list.get(i))){
                output.add(list.get(i));
            }
        }
        return output;
    }
}
