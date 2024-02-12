package Konular.Collections.Collections_API;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class StringArrayToList {
    public static void main(String[] args) {

        String[] arr = {"D", "B", "A", "C", "E"};

        List<String> list1 = Arrays.asList(arr);                    // 1
        List list2 = new ArrayList(Arrays.asList(arr));             // 2

        List<String> list = new ArrayList<String>(arr.length);      // 3
        for (String s:arr) {
            list.add( s );
        }

        Collections.sort(list);

        for (String s : list)
        {
            System.out.print( s + " " );        // A B C D E
        }

    }
}
