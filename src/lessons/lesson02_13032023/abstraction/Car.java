package lessons.lesson02_13032023.abstraction;

public abstract class Car {
    protected String model;

    public Car(String model) {
        this.model = model;
    }

    public String getModel() {
        printName();
        return model;
    }
    private void printName(){
        System.out.println("model name " +model);
    }
    public void printCarName(){
        System.out.println("Our car model is " + model);
    }
    abstract void speedUp();
    void beep(){
        System.out.println("Beep!");
    }
}
