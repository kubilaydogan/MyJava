package Konular.Stream.TerminalOperations;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class anyMatch_allMatch_nonMatch {
    public static void main(String[] args) {
        List<String> stringList = new ArrayList<String>();

        stringList.add("One flew over the cuckoo's nest");
        stringList.add("To kill a muckingbird");
        stringList.add("Gone with the wind");

        Stream<String> stream1 = stringList.stream();
        Stream<String> stream2 = stringList.stream();
        Stream<String> stream3 = stringList.stream();

        boolean anyMatch = stream1.anyMatch(e -> e.startsWith("One"));       // true
        boolean allMatch = stream2.allMatch(e -> e.startsWith("One"));       // false
        boolean noneMatch = stream3.noneMatch(e -> e.startsWith("One"));     // false

        System.out.println(anyMatch);
        System.out.println(allMatch);
        System.out.println(noneMatch);
    }
}
