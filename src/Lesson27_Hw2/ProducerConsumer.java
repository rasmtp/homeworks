package Lesson27_Hw2;

import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;

public class ProducerConsumer {
    private static final int CAPACITY = 5;

    public static void main(String[] args) {
        BlockingQueue<Integer> sharedQueue = new LinkedBlockingQueue<>(CAPACITY);

        Thread producerThread = new Thread(new Producer(sharedQueue), "Producer");
        Thread consumerThread = new Thread(new Consumer(sharedQueue), "Consumer");

        producerThread.start();
        consumerThread.start();
    }

    static class Producer implements Runnable {
        private final BlockingQueue<Integer> sharedQueue;

        Producer(BlockingQueue<Integer> sharedQueue) {
            this.sharedQueue = sharedQueue;
        }

        @Override
        public void run() {
            for (int i = 1; i < 10; i++) {
                try {
                    System.out.println(Thread.currentThread().getName() + " produced: " + i);
                    sharedQueue.put(i);
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                    Thread.currentThread().interrupt();
                }
            }
        }
    }

    static class Consumer implements Runnable {
        private final BlockingQueue<Integer> sharedQueue;

        Consumer(BlockingQueue<Integer> sharedQueue) {
            this.sharedQueue = sharedQueue;
        }

        @Override
        public void run() {
            while (true) {
                try {
                    int consumedValue = sharedQueue.take();
                    System.out.println(Thread.currentThread().getName() + " consumed: " + consumedValue);
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                    Thread.currentThread().interrupt();
                }
            }
        }
    }
}
