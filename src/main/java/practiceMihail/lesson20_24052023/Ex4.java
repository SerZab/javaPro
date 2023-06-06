package practiceMihail.lesson20_24052023;

public class Ex4 {
    public static void main(String[] args) {
        MRI runnable = new MRI();
        Thread t1 = new Thread(runnable);
        Thread t2 = new Thread(runnable);
        Thread t3 = new Thread(runnable);

        t1.start();
        t2.start();
        t3.start();
    }
}
class Counter {
    static int count = 0;
}

class MRI implements Runnable {
    public void increment() {
        Counter.count++;
        System.out.println(Counter.count + " ! ");
    }

    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            increment();
        }
    }
}