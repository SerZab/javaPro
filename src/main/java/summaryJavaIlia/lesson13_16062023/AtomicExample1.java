package summaryJavaIlia.lesson13_16062023;

import java.util.concurrent.atomic.AtomicInteger;

public class AtomicExample1 {
    private static AtomicInteger counter = new AtomicInteger(0);

    public static void main(String[] args) {
        // Create multiple threads and increment the counter concurrently
        Thread t1 = new Thread(new Counter());
        Thread t2 = new Thread(new Counter());
        Thread t3 = new Thread(new Counter());

        t1.start();
        t2.start();
        t3.start();

        // Wait for all threads to finish
        try {
            t1.join();
            t2.join();
            t3.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        // Print the final value of the counter
        System.out.println("Final counter value: " + counter.get());
    }

    static class Counter implements Runnable {
        @Override
        public void run() {
            for (int i = 0; i < 1000; i++) {
                counter.incrementAndGet(); // Increment the counter atomically
                System.out.println(Thread.currentThread().getName() + " : " + i);
            }
        }
    }
}
