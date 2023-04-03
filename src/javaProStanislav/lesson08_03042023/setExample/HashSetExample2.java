package javaProStanislav.lesson08_03042023.setExample;

import java.util.HashSet;
import java.util.Set;

public class HashSetExample2 {
    public static void main(String[] args) {
        Person1 person1 = new Person1("Vasya", 25);
        Person1 person2 = new Person1("Vasya", 30);
        Person1 person3 = new Person1("Ruslan", 30);

        System.out.println(person1.hashCode());
        System.out.println(person2.hashCode());
        System.out.println(person3.hashCode());

        HashSet<Person1> myTable = new HashSet<>();
        myTable.add(person1);
        myTable.add(person2);
        myTable.add(person3);
        System.out.println(myTable);

       HashSet<Integer> myInt = new HashSet<>();
    }
}
