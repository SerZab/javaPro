package homeWork.practice.hw08_14062023;

public class Shop implements Runnable{
    Production production;

    public Shop(Production production) {
        this.production = production;
    }

    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            production.sell();
        }
    }
}
