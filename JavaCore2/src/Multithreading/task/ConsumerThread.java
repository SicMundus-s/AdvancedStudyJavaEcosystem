package Multithreading.task;

import java.util.Queue;

public class ConsumerThread implements Runnable {
    private final Queue<Integer> queue;

    public ConsumerThread(Queue<Integer> queue) {
        this.queue = queue;
    }

    @Override
    public void run() {
        synchronized (queue) {
            while (true) {
                {
                    if (!queue.isEmpty()) {
                        Integer removedValue = queue.remove();
                        System.out.println("consumer removed value: " + removedValue + ". Queue size: " + queue.size());
                    } else {
                        System.out.println("consumer queue is empty");
                    }
                    try {
                        queue.notifyAll();
                        queue.wait(RandomUtil.getRANDOM());
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                }
            }
        }
    }
}
