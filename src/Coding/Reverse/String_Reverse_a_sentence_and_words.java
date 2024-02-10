package Coding.Reverse;

public class String_Reverse_a_sentence_and_words {
    public static void main(String[] args) {

        String str = "Java is fun";
        System.out.println(reverseSentence(str));               // fun is Java
        System.out.println(reverseEveryWord(str));
    }

    private static String reverseSentence(String str) {
        String reverse = "";
        String[] arr = str.split("\\s+");
        for (int i = arr.length-1; i >= 0; i--) {
            reverse += arr[i] + " ";
        }
        return reverse.trim();
    }

    public static String reverseEveryWord(String str){
        String[] arr = str.split(" ");
        String output = "";
        for(String each : arr){
            output += new StringBuilder(each).reverse() + " ";
        }
        return output.trim();
    }

    private static String reverseWordsInSentence(String str) {
        String[] words = str.split(" ");
        String output = "";
        for(String each : words){
            char[] chars = each.toCharArray();
            for(int i= chars.length-1 ; i>=0 ;i--){
                output += chars[i]+"";
            }
            output += " ";
        }
        return output.trim();
    }
}
