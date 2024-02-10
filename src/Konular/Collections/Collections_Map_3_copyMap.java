package Konular.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class Collections_Map_3_copyMap {
    static class Test{
        Map<String, String> map1, map2;
    }

    public static void main(String[] args) {
        Test test = new Test();
        test.map1 = new HashMap<>();
        test.map2 = new HashMap<String, String>();

        test.map1.put("ALATLI", "20895548");
        test.map1.put("DAMLA", "20894828");
        test.map1.put("AYKUT", "20893085");
        test.map1.put("CAN", "20793172");

        test.map2.putAll(test.map1);


        //with putAll we copied the map to another. But when you print, the order will be different

        Map treeMap = new TreeMap(test.map2);

        System.out.println(test.map1);
        System.out.println(test.map2);      // siralama karisik
        System.out.println(treeMap);        // sorted
    }
}