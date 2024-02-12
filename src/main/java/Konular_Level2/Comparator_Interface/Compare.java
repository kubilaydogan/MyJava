package Konular_Level2.Comparator_Interface;

import java.util.Arrays;
import java.util.Comparator;

public class Compare implements Comparator<String> {

    @Override
    public int compare(String o1, String o2) {
        return o2.length() - o1.length();
    }

    public static void main(String[] args) {
        String[] names = {"Mary", "Jane", "Elizabeth", "Jo"};

        Arrays.sort(names);                      // [Elizabeth, Jane, Jo, Mary]
        System.out.println(Arrays.toString(names));

        Arrays.sort(names, new Compare());      // [Elizabeth, Mary, Jane, Jo]
        System.out.println(Arrays.toString(names));

    }
}
