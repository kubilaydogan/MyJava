package Konular.super_this;
// this keyword is used to reference variables and methods of the current object
// super keyword is used to reference variables and methods of the parent object
// using this and super is not required when the reference is not ambiguous

// Best practive --> public superclass variable/methods
//               --> private subclass variable/methods
class Products{
    int discount = 2;
    private String company;     // not inherited
    public int price = 2;

}

public class Toy extends Products {
    private int price = 3;
    Toy(){
        if(this.price > super.price){
            System.out.println("I am more expensive");
        }
    }


    public static void main(String[] args) {

        Toy toy = new Toy();
        System.out.println(toy.discount);      // 3
//        System.out.println(toy.price);       // price is private

    }
}
