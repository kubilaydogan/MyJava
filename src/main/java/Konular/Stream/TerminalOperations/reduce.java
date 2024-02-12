package Konular.Stream.TerminalOperations;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Stream;

// reduce() can reduce all elements in the stream to a single element

public class reduce {
    public static void main(String[] args) {

        List<String> list = new ArrayList<String>();
        list.add("Hello");
        list.add("Java");
        list.add("World");

        Stream<String> stream = list.stream();

        Optional<String> reduced = stream.reduce((value, combinedValue) -> combinedValue + " - " + value);

        System.out.println(reduced.get());      // World - Java - Hello
    }
}
