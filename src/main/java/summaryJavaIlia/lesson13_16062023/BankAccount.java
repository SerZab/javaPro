package summaryJavaIlia.lesson13_16062023;

import java.util.concurrent.locks.ReentrantLock;

public class BankAccount {
    private int account1 = 1000;
    private int account2 = 0;


    public synchronized void moveMoney(int amount){
        account1 = account1 - amount;
        account2 = account2 + amount;
    }

    public synchronized int getAccount1() {
        return account1;
    }

    public int getAccount2() {
        return account2;
    }

    public static void main(String[] args) {
        BankAccount bankAccount = new BankAccount();
        new Thread(()->{
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            synchronized (bankAccount){
                bankAccount.moveMoney(bankAccount.getAccount1());
            }
            //bankAccount.moveMoney(500);
        }).start();

        new Thread(()->{
            synchronized (bankAccount) {
                System.out.println(bankAccount.getAccount1());
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println(bankAccount.getAccount2());
            }
        }).start();

    }
}
