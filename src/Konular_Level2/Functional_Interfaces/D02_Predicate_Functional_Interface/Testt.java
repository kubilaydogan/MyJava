package Konular_Level2.Functional_Interfaces.D02_Predicate_Functional_Interface;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.function.Predicate;

public class Testt {
    public static void main(String[] args) {

        List<String> list = new ArrayList<>();
        list.addAll(Arrays.asList("Java", "C#", "C#", "C+"));

        Predicate<String> isUnique = p -> Collections.frequency(list, p) == 1;

        boolean b = isUnique.test("C#");
        System.out.println(b);

        for (String each : list){
            if(isUnique.test(each))
                System.out.println(each);
        }

    }
}
