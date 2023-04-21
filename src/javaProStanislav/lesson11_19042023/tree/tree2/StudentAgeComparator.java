package javaProStanislav.lesson11_19042023.tree.tree2;

import java.util.Comparator;

public class StudentAgeComparator implements Comparator<Student> {
    @Override
    public int compare(Student o1, Student o2) {
        //int compareResult =  o1.getAge() - o2.getAge();
        int compareResult = o1.getName().compareTo(o2.getName());
        return compareResult;
    }
}
