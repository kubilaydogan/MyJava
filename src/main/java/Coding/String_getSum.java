package Coding;

public class String_getSum {
    public static void main(String[] args) {
        String str = "Hi92Dogan8!";
        System.out.println(getSum(str));            // 19
    }

    static int getSum(String str) {
        int sum = 0;
        for (char each : str.toCharArray()) {
            if (Character.isDigit(each)) {
                sum+=Character.getNumericValue(each);
             // sum += Integer.parseInt(each + "");
            }
        }
        return sum;
    }

    private static int getSum(char[] arr) {
        int sum =0;
        for(char each:arr){
            if(Character.isDigit(each)){
                sum += Integer.parseInt(each+"");
            }
        }
        return sum;
    }
}
