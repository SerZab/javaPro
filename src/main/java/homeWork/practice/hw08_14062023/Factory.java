package homeWork.practice.hw08_14062023;

public class Factory implements Runnable{
    Production production;

    public Factory(Production production) {
        this.production = production;
    }

    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            production.product();
        }
    }
}
