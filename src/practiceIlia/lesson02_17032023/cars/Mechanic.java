package practiceIlia.lesson02_17032023.cars;

public class Mechanic {
    public void service(Car car){
        car.commonService();
        car.washCar();
        car.specialService();

//        if (car.getClass() == Tesla.class){
//            System.out.println("Special service for Tesla");
//        } else if (car.getClass() == Nissan.class){
//            System.out.println("Special service for Nissan");
//        } else if (car.getClass() == BMW.class) {
//            System.out.println("Special service for BMW");
//        } else if (car.getClass() == BMW2.class) {
//            System.out.println("Special service for BMW2");
//        }


    }

    public static void main(String[] args) {
        Mechanic mechanic = new Mechanic();

        BMW bmw = new BMW2();
        Nissan nissan = new Nissan();
        Tesla tesla = new Tesla();
        mechanic.service(bmw);
        mechanic.service(nissan);
        mechanic.service(tesla);

    }
}
