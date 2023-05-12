package homeWork.extra.youtube.stream;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.ArrayList;
import java.util.List;

public class Test3 {
    public static void main(String[] args) {
        Student1 s1 = new Student1("Ivan", 'm', 22,3,8.3);
        Student1 s2 = new Student1("Nikolay",'m', 28,2,6.4);
        Student1 s3 = new Student1("Elena",'f', 19,1, 8.9);
        Student1 s4 = new Student1("Petr",'m', 35,4, 7);
        Student1 s5 = new Student1("Maria",'f', 23,3,7.4);

        Faculty f1 = new Faculty("Economics");
        Faculty f2 = new Faculty("Applied mathematics");
        f1.addStudentToFaculty(s1);
        f1.addStudentToFaculty(s2);
        f1.addStudentToFaculty(s3);
        f2.addStudentToFaculty(s4);
        f2.addStudentToFaculty(s5);
        List<Faculty> facultyList = new ArrayList<>();
        facultyList.add(f1);
        facultyList.add(f2);

        facultyList.stream().flatMap(el->el.getStudentsOnFaculty().stream())
                .forEach(el-> System.out.println(el.getName()));

    }
}
class Faculty{
    String name;
    List<Student1> studentsOnFaculty;

    public Faculty(String name) {
        this.name = name;
        studentsOnFaculty = new ArrayList<>();
    }
    public List<Student1> getStudentsOnFaculty() {
        return studentsOnFaculty;
    }
    public void addStudentToFaculty(Student1 st){
        studentsOnFaculty.add(st);
    }
}
@AllArgsConstructor
@ToString
@Setter
@Getter
class Student1 {
    private String name;
    private char sex;
    private int age;
    private int course;
    private double avgGrade;
}
