package javaProStanislav.lesson26_19062023.concurrent.countDown1;

import java.util.concurrent.CountDownLatch;

public class CountDownLatchExample {
    private static CountDownLatch latch = new CountDownLatch(3);

    public static void main(String[] args) {
        Thread thread1 = new Thread(new Task());
        Thread thread2 = new Thread(new Task());
        Thread thread3 = new Thread(new Task());

        thread1.start();
        thread2.start();
        thread3.start();

        try {
            latch.await(); // Ждать, пока счетчик CountDownLatch не станет равным 0
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("Все потоки завершились. Продолжение работы главного потока.");
    }

    static class Task implements Runnable {
        @Override
        public void run() {
            // Выполнение задачи потока
            System.out.println("Поток " + Thread.currentThread().getName() + " выполняет задачу.");

            // Имитация работы потока
            try {
                Thread.sleep(2000); // Поток ждет 2 секунды
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            System.out.println("Поток " + Thread.currentThread().getName() + " завершил свою работу.");
            latch.countDown(); // Уменьшение счетчика CountDownLatch
        }
    }
}
