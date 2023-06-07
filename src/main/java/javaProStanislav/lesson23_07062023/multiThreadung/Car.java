package javaProStanislav.lesson23_07062023.multiThreadung;

public class Car extends Thread{

    private final String model;

    public Car(String model) {
        this.model = model;
    }
    @Override
    public void run(){
        try {
            System.out.println("Start! " + getName());
            Thread.sleep(1000);
        }catch (InterruptedException e){
            e.printStackTrace();
        }
        System.out.println("Car "+ model+ "is being driven by Tread "+ getName());
    }

}
