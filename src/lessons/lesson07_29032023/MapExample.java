package lessons.lesson07_29032023;

import java.util.HashMap;
import java.util.Map;

public class MapExample {
    public static void main(String[] args) {
        Map<Integer,String> map = new HashMap<>();
        map.put(1, "Ruslan");
        map.put(2, "Viktor");
        map.put(3, "Oleg");
        System.out.println(map);

        Map<String, Integer> map1 = new HashMap<>();
        map1.put("Ruslan", 29);
        map1.put("Viktor", 35);
        map1.put("Oleg", 19);
        System.out.println(map1);
    }
}
