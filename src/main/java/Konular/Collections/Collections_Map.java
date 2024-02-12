package Konular.Collections;

import java.util.HashMap;
import java.util.Map;

public class Collections_Map {

    public static void main(String[] args) {

        Map<String, Integer> map = new HashMap<>();
        // Map map = new HashMap();
        map.put("Melisa", 8);
        map.put("Hidayet", 6);
        map.put("Duru", 9);
        map.put("Batu", 2);

        System.out.println(map);                // {Melisa=8, Duru=9, Hidayet=6, Batu=2}
        System.out.println(map.get(1));         // null
        System.out.println(map.get("Max"));     // null
        System.out.println(map.get("Melisa"));  // 8

        System.out.println("Map :" + map);               // {Melisa=8, Duru=9, Hidayet=6, Batu=3}
        System.out.println("Set :" + map.entrySet());    // [Melisa=8, Duru=9, Hidayet=6, Batu=3]
        System.out.println("Values :" + map.values());   // [8, 9, 6, 3]
        System.out.println("Keys :" + map.keySet());     // [Melisa, Duru, Hidayet, Batu]

        int size = map.size();              // 4

        boolean b1 = map.containsKey("Batu");
        boolean b2 = map.containsValue(6);

        map.remove("Duru");
        map.remove("Melisa", 8);

        System.out.println(map.isEmpty());

        map.forEach((K, V) -> System.out.println("\t" + K + " : " + V));

        // ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
        // COPY MAP
        // ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
        Map<String, Integer> map1 = new HashMap<>();
        map1.put("A", 1);
        map1.put("B", 2);
        map1.put("C", 3);
        map1.put("D", 4);

        Map<String, Integer> map2 = new HashMap<>();
        map2.put("E", 5);
        map2.put("F", 6);
        map2.put("G", 7);
        map2.put("H", 9);

        map2.putAll(map1);
        System.out.println(map2);

        map.replace("H", 9, 8);

        // if not found return 9
        System.out.println(map.getOrDefault("J", 9));       // map'e eklemez

        // ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~

        // MAP ENTRY
        for (Map.Entry<String, Integer> pairs : map.entrySet()) {
            System.out.println(pairs);
            System.out.println(pairs.getKey() + "::" + pairs.getValue());
        }

        // output:
        // Hidayet=6
        // Hidayet::6
        // Batu=2
        // Batu::2

    }
}
