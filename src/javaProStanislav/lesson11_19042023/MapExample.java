package javaProStanislav.lesson11_19042023;

import java.security.KeyStore;
import java.util.*;

public class MapExample {
    public static void main(String[] args) {
        Map<Integer,String> myMap = new HashMap<>();
        myMap.put(1,"one");
        myMap.put(2,"two");
        myMap.put(3,"three");
        myMap.put(4,"four");

        Set<Map.Entry<Integer,String>> entries = myMap.entrySet();

        for(Map.Entry<Integer,String> entry : entries){
            System.out.println("Key : " + entry.getKey() + ", values : " + entry.getValue());
        }

        List<Integer> ourKeys = new ArrayList<>(myMap.keySet());

        System.out.println(ourKeys);

        for (int i = 0; i < ourKeys.size(); i++) {
            System.out.println("Key : " + ourKeys.get(i) + ", values : " + myMap.get(ourKeys.get(i)));
        }

        List<String> ourValues = new ArrayList<>(myMap.values());
        System.out.println(ourValues);

        List<Map.Entry<Integer, String>> ourEntries = new ArrayList<>(myMap.entrySet());
        System.out.println("List collection: " + ourEntries);

        //------------------ Iterator ---------------
        System.out.println("------------iterator------------");
        Iterator iterator = myMap.entrySet().iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }

    }
}
