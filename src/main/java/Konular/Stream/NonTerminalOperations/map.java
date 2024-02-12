package Konular.Stream.NonTerminalOperations;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

// chaining
public class map {
    public static void main(String[] args) {

        List<String> list = new ArrayList<>();
        list.add("Element 1");
        list.add("Element 2");
        list.add("Element 3");
        list.add("Element 4");

        Stream<String> stream_1 = list.stream();
        Stream<String> stream_2 = list.stream();
        Stream<String> stream_3 = list.stream();

        Stream<String> stream1 = stream_1.map(e -> e.toLowerCase());
        Stream<String> stream2 = stream_2.map(e -> e.toUpperCase()+ " " );
        Stream<String> stream3 = stream_3.map(e -> e.substring(8, 9));


        stream1.forEach(e -> System.out.print(e));
        stream2.forEach(e -> System.out.println(e));
        stream3.forEach(System.out::print);

        // ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~

        List<String> result = list.stream()
                .map(e -> e.substring(8, 9))
                .collect(Collectors.toList());

        System.out.println(result);     // [1, 2, 3, 4]

        // ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~

        List<Integer> lst = new ArrayList<>(Arrays.asList(1, 2, 3, 4 ));
        lst = lst.stream().map(e -> e * 3).collect(Collectors.toList());
        System.out.println(lst);   // [3, 6, 9, 12]

    }
}
//  element 1element 2element 3element 4ELEMENT 1
//  ELEMENT 2
//  ELEMENT 3
//  ELEMENT 4
//  1234