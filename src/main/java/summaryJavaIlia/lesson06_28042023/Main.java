package summaryJavaIlia.lesson06_28042023;

import java.util.Random;
import java.util.function.*;

public class Main {
    public static void main(String[] args) {
//        Consumer<String> consumer = str -> {
//            System.out.println(str);
//            System.err.println(str);
//        };
//        consumer.accept("Hello!!!");

//        Supplier supplier = new Supplier() {
//            @Override
//            public Object get() {
//                return new Random().nextInt(50);
//            }
//        };
//        System.out.println(supplier.get());
//
//        BiFunction<Integer,Integer,Integer> biFunction = new BiFunction<Integer, Integer, Integer>() {
//            @Override
//            public Integer apply(Integer integer, Integer integer2) {
//                return (int) Math.pow(integer, integer2);
//            }
//        };
//        System.out.println(biFunction.apply(2,3));
//        Function<String,String> cutString = new Function<String, String>() {
//            @Override
//            public String apply(String s) {
//                String cutStr = s.substring(0, Math.min(s.length(), 5)).toUpperCase();
//                return cutStr;
//            }
//        };
//        System.out.println(cutString.apply("IloveJava"));

        Supplier<Integer> generateRandomInteger = ()-> new Random().nextInt(50);

        System.out.println(generateRandomInteger.get());

        System.out.println("----------");
        BinaryOperator<Integer> myPow = ((integer, integer2) -> (int) Math.pow(integer, integer2));

        System.out.println(myPow.apply(2,2));
        System.out.println(myPow.apply(3,3));

        Function<String,String> function = ((UnaryOperator<String>) str -> str.substring(0,5)).
                andThen(String::toUpperCase).andThen(s -> s+"______");

        //UnaryOperator<String> processString = str -> str.substring(0, 5).toUpperCase()+"______";
        //Function<String, String> stringStringFunction = processString.andThen(str -> str.toUpperCase()).andThen(str -> str + "_____");
        System.out.println(function.apply("blablabla"));
    }
}
