package Konular.Stream.TerminalOperations;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Stream;

// max() returns the largest element in the Stream.
// Which element is the largest is determined by the Comparator implementation you pass to the max() method.
// If the Stream is empty, the Optional get() method will throw a NoSuchElementException.
// min() is the oppsite
public class max {
    public static void main(String[] args) {

        List<String> stringList = new ArrayList<String>();

        stringList.add("abc");
        stringList.add("def");

        Stream<String> stream = stringList.stream();
        Optional<String> max = stream.max((val1, val2) -> val1.compareTo(val2));

        String maxString = max.get();
        System.out.println(maxString);

    }
}
