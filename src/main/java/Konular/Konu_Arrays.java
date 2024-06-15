package Konular;

import java.util.Arrays;

public class Konu_Arrays {
    public static void main(String[] args) {

        int[] aa = {10, 20, 30, 40, 50};
        int[] bb = new int[]{0, 20, 30, 40, 50};
        int[] cc = new int[bb.length];
        cc[0] = aa[aa.length - 1];

        String str = "Melisa";
        String[] s = str.split("");
        char[] ch = str.toCharArray();

        // EQUALS()
        String[] cars = {"Volvo", "BMW", "Ford", "Mazda"};
        String[] autos = {"Volvo", "BMW", "Ford", "Mazda"};

        System.out.println(cars.equals(autos));             // false
        System.out.println(Arrays.equals(cars, autos));      // true

        // SORTING
        int[] nums = {1, 23, 4, 9, 6};
        Arrays.sort(nums);                      // [1, 4, 6, 9, 23]
        System.out.println(Arrays.toString(nums));

        String[] arr = {"coding", "start", "to", "Day", "1234", "952", "84", "Perfect", "0", "Sunday"};
        Arrays.sort(arr);

        // [0, 1234, 84, 952, Day, Perfect, Sunday, coding, start, to]
        // First it comes the numbers, then Uppercases, then lowercases ..


        // Copying one array to another  (you can also use foreach loop to copy)
        int[] a = {10, 20, 30, 40, 50};

        int[] b = Arrays.copyOf(a, a.length);    // [10, 20, 30, 40, 50]
        int[] c = Arrays.copyOf(a, 3);           // [10, 20, 30]
        int[] d = Arrays.copyOf(a, 7);           // [10, 20, 30, 40, 50, 0, 0]
        int[] f = Arrays.copyOfRange(a, 1, 4);   // [20, 30, 40]
        System.out.println(Arrays.toString(f));

        int[] e = new int[a.length];
        int i = 0;
        for (int each : a) {
            e[i++] = each;
        }

        char[] c1 = {'1', '2', '3', '4'};
        char[] c4 = Arrays.copyOf(c1, 5);       // [1, 2, 3, 4, null]      u get null for String[] also

        String[] words = {"coding", "start", "to", "Day", "Perfect", "Sunday"};
        String[] first2words = Arrays.copyOf(words, 2);            // [coding, start]
        String[] partial = Arrays.copyOfRange(words, 3, 5);       // [Day, Perfect]


        String[] values = new String[5];
        Arrays.fill(values, 2, 4, "cat");
        // [null, null, cat, cat, null]
    }
}
