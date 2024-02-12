package Konular.Stream.NonTerminalOperations;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

// flatMap() maps a single element into multiple elements.
public class flatMap {
    public static void main(String[] args) {

        List<String> list = new ArrayList<String>();
        list.add("One flew over the cuckoo's nest");
        list.add("To kill a muckingbird");
        list.add("Gone with the wind");

        List<String> result = list.stream()
                .flatMap((value) -> {
                    String[] split = value.split(" ");
                    return Arrays.asList(split).stream();
                })
                .collect(Collectors.toList());

        System.out.println(result);     // [one, two]

    }
}
