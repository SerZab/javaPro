package javaProStanislav.lesson09_05042023.compareObjects.mixCompare;

import java.util.*;

public class CatCollectionExample {
    public static void main(String[] args) {
        CatComparator comparator = new CatComparator();

        Set<Cat> cats = new TreeSet<>(comparator);

        cats.add(new Cat("Murzik", 2, "color red"));
        cats.add(new Cat("Barsik", 3, "color grey"));
        cats.add(new Cat("Dexter", 4, "color red"));
        cats.add(new Cat("Busik", 3, "color tiger"));

        System.out.println(cats);

        List<Cat> catList = new ArrayList<>();
        catList.add(new Cat("Murzik", 2, "color red"));
        catList.add(new Cat("Barsik", 3, "color grey"));
        catList.add(new Cat("Dexter", 4, "color red"));
        catList.add(new Cat("Busik", 3, "color tiger"));

        System.out.println(catList);

        Collections.sort(catList, comparator);

        System.out.println(catList);
    }
}
