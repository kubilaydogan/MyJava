package Coding;

import java.util.*;

public class Map_SortByValuesOrKeys {

    /*
        Write a method that can sort the map by values
     */

    public static void main(String[] args) {
        Map<String, Integer> map = new HashMap<>();
        map.put("Melisa", 8);
        map.put("Hidayet", 6);
        map.put("Duru", 9);
        map.put("Batu", 2);

        System.out.println(map);                    // {Melisa=8, Duru=9, Hidayet=6, Batu=2}
        System.out.println(sortMapByValue(map));    // {Batu=2, Hidayet=6, Melisa=8, Duru=9}
        System.out.println(sortMapByKey(map));      // {Batu=2, Duru=9, Hidayet=6, Melisa=8}
    }
    static Map<String, Integer> sortMapByValue(Map<String, Integer> map) {
        List<Map.Entry<String, Integer>> list = new ArrayList<>(map.entrySet());
        list.sort(Map.Entry.comparingByValue());     // <==
        map = new LinkedHashMap<>();
        for (Map.Entry<String, Integer> each : list) {
            map.put(each.getKey(), each.getValue());
        }
        return map;
    }

    static Map<String, Integer> sortMapByKey(Map<String, Integer> map) {
        List<Map.Entry<String, Integer>> list = new ArrayList<>(map.entrySet());
        list.sort(Map.Entry.comparingByKey());      // <==
        map = new LinkedHashMap<>();
        for (Map.Entry<String, Integer> each : list) {
            map.put(each.getKey(), each.getValue());
        }
        return map;
    }
}
