package Konular_Level2.Functional_Interfaces.D02_Predicate_Functional_Interface;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.function.Predicate;

public class Testtt {
    public static void main(String[] args) {

        System.out.println("---------------------------------------------");

        List<Integer> nums = new ArrayList<>(Arrays.asList(10,10,10,20,20,30,30,30,30,40,40,50,60,70,80));

        for (int i = 0; i < nums.size(); i++) {
            if(nums.get(i) < 40){
                nums.remove(i);
            }
        }

        System.out.println(nums);

        System.out.println("-----------------------------------------------------------");
        List<Integer> nums2 = new ArrayList<>(Arrays.asList(10,10,10,20,20,30,30,30,30,40,40,50,60,70,80));

        Iterator<Integer> iterator = nums2.iterator();
        while(iterator.hasNext()){
            if(iterator.next() <40){
                iterator.remove();
            }
        }

        System.out.println(nums2);

        System.out.println("--------------------------***--------------------------------");

        List<Integer> nums3 = new ArrayList<>(Arrays.asList(10,10,10,20,20,30,30,30,30,40,40,50,60,70,80));
         Predicate<Integer> lessThan40 = p -> p < 40;
        nums3.removeIf(lessThan40);
        System.out.println(nums3);

        System.out.println("----------------------------------------------------------");

        List<Integer> nums4 = new ArrayList<>(Arrays.asList(10,10,10,20,20,30,30,30,30,40,40,50,60,70,80));
        nums4.removeIf(p -> p < 40);
        System.out.println(nums4);





    }
}
