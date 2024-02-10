package Konular;

public class Konu_Vararg {
    public static void main(String[] args) {

        getCount(5, 10);
        getCount(11, 22, 33);
        getCount(10, 20, 30, 40);

        products("Araba");
        products("Kagit", "Kalem");
        products("Araba", "Telefon", "Ucak", "Mendil");
    }

    public static void getCount(Integer...numbers){
        int count =0;
        for(Integer each:numbers){
            count+=each;
        }
        System.out.println(count);
    }


    public static void products(String...names){
        for(String each:names){
            System.out.println(each);
        }

        switch (names.length){
            case 3:
                //....
                break;
            case 2:
                //....
                break;
        }
    }

    // This vararg feature helps to avoid too many overload versions of the same method
    // The vararg parameter is treated as an array  (arr.length)
    // vararg => variable number of arguments

}
