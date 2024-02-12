package Konular;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class Konu_Iterator {
    public static void main(String[] args) {

        ArrayList<String> cars = new ArrayList<>();
        cars.add("Volvo");
        cars.add("BMW");
        cars.add("Ford");
        cars.add("Mazda");
        cars.add("Tesla");

        // Get the iterator
        Iterator<String> it = cars.iterator();
        it.remove();                            // SON ELEMENT SILINIR
        System.out.println(it.hasNext());       // true

        // Print the first item
        System.out.println(it.next());      // Volvo
        System.out.println(it.next());      // BMW
        System.out.println(it.next());      // Ford
        System.out.println(it.next());      // Mazda
    //  System.out.println(it.next());      // NoSuchElementException   (Döngü tamamlandı)


        Iterator<String> iter = cars.iterator();
        while(iter.hasNext()) {
            System.out.println(iter.next());
        }


        ArrayList<Integer> numbers = new ArrayList<Integer>();
        numbers.add(12);
        numbers.add(8);
        numbers.add(2);
        numbers.add(23);
        Iterator<Integer> iterator = numbers.iterator();
        while(iterator.hasNext()) {
            Integer i = iterator.next();
            if(i < 10) {
                iterator.remove();
            }
        }
        System.out.println(numbers);

    }
}
