package Konular.Collections;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class Collections_Map_2 {

    public static void main(String[] args) {

        Map<String, Integer> map = new HashMap<>();
        // Map map = new HashMap();
        map.put("Melisa", 8);
        map.put("Hidayet", 6);
        map.put("Duru", 9);
        map.put("Batu", 2);

        System.out.println(map);                // {Melisa=8, Duru=9, Hidayet=6, Batu=2}
        System.out.println(map.get(1));         // null
        System.out.println(map.get("Melisa"));  // 8

        /* *** SORT MAP BY KEYS USING TREESET *** */
        TreeMap treeMap = new TreeMap(map);
        System.out.println(treeMap);            // {Batu=2, Duru=9, Hidayet=6, Melisa=8}


        System.out.println("Map :" + map);                      // {Melisa=8, Duru=9, Hidayet=6, Batu=3}
        System.out.println("Set :" + map.entrySet());    // [Melisa=8, Duru=9, Hidayet=6, Batu=3]
        System.out.println("Values :" + map.values());        // [8, 9, 6, 3]
        System.out.println("Keys :" + map.keySet());        // [Melisa, Duru, Hidayet, Batu]


    }
}
