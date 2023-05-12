package summaryJavaIlia.lesson08_12052023;

import java.util.Optional;

public class OptionalExample {

    static class Car {
        Optional<Insurance> insurance;

        public Optional<Insurance> getInsurance() {
            return insurance;
        }
    }
    static class Insurance{
        String name;

        public String getName() {
            return name;
        }
    }

    public static void main(String[] args) {
        Optional<Car> car = Optional.ofNullable(new Car());
        Optional<Insurance> insurance = car.flatMap(Car::getInsurance);
        Optional<String> optionalS = car.flatMap(Car::getInsurance).map(Insurance::getName);
        String noInsurancePresents = car.flatMap(Car::getInsurance)
                .map(Insurance::getName).orElse("No insurance presents");
    }
}
