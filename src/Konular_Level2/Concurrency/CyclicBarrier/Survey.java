package Konular_Level2.Concurrency.CyclicBarrier;
import java.util.concurrent.BrokenBarrierException;
import java.util.concurrent.CyclicBarrier;

//This class shows that how CyclicBarrier is implemented

public class Survey {

    public static void main(String[] args) throws InterruptedException, BrokenBarrierException {
        CyclicBarrier area = new CyclicBarrier(4, new Announcement());

        new Pollster(area, "South");
        new Pollster(area, "West");
        new Pollster(area, "East");
        new Pollster(area, "North");
    }
}


/*
    Bölgelere göre 4 adet anketör oluşturulmuş olup, her bir bölgeye aynı bariyer nesnesi atanmıştır.
    Bölge anketörleri sonuçları hesapladıktan sonra await() ile diğer anketörleri bariyer noktasında bekler.
    Tüm anketörler işini bitirdikten sonra, Announcement thread' i bir kez çalışır ve akabinde tüm bölge
    anketörleri buluşma noktasında sonuçları ilan eder.

    CyclicBarrier nesneleri bir grup thread' in çalışmasını belirli bir bariyer noktasında bekleterek
    program senkronizasyonunu sağlar.

 */