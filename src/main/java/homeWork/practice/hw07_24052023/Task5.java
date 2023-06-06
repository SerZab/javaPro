package homeWork.practice.hw07_24052023;

public class Task5 {
    public static void main(String[] args) {
        Thread thread = new Thread(new PrintName("Thread 1"));
        Thread thread2 = new Thread(new PrintName("Thread 2"));
        Thread thread3 = new Thread(new PrintName("Thread 3"));

        thread.start();
        thread2.start();
        thread3.start();
    }
}
class PrintName implements Runnable{
    private String name;

    public PrintName(String name) {
        this.name = name;
    }
    @Override
    public void run() {
        for (int i = 0; i < 5; i++) {
            System.out.println(name);
        }
    }
}
