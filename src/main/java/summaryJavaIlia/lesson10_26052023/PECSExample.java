package summaryJavaIlia.lesson10_26052023;

import java.util.ArrayList;
import java.util.List;

public class PECSExample {
    public static void main(String[] args) {
        List<Double> doubles = new ArrayList<>();
        doubles.add(10.0);
        doubles.add(20.0);
        doubles.add(30.0);

        List<? super Double> numbers;
        List<Number> numbers1 = new ArrayList<>();
        numbers1.add(10.0);
        numbers1.add(1);

    }
}
