package Coding;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class StringBuilder_List_to_modified_String {
    public static void main(String[] args) {

        List<String> list = new ArrayList<>(Arrays.asList("A","B","C","D"));
        System.out.println(join(list, "---"));
        System.out.println(join2(list, "*"));

        // Output:  A---B---C---D
        //          A*B*C*D
    }

    // [A,B,C] ==> A---B---C---D or A*B*C*D
    public static String join(List<String> list, String separator) {
        StringBuilder sb = new StringBuilder();
        for (String each : list) {
            if (sb.length() > 0) {          // *
                sb.append(separator);
            }
            sb.append(each);
        }
        return sb.toString();
    }

    // * This is used to prevent the append the separator first
    // Otherwise the output would be: ---A---B---C---D

    public static String join2(List<String> list, String separator) {
        String str = "";
        for (String each : list) {
            if (!str.isEmpty()) {
                str += separator;
            }
            str += each;
        }
        return str;
    }
}

