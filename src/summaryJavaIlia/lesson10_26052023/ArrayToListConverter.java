package summaryJavaIlia.lesson10_26052023;

import java.util.Arrays;
import java.util.List;
public class ArrayToListConverter {
    public static <T> List<T> makeList(T[] array) {
        return Arrays.asList(array);
    }
    public static <T> T[] makeArray(List<T> list) {
        return (T[]) list.toArray();
    }

    public static void main(String[] args) {
        Integer[] array = {1, 2, 3, 4, 5};
        List<Integer> list = makeList(array);
        System.out.println(list);

    }
}