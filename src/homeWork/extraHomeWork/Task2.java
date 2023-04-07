package homeWork.extraHomeWork;

import lombok.*;

import java.util.*;

public class Task2 {
    //Что может хранить java.util.List: примитивные типы данных или ссылки на объекты,
    //или то и другое? Напишите программу, в которой кодом продемонстрируйте ответ на вопрос.
    public static void main(String[] args) {

        // Простой лист
        List<Integer> list = new ArrayList<>();
        // Добавление элементов в список
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(Integer.valueOf(4));

        System.out.println("Список List на примитивные : " + list);
        System.out.println("--------------------------");

        // Обьекты
        List<Person> personList = new ArrayList<>();
        // Добавление объектов в список
        personList.add(new Person("Иван", "Иванов", "Java developer",25, 5000));
        personList.add(new Person("Василий", "Василиев", "FrontEnd", 30, 4500));
        personList.add(new Person("Андрей", "Андреев", "QA tester", 40, 4000));
        // Вывод списка на экран
        for (Person p : personList){
            System.out.println(p);
        }
    }
}
@AllArgsConstructor
@Getter
@Setter
@ToString
@EqualsAndHashCode
class Person {
    private String name;
    private String surname;
    private String profession;
    private int age;
    private double salary;
}
