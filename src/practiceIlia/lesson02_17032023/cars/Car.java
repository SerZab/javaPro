package practiceIlia.lesson02_17032023.cars;

public abstract class Car {
    public void commonService(){
        System.out.println("Common service for Car");
    }
    public void washCar(){
        System.out.println("Washing car");
    }
    abstract void specialService();
}
