package summaryJavaIlia.lesson12_09062023;

import java.util.Vector;

public class SynchExample {
    public static void main(String[] args) {

        Task task = new Task();
        new Thread(task).start();
        new Thread(task).start();
        new Thread(task).start();

        synchronized (task){
            System.out.println("In sync section");
            try {
                Thread.sleep(8000);
            } catch (InterruptedException e){
                e.printStackTrace();
            }
        }

        Vector<String> vector1 = new Vector<>();
        vector1.add("One");
        new Thread(()->{
            vector1.get(0);
        });
    }
    static class Task implements Runnable{

        @Override
        public synchronized void run() {
            System.out.println(Thread.currentThread().getName()+ " doing task");
            try {
                Thread.sleep(5000);
            } catch (InterruptedException e){
                e.printStackTrace();
            }
        }
    }
}
