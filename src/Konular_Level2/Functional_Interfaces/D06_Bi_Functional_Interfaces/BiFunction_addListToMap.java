package Konular_Level2.Functional_Interfaces.D06_Bi_Functional_Interfaces;

import java.util.*;
import java.util.function.BiFunction;

public class BiFunction_addListToMap {
    public static void main(String[] args) {

        BiFunction<List<String>, List<Integer>, Map<String, Integer>> addListsToMap = (x, y) -> {
            Map<String, Integer> map = new LinkedHashMap<>();
            for (int i = 0; i < x.size(); i++)
                map.put(x.get(i), y.get(i));

            return map;
        };

        ArrayList<String> names = new ArrayList<>(Arrays.asList("Mohammad", "Mike", "Chris", "Afrooz", "Sophiya"));

        ArrayList<Integer> salaries = new ArrayList<>();
        salaries.addAll(Arrays.asList(100000, 110000, 105000, 102000, 100000));


        Map<String, Integer> employees = addListsToMap.apply(names, salaries);
        System.out.println(employees);

        employees.forEach((k, v) -> {
            if (v >= 105000)
                System.out.println(k);
        });
    }
}
