package javaProStanislav.lesson11_19042023.tree;

public class Student implements Comparable<Student> {
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
    public int compareTo(Student other) {
        int result = Integer.compare(other.age, this.age);
        if (result == 0) {
            result = this.name.compareTo(other.name);
        }
        return result;
    }

    @Override
    public String toString() {
        return "Student{name='" + name + "', age=" + age + "}";
    }
}
