package homeWork.homeWork_03052023;

import java.util.*;
import java.util.stream.Collectors;

public class Tasks {
    public static void main(String[] args) {

        // Найдите среднюю длину слов в списке строк, используя Java Stream API.
        List<String> list = Arrays.asList("apple", "banana", "pear", "orange", "grapefruit");
        System.out.println(list.stream()
                .mapToInt(String::length)
                .average()
                .orElse(0));

        //    Используя Java Stream API, отсортируйте список объектов по одному из их полей в обратном порядке.
        System.out.println(list.stream()
                .sorted(Comparator.reverseOrder())
                .toList());

        //    Найдите количество уникальных элементов в списке, используя Java Stream API.
        List<Integer> list1 = Arrays.asList(1,2,3,4,5,6,4,1,2,7,8,2,1,9);
        System.out.println(list1.stream()
                .distinct()
                .count());

        //    Переведите список строк в список чисел, содержащих длины этих строк, с использованием Java Stream API.
        List<Integer> list2 = list.stream()
                .map(String::length)
                .toList();
        System.out.println(list2);

        //    Используя Java Stream API, найдите сумму всех чисел в списке, удовлетворяющих определенному условию.
        System.out.println(list1.stream()
                .filter(s -> s % 2 != 0)
                .mapToInt(Integer::intValue)
                .sum());

        //    Отфильтруйте список объектов, исключив из него все объекты, не соответствующие определенному критерию,
        //    с использованием Java Stream API.
        List<Person> people = new ArrayList<>();
        people.add(new Person("Роман","Романов", 20));
        people.add(new Person("Антон","Антонов", 20));
        people.add(new Person("Андрей", "Андреев",25));
        people.add(new Person("Руслан","Русланов", 25));
        people.add(new Person("Василий", "Арсеньев", 30));
        people.add(new Person("Сергей","Сергеев", 30));
        people.add(new Person("Петр","Петров", 40));
        people.add(new Person("Александра","Александрова", 40));

        people.stream()
                .filter(person -> person.age>20 && person.age<35 && person.lastname.startsWith("А"))
                .forEach(System.out::println);

        //    Сгруппируйте список объектов по определенному полю, используя Java Stream API,
        //    и выполните определенную операцию на каждой группе.
        Map<Integer, List<Person>> peopleByAge = people.stream()
                .collect(Collectors.groupingBy(p -> p.getAge()));

        peopleByAge.forEach((age, person) -> {
            System.out.println("Люди в возрасте " + age + ":");
            person.forEach(p -> System.out.println(p.getName() + " " + p.getLastname()));
            System.out.println("===============");
        });

        //    Используя Java Stream API, найдите максимальное и минимальное значение в списке чисел одновременно.
        System.out.println("Минимальное: "+list1.stream()
                .mapToInt(Integer::intValue)
                .min()
                .orElse(0));
        System.out.println("Максимальное: "+list1.stream()
                .mapToInt(Integer::intValue)
                .max()
                .orElse(0));

        //    Отобразите список объектов на новый список, применив к каждому объекту определенное преобразование,
        //    с использованием Java Stream API.
        list.stream()
                .map(s-> s +" "+ s.length())
                .map(String::toUpperCase)
                .forEach(System.out::println);

        //    Используя Java Stream API, выполните операцию "свертки" (reduce) на списке чисел, чтобы найти сумму,
        //    произведение или другую агрегатную функцию.
        System.out.println(list1.stream()
                .reduce(0, (a, b) -> a + b));

        //    Реализуйте алгоритм поиска всех уникальных элементов в двух массивах и их объединение в новый массив
        //    с использованием Java Stream API.
        List<List<Integer>> list3 = new ArrayList<>();
        list3.add(Arrays.asList(10,20,30,40,50,60,70,80));
        list3.add(Arrays.asList(5,15,25,30,40,45,55,70,80,85));
        System.out.println(list3.stream().flatMap(Collection::stream)
                .distinct()
                .sorted()
                .toList());
    }
}
class Person{
    String name;
    String lastname;
    int age;

    public Person(String name, String lastname, int age) {
        this.name = name;
        this.lastname = lastname;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public String getLastname() {
        return lastname;
    }

    public int getAge() {
        return age;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", lastname='" + lastname + '\'' +
                ", age=" + age +
                '}';
    }
}

