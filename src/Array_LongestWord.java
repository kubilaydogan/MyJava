import java.util.ArrayList;
import java.util.List;

public class Array_LongestWord {
    public static void main(String[] args) {
        String str = "The cowboy jumped over the moon.";
        System.out.println(longestWord(str));               // cowboy
        System.out.println(longestWords(str));              // [cowboy, jumped]

    }

    public static String longestWord(String sentence) {
        String[] arr = sentence.split(" ");

        // find the longest length
        int maxLength = 0;
        for (String each : arr) {
            if (each.length() > maxLength)
                maxLength = each.length();
        }
        // return the word which has the max length
        String result = "";
        for (String each : arr) {
            if (each.length() == maxLength) {
                result = each;
                break;              // to get the first longest word
            }
        }
        return result;
    }


    public static List longestWords(String sentence) {
        List<String> list = new ArrayList<>();
        String[] arr = sentence.split(" ");

        int maxLength = 0;
        for (String each : arr) {
            if (each.length() > maxLength) {
                maxLength = each.length();
            }
        }

        for (String each : arr) {
            if (each.length() == maxLength) {
                list.add(each);
            }
        }
        return list;
    }


}

