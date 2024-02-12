package Konular.Enum2;


import static Konular.Enum2.Rating.*;

public class Test {
    public static void main(String[] args) {

        Product p1 = new Product("Tea", 1.99);
        Product p2 = new Product("Coffee", 2.35, THREE_STAR);
        Product p3 = new Product("Cake", 5.88, FIVE_STAR);

        System.out.println(p1.getName() + "    - " + p1.getPrice() + " " + p1.getRaiting().getStars());
        System.out.println(p2.getName() + " - "    + p2.getPrice() + " " + p2.getRaiting().getStars());
        System.out.println(p3.getName() + "   - "  + p3.getPrice() + " " + p3.getRaiting().getStars());


    }
}

// output:
// Tea    - 1.99 ☆☆☆☆☆
// Coffee - 2.35 ★★★☆☆
// Cake   - 5.88 ★★★★★