package javaProStanislav.lesson14_03052023.stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamExample3 {
    public static void main(String[] args) {
        List<String> strings = Arrays.asList("10","20","1","10","50","25","20","25");
        System.out.println("Original: " + strings);

        // filter and count

        long result = strings.stream()
                .filter(param -> param.equals("10"))
                .count();
        System.out.println("Result of 'filter and count': " + result);

        // sorted

        List<String> result1 = strings.stream()
                .sorted()
                .toList();
        System.out.println("Result of 'sorted': " + result1);

        // sorted and limit

        List<String> result2 = strings.stream()
                .sorted()
                .filter(x -> Integer.parseInt(x)>10)
                .limit(3)
                .toList();
        System.out.println("Result of 'sorted and limit': " + result2);

        // sorted and skip

        List<String> result3 = strings.stream()
                .sorted()
                .filter(x -> Integer.parseInt(x)>10)
                .skip(4)
                .toList();
        System.out.println("Result of 'sorted and skip': " + result3);

        // distinct

        List<String> result4 = strings.stream()
                .sorted()
                .distinct()
                .toList();
        System.out.println("Result of 'distinct': " + result4);

        // peek

        List<String> result5 = strings.stream()
                .peek((e) -> System.out.println(e + " hello!"))
                .toList();
        System.out.println("Result of 'peek': " + result5);

        // map

        List<Integer> result6 = strings.stream()
                .map(x -> Integer.parseInt(x) *25)
                .toList();
        System.out.println("Result of 'map': " + result6);

    }
}
