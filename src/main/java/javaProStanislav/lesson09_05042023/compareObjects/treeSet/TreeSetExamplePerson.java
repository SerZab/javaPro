package javaProStanislav.lesson09_05042023.compareObjects.treeSet;

import java.util.Set;
import java.util.TreeSet;

public class TreeSetExamplePerson {
    public static void main(String[] args) {
        Set<Person> myTreeSet = new TreeSet<>();

        myTreeSet.add(new Person("Ruslan", 32));
        myTreeSet.add(new Person("Viktor", 29));
        myTreeSet.add(new Person("Olga", 18));
        myTreeSet.add(new Person("Sem", 29));


        System.out.println(myTreeSet);
    }
}
