package javaProStanislav.lesson05_22032023.arrayList;

import java.util.ArrayList;

public class ArrayListDemo3 {
    public static void main(String[] args) {
        ArrayList<Double> doubleArrayList = new ArrayList<>();

        for (int i = 0; i < 10; i++) {
            doubleArrayList.add(0,i+0.5);
        }

        System.out.println(doubleArrayList);

        doubleArrayList.remove(4.5);

        System.out.println(doubleArrayList);

    }
}
