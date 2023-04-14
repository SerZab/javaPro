package homeWork.extraHomeWork.schoolManagementSystem;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Teacher liza = new Teacher("Liza", 500);
        Teacher melissa = new Teacher("Melissa", 700);
        Teacher vanda = new Teacher("Vanda", 600);
        List<Teacher> teacherList = new ArrayList<>();
        teacherList.addAll(Arrays.asList(liza,melissa,vanda));

        Student tamara = new Student("Tamara", 4);
        Student raisa = new Student("Raisa", 12);
        Student roma = new Student("Roma", 6);
        List<Student> studentList = new ArrayList<>();
        studentList.addAll(Arrays.asList(tamara,raisa,roma));

        School school = new School(teacherList,studentList);

        tamara.payFees(5000);
        raisa.payFees(6000);
        System.out.println("School has earned $ " + school.getTotalMoneyEarned());
        liza.receiveSalary(liza.getSalary());
        System.out.println("School has spent for salary $ " + liza.getName() +
                " and now has $ " +school.getTotalMoneyEarned());
        vanda.receiveSalary(vanda.getSalary());
        System.out.println("School has spent for salary $ " + vanda.getName() +
                " and now has $ " +school.getTotalMoneyEarned());
    }
}
