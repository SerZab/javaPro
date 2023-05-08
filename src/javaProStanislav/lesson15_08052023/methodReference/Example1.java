package javaProStanislav.lesson15_08052023.methodReference;

import java.util.Arrays;
import java.util.List;

public class Example1 {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1,2,3,4,5);
        numbers.forEach(System.out::println);
    }
}
