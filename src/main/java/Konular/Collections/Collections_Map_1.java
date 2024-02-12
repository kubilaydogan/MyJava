package Konular.Collections;

import java.util.*;

public class Collections_Map_1 {
    public static void main(String[] args) {
        // put(K, V)
        // remove(K) or (remove(K,V)
        // size()
        // value = map.get(K)
        // boolean = map.containsKey(K)
        // boolean = map.containsValue(V)
        // foreach((K,V) -> .... )
        // getOrDefault(K, V) ==> if K not found, return V
        // replace(K, old V, new V)
        //
        // Set<> = map.keySet();
        // Collection<> allValues = map.values();
        // BU IKISINDE REMOVE key OR value KULLANIRSAN, ORJINAL MAP'I ETKILER

        Map<String, Integer> map = new HashMap<>();
        map.put("Hello", 5);
        map.put("Hi", 2);
        map.put("Dersler_duzenlenecek.Merhaba", 7);
        map.put("Selam", 5);
        map.put("Privet", 6);

        map.remove("Dersler_duzenlenecek.Merhaba");
        map.remove(5);
        map.remove("Hi", 2);

        System.out.println(map);            // {Hello=5, Privet=9, Selam=3}
        int val = map.get("Hello");         // 5
        int size = map.size();              // 3

        boolean hasHello = map.containsKey("Hello");    // true
        boolean hasFive = map.containsValue(5);         // true

        map.forEach((K, V) -> System.out.println("\tLength of " + K + " is " + V));

        /* *** SHORTCUT -> removeIf *** */
        Collection<Integer> myValues = map.values();
        myValues.removeIf(integer -> integer == 7);

        Set<String> myKeys = map.keySet();
        myKeys.removeIf(s -> s.equalsIgnoreCase("Hello"));

        // DIPNOT
        List<String> list = new ArrayList<>(Arrays.asList("a", "b", "c", "d"));
        list.removeIf(s -> s.equalsIgnoreCase("D"));
        System.out.println(list);   //[a, b, c]

        /* *** ITERATE KEYS *** */
        Set<String> allKeys = map.keySet();
        for (String eachKey : allKeys) {
            if (map.get(eachKey) == 6) {
                map.remove(eachKey);
                break;                          // MUST
            }
        }
        /* *** ITERATE VALUES *** */
        Collection<Integer> allValues = map.values();
        for (Integer value : allValues) {
            if (value == 9) {
                allValues.remove(9);         // dikkat: burada map.remove(K) kullanilmiyor
                break;                          // MUST
            }
        }

        System.out.println(map);        // {Selam=5}

        // BU IKISINDE DE BREAK KULLANILMAZSA HATA VERIR
        // BUNUN ALTERNATIFI iterator KULLANMAKTIR.

        /* *** ITERATE KEYS *** */
        Set<String> keys = map.keySet();
        Iterator<String> iter = keys.iterator();
        while (iter.hasNext()) {
            if (iter.next().equalsIgnoreCase("Hello"))
                iter.remove();
        }

        /* *** ITERATE VALUES *** */
        Collection<Integer> values = map.values();
        Iterator<Integer> i = values.iterator();
        while (i.hasNext()) {
            if (i.next() == 7)
                i.remove();
        }
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");

        // MAP ENTRY
        for (Map.Entry<String, Integer> pairs : map.entrySet()) {
            System.out.println(pairs);
            System.out.print(pairs.getKey() + ":" + pairs.getValue());
        }

        System.out.println(map.isEmpty());

        // if not found return 5
        System.out.println(map.getOrDefault("Hallo", 5));       // map'e eklemez

        map.replace("Selam", 5, 10);
        System.out.println(map);
    }
}
