package Konular.Stream.NonTerminalOperations;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class filter {
    public static void main(String[] args) {

        var s = Stream.of(1, 2, 3, 4, 5, 6, 7);

        Stream<Integer> stream = s.filter(e -> e % 2 == 0).map(e -> e * e);
        stream.forEach(System.out::println);


        List<String> list = new ArrayList<>();
        list.add("one");
        list.add("two");
        list.add("three");
        list.add("one");

        List<String> result = list.stream()         // convert list to stream
                .filter(e -> !e.equals("three"))    // we dont like three
                .collect(Collectors.toList());      // collect the output and convert streams to a List


        List<String> result2 = list.stream()
                .filter(e -> e.startsWith("t"))
                .collect(Collectors.toList());

        List<String> result3 = list.stream()
                .filter(e -> e.startsWith("t"))
                .sorted()
                .collect(Collectors.toList());

        System.out.println(result);     // [one, two, one]
        System.out.println(result2);    // [two, three]
        System.out.println(result3);    // [three, two]

        // ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~

        List<Integer> lst = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10));
        List<Integer> numbers = lst.stream().filter(p -> p % 3 == 0).map(n -> n * 2).collect(Collectors.toList());

        System.out.println(numbers);        // [6, 12, 18]
    }
}
