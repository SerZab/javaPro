package javaProStanislav.lesson05_22032023.arrayList;

import java.util.ArrayList;

public class ArrayListDemo2 {
    public static void main(String[] args) {
        ArrayList<Integer> integerArrayList = new ArrayList<>();

        for (int i = 0; i < 10; i++) {
            integerArrayList.add(0,i);
        }

        System.out.println(integerArrayList);


        Integer datafordelete = 4;

        integerArrayList.remove(Integer.valueOf(4));

        System.out.println(integerArrayList);


    }
}
