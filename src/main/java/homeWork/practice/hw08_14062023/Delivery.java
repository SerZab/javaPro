package homeWork.practice.hw08_14062023;

public class Delivery implements Runnable{
    Production production;

    public Delivery(Production production) {
        this.production = production;
    }

    @Override
    public void run() {
        production.deliver();
    }
}
