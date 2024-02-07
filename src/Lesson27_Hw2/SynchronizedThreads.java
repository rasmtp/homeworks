package Lesson27_Hw2;
public class SynchronizedThreads {
    private static int counter = 5;

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
        System.out.println("Final Counter Value: " + counter);
    }
    static class IncrementThread extends Thread {
        @Override
        public void run() {
            for (int i = 0; i < 10; i++) {
                incrementCounter();
            }
        }
        private synchronized void incrementCounter() {
            counter++;
        }
    }
}
