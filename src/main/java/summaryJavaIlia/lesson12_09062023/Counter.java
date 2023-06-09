package summaryJavaIlia.lesson12_09062023;

public class Counter {
    static int count = 0;
    static Object mutex = new Object();

    public static void main(String[] args) {
        
        new Thread(new Task1()).start();
        new Thread(new Task2()).start();
        System.out.println(count);
    }
    static class Task1 implements Runnable{
        @Override
        public void run() {
            while (true){
                synchronized (mutex){
                    int temp = count;
                    temp++;
                    count = temp;
                    System.out.println(count);
                }
                //System.out.println(count++);
                try {
                    Thread.sleep(1000);
                }catch (InterruptedException e){
                    e.printStackTrace();
                }
            }
        }
    }
    static class Task2 implements Runnable{
        @Override
        public void run() {
            while (true){
                synchronized (mutex){
                    System.out.println(count++);
                }
                try {
                    Thread.sleep(1000);
                }catch (InterruptedException e){
                    e.printStackTrace();
                }
            }
        }
    }
}
