package Konular_Level2.Functional_Interfaces.D06_Bi_Functional_Interfaces;

import java.util.ArrayList;
import java.util.List;
import java.util.function.BiFunction;

public class BiFunction_addArraysToList {
    public static void main(String[] args) {

        BiFunction<int[], int[], List<Integer>> addArraysToList = (a, b) -> {
            List<Integer> list = new ArrayList<>();
            for (int each : a) list.add(each);
            for (int each : b) list.add(each);
            return list;
        };

        int[] arr1 = {1, 2, 3, 4, 5};
        int[] arr2 = {6, 7, 8, 9};
        List<Integer> nums = addArraysToList.apply(arr1, arr2);

        System.out.println(nums);

    }
}
