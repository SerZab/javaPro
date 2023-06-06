package javaProStanislav.lesson11_19042023.tree.tree2;

public class Student implements Comparable<Student>{
    private int age;
    private String name;

    public Student(int age, String name) {
        this.age = age;
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Student{" +
                "age=" + age +
                ", name='" + name + '\'' +
                '}';
    }

    @Override
    public int compareTo(Student o) {
        int compareResult =  age - o.age;
        if (compareResult == 0) compareResult = name.compareTo(o.name);
        return compareResult;
    }
}
