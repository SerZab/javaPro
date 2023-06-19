package javaProStanislav.lesson26_19062023.concurrent.countDown1;

import java.util.Random;
import java.util.concurrent.CountDownLatch;

public class CountDownExample {
    public static void main(String[] args) {
        int numbersOfThread = 15;
        int numberOfCountDown = 5;

        CountDownLatch cdl = new CountDownLatch(numberOfCountDown);

        for (int i = 0; i < numbersOfThread; i++) {
            Thread worker = new Thread(new Worker(i, cdl));
            worker.start();
        }
        try {
            cdl.await();
            System.out.println(numberOfCountDown + " потока выполнили свою работу");
        } catch (InterruptedException e){
            e.printStackTrace();
        }
    }

    static class Worker implements Runnable {
        private final int idWorker;
        private final CountDownLatch cdl;

        public Worker(int idWorker, CountDownLatch cdl) {
            this.idWorker = idWorker;
            this.cdl = cdl;
        }

        @Override
        public void run() {
            System.out.println("Поток " + idWorker + " начинает работать");
            try {
                Random random = new Random();
                Thread.sleep(random.nextInt(2000, 3000));
            } catch (InterruptedException e) {
            }
            System.out.println("Поток " + idWorker + " завершает работать");
            cdl.countDown();

        }
    }
}
