package javaProStanislav.lesson06_27032023;

import java.util.ArrayList;
import java.util.List;

public class RemoveFromCollections {
    public static void main(String[] args) {
        List<Integer> integerList= new ArrayList<>();
        integerList.add((Integer) 1);
        integerList.add((Integer) 2);
        integerList.add((Integer) 3);
        integerList.add((Integer) 1);
        integerList.add((Integer) 2);
        integerList.add((Integer) 3);
        integerList.add((Integer) 1);
        integerList.add((Integer) 1);
        integerList.add((Integer) 2);
        integerList.add((Integer) 5);

        System.out.println(integerList);

        // integerList.remove((Integer) 1);


        List<Integer> listForRemove = new ArrayList<>();
        listForRemove.add((Integer) 1);
        listForRemove.add((Integer) 5);
        listForRemove.add((Integer) 1);

        for (int i = 0; i < listForRemove.size(); i++) {
            integerList.remove(listForRemove.get(i));
            System.out.println(integerList);
        }
        //System.out.println(integerList);

    }
}
