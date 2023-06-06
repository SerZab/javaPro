package javaProStanislav.lesson11_19042023.tree.tree2;

import java.util.*;

public class TreeSetDemo {
    public static void main(String[] args) {

        Student student1 = new Student(18,"John");
        Student student2 = new Student(19,"Thomas");
        Student student3 = new Student(18,"Olga");
        Student student4 = new Student(19,"Sem");
        Student student5 = new Student(20,"Vitalii");

        //------- HashSet collection -----

        Set<Student> ourSetStudents = new HashSet<>();
        ourSetStudents.add(student1);
        ourSetStudents.add(student2);
        ourSetStudents.add(student3);
        ourSetStudents.add(student4);
        ourSetStudents.add(student5);

        System.out.println(ourSetStudents);


        //------- TreSet collection -----

        Set<Student> ourTreeSetStudents = new TreeSet<>();
        ourTreeSetStudents.add(student1);
        ourTreeSetStudents.add(student2);
        ourTreeSetStudents.add(student3);
        ourTreeSetStudents.add(student4);
        ourTreeSetStudents.add(student5);

        System.out.println(ourTreeSetStudents);

        //------- TreMap collection -----

        TreeMap<Integer, Student> ourTreeMapStudents = new TreeMap<>();
        ourTreeMapStudents.put(1,student1);
        ourTreeMapStudents.put(12,student2);
        ourTreeMapStudents.put(3,student3);
        ourTreeMapStudents.put(14,student4);
        ourTreeMapStudents.put(5,student5);

        System.out.println(ourTreeMapStudents);


        Comparator comparator = new StudentAgeComparator();

        TreeMap<Student,Integer> ourTreeMapStudentsByAge = new TreeMap<>(comparator);
        ourTreeMapStudentsByAge.put(student1,1);
        ourTreeMapStudentsByAge.put(student2,12);
        ourTreeMapStudentsByAge.put(student3,3);
        ourTreeMapStudentsByAge.put(student4,14);
        ourTreeMapStudentsByAge.put(student5,5);

        System.out.println(ourTreeMapStudentsByAge);






    }
}
