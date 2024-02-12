package Konular_Level2.Functional_Interfaces.D06_Bi_Functional_Interfaces;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.function.BiPredicate;

public class BiPredicate_Duplicated {
    public static void main(String[] args) {

        BiPredicate<List<Integer>, Integer> isDuplicated = (l, e) -> Collections.frequency(l, e) > 1;

        List<Integer> list = new ArrayList<>();
        list.addAll(Arrays.asList(1, 1, 1, 2, 3, 3, 3, 4, 5, 5, 5, 6));

        list.forEach(n -> {
            if (!isDuplicated.test(list, n)) {
                System.out.print(n + " ");
            }
        });

    }
}
