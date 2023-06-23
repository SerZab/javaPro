package javaProStanislav.lesson27_21062023.phaser;

import java.util.concurrent.Phaser;

public class Player implements Runnable{
    private final int id;
    private final Phaser phaser;

    public Player(int id, Phaser phaser) {
        this.id = id;
        this.phaser = phaser;
    }

    @Override
    public void run() {
        System.out.println(" Игрок " + id + " зашел в игру ");
        phaser.arriveAndAwaitAdvance();
        System.out.println(" Игрок " + id + " зарегистрировался");
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {

        }

        System.out.println(" Игрок " + id + " проверяет амуницию");

        // Игроки синхронизируются перед началом игры
        phaser.arriveAndAwaitAdvance();
        System.out.println(" Игрок " + id + " синхронизировался");
        System.out.println(" Игрок " + id + " начинает игру");

    }
}
