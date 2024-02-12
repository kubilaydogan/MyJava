package Konular.Stream.NonTerminalOperations;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

// limit() can limit the number of elements in a stream to a number given to the limit() method as parameter.
public class limit {
    public static void main(String[] args) {

        List<Integer> nums = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 0, 10));
        nums = nums.stream().limit(7).collect(Collectors.toList());
        System.out.println(nums);       // [1, 2, 3, 4, 5, 6, 7]

        // ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~

        List<String> list = new ArrayList<String>();

        list.add("one");
        list.add("two");
        list.add("three");
        list.add("one");

        List<String> result = list.stream()
                .limit(2)
                .collect(Collectors.toList());

        System.out.println(result);     // [one, two]

        // ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~

        Stream<String> stream = list.stream();
        stream.limit(2)
                .forEach( element -> { System.out.println(element); });

        // ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
    }
}
