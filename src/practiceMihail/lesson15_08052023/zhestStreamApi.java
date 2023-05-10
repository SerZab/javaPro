package practiceMihail.lesson15_08052023;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.ToString;

import java.util.*;
import java.util.stream.Collectors;

public class zhestStreamApi {
    public static void main(String[] args) {

        /** 1
         * Дан список целых чисел.
         * Найдите минимальное и максимальное значения в списке и выведите их на консоль.
         * 5-10
         */
        List<Integer> integers = Arrays.asList(10, 1, 9, 3, 4, -3, 11, 7);
        getNums(integers);

        /** 2
         * Дан список строк. Найдите все строки, которые начинаются с буквы "A",
         * отсортируйте их по алфавиту и выведите на консоль.
         * 6-10
         */
        List<String> str = Arrays.asList("Sergey","Antony", "Anatolij", "Boris", "Andrew", "artur", "Tomas");
        getA(str);

        /** 3
         * Дан список объектов класса Person,
         * содержащих поля name и age.
         * Найдите средний возраст всех людей в списке и выведите его на консоль.
         * 7-10
         */
        Person person1 = new Person("Andrej", 25);
        Person person2 = new Person("Dmitrij", 30);
        Person person3 = new Person("Vasilij", 21);
        List<Person> persons = Arrays.asList(person1,person2,person3);
        getAvgAge(persons);

        /** 4
         * Дан список строк, каждая строка
         * содержит название города и его население в тысячах человек,
         * разделенных запятой. Необходимо найти топ N городов с
         * наибольшим населением. Напишите метод, который принимает
         * список строк и число N и возвращает список топ N городов.
         * String str = "New-York,10000"
         * 8-10
         */
        String city1 = "New-York,10000";
        String city2 = "Barselona,8000";
        String city3 = "Madrid,9000";
        String city4 = "Berlin,4000";
        List<String> cities = Arrays.asList(city1,city2,city3,city4);
        System.out.println(getTOPNCities(cities,3));

        /** 5
         * Дана коллекция объектов класса Book, содержащая поля title,
         * author и year. Напишите метод, который находит автора,
         * написавшего наибольшее количество книг. Если таких авторов несколько,
         * то вернуть список их имен.
         * 9-10
         */
        Book book1 = new Book("Мастер и Маргарита", "Михаил Булгаков", 1940);
        Book book2 = new Book("Собачье сердце", "Михаил Булгаков", 1925);
        Book book3 = new Book("Двенадцать стульев", "Илья Ильф, Евгений Петров", 1928);
        Book book4 = new Book("Золотой теленок", "Илья Ильф, Евгений Петров", 1931);
        Book book5 = new Book("Мёртвые души", "Николай Гоголь", 1942);
        Book book6 = new Book("Преступление и наказание", "Федор Достоевский", 1866);
        Book book7 = new Book("Братья Карамазовы", "Федор Достоевский", 1880);
        Book book8 = new Book("Идиот", "Федор Достоевский", 1869);
        Book book9 = new Book("Ревизор", "Николай Гоголь", 1836);
        Book book10 = new Book("Горе от ума", "Александр Грибоедов", 1828);
        Book book11 = new Book("Дни Турбиных", "Михаил Булгаков", 1926);
        Book book12 = new Book("Записки юного врача", "Михаил Булгаков", 1926);
        List<Book> books = Arrays.asList(book1,book2,book3,book4,book5,book6,book7,book8,book9,book10,book11,book12);

        getMostProAuthors(books);

    }
    public static void getMostProAuthors(List<Book> books) {
        Map<String, Long> collect = books.stream()
                // группируем в map авторов и считаем сколько раз они встречаются в нашей коллекции
                .collect(Collectors.groupingBy(Book::getAuthor, Collectors.counting()))
                // создаем еще один stream
                .entrySet().stream()
                // сортируем по значению (количеству книг)
                .sorted(Map.Entry.<String, Long>comparingByValue().reversed())
                .limit(3)
                .collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue, (e1,e2) ->e1, LinkedHashMap::new));

        // выводим с нумерацией, через Entry
        int count = 1;
        for (Map.Entry<String,Long> entry : collect.entrySet()){
            System.out.println(count+". "+entry.getKey()+", к-во книг: "+ entry.getValue());
            count++;
        }
    }

    public static List<String> getTOPNCities(List<String> cities, int n){
        return cities.stream()
                .collect(Collectors.toMap(o -> o.substring(0,o.indexOf(",")),
                        o -> Integer.parseInt(o.substring(o.indexOf(",")+1))))
                .entrySet().stream()
                .sorted((o1, o2) -> o2.getValue().compareTo(o1.getValue()))
                .limit(n)
                .map(Map.Entry::getKey)
                .toList();

    }
    public static void getAvgAge(List<Person> people) {
        System.out.println(people.stream()
                .mapToInt(Person::getAge)
                .average()
                .orElse(0.0));
    }
    public static void getA(List<String> strings) {
        List<String> newStr = strings.stream()
                .filter(str -> str.startsWith("A") || str.startsWith("a"))
                .collect(Collectors.toList());
        System.out.println(newStr);
    }
    public static void getNums(List<Integer> integers) {
        System.out.println("min = " + integers.stream()
                .min(Comparator.naturalOrder())
                .orElse(null));
        System.out.println("max = " + integers.stream()
                .max(Comparator.naturalOrder())
                .orElse(null));
    }
}
@AllArgsConstructor
@ToString
@Getter
class Person{
    private String name;
    private int age;
}
@AllArgsConstructor
@ToString
@Getter
class Book{
    private String title;
    private String author;
    private int year;
}
