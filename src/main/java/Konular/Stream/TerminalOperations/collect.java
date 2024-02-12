package Konular.Stream.TerminalOperations;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class collect {
    // (1) collect() method takes a Collector as parameter.
    // (2) java.util.stream.Collectors contains a set of pre-implemented Collector implementations you can use
    // (3) for example Collectors.toList() simply collects all elements in the stream in a standard Java List
    public static void main(String[] args) {

        List<String> list = new ArrayList<String>();
        list.add("One flew over the cuckoo's nest");
        list.add("To kill a muckingbird");
        list.add("Gone with the wind");

        List<String> stringsAsUppercaseList =
                list.stream()
                .map(value -> value.toUpperCase())
                .collect(Collectors.toList());

        System.out.println(stringsAsUppercaseList);
    }
}
