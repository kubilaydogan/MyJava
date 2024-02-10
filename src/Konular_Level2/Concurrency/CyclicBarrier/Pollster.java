package Konular_Level2.Concurrency.CyclicBarrier;

import java.util.Random;
import java.util.concurrent.BrokenBarrierException;
import java.util.concurrent.CyclicBarrier;

public class Pollster implements Runnable {

    CyclicBarrier area;
    String        name;

    public Pollster(CyclicBarrier area, String name) {
        this.area = area;
        this.name = name;
        new Thread(this).start();
    }

    @Override
    public void run() {
        System.out.println("The survey results of " + name);
        double result = Math.abs(new Random().nextGaussian());
        try {
            area.await();
            System.out.println("Announced " + result + "% by " + name);
        }
        catch (InterruptedException | BrokenBarrierException e) {
            e.printStackTrace();
        }
    }
}
