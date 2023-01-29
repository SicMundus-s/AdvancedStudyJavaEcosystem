package Multithreading;

import java.util.ArrayList;
import java.util.List;

public class ListDemo {

    public static void main(String[] args) throws InterruptedException {
        List<Integer> list = new ArrayList<>();

        var listThread1 = new ListThread(list);
        var listThread2 = new ListThread(list);
        var listThread3 = new ListThread(list);

        listThread1.start();
        listThread2.start();
        listThread3.start();

        listThread1.join();
        listThread2.join();
        listThread3.join();

        System.out.println(list); // Проверка как будет вести себя ArrayList в многопоточной среде. Будет вызвана ошибка ConcurrentModificationException
    }
}
