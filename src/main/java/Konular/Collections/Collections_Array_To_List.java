package Konular.Collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Collections_Array_To_List {
    public static void main(String[] args) {

        Integer[] arr = {20, 30, 40, 50};
        List<Integer> list = new ArrayList<>(Arrays.asList(arr));       // int[] olmaz

        Character[] arr2 = {'a', 'b', 'c', 'd', 'e', 'f'};
        List<Character> list2 = new ArrayList<>(Arrays.asList(arr2));   // char[] olmaz

        /*  Convert an Array of primitives to a List|Set */
        char[] chars = {'a', 'b', 'c', 'd', 'e', 'f'};

        List<Character> lst = new ArrayList<>();
        for (char each : chars) {
            lst.add(each);        // int[] ve digerleri de ayni sekilde
        }


    }
}
