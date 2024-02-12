package Konular_Level2.Concurrency;


public class FORLOOP {
    public static void main(String[] args) {
        int n = 0;

        for (; ; ) {
            System.out.println("Hi");

            n++;
            if (n == 3)
                break;
        }


//        for(;;){
//            System.out.println("Hi");       // sonsuz döngü
//        }


    }
}

