package Konular.Collections;

import java.sql.SQLOutput;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class Collections_Map_3_copyMap {

    public static void main(String[] args) {

        Map<String, Integer> map1 = new HashMap<>();
        map1.put("A", 1);
        map1.put("B", 2);
        map1.put("C", 3);
        map1.put("D", 4);

        Map<String, Integer> map2 = new HashMap<>();
        map2.put("E", 5);
        map2.put("F", 6);
        map2.put("G", 7);
        map2.put("H", 8);

        map2.putAll(map1);
        System.out.println(map2);
    }
}