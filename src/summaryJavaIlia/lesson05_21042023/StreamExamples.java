package summaryJavaIlia.lesson05_21042023;

import javaProStanislav.lesson05_22032023.arrayList.Person;

import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class StreamExamples {
    public static void main(String[] args) {
        MyFunctionalInterface my = () -> "My String";
        MyFunctionalInterface my1 = () -> "My String1";

        Supplier<Person> my3 = () -> new Person("Name", 20, 1);
        Consumer<String> consumer = s -> {
            int i = 0;
            i++;
            System.out.println(s+i);
        };
        Consumer<String> consumer1 = s -> System.out.println(s);
        Consumer<String> consumer2 = System.out::println;
        consumer1.accept("qwerty");
        consumer2.accept("qwerty1");
        Consumer<String> stringConsumer = StreamExamples::doSomthing;

        StreamExamples se = new StreamExamples();
        Consumer<String> stringConsumer1 = se::doSomthing1;

        Function<Integer,String> function = integer -> "integer to String: "+ integer.toString();
        String s = function.apply(777);
        System.out.println(s);
        Predicate<String> isLongerThen = s1 -> s1.length() > 5;
        boolean tested = isLongerThen.test("Hello!");
        System.out.println(tested);

        System.out.println(my.generateString());
        System.out.println(my1.generateString());

        MyOperation <Integer, Integer> sum = (x, y, z) -> {
            return x+y+z;
        };
        MyOperation <Double, Double> multiply = (x, y, z) -> {
            return x*y*z;
        };
        System.out.println(sum.operation(1,2,3));
        System.out.println(multiply.operation(2.0,2.0,2.0));

    }
    public static void doSomthing(String s){
        System.out.println("Do something " + s);
    }
    public  void doSomthing1(String s){
        System.out.println("Do something " + s);
    }

}
