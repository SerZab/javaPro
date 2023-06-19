package summaryJavaIlia.lesson13_16062023;

import java.util.concurrent.locks.ReentrantLock;

public class LockExample {
    static ReentrantLock lock = new ReentrantLock(true);
    static int counter;

    public static void main(String[] args) {
        new Thread(()->{
            while (true){
                lock.lock();
                increment();
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e){
                    e.printStackTrace();
                }
                lock.unlock();
            }
        }).start();

        new Thread(()->{
            while (true){
                lock.lock();
                try {
                    System.out.println("qqqq");
                    System.out.println(1/0);
                } finally {
                    lock.unlock();
                }
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e){
                    e.printStackTrace();
                }
            }
        }).start();

    }

    public static void increment(){
        //lock.lock();
        counter++;
        System.out.println(counter);
        //lock.unlock();
    }
}
