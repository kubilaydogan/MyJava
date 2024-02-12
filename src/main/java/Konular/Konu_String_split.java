package Konular;

import java.util.Arrays;
import java.util.stream.Stream;

public class Konu_String_split {
    public static void main(String[] args) {

        String str = "NEW   YORK! USA. EARTH > MARS";

        str = str.replaceAll("\\s+", " ");

        String[] arr = str.split("[?!.>]");             // ne yazarsan olur
        System.out.println(Arrays.toString(arr));             // [NEW YORK,  USA,  EARTH ,  MARS]

        System.out.println(str.split("[?!.]")[0]);      // NEW YORK
        System.out.println(str.split("[?!.]")[1]);      // USA

        //~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~

        //  Stream.of(arr)...
        Stream<String> n = Stream.of(str.split("[?!.>]")).map(s -> s.trim());
        System.out.println(Arrays.toString(n.toArray()));       // [NEW   YORK, USA, EARTH, MARS]


    }
}
