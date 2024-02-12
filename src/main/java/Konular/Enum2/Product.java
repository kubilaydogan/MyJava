package Konular.Enum2;

import lombok.Getter;

import static Konular.Enum2.Rating.NOT_RATED;

@Getter
public class Product {

    private String name;
    private double price;
    private Rating raiting;

    public Product(String name, double price, Rating raiting) {
        this.name = name;
        this.price = price;
        this.raiting = raiting;
    }

    public Product(String name, double price) {
        this(name, price, NOT_RATED);
    }

}

