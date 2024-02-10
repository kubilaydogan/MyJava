package Konular_Level2.FactoryMethod;

public class ProductManager {
    public Products createProduct(String productType){

        switch (productType){
            case "Food":
                return new Food();
            case "Drink":
                return new Drink();
            case "Software":
                return new Software();
        }
        return  null;
    }

    public static void main(String[] args) {
        ProductManager dm = new ProductManager();
        Products product = dm.createProduct("Food");
        product.methodA();                // Overridden by Food Class
        product.methodA();
        ((Food) product).foodMethod();    // casting required to invoke Food methods (not extended from superclass)
    }
}
