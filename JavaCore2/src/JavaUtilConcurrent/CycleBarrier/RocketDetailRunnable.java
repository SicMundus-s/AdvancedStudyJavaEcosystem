package JavaUtilConcurrent.CycleBarrier;

import java.util.concurrent.BrokenBarrierException;
import java.util.concurrent.CyclicBarrier;

public class RocketDetailRunnable implements Runnable {

    private final RocketDetail rocketDetail;
    private final CyclicBarrier cyclicBarrier;

    public RocketDetailRunnable(RocketDetail rocketDetail, CyclicBarrier cyclicBarrier) {
        this.rocketDetail = rocketDetail;
        this.cyclicBarrier = cyclicBarrier;
    }


    @Override
    public void run() {
        System.out.println("Готовится деталь: " + rocketDetail);
        try {
            Thread.sleep(1000L);
            System.out.println("Деталь готова: " + rocketDetail);
            cyclicBarrier.await(); // Будем ждать пока N потоков не вызовет метод await()
        } catch (InterruptedException | BrokenBarrierException exception) {
            exception.printStackTrace();
        }
    }
}