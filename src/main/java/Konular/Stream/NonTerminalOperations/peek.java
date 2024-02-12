package Konular.Stream.NonTerminalOperations;

import lombok.Getter;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

// This method exists mainly to support debugging

public class peek {
    public static void main(String[] args) {

        User a = new User("Alice");
        User b = new User("Bob");
        User c = new User("Chuck");

        List<User> list = new ArrayList<>();
        list.add(a);
        list.add(b);
        list.add(c);

//        Stream<String> stream = list.stream()
//                .filter(e -> e.getName().length() > 3)
//                .peek(e -> System.out.println("Filtered names: " + e.getName()))
//
//                .map(e -> e.getName().toUpperCase())
//                .peek(n -> System.out.println("Mapped value: " + n));
//
//        stream.forEach(System.out::println);

        List<String> result = list.stream()
                .filter(e -> e.getName().length() > 3)
                .peek(e -> System.out.println("Filtered names: " + e.getName()))

                .map(e -> e.getName().toUpperCase())
                .peek(n -> System.out.println("Mapped value: " + n))
                .collect(Collectors.toList());

        System.out.println(result);   // [ALICE, CHUCK]
    }

    @Getter
    private static class User {
        String name;

        public User(String name) {
            this.name = name;
        }

    }
}
