package Konular;

public class Konu_Loop {
    public static void main(String[] args) {

        int[] values = {1, 2, 3, 4, 5, 6, 7, 8};
        int sum = 0;

        for (int i = 0; i < values.length; sum += i++) ;        // a loop without a body
        System.out.println(sum);

        /* ~~~~~~~~~~~~~~~~~~~~~~~~ */

        int i = 0;
        while (i < 10) {
            //...
            i++;
        }

        /* ~~~~~~~~~~~~~~~~~~~~~~~~ */

        boolean isSame = true;
        while (isSame) {
            //...
        }

        /* ~~~~~~~~~~~~~~~~~~~~~~~~ */

        int n = 0;
        do {
            //...
            i++;
        }
        while (n < 10);

        /* ~~~~~~~~~~~~~~~~~~~~~~~~ */

        int j = 0;
        for (; j < 10; ) {
            //...
            j++;
        }
    }
}
