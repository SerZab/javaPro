package homeWork.practice.hw08_14062023;

public class Production {
    private int car = 0;

    public synchronized void product(){
        if (car > 10) {
            try {
                wait();
            } catch (InterruptedException e) {}
        }
        car++;
        System.out.println("Произведено авто: " + car);
        notify();
    }

    public synchronized void deliver(){
        if (car == 10) {
            System.out.println("Доставка в магазин " + car+ " авто");
        }
        notify();
    }
    public synchronized void sell(){
        System.out.println("Продано авто: " + car);
        if (car < 1) {
            try {
                wait();
            } catch (InterruptedException e) {}
        }
        car--;
        notify();
    }
}
