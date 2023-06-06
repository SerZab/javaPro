package javaProStanislav.lesson09_05042023.lessonCode;

import java.util.HashSet;

public class HashSetExample2 {
    public static void main(String[] args) {
        HashSet<String> mySet = new HashSet<>();

        // Добавление элементов
        mySet.add("Banana");
        mySet.add("Apple");
        mySet.add("Orange");
        mySet.add("Apple");

        System.out.println("Our set collection " + mySet);

        if (mySet.contains("apple")) {
            System.out.println("Our HashSet contain 'apple'");
        } else {
            System.out.println("Our HashSet doesn't contain 'apple'");
        }


        int size = mySet.size();
        System.out.println(size);

        String strForRemove = "Orange";

        for (String str : mySet) {
            System.out.println(str);
            // mySet.remove(strForRemove);

        }

        //  mySet.remove(strForRemove);






    }
}
