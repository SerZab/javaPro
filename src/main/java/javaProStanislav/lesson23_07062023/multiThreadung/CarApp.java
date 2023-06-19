package javaProStanislav.lesson23_07062023.multiThreadung;

public class CarApp {
    public static void main(String[] args) throws InterruptedException {
        var ferrari = new Car("Ferrari");
        Car bmw = new Car("BMW");
        ferrari.start();
        bmw.start();
        Thread.sleep(200);
        System.out.println("Method continue exeption... " +
                "PhaserExample method is executing by thread " + Thread.currentThread().getName());
    }
}
