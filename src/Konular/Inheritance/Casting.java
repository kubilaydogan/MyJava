package Konular.Inheritance;

public class Casting {
    public static void main(String[] args) {
        Food food = new Food();
        // 1) Casting is not required to assign child to parent reference type
        Product product = food;

        // 2) Casting is required to assign parent to child reference type
        Food food1 = (Food) product;       // Casting is required

        // 3) Casting is not possible between objects of sibling types
        // Drink drink = (Drink) food;
    }
}

class Product {
    public void productMethod() {
    }
}

class Food extends Product {
    public void foodMethod() {
    }
}

class Drink extends Product {
    public void dringMethod() {
    }
}
