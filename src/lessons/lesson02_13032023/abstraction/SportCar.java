package lessons.lesson02_13032023.abstraction;

public class SportCar extends Car{
    public SportCar(String model){
        super(model);
    }
    @Override
    void speedUp(){
        System.out.println("SportCar speedUp!!!");
    }
}
