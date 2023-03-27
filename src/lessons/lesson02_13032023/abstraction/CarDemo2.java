package lessons.lesson02_13032023.abstraction;

public class CarDemo2 {
    public static void main(String[] args) {
        Sedan sedan1 = new Sedan("Volvo");
        Sedan sedan2 = new Sedan("BMW");
        Sedan sedan3 = new Sedan("Mercedes");
        SportCar sportCar1 = new SportCar("Maserati");
        SportCar sportCar2 = new SportCar("Lamborghini");
        SportCar sportCar3 = new SportCar("BMW");
        Track track1 = new Track("Volvo");
        Track track2 = new Track("MAN");
        Track track3 = new Track("Mercedes");

        Car[] cars = {sedan1,sedan2,sedan3,sportCar1,sportCar2,sportCar3,track1,track2,track3};
        for (int i = 0; i < cars.length; i++) {
            cars[i].speedUp();
            cars[i].printCarName();
            cars[i].beep();
        }
    }
}
