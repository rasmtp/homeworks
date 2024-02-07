package Lesson27_Hw2;

import java.util.concurrent.atomic.AtomicInteger;

public class AtomicThreads {
    private static final AtomicInteger counter = new AtomicInteger(5);
    public static void main(String[] args) {
        Thread thread = new IncrementThread();
        Thread thread1 = new IncrementThread();

        thread.start();
        thread1.start();

        try {
            thread.join();
            thread1.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Final Counter Value: " + counter.get());
    }
    static class IncrementThread extends Thread {
        @Override
        public void run() {
            for (int i = 0; i < 10; i++) {
                counter.incrementAndGet();
            }
        }
    }
}


