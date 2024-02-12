package Konular_Level2.Concurrency.CyclicBarrier;

public class Announcement implements Runnable {

    @Override
    public void run() {
        System.out.println("The results of survey were announced !");
    }
}
