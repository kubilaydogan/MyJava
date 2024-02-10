package Konular_Level2.Functional_Interfaces.D06_Bi_Functional_Interfaces;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class FindDuplicatesInList {
    public static void main(String[] args) {

        List<Integer> list = new ArrayList<>();
        list.addAll(Arrays.asList(1, 1, 1, 2, 3, 3, 3, 4, 5, 5, 5, 6));

        System.out.print("Uniques: ");
        for(Integer each : list){
            if(Collections.frequency(list, each) ==1){
                System.out.print(each + " ");
            }
        }

    }
}
