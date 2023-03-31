package javaProStanislav.lesson02_13032023.abstraction;

public class CarDemo {
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

        Sedan[] sedans =  {sedan1, sedan2, sedan3};
        SportCar[] sportCars = {sportCar1, sportCar2, sportCar3};
        Track[] tracks = {track1, track2, track3};

        for (int i = 0; i < sedans.length; i++) {
            System.out.println(sedans[i].model);
            sedans[i].speedUp();
        }
        System.out.println("==================");
        for (int i = 0; i < sportCars.length; i++) {
            sportCars[i].speedUp();
        }
        System.out.println("==================");
        for (int i = 0; i < tracks.length; i++) {
            tracks[i].speedUp();
        }
    }
}
