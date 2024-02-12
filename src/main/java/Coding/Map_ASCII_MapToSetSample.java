package Coding;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Map_ASCII_MapToSetSample {
    public static void main(String[] args) {

        Map<Integer, Character> map = new HashMap<>();
        for (int i = 65; i <= 90; i++) {     // A to Z
            map.put(i, (char) i);
        }
        Set<Integer> set = map.keySet();
        for (Integer key : set) {
            System.out.println(map.get(key) + " == " + key);
        }
    }

    // A-Z | 65-90

}
