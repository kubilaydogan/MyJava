package Konular_Level2.FactoryMethod;

public class Products {
    public void methodA(){
        System.out.println("Superclass method executed");
    }
}

class Drink extends Products {
    public void methodA(){
        System.out.println("Overridden by Drink Class");
    }
}

class Food extends Products {
    public void foodMethod() {
        System.out.println("This is a food method");
    }
    public void methodA(){
        System.out.println("Overridden by Food Class");
    }
}

class Software extends Products {

}