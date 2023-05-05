package summaryJavaIlia.lesson07_05052023;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class CollectExample {
    public static void main(String[] args) {
        List<String> stringList = Arrays.asList("A", "C", "B", "C", "D", "F");
        TreeSet<String> collect = stringList.stream().collect(Collectors.toCollection(TreeSet::new));
        List<String> collect1 = stringList.stream().collect(Collectors.toList());
        System.out.println(collect);
        System.out.println(collect1.getClass());


        List<String> names = Arrays.asList("Mary", "Tom", "Timothy", "Edd", "Anthony", "Mary", "Ivan");
        Map<String, Integer> namesWithCount = names.stream()
                .collect(Collectors.toMap(s -> s, s -> 1, (i, j) -> i + j));
        Map<String, Integer> namesWithNumberOfSimbols = names.stream()
                .distinct()
                .collect(Collectors.toMap(s -> s, String::length));
        System.out.println(namesWithCount);
        System.out.println(namesWithNumberOfSimbols);

        Map<Integer, Set<String>> collect2 = names.stream()
                .collect(Collectors.groupingBy(String::length, Collectors.mapping(s -> s, Collectors.toSet())));

        LinkedHashMap<Integer, String> collect3 = IntStream.range(1, names.size())
                .boxed()
                .collect(Collectors.toMap(i -> i, names::get, (o, o1) -> o, LinkedHashMap::new));
        System.out.println(collect2);
        System.out.println(collect3);
    }

}
