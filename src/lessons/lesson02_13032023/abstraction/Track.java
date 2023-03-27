package lessons.lesson02_13032023.abstraction;

public class Track extends Car{
    public Track(String model){
        super(model);
    }
    @Override
    void speedUp(){
        System.out.println("Truck!!");
    }
}
