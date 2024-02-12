package Konular_Level2.Comparable_Interface;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Test {
    /*
            To sort the Arrays and list of objects that implements Comparable interface,
            you just need to call the Collections.sort (and Arrays.sort).

            However if you want to sort the objects of custom class then you need to implement
            the Comparable interface in our custom class.

            This interface has only one method which is:
            public abstract int compareTo(T obj)
         */
    public static void main(String[] args) {

        Car[] cars = {new Car("Honda", 2019),
                      new Car("Tesla",2000),
                      new Car("Audi",1995),
                      new Car("BMW",2021),
                      new Car("Mini",2006)};

        Arrays.sort(cars);
        for(Car each : cars){
            System.out.println("Year: " + each.getYear() + " == Brand: " + each.getModel());
        }

        // ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~

        List<Author> list=new ArrayList<>();
        list.add(new Author("Henry","Miller", "Tropic of Cancer"));
        list.add(new Author("Nalo","Hopkinson", "Brown Girl in the Ring"));
        list.add(new Author("Frank","Miller", "300"));
        list.add(new Author("Deborah","Hopkinson", "Sky Boys"));
        list.add(new Author("George R. R.","Martin", "Song of Ice and Fire"));

        /*
         * Sorting the list using Collections.sort() method, we
         * can use this method because we have implemented the
         * Comparable interface in our user defined class Author
         */
        Collections.sort(list);

        for(Author str:list){
            System.out.println(str.firstName+", "+
                    str.lastName+" - "+"Book: "+str.bookName);
        }
    }
}
