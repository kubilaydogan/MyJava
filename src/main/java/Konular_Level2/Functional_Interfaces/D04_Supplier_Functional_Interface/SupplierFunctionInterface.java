package Konular_Level2.Functional_Interfaces.D04_Supplier_Functional_Interface;

import java.util.Arrays;
import java.util.Random;
import java.util.function.Supplier;

public class SupplierFunctionInterface {
    public static void main(String[] args) {

        // Supplier<T> interface has T get();  =>  Gets a result, returns a result

        Supplier<String> returnCybertek = () -> "Cybertek";
        System.out.println( returnCybertek.get() );

        System.out.println("--------------------------------------");

        Supplier<int[]> returnIntArray = () -> {
            int[] array = new int[5];
            for (int i = 0; i < array.length; i++) {
                array[i] = new Random().nextInt();
            }
            return array;
        };

        int[] arr = returnIntArray.get();
        System.out.println(Arrays.toString(arr));

        System.out.println("-------------------------");

        Supplier<Double> returnDecimal = () -> { return new Random().nextDouble(); };
        System.out.println(returnDecimal.get());

    }
}
