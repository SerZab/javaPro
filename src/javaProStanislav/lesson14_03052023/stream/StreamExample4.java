package javaProStanislav.lesson14_03052023.stream;

import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class StreamExample4 {
    public static void main(String[] args) {
        List<Integer> number = Arrays.asList(2,3,4,5);

        System.out.println(number);
        List<Integer> sq = number.stream()
                .map(x->x*x)
                .collect(Collectors.toList());
        System.out.println(sq);

        List<String> words = Arrays.asList("Java", "Collections", "String", "Array", "System");

        List<String> result = words.stream()
                .filter(s->s.startsWith("S"))
                .collect(Collectors.toList());
        System.out.println(result);

        List<Integer> number1 = Arrays.asList(2,3,4,5,4,3);

        System.out.println(number1);
        Set<Integer> sq1 = number1.stream()
                .map(x->x*x)
                .collect(Collectors.toSet());
        System.out.println(sq1);
    }
}
