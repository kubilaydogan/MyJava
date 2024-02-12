package Konular_Level2.Functional_Interfaces.D06_Bi_Functional_Interfaces;
import java.util.function.BiConsumer;

public class BiConsumer_printMultipleTimes {
    public static void main(String[] args) {

        // Takes 2 inputs and returns no result (void)

        BiConsumer<String, Integer> printMultipleTimes = (x, y) -> {
            for (int i = 0; i < y; i++) {
                System.out.print(x);
            }
            System.out.println();
        };

        printMultipleTimes.accept("Hi ", 5);

    }
}
