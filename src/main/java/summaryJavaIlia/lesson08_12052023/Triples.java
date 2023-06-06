package summaryJavaIlia.lesson08_12052023;

import java.util.Arrays;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Triples {
    public static void main(String[] args) {
        Stream<int[]> stream = IntStream.rangeClosed(1, 25)
                .boxed()
                .flatMap(a -> IntStream.rangeClosed(a, 25)
                        .filter(b -> Math.sqrt(a * a + b * b) % 1 == 0)
                        .mapToObj(b -> new int[]{a, b, (int) Math.sqrt(a * a + b * b)}));
        stream.forEach(ints -> System.out.println(Arrays.toString(ints)));
    }
}
