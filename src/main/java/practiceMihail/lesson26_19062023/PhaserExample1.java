package practiceMihail.lesson26_19062023;

import java.util.concurrent.Phaser;

public class PhaserExample1 {
    public static void main(String[] args) {

        Phaser phaser = new Phaser(3);

        for (int i = 0; i < 3; i++) {
            Thread thread = new Thread(new Worker(i, phaser));
            thread.start();
        }
    }
}
class Worker implements Runnable {
    private int id;
    private Phaser phaser;

    public Worker(int id, Phaser phaser) {
        this.id = id;
        this.phaser = phaser;
    }

    @Override
    public void run() {
        System.out.println("Поток " + id + " начал выполнение фазы 1");
        phaser.arriveAndAwaitAdvance();

        // Некоторая работа выполняется в фазе 1

        System.out.println("Поток " + id + " завершил выполнение фазы 1 и начал выполнение фазы 2");
        phaser.arriveAndAwaitAdvance();

        // Некоторая работа выполняется в фазе 2

        System.out.println("Поток " + id + " завершил выполнение фазы 2 и завершил работу");
        phaser.arriveAndDeregister();
    }
}