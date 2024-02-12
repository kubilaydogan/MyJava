package Konular_Level2.Concurrency;


import java.util.concurrent.BrokenBarrierException;
import java.util.concurrent.CyclicBarrier;

class Dogan implements Runnable{
    CyclicBarrier barrier;
    int no;

    public Dogan(CyclicBarrier barrier, int no) {
        this.barrier = barrier;
        this.no = no;
        new Thread(this).start();
    }

    public Dogan(){
        System.out.println("Instance created");
    }

    @Override
    public void run() {
        System.out.println("Instance: " + no);
        try {
            barrier.await();
            System.out.println("Bekleme bitti " + no);
        }
        catch (InterruptedException | BrokenBarrierException e) {
            e.printStackTrace();
        }
    }
}

public class Demo {
    public static void main(String[] args) {

        CyclicBarrier barrier = new CyclicBarrier(4);

        new Dogan(barrier, 1);
        new Dogan(barrier, 2);
        new Dogan(barrier, 3);
        new Dogan(barrier, 4);


    }
}
