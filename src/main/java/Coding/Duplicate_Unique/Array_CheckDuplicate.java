package Coding.Duplicate_Unique;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Array_CheckDuplicate {
    public static void main(String[] args) {

        String[] arr ={"aa","bb","cc","aa","dd","cc","dd"};
        System.out.println(checkDuplicates(arr));

        findDuplicates(arr);
        findDuplicates2(arr);
    }

    public static boolean checkDuplicates(String[] arr){
        List<String> list = Arrays.asList(arr);
        Set<String> set = new HashSet<>(list);
        return list.size() == set.size();
    }

    public static void  findDuplicates(String[] arr){
        for(int i=0; i<arr.length-1; i++){
            for(int j=i+1; j<arr.length; j++){
                if(arr[i]==arr[j] && (i!=j)){
                    System.out.println("Dublicate element: " + arr[j]);
                }
            }
        }
    }

    public static void  findDuplicates2(String[] arr){
        int count =0;
        for(int i=0; i<arr.length-1; i++){
            for(int j=i+1; j<arr.length; j++){
                if(arr[i]==arr[j] && (i!=j)){
                    count++;
                    if(count==1){System.out.print("\nDublicate element(s):");}
                    System.out.print(" "+arr[j]+",");
                }
            }
        }
    }
}
