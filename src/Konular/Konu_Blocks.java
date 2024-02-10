package Konular;

public class Konu_Blocks {
    static{
        System.out.println("STATIC BLOCKS--> EXECUTED ONLY ONCE");
    }

    {
        System.out.println("INSTANCE BLOCKS");
    }

    public static void main(String[] args) {
        Konu_Blocks obj1 = new Konu_Blocks();
        Konu_Blocks obj2 = new Konu_Blocks();

    }
}
/*
    OUTPUT:
    static block
    instance block
    instance block
 */


