package practiceMihail.lesson12_24042023;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.stream.Stream;

public class Test {
    private static final Random RANDOM = new Random();
    static List<Integer> list = new ArrayList<>();


    public static void main(String[] args) {
        int[] arr = {1,3,4,54,1,10,32,21,3};
        Stream<Integer> s = Stream.of(1,3,4,54,1,10,32,21,3,54,45);
        long l = s
                .distinct()
                .count();
        System.out.println(l);

        Arrays.stream(arr)
                .map(el ->{
                    if(el%2==0){
                        System.out.println(el);
                    }
                    return el;
                }).distinct().count();

        for (int i = 0; i < 1_000_000; i++) {
            list.add(RANDOM.nextInt(22));

        }
        long time = System.currentTimeMillis();
        double sum = list.stream().reduce(Integer::sum).get();
        System.out.println("SUM: " + sum);
        System.out.println("TIME: " + (System.currentTimeMillis() - time));
    }
}
