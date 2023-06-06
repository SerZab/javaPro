package javaProStanislav.lesson10_17042023.optional;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class PersonRepositoryDemo {
    public static void main(String[] args) {
        Map<Integer,Person> repository = new HashMap<>();
        Person person1 = new Person("John");
        Person person2 = new Person(null);

        repository.put(1, person1);
        repository.put(2, person2);

        Person myPerson = repository.get(3);
        System.out.println(myPerson);
        if (myPerson!=null){
        System.out.println(myPerson.name.length());}

        Set<Integer> allKeys = repository.keySet();
        for (int i : allKeys){

            System.out.println(repository.get(i));
            int personNameLength = repository.get(i).name.length();
            System.out.println("Name length " + personNameLength);
        }
    }
}
