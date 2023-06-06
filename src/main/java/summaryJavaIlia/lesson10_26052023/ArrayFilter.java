package summaryJavaIlia.lesson10_26052023;

import java.util.Arrays;

public class ArrayFilter {

    public static void main(String[] args) {
        Integer[] integersToFilter = new Integer[]{1, 2 ,3 ,4, 5};
        String[] stringsToFilter = new String[] {"Hello", "World", "A", "B", "C"};
        System.out.println(Arrays.toString(filter(integersToFilter, i -> i % 2 == 0)));
        System.out.println(Arrays.toString(filter(stringsToFilter, s -> s.length() == 5)));
    }

    public static <T> T[] filter(T[] objectToFilter, Filter<T> filter) {
        int newSize = 0;
        for (int i = 0; i < objectToFilter.length; i++) {
            if (filter.apply(objectToFilter[i])){
                objectToFilter[newSize++] = objectToFilter[i];
            }
        }
        return Arrays.copyOf(objectToFilter, newSize);
    }
}
interface Filter <T>{
    boolean apply(T o);
}
