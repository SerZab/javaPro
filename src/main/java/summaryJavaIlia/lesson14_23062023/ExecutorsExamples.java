package summaryJavaIlia.lesson14_23062023;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class ExecutorsExamples {

    static class Task implements Runnable{

        @Override
        public void run() {
            System.out.println(Thread.currentThread().getName() + " doing task");
            try {
                Thread.sleep(5000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
    public static void main(String[] args) {
//        ExecutorService executor = Executors.newFixedThreadPool(Runtime.getRuntime().availableProcessors());
//        ExecutorService executor = Executors.newFixedThreadPool(Runtime.getRuntime().availableProcessors() / 2);
        ExecutorService executor = Executors.newCachedThreadPool();

        try {
            Thread.sleep(10000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        executor.execute(new Task());
        executor.execute(new Task());
        executor.execute(new Task());
        executor.execute(new Task());

        try {
            Thread.sleep(15000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        executor.execute(new Task());
        executor.execute(new Task());
        executor.execute(new Task());
        executor.execute(new Task());
        executor.execute(new Task());

        executor.shutdown();
//        Future<?> future = executor.submit(new Task());
    }
}
