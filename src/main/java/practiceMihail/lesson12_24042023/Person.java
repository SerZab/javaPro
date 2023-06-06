package practiceMihail.lesson12_24042023;

import java.util.ArrayList;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Queue;

public class Person {
    private String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    public static void main(String[] args) {
        Queue<String> queue2 = new PriorityQueue<>(List.of("B","A","C","B","A","C"));
        System.out.println(queue2);

        List<Person> persons = new ArrayList<>();
        Person person1 = new Person("John", 36);
        Person person2 = new Person("Mike", 44);
        Person person3 = new Person("Jack", 18);
        Person person4 = new Person("Andrew", 45);
        Person person5 = new Person("Lila", 37);
        persons.add(person1);
        persons.add(person2);
        persons.add(person3);
        persons.add(person4);
        persons.add(person5);

        for(Person person : persons){
            System.out.println(person);
        }

        persons.stream()
                .map(el ->{
                    if(el.getAge() > 35){
                        el.setName(el.getName().toUpperCase());
                    }
                    return el;
                })
                .forEach(System.out::println);

    }
}
