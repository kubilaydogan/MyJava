package Coding;

public class Polindrome_advance {
    public static void main(String[] args) {
        System.out.println(isPalindrome("dogan"));
        System.out.println(isPalindrome("racecar"));
        System.out.println(isPalindrome("?ab??a"));
        System.out.println(isPalindrome("bab??a"));
        System.out.println(isPalindrome("?a?"));
        System.out.println(isPalindrome("r?ce?ar"));

    }

    public static boolean isPalindrome(String str){
        int first = 0;
        int last = str.length()-1;
        while(first<last){
            if(str.charAt(first)!=str.charAt(last)){       // baştaki ve sondaki harfler eşit değlse polindrome değil ama:
                if(str.charAt(first)!= '?' && str.charAt(last)!='?' ){      // bu harflerden biri ? olmamak şartıyla
                    return false;
                }
            }
            first++;
            last--;
        }
        return true;
    }


}
