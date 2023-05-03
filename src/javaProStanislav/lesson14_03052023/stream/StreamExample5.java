package javaProStanislav.lesson14_03052023.stream;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class StreamExample5 {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("BigBen","BigBob","Big","Ben", "Big Ben");

        System.out.println(list.stream().filter(s -> s.equals("Big")).count());

        List<String> list2 = Arrays.asList("a1","b5","a2","b4");
        System.out.println(list2.stream().min(String::compareTo).get());

        List<String> list3 = Arrays.asList("a1","b5","a2","b4","a1","b5");
        List<String> result = list3.stream()
                .sorted()
                .distinct()
                .toList();
        System.out.println(result);

        List<String> list4 = Arrays.asList("a1","b5","a2","b4","a1","b5");
        List<String> result4 = list4.stream()
                .sorted(Comparator.reverseOrder())
                .distinct()
                .toList();
        System.out.println(result4);

    }
}
