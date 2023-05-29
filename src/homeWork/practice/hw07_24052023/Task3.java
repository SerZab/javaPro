package homeWork.practice.hw07_24052023;

public class Task3 {
    public static void main(String[] args) {
        Thread even = new Thread(new Even());
        Thread odd = new Thread(new Odd());

        even.start();
        odd.start();
    }
}
class Even implements Runnable {
    @Override
    public void run() {
        for (int i = 2; i <= 20; i += 2) {
            System.out.println("Четные: " + i);
        }
    }
}

class Odd implements Runnable {
    @Override
    public void run() {
        for (int i = 1; i <= 20; i += 2) {
            System.out.println("Нечетные: " + i);
        }
    }
}
