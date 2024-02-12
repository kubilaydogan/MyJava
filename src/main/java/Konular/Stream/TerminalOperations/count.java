package Konular.Stream.TerminalOperations;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

// count() counts the elements.
public class count {
    public static void main(String[] args) {

        List<String> list = new ArrayList<String>();
        list.add("One flew over the cuckoo's nest");
        list.add("To kill a muckingbird");
        list.add("Gone with the wind");

        Stream<String> stream = list.stream();

        long count = stream.flatMap((value) -> {
            String[] split = value.split(" ");
            return Arrays.asList(split).stream();
        })
                .count();

        System.out.println("count = " + count);

    }
}
