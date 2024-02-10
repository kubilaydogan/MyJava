package Coding;

public class Palindrome {
    public static void main(String[] args) {

        System.out.println(isPalindrome(12321));        // true
        System.out.println(isPalindrome(123456));       // false
        System.out.println(isPalindrome(898));          // true

        System.out.println(palindrome("racecar"));     // true
        System.out.println(palindrome("hello"));       // false
    }


    static boolean palindrome(String str){
        StringBuilder sb = new StringBuilder(str);
        return str.contentEquals(sb.reverse().toString());
    }

    static boolean isPalindrome(int n) {
        String str = String.valueOf(n);
        StringBuilder sb = new StringBuilder(str);
        return str.contentEquals(sb.reverse().toString());
    }

    static boolean isPalindrome2(String str){
        int first = 0;
        int last = str.length()-1;
        while(first<last){
            if(str.charAt(first)!=str.charAt(last)){
                return false;
            }
            first++;
            last--;
        }
        return true;
    }

    static boolean isPalindrome3(String str) {
        String rev = "";
        boolean answer = false;

        for (int i = str.length() - 1; i >= 0; i--) {
            rev = rev + str.charAt(i);
        }
        if (str.equals(rev)) {
            answer = true;
        }
        return answer;
    }


}


