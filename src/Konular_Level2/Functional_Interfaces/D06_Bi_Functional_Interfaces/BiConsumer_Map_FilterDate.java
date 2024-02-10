package Konular_Level2.Functional_Interfaces.D06_Bi_Functional_Interfaces;

import java.time.LocalDate;
import java.util.LinkedHashMap;
import java.util.Map;

public class BiConsumer_Map_FilterDate {
    public static void main(String[] args) {

        Map<String, LocalDate> map = new LinkedHashMap<>();
        map.put("John", LocalDate.of(2020, 10, 25));
        map.put("Jimmy", LocalDate.of(2019, 10, 25));
        map.put("Aaron", LocalDate.of(2018, 10, 25));
        map.put("Shay", LocalDate.of(2017, 10, 25));

        map.forEach((k, v) -> {
            if (v.getYear() < 2019)
                System.out.println(k);
        });
    }
}
