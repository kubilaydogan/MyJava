package Konular.Collections;

import java.util.*;

public class Collections_Map_1 {
    public static void main(String[] args) {

        Map<String, Integer> map = new HashMap<>();
        map.put("Hello", 5);
        map.put("Hi", 2);
        map.put("Merhaba", 7);
        map.put("Selam", 5);
        map.put("Privet", 6);

        /* *** removeIf *** */
        Collection<Integer> myValues = map.values();
        myValues.removeIf(integer -> integer == 2);

        Set<String> myKeys = map.keySet();
        myKeys.removeIf(s -> s.equalsIgnoreCase("Privet"));

        // Note
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

    }
}
