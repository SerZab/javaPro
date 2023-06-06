package javaProStanislav.lesson15_08052023.streamPractice;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class Example4 {
    public static void main(String[] args) {
        two();
        int[][] arr = {{1,2,3},{17,13,15},{7,9,23}};

        int[] newArray = Arrays.stream(arr)
                .flatMapToInt(Arrays::stream)
                .toArray();

        System.out.println(Arrays.toString(newArray));
        List<Integer> list = Arrays.stream(arr)
                .flatMapToInt(Arrays::stream)
                .boxed()
                .toList();
        System.out.println(list);
    }
    public static void two(){
        String[][] stringArray = new String[][]{{"a","b"},{"c","d"},{"a","f"}};
        System.out.println(Arrays.stream(stringArray)
                .flatMap(subArray -> Arrays.stream(subArray))
                .filter(x -> !x.equals("a") && !x.equals("b"))
                .toList());
        List<String> stringsCollection = Stream.of(stringArray)
                .flatMap(Stream::of)
                .filter(x->!x.equals("a"))
                .toList();
        stringsCollection.forEach(System.out::println);
    }
}
