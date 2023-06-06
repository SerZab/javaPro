package javaProStanislav.lesson14_03052023;

import java.util.Random;
import java.util.function.Supplier;

public class Example2 {
    public static void main(String[] args) {

        int range =100;

        Supplier<Integer> supplierDouble = () -> {
            Random random = new Random();
            return random.nextInt(range);
        };

        for (int i = 0; i < 5; i++) {
            System.out.println(supplierDouble.get());

        }

    }
}
