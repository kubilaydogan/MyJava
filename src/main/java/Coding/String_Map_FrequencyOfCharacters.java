package Coding;

import java.util.Map;
import java.util.TreeMap;

/*
    Return the frequency of each character in the given string in Sorted manner
    Ex:   Input: DDDAACCCCCCB    Output: A2B1C6D3
*/
public class String_Map_FrequencyOfCharacters {
    public static void main(String[] args) {
        String str = "DDDAACCCCCCB";
        System.out.println(frequencyOfCharactersInSortedManner(str));
    }



    static String frequencyOfCharactersInSortedManner(String str) {
        Map<String, Integer> map = new TreeMap<>();
        for (String each : str.split("")) {
            if (map.containsKey(each))
                map.put(each, map.get(each) + 1);
            else
                map.put(each, 1);
        }

        System.out.println(map);        // {A=2, B=1, C=6, D=3}

        str = "";
        for (Map.Entry<String, Integer> each : map.entrySet()) {
            str += each.getKey() + each.getValue();
        }
        return str;
    }


}
