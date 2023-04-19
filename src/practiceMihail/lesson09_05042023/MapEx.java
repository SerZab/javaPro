package practiceMihail.lesson09_05042023;

import java.util.*;
import java.util.stream.Collectors;

public class MapEx {
    public static void main(String[] args) {
        List<Student> list = new ArrayList<>();
        Collections.max(list, (o1, o2) -> (int) (o1.getAvgGrade() - o2.getAvgGrade()));

        Student s1 = new Student("Nik", 2, 6.5);
        Student s2 = new Student("Petr", 3, 6.2);
        Student s3 = new Student("Elena", 4, 7.5);
        Student s4 = new Student("Ivan", 5, 8.5);
        Student s5 = new Student("Anna", 1, 9.6);

        Map<Student, Integer> map = new HashMap<>();
        map.put(s1, 25);
        map.put(s2, 23);
        map.put(s3, 23);
        map.put(s4, 44);
        map.put(s5, 21);

        int[] arr = {1, 2, 3, 6, 5, 4, 7, 8, 9};
//        for (int a : arr) {
//            System.out.println(a);
//        }

//        Arrays.stream(arr).max().getAsInt();

        System.out.println(map);
        Set<Student> studentSet = map.keySet();

        for (Map.Entry<Student, Integer> entry : map.entrySet()){
            System.out.println(entry.getKey() + " || age: " + entry.getValue());
        }
    }
}
