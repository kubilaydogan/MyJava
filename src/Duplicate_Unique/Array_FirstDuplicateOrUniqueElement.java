package Duplicate_Unique;

public class Array_FirstDuplicateOrUniqueElement {
    public static void main(String[] args) {
        String[] arr ={"aa","bb","cc","aa","dd","cc","dd"};
        System.out.println(firstDuplicatedElement(arr));

        int[] array ={1, 2, 3, 4, 2, 3, 5};
        System.out.println(firstDuplicatedElement(array));
    }

    /*
    write a program that can find the first duplicated element from the array
     */

    public static String firstDuplicatedElement(String[] arr) {
        String output="";
        int count = 0;
        for(String each : arr){
            for(String each2 : arr){
                if(each.contentEquals(each2)){
                    count++;
                }
            }
            if(count>1){
                output = each;
                break;
            }
        }
        return output;
    }

    public static int firstDuplicatedElement(int[] arr) {
        int firstDuplicated = 0;
        int frequency = 0;
        for (int each : arr) {
            for (int each2 : arr) {
                if (each == each2)
                    frequency++;
            }
            if (frequency > 1) {
                firstDuplicated = each;
                break;
            }

        }
        return firstDuplicated;
    }

}
