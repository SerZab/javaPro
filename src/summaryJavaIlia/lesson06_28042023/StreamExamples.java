package summaryJavaIlia.lesson06_28042023;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamExamples {
    public static void main(String[] args) {
//        List<String> stringList = Arrays.asList("Mary","Jane","Tom","Edvard","Jimmy");
//        Stream<String> stringStream = stringList.stream();
//        System.out.println("Stream started");
//
//        Stream<String> stringStream1 = stringStream.sorted().peek(System.out::println);
//        System.out.println("Stream operations described");
//
//        List<String> processedList = stringStream1.toList();
//        System.out.println(processedList);

        // 1.
        List<String> names = Arrays.asList("Jane", "Roman", "Andrew", "Sergej", "Dmitrij");
        List<String> sortedNames = names.stream().sorted(Comparator.reverseOrder()).collect(Collectors.toList());
        System.out.println(sortedNames);

        // 2.
        List<Integer> numbers = Arrays.asList(9,1,3,2,5,4,6,8,7,-5,100);
        List<String> sNumbers = numbers.stream().map(Objects::toString).sorted().toList();
        System.out.println(sNumbers);

    }
}
