package practiceMihail.lesson16_10052023;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class GroupingAndPartitioningBy {
    public static void main(String[] args) {
        Student s1 = new Student("Sem",4,'m',7.6);
        Student s2 = new Student("Sergey",6,'m',7.6);
        Student s3 = new Student("Vitalii",3,'m',7.6);
        Student s4 = new Student("Olga",5,'f',7.6);
        Student s5 = new Student("Nikalay",2,'m',4.6);
        Student s6 = new Student("Mikhail",1,'m',2.6);

        List<Student> students = new ArrayList<>();
        students.add(s1);
        students.add(s2);
        students.add(s3);
        students.add(s4);
        students.add(s5);
        students.add(s6);

        //Map<Character,List<Student>> map = students.stream()
//                .map(el->{
//                    el.setName(el.getName().toUpperCase());
//        return el;
//                })
  //              .collect(Collectors.groupingBy(Student::getSex));
//        for (Map.Entry<Character,List<Student>> entry : map.entrySet()){
//            System.out.println(entry.getKey()+" : "+entry.getValue());
//        }

//        Map<Boolean, List<Student>> map1 = students.stream()
//                .collect(Collectors.partitioningBy(el -> el.getAvgGrade() > 6));
//        for (Map.Entry<Boolean, List<Student>> entry : map1.entrySet()){
//            System.out.println(entry.getKey()+" : "+entry.getValue());
//        }

        List<String> names = Arrays.asList("Sem","Sergey","Olga","Vitali","Nikalay");
//        Map<String, Integer> map2 = names.stream()
//                .collect(Collectors.toMap(el -> el, String::length));
//        for(Map.Entry<String,Integer> entry : map2.entrySet()){
//            System.out.println(entry.getKey()+" : "+ entry.getValue());
//        }
//        System.out.println("------");
//        Map<String, Integer> map3 = names.stream()
//                .collect(Collectors.groupingBy(el -> el, Collectors.summingInt(String::length)));
//        for(Map.Entry<String,Integer> entry : map3.entrySet()){
//            System.out.println(entry.getKey()+" : "+ entry.getValue());
//        }

        Map<Boolean, Map<String, Integer>> collect = names.stream()
                .collect(Collectors.partitioningBy(el -> el.length() > 5,
                        Collectors.mapping(String::length,
                                Collectors.toMap(String::valueOf, el2 -> el2,(i1,i2)->i1))));
        for(Map.Entry<Boolean,Map<String,Integer>> entry : collect.entrySet()){
            System.out.println(entry.getKey()+" : "+ entry.getValue());
        }
    }
}
