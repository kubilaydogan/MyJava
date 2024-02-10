package Coding.Frequency;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class String_Frequency_of_a_word_in_a_sentence {
    public static void main(String[] args) {

        String sentence = "Be or not to be";
        System.out.println(countWord(sentence,"be"));
        System.out.println(countWord2(sentence,"be"));

        String str = "cat stevens loves cats ans dogs.catcat here cat cat there";
        System.out.println(countWord3(str, "cat"));     // ***
    }

    public static int countWord(String input, String target){
        List<String> list = new ArrayList<>(Arrays.asList(input.toLowerCase().split(" ")));
        return Collections.frequency(list, target);
    }

    public static int countWord2(String input, String target){
        int count = 0;
        String[] arr = input.split("\\s+");
        for(String each:arr){
            if(each.equalsIgnoreCase(target))
                count++;
        }
        return count;
    }

    private static int countWord3(String sentence, String word) {
        int count = 0;

        for (int i = 0; i < sentence.length(); i++) {
            if (!sentence.contains(word))
                break;
            sentence = sentence.replaceFirst(word, "");
            count++;
        }
        return count;
    }

}
