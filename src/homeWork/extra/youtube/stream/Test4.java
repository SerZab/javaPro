package homeWork.extra.youtube.stream;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Test4 {
    public static void main(String[] args) {
        Student1 s1 = new Student1("Ivan", 'm', 22,3,8.3);
        Student1 s2 = new Student1("Nikolay",'m', 28,2,6.4);
        Student1 s3 = new Student1("Elena",'f', 19,1, 8.9);
        Student1 s4 = new Student1("Petr",'m', 35,4, 7);
        Student1 s5 = new Student1("Maria",'f', 23,3,7.4);
        List<Student1> students = new ArrayList<>();
        students.add(s1);
        students.add(s2);
        students.add(s3);
        students.add(s4);
        students.add(s5);

        Map<Integer, List<Student1>> collect = students.stream().map(el -> {
                    el.setName(el.getName().toUpperCase());
                    return el;
                })
                .collect(Collectors.groupingBy(el -> el.getCourse()));

        Map<Boolean, List<Student1>> collect1 = students.stream()
                .collect(Collectors.partitioningBy(student1 -> student1.getAvgGrade() > 7));
        for (Map.Entry<Boolean, List<Student1>> entry : collect1.entrySet()){
            if(!entry.getKey()){
                System.out.println(entry.getKey()+" : "+ entry.getValue());
            };
        }
    }
}
