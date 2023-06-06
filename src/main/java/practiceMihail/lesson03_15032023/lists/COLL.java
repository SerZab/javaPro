package practiceMihail.lesson03_15032023.lists;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class COLL {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        List<Integer> list2 = new ArrayList<>();

        for (int i = 0; i < 10; i++) {
            list.add(new Random().nextInt(22));
        }

        for (Integer integer : list) {
            if (integer % 2 == 0 && integer != 0) {
                list2.add(integer);
            }
        }

        System.out.println(list);
        System.out.println(list2);
    }
}
