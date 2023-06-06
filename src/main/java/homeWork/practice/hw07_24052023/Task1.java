package homeWork.practice.hw07_24052023;

public class Task1 implements Runnable{
    private int thread;

    public static void main(String[] args) {
        for (int i = 0; i <= 5; i++) {
            Thread thread = new Thread(new Task1(i));
            thread.start();
        }
    }

    public Task1(int threads) {
        this.thread = threads;
    }
    @Override
    public void run() {
        for (int i = 1; i <= 10; i++) {
            System.out.println("Thread " + thread + ": " + i);
        }
    }
}
