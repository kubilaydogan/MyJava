package Konular.Collections;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class Konu_Set_Integer {
    public static void main(String[] args) {

        Set<Integer> a = new HashSet<>();
        a.addAll(Arrays.asList(new Integer[] {1, 3, 2, 4, 8, 9, 0, 0, 0}));

        Set<Integer> b = new HashSet<>();
        b.addAll(Arrays.asList(new Integer[] {1, 3, 7, 5, 4, 0, 7, 5}));

        // combine sets
        Set<Integer> union = new HashSet<>(a);
        union.addAll(b);                            // [0, 1, 2, 3, 4, 5, 7, 8, 9]

        // To find intersection (common values)
        Set<Integer> intersection = new HashSet<>(a);
        intersection.retainAll(b);                  // [0, 1, 3, 4]

        // To find the difference       (a'nin b'den farki)
        Set<Integer> difference = new HashSet<>(a);
        difference.removeAll(b);                    // [2, 8, 9]


        // NOTE - set creation is simplier with Strings
        String[]arr = {"a", "b", "g"};
        Set<String> mySet = new HashSet<>(Arrays.asList(arr));          //  [a, b, g]


    }
}
