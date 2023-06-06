package practiceMihail.lesson05_22032023;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class LL {
    public static void main(String[] args) {
        List<Integer> digit = new ArrayList<>();
        for (int i = 0; i < 20; i++) {
            digit.add(new Random().nextInt(20));
        }
        System.out.println(digit);
    }
}
