package javaProStanislav.lesson09_05042023.compareObjects.treeSet;

import java.util.Set;
import java.util.TreeSet;

public class TreeSetExample {
    public static void main(String[] args) {
        Set<String> myTreeSet = new TreeSet<>();

        myTreeSet.add("AAA");
        myTreeSet.add("CCC");
        myTreeSet.add("GGG");
        myTreeSet.add("HHH");
        myTreeSet.add("AAA");
        myTreeSet.add("EEE");
        myTreeSet.add("AAA");
        myTreeSet.add("FFF");
        myTreeSet.add("AAA");

        System.out.println(myTreeSet);




    }
}
