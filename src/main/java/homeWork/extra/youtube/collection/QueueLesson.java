package homeWork.extra.youtube.collection;

import java.util.ArrayDeque;

public class QueueLesson {
    public static void main(String[] args) {
        ArrayDeque<String> countries = new ArrayDeque<>();
        countries.add("Germany");
        countries.add("Russia");
        countries.add("China");
        countries.add("USA");
        countries.add("Ukraine");
        String first = countries.getFirst();
        String last = countries.getLast();
        System.out.println(first);
        System.out.println(last);
        System.out.println(countries.size());

        while (countries.peek()!=null){
            System.out.println(countries.pop());
        }
    }
}
