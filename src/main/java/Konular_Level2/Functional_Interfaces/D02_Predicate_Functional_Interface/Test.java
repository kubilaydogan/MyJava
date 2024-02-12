package Konular_Level2.Functional_Interfaces.D02_Predicate_Functional_Interface;

import java.util.function.Predicate;

public class Test {
    public static void main(String[] args) {
        // interface Predicate<T> has  boolean test(T t);
        // Returns true if the input argument matches the predicate, otherwise false

        Predicate<Integer> isEven = n -> {
            if (n % 2 == 0)
                return true;
            return false;
        };

        boolean b = isEven.test(1002);

    }
}
