package Konular_Level2.Comparator_Interface;

import java.util.Comparator;

public class ProductSorter implements Comparator<Product> {

    @Override
    public int compare(Product p1, Product p2) {
        return p1.getName().compareTo(p2.getName());
    }
}
