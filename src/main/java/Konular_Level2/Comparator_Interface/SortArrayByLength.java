package Konular_Level2.Comparator_Interface;

import java.util.Arrays;
import java.util.Comparator;

public class SortArrayByLength {
    public static void main(String[] args) {
        String[] names = {"Mary", "Tom", "Elena","Ann"};
        Arrays.sort(names, new LengthCompare() );
        System.out.println(Arrays.toString(names));     // [Tom, Ann, Mary, Elena]
    }
}

class LengthCompare implements Comparator<String> {
    @Override
    public int compare(String s1, String s2) {
        if(s1.length()>s2.length()){ return 1;}
        if(s1.length()<s2.length()){ return -1;}
        return 0;
    }
}
