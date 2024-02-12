package Coding.Reverse;

public class String_Reverse_SecondWord {

    /*
    Coding.Reverse the second word ONLY
        Ex:
            Input: I Love Java
            OutPut: I evoL Java
     */

    public static void main(String[] args) {

        System.out.println(reverseSecondWord("I Love Java"));
        System.out.println(reverse2ndWord("I Love Java"));

    }

    static String reverse2ndWord(String str) {
        String output = "";
        String[] arr = str.split(" ");
        arr[1] = new StringBuilder(arr[1]).reverse().toString();
        for (String each : arr) {
            output += each + " ";
        }
        return output;
    }


    static String reverseSecondWord(String sentence) {
        String[] words = sentence.split(" ");
        String reversed = "";

        for (int i = words[1].length() - 1; i >= 0; i--) {
            reversed += words[1].charAt(i);
        }
        words[1] = reversed;

        String result = "";
        for (String each : words) {
            result += each + " ";
        }
        return result.trim();
    }


}
