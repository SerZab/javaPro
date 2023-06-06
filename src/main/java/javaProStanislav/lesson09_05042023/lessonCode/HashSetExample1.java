package javaProStanislav.lesson09_05042023.lessonCode;

import java.util.HashSet;

public class HashSetExample1 {
    public static void main(String[] args) {
        HashSet<Integer> mySet = new HashSet<>();

        // Добавление элементов
        mySet.add(10);
        mySet.add(20);
        mySet.add(30);
        mySet.add(10);

        System.out.println("Our set collection " + mySet);

        mySet.remove(20);
        System.out.println("Our set collection " + mySet);

        mySet.clear();
        System.out.println("Our set collection " + mySet);





    }
}
