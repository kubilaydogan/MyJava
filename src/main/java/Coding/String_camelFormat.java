package Coding;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class String_camelFormat {
    public static void main(String[] args) {

        String str = "DIKKAT DIKKAT";
        System.out.println(camelFormat(str));
        System.out.println(camelFormat1(str));       // Dikkat Dikkat

    }

    private static String camelFormat(String str) {
        String result = "";
        String[] arr = str.toLowerCase().split(" ");
        for(String each : arr){
            result += Character.toUpperCase(each.charAt(0)) + each.substring(1) + " ";
        }
        return result.trim();
    }

    private static String camelFormat1(String str) {
        List<String> list = new ArrayList<>(Arrays.asList(str.split(" ")));
        return list.stream().map(e -> e.substring(0, 1).toUpperCase() + e.substring(1).toLowerCase())
                .collect(Collectors.joining(" "));
    }
}

