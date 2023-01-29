package Multithreading;

public class VolatileDemo {
    private static volatile boolean isFinished = false; // Volatile - Отключение оптимизации. Переменная не будет кэшироваться в потоке, а будет браться из основной памяти

    public static void main(String[] args) throws InterruptedException {
        Thread thread1 = new Thread(() -> {
            while (!isFinished) {
                System.out.println("isFinished = false");
            }
        });
        thread1.start();

        Thread.sleep(50L);

        Thread thread2 = new Thread(() -> {
            isFinished = true;
            System.out.println("isFinished = true");
        });
        thread2.start();

    }
}
