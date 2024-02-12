package Konular.Stream.TerminalOperations;

import java.util.List;
import java.util.Optional;

public class findFirst {
    // Similar to TerminalOperations.findAny()
    // TerminalOperations.findFirst() finds the first element in the Stream

    public static void main(String[] args) {

        var s = List.of(1, 2, 3, 4, 5).stream();
        System.out.println(s.findFirst().get());

        var stream = List.of(1, 2, 3, 4, 5).stream();
        Optional<Integer> result = stream.findFirst();
        System.out.println(result.get());
    }
}
