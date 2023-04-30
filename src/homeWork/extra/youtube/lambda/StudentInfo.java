package homeWork.extra.youtube.lambda;

import java.util.ArrayList;

public class StudentInfo {
    void testStudent(ArrayList<Student> al,StudentCheck sc){
        for(Student st : al){
            if(sc.check(st)){
                System.out.println(st);
            }
        }
    }
}
class Test{
    public static void main(String[] args) {
        Student st1 = new Student("Ivan",'m', 22, 3, 8.3);
        Student st2 = new Student("Nikolay",'m', 28, 2, 6.4);
        Student st3 = new Student("Elena",'f', 19, 1, 8.9);
        Student st4 = new Student("Petr",'m', 35, 4, 7);
        Student st5 = new Student("Maria",'f', 23, 3, 9.1);

        ArrayList<Student> students = new ArrayList<>();
        students.add(st1);
        students.add(st2);
        students.add(st3);
        students.add(st4);
        students.add(st5);

        StudentInfo info = new StudentInfo();
//        info.testStudent(students, (Student p) -> p.getAvgGrade()>9 || p.getSex() == 'f');
//        System.out.println("------");
//        info.testStudent(students,(Student st) -> {return st.getAge()<20 && st.getAvgGrade()>8 && st.getSex()=='f';});
        StudentCheck sc = (Student p) -> p.getAvgGrade() > 8;
        info.testStudent(students,sc);
    }
}
interface StudentCheck{
    boolean check(Student st);
}
class CheckOverGrade implements StudentCheck{

    @Override
    public boolean check(Student st) {
        return st.getAvgGrade()>8;
    }
}
