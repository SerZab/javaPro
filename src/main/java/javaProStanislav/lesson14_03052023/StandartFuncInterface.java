package javaProStanislav.lesson14_03052023;

import java.util.Scanner;
import java.util.function.*;

public class StandartFuncInterface {
    public static void main(String[] args) {

        // ================ PREDICATE =========================
        Predicate<Integer> isPositive = x -> x > 0;
        
        Predicate<Integer> isPositiveFullText = new Predicate<Integer>() {
            @Override
            public boolean test(Integer integer) {
                if(integer>=0){
                    return true;
                } else {
                return false;
                }
            }
        };
        System.out.println("-5 > 0 ? " + isPositive.test(-5));

        // ================ CONSUMER =========================
        
        Consumer<Integer> printer = x -> {
            System.out.println("This is amount in USD");
            System.out.printf("%d usd \n", x);
        };
        printer.accept(600);

        // ================ FUNCTION =========================
        Function<Integer, String> convert = x -> String.valueOf(x) + " dollars";
        System.out.println(convert.apply(750));

        // ================ SUPPLIER =========================

        Supplier<User> userFactory = ()->{
            Scanner  scanner = new Scanner(System.in);
            System.out.println("Enter your name: ");
            String name = scanner.nextLine();
            System.out.println("Enter your lastname: ");
            String lastname = scanner.nextLine();
            System.out.println("Enter your age: ");
            int age = scanner.nextInt();
            return new User(name, lastname, age);
        };
//        User user1 = userFactory.get();
//        User user2 = userFactory.get();
//        System.out.println(user1);
//        System.out.println(user2);

        // ================ UNARY OPERATOR =========================

        UnaryOperator<Integer> square = x -> x*x;
        System.out.println(square.apply(5));

        // ================ BINARY OPERATOR =========================

        BinaryOperator<Integer> multiply = (x,y)-> x*y;
        System.out.println(multiply.apply(5,7));
    }
}
