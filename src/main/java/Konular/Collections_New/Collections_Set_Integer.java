package Konular.Collections_New;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Collections_Set_Integer {
    public static void main(String[] args) {

        String[] arr = {"a", "b", "g"};
        Set<String> mySet = new HashSet<>(Arrays.asList(arr));          //  [a, b, g]
        // this is not working with int[]. It should be Integer[]

        Set<Integer> set = new HashSet<>(Arrays.asList(1, 3, 2, 4, 8, 9, 0, 0, 0));
        Set<Integer> set1 = new HashSet<>(set);
        System.out.println(set);        // [0, 1, 2, 3, 4, 8, 9]
        System.out.println(set1);       // [0, 1, 2, 3, 4, 8, 9]

        Set<Integer> set2 = new HashSet<>();
        set2.addAll(Arrays.asList(1, 3, 7, 5, 4, 0, 7, 5));
        System.out.println(set2);       // [0, 1, 3, 4, 5, 7]

        // combine sets
        Set<Integer> union = new HashSet<>(set1);
        union.addAll(set2);                            // [0, 1, 2, 3, 4, 5, 7, 8, 9]

        // To find intersection (common values)
        Set<Integer> intersection = new HashSet<>(set1);
        intersection.retainAll(set2);                  // [0, 1, 3, 4]

        // To find the difference
        Set<Integer> difference = new HashSet<>(set1);
        difference.removeAll(set2);                    // [2, 8, 9]     (set1'in set2'den farki)

        Set<Integer> difference2 = new HashSet<>(set2);
        difference2.removeAll(set1);                    // [5, 7]       (set2'nin set1'den farki)

    }
}
