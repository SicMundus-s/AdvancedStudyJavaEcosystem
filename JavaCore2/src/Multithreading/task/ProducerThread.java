package Multithreading.task;

import java.util.Queue;

public class ProducerThread implements Runnable {
    private final Queue<Integer> queue;

    public ProducerThread(Queue<Integer> queue) {
        this.queue = queue;
    }

    @Override
    public void run() {
        synchronized (queue) {
            while (true) {
                {
                    int random = RandomUtil.getRANDOM();
                    queue.add(random);
                    queue.notifyAll();
                    System.out.println("producer added value: " + random + ". Queue size: " + queue.size());
                    try {
                        queue.wait(RandomUtil.getRANDOM());
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                }
            }
        }
    }
}
