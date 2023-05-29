package homeWork.practice.hw07_24052023;

public class Task2 extends Thread{
    private int start;
    private int end;
    public Task2 (int start, int end) {
        this.start = start;
        this.end = end;
    }
    @Override
    public void run() {
        for (int i = start; i <= end; i++) {
            int square = i * i;
            System.out.println("Квадрат числа " + i + ": " + square);
        }
    }
    public static void main(String[] args) {
        Task2 thread1 = new Task2(1, 3);
        Task2 thread2 = new Task2(4, 6);
        Task2 thread3 = new Task2(7, 10);

        thread1.start();
        thread2.start();
        thread3.start();
    }
}
