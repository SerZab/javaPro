package javaProStanislav.lesson11_19042023.tree;

import java.util.Set;
import java.util.TreeSet;

public class TreeSetDemo {
    public static void main(String[] args) {
        Student student1 = new Student(17, "John");
        Student student2 = new Student(19, "Thomas");
        Student student3 = new Student(18, "Olga");
        Student student4 = new Student(20, "Sem");
        Student student5 = new Student(20, "Vitalij");

        Set<Student> ourStudents = new TreeSet<>();
        ourStudents.add(student1);
        ourStudents.add(student2);
        ourStudents.add(student3);
        ourStudents.add(student4);
        ourStudents.add(student5);
        System.out.println(ourStudents);
    }
}
