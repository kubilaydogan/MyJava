package Konular_Level2.Functional_Interfaces.D06_Bi_Functional_Interfaces;

import java.util.function.BiPredicate;

public class BiPredicate_Contains {
    public static void main(String[] args) {

        BiPredicate<int[], Integer> contains = (arr, e) -> {
            for (int each : arr)
                if (each == e)
                    return true;
            return false;
        };

        int[] array = {1, 2, 3, 4, 5, 6, 7, 8};

        boolean r1 = contains.test(array, 7);
        System.out.println(r1);


    }
}
