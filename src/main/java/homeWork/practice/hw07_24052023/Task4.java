package homeWork.practice.hw07_24052023;
public class Task4 {

    public static void main(String[] args) {
        Thread thread1 = new Thread(new HW());
        Thread thread2 = new Thread(new HW());
        Thread thread3 = new Thread(new HW());
        Thread thread4 = new Thread(new HW());

        thread1.start();
        thread2.start();
        thread3.start();
        thread4.start();
    }
}

class HW implements Runnable {
    @Override
    public void run() {
        try {
            Thread.sleep(1000); // Задержка 1 секунда
            System.out.println("Hello, World!");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
