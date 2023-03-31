package javaProStanislav.lesson05_22032023.arrayList;

import java.util.ArrayList;
import java.util.List;

public class PersonDemoWithArrayList {
    public static void main(String[] args) {

        ArrayList<Person> persons = new ArrayList<>();
        getPersonsList(persons);
        introduce(persons);

        System.out.println(persons);

        persons.trimToSize();
    }


    private static void getPersonsList(List<Person> persons){
        persons.add(new Person("Ruslan", 29, 113125124524l));
        persons.add(new Person("Viktor", 35, 536235623));
        persons.add(new Person( "Alex", 21, 2352345));
        persons.add(new Person("John", 42, 2352346));
        persons.add(new Person( "Andrew", 39, 562562));
        persons.add(new Person( "Elena", 18, 25242445));
        persons.add(new Person( "Olga", 18, 262362362365l));

    }


    private static void introduce(List<Person> persons){
        for (int i = 0; i < persons.size(); i++) {
            System.out.println(persons.get(i));
            persons.get(i).say();
        }
    }
}
