package lessons.lesson02_13032023.abstraction;

public class Sedan extends Car {
    public Sedan(String name){
        super(name);
    }
    @Override
    void speedUp(){
        System.out.println("Sedan speedUp!");
    }
    @Override
    void beep(){
        System.out.println("Beep!");
    }
}
