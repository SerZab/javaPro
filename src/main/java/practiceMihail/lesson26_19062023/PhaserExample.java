package practiceMihail.lesson26_19062023;

import java.util.concurrent.Phaser;

public class PhaserExample {
    public static void main(String[] args) {
        Phaser phaser = new Phaser(3);
        new Washer(phaser);
        new Washer(phaser);
        new Washer(phaser);
    }
    static class Washer extends Thread{
        Phaser phaser;

        public Washer(Phaser phaser) {
            this.phaser = phaser;
            start();
        }

        @Override
        public void run(){
            for (int i = 0; i < 5; i++) {
                System.out.println(getName() + " is washing ... ");
                phaser.arriveAndAwaitAdvance();
            }
        }
    }
}
