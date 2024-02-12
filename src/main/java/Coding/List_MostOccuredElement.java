package Coding;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.function.BinaryOperator;

public class List_MostOccuredElement {

    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1, 3, 4, 3, 4, 3, 2, 3, 3, 3, 3, 3);

        System.out.println(mostRepeatedElement(list));      // 3
        System.out.println(mostRepeatedElement2(list));     // 3
    }

    private static Integer mostRepeatedElement(List<Integer> list) {
        return list.stream().reduce(BinaryOperator.maxBy(
                        Comparator.comparingInt(o -> Collections.frequency(list, o))
                )).orElse(null);
    }

    private static Integer mostRepeatedElement2(List<Integer> list) {
        Integer count=0;
        Integer maxOccurredElement = null;
        for(Integer each : list){
            if(Collections.frequency(list, each) > count){
                count = Collections.frequency(list, each);
            }
        }
        for(Integer each : list){
            if(Collections.frequency(list, each) == count){
                maxOccurredElement = each;
            }
        }
        return maxOccurredElement;
    }
    
    
}
