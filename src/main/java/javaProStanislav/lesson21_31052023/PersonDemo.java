package javaProStanislav.lesson21_31052023;

import java.lang.reflect.Field;
import java.util.*;

public class PersonDemo {
    public static void main(String[] args) {
        List<Person> personList = new ArrayList<>();
        personList.add(new Person("Ruslan",30));
        personList.add(new Person("Victor", 28));
        personList.add(new Person("John", 45));
        personList.add(new Person("Andrej", 16));

        sort(personList,"age");
        for (Person person : personList){
            System.out.println(person);
        }

    }
    public static <T> void sort(List<T> list, String paramName){
        Collections.sort(list, new Comparator<T>() {
            @Override
            public int compare(T o1, T o2) {
                try {
                    Field field = o1.getClass().getDeclaredField(paramName);
                    field.setAccessible(true);
                    Comparable type1 = (Comparable) field.get(o1);
                    Comparable type2 = (Comparable) field.get(o2);

                    return type1.compareTo(type2);

                } catch (NoSuchFieldException e) {
                    System.out.println("Incorrect field");
                } catch (IllegalAccessException e) {
                    System.out.println("Incorrect field for Compare");
                }
                return 0;
            }
        });
    }
}
