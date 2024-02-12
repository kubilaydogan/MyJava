package Konular_Level2.Comparator_Interface;

import java.util.Arrays;

public class Demo {
    public static void main(String[] args) {

        Product[] products = {new Product("Coffee"), new Product("Tea"), new Product("Car")};
        Arrays.sort(products, new ProductSorter());

        for(Product each : products){
            System.out.println(each.getName());
        }

    }
}
/*
     FARKI:
     With Comparator Interface, to sort the objects you don't need to implement comparator in that class itself.
     You can create a separate class which implements the comparator.

     And guess what? You can write multiple different comparators. This particular comparator sorts products
     by using names. And another comparator could sort them by prices, et cetera, et cetera.


 */