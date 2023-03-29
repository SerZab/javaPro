package practiceMihail.lesson07_29032023;

import lombok.AllArgsConstructor;
import lombok.ToString;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class CollectionsEx {
    public static void main(String[] args) {
        Map<String, Integer> map = new HashMap<>();
        map.put("Nikalay", 2500);
        map.put("Sem", 2500);
        map.put("Olga", 2500);
        map.put("Mikhail", 2500);
        map.put("Sergey", 2500);
        map.put("Roma", 2500);
        System.out.println(map);

        System.out.println("-----------");

        Map<Emp, Integer> map1 = new TreeMap<>();
        map1.put(new Emp("Nikolay", 25), 2500);
        map1.put(new Emp("Sem", 25), 2600);
        map1.put(new Emp("Olga", 25), 2700);
        map1.put(new Emp("Mikhail", 28), 3500);
        map1.put(new Emp("Sergey", 25), 4500);
        map1.put(new Emp("Roma", 30), 2550);
        System.out.println(map1);
    }
}
@ToString
@AllArgsConstructor
class Emp implements Comparable<Emp>{
    String name;
    int age;

    public int compareTo(Emp o){
        return this.age == o.age ? this.name.compareTo(o.name) : this.age - o.age;
    }
}
