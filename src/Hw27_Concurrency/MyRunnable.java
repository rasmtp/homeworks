package Hw27_Concurrency;

class MyRunnable implements Runnable {
    @Override
    public void run() {
        while (true) {
            System.out.println("Hello, A-Level");
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
