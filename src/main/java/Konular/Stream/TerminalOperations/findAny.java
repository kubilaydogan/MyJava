package Konular.Stream.TerminalOperations;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Stream;

public class findAny {
    // (1) TerminalOperations.findAny() method can find a single element from the Stream.
    // (2) There is no guarantee about from where in the stream the element is taken.
    // (3) TerminalOperations.findAny() returns an Optional.
    // (4) You can use Optional isPresent() to check if Stream is empty or not
    public static void main(String[] args) {

        List<String> stringList = new ArrayList<>(Arrays.asList("one", "two", "three", "one"));

        Stream<String> stream = stringList.stream();
        Optional<String> anyElement = stream.findAny();

        boolean b = anyElement.isPresent();
        boolean c = anyElement.isEmpty();
        String str = anyElement.get();
        System.out.println(str);

        // ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~`
        var s = List.of(1,2,3,4,5).stream();
        System.out.println( s.findAny().get() );


    }
}
