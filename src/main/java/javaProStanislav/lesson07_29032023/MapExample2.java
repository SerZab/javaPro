package javaProStanislav.lesson07_29032023;

import java.util.HashMap;
import java.util.Map;

public class MapExample2 {
    public static void main(String[] args) {
        Map<Integer,Dog> map = new HashMap<>();
        map.put(1, new Dog("Tuzik", 4));
        map.put(2, new Dog("Bobik", 2));
        map.put(3, new Dog("Marcell", 3));
        System.out.println(map);

        Dog dogFromColl = map.get(3);
        System.out.println(dogFromColl);


    }
}
class Class1 {

}
